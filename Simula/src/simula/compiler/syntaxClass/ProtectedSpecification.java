/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass;

import java.io.IOException;
import simula.compiler.AttributeInputStream;
import simula.compiler.AttributeOutputStream;
import simula.compiler.syntaxClass.declaration.ClassDeclaration;
import simula.compiler.syntaxClass.declaration.Declaration;
import simula.compiler.syntaxClass.declaration.VirtualSpecification;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Util;

/**
 * Protected Specification.
 * <pre>
 * Syntax: 
 *     protection-specification
 *         = hidden identifier-list
 *         | protected identifier-list
 *         | hidden protected identifier-list
 *         | protected hidden identifier-list
 * </pre>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/declaration/ProtectedSpecification.java"><b>Source File</b></a>.
 * 
 * @author Øystein Myhre Andersen
 *
 */
public final class ProtectedSpecification extends SyntaxClass { // {
	
	/**
	 * The protected identifier.
	 */
	public String identifier;
	
	/**
	 * .
	 */
	public ClassDeclaration definedIn;
	
	/**
	 * .
	 */
    HiddenSpecification hiddenBy; // Set during doChecking

    /**
     * Create a new ProtectedSpecification.
     * @param definedIn the class it is defined in
     * @param identifier the protected identifier
     */
	public ProtectedSpecification(final ClassDeclaration definedIn,final String identifier) {
		this.definedIn=definedIn;
		this.identifier=identifier;
	}
	
	/**
	 * Returns the Attribute being Protected.
	 * @return the Attribute being Protected
	 */
	private Declaration getAttribute() {
		return(definedIn.findLocalAttribute(identifier));
	}
	
	/**
	 * Returns the virtual specification or null.
	 * <p>
	 * The Attribute being Protected may be Virtual.
	 * @return the virtual specification or null
	 */
	private VirtualSpecification getVirtualSpecification() {
		return(definedIn.searchVirtualSpecList(identifier));
	}
	
	// ***********************************************************************************************
	// *** Utility: doChecking -- Called from ClassDeclaration.checkProtectedList
	// ***********************************************************************************************
	/**
	 * Perform semantic checking.
	 */
	@Override
	public void doChecking() {
		Declaration attribute=getAttribute();
		if(attribute!=null) attribute.isProtected=this;
		else Util.error("No Attribute "+identifier+" match 'protected' specification: "+this);
		VirtualSpecification virtSpec=VirtualSpecification.getVirtualSpecification(attribute);
		if(virtSpec!=null) {
			if( virtSpec.declaredIn != attribute.declaredIn )
				Util.error("A virtual attribute may only be specified protected in the class heading in which the virtual specification occurs.");
		}
		// Virtual specification together with Attribute definition.
		VirtualSpecification vir=getVirtualSpecification();
		if(vir!=null) vir.isProtected=this;
	}


	@Override
	public void printTree(final int indent, final Object head) {
		System.out.println(SyntaxClass.edIndent(indent)+this.getClass().getSimpleName()+"    "+this);
	}
	
	@Override
	public String toString()
	{ StringBuilder s=new StringBuilder();
	  s.append("Protected ").append(identifier);
	  s.append("[ Defined in ");
	  s.append((definedIn!=null)?definedIn.identifier:"UNKNOWN");
	  if(hiddenBy!=null) {
		  s.append(", Hidden by ").append(hiddenBy.identifier);
		  s.append(" defined in ");
		  s.append((hiddenBy.definedIn!=null)?hiddenBy.definedIn.identifier:"MISSING");
	  }
	  s.append("]");
	  return(s.toString());
	}


	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************
	/**
	 * Default constructor used by Attribute File I/O
	 */
	private ProtectedSpecification() {}
	
	@Override
	public void writeObject(AttributeOutputStream oupt) throws IOException {
		Util.TRACE_OUTPUT("writeProtectedSpecification: " + identifier);
		oupt.writeKind(ObjectKind.ProtectedSpecification);
		oupt.writeShort(OBJECT_SEQU);
		// *** SyntaxClass
		oupt.writeShort(lineNumber);
		// *** ProtectedSpecification
		oupt.writeString(identifier);
	}

	public static SyntaxClass readObject(AttributeInputStream inpt) throws IOException {
		ProtectedSpecification spec = new ProtectedSpecification();
		spec.OBJECT_SEQU = inpt.readSEQU(spec);
		// *** SyntaxClass
		spec.lineNumber = inpt.readShort();
		// *** ProtectedSpecification
		spec.identifier = inpt.readString();
		spec.definedIn = (ClassDeclaration) Global.getCurrentScope();
		Util.TRACE_INPUT("ProtectedSpecification: " + spec.identifier);
		return(spec);
	}

//	public void writeProtectedSpecification(AttributeOutputStream oupt) throws IOException {
//		Util.TRACE_OUTPUT("writeProtectedSpecification: " + identifier);
//
//		// *** SyntaxClass
//		oupt.writeShort(lineNumber);
//		
//		// *** ProtectedSpecification
//		oupt.writeString(identifier);
//	}
//	
//	public static ProtectedSpecification readProtectedSpecification(AttributeInputStream inpt) throws IOException {
//		ProtectedSpecification spec = new ProtectedSpecification();
//
//		// *** SyntaxClass
//		spec.lineNumber = inpt.readShort();
//		
//		// *** ProtectedSpecification
//		spec.identifier = inpt.readString();
//		spec.definedIn = (ClassDeclaration) Global.getCurrentScope();
//		Util.TRACE_INPUT("ProtectedSpecification: " + spec.identifier);
//		return(spec);
//	}

}
