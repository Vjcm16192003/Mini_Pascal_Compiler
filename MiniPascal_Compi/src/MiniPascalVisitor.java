// Generated from C:/Users/gusta/IdeaProjects/Mini_Pascal_Compiler/MiniPascal_Compi/src/MiniPascal.g4 by ANTLR 4.13.1

     import java.util.HashMap;
     import java.lang.Math;
     import java.util.Scanner;
     
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
	 * Visit a parse tree produced by {@link MiniPascalParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(MiniPascalParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MiniPascalParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#varBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarBlock(MiniPascalParser.VarBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#varDecs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecs(MiniPascalParser.VarDecsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initDec}
	 * labeled alternative in {@link MiniPascalParser#varDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDec(MiniPascalParser.InitDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normDec}
	 * labeled alternative in {@link MiniPascalParser#varDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormDec(MiniPascalParser.NormDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#functionDecs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecs(MiniPascalParser.FunctionDecsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#funcOrProcDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncOrProcDec(MiniPascalParser.FuncOrProcDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#funcDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDec(MiniPascalParser.FuncDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#procDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcDec(MiniPascalParser.ProcDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(MiniPascalParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#paramGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamGroup(MiniPascalParser.ParamGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#variableList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableList(MiniPascalParser.VariableListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableType(MiniPascalParser.VariableTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(MiniPascalParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#procedureCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureCall(MiniPascalParser.ProcedureCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(MiniPascalParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MiniPascalParser.BlockContext ctx);
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
	 * Visit a parse tree produced by the {@code funcAssignment}
	 * labeled alternative in {@link MiniPascalParser#varAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncAssignment(MiniPascalParser.FuncAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAssignment}
	 * labeled alternative in {@link MiniPascalParser#varAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAssignment(MiniPascalParser.ExprAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#readLn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadLn(MiniPascalParser.ReadLnContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#writeLn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteLn(MiniPascalParser.WriteLnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprLine}
	 * labeled alternative in {@link MiniPascalParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLine(MiniPascalParser.ExprLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strLine}
	 * labeled alternative in {@link MiniPascalParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrLine(MiniPascalParser.StrLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#loopType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopType(MiniPascalParser.LoopTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(MiniPascalParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(MiniPascalParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#varForAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarForAssign(MiniPascalParser.VarForAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#loopBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopBlock(MiniPascalParser.LoopBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#loopStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatements(MiniPascalParser.LoopStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(MiniPascalParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#eval_break}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval_break(MiniPascalParser.Eval_breakContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#eval_continue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval_continue(MiniPascalParser.Eval_continueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MiniPascalParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#condBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondBlock(MiniPascalParser.CondBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#stateBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateBlock(MiniPascalParser.StateBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(MiniPascalParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#caseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBlock(MiniPascalParser.CaseBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(MiniPascalParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(MiniPascalParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementExpr(MiniPascalParser.ElementExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(MiniPascalParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equationExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquationExpr(MiniPascalParser.EquationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(MiniPascalParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(MiniPascalParser.MultExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(MiniPascalParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functCallExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctCallExpr(MiniPascalParser.FunctCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpr(MiniPascalParser.CompareExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(MiniPascalParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#func_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_identifier(MiniPascalParser.Func_identifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parElement}
	 * labeled alternative in {@link MiniPascalParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParElement(MiniPascalParser.ParElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idElement}
	 * labeled alternative in {@link MiniPascalParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdElement(MiniPascalParser.IdElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolElement}
	 * labeled alternative in {@link MiniPascalParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolElement(MiniPascalParser.BoolElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code realElement}
	 * labeled alternative in {@link MiniPascalParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealElement(MiniPascalParser.RealElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(MiniPascalParser.IdentifierContext ctx);
}