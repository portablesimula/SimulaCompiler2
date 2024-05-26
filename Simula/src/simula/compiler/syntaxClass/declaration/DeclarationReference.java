/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass.declaration;

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
 * @author Øystein Myhre Andersen
 */
public final class DeclarationReference extends Declaration {
	
	private int SEQU;
	
	private Declaration DECL; // Set bu doChecking

	private ObjectReferenceMap objectReferenceMap;

	/**
	 * Create a new DeclarationReference
	 * @param SEQU the object reference sequence number
	 */
	public DeclarationReference(final int SEQU,ObjectReferenceMap objectReferenceMap) {
		super(null);
		this.SEQU = SEQU;
		this.objectReferenceMap=objectReferenceMap;
		if (Option.internal.TRACE_PARSE)
			Util.TRACE("NEW ThisObjectExpression: " + toString());
	}

	@Override
	public void doChecking() { 
		if (IS_SEMANTICS_CHECKED())	return;
		DECL = (Declaration) objectReferenceMap.get(SEQU);
		DECL.doChecking();
		SET_SEMANTICS_CHECKED();
	}

	@Override
	public String toJavaCode() {
		ASSERT_SEMANTICS_CHECKED();
		return DECL.toJavaCode();
	}

	@Override
	public void buildDeclarationCode(CodeBuilder codeBuilder) {
		ASSERT_SEMANTICS_CHECKED();
		DECL.buildDeclarationCode(codeBuilder);
	}

	@Override
	public String toString() {
		return ("REF " + DECL);
	}

}
