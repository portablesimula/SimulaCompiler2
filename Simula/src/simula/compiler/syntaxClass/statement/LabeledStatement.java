/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass.statement;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.classfile.CodeBuilder;
import java.util.Vector;

import simula.compiler.AttrInput;
import simula.compiler.AttrOutput;
import simula.compiler.GeneratedJavaClass;
import simula.compiler.syntaxClass.declaration.Declaration;
import simula.compiler.syntaxClass.declaration.LabelDeclaration;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.Meaning;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * Labeled Statement.
 * 
 * <pre>
 * 
 * Syntax:
 * 
 *   label-statement =  label : { label : } statement 
 * 
 * 	    label = identifier
 *
 * </pre>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/statement/LabeledStatement.java">
 * <b>Source File</b></a>.
 * 
 * @author Øystein Myhre Andersen
 */
public final class LabeledStatement extends Statement {
	
	/**
	 * The list of labels.
	 */
//	private final Vector<String> labels;
	private Vector<LabelDeclaration> labels;
	
	/**
	 * The statement
	 */
	private Statement statement;

	/**
	 * Create a new LabeledStatement.
	 * @param line the source line number
	 * @param labels the label identifiers
	 * @param statement the labeled statement
	 */
//	LabeledStatement(final int line,final Vector<String> labels,final Statement statement) {
	LabeledStatement(final int line,final Vector<LabelDeclaration> labels,final Statement statement) {
		super(line);
		this.labels = labels;
		this.statement = statement;
		if (Option.TRACE_PARSE) Util.TRACE("Line "+lineNumber+": LabeledStatement: "+this);
	}

	@Override
	public void doChecking() {
		if (IS_SEMANTICS_CHECKED())	return;
		statement.doChecking();
		for (LabelDeclaration decl:labels) {
			decl.doChecking();
		}
		SET_SEMANTICS_CHECKED();
	}

	@Override
	public void doJavaCoding() {
		Global.sourceLineNumber=lineNumber;
		ASSERT_SEMANTICS_CHECKED();
		GeneratedJavaClass.code("{");
		for (LabelDeclaration decl:labels) {
			String comment = "DeclaredIn: "+decl.declaredIn.identifier;
			if(decl.movedTo != null) comment = comment+" -> "+decl.movedTo;
			String labelcode;
			labelcode="_SIM_LABEL("+decl.index+");";
//			System.out.println("LabeledStatement.doJavaCoding: "+labelcode+" USED IN "+Global.currentJavaModule);
			
			if(statement instanceof BlockStatement stat) {
				BlockStatement blockStatement=stat;
				if(blockStatement.isCompoundStatement())
				    blockStatement.addLeadingLabel(labelcode);
				else {
					GeneratedJavaClass.code(labelcode,comment);
				}
			}
			else {
				GeneratedJavaClass.code(labelcode,comment);
			}
		}
		statement.doJavaCoding();
		GeneratedJavaClass.code("}");
	}

	@Override
	public void buildByteCode(CodeBuilder codeBuilder) {
		for (LabelDeclaration lab:labels) {
			String comment = "DeclaredIn: "+lab.declaredIn.identifier;
			if(lab.movedTo != null) comment = comment+" -> "+lab.movedTo;
			String labelcode="_SIM_LABEL("+lab.index+");";
			if(statement instanceof BlockStatement stat) {
				BlockStatement blockStatement=stat;
				if(blockStatement.isCompoundStatement())
				    blockStatement.addLeadingLabel(labelcode);
				else {
//					if(Option.USE_FILE_CLASS_API==2) GeneratedJavaClass.code("_PRE_LABEL()");
//					GeneratedJavaClass.code(labelcode,comment);
				}
				Util.IERR("");
			}
			else {
				// Bind Label
				lab.doBind(codeBuilder);
			}
		}
		statement.buildByteCode(codeBuilder);
//		Util.IERR("");
	}

	@Override
	public void printTree(final int indent) {
		System.out.print(edTreeIndent(indent)+"LABELED_STATEMENT ");
		for (LabelDeclaration lab:labels)
			System.out.print(" "+lab+":");
		System.out.println("");
		statement.printTree(indent+1);
	}

	@Override
	public String toString() {
		return ("" + labels + ':');
	}

	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************
	/**
	 * Default constructor used by Attribute File I/O
	 */
	public LabeledStatement() {
		super(0);
	}

	@Override
	public void writeAttr(AttrOutput oupt) throws IOException {
		Util.TRACE_OUTPUT("writeLabeledStatement: " + this);
		oupt.writeKind(ObjectKind.LabeledStatement);
		oupt.writeInt(lineNumber);
		oupt.writeObj(statement);
		oupt.writeInt(labels.size());
		for(LabelDeclaration lab:labels) lab.writeAttr(oupt);
	}

	public static LabeledStatement readAttr(AttrInput inpt) throws IOException {
		Util.TRACE_INPUT("BEGIN readLabeledStatement: ");
		LabeledStatement stm = new LabeledStatement();
		stm.lineNumber = inpt.readInt();
		stm.statement = (Statement) inpt.readObj();
		int n = inpt.readInt();
		if(n > 0) {
			stm.labels = new Vector<LabelDeclaration>();
			for(int i=0;i<n;i++)
				stm.labels.add(LabelDeclaration.readAttr(inpt));
		}
		Util.TRACE_INPUT("LabeledStatement: " + stm);
		return(stm);
	}

//	// ***********************************************************************************************
//	// *** Externalization
//	// ***********************************************************************************************
//	/**
//	 * Default constructor used by Externalization.
//	 */
//	public LabeledStatement() {
//		super(0);
//	}
//
//	@Override
//	public void writeExternal(ObjectOutput oupt) throws IOException {
//		Util.TRACE_OUTPUT("BEGIN Write "+this.getClass().getSimpleName());
//		if(!Option.NEW_ATTR_FILE)
//			oupt.writeBoolean(CHECKED);
//		oupt.writeInt(lineNumber);
//		oupt.writeObject(labels);
//		oupt.writeObject(statement);
//	}
//	
//	@SuppressWarnings("unchecked")
//	@Override
//	public void readExternal(ObjectInput inpt) throws IOException {
//		Util.TRACE_INPUT("BEGIN Read "+this.getClass().getSimpleName());
//		if(!Option.NEW_ATTR_FILE)
//			CHECKED=inpt.readBoolean();
//		lineNumber = inpt.readInt();
//		labels = (Vector<LabelDeclaration>) inpt.readObject();
//		statement = (Statement) inpt.readObject();
//	}
	

}
