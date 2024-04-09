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
import java.lang.constant.MethodTypeDesc;

import simula.compiler.AttrInput;
import simula.compiler.AttrOutput;
import simula.compiler.GeneratedJavaClass;
import simula.compiler.parsing.Parse;
import simula.compiler.syntaxClass.HiddenSpecification;
import simula.compiler.syntaxClass.ProtectedSpecification;
import simula.compiler.syntaxClass.SyntaxClass;
import simula.compiler.syntaxClass.Type;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.KeyWord;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Util;

/**
 * Virtual Quantities.
 * <pre>
 * Simula Standard: 5.5.3 Virtual quantities
 * 
 *    virtual-part  =  VIRTUAL  :  virtual-spec  ;  {  virtual-spec  ;  }
 *    
 *    virtual-spec  =  virtual-specifier  identifier-list
 *                  |  PROCEDURE  procedure-identifier  procedure-specification
 *                  
 *      procedure-specification =  IS  procedure-declaration
 *        
 *   	virtual-specifier = LABEL | SWITCH |  [ type ] PROCEDURE
 *   
 *    	identifier-list  =  identifier  { , identifier }
 *
 * </pre>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/declaration/VirtualSpecification.java">
 * <b>Source File</b></a>.
 * 
 * @author SIMULA Standards Group
 * @author Øystein Myhre Andersen
 *
 */
public final class VirtualSpecification extends Declaration {
	// String identifier; // Inherited
	// String externalIdent; // Inherited
	// Type type; // Inherited: Procedure's type if any

	/**
	 * Virtual Kind.
	 */
	public class Kind {
		/** Virtual procedure */ public static final int Procedure = 1;
		/** Virtual label */	 public static final int Label     = 2;
		/** Virtual switch */	 public static final int Switch    = 3;
	}

	/**
	 * Virtual kind.
	 */
	public int kind;
	
	/**
	 * The procedure specification if present.
	 */
	public ProcedureSpecification procedureSpec; // From: IS ProcedureSpecification
	
	/**
	 * Indicates if this virtual has a default match.
	 * <p>
	 * Set during doChecking
	 */
	boolean hasDefaultMatch;

	/**
	 * VirtualSpecification.
	 * @param identifier virtual identifier
	 * @param type the virtual's type
	 * @param kind the vitual Kind
	 * @param procedureSpec the ProcedureSpecification
	 */
	VirtualSpecification(final String identifier, final Type type, final int kind,
			final ProcedureSpecification procedureSpec) {
		super(identifier);
		this.declarationKind = ObjectKind.VirtualSpecification;
		this.externalIdent = identifier;
		this.type = type;
		this.kind = kind;
		this.procedureSpec = procedureSpec;
//		this.blockKind=BlockKind.Procedure;
	}

	/**
	 * Parse a virtual-part and put it into the given class.
	 * <pre>
	 * Syntax:
	 * 
	 *      virtual-part = VIRTUAL: virtual-spec ; { virtual-spec ; }
	 *         virtual-spec
	 *             = virtual-specifier identifier-list
	 *             | PROCEDURE procedure-identifier  procedure-specification
	 *             
	 *                virtual-Specifier = [ type ] PROCEDURE | LABEL | SWITCH
	 *                
	 *                identifier-list = identifier { , identifier }
	 *                
	 *                procedure-specification = IS procedure-declaration
	 *
	 * </pre>
	 * Precondition: VIRTUAL  is already read.
	 * @param cls the ClassDeclaration
	 */
	static void expectVirtualPart(final ClassDeclaration cls) {
		Parse.expect(KeyWord.COLON);
		LOOP: while (true) {
			Type type;
			if (Parse.accept(KeyWord.SWITCH)) {
				expectIdentifierList(cls, Type.Label, Kind.Switch);
			} else if (Parse.accept(KeyWord.LABEL)) {
				expectIdentifierList(cls, Type.Label, Kind.Label);
			} else {
				type = Parse.acceptType();
				if (!Parse.accept(KeyWord.PROCEDURE))
					break LOOP;

				String identifier = Parse.expectIdentifier();
				ProcedureSpecification procedureSpec = null;
				if (Parse.accept(KeyWord.IS)) {
					Type procedureType = Parse.acceptType();
					Parse.expect(KeyWord.PROCEDURE);
					procedureSpec = ProcedureSpecification.expectProcedureSpecification(procedureType);
					cls.virtualSpecList
							.add(new VirtualSpecification(identifier, type, Kind.Procedure, procedureSpec));
				} else {
					cls.virtualSpecList.add(new VirtualSpecification(identifier, type, Kind.Procedure, null));
					if (Parse.accept(KeyWord.COMMA))
						expectIdentifierList(cls, type, Kind.Procedure);
					else
						Parse.expect(KeyWord.SEMICOLON);
				}
			}
		}
		if(cls.virtualSpecList.size()==0) Util.error("Missing virtual specifier after VIRTUAL:");
	}

