

public class Console {

	public static final Console Instance = new Console(); 
	
	public void print(String s) {
		System.out.println(s);
	}
	
	public void logError(String s) {
		System.err.println(s);
	}
}
