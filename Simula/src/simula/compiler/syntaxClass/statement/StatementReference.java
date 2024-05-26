/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass.statement;

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
public final class StatementReference extends Statement {
	
	private int SEQU;
	
	private Statement STM; // Set bu doChecking

	private ObjectReferenceMap objectReferenceMap;

	/**
	 * Create a new ExpressionReference
	 * @param SEQU the object reference sequence number
	 */
	public StatementReference(final int SEQU,ObjectReferenceMap objectReferenceMap) {
		super(0);
		this.SEQU = SEQU;
		this.objectReferenceMap=objectReferenceMap;
		if (Option.internal.TRACE_PARSE)
			Util.TRACE("NEW ThisObjectExpression: " + toString());
	}

	@Override
	public void doChecking() { 
		if (IS_SEMANTICS_CHECKED())	return;
		STM = (Statement) objectReferenceMap.get(SEQU);
		STM.doChecking();
		SET_SEMANTICS_CHECKED();
	}

	@Override
	public String toJavaCode() {
		ASSERT_SEMANTICS_CHECKED();
		return STM.toJavaCode();
	}

	@Override
	public void buildByteCode(CodeBuilder codeBuilder) {
		ASSERT_SEMANTICS_CHECKED();
		STM.buildByteCode(codeBuilder);
	}

	@Override
	public String toString() {
		return ("REF " + STM);
	}

}
