import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;



public class MuteCompiler {

	public static void main(String[] args) {
		ANTLRInputStream input = null;
		try {
			FileInputStream fis = new FileInputStream(args[0]);
			input = new ANTLRInputStream(fis);
			fis.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		MuteLexer lexer = new MuteLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		MuteParser parser = new MuteParser(tokens);
		
		ParseTree tree = parser.parse(); 
		System.out.println(tree.toStringTree(parser).replace(" (statement", "\n\t(statement").replace("<EOF>", "\n<EOF>"));
	}

}
