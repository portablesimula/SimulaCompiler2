/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.classfile.ClassSignature;
import java.lang.classfile.CodeBuilder;
import java.lang.constant.ClassDesc;
import java.lang.constant.ConstantDescs;
import java.lang.constant.MethodTypeDesc;

import simula.compiler.syntaxClass.declaration.ClassDeclaration;
import simula.compiler.syntaxClass.declaration.ConnectionBlock;
import simula.compiler.syntaxClass.declaration.Declaration;
import simula.compiler.syntaxClass.declaration.DeclarationScope;
import simula.compiler.syntaxClass.declaration.Parameter;
import simula.compiler.syntaxClass.declaration.StandardClass;
import simula.compiler.utilities.CD;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.KeyWord;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Token;
import simula.compiler.utilities.Util;

/**
 * Utility class Type.
 * <pre>
 * Syntax: 
 *     type = value-type
 *          | reference-type
 *          
 *        value-type = arithmetic-type
 *                   | boolean
 *                   | character
 *                   
 *           arithmetic-type = integer-type
 *                           | real-type
 *                           
 *              integer-type = [ short ] integer
 *              
 *              real-type = [ long ] real
 *              
 *              reference-type = object-reference-type
 *                             | text
 *                             
 *                 object-reference-type = ref "(" qualification ")"
 *                 
 *                    qualification = class-identifier
 * </pre>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/utilities/Type.java"><b>Source File</b></a>.
 * 
 * @author Øystein Myhre Andersen
 *
 */
public class Type extends SyntaxClass implements Externalizable {

	/**
	 * KeyWord or ref(classIdentifier)
	 */
	Token key;
	
	/**
	 * Qual in case of ref(Qual) type. Set by doChecking
	 */
	protected ClassDeclaration qual;   // Qual in case of ref(Qual) type; Set by doChecking below
	
	/**
	 * Qual's scope in case of ref(Qual) type. Set by doChecking
	 */
	public ConnectionBlock declaredIn; // Qual'scope in case of ref(Qual) type; Set by special constructor

	// **************************************************************************************************
	// *** BASIC TYPES
	// **************************************************************************************************
	/**
	 * Simula's Integer type
	 */
	public static final Type Integer = new Type(new Token(KeyWord.INTEGER));
	
	/**
	 * Simula's Real type
	 */
	public static final Type Real = new Type(new Token(KeyWord.REAL));

	/**
	 * Simula's Long Real type
	 */
	public static final Type LongReal = new Type(new Token(KeyWord.REAL, KeyWord.LONG));
	
	/**
	 * Simula's Boolean type
	 */
	public static final Type Boolean = new Type(new Token(KeyWord.BOOLEAN));
	
	/**
	 * Simula's Character type
	 */
	public static final Type Character = new Type(new Token(KeyWord.CHARACTER));
	
	/**
	 * Simula's Text type
	 */
	public static final Type Text = new Type(new Token(KeyWord.TEXT));
	
	/**
	 * Simula's Ref() type
	 */
	public static final Type Ref = new Type(new Token(KeyWord.REF));
	
	/**
	 * Simula's Ref(className) type
	 * @param className the class name
	 * @return a new ref(className) type.
	 */
	public static final Type Ref(String className) { return (new Type(className)); }
	
	/**
	 * Simula's Procedure type
	 */
	public static final Type Procedure = new Type(new Token(KeyWord.PROCEDURE));
	
	/**
	 * Simula's Label type
	 */
	public static final Type Label = new Type(new Token(KeyWord.LABEL));
	

	// **************************************************************************************************
	// *** TYPE CREATION - CONSTRUCTORES 
	// **************************************************************************************************

	/**
	 * Default constructor used by Externalization.
	 */
	public Type() {} // Externalization
	  
	/**
	 * Create a new simple Type with the given key Token
	 * @param key the given key Token
	 */
	public Type(Token key) { this.key=key; }

	/**
	 * Create a new ref(className) type.
	 * @param className the class name
	 */
	public Type(String className) {
		if(className==null) className="UNKNOWN"; // Error recovery
		if(!Option.CaseSensitive) className = className.toUpperCase();
		this.key=new Token(KeyWord.REF,className);
	}
	
	/**
	 * Create a new Type based on the given Type and ConnectionBlock.
	 * @param tp the given Type
	 * @param declaredIn the ConnectionBlock
	 */
	public Type(Type tp,ConnectionBlock declaredIn) {
		this.key = tp.key;
		this.qual = tp.qual;
		this.declaredIn = declaredIn;
	}
	
	
	// **************************************************************************************************
	// *** UTILITIES
	// **************************************************************************************************

