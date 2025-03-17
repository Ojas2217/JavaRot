package src;

import org.antlr.v4.runtime.tree.ParseTree;
import java.util.*;
public class Skipper extends JavaRotBaseListener {

    public final Set<ParseTree> nodesToSkip = new HashSet<>();

    @Override
    public void exitExpression(JavaRotParser.ExpressionContext ctx) {
        if (ctx.getParent() instanceof JavaRotParser.IfStatementContext) {
            JavaRotParser.IfStatementContext ifCtx =
                    (JavaRotParser.IfStatementContext) ctx.getParent();
            Object condition = values.get(ctx);
            if (condition == null) condition = eval(ctx);
            if (!(condition instanceof Boolean)) {
                throw new RuntimeException("Condition must be a boolean");
            }
            boolean cond = (Boolean) condition;
            if (cond) {
                if (ifCtx.BRUZZ() != null) {
                    nodesToSkip.add(ifCtx.block(1));
                }
            } else {
                nodesToSkip.add(ifCtx.block(0));
            }
        }
        if (ctx.IDENTIFIER()!=null &&ctx.argumentList() != null) {
            String methodName = ctx.IDENTIFIER().getText();
            List<Object> args = new ArrayList<>();


            for (JavaRotParser.ExpressionContext argCtx : ctx.argumentList().expression()) {
                args.add(values.get(argCtx));
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
    public Object eval(JavaRotParser.ExpressionContext ctx) {
        if (ctx.IDENTIFIER()!=null &&ctx.argumentList() != null) {
            String methodName = ctx.IDENTIFIER().getText();
            List<Object> args = new ArrayList<>();


            for (JavaRotParser.ExpressionContext argCtx : ctx.argumentList().expression()) {
                args.add(values.get(argCtx));
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

            return array;
        }
        else if (ctx.TS_NT() != null) {
            Object value = values.get(ctx.expression().get(0));
            if (!(value instanceof Boolean)) {
                throw new RuntimeException("TS_NT requires boolean operand");
            }
            return !(Boolean) value;
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
            return original;
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

            return value;
        }
        else if (ctx.getChildCount() == 3 && ctx.getChild(0).getText().equals("(")) {
            return values.get(ctx.expression(0));
        }
        else if (ctx.operator() != null) {
            List<Object> tokens = flattenExpression(ctx);
            Object result = evaluateWithPrecedence(tokens);
            return result;
        }
        else if (ctx.literal() != null) {
            return  values.get(ctx.literal());
        }
        else if (ctx.IDENTIFIER() != null) {
            String varName = ctx.IDENTIFIER().getText();
            Object value = currentScope.get(varName);

            if (value == null) {
                throw new RuntimeException("Undefined variable: " + varName);
            }
            return value;
        }
        else {
            throw new RuntimeException("Unsupported expression: " + ctx.getText());
        }
        return null;
    }
}
