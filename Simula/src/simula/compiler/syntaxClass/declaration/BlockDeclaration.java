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
import simula.compiler.utilities.RTS;
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
	// *** Coding Utility: codeStatements
	// ***********************************************************************************************
	/**
	 * Coding utility: Code Method Main
	 */
    protected void codeMethodMain() {
    	// GENERATES:
    	//
    	// public static void main(String[] args) {
    	//	 // System.setProperty("file.encoding","UTF-8");
    	//	 RTS_UTIL.BPRG("adHoc04", args);
    	//	 RTS_UTIL.RUN_STM(new adHoc04(_CTX));
    	// } // End of main
    	String progid = this.externalIdent;
		GeneratedJavaClass.code("");
		GeneratedJavaClass.code("public static void main(String[] args) {");
		GeneratedJavaClass.debug("//System.setProperty(\"file.encoding\",\"UTF-8\");");
		GeneratedJavaClass.code("RTS_UTIL.BPRG(\""+progid+"\", args);");
		if(this instanceof PrefixedBlockDeclaration pblk) {
			StringBuilder sb = new StringBuilder();
			sb.append("new " + getJavaIdentifier() + "(_CTX");
			if (pblk.blockPrefix != null && pblk.blockPrefix.hasArguments()) {
				for (Expression par : pblk.blockPrefix.checkedParams) {
					sb.append(',').append(par.toJavaCode());
				}
			} sb.append(")");
			GeneratedJavaClass.code("RTS_UTIL.RUN_STM(" + sb + ");");
		} else {
			GeneratedJavaClass.code("RTS_UTIL.RUN_STM(new " + getJavaIdentifier() + "(_CTX));");			
		}
		GeneratedJavaClass.code("}", "End of main");
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
						.aconst_null()                // TESTING_STACK_SIZE
						.ifnonnull(checkStackSize);   // TESTING_STACK_SIZE
				}
				if (hasAccumLabel())	
					 build_TRY_CATCH(codeBuilder, begScope, endScope);
				else build_STM_BODY(codeBuilder, begScope, endScope);
				codeBuilder.aload(0);
				RTS.invokevirtual_RTObject_EBLK(codeBuilder);
					
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
		codeBuilder.localVariable(local_THIS,"_THIS",RTS.CD.RTS_RTObject,begScope,endScope);
		codeBuilder.localVariable(local_LABEL_q,"label_q",RTS.CD.RTS_LABEL,begScope,endScope);
		
	    // adHoc000 _THIS=(adHoc000)_CUR;
		codeBuilder
			.aload(0)
			.astore(local_THIS);  // THIS
		
	    // _LOOP:while(_JTX>=0) {
		codeBuilder
			.labelBinding(loopWhile)
			.aload(0)
//			.getfield(pool.fieldRefEntry(BlockDeclaration.currentClassDesc(),"_JTX", ConstantDescs.CD_int))
			.getfield(RTS.FRE.RTObject_JTX(pool))
			.iflt(loopEnd);
		
		codeBuilder.trying(
				blockCodeBuilder -> {
					labelList.build_JUMPTABLE(blockCodeBuilder);
					build_STM_BODY(blockCodeBuilder, begScope, endScope);  // Virtual
					// break _LOOP;
					blockCodeBuilder.goto_(blockCodeBuilder.breakLabel());
				},
				catchBuilder -> catchBuilder.catching(RTS.CD.RTS_LABEL,
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
			.invokestatic(RTS.CD.RTS_RTObject,
					"_TREAT_GOTO_CATCH_BLOCK", MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_RTObject;Lsimula/runtime/RTS_LABEL;)V"));

		// _JTX=q.index; continue _LOOP; // EG. GOTO Lx
		codeBuilder
			.aload(0)
			.aload(local_LABEL_q)
//			.getfield(pool.fieldRefEntry(RTS.CD.RTS_LABEL,"index", ConstantDescs.CD_int))
//			.putfield(pool.fieldRefEntry(BlockDeclaration.currentClassDesc(),"_JTX", ConstantDescs.CD_int))
			.getfield(RTS.FRE.LABEL_index(pool))
			.putfield(RTS.FRE.RTObject_JTX(pool))
			.goto_(contLabel);
	}
	
	// ***********************************************************************************************
	// *** ByteCoding: buildMethodMain
	// ***********************************************************************************************
    /**
     * Generate byteCode for the 'main' method.
     * <pre>
     *     public static void main(String[] argv) {
     *         RTS_UTIL.BPRG(progid, argv);
     *         RTS_UTIL_RUN_STM(new userProg(_CTX, ...));
     *     }
     * </pre>
     * @param codeBuilder the CodeBuilder
     * @param pool the ConstantPoolBuilder
     */
	void buildMethodMain(CodeBuilder codeBuilder) {
		Label begScope = codeBuilder.newLabel();
		Label endScope = codeBuilder.newLabel();
		ConstantPoolBuilder pool=codeBuilder.constantPool();

		codeBuilder
				.localVariable(0,"argv",ConstantDescs.CD_String.arrayType(),begScope,endScope)
				.labelBinding(begScope);

		// RTS_UTIL.BPRG(progid, argv);
		codeBuilder
				.ldc(pool.stringEntry(this.externalIdent))
				.aload(0); // argv
		RTS.invokestatic_UTIL_BPRG(codeBuilder);
		
		codeBuilder
			// new adHoc06(_CTX)._STM();
			.new_(currentClassDesc())
			.dup()
			.getstatic(RTS.FRE.RTObject_CTX(pool));

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
			
		RTS.invokestatic_UTIL_RUN_STM(codeBuilder);
			
		codeBuilder
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
