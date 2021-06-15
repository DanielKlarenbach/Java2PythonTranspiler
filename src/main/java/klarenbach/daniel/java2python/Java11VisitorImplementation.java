package klarenbach.daniel.java2python;

import klarenbach.daniel.antlr.Java11BaseVisitor;
import klarenbach.daniel.antlr.Java11Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

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
    private static final String DECREMENT_OPERATOR = "-= 1";
    private static final String INCREMENT_OPERATOR = "+= 1";
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
        String parameters = ctx.parameter()!=null ? visitParameter(ctx.parameter()) : "";
        return DEF_KEYWORD+SPACE+ctx.IDENTIFIER().getText()+LPAREN+parameters+RPAREN+COLON+NEW_LINE_SPECIAL_CHARACTER
                +visitBlock(ctx.block(),0);
    }

    @Override
    public String visitStatementList(Java11Parser.StatementListContext ctx) {
        StringBuilder result= new StringBuilder();
        for(int i=0; i<ctx.statement().size();i++){
            result.append(visitStatement(ctx.statement(i),0));
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
    public String visitBlock(Java11Parser.BlockContext ctx, int level) {
        StringBuilder result= new StringBuilder();
        for(int i=0; i<ctx.statementList().statement().size();i++){
            result.append(TAB_SPECIAL_CHARACTER.repeat(Math.max(0, level + 1)));
            result.append(visitStatement(ctx.statementList().statement(i),level+1));
        }
        return result.toString();
    }

    @Override
    public String visitStatement(Java11Parser.StatementContext ctx, int level) {
        if(ctx.assignment()!=null)
            return visitAssignment(ctx.assignment());
        else if(ctx.FOR()!=null)
            return FOR_KEYWORD+SPACE+visitForControl(ctx.forControl())+visitBlock(ctx.block(0),level);
        else if(ctx.IF()!=null)
            if(ctx.ELSE()!=null)
                return IF_KEYWORD+SPACE+visitBooleanExpression(ctx.booleanExpression())+COLON+NEW_LINE_SPECIAL_CHARACTER+visitBlock(ctx.block(0),level)
                        +TAB_SPECIAL_CHARACTER.repeat(Math.max(0, level))+ELSE_KEYWORD+COLON+NEW_LINE_SPECIAL_CHARACTER+visitBlock(ctx.block(1),level);
            else
                return IF_KEYWORD+SPACE+visitBooleanExpression(ctx.booleanExpression())+COLON+NEW_LINE_SPECIAL_CHARACTER+visitBlock(ctx.block(0),level);
        else if(ctx.WHILE()!=null)
            return WHILE_KEYWORD+SPACE+visitBooleanExpression(ctx.booleanExpression())+COLON+NEW_LINE_SPECIAL_CHARACTER+visitBlock(ctx.block(0),level);
        else if(ctx.RETURN()!=null) {
            String expression = ctx.expression()!=null ? visitExpression(ctx.expression()) : "";
            return RETURN_KEYWORD + SPACE + expression + NEW_LINE_SPECIAL_CHARACTER;
        }
        else if(ctx.BREAK()!=null) {
            String identifier = ctx.IDENTIFIER()!=null ? ctx.IDENTIFIER().getText() : "";
            return BREAK_KEYWORD + SPACE + identifier + NEW_LINE_SPECIAL_CHARACTER;
        }
        else if(ctx.variableDeclaration()!=null)
            return visitVariableDeclaration(ctx.variableDeclaration());
        else if(ctx.methodInvocation()!=null)
            return visitMethodInvocation(ctx.methodInvocation());
        else if(ctx.postfixExpression()!=null)
            return visitPostfixExpression(ctx.postfixExpression())+NEW_LINE_SPECIAL_CHARACTER;
        else
            return "";
    }

   @Override
    public String visitVariableDeclaration(Java11Parser.VariableDeclarationContext ctx) {
        if(ctx.ASSIGN()!=null) {
            if (ctx.expression()!=null)
                return ctx.IDENTIFIER().getText() + SPACE + ASSIGMENT_OPERATOR + SPACE + visitExpression(ctx.expression()) + NEW_LINE_SPECIAL_CHARACTER;
            else
                return visitMethodInvocation(ctx.methodInvocation());
        }
        else{
            if (ctx.type().STRING()!=null)
                return ctx.IDENTIFIER().getText() + SPACE + ASSIGMENT_OPERATOR + SPACE + "" + NEW_LINE_SPECIAL_CHARACTER;
            else if (ctx.type().FLOAT()!=null)
                return ctx.IDENTIFIER().getText() + SPACE + ASSIGMENT_OPERATOR + SPACE + "0.0" + NEW_LINE_SPECIAL_CHARACTER;
            else if (ctx.type().INT()!=null)
                return ctx.IDENTIFIER().getText() + SPACE + ASSIGMENT_OPERATOR + SPACE + "0" + NEW_LINE_SPECIAL_CHARACTER;
            else if (ctx.type().BOOLEAN()!=null)
                return ctx.IDENTIFIER().getText() + SPACE + ASSIGMENT_OPERATOR + SPACE + FALSE_LITERAL + NEW_LINE_SPECIAL_CHARACTER;
            return ctx.IDENTIFIER().getText() + SPACE + ASSIGMENT_OPERATOR + SPACE + "" + NEW_LINE_SPECIAL_CHARACTER;
        }
    }

    @Override
    public String visitAssignment(Java11Parser.AssignmentContext ctx) {
        return ctx.IDENTIFIER().getText()+SPACE+ASSIGMENT_OPERATOR+SPACE+visitExpression(ctx.expression())+NEW_LINE_SPECIAL_CHARACTER;
    }

    @Override public String visitMethodInvocation(Java11Parser.MethodInvocationContext ctx) {
        String arguments = ctx.argumentList()!=null ? visitArgumentList(ctx.argumentList()) : "";
        return ctx.IDENTIFIER()+LPAREN+arguments+RPAREN+NEW_LINE_SPECIAL_CHARACTER;
    }

    @Override public String visitArgumentList(Java11Parser.ArgumentListContext ctx) {
        StringBuilder result= new StringBuilder();
        int identifierCount = 0;
        int literalCount = 0;
        for(int i=0; i<ctx.getChildCount();i++){
            if(!ctx.getChild(i).getText().equals(",")) {
                if (!ctx.getChild(i).getText().startsWith("\"") && !ctx.getChild(i).getText().startsWith("'")
                        && !ctx.getChild(i).getText().matches("^[0-9]")) {
                    result.append(ctx.IDENTIFIER(identifierCount));
                    identifierCount++;
                } else {
                    result.append(visitLiteral(ctx.literal(literalCount)));
                    literalCount++;
                }
                result.append(COMMA);
                result.append(SPACE);
            }
        }
        result.deleteCharAt(result.length()-1);
        result.deleteCharAt(result.length()-1);

        return result.toString();
    }

    @Override
    public String visitExpression(Java11Parser.ExpressionContext ctx) {
        if(ctx.postfixExpression()!=null)
            return visitPostfixExpression(ctx.postfixExpression());
        else if(ctx.arthmeticExpression()!=null)
            return visitArthmeticExpression(ctx.arthmeticExpression());
        else if(ctx.booleanExpression()!=null)
            return visitBooleanExpression(ctx.booleanExpression());
        return visitPrimary(ctx.primary());
    }

    @Override
    public String visitPostfixExpression(Java11Parser.PostfixExpressionContext ctx) {
        String operator = ctx.postfix.getText().contains("++") ? INCREMENT_OPERATOR : DECREMENT_OPERATOR;
        return visitPrimary(ctx.primary())+SPACE+operator;
    }

    @Override
    public String visitArthmeticExpression(Java11Parser.ArthmeticExpressionContext ctx) {
        return visitPrimary(ctx.primary(0))+SPACE+ctx.bop.getText()+SPACE+visitPrimary(ctx.primary(1));
    }

    @Override
    public String visitBooleanExpression(Java11Parser.BooleanExpressionContext ctx) {
        return visitPrimary(ctx.primary(0))+SPACE+ctx.bop.getText()+SPACE+visitPrimary(ctx.primary(1));
    }

    @Override
    public String visitPrimary(Java11Parser.PrimaryContext ctx) {
        if(ctx.literal()!=null)
           return visitLiteral(ctx.literal());
        else
           return ctx.IDENTIFIER().getText();
    }

    @Override
    public String visitForControl(Java11Parser.ForControlContext ctx) {
        return ctx.variableDeclaration().IDENTIFIER()+SPACE+IN_KEYWORD+SPACE+RANGE_KEYWORD+LPAREN+ctx.booleanExpression().primary(1).literal().INT_LITERAL()+RPAREN+COLON+NEW_LINE_SPECIAL_CHARACTER;
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
        else if (ctx.CHAR_LITERAL()!=null)
            return ctx.CHAR_LITERAL().getText();
        return visitStringLiteral(ctx.stringLiteral());
    }

    @Override
    public String visitStringLiteral(Java11Parser.StringLiteralContext ctx) {
        return ctx.STRING_LITERAL().getText();
    }

    @Override
    public String visitBoolLiteral(Java11Parser.BoolLiteralContext ctx) {
        if (ctx.TRUE()!=null)
            return TRUE_LITERAL;
        return FALSE_LITERAL;
    }
}
