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
		T__10=1, T__9=2, T__8=3, T__7=4, T__6=5, T__5=6, T__4=7, T__3=8, T__2=9, 
		T__1=10, T__0=11, ID=12, VALUE=13, COMMENT=14, EOL=15, WHITESPACE=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'>'", "'{'", "')'", "'.'", "','", "'['", "'('", "':'", "'<'", 
		"'}'", "ID", "VALUE", "COMMENT", "EOL", "WHITESPACE"
	};
	public static final String[] ruleNames = {
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "ID", "VALUE", "STRING", "CHARACTER", "INT", "FLOAT", 
		"ID_LETTER", "DIGIT", "COMMENT", "EOL", "WHITESPACE"
	};


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
		case 19: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 21: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\22\u0096\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\r\7\rI\n\r\f\r\16\rL\13\r\3\r\5\rO\n\r\3\16\3\16\3\16"+
		"\5\16T\n\16\3\17\3\17\7\17X\n\17\f\17\16\17[\13\17\3\17\3\17\3\20\3\20"+
		"\3\21\6\21b\n\21\r\21\16\21c\3\22\6\22g\n\22\r\22\16\22h\3\22\3\22\7\22"+
		"m\n\22\f\22\16\22p\13\22\3\22\3\22\6\22t\n\22\r\22\16\22u\5\22x\n\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\7\25\u0080\n\25\f\25\16\25\u0083\13\25\3"+
		"\25\3\25\3\25\3\25\3\26\5\26\u008a\n\26\3\26\3\26\5\26\u008e\n\26\3\27"+
		"\6\27\u0091\n\27\r\27\16\27\u0092\3\27\3\27\4Y\u0081\30\3\3\1\5\4\1\7"+
		"\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33"+
		"\17\1\35\2\1\37\2\1!\2\1#\2\1%\2\1\'\2\1)\20\2+\21\1-\22\3\3\2\6\4\2\f"+
		"\f\17\17\5\2C\\aac|\3\2\62;\4\2\13\13\"\"\u009e\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\63\3\2"+
		"\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r9\3\2\2\2\17;\3\2\2\2\21=\3\2\2\2\23"+
		"?\3\2\2\2\25A\3\2\2\2\27C\3\2\2\2\31N\3\2\2\2\33S\3\2\2\2\35U\3\2\2\2"+
		"\37^\3\2\2\2!a\3\2\2\2#w\3\2\2\2%y\3\2\2\2\'{\3\2\2\2)}\3\2\2\2+\u008d"+
		"\3\2\2\2-\u0090\3\2\2\2/\60\7_\2\2\60\4\3\2\2\2\61\62\7@\2\2\62\6\3\2"+
		"\2\2\63\64\7}\2\2\64\b\3\2\2\2\65\66\7+\2\2\66\n\3\2\2\2\678\7\60\2\2"+
		"8\f\3\2\2\29:\7.\2\2:\16\3\2\2\2;<\7]\2\2<\20\3\2\2\2=>\7*\2\2>\22\3\2"+
		"\2\2?@\7<\2\2@\24\3\2\2\2AB\7>\2\2B\26\3\2\2\2CD\7\177\2\2D\30\3\2\2\2"+
		"EJ\5%\23\2FI\5%\23\2GI\5\'\24\2HF\3\2\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2"+
		"\2JK\3\2\2\2KO\3\2\2\2LJ\3\2\2\2MO\7&\2\2NE\3\2\2\2NM\3\2\2\2O\32\3\2"+
		"\2\2PT\5\35\17\2QT\5!\21\2RT\5#\22\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T\34"+
		"\3\2\2\2UY\7$\2\2VX\5\37\20\2WV\3\2\2\2X[\3\2\2\2YZ\3\2\2\2YW\3\2\2\2"+
		"Z\\\3\2\2\2[Y\3\2\2\2\\]\7$\2\2]\36\3\2\2\2^_\n\2\2\2_ \3\2\2\2`b\5\'"+
		"\24\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\"\3\2\2\2eg\5\'\24\2fe"+
		"\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2\2jn\7\60\2\2km\5\'\24\2"+
		"lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2ox\3\2\2\2pn\3\2\2\2qs\7\60\2"+
		"\2rt\5\'\24\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wf\3\2"+
		"\2\2wq\3\2\2\2x$\3\2\2\2yz\t\3\2\2z&\3\2\2\2{|\t\4\2\2|(\3\2\2\2}\u0081"+
		"\7%\2\2~\u0080\13\2\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\u0082\3"+
		"\2\2\2\u0081\177\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084"+
		"\u0085\5+\26\2\u0085\u0086\3\2\2\2\u0086\u0087\b\25\2\2\u0087*\3\2\2\2"+
		"\u0088\u008a\7\17\2\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008e\7\f\2\2\u008c\u008e\7\17\2\2\u008d\u0089\3\2\2\2"+
		"\u008d\u008c\3\2\2\2\u008e,\3\2\2\2\u008f\u0091\t\5\2\2\u0090\u008f\3"+
		"\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0095\b\27\3\2\u0095.\3\2\2\2\21\2HJNSYchnuw\u0081"+
		"\u0089\u008d\u0092";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}