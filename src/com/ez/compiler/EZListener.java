package com.ez.compiler;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EZParser}.
 */
public interface EZListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EZParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(EZParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(EZParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(EZParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(EZParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(EZParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(EZParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#decl_statement}.
	 * @param ctx the parse tree
	 */
	void enterDecl_statement(EZParser.Decl_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#decl_statement}.
	 * @param ctx the parse tree
	 */
	void exitDecl_statement(EZParser.Decl_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_statement(EZParser.Assign_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_statement(EZParser.Assign_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#read_statement}.
	 * @param ctx the parse tree
	 */
	void enterRead_statement(EZParser.Read_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#read_statement}.
	 * @param ctx the parse tree
	 */
	void exitRead_statement(EZParser.Read_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#write_statement}.
	 * @param ctx the parse tree
	 */
	void enterWrite_statement(EZParser.Write_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#write_statement}.
	 * @param ctx the parse tree
	 */
	void exitWrite_statement(EZParser.Write_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(EZParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(EZParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(EZParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(EZParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(EZParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(EZParser.Loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#function_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunction_statement(EZParser.Function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#function_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunction_statement(EZParser.Function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#function_call_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_statement(EZParser.Function_call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#function_call_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_statement(EZParser.Function_call_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(EZParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(EZParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#exp1}.
	 * @param ctx the parse tree
	 */
	void enterExp1(EZParser.Exp1Context ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#exp1}.
	 * @param ctx the parse tree
	 */
	void exitExp1(EZParser.Exp1Context ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#cond_expression}.
	 * @param ctx the parse tree
	 */
	void enterCond_expression(EZParser.Cond_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#cond_expression}.
	 * @param ctx the parse tree
	 */
	void exitCond_expression(EZParser.Cond_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#cond_operators}.
	 * @param ctx the parse tree
	 */
	void enterCond_operators(EZParser.Cond_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#cond_operators}.
	 * @param ctx the parse tree
	 */
	void exitCond_operators(EZParser.Cond_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(EZParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(EZParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#letters}.
	 * @param ctx the parse tree
	 */
	void enterLetters(EZParser.LettersContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#letters}.
	 * @param ctx the parse tree
	 */
	void exitLetters(EZParser.LettersContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#underscore}.
	 * @param ctx the parse tree
	 */
	void enterUnderscore(EZParser.UnderscoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#underscore}.
	 * @param ctx the parse tree
	 */
	void exitUnderscore(EZParser.UnderscoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#bool_val}.
	 * @param ctx the parse tree
	 */
	void enterBool_val(EZParser.Bool_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#bool_val}.
	 * @param ctx the parse tree
	 */
	void exitBool_val(EZParser.Bool_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(EZParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(EZParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(EZParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(EZParser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#lowerChar}.
	 * @param ctx the parse tree
	 */
	void enterLowerChar(EZParser.LowerCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#lowerChar}.
	 * @param ctx the parse tree
	 */
	void exitLowerChar(EZParser.LowerCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#upperChar}.
	 * @param ctx the parse tree
	 */
	void enterUpperChar(EZParser.UpperCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#upperChar}.
	 * @param ctx the parse tree
	 */
	void exitUpperChar(EZParser.UpperCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZParser#rpara}.
	 * @param ctx the parse tree
	 */
	void enterRpara(EZParser.RparaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZParser#rpara}.
	 * @param ctx the parse tree
	 */
	void exitRpara(EZParser.RparaContext ctx);
}