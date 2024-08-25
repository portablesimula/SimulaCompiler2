package simula.compiler.utilities;

import java.lang.classfile.CodeBuilder;
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import java.lang.classfile.constantpool.FieldRefEntry;
import java.lang.constant.ClassDesc;
import java.lang.constant.ConstantDescs;
import java.lang.constant.MethodTypeDesc;
import simula.compiler.syntaxClass.Type;

public class RTS {
	
	public class CD {
		public static final ClassDesc RTS_UTIL		 = ClassDesc.of("simula.runtime.RTS_UTIL");
		public static final ClassDesc RTS_RTObject       = ClassDesc.of("simula.runtime.RTS_RTObject");
		public static final	ClassDesc RTS_ENVIRONMENT    = ClassDesc.of("simula.runtime.RTS_ENVIRONMENT"); 
		public static final	ClassDesc RTS_BASICIO        = ClassDesc.of("simula.runtime.RTS_BASICIO");
		public static final	ClassDesc RTS_CLASS          = ClassDesc.of("simula.runtime.RTS_CLASS");  
		public static final	ClassDesc RTS_PROCEDURE      = ClassDesc.of("simula.runtime.RTS_PROCEDURE");
		public static final ClassDesc RTS_Simulation     = ClassDesc.of("simula.runtime.RTS_Simulation");
		public static final ClassDesc RTS_Process        = ClassDesc.of("simula.runtime.RTS_Process");
		public static final ClassDesc RTS_CatchingErrors = ClassDesc.of("simula.runtime.RTS_CatchingErrors");
		
		public static final ClassDesc RTS_TXT            = ClassDesc.of("simula.runtime.RTS_TXT");
		public static final	ClassDesc RTS_ARRAY          = ClassDesc.of("simula.runtime.RTS_ARRAY");
		public static final ClassDesc RTS_BOUNDS         = ClassDesc.of("simula.runtime.RTS_BOUNDS");
		public static final	ClassDesc RTS_LABEL          = ClassDesc.of("simula.runtime.RTS_LABEL");
		public static final	ClassDesc RTS_NAME           = ClassDesc.of("simula.runtime.RTS_NAME"); 
		public static final	ClassDesc RTS_PRCQNT         = ClassDesc.of("simula.runtime.RTS_PRCQNT");
		
		public static final	ClassDesc FOR_List			 = ClassDesc.of("simula.runtime.FOR_List");
		public static final	ClassDesc FOR_Element		 = ClassDesc.of("simula.runtime.FOR_Element");
		public static final	ClassDesc FOR_SingleElt		 = ClassDesc.of("simula.runtime.FOR_SingleElt");
		public static final	ClassDesc FOR_WhileElt		 = ClassDesc.of("simula.runtime.FOR_WhileElt");
		public static final	ClassDesc FOR_StepUntil		 = ClassDesc.of("simula.runtime.FOR_StepUntil");
		
		public static final	ClassDesc JAVA_LANG_MATH                = ClassDesc.of("java.lang.Math");  
		public static final	ClassDesc JAVA_LANG_THROWABLE           = ClassDesc.of("java.lang.Throwable");  
		public static final	ClassDesc JAVA_LANG_RUNTIME_EXCEPTION   = ClassDesc.of("java.lang.RuntimeException");
		public static final	ClassDesc JAVA_LANG_CLASSCAST_EXCEPTION = ClassDesc.of("java.lang.ClassCastException");
		public static final	ClassDesc JAVA_UTIL_ITERATOR            = ClassDesc.of("java.util.Iterator");
		
		public static ClassDesc RTS_ARRAY(Type type) {
			return(ClassDesc.of("simula.runtime."+type.getArrayType()));
		}
		
		public static ClassDesc classDesc(String name) {
			return(ClassDesc.of(Global.packetName,name));
		}
	}
	
	public class FRE {
		// Static
		public static FieldRefEntry RTObject_CTX(ConstantPoolBuilder pool) { return pool.fieldRefEntry(RTS.CD.RTS_RTObject,"_CTX",RTS.CD.RTS_BASICIO); }
		public static FieldRefEntry RTObject_USR(ConstantPoolBuilder pool) { return pool.fieldRefEntry(RTS.CD.RTS_RTObject,"_USR",RTS.CD.RTS_BASICIO); }
		public static FieldRefEntry RTObject_CUR(ConstantPoolBuilder pool) { return pool.fieldRefEntry(RTS.CD.RTS_RTObject,"_CUR",RTS.CD.RTS_RTObject); }
		public static FieldRefEntry NAME_CUR(ConstantPoolBuilder pool)     { return pool.fieldRefEntry(RTS.CD.RTS_NAME,"_CUR",RTS.CD.RTS_RTObject); }
		public static FieldRefEntry RTObject_JTX(ConstantPoolBuilder pool) { return pool.fieldRefEntry(RTS.CD.RTS_RTObject,"_JTX", ConstantDescs.CD_int); }
	
