import java.util.Arrays;
import java.util.Iterator;


public class ValueCollection implements Iterable<Value> {
	
	Value[] values;
	
	public ValueCollection(Value[] values) {
		this.values = values;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof ValueCollection && Arrays.equals(values, ((ValueCollection)obj).values);
	}

	@Override
	public String toString() {
		String text = "[";
		
		// test if they're all contiguous integers for pretty-printing
		boolean contiguous = true;
		int i = 1;
		for (Value v : values)
			contiguous &= v.name instanceof Integer && i++ == (int) v.name;
		
		for (Value v : values)
		{
			String valueString = (v.value instanceof Object[] ? Arrays.toString((Object[]) v.value) : v.value.toString());
			if (contiguous) text += valueString;
			else			text += v.name.toString() + ": " + valueString;
			text += ", ";
		}
		text = text.substring(0, text.length() - 2) + "]";
		
		return text;
	}

	@Override
	public Iterator<Value> iterator() {
		return Arrays.asList(values).iterator();
	}
}
