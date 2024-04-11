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

import simula.compiler.AttributeInputStream;
import simula.compiler.AttributeOutputStream;
import simula.compiler.syntaxClass.SyntaxClass;
import simula.compiler.syntaxClass.Type;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.KeyWord;
import simula.compiler.utilities.ObjectKind;
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
public final class UnaryOperation extends Expression {
	
	/**
	 * The unary operator.
	 */
	int oprator;
	
	/**
	 * The operand Expression.
	 */
	Expression operand;

	/**
	 * Create a new UnaryOperation.
	 * @param oprator the unary operator.
	 * @param operand the operand Expression
	 */
	private UnaryOperation(final int oprator,final Expression operand) {
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
	static Expression create(final int oprator,final Expression operand) {
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
		return ("(" + KeyWord.toJavaCode(oprator) + "(" + operand.toJavaCode() + "))");
	}

	@Override
	public String toString() {
		return ("(UNARY:" + oprator + ' ' + operand + ")");
	}

	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************
	/**
	 * Default constructor used by Attribute File I/O
	 */
	private UnaryOperation() {}

	@Override
	public void writeObject(AttributeOutputStream oupt) throws IOException {
		Util.TRACE_OUTPUT("writeUnaryOperation: " + this);
		oupt.writeKind(ObjectKind.UnaryOperation);
		oupt.writeInt(SEQU);
		oupt.writeInt(lineNumber);
		oupt.writeType(type);
		oupt.writeObj(backLink);
		oupt.writeInt(oprator);
		oupt.writeObj(operand);
	}
	
	public static UnaryOperation readObject(AttributeInputStream inpt) throws IOException {
		Util.TRACE_INPUT("BEGIN readUnaryOperation: ");
		UnaryOperation expr = new UnaryOperation();
		expr.SEQU = inpt.readInt();
		expr.lineNumber = inpt.readInt();
		expr.type = inpt.readType();
		expr.backLink = (SyntaxClass) inpt.readObj();
		expr.oprator = inpt.readInt();
		expr.operand = (Expression) inpt.readObj();
		Util.TRACE_INPUT("readUnaryOperation: " + expr);
		return(expr);
	}

//	// ***********************************************************************************************
//	// *** Externalization
//	// ***********************************************************************************************
//	/**
//	 * Default constructor used by Externalization.
//	 */
//
//	@Override
//	public void writeExternal(ObjectOutput oupt) throws IOException {
//		Util.TRACE_OUTPUT("BEGIN Write "+this.getClass().getSimpleName());
//		if(!Option.NEW_ATTR_FILE)
//			oupt.writeBoolean(CHECKED);
//		oupt.writeInt(lineNumber);
//		oupt.writeType(type);
//		oupt.writeObject(backLink);
//		oupt.writeInt(oprator);
//		oupt.writeObject(operand);
//	}
//	
//	@Override
//	public void readExternal(ObjectInput inpt) throws IOException {
//		Util.TRACE_INPUT("BEGIN Read "+this.getClass().getSimpleName());
//		if(!Option.NEW_ATTR_FILE)
//			CHECKED=inpt.readBoolean();
//		lineNumber = inpt.readInt();
//		type = inpt.readType();
//		backLink = (SyntaxClass) inpt.readObject();
//		oprator = inpt.readInt();
//		operand = (Expression) inpt.readObject();
//	}
	

}
