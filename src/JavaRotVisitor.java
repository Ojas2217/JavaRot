package src;// Generated from grammar/JavaRot.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaRotParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaRotVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaRotParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JavaRotParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRotParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(JavaRotParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRotParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(JavaRotParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRotParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(JavaRotParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRotParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(JavaRotParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRotParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JavaRotParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRotParser#encapsulation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncapsulation(JavaRotParser.EncapsulationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRotParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(JavaRotParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRotParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavaRotParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRotParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(JavaRotParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRotParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(JavaRotParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRotParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(JavaRotParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRotParser#arrayIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndex(JavaRotParser.ArrayIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRotParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(JavaRotParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRotParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(JavaRotParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRotParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(JavaRotParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRotParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(JavaRotParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRotParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(JavaRotParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRotParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(JavaRotParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRotParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JavaRotParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRotParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(JavaRotParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRotParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(JavaRotParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRotParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JavaRotParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRotParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(JavaRotParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRotParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatchStatement(JavaRotParser.TryCatchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRotParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(JavaRotParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRotParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(JavaRotParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRotParser#statementEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementEnd(JavaRotParser.StatementEndContext ctx);
}