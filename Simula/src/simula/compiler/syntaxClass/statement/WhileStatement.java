package simula.compiler.syntaxClass.statement;

import java.io.IOException;
import java.lang.classfile.CodeBuilder;
import java.lang.classfile.Label;

import simula.compiler.AttributeInputStream;
import simula.compiler.AttributeOutputStream;
import simula.compiler.GeneratedJavaClass;
import simula.compiler.parsing.Parse;
import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.expression.Constant;
import simula.compiler.syntaxClass.expression.Expression;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.KeyWord;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * While Statement.
 * 
 * <pre>
 * 
 * Simula Standard: 4.3 While-statement
 * 
 *   while-statement = WHILE Boolean-expression DO Statement
 *
 * </pre>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/statement/WhileStatement.java">
 * <b>Source File</b></a>.
 * 
 * @author SIMULA Standards Group
 * @author Øystein Myhre Andersen
 */
public final class WhileStatement extends Statement {
	/**
	 * The WHILE condition
	 */
	private Expression condition;
	
	/**
	 * The statement after DO
	 */
	private Statement doStatement;

	/**
	 * Create a new WhileStatement.
	 * @param line the source line number
	 */
	WhileStatement(int line) {
		super(line);
		if (Option.internal.TRACE_PARSE)	Util.TRACE("Parse WhileStatement: line="+line+", current=" + Parse.currentToken);
		condition = Expression.expectExpression();
		Parse.expect(KeyWord.DO);
		doStatement = Statement.expectStatement();
		if (Option.internal.TRACE_PARSE)	Util.TRACE("Line "+lineNumber+": WhileStatement: "+this);
	}

	@Override
	public void doChecking() {
		if (IS_SEMANTICS_CHECKED())	return;
		Global.sourceLineNumber=lineNumber;
		condition.doChecking(); condition.backLink=this;
		if (condition.type.keyWord != Type.T_BOOLEAN) Util.error("While condition is not Boolean");
		doStatement.doChecking();
		SET_SEMANTICS_CHECKED();
	}

	@Override
	public void doJavaCoding() {
		Global.sourceLineNumber=lineNumber;
		ASSERT_SEMANTICS_CHECKED();
		GeneratedJavaClass.code("while(" + condition.toJavaCode() + ") {");
		doStatement.doJavaCoding();
		if(isWhileTrueDo())
			GeneratedJavaClass.code("if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate");
		GeneratedJavaClass.code("}");
	}
	
	/**
	 * Check if this while statement is a 'while true do'.
	 * @return true if this while statement is a 'while true do'
	 */
	private boolean isWhileTrueDo() {
		// Check for:  while(true) do {}
		if(condition instanceof Constant cnst) return((boolean)cnst.value);
		else return(false);
	}

	@Override
	public void buildByteCode(CodeBuilder codeBuilder) {
		ASSERT_SEMANTICS_CHECKED();
		Label whlLabel = codeBuilder.newLabel();
		Label endLabel = codeBuilder.newLabel();
		codeBuilder.labelBinding(whlLabel);
		condition.buildEvaluation(null,codeBuilder);
		codeBuilder.ifeq(endLabel);
		doStatement.buildByteCode(codeBuilder);
		codeBuilder.goto_(whlLabel);
		codeBuilder.labelBinding(endLabel);
	}

	@Override
	public void printTree(final int indent) {
		System.out.println(edTreeIndent(indent)+"WHILE " + condition + " DO");
		doStatement.printTree(indent+1);
	}

	@Override
	public String toString() {
		return ("WHILE " + condition + " DO " + doStatement);
	}

	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************
	/**
	 * Default constructor used by Attribute File I/O
	 */
	private WhileStatement() {
		super(0);
	}

	@Override
	public void writeObject(AttributeOutputStream oupt) throws IOException {
		Util.TRACE_OUTPUT("writeWhileStatement: " + this);
		oupt.writeKind(ObjectKind.WhileStatement);
		oupt.writeShort(SEQU);
		// *** SyntaxClass
		oupt.writeShort(lineNumber);
		// *** WhileStatement
		oupt.writeObj(condition);
		oupt.writeObj(doStatement);
	}

	public static WhileStatement readObject(AttributeInputStream inpt) throws IOException {
		WhileStatement stm = new WhileStatement();
		stm.SEQU = inpt.readSEQU(stm);
		// *** SyntaxClass
		stm.lineNumber = inpt.readShort();
		// *** WhileStatement
		stm.condition  = (Expression) inpt.readObj();
		stm.doStatement = (Statement) inpt.readObj();
		Util.TRACE_INPUT("WhileStatement: " + stm);
		return(stm);
	}
	
//	@Override
//	public void writeAttributes(AttributeOutputStream oupt) throws IOException {
//		super.writeAttributes(oupt);
//		oupt.writeObj(condition);
//		oupt.writeObj(doStatement);
//	}
//
//	@Override
//	public void readAttributes(AttributeInputStream inpt) throws IOException {
//		super.readAttributes(inpt);
//		condition  = (Expression) inpt.readObj();
//		doStatement = (Statement) inpt.readObj();
//	}
	
}
