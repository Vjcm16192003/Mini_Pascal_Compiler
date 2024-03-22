// Generated from C:/Users/gusta/IdeaProjects/Mini_Pascal_Compiler/MiniPascal_Compi/src/MiniPascal.g4 by ANTLR 4.13.1

     import java.util.HashMap;
     import java.lang.Math;
     import java.util.Scanner;
     
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniPascalParser}.
 */
public interface MiniPascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(MiniPascalParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(MiniPascalParser.StartContext ctx);
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
	 * Enter a parse tree produced by {@link MiniPascalParser#varBlock}.
	 * @param ctx the parse tree
	 */
	void enterVarBlock(MiniPascalParser.VarBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#varBlock}.
	 * @param ctx the parse tree
	 */
	void exitVarBlock(MiniPascalParser.VarBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#varDecs}.
	 * @param ctx the parse tree
	 */
	void enterVarDecs(MiniPascalParser.VarDecsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#varDecs}.
	 * @param ctx the parse tree
	 */
	void exitVarDecs(MiniPascalParser.VarDecsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initDec}
	 * labeled alternative in {@link MiniPascalParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterInitDec(MiniPascalParser.InitDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initDec}
	 * labeled alternative in {@link MiniPascalParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitInitDec(MiniPascalParser.InitDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normDec}
	 * labeled alternative in {@link MiniPascalParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterNormDec(MiniPascalParser.NormDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normDec}
	 * labeled alternative in {@link MiniPascalParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitNormDec(MiniPascalParser.NormDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#functionDecs}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecs(MiniPascalParser.FunctionDecsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#functionDecs}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecs(MiniPascalParser.FunctionDecsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#funcOrProcDec}.
	 * @param ctx the parse tree
	 */
	void enterFuncOrProcDec(MiniPascalParser.FuncOrProcDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#funcOrProcDec}.
	 * @param ctx the parse tree
	 */
	void exitFuncOrProcDec(MiniPascalParser.FuncOrProcDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#funcDec}.
	 * @param ctx the parse tree
	 */
	void enterFuncDec(MiniPascalParser.FuncDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#funcDec}.
	 * @param ctx the parse tree
	 */
	void exitFuncDec(MiniPascalParser.FuncDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#procDec}.
	 * @param ctx the parse tree
	 */
	void enterProcDec(MiniPascalParser.ProcDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#procDec}.
	 * @param ctx the parse tree
	 */
	void exitProcDec(MiniPascalParser.ProcDecContext ctx);
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
	 * Enter a parse tree produced by {@link MiniPascalParser#paramGroup}.
	 * @param ctx the parse tree
	 */
	void enterParamGroup(MiniPascalParser.ParamGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#paramGroup}.
	 * @param ctx the parse tree
	 */
	void exitParamGroup(MiniPascalParser.ParamGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#variableList}.
	 * @param ctx the parse tree
	 */
	void enterVariableList(MiniPascalParser.VariableListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#variableList}.
	 * @param ctx the parse tree
	 */
	void exitVariableList(MiniPascalParser.VariableListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterVariableType(MiniPascalParser.VariableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitVariableType(MiniPascalParser.VariableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(MiniPascalParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(MiniPascalParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#procedureCall}.
	 * @param ctx the parse tree
	 */
	void enterProcedureCall(MiniPascalParser.ProcedureCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#procedureCall}.
	 * @param ctx the parse tree
	 */
	void exitProcedureCall(MiniPascalParser.ProcedureCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(MiniPascalParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(MiniPascalParser.ParametersContext ctx);
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
	 * Enter a parse tree produced by the {@code funcAssignment}
	 * labeled alternative in {@link MiniPascalParser#varAssign}.
	 * @param ctx the parse tree
	 */
	void enterFuncAssignment(MiniPascalParser.FuncAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcAssignment}
	 * labeled alternative in {@link MiniPascalParser#varAssign}.
	 * @param ctx the parse tree
	 */
	void exitFuncAssignment(MiniPascalParser.FuncAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAssignment}
	 * labeled alternative in {@link MiniPascalParser#varAssign}.
	 * @param ctx the parse tree
	 */
	void enterExprAssignment(MiniPascalParser.ExprAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAssignment}
	 * labeled alternative in {@link MiniPascalParser#varAssign}.
	 * @param ctx the parse tree
	 */
	void exitExprAssignment(MiniPascalParser.ExprAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#readLn}.
	 * @param ctx the parse tree
	 */
	void enterReadLn(MiniPascalParser.ReadLnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#readLn}.
	 * @param ctx the parse tree
	 */
	void exitReadLn(MiniPascalParser.ReadLnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#writeLn}.
	 * @param ctx the parse tree
	 */
	void enterWriteLn(MiniPascalParser.WriteLnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#writeLn}.
	 * @param ctx the parse tree
	 */
	void exitWriteLn(MiniPascalParser.WriteLnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(MiniPascalParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(MiniPascalParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprLine}
	 * labeled alternative in {@link MiniPascalParser#line}.
	 * @param ctx the parse tree
	 */
	void enterExprLine(MiniPascalParser.ExprLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprLine}
	 * labeled alternative in {@link MiniPascalParser#line}.
	 * @param ctx the parse tree
	 */
	void exitExprLine(MiniPascalParser.ExprLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strLine}
	 * labeled alternative in {@link MiniPascalParser#line}.
	 * @param ctx the parse tree
	 */
	void enterStrLine(MiniPascalParser.StrLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strLine}
	 * labeled alternative in {@link MiniPascalParser#line}.
	 * @param ctx the parse tree
	 */
	void exitStrLine(MiniPascalParser.StrLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#loopType}.
	 * @param ctx the parse tree
	 */
	void enterLoopType(MiniPascalParser.LoopTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#loopType}.
	 * @param ctx the parse tree
	 */
	void exitLoopType(MiniPascalParser.LoopTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(MiniPascalParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(MiniPascalParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(MiniPascalParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(MiniPascalParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#varForAssign}.
	 * @param ctx the parse tree
	 */
	void enterVarForAssign(MiniPascalParser.VarForAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#varForAssign}.
	 * @param ctx the parse tree
	 */
	void exitVarForAssign(MiniPascalParser.VarForAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#loopBlock}.
	 * @param ctx the parse tree
	 */
	void enterLoopBlock(MiniPascalParser.LoopBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#loopBlock}.
	 * @param ctx the parse tree
	 */
	void exitLoopBlock(MiniPascalParser.LoopBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#loopStatements}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatements(MiniPascalParser.LoopStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#loopStatements}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatements(MiniPascalParser.LoopStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(MiniPascalParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(MiniPascalParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#eval_break}.
	 * @param ctx the parse tree
	 */
	void enterEval_break(MiniPascalParser.Eval_breakContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#eval_break}.
	 * @param ctx the parse tree
	 */
	void exitEval_break(MiniPascalParser.Eval_breakContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#eval_continue}.
	 * @param ctx the parse tree
	 */
	void enterEval_continue(MiniPascalParser.Eval_continueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#eval_continue}.
	 * @param ctx the parse tree
	 */
	void exitEval_continue(MiniPascalParser.Eval_continueContext ctx);
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
	 * Enter a parse tree produced by {@link MiniPascalParser#condBlock}.
	 * @param ctx the parse tree
	 */
	void enterCondBlock(MiniPascalParser.CondBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#condBlock}.
	 * @param ctx the parse tree
	 */
	void exitCondBlock(MiniPascalParser.CondBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#stateBlock}.
	 * @param ctx the parse tree
	 */
	void enterStateBlock(MiniPascalParser.StateBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#stateBlock}.
	 * @param ctx the parse tree
	 */
	void exitStateBlock(MiniPascalParser.StateBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(MiniPascalParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(MiniPascalParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void enterCaseBlock(MiniPascalParser.CaseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void exitCaseBlock(MiniPascalParser.CaseBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(MiniPascalParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(MiniPascalParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(MiniPascalParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(MiniPascalParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterElementExpr(MiniPascalParser.ElementExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitElementExpr(MiniPascalParser.ElementExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(MiniPascalParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(MiniPascalParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(MiniPascalParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(MiniPascalParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(MiniPascalParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(MiniPascalParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(MiniPascalParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(MiniPascalParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functCallExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctCallExpr(MiniPascalParser.FunctCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functCallExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctCallExpr(MiniPascalParser.FunctCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr(MiniPascalParser.CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr(MiniPascalParser.CompareExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(MiniPascalParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(MiniPascalParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#func_identifier}.
	 * @param ctx the parse tree
	 */
	void enterFunc_identifier(MiniPascalParser.Func_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#func_identifier}.
	 * @param ctx the parse tree
	 */
	void exitFunc_identifier(MiniPascalParser.Func_identifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parElement}
	 * labeled alternative in {@link MiniPascalParser#element}.
	 * @param ctx the parse tree
	 */
	void enterParElement(MiniPascalParser.ParElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parElement}
	 * labeled alternative in {@link MiniPascalParser#element}.
	 * @param ctx the parse tree
	 */
	void exitParElement(MiniPascalParser.ParElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idElement}
	 * labeled alternative in {@link MiniPascalParser#element}.
	 * @param ctx the parse tree
	 */
	void enterIdElement(MiniPascalParser.IdElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idElement}
	 * labeled alternative in {@link MiniPascalParser#element}.
	 * @param ctx the parse tree
	 */
	void exitIdElement(MiniPascalParser.IdElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolElement}
	 * labeled alternative in {@link MiniPascalParser#element}.
	 * @param ctx the parse tree
	 */
	void enterBoolElement(MiniPascalParser.BoolElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolElement}
	 * labeled alternative in {@link MiniPascalParser#element}.
	 * @param ctx the parse tree
	 */
	void exitBoolElement(MiniPascalParser.BoolElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code realElement}
	 * labeled alternative in {@link MiniPascalParser#element}.
	 * @param ctx the parse tree
	 */
	void enterRealElement(MiniPascalParser.RealElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code realElement}
	 * labeled alternative in {@link MiniPascalParser#element}.
	 * @param ctx the parse tree
	 */
	void exitRealElement(MiniPascalParser.RealElementContext ctx);
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
}