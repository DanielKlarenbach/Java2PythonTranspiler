// Generated from Java11.g4 by ANTLR 4.9.2
package klarenbach.daniel.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Java11Parser extends Parser {
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
		CHAR_LITERAL=49, IDENTIFIER=50, DO=51;
	public static final int
		RULE_program = 0, RULE_stringLiteral = 1, RULE_boolLiteral = 2, RULE_basicType = 3, 
		RULE_literal = 4, RULE_basicTypeVoid = 5, RULE_modifier = 6, RULE_methodDeclaration = 7, 
		RULE_param = 8, RULE_block = 9, RULE_blockStatement = 10, RULE_statement = 11, 
		RULE_expressionList = 12, RULE_methodCall = 13, RULE_forControl = 14, 
		RULE_forInit = 15, RULE_variableDeclaration = 16, RULE_expression = 17, 
		RULE_primary = 18, RULE_assignment = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stringLiteral", "boolLiteral", "basicType", "literal", "basicTypeVoid", 
			"modifier", "methodDeclaration", "param", "block", "blockStatement", 
			"statement", "expressionList", "methodCall", "forControl", "forInit", 
			"variableDeclaration", "expression", "primary", "assignment"
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
			"IDENTIFIER", "DO"
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

	@Override
	public String getGrammarFileName() { return "Java11.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Java11Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Java11Parser.EOF, 0); }
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java11Visitor ) return ((Java11Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIVATE:
			case PUBLIC:
				{
				setState(40);
				methodDeclaration();
				}
				break;
			case BOOLEAN:
			case INT:
			case FLOAT:
			case CHAR:
			case STRING:
				{
				setState(41);
				variableDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(44);
			match(EOF);
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

	public static class StringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> CHAR_LITERAL() { return getTokens(Java11Parser.CHAR_LITERAL); }
		public TerminalNode CHAR_LITERAL(int i) {
			return getToken(Java11Parser.CHAR_LITERAL, i);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java11Visitor ) return ((Java11Visitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stringLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(46);
					match(CHAR_LITERAL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(49); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class BoolLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(Java11Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Java11Parser.FALSE, 0); }
		public BoolLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java11Visitor ) return ((Java11Visitor<? extends T>)visitor).visitBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolLiteralContext boolLiteral() throws RecognitionException {
		BoolLiteralContext _localctx = new BoolLiteralContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_boolLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class BasicTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(Java11Parser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(Java11Parser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(Java11Parser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(Java11Parser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(Java11Parser.STRING, 0); }
		public BasicTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java11Visitor ) return ((Java11Visitor<? extends T>)visitor).visitBasicType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicTypeContext basicType() throws RecognitionException {
		BasicTypeContext _localctx = new BasicTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_basicType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NULL_LITERAL() { return getToken(Java11Parser.NULL_LITERAL, 0); }
		public TerminalNode INT_LITERAL() { return getToken(Java11Parser.INT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(Java11Parser.FLOAT_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(Java11Parser.CHAR_LITERAL, 0); }
		public BoolLiteralContext boolLiteral() {
			return getRuleContext(BoolLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java11Visitor ) return ((Java11Visitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_literal);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(NULL_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(INT_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				match(FLOAT_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				match(CHAR_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				boolLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(60);
				stringLiteral();
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

	public static class BasicTypeVoidContext extends ParserRuleContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(Java11Parser.VOID, 0); }
		public BasicTypeVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicTypeVoid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java11Visitor ) return ((Java11Visitor<? extends T>)visitor).visitBasicTypeVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicTypeVoidContext basicTypeVoid() throws RecognitionException {
		BasicTypeVoidContext _localctx = new BasicTypeVoidContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_basicTypeVoid);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INT:
			case FLOAT:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				basicType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(VOID);
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

	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(Java11Parser.PRIVATE, 0); }
		public TerminalNode PUBLIC() { return getToken(Java11Parser.PUBLIC, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java11Visitor ) return ((Java11Visitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ( !(_la==PRIVATE || _la==PUBLIC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public BasicTypeVoidContext basicTypeVoid() {
			return getRuleContext(BasicTypeVoidContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(Java11Parser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(Java11Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java11Parser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java11Visitor ) return ((Java11Visitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			modifier();
			setState(70);
			basicTypeVoid();
			setState(71);
			match(IDENTIFIER);
			setState(72);
			match(LPAREN);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING))) != 0)) {
				{
				setState(73);
				param();
				}
			}

			setState(76);
			match(RPAREN);
			setState(77);
			block();
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

	public static class ParamContext extends ParserRuleContext {
		public List<BasicTypeContext> basicType() {
			return getRuleContexts(BasicTypeContext.class);
		}
		public BasicTypeContext basicType(int i) {
			return getRuleContext(BasicTypeContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(Java11Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Java11Parser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java11Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java11Parser.COMMA, i);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java11Visitor ) return ((Java11Visitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			basicType();
			setState(80);
			match(IDENTIFIER);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(81);
				match(COMMA);
				setState(82);
				basicType();
				setState(83);
				match(IDENTIFIER);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java11Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java11Parser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java11Visitor ) return ((Java11Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(LBRACE);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << SEMI) | (1L << BOOLEAN) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING) | (1L << FOR) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << RETURN) | (1L << IDENTIFIER) | (1L << DO))) != 0)) {
				{
				{
				setState(91);
				blockStatement();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			match(RBRACE);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java11Parser.SEMI, 0); }
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java11Visitor ) return ((Java11Visitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_blockStatement);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
			case SEMI:
			case FOR:
			case IF:
			case WHILE:
			case BREAK:
			case RETURN:
			case IDENTIFIER:
			case DO:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				statement();
				}
				break;
			case BOOLEAN:
			case INT:
			case FLOAT:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				variableDeclaration();
				setState(101);
				match(SEMI);
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

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java11Parser.SEMI, 0); }
		public TerminalNode IF() { return getToken(Java11Parser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(Java11Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java11Parser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(Java11Parser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(Java11Parser.FOR, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(Java11Parser.WHILE, 0); }
		public TerminalNode DO() { return getToken(Java11Parser.DO, 0); }
		public TerminalNode RETURN() { return getToken(Java11Parser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(Java11Parser.BREAK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Java11Parser.IDENTIFIER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java11Visitor ) return ((Java11Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				assignment();
				setState(106);
				match(SEMI);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(IF);
				setState(109);
				match(LPAREN);
				setState(110);
				expression(0);
				setState(111);
				match(RPAREN);
				setState(112);
				statement();
				setState(115);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(113);
					match(ELSE);
					setState(114);
					statement();
					}
					break;
				}
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(FOR);
				setState(118);
				match(LPAREN);
				setState(119);
				forControl();
				setState(120);
				match(RPAREN);
				setState(121);
				statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				match(WHILE);
				setState(124);
				match(LPAREN);
				setState(125);
				expression(0);
				setState(126);
				match(RPAREN);
				setState(127);
				statement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 5);
				{
				setState(129);
				match(DO);
				setState(130);
				statement();
				setState(131);
				match(WHILE);
				setState(132);
				match(LPAREN);
				setState(133);
				expression(0);
				setState(134);
				match(RPAREN);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(136);
				match(RETURN);
				setState(138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(137);
					expression(0);
					}
					break;
				}
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(140);
				match(BREAK);
				setState(142);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(141);
					match(IDENTIFIER);
					}
					break;
				}
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 8);
				{
				setState(144);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 9);
				{
				setState(145);
				match(SEMI);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java11Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java11Parser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java11Visitor ) return ((Java11Visitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			expression(0);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(149);
				match(COMMA);
				setState(150);
				expression(0);
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Java11Parser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(Java11Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java11Parser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java11Visitor ) return ((Java11Visitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(IDENTIFIER);
			setState(157);
			match(LPAREN);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << TRUE) | (1L << FALSE) | (1L << NULL_LITERAL) | (1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << CHAR_LITERAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(158);
				expressionList();
				}
			}

			setState(161);
			match(RPAREN);
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

	public static class ForControlContext extends ParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(Java11Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(Java11Parser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java11Visitor ) return ((Java11Visitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << BOOLEAN) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << NULL_LITERAL) | (1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << CHAR_LITERAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(163);
				forInit();
				}
			}

			setState(166);
			match(SEMI);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << TRUE) | (1L << FALSE) | (1L << NULL_LITERAL) | (1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << CHAR_LITERAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(167);
				expression(0);
				}
			}

			setState(170);
			match(SEMI);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << TRUE) | (1L << FALSE) | (1L << NULL_LITERAL) | (1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << CHAR_LITERAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(171);
				expressionList();
				}
			}

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

	public static class ForInitContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java11Visitor ) return ((Java11Visitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forInit);
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INT:
			case FLOAT:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				variableDeclaration();
				}
				break;
			case LPAREN:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case TRUE:
			case FALSE:
			case NULL_LITERAL:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case CHAR_LITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				expressionList();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(Java11Parser.IDENTIFIER, 0); }
		public TerminalNode SEMI() { return getToken(Java11Parser.SEMI, 0); }
		public TerminalNode ASSIGN() { return getToken(Java11Parser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java11Visitor ) return ((Java11Visitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			basicType();
			setState(179);
			match(IDENTIFIER);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(180);
				match(ASSIGN);
				setState(181);
				expression(0);
				}
			}

			setState(184);
			match(SEMI);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token prefix;
		public Token bop;
		public Token postfix;
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(Java11Parser.ADD, 0); }
		public TerminalNode SUB() { return getToken(Java11Parser.SUB, 0); }
		public TerminalNode INC() { return getToken(Java11Parser.INC, 0); }
		public TerminalNode DEC() { return getToken(Java11Parser.DEC, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode MUL() { return getToken(Java11Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(Java11Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(Java11Parser.MOD, 0); }
		public TerminalNode LE() { return getToken(Java11Parser.LE, 0); }
		public TerminalNode GE() { return getToken(Java11Parser.GE, 0); }
		public TerminalNode GT() { return getToken(Java11Parser.GT, 0); }
		public TerminalNode LT() { return getToken(Java11Parser.LT, 0); }
		public TerminalNode EQUAL() { return getToken(Java11Parser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(Java11Parser.NOTEQUAL, 0); }
		public TerminalNode POW() { return getToken(Java11Parser.POW, 0); }
		public TerminalNode AND() { return getToken(Java11Parser.AND, 0); }
		public TerminalNode OR() { return getToken(Java11Parser.OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java11Visitor ) return ((Java11Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(187);
				methodCall();
				}
				break;
			case 2:
				{
				setState(188);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(189);
				expression(7);
				}
				break;
			case 3:
				{
				setState(190);
				primary();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(194);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << MOD) | (1L << DIV))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(195);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(197);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(198);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(200);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(201);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(202);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(203);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(204);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(205);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(206);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << POW))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(207);
						expression(3);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(209);
						((ExpressionContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((ExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Java11Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java11Parser.RPAREN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(Java11Parser.IDENTIFIER, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java11Visitor ) return ((Java11Visitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_primary);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(LPAREN);
				setState(216);
				expression(0);
				setState(217);
				match(RPAREN);
				}
				break;
			case TRUE:
			case FALSE:
			case NULL_LITERAL:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(IDENTIFIER);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Java11Parser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(Java11Parser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java11Visitor ) return ((Java11Visitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(IDENTIFIER);
			setState(224);
			match(ASSIGN);
			setState(225);
			expression(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u00e6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\5\2-\n\2\3\2\3\2\3\3\6\3\62\n\3"+
		"\r\3\16\3\63\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6@\n\6\3\7\3\7"+
		"\5\7D\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\tM\n\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\7\nX\n\n\f\n\16\n[\13\n\3\13\3\13\7\13_\n\13\f\13\16\13b"+
		"\13\13\3\13\3\13\3\f\3\f\3\f\3\f\5\fj\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\rv\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008d\n\r\3\r\3\r\5\r\u0091\n"+
		"\r\3\r\3\r\5\r\u0095\n\r\3\16\3\16\3\16\7\16\u009a\n\16\f\16\16\16\u009d"+
		"\13\16\3\17\3\17\3\17\5\17\u00a2\n\17\3\17\3\17\3\20\5\20\u00a7\n\20\3"+
		"\20\3\20\5\20\u00ab\n\20\3\20\3\20\5\20\u00af\n\20\3\21\3\21\5\21\u00b3"+
		"\n\21\3\22\3\22\3\22\3\22\5\22\u00b9\n\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u00c2\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00d5\n\23\f\23\16\23\u00d8\13"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00e0\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\2\3$\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\f\3\2./\4"+
		"\2\36 \"#\3\2+,\3\2\26\31\3\2\32\34\3\2\30\31\4\2\r\16\21\22\4\2\20\20"+
		"\23\23\4\2\24\25\35\35\3\2\26\27\2\u00f9\2,\3\2\2\2\4\61\3\2\2\2\6\65"+
		"\3\2\2\2\b\67\3\2\2\2\n?\3\2\2\2\fC\3\2\2\2\16E\3\2\2\2\20G\3\2\2\2\22"+
		"Q\3\2\2\2\24\\\3\2\2\2\26i\3\2\2\2\30\u0094\3\2\2\2\32\u0096\3\2\2\2\34"+
		"\u009e\3\2\2\2\36\u00a6\3\2\2\2 \u00b2\3\2\2\2\"\u00b4\3\2\2\2$\u00c1"+
		"\3\2\2\2&\u00df\3\2\2\2(\u00e1\3\2\2\2*-\5\20\t\2+-\5\"\22\2,*\3\2\2\2"+
		",+\3\2\2\2-.\3\2\2\2./\7\2\2\3/\3\3\2\2\2\60\62\7\63\2\2\61\60\3\2\2\2"+
		"\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\5\3\2\2\2\65\66\t\2\2\2"+
		"\66\7\3\2\2\2\678\t\3\2\28\t\3\2\2\29@\7\60\2\2:@\7\61\2\2;@\7\62\2\2"+
		"<@\7\63\2\2=@\5\6\4\2>@\5\4\3\2?9\3\2\2\2?:\3\2\2\2?;\3\2\2\2?<\3\2\2"+
		"\2?=\3\2\2\2?>\3\2\2\2@\13\3\2\2\2AD\5\b\5\2BD\7!\2\2CA\3\2\2\2CB\3\2"+
		"\2\2D\r\3\2\2\2EF\t\4\2\2F\17\3\2\2\2GH\5\16\b\2HI\5\f\7\2IJ\7\64\2\2"+
		"JL\7\3\2\2KM\5\22\n\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\4\2\2OP\5\24\13"+
		"\2P\21\3\2\2\2QR\5\b\5\2RY\7\64\2\2ST\7\n\2\2TU\5\b\5\2UV\7\64\2\2VX\3"+
		"\2\2\2WS\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\23\3\2\2\2[Y\3\2\2\2\\"+
		"`\7\5\2\2]_\5\26\f\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2"+
		"b`\3\2\2\2cd\7\6\2\2d\25\3\2\2\2ej\5\30\r\2fg\5\"\22\2gh\7\t\2\2hj\3\2"+
		"\2\2ie\3\2\2\2if\3\2\2\2j\27\3\2\2\2kl\5(\25\2lm\7\t\2\2m\u0095\3\2\2"+
		"\2no\7\'\2\2op\7\3\2\2pq\5$\23\2qr\7\4\2\2ru\5\30\r\2st\7$\2\2tv\5\30"+
		"\r\2us\3\2\2\2uv\3\2\2\2v\u0095\3\2\2\2wx\7&\2\2xy\7\3\2\2yz\5\36\20\2"+
		"z{\7\4\2\2{|\5\30\r\2|\u0095\3\2\2\2}~\7(\2\2~\177\7\3\2\2\177\u0080\5"+
		"$\23\2\u0080\u0081\7\4\2\2\u0081\u0082\5\30\r\2\u0082\u0095\3\2\2\2\u0083"+
		"\u0084\7\65\2\2\u0084\u0085\5\30\r\2\u0085\u0086\7(\2\2\u0086\u0087\7"+
		"\3\2\2\u0087\u0088\5$\23\2\u0088\u0089\7\4\2\2\u0089\u0095\3\2\2\2\u008a"+
		"\u008c\7*\2\2\u008b\u008d\5$\23\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u0095\3\2\2\2\u008e\u0090\7)\2\2\u008f\u0091\7\64\2\2\u0090"+
		"\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0095\3\2\2\2\u0092\u0095\5\24"+
		"\13\2\u0093\u0095\7\t\2\2\u0094k\3\2\2\2\u0094n\3\2\2\2\u0094w\3\2\2\2"+
		"\u0094}\3\2\2\2\u0094\u0083\3\2\2\2\u0094\u008a\3\2\2\2\u0094\u008e\3"+
		"\2\2\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\31\3\2\2\2\u0096"+
		"\u009b\5$\23\2\u0097\u0098\7\n\2\2\u0098\u009a\5$\23\2\u0099\u0097\3\2"+
		"\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\33\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7\64\2\2\u009f\u00a1\7\3\2"+
		"\2\u00a0\u00a2\5\32\16\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a4\7\4\2\2\u00a4\35\3\2\2\2\u00a5\u00a7\5 \21"+
		"\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa"+
		"\7\t\2\2\u00a9\u00ab\5$\23\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ae\7\t\2\2\u00ad\u00af\5\32\16\2\u00ae\u00ad\3"+
		"\2\2\2\u00ae\u00af\3\2\2\2\u00af\37\3\2\2\2\u00b0\u00b3\5\"\22\2\u00b1"+
		"\u00b3\5\32\16\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3!\3\2\2"+
		"\2\u00b4\u00b5\5\b\5\2\u00b5\u00b8\7\64\2\2\u00b6\u00b7\7\f\2\2\u00b7"+
		"\u00b9\5$\23\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\u00bb\7\t\2\2\u00bb#\3\2\2\2\u00bc\u00bd\b\23\1\2\u00bd\u00c2"+
		"\5\34\17\2\u00be\u00bf\t\5\2\2\u00bf\u00c2\5$\23\t\u00c0\u00c2\5&\24\2"+
		"\u00c1\u00bc\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00d6"+
		"\3\2\2\2\u00c3\u00c4\f\b\2\2\u00c4\u00c5\t\6\2\2\u00c5\u00d5\5$\23\t\u00c6"+
		"\u00c7\f\7\2\2\u00c7\u00c8\t\7\2\2\u00c8\u00d5\5$\23\b\u00c9\u00ca\f\6"+
		"\2\2\u00ca\u00cb\t\b\2\2\u00cb\u00d5\5$\23\7\u00cc\u00cd\f\5\2\2\u00cd"+
		"\u00ce\t\t\2\2\u00ce\u00d5\5$\23\6\u00cf\u00d0\f\4\2\2\u00d0\u00d1\t\n"+
		"\2\2\u00d1\u00d5\5$\23\5\u00d2\u00d3\f\n\2\2\u00d3\u00d5\t\13\2\2\u00d4"+
		"\u00c3\3\2\2\2\u00d4\u00c6\3\2\2\2\u00d4\u00c9\3\2\2\2\u00d4\u00cc\3\2"+
		"\2\2\u00d4\u00cf\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7%\3\2\2\2\u00d8\u00d6\3\2\2\2"+
		"\u00d9\u00da\7\3\2\2\u00da\u00db\5$\23\2\u00db\u00dc\7\4\2\2\u00dc\u00e0"+
		"\3\2\2\2\u00dd\u00e0\5\n\6\2\u00de\u00e0\7\64\2\2\u00df\u00d9\3\2\2\2"+
		"\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\'\3\2\2\2\u00e1\u00e2\7"+
		"\64\2\2\u00e2\u00e3\7\f\2\2\u00e3\u00e4\5$\23\2\u00e4)\3\2\2\2\31,\63"+
		"?CLY`iu\u008c\u0090\u0094\u009b\u00a1\u00a6\u00aa\u00ae\u00b2\u00b8\u00c1"+
		"\u00d4\u00d6\u00df";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}