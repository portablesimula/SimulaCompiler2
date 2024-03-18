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

import simula.compiler.syntaxClass.SyntaxClass;
import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.Type.ConversionKind;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * Type Conversion.
 * <p>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/expression/TypeConversion.java">
 * <b>Source File</b></a>.
 *
 */
public final class TypeConversion extends Expression {
	
	/**
	 * The expression.
	 */
	Expression expression;

	/**
	 * Create a new TypeConversion.
	 * @param type the new type
	 * @param expression the expression
	 */
	private TypeConversion(final Type type,final Expression expression) {
		this.type=type;
		this.expression = expression; expression.backLink=this;
	    this.doChecking();
	}

	/**
	 * Test if a TypeConversion is necessary and then create it.
	 * @param fromType convert from this type
	 * @param toType convert to this type
	 * @param expr the expression
	 * @return piece of Java source code
	 */
	public static String mayBeConvert(final Type fromType,final Type toType,final String expr) {
		if(fromType.equals(Type.Real) || fromType.equals(Type.LongReal))
		{ if(toType.equals(Type.Integer))
              return("=(int)Math.round("+expr+");");
		}
        return("=("+toType.toJavaType()+")("+expr+");");
	}

	/**
	 * Test if a TypeConversion is necessary and then create it.
	 * @param toType convert to toType
	 * @param expression the expression
	 * @return the resulting expression
	 */
	public static Expression testAndCreate(final Type toType,final Expression expression) {
		Type fromType=expression.type;
		String qual=(fromType==null)?null:fromType.getRefIdent();
		if(!Option.SPORT && qual != null) {
			int rhsBL=(fromType!=null && fromType.declaredIn!=null)?fromType.declaredIn.ctBlockLevel : 0;
			int lhsBL=(toType!=null && toType.declaredIn!=null)?toType.declaredIn.ctBlockLevel : 0;
			if(rhsBL != 0 && lhsBL != 0 && rhsBL != lhsBL)
				Util.error("Incompatible types: "+expression+" of type "+expression.type+" can't be converted to "+toType);
		}
		if (testCastNeccessary(toType, expression)) {
			if(expression instanceof Constant constant) {
				Number val=(Number)constant.value;
				if(toType.equals(Type.Integer)) {
					if(fromType.equals(Type.Real)) val=(int)Math.round(val.floatValue());
					else if(fromType.equals(Type.LongReal)) val=(int)Math.round(val.doubleValue());
				}
				else if(toType.equals(Type.Real)) val=val.floatValue();
				else if(toType.equals(Type.LongReal)) val=val.doubleValue();
				else Util.IERR("IMPOSSIBLE - TypeConversion.testAndCreate: "+expression);
				Constant c=new Constant(toType,val); c.doChecking();
				return(c);
			}
			return (new TypeConversion(toType, expression));
		}
		return (expression);
	}

	/**
	 * Test if a TypeConversion is necessary.
	 * @param toType the desired type
	 * @param expression the expression
	 * @return piece of Java source code
	 */
	private static boolean testCastNeccessary(final Type toType,final Expression expression) {
		if (toType == null)	return (false);
		Type fromType = expression.type;
		if(fromType==null) {
			Util.error("Expression "+expression+" has no type - can't be converted to "+toType);
			return(false);
		}
		ConversionKind conversionKind = fromType.isConvertableTo(toType);
		switch (conversionKind) {
			case DirectAssignable:	return (false);
			case ConvertValue:
			case ConvertRef:		return (true);
			case Illegal:
				Util.error("TypeConversion: Illegal cast: (" + toType + ") " + expression);
			default: return (false);
		}
	}
	
	@Override
	// Is redefined in Variable, RemoteVariable and TypeConversion
	public VariableExpression getWriteableVariable() {
		return(expression.getWriteableVariable());
	}

	@Override
	public void doChecking() {
		if (IS_SEMANTICS_CHECKED())	return;
		type.doChecking(Global.getCurrentScope());
		expression.doChecking();
		Type type = expression.type;
		if (type.isConvertableTo(this.type).equals(Type.ConversionKind.Illegal))
			Util.error("Illegal Type Conversion " + type + " ==> " + this.type);
		SET_SEMANTICS_CHECKED();
	}

	// Returns true if this expression may be used as a statement.
	@Override
	public boolean maybeStatement() {
		ASSERT_SEMANTICS_CHECKED();
		return(false);  
	}

	@Override
	public String toJavaCode() {
		ASSERT_SEMANTICS_CHECKED();
		String evaluated = expression.toJavaCode();
		if (type.equals(Type.Integer)) {
			Type fromType = expression.type;
			if (fromType.equals(Type.Real) || fromType.equals(Type.LongReal))
				return("(int)Math.round(" + evaluated + ")");
		}
		return ("((" + type.toJavaType() + ")(" + evaluated + "))");
	}

	@Override
	public String toString() {
		return ("((" + type + ")(" + expression + "))");
	}


	// ***********************************************************************************************
	// *** Externalization
	// ***********************************************************************************************
	/**
	 * Default constructor used by Externalization.
	 */
	public TypeConversion() {
	}

	@Override
	public void writeExternal(ObjectOutput oupt) throws IOException {
		Util.TRACE_OUTPUT("BEGIN Write "+this.getClass().getSimpleName());
		oupt.writeBoolean(CHECKED);
		oupt.writeInt(lineNumber);
		oupt.writeObject(type);
		oupt.writeObject(backLink);
		oupt.writeObject(expression);
	}
	
	@Override
	public void readExternal(ObjectInput inpt) throws IOException, ClassNotFoundException {
		Util.TRACE_INPUT("BEGIN Read "+this.getClass().getSimpleName());
		CHECKED=inpt.readBoolean();
		lineNumber = inpt.readInt();
		type = (Type) inpt.readObject();
		backLink = (SyntaxClass) inpt.readObject();
		expression = (Expression) inpt.readObject();
	}
	

}
