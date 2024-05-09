package simula.compiler.syntaxClass.declaration;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.classfile.ClassFile;
import java.lang.classfile.ClassHierarchyResolver;
import java.lang.classfile.ClassSignature;
import java.lang.classfile.CodeBuilder;
import java.lang.classfile.Label;
import java.lang.classfile.attribute.SignatureAttribute;
import java.lang.classfile.attribute.SourceFileAttribute;
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import java.lang.constant.ClassDesc;
import java.lang.constant.ConstantDescs;
import java.lang.constant.MethodTypeDesc;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.expression.BuildProcedureCall;
import simula.compiler.syntaxClass.expression.Expression;
import simula.compiler.syntaxClass.expression.RemoteVariable;
import simula.compiler.syntaxClass.expression.TypeConversion;
import simula.compiler.syntaxClass.expression.VariableExpression;
import simula.compiler.utilities.CD;
import simula.compiler.utilities.ClassHierarchy;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.Meaning;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

public final class Thunk extends DeclarationScope {

	private static int SEQU = 0;
	private ClassDesc CD_ThisClass;
	private int kind; //Parameter.Kind kind;
	private Expression expr;
	
	private Thunk(int kind,Expression expr) {
		super(Global.sourceName + "$THUNK$" + (++SEQU));
		this.declarationKind = ObjectKind.Thunk;
		this.rtBlockLevel = this.declaredIn.rtBlockLevel + 1;		this.kind = kind;
//		this.mode = mode;
		this.expr = expr;
//		this.CD_ThisClass = ClassDesc.of(Global.packetName + '.' + externalIdent);
		this.CD_ThisClass = this.getClassDesc();
//		printScopeChain(this);
		if(this.declaredIn instanceof Thunk) Util.IERR("");
		Global.setScope(this.declaredIn);
	}

	// ***********************************************************************************************
	// *** Utility: findVisibleAttributeMeaning
	// ***********************************************************************************************
	@Override
	public Meaning findVisibleAttributeMeaning(final String ident) {
		if(Option.TRACE_FIND_MEANING>0) Util.println("BEGIN Checking Thunk for "+ident+" ================================== "+identifier+" ==================================");

		Meaning meaning = declaredIn.findVisibleAttributeMeaning(ident);
		
		if(Option.TRACE_FIND_MEANING>0) Util.println("ENDOF Checking Thunk for "+ident+" ================================== "+identifier+" ==================================");
		return (meaning);
	}

	// ***********************************************************************************************
	// *** buildInvoke
	// ***********************************************************************************************
	public static void buildInvoke(int kind,Expression expr,CodeBuilder codeBuilder) {
		//  new RTS_NAME< TYPE >() {
		//     public TYPE get() {
		//        return("+apar.toJavaCode()+");
		//     }
		//  }	
		Thunk thunk = new Thunk(kind,expr);
		try { thunk.createJavaClassFile(); } catch (IOException e) { e.printStackTrace(); }
		ClassDesc CD_THUNK=thunk.getClassDesc();
		codeBuilder
			.new_(CD_THUNK)
			.dup()
			.aload(0)
			.invokespecial(CD_THUNK, "<init>", MethodTypeDesc.ofDescriptor("("+BlockDeclaration.currentClassDesc().descriptorString()+")V"));
	}
	
	// ***********************************************************************************************
	// *** createJavaClassFile
	// ***********************************************************************************************
	/**
	 * Create Java ClassFile.
	 * @throws IOException 
	 */
    public void createJavaClassFile() throws IOException {
//    	System.out.println("Thunk.createJavaClassFile: "+expr);
        byte[] bytes = buildClassFile();
        if(bytes != null) {
            File outputFile = new File(Global.tempClassFileDir + "\\" + Global.packetName + "\\" + externalIdent + ".class");
            outputFile.getParentFile().mkdirs();
            FileOutputStream oupt = new FileOutputStream(outputFile);
            oupt.write(bytes); oupt.flush(); oupt.close();
            if(Option.verbose) System.out.println("ClassFile written to: " + outputFile);

			if(Option.LIST_GENERATED_CLASS_FILES) {
				Util.doListClassFile("" + outputFile); // List generated .class file
			}
        }
    }