	/**
	 * Parse a virtual identifier list.
	 * <pre>
	 * Syntax:
	 * 
	 *        identifier-list = identifier { , identifier
	 * </pre>
	 * @param cls the ClassDeclaration
	 * @param type the specifiers type
	 * @param kind the specifiers kind
	 */
	private static void expectIdentifierList(final ClassDeclaration cls, final Type type, final int kind) {
		do {
			String identifier = Parse.expectIdentifier();
			cls.virtualSpecList.add(new VirtualSpecification(identifier, type, kind, null));
		} while (Parse.accept(KeyWord.COMMA));
		Parse.expect(KeyWord.SEMICOLON);
	}

	@Override
	public void doChecking() {
		if (IS_SEMANTICS_CHECKED())
			return;
		Global.sourceLineNumber = lineNumber;
		if (procedureSpec != null)
			procedureSpec.doChecking(this.declaredIn);
		// Label and switch attributes are implicit specified 'protected'
		if (kind == Kind.Label || kind == Kind.Switch)
			((ClassDeclaration) declaredIn).protectedList
					.add(new ProtectedSpecification((ClassDeclaration) declaredIn, identifier));
		SET_SEMANTICS_CHECKED();
	}

	/**
	 * Returns the virtual identifier used i Java code.
	 * @return the virtual identifier used i Java code
	 */
	public String getVirtualIdentifier() {
		ClassDeclaration specifiedIn = (ClassDeclaration) this.declaredIn;
		return (getJavaIdentifier() + '_' + specifiedIn.prefixLevel() + "()");
	}

	/**
	 * Returns the virtual identifier used in JVM code.
	 * @return the virtual identifier used in JVM code
	 */
	public String getSimpleVirtualIdentifier() {
		ClassDeclaration specifiedIn = (ClassDeclaration) this.declaredIn;
		return (getJavaIdentifier() + '_' + specifiedIn.prefixLevel());
	}

	// ***********************************************************************************************
	// *** Utility: getVirtualSpecification
	// ***********************************************************************************************
	/**
	 * Get virtual specification.
	 * @param decl the declaration to search for
	 * @return a VirtualSpecification or null
	 */
	public static VirtualSpecification getVirtualSpecification(final Declaration decl) {
		if (!(decl.declaredIn instanceof ClassDeclaration))
			return (null);
		ClassDeclaration scope = (ClassDeclaration) decl.declaredIn;
		VirtualSpecification virtSpec = scope.searchVirtualSpecList(decl.identifier);
		if (virtSpec != null)
			return (virtSpec);
		scope = scope.getPrefixClass();

		SEARCH: while (scope != null) {
			HiddenSpecification hdn = scope.searchHiddenList(decl.identifier);
			if (hdn != null) {
				scope = hdn.getScopeBehindHidden();
				continue SEARCH;
			}
			virtSpec = scope.searchVirtualSpecList(decl.identifier);
			if (virtSpec != null)
				return (virtSpec);
			scope = scope.getPrefixClass();
		}
		return (null);
	}

	@Override
	public void doJavaCoding() {
		ASSERT_SEMANTICS_CHECKED();
		String matchCode = "{ throw new RTS_SimulaRuntimeError(\"No Virtual Match: " + identifier + "\"); }";
		String qnt = (kind == Kind.Label) ? "RTS_LABEL " : "RTS_PRCQNT ";
		GeneratedJavaClass.code("public " + qnt + getVirtualIdentifier() + matchCode);
	}

