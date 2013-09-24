import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class MuteInterpreter {
	
	ANTLRInputStream inputStream;
	
	public MuteInterpreter(ANTLRInputStream stream) {
		inputStream = stream;
	}
	
	public void parse() {
		MuteLexer lexer = new MuteLexer(inputStream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		MuteParser parser = new MuteParser(tokens);
		ParseTree tree = parser.parse();
		InterpretingVisitor visitor = new InterpretingVisitor();
		tree.accept(visitor);
		
		Statement[] ss = new Statement[visitor.namedStatements.size()];
		visitor.namedStatements.values().toArray(ss);
		Arrays.sort(ss);
		for (Statement s : ss)
			System.out.println(s.toString());
	}
	
	public static void main(String[] args) {
		ANTLRInputStream input = null;
		try {
			FileInputStream fis = new FileInputStream(args[0]);
			input = new ANTLRInputStream(fis);
			fis.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		MuteInterpreter interpreter = new MuteInterpreter(input);
		interpreter.parse();
	}
}
