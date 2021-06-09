grammar Java11;

/*
 * Parser rules
 */

program: methodDeclaration EOF;

methodDeclaration: modifier methodType IDENTIFIER LPAREN parameter? RPAREN block;

modifier: PRIVATE | PUBLIC;

methodType: type | VOID;

parameter: type IDENTIFIER (COMMA type IDENTIFIER)*;

block: LBRACE statement* RBRACE;

statement:
    assignment SEMI
	| IF LPAREN expression RPAREN statement (ELSE statement)?
	| FOR LPAREN forControl RPAREN statement
	| WHILE LPAREN expression RPAREN statement
	| DO statement WHILE LPAREN expression RPAREN
	| RETURN expression? SEMI
	| BREAK IDENTIFIER? SEMI
	|variableDeclaration SEMI
	| block
	| SEMI;

variableDeclaration: type IDENTIFIER (ASSIGN expression)? SEMI;

assignment: IDENTIFIER ASSIGN expression SEMI;

expression:  expression postfix=(INC | DEC)
	| prefix=(ADD | SUB| INC | DEC) expression
	| expression bop=(MUL | DIV | MOD) expression
	| expression bop=(ADD | SUB) expression
	| expression bop=(LE | GE | GT | LT) expression
	| expression bop=(EQUAL | NOTEQUAL) expression
    | expression bop=(POW | AND | OR) expression
	| primary;

primary: LPAREN expression RPAREN
	| literal
	| IDENTIFIER;

forControl: forInit? SEMI expression? SEMI expressionList?;

forInit: variableDeclaration | expressionList;

expressionList: expression (COMMA expression)*;

type:
    BOOLEAN
	| INT
	| FLOAT
	| CHAR
	| STRING;

literal:
    NULL_LITERAL
	| INT_LITERAL
	| FLOAT_LITERAL
	| CHAR_LITERAL
	| boolLiteral
	| stringLiteral;

stringLiteral: (CHAR_LITERAL)+;

boolLiteral: TRUE | FALSE;

/*
 * Lexer rules
 */

LPAREN:             '(';
RPAREN:             ')';
LBRACE:             '{';
RBRACE:             '}';
LBRACK:             '[';
RBRACK:             ']';
SEMI:               ';';
COMMA:              ',';
DOT:                '.';

ASSIGN:             '=';
GT:                 '>';
LT:                 '<';
BANG:               '!';
EQUAL:              '==';
LE:                 '<=';
GE:                 '>=';
NOTEQUAL:           '!=';
AND:                '&&';
OR:                 '||';
INC:                '++';
DEC:                '--';
ADD:                '+';
SUB:                '-';
MUL:                '*';
MOD:				'%';
DIV:                '/';
POW:				'^';

BOOLEAN:            'boolean';
INT:                'int';
FLOAT:              'float';
VOID:               'void';
CHAR:				'char';
STRING:				'String';

ELSE:               'else';
ELSEIF:             'else if';
FOR:                'for';
IF:                 'if';
WHILE:              'while';
BREAK:				'break';
RETURN:             'return';
PRIVATE:            'private';
PUBLIC:             'public';
TRUE:				'true';
FALSE:				'false';
DO:                 'do';

NULL_LITERAL:       'null';
INT_LITERAL : 		[0-9]+;
FLOAT_LITERAL : 	[0-9]+'.'[0-9]+;
CHAR_LITERAL:		[.];
IDENTIFIER:         [a-zA-Z][a-zA-Z0-9_]*;