// Generated from ccal.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ccalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMA=1, SEMI=2, COLON=3, EQUALS=4, LCB=5, RCB=6, LBR=7, RBR=8, PLUS=9, 
		MINUS=10, TILDE=11, OR=12, AND=13, COMP=14, NOT=15, LESS_THAN=16, LESS_OR_EQUAL=17, 
		GREATER_THAN=18, GREATER_OR_EQUAL=19, VAR=20, CONST=21, RETURN=22, INTEGER=23, 
		BOOLEAN=24, VOID=25, MAIN=26, IF=27, ELSE=28, TRUE=29, FALSE=30, WHILE=31, 
		SKIPPING=32, ID=33, NUMBER=34, SINGLE_LINE_COMM=35, MULTI_LINE_COMM=36, 
		WS=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Digit", "LeadingDigit", "Letter", "Underscore", "A", "B", "C", "D", "E", 
		"F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", 
		"T", "U", "V", "W", "X", "Y", "Z", "COMMA", "SEMI", "COLON", "EQUALS", 
		"LCB", "RCB", "LBR", "RBR", "PLUS", "MINUS", "TILDE", "OR", "AND", "COMP", 
		"NOT", "LESS_THAN", "LESS_OR_EQUAL", "GREATER_THAN", "GREATER_OR_EQUAL", 
		"VAR", "CONST", "RETURN", "INTEGER", "BOOLEAN", "VOID", "MAIN", "IF", 
		"ELSE", "TRUE", "FALSE", "WHILE", "SKIPPING", "ID", "NUMBER", "SINGLE_LINE_COMM", 
		"MULTI_LINE_COMM", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "';'", "':'", "'='", "'{'", "'}'", "'('", "')'", "'+'", "'-'", 
		"'~'", "'||'", "'&&'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMA", "SEMI", "COLON", "EQUALS", "LCB", "RCB", "LBR", "RBR", 
		"PLUS", "MINUS", "TILDE", "OR", "AND", "COMP", "NOT", "LESS_THAN", "LESS_OR_EQUAL", 
		"GREATER_THAN", "GREATER_OR_EQUAL", "VAR", "CONST", "RETURN", "INTEGER", 
		"BOOLEAN", "VOID", "MAIN", "IF", "ELSE", "TRUE", "FALSE", "WHILE", "SKIPPING", 
		"ID", "NUMBER", "SINGLE_LINE_COMM", "MULTI_LINE_COMM", "WS"
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


	public ccalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ccal.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u0173\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$"+
		"\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3"+
		".\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3"+
		"\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\38\38\38\38\38\39\39\39\39\39\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3"+
		"<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3@\3@\3@\3"+
		"@\7@\u013f\n@\f@\16@\u0142\13@\3A\3A\5A\u0146\nA\3A\3A\7A\u014a\nA\fA"+
		"\16A\u014d\13A\5A\u014f\nA\3B\3B\3B\3B\7B\u0155\nB\fB\16B\u0158\13B\3"+
		"B\3B\3B\3B\3C\3C\3C\3C\3C\7C\u0163\nC\fC\16C\u0166\13C\3C\3C\3C\3C\3C"+
		"\3D\6D\u016e\nD\rD\16D\u016f\3D\3D\4\u0156\u0164\2E\3\2\5\2\7\2\t\2\13"+
		"\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2"+
		"-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\3A\4C\5E\6G\7I\bK\tM\nO\13Q\fS\r"+
		"U\16W\17Y\20[\21]\22_\23a\24c\25e\26g\27i\30k\31m\32o\33q\34s\35u\36w"+
		"\37y {!}\"\177#\u0081$\u0083%\u0085&\u0087\'\3\2 \3\2\62;\3\2\63;\4\2"+
		"C\\c|\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj"+
		"\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2S"+
		"Sss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4"+
		"\2\\\\||\5\2\13\f\17\17\"\"\2\u015e\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2"+
		"E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3"+
		"\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2"+
		"\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2"+
		"k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3"+
		"\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2"+
		"\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\3\u0089\3\2\2\2\5\u008b"+
		"\3\2\2\2\7\u008d\3\2\2\2\t\u008f\3\2\2\2\13\u0091\3\2\2\2\r\u0093\3\2"+
		"\2\2\17\u0095\3\2\2\2\21\u0097\3\2\2\2\23\u0099\3\2\2\2\25\u009b\3\2\2"+
		"\2\27\u009d\3\2\2\2\31\u009f\3\2\2\2\33\u00a1\3\2\2\2\35\u00a3\3\2\2\2"+
		"\37\u00a5\3\2\2\2!\u00a7\3\2\2\2#\u00a9\3\2\2\2%\u00ab\3\2\2\2\'\u00ad"+
		"\3\2\2\2)\u00af\3\2\2\2+\u00b1\3\2\2\2-\u00b3\3\2\2\2/\u00b5\3\2\2\2\61"+
		"\u00b7\3\2\2\2\63\u00b9\3\2\2\2\65\u00bb\3\2\2\2\67\u00bd\3\2\2\29\u00bf"+
		"\3\2\2\2;\u00c1\3\2\2\2=\u00c3\3\2\2\2?\u00c5\3\2\2\2A\u00c7\3\2\2\2C"+
		"\u00c9\3\2\2\2E\u00cb\3\2\2\2G\u00cd\3\2\2\2I\u00cf\3\2\2\2K\u00d1\3\2"+
		"\2\2M\u00d3\3\2\2\2O\u00d5\3\2\2\2Q\u00d7\3\2\2\2S\u00d9\3\2\2\2U\u00db"+
		"\3\2\2\2W\u00de\3\2\2\2Y\u00e1\3\2\2\2[\u00e4\3\2\2\2]\u00e7\3\2\2\2_"+
		"\u00e9\3\2\2\2a\u00ec\3\2\2\2c\u00ee\3\2\2\2e\u00f1\3\2\2\2g\u00f5\3\2"+
		"\2\2i\u00fb\3\2\2\2k\u0102\3\2\2\2m\u010a\3\2\2\2o\u0112\3\2\2\2q\u0117"+
		"\3\2\2\2s\u011c\3\2\2\2u\u011f\3\2\2\2w\u0124\3\2\2\2y\u0129\3\2\2\2{"+
		"\u012f\3\2\2\2}\u0135\3\2\2\2\177\u013a\3\2\2\2\u0081\u014e\3\2\2\2\u0083"+
		"\u0150\3\2\2\2\u0085\u015d\3\2\2\2\u0087\u016d\3\2\2\2\u0089\u008a\t\2"+
		"\2\2\u008a\4\3\2\2\2\u008b\u008c\t\3\2\2\u008c\6\3\2\2\2\u008d\u008e\t"+
		"\4\2\2\u008e\b\3\2\2\2\u008f\u0090\7a\2\2\u0090\n\3\2\2\2\u0091\u0092"+
		"\t\5\2\2\u0092\f\3\2\2\2\u0093\u0094\t\6\2\2\u0094\16\3\2\2\2\u0095\u0096"+
		"\t\7\2\2\u0096\20\3\2\2\2\u0097\u0098\t\b\2\2\u0098\22\3\2\2\2\u0099\u009a"+
		"\t\t\2\2\u009a\24\3\2\2\2\u009b\u009c\t\n\2\2\u009c\26\3\2\2\2\u009d\u009e"+
		"\t\13\2\2\u009e\30\3\2\2\2\u009f\u00a0\t\f\2\2\u00a0\32\3\2\2\2\u00a1"+
		"\u00a2\t\r\2\2\u00a2\34\3\2\2\2\u00a3\u00a4\t\16\2\2\u00a4\36\3\2\2\2"+
		"\u00a5\u00a6\t\17\2\2\u00a6 \3\2\2\2\u00a7\u00a8\t\20\2\2\u00a8\"\3\2"+
		"\2\2\u00a9\u00aa\t\21\2\2\u00aa$\3\2\2\2\u00ab\u00ac\t\22\2\2\u00ac&\3"+
		"\2\2\2\u00ad\u00ae\t\23\2\2\u00ae(\3\2\2\2\u00af\u00b0\t\24\2\2\u00b0"+
		"*\3\2\2\2\u00b1\u00b2\t\25\2\2\u00b2,\3\2\2\2\u00b3\u00b4\t\26\2\2\u00b4"+
		".\3\2\2\2\u00b5\u00b6\t\27\2\2\u00b6\60\3\2\2\2\u00b7\u00b8\t\30\2\2\u00b8"+
		"\62\3\2\2\2\u00b9\u00ba\t\31\2\2\u00ba\64\3\2\2\2\u00bb\u00bc\t\32\2\2"+
		"\u00bc\66\3\2\2\2\u00bd\u00be\t\33\2\2\u00be8\3\2\2\2\u00bf\u00c0\t\34"+
		"\2\2\u00c0:\3\2\2\2\u00c1\u00c2\t\35\2\2\u00c2<\3\2\2\2\u00c3\u00c4\t"+
		"\36\2\2\u00c4>\3\2\2\2\u00c5\u00c6\7.\2\2\u00c6@\3\2\2\2\u00c7\u00c8\7"+
		"=\2\2\u00c8B\3\2\2\2\u00c9\u00ca\7<\2\2\u00caD\3\2\2\2\u00cb\u00cc\7?"+
		"\2\2\u00ccF\3\2\2\2\u00cd\u00ce\7}\2\2\u00ceH\3\2\2\2\u00cf\u00d0\7\177"+
		"\2\2\u00d0J\3\2\2\2\u00d1\u00d2\7*\2\2\u00d2L\3\2\2\2\u00d3\u00d4\7+\2"+
		"\2\u00d4N\3\2\2\2\u00d5\u00d6\7-\2\2\u00d6P\3\2\2\2\u00d7\u00d8\7/\2\2"+
		"\u00d8R\3\2\2\2\u00d9\u00da\7\u0080\2\2\u00daT\3\2\2\2\u00db\u00dc\7~"+
		"\2\2\u00dc\u00dd\7~\2\2\u00ddV\3\2\2\2\u00de\u00df\7(\2\2\u00df\u00e0"+
		"\7(\2\2\u00e0X\3\2\2\2\u00e1\u00e2\7?\2\2\u00e2\u00e3\7?\2\2\u00e3Z\3"+
		"\2\2\2\u00e4\u00e5\7#\2\2\u00e5\u00e6\7?\2\2\u00e6\\\3\2\2\2\u00e7\u00e8"+
		"\7>\2\2\u00e8^\3\2\2\2\u00e9\u00ea\7>\2\2\u00ea\u00eb\7?\2\2\u00eb`\3"+
		"\2\2\2\u00ec\u00ed\7@\2\2\u00edb\3\2\2\2\u00ee\u00ef\7@\2\2\u00ef\u00f0"+
		"\7?\2\2\u00f0d\3\2\2\2\u00f1\u00f2\5\65\33\2\u00f2\u00f3\5\13\6\2\u00f3"+
		"\u00f4\5-\27\2\u00f4f\3\2\2\2\u00f5\u00f6\5\17\b\2\u00f6\u00f7\5\'\24"+
		"\2\u00f7\u00f8\5%\23\2\u00f8\u00f9\5/\30\2\u00f9\u00fa\5\61\31\2\u00fa"+
		"h\3\2\2\2\u00fb\u00fc\5-\27\2\u00fc\u00fd\5\23\n\2\u00fd\u00fe\5\61\31"+
		"\2\u00fe\u00ff\5\63\32\2\u00ff\u0100\5-\27\2\u0100\u0101\5%\23\2\u0101"+
		"j\3\2\2\2\u0102\u0103\5\33\16\2\u0103\u0104\5%\23\2\u0104\u0105\5\61\31"+
		"\2\u0105\u0106\5\23\n\2\u0106\u0107\5\27\f\2\u0107\u0108\5\23\n\2\u0108"+
		"\u0109\5-\27\2\u0109l\3\2\2\2\u010a\u010b\5\r\7\2\u010b\u010c\5\'\24\2"+
		"\u010c\u010d\5\'\24\2\u010d\u010e\5!\21\2\u010e\u010f\5\23\n\2\u010f\u0110"+
		"\5\13\6\2\u0110\u0111\5%\23\2\u0111n\3\2\2\2\u0112\u0113\5\65\33\2\u0113"+
		"\u0114\5\'\24\2\u0114\u0115\5\33\16\2\u0115\u0116\5\21\t\2\u0116p\3\2"+
		"\2\2\u0117\u0118\5#\22\2\u0118\u0119\5\13\6\2\u0119\u011a\5\33\16\2\u011a"+
		"\u011b\5%\23\2\u011br\3\2\2\2\u011c\u011d\5\33\16\2\u011d\u011e\5\25\13"+
		"\2\u011et\3\2\2\2\u011f\u0120\5\23\n\2\u0120\u0121\5!\21\2\u0121\u0122"+
		"\5/\30\2\u0122\u0123\5\23\n\2\u0123v\3\2\2\2\u0124\u0125\5\61\31\2\u0125"+
		"\u0126\5-\27\2\u0126\u0127\5\63\32\2\u0127\u0128\5\23\n\2\u0128x\3\2\2"+
		"\2\u0129\u012a\5\25\13\2\u012a\u012b\5\13\6\2\u012b\u012c\5!\21\2\u012c"+
		"\u012d\5/\30\2\u012d\u012e\5\23\n\2\u012ez\3\2\2\2\u012f\u0130\5\67\34"+
		"\2\u0130\u0131\5\31\r\2\u0131\u0132\5\33\16\2\u0132\u0133\5!\21\2\u0133"+
		"\u0134\5\23\n\2\u0134|\3\2\2\2\u0135\u0136\5/\30\2\u0136\u0137\5\37\20"+
		"\2\u0137\u0138\5\33\16\2\u0138\u0139\5)\25\2\u0139~\3\2\2\2\u013a\u0140"+
		"\5\7\4\2\u013b\u013f\5\7\4\2\u013c\u013f\5\3\2\2\u013d\u013f\5\t\5\2\u013e"+
		"\u013b\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2"+
		"\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0080\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0143\u014f\5\3\2\2\u0144\u0146\5Q)\2\u0145\u0144\3\2\2"+
		"\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u014b\5\5\3\2\u0148\u014a"+
		"\5\3\2\2\u0149\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u0143\3\2"+
		"\2\2\u014e\u0145\3\2\2\2\u014f\u0082\3\2\2\2\u0150\u0151\7\61\2\2\u0151"+
		"\u0152\7\61\2\2\u0152\u0156\3\2\2\2\u0153\u0155\13\2\2\2\u0154\u0153\3"+
		"\2\2\2\u0155\u0158\3\2\2\2\u0156\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157"+
		"\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a\7\f\2\2\u015a\u015b\3\2"+
		"\2\2\u015b\u015c\bB\2\2\u015c\u0084\3\2\2\2\u015d\u015e\7\61\2\2\u015e"+
		"\u015f\7,\2\2\u015f\u0164\3\2\2\2\u0160\u0163\5\u0085C\2\u0161\u0163\13"+
		"\2\2\2\u0162\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163\u0166\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0164\3\2"+
		"\2\2\u0167\u0168\7,\2\2\u0168\u0169\7\61\2\2\u0169\u016a\3\2\2\2\u016a"+
		"\u016b\bC\2\2\u016b\u0086\3\2\2\2\u016c\u016e\t\37\2\2\u016d\u016c\3\2"+
		"\2\2\u016e\u016f\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u0172\bD\2\2\u0172\u0088\3\2\2\2\f\2\u013e\u0140"+
		"\u0145\u014b\u014e\u0156\u0162\u0164\u016f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}