import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Stack;

import org.antlr.v4.runtime.tree.ParseTree;


public class InterpretingVisitor extends MuteBaseVisitor<Object> {
	
	public final Map<String, Statement> namedStatements = new HashMap<String, Statement>();
	Statement currentStatement = null;
	
	final Random random = new Random();

	@SuppressWarnings("unchecked")
	@Override
	public Object visitStatement(MuteParser.StatementContext ctx) {
		Statement statement;
		
		// TODO : module support
		
		if (ctx.ID() != null) {
			String name = ctx.ID().getText();
			
			if (!namedStatements.containsKey(name)) {
				statement = new Statement(name);
				namedStatements.put(name, statement);
			} else {
				// fetch statement from memory and work with it instead
				statement = namedStatements.get(name);
			}
		}
		else
			statement = new Statement();
		
		currentStatement = statement;
		
		// conditions and statement accumulate, but clear if any one is defined
		for (int i=0; i<ctx.getChildCount(); i++) {
			if (ctx.getChild(i) instanceof MuteParser.ConditionStatementPartContext)
				statement.conditions.clear();
			if (ctx.getChild(i) instanceof MuteParser.OperationStatementPartContext)
				statement.operations.clear();
		}
		
		for (int i=0; i<ctx.getChildCount(); i++) {
			ParseTree child = ctx.getChild(i);
			
			if (child instanceof MuteParser.AssignmentStatementPartContext) {
				Collection<Value> values = (Collection<Value>) visitAssignmentStatementPart((MuteParser.AssignmentStatementPartContext) child);
				assignValues(statement, values);
			}
			if (child instanceof MuteParser.ConditionStatementPartContext) {
				Object condition = visitConditionStatementPart((MuteParser.ConditionStatementPartContext) child);
				statement.conditions.add((Predicate) condition);
			}
			if (child instanceof MuteParser.OperationStatementPartContext) {
				Object operation = visitOperationStatementPart((MuteParser.OperationStatementPartContext) child);
				statement.operations.add((Func<String>) operation);
			}
		}
		
		boolean allConditionsPass = true;
		for (Predicate p : statement.conditions)
			allConditionsPass &= p.evaluate();
		
		if (allConditionsPass)
			for (Func<String> operation : statement.operations)
			{
				String result = operation.evaluate();
				if (result != null)
					System.out.println(result);
			}
		
		return statement;
	}
	
	private static void assignValues(Statement statement, Collection<Value> values) {
		boolean anyNamed = false;
		for (Value v : values)
			if (v.name != null) {
				anyNamed = true;
				break;
			}
		if (!anyNamed)
			statement.values.clear();
			
		for (Value newValue : values)
		{
			if (newValue.name != null && statement.namedValueExists(newValue.name))
			{
				Value oldValue = statement.findValueByName(newValue.name);
				oldValue.value = newValue.value;
			}
			else
				statement.values.add(newValue);
		}
	}

	@Override
	public Object visitAssignmentStatementPart(MuteParser.AssignmentStatementPartContext ctx) {
		return visitAssignmentList(ctx.assignmentList());
	}
	@Override
	public Object visitAssignmentList(MuteParser.AssignmentListContext ctx) {
		List<Value> assignmentList = new ArrayList<Value>();
		
		for (int i=0; i<ctx.getChildCount(); i++) {
			ParseTree child = ctx.getChild(i);
			if (child instanceof MuteParser.AssignmentContext) {
				Object assignment =	visitAssignment((MuteParser.AssignmentContext) child);
				
				// only happens for array concatenation
				if (assignment instanceof Value[]) {
					for (Value subAssignment : (Value[])assignment)
						assignmentList.add(subAssignment);
				} else
					assignmentList.add((Value) assignment);
			}
		}
		
		return assignmentList;
	}
	
	@Override
	public Object visitAssignment(MuteParser.AssignmentContext ctx) {
		Object rhs = visit(ctx.rValueExpression());
		// only happens for array concatenation
		if (rhs instanceof Value[])
			return rhs;
		
		Value value = new Value();
		if (ctx.ID() != null) 
			value.name = ctx.ID().getText();
		value.value = rhs;
		return value;
	}

	@Override
	public Object visitGenericOperation(MuteParser.GenericOperationContext ctx) {
		final MuteParser.GenericOperationContext operationContext = ctx;
		final InterpretingVisitor outer = this;
			
		return new Func<String>() {
			@Override
			public String evaluate() {
				return outer.visit(operationContext.rValueExpression()).toString();
			}
		};
	}
	
	@Override
	public Object visitAssignmentOperation(MuteParser.AssignmentOperationContext ctx) {
		final MuteParser.AssignmentOperationContext operationContext = ctx;
			
		return new Func<String>() {
			@SuppressWarnings("unchecked")
			@Override
			public String evaluate() {
				MutableAccess lValue = (MutableAccess) visitLValueExpression(operationContext.lValueExpression());
				Collection<Value> values = (Collection<Value>) visitAssignmentList(operationContext.assignmentList());
				Statement lValueReference = lValue.getReference();
				if (lValueReference == null)
				{
					lValueReference = new Statement();
					if (operationContext.lValueExpression().ID() != null)
					{
						lValueReference.name = operationContext.lValueExpression().ID().getText();
						namedStatements.put(lValueReference.name, lValueReference);
					}
				}
				assignValues(lValueReference, values);
				return null;
			}
		};
	}
	
