package com.xxiivv.mute;
// Generated from Mute.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MuteParser}.
 */
public interface MuteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MuteParser#stringExpansion}.
	 * @param ctx the parse tree
	 */
	void enterStringExpansion(@NotNull MuteParser.StringExpansionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuteParser#stringExpansion}.
	 * @param ctx the parse tree
	 */
	void exitStringExpansion(@NotNull MuteParser.StringExpansionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MuteParser#conditionStatementPart}.
	 * @param ctx the parse tree
	 */
	void enterConditionStatementPart(@NotNull MuteParser.ConditionStatementPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuteParser#conditionStatementPart}.
	 * @param ctx the parse tree
	 */
	void exitConditionStatementPart(@NotNull MuteParser.ConditionStatementPartContext ctx);

	/**
	 * Enter a parse tree produced by {@link MuteParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(@NotNull MuteParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuteParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(@NotNull MuteParser.RangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MuteParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(@NotNull MuteParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuteParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(@NotNull MuteParser.UnaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MuteParser#operationStatementPart}.
	 * @param ctx the parse tree
	 */
	void enterOperationStatementPart(@NotNull MuteParser.OperationStatementPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuteParser#operationStatementPart}.
	 * @param ctx the parse tree
	 */
	void exitOperationStatementPart(@NotNull MuteParser.OperationStatementPartContext ctx);

	/**
	 * Enter a parse tree produced by {@link MuteParser#genericOperation}.
	 * @param ctx the parse tree
	 */
	void enterGenericOperation(@NotNull MuteParser.GenericOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuteParser#genericOperation}.
	 * @param ctx the parse tree
	 */
	void exitGenericOperation(@NotNull MuteParser.GenericOperationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MuteParser#parenthezisedExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthezisedExpression(@NotNull MuteParser.ParenthezisedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuteParser#parenthezisedExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthezisedExpression(@NotNull MuteParser.ParenthezisedExpressionContext ctx);

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
	 * Enter a parse tree produced by {@link MuteParser#existenceCondition}.
	 * @param ctx the parse tree
	 */
	void enterExistenceCondition(@NotNull MuteParser.ExistenceConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuteParser#existenceCondition}.
	 * @param ctx the parse tree
	 */
	void exitExistenceCondition(@NotNull MuteParser.ExistenceConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MuteParser#numericAtom}.
	 * @param ctx the parse tree
	 */
	void enterNumericAtom(@NotNull MuteParser.NumericAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuteParser#numericAtom}.
	 * @param ctx the parse tree
	 */
	void exitNumericAtom(@NotNull MuteParser.NumericAtomContext ctx);

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
	 * Enter a parse tree produced by {@link MuteParser#genericCondition}.
	 * @param ctx the parse tree
	 */
	void enterGenericCondition(@NotNull MuteParser.GenericConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuteParser#genericCondition}.
	 * @param ctx the parse tree
	 */
	void exitGenericCondition(@NotNull MuteParser.GenericConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MuteParser#lValueWrapper}.
	 * @param ctx the parse tree
	 */
	void enterLValueWrapper(@NotNull MuteParser.LValueWrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuteParser#lValueWrapper}.
	 * @param ctx the parse tree
	 */
	void exitLValueWrapper(@NotNull MuteParser.LValueWrapperContext ctx);

	/**
	 * Enter a parse tree produced by {@link MuteParser#binaryNumericExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryNumericExpression(@NotNull MuteParser.BinaryNumericExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuteParser#binaryNumericExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryNumericExpression(@NotNull MuteParser.BinaryNumericExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MuteParser#binaryStringExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryStringExpression(@NotNull MuteParser.BinaryStringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuteParser#binaryStringExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryStringExpression(@NotNull MuteParser.BinaryStringExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MuteParser#assignmentStatementPart}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatementPart(@NotNull MuteParser.AssignmentStatementPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuteParser#assignmentStatementPart}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatementPart(@NotNull MuteParser.AssignmentStatementPartContext ctx);

	/**
	 * Enter a parse tree produced by {@link MuteParser#assignmentOperation}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperation(@NotNull MuteParser.AssignmentOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuteParser#assignmentOperation}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperation(@NotNull MuteParser.AssignmentOperationContext ctx);

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
}