	// ***********************************************************************************************
	// *** ByteCoding: buildClassFile
	// ***********************************************************************************************
	private byte[] buildClassFile() {
		if(Option.verbose) System.out.println("Begin buildClassFile: "+CD_ThisClass);
		ClassHierarchy.addClassToSuperClass(CD_ThisClass, CD.RTS_NAME);
		
		byte[] bytes = ClassFile.of(ClassFile.ClassHierarchyResolverOption.of(ClassHierarchy.getResolver())).build(CD_ThisClass,
				classBuilder -> {
					classBuilder
						.with(SourceFileAttribute.of(Global.sourceFileName))
//						.withFlags(ClassFile.ACC_SUPER)
//						.withFlags(ClassFile.ACC_SUPER + ClassFile.ACC_FINAL)
						.withFlags(ClassFile.ACC_PUBLIC + ClassFile.ACC_SUPER + ClassFile.ACC_FINAL)
//						.withFlags(ClassFile.ACC_PUBLIC + ClassFile.ACC_SUPER)
						.withSuperclass(CD.RTS_NAME)
						.with(SignatureAttribute.of(ClassSignature.parseFrom("Lsimula/runtime/RTS_NAME<"+Type.toJVMClassType(expr.type,kind)+">;")))
						.withMethodBody("<init>", MethodTypeDesc.ofDescriptor("("+BlockDeclaration.currentClassDesc().descriptorString()+")V"), 0,
							codeBuilder -> buildConstructor(codeBuilder))
						.withMethodBody("get", MethodTypeDesc.ofDescriptor("()Ljava/lang/Object;"), ClassFile.ACC_PUBLIC,
							codeBuilder -> buildMethod_get(codeBuilder));
					
//					System.out.println("Thunk.buildClassFile: expr="+expr.getClass().getSimpleName() + "  "+expr);
				    VariableExpression writeableVariable=expr.getWriteableVariable();
//					System.out.println("Thunk.buildClassFile: writeableVariable="+writeableVariable);
					
				    if(writeableVariable!=null) {
				    	Declaration declaredAs = writeableVariable.meaning.declaredAs;
//				    	System.out.println("Thunk.buildClassFile: declaredAs="+declaredAs+", declarationKind="+declaredAs.declarationKind);
//				    	System.out.println("Thunk.buildClassFile: declaredAs="+declaredAs+", declarationKind="+ObjectKind.edit(declaredAs.declarationKind));
				    	
//				    	if(declaredAs.declarationKind == ObjectKind.Procedure) writeableVariable = null;
//				    	if(declaredAs.declarationKind == ObjectKind.MemberMethod) writeableVariable = null;
////				    	if(declaredAs.declarationKind != ObjectKind.SimpleVariableDeclaration) writeableVariable = null;
				    	
				    	switch(declaredAs.declarationKind) {
		    				case ObjectKind.ArrayDeclaration: writeableVariable = null; break; // TODO: USIKKER - SJEKK DETTE
			    			case ObjectKind.Parameter:  break; // TODO: USIKKER - SJEKK DETTE, AVHENGIG AV PARAMETER MODE ?
			    			
				    		case ObjectKind.SimpleVariableDeclaration: break; // OK
				    		case ObjectKind.Procedure:
				    		case ObjectKind.MemberMethod:
				    		case ObjectKind.ContextFreeMethod:
				    			writeableVariable = null; break;
				    		default: Util.IERR(""+ObjectKind.edit(declaredAs.declarationKind));
				    	}
				    }
				    if(writeableVariable!=null) {
				    	MethodTypeDesc MTD_put=null;
				    	if(expr.type != null) {
				    		if(expr.type.equals(Type.Integer)) {
				    			MTD_put=MethodTypeDesc.ofDescriptor("(Ljava/lang/Integer;)Ljava/lang/Integer;");
				    		} else if(expr.type.equals(Type.Real)) {
				    			MTD_put=MethodTypeDesc.ofDescriptor("(Ljava/lang/Float;)Ljava/lang/Float;");
				    		} else if(expr.type.equals(Type.LongReal)) {
				    			MTD_put=MethodTypeDesc.ofDescriptor("(Ljava/lang/Double;)Ljava/lang/Double;");
				    		} else if(expr.type.equals(Type.Boolean)) {
				    			MTD_put=MethodTypeDesc.ofDescriptor("(Ljava/lang/Boolean;)Ljava/lang/Boolean;");
				    		} else if(expr.type.equals(Type.Character)) {
				    			MTD_put=MethodTypeDesc.ofDescriptor("(Ljava/lang/Character;)Ljava/lang/Character;");
				    		} else if(expr.type.equals(Type.Label)) {
				    			MTD_put=MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_LABEL;)Lsimula/runtime/RTS_LABEL;");
				    		} else if(expr.type.isReferenceType()) {
				    			String CDS=expr.type.toClassDesc().descriptorString();
				    			MTD_put=MethodTypeDesc.ofDescriptor("("+CDS+')'+CDS);
				    		}
				    		else Util.IERR("FYLL PÅ FLERE TYPER: "+expr.type);
				    		Expression beforeDot=(expr instanceof RemoteVariable rem)?rem.obj:null;
				    		classBuilder
				    			.withMethodBody("put", MTD_put, ClassFile.ACC_PUBLIC,
				    				codeBuilder -> buildMethod_put(codeBuilder,beforeDot,expr))
				    			.withMethodBody("put", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)Ljava/lang/Object;"),
				    				ClassFile.ACC_PUBLIC + ClassFile.ACC_BRIDGE + ClassFile.ACC_SYNTHETIC,
				    				codeBuilder -> buildMethod_put2(codeBuilder));
				    	}
				    }
					
				}
		);
		return(bytes);
	}


	// ***********************************************************************************************
	// *** ByteCoding: buildConstructor
	// ***********************************************************************************************
	/**
	 * Generate byteCode for the Constructor.
	 * <pre>
	 *     public ClassIdent(RTS_RTObject staticLink) {
	 *         super(staticLink);
	 *	   }
	 * </pre>
	 * @param codeBuilder the CodeBuilder
	 */
	private void buildConstructor(CodeBuilder codeBuilder) {
		ConstantPoolBuilder pool=codeBuilder.constantPool();

		Label begScope = codeBuilder.newLabel();
		Label endScope = codeBuilder.newLabel();
		codeBuilder
			.labelBinding(begScope)
			.localVariable(0,"this",CD_ThisClass,begScope,endScope)
			.localVariable(1,"staticLink",CD.RTS_RTObject,begScope,endScope);

		// super(staticLink);
		codeBuilder
			.aload(0)
			.invokespecial(pool.methodRefEntry(CD.RTS_NAME,"<init>", MethodTypeDesc.ofDescriptor("()V")));

		codeBuilder
			.return_()
			.labelBinding(endScope);
	}


	// ***********************************************************************************************
	// *** ByteCoding: buildMethod_get
	// ***********************************************************************************************
	/**
	 * Generate byteCode for the 'get' method.
	 * <p>
	 * 	public Integer get() { return(((adHoc13)(_ENV._SL)).n);
	 *
	 * @param codeBuilder the CodeBuilder
	 */
	void buildMethod_get(CodeBuilder codeBuilder) {
		Global.enterScope(this);
			Label begScope = codeBuilder.newLabel();
			Label endScope = codeBuilder.newLabel();
			codeBuilder
				.labelBinding(begScope)
				.localVariable(0,"this",CD_ThisClass,begScope,endScope);

//			Util.buildSNAPSHOT(codeBuilder, "THUNK: get "+expr);

//			System.out.println("Thunk.buildMethod_get: expr="+expr.getClass().getSimpleName()+"  "+expr);
			if(kind==0) {
				expr.buildEvaluation(null,codeBuilder);
	        	expr.type.buildObjectValueOf(codeBuilder);
			} else {
				switch(kind) { // Parameter.Kind
				case Parameter.Kind.Array:		expr.buildEvaluation(null,codeBuilder);
								break;
				case Parameter.Kind.Label:		Util.IERR("kind="+kind);
								break;
				case Parameter.Kind.Procedure:	BuildProcedureCall.buildProcedureQuant(expr,codeBuilder);
								break;
				case Parameter.Kind.Simple:	expr.buildEvaluation(null,codeBuilder);
		        				expr.type.buildObjectValueOf(codeBuilder);
		        				break;
				default:
					expr.buildEvaluation(null,codeBuilder);
		        	expr.type.buildObjectValueOf(codeBuilder);
					break;
					}
			}
//			Util.buildSNAPSHOT2(codeBuilder, "THUNK: get RESULT "+expr);
			codeBuilder
				.areturn()
				.labelBinding(endScope);
		Global.exitScope();
	}

	// ***********************************************************************************************
	// *** ByteCoding: buildMethod_put
	// ***********************************************************************************************
	/**
	 * Generate byteCode for the 'put' method.
	 * <p>
	 * 	public Integer put(Integer x_) {
	 * 		return(((adHoc13)(_ENV._SL)).n=(int)x_);
	 *  }
	 *
	 * @param codeBuilder the CodeBuilder
	 */
	void buildMethod_put(CodeBuilder codeBuilder, Expression beforeDot, Expression expr) {
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		VariableExpression writeableVariable=expr.getWriteableVariable();
		Meaning meaning=writeableVariable.meaning;
		Declaration declaredAs = meaning.declaredAs;
		Global.enterScope(this);
			Label begScope = codeBuilder.newLabel();
			Label endScope = codeBuilder.newLabel();
			Label checkStackSize = null; // TESTING_STACK_SIZE
			codeBuilder
				.labelBinding(begScope)
				.localVariable(0,"this",CD_ThisClass,begScope,endScope)
				.localVariable(1,"parameter_x",CD.RTS_RTObject,begScope,endScope);
			
			if(Option.TESTING_STACK_SIZE) {
				checkStackSize = codeBuilder.newLabel();
				codeBuilder
					.aconst_null()                 // TESTING_STACK_SIZE
					.if_nonnull(checkStackSize);   // TESTING_STACK_SIZE				
			}
			
			//	public Integer put(Integer x_) {
			//		return (p_n = (int) x_);
			//	}
			// ENDRES TIL:
			//	public Integer put(Integer x_) {
			//		p_n = (int) x_;
			//		return (x);
			//	}

			writeableVariable.buildIdentifierAccess(true,codeBuilder);
				
			if(beforeDot != null) beforeDot.buildEvaluation(null,codeBuilder);
				
			Parameter nameParameter = null;
			if(declaredAs instanceof Parameter par) {
				if(par.mode == Parameter.Mode.name) {
					nameParameter = par;
					codeBuilder.getfield(par.getFieldRefEntry(pool));
				}
			}
					
			codeBuilder.aload(1); // Parameter x
			
			if(expr.type.equals(Type.Integer))
				codeBuilder.invokevirtual(pool.methodRefEntry(ConstantDescs.CD_Integer, "intValue", MethodTypeDesc.ofDescriptor("()I")));
			else if(expr.type.equals(Type.Real))
				codeBuilder.invokevirtual(pool.methodRefEntry(ConstantDescs.CD_Float, "floatValue", MethodTypeDesc.ofDescriptor("()F")));
			else if(expr.type.equals(Type.LongReal))
				codeBuilder.invokevirtual(pool.methodRefEntry(ConstantDescs.CD_Double, "doubleValue", MethodTypeDesc.ofDescriptor("()D")));
			else if(expr.type.equals(Type.Boolean))
				codeBuilder.invokevirtual(pool.methodRefEntry(ConstantDescs.CD_Boolean, "booleanValue", MethodTypeDesc.ofDescriptor("()Z")));
			else if(expr.type.equals(Type.Character))
				codeBuilder.invokevirtual(pool.methodRefEntry(ConstantDescs.CD_Character, "charValue", MethodTypeDesc.ofDescriptor("()C")));

			if(expr instanceof TypeConversion tpc) {
				Type fromType = expr.type;
				Type toType = writeableVariable.type;
				TypeConversion.buildMayBeConvert(fromType, toType, tpc.expression, codeBuilder);
			}
				
			String ident=null;
			if(declaredAs instanceof SimpleVariableDeclaration var) ident=var.getFieldIdentifier();
			else if(declaredAs instanceof Parameter par)            ident=par.getFieldIdentifier();
			else if(declaredAs instanceof ArrayDeclaration arr)     ident=arr.identifier;
			else if(declaredAs instanceof ProcedureDeclaration pro) ident=pro.identifier;
			else Util.IERR("Thunk.buildMethod_put: IMPOSSIBLE: "+declaredAs.getClass().getSimpleName());

			if(nameParameter != null) {
				expr.type.buildObjectValueOf(codeBuilder);
				codeBuilder
					.invokevirtual(pool.methodRefEntry(CD.RTS_NAME, "put", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)Ljava/lang/Object;")))
//					.checkcast(expr.type.toObjectClassDesc());
					.pop();
			} else {
				DeclarationScope declaredIn = meaning.declaredIn;
//				System.out.println("Thunk.buildMethod_put: "+ident+", Thunk.expr="+this.expr.getClass().getSimpleName()+"  "+expr);
//				System.out.println("Thunk.buildMethod_put: "+ident+", writeableVariable.declaredIn="+declaredIn.getClass().getSimpleName()+"  "+declaredIn);
				ClassDesc owner = declaredIn.getClassDesc();
				if(declaredIn instanceof ConnectionBlock conn) {
					ClassDeclaration whenClass = conn.classDeclaration;
					if(whenClass != null) owner = whenClass.getClassDesc();
				}
				codeBuilder.putfield(pool.fieldRefEntry(owner, ident, writeableVariable.type.toClassDesc()));
			}
			
			if(Option.TESTING_STACK_SIZE) {
				codeBuilder.labelBinding(checkStackSize);  // TESTING_STACK_SIZE
			}

			codeBuilder
				.aload(1) // Parameter x
				.areturn()
				.labelBinding(endScope);
					
		Global.exitScope();
	}

	// ***********************************************************************************************
	// *** ByteCoding: buildMethod_put2    Build syntetic bridge to the 'put' method
	// ***********************************************************************************************
	void buildMethod_put2(CodeBuilder codeBuilder) {
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		Label begScope = codeBuilder.newLabel();
		Label endScope = codeBuilder.newLabel();
		codeBuilder
			.labelBinding(begScope)
			.localVariable(0,"this",CD_ThisClass,begScope,endScope)
			.localVariable(1,"parameter_x",CD.RTS_RTObject,begScope,endScope)
			.aload(0)
			.aload(1); // Parameter x			
		
		if(expr.type.equals(Type.Integer)) {
			codeBuilder
				.checkcast(ConstantDescs.CD_Integer)
				.invokevirtual(pool.methodRefEntry(CD_ThisClass, "put", MethodTypeDesc.ofDescriptor("(Ljava/lang/Integer;)Ljava/lang/Integer;")));
		} else if(expr.type.equals(Type.Real)) {
			codeBuilder
				.checkcast(ConstantDescs.CD_Float)
				.invokevirtual(pool.methodRefEntry(CD_ThisClass, "put", MethodTypeDesc.ofDescriptor("(Ljava/lang/Float;)Ljava/lang/Float;")));
		} else if(expr.type.equals(Type.LongReal)) {
			codeBuilder
				.checkcast(ConstantDescs.CD_Double)
				.invokevirtual(pool.methodRefEntry(CD_ThisClass, "put", MethodTypeDesc.ofDescriptor("(Ljava/lang/Double;)Ljava/lang/Double;")));
		} else if(expr.type.equals(Type.Boolean)) {
			codeBuilder
				.checkcast(ConstantDescs.CD_Boolean)
				.invokevirtual(pool.methodRefEntry(CD_ThisClass, "put", MethodTypeDesc.ofDescriptor("(Ljava/lang/Boolean;)Ljava/lang/Boolean;")));
		} else if(expr.type.equals(Type.Character)) {
			codeBuilder
				.checkcast(ConstantDescs.CD_Character)
				.invokevirtual(pool.methodRefEntry(CD_ThisClass, "put", MethodTypeDesc.ofDescriptor("(Ljava/lang/Character;)Ljava/lang/Character;")));
		} else if(expr.type.equals(Type.Label)) {
			codeBuilder
				.checkcast(CD.RTS_LABEL)
				.invokevirtual(pool.methodRefEntry(CD_ThisClass, "put",
						MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_LABEL;)Lsimula/runtime/RTS_LABEL;")));
		
		} else if(expr.type.isReferenceType()) {
			ClassDesc CD=expr.type.toClassDesc();
			String CDS=CD.descriptorString();
			MethodTypeDesc MTD_put=MethodTypeDesc.ofDescriptor("("+CDS+')'+CDS);
			codeBuilder
				.checkcast(CD)
				.invokevirtual(pool.methodRefEntry(CD_ThisClass, "put", MTD_put));
		}
		else Util.IERR("FYLL PÅ FLERE TYPER: "+expr.type);
		
		codeBuilder
			.areturn()
			.labelBinding(endScope);
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(identifier).append("[externalIdent=").append(externalIdent).append("] Kind=").append(declarationKind);
		s.append(", declaredIn="+declaredIn.externalIdent).append(", rtBlockLevel="+rtBlockLevel);
		s.append(", QUAL=").append(this.getClass().getSimpleName()).append(", HashCode=").append(hashCode());
		return (s.toString());
	}

}
