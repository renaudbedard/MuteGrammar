import java.util.ArrayList;
import java.util.List;


class Statement implements Comparable<Statement>
{
	public String name = null;
	List<Value> values = new ArrayList<Value>();
	List<Predicate> conditions = new ArrayList<Predicate>();
	List<Func<String>> operations = new ArrayList<Func<String>>();

	public Statement() { }
	public Statement(String name) {
		this.name = name;
	}
	
	final boolean isSingleton() { return values.size() == 1 && values.get(0).name == null; }
	final boolean hasValue() { return values.size() > 0; }
	
	final Value findValueByName(String name) {
		for (Value v : values)
			if (v.name.equals(name))
				return v;
		
		throw new RuntimeException("Could not find value named " + name + " under statement " + this.name);
	}
	final boolean namedValueExists(String name) {
		for (Value v : values)
			if (v.name.equals(name))
				return true;
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s", name, values);
	}
	@Override
	public int compareTo(Statement o) {
		return name.compareTo(o.name);
	}
}
