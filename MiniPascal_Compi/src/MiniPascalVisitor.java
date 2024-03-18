// Generated from C:/Users/gusta/IdeaProjects/Mini_Pascal_Compiler/MiniPascal_Compi/src/MiniPascal.g4 by ANTLR 4.13.1
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
	 * Visit a parse tree produced by {@link MiniPascalParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationPart(MiniPascalParser.VariableDeclarationPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(MiniPascalParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureAndFunctionDeclarationPart(MiniPascalParser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclaration(MiniPascalParser.ProcedureDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#resultType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultType(MiniPascalParser.ResultTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(MiniPascalParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(MiniPascalParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#formalParameterSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterSection(MiniPascalParser.FormalParameterSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#typeIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdentifier(MiniPascalParser.TypeIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(MiniPascalParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(MiniPascalParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(MiniPascalParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#constantChr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantChr(MiniPascalParser.ConstantChrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#unsignedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumber(MiniPascalParser.UnsignedNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#unsignedInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedInteger(MiniPascalParser.UnsignedIntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#unsignedReal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedReal(MiniPascalParser.UnsignedRealContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(MiniPascalParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(MiniPascalParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#blockEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockEnd(MiniPascalParser.BlockEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(MiniPascalParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MiniPascalParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#writelnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWritelnStatement(MiniPascalParser.WritelnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(MiniPascalParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#procedureStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureStatement(MiniPascalParser.ProcedureStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#actualParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParameterList(MiniPascalParser.ActualParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#actualParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParameter(MiniPascalParser.ActualParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MiniPascalParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(MiniPascalParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(MiniPascalParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#repeatStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStatement(MiniPascalParser.RepeatStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#writeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStatement(MiniPascalParser.WriteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#readStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStatement(MiniPascalParser.ReadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MiniPascalParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#relationaloperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationaloperator(MiniPascalParser.RelationaloperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(MiniPascalParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#additiveoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveoperator(MiniPascalParser.AdditiveoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(MiniPascalParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeoperator(MiniPascalParser.MultiplicativeoperatorContext ctx);
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
	 * Visit a parse tree produced by {@link MiniPascalParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(MiniPascalParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#conststr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConststr(MiniPascalParser.ConststrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(MiniPascalParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(MiniPascalParser.NumberContext ctx);
}