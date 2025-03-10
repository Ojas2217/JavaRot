package src;// Generated from grammar/JavaRot.g4 by ANTLR 4.13.2

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * This class provides an empty implementation of {@link JavaRotListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
@SuppressWarnings("CheckReturnValue")
public class JavaRotBaseListener implements JavaRotListener {

	private ParseTreeProperty<Object> values = new ParseTreeProperty<>();
	private Deque<Map<String, Object>> scopes = new ArrayDeque<>();
	private Map<String, Object> currentScope = new HashMap<>();
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterProgram(JavaRotParser.ProgramContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProgram(JavaRotParser.ProgramContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterClassDeclaration(JavaRotParser.ClassDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitClassDeclaration(JavaRotParser.ClassDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConstructorDeclaration(JavaRotParser.ConstructorDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConstructorDeclaration(JavaRotParser.ConstructorDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMethodDeclaration(JavaRotParser.MethodDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMethodDeclaration(JavaRotParser.MethodDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterParameterList(JavaRotParser.ParameterListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitParameterList(JavaRotParser.ParameterListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterType(JavaRotParser.TypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitType(JavaRotParser.TypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEncapsulation(JavaRotParser.EncapsulationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEncapsulation(JavaRotParser.EncapsulationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterModifier(JavaRotParser.ModifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitModifier(JavaRotParser.ModifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatement(JavaRotParser.StatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatement(JavaRotParser.StatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFieldDeclaration(JavaRotParser.FieldDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFieldDeclaration(JavaRotParser.FieldDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVariableDeclaration(JavaRotParser.VariableDeclarationContext ctx) {

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVariableDeclaration(JavaRotParser.VariableDeclarationContext ctx) {
		String type = ctx.type().getFirst().getText();
		String varName = ctx.IDENTIFIER().getText();
		String value = ctx.expression().getFirst().getText();
		if(value==null)throw new RuntimeException("Invalid value");
		switch(type){
			case "tuah"->{
				try{
					currentScope.put(varName, Double.parseDouble(value));
				}catch(NumberFormatException e){
					throw new RuntimeException("Invalid value");
				}
			}
			case "ong"->{
				Boolean val = value.equals("fr");
				currentScope.put(varName, val);
			}
			case "Skibdi"->currentScope.put(varName, value);
			case "tax"->{
				try {
					currentScope.put(varName, Integer.parseInt(value));
				}catch (NumberFormatException e){
					System.out.println("Invalid value");
				}
			}
			case "chat"->currentScope.put(varName, value.charAt(0));
			default ->throw new RuntimeException("Invalid type");
		}

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssignment(JavaRotParser.AssignmentContext ctx) {

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssignment(JavaRotParser.AssignmentContext ctx) {
		String varName = ctx.IDENTIFIER().getText();
		if(!currentScope.containsKey(varName))throw new RuntimeException("Invalid scope or The variable has not been declared yet");
		String val = ctx.expression().literal().getText();
		if(val==null)throw new RuntimeException("Invalid value");
		String type = currentScope.get(varName).getClass().getSimpleName();
		switch(type){
			case "Integer"->{
				try{
					currentScope.replace(varName, Integer.parseInt(val));
				}catch (NumberFormatException e){
					System.out.println("Invalid value");
				}
			}
			case "Double"->{
				try{
					currentScope.replace(varName, Double.parseDouble(val));
				}catch (NumberFormatException e){
					System.out.println("Invalid value");
				}
			}
			case "Boolean"->currentScope.replace(varName, val.equals("fr"));
			case "String"->currentScope.replace(varName, val);
			case "Character"->currentScope.replace(varName, val.charAt(0));
			default ->throw new RuntimeException("Invalid variable name");
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIfStatement(JavaRotParser.IfStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIfStatement(JavaRotParser.IfStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWhileStatement(JavaRotParser.WhileStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWhileStatement(JavaRotParser.WhileStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterForStatement(JavaRotParser.ForStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitForStatement(JavaRotParser.ForStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterReturnStatement(JavaRotParser.ReturnStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitReturnStatement(JavaRotParser.ReturnStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPrintStatement(JavaRotParser.PrintStatementContext ctx) {

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrintStatement(JavaRotParser.PrintStatementContext ctx) {

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpressionStatement(JavaRotParser.ExpressionStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpressionStatement(JavaRotParser.ExpressionStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpression(JavaRotParser.ExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpression(JavaRotParser.ExpressionContext ctx) {


	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLiteral(JavaRotParser.LiteralContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLiteral(JavaRotParser.LiteralContext ctx) {

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOperator(JavaRotParser.OperatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOperator(JavaRotParser.OperatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBlock(JavaRotParser.BlockContext ctx) {
		scopes.push(new HashMap<>(currentScope));
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBlock(JavaRotParser.BlockContext ctx) {
		currentScope = scopes.pop();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterArgumentList(JavaRotParser.ArgumentListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitArgumentList(JavaRotParser.ArgumentListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTryCatchStatement(JavaRotParser.TryCatchStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTryCatchStatement(JavaRotParser.TryCatchStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBreakStatement(JavaRotParser.BreakStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBreakStatement(JavaRotParser.BreakStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterContinueStatement(JavaRotParser.ContinueStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitContinueStatement(JavaRotParser.ContinueStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatementEnd(JavaRotParser.StatementEndContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatementEnd(JavaRotParser.StatementEndContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }

	private Object evaluateExpression(JavaRotParser.ExpressionContext ctx) {
		if (ctx.IDENTIFIER() != null) {
			return currentScope.getOrDefault(ctx.IDENTIFIER().getText(), null);
		} else if (ctx.literal() != null) {
			return evaluateLiteral(ctx.literal());
		} else if (ctx.operator() != null) {
			Object left = evaluateExpression(ctx.expression(0));
			Object right = evaluateExpression(ctx.expression(1));
			return applyOperator(left, right, ctx.operator().getText());
		} else if (ctx.getChildCount() == 3 && ctx.getChild(0).getText().equals("(")) {
			return evaluateExpression(ctx.expression(0));
		}
		return null;
	}

	private Object evaluateLiteral(JavaRotParser.LiteralContext ctx) {
		if (ctx.TAX_LITERAL() != null) {
			return Integer.parseInt(ctx.TAX_LITERAL().getText());
		} else if (ctx.ONG_LITERAL() != null) {
			return ctx.ONG_LITERAL().getText().equals("fr");
		} else if (ctx.SKIBIDI_LITERAL() != null) {
			return ctx.SKIBIDI_LITERAL().getText().replaceAll("\"", "");
		} else if (ctx.CHAT_LITERAL() != null) {
			return ctx.CHAT_LITERAL().getText().charAt(1);
		} else if (ctx.TUAH_LITERAL() != null) {
			return Double.parseDouble(ctx.TUAH_LITERAL().getText());
		}
		return null;
	}

	private Object applyOperator(Object left, Object right, String operator) {
		if (left instanceof Integer && right instanceof Integer) {
			int l = (Integer) left;
			int r = (Integer) right;
			return switch (operator) {
				case "add ts" -> l + r;
				case "sub ts" -> l - r;
				case "mul ts" -> l * r;
				case "div ts" -> l / r;
				case "mod ts" -> l % r;
				case "ts eql" -> l == r;
				case "ts not eql" -> l != r;
				case "ts les or eql" -> l <= r;
				case "ts grtr or eql" -> l >= r;
				case "ts les" -> l < r;
				case "ts grtr" -> l > r;
				default -> null;
			};
		}
		return null;
	}

}