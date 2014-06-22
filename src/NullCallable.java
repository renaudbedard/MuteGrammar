import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;


public class NullCallable implements Callable {

	public static final Callable Instance = new NullCallable();
	
	@Override
	public Object call(Context cx, Scriptable scope, Scriptable thisObj, Object[] args) {
		return args[1];
	}
}
