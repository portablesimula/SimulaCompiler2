/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass.expression;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.classfile.CodeBuilder;
import java.lang.classfile.Label;

import simula.compiler.syntaxClass.SyntaxClass;
import simula.compiler.syntaxClass.Type;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.KeyWord;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * Unary Operation.
 * 
 * <pre>
 * 
 * Syntax:
 * 
 *   unary-operation =  unary-operator  Expression
 *   
 *      unary-operator = NOT | + | -
 * </pre>
 * Link to GitHub: <a href="https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/expression/UnaryOperation.java">
 * <b>Source File</b></a>.
 * 
 * @author Øystein Myhre Andersen
 */
final class UnaryOperation extends Expression {
	
	/**
	 * The unary operator.
	 */
	KeyWord oprator;
	
	/**
	 * The operand Expression.
	 */
	Expression operand;

	/**
	 * Create a new UnaryOperation.
	 * @param oprator the unary operator.
	 * @param operand the operand Expression
	 */
	private UnaryOperation(final KeyWord oprator,final Expression operand) {
		this.oprator = oprator;
		this.operand = operand;
		if(this.operand==null)
		{ Util.error("Missing operand after unary "+oprator);
		  this.operand=new VariableExpression("UNKNOWN_");
		}
		this.operand.backLink=this;
	}

	/**
	 * Create a new UnaryOperation.
	 * @param oprator the unary operator.
	 * @param operand the operand Expression
	 * @return the newly created UnaryOperation
	 */
	static Expression create(final KeyWord oprator,final Expression operand) {
		if (oprator == KeyWord.PLUS || oprator == KeyWord.MINUS) {
			try { // Try to Compile-time Evaluate this expression
				Number rhn=operand.getNumber();
				if(rhn!=null) {
					return(Constant.evaluate(oprator,rhn));
				}  
			} catch(Exception e) {}
		}
		return(new UnaryOperation(oprator,operand));
	}
	
	@Override
	public Expression evaluate() {
		// Try to Compile-time Evaluate this expression
		if (oprator == KeyWord.PLUS || oprator == KeyWord.MINUS) {
			//System.out.println("UnaryOperation.evaluate: "+oprator+", operand="+operand);
			Number rhn=operand.getNumber();
			if(rhn!=null) {
				return(Constant.evaluate(oprator,rhn));
			}  
		}
		return(this);
	}

	@Override
	public void doChecking() {
		if (IS_SEMANTICS_CHECKED())	return;
		Global.sourceLineNumber=lineNumber;
		if (Option.TRACE_CHECKER)
			Util.TRACE("BEGIN UnaryOperation" + toString() + ".doChecking - Current Scope Chain: " + Global.getCurrentScope().edScopeChain());
		operand.doChecking();
		if (oprator == KeyWord.NOT)
			this.type=Type.Boolean;
		else if (oprator == KeyWord.PLUS || oprator == KeyWord.MINUS) {
			this.type=operand.type;
		}
		SET_SEMANTICS_CHECKED();
	}

	// Returns true if this expression may be used as a statement.
	@Override
	public boolean maybeStatement() {
		ASSERT_SEMANTICS_CHECKED();
		return (false);
	}

	@Override
	public void buildEvaluation(Expression rightPart,CodeBuilder codeBuilder) {
		ASSERT_SEMANTICS_CHECKED();
		operand.buildEvaluation(null,codeBuilder);
		if (oprator == KeyWord.PLUS) ; // NOTHING
		else if (oprator == KeyWord.NOT) {
			buildNOT(codeBuilder);
		} else if (oprator == KeyWord.MINUS) {
			if(type.equals(Type.Integer)) codeBuilder.ineg();
			else if(type.equals(Type.Real)) codeBuilder.fneg();
			else if(type.equals(Type.LongReal)) codeBuilder.dneg();
			else Util.IERR("IMPOSSIBLE");
		}
	}

	public static void buildNOT(CodeBuilder codeBuilder) {
		//    ifne  L1
		//    iconst_1
		//    goto  L2
		//L1: iconst_0
		//L2:
		Label L1 = codeBuilder.newLabel();
		Label L2 = codeBuilder.newLabel();
		codeBuilder
			.ifne(L1)
			.iconst_1()
			.goto_(L2)
			.labelBinding(L1)
			.iconst_0()
			.labelBinding(L2);
	}

	@Override
	public String toJavaCode() {
		ASSERT_SEMANTICS_CHECKED();
		return ("(" + oprator.toJavaCode() + "(" + operand.toJavaCode() + "))");
	}

	@Override
	public String toString() {
		return ("(UNARY:" + oprator + ' ' + operand + ")");
	}

	// ***********************************************************************************************
	// *** Externalization
	// ***********************************************************************************************
	/**
	 * Default constructor used by Externalization.
	 */
	public UnaryOperation() {
	}

	@Override
	public void writeExternal(ObjectOutput oupt) throws IOException {
		Util.TRACE_OUTPUT("BEGIN Write "+this.getClass().getSimpleName());
		if(!Option.NEW_ATTR_FILE)
			oupt.writeBoolean(CHECKED);
		oupt.writeInt(lineNumber);
		Type.outType(type,oupt);
		oupt.writeObject(backLink);
		oupt.writeObject(oprator);
		oupt.writeObject(operand);
	}
	
	@Override
	public void readExternal(ObjectInput inpt) throws IOException, ClassNotFoundException {
		Util.TRACE_INPUT("BEGIN Read "+this.getClass().getSimpleName());
		if(!Option.NEW_ATTR_FILE)
			CHECKED=inpt.readBoolean();
		lineNumber = inpt.readInt();
		type = Type.inType(inpt);
		backLink = (SyntaxClass) inpt.readObject();
		oprator = (KeyWord) inpt.readObject();
		operand = (Expression) inpt.readObject();
	}
	

}
