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
import java.lang.constant.MethodTypeDesc;

import simula.compiler.AttributeInputStream;
import simula.compiler.AttributeOutputStream;
import simula.compiler.syntaxClass.SyntaxClass;
import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.declaration.BlockDeclaration;
import simula.compiler.utilities.CD;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.KeyWord;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * Arithmetic expressions
 * 
 * <pre>
 * Simula Standard:  3.5 Arithmetic expressions

 *    arithmetic-expression
 *        =  simple-arithmetic-expression
 *        |  if-clause  simple-arithmetic-expression
 *           else  arithmetic-expression
 *
 *    simple-arithmetic-expression
 *        =  [ + | - ]  term  {  ( + | - )  term }
 *
 *    term
 *        =  factor  {  ( * | / | // )  factor }
 *
 *    factor
 *        =  primary  { **  primary }
 *
 *    primary
 *        =  unsigned-number
 *        |  variable
 *        |  function-designator
 *        |  "("  arithmetic-expression  ")"
 * </pre>
 * 
 * An arithmetic expression is a rule for computing a numerical value. In the
 * case of simple arithmetic expressions this value is obtained by executing the
 * indicated arithmetic operations on the actual numerical values of the
 * primaries of the expression, as explained in detail in 3.5.1 below. The value
 * of a primary is obvious in the case of numbers. For variables it is the
 * current value (assigned last in the dynamic sense), and for function
 * designators it is the value arising from the computing rules defining the
 * procedure when applied to the current values of the procedure parameters
 * given in the expression. Finally, for arithmetic expressions enclosed by
 * parentheses the value must through a recursive analysis be expressed in terms
 * of the values of primaries of the other three kinds.
 * <p>
 * In the more general arithmetic expressions, which include if-clauses, one out
 * of several simple arithmetic expressions is selected on the basis of the
 * actual values of the Boolean expressions (see 3.2). This selection is made as
 * follows: The Boolean expressions of the if-clauses are evaluated one by one
 * in sequence from left to right until one having the value true is found. The
 * value of the arithmetic expression is then the value of the first arithmetic
 * expression following this Boolean (the longest arithmetic expression found in
 * this position is understood). If none of the Boolean expressions has the
 * value true, then the value of the arithmetic expression is the value of the
 * expression following the final else.
 * <p>
 * In evaluating an arithmetic expression, all primaries within that expression
 * are evaluated with the following exceptions:
 * <pre>
 *  - Primaries that occur within any expression governed by an if-clause but not selected by it.
 * 
 *  - Primaries that occur within a Boolean expression
 *    1) after the operator or else when the evaluation of a preceding Boolean tertiary results in false, or
 *    2) after the operator and then when the evaluation of a preceding equivalence results in false.
 *  
 *  - Primaries that occur after a function designator, and the evaluation of
 *    the function terminates with a goto-statement. In this case the evaluation of
 *    the arithmetic expression is abandoned.
 * </pre>   
 * Primaries are always evaluated in strict lexical order.
 * 
 * NOTE: The implementation of EXP '**' deviates from the definition in Simula Standard.
 *   It is always evaluated in long real and the result is converted to the appropriate type. 
 * <p>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/expression/ArithmeticExpression.java">
 * <b>Source File</b></a>.
 * 
 * @author Simula Standard
 * @author Øystein Myhre Andersen
 */
public final class ArithmeticExpression extends Expression {

	/**
	 * The left hand side
	 */
	private Expression lhs;

	/**
	 * The arithmetic operation
	 */
	private int opr;

	/**
	 * The right hand side
	 */
	private Expression rhs;

	/**
	 * Create a new ArithmeticExpression
	 * 
	 * @param lhs left hand side
	 * @param opr arithmetic operation
	 * @param rhs right hand side
	 */
	private ArithmeticExpression(final Expression lhs, final int opr, final Expression rhs) {
		this.opr = opr;
		if (lhs == null) {
			Util.error("Missing operand before " + opr);
			this.lhs = new VariableExpression("UNKNOWN_");
		} else
			this.lhs = lhs;
		if (rhs == null) {
			Util.error("Missing operand after " + opr);
			this.rhs = new VariableExpression("UNKNOWN_");
		} else
			this.rhs = rhs;
		this.lhs.backLink = this.rhs.backLink = this;
	}