	/**
	 * Returns the qualifying ClassDeclaration or null.
	 * @return the qualifying ClassDeclaration or null
	 */
	public ClassDeclaration getQual() {
		ASSERT_SEMANTICS_CHECKED();
		return (qual);
	}
	
	/**
	 * Returns the keyWord or the ref-identifier.
	 * @return the keyWord or the ref-identifier
	 */
	public KeyWord getKeyWord() { return(key.getKeyWord()); }
	
	
	public static boolean equals(Type type1,Type type2) {
		if(type1 == null) return(type2 == null);
		return(type1.equals(type2));
	}
	
	/**
	 * Returns the ref-identifier or null.
	 * @return the ref-identifier or null
	 */
	public String getRefIdent() {
		if(key.getKeyWord()==KeyWord.REF) {
			if(key.getValue()==null) return(null);
			return(key.getValue().toString());
		}
		return(null); 
	}
  
	/**
	 * Returns the Java ref-identifier or null.
	 * @return the Java ref-identifier or null
	 */
	public String getJavaRefIdent() {
		if(key.getKeyWord()==KeyWord.REF) {
			if(key.getValue()==null) return("RTS_RTObject");
			if(!IS_SEMANTICS_CHECKED()) this.doChecking(Global.getCurrentScope());
			if(qual==null) return("UNKNOWN");
			return(qual.getJavaIdentifier());
		}
		return(null); 
	}
	
    /**
     * Perform semantic checking in the given scope.
	 * @param scope the given scope
	 */
	public void doChecking(final DeclarationScope scope) {
		if(qual!=null) SET_SEMANTICS_CHECKED(); // This Ref-Type is read from attribute file
		if(IS_SEMANTICS_CHECKED()) return;
//		System.out.println("Type.doChecking: "+this+" in "+scope);
		Global.enterScope(scope);
		String refIdent=getRefIdent();
		if(refIdent!=null) {
			if(!refIdent.equals("RTS_LABEL") && !refIdent.equals("_UNKNOWN")) {
				Declaration decl=scope.findMeaning(refIdent).declaredAs;
			    if(decl instanceof ClassDeclaration cdecl) qual=cdecl;
			    else Util.error("Illegal Type: "+this.toString()+" - "+refIdent+" is not a Class");
			}
		}
		Global.exitScope();
		SET_SEMANTICS_CHECKED();
	}

	/**
	 * Returns true if this type is an arithmetic type.
	 * Integer, real or long real.
	 * @return true if this type is an arithmetic type.
	 */
	public boolean isArithmeticType() {
		return(this.equals(Type.Integer)||this.equals(Type.Real)||this.equals(Type.LongReal)); }

	/**
	 * Returns true if this type is a value type.
	 * Integer, real or long real.
	 * @return true if this type is a value type.
	 */
	public boolean isValueType() {
		return(this.equals(Type.Integer)||this.equals(Type.Real)||this.equals(Type.LongReal)
			 ||this.equals(Type.Boolean)||this.equals(Type.Character)); }
  
	/**
	 * Returns true if this type is ref() type.
	 * @return true if this type is ref() type
	 */
	public boolean isReferenceType() {
		if(key.getKeyWord()==KeyWord.REF) return(true);
		if(this.equals(Type.Text)) return(true);
		return(getRefIdent()!=null);
	}
	  
	/**
	 * Returns true if this type is ref(A) type.
	 * @return true if this type is ref(A) type
	 */
	public boolean isRefClassType() {
		if(key.getKeyWord()==KeyWord.REF) return(true);
		return(getRefIdent()!=null);
	}
  
	public boolean equals(final Object obj) {
		Type other=(Type) obj;
		return(this.key.equals(other.key));
	}
  
	/**
	 * Utility enum ConversionKind.
	 *
	 */
    public enum ConversionKind { 
    	/**
    	 * Type conversion is illegal.
    	 */
    	Illegal,
    	
    	/**
    	 * No type-conversion is necessary. E.g. integer to integer
    	 */
    	DirectAssignable,
    	
    	/**
    	 * Type-conversion with possible Runtime check is necessary. E.g. real to integer.
    	 */
    	ConvertValue,
    	
