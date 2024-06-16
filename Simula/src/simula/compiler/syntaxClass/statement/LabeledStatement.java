/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass.statement;

import java.io.IOException;
import java.lang.classfile.CodeBuilder;
import java.util.Vector;

import simula.compiler.AttributeInputStream;
import simula.compiler.AttributeOutputStream;
import simula.compiler.GeneratedJavaClass;
import simula.compiler.syntaxClass.declaration.LabelDeclaration;
import simula.compiler.utilities.Global;
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
	LabeledStatement(final int line,final Vector<LabelDeclaration> labels,final Statement statement) {
		super(line);
		this.labels = labels;
		this.statement = statement;
		if (Option.internal.TRACE_PARSE) Util.TRACE("Line "+lineNumber+": LabeledStatement: "+this);
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
			if(statement instanceof BlockStatement stat && stat.isCompoundStatement())
				     stat.addLeadingLabel(labelcode);
				else GeneratedJavaClass.code(labelcode,comment);
		}
		statement.doJavaCoding();
		GeneratedJavaClass.code("}");
	}

	@Override
	public void buildByteCode(CodeBuilder codeBuilder) {
		Global.sourceLineNumber=lineNumber;
		ASSERT_SEMANTICS_CHECKED();
		for (LabelDeclaration lab:labels)
			lab.doBind(codeBuilder); // Bind Label
		statement.buildByteCode(codeBuilder);
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
	private LabeledStatement() {
		super(0);
	}

	@Override
	public void writeObject(AttributeOutputStream oupt) throws IOException {
		Util.TRACE_OUTPUT("writeLabeledStatement: " + this);
		oupt.writeKind(ObjectKind.LabeledStatement);
		oupt.writeShort(SEQU);
//		oupt.writeShort(lineNumber);
//		oupt.writeObj(statement);
//		oupt.writeShort(labels.size());
//		for(LabelDeclaration lab:labels) oupt.writeObj(lab);
		writeAttributes(oupt);
	}

	public static LabeledStatement readObject(AttributeInputStream inpt) throws IOException {
		Util.TRACE_INPUT("BEGIN readLabeledStatement: ");
		LabeledStatement stm = new LabeledStatement();
		stm.SEQU = inpt.readSEQU(stm);
//		stm.lineNumber = inpt.readShort();
//		stm.statement = (Statement) inpt.readObj();
//		int n = inpt.readShort();
//		if(n > 0) {
//			stm.labels = new Vector<LabelDeclaration>();
//			for(int i=0;i<n;i++)
//				stm.labels.add((LabelDeclaration) inpt.readObj());
//		}
		stm.readAttributes(inpt);
		Util.TRACE_INPUT("LabeledStatement: " + stm);
		return(stm);
	}
	
	@Override
	public void writeAttributes(AttributeOutputStream oupt) throws IOException {
		super.writeAttributes(oupt);
		oupt.writeObj(statement);
		oupt.writeShort(labels.size());
		for(LabelDeclaration lab:labels) oupt.writeObj(lab);
	}

	@Override
	public void readAttributes(AttributeInputStream inpt) throws IOException {
		super.readAttributes(inpt);
		statement = (Statement) inpt.readObj();
		int n = inpt.readShort();
		if(n > 0) {
			labels = new Vector<LabelDeclaration>();
			for(int i=0;i<n;i++)
				labels.add((LabelDeclaration) inpt.readObj());
		}
	}

}
