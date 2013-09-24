// Generated from Mute.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MuteParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, COMMENT=14, STRING=15, MODULE=16, 
		ID=17, INT=18, COMP_OPERATOR=19, OPERATION_BEGIN=20, CONDITION_BEGIN=21, 
		ASSIGNMENT_BEGIN=22, IGNORED_EOL=23, EOL=24, WHITESPACE=25;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'&'", "'.'", "')'", "','", "'+'", "'*'", "'-'", "':'", 
		"'/'", "'~'", "'}'", "'|'", "COMMENT", "STRING", "MODULE", "ID", "INT", 
		"COMP_OPERATOR", "'{'", "'('", "'['", "IGNORED_EOL", "EOL", "WHITESPACE"
	};
	public static final int
		RULE_parse = 0, RULE_statement = 1, RULE_statementPart = 2, RULE_operation = 3, 
		RULE_condition = 4, RULE_assignmentList = 5, RULE_assignment = 6, RULE_lValueExpression = 7, 
		RULE_rValueExpression = 8, RULE_range = 9;
	public static final String[] ruleNames = {
		"parse", "statement", "statementPart", "operation", "condition", "assignmentList", 
		"assignment", "lValueExpression", "rValueExpression", "range"
	};

	@Override
	public String getGrammarFileName() { return "Mute.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public MuteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode EOF() { return getToken(MuteParser.EOF, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuteVisitor ) return ((MuteVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20); statement();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODULE) | (1L << ID) | (1L << OPERATION_BEGIN) | (1L << CONDITION_BEGIN) | (1L << ASSIGNMENT_BEGIN))) != 0) );
			setState(25); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(MuteParser.MODULE, 0); }
		public StatementPartContext statementPart(int i) {
			return getRuleContext(StatementPartContext.class,i);
		}
		public TerminalNode EOL() { return getToken(MuteParser.EOL, 0); }
		public TerminalNode ID() { return getToken(MuteParser.ID, 0); }
		public List<StatementPartContext> statementPart() {
			return getRuleContexts(StatementPartContext.class);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuteVisitor ) return ((MuteVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(45);
			switch (_input.LA(1)) {
			case MODULE:
				enterOuterAlt(_localctx, 1);
				{
				setState(27); match(MODULE);
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(28); statementPart();
					}
					}
					setState(31); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPERATION_BEGIN) | (1L << CONDITION_BEGIN) | (1L << ASSIGNMENT_BEGIN))) != 0) );
				setState(33); match(EOL);
				}
				break;
			case ID:
			case OPERATION_BEGIN:
			case CONDITION_BEGIN:
			case ASSIGNMENT_BEGIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(35); match(ID);
					}
				}

				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(38); statementPart();
					}
					}
					setState(41); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPERATION_BEGIN) | (1L << CONDITION_BEGIN) | (1L << ASSIGNMENT_BEGIN))) != 0) );
				setState(43); match(EOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementPartContext extends ParserRuleContext {
		public StatementPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementPart; }
	 
		public StatementPartContext() { }
		public void copyFrom(StatementPartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionStatementPartContext extends StatementPartContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConditionStatementPartContext(StatementPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).enterConditionStatementPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).exitConditionStatementPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuteVisitor ) return ((MuteVisitor<? extends T>)visitor).visitConditionStatementPart(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentStatementPartContext extends StatementPartContext {
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public AssignmentStatementPartContext(StatementPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).enterAssignmentStatementPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).exitAssignmentStatementPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuteVisitor ) return ((MuteVisitor<? extends T>)visitor).visitAssignmentStatementPart(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperationStatementPartContext extends StatementPartContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public OperationStatementPartContext(StatementPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).enterOperationStatementPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).exitOperationStatementPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuteVisitor ) return ((MuteVisitor<? extends T>)visitor).visitOperationStatementPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementPartContext statementPart() throws RecognitionException {
		StatementPartContext _localctx = new StatementPartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statementPart);
		try {
			setState(50);
			switch (_input.LA(1)) {
			case ASSIGNMENT_BEGIN:
				_localctx = new AssignmentStatementPartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(47); assignmentList();
				}
				break;
			case OPERATION_BEGIN:
				_localctx = new OperationStatementPartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(48); operation();
				}
				break;
			case CONDITION_BEGIN:
				_localctx = new ConditionStatementPartContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(49); condition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationContext extends ParserRuleContext {
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	 
		public OperationContext() { }
		public void copyFrom(OperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentOperationContext extends OperationContext {
		public TerminalNode OPERATION_BEGIN() { return getToken(MuteParser.OPERATION_BEGIN, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public LValueExpressionContext lValueExpression() {
			return getRuleContext(LValueExpressionContext.class,0);
		}
		public AssignmentOperationContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).enterAssignmentOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).exitAssignmentOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuteVisitor ) return ((MuteVisitor<? extends T>)visitor).visitAssignmentOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericOperationContext extends OperationContext {
		public TerminalNode OPERATION_BEGIN() { return getToken(MuteParser.OPERATION_BEGIN, 0); }
		public RValueExpressionContext rValueExpression() {
			return getRuleContext(RValueExpressionContext.class,0);
		}
		public GenericOperationContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).enterGenericOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).exitGenericOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuteVisitor ) return ((MuteVisitor<? extends T>)visitor).visitGenericOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operation);
		try {
			setState(61);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new AssignmentOperationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(52); match(OPERATION_BEGIN);
				setState(53); lValueExpression(0);
				setState(54); assignmentList();
				setState(55); match(12);
				}
				break;

			case 2:
				_localctx = new GenericOperationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(57); match(OPERATION_BEGIN);
				setState(58); rValueExpression(0);
				setState(59); match(12);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode COMP_OPERATOR() { return getToken(MuteParser.COMP_OPERATOR, 0); }
		public RValueExpressionContext rValueExpression(int i) {
			return getRuleContext(RValueExpressionContext.class,i);
		}
		public LValueExpressionContext lValueExpression() {
			return getRuleContext(LValueExpressionContext.class,0);
		}
		public TerminalNode CONDITION_BEGIN() { return getToken(MuteParser.CONDITION_BEGIN, 0); }
		public List<RValueExpressionContext> rValueExpression() {
			return getRuleContexts(RValueExpressionContext.class);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuteVisitor ) return ((MuteVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condition);
		try {
			setState(73);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63); match(CONDITION_BEGIN);
				setState(64); rValueExpression(0);
				setState(65); match(COMP_OPERATOR);
				setState(66); rValueExpression(0);
				setState(67); match(4);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69); match(CONDITION_BEGIN);
				setState(70); lValueExpression(0);
				setState(71); match(4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentListContext extends ParserRuleContext {
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public TerminalNode ASSIGNMENT_BEGIN() { return getToken(MuteParser.ASSIGNMENT_BEGIN, 0); }
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).enterAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).exitAssignmentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuteVisitor ) return ((MuteVisitor<? extends T>)visitor).visitAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignmentList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75); match(ASSIGNMENT_BEGIN);
			setState(76); assignment();
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(77); match(5);
					setState(78); assignment();
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(84); match(1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MuteParser.ID, 0); }
		public RValueExpressionContext rValueExpression() {
			return getRuleContext(RValueExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuteVisitor ) return ((MuteVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			setState(90);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86); match(ID);
				setState(87); match(9);
				setState(88); rValueExpression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89); rValueExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LValueExpressionContext extends ParserRuleContext {
		public int _p;
		public TerminalNode INT() { return getToken(MuteParser.INT, 0); }
		public TerminalNode ID() { return getToken(MuteParser.ID, 0); }
		public LValueExpressionContext lValueExpression() {
			return getRuleContext(LValueExpressionContext.class,0);
		}
		public LValueExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public LValueExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_lValueExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).enterLValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).exitLValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuteVisitor ) return ((MuteVisitor<? extends T>)visitor).visitLValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LValueExpressionContext lValueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LValueExpressionContext _localctx = new LValueExpressionContext(_ctx, _parentState, _p);
		LValueExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, RULE_lValueExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(93); match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LValueExpressionContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_lValueExpression);
					setState(95);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(96); match(3);
					setState(97);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==INT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RValueExpressionContext extends ParserRuleContext {
		public int _p;
		public RValueExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RValueExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_rValueExpression; }
	 
		public RValueExpressionContext() { }
		public void copyFrom(RValueExpressionContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class ParenthezisedExpressionContext extends RValueExpressionContext {
		public RValueExpressionContext rValueExpression() {
			return getRuleContext(RValueExpressionContext.class,0);
		}
		public ParenthezisedExpressionContext(RValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).enterParenthezisedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).exitParenthezisedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuteVisitor ) return ((MuteVisitor<? extends T>)visitor).visitParenthezisedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringExpansionContext extends RValueExpressionContext {
		public RValueExpressionContext rValueExpression(int i) {
			return getRuleContext(RValueExpressionContext.class,i);
		}
		public TerminalNode STRING() { return getToken(MuteParser.STRING, 0); }
		public List<RValueExpressionContext> rValueExpression() {
			return getRuleContexts(RValueExpressionContext.class);
		}
		public StringExpansionContext(RValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).enterStringExpansion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).exitStringExpansion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuteVisitor ) return ((MuteVisitor<? extends T>)visitor).visitStringExpansion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericAtomContext extends RValueExpressionContext {
		public TerminalNode INT() { return getToken(MuteParser.INT, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public NumericAtomContext(RValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).enterNumericAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).exitNumericAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuteVisitor ) return ((MuteVisitor<? extends T>)visitor).visitNumericAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LValueWrapperContext extends RValueExpressionContext {
		public TerminalNode MODULE() { return getToken(MuteParser.MODULE, 0); }
		public LValueExpressionContext lValueExpression() {
			return getRuleContext(LValueExpressionContext.class,0);
		}
		public LValueWrapperContext(RValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).enterLValueWrapper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).exitLValueWrapper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuteVisitor ) return ((MuteVisitor<? extends T>)visitor).visitLValueWrapper(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpressionContext extends RValueExpressionContext {
		public RValueExpressionContext rValueExpression() {
			return getRuleContext(RValueExpressionContext.class,0);
		}
		public UnaryExpressionContext(RValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuteVisitor ) return ((MuteVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryNumericExpressionContext extends RValueExpressionContext {
		public RValueExpressionContext rValueExpression(int i) {
			return getRuleContext(RValueExpressionContext.class,i);
		}
		public List<RValueExpressionContext> rValueExpression() {
			return getRuleContexts(RValueExpressionContext.class);
		}
		public BinaryNumericExpressionContext(RValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).enterBinaryNumericExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).exitBinaryNumericExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuteVisitor ) return ((MuteVisitor<? extends T>)visitor).visitBinaryNumericExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryStringExpressionContext extends RValueExpressionContext {
		public RValueExpressionContext rValueExpression(int i) {
			return getRuleContext(RValueExpressionContext.class,i);
		}
		public List<RValueExpressionContext> rValueExpression() {
			return getRuleContexts(RValueExpressionContext.class);
		}
		public BinaryStringExpressionContext(RValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).enterBinaryStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).exitBinaryStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuteVisitor ) return ((MuteVisitor<? extends T>)visitor).visitBinaryStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RValueExpressionContext rValueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RValueExpressionContext _localctx = new RValueExpressionContext(_ctx, _parentState, _p);
		RValueExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, RULE_rValueExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			switch (_input.LA(1)) {
			case 8:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(104); match(8);
				setState(105); rValueExpression(8);
				}
				break;
			case MODULE:
			case ID:
				{
				_localctx = new LValueWrapperContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				_la = _input.LA(1);
				if (_la==MODULE) {
					{
					setState(106); match(MODULE);
					setState(107); match(3);
					}
				}

				setState(110); lValueExpression(0);
				}
				break;
			case STRING:
				{
				_localctx = new StringExpansionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111); match(STRING);
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=1 && _alt!=-1 ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(112); match(5);
						setState(113); rValueExpression(0);
						}
						} 
					}
					setState(118);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				break;
			case INT:
				{
				_localctx = new NumericAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(119); match(INT);
					}
					break;

				case 2:
					{
					setState(120); range();
					}
					break;
				}
				}
				break;
			case CONDITION_BEGIN:
				{
				_localctx = new ParenthezisedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123); match(CONDITION_BEGIN);
				setState(124); rValueExpression(0);
				setState(125); match(4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(138);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryNumericExpressionContext(new RValueExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_rValueExpression);
						setState(129);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(130);
						_la = _input.LA(1);
						if ( !(_la==7 || _la==10) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(131); rValueExpression(8);
						}
						break;

					case 2:
						{
						_localctx = new BinaryNumericExpressionContext(new RValueExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_rValueExpression);
						setState(132);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(133);
						_la = _input.LA(1);
						if ( !(_la==6 || _la==8) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(134); rValueExpression(7);
						}
						break;

					case 3:
						{
						_localctx = new BinaryStringExpressionContext(new RValueExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_rValueExpression);
						setState(135);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(136);
						_la = _input.LA(1);
						if ( !(_la==2 || _la==13) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(137); rValueExpression(6);
						}
						break;
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RangeContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(MuteParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MuteParser.INT, i);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuteListener ) ((MuteListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuteVisitor ) return ((MuteVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); match(INT);
			setState(144); match(11);
			setState(145); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7: return lValueExpression_sempred((LValueExpressionContext)_localctx, predIndex);

		case 8: return rValueExpression_sempred((RValueExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean rValueExpression_sempred(RValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 7 >= _localctx._p;

		case 2: return 6 >= _localctx._p;

		case 3: return 5 >= _localctx._p;
		}
		return true;
	}
	private boolean lValueExpression_sempred(LValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 2 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\33\u0096\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\6\2\30\n\2\r\2\16\2\31\3\2\3\2\3\3\3\3\6\3 \n\3\r\3\16\3!\3"+
		"\3\3\3\3\3\5\3\'\n\3\3\3\6\3*\n\3\r\3\16\3+\3\3\3\3\5\3\60\n\3\3\4\3\4"+
		"\3\4\5\4\65\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5@\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6L\n\6\3\7\3\7\3\7\3\7\7\7R\n\7\f\7\16"+
		"\7U\13\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b]\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t"+
		"e\n\t\f\t\16\th\13\t\3\n\3\n\3\n\3\n\3\n\5\no\n\n\3\n\3\n\3\n\3\n\7\n"+
		"u\n\n\f\n\16\nx\13\n\3\n\3\n\5\n|\n\n\3\n\3\n\3\n\3\n\5\n\u0082\n\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u008d\n\n\f\n\16\n\u0090\13\n\3"+
		"\13\3\13\3\13\3\13\3\13\4Sv\f\2\4\6\b\n\f\16\20\22\24\2\6\3\2\23\24\4"+
		"\2\t\t\f\f\4\2\b\b\n\n\4\2\4\4\17\17\u00a1\2\27\3\2\2\2\4/\3\2\2\2\6\64"+
		"\3\2\2\2\b?\3\2\2\2\nK\3\2\2\2\fM\3\2\2\2\16\\\3\2\2\2\20^\3\2\2\2\22"+
		"\u0081\3\2\2\2\24\u0091\3\2\2\2\26\30\5\4\3\2\27\26\3\2\2\2\30\31\3\2"+
		"\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\33\3\2\2\2\33\34\7\2\2\3\34\3\3\2"+
		"\2\2\35\37\7\22\2\2\36 \5\6\4\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\""+
		"\3\2\2\2\"#\3\2\2\2#$\7\32\2\2$\60\3\2\2\2%\'\7\23\2\2&%\3\2\2\2&\'\3"+
		"\2\2\2\')\3\2\2\2(*\5\6\4\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,-"+
		"\3\2\2\2-.\7\32\2\2.\60\3\2\2\2/\35\3\2\2\2/&\3\2\2\2\60\5\3\2\2\2\61"+
		"\65\5\f\7\2\62\65\5\b\5\2\63\65\5\n\6\2\64\61\3\2\2\2\64\62\3\2\2\2\64"+
		"\63\3\2\2\2\65\7\3\2\2\2\66\67\7\26\2\2\678\5\20\t\289\5\f\7\29:\7\16"+
		"\2\2:@\3\2\2\2;<\7\26\2\2<=\5\22\n\2=>\7\16\2\2>@\3\2\2\2?\66\3\2\2\2"+
		"?;\3\2\2\2@\t\3\2\2\2AB\7\27\2\2BC\5\22\n\2CD\7\25\2\2DE\5\22\n\2EF\7"+
		"\6\2\2FL\3\2\2\2GH\7\27\2\2HI\5\20\t\2IJ\7\6\2\2JL\3\2\2\2KA\3\2\2\2K"+
		"G\3\2\2\2L\13\3\2\2\2MN\7\30\2\2NS\5\16\b\2OP\7\7\2\2PR\5\16\b\2QO\3\2"+
		"\2\2RU\3\2\2\2ST\3\2\2\2SQ\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\7\3\2\2W\r\3"+
		"\2\2\2XY\7\23\2\2YZ\7\13\2\2Z]\5\22\n\2[]\5\22\n\2\\X\3\2\2\2\\[\3\2\2"+
		"\2]\17\3\2\2\2^_\b\t\1\2_`\7\23\2\2`f\3\2\2\2ab\6\t\2\3bc\7\5\2\2ce\t"+
		"\2\2\2da\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\21\3\2\2\2hf\3\2\2\2i"+
		"j\b\n\1\2jk\7\n\2\2k\u0082\5\22\n\2lm\7\22\2\2mo\7\5\2\2nl\3\2\2\2no\3"+
		"\2\2\2op\3\2\2\2p\u0082\5\20\t\2qv\7\21\2\2rs\7\7\2\2su\5\22\n\2tr\3\2"+
		"\2\2ux\3\2\2\2vw\3\2\2\2vt\3\2\2\2w\u0082\3\2\2\2xv\3\2\2\2y|\7\24\2\2"+
		"z|\5\24\13\2{y\3\2\2\2{z\3\2\2\2|\u0082\3\2\2\2}~\7\27\2\2~\177\5\22\n"+
		"\2\177\u0080\7\6\2\2\u0080\u0082\3\2\2\2\u0081i\3\2\2\2\u0081n\3\2\2\2"+
		"\u0081q\3\2\2\2\u0081{\3\2\2\2\u0081}\3\2\2\2\u0082\u008e\3\2\2\2\u0083"+
		"\u0084\6\n\3\3\u0084\u0085\t\3\2\2\u0085\u008d\5\22\n\2\u0086\u0087\6"+
		"\n\4\3\u0087\u0088\t\4\2\2\u0088\u008d\5\22\n\2\u0089\u008a\6\n\5\3\u008a"+
		"\u008b\t\5\2\2\u008b\u008d\5\22\n\2\u008c\u0083\3\2\2\2\u008c\u0086\3"+
		"\2\2\2\u008c\u0089\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\23\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\24\2"+
		"\2\u0092\u0093\7\r\2\2\u0093\u0094\7\24\2\2\u0094\25\3\2\2\2\23\31!&+"+
		"/\64?KS\\fnv{\u0081\u008c\u008e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}