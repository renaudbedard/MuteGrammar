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
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		ID=10, VALUE=11, MODULE=12, OPERATOR=13, COMMENT=14, WHITESPACE=15, EOL=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'{'", "')'", "'.'", "','", "'['", "'('", "':'", "'}'", "ID", "VALUE", 
		"MODULE", "OPERATOR", "COMMENT", "WHITESPACE", "EOL"
	};
	public static final String[] ruleNames = {
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"ID", "VALUE", "MODULE", "OPERATOR", "STRING", "CHARACTER", "INT", "FLOAT", 
		"RANGE", "ID_LETTER", "DIGIT", "COMMENT", "WHITESPACE", "EOL"
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
		case 20: COMMENT_action((RuleContext)_localctx, actionIndex); break;

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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\22\u00ad\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\7\13G\n\13\f\13\16\13J\13\13\3\13\5\13M\n\13\3\f\3\f\3\f"+
		"\3\f\5\fS\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16a\n\16\3\17\3\17\7\17e\n\17\f\17\16\17h\13\17\3\17\3\17\3\20\3\20"+
		"\3\21\6\21o\n\21\r\21\16\21p\3\22\6\22t\n\22\r\22\16\22u\3\22\3\22\7\22"+
		"z\n\22\f\22\16\22}\13\22\3\22\3\22\6\22\u0081\n\22\r\22\16\22\u0082\5"+
		"\22\u0085\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u008f\n\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\7\26\u0097\n\26\f\26\16\26\u009a\13\26"+
		"\3\26\3\26\3\26\3\26\3\27\6\27\u00a1\n\27\r\27\16\27\u00a2\3\27\3\27\3"+
		"\30\5\30\u00a8\n\30\3\30\3\30\5\30\u00ac\n\30\4f\u0098\31\3\3\1\5\4\1"+
		"\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1"+
		"\33\17\1\35\2\1\37\2\1!\2\1#\2\1%\2\1\'\2\1)\2\1+\20\2-\21\3/\22\1\3\2"+
		"\6\4\2\f\f\17\17\5\2C\\aac|\3\2\62;\4\2\13\13\"\"\u00ba\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2"+
		"\7\65\3\2\2\2\t\67\3\2\2\2\139\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21?\3\2"+
		"\2\2\23A\3\2\2\2\25L\3\2\2\2\27R\3\2\2\2\31T\3\2\2\2\33`\3\2\2\2\35b\3"+
		"\2\2\2\37k\3\2\2\2!n\3\2\2\2#\u0084\3\2\2\2%\u008e\3\2\2\2\'\u0090\3\2"+
		"\2\2)\u0092\3\2\2\2+\u0094\3\2\2\2-\u00a0\3\2\2\2/\u00ab\3\2\2\2\61\62"+
		"\7_\2\2\62\4\3\2\2\2\63\64\7}\2\2\64\6\3\2\2\2\65\66\7+\2\2\66\b\3\2\2"+
		"\2\678\7\60\2\28\n\3\2\2\29:\7.\2\2:\f\3\2\2\2;<\7]\2\2<\16\3\2\2\2=>"+
		"\7*\2\2>\20\3\2\2\2?@\7<\2\2@\22\3\2\2\2AB\7\177\2\2B\24\3\2\2\2CH\5\'"+
		"\24\2DG\5\'\24\2EG\5)\25\2FD\3\2\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3"+
		"\2\2\2IM\3\2\2\2JH\3\2\2\2KM\7&\2\2LC\3\2\2\2LK\3\2\2\2M\26\3\2\2\2NS"+
		"\5\35\17\2OS\5!\21\2PS\5#\22\2QS\5%\23\2RN\3\2\2\2RO\3\2\2\2RP\3\2\2\2"+
		"RQ\3\2\2\2S\30\3\2\2\2TU\7>\2\2UV\5\25\13\2VW\7@\2\2W\32\3\2\2\2XY\7@"+
		"\2\2Ya\7?\2\2Za\7@\2\2[\\\7>\2\2\\a\7?\2\2]a\7>\2\2^_\7?\2\2_a\7?\2\2"+
		"`X\3\2\2\2`Z\3\2\2\2`[\3\2\2\2`]\3\2\2\2`^\3\2\2\2a\34\3\2\2\2bf\7$\2"+
		"\2ce\5\37\20\2dc\3\2\2\2eh\3\2\2\2fg\3\2\2\2fd\3\2\2\2gi\3\2\2\2hf\3\2"+
		"\2\2ij\7$\2\2j\36\3\2\2\2kl\n\2\2\2l \3\2\2\2mo\5)\25\2nm\3\2\2\2op\3"+
		"\2\2\2pn\3\2\2\2pq\3\2\2\2q\"\3\2\2\2rt\5)\25\2sr\3\2\2\2tu\3\2\2\2us"+
		"\3\2\2\2uv\3\2\2\2vw\3\2\2\2w{\7\60\2\2xz\5)\25\2yx\3\2\2\2z}\3\2\2\2"+
		"{y\3\2\2\2{|\3\2\2\2|\u0085\3\2\2\2}{\3\2\2\2~\u0080\7\60\2\2\177\u0081"+
		"\5)\25\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084s\3\2\2\2\u0084~\3\2\2\2\u0085"+
		"$\3\2\2\2\u0086\u0087\5!\21\2\u0087\u0088\7\u0080\2\2\u0088\u0089\5!\21"+
		"\2\u0089\u008f\3\2\2\2\u008a\u008b\5#\22\2\u008b\u008c\7\u0080\2\2\u008c"+
		"\u008d\5#\22\2\u008d\u008f\3\2\2\2\u008e\u0086\3\2\2\2\u008e\u008a\3\2"+
		"\2\2\u008f&\3\2\2\2\u0090\u0091\t\3\2\2\u0091(\3\2\2\2\u0092\u0093\t\4"+
		"\2\2\u0093*\3\2\2\2\u0094\u0098\7%\2\2\u0095\u0097\13\2\2\2\u0096\u0095"+
		"\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\5/\30\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009e\b\26\2\2\u009e,\3\2\2\2\u009f\u00a1\t\5\2\2\u00a0\u009f"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a5\b\27\3\2\u00a5.\3\2\2\2\u00a6\u00a8\7\17\2"+
		"\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ac"+
		"\7\f\2\2\u00aa\u00ac\7\17\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00aa\3\2\2\2"+
		"\u00ac\60\3\2\2\2\23\2FHLR`fpu{\u0082\u0084\u008e\u0098\u00a2\u00a7\u00ab";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}