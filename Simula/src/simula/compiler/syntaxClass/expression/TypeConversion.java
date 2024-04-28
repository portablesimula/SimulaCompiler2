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
import java.lang.constant.ClassDesc;
import java.lang.constant.MethodTypeDesc;

import simula.compiler.AttributeInputStream;
import simula.compiler.AttributeOutputStream;
import simula.compiler.syntaxClass.OverLoad;
import simula.compiler.syntaxClass.SyntaxClass;
import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.Type.ConversionKind;
import simula.compiler.syntaxClass.declaration.ClassDeclaration;
import simula.compiler.utilities.CD;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.ObjectKind;
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
	public Expression expression;

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
	public static String mayBeConvert(final Type fromType, final Type toType, final String expr) {
		if(fromType.equals(Type.Real) || fromType.equals(Type.LongReal))
		{ if(toType.equals(Type.Integer))
              return("=(int)Math.round("+expr+");");
		}
        return("=("+toType.toJavaType()+")("+expr+");");
	}
	public static void buildMayBeConvert(final Type fromType, final Type toType, final Expression expr, CodeBuilder codeBuilder) {
		// NOTE: 'expr' is top of operand stack
//		System.out.println("TypeConversion.buildMayBeConvert: fromType="+fromType+", toType="+toType);
		if(fromType.equals(Type.Integer)) {
			if(toType.equals(Type.Real)) codeBuilder.i2f();
			else if(toType.equals(Type.LongReal)) codeBuilder.i2d();
			
		} else if(fromType.equals(Type.Real) || fromType.equals(Type.LongReal)) {
			if(toType.equals(Type.Integer)) {
				// return("=(int)Math.round("+expr+");");
				if (fromType.equals(Type.Real)) {
					codeBuilder.invokestatic(CD.JAVA_LANG_MATH, "round", MethodTypeDesc.ofDescriptor("(F)I"));
				}
				else if (fromType.equals(Type.LongReal)) {
					codeBuilder
						.invokestatic(CD.JAVA_LANG_MATH, "round", MethodTypeDesc.ofDescriptor("(D)J"))
						.l2i();
				}
			}
			else if(toType.equals(Type.Real)) {
				if (fromType.equals(Type.LongReal)) codeBuilder.d2f();
			}
			else if(toType.equals(Type.LongReal)) {
				if (fromType.equals(Type.Real)) codeBuilder.f2d();
			}
		} else if(toType.isRefClassType()) {
	        // return("=("+toType.toJavaType()+")("+expr+");");
			expr.buildEvaluation(null, codeBuilder);
			System.out.println("TypeConversion.buildMayBeConvert: fromType="+fromType+", toType="+toType+", classIdent="+toType.classIdent);
			
			codeBuilder.checkcast(toType.toClassDesc());
		}
		else {
			Util.IERR("fromType="+fromType+", toType="+toType);
		}
	}

	/**
	 * Test if a TypeConversion is necessary and then create it.
	 * @param toType convert to toType
	 * @param expression the expression
	 * @return the resulting expression
	 */
	public static Expression testAndCreate(final Type toType,final Expression expression) {
		Type fromType=expression.type;
//		System.out.println("TypeConversion.testAndCreate: "+fromType+"  ==>  "+toType);
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
			if(!Option.CREATE_JAVA_SOURCE) {
				if(toType instanceof OverLoad otp) {
					return (new TypeConversion(otp.type[0], expression));
				}				
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
	private static boolean testCastNeccessary(Type toType,final Expression expression) {
		if (toType == null)	return (false);
		if(!Option.CREATE_JAVA_SOURCE) {
			if(toType instanceof OverLoad otp) {
				if(!otp.contains(expression.type)) {
//					System.out.println("TypeConversion.testCastNeccessary: "+expression.type+"  ==>  "+toType+"  RETURNS TRUE");
					return(true); // Ad'Hoc
				}
			}
		}
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
//		System.out.println("TypeConversion.getWriteableVariable: expression="+expression.getClass().getSimpleName() + "  "+expression);
	    VariableExpression writeableVariable=expression.getWriteableVariable();
//		System.out.println("TypeConversion.getWriteableVariable: writeableVariable="+writeableVariable);
		return(writeableVariable);
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
	public void buildEvaluation(Expression rightPart,CodeBuilder codeBuilder) {
		ASSERT_SEMANTICS_CHECKED();
		expression.buildEvaluation(null,codeBuilder);
		if (type.equals(Type.Integer)) {
			Type fromType = expression.type;
			if (fromType.equals(Type.Real)) {
				codeBuilder.invokestatic(CD.JAVA_LANG_MATH, "round", MethodTypeDesc.ofDescriptor("(F)I"));
			}
			else if (fromType.equals(Type.LongReal)) {
				codeBuilder
					.invokestatic(CD.JAVA_LANG_MATH, "round", MethodTypeDesc.ofDescriptor("(D)J"))
					.l2i();
			}
		} else if (type.equals(Type.Real)) {
			Type fromType = expression.type;
			if (fromType.equals(Type.Integer)) codeBuilder.i2f();
			else if (fromType.equals(Type.LongReal)) codeBuilder.d2f();
			else if(!Option.CREATE_JAVA_SOURCE && fromType instanceof OverLoad otp) {
				System.out.println("TypeConvesion.buildEvaluation: backLink="+this.backLink);
				System.out.println("TypeConvesion.buildEvaluation: "+fromType+"  ==>  "+type);
				if(!otp.contains(Type.Real)) Util.IERR(""+fromType+"  ==>  "+type);
			}
			else if (!fromType .equals(Type.Real)) Util.IERR(""+fromType+"  ==>  "+type);
		} else if (type.equals(Type.LongReal)) {
			Type fromType = expression.type;
			if (fromType.equals(Type.Integer)) codeBuilder.i2d();
			else if (fromType.equals(Type.Real)) codeBuilder.f2d();
			else if(!Option.CREATE_JAVA_SOURCE && fromType instanceof OverLoad otp) {
				System.out.println("TypeConvesion.buildEvaluation: backLink="+backLink);
				System.out.println("TypeConvesion.buildEvaluation: "+fromType+"  ==>  "+type);
				if(!otp.contains(Type.LongReal)) Util.IERR(""+fromType+"  ==>  "+type);
			}
			else if (!fromType .equals(Type.LongReal)) Util.IERR("");
		} else {
			codeBuilder.checkcast(type.toClassDesc());
		}
	}


	@Override
	public String toString() {
		return ("((" + type + ")(" + expression + "))");
	}


	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************
	/**
	 * Default constructor used by Attribute File I/O
	 */
	private TypeConversion() {}

	@Override
	public void writeObject(AttributeOutputStream oupt) throws IOException {
		Util.TRACE_OUTPUT("writeTypeConversion: " + this);
		oupt.writeKind(ObjectKind.TypeConversion);
		oupt.writeInt(SEQU);
		oupt.writeInt(lineNumber);
		oupt.writeType(type);
		oupt.writeObj(backLink);
		oupt.writeObj(expression);
	}
	
	public static TypeConversion readObject(AttributeInputStream inpt) throws IOException {
		Util.TRACE_INPUT("BEGIN readTypeConversion: ");
		TypeConversion expr = new TypeConversion();
		expr.SEQU = inpt.readInt();
		expr.lineNumber = inpt.readInt();
		expr.type = inpt.readType();
		expr.backLink = (SyntaxClass) inpt.readObj();
		expr.expression = (Expression) inpt.readObj();
		Util.TRACE_INPUT("readTypeConversion: " + expr);
		return(expr);
	}

//	// ***********************************************************************************************
//	// *** Externalization
//	// ***********************************************************************************************
//	/**
//	 * Default constructor used by Externalization.
//	 */
//	public TypeConversion() {
//	}
//
//	@Override
//	public void writeExternal(ObjectOutput oupt) throws IOException {
//		Util.TRACE_OUTPUT("BEGIN Write "+this.getClass().getSimpleName());
//		if(!Option.NEW_ATTR_FILE)
//			oupt.writeBoolean(CHECKED);
//		oupt.writeInt(lineNumber);
//		oupt.writeType(type);
//		oupt.writeObject(backLink);
//		oupt.writeObject(expression);
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
//		expression = (Expression) inpt.readObject();
//	}
//	

}
