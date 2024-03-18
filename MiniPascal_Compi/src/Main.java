import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);


        MiniPascalLexer lexer = new MiniPascalLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiniPascalParser parser = new MiniPascalParser(tokens);
        ParseTree tree = parser.start();

        InterpretVisitor visitor = new InterpretVisitor();
        visitor.visit(tree);
        String fileName = args[0];
        parser = getParser(fileName);
        ParseTree antlrAST = parser.program();
        showParseTree(parser, antlrAST);
    }

    private static void showParseTree(MiniPascalParser parser, ParseTree tree) {
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewer.open();
    }

    private static MiniPascalParser getParser(String fileName) {
        MiniPascalParser parser;

        try {
            CharStream input = CharStreams.fromFileName(fileName);
            MiniPascalLexer lexer = new MiniPascalLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new MiniPascalParser(tokens);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return parser;
    }
}
