/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass.declaration;

import java.lang.classfile.CodeBuilder;
import java.lang.classfile.Label;
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import java.lang.constant.ClassDesc;
import java.lang.constant.ConstantDescs;
import java.lang.constant.MethodTypeDesc;
import java.util.Stack;
import java.util.Vector;

import simula.compiler.GeneratedJavaClass;
import simula.compiler.parsing.Parse;
import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.expression.Expression;
import simula.compiler.syntaxClass.statement.Statement;
import simula.compiler.utilities.CD;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.KeyWord;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.ObjectList;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * Block Declaration.
 * <p>
 * This class is prefix to ClassDeclaration, ProcedureDeclaration and MaybeBlockDeclaration.
 * <p>
 * It contains a number of useful fields and methods common to its subclasses.
 * <p>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/declaration/BlockDeclaration.java">
 * <b>Source File</b></a>.
 * 
 * @author Øystein Myhre Andersen
 */
public abstract class BlockDeclaration extends DeclarationScope {
	
	/**
	 * If true; this is the outermost Subblock or Prefixed Block.
	 */
	protected boolean isMainModule;
	
	/**
	 * The statements belonging to this block.
	 */
	public ObjectList<Statement> statements = new ObjectList<Statement>();

	/**
	 * Last source line number
	 */
	public int lastLineNumber;
	
	/**
	 * If true; all member methods are independent of context
	 */
	public boolean isContextFree;

	/**
	 * Compiler state: Points to the BlockDeclaration whose Statements are being built.
	 * Used by LabelList.labelBinding to find the right JUMP_TABLE.
	 */
	public static BlockDeclaration labelContext;

	public static Stack<BlockDeclaration> stmStack = new Stack<BlockDeclaration>();


	/**
	 * The DeclarationScope that currently is being built
	 */
	public static BlockDeclaration currentBlock;
	
	/**
	 * The previous value of 'currentBlock'
	 */
	protected BlockDeclaration prevBlock;
	
	/**
	 * Number of Local Variables allocated so far.
	 * <p>
	 * Note: First Local Variable is used by the outermost try-catch block.
	 */
	public int nLocalVariables = 1;
	
	public static ClassDesc currentClassDesc() {
		return(currentBlock.getClassDesc());
	}
	
	public int allocateLocalVariable(Type type) {
		int res = nLocalVariables++;
		if(type.keyWord == Type.T_LONG_REAL) {
			nLocalVariables++;
		}
		return(res);
	}

	// ***********************************************************************************************
	// *** CONSTRUCTORS
	// ***********************************************************************************************
	/**
	 * Create a new BlockDeclaration with the given identifier.
	 * <p>
	 * Used by expectMaybeBlock, i.e. CompoundStatement, SubBlock or PrefixedBlock.
	 * @param identifier the given identifier
	 */
	protected BlockDeclaration(String identifier) {
		super(identifier);
	}

	/**
	 * Create a new BlockDeclaration.
	 * <p>
	 * This constructor is only used by ClassDeclaration. ProcedureDeclaration and MaybeBlockDeclaration.
	 * @param identifier the block identifier
	 * @param declarationKind the declaration kind
	 */
	private BlockDeclaration(final String identifier,final int declarationKind) {
		super(identifier);
		this.declarationKind = declarationKind;
	}
	
	/**
	 * Parse Utility: Expect formal-parameter-part and build the parameter list.
	 * <pre>
	 * Syntax:
	 * 
	 *     formal-parameter-part = "(" identifier { , identifier } ")"
	 * </pre>
	 * 
	 * Precondition: BEGPAR is already read.
	 * @param pList the parameter list
	 */
	protected static void expectFormalParameterPart(final Vector<Parameter> pList) {
		do { // ParameterPart = Parameter ; { Parameter ; }
			new Parameter(Parse.expectIdentifier()).into(pList);
		} while (Parse.accept(KeyWord.COMMA));
		Parse.expect(KeyWord.ENDPAR);
	}

//	// ***********************************************************************************************
//	// *** Checking: doCheckLabelList
//	// ***********************************************************************************************
//	/**
//	 * Checking utility: doCheckLabelList.
//	 * @param prefixClass possible prefix or null
//	 */
//	protected void doCheckLabelList(final ClassDeclaration prefixClass) {
//		if(prefixClass != null)
//			prefixClass.doChecking();
//		if(labelList != null) labelList.setLabelIdexes();
//	}

