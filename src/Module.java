
public abstract class Module {
	
	protected Memory memory;
	
	public Module(Memory memory) {
		this.memory = memory;
	}
	
	public abstract void set(String name, int value);
	public abstract void set(String name, String value);
	public abstract void set(String name, Object[] values);
	public abstract void set(String name, ValueCollection value);
	
	public void evaluate(Statement statement) {
		for (Value v : statement.getValues()) {
			String name = v.name.toString();
			if (v.value instanceof Integer)
				set(name, (int) v.value);
			else if (v.value instanceof String)
				set(name, (String) v.value);
			else if (v.value instanceof ValueCollection) {
				ValueCollection vc = (ValueCollection) v.value;
				if (vc.isArray())	set(name, vc.asArray());
				else				set(name, vc);
			}
			else
				throw new RuntimeException("Value of type " + v.getClass().getSimpleName() + " is not supported");
			
			// TODO : operations and conditions
		}
	}
	
	public void close()
	{
	}
}
