import java.util.Arrays;


public class TestModule extends Module {
	
	int foo;
	String bar;
	int[] baz;
	ValueCollection qux;
	
	@Override
	public String getName() {
		return "test";
	}
	
	@Override
	public void set(String name, int value) {
		switch (name) {
			case "foo": 
				foo = value;
				System.out.println("foo set to " + value);
				break;
		}
	}

	@Override
	public void set(String name, String value) {
		switch (name) {
			case "bar":
				bar = value;
				System.out.println("bar set to " + value);
				break;
		}
	}

	@Override
	public void set(String name, int[] values) {
		switch (name) {
			case "baz": 
				baz = values;
				System.out.println("baz set to " + Arrays.toString(values));
				break;
		}		
	}
	
	@Override
	public void set(String name, String[] values) {
	}

	@Override
	public void set(String name, ValueCollection value) {
		switch (name) {
			case "qux": qux = value; break;
		}
	}

	@Override
	public void execute(String operation) {
		switch (operation) {
			case "dump":
				System.out.println("foo : " + foo + ", bar : " + bar + ", " + 
								   "baz : " + Arrays.toString(baz) + ", qux : " + qux);
				break;
				
			case "hello":
				System.out.println("Hi there!");
				break;
		}
	}
}