    	/**
    	 * Type-conversion with Runtime check is necessary. E.g. ref(A) to ref(B) where B is a subclass of A.
    	 */
    	ConvertRef
    }

	/**
     * Checks if a type-conversion is legal.
     * <p>
     * The possible return values are:
     * <ul>
     * <li>DirectAssignable - No type-conversion is necessary. E.g. integer to integer
     * <li>ConvertValue - Type-conversion with possible Runtime check is necessary. E.g. real to integer.
     * <li>ConvertRef - Type-conversion with Runtime check is necessary. E.g. ref(A) to ref(B) where B is a subclass of A.
     * <li>Illegal - Conversion is illegal
     * </ul>
     * @param to the to type-
     * @return the resulting ConversionKind
     */
    public ConversionKind isConvertableTo(final Type to) {
	    ConversionKind result;
	    if(to==null) result=ConversionKind.Illegal;
	    else if(this.equals(to)) result=ConversionKind.DirectAssignable;
	    else if(this.isArithmeticType()&&to.isArithmeticType()) result=ConversionKind.ConvertValue;
	    else if(this.isSubReferenceOf(to)) result=ConversionKind.DirectAssignable;  
	    else if(to.isSubReferenceOf(this)) result=ConversionKind.ConvertRef; // Needs Runtime-Check
	    else result=ConversionKind.Illegal;
		//System.out.println("Type.isConvertableTo: "+this+"  ==>  " + to + "   RESULT=" + result);
	    return(result); 
    }
  
    /**
     * Utility method isSubReferenceOf.
     * <p>
     * ref(B) is a sub-reference of ref(A) iff B is a subclass of A.
     * <p>
     * Any ref is a sub-reference of NONE
     * 
     * @param other the other type
     * @return true if the condition holds
     */
	public boolean isSubReferenceOf(final Type other) {
		String thisRef=this.getRefIdent(); // May be null for NONE
		String otherRef=other.getRefIdent(); // May be null for NONE
		boolean result;		
		if(otherRef==null) result=false;  // No ref is a super-reference of NONE
		else if(thisRef==null) result=true; // Any ref is a sub-reference of NONE
		else {
			ClassDeclaration thisDecl=(ClassDeclaration)Global.getCurrentScope().findMeaning(thisRef).declaredAs;
			ClassDeclaration otherDecl=(ClassDeclaration)Global.getCurrentScope().findMeaning(otherRef).declaredAs;
			if(thisDecl==null) result=false; // Error Recovery
			else result=thisDecl.isSubClassOf(otherDecl);
		}
		//System.out.println("Type.isSubReferenceOf: "+thisRef+"  ==>  " + otherRef + "   RESULT="+result);
		return(result); 
	}
  
	/**
	 * Returns the type to which both types can be converted.
	 * @param type1 argument
	 * @param type2 argument
	 * @return the resulting Type
	 */
	public static Type commonRefType(final Type type1,final Type type2) {
		if(type1.isSubReferenceOf(type2)) return(type2);
	    if(type2.isSubReferenceOf(type1)) return(type1);
		return(type1);
	}
  
	/**
	 * Returns the type to which both types can be converted.
	 * @param type1 argument
	 * @param type2 argument
	 * @return the resulting Type
	 */
	public static Type commonTypeConversion(final Type type1,final Type type2) {
		if(type1.equals(type2)) return(type1);
		Type atype=arithmeticTypeConversion(type1,type2);
		if(atype!=null) return(atype);
		if(type1.isReferenceType() && type2.isReferenceType()) {
			if(type1.isSubReferenceOf(type2)) return(type2);
		    if(type2.isSubReferenceOf(type1)) return(type1);
		    Util.error("Incompatible types: "+type1+", "+type2);
		    return(type1);
		}
		Util.error("Incompatible types: "+type1+", "+type2);
		return(null);
	}
	
	/**
	 * Returns the most dominant type.
	 * @param type1 argument
	 * @param type2 argument
	 * @return the most dominant type
	 */
	public static Type arithmeticTypeConversion(final Type type1,final Type type2) {
		if(type1.equals(Type.Integer)) {
			if(type2.equals(Type.Integer)) return(Type.Integer); 
			else if(type2.equals(Type.Real)) return(Type.Real);
			else if(type2.equals(Type.LongReal)) return(Type.LongReal);
		}
		else if(type1.equals(Type.Real)) {
			if(type2.equals(Type.Integer)) return(Type.Real); 
			else if(type2.equals(Type.Real)) return(Type.Real);
			else if(type2.equals(Type.LongReal)) return(Type.LongReal);
		}
		else if(type1.equals(Type.LongReal)) {
			if(type2.equals(Type.Integer)) return(Type.LongReal); 
			else if(type2.equals(Type.Real)) return(Type.LongReal);
			else if(type2.equals(Type.LongReal)) return(Type.LongReal);
		}
		return(null);  
	}
  
