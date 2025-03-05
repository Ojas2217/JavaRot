package src;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class JavaRot {
    public static void main(String[] args) {

        try {
            CharStream c = CharStreams.fromFileName("script.JavaRot");
            JavaRotLexer lexer = new JavaRotLexer(c);
            JavaRotParser parser = new JavaRotParser(new CommonTokenStream(lexer));
            parser.addParseListener(new JavaRotBaseListener());
            ParseTree tree = parser.program();
            System.out.println(tree.toStringTree(parser));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
