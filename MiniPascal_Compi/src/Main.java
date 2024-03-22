import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.err.println("Uso: java Main <ruta_del_archivo>");
            return;
        }

        String inputFile = args[0];
        MiniPascalParser parser = getParser(inputFile);
        ParseTree tree = parser.start(); // Asegúrate de que 'start' sea el nombre correcto del punto de entrada de tu gramática

        // Interpreta el árbol de análisis generado
        InterpretVisitor visitor = new InterpretVisitor();
        visitor.visit(tree);

        // Muestra el árbol de análisis
        showParseTree(parser, tree);
    }

    private static void showParseTree(MiniPascalParser parser, ParseTree tree) {
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewer.open();
    }

    private static MiniPascalParser getParser(String fileName) throws IOException {
        CharStream input = CharStreams.fromFileName(fileName);
        MiniPascalLexer lexer = new MiniPascalLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        return new MiniPascalParser(tokens);
    }
}
