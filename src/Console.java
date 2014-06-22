import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.annotations.JSFunction;


public class Console extends ScriptableObject {

	private static final long serialVersionUID = 1L;
	
	public static final Console Instance = new Console(); 
	
	@JSFunction
	public void print(String s) {
		System.out.println(s);
	}
	
	@JSFunction
	public void logError(String s) {
		System.err.println(s);
	}

	@Override
	public String getClassName() {
		return "Console";
	}
}
