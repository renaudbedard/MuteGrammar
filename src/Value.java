
public class Value {
	public String name = null;
	public Object value = null;
	
	public Value() {}
	
	public Value(String name, Object value) {
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
