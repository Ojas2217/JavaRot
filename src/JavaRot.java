package src;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.gui.TreeViewer;
import java.util.*;

import java.io.IOException;

public class JavaRot {
    public static void main(String[] args) {

        try {
            CharStream c = CharStreams.fromFileName("script.JavaRot");
            JavaRotLexer lexer = new JavaRotLexer(c);
            JavaRotParser parser = new JavaRotParser(new CommonTokenStream(lexer));
            parser.addParseListener(new JavaRotBaseListener());
            ParseTree tree = parser.program();

//            Everything below is for debugging, will be removed later
            System.out.println(tree.toStringTree(parser));
            TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
            viewer.open();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
