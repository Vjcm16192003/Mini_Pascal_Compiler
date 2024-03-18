import java.util.HashMap;
import java.util.Map;
import java.lang.Math;
import java.util.Scanner;
import java.util.Stack;
import java.util.List;
import java.io.*;

public class InterpretVisitor extends MiniPascalBaseVisitor<Valor>{

    Scanner io = new Scanner(System.in);
    private HashMap<String, Valor> globalMem = new HashMap<String, Valor>();
    private Stack<HashMap<String, Valor>> scopes = new Stack<HashMap<String, Valor>>();
    private HashMap<String, MiniPascalParser.FuncDecContext> functions = new HashMap<String, MiniPascalParser.FuncDecContext>();
    private HashMap<String, MiniPascalParser.ProcDecContext> procedures = new HashMap<String, MiniPascalParser.ProcDecContext>();
    private Stack<MiniPascalParser.LoopTypeContext> loopTracker = new Stack<MiniPascalParser.LoopTypeContext>();

    public static final float SMALL_Valor = 0.0000001f;
    private boolean evalLoop = true;
    private boolean evalLoopBlock = true;

    @Override
    public Valor visitStart(MiniPascalParser.StartContext ctx) {
        scopes.push(globalMem);
        return visitChildren(ctx);
    }


    // Variable declaration overrides
    @Override
    public Valor visitInitDec(MiniPascalParser.InitDecContext ctx) {
        String id = ctx.ID().getText();
        Valor Valor = this.visit(ctx.expr());

        return scopes.peek().put(id, Valor);
    }


    @Override
    public Valor visitNormDec(MiniPascalParser.NormDecContext ctx) {
        String id = ctx.ID().getText();
        Valor Valor = null;

        switch(ctx.type.getType()){

            case MiniPascalParser.BOOLEAN:
                Valor = new Valor(true);
            case MiniPascalParser.REAL:
                Valor = new Valor(0.0f);
            default:
                Valor = null;
        }
        scopes.peek().put(id, Valor);
        //System.out.println("In table: " + scopes.peek());
        return Valor.VOID;
    }


    // function declaration override
    // Used when function is being declared to save location of function body 
    @Override
    public Valor visitFuncDec(MiniPascalParser.FuncDecContext ctx) {
        String funcName = ctx.ID().getText();

        //insert function name and location into global hashmap
        functions.put(funcName, ctx);

        return Valor.VOID;
    }

    @Override
    public Valor visitProcDec(MiniPascalParser.ProcDecContext ctx) {
        String procName = ctx.ID().getText();

        //insert function name and location into global hashmap
        procedures.put(procName, ctx);

        return Valor.VOID;
    }




    //BIG override functions for function and procedure calls
    @Override
    public Valor visitFunctionCall(MiniPascalParser.FunctionCallContext ctx) {
        CreateNewScope();

        //variable holding function body
        MiniPascalParser.FuncDecContext funcCtx = functions.get(this.visit(ctx.func_identifier()).asString());

        //add function name to scope for return variable
        String funcName = ctx.func_identifier().getText();
        Valor tempVal = null;
        switch(funcCtx.type.getType()){
            case MiniPascalParser.REAL:
                tempVal = new Valor(0.0f);
            case MiniPascalParser.BOOLEAN:
                tempVal = new Valor(false);
            default:
                tempVal = null;
        }
        scopes.peek().put(funcName, tempVal);


        //List of expressions in the function call parameters
        List<MiniPascalParser.ExprContext> paramValors = ctx.parameters().expr();

        //List of parameter group types in the function declaration
        List<MiniPascalParser.ParamGroupContext> paramGroups = funcCtx.formalParameterList().paramGroup();

        int counter = 0;
        for(MiniPascalParser.ParamGroupContext paramGroup : paramGroups){
            List<MiniPascalParser.IdentifierContext> ids = paramGroup.variableList().identifier();

            for(MiniPascalParser.IdentifierContext idCtx : ids){
                String id = this.visit(idCtx).asString();
                Valor val = this.visit(paramValors.get(counter));

                scopes.peek().put(id, val);
                //System.out.println("In table: " + scopes.peek());

                counter++;
            }
        }

        this.visitChildren(funcCtx);

        Valor returnVal = scopes.peek().get(funcName);
        AdjustScope();
        return returnVal;
    }

