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
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * Conditional Expression.
 * 
 * <pre>
 * 
 * Syntax: 
 * 
 *   conditional-expression
 *       = IF Boolean-expression THEN simple-expression ELSE expression
 * 
 * </pre>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/expression/ConditionalExpression.java">
 * <b>Source File</b></a>.
 * 
 * @author Øystein Myhre Andersen
 */
public final class ConditionalExpression extends Expression {
	
	/**
	 * The condition.
	 */
	Expression condition;
	
	/**
	 * The then branch expression
	 */
	Expression thenExpression;
	
	/**
	 * The else branch expression
	 */
	Expression elseExpression;

	/**
	 * Create a new ConditionalExpression.
	 * @param type expression's type
	 * @param condition the condition
	 * @param thenExpression then branch expression
	 * @param elseExpression else branch expression
	 */
	ConditionalExpression(final Type type, final Expression condition, final Expression thenExpression, final Expression elseExpression) {
		this.condition = condition;
		this.thenExpression = thenExpression; thenExpression.backLink=this;
		this.elseExpression = elseExpression; elseExpression.backLink=this;
		if (Option.TRACE_PARSE)
			Util.TRACE("NEW ConditionalExpression: " + toString());
	}

	@Override
	public void doChecking() {
		if (IS_SEMANTICS_CHECKED())	return;
		Global.sourceLineNumber=lineNumber;
		condition.doChecking();
		condition.backLink=this; // To ensure _RESULT from functions
		Type cType = condition.type;
		if (!cType.equals(Type.Boolean))
			Util.error("ConditionalExpression: Condition is not a boolean (rather " + cType + ")");
		thenExpression.doChecking();
		elseExpression.doChecking();
		Type expectedType=Type.commonTypeConversion(thenExpression.type,elseExpression.type);
		thenExpression = TypeConversion.testAndCreate(expectedType, thenExpression);
		elseExpression = TypeConversion.testAndCreate(expectedType, elseExpression);
		thenExpression.doChecking(); // In case TypeConversion was added
		elseExpression.doChecking(); // In case TypeConversion was added
		this.type=expectedType;
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
		return ("((" + condition.get() + ")?("
				+ thenExpression.get() + "):("
				+ elseExpression.get() + "))");
	}

	@Override
	public void buildEvaluation(Expression rightPart,CodeBuilder codeBuilder) {
		ASSERT_SEMANTICS_CHECKED();
		condition.buildEvaluation(null,codeBuilder);
		Label elseLabel = codeBuilder.newLabel();
		codeBuilder.ifeq(elseLabel);
		thenExpression.buildEvaluation(null,codeBuilder);
		if(elseExpression != null) {
			Label endLabel = codeBuilder.newLabel();
			codeBuilder.goto_(endLabel);
			codeBuilder.labelBinding(elseLabel);
			elseExpression.buildEvaluation(null,codeBuilder);
			codeBuilder.labelBinding(endLabel);
		} else codeBuilder.labelBinding(elseLabel);
	}

	@Override
	public String toString() {
		return ("(IF " + condition + " THEN " + thenExpression + " ELSE "
				+ elseExpression + ')');
	}


	// ***********************************************************************************************
	// *** Externalization
	// ***********************************************************************************************
	/**
	 * Default constructor used by Externalization.
	 */
	public ConditionalExpression() {
	}

	@Override
	public void writeExternal(ObjectOutput oupt) throws IOException {
		Util.TRACE_OUTPUT("BEGIN Write "+this.getClass().getSimpleName());
		if(!Option.NEW_ATTR_FILE)
			oupt.writeBoolean(CHECKED);
		oupt.writeInt(lineNumber);
		Type.outType(type,oupt);
		oupt.writeObject(backLink);
		oupt.writeObject(condition);
		oupt.writeObject(thenExpression);
		oupt.writeObject(elseExpression);
	}
	
	@Override
	public void readExternal(ObjectInput inpt) throws IOException, ClassNotFoundException {
		Util.TRACE_INPUT("BEGIN Read "+this.getClass().getSimpleName());
		if(!Option.NEW_ATTR_FILE)
			CHECKED=inpt.readBoolean();
		lineNumber = inpt.readInt();
		type = Type.inType(inpt);
		backLink = (SyntaxClass) inpt.readObject();
		condition = (Expression) inpt.readObject();
		thenExpression = (Expression) inpt.readObject();
		elseExpression = (Expression) inpt.readObject();
	}
	

}