	/**
	 * Create a new ArithmeticExpression.
	 * 
	 * @param lhs the left hand side
	 * @param opr the arithmetic operation
	 * @param rhs the right hand side
	 * @return the newly created ArithmeticExpression
	 */
	static Expression create(final Expression lhs, final int opr, final Expression rhs) {
		try { // Try to Compile-time Evaluate this expression
			Number lhn = lhs.getNumber();
			if (lhn != null) {
				Number rhn = rhs.getNumber();
				if (rhn != null)
					return (Constant.evaluate(lhn, opr, rhn));
			}
		} catch (Exception e) {
			Util.error("Arithmetic overflow: " + lhs + ' ' + opr + ' ' + rhs + "   " + e);
			e.printStackTrace();
		}
		return (new ArithmeticExpression(lhs, opr, rhs));
	}

	@Override
	public Expression evaluate() {
		// Try to Compile-time Evaluate this expression
		Number lhn = lhs.getNumber();
		if (lhn != null) {
			Number rhn = rhs.getNumber();
			if (rhn != null)
				return (Constant.evaluate(lhn, opr, rhn));
		}
		return (this);
	}

	@Override
	public void doChecking() {
		if (IS_SEMANTICS_CHECKED())
			return;
		Global.sourceLineNumber = lineNumber;
		if (Option.TRACE_CHECKER)
			Util.TRACE("BEGIN ArithmeticOperation" + toString() + ".doChecking - Current Scope Chain: "
					+ Global.getCurrentScope().edScopeChain());
		switch (opr) {
		case KeyWord.PLUS:
		case KeyWord.MINUS:
		case KeyWord.MUL: {
			// ArithmeticExpression
			lhs.doChecking();
			rhs.doChecking();
			Type type1 = lhs.type;
			Type type2 = rhs.type;
			this.type = Type.arithmeticTypeConversion(type1, type2);
			lhs = (Expression) TypeConversion.testAndCreate(this.type, lhs);
			rhs = (Expression) TypeConversion.testAndCreate(this.type, rhs);
			if (this.type == null)
				Util.error("Incompatible types in binary operation: " + toString());
			break;
		}
		case KeyWord.DIV: {
			// Real Division
			// The operator / denotes real division.
			// Any operand of integer type is converted before the operation.
			// Division by zero constitutes an error.
			lhs.doChecking();
			rhs.doChecking();
			Type type1 = lhs.type;
			Type type2 = rhs.type;
			this.type = Type.arithmeticTypeConversion(type1, type2);
			if (this.type.equals(Type.Integer))
				this.type = Type.Real;
			lhs = (Expression) TypeConversion.testAndCreate(this.type, lhs);
			rhs = (Expression) TypeConversion.testAndCreate(this.type, rhs);
			if (this.type == null)
				Util.error("Incompatible types in binary operation: " + toString());
			break;
		}
		case KeyWord.INTDIV: { // Integer Division
			lhs.doChecking();
			rhs.doChecking();
			if ((!lhs.type.equals(Type.Integer)) || (!rhs.type.equals(Type.Integer)))
				Util.error("Incompatible types in binary operation: " + toString());
			this.type = Type.Integer;
			lhs = (Expression) TypeConversion.testAndCreate(this.type, lhs);
			rhs = (Expression) TypeConversion.testAndCreate(this.type, rhs);
			break;
		}
		case KeyWord.EXP: {
			lhs.doChecking();
			rhs.doChecking();
			if ((!lhs.type.equals(Type.Integer)) || (!rhs.type.equals(Type.Integer))) {
				this.type = Type.LongReal; // Deviation from Simula Standard
				lhs = (Expression) TypeConversion.testAndCreate(this.type, lhs);
				rhs = (Expression) TypeConversion.testAndCreate(this.type, rhs);
			} else
				this.type = Type.Integer;
			break;
		}
		default:
			Util.IERR("Impossible");
		}
		if (Option.TRACE_CHECKER)
			Util.TRACE("END ArithmeticOperation" + toString() + ".doChecking - Result type=" + this.type);
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
		if(opr == KeyWord.EXP) {
			// Real:     r2=((float)(Math.pow(((double)(r1)),((double)(e)))));
			// LongReal: r2=Math.pow(r1,e);
			// Integer:  k=_IPOW(i,j);
			lhs.buildEvaluation(null,codeBuilder);
			if(type.equals(Type.Integer)) {
				rhs.buildEvaluation(null,codeBuilder);
				codeBuilder.invokestatic(BlockDeclaration.currentClassDesc(), "_IPOW", MethodTypeDesc.ofDescriptor("(II)I"));
			} else {
				if(type.equals(Type.Real)) codeBuilder.f2d();
				rhs.buildEvaluation(null,codeBuilder);
				if(type.equals(Type.Real)) codeBuilder.f2d();
				codeBuilder.invokestatic(CD.JAVA_LANG_MATH, "pow", MethodTypeDesc.ofDescriptor("(DD)D"));
				if(type.equals(Type.Real)) codeBuilder.d2f();
			}
			return;
		}
		lhs.buildEvaluation(null,codeBuilder);
		rhs.buildEvaluation(null,codeBuilder);
		if(type.equals(Type.Integer)) {
			switch (opr) {
				case KeyWord.PLUS:   codeBuilder.iadd(); break;
				case KeyWord.MINUS:  codeBuilder.isub(); break;
				case KeyWord.MUL:    codeBuilder.imul(); break;
				case KeyWord.DIV:    codeBuilder.idiv(); break;
				case KeyWord.INTDIV: codeBuilder.idiv(); break;
//			case KeyWord.EXP:
				default:
					Util.IERR("STOP: "+opr);
			}
		} else if(type.equals(Type.Real)) {
			switch(opr) {
				case KeyWord.PLUS:  codeBuilder.fadd(); break;
				case KeyWord.MINUS: codeBuilder.fsub(); break;
				case KeyWord.MUL:   codeBuilder.fmul(); break;
				case KeyWord.DIV:   codeBuilder.fdiv(); break;
				default: Util.IERR("IMPOSSIBLE: "+opr);
			}
		} else if(type.equals(Type.LongReal)) {
			switch(opr) {
				case KeyWord.PLUS:  codeBuilder.dadd(); break;
				case KeyWord.MINUS: codeBuilder.dsub(); break;
				case KeyWord.MUL:   codeBuilder.dmul(); break;
				case KeyWord.DIV:   codeBuilder.ddiv(); break;
				default: Util.IERR("IMPOSSIBLE: "+opr);
			}
		} else Util.IERR("NOT IMPL: "+type);
	}

