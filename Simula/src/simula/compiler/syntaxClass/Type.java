/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass;

import java.io.Externalizable;
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
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Option;
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
public class Type extends SyntaxClass {

//	/**
//	 * KeyWord or ref(classIdentifier)
//	 */
//	Token key;
	/**
	 * The keyWord attribute
	 */
	public int keyWord;
	
	/**
	 * The Class Identifier in case of ref(classIdent)
	 */
	public String classIdent;
	
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
//	/**
//	 * Simula's Integer type
//	 */
//	public static final Type Integer = new Type(new Token(KeyWord.INTEGER));
//	
//	/**
//	 * Simula's Real type
//	 */
//	public static final Type Real = new Type(new Token(KeyWord.REAL));
//
//	/**
//	 * Simula's Long Real type
//	 */
//	public static final Type LongReal = new Type(new Token(KeyWord.REAL, KeyWord.LONG));
//	
//	/**
//	 * Simula's Boolean type
//	 */
//	public static final Type Boolean = new Type(new Token(KeyWord.BOOLEAN));
//	
//	/**
//	 * Simula's Character type
//	 */
//	public static final Type Character = new Type(new Token(KeyWord.CHARACTER));
//	
//	/**
//	 * Simula's Text type
//	 */
//	public static final Type Text = new Type(new Token(KeyWord.TEXT));
//	
//	/**
//	 * Simula's Ref() type
//	 */
//	public static final Type Ref = new Type(new Token(KeyWord.REF));
//	
//	/**
//	 * Simula's Ref(classIdent) type
//	 * @param classIdent the class name
//	 * @return a new ref(classIdent) type.
//	 */
//	public static final Type Ref(String classIdent) { return (new Type(classIdent)); }
//	
//	/**
//	 * Simula's Procedure type
//	 */
//	public static final Type Procedure = new Type(new Token(KeyWord.PROCEDURE));
//	
//	/**
//	 * Simula's Label type
//	 */
//	public static final Type Label = new Type(new Token(KeyWord.LABEL));
//	
//
	/** Simula's Integer type */	public static final int T_INTEGER = 1001;
	/** Simula's Real type */		public static final int T_REAL = 1002;
	/** Simula's Long Real type */	public static final int T_LONG_REAL = 1003;
	/** Simula's Boolean type */	public static final int T_BOOLEAN = 1004;
	/** Simula's Character type */	public static final int T_CHARACTER = 1005;
	/** Simula's Text type */		public static final int T_TEXT = 1006;
	/** Simula's Ref() type */		public static final int T_REF = 1007;
	/** Simula's Procedure type */	public static final int T_PROCEDURE = 1008;
	/** Simula's Label type */		public static final int T_LABEL = 1009;
	

	/** Simula's Integer type */	public static final Type Integer = new Type(Type.T_INTEGER);
	/** Simula's Real type */		public static final Type Real = new Type(Type.T_REAL);
	/** Simula's Long Real type */	public static final Type LongReal = new Type(Type.T_LONG_REAL);
	/** Simula's Boolean type */	public static final Type Boolean = new Type(Type.T_BOOLEAN);
	/** Simula's Character type */	public static final Type Character = new Type(Type.T_CHARACTER);
	/** Simula's Text type */		public static final Type Text = new Type(Type.T_TEXT);
	/** Simula's Ref() type */		public static final Type Ref = new Type(Type.T_REF);
	/** Simula's Procedure type */	public static final Type Procedure = new Type(Type.T_PROCEDURE);
	/** Simula's Label type */		public static final Type Label = new Type(Type.T_LABEL);
	
	/**
	 * Simula's Ref(classIdent) type
	 * @param classIdent the class name
	 * @return a new ref(classIdent) type.
	 */
	public static final Type Ref(String classIdent) { return (new Type(Type.T_REF,classIdent)); }
	

	// **************************************************************************************************
	// *** TYPE CREATION - CONSTRUCTORES 
	// **************************************************************************************************

//	/**
//	 * Default constructor used by Externalization.
//	 */
//	public Type() {} // Externalization
	  
	/**
	 * Create a new simple Type with the given keyWord
	 * @param key the given keyWord
	 */
	private Type(int keyWord) {
		this.keyWord = keyWord;
	}
	
	public Type(int keyWord, String classIdent) {
//		if(classIdent==null) classIdent="UNKNOWN"; // Error recovery
		if(classIdent != null && !Option.CaseSensitive) classIdent = classIdent.toUpperCase();
//		this.key=new Token(KeyWord.REF,classIdent);
		this.keyWord = keyWord;
		this.classIdent = classIdent;
	}

	/**
	 * Create a new ref(classIdent) type.
	 * @param classIdent the class name
	 */
	public Type(String classIdent) {
		this(T_REF,classIdent);
	}
	