	// ***********************************************************************************************
	// *** Coding: isBlockWithLocalClasses
	// ***********************************************************************************************
	/**
	 * Returns true if this block has local class(es).
	 * 
	 * @return true if this block has local class(es)
	 */
	protected boolean isBlockWithLocalClasses() {
		if (this.hasLocalClasses) return (true);
		if (this instanceof ClassDeclaration cls) {
			ClassDeclaration prfx = cls.getPrefixClass();
			if (prfx != null) return (prfx.isBlockWithLocalClasses());
		}
		return (false);
	}

	// ***********************************************************************************************
	// *** Coding: isQPSystemBlock -- QPS System is any block with local class(es)
	// ***********************************************************************************************
	/**
	 * Returns true if this block is a QPS System block.
	 * <p>
	 * QPS System is any block with local class(es)
	 * 
	 * @return true if this block is a QPS System block
	 */
	protected boolean isQPSystemBlock() {
		switch (declarationKind) {
			case ObjectKind.SimulaProgram:
			case ObjectKind.SubBlock:
			case ObjectKind.PrefixedBlock:
				return (isBlockWithLocalClasses());
			default:
				return (false);
		}
	}

	
	// ***********************************************************************************************
	// *** Coding Utility: AD'HOC Leading Label
	// ***********************************************************************************************
	/**
	 * The leading labels.
	 */
	protected Vector<String> labelcodeList;
	
	/**
	 * Coding utility: AD'HOC Leading Label
	 * @param labelcode argument
	 */
	public void addLeadingLabel(String labelcode) {
		if(this.labelcodeList==null) this.labelcodeList=new Vector<String>();
		this.labelcodeList.add(labelcode);
	}

//	// ***********************************************************************************************
//	// *** Coding Utility: hasLabel
//	// ***********************************************************************************************
//	/**
//	 * Returns true if this block has one ore more labels.
//	 * @return true if this block has one ore more labels.
//	 */
//	protected boolean hasLabel() {
//		// Needs redefinition for ClassDeclaration
//		ASSERT_SEMANTICS_CHECKED();
//		return (labelList != null && !labelList.isEmpty());
//	}

	// ***********************************************************************************************
	// *** Coding Utility: hasDeclaredLabel
	// ***********************************************************************************************
	/**
	 * Returns true if this block has one ore more local declared labels.
	 * @return true if this block has one ore more local declared labels.
	 */
	protected boolean hasDeclaredLabel() {
		ASSERT_SEMANTICS_CHECKED();
		return (labelList != null && labelList.declaredLabelSize() > 0);
	}

	// ***********************************************************************************************
	// *** Coding Utility: hasAccumLabel
	// ***********************************************************************************************
	/**
	 * Returns true if this block has one ore more accumulated labels.
	 * @return true if this block has one ore more accumulated labels.
	 */
	protected boolean hasAccumLabel() {
		ASSERT_SEMANTICS_CHECKED();
		return (labelList != null && labelList.accumLabelSize() > 0);
	}

	// ***********************************************************************************************
	// *** Utility: nearestEnclosingBlock
	// ***********************************************************************************************
	/**
	 * Returns the nearest Enclosing Block or null.
	 * @return the nearest Enclosing Block or null.
	 */
	protected BlockDeclaration nearestEnclosingBlock() {
		DeclarationScope scope = declaredIn;
		while(scope != null) {
			if(scope instanceof BlockDeclaration blk) return(blk);
			scope = scope.declaredIn;
		}
		return (null);
	}

//	// ***********************************************************************************************
//	// *** Coding Utility: getNlabels
//	// ***********************************************************************************************
//	/**
//	 * Returns the number of labels in this block.
//	 * <p>
//	 * Redefined in ClassDeclaration
//	 * 
//	 * @return the number of labels in this class
//	 */
//	public int getNlabels() {
//		return (labelList.declaredLabelSize());
//	}

	// ***********************************************************************************************
	// *** Coding Utility: codeSTMBody
	// ***********************************************************************************************
	/**
	 * Coding utility: Code STM body
	 */
	protected void codeSTMBody() {
		if (hasAccumLabel()) {
			GeneratedJavaClass.code(externalIdent + " _THIS=(" + externalIdent + ")_CUR;");
			GeneratedJavaClass.code("_LOOP:while(_JTX>=0) {");
			GeneratedJavaClass.code("try {");
//			GeneratedJavaClass.code("_JUMPTABLE(_JTX,"+this.getNlabels()+");","For ByteCode Engineering");			
			GeneratedJavaClass.code("_JUMPTABLE(_JTX,"+labelList.accumLabelSize()+");","For ByteCode Engineering");			
			Global.currentJavaModule.mustDoByteCodeEngineering=true;
		}
		codeStatements();
		if (hasAccumLabel()) {
			GeneratedJavaClass.code("break _LOOP;");
			GeneratedJavaClass.code("}");
			GeneratedJavaClass.code("catch(RTS_LABEL q) {");
			
			GeneratedJavaClass.code("RTS_RTObject._TREAT_GOTO_CATCH_BLOCK(_THIS, q);");
			
			GeneratedJavaClass.code("_JTX=q.index; continue _LOOP;","EG. GOTO Lx");
			GeneratedJavaClass.code("}");
			GeneratedJavaClass.code("}");
		}
	}

