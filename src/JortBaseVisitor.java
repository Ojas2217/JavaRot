package src;// Generated from grammar/Jort.g4 by ANTLR 4.13.2

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.*;


/**
 * This class provides an empty implementation of {@link JortVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
@SuppressWarnings("CheckReturnValue")
public class JortBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements JortVisitor<T> {
    static ParseTreeProperty<Object> values = new ParseTreeProperty<>();
    Map<String, Method> methods = new HashMap<>();
    Deque<Map<String, Object>> scopes = new ArrayDeque<>();
    Map<String, Object> currentScope = new HashMap<>();
    Deque<Method> methodStack = new ArrayDeque<>();
    static final Map<String, Integer> PRECEDENCE = Map.ofEntries(
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
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitProgram(JortParser.ProgramContext ctx) {
        scopes.push(new HashMap<>(currentScope));
        currentScope = scopes.peek();
        return visitChildren(ctx);
    }

    @Override
    public T visitMethodDeclaration(JortParser.MethodDeclarationContext ctx) {
        String type = determineType(ctx.type());
        String name = ctx.IDENTIFIER().getText();
        JortParser.ParameterListContext params = ctx.parameterList();
        JortParser.BlockContext block = ctx.block();
        Method method = new Method(type, name, params, block);
        if (methods.containsKey(name)) {
            throw new RuntimeException("Method already defined: " + name);
        }
        methods.put(name, method);
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitParameterList(JortParser.ParameterListContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitType(JortParser.TypeContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitStatement(JortParser.StatementContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitVariableDeclaration(JortParser.VariableDeclarationContext ctx) {
        visitChildren(ctx);
        String baseType = determineBaseType(ctx.type().getFirst());
        boolean isArray = isArrayType(ctx.type().getFirst());
        String type = determineType(ctx.type().getFirst());
        String varName = ctx.IDENTIFIER().getText();
        Object value;
        if (isArray) {
            if (ctx.expression() != null && !ctx.expression().isEmpty()) {
                // Case 1: {1, 2, 3}
                if (ctx.expression().get(0).getChildCount() > 0 &&
                        ctx.expression().get(0).getChild(0) instanceof JortParser.LiteralContext) {
                    int i = 0;
                    List<Object> elements = new ArrayList<>();
                    while (ctx.expression(i) != null && ctx.expression(i).getChild(0) instanceof JortParser.LiteralContext) {
                        elements.add(values.get(ctx.expression(i).getChild(0)));
                        i++;
                    }

                    value = createArray(baseType, elements);
                    currentScope.put(varName, value);
                }
                // Case 2: new arr[size]
                else if (ctx.expression(0).NEW() != null) {

                    int size = (Integer)values.get(ctx.expression(0).expression(0).literal()!=null?ctx.expression(0).expression(0).literal():ctx.expression(0).expression(0));
                    value = createArray(baseType, size);
                    currentScope.put(varName, value);
                }
            }
        } else {
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
                    if (!(value instanceof String)) throw new RuntimeException("type mismatch error");
                    currentScope.put(varName, ((String) value).charAt(1));
                }
                default -> throw new RuntimeException("Invalid type");
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitAssignment(JortParser.AssignmentContext ctx) {
        visitChildren(ctx);
        if (ctx.arrayIndex() != null) {
            String varName = ctx.arrayIndex().IDENTIFIER().getText();
            if (!currentScope.containsKey(varName))
                throw new RuntimeException("Invalid scope or The variable has not been declared yet");
            if (ctx.arrayIndex().expression().isEmpty()) throw new RuntimeException("Invalid index");
            Object index = values.get(ctx.arrayIndex().expression());
            Object val = values.get(ctx.expression());
            if (val == null) throw new RuntimeException("Invalid value");
            if (!(index instanceof Integer)) throw new RuntimeException("Invalid index");
            if (!currentScope.get(varName).getClass().isArray()) throw new RuntimeException("Invalid array object");
            String typeArr = currentScope.get(varName).getClass().getSimpleName();
            String typeVal = val.getClass().getSimpleName();
            switch (typeArr) {
                case "Integer[]" -> {
                    if (!typeVal.equals("Integer")) throw new RuntimeException("type mismatch error");
                    Integer[] arr = (Integer[]) currentScope.get(varName);
                    arr[(int) index] = (int) val;
                    currentScope.replace(varName, arr);

                }
                case "Double[]" -> {
                    if (!typeVal.equals("Double")) throw new RuntimeException("type mismatch error");
                    Double[] arr = (Double[]) currentScope.get(varName);
                    arr[(int) index] = (double) val;
                    currentScope.replace(varName, arr);
                }
                case "Boolean[]" -> {
                    if (!typeVal.equals("Boolean")) throw new RuntimeException("type mismatch error");
                    Boolean[] arr = (Boolean[]) currentScope.get(varName);
                    arr[(int) index] = (boolean) val;
                    currentScope.replace(varName, arr);
                }
                case "String[]" -> {
                    if (!typeVal.equals("String")) throw new RuntimeException("type mismatch error");
                    String[] arr = (String[]) currentScope.get(varName);
                    arr[(int) index] = (String) val;
                    currentScope.replace(varName, arr);
                }
                case "Character[]" -> {
                    if (!typeVal.equals("String")) throw new RuntimeException("type mismatch error");
                    Character[] arr = (Character[]) currentScope.get(varName);
                    arr[(int) index] = ((String) val).charAt(1);
                    currentScope.replace(varName, arr);
                }
                default -> throw new RuntimeException("Invalid array type");

            }

        } else {
            String varName = ctx.IDENTIFIER().getText();
            if (!currentScope.containsKey(varName))
                throw new RuntimeException("Invalid scope or The variable has not been declared yet");
            Object val;
            String type = currentScope.get(varName).getClass().getSimpleName();
            if (ctx.expression().isEmpty()) throw new RuntimeException("No value assigned");
            else val = values.get(ctx.expression());
            if (val == null) throw new RuntimeException("Invalid value");
            switch (type) {
                case "Double" -> {
                    if (!(val instanceof Double)) throw new RuntimeException("type mismatch error");
                    currentScope.replace(varName, val);
                }
                case "Boolean" -> {
                    if (!(val instanceof Boolean)) throw new RuntimeException("type mismatch error");
                    currentScope.replace(varName, val);
                }
                case "String" -> {
                    if (!(val instanceof String)) throw new RuntimeException("type mismatch error");
                    currentScope.replace(varName, val);
                }
                case "Integer" -> {
                    if (!(val instanceof Integer)) throw new RuntimeException("type mismatch error");
                    currentScope.replace(varName, val);

                }
                case "Character" -> {
                    if (!(val instanceof String)) throw new RuntimeException("type mismatch error");
                    currentScope.replace(varName, ((String) val).charAt(1));
                }
                default -> throw new RuntimeException("Invalid type");
            }

        }
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitArrayIndex(JortParser.ArrayIndexContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitIfStatement(JortParser.IfStatementContext ctx) {
        this.visit(ctx.expression());
        Object con = values.get(ctx.expression());
        if (!(con instanceof Boolean)) {
            throw new RuntimeException("Condition must be a boolean");
        }
        if ((Boolean) con) {
            this.visit(ctx.block(0));
        } else if (ctx.BRUZZ() != null) {
            this.visit(ctx.block(1));

        }
        return null;

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitWhileStatement(JortParser.WhileStatementContext ctx) {
        this.visit(ctx.expression());
        Object con = values.get(ctx.expression());
        while (true) {

            if (!(con instanceof Boolean)) {
                throw new RuntimeException("Condition must be a boolean");
            }
            if (!((Boolean) con)) break;
            try {
                this.visit(ctx.block());
            }
            catch (BreakException e) {
                break;
            }
            catch (ContinueException e) {}
            this.visit(ctx.expression());
            con = values.get(ctx.expression());
        }
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitForStatement(JortParser.ForStatementContext ctx) {
        JortParser.VariableDeclarationContext initVar = null;
        JortParser.ExpressionContext initExp = null;
        JortParser.ExpressionContext updateExp = null;
        JortParser.ExpressionContext conditionCtx = null;

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof JortParser.VariableDeclarationContext) {
                initVar = (JortParser.VariableDeclarationContext) child;
            } else if (child instanceof JortParser.ExpressionContext) {
                // Position 2: init's expressionStatement (after 'GOON' and '(')
                if (i == 3) {
                    initExp = (JortParser.ExpressionContext) child;
                }
                // Position 3: update's expressionStatement
                else if (i == 4) {
                    updateExp = (JortParser.ExpressionContext) child;
                }
            } else if (child instanceof JortParser.ExpressionStatementContext) {
                // Position 4: condition expression
                conditionCtx = ((JortParser.ExpressionStatementContext) child).expression();
            }
        }
        if (initVar != null) {
            visit(initVar);
        } else if (initExp != null) {
            visit(initExp);
        }
        boolean condition = true;
        if (conditionCtx != null) {
            visit(conditionCtx);
            Object condValue = values.get(conditionCtx);
            if (!(condValue instanceof Boolean)) {
                throw new RuntimeException("condition must be a boolean");
            }
            condition = (Boolean) condValue;
        }
        while (condition) {
            try {
                visit(ctx.block());
            }
            catch (BreakException e) {
                break;
            }
            catch (ContinueException e) {}
            if (updateExp != null) {
                visit(updateExp);
            }
            if (conditionCtx != null) {
                visit(conditionCtx);
                Object condValue = values.get(conditionCtx);
                if (!(condValue instanceof Boolean)) {
                    throw new RuntimeException("condition must be a boolean");
                }
                condition = (Boolean) condValue;
            } else {
                condition = true;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitReturnStatement(JortParser.ReturnStatementContext ctx) {
        Object ret = null;
        if (ctx.expression() != null) {
            visit(ctx.expression());
            ret = values.get(ctx.expression());
        }
        Method currentMethod = methodStack.peek();
        if (currentMethod == null) {
            throw new RuntimeException("return outside of method");
        }
        String type = currentMethod.type;
        if (type.equals("gone")) {
            if (ctx.expression() != null) {
                throw new RuntimeException("Invalid return type for 'void' ");
            }
        } else {
            if (ctx.expression() == null) {
                throw new RuntimeException("Invalid return type");
            }
            String actualType = getTypeOfValue(ret);
            if (!type.equals(actualType)) {
                throw new RuntimeException("Invalid return type");
            }
        }

        throw new ReturnException(ret);
    }

    private String getTypeOfValue(Object value) {
        if (value == null) return "gone";
        if (value instanceof Integer) return "tax";
        if (value instanceof Double) return "tuah";
        if (value instanceof Boolean) return "ong";
        if (value instanceof String) return "Skibidi";
        if (value instanceof Character) return "chat";
        if (value instanceof Integer[]) return "tax[]";
        if (value instanceof Double[]) return "tuah[]";
        if (value instanceof Boolean[]) return "ong[]";
        if (value instanceof String[]) return "Skibidi[]";
        if (value instanceof Character[]) return "chat[]";
        return "unknown";
    }



    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitPrintStatement(JortParser.PrintStatementContext ctx) {
        visitChildren(ctx);
        Object toPrint = values.get(ctx.argumentList().expression(0));
        if (toPrint instanceof String && ((String) toPrint).charAt(0) == '"')
            toPrint = ((String) toPrint).substring(1, ((String) toPrint).length() - 1);
        System.out.println(toPrint);
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitExpressionStatement(JortParser.ExpressionStatementContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitExpression(JortParser.ExpressionContext ctx) {
        visitChildren(ctx);
        if (ctx.IDENTIFIER() != null && ctx.argumentList() != null) {
            String methodName = ctx.IDENTIFIER().getText();
            Method method = methods.get(methodName);
            if (method == null) {
                throw new RuntimeException("Method not found: " + methodName);
            }
            List<Object> args = new ArrayList<>();
            if (ctx.argumentList() != null) {
                for (JortParser.ExpressionContext argCtx : ctx.argumentList().expression()) {
                    visit(argCtx);
                    args.add(values.get(argCtx));
                }
            }

            JortParser.ParameterListContext params = method.params;
            int expected = 0;
            for (int i = 0; i < params.getChildCount(); i++) {
                if (params.getChild(i) instanceof JortParser.TypeContext) expected++;
            }
            if (args.size() != expected) {
                throw new RuntimeException("Parameter count mismatch");
            }

            for (int i = 0; i < expected; i++) {
                JortParser.TypeContext paramTypeCtx = params.type(i);
                String paramType = determineType(paramTypeCtx);
                Object argValue = args.get(i);
                String argType = getTypeOfValue(argValue);

                if (!paramType.equals(argType)) {
                    throw new RuntimeException("Parameter type mismatch");
                }
            }

            scopes.push(new HashMap<>());
            Map<String, Object> previousScope = currentScope;
            currentScope = scopes.peek();


            for (int i = 0; i < expected; i++) {
                String paramName = params.IDENTIFIER(i).getText();
                currentScope.put(paramName, args.get(i));
            }


            Object returnValue = null;
            methodStack.push(method);
            try {
                visit(method.block);
            } catch (ReturnException e) {
                returnValue = e.value;
            } finally {
                methodStack.pop();
            }

            String expectedReturnType = method.type;
            String actualReturnType = getTypeOfValue(returnValue);
            if (!expectedReturnType.equals(actualReturnType)) {
                throw new RuntimeException("type mismatch error");
            }

            scopes.pop();
            currentScope = previousScope;
            values.put(ctx, returnValue);
        }
        else if (ctx.operator() != null) {
            List<Object> tokens = flattenExpression(ctx);
            Object result = evaluateWithPrecedence(tokens);
            values.put(ctx, result);
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
        }else if (ctx.literal() != null) {
            values.put(ctx, values.get(ctx.literal()));
        } else if (ctx.IDENTIFIER() != null) {
            String varName = ctx.IDENTIFIER().getText();
            Object value = currentScope.get(varName);

            if (value == null) {
                throw new RuntimeException("Undefined variable: " + varName);
            }
            values.put(ctx, value);
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
        } else if (ctx.TS_NT() != null) {
            Object value = values.get(ctx.expression().get(0));
            if (value == (Integer) 1) value = true;
            if (value == (Integer) 0) value = false;
            if (!(value instanceof Boolean)) {
                throw new RuntimeException("TS_NT requires boolean operand");
            }
            values.put(ctx, !(Boolean) value);
        } else if (ctx.getChildCount() == 4 && ctx.getChild(1).getText().equals("[")) {
            Object array = values.get(ctx.expression(0));
            Object indexObj = values.get(ctx.expression(1));

            if (!(indexObj instanceof Integer)) {
                throw new RuntimeException("Array index must be an integer");
            }
            int index = (Integer) indexObj;
            if(index>=0) {
                Object value = switch (array) {
                    case Integer[] arr -> arr[index];
                    case Double[] arr -> arr[index];
                    case String[] arr -> arr[index];
                    case Boolean[] arr -> arr[index];
                    case Character[] arr -> arr[index];
                    default -> throw new RuntimeException("Invalid array type or index");
                };
                values.put(ctx, value);
            }


        } else if (ctx.getChildCount() == 3 && ctx.getChild(0).getText().equals("(")) {
            values.put(ctx, values.get(ctx.expression(0)));
        } else {
            throw new RuntimeException("Unsupported expression: " + ctx.getText());
        }
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitLiteral(JortParser.LiteralContext ctx) {
        if (ctx.TAX_LITERAL() != null) {
            values.put(ctx, Integer.parseInt(ctx.getText()));
        } else if (ctx.ONG_LITERAL() != null) {
            values.put(ctx, ctx.getText().equals("fr"));
        } else if (ctx.SKIBIDI_LITERAL() != null) {
            String text = ctx.getText();
            values.put(ctx, text);
        } else if (ctx.CHAT_LITERAL() != null) {
            String text = ctx.getText();
            values.put(ctx, text.charAt(1));
        } else if (ctx.TUAH_LITERAL() != null) {
            values.put(ctx, Double.parseDouble(ctx.getText()));
        }
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitOperator(JortParser.OperatorContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitBlock(JortParser.BlockContext ctx) {
        if (!(ctx.getParent() instanceof JortParser.WhileStatementContext || ctx.getParent() instanceof JortParser.ForStatementContext)) {
            scopes.push(new HashMap<>(currentScope));
            currentScope = scopes.peek();
        }
        for (JortParser.StatementContext stmt : ctx.statement()) {
            visit(stmt);
        }
        if (!(ctx.getParent() instanceof JortParser.WhileStatementContext || ctx.getParent() instanceof JortParser.ForStatementContext)) {
            scopes.pop();
            currentScope = scopes.peek();
        }
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitArgumentList(JortParser.ArgumentListContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitTryCatchStatement(JortParser.TryCatchStatementContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitBreakStatement(JortParser.BreakStatementContext ctx) {
        throw new BreakException();

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitContinueStatement(JortParser.ContinueStatementContext ctx) {
        throw new ContinueException();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitStatementEnd(JortParser.StatementEndContext ctx) {
        return visitChildren(ctx);
    }

    private Object evaluate(Object left, String op, Object right) {
        switch (op) {
            case "add ts" -> {
                if (left instanceof String && right instanceof String) {
                    String l = ((String) left).charAt(0) == '"' ? left.toString().substring(1, ((String) left).length() - 1) : left.toString();
                    String r = ((String) right).charAt(0) == '"' ? right.toString().substring(1, ((String) right).length() - 1) : right.toString();
                    return l + r;
                }
                if (left instanceof String && right instanceof Number) {
                    String l = ((String) left).charAt(0) == '"' ? left.toString().substring(1, ((String) left).length() - 1) : left.toString();
                    String r = right.toString();
                    return l + r;
                }
                if (left instanceof Number && right instanceof String) {
                    String r = ((String) right).charAt(0) == '"' ? right.toString().substring(1, ((String) right).length() - 1) : right.toString();
                    String l = left.toString();
                    return l + r;

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

                if (left instanceof Boolean && right instanceof Boolean) {
                    boolean l = (Boolean) left;
                    boolean r = (Boolean) right;
                    return l && r;
                }
                throw new RuntimeException("Invalid operands for and");
            }
            case "or" -> {
                if (left instanceof Boolean && right instanceof Boolean) {
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

    String determineType(JortParser.TypeContext ctx) {
        StringBuilder type = new StringBuilder();
        if (ctx.TAX() != null) type.append("tax");
        else if (ctx.ONG() != null) type.append("ong");
        else if (ctx.TUAH() != null) type.append("tuah");
        else if (ctx.SKIBIDI() != null) type.append("Skibidi");
        else if (ctx.CHAT() != null) type.append("chat");
        else if (ctx.GONE() != null) type.append("gone");
        else if (ctx.IDENTIFIER() != null) type.append(ctx.IDENTIFIER().getText());
        if(ctx.getChildCount()>1 && ctx.getChild(1).getText().equals("["))type.append("[]");
        return type.toString();
    }

    private String determineBaseType(JortParser.TypeContext typeCtx) {
        if (typeCtx.TAX() != null) return "tax";
        if (typeCtx.ONG() != null) return "ong";
        if (typeCtx.TUAH() != null) return "tuah";
        if (typeCtx.SKIBIDI() != null) return "Skibidi";
        if (typeCtx.CHAT() != null) return "chat";
        return typeCtx.IDENTIFIER().getText();
    }

    private boolean isArrayType(JortParser.TypeContext typeCtx) {
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
            case "tax":
                return new Integer[size];
            case "ong":
                return new Boolean[size];
            case "tuah":
                return new Double[size];
            case "Skibidi":
                return new String[size];
            case "chat":
                return new Character[size];
            default:
                throw new RuntimeException("Unsupported array type: " + baseType);
        }
    }

    List<Object> flattenExpression(JortParser.ExpressionContext ctx) {
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

    Object evaluateWithPrecedence(List<Object> tokens) {
        // Convert infix to postfix using Shunting Yard
        List<Object> postfix = shuntingYard(tokens);
        return evaluatePostfix(postfix);
    }

    // Shunting Yard Algorithm
    private List<Object> shuntingYard(List<Object> tokens) {
        List<Object> output = new ArrayList<>();
        Deque<String> stack = new ArrayDeque<>();

        for (Object token : tokens) {
            if (token instanceof String op && PRECEDENCE.get(op) != null) {
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
            if (token instanceof String op && PRECEDENCE.get(op) != null) {
                Object right = stack.pop();
                Object left = stack.pop();
                stack.push(evaluate(left, op, right));
            } else {
                stack.push(token);
            }
        }

        return stack.pop();
    }
    private static class BreakException extends RuntimeException {}
    private static class ContinueException extends RuntimeException {}

}