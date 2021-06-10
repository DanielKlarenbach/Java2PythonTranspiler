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
		DOT=9, QUOTE=10, SINGLEQUOTE=11, ASSIGN=12, GT=13, LT=14, BANG=15, EQUAL=16, 
		LE=17, GE=18, NOTEQUAL=19, AND=20, OR=21, INC=22, DEC=23, ADD=24, SUB=25, 
		MUL=26, MOD=27, DIV=28, POW=29, BOOLEAN=30, INT=31, FLOAT=32, VOID=33, 
		CHAR=34, STRING=35, ELSE=36, ELSEIF=37, FOR=38, IF=39, WHILE=40, BREAK=41, 
		RETURN=42, PRIVATE=43, PUBLIC=44, TRUE=45, FALSE=46, DO=47, NULL_LITERAL=48, 
		INT_LITERAL=49, FLOAT_LITERAL=50, WHITESPACE=51, CHAR_LITERAL=52, IDENTIFIER=53;
	public static final int
		RULE_program = 0, RULE_methodDeclaration = 1, RULE_modifier = 2, RULE_methodType = 3, 
		RULE_parameter = 4, RULE_statementList = 5, RULE_block = 6, RULE_statement = 7, 
		RULE_variableDeclaration = 8, RULE_assignment = 9, RULE_forControl = 10, 
		RULE_expression = 11, RULE_primary = 12, RULE_type = 13, RULE_literal = 14, 
		RULE_stringLiteral = 15, RULE_charLiteral = 16, RULE_boolLiteral = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "methodDeclaration", "modifier", "methodType", "parameter", 
			"statementList", "block", "statement", "variableDeclaration", "assignment", 
			"forControl", "expression", "primary", "type", "literal", "stringLiteral", 
			"charLiteral", "boolLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", 
			"'\"'", "'''", "'='", "'>'", "'<'", "'!'", "'=='", "'<='", "'>='", "'!='", 
			"'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'%'", "'/'", "'^'", 
			"'boolean'", "'int'", "'float'", "'void'", "'char'", "'String'", "'else'", 
			"'else if'", "'for'", "'if'", "'while'", "'break'", "'return'", "'private'", 
			"'public'", "'true'", "'false'", "'do'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", 
			"COMMA", "DOT", "QUOTE", "SINGLEQUOTE", "ASSIGN", "GT", "LT", "BANG", 
			"EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", 
			"MUL", "MOD", "DIV", "POW", "BOOLEAN", "INT", "FLOAT", "VOID", "CHAR", 
			"STRING", "ELSE", "ELSEIF", "FOR", "IF", "WHILE", "BREAK", "RETURN", 
			"PRIVATE", "PUBLIC", "TRUE", "FALSE", "DO", "NULL_LITERAL", "INT_LITERAL", 
			"FLOAT_LITERAL", "WHITESPACE", "CHAR_LITERAL", "IDENTIFIER"
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
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<StatementListContext> statementList() {
			return getRuleContexts(StatementListContext.class);
		}
		public StatementListContext statementList(int i) {
			return getRuleContext(StatementListContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(38);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRIVATE:
				case PUBLIC:
					{
					setState(36);
					methodDeclaration();
					}
					break;
				case LPAREN:
				case LBRACE:
				case SEMI:
				case QUOTE:
				case SINGLEQUOTE:
				case BOOLEAN:
				case INT:
				case FLOAT:
				case CHAR:
				case STRING:
				case FOR:
				case IF:
				case WHILE:
				case BREAK:
				case RETURN:
				case TRUE:
				case FALSE:
				case NULL_LITERAL:
				case INT_LITERAL:
				case FLOAT_LITERAL:
				case IDENTIFIER:
					{
					setState(37);
					statementList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << QUOTE) | (1L << SINGLEQUOTE) | (1L << BOOLEAN) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING) | (1L << FOR) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << RETURN) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << TRUE) | (1L << FALSE) | (1L << NULL_LITERAL) | (1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << IDENTIFIER))) != 0) );
			setState(42);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public MethodTypeContext methodType() {
			return getRuleContext(MethodTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(Java11Parser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(Java11Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java11Parser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
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
		enterRule(_localctx, 2, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			modifier();
			setState(45);
			methodType();
			setState(46);
			match(IDENTIFIER);
			setState(47);
			match(LPAREN);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING))) != 0)) {
				{
				setState(48);
				parameter();
				}
			}

			setState(51);
			match(RPAREN);
			setState(52);
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
		enterRule(_localctx, 4, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
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

	public static class MethodTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(Java11Parser.VOID, 0); }
		public MethodTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java11Visitor ) return ((Java11Visitor<? extends T>)visitor).visitMethodType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodTypeContext methodType() throws RecognitionException {
		MethodTypeContext _localctx = new MethodTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodType);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INT:
			case FLOAT:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
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

	public static class ParameterContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(Java11Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Java11Parser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java11Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java11Parser.COMMA, i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java11Visitor ) return ((Java11Visitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			type();
			setState(61);
			match(IDENTIFIER);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(62);
				match(COMMA);
				setState(63);
				type();
				setState(64);
				match(IDENTIFIER);
				}
				}
				setState(70);
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

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java11Visitor ) return ((Java11Visitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(71);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(74); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java11Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java11Parser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(LBRACE);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << QUOTE) | (1L << SINGLEQUOTE) | (1L << BOOLEAN) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING) | (1L << FOR) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << RETURN) | (1L << TRUE) | (1L << FALSE) | (1L << NULL_LITERAL) | (1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(77);
				statement();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
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
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(Java11Parser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(Java11Parser.FOR, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(Java11Parser.WHILE, 0); }
		public TerminalNode RETURN() { return getToken(Java11Parser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(Java11Parser.BREAK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Java11Parser.IDENTIFIER, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
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
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				assignment();
				setState(86);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(IF);
				setState(89);
				match(LPAREN);
				setState(90);
				expression(0);
				setState(91);
				match(RPAREN);
				setState(92);
				block();
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(93);
					match(ELSE);
					setState(94);
					block();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				match(FOR);
				setState(98);
				match(LPAREN);
				setState(99);
				forControl();
				setState(100);
				match(RPAREN);
				setState(101);
				block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				match(WHILE);
				setState(104);
				match(LPAREN);
				setState(105);
				expression(0);
				setState(106);
				match(RPAREN);
				setState(107);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				match(RETURN);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << QUOTE) | (1L << SINGLEQUOTE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL_LITERAL) | (1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(110);
					expression(0);
					}
				}

				setState(113);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(114);
				match(BREAK);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(115);
					match(IDENTIFIER);
					}
				}

				setState(118);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(119);
				variableDeclaration();
				setState(120);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(122);
				expression(0);
				setState(123);
				match(SEMI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(125);
				block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(126);
				match(SEMI);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(Java11Parser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 16, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			type();
			setState(130);
			match(IDENTIFIER);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(131);
				match(ASSIGN);
				setState(132);
				expression(0);
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
		enterRule(_localctx, 18, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(IDENTIFIER);
			setState(136);
			match(ASSIGN);
			setState(137);
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

	public static class ForControlContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(Java11Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(Java11Parser.SEMI, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 20, RULE_forControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			variableDeclaration();
			setState(140);
			match(SEMI);
			setState(141);
			expression(0);
			setState(142);
			match(SEMI);
			setState(143);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token bop;
		public Token postfix;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(Java11Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(Java11Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(Java11Parser.MOD, 0); }
		public TerminalNode ADD() { return getToken(Java11Parser.ADD, 0); }
		public TerminalNode SUB() { return getToken(Java11Parser.SUB, 0); }
		public TerminalNode LE() { return getToken(Java11Parser.LE, 0); }
		public TerminalNode GE() { return getToken(Java11Parser.GE, 0); }
		public TerminalNode GT() { return getToken(Java11Parser.GT, 0); }
		public TerminalNode LT() { return getToken(Java11Parser.LT, 0); }
		public TerminalNode EQUAL() { return getToken(Java11Parser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(Java11Parser.NOTEQUAL, 0); }
		public TerminalNode POW() { return getToken(Java11Parser.POW, 0); }
		public TerminalNode AND() { return getToken(Java11Parser.AND, 0); }
		public TerminalNode OR() { return getToken(Java11Parser.OR, 0); }
		public TerminalNode INC() { return getToken(Java11Parser.INC, 0); }
		public TerminalNode DEC() { return getToken(Java11Parser.DEC, 0); }
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(146);
			primary();
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(165);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(148);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(149);
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
						setState(150);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(151);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(152);
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
						setState(153);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(154);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(155);
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
						setState(156);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(157);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(158);
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
						setState(159);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(160);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(161);
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
						setState(162);
						expression(3);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(163);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(164);
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
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 24, RULE_primary);
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(LPAREN);
				setState(171);
				expression(0);
				setState(172);
				match(RPAREN);
				}
				break;
			case QUOTE:
			case SINGLEQUOTE:
			case TRUE:
			case FALSE:
			case NULL_LITERAL:
			case INT_LITERAL:
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(Java11Parser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(Java11Parser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(Java11Parser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(Java11Parser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(Java11Parser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java11Visitor ) return ((Java11Visitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
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
		public CharLiteralContext charLiteral() {
			return getRuleContext(CharLiteralContext.class,0);
		}
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
		enterRule(_localctx, 28, RULE_literal);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(NULL_LITERAL);
				}
				break;
			case INT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(INT_LITERAL);
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				match(FLOAT_LITERAL);
				}
				break;
			case SINGLEQUOTE:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				charLiteral();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				boolLiteral();
				}
				break;
			case QUOTE:
				enterOuterAlt(_localctx, 6);
				{
				setState(185);
				stringLiteral();
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

	public static class StringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> QUOTE() { return getTokens(Java11Parser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(Java11Parser.QUOTE, i);
		}
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
		enterRule(_localctx, 30, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(QUOTE);
			setState(190); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(189);
				match(CHAR_LITERAL);
				}
				}
				setState(192); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CHAR_LITERAL );
			setState(194);
			match(QUOTE);
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

	public static class CharLiteralContext extends ParserRuleContext {
		public List<TerminalNode> SINGLEQUOTE() { return getTokens(Java11Parser.SINGLEQUOTE); }
		public TerminalNode SINGLEQUOTE(int i) {
			return getToken(Java11Parser.SINGLEQUOTE, i);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(Java11Parser.CHAR_LITERAL, 0); }
		public CharLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java11Visitor ) return ((Java11Visitor<? extends T>)visitor).visitCharLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharLiteralContext charLiteral() throws RecognitionException {
		CharLiteralContext _localctx = new CharLiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_charLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(SINGLEQUOTE);
			setState(197);
			match(CHAR_LITERAL);
			setState(198);
			match(SINGLEQUOTE);
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
		enterRule(_localctx, 34, RULE_boolLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
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
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u00cd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\6\2)\n\2\r\2\16\2*\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\64\n\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\5\5=\n\5\3\6\3\6\3\6\3\6\3\6\3\6\7"+
		"\6E\n\6\f\6\16\6H\13\6\3\7\6\7K\n\7\r\7\16\7L\3\b\3\b\7\bQ\n\b\f\b\16"+
		"\bT\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tb\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tr\n\t\3\t\3\t"+
		"\3\t\5\tw\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0082\n\t\3\n\3"+
		"\n\3\n\3\n\5\n\u0088\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\7\r\u00a8\n\r\f\r\16\r\u00ab\13\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u00b3\n\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00bd"+
		"\n\20\3\21\3\21\6\21\u00c1\n\21\r\21\16\21\u00c2\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\2\3\30\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$\2\13\3\2-.\3\2\34\36\3\2\32\33\4\2\17\20\23\24\4\2\22\22\25\25"+
		"\4\2\26\27\37\37\3\2\30\31\4\2 \"$%\3\2/\60\2\u00dc\2(\3\2\2\2\4.\3\2"+
		"\2\2\68\3\2\2\2\b<\3\2\2\2\n>\3\2\2\2\fJ\3\2\2\2\16N\3\2\2\2\20\u0081"+
		"\3\2\2\2\22\u0083\3\2\2\2\24\u0089\3\2\2\2\26\u008d\3\2\2\2\30\u0093\3"+
		"\2\2\2\32\u00b2\3\2\2\2\34\u00b4\3\2\2\2\36\u00bc\3\2\2\2 \u00be\3\2\2"+
		"\2\"\u00c6\3\2\2\2$\u00ca\3\2\2\2&)\5\4\3\2\')\5\f\7\2(&\3\2\2\2(\'\3"+
		"\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+,\3\2\2\2,-\7\2\2\3-\3\3\2\2\2./"+
		"\5\6\4\2/\60\5\b\5\2\60\61\7\67\2\2\61\63\7\3\2\2\62\64\5\n\6\2\63\62"+
		"\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\7\4\2\2\66\67\5\16\b\2\67\5"+
		"\3\2\2\289\t\2\2\29\7\3\2\2\2:=\5\34\17\2;=\7#\2\2<:\3\2\2\2<;\3\2\2\2"+
		"=\t\3\2\2\2>?\5\34\17\2?F\7\67\2\2@A\7\n\2\2AB\5\34\17\2BC\7\67\2\2CE"+
		"\3\2\2\2D@\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\13\3\2\2\2HF\3\2\2\2"+
		"IK\5\20\t\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\r\3\2\2\2NR\7\5\2"+
		"\2OQ\5\20\t\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2"+
		"\2\2UV\7\6\2\2V\17\3\2\2\2WX\5\24\13\2XY\7\t\2\2Y\u0082\3\2\2\2Z[\7)\2"+
		"\2[\\\7\3\2\2\\]\5\30\r\2]^\7\4\2\2^a\5\16\b\2_`\7&\2\2`b\5\16\b\2a_\3"+
		"\2\2\2ab\3\2\2\2b\u0082\3\2\2\2cd\7(\2\2de\7\3\2\2ef\5\26\f\2fg\7\4\2"+
		"\2gh\5\16\b\2h\u0082\3\2\2\2ij\7*\2\2jk\7\3\2\2kl\5\30\r\2lm\7\4\2\2m"+
		"n\5\16\b\2n\u0082\3\2\2\2oq\7,\2\2pr\5\30\r\2qp\3\2\2\2qr\3\2\2\2rs\3"+
		"\2\2\2s\u0082\7\t\2\2tv\7+\2\2uw\7\67\2\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2"+
		"\2x\u0082\7\t\2\2yz\5\22\n\2z{\7\t\2\2{\u0082\3\2\2\2|}\5\30\r\2}~\7\t"+
		"\2\2~\u0082\3\2\2\2\177\u0082\5\16\b\2\u0080\u0082\7\t\2\2\u0081W\3\2"+
		"\2\2\u0081Z\3\2\2\2\u0081c\3\2\2\2\u0081i\3\2\2\2\u0081o\3\2\2\2\u0081"+
		"t\3\2\2\2\u0081y\3\2\2\2\u0081|\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080"+
		"\3\2\2\2\u0082\21\3\2\2\2\u0083\u0084\5\34\17\2\u0084\u0087\7\67\2\2\u0085"+
		"\u0086\7\16\2\2\u0086\u0088\5\30\r\2\u0087\u0085\3\2\2\2\u0087\u0088\3"+
		"\2\2\2\u0088\23\3\2\2\2\u0089\u008a\7\67\2\2\u008a\u008b\7\16\2\2\u008b"+
		"\u008c\5\30\r\2\u008c\25\3\2\2\2\u008d\u008e\5\22\n\2\u008e\u008f\7\t"+
		"\2\2\u008f\u0090\5\30\r\2\u0090\u0091\7\t\2\2\u0091\u0092\5\30\r\2\u0092"+
		"\27\3\2\2\2\u0093\u0094\b\r\1\2\u0094\u0095\5\32\16\2\u0095\u00a9\3\2"+
		"\2\2\u0096\u0097\f\b\2\2\u0097\u0098\t\3\2\2\u0098\u00a8\5\30\r\t\u0099"+
		"\u009a\f\7\2\2\u009a\u009b\t\4\2\2\u009b\u00a8\5\30\r\b\u009c\u009d\f"+
		"\6\2\2\u009d\u009e\t\5\2\2\u009e\u00a8\5\30\r\7\u009f\u00a0\f\5\2\2\u00a0"+
		"\u00a1\t\6\2\2\u00a1\u00a8\5\30\r\6\u00a2\u00a3\f\4\2\2\u00a3\u00a4\t"+
		"\7\2\2\u00a4\u00a8\5\30\r\5\u00a5\u00a6\f\t\2\2\u00a6\u00a8\t\b\2\2\u00a7"+
		"\u0096\3\2\2\2\u00a7\u0099\3\2\2\2\u00a7\u009c\3\2\2\2\u00a7\u009f\3\2"+
		"\2\2\u00a7\u00a2\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\31\3\2\2\2\u00ab\u00a9\3\2\2"+
		"\2\u00ac\u00ad\7\3\2\2\u00ad\u00ae\5\30\r\2\u00ae\u00af\7\4\2\2\u00af"+
		"\u00b3\3\2\2\2\u00b0\u00b3\5\36\20\2\u00b1\u00b3\7\67\2\2\u00b2\u00ac"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\33\3\2\2\2\u00b4"+
		"\u00b5\t\t\2\2\u00b5\35\3\2\2\2\u00b6\u00bd\7\62\2\2\u00b7\u00bd\7\63"+
		"\2\2\u00b8\u00bd\7\64\2\2\u00b9\u00bd\5\"\22\2\u00ba\u00bd\5$\23\2\u00bb"+
		"\u00bd\5 \21\2\u00bc\u00b6\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bc\u00b8\3\2"+
		"\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\37\3\2\2\2\u00be\u00c0\7\f\2\2\u00bf\u00c1\7\66\2\2\u00c0\u00bf\3\2\2"+
		"\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4\u00c5\7\f\2\2\u00c5!\3\2\2\2\u00c6\u00c7\7\r\2\2\u00c7"+
		"\u00c8\7\66\2\2\u00c8\u00c9\7\r\2\2\u00c9#\3\2\2\2\u00ca\u00cb\t\n\2\2"+
		"\u00cb%\3\2\2\2\23(*\63<FLRaqv\u0081\u0087\u00a7\u00a9\u00b2\u00bc\u00c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}