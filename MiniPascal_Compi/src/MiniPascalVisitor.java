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
	 * Visit a parse tree produced by {@link MiniPascalParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(MiniPascalParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#variable_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_decl(MiniPascalParser.Variable_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#array_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_decl(MiniPascalParser.Array_declContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStatement(MiniPascalParser.ExprStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MiniPascalParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(MiniPascalParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(MiniPascalParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repeatStatement}
	 * labeled alternative in {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStatement(MiniPascalParser.RepeatStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallStatement}
	 * labeled alternative in {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStatement(MiniPascalParser.FunctionCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code procedureCallStatement}
	 * labeled alternative in {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureCallStatement(MiniPascalParser.ProcedureCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatementRule}
	 * labeled alternative in {@link MiniPascalParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatementRule(MiniPascalParser.IfStatementRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatementRule}
	 * labeled alternative in {@link MiniPascalParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementRule(MiniPascalParser.WhileStatementRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStatementRule}
	 * labeled alternative in {@link MiniPascalParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementRule(MiniPascalParser.ForStatementRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repeatStatementRule}
	 * labeled alternative in {@link MiniPascalParser#repeat_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStatementRule(MiniPascalParser.RepeatStatementRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterThanOrEqualExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanOrEqualExpr(MiniPascalParser.GreaterThanOrEqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteralExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralExpr(MiniPascalParser.StringLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThanOrEqualExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanOrEqualExpr(MiniPascalParser.LessThanOrEqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModExpr(MiniPascalParser.ModExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpr(MiniPascalParser.BooleanExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThanExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanExpr(MiniPascalParser.LessThanExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(MiniPascalParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notEqualToExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualToExpr(MiniPascalParser.NotEqualToExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpr(MiniPascalParser.SubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesesExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesesExpr(MiniPascalParser.ParenthesesExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExpr(MiniPascalParser.NumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterThanExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanExpr(MiniPascalParser.GreaterThanExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(MiniPascalParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAccessExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessExpr(MiniPascalParser.ArrayAccessExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constCharExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstCharExpr(MiniPascalParser.ConstCharExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(MiniPascalParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalToExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualToExpr(MiniPascalParser.EqualToExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(MiniPascalParser.MulExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpr(MiniPascalParser.DivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(MiniPascalParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(MiniPascalParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#array_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_access(MiniPascalParser.Array_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#index_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_expr(MiniPascalParser.Index_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MiniPascalParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_type(MiniPascalParser.Array_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(MiniPascalParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#array_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_value(MiniPascalParser.Array_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#function_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_decl(MiniPascalParser.Function_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(MiniPascalParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(MiniPascalParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(MiniPascalParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(MiniPascalParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#procedure_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_decl(MiniPascalParser.Procedure_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#procedure_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_call(MiniPascalParser.Procedure_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(MiniPascalParser.MainContext ctx);
}