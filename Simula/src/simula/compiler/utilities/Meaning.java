/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.utilities;

import java.lang.classfile.CodeBuilder;
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import simula.compiler.syntaxClass.declaration.BlockDeclaration;
import simula.compiler.syntaxClass.declaration.ConnectionBlock;
import simula.compiler.syntaxClass.declaration.Declaration;
import simula.compiler.syntaxClass.declaration.DeclarationScope;
import simula.compiler.syntaxClass.declaration.ProcedureDeclaration;
import simula.compiler.syntaxClass.declaration.SimpleVariableDeclaration;
import simula.compiler.syntaxClass.expression.Expression;
import simula.compiler.syntaxClass.expression.TypeConversion;
import simula.compiler.syntaxClass.expression.VariableExpression;

/**
 * Utility class Meaning.
 * <p>
 * Holding the semantic meaning of an identifier.
 * <p>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/utilities/Meaning.java"><b>Source File</b></a>.
 * 
 * @author Øystein Myhre Andersen
 *
 */
public final class Meaning {
	/**
	 * True if it was found behind invisible
	 */
	public boolean foundBehindInvisible; // Behind hidden/protected
	
	/**
	 * The corresponding declaration
	 */
	public Declaration declaredAs;
	
	/**
	 * Where it was declared
	 */
	public DeclarationScope declaredIn; // Search started here (modified in ConnectionBlock)
	
	/**
	 * Where it was found
	 */
	public DeclarationScope foundIn; // Search ended here

	/**
	 * Create a new Meaning.
	 * @param declaredAs the corresponding declaration
	 * @param declaredIn where it was declared
	 * @param foundIn where it was found
	 * @param foundBehindInvisible true if it was found behind invisible
	 */
	public Meaning(final Declaration declaredAs,final DeclarationScope declaredIn,final DeclarationScope foundIn,final boolean foundBehindInvisible) {
		this.declaredAs = declaredAs;
		this.declaredIn = declaredIn;
		this.foundIn = foundIn;
		this.foundBehindInvisible = foundBehindInvisible;
	}

	/**
	 * Create a new Meaning.
	 * @param declaredAs the corresponding declaration
	 * @param declaredIn where it was declared
	 */
	public Meaning(final Declaration declaredAs,final DeclarationScope declaredIn) {
		this(declaredAs, declaredIn,null,false);
	}

	/**
	 * Returns the constant element or null.
	 * @return the constant element or null
	 */
	public Expression getConstant() {
		if(declaredAs instanceof SimpleVariableDeclaration simple) {
			if(simple.isConstant()) return(simple.constantElement);
		}
		return(null);
	}

	/**
	 * Returns true if it was declared in a ConnectionBlock.
	 * @return true if it was declared in a ConnectionBlock
	 */
	public boolean isConnected() {
		return (declaredIn instanceof ConnectionBlock);
	}

	/**
	 * Returns the inspected expression or null.
	 * @return the inspected expression or null
	 */
	public Expression getInspectedExpression() {
		if (isConnected())
			 return (((ConnectionBlock) declaredIn).getInspectedExpression());
		else return (null);
	}

	public VariableExpression getInspectedVariable() {
		Expression inspected = getInspectedExpression();
		if(inspected instanceof TypeConversion tc) inspected = tc.expression;
		VariableExpression inspectedVariable = (VariableExpression)inspected;
		return(inspectedVariable);
	}

	// ***************************************************************************************
	// *** CODING: edUnqualifiedStaticLink
	// ***************************************************************************************
	/**
	 * Coding utility: Edit unqualified static link chain.
	 * @return the resulting string
	 */
	public String edUnqualifiedStaticLink() {
		// Edit staticLink reference
		String staticLink;
		Expression connectedObject = getInspectedExpression();
		if (connectedObject != null)
			staticLink = connectedObject.toJavaCode();
		else {
			staticLink = declaredIn.edCTX();
		}
		return (staticLink);
	}