	/**
	 * Returns an edited default value of this Type.
	 * @return an edited default value of this Type
	 */
	public String edDefaultValue() {
		if(key==null) return("void");
		if(key.getKeyWord()==KeyWord.IDENTIFIER) return(null);
		if(key.getKeyWord()==KeyWord.REF) return("null");
		if(this.equals(LongReal)) return("0.0d");
		if(this.equals(Real)) return("0.0f");
		if(this.equals(Integer)) return("0");
		if(this.equals(Boolean)) return("false");
		if(this.equals(Character)) return("0");
		if(this.equals(Text)) return("null");
		if(this.equals(Label)) return("null");
		return(this.toString());
	}
  
	/**
	 * Codeing utility: toJavaType.
	 * @return the resulting code string.
	 */
	public String toJavaType() {
		if(key==null) return("void");
	    //if(this.equals(Array)) return("array"); // ARRAY Elements 
		if(key.getKeyWord()==KeyWord.REF) return(getJavaRefIdent());
		if(this.equals(LongReal)) return("double");
		if(this.equals(Real)) return("float");
		if(this.equals(Integer)) return("int");
		if(this.equals(Boolean)) return("boolean");
		if(this.equals(Character)) return("char");
		if(this.equals(Text)) return("RTS_TXT");
		if(this.equals(Procedure)) return("RTS_PRCQNT");
		if(this.equals(Label)) return("RTS_LABEL");
		return(this.toString());
	}
	 
	/**
	 * Codeing utility: toJavaTypeClass.
	 * @return the resulting code string.
	 */
	public String toJavaTypeClass() {
		if(key==null) return("void");
		if(key.getKeyWord()==KeyWord.REF) return(getJavaRefIdent());
		if(this.equals(LongReal)) return("Double");
		if(this.equals(Real)) return("Float");
		if(this.equals(Integer)) return("Integer");
		if(this.equals(Boolean)) return("Boolean");
		if(this.equals(Character)) return("Character");
		if(this.equals(Text)) return("RTS_TXT");
		return(this.toString());
	}
	
	/**
	 * Codeing utility: toJavaArrayType.
	 * @return the resulting code string.
	 */
	public String toJavaArrayType() {
		if(key.getKeyWord()==KeyWord.REF) {
			String rtQual=getJavaRefIdent();
			return("RTS_REF_ARRAY<"+rtQual+">");
		}
		if(this.equals(LongReal)) return("RTS_LONG_REAL_ARRAY");
		if(this.equals(Real)) return("RTS_REAL_ARRAY");
		if(this.equals(Integer)) return("RTS_INTEGER_ARRAY");
		if(this.equals(Boolean)) return("RTS_BOOLEAN_ARRAY");
		if(this.equals(Character)) return("RTS_CHARACTER_ARRAY");
		if(this.equals(Text)) return("RTS_TEXT_ARRAY");
//		if(this.equals(Procedure)) return("RTS_PRCQNT");
//		if(this.equals(Label)) return("RTS_LABEL");
		Util.IERR("");
		return(this.toString());
	}

	public String toJavaArrayType2() {
		if(key.getKeyWord()==KeyWord.REF) {
			return("RTS_REF_ARRAY");
		}
		return(this.toJavaArrayType());
	}
	
	public String getArrayType() {   // TESTING_ARRAY
		if(this==Type.Integer)     return("RTS_INTEGER_ARRAY");
		if(this==Type.Character)   return("RTS_CHARACTER_ARRAY");
		if(this==Type.Boolean)     return("RTS_BOOLEAN_ARRAY");
		if(this==Type.Real)        return("RTS_REAL_ARRAY");
		if(this==Type.LongReal)    return("RTS_LONG_REAL_ARRAY");
		if(this==Type.Text)        return("RTS_TEXT_ARRAY");
		if(this.isReferenceType()) return("RTS_REF_ARRAY");
		Util.IERR("IMPOSSIBLE");   return(null);
	}

