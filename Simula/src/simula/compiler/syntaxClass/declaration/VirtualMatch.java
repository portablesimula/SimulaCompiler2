/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass.declaration;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.classfile.ClassBuilder;
import java.lang.classfile.ClassFile;
import java.lang.classfile.CodeBuilder;
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import java.lang.constant.MethodTypeDesc;

import simula.compiler.GeneratedJavaClass;
import simula.compiler.syntaxClass.SyntaxClass;
import simula.compiler.utilities.CD;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Util;

/**
 * Virtual match.
 * <p>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/declaration/VirtualMatch.java">
 * <b>Source File</b></a>.
 * 
 * @author Øystein Myhre Andersen
 *
 */
public final class VirtualMatch extends Declaration {
	
	/**
	 * The matching ProcedureDeclaration. Set during doChecking.
	 */
	private ProcedureDeclaration match; // Set during doChecking

	/**
	 * The virtual specification. Set during doChecking.
	 */
	public VirtualSpecification virtualSpec; // Set during doChecking

	/**
	 * Create a new VirtualSpecification.
	 * @param virtualSpec the virtual specification
	 * @param match a matching ProcedureDeclaration
	 */
	VirtualMatch(final VirtualSpecification virtualSpec, final ProcedureDeclaration match) {
		super(virtualSpec.identifier);
		this.declarationKind = ObjectKind.VirtualMatch;
		// NOTE: Called during Checking
		this.virtualSpec = virtualSpec;
		this.match = match;
	}

	@Override
	public void doJavaCoding() {
		String matchCode = "{ throw new RTS_SimulaRuntimeError(\"No Virtual Match: " + identifier + "\"); }";
		if (match != null)
			matchCode = "{ return(new RTS_PRCQNT(this," + match.getJavaIdentifier() + ".class)); }";
		GeneratedJavaClass.code("    public RTS_PRCQNT " + virtualSpec.getVirtualIdentifier() + " " + matchCode);
	}

	public void buildMethod(ClassBuilder classBuilder) {
	    String ident=virtualSpec.getSimpleVirtualIdentifier();
//	    System.out.println("VirtualMatch.buildMethod: "+this);
		MethodTypeDesc MTD_STM=MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_PRCQNT;");
		classBuilder
			.withMethodBody(ident, MTD_STM, ClassFile.ACC_PUBLIC,
					codeBuilder -> buildMethodBody(codeBuilder));
	}
	
	private void buildMethodBody(CodeBuilder codeBuilder) {
		if (match == null) {
			Util.IERR("TROR IKKE AT DETTE FOREKOMMER");
			Util.buildSimulaRuntimeError("No Virtual Match: " + identifier, codeBuilder);
		} else {
			ConstantPoolBuilder pool=codeBuilder.constantPool();
			codeBuilder
				.new_(CD.RTS_PRCQNT)
				.dup()
				.aload(0)
				.ldc(pool.classEntry(match.getClassDesc()))
				.invokespecial(CD.RTS_PRCQNT, "<init>", MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_RTObject;Ljava/lang/Class;)V"))
				.areturn();	
		}
	}

	public void printTree(int indent) {
		System.out.println(SyntaxClass.edIndent(indent)+this.getClass().getSimpleName()+"    "+this);
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		if (match.type != null)
			s.append(match.type).append(' ');
		s.append("PROCEDURE ").append(match.identifier);
		if (virtualSpec != null)
			s.append("[Specified by ").append(virtualSpec.identifier).append(']');
		return (s.toString());
	}

	// ***********************************************************************************************
	// *** Externalization
	// ***********************************************************************************************
	/**
	 * Default constructor used by Externalization.
	 */
	public VirtualMatch() {
		super(null);
		this.declarationKind = ObjectKind.VirtualMatch;
	}

//	@Override
//	public void writeExternal(ObjectOutput oupt) throws IOException {
//		Util.TRACE_OUTPUT("VirtualMatch: " + identifier);
//		oupt.writeString(identifier);
//		oupt.writeString(externalIdent);
//	}
//
//	@Override
//	public void readExternal(ObjectInput inpt) throws IOException {
//		identifier = inpt.readString();
//		externalIdent = inpt.readString();
//		Util.TRACE_INPUT("VirtualMatch: " + identifier);
//		match = ((ClassDeclaration) this.declaredIn).findLocalProcedure(identifier);
//		if (match != null) {
//			virtualSpec = VirtualSpecification.getVirtualSpecification(match); // AdHoc
//		} else
//			Util.error("Malformed Attribute File (at VirtualMatch " + identifier + ")");
//	}

}
