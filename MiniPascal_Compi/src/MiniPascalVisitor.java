// Generated from C:/Users/vjcm1/IdeaProjects/MiniPascal_Compi/src/MiniPascal.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniPascalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniPascalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MiniPascalParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MiniPascalParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#declaration_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_part(MiniPascalParser.Declaration_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#variable_declaration_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration_part(MiniPascalParser.Variable_declaration_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#variable_declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration_list(MiniPascalParser.Variable_declaration_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(MiniPascalParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#index_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_range(MiniPascalParser.Index_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#type_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_specifier(MiniPascalParser.Type_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#primitive_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_type(MiniPascalParser.Primitive_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#function_declaration_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration_part(MiniPascalParser.Function_declaration_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#procedure_declaration_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_declaration_part(MiniPascalParser.Procedure_declaration_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(MiniPascalParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(MiniPascalParser.Argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(MiniPascalParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#statement_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_part(MiniPascalParser.Statement_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#compound_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_statement(MiniPascalParser.Compound_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list(MiniPascalParser.Statement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MiniPascalParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#simple_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_statement(MiniPascalParser.Simple_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(MiniPascalParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#procedure_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_call(MiniPascalParser.Procedure_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#writeln_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteln_statement(MiniPascalParser.Writeln_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#readln_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadln_statement(MiniPascalParser.Readln_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#structured_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructured_statement(MiniPascalParser.Structured_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#conditional_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_statement(MiniPascalParser.Conditional_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(MiniPascalParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#repeat_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_statement(MiniPascalParser.Repeat_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(MiniPascalParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(MiniPascalParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MiniPascalParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expression(MiniPascalParser.Simple_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(MiniPascalParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(MiniPascalParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(MiniPascalParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(MiniPascalParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(MiniPascalParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#relational_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_operator(MiniPascalParser.Relational_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#adding_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdding_operator(MiniPascalParser.Adding_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#multiplying_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplying_operator(MiniPascalParser.Multiplying_operatorContext ctx);
}