	/**
	 * Coding utility: toJVMType.
	 * @return the resulting code string.
	 */
	public String toJVMType() {
		String jvmType=toPrivJVMType();
//		System.out.println("Type.toJVMType(): "+ this +"  ==>  "+jvmType+" ##########################################################");
		return(jvmType);
	}
	private String toPrivJVMType() {
		if(key==null) return("V");
//		if(key.getKeyWord()==KeyWord.REF) return(getJavaRefIdent());
		if(this.equals(LongReal)) return("D");
		if(this.equals(Real)) return("F");
		if(this.equals(Integer)) return("I");
		if(this.equals(Boolean)) return("Z");
		if(this.equals(Character)) return("C");
		if(this.equals(Text)) return("Lsimula/runtime/RTS_TXT;");
		if(this.equals(Procedure)) return("Lsimula/runtime/RTS_PRCQNT;");
		if(this.equals(Label)) return("Lsimula/runtime/RTS_LABEL;");
		if(this.isReferenceType()) {
			String refIdent=this.getJavaRefIdent();
			if(this.getQual() instanceof StandardClass)
				return("Lsimula/runtime/"+refIdent+";");
			else if(refIdent.startsWith("RTS_"))
				 return("Lsimula/runtime/"+refIdent+";");
			else return("L"+Global.packetName+"/"+refIdent+";");
		}
		System.out.println("KeyWord="+key.getKeyWord());
		Util.IERR("NOT IMPLEMENTED: "+this);
		return(null);
	}

	// Used by: Thunk.buildClassFile
	public static String toJVMClassType(Type type,Parameter.Kind kind) {
		if(kind!=null && kind.equals(Parameter.Kind.Procedure)) return("Lsimula/runtime/RTS_PRCQNT;");
//		if(key==null) return("V");
//		if(key.getKeyWord()==KeyWord.REF) return(getJavaRefIdent());
		if(type.equals(LongReal)) return("Ljava/lang/Double;");
		if(type.equals(Real)) return("Ljava/lang/Float;");
		if(type.equals(Integer)) return("Ljava/lang/Integer;");
		if(type.equals(Boolean)) return("Ljava/lang/Boolean;");
		if(type.equals(Character)) return("Ljava/lang/Character;");
		if(type.equals(Text)) return("Lsimula/runtime/RTS_TXT;");
		if(type.equals(Procedure)) return("Lsimula/runtime/RTS_PRCQNT;");
		if(type.equals(Label)) return("Lsimula/runtime/RTS_LABEL;");
		if(type.isReferenceType()) {
			String refIdent=type.getJavaRefIdent();
			if(type.getQual() instanceof StandardClass)
				return("Lsimula/runtime/"+refIdent+";");
			else if(refIdent.startsWith("RTS_"))
				 return("Lsimula/runtime/"+refIdent+";");
			else return("L"+Global.packetName+"/"+refIdent+";");
		}
//		System.out.println("KeyWord="+key.getKeyWord());
		Util.IERR("NOT IMPLEMENTED: "+type);
		return(null);
	}

	/**
	 * Coding utility: toClassDesc.
	 * @return the resulting Class Descriptor.
	 */
	public ClassDesc toClassDesc(Declaration declaredIn) {
		if(key.getKeyWord()==KeyWord.REF) {
			// CD.RTS_RTObject
			String refID=getJavaRefIdent();
//			String refID=getRefIdent();
//			System.out.println("Type.toClassDesc: refID="+refID);
			if(declaredIn != null) {
//				System.out.println("Type.toClassDesc: refID="+refID+", declaredIn.declarationKind="+declaredIn.declarationKind);
				if(declaredIn.declarationKind == Declaration.Kind.StandardClass) {
					ClassDesc classDesc = ClassDesc.of("simula.runtime."+refID);
//					System.out.println("Type.toClassDesc: "+ this +"  ==>  classDesc = ClassDesc.of(\"simula.runtime."+refID+"\")");
					return(classDesc);
				}
				if(declaredIn.declarationKind == Declaration.Kind.MemberMethod) {
					ClassDesc classDesc = ClassDesc.of("simula.runtime."+refID);
//					System.out.println("Type.toClassDesc: "+ this +"  ==>  classDesc = ClassDesc.of(\"simula.runtime."+refID+"\")");
					return(classDesc);
				}
			}
		}
//		System.out.println("Type.toClassDesc: "+ this +"  ==>  classDesc = " + toClassDesc());
		return(toClassDesc());
	}

