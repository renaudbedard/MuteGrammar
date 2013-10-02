
public class Value {
	public Object name = null;
	public Object value = null;
	
	public Value() {}
	
	public Value(Object value)
	{
		this.name = null;
		this.value = value;
	}
	
	public Value(Object name, Object value) {
		this.name = name;
		this.value = value;
	}
	
	@Override
	public String toString() {
		if (name == null)
			return value.toString();
		return String.format("%s: %s", name, value.toString());
	}
}
