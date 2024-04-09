/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.classfile.CodeBuilder;

import simula.compiler.AttrInput;
import simula.compiler.AttrOutput;
import simula.compiler.GeneratedJavaClass;
import simula.compiler.syntaxClass.declaration.ArrayDeclaration;
import simula.compiler.syntaxClass.declaration.ClassDeclaration;
import simula.compiler.syntaxClass.declaration.ConnectionBlock;
import simula.compiler.syntaxClass.declaration.Declaration;
import simula.compiler.syntaxClass.declaration.LabelDeclaration;
import simula.compiler.syntaxClass.declaration.PrefixedBlockDeclaration;
import simula.compiler.syntaxClass.declaration.ProcedureDeclaration;
import simula.compiler.syntaxClass.declaration.SimpleVariableDeclaration;
import simula.compiler.syntaxClass.declaration.StandardClass;
import simula.compiler.syntaxClass.expression.ArithmeticExpression;
import simula.compiler.syntaxClass.expression.AssignmentOperation;
import simula.compiler.syntaxClass.expression.BooleanExpression;
import simula.compiler.syntaxClass.expression.ConditionalExpression;
import simula.compiler.syntaxClass.expression.Constant;
import simula.compiler.syntaxClass.expression.LocalObject;
import simula.compiler.syntaxClass.expression.ObjectGenerator;
import simula.compiler.syntaxClass.expression.ObjectRelation;
import simula.compiler.syntaxClass.expression.QualifiedObject;
import simula.compiler.syntaxClass.expression.RelationalOperation;
import simula.compiler.syntaxClass.expression.RemoteVariable;
import simula.compiler.syntaxClass.expression.TextExpression;
import simula.compiler.syntaxClass.expression.TypeConversion;
import simula.compiler.syntaxClass.expression.UnaryOperation;
import simula.compiler.syntaxClass.expression.VariableExpression;
import simula.compiler.syntaxClass.statement.ActivationStatement;
import simula.compiler.syntaxClass.statement.BlockStatement;
import simula.compiler.syntaxClass.statement.ConditionalStatement;
import simula.compiler.syntaxClass.statement.ConnectionStatement;
import simula.compiler.syntaxClass.statement.DummyStatement;
import simula.compiler.syntaxClass.statement.ForStatement;
import simula.compiler.syntaxClass.statement.GotoStatement;
import simula.compiler.syntaxClass.statement.InlineStatement;
import simula.compiler.syntaxClass.statement.InnerStatement;
import simula.compiler.syntaxClass.statement.LabeledStatement;
import simula.compiler.syntaxClass.statement.ProgramModule;
import simula.compiler.syntaxClass.statement.StandaloneExpression;
import simula.compiler.syntaxClass.statement.SwitchStatement;
import simula.compiler.syntaxClass.statement.WhileStatement;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * The class SyntaxClass.
 * <p>
 * The Simula syntax is formally defined in the Simula Standard.
 * Some non-terminal symbols give rise to a Java class with almost the same name.
 * They are all subclasses of the class SyntaxClass.
 * The subclass hierarchy of the Syntax class is described below
 * 
 * <pre>
 *            SyntaxClass
 *               HiddenSpecification 
 *               ProtectedSpecification 
 *               Type 
 *                  OverLoad
 *               Declaration
 *                  ArrayDeclaration 
 *                  DeclarationScope
 *                     BlockDeclaration
 *                        ClassDeclaration 
 *                           PrefixedBlockDeclaration
 *                           StandardClass
 *                        MaybeBlockDeclaration
 *                        ProcedureDeclaration 
 *                           StandardProcedure
 *                           SwitchDeclaration
 *                     ConnectionBlock 
 *                  ExternalDeclaration
 *                  Parameter 
 *                  SimpleVariableDeclaration 
 *                     LabelDeclaration 
 *                  VirtualMatch 
 *                  VirtualSpecification 
 *               Statement
 *                  ActivationStatement
 *                  BlockStatement
 *                  ConditionalStatement
 *                  ConnectionStatement
 *                  DummyStatement
 *                  ForStatement
 *                  GotoStatement
 *                  InnerStatement
 *                  LabeledStatement
 *                  ProgramModule
 *                  StandaloneExpression
 *                  SwitchStatement
 *                  WhileStatement
 *               Expression
 *                  ArithmeticExpression
 *                  AssignmentOperation
 *                  BooleanExpression
 *                  ConditionalExpression
 *                  Constant 
 *                  LocalObject
 *                  ObjectGenerator
 *                  ObjectRelation
 *                  QualifiedObject
 *                  RelationalOperation
 *                  RemoteVariable
 *                  TextExpression
 *                  TypeConversion
 *                  UnaryOperation
 *                  VariableExpression          
 * </pre>
 * 
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/SyntaxClass.java"><b>Source
 * File</b></a>.
 * 
 * @author Øystein Myhre Andersen
 */

