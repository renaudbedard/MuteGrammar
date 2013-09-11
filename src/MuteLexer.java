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
		Statement=1, Identifier=2, Operation=3, Condition=4, Assignment=5, COMMENT=6, 
		EOL=7, WHITESPACE=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"Statement", "Identifier", "Operation", "Condition", "Assignment", "COMMENT", 
		"EOL", "WHITESPACE"
	};
	public static final String[] ruleNames = {
		"Statement", "Identifier", "Operation", "Condition", "Assignment", "COMMENT", 
		"EOL", "WHITESPACE"
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
		case 5: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 7: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\nN\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\5\2\25\n\2"+
		"\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\7\2"+
		"$\n\2\f\2\16\2\'\13\2\3\2\3\2\3\3\6\3,\n\3\r\3\16\3-\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\7\78\n\7\f\7\16\7;\13\7\3\7\3\7\3\7\3\7\3\b\5\bB\n\b\3"+
		"\b\3\b\5\bF\n\b\3\t\6\tI\n\t\r\t\16\tJ\3\t\3\t\39\n\3\3\1\5\4\1\7\5\1"+
		"\t\6\1\13\7\1\r\b\2\17\t\1\21\n\3\3\2\4\17\2\13\13\"\"$&*+..\60\60<<>"+
		">@@]]__}}\177\u0080\5\2\13\13\16\16\"\"V\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\3\24\3\2\2\2\5+\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\65\3"+
		"\2\2\2\17E\3\2\2\2\21H\3\2\2\2\23\25\5\5\3\2\24\23\3\2\2\2\24\25\3\2\2"+
		"\2\25\31\3\2\2\2\26\30\5\t\5\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2"+
		"\2\31\32\3\2\2\2\32\37\3\2\2\2\33\31\3\2\2\2\34\36\5\13\6\2\35\34\3\2"+
		"\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 %\3\2\2\2!\37\3\2\2\2\"$\5"+
		"\7\4\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2"+
		"()\5\17\b\2)\4\3\2\2\2*,\n\2\2\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2"+
		"\2.\6\3\2\2\2/\60\3\2\2\2\60\b\3\2\2\2\61\62\3\2\2\2\62\n\3\2\2\2\63\64"+
		"\3\2\2\2\64\f\3\2\2\2\659\7%\2\2\668\13\2\2\2\67\66\3\2\2\28;\3\2\2\2"+
		"9:\3\2\2\29\67\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\5\17\b\2=>\3\2\2\2>?\b\7"+
		"\2\2?\16\3\2\2\2@B\7\17\2\2A@\3\2\2\2AB\3\2\2\2BC\3\2\2\2CF\7\f\2\2DF"+
		"\7\17\2\2EA\3\2\2\2ED\3\2\2\2F\20\3\2\2\2GI\t\3\2\2HG\3\2\2\2IJ\3\2\2"+
		"\2JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\b\t\3\2M\22\3\2\2\2\f\2\24\31\37%-"+
		"9AEJ";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}