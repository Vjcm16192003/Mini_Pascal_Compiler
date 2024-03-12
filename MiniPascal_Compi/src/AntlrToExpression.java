
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;
public class AntlrToExpression extends MiniPascalBaseVisitor<Expression>{

    private List<String> vars;
    private List<String> erroresSemanticos;

    public AntlrToExpression(List<String> erroresSemanticos){
        vars = new ArrayList<>();
        this.erroresSemanticos = erroresSemanticos;
    }
    @Override
    public Expression visitBlock(MiniPascalParser.BlockContext ctx) {
        return super.visitBlock(ctx);
    }

    @Override
    public Expression visitDecl(MiniPascalParser.DeclContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine()+1;
        String id = ctx.getChild(0).getText();
        if (vars.contains(id)){
            erroresSemanticos.add("Error: variable" + id + " ya fue declarada (" + line + ", " + column + ")");
        } else {
            vars.add(id);
        }
        String type = ctx.getChild(2).getText();
        int value = Integer.parseInt(ctx.NUM().getText());
        return new VariableDeclaration(id,type,value);
    }

    @Override
    public Expression visitVariable_decl(MiniPascalParser.Variable_declContext ctx) {
        return super.visitVariable_decl(ctx);
    }

    @Override
    public Expression visitArray_decl(MiniPascalParser.Array_declContext ctx) {
        return super.visitArray_decl(ctx);
    }

    @Override
    public Expression visitExprStatement(MiniPascalParser.ExprStatementContext ctx) {
        return super.visitExprStatement(ctx);
    }

    @Override
    public Expression visitIfStatement(MiniPascalParser.IfStatementContext ctx) {
        return super.visitIfStatement(ctx);
    }

    @Override
    public Expression visitWhileStatement(MiniPascalParser.WhileStatementContext ctx) {
        return super.visitWhileStatement(ctx);
    }

    @Override
    public Expression visitForStatement(MiniPascalParser.ForStatementContext ctx) {
        return super.visitForStatement(ctx);
    }

    @Override
    public Expression visitRepeatStatement(MiniPascalParser.RepeatStatementContext ctx) {
        return super.visitRepeatStatement(ctx);
    }

    @Override
    public Expression visitFunctionCallStatement(MiniPascalParser.FunctionCallStatementContext ctx) {
        return super.visitFunctionCallStatement(ctx);
    }

    @Override
    public Expression visitProcedureCallStatement(MiniPascalParser.ProcedureCallStatementContext ctx) {
        return super.visitProcedureCallStatement(ctx);
    }

    @Override
    public Expression visitIfStatementRule(MiniPascalParser.IfStatementRuleContext ctx) {
        return super.visitIfStatementRule(ctx);
    }

    @Override
    public Expression visitWhileStatementRule(MiniPascalParser.WhileStatementRuleContext ctx) {
        return super.visitWhileStatementRule(ctx);
    }

    @Override
    public Expression visitForStatementRule(MiniPascalParser.ForStatementRuleContext ctx) {
        return super.visitForStatementRule(ctx);
    }

    @Override
    public Expression visitRepeatStatementRule(MiniPascalParser.RepeatStatementRuleContext ctx) {
        return super.visitRepeatStatementRule(ctx);
    }

    @Override
    public Expression visitGreaterThanOrEqualExpr(MiniPascalParser.GreaterThanOrEqualExprContext ctx) {
        return super.visitGreaterThanOrEqualExpr(ctx);
    }

    @Override
    public Expression visitStringLiteralExpr(MiniPascalParser.StringLiteralExprContext ctx) {
        return super.visitStringLiteralExpr(ctx);
    }

    @Override
    public Expression visitLessThanOrEqualExpr(MiniPascalParser.LessThanOrEqualExprContext ctx) {
        return super.visitLessThanOrEqualExpr(ctx);
    }

    @Override
    public Expression visitModExpr(MiniPascalParser.ModExprContext ctx) {
        return super.visitModExpr(ctx);
    }

    @Override
    public Expression visitBooleanExpr(MiniPascalParser.BooleanExprContext ctx) {
        return super.visitBooleanExpr(ctx);
    }

    @Override
    public Expression visitLessThanExpr(MiniPascalParser.LessThanExprContext ctx) {
        return super.visitLessThanExpr(ctx);
    }

    @Override
    public Expression visitOrExpr(MiniPascalParser.OrExprContext ctx) {
        return super.visitOrExpr(ctx);
    }