	// ***********************************************************************************************
	// *** Coding Utility: codeStatements
	// ***********************************************************************************************
	/**
	 * Coding utility: Code statements
	 */
	protected void codeStatements() {
		boolean duringSTM_Coding=Global.duringSTM_Coding;
		Global.duringSTM_Coding=true;
//		for (Statement stm : statements) stm.doJavaCoding();
		for (Statement stm : statements) stm.doJavaCoding();
		Global.duringSTM_Coding=duringSTM_Coding;
	}

	// ***********************************************************************************************
	// *** ByteCoding: buildIsQPSystemBlock
	// ***********************************************************************************************
	/**
	 * Generate byteCode for the 'isQPSystemBlock' method.
	 * <p>
	 * public boolean isQPSystemBlock() { return(true); }
	 *
	 * @param codeBuilder the CodeBuilder
	 */
	protected void buildIsQPSystemBlock(CodeBuilder codeBuilder) {
		Label begScope = codeBuilder.newLabel();
		Label endScope = codeBuilder.newLabel();
		codeBuilder
			.labelBinding(begScope)
			.localVariable(0,"this",currentClassDesc(),begScope,endScope)
			.iconst_1()
			.ireturn()
			.labelBinding(endScope);
	}

	// ***********************************************************************************************
	// *** ByteCoding: buildIsMethodDetachUsed
	// ***********************************************************************************************
	/**
	 * Generate byteCode for the 'buildIsMethodDetachUsed' method.
	 * <p>
	 * public boolean isDetachUsed() { return(true); }
	 *
	 * @param codeBuilder the CodeBuilder
	 */
	void buildIsMethodDetachUsed(CodeBuilder codeBuilder) {
		Label begScope = codeBuilder.newLabel();
		Label endScope = codeBuilder.newLabel();
		codeBuilder
			.labelBinding(begScope)
			.localVariable(0,"this",currentClassDesc(),begScope,endScope)
			.iconst_1()
			.ireturn()
			.labelBinding(endScope);
	}

    // ***********************************************************************************************
    // *** ByteCoding: edConstructorSignature
    // ***********************************************************************************************
    public String edConstructorSignature() {
        Util.IERR("Method edConstructorSignature need a redefinition in "+this.getClass().getSimpleName());
        return(null);
    }
    
    public MethodTypeDesc getConstructorMethodTypeDesc() {
    	return(MethodTypeDesc.ofDescriptor(this.edConstructorSignature()));
    }


	// ***********************************************************************************************
	// *** ByteCoding: buildMethod_STM
	// ***********************************************************************************************
	/**
	 * Generate byteCode for the '_STM' method.
	 *
	 * @param codeBuilder the CodeBuilder
	 */
	protected void buildMethod_STM(CodeBuilder codeBuilder) {
		ASSERT_SEMANTICS_CHECKED();
		Global.enterScope(this);
			ConstantPoolBuilder pool = codeBuilder.constantPool();
			Label begScope = codeBuilder.newLabel();
			Label endScope = codeBuilder.newLabel();
			Label checkStackSize = null; // TESTING_STACK_SIZE
			if(labelList != null) labelList.clear();
			codeBuilder
				.labelBinding(begScope)
				.localVariable(0,"this",currentClassDesc(),begScope,endScope);
			
				if(Option.internal.TESTING_STACK_SIZE) {
					checkStackSize = codeBuilder.newLabel();
					codeBuilder
						.aconst_null()                 // TESTING_STACK_SIZE
						.if_nonnull(checkStackSize);   // TESTING_STACK_SIZE
				}
				if (hasAccumLabel())	
					 build_TRY_CATCH(codeBuilder, begScope, endScope);
				else build_STM_BODY(codeBuilder, begScope, endScope);
				codeBuilder
					.aload(0)
					.invokevirtual(pool.methodRefEntry(currentClassDesc(),"EBLK", MethodTypeDesc.ofDescriptor("()V")));
					
				if(Option.internal.TESTING_STACK_SIZE) {
					codeBuilder.labelBinding(checkStackSize);  // TESTING_STACK_SIZE
				}
				
				codeBuilder
					.aload(0)
					.areturn()
					
			.labelBinding(endScope);
		Global.exitScope();
	}
	
