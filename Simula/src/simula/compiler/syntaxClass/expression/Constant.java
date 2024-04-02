/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass.expression;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.classfile.CodeBuilder;
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import java.lang.constant.MethodTypeDesc;

import simula.compiler.syntaxClass.SyntaxClass;
import simula.compiler.syntaxClass.Type;
import simula.compiler.utilities.CD;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.KeyWord;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * Constant.
 * <p>
 * All constants are treated by the Lexicographical Scanner.
 * 
 * <pre>
 * 
 * Syntax:
 * 
 *   Constant = unsigned-number | string | character-constant | NONE | NOTEXT
 *   
 * </pre>
 * Link to GitHub: <a href="https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/expression/Constant.java">
 * <b>Source File</b></a>.
 * 
 * @author Øystein Myhre Andersen
 * @see simula.compiler.parsing.SimulaScanner
 */
public final class Constant extends Expression implements Externalizable {
	
	/**
	 * The constant's value
	 */
	public Object value;

	/**
	 * Create a new Constant.
	 * @param type the constant's type
	 * @param value the constant's value
	 */
	public Constant(final Type type,final Object value) {
		this.type=type;
		this.value = value;
	}
	
	/**
	 * Create a real type Constant.
	 * @param value a real type value
	 * @return the resulting Constant
	 */
    static Constant createRealType(final Object value)
    { Type type=Type.Real;
      if(value instanceof Double) type=Type.LongReal;
      return(new Constant(type,value));
    }
    
    /**
     * Returns the type of this number.
     * @param n the number
     * @return the type of this number.
     */
    private static Type getType(final Number n) {
    	if(n instanceof Integer) return(Type.Integer);
    	if(n instanceof Long) return(Type.Integer);
    	if(n instanceof Float) return(Type.Real);
    	return(Type.LongReal);
    }
    
    /**
     * Simplify this Constant.
     * @param opr an unary operation
     * @param rhn a right hand Number
     * @return the resulting Constant
     */
    static Constant evaluate(final int opr,final Number rhn) { 
    	Type type=getType(rhn);
		Number result=null;
		if(type.equals(Type.Integer)) {
			switch(opr) {
	        	case KeyWord.PLUS: result=rhn.intValue();
	        	case KeyWord.MINUS: result= - rhn.intValue(); break;
	        	default:
			}
		} else if(type.equals(Type.Real)) {
			switch(opr) {
        		case KeyWord.PLUS: result=rhn.floatValue(); break;
        		case KeyWord.MINUS: result= - rhn.floatValue(); break;
        		default:
			}
		} else if(type.equals(Type.LongReal)) {
			switch(opr) {
				case KeyWord.PLUS: result=rhn.doubleValue(); break;
				case KeyWord.MINUS: result= - rhn.doubleValue(); break;
				default:
			}
		}
		if(result==null) Util.IERR("Impossible");
		return(new Constant(type,result));
    }
  
    /**
     * Simplify this Constant.
     * @param lhn a left hand Number
     * @param opr an binary operation
     * @param rhn a right hand Number
     * @return the resulting Constant
     */
    static Constant evaluate(final Number lhn,final int opr,final Number rhn) { 
    	Type type=Type.arithmeticTypeConversion(getType(lhn),getType(rhn));
		if(opr==KeyWord.DIV && type.equals(Type.Integer)) type=Type.Real;
		Number result=null;
		if(type.equals(Type.Integer)) {
			switch(opr) {
        		case KeyWord.PLUS   -> result=lhn.longValue() + rhn.longValue();
        		case KeyWord.MINUS  -> result=lhn.longValue() - rhn.longValue();
        		case KeyWord.MUL    -> result=lhn.longValue() * rhn.longValue();
        		case KeyWord.INTDIV -> result=lhn.longValue() / rhn.longValue();
        		case KeyWord.EXP    -> result=Util.IPOW(lhn.longValue(),rhn.longValue());
        		default     -> Util.IERR("Unexpected value: " + opr);
			}
			if(result.longValue() > Integer.MAX_VALUE || result.longValue() < Integer.MIN_VALUE)
				Util.error("Arithmetic overflow: "+lhn+' '+opr+' '+rhn);
			result=(int) result.longValue();
		} else if(type.equals(Type.Real)) {
			switch(opr) {
        		case KeyWord.PLUS  -> result=lhn.floatValue() + rhn.floatValue();
        		case KeyWord.MINUS -> result=lhn.floatValue() - rhn.floatValue();
        		case KeyWord.MUL   -> result=lhn.floatValue() * rhn.floatValue();
        		case KeyWord.DIV   -> result=lhn.floatValue() / rhn.floatValue();
        		case KeyWord.EXP   -> result=Math.pow(lhn.floatValue(),rhn.floatValue());
        		default    -> Util.IERR("Unexpected value: " + opr);
			}
		} else if(type.equals(Type.LongReal)) {
			switch(opr) {
				case KeyWord.PLUS  -> result=lhn.doubleValue() + rhn.doubleValue();
				case KeyWord.MINUS -> result=lhn.doubleValue() - rhn.doubleValue();
				case KeyWord.MUL   -> result=lhn.doubleValue() * rhn.doubleValue();
				case KeyWord.DIV   -> result=lhn.doubleValue() / rhn.doubleValue();
				case KeyWord.EXP   -> result=Math.pow(lhn.doubleValue(),rhn.doubleValue());
        		default    -> Util.IERR("Unexpected value: " + opr);
			}
		}
		if(result==null) Util.IERR("Impossible");
		return(new Constant(type,result));
    }
    
