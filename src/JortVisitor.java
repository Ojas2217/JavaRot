package src;// Generated from grammar/Jort.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JortParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JortVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JortParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JortParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JortParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JortParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JortParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JortParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JortParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(JortParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JortParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(JortParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JortParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(JortParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JortParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(JortParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JortParser#arrayIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndex(JortParser.ArrayIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link JortParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(JortParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JortParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(JortParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JortParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(JortParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JortParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(JortParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JortParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(JortParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JortParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(JortParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JortParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JortParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JortParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(JortParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JortParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(JortParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JortParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JortParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JortParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(JortParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JortParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatchStatement(JortParser.TryCatchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JortParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(JortParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JortParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(JortParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JortParser#statementEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementEnd(JortParser.StatementEndContext ctx);
}