	/**
	 * Create a new Type based on the given Type and ConnectionBlock.
	 * @param tp the given Type
	 * @param declaredIn the ConnectionBlock
	 */
	public Type(Type tp,ConnectionBlock declaredIn) {
//		this.key = tp.key;
		this.keyWord = tp.keyWord;
		this.classIdent = tp.classIdent;
		
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
//	public int getKeyWord() { return(key.getKeyWord()); }
	public int getKeyWord() { return(this.keyWord); }
	
	
	public static boolean equals(Type type1,Type type2) {
		if(type1 == null) return(type2 == null);
		return(type1.equals(type2));
	}
	
	/**
	 * Returns the ref-identifier or null.
	 * @return the ref-identifier or null
	 */
	public String getRefIdent() {
//		if(key.getKeyWord()==KeyWord.REF) {
//			if(key.getValue()==null) return(null);
//			return(key.getValue().toString());
//		}
		if(keyWord == Type.T_REF) return(classIdent);
		return(null); 
	}
  
	/**
	 * Returns the Java ref-identifier or null.
	 * @return the Java ref-identifier or null
	 */
	public String getJavaRefIdent() {
//		if(key.getKeyWord()==KeyWord.REF) {
//			if(key.getValue()==null) return("RTS_RTObject");
		if(keyWord == Type.T_REF) {
			if(classIdent == null) return("RTS_RTObject");
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
//		if(key.getKeyWord()==KeyWord.REF) return(true);
		if(keyWord == Type.T_REF) return(true);
		if(this.equals(Type.Text)) return(true);
		return(getRefIdent()!=null);
	}
	  
	/**
	 * Returns true if this type is ref(A) type.
	 * @return true if this type is ref(A) type
	 */
	public boolean isRefClassType() {
//		if(key.getKeyWord()==KeyWord.REF) return(true);
		if(keyWord == Type.T_REF) return(true);
		return(getRefIdent()!=null);
	}
  
	public boolean equals(final Object obj) {
		Type other=(Type) obj;
//		return(this.key.equals(other.key));
		if(this.keyWord != other.keyWord) return(false);
		if (this.classIdent == other.classIdent)
			return (true);
		if (this.classIdent == null)
			return (false);
		if (other.classIdent == null)
			return (false);
		if (!this.classIdent.equals(other.classIdent))
			return (false);
		return (true);
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
//		if(key==null) return("void");
		if(keyWord == 0) {
			Util.IERR("FOREKOMMER DETTE ?");
			return("void");
		}
//		if(key.getKeyWord()==KeyWord.IDENTIFIER) return(null);
//		if(keyWord == KeyWord.IDENTIFIER) {
//			Util.IERR("FOREKOMMER DETTE ?");
//			return(null);
//		}
		if(keyWord == Type.T_REF) return("null");
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
	 * Coding utility: toJavaType.
	 * @return the resulting code string.
	 */
	public String toJavaType() {
//		if(key==null) return("void");
		if(keyWord == 0) {
			Util.IERR("FOREKOMMER DETTE ?");
			return("void");
		}
	    //if(this.equals(Array)) return("array"); // ARRAY Elements 
		if(keyWord == Type.T_REF) return(getJavaRefIdent());
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
	 * Coding utility: toJavaTypeClass.
	 * @return the resulting code string.
	 */
	public String toJavaTypeClass() {
//		if(key==null) return("void");
		if(keyWord == 0) {
			Util.IERR("FOREKOMMER DETTE ?");
			return("void");
		}
		if(keyWord == Type.T_REF) return(getJavaRefIdent());
		if(this.equals(LongReal)) return("Double");
		if(this.equals(Real)) return("Float");
		if(this.equals(Integer)) return("Integer");
		if(this.equals(Boolean)) return("Boolean");
		if(this.equals(Character)) return("Character");
		if(this.equals(Text)) return("RTS_TXT");
		return(this.toString());
	}
	
	/**
	 * Coding utility: toJavaArrayType.
	 * @return the resulting code string.
	 */
	public String toJavaArrayType() {
		if(keyWord == Type.T_REF) {
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
		if(keyWord == Type.T_REF) {
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
//		if(key==null) return("V");
		if(keyWord == 0) {
			Util.IERR("FOREKOMMER DETTE ?");
			return("V");
		}
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
		System.out.println("KeyWord="+keyWord);
		Util.IERR("NOT IMPLEMENTED: "+this);
		return(null);
	}

	// Used by: Thunk.buildClassFile
	public static String toJVMClassType(Type type,int kind) {
		if(kind == Parameter.Kind.Procedure) return("Lsimula/runtime/RTS_PRCQNT;");
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
		if(keyWord == Type.T_REF) {
			// CD.RTS_RTObject
			String refID=getJavaRefIdent();
//			String refID=getRefIdent();
//			System.out.println("Type.toClassDesc: refID="+refID);
			if(declaredIn != null) {
//				System.out.println("Type.toClassDesc: refID="+refID+", declaredIn.declarationKind="+declaredIn.declarationKind);
				if(declaredIn.declarationKind == ObjectKind.StandardClass) {
					ClassDesc classDesc = ClassDesc.of("simula.runtime."+refID);
//					System.out.println("Type.toClassDesc: "+ this +"  ==>  classDesc = ClassDesc.of(\"simula.runtime."+refID+"\")");
					return(classDesc);
				}
				if(declaredIn.declarationKind == ObjectKind.MemberMethod) {
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
//		if(key==null) return(ConstantDescs.CD_void);
		if(keyWord == 0) {
			Util.IERR("FOREKOMMER DETTE ?");
			return(ConstantDescs.CD_void);
		}
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

	public ClassDesc toClassDesc(int kind,int mode) {
		if (mode == Parameter.Mode.name) return(CD.RTS_NAME);
		else switch(kind) { // Parameter.Kind
			case Parameter.Kind.Array:			 return(CD.RTS_ARRAY);
			case Parameter.Kind.Label:           return(CD.RTS_LABEL);
			case Parameter.Kind.Procedure:       return(CD.RTS_PRCQNT);
			case Parameter.Kind.Simple: default: return(this.toClassDesc(declaredIn));
		}
	}

	public ClassDesc toClassDesc2(int kind,int mode) {
		if (mode == Parameter.Mode.name) return(CD.RTS_NAME);
		else switch(kind) {
			case Parameter.Kind.Array:     return(CD.RTS_ARRAY);
			case Parameter.Kind.Label:     return(CD.RTS_LABEL);
			case Parameter.Kind.Procedure: return(CD.RTS_PRCQNT);
			case Parameter.Kind.Simple: default: return(this.toClassDesc(declaredIn));
		}
	}
	public ClassDesc toObjectClassDesc() {
//		if(key==null) return(ConstantDescs.CD_void);
		if(keyWord == 0) {
			Util.IERR("FOREKOMMER DETTE ?");
			return(ConstantDescs.CD_void);
		}
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
	
	public String toJVMType(int kind,int mode) {
	String jvmType=toClassDesc(kind,mode).descriptorString();
	return(jvmType);
}

	/**
	 * Coding utility: toClassSignatureString.
	 * @return the resulting Class Signature.
	 */
	public String toClassSignatureString() {
		return(toClassSignatureString(0));
	}
	public String toClassSignatureString(int mode) {
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
		return(toClassSignature(0));
	}
	public ClassSignature toClassSignature(int mode) {
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
		if(keyWord == Type.T_REF) {
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
//	public String toString() {
//		if(key==null) return("null");
//		if(key.getKeyWord()==KeyWord.REF) {
//			if(declaredIn==null) {
//				if(qual==null) return("ref("+key.getValue()+')');
//				return("ref("+key.getValue()+") qualified by Class "+qual.identifier+" with block level "+qual.ctBlockLevel);
//			}
//			return("ref("+key.getValue()+") declared in "+declaredIn.identifier+" with block level "+declaredIn.ctBlockLevel);
//		}
//		if(this.equals(LongReal)) return("LONG REAL"); 
//		return(key.toString().toUpperCase());
//	}
	public String toString() {
//		if(key==null) return("null");
		if(keyWord == Type.T_REF) {
			if(declaredIn==null) {
				if(qual==null) return("ref("+classIdent+')');
				return("ref("+classIdent+") qualified by Class "+qual.identifier+" with block level "+qual.ctBlockLevel);
			}
			return("ref("+classIdent+") declared in "+declaredIn.identifier+" with block level "+declaredIn.ctBlockLevel);
		}
		if(this.equals(LongReal)) return("LONG REAL"); 
		//return (KeyWord.edit(keyWord).toUpperCase());+
		switch(keyWord) {
			case T_INTEGER:		return "Integer";
			case T_REAL:		return "Real";
			case T_LONG_REAL:	return "Long Real";
			case T_BOOLEAN:		return "Boolean";
			case T_CHARACTER:	return "Character";
			case T_TEXT:		return "Text";
			case T_REF:			return "Ref()";
			case T_PROCEDURE:	return "Procedure";
			case T_LABEL:		return "Label";
		}
		return "UNKNOWN";
	}

//	// ***********************************************************************************************
//	// *** Attribute File I/O
//	// ***********************************************************************************************
//
////	public static void outType(Type type,DataOutput oupt) throws IOException {
//	public static void outType(Type type,AttributeOutputStream oupt) throws IOException {
//		if(type == null) {
//			oupt.writeInt(-1);
//		} else {
//			oupt.writeInt(type.keyWord);
//			oupt.writeString(type.classIdent);
//		}
////		oupt.writeObject(qual);
////		oupt.writeObject(declaredIn);
//	}
//	
//	/**
//	 * Read a type from an ObjectInput file.
//	 * @param inpt the AttributeInputStream
//	 * @return the resulting Type
//	 * @throws IOException if an IOException occur
//	 * @throws ClassNotFoundException if the operation failed
//	 */
//	public static Type inType(AttributeInputStream inpt) throws IOException {
//		int keyWord = inpt.readInt();
//		if(keyWord == -1) return(null);
//		String classIdent = inpt.readString();
////		qual=(ClassDeclaration) inpt.readObject();
////		declaredIn=(ConnectionBlock) inpt.readObject();
//		return(new Type(keyWord,classIdent));			
//	}
	
}
