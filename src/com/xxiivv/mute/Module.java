package com.xxiivv.mute;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class Module {
	private String name, filename;
	private ScriptEngine engine;
	
	public Module(String name, String filename) {
		this.name = name;
		this.filename = filename;
	}
	
	public void initialize(Memory memory) {
	    engine = new ScriptEngineManager().getEngineByName ("nashorn");

	    engine.put ("memory", memory);
	    engine.put ("console", Console.Instance);
	    
	    try {
            engine.eval (new FileReader (this.filename));
        }
        catch (Exception e) {
            System.err.printf ("Unexpected exception caught while evaluating module '%s' javascript file '%s': %s\n", name, filename, e);
//            e.printStackTrace();
        }
	    
	    invoke ("init");
	}
	
	public void reload(Memory memory) {
		close();
		initialize(memory);
	}
	
	public void evaluate(Statement statement, Iterable<String> operations) {
		for (Value v : statement.getValues()) {
			String name = v.name.toString();
			
			if (v.value instanceof Integer || v.value instanceof String)
			    engine.put (name, v.value);
			else if (v.value instanceof Value[]) {
			    ValueCollection vc = new ValueCollection((Value[]) v.value);
			    if (vc.isArray())
			        engine.put (name, vc.asArray());
			    else
			        engine.put (name, vc);
			}
			else
			    throw new RuntimeException("Value of type " + v.value.getClass().getSimpleName() + " is not supported");
		}

		if (!statement.testConditions())
			return;
		
		for (String o : operations)	{
		    invoke (o, o + " is undefined or not a function for module <" + name + ">.");
		}
	}
	
	public void close() {
        invoke ("destroy");
	}
	
	private void invoke (String function) {
	    invoke (function, null);
	}
	
	private void invoke (String function, String errorMessage) {
	    try {
            ((Invocable) engine).invokeFunction (function);
        }
	    catch (ScriptException e) {
	    	System.err.printf ("{%s} in module <%s> threw an exception at line %s: '%s'\n", function, name, e.getLineNumber(), e.getCause().getMessage());
//	        e.printStackTrace ();
	    }
        catch (Exception  e) {
            if (errorMessage != null)
                System.err.println (errorMessage);
        }
	}
	
	public String getName() {
		return name;
	}
}