	@Override
    public void doChecking() {
		if (IS_SEMANTICS_CHECKED())	return;
		Global.sourceLineNumber=lineNumber;
		this.type.doChecking(Global.getCurrentScope());
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
		//ASSERT_SEMANTICS_CHECKED(); // ØM: Ad'Hoc
		if(type.equals(Type.Text))
		{ if(value==null) return("null");
		  String val=value.toString();
          val=encode(val);
		  return("new RTS_TXT(\""+val+"\")");
		}
		if(type.equals(Type.Character)) {
			char charValue=((Character)value).charValue();
			if(charValue=='\\') return("'\\\\'");
			int intValue=(int)charValue;
			if(intValue!='\'' && intValue>32 && intValue<127) return("'"+value+"'");
			return("((char)"+intValue+')');
		}
		if(type.equals(Type.Integer))  return (""+((Number)value).intValue());
		if(type.equals(Type.Real))     return (""+((Number)value).floatValue()+'f');
		if(type.equals(Type.LongReal)) return (""+((Number)value).doubleValue()+'d');
		return (""+value);
	}
	
	/**
	 * Encode a string with escape sequences.
	 * @param s the string
	 * @return a string with escape sequences.
	 */
	private String encode(final String s) {
		StringBuilder b = new StringBuilder();
		for (char c : s.toCharArray()) {
			if(c < 32) {
				if (c == '\"') b.append("\\\"");
				else if (c == '\\') b.append("\\\\");
				else if (c == '\n') b.append("\\n");
				else if (c == '\r') b.append("\\r");
				else if (c == '\t') b.append("\\t");
				else if (c == '\b') b.append("\\b");
				else if (c == '\f') b.append("\\f");
				else if (c == '\'') b.append("\\'");
				else appendHex(b,c);
			} else if(c == 92) b.append("\\\\");
			  else if(c > 90 & c < 97) appendHex(b,c);
			  else if(c == 92) b.append("\\");
			  else if(c > 123) appendHex(b,c);
			  else if (c == '\"') b.append("\\\"");
			  else b.append(c);
		}
		return (b.toString());
	}
	
	/**
	 * Encoding Utility: Edit hex(c) and append it to the given StringBuilder.
	 * @param sb the StringBuilder
	 * @param c the input character
	 */
	private void appendHex(StringBuilder sb,char c) {
		String hex=Integer.toHexString(c);
		switch(hex.length()) {
		case 1-> hex="000"+hex;
		case 2-> hex="00"+hex;
		case 3-> hex="0"+hex;
		}
		sb.append("\\u"+hex);	
	}

