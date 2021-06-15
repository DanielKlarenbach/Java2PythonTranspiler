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
		TRUE=43, FALSE=44, DO=45, NULL_LITERAL=46, INT_LITERAL=47, FLOAT_LITERAL=48, 
		WHITESPACE=49, CHAR_LITERAL=50, IDENTIFIER=51, STRING_LITERAL=52;
	public static final int
		RULE_program = 0, RULE_methodDeclaration = 1, RULE_modifier = 2, RULE_methodType = 3, 
		RULE_parameter = 4, RULE_block = 5, RULE_statementList = 6, RULE_statement = 7, 
		RULE_methodInvocation = 8, RULE_argumentList = 9, RULE_variableDeclaration = 10, 
		RULE_assignment = 11, RULE_forControl = 12, RULE_expression = 13, RULE_postfixExpression = 14, 
		RULE_arthmeticExpression = 15, RULE_booleanExpression = 16, RULE_primary = 17, 
		RULE_type = 18, RULE_literal = 19, RULE_stringLiteral = 20, RULE_boolLiteral = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "methodDeclaration", "modifier", "methodType", "parameter", 
			"block", "statementList", "statement", "methodInvocation", "argumentList", 
			"variableDeclaration", "assignment", "forControl", "expression", "postfixExpression", 
			"arthmeticExpression", "booleanExpression", "primary", "type", "literal", 
			"stringLiteral", "boolLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", 
			"'='", "'>'", "'<'", "'!'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
			"'++'", "'--'", "'+'", "'-'", "'*'", "'%'", "'/'", "'^'", "'boolean'", 
			"'int'", "'float'", "'void'", "'char'", "'String'", "'else'", "'else if'", 
			"'for'", "'if'", "'while'", "'break'", "'return'", "'private'", "'public'", 
			"'true'", "'false'", "'do'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", 
			"COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "EQUAL", "LE", "GE", "NOTEQUAL", 
			"AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "MOD", "DIV", "POW", 
			"BOOLEAN", "INT", "FLOAT", "VOID", "CHAR", "STRING", "ELSE", "ELSEIF", 
			"FOR", "IF", "WHILE", "BREAK", "RETURN", "PRIVATE", "PUBLIC", "TRUE", 
			"FALSE", "DO", "NULL_LITERAL", "INT_LITERAL", "FLOAT_LITERAL", "WHITESPACE", 
			"CHAR_LITERAL", "IDENTIFIER", "STRING_LITERAL"
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
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(46);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRIVATE:
				case PUBLIC:
					{
					setState(44);
					methodDeclaration();
					}
					break;
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
				case CHAR_LITERAL:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(45);
					statementList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING) | (1L << FOR) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << RETURN) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << TRUE) | (1L << FALSE) | (1L << NULL_LITERAL) | (1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << CHAR_LITERAL) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0) );
			setState(50);
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
			setState(52);
			modifier();
			setState(53);
			methodType();
			setState(54);
			match(IDENTIFIER);
			setState(55);
			match(LPAREN);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING))) != 0)) {
				{
				setState(56);
				parameter();
				}
			}

			setState(59);
			match(RPAREN);
			setState(60);
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
			setState(62);
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
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INT:
			case FLOAT:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
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
			setState(68);
			type();
			setState(69);
			match(IDENTIFIER);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(70);
				match(COMMA);
				setState(71);
				type();
				setState(72);
				match(IDENTIFIER);
				}
				}
				setState(78);
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
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Java11Parser.RBRACE, 0); }
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
		enterRule(_localctx, 10, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(LBRACE);
			setState(80);
			statementList();
			setState(81);
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
		enterRule(_localctx, 12, RULE_statementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(83);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(86); 
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

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java11Parser.SEMI, 0); }
		public TerminalNode IF() { return getToken(Java11Parser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(Java11Parser.LPAREN, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(Java11Parser.BREAK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Java11Parser.IDENTIFIER, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
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
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				assignment();
				setState(89);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(IF);
				setState(92);
				match(LPAREN);
				setState(93);
				booleanExpression();
				setState(94);
				match(RPAREN);
				setState(95);
				block();
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(96);
					match(ELSE);
					setState(97);
					block();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(FOR);
				setState(101);
				match(LPAREN);
				setState(102);
				forControl();
				setState(103);
				match(RPAREN);
				setState(104);
				block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				match(WHILE);
				setState(107);
				match(LPAREN);
				setState(108);
				booleanExpression();
				setState(109);
				match(RPAREN);
				setState(110);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				match(RETURN);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL_LITERAL) | (1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << CHAR_LITERAL) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
					{
					setState(113);
					expression();
					}
				}

				setState(116);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
				match(BREAK);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(118);
					match(IDENTIFIER);
					}
				}

				setState(121);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(122);
				variableDeclaration();
				setState(123);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(125);
				postfixExpression();
				setState(126);
				match(SEMI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(128);
				methodInvocation();
				setState(129);
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

	public static class MethodInvocationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Java11Parser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(Java11Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java11Parser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java11Visitor ) return ((Java11Visitor<? extends T>)visitor).visitMethodInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(IDENTIFIER);
			setState(134);
			match(LPAREN);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL_LITERAL) | (1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << CHAR_LITERAL) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
				{
				setState(135);
				argumentList();
				}
			}

			setState(138);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Java11Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Java11Parser.IDENTIFIER, i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java11Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java11Parser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java11Visitor ) return ((Java11Visitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(140);
				match(IDENTIFIER);
				}
				break;
			case TRUE:
			case FALSE:
			case NULL_LITERAL:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
				{
				setState(141);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(144);
				match(COMMA);
				setState(147);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(145);
					match(IDENTIFIER);
					}
					break;
				case TRUE:
				case FALSE:
				case NULL_LITERAL:
				case INT_LITERAL:
				case FLOAT_LITERAL:
				case CHAR_LITERAL:
				case STRING_LITERAL:
					{
					setState(146);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(153);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(Java11Parser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(Java11Parser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
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
		enterRule(_localctx, 20, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			type();
			setState(155);
			match(IDENTIFIER);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(156);
				match(ASSIGN);
				setState(159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(157);
					expression();
					}
					break;
				case 2:
					{
					setState(158);
					methodInvocation();
					}
					break;
				}
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
		enterRule(_localctx, 22, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(IDENTIFIER);
			setState(164);
			match(ASSIGN);
			setState(165);
			expression();
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
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
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
		enterRule(_localctx, 24, RULE_forControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			variableDeclaration();
			setState(168);
			match(SEMI);
			setState(169);
			booleanExpression();
			setState(170);
			match(SEMI);
			setState(171);
			postfixExpression();
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
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ArthmeticExpressionContext arthmeticExpression() {
			return getRuleContext(ArthmeticExpressionContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
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
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				postfixExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				arthmeticExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				booleanExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				primary();
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

	public static class PostfixExpressionContext extends ParserRuleContext {
		public Token postfix;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode INC() { return getToken(Java11Parser.INC, 0); }
		public TerminalNode DEC() { return getToken(Java11Parser.DEC, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java11Visitor ) return ((Java11Visitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_postfixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			primary();
			setState(180);
			((PostfixExpressionContext)_localctx).postfix = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==INC || _la==DEC) ) {
				((PostfixExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
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

	public static class ArthmeticExpressionContext extends ParserRuleContext {
		public Token bop;
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public TerminalNode MUL() { return getToken(Java11Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(Java11Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(Java11Parser.MOD, 0); }
		public TerminalNode ADD() { return getToken(Java11Parser.ADD, 0); }
		public TerminalNode SUB() { return getToken(Java11Parser.SUB, 0); }
		public TerminalNode POW() { return getToken(Java11Parser.POW, 0); }
		public ArthmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arthmeticExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java11Visitor ) return ((Java11Visitor<? extends T>)visitor).visitArthmeticExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArthmeticExpressionContext arthmeticExpression() throws RecognitionException {
		ArthmeticExpressionContext _localctx = new ArthmeticExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arthmeticExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			primary();
			setState(183);
			((ArthmeticExpressionContext)_localctx).bop = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << MOD) | (1L << DIV) | (1L << POW))) != 0)) ) {
				((ArthmeticExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(184);
			primary();
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public Token bop;
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public TerminalNode LE() { return getToken(Java11Parser.LE, 0); }
		public TerminalNode GE() { return getToken(Java11Parser.GE, 0); }
		public TerminalNode GT() { return getToken(Java11Parser.GT, 0); }
		public TerminalNode LT() { return getToken(Java11Parser.LT, 0); }
		public TerminalNode EQUAL() { return getToken(Java11Parser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(Java11Parser.NOTEQUAL, 0); }
		public TerminalNode AND() { return getToken(Java11Parser.AND, 0); }
		public TerminalNode OR() { return getToken(Java11Parser.OR, 0); }
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java11Visitor ) return ((Java11Visitor<? extends T>)visitor).visitBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_booleanExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			primary();
			setState(187);
			((BooleanExpressionContext)_localctx).bop = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQUAL) | (1L << LE) | (1L << GE) | (1L << NOTEQUAL) | (1L << AND) | (1L << OR))) != 0)) ) {
				((BooleanExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(188);
			primary();
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

	public static class PrimaryContext extends ParserRuleContext {
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
		enterRule(_localctx, 34, RULE_primary);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NULL_LITERAL:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
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
		enterRule(_localctx, 36, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
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
		enterRule(_localctx, 38, RULE_literal);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(NULL_LITERAL);
				}
				break;
			case INT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(INT_LITERAL);
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(FLOAT_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				match(CHAR_LITERAL);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
				boolLiteral();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(201);
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
		public TerminalNode STRING_LITERAL() { return getToken(Java11Parser.STRING_LITERAL, 0); }
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
		enterRule(_localctx, 40, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(STRING_LITERAL);
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
		enterRule(_localctx, 42, RULE_boolLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u00d3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\6\2\61\n\2"+
		"\r\2\16\2\62\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\5\5E\n\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6M\n\6\f\6\16\6P\13\6\3\7"+
		"\3\7\3\7\3\7\3\b\6\bW\n\b\r\b\16\bX\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\te\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\tu\n\t\3\t\3\t\3\t\5\tz\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u0086\n\t\3\n\3\n\3\n\5\n\u008b\n\n\3\n\3\n\3\13\3\13\5\13\u0091"+
		"\n\13\3\13\3\13\3\13\5\13\u0096\n\13\7\13\u0098\n\13\f\13\16\13\u009b"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\5\f\u00a2\n\f\5\f\u00a4\n\f\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00b4\n\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u00c3"+
		"\n\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00cd\n\25\3\26\3\26"+
		"\3\27\3\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		"\2\b\3\2+,\3\2\26\27\3\2\30\35\4\2\r\16\20\25\4\2\36 \"#\3\2-.\2\u00dc"+
		"\2\60\3\2\2\2\4\66\3\2\2\2\6@\3\2\2\2\bD\3\2\2\2\nF\3\2\2\2\fQ\3\2\2\2"+
		"\16V\3\2\2\2\20\u0085\3\2\2\2\22\u0087\3\2\2\2\24\u0090\3\2\2\2\26\u009c"+
		"\3\2\2\2\30\u00a5\3\2\2\2\32\u00a9\3\2\2\2\34\u00b3\3\2\2\2\36\u00b5\3"+
		"\2\2\2 \u00b8\3\2\2\2\"\u00bc\3\2\2\2$\u00c2\3\2\2\2&\u00c4\3\2\2\2(\u00cc"+
		"\3\2\2\2*\u00ce\3\2\2\2,\u00d0\3\2\2\2.\61\5\4\3\2/\61\5\16\b\2\60.\3"+
		"\2\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\64\3\2"+
		"\2\2\64\65\7\2\2\3\65\3\3\2\2\2\66\67\5\6\4\2\678\5\b\5\289\7\65\2\29"+
		";\7\3\2\2:<\5\n\6\2;:\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\7\4\2\2>?\5\f\7\2"+
		"?\5\3\2\2\2@A\t\2\2\2A\7\3\2\2\2BE\5&\24\2CE\7!\2\2DB\3\2\2\2DC\3\2\2"+
		"\2E\t\3\2\2\2FG\5&\24\2GN\7\65\2\2HI\7\n\2\2IJ\5&\24\2JK\7\65\2\2KM\3"+
		"\2\2\2LH\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\13\3\2\2\2PN\3\2\2\2Q"+
		"R\7\5\2\2RS\5\16\b\2ST\7\6\2\2T\r\3\2\2\2UW\5\20\t\2VU\3\2\2\2WX\3\2\2"+
		"\2XV\3\2\2\2XY\3\2\2\2Y\17\3\2\2\2Z[\5\30\r\2[\\\7\t\2\2\\\u0086\3\2\2"+
		"\2]^\7\'\2\2^_\7\3\2\2_`\5\"\22\2`a\7\4\2\2ad\5\f\7\2bc\7$\2\2ce\5\f\7"+
		"\2db\3\2\2\2de\3\2\2\2e\u0086\3\2\2\2fg\7&\2\2gh\7\3\2\2hi\5\32\16\2i"+
		"j\7\4\2\2jk\5\f\7\2k\u0086\3\2\2\2lm\7(\2\2mn\7\3\2\2no\5\"\22\2op\7\4"+
		"\2\2pq\5\f\7\2q\u0086\3\2\2\2rt\7*\2\2su\5\34\17\2ts\3\2\2\2tu\3\2\2\2"+
		"uv\3\2\2\2v\u0086\7\t\2\2wy\7)\2\2xz\7\65\2\2yx\3\2\2\2yz\3\2\2\2z{\3"+
		"\2\2\2{\u0086\7\t\2\2|}\5\26\f\2}~\7\t\2\2~\u0086\3\2\2\2\177\u0080\5"+
		"\36\20\2\u0080\u0081\7\t\2\2\u0081\u0086\3\2\2\2\u0082\u0083\5\22\n\2"+
		"\u0083\u0084\7\t\2\2\u0084\u0086\3\2\2\2\u0085Z\3\2\2\2\u0085]\3\2\2\2"+
		"\u0085f\3\2\2\2\u0085l\3\2\2\2\u0085r\3\2\2\2\u0085w\3\2\2\2\u0085|\3"+
		"\2\2\2\u0085\177\3\2\2\2\u0085\u0082\3\2\2\2\u0086\21\3\2\2\2\u0087\u0088"+
		"\7\65\2\2\u0088\u008a\7\3\2\2\u0089\u008b\5\24\13\2\u008a\u0089\3\2\2"+
		"\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\4\2\2\u008d\23"+
		"\3\2\2\2\u008e\u0091\7\65\2\2\u008f\u0091\5(\25\2\u0090\u008e\3\2\2\2"+
		"\u0090\u008f\3\2\2\2\u0091\u0099\3\2\2\2\u0092\u0095\7\n\2\2\u0093\u0096"+
		"\7\65\2\2\u0094\u0096\5(\25\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2"+
		"\u0096\u0098\3\2\2\2\u0097\u0092\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\25\3\2\2\2\u009b\u0099\3\2\2\2\u009c"+
		"\u009d\5&\24\2\u009d\u00a3\7\65\2\2\u009e\u00a1\7\f\2\2\u009f\u00a2\5"+
		"\34\17\2\u00a0\u00a2\5\22\n\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2"+
		"\u00a2\u00a4\3\2\2\2\u00a3\u009e\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\27"+
		"\3\2\2\2\u00a5\u00a6\7\65\2\2\u00a6\u00a7\7\f\2\2\u00a7\u00a8\5\34\17"+
		"\2\u00a8\31\3\2\2\2\u00a9\u00aa\5\26\f\2\u00aa\u00ab\7\t\2\2\u00ab\u00ac"+
		"\5\"\22\2\u00ac\u00ad\7\t\2\2\u00ad\u00ae\5\36\20\2\u00ae\33\3\2\2\2\u00af"+
		"\u00b4\5\36\20\2\u00b0\u00b4\5 \21\2\u00b1\u00b4\5\"\22\2\u00b2\u00b4"+
		"\5$\23\2\u00b3\u00af\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4\35\3\2\2\2\u00b5\u00b6\5$\23\2\u00b6\u00b7\t\3\2"+
		"\2\u00b7\37\3\2\2\2\u00b8\u00b9\5$\23\2\u00b9\u00ba\t\4\2\2\u00ba\u00bb"+
		"\5$\23\2\u00bb!\3\2\2\2\u00bc\u00bd\5$\23\2\u00bd\u00be\t\5\2\2\u00be"+
		"\u00bf\5$\23\2\u00bf#\3\2\2\2\u00c0\u00c3\5(\25\2\u00c1\u00c3\7\65\2\2"+
		"\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3%\3\2\2\2\u00c4\u00c5\t"+
		"\6\2\2\u00c5\'\3\2\2\2\u00c6\u00cd\7\60\2\2\u00c7\u00cd\7\61\2\2\u00c8"+
		"\u00cd\7\62\2\2\u00c9\u00cd\7\64\2\2\u00ca\u00cd\5,\27\2\u00cb\u00cd\5"+
		"*\26\2\u00cc\u00c6\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cc"+
		"\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd)\3\2\2\2"+
		"\u00ce\u00cf\7\66\2\2\u00cf+\3\2\2\2\u00d0\u00d1\t\7\2\2\u00d1-\3\2\2"+
		"\2\25\60\62;DNXdty\u0085\u008a\u0090\u0095\u0099\u00a1\u00a3\u00b3\u00c2"+
		"\u00cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}