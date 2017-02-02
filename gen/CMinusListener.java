// Generated from /home/fauno/Downloads/Compiladores/TP2/TP2_AnaliseSintatica/gramatica/CMinus.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CMinusParser}.
 */
public interface CMinusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CMinusParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(CMinusParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(CMinusParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(CMinusParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(CMinusParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(CMinusParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(CMinusParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(CMinusParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(CMinusParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(CMinusParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(CMinusParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(CMinusParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(CMinusParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(CMinusParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(CMinusParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(CMinusParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(CMinusParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(CMinusParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(CMinusParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(CMinusParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(CMinusParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(CMinusParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(CMinusParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(CMinusParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(CMinusParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CMinusParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CMinusParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(CMinusParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(CMinusParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#structVaribleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructVaribleDeclaration(CMinusParser.StructVaribleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#structVaribleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructVaribleDeclaration(CMinusParser.StructVaribleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#structVariableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStructVariableInitializer(CMinusParser.StructVariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#structVariableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStructVariableInitializer(CMinusParser.StructVariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#structDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarationStatement(CMinusParser.StructDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#structDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarationStatement(CMinusParser.StructDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CMinusParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CMinusParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(CMinusParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(CMinusParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(CMinusParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(CMinusParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(CMinusParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(CMinusParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CMinusParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CMinusParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(CMinusParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(CMinusParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(CMinusParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(CMinusParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(CMinusParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(CMinusParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CMinusParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CMinusParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(CMinusParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(CMinusParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(CMinusParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(CMinusParser.ArgumentsContext ctx);
}