	protected void build_STM_BODY(CodeBuilder codeBuilder, Label begScope, Label endScope) {
		Util.IERR("Method build_STM_BODY need a redefinition in "+this.getClass().getSimpleName());
	}
	
	// ***********************************************************************************************
	// *** ByteCoding: build_TRY_CATCH
	// ***********************************************************************************************
	/**
	 * Generate byteCode for the try-catch part of the '_STM' method.
	 *
	 * @param codeBuilder the CodeBuilder
	 */
	// ==================================================================================
    //    adHoc000 _THIS=(adHoc000)_CUR;
    //    _LOOP:while(_JTX>=0) {
    //        try {
    //            _JUMPTABLE(_JTX); // For ByteCode Engineering
    //            // ... Simple Statement code
    //            break _LOOP;
    //        }
    //        catch(RTS_LABEL q) {
    //            RTS_RTObject._TREAT_GOTO_CATCH_BLOCK(_THIS, q);
    //            _JTX=q.index; continue _LOOP; // EG. GOTO Lx
    //        }
    //    }
	// ==================================================================================
	private int local_THIS;
	int local_LABEL_q;
	protected void build_TRY_CATCH(CodeBuilder codeBuilder,Label begScope,Label endScope) {
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		Label loopWhile = codeBuilder.newLabel();
		Label loopEnd = codeBuilder.newLabel();
		
		local_THIS = ((BlockDeclaration)BlockDeclaration.currentBlock).allocateLocalVariable(Type.Ref);
		local_LABEL_q = ((BlockDeclaration)BlockDeclaration.currentBlock).allocateLocalVariable(Type.Ref);
		codeBuilder.localVariable(local_THIS,"_THIS",CD.RTS_RTObject,begScope,endScope);
		codeBuilder.localVariable(local_LABEL_q,"label_q",CD.RTS_LABEL,begScope,endScope);
		
	    // adHoc000 _THIS=(adHoc000)_CUR;
		codeBuilder
			.aload(0)
			.astore(local_THIS);  // THIS
		
	    // _LOOP:while(_JTX>=0) {
		codeBuilder
			.labelBinding(loopWhile)
			.aload(0)
			.getfield(pool.fieldRefEntry(BlockDeclaration.currentClassDesc(),"_JTX", ConstantDescs.CD_int))
			.iflt(loopEnd);
		
		codeBuilder.trying(
				blockCodeBuilder -> {
					labelList.build_JUMPTABLE(blockCodeBuilder);
					build_STM_BODY(blockCodeBuilder, begScope, endScope);  // Virtual
					// break _LOOP;
					blockCodeBuilder.goto_(blockCodeBuilder.breakLabel());
				},
				catchBuilder -> catchBuilder.catching(CD.RTS_LABEL,
						blockCodeBuilder -> buildCatchBlock(blockCodeBuilder,loopWhile)));
		codeBuilder.labelBinding(loopEnd);
	}

	// ==================================================================================
    //        catch(RTS_LABEL q) {
    //            RTS_RTObject._TREAT_GOTO_CATCH_BLOCK(_THIS, q);
    //            _JTX=q.index; continue _LOOP; // EG. GOTO Lx
    //        }
	// ==================================================================================
	private void buildCatchBlock(CodeBuilder  codeBuilder,Label contLabel) {
		ConstantPoolBuilder pool=codeBuilder.constantPool();

		// RTS_RTObject._TREAT_GOTO_CATCH_BLOCK(_THIS, q);
		codeBuilder
			.astore(local_LABEL_q)
			.aload(local_THIS)
			.aload(local_LABEL_q)
			.invokestatic(CD.RTS_RTObject,
					"_TREAT_GOTO_CATCH_BLOCK", MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_RTObject;Lsimula/runtime/RTS_LABEL;)V"));

		// _JTX=q.index; continue _LOOP; // EG. GOTO Lx
		codeBuilder
			.aload(0)
			.aload(local_LABEL_q)
			.getfield(pool.fieldRefEntry(CD.RTS_LABEL,"index", ConstantDescs.CD_int))
			.putfield(pool.fieldRefEntry(BlockDeclaration.currentClassDesc(),"_JTX", ConstantDescs.CD_int))
			.goto_(contLabel);
	}
	
