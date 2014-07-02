package com.xxiivv.mute;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Statement implements Comparable<Statement>
{
	public String name = null;
	public Map<Object, Object> values = new HashMap<Object, Object>();
	public List<Predicate> conditions = new ArrayList<Predicate>();
	public List<Func<String>> operations = new ArrayList<Func<String>>();

	public Statement() { }
	public Statement(String name) {
		this.name = name;
	}
	
	public boolean isSingleton() { return values.size() == 1 && values.containsKey(1); }
	public Object getSingletonValue() { 
		for (Object v : values.values())
			return v;
		return null;
	}
	
	public boolean hasValue() { return values.size() > 0; }
	
	public void setValue(Value value) {
		if (value.name == null)
			value.name = getNextIndex();
		values.put(value.name, value.value);
	}
	public Object getValue(Object name) {
		return values.get(name);
	}
	public ValueCollection getValues() {
		Value[] copy = new Value[values.size()];
		int i = 0;
		for (Object k : values.keySet())
			copy[i++] = new Value(k, values.get(k));
		return new ValueCollection(copy);
	}
	public Map<Object, Object> getValueMap() {
		return values;
	}
	
	private int getNextIndex() {
		int nextIndex = 1;
		
		for (Object name : values.keySet()) 
			if (name instanceof Integer)
				nextIndex = Math.max(nextIndex, (int) name + 1);
		
		return nextIndex;
	}
	
	public boolean testConditions() {
		boolean allConditionsPass = true;
		for (Predicate p : conditions)
			allConditionsPass &= p.evaluate();
		return allConditionsPass;
	}
	
	public String execute() {
		StringBuilder bld = new StringBuilder();
		
		if (testConditions())
			for (Func<String> operation : operations)
			{
				String result = operation.evaluate();
				if (result != null)
					bld.append(result + "\n");
			}
		
		return bld.toString().trim();
	}
	
	@Override
	public String toString() {
		String text = "";
		if (hasValue() && !isSingleton())
			text = getValues().toString();
			
		return String.format("%s %s", name, isSingleton() ? "[" + getSingletonValue() + "]" : text);
	}
	@Override
	public int compareTo(Statement o) {
		return name.compareTo(o.name);
	}
}
