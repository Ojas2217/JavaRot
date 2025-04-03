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
//        if (args.length < 1) {
//            System.out.println("Usage: java JavaRot <filename>");
//            return;
//        }
//
//        String filename = args[0];
        try {
            CharStream c = CharStreams.fromFileName("script.JavaRot"); // replace this with filename later
            JavaRotLexer lexer = new JavaRotLexer(c);
            JavaRotParser parser = new JavaRotParser(new CommonTokenStream(lexer));
            parser.addParseListener(new JavaRotBaseListener());
            ParseTree tree = parser.program();
            JavaRotBaseVisitor visitor = new JavaRotBaseVisitor();
            visitor.visit(tree);
//            Everything below is for debugging, will be removed later
            System.out.println(tree.toStringTree(parser));
            TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
            viewer.open();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
