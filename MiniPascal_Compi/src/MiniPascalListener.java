// Generated from C:/Users/gusta/IdeaProjects/Mini_Pascal_Compiler/MiniPascal_Compi/src/MiniPascal.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link MiniPascalParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationPart(MiniPascalParser.VariableDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationPart(MiniPascalParser.VariableDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(MiniPascalParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(MiniPascalParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterProcedureAndFunctionDeclarationPart(MiniPascalParser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitProcedureAndFunctionDeclarationPart(MiniPascalParser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(MiniPascalParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(MiniPascalParser.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#resultType}.
	 * @param ctx the parse tree
	 */
	void enterResultType(MiniPascalParser.ResultTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#resultType}.
	 * @param ctx the parse tree
	 */
	void exitResultType(MiniPascalParser.ResultTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(MiniPascalParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(MiniPascalParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(MiniPascalParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(MiniPascalParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterSection(MiniPascalParser.FormalParameterSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterSection(MiniPascalParser.FormalParameterSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(MiniPascalParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(MiniPascalParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(MiniPascalParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(MiniPascalParser.ArrayTypeContext ctx);
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
	 * Enter a parse tree produced by {@link MiniPascalParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(MiniPascalParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(MiniPascalParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#constantChr}.
	 * @param ctx the parse tree
	 */
	void enterConstantChr(MiniPascalParser.ConstantChrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#constantChr}.
	 * @param ctx the parse tree
	 */
	void exitConstantChr(MiniPascalParser.ConstantChrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(MiniPascalParser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(MiniPascalParser.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedInteger(MiniPascalParser.UnsignedIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedInteger(MiniPascalParser.UnsignedIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedReal(MiniPascalParser.UnsignedRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedReal(MiniPascalParser.UnsignedRealContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(MiniPascalParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(MiniPascalParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(MiniPascalParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(MiniPascalParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#blockEnd}.
	 * @param ctx the parse tree
	 */
	void enterBlockEnd(MiniPascalParser.BlockEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#blockEnd}.
	 * @param ctx the parse tree
	 */
	void exitBlockEnd(MiniPascalParser.BlockEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(MiniPascalParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(MiniPascalParser.StatementsContext ctx);
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
	 * Enter a parse tree produced by {@link MiniPascalParser#writelnStatement}.
	 * @param ctx the parse tree
	 */
	void enterWritelnStatement(MiniPascalParser.WritelnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#writelnStatement}.
	 * @param ctx the parse tree
	 */
	void exitWritelnStatement(MiniPascalParser.WritelnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(MiniPascalParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(MiniPascalParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureStatement(MiniPascalParser.ProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureStatement(MiniPascalParser.ProcedureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#actualParameterList}.
	 * @param ctx the parse tree
	 */
	void enterActualParameterList(MiniPascalParser.ActualParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#actualParameterList}.
	 * @param ctx the parse tree
	 */
	void exitActualParameterList(MiniPascalParser.ActualParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void enterActualParameter(MiniPascalParser.ActualParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void exitActualParameter(MiniPascalParser.ActualParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MiniPascalParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MiniPascalParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MiniPascalParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MiniPascalParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(MiniPascalParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(MiniPascalParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(MiniPascalParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(MiniPascalParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(MiniPascalParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(MiniPascalParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void enterReadStatement(MiniPascalParser.ReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void exitReadStatement(MiniPascalParser.ReadStatementContext ctx);
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
	 * Enter a parse tree produced by {@link MiniPascalParser#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationaloperator(MiniPascalParser.RelationaloperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationaloperator(MiniPascalParser.RelationaloperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(MiniPascalParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(MiniPascalParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#additiveoperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveoperator(MiniPascalParser.AdditiveoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#additiveoperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveoperator(MiniPascalParser.AdditiveoperatorContext ctx);
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
	 * Enter a parse tree produced by {@link MiniPascalParser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeoperator(MiniPascalParser.MultiplicativeoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeoperator(MiniPascalParser.MultiplicativeoperatorContext ctx);
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
	 * Enter a parse tree produced by {@link MiniPascalParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(MiniPascalParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(MiniPascalParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#conststr}.
	 * @param ctx the parse tree
	 */
	void enterConststr(MiniPascalParser.ConststrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#conststr}.
	 * @param ctx the parse tree
	 */
	void exitConststr(MiniPascalParser.ConststrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MiniPascalParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MiniPascalParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(MiniPascalParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(MiniPascalParser.NumberContext ctx);
}