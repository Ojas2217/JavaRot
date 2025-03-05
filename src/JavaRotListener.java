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
	 * Enter a parse tree produced by {@link JavaRotParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(JavaRotParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRotParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(JavaRotParser.LetContext ctx);
}