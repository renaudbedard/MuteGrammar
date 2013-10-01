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
		RULE_rValueExpression = 8;
	public static final String[] ruleNames = {
		"parse", "statement", "statementPart", "operation", "condition", "assignmentList", 
		"assignment", "lValueExpression", "rValueExpression"
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
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18); statement();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODULE) | (1L << ID) | (1L << OPERATION_BEGIN) | (1L << CONDITION_BEGIN) | (1L << ASSIGNMENT_BEGIN))) != 0) );
			setState(23); match(EOF);
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
			setState(43);
			switch (_input.LA(1)) {
			case MODULE:
				enterOuterAlt(_localctx, 1);
				{
				setState(25); match(MODULE);
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(26); statementPart();
					}
					}
					setState(29); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPERATION_BEGIN) | (1L << CONDITION_BEGIN) | (1L << ASSIGNMENT_BEGIN))) != 0) );
				setState(31); match(EOL);
				}
				break;
			case ID:
			case OPERATION_BEGIN:
			case CONDITION_BEGIN:
			case ASSIGNMENT_BEGIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(33); match(ID);
					}
				}

				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(36); statementPart();
					}
					}
					setState(39); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPERATION_BEGIN) | (1L << CONDITION_BEGIN) | (1L << ASSIGNMENT_BEGIN))) != 0) );
				setState(41); match(EOL);
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
			setState(48);
			switch (_input.LA(1)) {
			case ASSIGNMENT_BEGIN:
				_localctx = new AssignmentStatementPartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(45); assignmentList();
				}
				break;
			case OPERATION_BEGIN:
				_localctx = new OperationStatementPartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(46); operation();
				}
				break;
			case CONDITION_BEGIN:
				_localctx = new ConditionStatementPartContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(47); condition();
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
			setState(59);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new AssignmentOperationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(50); match(OPERATION_BEGIN);
				setState(51); lValueExpression(0);
				setState(52); assignmentList();
				setState(53); match(12);
				}
				break;

			case 2:
				_localctx = new GenericOperationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55); match(OPERATION_BEGIN);
				setState(56); rValueExpression(0);
				setState(57); match(12);
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
			setState(71);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61); match(CONDITION_BEGIN);
				setState(62); rValueExpression(0);
				setState(63); match(COMP_OPERATOR);
				setState(64); rValueExpression(0);
				setState(65); match(4);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67); match(CONDITION_BEGIN);
				setState(68); lValueExpression(0);
				setState(69); match(4);
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
			setState(73); match(ASSIGNMENT_BEGIN);
			setState(74); assignment();
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(75); match(5);
					setState(76); assignment();
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(82); match(1);
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
		public TerminalNode INT() { return getToken(MuteParser.INT, 0); }
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
		int _la;
		try {
			setState(88);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(85); match(9);
				setState(86); rValueExpression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87); rValueExpression(0);
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
			setState(91); match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(98);
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
					setState(93);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(94); match(3);
					setState(95);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==INT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(100);
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
	public static class RangeContext extends RValueExpressionContext {
		public RValueExpressionContext rValueExpression(int i) {
			return getRuleContext(RValueExpressionContext.class,i);
		}
		public List<RValueExpressionContext> rValueExpression() {
			return getRuleContexts(RValueExpressionContext.class);
		}
		public RangeContext(RValueExpressionContext ctx) { copyFrom(ctx); }
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
			setState(122);
			switch (_input.LA(1)) {
			case 8:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(102); match(8);
				setState(103); rValueExpression(9);
				}
				break;
			case MODULE:
			case ID:
				{
				_localctx = new LValueWrapperContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				_la = _input.LA(1);
				if (_la==MODULE) {
					{
					setState(104); match(MODULE);
					setState(105); match(3);
					}
				}

				setState(108); lValueExpression(0);
				}
				break;
			case STRING:
				{
				_localctx = new StringExpansionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109); match(STRING);
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=1 && _alt!=-1 ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(110); match(5);
						setState(111); rValueExpression(0);
						}
						} 
					}
					setState(116);
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
				setState(117); match(INT);
				}
				break;
			case CONDITION_BEGIN:
				{
				_localctx = new ParenthezisedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118); match(CONDITION_BEGIN);
				setState(119); rValueExpression(0);
				setState(120); match(4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(136);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryNumericExpressionContext(new RValueExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_rValueExpression);
						setState(124);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(125);
						_la = _input.LA(1);
						if ( !(_la==7 || _la==10) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(126); rValueExpression(9);
						}
						break;

					case 2:
						{
						_localctx = new BinaryNumericExpressionContext(new RValueExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_rValueExpression);
						setState(127);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(128);
						_la = _input.LA(1);
						if ( !(_la==6 || _la==8) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(129); rValueExpression(8);
						}
						break;

					case 3:
						{
						_localctx = new BinaryStringExpressionContext(new RValueExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_rValueExpression);
						setState(130);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(131);
						_la = _input.LA(1);
						if ( !(_la==2 || _la==13) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(132); rValueExpression(7);
						}
						break;

					case 4:
						{
						_localctx = new RangeContext(new RValueExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_rValueExpression);
						setState(133);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(134); match(11);
						setState(135); rValueExpression(3);
						}
						break;
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7: return lValueExpression_sempred((LValueExpressionContext)_localctx, predIndex);

		case 8: return rValueExpression_sempred((RValueExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean rValueExpression_sempred(RValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 8 >= _localctx._p;

		case 2: return 7 >= _localctx._p;

		case 3: return 6 >= _localctx._p;

		case 4: return 2 >= _localctx._p;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\33\u0090\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6"+
		"\2\26\n\2\r\2\16\2\27\3\2\3\2\3\3\3\3\6\3\36\n\3\r\3\16\3\37\3\3\3\3\3"+
		"\3\5\3%\n\3\3\3\6\3(\n\3\r\3\16\3)\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\5\4\63"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5>\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6J\n\6\3\7\3\7\3\7\3\7\7\7P\n\7\f\7\16\7S\13\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\5\b[\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7\tc\n\t\f\t"+
		"\16\tf\13\t\3\n\3\n\3\n\3\n\3\n\5\nm\n\n\3\n\3\n\3\n\3\n\7\ns\n\n\f\n"+
		"\16\nv\13\n\3\n\3\n\3\n\3\n\3\n\5\n}\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\7\n\u008b\n\n\f\n\16\n\u008e\13\n\3\n\4Qt\13\2\4\6"+
		"\b\n\f\16\20\22\2\6\3\2\23\24\4\2\t\t\f\f\4\2\b\b\n\n\4\2\4\4\17\17\u009c"+
		"\2\25\3\2\2\2\4-\3\2\2\2\6\62\3\2\2\2\b=\3\2\2\2\nI\3\2\2\2\fK\3\2\2\2"+
		"\16Z\3\2\2\2\20\\\3\2\2\2\22|\3\2\2\2\24\26\5\4\3\2\25\24\3\2\2\2\26\27"+
		"\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\31\3\2\2\2\31\32\7\2\2\3\32\3"+
		"\3\2\2\2\33\35\7\22\2\2\34\36\5\6\4\2\35\34\3\2\2\2\36\37\3\2\2\2\37\35"+
		"\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\7\32\2\2\".\3\2\2\2#%\7\23\2\2$#\3\2"+
		"\2\2$%\3\2\2\2%\'\3\2\2\2&(\5\6\4\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*"+
		"\3\2\2\2*+\3\2\2\2+,\7\32\2\2,.\3\2\2\2-\33\3\2\2\2-$\3\2\2\2.\5\3\2\2"+
		"\2/\63\5\f\7\2\60\63\5\b\5\2\61\63\5\n\6\2\62/\3\2\2\2\62\60\3\2\2\2\62"+
		"\61\3\2\2\2\63\7\3\2\2\2\64\65\7\26\2\2\65\66\5\20\t\2\66\67\5\f\7\2\67"+
		"8\7\16\2\28>\3\2\2\29:\7\26\2\2:;\5\22\n\2;<\7\16\2\2<>\3\2\2\2=\64\3"+
		"\2\2\2=9\3\2\2\2>\t\3\2\2\2?@\7\27\2\2@A\5\22\n\2AB\7\25\2\2BC\5\22\n"+
		"\2CD\7\6\2\2DJ\3\2\2\2EF\7\27\2\2FG\5\20\t\2GH\7\6\2\2HJ\3\2\2\2I?\3\2"+
		"\2\2IE\3\2\2\2J\13\3\2\2\2KL\7\30\2\2LQ\5\16\b\2MN\7\7\2\2NP\5\16\b\2"+
		"OM\3\2\2\2PS\3\2\2\2QR\3\2\2\2QO\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7\3\2\2"+
		"U\r\3\2\2\2VW\t\2\2\2WX\7\13\2\2X[\5\22\n\2Y[\5\22\n\2ZV\3\2\2\2ZY\3\2"+
		"\2\2[\17\3\2\2\2\\]\b\t\1\2]^\7\23\2\2^d\3\2\2\2_`\6\t\2\3`a\7\5\2\2a"+
		"c\t\2\2\2b_\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\21\3\2\2\2fd\3\2\2"+
		"\2gh\b\n\1\2hi\7\n\2\2i}\5\22\n\2jk\7\22\2\2km\7\5\2\2lj\3\2\2\2lm\3\2"+
		"\2\2mn\3\2\2\2n}\5\20\t\2ot\7\21\2\2pq\7\7\2\2qs\5\22\n\2rp\3\2\2\2sv"+
		"\3\2\2\2tu\3\2\2\2tr\3\2\2\2u}\3\2\2\2vt\3\2\2\2w}\7\24\2\2xy\7\27\2\2"+
		"yz\5\22\n\2z{\7\6\2\2{}\3\2\2\2|g\3\2\2\2|l\3\2\2\2|o\3\2\2\2|w\3\2\2"+
		"\2|x\3\2\2\2}\u008c\3\2\2\2~\177\6\n\3\3\177\u0080\t\3\2\2\u0080\u008b"+
		"\5\22\n\2\u0081\u0082\6\n\4\3\u0082\u0083\t\4\2\2\u0083\u008b\5\22\n\2"+
		"\u0084\u0085\6\n\5\3\u0085\u0086\t\5\2\2\u0086\u008b\5\22\n\2\u0087\u0088"+
		"\6\n\6\3\u0088\u0089\7\r\2\2\u0089\u008b\5\22\n\2\u008a~\3\2\2\2\u008a"+
		"\u0081\3\2\2\2\u008a\u0084\3\2\2\2\u008a\u0087\3\2\2\2\u008b\u008e\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\23\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\22\27\37$)-\62=IQZdlt|\u008a\u008c";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}