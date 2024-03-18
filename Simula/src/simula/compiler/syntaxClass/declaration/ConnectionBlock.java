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
import java.util.Vector;

import simula.compiler.GeneratedJavaClass;
import simula.compiler.syntaxClass.ProtectedSpecification;
import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.expression.Expression;
import simula.compiler.syntaxClass.expression.TypeConversion;
import simula.compiler.syntaxClass.expression.VariableExpression;
import simula.compiler.syntaxClass.statement.Statement;
import simula.compiler.utilities.DeclarationList;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.Meaning;
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
public final class ConnectionBlock extends DeclarationScope implements Externalizable {
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
	 * The when class identifier
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
		declarationKind = Declaration.Kind.ConnectionBlock;
		this.inspectedVariable = inspectedVariable;
		this.whenClassIdentifier = whenClassIdentifier;
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
		if (Option.TRACE_PARSE)
			Util.TRACE("END ConnectionBlock: " + this.edScopeChain());
		if (!labelList.isEmpty())
			MaybeBlockDeclaration.moveLabelsFrom(this); // Label is also declaration
		Global.setScope(declaredIn);
	}

	/**
	 * Set the Connected ClassDecleration.
	 * 
	 * @param classDeclaration the Connected ClassDecleration.
	 */
	public void setClassDeclaration(final ClassDeclaration classDeclaration) {
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

	@Override
	public void doChecking() {
		if (IS_SEMANTICS_CHECKED())
			return;
		Global.sourceLineNumber = lineNumber;
		// Set External Identifier
		externalIdent = inspectedVariable.identifier + '_' + lineNumber;
		Global.enterScope(this);
		rtBlockLevel = currentRTBlockLevel;
		if (whenClassIdentifier != null) {
			Meaning meaning = findMeaning(whenClassIdentifier);
			whenClassDeclaration = meaning.declaredAs;
		}
		statement.doChecking();
		Global.exitScope();
		SET_SEMANTICS_CHECKED();
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

	// ***********************************************************************************************
	// *** Printing Utility: print
	// ***********************************************************************************************
	@Override
	public void print(final int indent) {
		String spc = edIndent(indent);
		StringBuilder s = new StringBuilder(indent);
		s.append('[').append(sourceBlockLevel).append(':').append(rtBlockLevel).append("] ");
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
//		String spc = edTreeIndent(indent);
//		Util.println(spc+"BEGIN");
		printDeclarationList(indent+1);
		statement.printTree(indent + 1);
	}

	@Override
	public String toString() {
		return ("Inspect(" + inspectedVariable + ") do " + statement);
	}

	// ***********************************************************************************************
	// *** Externalization
	// ***********************************************************************************************

	/**
	 * Create a new ConnectionBlock.
	 */
	public ConnectionBlock() {
		super("");
		this.whenClassIdentifier = "";
		this.inspectedVariable = null;
	}

	@Override
	public void writeExternal(ObjectOutput oupt) throws IOException {
		Util.TRACE_OUTPUT("BEGIN Write "+this.getClass().getSimpleName());
//		super.writeExternal(oupt);

		// SyntaxClass
		oupt.writeBoolean(CHECKED);
		oupt.writeInt(lineNumber);
		
		// Declaration
		oupt.writeObject(type);
		oupt.writeObject(isProtected);
		oupt.writeObject(identifier);
		oupt.writeObject(externalIdent);
//		oupt.writeObject(declaredIn);
//		oupt.writeObject(declarationKind);
//		oupt.writeInt(slot);
		
		// DeclarationScope
		oupt.writeInt(sourceBlockLevel);
		oupt.writeInt(ctBlockLevel);
		oupt.writeInt(rtBlockLevel);
		oupt.writeBoolean(hasLocalClasses);
		oupt.writeObject(declarationList);
		oupt.writeObject(labelList);
		
		// ConnectionBlock
		oupt.writeObject(statement);
		oupt.writeObject(whenClassIdentifier);
		oupt.writeObject(whenClassDeclaration);
		oupt.writeObject(inspectedVariable);
		oupt.writeObject(classDeclaration);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void readExternal(ObjectInput inpt) throws IOException, ClassNotFoundException {
		declarationKind = Declaration.Kind.ConnectionBlock;
		Util.TRACE_INPUT("BEGIN Read "+this.getClass().getSimpleName());
//		super.readExternal(inpt);

		// SyntaxClass
		CHECKED=inpt.readBoolean();
		lineNumber = inpt.readInt();

		// Declaration
		type = (Type) inpt.readObject();
		isProtected = (ProtectedSpecification) inpt.readObject();
		identifier = (String) inpt.readObject();
		externalIdent = (String) inpt.readObject();
//		declaredIn = (DeclarationScope) inpt.readObject();
//		declarationKind = (Kind) inpt.readObject();
//		slot = inpt.readInt();

		// DeclarationScope
		sourceBlockLevel = inpt.readInt();
		ctBlockLevel = inpt.readInt();
		rtBlockLevel = inpt.readInt();
		hasLocalClasses = inpt.readBoolean();
		declarationList = (DeclarationList) inpt.readObject();
		labelList = (Vector<LabelDeclaration>) inpt.readObject();
		
		// ConnectionBlock
		statement = (Statement) inpt.readObject();
		whenClassIdentifier = (String) inpt.readObject();
		whenClassDeclaration = (Declaration) inpt.readObject();
		inspectedVariable = (VariableExpression) inpt.readObject();
		classDeclaration = (ClassDeclaration) inpt.readObject();

	}


}