	// ***********************************************************************************************
	// *** ByteCoding: buildMethodMain
	// ***********************************************************************************************
//	  public static void main(java.lang.String[]);
//    descriptor: ([Ljava/lang/String;)V
//    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=3, locals=3, args_size=1
//         0: aload_0
//         1: invokestatic  #86                 // Method simula/runtime/RTS_COMMON.setRuntimeOptions:([Ljava/lang/String;)V

//RTS_RTObject prog = new " + getJavaIdentifier() + "(_CTX);");			
//         4: new           #8                  // class simulaTestPrograms/adHoc01
//         7: dup
//         8: getstatic     #92                 // Field _CTX:Lsimula/runtime/RTS_CLASS;
//        11: invokespecial #96                 // Method "<init>":(Lsimula/runtime/RTS_RTObject;)V
//        14: astore_1
//TRY
//        15: aload_1
//        16: invokevirtual #97                 // Method simula/runtime/RTS_RTObject._STM:()Lsimula/runtime/RTS_RTObject;
//        19: pop
//        20: goto          29
//CATCH
//        23: astore_2
//        24: aload_2
//        25: aload_1
//        26: invokestatic  #105                // Method simula/runtime/RTS_RTObject.treatUncaughtException:(Ljava/lang/Throwable;Lsimula/runtime/RTS_RTObject;)V
//END
//        29: return
//      Exception table:
//         from    to  target type
//            15    20    23   Class java/lang/Throwable
    /**
     * Generate byteCode for the 'main' method.
     * <pre>
     *     public static void main(String[] args) {
     *         RTS_COMMON.setRuntimeOptions(args);
     *         new adHoc06(_CTX)._STM();
     *     }
     * </pre>
     * @param codeBuilder the CodeBuilder
     * @param pool the ConstantPoolBuilder
     */
	void buildMethodMain(CodeBuilder codeBuilder) {
		Label begScope = codeBuilder.newLabel();
		Label endScope = codeBuilder.newLabel();

		codeBuilder
				.localVariable(0,"argv",ConstantDescs.CD_String.arrayType(),begScope,endScope)
				.labelBinding(begScope)

				// RTS_COMMON.setRuntimeOptions(args);
				.aload(0) // argv
				.invokestatic(ClassDesc.of("simula.runtime.RTS_COMMON")
						, "setRuntimeOptions", MethodTypeDesc.ofDescriptor("([Ljava/lang/String;)V"));
		codeBuilder
			// new adHoc06(_CTX)._STM();
			.new_(currentClassDesc())
			.dup()
//			.getstatic(currentClassDesc(),"_CTX",CD.RTS_CLASS);
			.getstatic(CD.RTS_RTObject,"_CTX",CD.RTS_BASICIO);

		if(this instanceof PrefixedBlockDeclaration pblk) {
			//  new adHoc05_PBLK14(_CUR,p1,...)._STM();
			// Push parameters
			if(pblk.blockPrefix.checkedParams != null)
				for(Expression expr:pblk.blockPrefix.checkedParams)
					expr.buildEvaluation(null,codeBuilder);

			codeBuilder.invokespecial(currentClassDesc(), "<init>", this.getConstructorMethodTypeDesc());
		} else {
			codeBuilder.invokespecial(currentClassDesc()
							, "<init>", MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_RTObject;)V"));
		}

		//  try _STM(); catch(Throwable t) {   }
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		codeBuilder
			.astore(1)
			.trying(
				blockCodeBuilder -> {
					blockCodeBuilder
						.aload(1)
						.invokevirtual(pool.methodRefEntry(currentClassDesc()
								, "_STM", MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_RTObject;")))
						.pop();
				},
				catchBuilder -> catchBuilder.catching(CD.JAVA_LANG_THROWABLE,
					blockCodeBuilder -> {
						blockCodeBuilder
						//	.astore(2)
						//	.aload(2)
							.aload(1)
							.invokestatic(CD.RTS_RTObject, "treatException",
								MethodTypeDesc.ofDescriptor("(Ljava/lang/Throwable;Lsimula/runtime/RTS_RTObject;)V"));
					}))
			.return_()
			.labelBinding(endScope);
	}
    
	
	protected void printStatementList(int indent) {
		if(Option.internal.PRINT_SYNTAX_TREE > 2) {
			for(Statement s:statements) s.printTree(indent, this);
		} else {
//			System.out.println(""+this);
			System.out.println(edTreeIndent(indent) + ' ' + this.identifier + ' ' + (statements.size()) + " Statements ...");
		}
	}
	
	@Override
	public String toString() {
		return ("" + identifier + '[' + externalIdent + "] ObjectKind=" + declarationKind);
	}

}
