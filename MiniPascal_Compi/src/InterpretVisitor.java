import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;
import java.lang.Math;

public class InterpretVisitor extends MiniPascalBaseVisitor<Valor>{

    Scanner io = new Scanner(System.in);
    private HashMap<String, Valor> globalMem = new HashMap<>();
    private Stack<HashMap<String, Valor>> scopes = new Stack<>();
    private HashMap<String, MiniPascalParser.FuncDecContext> functions = new HashMap<>();
    private HashMap<String, MiniPascalParser.ProcDecContext> procedures = new HashMap<>();

    public static final float SMALL_VALUE = 0.0000001f;
    private boolean evalLoop = true;
    private boolean evalLoopBlock = true;

    @Override
    public Valor visitStart(MiniPascalParser.StartContext ctx) {
        scopes.push(globalMem);
        return visitChildren(ctx);
    }
    @Override
    public Valor visitInitDec(MiniPascalParser.InitDecContext ctx) {
        String id = ctx.ID().getText();
        int line = ctx.ID().getSymbol().getLine();
        int column = ctx.ID().getSymbol().getCharPositionInLine();
        if (scopes.peek().containsKey(id)) {
            throw new RuntimeException("La variable '" + id + "' ya está declarada. Línea: " + line + ", Columna: " + column);
        }
        Valor value = this.visit(ctx.expr());
        return scopes.peek().put(id, value);
    }



    @Override
    public Valor visitNormDec(MiniPascalParser.NormDecContext ctx) {
        String id = ctx.ID().getText();
        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine();
        if (scopes.peek().containsKey(id)) {
            throw new RuntimeException("Error: La variable '" + id + "' ya está declarada en el ámbito actual. Línea: " + line + ", Columna: " + column);
        }

        Valor value = switch (ctx.type.getType()) {
            case MiniPascalParser.BOOLEAN -> new Valor(Boolean.FALSE);
            case MiniPascalParser.INTEGER -> new Valor(0.0f);
            case MiniPascalParser.CHAR -> new Valor("");
            case MiniPascalParser.STRING -> new Valor("");
            default ->
                    throw new RuntimeException("Error: Tipo no válido para la variable '" + id + "'. Línea: " + line + ", Columna: " + column);
        };

        scopes.peek().put(id, value);
        return Valor.VOID;
    }


    @Override
    public Valor visitFuncDec(MiniPascalParser.FuncDecContext ctx) {
        String funcName = ctx.ID().getText();
        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine();
        if (functions.containsKey(funcName)) {
            throw new RuntimeException("Error: La función '" + funcName + "' ya está declarada. Línea: " + line + ", Columna: " + column);
        }
        if (ctx.type == null || !esTipoValido(ctx.type.getText())) {
            throw new RuntimeException("Error: Tipo de retorno no válido para la función '" + funcName + "'. Línea: " + line + ", Columna: " + column);
        }
        functions.put(funcName, ctx);
        return Valor.VOID;
    }

    private boolean esTipoValido(String tipo) {
        return tipo.equals("Integer") || tipo.equals("Boolean") || tipo.equals("String") || tipo.equals("Char");
    }

    @Override
    public Valor visitProcDec(MiniPascalParser.ProcDecContext ctx) {
        String procName = ctx.ID().getText();
        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine();
        if (procedures.containsKey(procName) || functions.containsKey(procName) || checkIfUsedInVariables(procName)) {
            throw new RuntimeException("Error: El nombre '" + procName + "' ya está en uso. Línea: " + line + ", Columna: " + column);
        }
        if (ctx.formalParameterList() != null) {
            Set<String> paramNames = new HashSet<>();
            for (MiniPascalParser.ParamGroupContext paramGroup : ctx.formalParameterList().paramGroup()) {
                MiniPascalParser.VariableListContext variableListContext = paramGroup.variableList();
                for (MiniPascalParser.IdentifierContext idContext : variableListContext.identifier()) {
                    String paramName = idContext.getText();
                    if (!paramNames.add(paramName)) {
                        throw new RuntimeException("Error: Nombre de parámetro duplicado '" + paramName + "' en el procedimiento '" + procName + "'. Línea: " + line + ", Columna: " + column);
                    }
                }
            }
        }
        procedures.put(procName, ctx);
        return Valor.VOID;
    }
    private boolean checkIfUsedInVariables(String name) {
        for (Map<String, Valor> scope : scopes) {
            if (scope.containsKey(name)) {
                return true;
            }
        }
        return false;
    }




