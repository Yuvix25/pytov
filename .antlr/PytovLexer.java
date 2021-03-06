// Generated from c:\Users\yuvro\OneDrive\Desktop\Pytov\Pytov.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PytovLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, STRING=22, COMMENT=23, LINE_COMMENT_C=24, 
		LINE_COMMENT_P=25, AND=26, OR=27, NOT=28, TRUE=29, FALSE=30, INC=31, DEC=32, 
		ADD=33, SUBTRACT=34, POWER=35, MULT=36, DIVIDE=37, FLOOR_DIVISION=38, 
		MODULO=39, GT=40, GE=41, LT=42, LE=43, EQ=44, NOT_EQ=45, LPAREN=46, RPAREN=47, 
		RETURN=48, BREAK=49, DECIMAL=50, IDENTIFIER=51, OPEN_CURLY=52, CLOSE_CURLY=53, 
		WS=54, SEMI_COLON=55, NEW_LINE=56;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "STRING", "COMMENT", "LINE_COMMENT_C", 
			"LINE_COMMENT_P", "AND", "OR", "NOT", "TRUE", "FALSE", "INC", "DEC", 
			"ADD", "SUBTRACT", "POWER", "MULT", "DIVIDE", "FLOOR_DIVISION", "MODULO", 
			"GT", "GE", "LT", "LE", "EQ", "NOT_EQ", "LPAREN", "RPAREN", "RETURN", 
			"BREAK", "DECIMAL", "IDENTIFIER", "OPEN_CURLY", "CLOSE_CURLY", "WS", 
			"SEMI_COLON", "NEW_LINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'['", "']'", "':'", "','", "'='", "'if'", "'elif'", 
			"'else if'", "'else'", "'case'", "'default:'", "'switch'", "'global'", 
			"'while'", "'for'", "'in'", "'func'", "'function'", "'def'", "'.'", null, 
			null, null, null, "'&&'", "'||'", "'!'", null, null, "'++'", "'--'", 
			"'+'", "'-'", "'**'", "'*'", "'/'", "'/_'", "'%'", "'>'", "'>='", "'<'", 
			"'<='", "'=='", "'!='", "'('", "')'", "'return'", "'break'", null, null, 
			"'{'", "'}'", null, "';'", "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "STRING", 
			"COMMENT", "LINE_COMMENT_C", "LINE_COMMENT_P", "AND", "OR", "NOT", "TRUE", 
			"FALSE", "INC", "DEC", "ADD", "SUBTRACT", "POWER", "MULT", "DIVIDE", 
			"FLOOR_DIVISION", "MODULO", "GT", "GE", "LT", "LE", "EQ", "NOT_EQ", "LPAREN", 
			"RPAREN", "RETURN", "BREAK", "DECIMAL", "IDENTIFIER", "OPEN_CURLY", "CLOSE_CURLY", 
			"WS", "SEMI_COLON", "NEW_LINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public PytovLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pytov.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u0186\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\7\27\u00db\n\27\f\27\16\27\u00de\13\27\3\27"+
		"\3\27\3\27\3\27\3\27\7\27\u00e5\n\27\f\27\16\27\u00e8\13\27\3\27\5\27"+
		"\u00eb\n\27\3\30\3\30\3\30\3\30\7\30\u00f1\n\30\f\30\16\30\u00f4\13\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u00ff\n\31\f\31\16"+
		"\31\u0102\13\31\3\31\3\31\3\32\3\32\7\32\u0108\n\32\f\32\16\32\u010b\13"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\5\36\u011f\n\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u012b\n\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3"+
		"$\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3,\3,\3,\3"+
		"-\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\63\6\63\u0165\n\63\r\63\16\63\u0166\3\63"+
		"\3\63\6\63\u016b\n\63\r\63\16\63\u016c\5\63\u016f\n\63\3\64\3\64\7\64"+
		"\u0173\n\64\f\64\16\64\u0176\13\64\3\65\3\65\3\66\3\66\3\67\6\67\u017d"+
		"\n\67\r\67\16\67\u017e\3\67\3\67\38\38\39\39\5\u00dc\u00e6\u00f2\2:\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9"+
		"q:\3\2\7\4\2\f\f\17\17\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\13\16"+
		"\17\"\"\2\u0194\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\3s\3\2\2\2\5z\3\2\2\2\7|\3\2\2"+
		"\2\t~\3\2\2\2\13\u0080\3\2\2\2\r\u0082\3\2\2\2\17\u0084\3\2\2\2\21\u0087"+
		"\3\2\2\2\23\u008c\3\2\2\2\25\u0094\3\2\2\2\27\u0099\3\2\2\2\31\u009e\3"+
		"\2\2\2\33\u00a7\3\2\2\2\35\u00ae\3\2\2\2\37\u00b5\3\2\2\2!\u00bb\3\2\2"+
		"\2#\u00bf\3\2\2\2%\u00c2\3\2\2\2\'\u00c7\3\2\2\2)\u00d0\3\2\2\2+\u00d4"+
		"\3\2\2\2-\u00ea\3\2\2\2/\u00ec\3\2\2\2\61\u00fa\3\2\2\2\63\u0105\3\2\2"+
		"\2\65\u010e\3\2\2\2\67\u0111\3\2\2\29\u0114\3\2\2\2;\u011e\3\2\2\2=\u012a"+
		"\3\2\2\2?\u012c\3\2\2\2A\u012f\3\2\2\2C\u0132\3\2\2\2E\u0134\3\2\2\2G"+
		"\u0136\3\2\2\2I\u0139\3\2\2\2K\u013b\3\2\2\2M\u013d\3\2\2\2O\u0140\3\2"+
		"\2\2Q\u0142\3\2\2\2S\u0144\3\2\2\2U\u0147\3\2\2\2W\u0149\3\2\2\2Y\u014c"+
		"\3\2\2\2[\u014f\3\2\2\2]\u0152\3\2\2\2_\u0154\3\2\2\2a\u0156\3\2\2\2c"+
		"\u015d\3\2\2\2e\u0164\3\2\2\2g\u0170\3\2\2\2i\u0177\3\2\2\2k\u0179\3\2"+
		"\2\2m\u017c\3\2\2\2o\u0182\3\2\2\2q\u0184\3\2\2\2st\7k\2\2tu\7o\2\2uv"+
		"\7r\2\2vw\7q\2\2wx\7t\2\2xy\7v\2\2y\4\3\2\2\2z{\7]\2\2{\6\3\2\2\2|}\7"+
		"_\2\2}\b\3\2\2\2~\177\7<\2\2\177\n\3\2\2\2\u0080\u0081\7.\2\2\u0081\f"+
		"\3\2\2\2\u0082\u0083\7?\2\2\u0083\16\3\2\2\2\u0084\u0085\7k\2\2\u0085"+
		"\u0086\7h\2\2\u0086\20\3\2\2\2\u0087\u0088\7g\2\2\u0088\u0089\7n\2\2\u0089"+
		"\u008a\7k\2\2\u008a\u008b\7h\2\2\u008b\22\3\2\2\2\u008c\u008d\7g\2\2\u008d"+
		"\u008e\7n\2\2\u008e\u008f\7u\2\2\u008f\u0090\7g\2\2\u0090\u0091\7\"\2"+
		"\2\u0091\u0092\7k\2\2\u0092\u0093\7h\2\2\u0093\24\3\2\2\2\u0094\u0095"+
		"\7g\2\2\u0095\u0096\7n\2\2\u0096\u0097\7u\2\2\u0097\u0098\7g\2\2\u0098"+
		"\26\3\2\2\2\u0099\u009a\7e\2\2\u009a\u009b\7c\2\2\u009b\u009c\7u\2\2\u009c"+
		"\u009d\7g\2\2\u009d\30\3\2\2\2\u009e\u009f\7f\2\2\u009f\u00a0\7g\2\2\u00a0"+
		"\u00a1\7h\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4\7n\2\2"+
		"\u00a4\u00a5\7v\2\2\u00a5\u00a6\7<\2\2\u00a6\32\3\2\2\2\u00a7\u00a8\7"+
		"u\2\2\u00a8\u00a9\7y\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac"+
		"\7e\2\2\u00ac\u00ad\7j\2\2\u00ad\34\3\2\2\2\u00ae\u00af\7i\2\2\u00af\u00b0"+
		"\7n\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7d\2\2\u00b2\u00b3\7c\2\2\u00b3"+
		"\u00b4\7n\2\2\u00b4\36\3\2\2\2\u00b5\u00b6\7y\2\2\u00b6\u00b7\7j\2\2\u00b7"+
		"\u00b8\7k\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7g\2\2\u00ba \3\2\2\2\u00bb"+
		"\u00bc\7h\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7t\2\2\u00be\"\3\2\2\2\u00bf"+
		"\u00c0\7k\2\2\u00c0\u00c1\7p\2\2\u00c1$\3\2\2\2\u00c2\u00c3\7h\2\2\u00c3"+
		"\u00c4\7w\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7e\2\2\u00c6&\3\2\2\2\u00c7"+
		"\u00c8\7h\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7e\2\2"+
		"\u00cb\u00cc\7v\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf"+
		"\7p\2\2\u00cf(\3\2\2\2\u00d0\u00d1\7f\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3"+
		"\7h\2\2\u00d3*\3\2\2\2\u00d4\u00d5\7\60\2\2\u00d5,\3\2\2\2\u00d6\u00dc"+
		"\7$\2\2\u00d7\u00d8\7^\2\2\u00d8\u00db\7$\2\2\u00d9\u00db\13\2\2\2\u00da"+
		"\u00d7\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00eb\7$\2\2\u00e0\u00e6\7)\2\2\u00e1\u00e2\7^\2\2\u00e2\u00e5\7)\2\2"+
		"\u00e3\u00e5\13\2\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e9\u00eb\7)\2\2\u00ea\u00d6\3\2\2\2\u00ea\u00e0\3\2"+
		"\2\2\u00eb.\3\2\2\2\u00ec\u00ed\7\61\2\2\u00ed\u00ee\7,\2\2\u00ee\u00f2"+
		"\3\2\2\2\u00ef\u00f1\13\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2"+
		"\u00f2\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2"+
		"\3\2\2\2\u00f5\u00f6\7,\2\2\u00f6\u00f7\7\61\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00f9\b\30\2\2\u00f9\60\3\2\2\2\u00fa\u00fb\7\61\2\2\u00fb\u00fc\7\61"+
		"\2\2\u00fc\u0100\3\2\2\2\u00fd\u00ff\n\2\2\2\u00fe\u00fd\3\2\2\2\u00ff"+
		"\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2"+
		"\2\2\u0102\u0100\3\2\2\2\u0103\u0104\b\31\2\2\u0104\62\3\2\2\2\u0105\u0109"+
		"\7%\2\2\u0106\u0108\n\2\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010c\u010d\b\32\2\2\u010d\64\3\2\2\2\u010e\u010f\7(\2\2\u010f\u0110"+
		"\7(\2\2\u0110\66\3\2\2\2\u0111\u0112\7~\2\2\u0112\u0113\7~\2\2\u01138"+
		"\3\2\2\2\u0114\u0115\7#\2\2\u0115:\3\2\2\2\u0116\u0117\7v\2\2\u0117\u0118"+
		"\7t\2\2\u0118\u0119\7w\2\2\u0119\u011f\7g\2\2\u011a\u011b\7V\2\2\u011b"+
		"\u011c\7t\2\2\u011c\u011d\7w\2\2\u011d\u011f\7g\2\2\u011e\u0116\3\2\2"+
		"\2\u011e\u011a\3\2\2\2\u011f<\3\2\2\2\u0120\u0121\7h\2\2\u0121\u0122\7"+
		"c\2\2\u0122\u0123\7n\2\2\u0123\u0124\7u\2\2\u0124\u012b\7g\2\2\u0125\u0126"+
		"\7H\2\2\u0126\u0127\7c\2\2\u0127\u0128\7n\2\2\u0128\u0129\7u\2\2\u0129"+
		"\u012b\7g\2\2\u012a\u0120\3\2\2\2\u012a\u0125\3\2\2\2\u012b>\3\2\2\2\u012c"+
		"\u012d\7-\2\2\u012d\u012e\7-\2\2\u012e@\3\2\2\2\u012f\u0130\7/\2\2\u0130"+
		"\u0131\7/\2\2\u0131B\3\2\2\2\u0132\u0133\7-\2\2\u0133D\3\2\2\2\u0134\u0135"+
		"\7/\2\2\u0135F\3\2\2\2\u0136\u0137\7,\2\2\u0137\u0138\7,\2\2\u0138H\3"+
		"\2\2\2\u0139\u013a\7,\2\2\u013aJ\3\2\2\2\u013b\u013c\7\61\2\2\u013cL\3"+
		"\2\2\2\u013d\u013e\7\61\2\2\u013e\u013f\7a\2\2\u013fN\3\2\2\2\u0140\u0141"+
		"\7\'\2\2\u0141P\3\2\2\2\u0142\u0143\7@\2\2\u0143R\3\2\2\2\u0144\u0145"+
		"\7@\2\2\u0145\u0146\7?\2\2\u0146T\3\2\2\2\u0147\u0148\7>\2\2\u0148V\3"+
		"\2\2\2\u0149\u014a\7>\2\2\u014a\u014b\7?\2\2\u014bX\3\2\2\2\u014c\u014d"+
		"\7?\2\2\u014d\u014e\7?\2\2\u014eZ\3\2\2\2\u014f\u0150\7#\2\2\u0150\u0151"+
		"\7?\2\2\u0151\\\3\2\2\2\u0152\u0153\7*\2\2\u0153^\3\2\2\2\u0154\u0155"+
		"\7+\2\2\u0155`\3\2\2\2\u0156\u0157\7t\2\2\u0157\u0158\7g\2\2\u0158\u0159"+
		"\7v\2\2\u0159\u015a\7w\2\2\u015a\u015b\7t\2\2\u015b\u015c\7p\2\2\u015c"+
		"b\3\2\2\2\u015d\u015e\7d\2\2\u015e\u015f\7t\2\2\u015f\u0160\7g\2\2\u0160"+
		"\u0161\7c\2\2\u0161\u0162\7m\2\2\u0162d\3\2\2\2\u0163\u0165\t\3\2\2\u0164"+
		"\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2"+
		"\2\2\u0167\u016e\3\2\2\2\u0168\u016a\7\60\2\2\u0169\u016b\t\3\2\2\u016a"+
		"\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2"+
		"\2\2\u016d\u016f\3\2\2\2\u016e\u0168\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"f\3\2\2\2\u0170\u0174\t\4\2\2\u0171\u0173\t\5\2\2\u0172\u0171\3\2\2\2"+
		"\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175h\3"+
		"\2\2\2\u0176\u0174\3\2\2\2\u0177\u0178\7}\2\2\u0178j\3\2\2\2\u0179\u017a"+
		"\7\177\2\2\u017al\3\2\2\2\u017b\u017d\t\6\2\2\u017c\u017b\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2"+
		"\2\2\u0180\u0181\b\67\2\2\u0181n\3\2\2\2\u0182\u0183\7=\2\2\u0183p\3\2"+
		"\2\2\u0184\u0185\7\f\2\2\u0185r\3\2\2\2\22\2\u00da\u00dc\u00e4\u00e6\u00ea"+
		"\u00f2\u0100\u0109\u011e\u012a\u0166\u016c\u016e\u0174\u017e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}