	/**
	 * Coding utility: toClassDesc.
	 * @return the resulting Class Descriptor.
	 */
	public ClassDesc toClassDesc() {
		if(key==null) return(ConstantDescs.CD_void);
//		if(key.getKeyWord()==KeyWord.REF) return(getJavaRefIdent());
		if(this.equals(LongReal))  return(ConstantDescs.CD_double);
		if(this.equals(Real))      return(ConstantDescs.CD_float);
		if(this.equals(Integer))   return(ConstantDescs.CD_int);
		if(this.equals(Boolean))   return(ConstantDescs.CD_boolean);
		if(this.equals(Character)) return(ConstantDescs.CD_char);
		if(this.equals(Text))      return(CD.RTS_TXT);
		if(this.equals(Procedure)) return(CD.RTS_PRCQNT);
		if(this.equals(Label))     return(CD.RTS_LABEL);
		if(this.isReferenceType()) return(this.getQual().getClassDesc());
		Util.IERR("NOT IMPLEMENTED: "+this);
		return(null);
	}

	public ClassDesc toClassDesc(Parameter.Kind kind,Parameter.Mode mode) {
		if (mode == Parameter.Mode.name) return(CD.RTS_NAME);
		else switch(kind) { // Parameter.Kind
			case Array:			  return(CD.RTS_ARRAY);
			case Label:           return(CD.RTS_LABEL);
			case Procedure:       return(CD.RTS_PRCQNT);
			case Simple: default: return(this.toClassDesc(declaredIn));
		}
	}

	public ClassDesc toClassDesc2(Parameter.Kind kind,Parameter.Mode mode) {
		if (mode == Parameter.Mode.name) return(CD.RTS_NAME);
		else switch(kind) {
			case Array:     return(CD.RTS_ARRAY);
			case Label:     return(CD.RTS_LABEL);
			case Procedure: return(CD.RTS_PRCQNT);
			case Simple: default: return(this.toClassDesc(declaredIn));
		}
	}
	public ClassDesc toObjectClassDesc() {
		if(key==null) return(ConstantDescs.CD_void);
//		if(key.getKeyWord()==KeyWord.REF) return(getJavaRefIdent());
		if(this.equals(LongReal))  return(ConstantDescs.CD_Double);
		if(this.equals(Real))      return(ConstantDescs.CD_Float);
		if(this.equals(Integer))   return(ConstantDescs.CD_Integer);
		if(this.equals(Boolean))   return(ConstantDescs.CD_Boolean);
		if(this.equals(Character)) return(ConstantDescs.CD_Character);
		if(this.equals(Text))      return(CD.RTS_TXT);
		if(this.equals(Procedure)) return(CD.RTS_PRCQNT);
		if(this.equals(Label))     return(CD.RTS_LABEL);
		if(this.isReferenceType()) return(this.getQual().getClassDesc());
		Util.IERR("NOT IMPLEMENTED: "+this);
		return(null);
	}
	
	public String toJVMType(Parameter.Kind kind,Parameter.Mode mode) {
	String jvmType=toClassDesc(kind,mode).descriptorString();
//	System.out.println("Parameter.toJVMType: "+ this +"  ==>  "+jvmType+" ##########################################################");
//	Util.IERR("");
	return(jvmType);
}

	/**
	 * Coding utility: toClassSignatureString.
	 * @return the resulting Class Signature.
	 */
	public String toClassSignatureString() {
		return(toClassSignatureString(null));
	}
	public String toClassSignatureString(Parameter.Mode mode) {
		String CS=null;
		if (mode == Parameter.Mode.name) {
			if(this.equals(Type.Integer)) CS = "Lsimula/runtime/RTS_NAME<Ljava/lang/Integer;>;";
			else if(this.equals(Type.Real)) CS = "Lsimula/runtime/RTS_NAME<Ljava/lang/Float;>;";
			else if(this.equals(Type.LongReal)) CS = "Lsimula/runtime/RTS_NAME<Ljava/lang/Double;>;";
			else Util.IERR("FYLL PÅ FLERE TYPER"); // TODO: FYLL PÅ FLERE TYPER
		} else {
			if(mode == Parameter.Mode.value) {
//				Util.IERR("");
			}
			CS = toJVMType();
		}
//		System.out.println("Type.toClassSignature: "+this+" ==> CS "+CS);
//		Util.IERR("");
		return(CS);
	}

