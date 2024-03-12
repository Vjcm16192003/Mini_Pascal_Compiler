import java.util.ArrayList;
import java.util.List;

public class AntlrToProgram extends MiniPascalBaseVisitor<Program>{

    public List<String> erroresSemanticos;
    @Override
    public Program visitProgram(MiniPascalParser.ProgramContext ctx) {
        Program prog = new Program();
        erroresSemanticos = new ArrayList<>();
        AntlrToExpression exprVisitor = new AntlrToExpression(erroresSemanticos);
        for (int i =0; i< ctx.getChildCount(); i++){
            if(i == ctx.getChildCount() - 1){

            }else {
                prog.addExpression(exprVisitor.visit(ctx.getChild(i)));
            }
        }
        return prog;
    }
}