    @Override
    public Valor visitProcedureCall(MiniPascalParser.ProcedureCallContext ctx) {
        CreateNewScope();

        //variable holding function body
        MiniPascalParser.ProcDecContext procCtx = procedures.get(this.visit(ctx.func_identifier()).asString());


        //List of expressions in the function call parameters
        List<MiniPascalParser.ExprContext> paramValors = ctx.parameters().expr();

        //List of parameter group types in the function declaration
        List<MiniPascalParser.ParamGroupContext> paramGroups = procCtx.formalParameterList().paramGroup();

        int counter = 0;
        for(MiniPascalParser.ParamGroupContext paramGroup : paramGroups){
            List<MiniPascalParser.IdentifierContext> ids = paramGroup.variableList().identifier();

            for(MiniPascalParser.IdentifierContext idCtx : ids){
                String id = this.visit(idCtx).asString();
                Valor val = this.visit(paramValors.get(counter));

                scopes.peek().put(id, val);
                //System.out.println("In table: " + scopes.peek());

                counter++;
            }
        }

        this.visitChildren(procCtx);
        AdjustScope();
        return Valor.VOID;
    }



    // Variable assignment overrides
    @Override
    public Valor visitFuncAssignment(MiniPascalParser.FuncAssignmentContext ctx) {
        String id = ctx.ID().getText();
        Valor Valor = this.visit(ctx.functionCall());

        scopes.peek().put(id, Valor);
        //System.out.println("In table: " + scopes.peek());

        return Valor.VOID;
    }

    @Override public Valor visitExprAssignment(MiniPascalParser.ExprAssignmentContext ctx) {
        String id = ctx.ID().getText();
        Valor Valor = this.visit(ctx.expr());

        scopes.peek().put(id, Valor);
        //System.out.println("In table: " + scopes.peek());

        return Valor.VOID;
    }

    @Override public Valor visitVarForAssign(MiniPascalParser.VarForAssignContext ctx) {
        String id = ctx.ID().getText();
        Valor Valor = this.visit(ctx.expr());

        scopes.peek().put(id, Valor);
        //System.out.println("In table: " + scopes.peek());

        return Valor;
    }


    // readln override
    @Override
    public Valor visitReadLn(MiniPascalParser.ReadLnContext ctx) {
        String id = ctx.ID().getText();
        Valor a = new Valor(io.nextLine());

        scopes.peek().put(id, a);

        //System.out.println("In table: " + scopes.peek());

        return Valor.VOID;
    }


    //writeln override
    @Override
    public Valor visitWriteLn(MiniPascalParser.WriteLnContext ctx) {
        List<MiniPascalParser.LineContext> lines = ctx.line();
        StringBuilder printStr = new StringBuilder();

        for(MiniPascalParser.LineContext line : lines){
            Valor a = this.visit(line);
            printStr.append(a.asString());
        }

        System.out.println(printStr);

        return Valor.VOID;
    }


    @Override
    public Valor visitExprLine(MiniPascalParser.ExprLineContext ctx) {
        return this.visit(ctx.expr());
    }


    @Override
    public Valor visitStrLine(MiniPascalParser.StrLineContext ctx) {
        return new Valor(ctx.STRING_LITERAL().getText().substring(1, ctx.STRING_LITERAL().getText().length() - 1));
    }



    // while loop override
    @Override
    public Valor visitWhileLoop(MiniPascalParser.WhileLoopContext ctx) {
        CreateNewScope();

        Valor Valor = this.visit(ctx.expr());

        //INSERT SAVE SCOPE HERE

        while(Valor.asBoolean()){

            if(!evalLoop){
                evalLoop = true;
                break;
            }

            if(evalLoopBlock){
                this.visit(ctx.loopBlock());
            }
            else{
                evalLoopBlock = true;
            }

            Valor = this.visit(ctx.expr());
        }

        AdjustScope();

        return Valor.VOID;
    }