	/**
	 * Coding utility: toClassSignature.
	 * @return the resulting Class Signature.
	 */
	public ClassSignature toClassSignature() {
		return(toClassSignature(null));
	}
	public ClassSignature toClassSignature(Parameter.Mode mode) {
		ClassSignature CS=null;
		if (mode == Parameter.Mode.name) {
			if(this.equals(Type.Integer)) CS = ClassSignature.parseFrom("Lsimula/runtime/RTS_NAME<Ljava/lang/Integer;>;");
			else if(this.equals(Type.Real)) CS = ClassSignature.parseFrom("Lsimula/runtime/RTS_NAME<Ljava/lang/Float;>;");
			else if(this.equals(Type.LongReal)) CS = ClassSignature.parseFrom("Lsimula/runtime/RTS_NAME<Ljava/lang/Double;>;");
			else if(this.equals(Type.Boolean)) CS = ClassSignature.parseFrom("Lsimula/runtime/RTS_NAME<Ljava/lang/Boolean;>;");
			else if(this.equals(Type.Character)) CS = ClassSignature.parseFrom("Lsimula/runtime/RTS_NAME<Ljava/lang/Character;>;");
			else if(this.equals(Type.Text)) CS = ClassSignature.parseFrom("Lsimula/runtime/RTS_NAME<Lsimula/runtime/TXT;>;");
			else if(this.equals(Type.Label)) CS = ClassSignature.parseFrom("Lsimula/runtime/RTS_NAME<Lsimula/runtime/RTS_RTObject$RTS_LABEL;>;");
			else if(this.isReferenceType()) {
				String sig="Lsimula/runtime/RTS_NAME<"+this.toJVMType()+">;";
//				System.out.println("Type.toClassSignature: "+sig);
				CS = ClassSignature.parseFrom(sig);
//				Util.IERR(""+CS);
			}
			else Util.IERR("FYLL PÅ FLERE TYPER: "+this); // TODO: FYLL PÅ FLERE TYPER
		} else {
			ClassDesc CD=null;
			if(mode == Parameter.Mode.value) {
				CD=this.toClassDesc(declaredIn);
//				Util.IERR("");
			} else {
				CD=this.toClassDesc(declaredIn);
			}
//			System.out.println("Type.toClassSignature: "+this+" ==> CD "+CD);
			String jvmType=CD.descriptorString();
			System.out.println("Type.toClassSignature: "+this+" ==> jvmType "+jvmType);
			CS = ClassSignature.parseFrom(jvmType);
		}
//		System.out.println("Type.toClassSignature: "+this+" ==> CS "+CS);
//		Util.IERR("");
		return(CS);
	}

	/**
	 * Coding utility: toArrayClassSignature.
	 * @return the resulting Array Class Signature.
	 */
	public ClassSignature toArrayClassSignature() {
		ClassSignature CS = null;
		if(key.getKeyWord()==KeyWord.REF) {
			String T = this.toJVMType();
//			System.out.println("Type.toClassSignature: "+this.toJVMType());
//			CS = ClassSignature.parseFrom("Lsimula/runtime/RTS_RTObject$RTS_REF_ARRAY<LsimulaTestPrograms/adHoc03_A;>;");
			CS = ClassSignature.parseFrom("Lsimula/runtime/RTS_RTObject$RTS_REF_ARRAY<"+T+">;");
//			System.out.println("Type.toClassSignature: "+this+" ==> CS "+CS);
		} else if(this.equals(Type.Text)) {
//			System.out.println("Type.toClassSignature: "+this.toJVMType());
			CS = ClassSignature.parseFrom(this.toJVMType());
//			Util.IERR("");
//		} else if(this.equals(Type.Integer) {
//			System.out.println("Type.toClassSignature: "+this.toJVMType());
//			CS = null;
		}	else if(this.equals(Type.Integer)) CS = ClassSignature.parseFrom("Ljava/lang/Integer;");
			else if(this.equals(Type.Real)) CS = ClassSignature.parseFrom("Lsimula/runtime/RTS_NAME<Ljava/lang/Float;>;");
			else if(this.equals(Type.LongReal)) CS = ClassSignature.parseFrom("Lsimula/runtime/RTS_NAME<Ljava/lang/Double;>;");
			else if(this.equals(Type.Boolean)) CS = ClassSignature.parseFrom("Lsimula/runtime/RTS_NAME<Ljava/lang/Boolean;>;");
			else if(this.equals(Type.Character)) CS = ClassSignature.parseFrom("Lsimula/runtime/RTS_NAME<Ljava/lang/Character;>;");

			else 
				Util.IERR("");
//		} else Util.IERR(""+this);
		return(CS);
	}
	
