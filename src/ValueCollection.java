import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.mozilla.javascript.ScriptableObject;


public class ValueCollection extends ScriptableObject implements Iterable<Value> {
	
	private static final long serialVersionUID = 1L;
	
	Value[] values;
	
	public ValueCollection() {
		values = new Value[] {};
	}
	ValueCollection(Value[] values) {
		this.values = values;
	}
	
	public boolean isArray() {
		boolean retValue = true;
		for (Value v : values)
			retValue &= v.name instanceof Integer;
		return retValue;
	}
	public boolean isContiguousArray() {
		boolean contiguous = true;
		int i = 1;
		for (Value v : values)
			contiguous &= v.name instanceof Integer && i++ == (int) v.name;
		return contiguous;
	}
	
	public Object[] asArray() {
		List<Object> list = new ArrayList<Object>();
		for (int i=0; i<values.length; i++)
			list.add((int) values[i].name - 1, values[i].value);
		
		Object[] retValue = new Object[list.size()];
		return list.toArray(retValue);
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof ValueCollection && Arrays.equals(values, ((ValueCollection)obj).values);
	}

	@Override
	public String toString() {
		String text = "[";
		
		boolean contiguous = isContiguousArray();
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

	@Override
	public String getClassName() {
		return "ValueCollection";
	}
	
	public boolean has(Object name) {
		if (name == null || !(name instanceof String || name instanceof Integer))
			throw new InvalidParameterException("name");
		
		for (int i=0; i<values.length; i++)
			if (values[i].name.equals(name))
				return true;
		return false;
	}
	
	 public Object get(Object name) {
		if (name == null || !(name instanceof String || name instanceof Integer))
			throw new InvalidParameterException("name");
		
		for (int i=0; i<values.length; i++)
			if (values[i].name.equals(name))
				return values[i].value;
		return null;
	}
}
