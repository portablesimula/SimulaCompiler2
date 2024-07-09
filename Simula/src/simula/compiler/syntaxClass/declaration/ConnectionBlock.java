/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass.declaration;

import java.io.IOException;
import java.lang.classfile.CodeBuilder;
import java.lang.constant.ClassDesc;
import simula.compiler.AttributeInputStream;
import simula.compiler.AttributeOutputStream;
import simula.compiler.GeneratedJavaClass;
import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.expression.Expression;
import simula.compiler.syntaxClass.expression.TypeConversion;
import simula.compiler.syntaxClass.expression.VariableExpression;
import simula.compiler.syntaxClass.statement.Statement;
import simula.compiler.utilities.DeclarationList;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.LabelList;
import simula.compiler.utilities.Meaning;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * Connection Block.
 * <p>
 * A Connection Block is a Statement within a Connection Statement.
 * It acts as a block, whether it takes the form of a block or not.
 * It further acts as if enclosed by a second fictitious block, called a
 * "connection block". During the execution of a connection block the object X is said to be
 * "connected".
 * <p>
 * See Simula Standard 4.8 Connection statement.
 * <p>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/declaration/ConnectionBlock.java">
 * <b>Source File</b></a>.
 * 
 * @author Øystein Myhre Andersen
 */
public final class ConnectionBlock extends DeclarationScope {
	/**
	 * The Connection Statement.
	 */
	private Statement statement;
	/**
	 * When clause class identifier.
	 */
	private String whenClassIdentifier;
	/**
	 * When clause class Declaration. Set during checking.
	 */
	private Declaration whenClassDeclaration; // Set during checking

	/**
	 * The inspected variable.
	 */
	public VariableExpression inspectedVariable;

	/**
	 * The when class declaration. Set during checking.
	 */
	public ClassDeclaration classDeclaration;

	/**
	 * Create a new ConnectionBlock.
	 * 
	 * @param inspectedVariable   the inspected variable
	 * @param whenClassIdentifier the when class identifier
	 */
	public ConnectionBlock(final VariableExpression inspectedVariable, final String whenClassIdentifier) {
		super("Connection block at line " + (Global.sourceLineNumber - 1));
		declarationKind = ObjectKind.ConnectionBlock;
		this.inspectedVariable = inspectedVariable;
		this.whenClassIdentifier = whenClassIdentifier;
		// Set External Identifier
		externalIdent = inspectedVariable.identifier;
	}

	/**
	 * Get inspected expression.
	 * 
	 * @return inspected expression.
	 */
	public Expression getInspectedExpression() {
		Type type = classDeclaration.type;
		return ((Expression) TypeConversion.testAndCreate(type, inspectedVariable));
	}

	/**
	 * Connection block end.
	 */
	public void end() {
		if (Option.internal.TRACE_PARSE)
			Util.TRACE("END ConnectionBlock: " + this.edScopeChain());
		if (labelList != null && !labelList.isEmpty())
			MaybeBlockDeclaration.moveLabelsFrom(this); // Label is also declaration
		Global.setScope(declaredIn);
	}

	/**
	 * Set the Connected ClassDeclaration.
	 * 
	 * @param classDeclaration the Connected ClassDeclaration.
	 */
	public void setClassDeclaration(final ClassDeclaration classDeclaration) {
//		System.out.println("ConnectionBlock.setClassDeclaration: "+identifier+"  classDeclaration="+classDeclaration);
		this.classDeclaration = classDeclaration;
	}

	/**
	 * Set the Connection Statement.
	 * 
	 * @param statement the Connection Statement
	 */
	public void setStatement(final Statement statement) {
		this.statement = statement;
	}

	@Override
	public Meaning findMeaning(final String identifier) {
		if (classDeclaration == null && Global.duringParsing)
			return (null); // Still in Pass1(Parser)
		Meaning result = null;
		if (classDeclaration != null)
			result = classDeclaration.findRemoteAttributeMeaning(identifier);
		if (result != null) {
			result.declaredIn = this;
		} else if (declaredIn != null) {
			result = declaredIn.findMeaning(identifier);
		}
		if (result == null) {
			Util.error("Undefined variable: " + identifier);
			result = new Meaning(null, null); // Error Recovery: No Meaning
		}
		return (result);
	}