public abstract class SyntaxClass implements Externalizable {
	/**
	 * Controls semantic checking.
	 * <p>
	 * Set true when the method doChecking() has been completed.
	 */
	protected boolean CHECKED = false;

	/**
	 * Object sequence number used by Attribute File I/O
	 * to fixup object references.
	 * <p>
	 * During Attribute File Input it is index to the Object Reference Table.
	 * See: Global.
	 */
	public int SEQU;
	
	/**
	 * The source line number
	 */
	public int lineNumber;

	/**
	 * Create a new SyntaxClass.
	 */
	protected SyntaxClass() {
		lineNumber = Global.sourceLineNumber;
	}

	/**
	 * Perform semantic checking.
	 * <p>
	 * This must be redefined in every subclass.
	 */
	public void doChecking() {
		if (IS_SEMANTICS_CHECKED())
			return;
		Global.sourceLineNumber = lineNumber;
		String name = this.getClass().getSimpleName();
		Util.IERR("*** NOT IMPLEMENTED: " + "" + name + ".doChecking");
	}

	/**
	 * Set semantic checked.
	 * <p>
	 * Should be called from all doChecking methods to signal that semantic
	 * checking is done.
	 */
	protected void SET_SEMANTICS_CHECKED() {
		CHECKED = true;
	}

	/**
	 * Returns true if semantic checking is done.
	 * 
	 * @return true if semantic checking is done
	 */
	protected boolean IS_SEMANTICS_CHECKED() {
		return (CHECKED);
	}

	/**
	 * Assert that semantic checking done.
	 */
	protected void ASSERT_SEMANTICS_CHECKED() {
		if (!CHECKED)
			Util.error("FATAL error - Semantic checker not called: " + this.getClass().getName() + ", " + this);
		if (this instanceof Declaration decl) {
			if (decl.externalIdent == null)
				Util.error("External Identifier is not set");
		}
	}

	/**
	 * Output possible declaration code.
	 */
	public void doDeclarationCoding() {
	}

	/**
	 * Output Java code.
	 */
	public void doJavaCoding() {
		Global.sourceLineNumber = lineNumber;
		GeneratedJavaClass.code(toJavaCode());
	}

	/**
	 * Generate Java code for this Syntax Class.
	 * 
	 * @return Java code
	 */
	public String toJavaCode() {
		return (toString());
	}

	/**
	 * Build Java ByteCode.
	 */
	public void buildByteCode(CodeBuilder codeBuilder) {
		Util.IERR("Method buildByteCode need a redefinition in "+this.getClass().getSimpleName()
				+"\n\n            MAYBE: Use buildEvaluation(boolean destination,CodeBuilder codeBuilder)\n");
	}

	/**
	 * Utility print method.
	 * 
	 * @param indent number of spaces leading the line
	 */
	public void print(final int indent) {
		Util.println(edIndent(indent) + this);
	}

	/**
	 * Utility print syntax tree method.
	 * 
	 * @param indent number of spaces leading the lines
	 */
	public void printTree(final int indent) {
		Util.IERR("Method printTree need a redefinition in "+this.getClass().getSimpleName());
	}

	/**
	 * Utility: Returns a number of blanks followed by qualification of this
	 * 
	 * @param indent the number of blanks requested
	 * @return the resulting string
	 */
	protected String edTreeIndent(final int indent) {
		int i = indent;
		String s = "";
		while ((i--) > 0)
			s = s + "    ";
		return (s+this.getClass().getSimpleName()+"    ");
	}

	/**
	 * Utility: Returns a number of blanks.
	 * 
	 * @param indent the number of blanks requested
	 * @return a number of blanks.
	 */
	public static String edIndent(final int indent) {
		int i = indent;
		String s = "";
		while ((i--) > 0)
			s = s + "    ";
		return (s);
	}

	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************

	
	public void writeAttr(AttrOutput oupt) throws IOException {
		Util.IERR("Method 'writeAttr' needs a redefinition in "+this.getClass().getSimpleName());
	}

	public static SyntaxClass readAttr(AttrInput inpt) throws IOException {
		Util.IERR("Method 'readAttr' needs a redefiniton");
		return(null);
	}

	
	// ***********************************************************************************************
	// *** Externalization
	// ***********************************************************************************************

	@Override
	public void writeExternal(ObjectOutput oupt) throws IOException {
		Util.TRACE_OUTPUT("BEGIN Write "+this.getClass().getSimpleName());
		if(!Option.NEW_ATTR_FILE)
			oupt.writeBoolean(CHECKED);
		oupt.writeInt(lineNumber);
	}
	
	@Override
	public void readExternal(ObjectInput inpt) throws IOException {
		Util.TRACE_INPUT("BEGIN Read "+this.getClass().getSimpleName());
		if(!Option.NEW_ATTR_FILE)
			CHECKED=inpt.readBoolean();
		lineNumber = inpt.readInt();
	}
	

}
