public class MyVisitor extends MiniPascalBaseVisitor<Object> {


        @Override public Object visitProgram(MiniPascalParser.ProgramContext ctx) {
            return visitChildren(ctx);
        }

    @Override
    public Object visitBlock(MiniPascalParser.BlockContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeclaration_part(MiniPascalParser.Declaration_partContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitVariable_declaration_part(MiniPascalParser.Variable_declaration_partContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitVariable_declaration_list(MiniPascalParser.Variable_declaration_listContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitVariable_declaration(MiniPascalParser.Variable_declarationContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitIndex_range(MiniPascalParser.Index_rangeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitType_specifier(MiniPascalParser.Type_specifierContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitPrimitive_type(MiniPascalParser.Primitive_typeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitFunction_declaration_part(MiniPascalParser.Function_declaration_partContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitProcedure_declaration_part(MiniPascalParser.Procedure_declaration_partContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitArguments(MiniPascalParser.ArgumentsContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitArgument_list(MiniPascalParser.Argument_listContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitArgument(MiniPascalParser.ArgumentContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitStatement_part(MiniPascalParser.Statement_partContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitCompound_statement(MiniPascalParser.Compound_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitStatement_list(MiniPascalParser.Statement_listContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitStatement(MiniPascalParser.StatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitSimple_statement(MiniPascalParser.Simple_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitAssignment_statement(MiniPascalParser.Assignment_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitProcedure_call(MiniPascalParser.Procedure_callContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitWriteln_statement(MiniPascalParser.Writeln_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitReadln_statement(MiniPascalParser.Readln_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitStructured_statement(MiniPascalParser.Structured_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitConditional_statement(MiniPascalParser.Conditional_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitWhile_statement(MiniPascalParser.While_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitRepeat_statement(MiniPascalParser.Repeat_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitFor_statement(MiniPascalParser.For_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitExpression_list(MiniPascalParser.Expression_listContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitExpression(MiniPascalParser.ExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitSimple_expression(MiniPascalParser.Simple_expressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitTerm(MiniPascalParser.TermContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitFactor(MiniPascalParser.FactorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitVariable(MiniPascalParser.VariableContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitConstant(MiniPascalParser.ConstantContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitFunction_call(MiniPascalParser.Function_callContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitRelational_operator(MiniPascalParser.Relational_operatorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitAdding_operator(MiniPascalParser.Adding_operatorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitMultiplying_operator(MiniPascalParser.Multiplying_operatorContext ctx) {
        return visitChildren(ctx);
    }


}