    @Override
    public Expression visitNotEqualToExpr(MiniPascalParser.NotEqualToExprContext ctx) {
        return super.visitNotEqualToExpr(ctx);
    }

    @Override
    public Expression visitSubExpr(MiniPascalParser.SubExprContext ctx) {
        return super.visitSubExpr(ctx);
    }

    @Override
    public Expression visitParenthesesExpr(MiniPascalParser.ParenthesesExprContext ctx) {
        return super.visitParenthesesExpr(ctx);
    }

    @Override
    public Expression visitNumExpr(MiniPascalParser.NumExprContext ctx) {
        String numText = ctx.getChild(0).getText();
        int num = Integer.parseInt(numText);
        return new Number(num);
    }

    @Override
    public Expression visitGreaterThanExpr(MiniPascalParser.GreaterThanExprContext ctx) {
        return super.visitGreaterThanExpr(ctx);
    }

    @Override
    public Expression visitNotExpr(MiniPascalParser.NotExprContext ctx) {
        return super.visitNotExpr(ctx);
    }

    @Override
    public Expression visitArrayAccessExpr(MiniPascalParser.ArrayAccessExprContext ctx) {
        return super.visitArrayAccessExpr(ctx);
    }

    @Override
    public Expression visitConstCharExpr(MiniPascalParser.ConstCharExprContext ctx) {
        return super.visitConstCharExpr(ctx);
    }

    @Override
    public Expression visitAddExpr(MiniPascalParser.AddExprContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new Addition(left, right);
    }

    @Override
    public Expression visitEqualToExpr(MiniPascalParser.EqualToExprContext ctx) {
        return super.visitEqualToExpr(ctx);
    }

    @Override
    public Expression visitMulExpr(MiniPascalParser.MulExprContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new Multiplication(left, right);
    }

    @Override
    public Expression visitDivExpr(MiniPascalParser.DivExprContext ctx) {
        return super.visitDivExpr(ctx);
    }

    @Override
    public Expression visitIdExpr(MiniPascalParser.IdExprContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();
        if (!vars.contains(id)){
            erroresSemanticos.add("Error variable "+ id + " no declarada (" + line +", "+column+")");
        }
        return new Variable(id);
    }

    @Override
    public Expression visitAndExpr(MiniPascalParser.AndExprContext ctx) {
        return super.visitAndExpr(ctx);
    }

    @Override
    public Expression visitArray_access(MiniPascalParser.Array_accessContext ctx) {
        return super.visitArray_access(ctx);
    }

    @Override
    public Expression visitIndex_expr(MiniPascalParser.Index_exprContext ctx) {
        return super.visitIndex_expr(ctx);
    }

    @Override
    public Expression visitType(MiniPascalParser.TypeContext ctx) {
        return super.visitType(ctx);
    }

    @Override
    public Expression visitArray_type(MiniPascalParser.Array_typeContext ctx) {
        return super.visitArray_type(ctx);
    }

    @Override
    public Expression visitValue(MiniPascalParser.ValueContext ctx) {
        return super.visitValue(ctx);
    }

    @Override
    public Expression visitArray_value(MiniPascalParser.Array_valueContext ctx) {
        return super.visitArray_value(ctx);
    }

    @Override
    public Expression visitFunction_decl(MiniPascalParser.Function_declContext ctx) {
        return super.visitFunction_decl(ctx);
    }

    @Override
    public Expression visitParams(MiniPascalParser.ParamsContext ctx) {
        return super.visitParams(ctx);
    }

    @Override
    public Expression visitParam(MiniPascalParser.ParamContext ctx) {
        return super.visitParam(ctx);
    }

    @Override
    public Expression visitFunction_call(MiniPascalParser.Function_callContext ctx) {
        return super.visitFunction_call(ctx);
    }

    @Override
    public Expression visitArgs(MiniPascalParser.ArgsContext ctx) {
        return super.visitArgs(ctx);
    }

    @Override
    public Expression visitProcedure_decl(MiniPascalParser.Procedure_declContext ctx) {
        return super.visitProcedure_decl(ctx);
    }

    @Override
    public Expression visitProcedure_call(MiniPascalParser.Procedure_callContext ctx) {
        return super.visitProcedure_call(ctx);
    }

    @Override
    public Expression visitMain(MiniPascalParser.MainContext ctx) {
        return super.visitMain(ctx);
    }
}
