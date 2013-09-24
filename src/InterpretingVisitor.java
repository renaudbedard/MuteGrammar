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
				Collection<? extends Value> values = 
						(Collection<? extends Value>) 
						visitAssignmentStatementPart((MuteParser.AssignmentStatementPartContext) child);
				
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
				System.out.println(operation.evaluate());
		
		return statement;
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
				assignmentList.add((Value) assignment);
			}
		}
		
		return assignmentList;
	}
	
	@Override
	public Object visitAssignment(MuteParser.AssignmentContext ctx) {
		Value value = new Value();
		
		if (ctx.ID() != null)
			value.name = ctx.ID().getText();
		value.value = visit(ctx.rValueExpression());
		
		return value;
	}
	
	@Override
	public Object visitLValueWrapper(MuteParser.LValueWrapperContext ctx) {
		MutableAccess ma = (MutableAccess) visitLValueExpression(ctx.lValueExpression());
		return ma.get();
	}
	
	@Override
	public Object visitNumericAtom(MuteParser.NumericAtomContext ctx) {
		if (ctx.range() != null) {
			int from = Integer.parseInt(ctx.range().INT(0).getText());
			int to = Integer.parseInt(ctx.range().INT(1).getText());
			return random.nextInt(to - from + 1) + from;
		}
		return Integer.parseInt(ctx.INT().getText());
	}
	
	@Override
	public Object visitUnaryExpression(MuteParser.UnaryExpressionContext ctx) {
		return -1 * (int) visit(ctx.rValueExpression());
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
				str = str.replaceFirst("@", value.toString());
			}
		}
		
		return str;
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
		Statement hostStatement = hostName == "$" ? currentStatement : namedStatements.get(hostName);
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
			@Override
			public Object get() {
				return isValue ? lValueValue.value : lValueStatement;
			}

			@Override
			public void set(Object value) {
				if (isValue)	
					lValueValue.value = value;
				else {
					lValueStatement.values.clear();
					lValueStatement.values.add(new Value(null, value));
				}
			}
		};
	}
}

	