	// ***************************************************************************************
	// *** CODING: edQualifiedStaticLink
	// ***************************************************************************************
	/**
	 * Coding utility: Edit qualified static link chain.
	 * @return the resulting string
	 */
	public String edQualifiedStaticLink() {
		// Edit staticLink reference
		String staticLink;
		Expression connectedObject = getInspectedExpression();
		if (connectedObject != null)
			staticLink = connectedObject.toJavaCode();
		else {
			staticLink = declaredIn.edCTX();
			String cast = declaredIn.getJavaIdentifier();
			staticLink = "((" + cast + ")" + staticLink + ')';
		}
		return (staticLink);
	}

	// ***************************************************************************************
	// *** CODING: buildQualifiedStaticLink
	// ***************************************************************************************
	/**
	 * Coding utility: Build qualified static link chain.
	 */
	public void buildQualifiedStaticLink(CodeBuilder codeBuilder) {
		// Edit staticLink reference
		if(this.isConnected()) {
	    	VariableExpression inspectedVariable = getInspectedVariable();
			String id = inspectedVariable.getJavaIdentifier();
			ConstantPoolBuilder pool=codeBuilder.constantPool();
			codeBuilder
				.aload(0)
				.getfield(pool.fieldRefEntry(BlockDeclaration.currentClassDesc(), id, inspectedVariable.type.toClassDesc()));
		}
		else {
//			System.out.println("Meaning.buildQualifiedStaticLink: "+this);
//			System.out.println("Meaning.buildQualifiedStaticLink: declaredIn="+declaredIn);
			boolean withFollowSL = declaredIn.buildCTX(codeBuilder);
			if(withFollowSL) codeBuilder.checkcast(declaredIn.getClassDesc());
		}
	}

//	// ***************************************************************************************
//	// *** JVM CODING: getFieldRefEntry
//	// ***************************************************************************************
//	public FieldRefEntry getFieldRefEntry(ConstantPoolBuilder pool) {
//		ClassDesc owner=declaredIn.getClassDesc();
//		return(pool.fieldRefEntry(owner, declaredAs.getJavaIdentifier(), declaredAs.type.toClassDesc()));
//	}

	/**
	 * Coding Utility: Edit identifier access.
	 * @param id the identifier
	 * @param destination true if destination
	 * @return a suitable java code
	 */
	public void buildIdentifierAccess(boolean destination,CodeBuilder codeBuilder) {
		Meaning meaning=this;
		if (meaning.isConnected()) {
			Expression inspectedExpression = ((ConnectionBlock) meaning.declaredIn).getInspectedExpression();
				inspectedExpression.buildEvaluation(null, codeBuilder);
		} else if(declaredAs instanceof ProcedureDeclaration) {			
	        // 0: getstatic     #17                 // Field _CUR:Lsimula/runtime/RTS_RTObject;
	        // 3: getfield      #21                 // Field simula/runtime/RTS_RTObject._SL:Lsimula/runtime/RTS_RTObject;
	        // 6: checkcast     #26                 // class simulaTestPrograms/adHoc000_PPP
	 		int corr = 1;
			boolean withFollowSL = meaning.declaredIn.buildCTX(corr,codeBuilder);
			if(withFollowSL) codeBuilder.checkcast(meaning.declaredIn.getClassDesc());
			
		} else if (!(meaning.declaredIn.declarationKind == ObjectKind.ContextFreeMethod
				|| meaning.declaredIn.declarationKind == ObjectKind.MemberMethod)) {

			// id = "((" + cast + ")" + meaning.declaredIn.edCTX() + ")." + id;
			if (meaning.foundBehindInvisible) {
				meaning.declaredIn.buildCTX(codeBuilder);
				codeBuilder.checkcast(meaning.foundIn.getClassDesc());
			} else {
				boolean withFollowSL = meaning.declaredIn.buildCTX(codeBuilder);
				if(withFollowSL) {
					codeBuilder.checkcast(meaning.declaredIn.getClassDesc());
				}
			}
		}
	}

	@Override
	public String toString() {
		if (declaredAs == null)	return ("NO MEANING");
		return ("DeclaredAs " + declaredAs + ", foundBehindInvisible=" + foundBehindInvisible
				+ "  (ctBlockLevel="+ declaredIn.ctBlockLevel + ", rtBlockLevel="+ declaredIn.rtBlockLevel
				+ ",declaredIn=" + declaredIn + ",foundIn=" + foundIn + ')');
	}

}
