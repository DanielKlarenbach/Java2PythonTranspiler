// Generated from Java11.g4 by ANTLR 4.9.2
package klarenbach.daniel.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Java11Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Java11Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Java11Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Java11Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(Java11Parser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#boolLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteral(Java11Parser.BoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#basicType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicType(Java11Parser.BasicTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(Java11Parser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#basicTypeVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicTypeVoid(Java11Parser.BasicTypeVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(Java11Parser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(Java11Parser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(Java11Parser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Java11Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(Java11Parser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Java11Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(Java11Parser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(Java11Parser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(Java11Parser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(Java11Parser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(Java11Parser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Java11Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(Java11Parser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Java11Parser.AssignmentContext ctx);
}