/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass.expression;

import java.io.IOException;
import java.lang.classfile.CodeBuilder;
import java.lang.classfile.Label;

import simula.compiler.AttributeInputStream;
import simula.compiler.AttributeOutputStream;
import simula.compiler.syntaxClass.Type;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.KeyWord;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * Boolean expressions
 * 
 * <pre>
 * Simula Standard: 3.2 Boolean expressions
 *
 *    Boolean-expression
 *        =  simple-Boolean-expression
 *        |  IF Boolean-expression THEN  simple-Boolean-expression  ELSE  Boolean-expression
 *
 *    simple-Boolean-expression
 *        =  Boolean-tertiary  { OR ELSE  Boolean-tertiary }
 *
 *    Boolean-tertiary
 *        =  equivalence  { AND THEN  equivalence }
 *
 *    equivalence
 *        =  implication  { EQV  implication }
 *
 *    implication
 *        =  Boolean-term  { IMP  Boolean-term }
 *
 *    Boolean-term
 *        =  Boolean-factor  { OR  Boolean-factor }
 *
 *    Boolean-factor
 *        =  Boolean-secondary  { AND  Boolean-secondary }
 *
 *    Boolean-secondary
 *        =  [ NOT ]  Boolean-primary
 *
 *    Boolean-primary
 *        =  logical-value
 *        |  variable
 *        |  function-designator
 *        |  relation
 *        |  "("  Boolean-expression  ")"
 * </pre>
 * 
 * A Boolean expression is of type Boolean. It is a rule for computing a logical
 * value. Except for the operators and then and or else (see 3.4) the semantics
 * are entirely analogous to those given for arithmetic expressions.
 * <p>
 * Variables and function designators entered as Boolean primaries must be of
 * type Boolean.
 * 
 * 
 * Simula Standard: 3.4 The logical operators
 * <p>
 * The meaning of the logical operators not, and, or, imp, and eqv is given by
 * the following function table:
 * 
 * <pre>
        b1               false     false     true      true
        b2               false     true      false     true
      ---------------------------------------------------------
        not  b1          true      true      false     false
        b1 and b2        false     false     false     true
        b1 or b2         false     true      true      true
        b1 imp b2        true      true      false     true
        b1 eqv b2        true      false     false     true
     ----------------------------------------------------------
 * </pre>
 * 
 * The operation "b1 and then b2" denotes "conditional and". If the value of b1
 * is false the operation yields the result false, otherwise it yields the
 * result of evaluating b2.
 * <p>
 * The operation "b1 or else b2" denotes "conditional or". If the value of b1 is
 * true the operator yields the result true, otherwise it yields the result of
 * evaluating b2.
 * <p>
 * Note: The value of "b1 and then b2" is given by textual substitution of the
 * Boolean expression "(if b1 then b2 else false)". Similarly, the operation "b1
 * or else b2" is defined by substitution of "(if b1 then true else b2)". These
 * definitions imply that the evaluation of the second operand is suppressed
 * when the evaluation result is already evident from the value of the first
 * operand alone.
 * <p>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/expression/BooleanExpression.java">
 * <b>Source File</b></a>.
 * 
 * @author Simula Standard
 * @author Øystein Myhre Andersen
 */
public final class BooleanExpression extends Expression {

	/**
	 * The left hand side
	 */
	private Expression lhs;

	/**
	 * The Boolean operation
	 */
	private int opr;

	/**
	 * The right hand side
	 */
	private Expression rhs;

	/**
	 * Create a new BooleanExpression.
	 * @param lhs left hand side
	 * @param opr Boolean operation
	 * @param rhs right hand side
	 */
	BooleanExpression(Expression lhs, int opr, Expression rhs) {
		this.lhs = lhs;
		this.opr = opr;
		this.rhs = rhs;
		if (this.lhs == null) {
			Util.error("Missing operand before " + opr);
			this.lhs = new VariableExpression("UNKNOWN_");
		}
		if (this.rhs == null) {
			Util.error("Missing operand after " + opr);
			this.rhs = new VariableExpression("UNKNOWN_");
		}
		this.lhs.backLink = this.rhs.backLink = this;
	}

	@Override
	public void doChecking() {
		if (IS_SEMANTICS_CHECKED())	return;
		Global.sourceLineNumber = lineNumber;
		if (Option.internal.TRACE_CHECKER)
			Util.TRACE("BEGIN BooleanOperation" + toString() + ".doChecking - Current Scope Chain: " + Global.getCurrentScope().edScopeChain());
		switch (opr) {
		    case KeyWord.AND:case KeyWord.OR:case KeyWord.IMP:case KeyWord.EQV:case KeyWord.AND_THEN:case KeyWord.OR_ELSE: {
		    	// Boolean operation
				lhs.doChecking();
				rhs.doChecking();
				Type type1 = lhs.type;
				Type type2 = rhs.type;
				if( (type1 != null && type1.keyWord == Type.T_BOOLEAN)
				&&  (type2 != null && type2.keyWord == Type.T_BOOLEAN) )
					this.type = Type.Boolean;
				if (this.type == null)
					Util.error("Incompatible types in binary operation: " + toString());
				break;
		    }
		    default: Util.IERR();
		}
		if (Option.internal.TRACE_CHECKER)
			Util.TRACE("END BooleanOperation" + toString() + ".doChecking - Result type=" + this.type);
		SET_SEMANTICS_CHECKED();
	}

