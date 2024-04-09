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
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import java.lang.constant.MethodTypeDesc;

import simula.compiler.GeneratedJavaClass;
import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.declaration.BlockDeclaration;
import simula.compiler.syntaxClass.declaration.LabelDeclaration;
import simula.compiler.syntaxClass.declaration.Parameter;
import simula.compiler.syntaxClass.declaration.SwitchDeclaration;
import simula.compiler.syntaxClass.declaration.VirtualSpecification;
import simula.compiler.syntaxClass.expression.Expression;
import simula.compiler.syntaxClass.expression.VariableExpression;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.Meaning;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * Goto Statement.
 * 
 * <pre>
 * 
 * Simula Standard: 4.5 Goto-statement
 * 
 *  goto-statement = GOTO designational-expression
 *                 | GO TO designational-expression
 *
 * </pre>
 * Java does not support labels like Simula. The Java Virtual Machine (JVM), however, has labels.
 * A JVM-label is simply a relative byte-address within the byte-code of a method. We will use Java's
 * exception handling together with byte code engineering to re-introduce goto in the Java Language.
 * This is done by generating Java-code which is prepared for Byte Code Engineering.
 * <p>
 * See <a href="https://portablesimula.github.io/github.io/doc/SimulaRTS.pdf">Mapping Simula to Java (runtime design)</a> 
 * Sect. 6.1 Goto Statement
 * <p>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/statement/GotoStatement.java">
 * <b>Source File</b></a>.
 * 
 * @author SIMULA Standards Group
 * @author Øystein Myhre Andersen
 */
public final class GotoStatement extends Statement {
	/**
	 * The target label.
	 */
	private Expression label;

	/**
	 * Create a new GotoStatement.
	 * @param line source line
	 */
	GotoStatement(final int line) {
		super(line);
		label = Expression.expectExpression();
		if (Option.TRACE_PARSE) Util.TRACE("Line "+this.lineNumber+": GotoStatement: "+this);
	}

	@Override
	public void doChecking() {
		if (IS_SEMANTICS_CHECKED())	return;
		label.doChecking();
		if (!label.type.equals(Type.Label))
			Util.error("Goto " + label + ", " + label + " is not a Label");
		label.backLink = this; // To ensure _RESULT from functions
		SET_SEMANTICS_CHECKED();
	}

	@Override
	public void doJavaCoding() {
		Global.sourceLineNumber = lineNumber;
		ASSERT_SEMANTICS_CHECKED();
  		Type type = label.type;
		Util.ASSERT(type.equals(Type.Label), "Invariant");
		GeneratedJavaClass.code("_GOTO(" + label.toJavaCode() + ");","GOTO EVALUATED LABEL");
	}
	
	@Override
	public void buildByteCode(CodeBuilder codeBuilder) {
//		public void _GOTO(final RTS_LABEL q) {
//			if (RTS_COMMON.Option.GOTO_TRACING)
//				RTS_COMMON.TRACE("_RTObject.GOTO: " + q);
//			throw (q);
//		}
//        32: aload_0
//        33: aload_0
//        34: getfield      #14                 // Field _LABEL_L1:Lsimula/runtime/RTS_RTObject$RTS_LABEL;
//        37: invokevirtual #53                 // Method _GOTO:(Lsimula/runtime/RTS_RTObject$RTS_LABEL;)V
//		ClassDesc CD_Lab=CD.RTS_LABEL;
//		ConstantPoolBuilder pool=codeBuilder.constantPool();
//		FieldRefEntry FRE_Arr=pool.fieldRefEntry(BlockDeclaration.currentClassDesc(), arrayIdent, CD_Lab);
		
//		Util.buildSNAPSHOT(codeBuilder,"GOTO "+label); // TODO: SNAPSHOT
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		
//		System.out.println("GotoStatement.buildByteCode: "+label.getClass().getSimpleName()+"  "+label);
		if(label instanceof VariableExpression var) {
			Meaning meaning = var.meaning;
//			System.out.println("GotoStatement.buildByteCode: "+meaning.declaredAs.getClass().getSimpleName()+"  "+meaning.declaredAs);
//			System.out.println("GotoStatement.buildByteCode: currentClassDesc="+BlockDeclaration.currentClassDesc());
//			System.out.println("GotoStatement.buildByteCode: label="+label.getClass().getSimpleName()+"  "+label);
			if(meaning.declaredAs instanceof LabelDeclaration lab) {
//				lab.buildLabelQuant(codeBuilder);
					codeBuilder.aload(0);
				label.buildEvaluation(null,codeBuilder);
				codeBuilder.invokevirtual(pool.methodRefEntry(BlockDeclaration.currentClassDesc(),
						"_GOTO", MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_RTObject$RTS_LABEL;)V")));
			} else if(meaning.declaredAs instanceof Parameter par) {
//				System.out.println("GotoStatement.buildByteCode: par.kind="+par.kind);
				if(par.kind != Parameter.Kind.Procedure)
					codeBuilder.aload(0);
				label.buildEvaluation(null,codeBuilder);
				codeBuilder.invokevirtual(pool.methodRefEntry(BlockDeclaration.currentClassDesc(),
						"_GOTO", MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_RTObject$RTS_LABEL;)V")));
			} else if(meaning.declaredAs instanceof SwitchDeclaration swtch) {
//				swtch.buildByteCode(codeBuilder);
				codeBuilder.aload(0);
				label.buildEvaluation(null,codeBuilder);
				codeBuilder.invokevirtual(pool.methodRefEntry(BlockDeclaration.currentClassDesc(),
						"_GOTO", MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_RTObject$RTS_LABEL;)V")));
			} else if(meaning.declaredAs instanceof VirtualSpecification virt) {
				codeBuilder.aload(0);
				label.buildEvaluation(null,codeBuilder);
				codeBuilder.invokevirtual(pool.methodRefEntry(BlockDeclaration.currentClassDesc(),
						"_GOTO", MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_RTObject$RTS_LABEL;)V")));
//				Util.IERR(null);
			} else Util.IERR(""+meaning.declaredAs.getClass().getSimpleName()+"  "+label);
		} else Util.IERR("");
	}

	@Override
	public void printTree(final int indent) {
		System.out.println(edTreeIndent(indent)+"GOTO "+label);
		label.printTree(indent+1);
	}

	@Override
	public String toString() {
		return ("GOTO " + label);
	}

	// ***********************************************************************************************
	// *** Externalization
	// ***********************************************************************************************
	/**
	 * Default constructor used by Externalization.
	 */
	public GotoStatement() {
		super(0);
	}

	@Override
	public void writeExternal(ObjectOutput oupt) throws IOException {
		Util.TRACE_OUTPUT("BEGIN Write "+this.getClass().getSimpleName());
		if(!Option.NEW_ATTR_FILE)
			oupt.writeBoolean(CHECKED);
		oupt.writeInt(lineNumber);
		oupt.writeObject(label);
	}
	
	@Override
	public void readExternal(ObjectInput inpt) throws IOException {
		Util.TRACE_INPUT("BEGIN Read "+this.getClass().getSimpleName());
		if(!Option.NEW_ATTR_FILE)
			CHECKED=inpt.readBoolean();
		lineNumber = inpt.readInt();
		label = (Expression) inpt.readObject();
	}
	

}
