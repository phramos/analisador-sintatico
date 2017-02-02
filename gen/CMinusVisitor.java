// Generated from /home/fauno/Downloads/Compiladores/TP2/TP2_AnaliseSintatica/gramatica/CMinus.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CMinusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CMinusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CMinusParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(CMinusParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(CMinusParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(CMinusParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(CMinusParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(CMinusParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(CMinusParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(CMinusParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(CMinusParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(CMinusParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(CMinusParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(CMinusParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(CMinusParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CMinusParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(CMinusParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#structVaribleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructVaribleDeclaration(CMinusParser.StructVaribleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#structVariableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructVariableInitializer(CMinusParser.StructVariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#structDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarationStatement(CMinusParser.StructDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CMinusParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(CMinusParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(CMinusParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(CMinusParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CMinusParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(CMinusParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(CMinusParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(CMinusParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CMinusParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(CMinusParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(CMinusParser.ArgumentsContext ctx);
}