package src;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Jort {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java -cp \"out;lib/*\" src/Jort <path-to-your-Jort-file>");
            return;
        }

        String filename = args[0];
        try {
            CharStream c = CharStreams.fromFileName(filename);
            JortLexer lexer = new JortLexer(c);
            JortParser parser = new JortParser(new CommonTokenStream(lexer));
            parser.addParseListener(new JortBaseListener());
            ParseTree tree = parser.program();
            JortBaseVisitor visitor = new JortBaseVisitor();
            visitor.visit(tree);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