	// Returns true if this expression may be used as a statement.
	@Override
	public boolean maybeStatement() {
		ASSERT_SEMANTICS_CHECKED();
		return (false);
	}

	@Override
	public String toJavaCode() {
		ASSERT_SEMANTICS_CHECKED();
		switch (opr) {
			case KeyWord.IMP: return ("((!" + lhs.get() + ") | " + rhs.get() + ')');
			case KeyWord.EQV: return ("((" + lhs.get() + ") == (" + rhs.get() + "))");
			default: {
				if (this.backLink == null)
				 	 return (lhs.get() + KeyWord.toJavaCode(opr) + '(' + rhs.get() + ')');
				else return ("(" + lhs.get() + KeyWord.toJavaCode(opr) + '(' + rhs.get() + "))");
			}
		}
	}

	@Override
	public void buildEvaluation(Expression rightPart,CodeBuilder codeBuilder) {
		ASSERT_SEMANTICS_CHECKED();
		switch(opr) {
			case KeyWord.AND:
				lhs.buildEvaluation(null,codeBuilder);
				rhs.buildEvaluation(null,codeBuilder);
				codeBuilder.iand(); break;
			case KeyWord.OR:
				lhs.buildEvaluation(null,codeBuilder);
				rhs.buildEvaluation(null,codeBuilder);
				codeBuilder.ior(); break;
			case KeyWord.IMP:
				lhs.buildEvaluation(null,codeBuilder);
				UnaryOperation.buildNOT(codeBuilder);
				rhs.buildEvaluation(null,codeBuilder);
				codeBuilder.ior(); break;
			case KeyWord.EQV:
				lhs.buildEvaluation(null,codeBuilder);
				rhs.buildEvaluation(null,codeBuilder);
				Label L1 = codeBuilder.newLabel();
				Label L2 = codeBuilder.newLabel();
				codeBuilder
						.if_icmpne(L1)
						.iconst_1()
						.goto_(L2)
						.labelBinding(L1)
						.iconst_0()
						.labelBinding(L2);
				break;
			case KeyWord.AND_THEN:
				Label AL1 = codeBuilder.newLabel();
				Label AL2 = codeBuilder.newLabel();
				lhs.buildEvaluation(null,codeBuilder);
				codeBuilder
						.ifeq(AL1);
				rhs.buildEvaluation(null,codeBuilder);
				codeBuilder
						.ifeq(AL1)
						.iconst_1()
						.goto_(AL2)
						.labelBinding(AL1)
						.iconst_0()
						.labelBinding(AL2);
				break;
			case KeyWord.OR_ELSE:
				Label OL1 = codeBuilder.newLabel();
				Label OL2 = codeBuilder.newLabel();
				Label OL3 = codeBuilder.newLabel();
				lhs.buildEvaluation(null,codeBuilder);
				codeBuilder
						.ifne(OL1);
				rhs.buildEvaluation(null,codeBuilder);
				codeBuilder
						.ifeq(OL2)
						.labelBinding(OL1)
						.iconst_1()
						.goto_(OL3)
						.labelBinding(OL2)
						.iconst_0()
						.labelBinding(OL3);
				break;
			default: Util.IERR();
		}
	}

	@Override
	public String toString() {
		return ("(" + lhs + ' ' + KeyWord.edit(opr) + ' ' + rhs + ")");
	}

	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************
	/**
	 * Default constructor used by Attribute File I/O
	 */
	private BooleanExpression() {}

	@Override
	public void writeObject(AttributeOutputStream oupt) throws IOException {
		Util.TRACE_OUTPUT("writeBooleanExpression: " + this);
		oupt.writeKind(ObjectKind.BooleanExpression);
		oupt.writeShort(SEQU);
//		oupt.writeShort(lineNumber);
//		oupt.writeType(type);
//		oupt.writeObj(backLink);
//		oupt.writeObj(lhs);
//		oupt.writeShort(opr);
//		oupt.writeObj(rhs);
		writeAttributes(oupt);
	}
	
	public static BooleanExpression readObject(AttributeInputStream inpt) throws IOException {
		Util.TRACE_INPUT("BEGIN readBooleanExpression: ");
		BooleanExpression expr = new BooleanExpression();
		expr.SEQU = inpt.readSEQU(expr);
//		expr.lineNumber = inpt.readShort();
//		expr.type = inpt.readType();
//		expr.backLink = (SyntaxClass) inpt.readObj();
//		expr.lhs = (Expression) inpt.readObj();
//		expr.opr = inpt.readShort();
//		expr.rhs = (Expression) inpt.readObj();
		expr.readAttributes(inpt);
		Util.TRACE_INPUT("readBooleanExpression: " + expr);
		return(expr);
	}

	@Override
	public void writeAttributes(AttributeOutputStream oupt) throws IOException {
		super.writeAttributes(oupt);
		oupt.writeObj(lhs);
		oupt.writeShort(opr);
		oupt.writeObj(rhs);
	}

	@Override
	public void readAttributes(AttributeInputStream inpt) throws IOException {
		super.readAttributes(inpt);
		lhs = (Expression) inpt.readObj();
		opr = inpt.readShort();
		rhs = (Expression) inpt.readObj();
	}

}