    // for loop
    @Override
    public Valor visitForLoop(MiniPascalParser.ForLoopContext ctx) {
        CreateNewScope();

        Valor Valor = this.visit(ctx.varForAssign());
        Valor compareElement = this.visit(ctx.element());
        float i = Valor.asFloat();
        float iMax = compareElement.asFloat();

        //INSERT SAVE SCOPE HERE

        while(i <= iMax){

            if(!evalLoop){
                evalLoop = !evalLoop;
                break;
            }

            if(evalLoopBlock){
                this.visit(ctx.loopBlock());
            }
            else{
                evalLoopBlock = !evalLoopBlock;
            }

            i++;
        }

        AdjustScope();

        return Valor.VOID;
    }

    @Override
    public Valor visitEval_break(MiniPascalParser.Eval_breakContext ctx) {
        evalLoop = false;

        return Valor.VOID;
    }

    @Override
    public Valor visitEval_continue(MiniPascalParser.Eval_continueContext ctx) {
        evalLoopBlock = false;

        return Valor.VOID;
    }




    // if statement override
    @Override
    public Valor visitIfStatement(MiniPascalParser.IfStatementContext ctx) {
        List<MiniPascalParser.CondBlockContext> conditions = ctx.condBlock();

        boolean completed = false;

        for(MiniPascalParser.CondBlockContext condition : conditions){

            Valor evaluated = this.visit(condition.expr());

            if(evaluated.asBoolean()){
                completed = true;
                this.visit(condition.stateBlock());
                break;
            }
        }

        if(!completed && ctx.stateBlock() != null){
            this.visit(ctx.stateBlock());
        }

        return Valor.VOID;
    }

    @Override public Valor visitCaseStatement(MiniPascalParser.CaseStatementContext ctx) {
        List<MiniPascalParser.CaseBlockContext> cases = ctx.caseBlock();

        for(MiniPascalParser.CaseBlockContext c : cases){
            Valor b1 = this.visit(ctx.expr());
            Valor b2 = this.visit(c.expr());

            if(b1.asBoolean() == b1.asBoolean()){
                this.visit(c.statement());
                return Valor.VOID;
            }
        }

        return Valor.VOID;
    }



    //expr overrides
    @Override
    public Valor visitEquationExpr(MiniPascalParser.EquationExprContext ctx) {
        Valor Valor = this.visit(ctx.expr());

        switch(ctx.type.getType()){
            case MiniPascalParser.SQRT:
                return new Valor((float)Math.sqrt(Valor.asFloat()));
            case MiniPascalParser.LN:
                return new Valor((float)Math.log(Valor.asFloat()));
            case MiniPascalParser.EXP:
                return new Valor((float)Math.exp(Valor.asFloat()));
            case MiniPascalParser.SIN:
                return new Valor((float)Math.sin(Math.toRadians(Valor.asFloat())));
            case MiniPascalParser.COS:
                return new Valor((float)Math.cos(Math.toRadians(Valor.asFloat())));
        }
        return Valor.VOID;
    }

    @Override
    public Valor visitUnaryExpr(MiniPascalParser.UnaryExprContext ctx){
        Valor Valor = this.visit(ctx.expr());
        return new Valor(-Valor.asFloat());
    }

    @Override
    public Valor visitNotExpr(MiniPascalParser.NotExprContext ctx){
        Valor Valor = this.visit(ctx.expr());
        return new Valor(!Valor.asBoolean());
    }

    @Override
    public Valor visitMultExpr(MiniPascalParser.MultExprContext ctx){
        Valor left = this.visit(ctx.lEx);
        Valor right = this.visit(ctx.rEx);

        switch(ctx.op.getType()){
            case MiniPascalParser.MULT:
                return new Valor(left.asFloat() * right.asFloat());
            case MiniPascalParser.DIV:
                return new Valor(left.asFloat() / right.asFloat());
            case MiniPascalParser.MOD:
                return new Valor(left.asFloat() % right.asFloat());
            default:
                throw new RuntimeException("unknown operator: ");
        }
    }

    @Override
    public Valor visitAddExpr(MiniPascalParser.AddExprContext ctx){
        Valor left = this.visit(ctx.lEx);
        Valor right = this.visit(ctx.rEx);

        switch(ctx.op.getType()){
            case MiniPascalParser.ADD:
                return new Valor(left.asFloat() + right.asFloat());
            case MiniPascalParser.SUBT:
                return new Valor(left.asFloat() - right.asFloat());
            default:
                throw new RuntimeException("unknown operator: ");
        }
    }

