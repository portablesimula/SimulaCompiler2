/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass.declaration;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.classfile.CodeBuilder;
import java.lang.classfile.Label;
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import java.lang.classfile.constantpool.FieldRefEntry;
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
import simula.compiler.utilities.DeclarationList;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.KeyWord;
import simula.compiler.utilities.ObjectKind;
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
	public Vector<Statement> statements = new Vector<Statement>();

	/**
	 * Last source line number
	 */
	public int lastLineNumber;
	
	/**
	 * If true; all member methods are independent of context
	 */
	public boolean isContextFree;
	
	/**
	 * If not null; this Class/Procedure is Pre-Compiled from a .jar file
	 */
	public String isPreCompiledFromFile;
	
	/**
	 * Used for precompiled Class/Procedure to indicate whether the rtBlock level has been updated.
	 * This is done in the doChecking method of the Class/Procedure
	 */
	public boolean isBlockLevelUpdated;

	
	/**
	 * The Block Declaration that currently is being built
	 */
	public static BlockDeclaration currentBlock;
	
	/**
	 * The previous value of 'currentBlock'
	 */
	private BlockDeclaration prevBlock;

	/**
	 * Compiler state: Points to the BlockDeclaration whose Statements are being built.
	 * Used by LabelList.labelBinding to find the right JUMP_TABLE.
	 */
	public static BlockDeclaration labelContext;

	public static Stack<BlockDeclaration> stmStack = new Stack<BlockDeclaration>();
	
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
	
	// ***********************************************************************************************
	// *** Checking: updateBlockLevels
	// ***********************************************************************************************
	/**
	 * Checking utility: updateBlockLevels in precompiles class or procedure.
	 * @param enclRTBlockLevel enclosing block's rtBlock level
	 */
	protected void updateBlockLevels(int enclRTBlockLevel) {
		this.rtBlockLevel = this.rtBlockLevel + enclRTBlockLevel;
		this.isBlockLevelUpdated = true;
		for(Declaration decl:declarationList) {
			if(decl instanceof BlockDeclaration blk) {
				if(!blk.isBlockLevelUpdated) blk.updateBlockLevels(enclRTBlockLevel);
			}
		}
	}

	// ***********************************************************************************************
	// *** Checking: doCheckLabelList
	// ***********************************************************************************************
	/**
	 * Checking utility: doCheckLabelList.
	 * @param prefixClass possible prefix or null
	 */
	protected void doCheckLabelList(final ClassDeclaration prefixClass) {
		if(prefixClass != null) {
			currentRTBlockLevel--;
			prefixClass.doChecking();
//			nextIndex = prefixClass.setLabelIndexes(nextIndex);
			currentRTBlockLevel++;
		}
		
		if(labelList != null) labelList.setLabelIdexes();
	}

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

	
	/**
	 * Prepare the declaration list for attribute output.
	 * 
	 * @param declarationList
	 * @return
	 */
	protected DeclarationList prep(DeclarationList declarationList) {
		DeclarationList res = new DeclarationList("");
		for(Declaration decl:declarationList) {
			if(decl instanceof ArrayDeclaration) res.add(decl);
			else if(decl instanceof ClassDeclaration && !(decl instanceof StandardClass)) res.add(decl);
			else if(decl instanceof ExternalDeclaration) res.add(decl);
			else if(decl instanceof LabelDeclaration) res.add(decl);
			else if(decl instanceof ProcedureDeclaration) res.add(decl);
			else if(decl instanceof SimpleVariableDeclaration) res.add(decl);
			else if(decl instanceof SwitchDeclaration) res.add(decl);
		}
		return(res);
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

	// ***********************************************************************************************
	// *** Coding Utility: hasLabel
	// ***********************************************************************************************
	/**
	 * Returns true if this block has one ore more labels.
	 * @return true if this block has one ore more labels.
	 */
	protected boolean hasLabel() {
		// Needs redefinition for ClassDeclaration
		ASSERT_SEMANTICS_CHECKED();
		return (labelList != null && !labelList.isEmpty());
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

	// ***********************************************************************************************
	// *** Coding Utility: getNlabels
	// ***********************************************************************************************
	/**
	 * Returns the number of labels in this block.
	 * <p>
	 * Redefined in ClassDeclaration
	 * 
	 * @return the number of labels in this class
	 */
	public int getNlabels() {
		return (labelList.tableSize());
	}

//	// ***********************************************************************************************
//	// *** Coding Utility: getNextLabelIndex
//	// ***********************************************************************************************
//	/**
//	 * Returns the next Label index for labels in this block.
//	 * <p>
//	 * Redefined in ClassDeclaration
//	 * 
//	 * @return the next Label index for labels in this block
//	 */
//	public int getNextLabelIndex() {
//		return getNlabels() + 1; 
//	}

	// ***********************************************************************************************
	// *** Coding Utility: codeSTMBody
	// ***********************************************************************************************
	/**
	 * Coding utility: Code STM body
	 */
	protected void codeSTMBody() {
		if (hasLabel()) {
			GeneratedJavaClass.code(externalIdent + " _THIS=(" + externalIdent + ")_CUR;");
			GeneratedJavaClass.code("_LOOP:while(_JTX>=0) {");
			GeneratedJavaClass.code("try {");
			GeneratedJavaClass.code("_JUMPTABLE(_JTX,"+this.getNlabels()+");","For ByteCode Engineering");			
			Global.currentJavaModule.mustDoByteCodeEngineering=true;
		}
		codeStatements();
		if (hasLabel()) {
			GeneratedJavaClass.code("break _LOOP;");
			GeneratedJavaClass.code("}");
			GeneratedJavaClass.code("catch(RTS_LABEL q) {");
			GeneratedJavaClass.code("_CUR=_THIS;");
			GeneratedJavaClass.code("if(q._SL!=_CUR) {");
			GeneratedJavaClass.debug("if(RTS_Option.GOTO_TRACING) TRACE_GOTO(\"" + identifier + ":NON-LOCAL\",q);");
			GeneratedJavaClass.code("_CUR._STATE=OperationalState.terminated;");
			GeneratedJavaClass.debug("if(RTS_Option.GOTO_TRACING) TRACE_GOTO(\"" + identifier + ":RE-THROW\",q);");
			GeneratedJavaClass.code("throw(q);");
			GeneratedJavaClass.code("}");
			GeneratedJavaClass.debug("if(RTS_Option.GOTO_TRACING) TRACE_GOTO(\"" + identifier + ":LOCAL\",q);");
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
		for (Statement stm : statements) stm.doJavaCoding();
		Global.duringSTM_Coding=duringSTM_Coding;
	}

	// ***********************************************************************************************
	// *** createJavaClassFile
	// ***********************************************************************************************
	/**
	 * Create Java ClassFile.
	 * @throws IOException 
	 */
    public void createJavaClassFile() throws IOException {
		if (this.isPreCompiledFromFile != null)	return;
		prevBlock = currentBlock;
		currentBlock = this;

        byte[] bytes = buildClassFile();
        currentBlock = prevBlock;

        if(bytes != null) {
            File outputFile = new File(Global.tempClassFileDir + "\\" + Global.packetName + "\\" + externalIdent + ".class");
            outputFile.getParentFile().mkdirs();
            FileOutputStream oupt = new FileOutputStream(outputFile);
            oupt.write(bytes); oupt.flush(); oupt.close();
            if(Option.verbose) System.out.println("ClassFile written to: " + outputFile + "  nBytes="+bytes.length);

			if(Option.LIST_GENERATED_CLASS_FILES) {
				Util.doListClassFile("" + outputFile); // List generated .class file
			}
        }
    }

    
    // ***********************************************************************************************
    // *** ByteCoding: buildClassFile
    // ***********************************************************************************************
    public byte[] buildClassFile() {
        Util.IERR("Method buildClassFile need a redefinition in "+this.getClass().getSimpleName());
        return(null);
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
			codeBuilder
				.labelBinding(begScope)
				.localVariable(0,"this",currentClassDesc(),begScope,endScope);
			
				if(Option.TESTING_STACK_SIZE) {
					checkStackSize = codeBuilder.newLabel();
					codeBuilder
						.aconst_null()                 // TESTING_STACK_SIZE
						.if_nonnull(checkStackSize);   // TESTING_STACK_SIZE
				}
//				if (hasLabel())	
				if (this.labelList != null && !this.labelList.isEmpty())	
					build_TRY_CATCH(codeBuilder, begScope, endScope);
				else build_STM_BODY(codeBuilder, begScope, endScope);
				codeBuilder
					.aload(0)
					.invokevirtual(pool.methodRefEntry(currentClassDesc(),"EBLK", MethodTypeDesc.ofDescriptor("()V")));
					
				if(Option.TESTING_STACK_SIZE) {
					codeBuilder.labelBinding(checkStackSize);  // TESTING_STACK_SIZE
				}
				
				codeBuilder
					.aload(0)
					.areturn()
					
			.labelBinding(endScope);
		Global.exitScope();
	}
	
	protected void build_STM_BODY(CodeBuilder codeBuilder, Label begScope, Label endScope) {
		Util.IERR("Missing Override");
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
    //            _CUR=_THIS;
    //            if(q._SL!=_CUR) {
    //                if(Option.GOTO_TRACING) TRACE_GOTO("adHoc000:NON-LOCAL",q);
    //                _CUR._STATE=OperationalState.terminated;
    //                if(Option.GOTO_TRACING) TRACE_GOTO("adHoc000:RE-THROW",q);
    //                throw(q);
    //            }
    //            if(Option.GOTO_TRACING) TRACE_GOTO("adHoc000:LOCAL",q);
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
		
		local_THIS = BlockDeclaration.currentBlock.allocateLocalVariable(Type.Ref);
		local_LABEL_q = BlockDeclaration.currentBlock.allocateLocalVariable(Type.Ref);
		codeBuilder.localVariable(local_THIS,"_THIS",CD.RTS_RTObject,begScope,endScope);
		codeBuilder.localVariable(local_LABEL_q,"label_q",CD.RTS_LABEL,begScope,endScope);
		
//		initTableSwitchCases();
//		tableSwitchCases = new Vector<SwitchCase>();
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
//					jumpTable.build_JUMPTABLE(blockCodeBuilder);
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
    //            _CUR=_THIS;
    //            if(q._SL!=_CUR) {
    //                if(Option.GOTO_TRACING) TRACE_GOTO("adHoc000:NON-LOCAL",q);
    //                _CUR._STATE=OperationalState.terminated;
    //                if(Option.GOTO_TRACING) TRACE_GOTO("adHoc000:RE-THROW",q);
    //                throw(q);
    //            }
    //            if(Option.GOTO_TRACING) TRACE_GOTO("adHoc000:LOCAL",q);
    //            _JTX=q.index; continue _LOOP; // EG. GOTO Lx
    //        }
	// ==================================================================================
	private void buildCatchBlock(CodeBuilder  codeBuilder,Label contLabel) {
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		FieldRefEntry FRE_CUR = pool.fieldRefEntry(currentClassDesc(), "_CUR", CD.RTS_RTObject);

//		Util.buildSNAPSHOT2(codeBuilder, "BlockDeclaration.buildCatchBlock: CATCHING LABEL");

		// _CUR=_THIS;
		codeBuilder
			.astore(local_LABEL_q)
			.aload(local_THIS)
			.putstatic(FRE_CUR);
		
		// if(q._SL!=_CUR) {
		Label endIfLabel = codeBuilder.newLabel();
		FieldRefEntry FRE_SL=pool.fieldRefEntry(CD.RTS_LABEL, "_SL", CD.RTS_RTObject);
		codeBuilder
			.aload(local_LABEL_q)
			.getfield(FRE_SL)
			.getstatic(FRE_CUR)
			.if_acmpeq(endIfLabel);
		
		buildTraceGOTO(codeBuilder,"NON-LOCAL");
		
		// _CUR._STATE=OperationalState.terminated;
		codeBuilder
			.invokestatic(CD.RTS_RTObject,
				"SET_CUR_TERMINATED", MethodTypeDesc.ofDescriptor("()V"));

		
		buildTraceGOTO(codeBuilder,"RE-THROW");
		
		// throw(q);
		codeBuilder
			.aload(local_LABEL_q)
			.athrow()   // Throw LABEL q
			.labelBinding(endIfLabel);
		
		buildTraceGOTO(codeBuilder,"LOCAL");

		// _JTX=q.index; continue _LOOP; // EG. GOTO Lx
		codeBuilder
			.aload(0)
			.aload(local_LABEL_q)
			.getfield(pool.fieldRefEntry(CD.RTS_LABEL,"index", ConstantDescs.CD_int))
			.putfield(pool.fieldRefEntry(BlockDeclaration.currentClassDesc(),"_JTX", ConstantDescs.CD_int))
			.goto_(contLabel);
	}

	private void buildTraceGOTO(CodeBuilder  codeBuilder,String mss) {
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		Label endLabel = codeBuilder.newLabel();
		codeBuilder
//		.getstatic(ClassDesc.of("simula.runtime.RTS_COMMON$Option"),"GOTO_TRACING",ConstantDescs.CD_boolean)
			.getstatic(ClassDesc.of("simula.runtime.RTS_Option"),"GOTO_TRACING",ConstantDescs.CD_boolean)
			.ifeq(endLabel)
			.ldc(pool.stringEntry(mss))
			.aload(local_LABEL_q)  // Label quant
			.invokestatic(CD.RTS_RTObject,
					"TRACE_GOTO", MethodTypeDesc.ofDescriptor("(Ljava/lang/String;Lsimula/runtime/RTS_LABEL;)V"))
			.labelBinding(endLabel);
	}
	
	// ***********************************************************************************************
	// *** ByteCoding: buildMethodMain
	// ***********************************************************************************************
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
			.getstatic(currentClassDesc(),"_CTX",CD.RTS_CLASS);

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

		// _STM();
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		codeBuilder
			.invokevirtual(pool.methodRefEntry(currentClassDesc()
						, "_STM", MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_RTObject;")))
			.pop()
			.return_()
			.labelBinding(endScope);
	}
    
	
	protected void printStatementList(int indent) {
		for(Statement s:statements) s.printTree(indent);
	}
	


	@Override
	public String toString() {
		return ("" + identifier + '[' + externalIdent + "] ObjectKind=" + declarationKind);
	}

}
