import java.util.ArrayList;
import java.util.List;

public class AntlrToProgram extends MiniPascalBaseVisitor<Program>{

    public List<String> erroresSemanticos;
    public List<String> vars;
    public List<String> mensajes;

    public List<String> for_loop;
    public List<String> while_loop;
    public List<String> if_state;
    public List<String> repeat_loop;
    @Override
    public Program visitProgram(MiniPascalParser.ProgramContext ctx) {
        Program prog = new Program();
        erroresSemanticos = new ArrayList<>();
        vars = new ArrayList<>();
        mensajes = new ArrayList<>();
        vars.add(ctx.getChild(1).getText());
        AntlrToExpression exprVisitor = new AntlrToExpression(erroresSemanticos,vars,mensajes,for_loop,repeat_loop,if_state,while_loop);
        for (int i =0; i< ctx.getChildCount(); i++){
            if(i == ctx.getChildCount() - 1){

            }else {
                prog.addExpression(exprVisitor.visit(ctx.getChild(i)));
            }
        }
        return prog;
    }
}
