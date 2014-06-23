import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Memory {

	private static final long serialVersionUID = 1L;
	
	private final Map<String, Statement> entries = new HashMap<String, Statement>();
	
	public Memory() {
	}
	
	public boolean contains(String name) {
		return entries.containsKey(name);
	}
	
	private void ensureExists(String name) {
		if (!contains(name))
			throw new RuntimeException("No entry with the name '" + name + "' found");
	}
	private void ensureSingleton(Statement entry) {
		if (!entry.isSingleton())
			throw new RuntimeException("Entry '" + entry.name + "' is multi-valued but was accessed as a singleton");
	}
	
	public int getInt(String name) {
		ensureExists(name);
		Statement entry = entries.get(name);
		ensureSingleton(entry);
		Object value = entry.getSingletonValue();
		if (!(value instanceof Integer))
			throw new RuntimeException("Entry '" + name + "' does not contain an integer number (type : " + name.getClass().getSimpleName() + ")");
		return (int) value;
	}
	
	public String getString(String name) {
		ensureExists(name);
		Statement entry = entries.get(name);
		ensureSingleton(entry);
		Object value = entry.getSingletonValue();
		if (!(value instanceof String))
			throw new RuntimeException("Entry '" + name + "' does not contain a string (type : " + name.getClass().getSimpleName() + ")");
		return (String) value;
	}
	
	public Object[] getArray(String name) {
		ensureExists(name);
		Statement entry = entries.get(name);
		if (entry.isSingleton())
			throw new RuntimeException("Entry '" + entry.name + "' is single-valued but was accessed as an array");
		ValueCollection values = entry.getValues();
		if (!values.isArray())
			throw new RuntimeException("Entry '" + entry.name + "' contains named values but was accessed as an array");
		
		return values.asArray();
	}
	
	public Map<Object, Object> getObject(String name) {
		ensureExists(name);
		Statement entry = entries.get(name);
		if (entry.isSingleton())
			throw new RuntimeException("Entry '" + entry.name + "' is single-valued but was accessed as an array");
		
		return entry.getValueMap();
	}
	
	public String fire(String functionName) {
		ensureExists(functionName);
		return entries.get(functionName).execute();
	}
	
	public void put(Statement statement) {
		entries.put(statement.name, statement);
	}
	public void put(String name, int value) {
		Statement s = new Statement(name);
		s.setValue(new Value(1, value));
		entries.put(name, s);
	}
	public void put(String name, String value) {
		Statement s = new Statement(name);
		s.setValue(new Value(1, value));
		entries.put(name, s);
	}
	public void put(String name, Object[] values) {
		Statement s = new Statement(name);
		for (int i=0; i<values.length; i++)
			if (values[i] != null)
				s.setValue(new Value(i + 1, values[i]));
		entries.put(name, s);
	}
	
	public Statement get(String name) {
		ensureExists(name);
		return entries.get(name);
	}
	
	public void dump() {
		Statement[] ss = new Statement[entries.size()];
		entries.values().toArray(ss);
		Arrays.sort(ss);
		for (Statement s : ss)
			System.out.println(s.toString());
	}
	
	public void clear() {
		entries.clear();
	}
}
