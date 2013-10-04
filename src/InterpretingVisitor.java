import java.util.ArrayList;
import java.util.Arrays;
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
		
		boolean skipOperations = false;
		for (int i=0; i<ctx.getChildCount(); i++) {
			ParseTree child = ctx.getChild(i);
			
			if (child instanceof MuteParser.AssignmentStatementPartContext) {
				Collection<Value> values = (Collection<Value>) visitAssignmentStatementPart((MuteParser.AssignmentStatementPartContext) child);
				skipOperations |= assignValues(statement, values);
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
		
		if (allConditionsPass && !skipOperations)
			for (Func<String> operation : statement.operations)
			{
				String result = operation.evaluate();
				if (result != null)
					System.out.println(result);
			}
		
		return statement;
	}
	
	private static boolean assignValues(Statement statement, Collection<Value> values) {
		boolean anyNamed = false;
		for (Value v : values)
			if (v.name != null) {
				anyNamed = true;
				break;
			}
		if (!anyNamed)
			statement.values.clear();
		
		boolean skipOperations = false;
		
		for (Value value : values)
		{
			boolean flattenArray = false;
			
			if (value.value instanceof Statement)
			{
				Statement copySource = (Statement) value.value;
				
				// values are copied by-value 
				Value[] valuesCopy = copySource.getValues().values;
				if (valuesCopy.length == 1)
					value.value = valuesCopy[0].value; 
				else
				{
					value.value = valuesCopy;
					flattenArray = values.size() == 1 && value.name == null;
				}
				
				// operations and conditions carry over!
				if (copySource.conditions.size() > 0)
				{
					statement.conditions.clear();
					statement.conditions.addAll(copySource.conditions);
				}
				if (copySource.operations.size() > 0)
				{
					skipOperations = true;
					statement.operations.clear();
					statement.operations.addAll(copySource.operations);
				}
			}
			
			if (flattenArray)
			{
				Value[] subValues = (Value[]) value.value;
				for (Value subValue : subValues)
					statement.setValue(subValue);
			}
			else
				statement.setValue(value);
		}
		
		return skipOperations;
	}
	
	@Override
	public Object visitConditionStatementPart(MuteParser.ConditionStatementPartContext ctx) {
		return visit(ctx.condition());
	}
	
	@Override
	public Object visitGenericCondition(MuteParser.GenericConditionContext ctx) {
		final MuteParser.GenericConditionContext conditionContext = ctx;
		final String operator = ctx.COMP_OPERATOR().getText();
		
		return new Predicate() {
			@SuppressWarnings({ "rawtypes", "unchecked" })
			@Override
			public boolean evaluate() {
				Object lhs = unbox(visit(conditionContext.rValueExpression(0)));
				Object rhs = unbox(visit(conditionContext.rValueExpression(1)));
				
				if ((lhs == null || rhs == null) && !(lhs == null && rhs == null))
					return false;
				
				if (lhs instanceof Comparable && rhs instanceof Comparable)
				{
					Comparable clhs = (Comparable) lhs;
					Comparable crhs = (Comparable) rhs;
					
					try {
						switch (operator) {
							case "=": 	return clhs.compareTo(crhs) == 0; 
							case "<=":	return clhs.compareTo(crhs) <= 0;
							case ">=":	return clhs.compareTo(crhs) >= 0;
							case "<":	return clhs.compareTo(crhs) < 0;
							case ">":	return clhs.compareTo(crhs) > 0;
							default:	throw new RuntimeException("Unrecognized operator : " + operator);
						}
					} catch (ClassCastException ex) {
						//throw new RuntimeException("Arguments of type " + lhs.getClass() + " and " + rhs.getClass() + " can not be compared!");
						// TODO : Warning mechanism?
						return false;
					}
				}
				
				// fallback on equality
				switch (operator)
				{
					case "=": 	return lhs.equals(rhs); 
					default:	throw new RuntimeException("Unsupported or unrecognized operator : " + operator);
				}
			}
		};
	}
	
	@Override
	public Object visitExistenceCondition(MuteParser.ExistenceConditionContext ctx) {
		final MuteParser.ExistenceConditionContext conditionContext = ctx;
		
		return new Predicate() {
			@Override
			public boolean evaluate() {
				MutableAccess value = (MutableAccess) visitLValueExpression(conditionContext.lValueExpression());
				return value != null && value.exists() && value.getHostStatement().hasValue();
			}
		};
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
		// array concatenation
		if (rhs instanceof Value[])
			return rhs;
		
		Value value = new Value(rhs);
		if (ctx.ID() != null) 			value.name = ctx.ID().getText();
		else if (ctx.INT() != null)		value.name = Integer.parseInt(ctx.INT().getText());
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
				
				if (!lValue.exists())
				{
					Statement statement = new Statement();
					if (operationContext.lValueExpression().ID() != null)
					{
						statement.name = operationContext.lValueExpression().ID().getText();
						namedStatements.put(statement.name, statement);
					}
					lValue.set(statement);
				}
				
				assignValues(lValue.getHostStatement(), values);
				
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
	
	static Object unbox(Object expression) {
		if (expression instanceof Statement)
		{
			Statement statement = (Statement) expression;
			if (statement.hasValue())
			{
				if (statement.isSingleton())
					return statement.getSingletonValue();
				return statement.getValues();
			}
			return null;
		}
		return expression;
	}
	
	@Override
	public Object visitBinaryNumericExpression(MuteParser.BinaryNumericExpressionContext ctx) {
		int lhs = (int) unbox(visit(ctx.rValueExpression(0)));
		int rhs = (int) unbox(visit(ctx.rValueExpression(1)));
		
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
				Object value = unbox(visit(childAt));
				String replaced = value.toString();
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
					for (Value v : ((Statement)lhs).getValues()) retArray[i++] = v;
					for (Value v : rhs.getValues()) {
						retArray[i] = v;
						retArray[i++].name = null; // will be filled in later
					}
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
					Value[] origArray = ((Statement)lhs).getValues().values;
					Value[] retArray = new Value[origArray.length - rhs];
					int i = 0;
					for (int j = rhs; j < origArray.length; j++)
					{
						retArray[i] = origArray[j];
						retArray[i++].name = null; // will be filled in later
					}
					return retArray;
				}
				
				throw new RuntimeException();
			}
		}		
	}
	
	@Override
	public Object visitLValueExpression(MuteParser.LValueExpressionContext ctx) {
		final Statement contextStatement = currentStatement;
		final MuteParser.LValueExpressionContext parseContext = ctx;
		
		return new MutableAccess() {
			//final Object snapshotValue = get(); // might be useful?
			
			Statement hostStatement = null;
			Object valueName = null;
			
			@Override
			public Object get() {
				hostStatement = null;
				valueName = null;
				
				Stack<Object> nameStack = new Stack<Object>();

				MuteParser.LValueExpressionContext curCtx = parseContext;
				do
				{
					if (curCtx.INT() != null)	nameStack.add((Integer) Integer.parseInt(curCtx.INT().getText()));
					else						nameStack.add(curCtx.ID().getText());
					curCtx = curCtx.lValueExpression();
				}
				while (curCtx != null);

				String hostName = (String) nameStack.pop();
				hostStatement = hostName.equals("$") ? contextStatement : namedStatements.get(hostName);
				Object referencedValue = null;
				
				while (!nameStack.empty()) {
					valueName = nameStack.pop();
					referencedValue = hostStatement.getValue(valueName);
					
					if (referencedValue instanceof Statement)
						hostStatement = (Statement) referencedValue;
					else if (referencedValue instanceof Value[])
					{
						// multi-dimensional arrays... kind of a hack
						hostStatement = new Statement();
						assignValues(hostStatement, Arrays.asList((Value[]) referencedValue));
					}
				}
				
				if (referencedValue == null)
				{
					if (hostStatement == null) 
						return null;
					return hostStatement;
				}
							
				return referencedValue;
			}
			
			@Override
			public void set(Object newValue) {
				get();
				if (valueName == null)	hostStatement = (Statement) newValue;
				else					hostStatement.setValue(new Value(newValue));
			}
			
			@Override
			public boolean exists() {
				get();
				return hostStatement != null;
			}
			
			@Override
			public Statement getHostStatement() {
				return hostStatement;
			}
		};
	}
}

	