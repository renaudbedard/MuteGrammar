package com.xxiivv.mute;
public class Value {
	public Object name = null;
	public Object value = null;
	
	public Value() {}
	
	public Value(Object value) {
		this.name = null;
		this.value = value;
	}
	
	public Value(Object name, Object value) {
		this.name = name;
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Value) {
			Value other = (Value) obj;
			boolean equal = true;
			if (name == null)	equal &= other.name == null;
			else				equal &= name.equals(other.name);
			if (!equal) return false;
			if (value == null)	equal &= other.value == null;
			else				equal &= value.equals(other.value);
			return equal;
		}
		return false;
	}
	
	@Override
	public String toString() {
		if (name == null)
			return value.toString();
		return String.format("%s: %s", name, value.toString());
	}
}
