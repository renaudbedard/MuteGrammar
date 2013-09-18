// Generated from Mute.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MuteParser}.
 */
public interface MuteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MuteParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull MuteParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuteParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull MuteParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MuteParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentList(@NotNull MuteParser.AssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuteParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentList(@NotNull MuteParser.AssignmentListContext ctx);

	/**
	 * Enter a parse tree produced by {@link MuteParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(@NotNull MuteParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuteParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(@NotNull MuteParser.OperationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MuteParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull MuteParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuteParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull MuteParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link MuteParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull MuteParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuteParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull MuteParser.ConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MuteParser#rValueExpression}.
	 * @param ctx the parse tree
	 */
	void enterRValueExpression(@NotNull MuteParser.RValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuteParser#rValueExpression}.
	 * @param ctx the parse tree
	 */
	void exitRValueExpression(@NotNull MuteParser.RValueExpressionContext ctx);

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

	/**
	 * Enter a parse tree produced by {@link MuteParser#lValueExpression}.
	 * @param ctx the parse tree
	 */
	void enterLValueExpression(@NotNull MuteParser.LValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuteParser#lValueExpression}.
	 * @param ctx the parse tree
	 */
	void exitLValueExpression(@NotNull MuteParser.LValueExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MuteParser#statementPart}.
	 * @param ctx the parse tree
	 */
	void enterStatementPart(@NotNull MuteParser.StatementPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuteParser#statementPart}.
	 * @param ctx the parse tree
	 */
	void exitStatementPart(@NotNull MuteParser.StatementPartContext ctx);
}