	public String getFieldIdentifier() {
		ClassDeclaration cls = (ClassDeclaration) this.declaredIn;
		return(externalIdent+"_"+cls.prefixLevel()+"()");
	}

	public void buildMethod(ClassBuilder classBuilder) {
//	    System.out.println("VirtualSpecification.buildMethod: "+this);
	    String ident=getSimpleVirtualIdentifier();
		String qnt = (kind == Kind.Label) ? "RTS_LABEL;" : "RTS_PRCQNT;";
		MethodTypeDesc MTD=MethodTypeDesc.ofDescriptor("()Lsimula/runtime/"+qnt);
		classBuilder
			.withMethodBody(ident, MTD, ClassFile.ACC_PUBLIC,
					codeBuilder -> buildMethodBody(codeBuilder));
	}
	
	private void buildMethodBody(CodeBuilder codeBuilder) {
		Util.buildSimulaRuntimeError("No Virtual Match: " + identifier, codeBuilder);
	}


	public void printTree(int indent) {
		System.out.println(SyntaxClass.edIndent(indent)+this.getClass().getSimpleName()+"    "+this);
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		if (type != null)
			s.append(type).append(' ');
		if (kind == Kind.Procedure)
			s.append("PROCEDURE ");
		s.append(identifier);
		s.append("[Specified in ").append(declaredIn.identifier).append(']');
		if (procedureSpec != null)
			s.append('=').append(procedureSpec);
		return (s.toString());
	}

	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************
	/**
	 * Default constructor used by Externalization.
	 */
	public VirtualSpecification() {
		super(null);
		this.declarationKind = ObjectKind.VirtualSpecification;
	}

	public static void writeVirtSpec(VirtualSpecification virt,AttrOutput oupt) throws IOException {
		if(virt == null) {
			oupt.writeBoolean(false);
		} else {
			oupt.writeBoolean(true);
			Util.TRACE_OUTPUT("VirtualSpec: " + virt.type + ' ' + virt.identifier + ' ' + virt.kind);
			oupt.writeString(virt.identifier);
			oupt.writeString(virt.externalIdent);
			oupt.writeType(virt.type);
			oupt.writeInt(virt.kind);
//			oupt.writeObject(procedureSpec);
			ProcedureSpecification.writeProcedureSpec(virt.procedureSpec,oupt);
		}
	}

	public static VirtualSpecification readVirtSpec(AttrInput inpt) throws IOException {
		Util.TRACE_INPUT("BEGIN readVirtSpec: ");
		boolean present = inpt.readBoolean();
		VirtualSpecification virt = null;
		if(present) {
			virt = new VirtualSpecification();
			virt.identifier = inpt.readString();
			virt.externalIdent = inpt.readString();
			virt.type = inpt.readType();
			virt.kind = inpt.readInt();
//			virt.procedureSpec = (ProcedureSpecification) inpt.readObject();
			virt.procedureSpec = ProcedureSpecification.readProcedureSpec(inpt);
		}
		Util.TRACE_INPUT("VirtualSpec: " + virt);
		return(virt);
	}

//	// ***********************************************************************************************
//	// *** Externalization
//	// ***********************************************************************************************
//
//	@Override
//	public void writeExternal(ObjectOutput oupt) throws IOException {
//		Util.TRACE_OUTPUT("VirtualSpec: " + type + ' ' + identifier + ' ' + kind);
//		oupt.writeString(identifier);
//		oupt.writeString(externalIdent);
//		oupt.writeType(type);
//		oupt.writeByte(kind);
//		oupt.writeObject(procedureSpec);
//	}
//
//	@Override
//	public void readExternal(ObjectInput inpt) throws IOException {
//		identifier = inpt.readString();
//		externalIdent = inpt.readString();
//		type = inpt.readType();
//		kind = inpt.readByte();
//		procedureSpec = (ProcedureSpecification) inpt.readObject();
//		Util.TRACE_INPUT("VirtualSpec: " + type + ' ' + identifier + ' ' + kind);
//	}

}
