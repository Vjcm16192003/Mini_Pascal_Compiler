import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.print("Usage: file name");
            return;
        }

        String fileName = args[0];
        MiniPascalParser parser = getParser(fileName);
        ParseTree antlrAST = parser.program();

        AntlrToProgram progVisitor = new AntlrToProgram();
        Program prog = progVisitor.visit(antlrAST);
        if (progVisitor.erroresSemanticos.isEmpty()) {
//            ExpressionProcessor ep = new ExpressionProcessor(prog.expressions);
//            for (String evaluation : ep.getEvaluationResults()) {
//                System.out.println(evaluation);
//            }
        } else {
            for (String err : progVisitor.erroresSemanticos) {
                System.out.println(err);
            }
            for(String mensaje : progVisitor.mensajes){
                System.out.println(mensaje);
            }
        }

        // Display the parse tree using TreeViewer
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
