// Generated from Mute.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MuteParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MuteVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MuteParser#stringExpansion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpansion(@NotNull MuteParser.StringExpansionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MuteParser#conditionStatementPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionStatementPart(@NotNull MuteParser.ConditionStatementPartContext ctx);

	/**
	 * Visit a parse tree produced by {@link MuteParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(@NotNull MuteParser.RangeContext ctx);

	/**
	 * Visit a parse tree produced by {@link MuteParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(@NotNull MuteParser.UnaryExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MuteParser#operationStatementPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationStatementPart(@NotNull MuteParser.OperationStatementPartContext ctx);

	/**
	 * Visit a parse tree produced by {@link MuteParser#genericOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericOperation(@NotNull MuteParser.GenericOperationContext ctx);

	/**
	 * Visit a parse tree produced by {@link MuteParser#parenthezisedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthezisedExpression(@NotNull MuteParser.ParenthezisedExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MuteParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull MuteParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MuteParser#existenceCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistenceCondition(@NotNull MuteParser.ExistenceConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MuteParser#numericAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericAtom(@NotNull MuteParser.NumericAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link MuteParser#assignmentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentList(@NotNull MuteParser.AssignmentListContext ctx);

	/**
	 * Visit a parse tree produced by {@link MuteParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull MuteParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link MuteParser#genericCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericCondition(@NotNull MuteParser.GenericConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MuteParser#lValueWrapper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLValueWrapper(@NotNull MuteParser.LValueWrapperContext ctx);

	/**
	 * Visit a parse tree produced by {@link MuteParser#binaryNumericExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryNumericExpression(@NotNull MuteParser.BinaryNumericExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MuteParser#binaryStringExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryStringExpression(@NotNull MuteParser.BinaryStringExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MuteParser#assignmentStatementPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatementPart(@NotNull MuteParser.AssignmentStatementPartContext ctx);

	/**
	 * Visit a parse tree produced by {@link MuteParser#assignmentOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperation(@NotNull MuteParser.AssignmentOperationContext ctx);

	/**
	 * Visit a parse tree produced by {@link MuteParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(@NotNull MuteParser.ParseContext ctx);

	/**
	 * Visit a parse tree produced by {@link MuteParser#lValueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLValueExpression(@NotNull MuteParser.LValueExpressionContext ctx);
}