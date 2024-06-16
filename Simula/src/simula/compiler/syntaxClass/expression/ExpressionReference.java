/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass.expression;

import java.lang.classfile.CodeBuilder;
import simula.compiler.utilities.ObjectReferenceMap;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * <p>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/expression/LocalObject.java">
 * <b>Source File</b></a>.
 * 
 * @author Simula Standard
 * @author Øystein Myhre Andersen
 */
public final class ExpressionReference extends Expression {
	
	private int SEQU;
	
	private Expression EXPR; // Set by doChecking

	private ObjectReferenceMap objectReferenceMap;

	/**
	 * Create a new ExpressionReference
	 * @param SEQU the object reference sequence number
	 */
	public ExpressionReference(final int SEQU,ObjectReferenceMap objectReferenceMap) {
		this.SEQU = SEQU;
		this.objectReferenceMap=objectReferenceMap;
		if (Option.internal.TRACE_PARSE)
			Util.TRACE("NEW ThisObjectExpression: " + toString());
	}

	@Override
	public void doChecking() { 
		if (IS_SEMANTICS_CHECKED())	return;
		EXPR = (Expression) objectReferenceMap.get(SEQU);
		EXPR.doChecking();
		SET_SEMANTICS_CHECKED();
	}

	@Override
	public Expression getRealExpression() {
		ASSERT_SEMANTICS_CHECKED();
		return EXPR;
	}

	@Override
	public String toJavaCode() {
		ASSERT_SEMANTICS_CHECKED();
		return EXPR.toJavaCode();
	}

	@Override
	public void buildEvaluation(Expression rightPart,CodeBuilder codeBuilder) {
		ASSERT_SEMANTICS_CHECKED();
		EXPR.buildEvaluation(rightPart, codeBuilder);
	}

	@Override
	public String toString() {
		return ("REF " + EXPR);
	}

	@Override
	public boolean maybeStatement() {
		ASSERT_SEMANTICS_CHECKED();
		return EXPR.maybeStatement();
	}

}