		// Dynamic
		public static FieldRefEntry RTObject_SL(ConstantPoolBuilder pool) {	return pool.fieldRefEntry(RTS.CD.RTS_RTObject,"_SL",RTS.CD.RTS_RTObject); }
		public static FieldRefEntry PROCEDURE_nParLeft(ConstantPoolBuilder pool) { return pool.fieldRefEntry(RTS.CD.RTS_PROCEDURE,"_nParLeft",ConstantDescs.CD_int); }
		public static FieldRefEntry LABEL_index(ConstantPoolBuilder pool) { return pool.fieldRefEntry(RTS.CD.RTS_LABEL,"index", ConstantDescs.CD_int); }

	}

	// ********************************************************************************************
	// *** OWNER: RTS_NAME
	// ********************************************************************************************
	
	public static void invokevirtual_NAME_put(CodeBuilder codeBuilder) {
		ClassDesc owner = CD.RTS_NAME;
		codeBuilder.invokevirtual(owner, "put", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)Ljava/lang/Object;"));
	}
	
	public static void invokevirtual_NAME_get(CodeBuilder codeBuilder) {
		ClassDesc owner = CD.RTS_NAME;
		codeBuilder.invokevirtual(owner, "get", MethodTypeDesc.ofDescriptor("()Ljava/lang/Object;"));
	}

	
	// ********************************************************************************************
	// *** OWNER: RTS_Simulation
	// ********************************************************************************************
	
	public static void invokevirtual_Simulation_ActivateDirect(CodeBuilder codeBuilder) {
		ClassDesc owner = CD.RTS_Simulation;
		codeBuilder.invokevirtual(owner, "ActivateDirect", MethodTypeDesc.ofDescriptor("(ZLsimula/runtime/RTS_Process;)V"));
	}

	public static void invokevirtual_Simulation_ActivateAt(CodeBuilder codeBuilder) {
		ClassDesc owner = CD.RTS_Simulation;
		codeBuilder.invokevirtual(owner, "ActivateAt", MethodTypeDesc.ofDescriptor("(ZLsimula/runtime/RTS_Process;DZ)V"));
	}

	public static void invokevirtual_Simulation_ActivateDelay(CodeBuilder codeBuilder) {
		ClassDesc owner = CD.RTS_Simulation;
		codeBuilder.invokevirtual(owner, "ActivateDelay", MethodTypeDesc.ofDescriptor("(ZLsimula/runtime/RTS_Process;DZ)V"));
	}

	public static void invokevirtual_Simulation_ActivateBefore(CodeBuilder codeBuilder) {
		ClassDesc owner = CD.RTS_Simulation;
		codeBuilder.invokevirtual(owner, "ActivateBefore", MethodTypeDesc.ofDescriptor("(ZLsimula/runtime/RTS_Process;Lsimula/runtime/RTS_Process;)V"));
	}

	public static void invokevirtual_Simulation_ActivateAfter(CodeBuilder codeBuilder) {
		ClassDesc owner = CD.RTS_Simulation;
		codeBuilder.invokevirtual(owner, "ActivateAfter", MethodTypeDesc.ofDescriptor("(ZLsimula/runtime/RTS_Process;Lsimula/runtime/RTS_Process;)V"));
	}

	
	// ********************************************************************************************
	// *** OWNER: RTS_Process
	// ********************************************************************************************
	
	public static void invokevirtual_Process_terminate(CodeBuilder codeBuilder) {
		ClassDesc owner = CD.RTS_Process;
		codeBuilder.invokevirtual(owner,"terminate", MethodTypeDesc.ofDescriptor("()V"));
	}

	
	// ********************************************************************************************
	// *** OWNER: FOR_List
	// ********************************************************************************************
	
	public static void invokevirtual_FOR_List_iterator(CodeBuilder codeBuilder) {
		ClassDesc owner = CD.FOR_List;
		codeBuilder.invokevirtual(owner, "iterator", MethodTypeDesc.ofDescriptor("()Ljava/util/Iterator;"));
	}

	
	// ********************************************************************************************
	// *** OWNER: RTS_CLASS
	// ********************************************************************************************
	
