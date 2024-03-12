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
	 * Enter a parse tree produced by {@link MiniPascalParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(MiniPascalParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(MiniPascalParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#variable_decl}.
	 * @param ctx the parse tree
	 */
	void enterVariable_decl(MiniPascalParser.Variable_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#variable_decl}.
	 * @param ctx the parse tree
	 */
	void exitVariable_decl(MiniPascalParser.Variable_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#array_decl}.
	 * @param ctx the parse tree
	 */
	void enterArray_decl(MiniPascalParser.Array_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#array_decl}.
	 * @param ctx the parse tree
	 */
	void exitArray_decl(MiniPascalParser.Array_declContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprStatement(MiniPascalParser.ExprStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprStatement(MiniPascalParser.ExprStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MiniPascalParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MiniPascalParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MiniPascalParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MiniPascalParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(MiniPascalParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(MiniPascalParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repeatStatement}
	 * labeled alternative in {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(MiniPascalParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repeatStatement}
	 * labeled alternative in {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(MiniPascalParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallStatement}
	 * labeled alternative in {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatement(MiniPascalParser.FunctionCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallStatement}
	 * labeled alternative in {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatement(MiniPascalParser.FunctionCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code procedureCallStatement}
	 * labeled alternative in {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureCallStatement(MiniPascalParser.ProcedureCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code procedureCallStatement}
	 * labeled alternative in {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureCallStatement(MiniPascalParser.ProcedureCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatementRule}
	 * labeled alternative in {@link MiniPascalParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementRule(MiniPascalParser.IfStatementRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatementRule}
	 * labeled alternative in {@link MiniPascalParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementRule(MiniPascalParser.IfStatementRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatementRule}
	 * labeled alternative in {@link MiniPascalParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementRule(MiniPascalParser.WhileStatementRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatementRule}
	 * labeled alternative in {@link MiniPascalParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementRule(MiniPascalParser.WhileStatementRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStatementRule}
	 * labeled alternative in {@link MiniPascalParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterForStatementRule(MiniPascalParser.ForStatementRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStatementRule}
	 * labeled alternative in {@link MiniPascalParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitForStatementRule(MiniPascalParser.ForStatementRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repeatStatementRule}
	 * labeled alternative in {@link MiniPascalParser#repeat_statement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatementRule(MiniPascalParser.RepeatStatementRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repeatStatementRule}
	 * labeled alternative in {@link MiniPascalParser#repeat_statement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatementRule(MiniPascalParser.RepeatStatementRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThanOrEqualExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanOrEqualExpr(MiniPascalParser.GreaterThanOrEqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThanOrEqualExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanOrEqualExpr(MiniPascalParser.GreaterThanOrEqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteralExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralExpr(MiniPascalParser.StringLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteralExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralExpr(MiniPascalParser.StringLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThanOrEqualExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLessThanOrEqualExpr(MiniPascalParser.LessThanOrEqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThanOrEqualExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLessThanOrEqualExpr(MiniPascalParser.LessThanOrEqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterModExpr(MiniPascalParser.ModExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitModExpr(MiniPascalParser.ModExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpr(MiniPascalParser.BooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpr(MiniPascalParser.BooleanExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThanExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLessThanExpr(MiniPascalParser.LessThanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThanExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLessThanExpr(MiniPascalParser.LessThanExprContext ctx);
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
	 * Enter a parse tree produced by the {@code notEqualToExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualToExpr(MiniPascalParser.NotEqualToExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEqualToExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualToExpr(MiniPascalParser.NotEqualToExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubExpr(MiniPascalParser.SubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubExpr(MiniPascalParser.SubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesesExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesExpr(MiniPascalParser.ParenthesesExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesesExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesExpr(MiniPascalParser.ParenthesesExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumExpr(MiniPascalParser.NumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumExpr(MiniPascalParser.NumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThanExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanExpr(MiniPascalParser.GreaterThanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThanExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanExpr(MiniPascalParser.GreaterThanExprContext ctx);
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
	 * Enter a parse tree produced by the {@code arrayAccessExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessExpr(MiniPascalParser.ArrayAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAccessExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessExpr(MiniPascalParser.ArrayAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constCharExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstCharExpr(MiniPascalParser.ConstCharExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constCharExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstCharExpr(MiniPascalParser.ConstCharExprContext ctx);
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
	 * Enter a parse tree produced by the {@code equalToExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualToExpr(MiniPascalParser.EqualToExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalToExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualToExpr(MiniPascalParser.EqualToExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(MiniPascalParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(MiniPascalParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivExpr(MiniPascalParser.DivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivExpr(MiniPascalParser.DivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(MiniPascalParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(MiniPascalParser.IdExprContext ctx);
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
	 * Enter a parse tree produced by {@link MiniPascalParser#array_access}.
	 * @param ctx the parse tree
	 */
	void enterArray_access(MiniPascalParser.Array_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#array_access}.
	 * @param ctx the parse tree
	 */
	void exitArray_access(MiniPascalParser.Array_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#index_expr}.
	 * @param ctx the parse tree
	 */
	void enterIndex_expr(MiniPascalParser.Index_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#index_expr}.
	 * @param ctx the parse tree
	 */
	void exitIndex_expr(MiniPascalParser.Index_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiniPascalParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiniPascalParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_type(MiniPascalParser.Array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_type(MiniPascalParser.Array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MiniPascalParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MiniPascalParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#array_value}.
	 * @param ctx the parse tree
	 */
	void enterArray_value(MiniPascalParser.Array_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#array_value}.
	 * @param ctx the parse tree
	 */
	void exitArray_value(MiniPascalParser.Array_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#function_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunction_decl(MiniPascalParser.Function_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#function_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunction_decl(MiniPascalParser.Function_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(MiniPascalParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(MiniPascalParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(MiniPascalParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(MiniPascalParser.ParamContext ctx);
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
	 * Enter a parse tree produced by {@link MiniPascalParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(MiniPascalParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(MiniPascalParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#procedure_decl}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_decl(MiniPascalParser.Procedure_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#procedure_decl}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_decl(MiniPascalParser.Procedure_declContext ctx);
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
	 * Enter a parse tree produced by {@link MiniPascalParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(MiniPascalParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(MiniPascalParser.MainContext ctx);
}