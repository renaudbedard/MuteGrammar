import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;


public abstract class Module {
	
	public abstract String getName();
	
	public abstract void set(String name, int value);
	public abstract void set(String name, String value);
	public abstract void set(String name, int[] values);
	public abstract void set(String name, String[] values);
	public abstract void set(String name, ValueCollection value);
	
	public abstract void execute(String operation);
	
	public void evaluate(Statement statement, Iterable<String> operations) {
		for (Value v : statement.getValues()) {
			String name = v.name.toString();
			if (v.value instanceof Integer)
				set(name, (int) v.value);
			else if (v.value instanceof String)
				set(name, (String) v.value);
			else if (v.value instanceof Value[]) {
				ValueCollection vc = new ValueCollection((Value[]) v.value);
				if (vc.isArray()) {
					Object[] array = vc.asArray();
					if (array[0] instanceof Integer)
						set(name, ArrayUtils.toPrimitive(Arrays.copyOf(array, array.length, Integer[].class)));
					else if (array[0] instanceof String)
						set(name, Arrays.copyOf(array, array.length, String[].class));
					else
						throw new RuntimeException("Value of type " + array[0].getClass().getSimpleName() + "[] is not supported");
				}
				else				
					set(name, vc);
			}
			else
				throw new RuntimeException("Value of type " + v.value.getClass().getSimpleName() + " is not supported");
		}

		if (!statement.testConditions())
			return;
		
		for (String o : operations)
			execute(o);
	}
	
	public void close()
	{
	}
}
