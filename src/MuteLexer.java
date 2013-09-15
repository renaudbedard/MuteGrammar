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
		COMMENT=10, STRING=11, MODULE=12, ID=13, RANGE=14, INT=15, CALC_OPERATOR=16, 
		COMP_OPERATOR=17, EOL=18, WHITESPACE=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'{'", "')'", "'.'", "','", "'['", "'('", "':'", "'}'", "COMMENT", 
		"STRING", "MODULE", "ID", "RANGE", "INT", "CALC_OPERATOR", "COMP_OPERATOR", 
		"EOL", "WHITESPACE"
	};
	public static final String[] ruleNames = {
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"COMMENT", "STRING", "MODULE", "ID", "RANGE", "INT", "CALC_OPERATOR", 
		"COMP_OPERATOR", "CHARACTER", "ID_LETTER", "DIGIT", "EOL", "WHITESPACE"
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
		case 9: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 20: EOL_action((RuleContext)_localctx, actionIndex); break;

		case 21: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void EOL_action(RuleContext _localctx, int actionIndex) {
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\25\u0089\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\7"+
		"\13D\n\13\f\13\16\13G\13\13\3\13\3\13\3\f\3\f\7\fM\n\f\f\f\16\fP\13\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16[\n\16\f\16\16\16^\13\16\3"+
		"\16\5\16a\n\16\3\17\3\17\3\17\3\17\3\20\6\20h\n\20\r\20\16\20i\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22t\n\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\5\26}\n\26\3\26\3\26\3\26\3\26\3\27\6\27\u0084\n\27\r\27\16"+
		"\27\u0085\3\27\3\27\3N\30\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1"+
		"\21\n\1\23\13\1\25\f\2\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23"+
		"\1%\2\1\'\2\1)\2\1+\24\3-\25\4\3\2\7\4\2\f\f\17\17\7\2((,-//\61\61~~\5"+
		"\2C\\aac|\3\2\62;\4\2\13\13\"\"\u0090\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2"+
		"\2\2\5\61\3\2\2\2\7\63\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r9\3\2\2\2\17"+
		";\3\2\2\2\21=\3\2\2\2\23?\3\2\2\2\25A\3\2\2\2\27J\3\2\2\2\31S\3\2\2\2"+
		"\33`\3\2\2\2\35b\3\2\2\2\37g\3\2\2\2!k\3\2\2\2#s\3\2\2\2%u\3\2\2\2\'w"+
		"\3\2\2\2)y\3\2\2\2+|\3\2\2\2-\u0083\3\2\2\2/\60\7_\2\2\60\4\3\2\2\2\61"+
		"\62\7}\2\2\62\6\3\2\2\2\63\64\7+\2\2\64\b\3\2\2\2\65\66\7\60\2\2\66\n"+
		"\3\2\2\2\678\7.\2\28\f\3\2\2\29:\7]\2\2:\16\3\2\2\2;<\7*\2\2<\20\3\2\2"+
		"\2=>\7<\2\2>\22\3\2\2\2?@\7\177\2\2@\24\3\2\2\2AE\7%\2\2BD\n\2\2\2CB\3"+
		"\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\b\13\2\2I\26"+
		"\3\2\2\2JN\7$\2\2KM\5%\23\2LK\3\2\2\2MP\3\2\2\2NO\3\2\2\2NL\3\2\2\2OQ"+
		"\3\2\2\2PN\3\2\2\2QR\7$\2\2R\30\3\2\2\2ST\7>\2\2TU\5\33\16\2UV\7@\2\2"+
		"V\32\3\2\2\2W\\\5\'\24\2X[\5\'\24\2Y[\5)\25\2ZX\3\2\2\2ZY\3\2\2\2[^\3"+
		"\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]a\3\2\2\2^\\\3\2\2\2_a\7&\2\2`W\3\2\2\2`"+
		"_\3\2\2\2a\34\3\2\2\2bc\5\37\20\2cd\7\u0080\2\2de\5\37\20\2e\36\3\2\2"+
		"\2fh\5)\25\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j \3\2\2\2kl\t\3\2"+
		"\2l\"\3\2\2\2mn\7@\2\2nt\7?\2\2ot\7@\2\2pq\7>\2\2qt\7?\2\2rt\4>?\2sm\3"+
		"\2\2\2so\3\2\2\2sp\3\2\2\2sr\3\2\2\2t$\3\2\2\2uv\n\2\2\2v&\3\2\2\2wx\t"+
		"\4\2\2x(\3\2\2\2yz\t\5\2\2z*\3\2\2\2{}\7\17\2\2|{\3\2\2\2|}\3\2\2\2}~"+
		"\3\2\2\2~\177\7\f\2\2\177\u0080\3\2\2\2\u0080\u0081\b\26\3\2\u0081,\3"+
		"\2\2\2\u0082\u0084\t\6\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\b\27"+
		"\4\2\u0088.\3\2\2\2\f\2ENZ\\`is|\u0085";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}