	// ***********************************************************************************************
	// *** Utility: findVisibleAttributeMeaning
	// ***********************************************************************************************
	@Override
	public Meaning findVisibleAttributeMeaning(final String ident) {
		if(Option.internal.TRACE_FIND_MEANING>0) Util.println("BEGIN Checking ConnectionBlock for "+ident+" ================================== "+identifier+" ==================================");
		for (Declaration declaration : declarationList) {
			if(Option.internal.TRACE_FIND_MEANING>1) Util.println("Checking Local "+declaration);
			if (Util.equals(ident, declaration.identifier))
				return (new Meaning(declaration, this, this, false));
		}
		if(labelList != null) for (LabelDeclaration label : labelList.labels) {
			if(Option.internal.TRACE_FIND_MEANING>1) Util.println("Checking Label "+label);
			if (Util.equals(ident, label.identifier))
				return (new Meaning(label, this, this, false));
		}
		if(Option.internal.TRACE_FIND_MEANING>0) Util.println("ENDOF Checking ConnectionBlock for "+ident+" ================================== "+identifier+" ==================================");
		return (null);
	}

	@Override
	public void doChecking() {
		if (IS_SEMANTICS_CHECKED())
			return;
		Global.sourceLineNumber = lineNumber;
		Global.enterScope(this);
		if (whenClassIdentifier != null) {
			Meaning meaning = findMeaning(whenClassIdentifier);
			whenClassDeclaration = meaning.declaredAs;
		}
		statement.doChecking();
		Global.exitScope();
		SET_SEMANTICS_CHECKED();
	}
	
	@Override
	public int getRTBlockLevel() {
//		ASSERT_SEMANTICS_CHECKED();
		int rtBlockLevel = declaredIn.getRTBlockLevel();
//		System.out.println("DeclarationScope.getRTBlockLevel: "+this.getClass().getSimpleName()+" "+this);
		return rtBlockLevel;
	}

	@Override
	public void doJavaCoding() {
		Global.sourceLineNumber = lineNumber;
		ASSERT_SEMANTICS_CHECKED();
		Global.enterScope(this);
		GeneratedJavaClass.code("{");
		statement.doJavaCoding();
		GeneratedJavaClass.code("}");
		Global.exitScope();
	}

	@Override
	public String toJavaCode() {
		String connID = inspectedVariable.toJavaCode();
		Declaration when = whenClassDeclaration;
		if (when == null)
			return (connID);
		return ("((" + when.getJavaIdentifier() + ')' + connID + ')');
	}
	
	@Override
	public ClassDesc getClassDesc() {
		return(inspectedVariable.type.toClassDesc());
	}

	public void buildByteCode(CodeBuilder codeBuilder) {
		ASSERT_SEMANTICS_CHECKED();
		Global.enterScope(this);
		statement.buildByteCode(codeBuilder);
		Global.exitScope();
	}

	// ***********************************************************************************************
	// *** Printing Utility: print
	// ***********************************************************************************************
	@Override
	public void print(final int indent) {
		String spc = edIndent(indent);
		StringBuilder s = new StringBuilder(indent);
		s.append('[').append(sourceBlockLevel).append(':').append(getRTBlockLevel()).append("] ");
		s.append(declarationKind).append(' ').append(identifier);
		Util.println(s.toString());
		String beg = "begin[" + edScopeChain() + ']';
		Util.println(spc + beg);
		for (Declaration decl : declarationList)
			decl.print(indent + 1);
		statement.print(indent + 1);
		Util.println(spc + "end[" + edScopeChain() + ']');
	}

