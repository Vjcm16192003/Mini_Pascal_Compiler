import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        if(args.length != 1){
            System.err.print("Uso: file name");
        }else{
            String fileName = args[0];
            MiniPascalParser parser = getParser(fileName);
            ParseTree antlrAST=parser.program();

            AntlrToProgram progVisitor = new AntlrToProgram();
            Program prog = progVisitor.visit(antlrAST);

            if (progVisitor.erroresSemanticos.isEmpty()){
                ExpressionProcessor ep = new ExpressionProcessor(prog.expressions);
                for (String evaluation: ep.getEvaluationResults()){
                    System.out.println(evaluation);
                }
            }else{
                for(String err: progVisitor.erroresSemanticos){
                    System.out.println(err);
                }
            }
        }
    }

    private static MiniPascalParser getParser(String fileName){
        MiniPascalParser parser = null;

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