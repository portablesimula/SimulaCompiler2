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
import java.util.Vector;

import simula.compiler.GeneratedJavaClass;
import simula.compiler.syntaxClass.declaration.Declaration;
import simula.compiler.syntaxClass.declaration.LabelDeclaration;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.Meaning;
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
//	public void doChecking() {
//		if (IS_SEMANTICS_CHECKED())	return;
//		statement.doChecking();
//		for (String label:labels) {
//			Meaning meaning = Global.getCurrentScope().findMeaning(label);
//			Declaration decl=meaning.declaredAs;
//			if(!(decl instanceof LabelDeclaration)) {
//				Util.warning("Label "+label+" can be confused with "
//						+decl.getClass().getSimpleName()+" "+decl.identifier+" at line "+decl.lineNumber+')');
//			}
//			decl.doChecking();
//		}
//		SET_SEMANTICS_CHECKED();
//	}

	@Override
	public void doJavaCoding() {
		Global.sourceLineNumber=lineNumber;
		ASSERT_SEMANTICS_CHECKED();
		GeneratedJavaClass.code("{");
		for (LabelDeclaration decl:labels) {
			String comment = "DeclaredIn: "+decl.declaredIn.identifier;
			if(decl.movedTo != null) comment = comment+" -> "+decl.movedTo;
			String labelcode;
			if(Option.USE_FILE_CLASS_API > 0) {
				labelcode="_SIM_LABEL("+decl.index+");";
				System.out.println("LabeledStatement.doJavaCoding: "+labelcode+" USED IN "+Global.currentJavaModule);
			}
			else labelcode="_LABEL("+decl.index+",\""+decl.identifier+"\");";
			if(statement instanceof BlockStatement stat) {
				BlockStatement blockStatement=stat;
				if(blockStatement.isCompoundStatement())
				    blockStatement.addLeadingLabel(labelcode);
				else {
					if(Option.USE_FILE_CLASS_API==2) GeneratedJavaClass.code("_PRE_LABEL()");
					GeneratedJavaClass.code(labelcode,comment);
				}
			}
			else {
				if(Option.USE_FILE_CLASS_API==2) GeneratedJavaClass.code("_PRE_LABEL();");
				GeneratedJavaClass.code(labelcode,comment);
			}
		}
		statement.doJavaCoding();
		GeneratedJavaClass.code("}");
	}
//	public void doJavaCoding() {
//		Global.sourceLineNumber=lineNumber;
//		ASSERT_SEMANTICS_CHECKED();
//		GeneratedJavaClass.code("{");
//		for (String label:labels) {
//			Meaning meaning=Global.getCurrentScope().findLabelMeaning(label);
//			LabelDeclaration decl=(LabelDeclaration)meaning.declaredAs;
//			String labelcode;
//			if(Option.USE_FILE_CLASS_API > 0) {
//				labelcode="_SIM_LABEL("+decl.index+");";
//				System.out.println("LabeledStatement.doJavaCoding: "+labelcode+" USED IN "+Global.currentJavaModule);
//			}
//			else labelcode="_LABEL("+decl.index+",\""+decl.identifier+"\");";
//			if(statement instanceof BlockStatement stat) {
//				BlockStatement blockStatement=stat;
//				if(blockStatement.isCompoundStatement())
//				    blockStatement.addLeadingLabel(labelcode);
//				else {
//					if(Option.USE_FILE_CLASS_API==2) GeneratedJavaClass.code("_PRE_LABEL()");
//					GeneratedJavaClass.code(labelcode);
//				}
//			}
//			else {
//				if(Option.USE_FILE_CLASS_API==2) GeneratedJavaClass.code("_PRE_LABEL();");
//				GeneratedJavaClass.code(labelcode);
//			}
//		}
//		statement.doJavaCoding();
//		GeneratedJavaClass.code("}");
//	}

	@Override
	public void printTree(final int indent) {
		System.out.print(edTreeIndent(indent)+"LABELED_STATEMENT ");
		for (LabelDeclaration lab:labels)
			System.out.print(" "+lab+":");
		System.out.println("");
		statement.printTree(indent+1);
	}
//	public void printTree(final int indent) {
//		System.out.print(edTreeIndent(indent)+"LABELED_STATEMENT ");
//		for(String lab:labels)
//			System.out.print(" "+lab+":");
//		System.out.println("");
//		statement.printTree(indent+1);
//	}

	@Override
	public String toString() {
		return ("" + labels + ':');
	}

	// ***********************************************************************************************
	// *** Externalization
	// ***********************************************************************************************
	/**
	 * Default constructor used by Externalization.
	 */
	public LabeledStatement() {
		super(0);
	}

	@Override
	public void writeExternal(ObjectOutput oupt) throws IOException {
		Util.TRACE_OUTPUT("BEGIN Write "+this.getClass().getSimpleName());
		oupt.writeBoolean(CHECKED);
		oupt.writeInt(lineNumber);
		oupt.writeObject(labels);
		oupt.writeObject(statement);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void readExternal(ObjectInput inpt) throws IOException, ClassNotFoundException {
		Util.TRACE_INPUT("BEGIN Read "+this.getClass().getSimpleName());
		CHECKED=inpt.readBoolean();
		lineNumber = inpt.readInt();
		labels = (Vector<LabelDeclaration>) inpt.readObject();
		statement = (Statement) inpt.readObject();
	}
	

}
