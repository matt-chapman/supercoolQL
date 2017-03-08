// Generated from /Users/matt/Repos/myriad-ql/supercoolQL/grammar/QL.g4 by ANTLR 4.6
package com.matthewchapman.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, ID=23, STRING=24, NUMBER=25, 
		WHITESPACE=26, MULTI_LINE_COMMENT=27, SINGLE_LINE_COMMENT=28, OPEN_BRACKET=29, 
		CLOSE_BRACKET=30, OPEN_PARENTH=31, CLOSE_PARENTH=32;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "ID", "STRING", "NUMBER", 
		"WHITESPACE", "MULTI_LINE_COMMENT", "SINGLE_LINE_COMMENT", "OPEN_BRACKET", 
		"CLOSE_BRACKET", "OPEN_PARENTH", "CLOSE_PARENTH"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'form'", "':'", "';'", "'if'", "'else'", "'!'", "'/'", "'*'", "'-'", 
		"'+'", "'>'", "'<'", "'=='", "'!='", "'<='", "'>='", "'&&'", "'||'", "'='", 
		"'boolean'", "'integer'", "'string'", null, null, null, null, null, null, 
		"'{'", "'}'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "ID", 
		"STRING", "NUMBER", "WHITESPACE", "MULTI_LINE_COMMENT", "SINGLE_LINE_COMMENT", 
		"OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_PARENTH", "CLOSE_PARENTH"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public QLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "QL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\"\u00cd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\6\30\u008f\n\30\r\30\16\30\u0090\3\31\3\31\7\31\u0095\n\31\f\31\16\31"+
		"\u0098\13\31\3\31\3\31\3\32\6\32\u009d\n\32\r\32\16\32\u009e\3\32\3\32"+
		"\6\32\u00a3\n\32\r\32\16\32\u00a4\5\32\u00a7\n\32\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\7\34\u00b1\n\34\f\34\16\34\u00b4\13\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u00bf\n\35\f\35\16\35\u00c2\13"+
		"\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\5\u0096\u00b2\u00c0\2\""+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"\3\2\4\7\2&&\62;C\\aac|\5\2\13\f\17\17\"\"\u00d3\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5H\3\2\2\2\7J\3\2\2\2\tL\3\2\2\2\13"+
		"O\3\2\2\2\rT\3\2\2\2\17V\3\2\2\2\21X\3\2\2\2\23Z\3\2\2\2\25\\\3\2\2\2"+
		"\27^\3\2\2\2\31`\3\2\2\2\33b\3\2\2\2\35e\3\2\2\2\37h\3\2\2\2!k\3\2\2\2"+
		"#n\3\2\2\2%q\3\2\2\2\'t\3\2\2\2)v\3\2\2\2+~\3\2\2\2-\u0086\3\2\2\2/\u008e"+
		"\3\2\2\2\61\u0092\3\2\2\2\63\u009c\3\2\2\2\65\u00a8\3\2\2\2\67\u00ac\3"+
		"\2\2\29\u00ba\3\2\2\2;\u00c5\3\2\2\2=\u00c7\3\2\2\2?\u00c9\3\2\2\2A\u00cb"+
		"\3\2\2\2CD\7h\2\2DE\7q\2\2EF\7t\2\2FG\7o\2\2G\4\3\2\2\2HI\7<\2\2I\6\3"+
		"\2\2\2JK\7=\2\2K\b\3\2\2\2LM\7k\2\2MN\7h\2\2N\n\3\2\2\2OP\7g\2\2PQ\7n"+
		"\2\2QR\7u\2\2RS\7g\2\2S\f\3\2\2\2TU\7#\2\2U\16\3\2\2\2VW\7\61\2\2W\20"+
		"\3\2\2\2XY\7,\2\2Y\22\3\2\2\2Z[\7/\2\2[\24\3\2\2\2\\]\7-\2\2]\26\3\2\2"+
		"\2^_\7@\2\2_\30\3\2\2\2`a\7>\2\2a\32\3\2\2\2bc\7?\2\2cd\7?\2\2d\34\3\2"+
		"\2\2ef\7#\2\2fg\7?\2\2g\36\3\2\2\2hi\7>\2\2ij\7?\2\2j \3\2\2\2kl\7@\2"+
		"\2lm\7?\2\2m\"\3\2\2\2no\7(\2\2op\7(\2\2p$\3\2\2\2qr\7~\2\2rs\7~\2\2s"+
		"&\3\2\2\2tu\7?\2\2u(\3\2\2\2vw\7d\2\2wx\7q\2\2xy\7q\2\2yz\7n\2\2z{\7g"+
		"\2\2{|\7c\2\2|}\7p\2\2}*\3\2\2\2~\177\7k\2\2\177\u0080\7p\2\2\u0080\u0081"+
		"\7v\2\2\u0081\u0082\7g\2\2\u0082\u0083\7i\2\2\u0083\u0084\7g\2\2\u0084"+
		"\u0085\7t\2\2\u0085,\3\2\2\2\u0086\u0087\7u\2\2\u0087\u0088\7v\2\2\u0088"+
		"\u0089\7t\2\2\u0089\u008a\7k\2\2\u008a\u008b\7p\2\2\u008b\u008c\7i\2\2"+
		"\u008c.\3\2\2\2\u008d\u008f\t\2\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3"+
		"\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\60\3\2\2\2\u0092"+
		"\u0096\7$\2\2\u0093\u0095\13\2\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0099\u009a\7$\2\2\u009a\62\3\2\2\2\u009b\u009d\4\62;\2"+
		"\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a6\3\2\2\2\u00a0\u00a2\7\60\2\2\u00a1\u00a3\4\62;\2"+
		"\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\64\3\2\2\2\u00a8\u00a9\t\3\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\b\33\2"+
		"\2\u00ab\66\3\2\2\2\u00ac\u00ad\7\61\2\2\u00ad\u00ae\7,\2\2\u00ae\u00b2"+
		"\3\2\2\2\u00af\u00b1\13\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2"+
		"\u00b2\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2"+
		"\3\2\2\2\u00b5\u00b6\7,\2\2\u00b6\u00b7\7\61\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00b9\b\34\2\2\u00b98\3\2\2\2\u00ba\u00bb\7\61\2\2\u00bb\u00bc\7\61\2"+
		"\2\u00bc\u00c0\3\2\2\2\u00bd\u00bf\13\2\2\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\u00c2\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c3\3\2"+
		"\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\b\35\2\2\u00c4:\3\2\2\2\u00c5\u00c6"+
		"\7}\2\2\u00c6<\3\2\2\2\u00c7\u00c8\7\177\2\2\u00c8>\3\2\2\2\u00c9\u00ca"+
		"\7*\2\2\u00ca@\3\2\2\2\u00cb\u00cc\7+\2\2\u00ccB\3\2\2\2\n\2\u0090\u0096"+
		"\u009e\u00a4\u00a6\u00b2\u00c0\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}