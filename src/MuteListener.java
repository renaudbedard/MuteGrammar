// Generated from Mute.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MuteParser}.
 */
public interface MuteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MuteParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull MuteParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuteParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull MuteParser.ParseContext ctx);
}