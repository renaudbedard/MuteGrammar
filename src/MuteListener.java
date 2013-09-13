// Generated from Mute.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MuteParser}.
 */
public interface MuteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MuteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull MuteParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull MuteParser.ExpressionContext ctx);

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
	 * Enter a parse tree produced by {@link MuteParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(@NotNull MuteParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuteParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(@NotNull MuteParser.ModuleContext ctx);

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
	 * Enter a parse tree produced by {@link MuteParser#unnamedStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnnamedStatement(@NotNull MuteParser.UnnamedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuteParser#unnamedStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnnamedStatement(@NotNull MuteParser.UnnamedStatementContext ctx);

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
	 * Enter a parse tree produced by {@link MuteParser#namedStatement}.
	 * @param ctx the parse tree
	 */
	void enterNamedStatement(@NotNull MuteParser.NamedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuteParser#namedStatement}.
	 * @param ctx the parse tree
	 */
	void exitNamedStatement(@NotNull MuteParser.NamedStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MuteParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(@NotNull MuteParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuteParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(@NotNull MuteParser.EmptyStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MuteParser#moduleStatement}.
	 * @param ctx the parse tree
	 */
	void enterModuleStatement(@NotNull MuteParser.ModuleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuteParser#moduleStatement}.
	 * @param ctx the parse tree
	 */
	void exitModuleStatement(@NotNull MuteParser.ModuleStatementContext ctx);
}