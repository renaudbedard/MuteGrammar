package com.xxiivv.mute;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class MuteInterpreter {
	
	private static final String VERSION = "1.02"; 
	
	ANTLRInputStream inputStream;
	
	public MuteInterpreter() { }
	public MuteInterpreter(ANTLRInputStream stream) {
		inputStream = stream;
	}
	
	public void startInteractiveMode() {
		System.out.println("\nMute Interactive Interpreter (version " + VERSION + ")");
		System.out.println("===========================================");
		System.out.println("Type exit to exit.\n");
		
		Scanner scanner = new Scanner(System.in);
		Memory memory = new Memory();
		InterpretingVisitor visitor = new InterpretingVisitor(memory);
		
		while (true) {
			System.out.print("> ");
			
			String line = scanner.next();
			
			// special case
			// TODO : handle with a "system" module
			if (line.trim().equals("exit"))
			{
				System.out.println("Exiting.");
				break;
			}
			
			// so the lexer doesn't complain...
			line += "\n";
			
			try {
				MuteLexer lexer = new MuteLexer(new ANTLRInputStream(new ByteArrayInputStream(line.getBytes("UTF-8"))));
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				MuteParser parser = new MuteParser(tokens);
				ParseTree tree = parser.parse();
				tree.accept(visitor);
				
			} catch (Exception ex) {
				System.err.print("INTERNAL ERROR : ");
				ex.printStackTrace();
			}
		} 
		
		scanner.close();
		visitor.close();
	}
	
	public void parse() {
		MuteLexer lexer = new MuteLexer(inputStream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		MuteParser parser = new MuteParser(tokens);
		ParseTree tree = parser.parse();
		Memory memory = new Memory();
		InterpretingVisitor visitor = new InterpretingVisitor(memory);
		tree.accept(visitor);
		
		visitor.close();
	}
	
	public static void main(String[] args) {
		MuteInterpreter interpreter;
		
		if (args.length == 0)
		{
			interpreter = new MuteInterpreter();
			interpreter.startInteractiveMode();
		}
		else
		{
			ANTLRInputStream input = null;
			try {
				FileInputStream fis = new FileInputStream(args[0]);
				input = new ANTLRInputStream(fis);
				fis.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			
			interpreter = new MuteInterpreter(input);
			interpreter.parse();
		}
	}
}