	public static void invokevirtual_CLASS_START(CodeBuilder codeBuilder) {
		ClassDesc owner = CD.RTS_CLASS;
		codeBuilder.invokevirtual(owner, "_START", MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_RTObject;"));
	}

	
	// ********************************************************************************************
	// *** OWNER: RTS_PROCEDURE
	// ********************************************************************************************
	
	public static void invokevirtual_PROCEDURE_setpar(CodeBuilder codeBuilder) {
		ClassDesc owner = CD.RTS_PROCEDURE;
		codeBuilder.invokevirtual(owner, "setPar", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)Lsimula/runtime/RTS_PROCEDURE;"));
	}
	
	public static void invokevirtual_PROCEDURE_ENT(CodeBuilder codeBuilder) {
		ClassDesc owner = CD.RTS_PROCEDURE;
		codeBuilder.invokevirtual(owner, "_ENT", MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_PROCEDURE;"));
	}
	
	public static void invokevirtual_PROCEDURE_RESULT(CodeBuilder codeBuilder) {
		ClassDesc owner = CD.RTS_PROCEDURE;
		codeBuilder.invokevirtual(owner, "_RESULT", MethodTypeDesc.ofDescriptor("()Ljava/lang/Object;"));
	}

	
	// ********************************************************************************************
	// *** OWNER: RTS_PRCQNT
	// ********************************************************************************************
	
	public static void invokevirtual_PRCQNT_CPF(CodeBuilder codeBuilder) {
		ClassDesc owner = CD.RTS_PRCQNT;
		codeBuilder.invokevirtual(owner, "CPF", MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_PROCEDURE;"));
	}

	
	// ********************************************************************************************
	// *** OWNER: RTS_ARRAY
	// ********************************************************************************************
	
	public static void invokevirtual_ARRAY_copy(CodeBuilder codeBuilder) {
		codeBuilder.invokevirtual(RTS.CD.RTS_ARRAY, "COPY", MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_ARRAY;"));
	}
	
	public static void invokevirtual_ARRAY_index(Type type, CodeBuilder codeBuilder) {
		ClassDesc CD_ArrayType=RTS.CD.RTS_ARRAY(type);
		codeBuilder.invokevirtual(CD_ArrayType, "index", MethodTypeDesc.ofDescriptor("([I)I"));
	}
	
	public static void invokevirtual_ARRAY_putELEMENT(Type type, CodeBuilder codeBuilder) {
		ClassDesc CD_ArrayType=RTS.CD.RTS_ARRAY(type);
		String eltType = (type.isRefClassType())?"Ljava/lang/Object;":type.toJVMType();
		codeBuilder.invokevirtual(CD_ArrayType, "putELEMENT", MethodTypeDesc.ofDescriptor("(I"+eltType+")"+eltType));
	}
	
	public static void invokevirtual_ARRAY_getELEMENT(Type type, CodeBuilder codeBuilder) {
		String eltType = type.toJVMType();
		MethodTypeDesc MTD=(type.isRefClassType())?MethodTypeDesc.ofDescriptor("([I)Ljava/lang/Object;")
		                                          :MethodTypeDesc.ofDescriptor("([I)"+eltType);
		codeBuilder.invokevirtual(RTS.CD.RTS_ARRAY(type), "getELEMENT", MTD);
		if(type.isReferenceType())
			codeBuilder.checkcast(type.toClassDesc());
	}


	// ********************************************************************************************
	// *** OWNER: RTS_ENVIRONMENT
	// ********************************************************************************************

	public static void invokestatic_ENVIRONMENT_copy(CodeBuilder codeBuilder) {
		ClassDesc owner = CD.RTS_ENVIRONMENT;
		codeBuilder.invokestatic(owner, "copy", MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_TXT;)Lsimula/runtime/RTS_TXT;"));
	}


	// ********************************************************************************************
	// *** OWNER: RTS_UTIL
	// ********************************************************************************************

	public static void invokestatic_UTIL_ASGTXT(CodeBuilder codeBuilder) {
		ClassDesc owner = CD.RTS_UTIL;
		MethodTypeDesc MTD=MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_TXT;Lsimula/runtime/RTS_TXT;)Lsimula/runtime/RTS_TXT;");
		codeBuilder.invokestatic(owner, "_ASGTXT", MTD);
	}

	public static void invokestatic_UTIL_ASGSTR(CodeBuilder codeBuilder) {
		ClassDesc owner = CD.RTS_UTIL;
		MethodTypeDesc MTD=MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_TXT;Ljava/lang/String;)Lsimula/runtime/RTS_TXT;");
		codeBuilder.invokestatic(owner, "_ASGSTR", MTD);
	}
	
	public static void buildInvokeTextRel(int opr, CodeBuilder codeBuilder) {
		ClassDesc owner = CD.RTS_UTIL;
		String textRelMethod=null;
		switch (opr) {
			case KeyWord.GE -> textRelMethod="_TXTREL_GE";
			case KeyWord.NE -> textRelMethod="_TXTREL_NE";
			case KeyWord.GT -> textRelMethod="_TXTREL_GT";
			case KeyWord.LE -> textRelMethod="_TXTREL_LE";
			case KeyWord.EQ -> textRelMethod="_TXTREL_EQ";
			case KeyWord.LT -> textRelMethod="_TXTREL_LT";
			case KeyWord.EQR -> textRelMethod="TRF_EQ";
			case KeyWord.NER -> textRelMethod="TRF_NE";
			default -> Util.IERR();
		}
		MethodTypeDesc MTD=MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_TXT;Lsimula/runtime/RTS_TXT;)Z");
		codeBuilder.invokestatic(owner, textRelMethod, MTD);
	}


	public static void invokestatic_UTIL_treatException(CodeBuilder codeBuilder) {
		ClassDesc owner = CD.RTS_UTIL;
		codeBuilder.invokestatic(owner, "treatException",
				MethodTypeDesc.ofDescriptor("(Ljava/lang/Throwable;Lsimula/runtime/RTS_RTObject;)V"));
	}

	public static void invokestatic_UTIL_IPOW(CodeBuilder codeBuilder) {
		ClassDesc owner = CD.RTS_UTIL;
		codeBuilder.invokestatic(owner, "_IPOW", MethodTypeDesc.ofDescriptor("(II)I"));
	}
	
	public static void invokestatic_UTIL_IS(ClassDesc classDesc, CodeBuilder codeBuilder) {
		codeBuilder
			.ldc(classDesc)
			.invokestatic(CD.RTS_UTIL, "_IS", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;Ljava/lang/Class;)Z"));
	}
	
	public static void invokestatic_UTIL_sign(Type type, int DELTA, CodeBuilder codeBuilder) {
		ClassDesc owner = CD.RTS_UTIL;
		switch(type.keyWord) {
			case Type.T_INTEGER   -> { codeBuilder.iload(DELTA).invokestatic(owner, "isign", MethodTypeDesc.ofDescriptor("(I)I")); }
			case Type.T_REAL      -> { codeBuilder.fload(DELTA).invokestatic(owner, "fsign", MethodTypeDesc.ofDescriptor("(F)F")); }
			case Type.T_LONG_REAL -> { codeBuilder.dload(DELTA).invokestatic(owner, "dsign", MethodTypeDesc.ofDescriptor("(D)D")); }
			default -> Util.IERR();
		}
	}

	public static void buildSNAPSHOT(CodeBuilder codeBuilder, String stx) {
		// SnapShot
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		codeBuilder
			.sipush(0)
			.ldc(pool.stringEntry(stx.toString()))
			.invokestatic(ClassDesc.of("simula.runtime.RTS_UTIL"), "_SNAPSHOT", MethodTypeDesc.ofDescriptor("(ILjava/lang/String;)V"));
	}

	public static void buildSNAPSHOT2(CodeBuilder codeBuilder, String stx) {
		// SnapShot
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		codeBuilder
			.dup()
			.sipush(0)
			.ldc(pool.stringEntry(stx.toString()))
			.invokestatic(ClassDesc.of("simula.runtime.RTS_UTIL"), "_SNAPSHOT", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;ILjava/lang/String;)V"));
	}


	public static void buildSNAPSHOT2F(CodeBuilder codeBuilder, String stx) {
		// SnapShot
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		codeBuilder
			.dup()
			.sipush(0)
			.ldc(pool.stringEntry(stx.toString()))
			.invokestatic(ClassDesc.of("simula.runtime.RTS_UTIL"), "_SNAPSHOT", MethodTypeDesc.ofDescriptor("(FILjava/lang/String;)V"));
	}
	
	
	
	// ********************************************************************************************
	// *** OWNER: RTS_CatchingErrors
	// ********************************************************************************************
	
//	public static void invokevirtual_CatchingErrors_onError_0(CodeBuilder codeBuilder) {
//		ClassDesc owner = CD.RTS_CatchingErrors;
//		codeBuilder.invokevirtual(owner, "onError_0", MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_PRCQNT;"));
//	}
	
	public static void invokevirtual_CatchingErrors_onError(CodeBuilder codeBuilder) {
		ClassDesc owner = CD.RTS_CatchingErrors;
		codeBuilder.invokevirtual(owner, "_onError", MethodTypeDesc.ofDescriptor("(Ljava/lang/RuntimeException;Lsimula/runtime/RTS_PRCQNT;)V"));
	}	

	
	// ********************************************************************************************
	// *** OWNER: RTS_RTOBJECT
	// ********************************************************************************************
	
	/**
	 * Convert a Runtime Object to a primitive type value.
	 * <p>
	 * If the input Object is a name parameter or a parameter procedure it evaluated before the conversion.
	 * @param codeBuilder the CodeBuilder to use
	 * @return true if the value is converted; otherwise false
	 */
	public static boolean objectToPrimitiveType(Type type, CodeBuilder codeBuilder) {
		// Object TOS value ==> possibleEvaluation ==> Primitive type
		ClassDesc owner = RTS.CD.RTS_RTObject;
		switch(type.keyWord) {
			case Type.T_INTEGER   -> codeBuilder.invokevirtual(owner,"intValue", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)I"));
			case Type.T_REAL      -> codeBuilder.invokevirtual(owner,"floatValue", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)F"));
			case Type.T_LONG_REAL -> codeBuilder.invokevirtual(owner,"doubleValue", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)D"));
			case Type.T_BOOLEAN   -> codeBuilder.invokevirtual(owner,"booleanValue", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)Z"));
			case Type.T_CHARACTER -> codeBuilder.invokevirtual(owner,"charValue", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)C"));
			default               -> { return false; }
		}
		return true;
	}
	
	public static void invokevirtual_RTObject_BPRG(CodeBuilder codeBuilder) {
		ClassDesc owner = CD.RTS_RTObject;
		codeBuilder.invokevirtual(owner, "BPRG", MethodTypeDesc.ofDescriptor("(Ljava/lang/String;)V"));
//        .invokevirtual(CD.RTS_RTObject,"BPRG", MethodTypeDesc.ofDescriptor("(Ljava/lang/String;)V"))
	}
	
	public static void invokevirtual_RTObject_BBLK(CodeBuilder codeBuilder) {
		ClassDesc owner = CD.RTS_RTObject;
		codeBuilder.invokevirtual(owner, "BBLK", MethodTypeDesc.ofDescriptor("()V"));
	}
	
	public static void invokevirtual_RTObject_EBLK(CodeBuilder codeBuilder) {
		ClassDesc owner = CD.RTS_RTObject;
		codeBuilder.invokevirtual(owner, "EBLK", MethodTypeDesc.ofDescriptor("()V"));
	}
	
	public static void invokevirtual_RTS_arrayValue(CodeBuilder codeBuilder) {
		ClassDesc owner = CD.RTS_RTObject;
		codeBuilder.invokevirtual(owner, "arrayValue", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)Lsimula/runtime/RTS_ARRAY;"));
	}
	
	public static void invokevirtual_RTS_procValue(CodeBuilder codeBuilder) {
		ClassDesc owner = CD.RTS_RTObject;
		codeBuilder.invokevirtual(owner, "procValue", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)Lsimula/runtime/RTS_PRCQNT;"));
	}
	
	public static void invokevirtual_RTS_objectValue(CodeBuilder codeBuilder) {
		ClassDesc owner = CD.RTS_RTObject;
		codeBuilder.invokevirtual(owner, "objectValue", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)Ljava/lang/Object;"));
	}
	
	public static void invokevirtual_RTS_CONC(CodeBuilder codeBuilder) {
		ClassDesc owner = CD.RTS_RTObject;
		codeBuilder.invokevirtual(owner, "CONC", MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_TXT;Lsimula/runtime/RTS_TXT;)Lsimula/runtime/RTS_TXT;"));
	}
	
	public static void invokevirtual_RTS_GOTO(CodeBuilder codeBuilder) {
		ClassDesc owner = CD.RTS_RTObject;
		codeBuilder.invokevirtual(owner,"_GOTO", MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_LABEL;)V"));
	}

	public static void invokevirtual_RTS_detach(CodeBuilder codeBuilder) {
		ClassDesc owner = CD.RTS_RTObject;
		codeBuilder.invokevirtual(owner,"detach", MethodTypeDesc.ofDescriptor("()V"));
	}

}