	@Override
	public String toJavaCode() {
		ASSERT_SEMANTICS_CHECKED();
		switch (opr) {
		case KeyWord.EXP: {
			if (this.type.equals(Type.Integer))
				return ("_IPOW(" + lhs.get() + ',' + rhs.get() + ')');
			else
				return ("Math.pow(" + lhs.get() + ',' + rhs.get() + ')');
		}
		default: {
			if (this.backLink == null)
				return (lhs.get() + KeyWord.toJavaCode(opr) + '(' + rhs.get() + ')');
			else
				return ("(" + lhs.get() + KeyWord.toJavaCode(opr) + '(' + rhs.get() + "))");
		}
		}
	}

	@Override
	public String toString() {
		return ("(" + lhs + ' ' + opr + ' ' + rhs + ")");
	}

	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************
	/**
	 * Default constructor used by Attribute File I/O
	 */
	public ArithmeticExpression() {
	}

	@Override
	public void writeObject(AttributeOutputStream oupt) throws IOException {
		Util.TRACE_OUTPUT("writeArithmeticExpression: " + this);
		oupt.writeKind(ObjectKind.ArithmeticExpression);
		oupt.writeInt(SEQU);
		oupt.writeInt(lineNumber);
		oupt.writeType(type);
		oupt.writeObj(backLink);
		oupt.writeObj(lhs);
		oupt.writeInt(opr);
		oupt.writeObj(rhs);
	}
	
	public static ArithmeticExpression readObject(AttributeInputStream inpt) throws IOException {
		Util.TRACE_INPUT("BEGIN readArithmeticExpression: ");
		ArithmeticExpression expr = new ArithmeticExpression();
		expr.SEQU = inpt.readInt();
		expr.lineNumber = inpt.readInt();
		expr.type = inpt.readType();
		expr.backLink = (SyntaxClass) inpt.readObj();
		expr.lhs = (Expression) inpt.readObj();
		expr.opr = inpt.readInt();
		expr.rhs = (Expression) inpt.readObj();
		Util.TRACE_INPUT("readArithmeticExpression: " + expr);
		return(expr);
	}

	

}
