package src;// Generated from grammar/JavaRot.g4 by ANTLR 4.13.2

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.util.*;

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
		Object value;
		if(ctx.expression().isEmpty()) value = getDefaultValue(type);
		else value = values.get(ctx.expression(0));
		if(value==null)throw new RuntimeException("Invalid value");
		switch(type){
			case "tuah"->{
					if (!(value instanceof Double)) throw new RuntimeException("type mismatch error");
					currentScope.put(varName, value);
			}
			case "ong"->{
				if (!(value instanceof Boolean)) throw new RuntimeException("type mismatch error");
				currentScope.put(varName, value);
			}
			case "Skibdi"->{
				if (!(value instanceof String)) throw new RuntimeException("type mismatch error");
				currentScope.put(varName, value);
			}
			case "tax"->{
				if (!(value instanceof Integer)) throw new RuntimeException("type mismatch error");
				currentScope.put(varName, value);

			}
			case "chat"->{
				if (!(value instanceof Character)) throw new RuntimeException("type mismatch error");
				currentScope.put(varName, value);
			}
			default ->throw new RuntimeException("Invalid type");
		}
		System.out.println(varName + " " +currentScope.get(varName));
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
		Object val;
		String type = currentScope.get(varName).getClass().getSimpleName();
		if(ctx.expression().isEmpty()) val = getDefaultValue(type);
		else val = values.get(ctx.expression());
		if(val==null)throw new RuntimeException("Invalid value");
		switch(type){
			case "Double"->{
				if (!(val instanceof Double)) throw new RuntimeException("type mismatch error");
				currentScope.replace(varName, val);
			}
			case "Boolean"->{
				if (!(val instanceof Boolean)) throw new RuntimeException("type mismatch error");
				currentScope.replace(varName, val);
			}
			case "String"->{
				if (!(val instanceof String)) throw new RuntimeException("type mismatch error");
				currentScope.replace(varName, val);
			}
			case "Integer"->{
				if (!(val instanceof Integer)) throw new RuntimeException("type mismatch error");
				currentScope.replace(varName, val);

			}
			case "Character"->{
				if (!(val instanceof Character)) throw new RuntimeException("type mismatch error");
				currentScope.replace(varName, val);
			}
			default ->throw new RuntimeException("Invalid type");
		}

		System.out.println(varName + " " +currentScope.get(varName));
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
		System.out.println(values.get(ctx.argumentList().expression(0)));
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
	@Override public void enterExpression(JavaRotParser.ExpressionContext ctx) {

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpression(JavaRotParser.ExpressionContext ctx) {
		if (ctx.literal() != null) {
			Object value = values.get(ctx.literal());
			values.put(ctx, value);
		}
		else if (ctx.IDENTIFIER() != null) {
			String varName = ctx.IDENTIFIER().getText();
			Object value = currentScope.get(varName);
			if (value == null) {
				throw new RuntimeException("Undefined variable: " + varName);
			}
			values.put(ctx, value);
		}
		else if (ctx.operator() != null) {
			Object left = values.get(ctx.expression(0));
			Object right = values.get(ctx.expression(1));
			String op = ctx.operator().getText();
			Object result = evaluate(left, op, right);
			values.put(ctx, result);
		}
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
		if (ctx.TAX_LITERAL() != null) {
			values.put(ctx, Integer.parseInt(ctx.getText()));
		} else if (ctx.ONG_LITERAL() != null) {
			values.put(ctx, ctx.getText().equals("fr"));
		} else if (ctx.SKIBIDI_LITERAL() != null) {
			String text = ctx.getText();
			values.put(ctx, text);
		} else if (ctx.CHAT_LITERAL() != null) {
			String text = ctx.getText();
			values.put(ctx, text.charAt(0));
		} else if (ctx.TUAH_LITERAL() != null) {
			values.put(ctx, Double.parseDouble(ctx.getText()));
		}
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

	private Object evaluate(Object left, String op, Object right) {
		switch(op) {
			case "add ts" -> {
				if (left instanceof String || right instanceof String) {
					return left.toString() + right.toString();
				}
				if (left instanceof Number && right instanceof Number) {
					if (left instanceof Integer && right instanceof Integer) {
						return (Integer) left + (Integer) right;
					}
					double l = ((Number) left).doubleValue();
					double r = ((Number) right).doubleValue();
					return l + r;
				}
				throw new RuntimeException("Invalid operands for add");
			}

			case "sub ts" -> {
				checkNumberOperands(left, right);
				if (left instanceof Integer && right instanceof Integer) {
					return (Integer) left - (Integer) right;
				}
				double l = ((Number) left).doubleValue();
				double r = ((Number) right).doubleValue();
				return l - r;
			}

			case "mul ts" -> {
				checkNumberOperands(left, right);
				if (left instanceof Integer && right instanceof Integer) {
					return (Integer) left * (Integer) right;
				}
				double l = ((Number) left).doubleValue();
				double r = ((Number) right).doubleValue();
				return l * r;
			}

			case "div ts" -> {
				checkNumberOperands(left, right);
				if (left instanceof Integer && right instanceof Integer) {
					return (Integer) left / (Integer) right; // Integer division
				}
				double l = ((Number) left).doubleValue();
				double r = ((Number) right).doubleValue();
				return l / r;
			}

			case "mod ts" -> {
				checkNumberOperands(left, right);
				if (left instanceof Integer && right instanceof Integer) {
					return (Integer) left % (Integer) right;
				}
				double l = ((Number) left).doubleValue();
				double r = ((Number) right).doubleValue();
				return l % r;
			}

			case "ts eql" -> {
				if (left instanceof Number && right instanceof Number) {
					return ((Number) left).doubleValue() == ((Number) right).doubleValue();
				}
				return Objects.equals(left, right);
			}

			case "ts not eql" -> {
				return !(Boolean) evaluate(left, "ts eql", right);
			}

			case "ts grtr or eql" -> {
				checkNumberOperands(left, right);
				return ((Number) left).doubleValue() >= ((Number) right).doubleValue();
			}

			case "ts les or eql" -> {
				checkNumberOperands(left, right);
				return ((Number) left).doubleValue() <= ((Number) right).doubleValue();
			}

			case "ts les" -> {
				checkNumberOperands(left, right);
				return ((Number) left).doubleValue() < ((Number) right).doubleValue();
			}

			case "ts grtr" -> {
				checkNumberOperands(left, right);
				return ((Number) left).doubleValue() > ((Number) right).doubleValue();
			}

			case "nd" -> {
				if(left instanceof Boolean && right instanceof Boolean) {
					boolean l = (Boolean) left;
					boolean r = (Boolean) right;
					return l && r;
				}
				throw new RuntimeException("Invalid operands for and");
			}
			case "or" -> {
				if(left instanceof Boolean && right instanceof Boolean) {
					boolean l = (Boolean) left;
					boolean r = (Boolean) right;
					return l || r;
				}
				throw new RuntimeException("Invalid operands for and");
			}
			default -> throw new RuntimeException("Unsupported operator: " + op);
		}
	}

	private void checkNumberOperands(Object left, Object right) {
		if (!(left instanceof Number && right instanceof Number)) {
			throw new RuntimeException("Numeric operands required");
		}
	}
	private Object getDefaultValue(String type) {
        return switch (type) {
            case "tax", "Integer" -> 0;
            case "ong", "Boolean" -> false;
            case "tuah", "Double" -> 0.0;
            case "Skibidi", "String" -> "";
            case "chat", "Character" -> '\0';
            default -> null;
        };
	}

}