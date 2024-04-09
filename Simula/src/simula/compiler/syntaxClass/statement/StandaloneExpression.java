/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass.statement;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.classfile.CodeBuilder;

import simula.compiler.AttrInput;
import simula.compiler.AttrOutput;
import simula.compiler.GeneratedJavaClass;
import simula.compiler.parsing.Parse;
import simula.compiler.syntaxClass.expression.AssignmentOperation;
import simula.compiler.syntaxClass.expression.Expression;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.KeyWord;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * Standalone Expression Statement.
 * 
 * <pre>
 * 
 * Syntax:
 * 
 *   standalone-expression = expression | assignment-statement
 *
 *      assignment-statement
 *           = expression { assignment-operator expression }
 *
 * </pre>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/statement/StandaloneExpression.java">
 * <b>Source File</b></a>.
 * 
 * @author Øystein Myhre Andersen
 */
public final class StandaloneExpression extends Statement implements Externalizable {
	
	/**
	 * The expression.
	 */
	private Expression expression;

	/**
	 * Create a new StandaloneExpression.
	 * @param line the source line number
	 * @param expression the expression
	 */
	StandaloneExpression(final int line,final Expression expression) {
		super(line);
		this.expression = expression;
		if (Option.TRACE_PARSE) Util.TRACE("Line "+lineNumber+": StandaloneExpression: "+this);
		while (Parse.accept(KeyWord.ASSIGNVALUE,KeyWord.ASSIGNREF)) { 
			this.expression = new AssignmentOperation(this.expression, Parse.prevToken.getKeyWord(),expectStandaloneExpression());
		}		
	}

	/**
	 * Parse a standalone expression.
	 * <pre>
	 * Syntax:
	 * 
	 *    standalone-expression  =  expression  { assignment-operator  expression }
	 * </pre>
	 * Pre-Condition: First expression is already read.
	 * @return the resulting StandaloneExpression
	 */
	private static Expression expectStandaloneExpression() { 
		Expression retExpr=Expression.expectExpression();
		while (Parse.accept(KeyWord.ASSIGNVALUE,KeyWord.ASSIGNREF)) {
			int opr=Parse.prevToken.getKeyWord();
			retExpr=new AssignmentOperation(retExpr,opr,expectStandaloneExpression());
		}
		return retExpr;
	}

	@Override
	public void doChecking() {
		if (IS_SEMANTICS_CHECKED())	return;
		Global.sourceLineNumber=lineNumber;
		if (Option.TRACE_CHECKER) Util.TRACE("StandaloneExpression("+expression+").doChecking - Current Scope Chain: "+Global.getCurrentScope().edScopeChain());
		expression.doChecking();
		if(!expression.maybeStatement()) Util.error("Illegal/Missplaced Expression: "+expression);
		if (Option.TRACE_CHECKER) Util.TRACE("END StandaloneExpression(" + expression+ ").doChecking:");
		SET_SEMANTICS_CHECKED();
	}
	
	@Override
	public void doJavaCoding() {
		Global.sourceLineNumber=lineNumber;
		GeneratedJavaClass.code(toJavaCode() + ';');
	}

	@Override
	public String toJavaCode() {
		ASSERT_SEMANTICS_CHECKED();
		String result=expression.toJavaCode();
		return (result);
	}

	@Override
	public void buildByteCode(CodeBuilder codeBuilder) {
		expression.buildEvaluation(null,codeBuilder);
	}

	@Override
	public void print(final int indent) {
		expression.print(indent);
	}
	
	@Override
	public void printTree(final int indent) {
		expression.printTree(indent);
	}

	@Override
	public String toString() {
		return ("STANDALONE " + expression);
	}

	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************
	/**
	 * Default constructor used by Externalization.
	 */
	private StandaloneExpression() {
		super(0);
	}

	@Override
	public void writeAttr(AttrOutput oupt) throws IOException {
		Util.TRACE_OUTPUT("writeStandaloneExpression: " + this);
		oupt.writeKind(ObjectKind.StandaloneExpression);
		oupt.writeInt(lineNumber);
		oupt.writeObj(expression);
	}

	public static StandaloneExpression readAttr(AttrInput inpt) throws IOException {
		Util.TRACE_INPUT("BEGIN readStandaloneExpression: ");
		StandaloneExpression stm = new StandaloneExpression();
		stm.lineNumber = inpt.readInt();
		stm.expression = (Expression) inpt.readObj();
		Util.TRACE_INPUT("StandaloneExpression: " + stm);
		return(stm);
	}

//	// ***********************************************************************************************
//	// *** Externalization
//	// ***********************************************************************************************
//
//	@Override
//	public void writeExternal(ObjectOutput oupt) throws IOException {
//		Util.TRACE_OUTPUT("BEGIN Write "+this.getClass().getSimpleName()+": "+this);
//		if(!Option.NEW_ATTR_FILE)
//			oupt.writeBoolean(CHECKED);
//		oupt.writeInt(lineNumber);
//		oupt.writeObject(expression);
//	}
//	
//	@Override
//	public void readExternal(ObjectInput inpt) throws IOException {
//		Util.TRACE_INPUT("BEGIN Read "+this.getClass().getSimpleName());
//		if(!Option.NEW_ATTR_FILE)
//			CHECKED=inpt.readBoolean();
//		lineNumber = inpt.readInt();
//		expression = (Expression) inpt.readObject();
//	}
	

}