	public void buildObjectValueOf(CodeBuilder codeBuilder) {
		if(this.equals(Type.Integer))
			codeBuilder.invokestatic(ConstantDescs.CD_Integer, "valueOf", MethodTypeDesc.ofDescriptor("(I)Ljava/lang/Integer;"));
		else if(this.equals(Type.Real))
			codeBuilder.invokestatic(ConstantDescs.CD_Float, "valueOf", MethodTypeDesc.ofDescriptor("(F)Ljava/lang/Float;"));
		else if(this.equals(Type.LongReal))
			codeBuilder.invokestatic(ConstantDescs.CD_Double, "valueOf", MethodTypeDesc.ofDescriptor("(D)Ljava/lang/Double;"));
		else if(this.equals(Type.Boolean))
			codeBuilder.invokestatic(ConstantDescs.CD_Boolean, "valueOf", MethodTypeDesc.ofDescriptor("(Z)Ljava/lang/Boolean;"));
		else if(this.equals(Type.Character))
			codeBuilder.invokestatic(ConstantDescs.CD_Character, "valueOf", MethodTypeDesc.ofDescriptor("(C)Ljava/lang/Character;"));
//		else Util.IERR("FYLL PÅ FLERE TYPE: "+par.type+"  "+par+"  "+par.declaredIn);
	}

	@Override
	public String toString() {
		if(key==null) return("null");
		if(key.getKeyWord()==KeyWord.REF) {
			if(declaredIn==null) {
				if(qual==null) return("ref("+key.getValue()+')');
				return("ref("+key.getValue()+") qualified by Class "+qual.identifier+" with block level "+qual.ctBlockLevel);
			}
			return("ref("+key.getValue()+") declared in "+declaredIn.identifier+" with block level "+declaredIn.ctBlockLevel);
		}
		if(this.equals(LongReal)) return("LONG REAL"); 
		return(key.toString().toUpperCase());
	}

	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************

	public static void outType(Type type,ObjectOutput oupt) throws IOException {
		if(Option.NEW_ATTR_FILE) {
			if(type == null) {
				oupt.writeObject(KeyWord.NONE);
			} else {
//				type.key.writeATTR(oupt);
				oupt.writeObject(type.key.keyWord);
				oupt.writeObject(type.key.value);
			}
//			oupt.writeObject(qual);
//			oupt.writeObject(declaredIn);
		} else {
			oupt.writeObject(type);			
		}
	}
	
	/**
	 * Read a type from an ObjectInput file.
	 * @param inpt the ObjectInput
	 * @return the resulting Type
	 * @throws IOException if an IOException occur
	 * @throws ClassNotFoundException if the operation failed
	 */
	public static Type inType(ObjectInput inpt) throws IOException, ClassNotFoundException {
		if(Option.NEW_ATTR_FILE) {
//			Token key=Token.readAttr(inpt);
			KeyWord keyWord = (KeyWord) inpt.readObject();
			if(keyWord == KeyWord.NONE) return(null);
			Object value = inpt.readObject();
			Token key = new Token("",keyWord,value);

			
//			qual=(ClassDeclaration) inpt.readObject();
//			declaredIn=(ConnectionBlock) inpt.readObject();
			return(new Type(key));			
		} else {
			Type tp=(Type)inpt.readObject();
			return(tp);
		}
	}

//	public static Type readAttr(ObjectInput inpt) throws IOException, ClassNotFoundException {
//		Token key=Token.readAttr(inpt);
////		qual=(ClassDeclaration) inpt.readObject();
////		declaredIn=(ConnectionBlock) inpt.readObject();
//		return(new Type(key));
//	}

	// ***********************************************************************************************
	// *** Externalization
	// ***********************************************************************************************

	@Override
	public void writeExternal(ObjectOutput oupt) throws IOException {
		if(Option.NEW_ATTR_FILE) Util.IERR("");
		oupt.writeObject(key);
		oupt.writeObject(qual);
		oupt.writeObject(declaredIn);
	}

	@Override
	public void readExternal(ObjectInput inpt) throws IOException, ClassNotFoundException {
		if(Option.NEW_ATTR_FILE) Util.IERR("");
		key = (Token)inpt.readObject();
		qual = (ClassDeclaration) inpt.readObject();
		declaredIn = (ConnectionBlock) inpt.readObject();
	}
	
}
