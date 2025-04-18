package src;// Generated from grammar/Jort.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JortParser}.
 */
public interface JortListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JortParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JortParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JortParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JortParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JortParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JortParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JortParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JortParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JortParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JortParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JortParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JortParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JortParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JortParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JortParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JortParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JortParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(JortParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JortParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(JortParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JortParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(JortParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JortParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(JortParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JortParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JortParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JortParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JortParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JortParser#arrayIndex}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndex(JortParser.ArrayIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link JortParser#arrayIndex}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndex(JortParser.ArrayIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link JortParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JortParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JortParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JortParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JortParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JortParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JortParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JortParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JortParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(JortParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JortParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(JortParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JortParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JortParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JortParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JortParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JortParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(JortParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JortParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(JortParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JortParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(JortParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JortParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(JortParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JortParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JortParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JortParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JortParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JortParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JortParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JortParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JortParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JortParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(JortParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JortParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(JortParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JortParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JortParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JortParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JortParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JortParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(JortParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JortParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(JortParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JortParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchStatement(JortParser.TryCatchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JortParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchStatement(JortParser.TryCatchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JortParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(JortParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JortParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(JortParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JortParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(JortParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JortParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(JortParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JortParser#statementEnd}.
	 * @param ctx the parse tree
	 */
	void enterStatementEnd(JortParser.StatementEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link JortParser#statementEnd}.
	 * @param ctx the parse tree
	 */
	void exitStatementEnd(JortParser.StatementEndContext ctx);
}