	// ***********************************************************************************************
	// *** Printing Utility: printTree
	// ***********************************************************************************************
	@Override
	public void printTree(final int indent) {
		String BL = (IS_SEMANTICS_CHECKED()) ? "  BL=" + getRTBlockLevel() : "";
		System.out.println(edTreeIndent(indent) + "CONNECTION " + identifier + BL + "  PrefixLevel=" + prefixLevel());
		printDeclarationList(indent+1);
		statement.printTree(indent + 1);
		System.out.println(edTreeIndent(indent)+"END CONNECTION "+identifier);
	}

	@Override
	public String toString() {
		return ("Inspect(" + inspectedVariable + ") do " + statement);
	}

	@Override
	public byte[] buildClassFile() {
		return null;
	}

	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************
	/**
	 * Default constructor used by Attribute File I/O
	 */
	public ConnectionBlock(String identifier) {
		super(identifier);
		declarationKind = ObjectKind.ConnectionBlock;
	}

	@Override
	public void writeObject(AttributeOutputStream oupt) throws IOException {
		Util.TRACE_OUTPUT("BEGIN Write ConnectionBlock: "+identifier);
		oupt.writeKind(declarationKind); // Mark: This is a ConnectionBlock
		oupt.writeString(identifier);
		oupt.writeShort(SEQU);
		
		// *** SyntaxClass
		oupt.writeShort(lineNumber);
		
		// *** Declaration
		//oupt.writeString(identifier);
		oupt.writeString(externalIdent);
		oupt.writeType(type);// Declaration
//		oupt.writeObj(declaredIn);// Declaration
		
		// *** DeclarationScope
		oupt.writeString(sourceFileName);
		oupt.writeString(isPreCompiledFromFile);
		oupt.writeBoolean(hasLocalClasses);
		LabelList.writeLabelList(labelList, oupt);
		DeclarationList decls = prep(declarationList);
		oupt.writeShort(decls.size());
		for(Declaration decl:decls) oupt.writeObj(decl);
		
		// *** ConnectionBlock
		oupt.writeObj(statement);
		oupt.writeString(whenClassIdentifier);
		oupt.writeObj(inspectedVariable);

		Util.TRACE_OUTPUT("END Write ConnectionBlock: "+identifier);
	}

	public static ConnectionBlock readObject(AttributeInputStream inpt) throws IOException {
		String identifier = inpt.readString();
		ConnectionBlock blk = new ConnectionBlock(identifier);
		blk.SEQU = inpt.readSEQU(blk);
		
		// *** SyntaxClass
		blk.lineNumber = inpt.readShort();

		// *** Declaration
		//blk.identifier = inpt.readString();
		blk.externalIdent = inpt.readString();
		blk.type = inpt.readType();
//		blk.declaredIn = (DeclarationScope) inpt.readObj();

		// *** DeclarationScope
		blk.sourceFileName = inpt.readString();
		blk.isPreCompiledFromFile = inpt.readString();
		blk.hasLocalClasses = inpt.readBoolean();
		blk.labelList = LabelList.readLabelList(inpt);
		int n = inpt.readShort();
		for(int i=0;i<n;i++) {
			Declaration decl = (Declaration) inpt.readObj();
			blk.declarationList.add(decl);
		}
		
		// *** ConnectionBlock
		blk.statement = (Statement) inpt.readObj();
		blk.whenClassIdentifier = inpt.readString();
		blk.inspectedVariable = (VariableExpression) inpt.readObj();

		Util.TRACE_INPUT("END Read ConnectionBlock: "+identifier+", Declared in: "+blk.declaredIn);
		Global.setScope(blk.declaredIn);
		return(blk);
	}

//	@Override
//	public void writeAttributes(AttributeOutputStream oupt) throws IOException {
//		super.writeAttributes(oupt);
//		oupt.writeObj(statement);
//		oupt.writeString(whenClassIdentifier);
//		oupt.writeObj(inspectedVariable);
//	}
//
//	@Override
//	public void readAttributes(AttributeInputStream inpt) throws IOException {
//		super.readAttributes(inpt);
//		statement = (Statement) inpt.readObj();
//		whenClassIdentifier = inpt.readString();
//		inspectedVariable = (VariableExpression) inpt.readObj();
//	}


}
