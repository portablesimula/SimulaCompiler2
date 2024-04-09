/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass.declaration;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.classfile.ClassBuilder;
import java.lang.classfile.CodeBuilder;
import java.util.Vector;

import simula.compiler.AttrInput;
import simula.compiler.AttrOutput;
import simula.compiler.parsing.Parse;
import simula.compiler.syntaxClass.ProtectedSpecification;
import simula.compiler.syntaxClass.SyntaxClass;
import simula.compiler.syntaxClass.Type;
import simula.compiler.utilities.DeclarationList;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.KeyWord;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * Declaration.
 * 
 * <pre>
 * 
 * Simula Standard: Chapter 5. Declarations
 * 
 *   declaration
 *      = simple-variable-declaration
 *      | array-declaration
 *      | switch-declaration
 *      | procedure-declaration
 *      | class-declaration
 *      | external-declaration
 * </pre>
 * This class is prefix to DeclarationScope, ExternalDeclaration, Parameter,
 * SimpleVariableDeclaration, VirtualSpecification, VirtualMatch, ArrayDeclaration
 * <p> 
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/declaration/Declaration.java">
 * <b>Source File</b></a>.
 * 
 * @author Øystein Myhre Andersen
 */
public abstract class Declaration extends SyntaxClass {

	/**
	 * The type
	 */
	public Type type = null;

	/**
	 * Indicates that this declaration is protected.
	 */
	public ProtectedSpecification isProtected; // Set during Checking

	/**
	 * Simula Identifier from Source Text
	 */
	public String identifier;

	/**
	 * External Identifier set by doChecking
	 */
	public String externalIdent;

	/**
	 * The DeclarationScope in which this Declaration is defined.
	 */
	public DeclarationScope declaredIn;

	/**
	 * The declarationKind.
	 */
	public int declarationKind;

//	/**
//	 * The declarationKind
//	 */
//	public class Kind {
//		/** Standard Class */		public static final int StandardClass = 1;
//		/** Connection Block */		public static final int ConnectionBlock = 2;
//		/** Compound Statement */	public static final int CompoundStatement = 3;
//		/** Subblock */				public static final int SubBlock = 4;
//		/**
//		 * Normal Simula Procedure implemented as a Java Class
//		 */
//		public static final int Procedure = 5;
//		/**
//		 * Procedure coded as a Java Member Method.
//		 */
//		public static final int MemberMethod = 6;
//		/**
//		 * Procedure treated as a Java Static Method.
//		 */
//		public static final int ContextFreeMethod = 7;
//		/** Class */					public static final int Class = 8;
//		/** Prefixed Block */			public static final int PrefixedBlock = 9;
//		/** Simula Program */			public static final int SimulaProgram = 10;
//		/** Array Declaration */		public static final int ArrayDeclaration = 11;
//		/** Virtual Specification */	public static final int VirtualSpecification = 12;
//		/** Virtual Match */			public static final int VirtualMatch = 13;
//		/** Parameter */				public static final int Parameter = 14;
//		/** Thunk */					public static final int Thunk = 15;
//		/** Label Declaration */		public static final int LabelDeclaration = 16;
//		/** Simple Variable */			public static final int SimpleVariableDeclaration = 17;
//		/** External Declaration */		public static final int ExternalDeclaration = 18;
//	}
//	
//	public static String edDeclarationKind(int kind) {
//		switch(kind) {
//			case Kind.StandardClass:				return "StandardClass";
//			case Kind.ConnectionBlock:				return "ConnectionBlock";
//			case Kind.CompoundStatement:			return "CompoundStatement";
//			case Kind.SubBlock:						return "SubBlock";
//			case Kind.Procedure:					return "Procedure";
//			case Kind.MemberMethod:					return "MemberMethod";
//			case Kind.ContextFreeMethod:			return "ContextFreeMethod";
//			case Kind.Class:						return "Class";
//			case Kind.PrefixedBlock:				return "PrefixedBlock";
//			case Kind.SimulaProgram:				return "SimulaProgram";
//			case Kind.ArrayDeclaration:				return "ArrayDeclaration";
//			case Kind.VirtualSpecification:			return "VirtualSpecification";
//			case Kind.VirtualMatch:					return "VirtualMatch";
//			case Kind.Parameter:					return "Parameter";
//			case Kind.Thunk:						return "Thunk";
//			case Kind.LabelDeclaration:				return "LabelDeclaration";
//			case Kind.SimpleVariableDeclaration:	return "SimpleVariableDeclaration";
//			case Kind.ExternalDeclaration:			return "ExternalDeclaration";
//		}
//		Util.IERR("IMPOSSIBLE "+kind);
//		return(null);
//	}

