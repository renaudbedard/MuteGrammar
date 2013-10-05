// Generated from Mute.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MuteLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__14=1, T__13=2, T__12=3, T__11=4, T__10=5, T__9=6, T__8=7, T__7=8, T__6=9, 
		T__5=10, T__4=11, T__3=12, T__2=13, T__1=14, T__0=15, COMMENT=16, STRING=17, 
		MODULE=18, ID=19, INT=20, COMP_OPERATOR=21, OPERATION_BEGIN=22, CONDITION_BEGIN=23, 
		ASSIGNMENT_BEGIN=24, IGNORED_EOL=25, EOL=26, WHITESPACE=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'%'", "']'", "'^'", "'&'", "'.'", "')'", "','", "'+'", "'*'", "'-'", 
		"':'", "'/'", "'~'", "'}'", "'|'", "COMMENT", "STRING", "MODULE", "ID", 
		"INT", "COMP_OPERATOR", "'{'", "'('", "'['", "IGNORED_EOL", "EOL", "WHITESPACE"
	};
	public static final String[] ruleNames = {
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "COMMENT", "STRING", "MODULE", 
		"ID", "INT", "COMP_OPERATOR", "OPERATION_BEGIN", "CONDITION_BEGIN", "ASSIGNMENT_BEGIN", 
		"CHARACTER", "ID_LETTER", "DIGIT", "IGNORED_EOL", "EOL", "WHITESPACE"
	};


		boolean inStatement = false;


	public MuteLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mute.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 15: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 17: MODULE_action((RuleContext)_localctx, actionIndex); break;

		case 18: ID_action((RuleContext)_localctx, actionIndex); break;

		case 21: OPERATION_BEGIN_action((RuleContext)_localctx, actionIndex); break;

		case 22: CONDITION_BEGIN_action((RuleContext)_localctx, actionIndex); break;

		case 23: ASSIGNMENT_BEGIN_action((RuleContext)_localctx, actionIndex); break;

		case 27: IGNORED_EOL_action((RuleContext)_localctx, actionIndex); break;

		case 28: EOL_action((RuleContext)_localctx, actionIndex); break;

		case 29: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8: skip();  break;
		}
	}
	private void OPERATION_BEGIN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: inStatement = true; break;
		}
	}
	private void EOL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: inStatement = false; break;
		}
	}
	private void CONDITION_BEGIN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: inStatement = true; break;
		}
	}
	private void ASSIGNMENT_BEGIN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: inStatement = true; break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: inStatement = true; break;
		}
	}
	private void MODULE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: inStatement = true; break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: skip();  break;
		}
	}
	private void IGNORED_EOL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: skip();  break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 27: return IGNORED_EOL_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean IGNORED_EOL_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return !inStatement;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\35\u00b4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\7\21"+
		"`\n\21\f\21\16\21c\13\21\3\21\3\21\3\22\3\22\7\22i\n\22\f\22\16\22l\13"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\7\24x\n\24\f\24"+
		"\16\24{\13\24\3\24\5\24~\n\24\3\24\3\24\3\25\6\25\u0083\n\25\r\25\16\25"+
		"\u0084\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u008d\n\26\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\5\35\u009f"+
		"\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\5\36\u00a8\n\36\3\36\3\36\3\36"+
		"\3\36\3\37\6\37\u00af\n\37\r\37\16\37\u00b0\3\37\3\37\3j \3\3\1\5\4\1"+
		"\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1"+
		"\33\17\1\35\20\1\37\21\1!\22\b#\23\1%\24\2\'\25\3)\26\1+\27\1-\30\4/\31"+
		"\5\61\32\6\63\2\1\65\2\1\67\2\19\33\t;\34\7=\35\n\3\2\6\4\2\f\f\17\17"+
		"\5\2C\\aac|\3\2\62;\4\2\13\13\"\"\u00bc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7C\3\2\2\2\tE\3\2\2\2\13G\3\2"+
		"\2\2\rI\3\2\2\2\17K\3\2\2\2\21M\3\2\2\2\23O\3\2\2\2\25Q\3\2\2\2\27S\3"+
		"\2\2\2\31U\3\2\2\2\33W\3\2\2\2\35Y\3\2\2\2\37[\3\2\2\2!]\3\2\2\2#f\3\2"+
		"\2\2%o\3\2\2\2\'}\3\2\2\2)\u0082\3\2\2\2+\u008c\3\2\2\2-\u008e\3\2\2\2"+
		"/\u0091\3\2\2\2\61\u0094\3\2\2\2\63\u0097\3\2\2\2\65\u0099\3\2\2\2\67"+
		"\u009b\3\2\2\29\u009e\3\2\2\2;\u00a7\3\2\2\2=\u00ae\3\2\2\2?@\7\'\2\2"+
		"@\4\3\2\2\2AB\7_\2\2B\6\3\2\2\2CD\7`\2\2D\b\3\2\2\2EF\7(\2\2F\n\3\2\2"+
		"\2GH\7\60\2\2H\f\3\2\2\2IJ\7+\2\2J\16\3\2\2\2KL\7.\2\2L\20\3\2\2\2MN\7"+
		"-\2\2N\22\3\2\2\2OP\7,\2\2P\24\3\2\2\2QR\7/\2\2R\26\3\2\2\2ST\7<\2\2T"+
		"\30\3\2\2\2UV\7\61\2\2V\32\3\2\2\2WX\7\u0080\2\2X\34\3\2\2\2YZ\7\177\2"+
		"\2Z\36\3\2\2\2[\\\7~\2\2\\ \3\2\2\2]a\7%\2\2^`\n\2\2\2_^\3\2\2\2`c\3\2"+
		"\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\b\21\b\2e\"\3\2\2\2fj\7"+
		"$\2\2gi\5\63\32\2hg\3\2\2\2il\3\2\2\2jk\3\2\2\2jh\3\2\2\2km\3\2\2\2lj"+
		"\3\2\2\2mn\7$\2\2n$\3\2\2\2op\7>\2\2pq\5\'\24\2qr\7@\2\2rs\b\23\2\2s&"+
		"\3\2\2\2ty\5\65\33\2ux\5\65\33\2vx\5\67\34\2wu\3\2\2\2wv\3\2\2\2x{\3\2"+
		"\2\2yw\3\2\2\2yz\3\2\2\2z~\3\2\2\2{y\3\2\2\2|~\7&\2\2}t\3\2\2\2}|\3\2"+
		"\2\2~\177\3\2\2\2\177\u0080\b\24\3\2\u0080(\3\2\2\2\u0081\u0083\5\67\34"+
		"\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085*\3\2\2\2\u0086\u0087\7@\2\2\u0087\u008d\7?\2\2\u0088\u008d"+
		"\7@\2\2\u0089\u008a\7>\2\2\u008a\u008d\7?\2\2\u008b\u008d\4>?\2\u008c"+
		"\u0086\3\2\2\2\u008c\u0088\3\2\2\2\u008c\u0089\3\2\2\2\u008c\u008b\3\2"+
		"\2\2\u008d,\3\2\2\2\u008e\u008f\7}\2\2\u008f\u0090\b\27\4\2\u0090.\3\2"+
		"\2\2\u0091\u0092\7*\2\2\u0092\u0093\b\30\5\2\u0093\60\3\2\2\2\u0094\u0095"+
		"\7]\2\2\u0095\u0096\b\31\6\2\u0096\62\3\2\2\2\u0097\u0098\n\2\2\2\u0098"+
		"\64\3\2\2\2\u0099\u009a\t\3\2\2\u009a\66\3\2\2\2\u009b\u009c\t\4\2\2\u009c"+
		"8\3\2\2\2\u009d\u009f\7\17\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2"+
		"\u009f\u00a0\3\2\2\2\u00a0\u00a1\7\f\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3"+
		"\6\35\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\b\35\t\2\u00a5:\3\2\2\2\u00a6"+
		"\u00a8\7\17\2\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3"+
		"\2\2\2\u00a9\u00aa\7\f\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\b\36\7\2\u00ac"+
		"<\3\2\2\2\u00ad\u00af\t\5\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2"+
		"\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3"+
		"\b\37\n\2\u00b3>\3\2\2\2\r\2ajwy}\u0084\u008c\u009e\u00a7\u00b0";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}