package src;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.*;

public class SkipWalker extends ParseTreeWalker {
    @Override
    public void walk(ParseTreeListener listener, ParseTree t) {
        if (t instanceof ErrorNode) {
            listener.visitErrorNode((ErrorNode) t);
            return;
        } else if (t instanceof TerminalNode) {
            listener.visitTerminal((TerminalNode) t);
            return;
        }
        if (listener instanceof Skipper) {
            Skipper skipListener = (Skipper) listener;
            if (skipListener.nodesToSkip.contains(t)) {
                return;
            }
        }
        RuleNode r = (RuleNode) t;
        enterRule(listener, r);
        int n = r.getChildCount();
        for (int i = 0; i < n; i++) {
            walk(listener, r.getChild(i));
        }
        exitRule(listener, r);
    }
}