    @Override
    public Valor visitCompareExpr(MiniPascalParser.CompareExprContext ctx){
        Valor left = this.visit(ctx.lEx);
        Valor right = this.visit(ctx.rEx);

        switch(ctx.op.getType()){
            case MiniPascalParser.LTE:
                return new Valor(left.asFloat() <= right.asFloat());
            case MiniPascalParser.GTE:
                return new Valor(left.asFloat() >= right.asFloat());
            case MiniPascalParser.LT:
                return new Valor(left.asFloat() < right.asFloat());
            case MiniPascalParser.GT:
                return new Valor(left.asFloat() > right.asFloat());
            default:
                throw new RuntimeException("unknown operator: ");
        }
    }

    @Override
    public Valor visitEqualityExpr(MiniPascalParser.EqualityExprContext ctx){
        Valor left = this.visit(ctx.lEx);
        Valor right = this.visit(ctx.rEx);

        switch(ctx.op.getType()){
            case MiniPascalParser.EQ:
                return left.isFloat() && right.isFloat() ?
                        new Valor(Math.abs(left.asFloat() - right.asFloat()) < SMALL_Valor) :
                        new Valor(left.equals(right));
            case MiniPascalParser.NEQ:
                return left.isFloat() && right.isFloat() ?
                        new Valor(Math.abs(left.asFloat() - right.asFloat()) >= SMALL_Valor) :
                        new Valor(!left.equals(right));
            default:
                throw new RuntimeException("unknown operator: ");
        }
    }

    @Override
    public Valor visitAndExpr(MiniPascalParser.AndExprContext ctx){
        Valor left = this.visit(ctx.lEx);
        Valor right = this.visit(ctx.rEx);

        return new Valor(left.asBoolean() && right.asBoolean());
    }

    @Override
    public Valor visitOrExpr(MiniPascalParser.OrExprContext ctx){
        Valor left = this.visit(ctx.lEx);
        Valor right = this.visit(ctx.rEx);

        return new Valor(left.asBoolean() || right.asBoolean());
    }



    // Element overrides
    @Override
    public Valor visitParElement(MiniPascalParser.ParElementContext ctx) {
        return this.visit(ctx.expr());
    }

    @Override
    public Valor visitIdElement(MiniPascalParser.IdElementContext ctx) {
        String id = ctx.getText();

        // if(functions.containsKey(id)){

        // }
        String Valor = scopes.peek().get(id).toString();

        try{
            return new Valor(Float.parseFloat(Valor));
        }
        catch(Exception e){
            return new Valor(Boolean.parseBoolean(Valor));
        }
    }

    @Override
    public Valor visitBoolElement(MiniPascalParser.BoolElementContext ctx) {
        return new Valor(Boolean.valueOf(ctx.getText()));
    }

    @Override
    public Valor visitRealElement(MiniPascalParser.RealElementContext ctx) {
        return new Valor(Float.valueOf(ctx.getText()));
    }


    //USE FOR FUNCTION CALL
    @Override
    public Valor visitFunc_identifier(MiniPascalParser.Func_identifierContext ctx) {
        String funcId = ctx.ID().getText();
        return new Valor(funcId);
    }

    @Override
    public Valor visitIdentifier(MiniPascalParser.IdentifierContext ctx) {
        return new Valor(ctx.ID().getText());
    }



    //HELPER METHODs that adjusts scope at the end of a block
    private void CreateNewScope(){
        HashMap<String, Valor> newScope = new HashMap<String, Valor>();
        newScope.putAll(scopes.peek());
        scopes.push(newScope);
    }


    private void AdjustScope(){
        HashMap<String, Valor> currScope = scopes.pop();
        HashMap<String, Valor> oldScope = scopes.peek();
        for(Map.Entry<String, Valor> entry : oldScope.entrySet()){
            if(currScope.containsKey(entry.getKey())){
                Valor val = currScope.get(entry.getKey());
                oldScope.put(entry.getKey(), val);
            }
        }
    }

}