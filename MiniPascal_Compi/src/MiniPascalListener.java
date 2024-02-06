// Generated from C:/Users/vjcm1/IdeaProjects/MiniPascal_Compi/src/MiniPascal.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniPascalParser}.
 */
public interface MiniPascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MiniPascalParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MiniPascalParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MiniPascalParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MiniPascalParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#declaration_part}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_part(MiniPascalParser.Declaration_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#declaration_part}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_part(MiniPascalParser.Declaration_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#variable_declaration_part}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration_part(MiniPascalParser.Variable_declaration_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#variable_declaration_part}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration_part(MiniPascalParser.Variable_declaration_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#variable_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration_list(MiniPascalParser.Variable_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#variable_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration_list(MiniPascalParser.Variable_declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(MiniPascalParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(MiniPascalParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#index_range}.
	 * @param ctx the parse tree
	 */
	void enterIndex_range(MiniPascalParser.Index_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#index_range}.
	 * @param ctx the parse tree
	 */
	void exitIndex_range(MiniPascalParser.Index_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier(MiniPascalParser.Type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier(MiniPascalParser.Type_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#primitive_type}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_type(MiniPascalParser.Primitive_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#primitive_type}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_type(MiniPascalParser.Primitive_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#function_declaration_part}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration_part(MiniPascalParser.Function_declaration_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#function_declaration_part}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration_part(MiniPascalParser.Function_declaration_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#procedure_declaration_part}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_declaration_part(MiniPascalParser.Procedure_declaration_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#procedure_declaration_part}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_declaration_part(MiniPascalParser.Procedure_declaration_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(MiniPascalParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(MiniPascalParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(MiniPascalParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(MiniPascalParser.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(MiniPascalParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(MiniPascalParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#statement_part}.
	 * @param ctx the parse tree
	 */
	void enterStatement_part(MiniPascalParser.Statement_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#statement_part}.
	 * @param ctx the parse tree
	 */
	void exitStatement_part(MiniPascalParser.Statement_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement(MiniPascalParser.Compound_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement(MiniPascalParser.Compound_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(MiniPascalParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(MiniPascalParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiniPascalParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiniPascalParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_statement(MiniPascalParser.Simple_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_statement(MiniPascalParser.Simple_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(MiniPascalParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(MiniPascalParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#procedure_call}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_call(MiniPascalParser.Procedure_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#procedure_call}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_call(MiniPascalParser.Procedure_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#writeln_statement}.
	 * @param ctx the parse tree
	 */
	void enterWriteln_statement(MiniPascalParser.Writeln_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#writeln_statement}.
	 * @param ctx the parse tree
	 */
	void exitWriteln_statement(MiniPascalParser.Writeln_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#readln_statement}.
	 * @param ctx the parse tree
	 */
	void enterReadln_statement(MiniPascalParser.Readln_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#readln_statement}.
	 * @param ctx the parse tree
	 */
	void exitReadln_statement(MiniPascalParser.Readln_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#structured_statement}.
	 * @param ctx the parse tree
	 */
	void enterStructured_statement(MiniPascalParser.Structured_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#structured_statement}.
	 * @param ctx the parse tree
	 */
	void exitStructured_statement(MiniPascalParser.Structured_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void enterConditional_statement(MiniPascalParser.Conditional_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void exitConditional_statement(MiniPascalParser.Conditional_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(MiniPascalParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(MiniPascalParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#repeat_statement}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_statement(MiniPascalParser.Repeat_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#repeat_statement}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_statement(MiniPascalParser.Repeat_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(MiniPascalParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(MiniPascalParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(MiniPascalParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(MiniPascalParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MiniPascalParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MiniPascalParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expression(MiniPascalParser.Simple_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expression(MiniPascalParser.Simple_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MiniPascalParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MiniPascalParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(MiniPascalParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(MiniPascalParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(MiniPascalParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(MiniPascalParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(MiniPascalParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(MiniPascalParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(MiniPascalParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(MiniPascalParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void enterRelational_operator(MiniPascalParser.Relational_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void exitRelational_operator(MiniPascalParser.Relational_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#adding_operator}.
	 * @param ctx the parse tree
	 */
	void enterAdding_operator(MiniPascalParser.Adding_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#adding_operator}.
	 * @param ctx the parse tree
	 */
	void exitAdding_operator(MiniPascalParser.Adding_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#multiplying_operator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplying_operator(MiniPascalParser.Multiplying_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#multiplying_operator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplying_operator(MiniPascalParser.Multiplying_operatorContext ctx);
}