	// ***********************************************************************************************
	// *** Constructor
	// ***********************************************************************************************
	/**
	 * Create a new Declaration.
	 * 
	 * @param identifier the given identifier
	 */
	protected Declaration(final String identifier) {
		this.identifier = identifier;
		this.externalIdent = identifier; // May be overwritten in doChecking()
		declaredIn = Global.getCurrentScope();
		checkAlreadyDefined();
	}

	/**
	 * Returns the Java identifier for this declaration.
	 * 
	 * @return the Java identifier for this declaration
	 */
	public final String getJavaIdentifier() {
		return (this.externalIdent);
	} // May be redefined

	/**
	 * Modify the identifier of this class.
	 * 
	 * @param newIdentifier the new identifier
	 */
	protected void modifyIdentifier(final String newIdentifier) {
		this.identifier = newIdentifier;
		checkAlreadyDefined();
	}

	/**
	 * Check if a declaration with this identifier is already defined.
	 */
	private void checkAlreadyDefined() {
		boolean error = false;
		boolean warning = false;
		if (identifier == null)
			return;
		if (identifier.equals("_RESULT"))
			return;
		if (declaredIn == null)
			return;
		if (declaredIn instanceof StandardClass)
			return;
		if (declaredIn instanceof StandardProcedure)
			return;
		Vector<Parameter> parameterList;
		if (declaredIn instanceof ProcedureDeclaration proc)
			parameterList = proc.parameterList;
		else if (declaredIn instanceof ClassDeclaration cls)
			parameterList = cls.parameterList;
		else
			parameterList = null; // No parameters

		if (parameterList != null) {
			for (Declaration decl : parameterList)
				if (Util.equals(decl.identifier, identifier)) {
					warning = true;
					break;
				}
		}
		LOOP: for (Declaration decl : declaredIn.declarationList) {
			if (decl == null)
				return; // Error recovery
			if (decl.identifier == null)
				return; // Error recovery
			if (Util.equals(decl.identifier, identifier)) {
				error = true;
				break LOOP;
			}
		}
		if (error)
			Util.error(identifier + " is alrerady defined in " + declaredIn.identifier);
		else if (warning)
			Util.warning(identifier + " is alrerady defined in " + declaredIn.identifier);
	}

	/**
	 * Parse a declaration and add it to the given declaration list.
	 * 
	 * @param declarationList the given declaration list
	 * @return true if a declaration was found, false otherwise
	 */
	protected static boolean acceptDeclaration(final BlockDeclaration enclosure) {
		if (Option.TRACE_PARSE)
			Parse.TRACE("Parse Declaration");
		DeclarationList declarationList=enclosure.declarationList;
		String prefix = Parse.acceptIdentifier();
		if (prefix != null) {
			if (Parse.accept(KeyWord.CLASS))
				declarationList.add(ClassDeclaration.expectClassDeclaration(prefix));
			else {
				Parse.saveCurrentToken(); // Identifier is NOT a class prefix.
				return (false);
			}
		} else if (Parse.accept(KeyWord.ARRAY))
			ArrayDeclaration.expectArrayDeclaration(Type.Real, declarationList); // Default type real for arrays
		else if (Parse.accept(KeyWord.PROCEDURE))
			declarationList.add(ProcedureDeclaration.expectProcedureDeclaration(null));
		else if (Parse.accept(KeyWord.PRIOR)) {
			Util.warning("Keyword 'prior' ignored - prior procedure is not implemented");
			Type type = Parse.acceptType();
			Parse.expect(KeyWord.PROCEDURE);
			declarationList.add(ProcedureDeclaration.expectProcedureDeclaration(type));
		} else if (Parse.accept(KeyWord.CLASS))
			declarationList.add(ClassDeclaration.expectClassDeclaration(null));
		else if (Parse.accept(KeyWord.SWITCH)) {
			String ident = Parse.acceptIdentifier();
			if (ident == null) {
				// Switch Statement
				Parse.saveCurrentToken();
				return (false);
			}
			declarationList.add(new SwitchDeclaration(ident));
		} else if (Parse.accept(KeyWord.EXTERNAL))
			ExternalDeclaration.expectExternalHead(enclosure);
		else {
			Type type = Parse.acceptType();
			if (type == null)
				return (false);
			if (Parse.accept(KeyWord.PROCEDURE))
				declarationList.add(ProcedureDeclaration.expectProcedureDeclaration(type));
			else if (Parse.accept(KeyWord.ARRAY))
				ArrayDeclaration.expectArrayDeclaration(type, declarationList);
			else 
				SimpleVariableDeclaration.expectSimpleVariable(type, declarationList);
			
			if (Option.TRACE_PARSE)
				Parse.TRACE("Parse Declaration(2)");
		}
		return (true);
	}

