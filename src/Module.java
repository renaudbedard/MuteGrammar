import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.lang3.StringUtils;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;


public class Module {
	private String name, filename;
	private Context scriptContext;
	private Scriptable scriptScope;
	
	public Module(String name, String filename) {
		this.name = name;
		this.filename = filename;
	}
	
	public void initialize(Memory memory) {
		Path path = FileSystems.getDefault().getPath(".", filename);
    	String source = null;
		try {
			source = StringUtils.join(Files.readAllLines(path, Charset.defaultCharset()), "\n");
		} catch (IOException e) {
			throw new RuntimeException("Could not load module script for '" + name + "' at " + path, e);
		}
		
		scriptContext = Context.enter();
		scriptScope = scriptContext.initStandardObjects();
		
		// init other global objects
		try {
			ScriptableObject.defineClass(scriptScope, Memory.class);
			ScriptableObject.defineClass(scriptScope, Console.class);
			
		} catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
			throw new RuntimeException("Runtime error", e);
		}

		scriptContext.evaluateString(scriptScope, source, filename, 1, null);
		
		// set global objects
		if (memory.getPrototype() == null) {
			Scriptable defaultValue = scriptContext.newObject(scriptScope, "Memory");
			memory.setPrototype(defaultValue.getPrototype());
		}
		scriptScope.put("memory", scriptScope, memory);
		
		if (Console.Instance.getPrototype() == null) {
			Scriptable defaultValue = scriptContext.newObject(scriptScope, "Console");
			Console.Instance.setPrototype(defaultValue.getPrototype());
		}
		scriptScope.put("console", scriptScope, Console.Instance);
		
		// call init function
		Object fObj = scriptScope.get("init", scriptScope);
		if (fObj instanceof Function) {
		    Object functionArgs[] = { };
		    Function f = (Function) fObj;
		    f.call(scriptContext, scriptScope, scriptScope, functionArgs);
		}
	}
	
	public void reload(Memory memory) {
		close();
		initialize(memory);
	}
	
	public void evaluate(Statement statement, Iterable<String> operations) {
		for (Value v : statement.getValues()) {
			String name = v.name.toString();
			if (v.value instanceof Integer)
				ScriptableObject.putProperty(scriptScope, name, (int) v.value);
			else if (v.value instanceof String)
				ScriptableObject.putProperty(scriptScope, name, (String) v.value);
			else if (v.value instanceof Value[]) {
				ValueCollection vc = new ValueCollection((Value[]) v.value);
				if (vc.isArray()) 
					ScriptableObject.putProperty(scriptScope, name, Context.javaToJS(vc.asArray(), scriptScope));
				else
				{
					Object[] arg = { vc.values };
					Scriptable jsVC = scriptContext.newObject(scriptScope, "ValueCollection", arg);
					scriptScope.put(name, scriptScope, jsVC);
				}
			}
			else
				throw new RuntimeException("Value of type " + v.value.getClass().getSimpleName() + " is not supported");
		}

		if (!statement.testConditions())
			return;
		
		for (String o : operations)	{
			Object fObj = scriptScope.get(o, scriptScope);
			if (!(fObj instanceof Function)) {
			    System.err.println(o + " is undefined or not a function for module <" + name + ">.");
			} else {
			    Object functionArgs[] = { };
			    Function f = (Function) fObj;
			    f.call(scriptContext, scriptScope, scriptScope, functionArgs);
			}
		}
	}
	
	public void close() {
		// call init function
		Object fObj = scriptScope.get("destroy", scriptScope);
		if (fObj instanceof Function) {
		    Object functionArgs[] = { };
		    Function f = (Function) fObj;
		    f.call(scriptContext, scriptScope, scriptScope, functionArgs);
		}
		
		Context.exit();
	}
	
	public String getName() {
		return name;
	}
}