	@Override
	public void buildEvaluation(Expression rightPart,CodeBuilder codeBuilder) {
		//ASSERT_SEMANTICS_CHECKED(); // ØM: Ad'Hoc
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		if(this.value==null) {
			codeBuilder.aconst_null();
		} else if(type.equals(Type.Text)) {
			codeBuilder
					.new_(CD.RTS_TXT)
					.dup()
					.ldc(pool.stringEntry((String) value))
					.invokespecial(pool.methodRefEntry(CD.RTS_TXT, "<init>", MethodTypeDesc.ofDescriptor("(Ljava/lang/String;)V")));
		} else if(type.equals(Type.Integer)) {
			if(value instanceof Long){
				Long i=(Long)value;
				buildIntConst(codeBuilder, i.intValue());
			} else {
				Integer i = (Integer) value;
				buildIntConst(codeBuilder, i);
			}
		} else if(type.equals(Type.Character)) {
			int i = (int)((char)value);
			buildIntConst(codeBuilder, i);
		} else if(type.equals(Type.LongReal)) {
			double d=(double) value;
			if(d==0) codeBuilder.dconst_0();
			else if(d==1) codeBuilder.dconst_1();
			else codeBuilder.ldc(pool.doubleEntry(d));
		} else if(type.equals(Type.Real)) {
			float f=(float) value;
			if(f==0) codeBuilder.fconst_0();
			else if(f==1) codeBuilder.fconst_1();
			else if(f==2) codeBuilder.fconst_2();
			else codeBuilder.ldc(pool.floatEntry(f));
		} else if(type.equals(Type.Boolean)) {
			boolean b=(boolean) value;
			if(b) codeBuilder.iconst_1(); else codeBuilder.iconst_0();
		}
		else {
			Util.IERR("NOT IMPL: Constant.buildByteCode: "+this.type+"  "+this);
		}
	}

	public static void buildIntConst(CodeBuilder codeBuilder, boolean b) {
		if(b) codeBuilder.iconst_1(); else codeBuilder.iconst_0();
	}
	
	public static void buildIntConst(CodeBuilder codeBuilder, int i) {
		switch(i) {
			case 0: codeBuilder.iconst_0(); break;
			case 1: codeBuilder.iconst_1(); break;
			case 2: codeBuilder.iconst_2(); break;
			case 3: codeBuilder.iconst_3(); break;
			case 4: codeBuilder.iconst_4(); break;
			case 5: codeBuilder.iconst_5(); break;
			default: // bipush, sipush or ldc
				if(i<Byte.MAX_VALUE && i>Byte.MIN_VALUE) codeBuilder.bipush(i);
				else if(i<Short.MAX_VALUE && i>Short.MIN_VALUE) codeBuilder.sipush(i);
				else codeBuilder.ldc(codeBuilder.constantPool().intEntry(i));
		}
	}

	@Override
	public String toString() {
//		String val=value==null?"null":(value.getClass().getSimpleName()+'(' + value+')');
//		return("CONSTANT("+type+','+val+')');
		if(type.equals(Type.Text)) return("\""+value+'"');
		return(""+value);
	}

	
//	// ***********************************************************************************************
//	// *** Externalization
//	// ***********************************************************************************************
//	/**
//	 * Default constructor used by Externalization.
//	 */
//	public Constant() {}
//
//	@Override
//	public void writeExternal(ObjectOutput oupt) throws IOException {
//		Util.TRACE_OUTPUT("Constant: "+type+' '+value);
//		Type.outType(type,oupt);
//		oupt.writeObject(value);
//	}
//
//	@Override
//	public void readExternal(ObjectInput inpt) throws IOException, ClassNotFoundException {
//		type=Type.inType(inpt);
//		value=inpt.readObject();
//		Util.TRACE_INPUT("Constant: "+type+' '+value);
//	}
	
	// ***********************************************************************************************
	// *** Externalization
	// ***********************************************************************************************
	/**
	 * Default constructor used by Externalization.
	 */
	public Constant() {}

	@Override
	public void writeExternal(ObjectOutput oupt) throws IOException {
		Util.TRACE_OUTPUT("Constant: "+type+' '+value);
		if(!Option.NEW_ATTR_FILE)
			oupt.writeBoolean(CHECKED);
		oupt.writeInt(lineNumber);
		Type.outType(type,oupt);
		oupt.writeObject(backLink);
		oupt.writeObject(value);
	}

	@Override
	public void readExternal(ObjectInput inpt) throws IOException, ClassNotFoundException {
		if(!Option.NEW_ATTR_FILE)
			CHECKED=inpt.readBoolean();
		lineNumber = inpt.readInt();
		type = Type.inType(inpt);
		backLink = (SyntaxClass) inpt.readObject();
		value=inpt.readObject();
		Util.TRACE_INPUT("Constant: "+type+' '+value);
	}


}
