import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AntlrToExpression extends MiniPascalBaseVisitor<Expression> {

    public List<String> vars;
    public List<String> erroresSemanticos;
    public List<String> mensajes;
    public List<String> for_loop;
    public List<String> while_loop;
    public List<String> if_state;
    public List<String> repeat_loop;

    public AntlrToExpression(List<String> erroresSemanticos, List<String> vars, List<String> mensajes,
                             List<String> for_loop, List<String> while_loop, List<String> if_state, List<String> repeat_loop) {
        this.vars = vars;
        this.erroresSemanticos = erroresSemanticos;
        this.mensajes = mensajes;
        this.for_loop = for_loop;
        this.while_loop = while_loop;
        this.if_state = if_state;
        this.repeat_loop = repeat_loop; // Inicializamos el nuevo array
    }
    @Override
    public Expression visitBlock(MiniPascalParser.BlockContext ctx) {
        return super.visitBlock(ctx);
    }

    @Override
    public Expression visitVariableDeclarationPart(MiniPascalParser.VariableDeclarationPartContext ctx) {
        return super.visitVariableDeclarationPart(ctx);
    }

    @Override
    public Expression visitVariableDeclaration(MiniPascalParser.VariableDeclarationContext ctx) {
        Token idToken = ctx.identifierList().identifier().getFirst().IDENT().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();
        if(vars.contains(id)) {
            erroresSemanticos.add("Error: variable " + id + " ya fue declarada ("+line+", "+column+")");
        }else{
            vars.add(id);
        }
        String type = ctx.getChild(2).getText();
        return new VariableDeclaration(id,type);
    }

    @Override
    public Expression visitProcedureAndFunctionDeclarationPart(MiniPascalParser.ProcedureAndFunctionDeclarationPartContext ctx) {
        return super.visitProcedureAndFunctionDeclarationPart(ctx);
    }

    @Override
    public Expression visitProcedureDeclaration(MiniPascalParser.ProcedureDeclarationContext ctx) {
        return super.visitProcedureDeclaration(ctx);
    }

    @Override
    public Expression visitResultType(MiniPascalParser.ResultTypeContext ctx) {
        return super.visitResultType(ctx);
    }

    @Override
    public Expression visitFunctionDeclaration(MiniPascalParser.FunctionDeclarationContext ctx) {
        String id = ctx.getChild(1).getText();
        vars.add(id);
        return new Variable(id);
    }

    @Override
    public Expression visitFormalParameterList(MiniPascalParser.FormalParameterListContext ctx) {
        return super.visitFormalParameterList(ctx);
    }

    @Override
    public Expression visitFormalParameterSection(MiniPascalParser.FormalParameterSectionContext ctx) {
        return super.visitFormalParameterSection(ctx);
    }

    @Override
    public Expression visitTypeIdentifier(MiniPascalParser.TypeIdentifierContext ctx) {
        return super.visitTypeIdentifier(ctx);
    }

    @Override
    public Expression visitArrayType(MiniPascalParser.ArrayTypeContext ctx) {
        return super.visitArrayType(ctx);
    }

    @Override
    public Expression visitConstant(MiniPascalParser.ConstantContext ctx) {
        return super.visitConstant(ctx);
    }

    @Override
    public Expression visitSign(MiniPascalParser.SignContext ctx) {
        return super.visitSign(ctx);
    }

    @Override
    public Expression visitConstantChr(MiniPascalParser.ConstantChrContext ctx) {
        String message = ctx.getChild(0).getText();
        mensajes.add(message);
        return new Write(message);
    }

    @Override
    public Expression visitUnsignedNumber(MiniPascalParser.UnsignedNumberContext ctx) {
        return super.visitUnsignedNumber(ctx);
    }

    @Override
    public Expression visitUnsignedInteger(MiniPascalParser.UnsignedIntegerContext ctx) {
        return super.visitUnsignedInteger(ctx);
    }

    @Override
    public Expression visitUnsignedReal(MiniPascalParser.UnsignedRealContext ctx) {
        return super.visitUnsignedReal(ctx);
    }

    @Override
    public Expression visitString(MiniPascalParser.StringContext ctx) {
        return super.visitString(ctx);
    }

    @Override
    public Expression visitCompoundStatement(MiniPascalParser.CompoundStatementContext ctx) {
        return super.visitCompoundStatement(ctx);
    }

    @Override
    public Expression visitBlockEnd(MiniPascalParser.BlockEndContext ctx) {
        return super.visitBlockEnd(ctx);
    }

    @Override
    public Expression visitStatements(MiniPascalParser.StatementsContext ctx) {
        return super.visitStatements(ctx);
    }

    @Override
    public Expression visitStatement(MiniPascalParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    @Override
    public Expression visitAssignmentStatement(MiniPascalParser.AssignmentStatementContext ctx) {
        return super.visitAssignmentStatement(ctx);
    }

    @Override
    public Expression visitProcedureStatement(MiniPascalParser.ProcedureStatementContext ctx) {
        return super.visitProcedureStatement(ctx);
    }

    @Override
    public Expression visitActualParameterList(MiniPascalParser.ActualParameterListContext ctx) {
        return super.visitActualParameterList(ctx);
    }

    @Override
    public Expression visitActualParameter(MiniPascalParser.ActualParameterContext ctx) {
        return super.visitActualParameter(ctx);
    }

    @Override
    public Expression visitIfStatement(MiniPascalParser.IfStatementContext ctx) {
        Expression condition = visit(ctx.expression());
        if_state.add(ctx.expression().getText());
        visit(ctx.statement(0));
        if (ctx.statement().size() > 1) {
            visit(ctx.statement(1));
        }

        return null;
    }

    @Override
    public Expression visitWhileStatement(MiniPascalParser.WhileStatementContext ctx) {
        Expression condition = visit(ctx.expression());
        while_loop.add(ctx.expression().getText());
        visit(ctx.statement());
        return null;
    }

    @Override
    public Expression visitForStatement(MiniPascalParser.ForStatementContext ctx) {
        String id = ctx.identifier().getText();
        int initial = Integer.parseInt(ctx.expression(0).getText());
        int finalValue = Integer.parseInt(ctx.expression(1).getText());

        // Guardar información del bucle for
        for_loop.add("For " + id + " from " + initial + " to " + finalValue);

        for (int i = initial; i <= finalValue; i++) {
            vars.add(id); // Agregar la variable del bucle al contexto
            // Visitar el bloque de código del bucle for
            visit(ctx.statement());
        }
        return null;
    }

    @Override
    public Expression visitRepeatStatement(MiniPascalParser.RepeatStatementContext ctx) {
        // Visita la expresión condicional del repeat
        Expression condition = visit(ctx.expression());

        // Almacena la expresión del repeat en la lista repeat_loop
        repeat_loop.add(ctx.expression().getText());

        // Visita el bloque de código del repeat
        //visit(ctx.statement());

        return null;
    }

    @Override
    public Expression visitWriteStatement(MiniPascalParser.WriteStatementContext ctx) {
        return super.visitWriteStatement(ctx);
    }

    @Override
    public Expression visitReadStatement(MiniPascalParser.ReadStatementContext ctx) {
        return super.visitReadStatement(ctx);
    }

    @Override
    public Expression visitExpression(MiniPascalParser.ExpressionContext ctx) {
        return super.visitExpression(ctx);
    }

    @Override
    public Expression visitWritelnStatement(MiniPascalParser.WritelnStatementContext ctx) {
        String message = ctx.getText();
        mensajes.add(message);
        return new Write(message);
    }

    @Override
    public Expression visitRelationaloperator(MiniPascalParser.RelationaloperatorContext ctx) {
        return super.visitRelationaloperator(ctx);
    }

    @Override
    public Expression visitSimpleExpression(MiniPascalParser.SimpleExpressionContext ctx) {
        return super.visitSimpleExpression(ctx);
    }

    @Override
    public Expression visitAdditiveoperator(MiniPascalParser.AdditiveoperatorContext ctx) {
        return super.visitAdditiveoperator(ctx);
    }

    @Override
    public Expression visitTerm(MiniPascalParser.TermContext ctx) {
//        if (Objects.equals(ctx.getChild(1).getText(), "*")){
//            Expression left = visit(ctx.getChild(0));
//            Expression right = visit(ctx.getChild(2));
//            return new Multiplication(left,right);
//        }else if (Objects.equals(ctx.getChild(1).getText(), "+")){
//            Expression left = visit(ctx.getChild(0));
//            Expression right = visit(ctx.getChild(2));
//            return new Addition(left,right);
//        }else{
//            return super.visitTerm(ctx);
//        }
        return super.visitTerm(ctx);
    }

    @Override
    public Expression visitMultiplicativeoperator(MiniPascalParser.MultiplicativeoperatorContext ctx) {
        return super.visitMultiplicativeoperator(ctx);
    }

    @Override
    public Expression visitFactor(MiniPascalParser.FactorContext ctx) {

        return null;
    }

    @Override
    public Expression visitVariable(MiniPascalParser.VariableContext ctx) {
        return super.visitVariable(ctx);
    }

    @Override
    public Expression visitIdentifierList(MiniPascalParser.IdentifierListContext ctx) {
        return super.visitIdentifierList(ctx);
    }

    @Override
    public Expression visitConststr(MiniPascalParser.ConststrContext ctx) {
        return super.visitConststr(ctx);
    }

    @Override
    public Expression visitIdentifier(MiniPascalParser.IdentifierContext ctx) {
        Token idToken = ctx.IDENT().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();
        if(!vars.contains(id)) {
            erroresSemanticos.add("Error: variable " + id + " no ha sido declarada (" + line + ", " + column + ")");
        }else{
            vars.add(id);
        }
        return new Variable(id);
    }

    @Override
    public Expression visitNumber(MiniPascalParser.NumberContext ctx) {
        String numText = ctx.getChild(0).getText();
        int num = Integer.parseInt(numText);
        return new Number(num);
    }
}
