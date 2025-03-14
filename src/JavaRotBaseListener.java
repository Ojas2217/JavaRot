package src;// Generated from grammar/JavaRot.g4 by ANTLR 4.13.2


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;
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
	private static final Map<String, Integer> PRECEDENCE = Map.ofEntries(
			Map.entry("mul ts", 4),
			Map.entry("div ts", 4),
			Map.entry("mod ts", 4),
			Map.entry("add ts", 3),
			Map.entry("sub ts", 3),
			Map.entry("ts les", 2),
			Map.entry("ts grtr", 2),
			Map.entry("ts les or eql", 2),
			Map.entry("ts grtr or eql", 2),
			Map.entry("ts eql", 1),
			Map.entry("ts not eql", 1),
			Map.entry("nd", 0),
			Map.entry("or", -1)
	);
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
		String baseType = determineBaseType(ctx.type().getFirst());
		boolean isArray = isArrayType(ctx.type().getFirst());
		String type = determineType(ctx.type().getFirst());
		String varName = ctx.IDENTIFIER().getText();
		Object value;
		if(isArray){
			if (ctx.expression() != null && !ctx.expression().isEmpty()) {
				// Case 1: {1, 2, 3}
				if (ctx.expression().get(0).getChildCount() > 0 &&
						ctx.expression().get(0).getChild(0) instanceof JavaRotParser.LiteralContext) {
					int i =0;
					List<Object> elements = new ArrayList<>();
					while(ctx.expression(i)!=null && ctx.expression(i).getChild(0) instanceof JavaRotParser.LiteralContext){
						elements.add(values.get(ctx.expression(i).getChild(0)));
						i++;
					}

					value = createArray(baseType, elements);
					currentScope.put(varName, value);
				}
				// Case 2: new type[size]
				else if (ctx.expression(0).NEW() != null) {
					int size = (Integer) values.get(ctx.expression(0).expression(0).literal());
					value = createArray(baseType, size);
					currentScope.put(varName, value);
				}
			}
		}else {
				if (ctx.expression().isEmpty()) value = getDefaultValue(type);
				else value = values.get(ctx.expression(0));
				if (value == null) throw new RuntimeException("Invalid value");
				switch (type) {
					case "tuah" -> {
						if (!(value instanceof Double)) throw new RuntimeException("type mismatch error");
						currentScope.put(varName, value);
					}
					case "ong" -> {
						if (!(value instanceof Boolean)) throw new RuntimeException("type mismatch error");
						currentScope.put(varName, value);
					}
					case "Skibidi" -> {
						if (!(value instanceof String)) throw new RuntimeException("type mismatch error");
						currentScope.put(varName, value);
					}
					case "tax" -> {
						if (!(value instanceof Integer)) throw new RuntimeException("type mismatch error");
						currentScope.put(varName, value);

					}
					case "chat" -> {
						if (!(value instanceof Character)) throw new RuntimeException("type mismatch error");
						currentScope.put(varName, value);
					}
					default -> throw new RuntimeException("Invalid type");
				}
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
		Object toPrint = values.get(ctx.argumentList().expression(0));
		if(toPrint instanceof  String && ((String) toPrint).charAt(0)=='"') toPrint = ((String) toPrint).substring(1,((String) toPrint).length()-1);
		System.out.println(toPrint);
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
		if (ctx.IDENTIFIER() != null && ctx.argumentList() != null) {
			String methodName = ctx.IDENTIFIER().getText();
			List<Object> args = new ArrayList<>();

			if (ctx.argumentList() != null) {
				for (JavaRotParser.ExpressionContext argCtx : ctx.argumentList().expression()) {
					args.add(values.get(argCtx));
				}
			}
			//Update this after implementing method declaration, use a map to store method names
			if ("prnt".equals(methodName)) {
			} else {
				throw new RuntimeException("Undefined method: " + methodName);
			}
		}
		else if (ctx.NEW() != null) {
			String type = determineType(ctx.type());
			Object sizeObj = values.get(ctx.expression().getFirst());

			if (!(sizeObj instanceof Integer)) {
				throw new RuntimeException("Array size must be an integer");
			}
			int size = (Integer) sizeObj;
			Object array = switch (type) {
				case "tax" -> new Integer[size];
				case "tuah" -> new Double[size];
				case "Skibidi" -> new String[size];
				case "ong" -> new Boolean[size];
				case "chat" -> new Character[size];
				default -> throw new RuntimeException("Unsupported array type: " + type);
			};

			values.put(ctx, array);
		}
		else if (ctx.TS_NT() != null) {
			Object value = values.get(ctx.expression().get(0));
			if (!(value instanceof Boolean)) {
				throw new RuntimeException("TS_NT requires boolean operand");
			}
			values.put(ctx, !(Boolean) value);
		}
		else if (ctx.LONG_AHH() != null || ctx.SMALL_AHH() != null) {
			String varName = ctx.IDENTIFIER().getText();
			Object value = currentScope.get(varName);

			if (value == null) {
				throw new RuntimeException("Undefined variable: " + varName);
			}
			if (!(value instanceof Integer)) {
				throw new RuntimeException("Increment/decrement requires integer variable");
			}

			int original = (Integer) value;
			int delta = ctx.LONG_AHH() != null ? 1 : -1;
			currentScope.replace(varName, original + delta);
			values.put(ctx, original);
		}
		else if (ctx.getChildCount() == 4 && ctx.getChild(1).getText().equals("[")) {
			Object array = values.get(ctx.expression(0));
			Object indexObj = values.get(ctx.expression(1));

			if (!(indexObj instanceof Integer)) {
				throw new RuntimeException("Array index must be an integer");
			}
			int index = (Integer) indexObj;
			Object value = switch (array) {
				case Integer[] arr -> arr[index];
				case Double[] arr -> arr[index];
				case String[] arr -> arr[index];
				case Boolean[] arr -> arr[index];
				case Character[] arr -> arr[index];
				default -> throw new RuntimeException("Invalid array type");
			};

			values.put(ctx, value);
		}
		else if (ctx.getChildCount() == 3 && ctx.getChild(0).getText().equals("(")) {
			values.put(ctx, values.get(ctx.expression(0)));
		}
		else if (ctx.operator() != null) {
			List<Object> tokens = flattenExpression(ctx);
			Object result = evaluateWithPrecedence(tokens);
			values.put(ctx, result);
		}
		else if (ctx.literal() != null) {
			values.put(ctx, values.get(ctx.literal()));
		}
		else if (ctx.IDENTIFIER() != null) {
			String varName = ctx.IDENTIFIER().getText();
			Object value = currentScope.get(varName);

			if (value == null) {
				throw new RuntimeException("Undefined variable: " + varName);
			}
			values.put(ctx, value);
		}
		else {
			throw new RuntimeException("Unsupported expression: " + ctx.getText());
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
					String l = ((String)left).charAt(0)=='"'?left.toString().substring(1,((String)left).length()-1):left.toString();
					String r = ((String)right).charAt(0)=='"'?right.toString().substring(1,((String)right).length()-1):right.toString();
					return  l+r;
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

	private String determineType(JavaRotParser.TypeContext ctx) {
		StringBuilder type = new StringBuilder();
		if (ctx.TAX() != null) type.append("tax");
		else if (ctx.ONG() != null) type.append("ong");
		else if (ctx.TUAH() != null) type.append("tuah");
		else if (ctx.SKIBIDI() != null) type.append("Skibidi");
		else if (ctx.CHAT() != null) type.append("chat");
		else if (ctx.GONE() != null) type.append("gone");
		else if (ctx.IDENTIFIER() != null) type.append(ctx.IDENTIFIER().getText());

		return type.toString();
	}
	private String determineBaseType(JavaRotParser.TypeContext typeCtx) {
		if (typeCtx.TAX() != null) return "tax";
		if (typeCtx.ONG() != null) return "ong";
		if (typeCtx.TUAH() != null) return "tuah";
		if (typeCtx.SKIBIDI() != null) return "Skibidi";
		if (typeCtx.CHAT() != null) return "chat";
		return typeCtx.IDENTIFIER().getText();
	}

	private boolean isArrayType(JavaRotParser.TypeContext typeCtx) {
		return typeCtx.getChildCount() > 1 && typeCtx.getChild(1).getText().equals("[");
	}

	private Object createArray(String baseType, List<Object> elements) {
		switch (baseType) {
			case "tax":
				return elements.stream()
						.map(o -> (Integer) o)
						.toArray(Integer[]::new);
			case "ong":
				return elements.stream()
						.map(o -> (Boolean) o)
						.toArray(Boolean[]::new);
			case "tuah":
				return elements.stream()
						.map(o -> (Double) o)
						.toArray(Double[]::new);
			case "Skibidi":
				return elements.stream()
						.map(Object::toString)
						.toArray(String[]::new);
			case "chat":
				return elements.stream()
						.map(o -> (Character) o)
						.toArray(Character[]::new);
			default:
				throw new RuntimeException("Unsupported array type: " + baseType);
		}
	}

	private Object createArray(String baseType, int size) {
		if (size < 0) throw new RuntimeException("Negative array size");

		switch (baseType) {
			case "tax": return new Integer[size];
			case "ong": return new Boolean[size];
			case "tuah": return new Double[size];
			case "Skibidi": return new String[size];
			case "chat": return new Character[size];
			default: throw new RuntimeException("Unsupported array type: " + baseType);
		}
	}

	private List<Object> flattenExpression(JavaRotParser.ExpressionContext ctx) {
		List<Object> tokens = new ArrayList<>();
		if (ctx.operator() != null) {
			tokens.addAll(flattenExpression(ctx.expression(0)));
			tokens.add(ctx.operator().getText());
			tokens.addAll(flattenExpression(ctx.expression(1)));
		} else {
			tokens.add(values.get(ctx));
		}
		return tokens;
	}

	private Object evaluateWithPrecedence(List<Object> tokens) {
		// Convert infix to postfix using Shunting Yard
		List<Object> postfix = shuntingYard(tokens);
		return evaluatePostfix(postfix);
	}

	// Shunting Yard Algorithm
	private List<Object> shuntingYard(List<Object> tokens) {
		List<Object> output = new ArrayList<>();
		Deque<String> stack = new ArrayDeque<>();

		for (Object token : tokens) {
			if (token instanceof String op) {
				while (!stack.isEmpty() &&
						PRECEDENCE.get(stack.peek()) >= PRECEDENCE.get(op)) {
					output.add(stack.pop());
				}
				stack.push(op);
			} else {
				output.add(token);
			}
		}

		while (!stack.isEmpty()) {
			output.add(stack.pop());
		}

		return output;
	}

	// Evaluate postfix notation
	private Object evaluatePostfix(List<Object> postfix) {
		Deque<Object> stack = new ArrayDeque<>();

		for (Object token : postfix) {
			if (token instanceof String op) {
				Object right = stack.pop();
				Object left = stack.pop();
				stack.push(evaluate(left, op, right));
			} else {
				stack.push(token);
			}
		}

		return stack.pop();
	}
}