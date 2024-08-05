package simula.compiler.syntaxClass.declaration;

import java.io.IOException;
import java.lang.classfile.ClassBuilder;
import java.lang.classfile.ClassFile;
import java.lang.classfile.CodeBuilder;
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import java.lang.classfile.constantpool.FieldRefEntry;
import java.lang.constant.ClassDesc;

import simula.compiler.AttributeInputStream;
import simula.compiler.AttributeOutputStream;
import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.statement.ConnectionStatement;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

public class InspectVariableDeclaration extends Declaration {
	// String identifier; // Inherited
	// String externalIdent; // Inherited
	// Type type; // Inherited

	/**
	 * The assosiated ConnectionStatement 
	 */
	DeclarationScope connectionScope;
	ConnectionStatement connectionStatement;
	
	/**
	 * Create a new InspectVariableDeclaration.
	 * 
	 * @param type       the variable type
	 * @param identifier the variable identifier
	 */
	public InspectVariableDeclaration(final Type type, final String identifier,final DeclarationScope connectionScope, final ConnectionStatement connectionStatement) {
		super(identifier);
		this.declarationKind = ObjectKind.InspectVariableDeclaration;
		this.type = type;
		this.connectionScope = connectionScope;
		this.connectionStatement = connectionStatement;
	}


	@Override
	public void doChecking() {
		if (IS_SEMANTICS_CHECKED())	return;
		Global.sourceLineNumber = lineNumber;
		if (Option.internal.TRACE_CHECKER)
			Util.TRACE("BEGIN ConnectionStatement(" + toString() + ").doChecking - Current Scope Chain: " + Global.getCurrentScope().edScopeChain());

		connectionStatement.doChecking();
//		connectionScope.doChecking();
//		type.doChecking(connectionScope);

		SET_SEMANTICS_CHECKED();
	}



	@Override
	public void doDeclarationCoding() {
//		if (constantElement != null && !(constantElement instanceof Constant)) {
//			// Initiate Final Variable
//			String value = constantElement.toJavaCode();
//			GeneratedJavaClass.code(getJavaIdentifier() + '=' + value + ';');
//		}
	}

	@Override
	public String toJavaCode() {
		ASSERT_SEMANTICS_CHECKED();
		String modifier = "public ";
//		if (this.isConstant())
//			modifier = modifier + "final ";
//		if (constantElement != null) {
//			constantElement = TypeConversion.testAndCreate(type, constantElement.evaluate());
//			constantElement.doChecking();
//			if (constantElement instanceof Constant) {
//				String value = constantElement.toJavaCode();
//				String putValue = TypeConversion.mayBeConvert(constantElement.type, type, value);
//				return (modifier + type.toJavaType() + ' ' + getJavaIdentifier() + putValue);
//			} else {
//				return (modifier + type.toJavaType() + ' ' + getJavaIdentifier() + ';');
//			}
//		}
		String value = type.edDefaultValue();
		return (modifier + type.toJavaType() + ' ' + getJavaIdentifier() + '=' + value + ';');
	}

	public FieldRefEntry getFieldRefEntry(ConstantPoolBuilder pool) {
		ClassDesc owner=declaredIn.getClassDesc();
		return(pool.fieldRefEntry(owner, getFieldIdentifier(), type.toClassDesc()));
	}
	
	@Override
	public String getFieldIdentifier() {
		return(this.externalIdent);
	}

	@Override
	public void buildDeclaration(ClassBuilder classBuilder,BlockDeclaration encloser) {
		ClassDesc CD=type.toClassDesc();
		classBuilder.withField(getFieldIdentifier(), CD, ClassFile.ACC_PUBLIC);
	}

	@Override
	public void buildInitAttribute(CodeBuilder codeBuilder) {
		codeBuilder.aload(0);
		switch(type.keyWord) {
			case Type.T_BOOLEAN:
			case Type.T_CHARACTER:
			case Type.T_INTEGER:	codeBuilder.iconst_0(); break;
			case Type.T_LONG_REAL:	codeBuilder.dconst_0(); break;
			case Type.T_REAL:		codeBuilder.fconst_0(); break;
			case Type.T_TEXT:
			case Type.T_REF:
			case Type.T_PROCEDURE:
			case Type.T_LABEL:		codeBuilder.aconst_null(); break;
			default: Util.IERR();
		}
		codeBuilder
			.putfield(codeBuilder.constantPool().fieldRefEntry(BlockDeclaration.currentClassDesc(),this.getFieldIdentifier(), type.toClassDesc()));
	}
	
	@Override
	public void printTree(final int indent, final Object head) {
		verifyTree(head);
		System.out.println(edTreeIndent(indent)+this);
	}

	@Override
	public String toString() {
//		String s = "Type=" + type + ", identifier=" + identifier;
		String s = identifier + ", type=" + type + ", connectionScope=" + connectionScope;
//		return ("InspectVariableDeclaration "+s);
		return (s);
	}

	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************
	/**
	 * Default constructor used by Attribute File I/O
	 */
	public InspectVariableDeclaration() {
		super(null);
		this.declarationKind = ObjectKind.InspectVariableDeclaration;
	}

	@Override
	public void writeObject(AttributeOutputStream oupt) throws IOException {
		Util.TRACE_OUTPUT("Variable: " + this);
		oupt.writeKind(declarationKind);
		oupt.writeShort(OBJECT_SEQU);

		// *** SyntaxClass
		oupt.writeShort(lineNumber);

		// *** Declaration
		oupt.writeString(identifier);
		oupt.writeString(externalIdent);
		oupt.writeType(type);// Declaration
		oupt.writeObj(declaredIn);// Declaration
		
		// *** InspectVariableDeclaration
		oupt.writeObj(connectionScope);
		oupt.writeObj(connectionStatement);
	}
	
	public static InspectVariableDeclaration readObject(AttributeInputStream inpt) throws IOException {
		InspectVariableDeclaration var = new InspectVariableDeclaration();
		var.OBJECT_SEQU = inpt.readSEQU(var);

		// *** SyntaxClass
		var.lineNumber = inpt.readShort();

		// *** Declaration
		var.identifier = inpt.readString();
		var.externalIdent = inpt.readString();
		var.type = inpt.readType();
		var.declaredIn = (DeclarationScope) inpt.readObj();
		
		// *** InspectVariableDeclaration
		var.connectionScope = (DeclarationScope) inpt.readObj();
		var.connectionStatement = (ConnectionStatement) inpt.readObj();
		Util.TRACE_INPUT("Variable: " + var.OBJECT_SEQU + " " + var);
		return(var);
	}

}