	// ***********************************************************************************************
	// *** Utility: isCompatibleClasses -- Used by IS/IN/QUA-checking and Inspect WHEN
	// ***********************************************************************************************
	/**
	 * Check if these classes are compatible.
	 * 
	 * @param other the other ClassDeclaration
	 * @return the resulting boolean value
	 */
	public boolean isCompatibleClasses(final Declaration other) {
		if (!(this instanceof ClassDeclaration))
			Util.error("" + this + " is not a class");
		if (!(other instanceof ClassDeclaration))
			Util.error("" + other + " is not a class");

		if (((ClassDeclaration) this).isSubClassOf((ClassDeclaration) other))
			return (true);
		return (((ClassDeclaration) other).isSubClassOf((ClassDeclaration) this));
	}

	/**
	 * Output Java ByteCode. Treat Declaration.
	 */
	public void buildField(ClassBuilder classBuilder,BlockDeclaration encloser) {
		Util.IERR("Method buildField need a redefinition in "+this.getClass().getSimpleName());
	}

	/**
	 * 
	 */
	public String getFieldIdentifier() {
		Util.IERR("Method getFieldIdentifier need a redefinition in "+this.getClass().getSimpleName());
		return(null);
	}

	/**
	 * Output Java ByteCode. Build init code for an Attribute.
	 */
	public void buildInitAttribute(CodeBuilder codeBuilder) {
		Global.sourceLineNumber = lineNumber;
		Util.IERR("Method buildInitAttribute need a redefinition in "+this.getClass().getSimpleName());
	}

	/**
	 * Output Java ByteCode. Build declaration code for an Attribute.
	 */
	public void buildDeclarationCode(CodeBuilder codeBuilder) {
		Global.sourceLineNumber = lineNumber;
//		Util.IERR("Method buildDeclarationCode need a redefinition in "+this.getClass().getSimpleName());
	}


//	// ***********************************************************************************************
//	// *** Externalization
//	// ***********************************************************************************************
//
//	@Override
//	public void writeExternal(ObjectOutput oupt) throws IOException {
//		super.writeExternal(oupt);
//		Util.TRACE_OUTPUT("BEGIN Write "+this.getClass().getSimpleName());
//		oupt.writeType(type);
//		oupt.writeObject(isProtected);
//		oupt.writeString(identifier);
//		oupt.writeString(externalIdent);
//		if(!Option.NEW_ATTR_FILE)
//			oupt.writeObject(declaredIn);
//		oupt.writeInt(declarationKind);
////		oupt.writeInt(slot);
//	}
//	
//	@Override
//	public void readExternal(ObjectInput inpt) throws IOException {
//		super.readExternal(inpt);
//		Util.TRACE_INPUT("BEGIN Read "+this.getClass().getSimpleName());
//		type = inpt.readType();
//		isProtected = (ProtectedSpecification) inpt.readObject();
//		identifier = inpt.readString();
//		externalIdent = inpt.readString();
//		if(!Option.NEW_ATTR_FILE)
//			declaredIn = (DeclarationScope) inpt.readObject();
//		declarationKind = inpt.readInt();
////		slot = inpt.readInt();
//	}

}