	@Override
	public Object visitLValueWrapper(MuteParser.LValueWrapperContext ctx) {
		MutableAccess ma = (MutableAccess) visitLValueExpression(ctx.lValueExpression());
		return ma.get();
	}
	
	@Override
	public Object visitNumericAtom(MuteParser.NumericAtomContext ctx) {
		return Integer.parseInt(ctx.INT().getText());
	}
	
	@Override
	public Object visitRange(MuteParser.RangeContext ctx) {
		int from = (int) visit(ctx.rValueExpression(0));
		int to = (int) visit(ctx.rValueExpression(1));
		return random.nextInt(to - from + 1) + from;
	}
	
	@Override
	public Object visitUnaryExpression(MuteParser.UnaryExpressionContext ctx) {
		return -1 * (int) visit(ctx.rValueExpression());
	}
	
	@Override
	public Object visitParenthezisedExpression(MuteParser.ParenthezisedExpressionContext ctx) {
		return visit(ctx.rValueExpression());
	}
	
	@Override
	public Object visitBinaryNumericExpression(MuteParser.BinaryNumericExpressionContext ctx) {
		int lhs = (int) visit(ctx.rValueExpression(0));
		int rhs = (int) visit(ctx.rValueExpression(1));
		
		switch (ctx.getChild(1).getText()) {
			case "-": return lhs - rhs;
			case "+": return lhs + rhs;
			case "*": return lhs * rhs;
			// case "/":
			default:  return lhs / rhs;
		}
	}
	
	@Override
	public Object visitStringExpansion(MuteParser.StringExpansionContext ctx) {
		String str = ctx.STRING().getText();
		str = str.substring(1, str.length() - 1); // trim off the quotes
		
		for (int i=0; i<ctx.getChildCount(); i++) {
			ParseTree childAt = ctx.getChild(i);
			if (childAt instanceof MuteParser.RValueExpressionContext) {
				Object value = visit(childAt);
				String replaced;
				if (value instanceof Statement)
					replaced = ((Statement) value).values.toString();
				else
					replaced = value.toString();
				str = str.replaceFirst("@", replaced);
			}
		}
		
		return str;
	}
	
	@Override
	public Object visitBinaryStringExpression(MuteParser.BinaryStringExpressionContext ctx) {
		switch (ctx.getChild(1).getText()) {
			case "&": { 
				Object lhs = visit(ctx.rValueExpression(0));
				
				if (lhs instanceof String)
					return (String) lhs + (String) visit(ctx.rValueExpression(1));
				
				if (lhs instanceof Statement)
				{
					Statement rhs = (Statement) visit(ctx.rValueExpression(1));
					Value[] retArray = new Value[((Statement)lhs).values.size() + rhs.values.size()];
					int i = 0;
					for (Value v : ((Statement)lhs).values) retArray[i++] = v;
					for (Value v : rhs.values) retArray[i++] = v;
					return retArray;
				}
				
				throw new RuntimeException();
			}
				
			// case "|":
			default: {
				// substring operator (no length)
				Object lhs = visit(ctx.rValueExpression(0));
				int rhs = (int) visit(ctx.rValueExpression(1));
				
				if (lhs instanceof String)
					return ((String)lhs).substring(rhs);
				
				if (lhs instanceof Statement)
				{
					List<Value> origArray = ((Statement)lhs).values;
					Value[] retArray = new Value[origArray.size() - rhs];
					int i = 0;
					for (int j = rhs; j < origArray.size(); j++)
						retArray[i++] = origArray.get(j);
					return retArray;
				}
				
				throw new RuntimeException();
			}
		}		
	}
	
	@Override
	public Object visitLValueExpression(MuteParser.LValueExpressionContext ctx) {
		Stack<Object> nameStack = new Stack<Object>();

		nameStack.add(ctx.ID().getText());
		MuteParser.LValueExpressionContext curCtx = ctx;
		while (curCtx.getChildCount() > 1) {
			curCtx = curCtx.lValueExpression();
			if (curCtx.INT() != null)	nameStack.add((Integer) Integer.parseInt(curCtx.INT().getText()));
			else						nameStack.add(curCtx.ID().getText());
		}

		String hostName = (String) nameStack.pop();
		Statement hostStatement = hostName.equals("$") ? currentStatement : namedStatements.get(hostName);
		Value referencedValue = null;
		
		while (!nameStack.empty()) {
			Object rhs = nameStack.pop();
			if (rhs instanceof Integer)
				referencedValue = hostStatement.values.get((Integer)rhs);
			else
				referencedValue = hostStatement.findValueByName((String)rhs);
			
			if (referencedValue.value instanceof Statement) {
				hostStatement = (Statement) referencedValue.value;
				referencedValue = null;
			}
			else
				hostStatement = null;
		}
		
		final Statement lValueStatement = hostStatement;
		final Value lValueValue = referencedValue;
		final boolean isValue = lValueValue != null;
		
		return new MutableAccess() {
			Statement newReference = null;
			
			@Override
			public Object get() {
				Statement r = newReference;
				if (r == null) r = lValueStatement;
				return isValue ? lValueValue.value : r.isSingleton() ? r.values.get(0).value : r;
			}

			@Override
			public Statement getReference() {
				return newReference == null ? lValueStatement : newReference;
			}
			
			@Override
			public void setReference(Statement reference) {
				newReference = reference;
			}
		};
	}
}

	