import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Statement implements Comparable<Statement>
{
	public String name = null;
	Map<Object, Object> values = new HashMap<Object, Object>();
	List<Predicate> conditions = new ArrayList<Predicate>();
	List<Func<String>> operations = new ArrayList<Func<String>>();

	public Statement() { }
	public Statement(String name) {
		this.name = name;
	}
	
	final boolean isSingleton() { return values.size() == 1 && values.containsKey(1); }
	final Object getSingletonValue() { 
		for (Object v : values.values())
			return v;
		return null;
	}
	
	final boolean hasValue() { return values.size() > 0; }
	
	void setValue(Value value) {
		if (value.name == null)
			value.name = getNextIndex();
		values.put(value.name, value.value);
	}
	Object getValue(Object name) {
		return values.get(name);
	}
	Value[] getValues() {
		Value[] copy = new Value[values.size()];
		int i = 0;
		for (Object k : values.keySet())
			copy[i++] = new Value(k, values.get(k));
		return copy;
	}
	
	int getNextIndex() {
		int nextIndex = 1;
		
		for (Object name : values.keySet()) 
			if (name instanceof Integer)
				nextIndex = Math.max(nextIndex, (int) name + 1);
		
		return nextIndex;
	}
	
	@Override
	public String toString() {
		// make sure arrays-of-arrays are stringified
		String text = "[";
		if (!isSingleton())
		{
			for (Object key : values.keySet())
			{
				Object value = values.get(key);
				text += key.toString() + ": " + (value instanceof Object[] ? Arrays.toString((Object[]) value) : value.toString()) + ", ";
			}
			text = text.substring(0, text.length() - 2) + "]";
		}
		return String.format("%s %s", name, isSingleton() ? "[" + getSingletonValue() + "]" : text);
	}
	@Override
	public int compareTo(Statement o) {
		return name.compareTo(o.name);
	}
}