    @Override
    public Valor visitFunctionCall(MiniPascalParser.FunctionCallContext ctx) {
        CreateNewScope();
        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine();
        String funcName = ctx.func_identifier().getText();
        if (!functions.containsKey(funcName)) {
            throw new RuntimeException("Función no definida: " + funcName + " Linea: "+line+" Columna:"+column);
        }
        MiniPascalParser.FuncDecContext funcCtx = functions.get(funcName);
        List<MiniPascalParser.ExprContext> paramValors = ctx.parameters().expr();
        int expectedParams = funcCtx.formalParameterList().paramGroup().stream()
                .mapToInt(pg -> pg.variableList().identifier().size()).sum();
        if (paramValors.size() != expectedParams) {
            throw new RuntimeException("Número incorrecto de argumentos para la función " + funcName +
                    ". Esperado: " + expectedParams + ", proporcionado: " + paramValors.size());
        }
        funcCtx = functions.get(this.visit(ctx.func_identifier()).asString());
        Valor tempVal = null;
        switch(funcCtx.type.getType()){
            case MiniPascalParser.BOOLEAN:
                tempVal = new Valor(true);
            case MiniPascalParser.INTEGER:
                tempVal = new Valor(0.0f);
            case MiniPascalParser.CHAR:
                tempVal = new Valor("");
            case MiniPascalParser.STRING:
                tempVal = new Valor("");
            default:
                tempVal = null;
        }
        scopes.peek().put(funcName, tempVal);
        List<MiniPascalParser.ParamGroupContext> paramGroups = funcCtx.formalParameterList().paramGroup();
        int counter = 0;
        for(MiniPascalParser.ParamGroupContext paramGroup : paramGroups){
            List<MiniPascalParser.IdentifierContext> ids = paramGroup.variableList().identifier();
            for(MiniPascalParser.IdentifierContext idCtx : ids){
                String id = this.visit(idCtx).asString();
                Valor val = this.visit(paramValors.get(counter));
                scopes.peek().put(id, val);
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
        MiniPascalParser.ProcDecContext procCtx = procedures.get(this.visit(ctx.func_identifier()).asString());
        List<MiniPascalParser.ExprContext> paramValors = ctx.parameters().expr();
        List<MiniPascalParser.ParamGroupContext> paramGroups = procCtx.formalParameterList().paramGroup();
        int counter = 0;
        for(MiniPascalParser.ParamGroupContext paramGroup : paramGroups){
            List<MiniPascalParser.IdentifierContext> ids = paramGroup.variableList().identifier();
            for(MiniPascalParser.IdentifierContext idCtx : ids){
                String id = this.visit(idCtx).asString();
                Valor val = this.visit(paramValors.get(counter));
                scopes.peek().put(id, val);
                counter++;
            }
        }
        this.visitChildren(procCtx);
        AdjustScope();
        return Valor.VOID;
    }
    @Override
    public Valor visitFuncAssignment(MiniPascalParser.FuncAssignmentContext ctx) {
        String id = ctx.ID().getText();
        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine();
        if (!checkIfVariableExistsInScopes(id)) {
            throw new RuntimeException("La variable '" + id + "' no ha sido declarada. Linea: "+line+" Columna: "+column);
        }
        Valor value = this.visit(ctx.functionCall());
        scopes.peek().put(id, value);
        return Valor.VOID;
    }

    private boolean checkIfVariableExistsInScopes(String name) {
        for (Map<String, Valor> scope : scopes) {
            if (scope.containsKey(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Valor visitExprAssignment(MiniPascalParser.ExprAssignmentContext ctx) {
        String id = ctx.ID().getText();
        if (!checkIfVariableExistsInScopes(id)) {
            int line = ctx.start.getLine();
            int column = ctx.start.getCharPositionInLine();
            throw new RuntimeException("La variable '" + id + "' no ha sido declarada. Línea: " + line + ", Columna: " + column);
        }
        Valor value = this.visit(ctx.expr());
        scopes.peek().put(id, value);
        return Valor.VOID;
    }

// Asumiendo la implementación de checkIfVariableExistsInScopes y isTypeCompatible como se discutió previamente.


    @Override
    public Valor visitVarForAssign(MiniPascalParser.VarForAssignContext ctx) {
        String id = ctx.ID().getText();
        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine();
        if (!checkIfVariableExistsInScopes(id)) {
            throw new RuntimeException("La variable '" + id + "' no ha sido declarada. Línea: " + line + ", Columna: " + column);
        }
        Valor value = this.visit(ctx.expr());
        scopes.peek().put(id, value);
        return value;
    }

    @Override
    public Valor visitReadLn(MiniPascalParser.ReadLnContext ctx) {
        String id = ctx.ID().getText();
        Valor a = new Valor(io.nextLine());
        scopes.peek().put(id, a);
        return Valor.VOID;
    }
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
    public Valor visitWrite(MiniPascalParser.WriteContext ctx) {
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
    @Override
    public Valor visitWhileLoop(MiniPascalParser.WhileLoopContext ctx) {
        CreateNewScope();
        Valor value = this.visit(ctx.expr());

        while(value.asBoolean()){
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
            value = this.visit(ctx.expr());
        }
        AdjustScope();
        return Valor.VOID;
    }

    @Override
    public Valor visitForLoop(MiniPascalParser.ForLoopContext ctx) {
        CreateNewScope();
        Valor value = this.visit(ctx.varForAssign());
        Valor compareElement = this.visit(ctx.element());
        float i = value.asFloat();
        float iMax = compareElement.asFloat();
        while(i <= iMax){
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
            if(b1.asBoolean() == b2.asBoolean()){
                this.visit(c.statement());
                return Valor.VOID;
            }
        }
        return Valor.VOID;
    }
    @Override
    public Valor visitUnaryExpr(MiniPascalParser.UnaryExprContext ctx){
        Valor value = this.visit(ctx.expr());
        return new Valor(-value.asFloat());
    }
    @Override
    public Valor visitNotExpr(MiniPascalParser.NotExprContext ctx){
        Valor value = this.visit(ctx.expr());
        return new Valor(!value.asBoolean());
    }
    @Override
    public Valor visitMultExpr(MiniPascalParser.MultExprContext ctx){
        Valor left = this.visit(ctx.lEx);
        Valor right = this.visit(ctx.rEx);
        return switch (ctx.op.getType()) {
            case MiniPascalParser.MULT -> new Valor(left.asFloat() * right.asFloat());
            case MiniPascalParser.DIV -> new Valor(left.asFloat() / right.asFloat());
            case MiniPascalParser.MOD -> new Valor(left.asFloat() % right.asFloat());
            default -> throw new RuntimeException("unknown operator: ");
        };
    }
    @Override
    public Valor visitAddExpr(MiniPascalParser.AddExprContext ctx){
        Valor left = this.visit(ctx.lEx);
        Valor right = this.visit(ctx.rEx);
        return switch (ctx.op.getType()) {
            case MiniPascalParser.ADD -> new Valor(left.asFloat() + right.asFloat());
            case MiniPascalParser.SUBT -> new Valor(left.asFloat() - right.asFloat());
            default -> throw new RuntimeException("unknown operator: ");
        };
    }
    @Override
    public Valor visitCompareExpr(MiniPascalParser.CompareExprContext ctx){
        Valor left = this.visit(ctx.lEx);
        Valor right = this.visit(ctx.rEx);
        return switch (ctx.op.getType()) {
            case MiniPascalParser.LTE -> new Valor(left.asFloat() <= right.asFloat());
            case MiniPascalParser.GTE -> new Valor(left.asFloat() >= right.asFloat());
            case MiniPascalParser.LT -> new Valor(left.asFloat() < right.asFloat());
            case MiniPascalParser.GT -> new Valor(left.asFloat() > right.asFloat());
            default -> throw new RuntimeException("unknown operator: ");
        };
    }
    @Override
    public Valor visitEqualityExpr(MiniPascalParser.EqualityExprContext ctx){
        Valor left = this.visit(ctx.lEx);
        Valor right = this.visit(ctx.rEx);
        return switch (ctx.op.getType()) {
            case MiniPascalParser.EQ -> left.isFloat() && right.isFloat() ?
                    new Valor(Math.abs(left.asFloat() - right.asFloat()) < SMALL_VALUE) :
                    new Valor(left.equals(right));
            case MiniPascalParser.NEQ -> left.isFloat() && right.isFloat() ?
                    new Valor(Math.abs(left.asFloat() - right.asFloat()) >= SMALL_VALUE) :
                    new Valor(!left.equals(right));
            default -> throw new RuntimeException("unknown operator: ");
        };
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
    @Override
    public Valor visitParElement(MiniPascalParser.ParElementContext ctx) {
        return this.visit(ctx.expr());
    }
    @Override
    public Valor visitIdElement(MiniPascalParser.IdElementContext ctx) {
        String id = ctx.getText();
        String value = scopes.peek().get(id).toString();
        try{
            return new Valor(Float.parseFloat(value));
        }
        catch(Exception e){
            return new Valor(Boolean.parseBoolean(value));
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
    @Override
    public Valor visitFunc_identifier(MiniPascalParser.Func_identifierContext ctx) {
        String funcId = ctx.ID().getText();
        return new Valor(funcId);
    }
    @Override
    public Valor visitIdentifier(MiniPascalParser.IdentifierContext ctx) {
        return new Valor(ctx.ID().getText());
    }
    private void CreateNewScope(){
        HashMap<String, Valor> newScope = new HashMap<>(scopes.peek());
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