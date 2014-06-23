

public class Console {

	private static final long serialVersionUID = 1L;
	
	public static final Console Instance = new Console(); 
	
	public void print(String s) {
		System.out.println(s);
	}
	
	public void logError(String s) {
		System.err.println(s);
	}
}
