package src;// Generated from grammar/JavaRot.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaRotParser}.
 */
public interface JavaRotListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaRotParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JavaRotParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRotParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JavaRotParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRotParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JavaRotParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRotParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JavaRotParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRotParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(JavaRotParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRotParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(JavaRotParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRotParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JavaRotParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRotParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JavaRotParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRotParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(JavaRotParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRotParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(JavaRotParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRotParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JavaRotParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRotParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JavaRotParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRotParser#encapsulation}.
	 * @param ctx the parse tree
	 */
	void enterEncapsulation(JavaRotParser.EncapsulationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRotParser#encapsulation}.
	 * @param ctx the parse tree
	 */
	void exitEncapsulation(JavaRotParser.EncapsulationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRotParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(JavaRotParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRotParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(JavaRotParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRotParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaRotParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRotParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaRotParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRotParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JavaRotParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRotParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JavaRotParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRotParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(JavaRotParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRotParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(JavaRotParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRotParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JavaRotParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRotParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JavaRotParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRotParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JavaRotParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRotParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JavaRotParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRotParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JavaRotParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRotParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JavaRotParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRotParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(JavaRotParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRotParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(JavaRotParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRotParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JavaRotParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRotParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JavaRotParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRotParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(JavaRotParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRotParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(JavaRotParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRotParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaRotParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRotParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaRotParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRotParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JavaRotParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRotParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JavaRotParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRotParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(JavaRotParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRotParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(JavaRotParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRotParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JavaRotParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRotParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JavaRotParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRotParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(JavaRotParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRotParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(JavaRotParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRotParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchStatement(JavaRotParser.TryCatchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRotParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchStatement(JavaRotParser.TryCatchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRotParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(JavaRotParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRotParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(JavaRotParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRotParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(JavaRotParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRotParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(JavaRotParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRotParser#statementEnd}.
	 * @param ctx the parse tree
	 */
	void enterStatementEnd(JavaRotParser.StatementEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRotParser#statementEnd}.
	 * @param ctx the parse tree
	 */
	void exitStatementEnd(JavaRotParser.StatementEndContext ctx);
}