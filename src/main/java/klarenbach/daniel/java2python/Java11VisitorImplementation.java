package klarenbach.daniel.java2python;

import klarenbach.daniel.antlr.Java11BaseVisitor;
import klarenbach.daniel.antlr.Java11Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Java11VisitorImplementation extends Java11BaseVisitor<String> {

    private static final String DEF_KEYWORD = "def";
    private static final String NEW_LINE_SPECIAL_CHARACTER = "\n";
    private static final String TAB_SPECIAL_CHARACTER = "\t";
    private static final String SPACE = " ";
    private static final String WHILE_KEYWORD = "while";
    private static final String FOR_KEYWORD = "for";
    private static final String IN_KEYWORD = "in";
    private static final String RANGE_KEYWORD = "range";
    private static final String BREAK_KEYWORD = "break";
    private static final String RETURN_KEYWORD = "return";
    private static final String IF_KEYWORD = "if";
    private static final String ELSE_KEYWORD = "else";
    private static final String ASSIGMENT_OPERATOR = "=";
    private static final String DECREMENT_OPERATOR = "-=";
    private static final String INCREMENT_OPERATOR = "+=";
    private static final String MODULO_OPERATOR = "%";
    private static final String DIVISION_OPERATOR = "/";
    private static final String MULTIPLICATION_OPERATOR = "*";
    private static final String ADDITION_OPERATOR = "+";
    private static final String SUBTRACTION_OPERATOR = "-";
    private static final String LT_OPERATOR = "<";
    private static final String GT_OPERATOR = ">";
    private static final String GE_OPERATOR = ">=";
    private static final String LE_OPERATOR = "<=";
    private static final String NOT_EQUAL_OPERATOR = "!=";
    private static final String EQUAL_OPERATOR = "==";
    private static final String OR_OPERATOR = "or";
    private static final String AND_OPERATOR = "and";
    private static final String POWER_OPERATOR = "**";
    private static final String LPAREN = "(";
    private static final String RPAREN = ")";
    private static final String COLON = ":";
    private static final String COMMA = ",";
    private static final String TRUE_LITERAL = "True";
    private static final String FALSE_LITERAL = "False";
    private static final String NONE_LITERAL = "None";

    @Override
    public String visitProgram(Java11Parser.ProgramContext ctx) {
        StringBuilder result = new StringBuilder();
        int methodDeclarationCounter=0;
        int statementListCounter=0;
        for(int i=0;i<ctx.getChildCount()-1;i++){
            if(ctx.getChild(i).getText().contains("public") || ctx.getChild(i).getText().contains("private")) {
                result.append(visitMethodDeclaration(ctx.methodDeclaration(methodDeclarationCounter)));
                methodDeclarationCounter++;
            }
            else {
                result.append(visitStatementList(ctx.statementList(statementListCounter)));
                statementListCounter++;
            }
            result.append(NEW_LINE_SPECIAL_CHARACTER);
        }
        return result.toString();
    }

    @Override
    public String visitMethodDeclaration(Java11Parser.MethodDeclarationContext ctx) {
        return DEF_KEYWORD+SPACE+ctx.IDENTIFIER().getText()+LPAREN+visitParameter(ctx.parameter())+RPAREN+COLON+NEW_LINE_SPECIAL_CHARACTER
                +visitBlock(ctx.block());
    }

    @Override
    public String visitStatementList(Java11Parser.StatementListContext ctx) {
        StringBuilder result= new StringBuilder();
        for(int i=0; i<ctx.statement().size();i++){
            result.append(visitStatement(ctx.statement(i)));
        }
        return result.toString();
    }

    @Override
    public String visitModifier(Java11Parser.ModifierContext ctx) {
        return "";
    }

    @Override
    public String visitMethodType(Java11Parser.MethodTypeContext ctx) {
        return "";
    }

    @Override
    public String visitParameter(Java11Parser.ParameterContext ctx) {
        StringBuilder result= new StringBuilder();
        result.append(ctx.IDENTIFIER(0));
        for(int i=1; i<ctx.IDENTIFIER().size();i++){
            result.append(COMMA);
            result.append(SPACE);
            result.append(ctx.IDENTIFIER(i));
        }
        return result.toString();
    }

    @Override
    public String visitBlock(Java11Parser.BlockContext ctx) {
        StringBuilder result= new StringBuilder();
        for(int i=0; i<ctx.statement().size();i++){
            result.append(TAB_SPECIAL_CHARACTER);
            result.append(visitStatement(ctx.statement(i)));
        }
        return result.toString();
    }

    @Override
    public String visitStatement(Java11Parser.StatementContext ctx) {
        if(ctx.assignment()!=null)
            return visitAssignment(ctx.assignment());
        else if(ctx.FOR()!=null)
            return FOR_KEYWORD+SPACE+visitForControl(ctx.forControl())+visitBlock(ctx.block(0));
        else if(ctx.IF()!=null)
            if(ctx.ELSE()!=null)
                return IF_KEYWORD+SPACE+visitExpression(ctx.expression())+COLON+NEW_LINE_SPECIAL_CHARACTER+visitBlock(ctx.block(0))
                        +ELSE_KEYWORD+COLON+NEW_LINE_SPECIAL_CHARACTER+visitBlock(ctx.block(1));
            else
                return IF_KEYWORD+SPACE+visitExpression(ctx.expression())+COLON+NEW_LINE_SPECIAL_CHARACTER+visitBlock(ctx.block(0));
        else if(ctx.WHILE()!=null)
            return WHILE_KEYWORD+SPACE+visitExpression(ctx.expression())+COLON+NEW_LINE_SPECIAL_CHARACTER+visitBlock(ctx.block(0));
        else if(ctx.RETURN()!=null)
            return RETURN_KEYWORD+SPACE+visitExpression(ctx.expression())+NEW_LINE_SPECIAL_CHARACTER;
        else if(ctx.BREAK()!=null)
            return BREAK_KEYWORD+SPACE+ctx.IDENTIFIER().getText()+NEW_LINE_SPECIAL_CHARACTER;
        else if(ctx.variableDeclaration()!=null)
            return visitVariableDeclaration(ctx.variableDeclaration());
        else if(ctx.block()!=null)
            return visitBlock(ctx.block(0));
        else if(ctx.expression()!=null)
            return visitExpression(ctx.expression());
        else
            return "";
    }

   @Override
    public String visitVariableDeclaration(Java11Parser.VariableDeclarationContext ctx) {
        if(ctx.ASSIGN()!=null)
            return ctx.IDENTIFIER().getText()+SPACE+ASSIGMENT_OPERATOR+SPACE+visitExpression(ctx.expression())+NEW_LINE_SPECIAL_CHARACTER;
        else{
            if (ctx.type().STRING()!=null)
                return ctx.IDENTIFIER().getText() + SPACE + ASSIGMENT_OPERATOR + SPACE + "" + NEW_LINE_SPECIAL_CHARACTER;
            else if (ctx.type().FLOAT()!=null)
                return ctx.IDENTIFIER().getText() + SPACE + ASSIGMENT_OPERATOR + SPACE + "0.0" + NEW_LINE_SPECIAL_CHARACTER;
            else if (ctx.type().INT()!=null)
                return ctx.IDENTIFIER().getText() + SPACE + ASSIGMENT_OPERATOR + SPACE + "0" + NEW_LINE_SPECIAL_CHARACTER;
            else if (ctx.type().BOOLEAN()!=null)
                return ctx.IDENTIFIER().getText() + SPACE + ASSIGMENT_OPERATOR + SPACE + FALSE_LITERAL + NEW_LINE_SPECIAL_CHARACTER;
            else
                return ctx.IDENTIFIER().getText() + SPACE + ASSIGMENT_OPERATOR + SPACE + "" + NEW_LINE_SPECIAL_CHARACTER;
        }
    }

    @Override
    public String visitAssignment(Java11Parser.AssignmentContext ctx) {
        return ctx.IDENTIFIER().getText()+SPACE+ASSIGMENT_OPERATOR+SPACE+visitExpression(ctx.expression())+NEW_LINE_SPECIAL_CHARACTER;
    }

    @Override
    public String visitExpression(Java11Parser.ExpressionContext ctx) {
        if (ctx.postfix!=null){
            if(ctx.INC()!=null)
                return visitExpression(ctx.expression(0))+SPACE+INCREMENT_OPERATOR+SPACE+"1";
            else
                return visitExpression(ctx.expression(0))+SPACE+DECREMENT_OPERATOR+SPACE+"1";
        }
        else if (ctx.bop!=null){
            if(ctx.MUL()!=null)
                return visitExpression(ctx.expression(0))+SPACE+ctx.MUL().getText()+SPACE+visitExpression(ctx.expression(1));
            else if(ctx.DIV()!=null)
                return visitExpression(ctx.expression(0))+SPACE+ctx.DIV().getText()+SPACE+visitExpression(ctx.expression(1));
            else if(ctx.MOD()!=null)
                return visitExpression(ctx.expression(0))+SPACE+ctx.MOD().getText()+SPACE+visitExpression(ctx.expression(1));
            else if(ctx.ADD()!=null)
                return visitExpression(ctx.expression(0))+SPACE+ctx.ADD().getText()+SPACE+visitExpression(ctx.expression(1));
            else if(ctx.SUB()!=null)
                return visitExpression(ctx.expression(0))+SPACE+ctx.SUB().getText()+SPACE+visitExpression(ctx.expression(1));
            else if(ctx.LE()!=null)
                return visitExpression(ctx.expression(0))+SPACE+ctx.LE().getText()+SPACE+visitExpression(ctx.expression(1));
            else if(ctx.GE()!=null)
                return visitExpression(ctx.expression(0))+SPACE+ctx.GE().getText()+SPACE+visitExpression(ctx.expression(1));
            else if(ctx.GT()!=null)
                return visitExpression(ctx.expression(0))+SPACE+ctx.GT().getText()+SPACE+visitExpression(ctx.expression(1));
            else if(ctx.LT()!=null)
                return visitExpression(ctx.expression(0))+SPACE+ctx.LT().getText()+SPACE+visitExpression(ctx.expression(1));
            else if(ctx.EQUAL()!=null)
                return visitExpression(ctx.expression(0))+SPACE+ctx.EQUAL().getText()+SPACE+visitExpression(ctx.expression(1));
            else if(ctx.NOTEQUAL()!=null)
                return visitExpression(ctx.expression(0))+SPACE+ctx.NOTEQUAL().getText()+SPACE+visitExpression(ctx.expression(1));
            else if(ctx.POW()!=null)
                return visitExpression(ctx.expression(0))+SPACE+ctx.POW().getText()+SPACE+visitExpression(ctx.expression(1));
            else if(ctx.AND()!=null)
                return visitExpression(ctx.expression(0))+SPACE+ctx.AND().getText()+SPACE+visitExpression(ctx.expression(1));
            else
                return visitExpression(ctx.expression(0))+SPACE+ctx.OR().getText()+SPACE+visitExpression(ctx.expression(1));
        }
        else
            return visitPrimary(ctx.primary());
    }

    @Override
    public String visitPrimary(Java11Parser.PrimaryContext ctx) {
       if(ctx.LPAREN()!=null)
           return LPAREN+visitExpression(ctx.expression())+RPAREN;
       else if(ctx.literal()!=null)
           return visitLiteral(ctx.literal());
       else
           return ctx.IDENTIFIER().getText();
    }

    @Override
    public String visitForControl(Java11Parser.ForControlContext ctx) {
        return ctx.variableDeclaration().IDENTIFIER()+SPACE+IN_KEYWORD+SPACE+RANGE_KEYWORD+LPAREN+ctx.expression(0).expression(1).primary().literal().INT_LITERAL()+RPAREN+COLON+NEW_LINE_SPECIAL_CHARACTER;
    }

    @Override
    public String visitType(Java11Parser.TypeContext ctx) {
        if(ctx.BOOLEAN()!=null)
            return ctx.BOOLEAN().getText();
        else if(ctx.INT()!=null)
            return ctx.INT().getText();
        else if(ctx.FLOAT()!=null)
            return ctx.FLOAT().getText();
        else if(ctx.CHAR()!=null)
            return ctx.CHAR().getText();
        else
            return ctx.STRING().getText();
    }

    @Override
    public String visitLiteral(Java11Parser.LiteralContext ctx) {
        if (ctx.NULL_LITERAL()!=null)
            return ctx.NULL_LITERAL().getText();
        else if (ctx.INT_LITERAL()!=null)
            return ctx.INT_LITERAL().getText();
        else if (ctx.FLOAT_LITERAL()!=null)
            return ctx.FLOAT_LITERAL().getText();
        else if (ctx.boolLiteral()!=null)
            return visitBoolLiteral(ctx.boolLiteral());
        else
            return visitStringLiteral(ctx.stringLiteral());
    }

    @Override
    public String visitStringLiteral(Java11Parser.StringLiteralContext ctx) {
        StringBuilder result= new StringBuilder();
        for(int i=0; i<ctx.CHAR_LITERAL().size();i++){
            result.append(ctx.CHAR_LITERAL(i).getText());
        }
        return result.toString();
    }

    @Override
    public String visitBoolLiteral(Java11Parser.BoolLiteralContext ctx) {
        if (ctx.TRUE()!=null)
            return ctx.TRUE().getText();
        else
            return ctx.FALSE().getText();
    }
}
