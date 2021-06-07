// Generated from Java11.g4 by ANTLR 4.9.2
package klarenbach.daniel.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Java11Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, LBRACE=3, RBRACE=4, LBRACK=5, RBRACK=6, SEMI=7, COMMA=8, 
		DOT=9, ASSIGN=10, GT=11, LT=12, BANG=13, EQUAL=14, LE=15, GE=16, NOTEQUAL=17, 
		AND=18, OR=19, INC=20, DEC=21, ADD=22, SUB=23, MUL=24, MOD=25, DIV=26, 
		POW=27, BOOLEAN=28, INT=29, FLOAT=30, VOID=31, CHAR=32, STRING=33, ELSE=34, 
		ELSEIF=35, FOR=36, IF=37, WHILE=38, BREAK=39, RETURN=40, PRIVATE=41, PUBLIC=42, 
		CLASS=43, TRUE=44, FALSE=45, NULL_LITERAL=46, INT_LITERAL=47, FLOAT_LITERAL=48, 
		CHAR_LITERAL=49, IDENTIFIER=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DOT", "ASSIGN", "GT", "LT", "BANG", "EQUAL", "LE", "GE", "NOTEQUAL", 
			"AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "MOD", "DIV", "POW", 
			"BOOLEAN", "INT", "FLOAT", "VOID", "CHAR", "STRING", "ELSE", "ELSEIF", 
			"FOR", "IF", "WHILE", "BREAK", "RETURN", "PRIVATE", "PUBLIC", "CLASS", 
			"TRUE", "FALSE", "NULL_LITERAL", "INT_LITERAL", "FLOAT_LITERAL", "CHAR_LITERAL", 
			"IDENTIFIER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", 
			"'='", "'>'", "'<'", "'!'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
			"'++'", "'--'", "'+'", "'-'", "'*'", "'%'", "'/'", "'^'", "'boolean'", 
			"'int'", "'float'", "'void'", "'char'", "'string'", "'else'", "'else if'", 
			"'for'", "'if'", "'while'", "'break'", "'return'", "'private'", "'public'", 
			"'class'", "'true'", "'false'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", 
			"COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "EQUAL", "LE", "GE", "NOTEQUAL", 
			"AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "MOD", "DIV", "POW", 
			"BOOLEAN", "INT", "FLOAT", "VOID", "CHAR", "STRING", "ELSE", "ELSEIF", 
			"FOR", "IF", "WHILE", "BREAK", "RETURN", "PRIVATE", "PUBLIC", "CLASS", 
			"TRUE", "FALSE", "NULL_LITERAL", "INT_LITERAL", "FLOAT_LITERAL", "CHAR_LITERAL", 
			"IDENTIFIER"
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


	public Java11Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Java11.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u012d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3"+
		"&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3"+
		"-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\6\60\u0116\n\60\r\60\16"+
		"\60\u0117\3\61\6\61\u011b\n\61\r\61\16\61\u011c\3\61\3\61\6\61\u0121\n"+
		"\61\r\61\16\61\u0122\3\62\3\62\3\63\3\63\7\63\u0129\n\63\f\63\16\63\u012c"+
		"\13\63\2\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64\3"+
		"\2\6\3\2\62;\3\2\60\60\4\2C\\c|\6\2\62;C\\aac|\2\u0130\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\3g\3\2\2\2\5i\3\2\2\2\7k\3\2\2\2\tm\3\2\2\2\13o\3\2\2\2\r"+
		"q\3\2\2\2\17s\3\2\2\2\21u\3\2\2\2\23w\3\2\2\2\25y\3\2\2\2\27{\3\2\2\2"+
		"\31}\3\2\2\2\33\177\3\2\2\2\35\u0081\3\2\2\2\37\u0084\3\2\2\2!\u0087\3"+
		"\2\2\2#\u008a\3\2\2\2%\u008d\3\2\2\2\'\u0090\3\2\2\2)\u0093\3\2\2\2+\u0096"+
		"\3\2\2\2-\u0099\3\2\2\2/\u009b\3\2\2\2\61\u009d\3\2\2\2\63\u009f\3\2\2"+
		"\2\65\u00a1\3\2\2\2\67\u00a3\3\2\2\29\u00a5\3\2\2\2;\u00ad\3\2\2\2=\u00b1"+
		"\3\2\2\2?\u00b7\3\2\2\2A\u00bc\3\2\2\2C\u00c1\3\2\2\2E\u00c8\3\2\2\2G"+
		"\u00cd\3\2\2\2I\u00d5\3\2\2\2K\u00d9\3\2\2\2M\u00dc\3\2\2\2O\u00e2\3\2"+
		"\2\2Q\u00e8\3\2\2\2S\u00ef\3\2\2\2U\u00f7\3\2\2\2W\u00fe\3\2\2\2Y\u0104"+
		"\3\2\2\2[\u0109\3\2\2\2]\u010f\3\2\2\2_\u0115\3\2\2\2a\u011a\3\2\2\2c"+
		"\u0124\3\2\2\2e\u0126\3\2\2\2gh\7*\2\2h\4\3\2\2\2ij\7+\2\2j\6\3\2\2\2"+
		"kl\7}\2\2l\b\3\2\2\2mn\7\177\2\2n\n\3\2\2\2op\7]\2\2p\f\3\2\2\2qr\7_\2"+
		"\2r\16\3\2\2\2st\7=\2\2t\20\3\2\2\2uv\7.\2\2v\22\3\2\2\2wx\7\60\2\2x\24"+
		"\3\2\2\2yz\7?\2\2z\26\3\2\2\2{|\7@\2\2|\30\3\2\2\2}~\7>\2\2~\32\3\2\2"+
		"\2\177\u0080\7#\2\2\u0080\34\3\2\2\2\u0081\u0082\7?\2\2\u0082\u0083\7"+
		"?\2\2\u0083\36\3\2\2\2\u0084\u0085\7>\2\2\u0085\u0086\7?\2\2\u0086 \3"+
		"\2\2\2\u0087\u0088\7@\2\2\u0088\u0089\7?\2\2\u0089\"\3\2\2\2\u008a\u008b"+
		"\7#\2\2\u008b\u008c\7?\2\2\u008c$\3\2\2\2\u008d\u008e\7(\2\2\u008e\u008f"+
		"\7(\2\2\u008f&\3\2\2\2\u0090\u0091\7~\2\2\u0091\u0092\7~\2\2\u0092(\3"+
		"\2\2\2\u0093\u0094\7-\2\2\u0094\u0095\7-\2\2\u0095*\3\2\2\2\u0096\u0097"+
		"\7/\2\2\u0097\u0098\7/\2\2\u0098,\3\2\2\2\u0099\u009a\7-\2\2\u009a.\3"+
		"\2\2\2\u009b\u009c\7/\2\2\u009c\60\3\2\2\2\u009d\u009e\7,\2\2\u009e\62"+
		"\3\2\2\2\u009f\u00a0\7\'\2\2\u00a0\64\3\2\2\2\u00a1\u00a2\7\61\2\2\u00a2"+
		"\66\3\2\2\2\u00a3\u00a4\7`\2\2\u00a48\3\2\2\2\u00a5\u00a6\7d\2\2\u00a6"+
		"\u00a7\7q\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7g\2\2"+
		"\u00aa\u00ab\7c\2\2\u00ab\u00ac\7p\2\2\u00ac:\3\2\2\2\u00ad\u00ae\7k\2"+
		"\2\u00ae\u00af\7p\2\2\u00af\u00b0\7v\2\2\u00b0<\3\2\2\2\u00b1\u00b2\7"+
		"h\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6"+
		"\7v\2\2\u00b6>\3\2\2\2\u00b7\u00b8\7x\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba"+
		"\7k\2\2\u00ba\u00bb\7f\2\2\u00bb@\3\2\2\2\u00bc\u00bd\7e\2\2\u00bd\u00be"+
		"\7j\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7t\2\2\u00c0B\3\2\2\2\u00c1\u00c2"+
		"\7u\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7k\2\2\u00c5"+
		"\u00c6\7p\2\2\u00c6\u00c7\7i\2\2\u00c7D\3\2\2\2\u00c8\u00c9\7g\2\2\u00c9"+
		"\u00ca\7n\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7g\2\2\u00ccF\3\2\2\2\u00cd"+
		"\u00ce\7g\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d1\7g\2\2"+
		"\u00d1\u00d2\7\"\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7h\2\2\u00d4H\3\2"+
		"\2\2\u00d5\u00d6\7h\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7t\2\2\u00d8J\3"+
		"\2\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7h\2\2\u00dbL\3\2\2\2\u00dc\u00dd"+
		"\7y\2\2\u00dd\u00de\7j\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7n\2\2\u00e0"+
		"\u00e1\7g\2\2\u00e1N\3\2\2\2\u00e2\u00e3\7d\2\2\u00e3\u00e4\7t\2\2\u00e4"+
		"\u00e5\7g\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7m\2\2\u00e7P\3\2\2\2\u00e8"+
		"\u00e9\7t\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec\7w\2\2"+
		"\u00ec\u00ed\7t\2\2\u00ed\u00ee\7p\2\2\u00eeR\3\2\2\2\u00ef\u00f0\7r\2"+
		"\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7x\2\2\u00f3\u00f4"+
		"\7c\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7g\2\2\u00f6T\3\2\2\2\u00f7\u00f8"+
		"\7r\2\2\u00f8\u00f9\7w\2\2\u00f9\u00fa\7d\2\2\u00fa\u00fb\7n\2\2\u00fb"+
		"\u00fc\7k\2\2\u00fc\u00fd\7e\2\2\u00fdV\3\2\2\2\u00fe\u00ff\7e\2\2\u00ff"+
		"\u0100\7n\2\2\u0100\u0101\7c\2\2\u0101\u0102\7u\2\2\u0102\u0103\7u\2\2"+
		"\u0103X\3\2\2\2\u0104\u0105\7v\2\2\u0105\u0106\7t\2\2\u0106\u0107\7w\2"+
		"\2\u0107\u0108\7g\2\2\u0108Z\3\2\2\2\u0109\u010a\7h\2\2\u010a\u010b\7"+
		"c\2\2\u010b\u010c\7n\2\2\u010c\u010d\7u\2\2\u010d\u010e\7g\2\2\u010e\\"+
		"\3\2\2\2\u010f\u0110\7p\2\2\u0110\u0111\7w\2\2\u0111\u0112\7n\2\2\u0112"+
		"\u0113\7n\2\2\u0113^\3\2\2\2\u0114\u0116\t\2\2\2\u0115\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118`\3\2\2\2"+
		"\u0119\u011b\t\2\2\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\7\60\2\2"+
		"\u011f\u0121\t\2\2\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120"+
		"\3\2\2\2\u0122\u0123\3\2\2\2\u0123b\3\2\2\2\u0124\u0125\t\3\2\2\u0125"+
		"d\3\2\2\2\u0126\u012a\t\4\2\2\u0127\u0129\t\5\2\2\u0128\u0127\3\2\2\2"+
		"\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012bf\3"+
		"\2\2\2\u012c\u012a\3\2\2\2\7\2\u0117\u011c\u0122\u012a\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}