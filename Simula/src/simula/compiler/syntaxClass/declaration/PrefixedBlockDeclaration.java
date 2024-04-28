/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass.declaration;

import java.io.IOException;
import java.lang.classfile.ClassFile;
import java.lang.classfile.CodeBuilder;
import java.lang.classfile.attribute.SourceFileAttribute;
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import java.lang.constant.ClassDesc;
import java.lang.constant.MethodTypeDesc;

import simula.compiler.GeneratedJavaClass;
import simula.compiler.parsing.Parse;
import simula.compiler.syntaxClass.expression.Expression;
import simula.compiler.syntaxClass.expression.VariableExpression;
import simula.compiler.syntaxClass.statement.Statement;
import simula.compiler.utilities.CD;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.LabelList;
import simula.compiler.utilities.KeyWord;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * Prefixed Block Declaration.
 * <pre>
 * Simula Standard: 4.10.1 Prefixed blocks
 *
 *  prefixed-block = block-prefix main-block
 *  
 *     block-prefix = class-identifier [ actual-parameter-part ]
 *     
 *     main-block
 *        = block
 *        | compound-statement
 *        
 *       actual-parameter-part = "(" actual-parameter { , actual-parameter } ")"
 *       
 *          actual-parameter = expression
 *                           | array-identifier-1
 *                           | switch-identifier
 *                           | procedure-identifier-1
 *          
 *          compound-statement = BEGIN statement { ; statement } END
 *
 * </pre>
 * 
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/declaration/PrefixedBlockDeclaration.java">
 * <b>Source File</b></a>.
 * 
 * @author SIMULA Standards Group
 * @author Øystein Myhre Andersen
 */
public final class PrefixedBlockDeclaration extends ClassDeclaration {
	
	/**
	 * The block prefix.
	 */
	public VariableExpression blockPrefix;

	// ***********************************************************************************************
	// *** CONSTRUCTOR
	// ***********************************************************************************************
	/**
	 * PrefixedBlock.
	 * 
	 * @param blockPrefix the block prefix
	 * @param isMainModule true if this block is the main program module.
	 */
	private PrefixedBlockDeclaration(final VariableExpression blockPrefix,boolean isMainModule) {
		super(null);
	}

	// ***********************************************************************************************
	// *** Expect Prefixed Block
	// ***********************************************************************************************
	/**
	 * Parse Utility: Expect PrefixedBlockDeclaration
	 * @param blockPrefix the block prefix
	 * @param isMainModule true if main module
	 * @return the resulting PrefixedBlockDeclaration
	 */
	public static PrefixedBlockDeclaration expectPrefixedBlock(final VariableExpression blockPrefix,boolean isMainModule) {
		PrefixedBlockDeclaration block=new PrefixedBlockDeclaration(blockPrefix,isMainModule);
		block.lineNumber=Parse.prevToken.lineNumber;
		block.declarationKind=ObjectKind.PrefixedBlock;
		Util.ASSERT(blockPrefix != null,"blockPrefix == null");
		block.blockPrefix = blockPrefix;
		block.prefix = blockPrefix.identifier;
		block.isMainModule=isMainModule;
		if (Option.TRACE_PARSE)	Parse.TRACE("Parse PrefixedBlock");
//		while (Declaration.acceptDeclaration(block.declarationList)) Parse.accept(KeyWord.SEMICOLON);
		while (Declaration.acceptDeclaration(block)) Parse.accept(KeyWord.SEMICOLON); // TODO: TESTING3
		while (!Parse.accept(KeyWord.END)) {
			Statement stm = Statement.expectStatement();
			if (stm != null) block.statements.add(stm);
		}
		if(isMainModule)
		     block.modifyIdentifier(Global.sourceName);
		else block.modifyIdentifier("" + Global.sourceName + "_PBLK" + block.lineNumber);
		block.externalIdent = block.identifier;
		block.lastLineNumber = Global.sourceLineNumber;
		if (Option.TRACE_PARSE)	Util.TRACE("Line "+block.lineNumber+": PrefixedBlockDeclaration: "+block);
		Global.setScope(block.declaredIn);
		return block;
	}

	// ***********************************************************************************************
	// *** Checking
	// ***********************************************************************************************
	@Override
	public void doChecking() {
		if (IS_SEMANTICS_CHECKED())	return;
		Global.sourceLineNumber = lineNumber;
		if (externalIdent == null) externalIdent = edJavaClassName();
		currentRTBlockLevel++;
		rtBlockLevel = currentRTBlockLevel;
		Util.ASSERT(blockPrefix != null, "Invariant");
		if (blockPrefix != null) {
			Global.enterScope(this.declaredIn);
			blockPrefix.doChecking();
			this.prefix = blockPrefix.identifier;
			ClassDeclaration prefix=this.getPrefixClass();
			if(prefix!=null) {
				prefix.doChecking();
				LabelList.accumLabelList(this);
			}
			Global.exitScope();
		}
		Global.enterScope(this);
		Util.ASSERT(parameterList.isEmpty(), "Invariant");
		Util.ASSERT(virtualSpecList.isEmpty(), "Invariant");
		Util.ASSERT(hiddenList.isEmpty(), "Invariant");
		Util.ASSERT(protectedList.isEmpty(), "Invariant");

		for (Declaration dcl : declarationList)	dcl.doChecking();
		for (Statement stm : statements) stm.doChecking();
		doCheckLabelList(this.getPrefixClass());
		Global.exitScope();
		currentRTBlockLevel--;
		SET_SEMANTICS_CHECKED();
	}


	// ***********************************************************************************************
	// *** Coding: doJavaCoding
	// ***********************************************************************************************
	@Override
	public void doJavaCoding() {
		Global.sourceLineNumber = lineNumber;
		ASSERT_SEMANTICS_CHECKED();
		GeneratedJavaClass javaModule = new GeneratedJavaClass(this);
		Global.enterScope(this);
		Global.duringSTM_Coding=false;
		GeneratedJavaClass.code("@SuppressWarnings(\"unchecked\")");
		String line = "public final class " + getJavaIdentifier();
		if (prefix != null)
			 line = line + " extends " + getPrefixClass().getJavaIdentifier();
		else line = line + " extends RTS_BASICIO";
		GeneratedJavaClass.code(line + " {");
		GeneratedJavaClass.debug("// PrefixedBlockDeclaration: Kind=" + declarationKind + ", BlockLevel=" + rtBlockLevel
				+ ", firstLine=" + lineNumber + ", lastLine=" + lastLineNumber + ", hasLocalClasses="
				+ ((hasLocalClasses) ? "true" : "false") + ", System=" + ((isQPSystemBlock()) ? "true" : "false")
				+ ", detachUsed=" + ((detachUsed) ? "true" : "false"));
		if (isQPSystemBlock())
			GeneratedJavaClass.code("public boolean isQPSystemBlock() { return(true); }");
		if (isDetachUsed())
			GeneratedJavaClass.code("public boolean isDetachUsed() { return(true); }");
		GeneratedJavaClass.debug("// Declare parameters as attributes");
		for (Parameter par : parameterList) {
			String tp = par.toJavaType();
			GeneratedJavaClass.code("public " + tp + ' ' + par.externalIdent + ';');
		}
		if (labelList != null && !labelList.isEmpty()) {
			GeneratedJavaClass.debug("// Declare local labels");
//			for (Declaration decl : labelList.labels) decl.doJavaCoding();
			for (LabelDeclaration lab : labelList.labels)
//				decl.doJavaCoding();
				lab.declareLocalLabel(this);
		}
		GeneratedJavaClass.debug("// Declare locals as attributes");
		for (Declaration decl : declarationList) decl.doJavaCoding();
		for (VirtualMatch match : virtualMatchList)	match.doJavaCoding();
		doCodeConstructor();
		boolean duringSTM_Coding=Global.duringSTM_Coding;
		Global.duringSTM_Coding=true;
		codeClassStatements();
		Global.duringSTM_Coding=duringSTM_Coding;

		if (this.isMainModule) {
			GeneratedJavaClass.code("");
			GeneratedJavaClass.code("public static void main(String[] args) {");
			GeneratedJavaClass.debug("//System.setProperty(\"file.encoding\",\"UTF-8\");");
			GeneratedJavaClass.code("RTS_COMMON.setRuntimeOptions(args);");
			StringBuilder s = new StringBuilder();
			s.append("new " + getJavaIdentifier() + "(_CTX");
			if (blockPrefix != null && blockPrefix.hasArguments()) {
				for (Expression par : blockPrefix.checkedParams) {
					s.append(',').append(par.toJavaCode());
				}
			}
			s.append(")._STM();");
			GeneratedJavaClass.code("" + s);
			GeneratedJavaClass.code("}", "End of main");
		}
		javaModule.codeProgramInfo();
		GeneratedJavaClass.code("}", "End of Class");
		Global.exitScope();
		javaModule.closeJavaOutput();
	}

	// ***********************************************************************************************
	// *** Coding Utility: doCodeConstructor
	// ***********************************************************************************************
	/**
	 * Coding Utility: Code the constructor.
	 */
	private void doCodeConstructor() {
		GeneratedJavaClass.debug("// Normal Constructor");
		GeneratedJavaClass.code("public " + getJavaIdentifier() + edFormalParameterList());
		if (prefix != null) {
			ClassDeclaration prefixClass = this.getPrefixClass();
			GeneratedJavaClass.code("super" + prefixClass.edCompleteParameterList());
		} else GeneratedJavaClass.code("super(staticLink);");
		GeneratedJavaClass.debug("// Parameter assignment to locals");
		for (Parameter par : parameterList)
			GeneratedJavaClass.code("this." + par.externalIdent + " = s" + par.externalIdent + ';');
		if (this.isMainModule)
			GeneratedJavaClass.code("BPRG(\"" + identifier + "\");");
		GeneratedJavaClass.debug("// Declaration Code");
		for (Declaration decl : declarationList) decl.doDeclarationCoding();
		GeneratedJavaClass.code("}");
	}



	@Override
	public void buildByteCode(CodeBuilder codeBuilder) {
		Global.sourceLineNumber=lineNumber;
		ASSERT_SEMANTICS_CHECKED();
		if (this.isPreCompiledFromFile != null)	return;

		try {
			createJavaClassFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//  new adHoc05_PBLK14((_CUR))._STM();
		//
		//   0: new           #19                 // class simulaTestPrograms/adHoc05_PBLK14
		//   3: dup
		//   4: getstatic     #21                 // Field _CUR:Lsimula/runtime/RTS_RTObject;
		//   7: invokespecial #25                 // Method simulaTestPrograms/adHoc05_PBLK14."<init>":(Lsimula/runtime/RTS_RTObject;)V
		//  10: invokevirtual #26                 // Method simulaTestPrograms/adHoc05_PBLK14._STM:()LsimulaTestPrograms/adHoc05_PBLK14;
		//  13: pop

		ClassDesc CD_pblk=this.getClassDesc();
//		System.out.println("BEGIN PREFIXED BLOCK "+Global.packetName+"."+blockIdent+" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		codeBuilder
			.new_(CD_pblk)
			.dup()
			.getstatic(BlockDeclaration.currentClassDesc(),"_CUR",CD.RTS_RTObject);

		// Push parameters
		if(blockPrefix.checkedParams != null)
			for(Expression expr:blockPrefix.checkedParams)
				expr.buildEvaluation(null,codeBuilder);

		codeBuilder.invokespecial(CD_pblk, "<init>", this.getConstructorMethodTypeDesc());

		// _STM();
		String resultType="Lsimula/runtime/RTS_RTObject;";
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		codeBuilder
			.invokevirtual(pool.methodRefEntry(CD_pblk,"_STM", MethodTypeDesc.ofDescriptor("()"+resultType)))
			.pop()
		;
	}

	// ***********************************************************************************************
	// *** ByteCoding: buildClassFile
	// ***********************************************************************************************
	@Override
	public byte[] buildClassFile() {
		if(Option.verbose) System.out.println("Begin buildClassFile: "+currentClassDesc());
		byte[] bytes = ClassFile.of().build(currentClassDesc(),
				classBuilder -> {
					classBuilder
						.with(SourceFileAttribute.of(Global.sourceFileName))
						.withFlags(ClassFile.ACC_PUBLIC + ClassFile.ACC_SUPER)
						.withSuperclass(this.superClassDesc());

					// Add Fields (Attributes and parameters)
					if(labelList != null) for (LabelDeclaration lab : labelList.labels) lab.buildField(classBuilder,this);
					for (Declaration decl : declarationList) decl.buildField(classBuilder,this);
					for(Parameter par:parameterList) par.buildField(classBuilder,this);
					
					for (VirtualSpecification virtual : virtualSpecList) {
						if (!virtual.hasDefaultMatch) {
							//virtual.doJavaCoding();
							virtual.buildMethod(classBuilder);
						}
					}
					
					for (VirtualMatch match : virtualMatchList) {
						match.buildMethod(classBuilder);
					}


					classBuilder
						.withMethodBody("<init>", MTD_Constructor(), ClassFile.ACC_PUBLIC,
							codeBuilder -> buildConstructor(codeBuilder))
						.withMethodBody("_STM", MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_RTObject;"), ClassFile.ACC_PUBLIC,
							codeBuilder -> buildMethod_STM(codeBuilder));
					
					if (isQPSystemBlock()) {
						//GeneratedJavaClass.code("public boolean isQPSystemBlock() { return(true); }");
						classBuilder
							.withMethodBody("isQPSystemBlock", MethodTypeDesc.ofDescriptor("()Z"), ClassFile.ACC_PUBLIC,
								codeBuilder -> buildIsQPSystemBlock(codeBuilder));
					}
					
					if (isDetachUsed()) {
						//GeneratedJavaClass.code("public boolean isDetachUsed() { return(true); }");
						classBuilder
							.withMethodBody("isDetachUsed", MethodTypeDesc.ofDescriptor("()Z"), ClassFile.ACC_PUBLIC,
								codeBuilder -> buildIsMethodDetachUsed(codeBuilder));
					}
					
					if (this.isMainModule) {
						classBuilder
							.withMethodBody("main", MethodTypeDesc.ofDescriptor("([Ljava/lang/String;)V"), ClassFile.ACC_PUBLIC + ClassFile.ACC_STATIC + ClassFile.ACC_VARARGS,
								codeBuilder -> buildMethodMain(codeBuilder));
					}
				}
		);
		return(bytes);
	}


	// ***********************************************************************************************
	// *** Printing Utility: print
	// ***********************************************************************************************
	@Override
	public void print(final int indent) {
    	String spc=edIndent(indent);
		StringBuilder s = new StringBuilder(spc);
		s.append('[').append(sourceBlockLevel).append(':').append(rtBlockLevel).append("] ");
		if (prefix != null)	s.append(prefix).append(' ');
		s.append(declarationKind).append(' ').append(identifier);
		s.append('[').append(externalIdent).append("] ");
		s.append(Parameter.editParameterList(parameterList));
		Util.println(s.toString());
		String beg = "begin[" + edScopeChain() + ']';
		Util.println(spc + beg);
		for (Declaration decl : declarationList) decl.print(indent + 1);
		for (Statement stm : statements) stm.print(indent + 1);
		Util.println(spc + "end[" + edScopeChain() + ']');
	}
	
	@Override
	public void printTree(final int indent) {
		System.out.println(edTreeIndent(indent)+blockPrefix+" begin  BL="+this.rtBlockLevel);
		if(labelList != null) labelList.printTree(indent+1);
		for(Parameter p:parameterList) p.printTree(indent+1);
		printDeclarationList(indent+1);
		printStatementList(indent+1);
	}

	@Override
	public String toString() {
		return ("" + identifier + '[' + externalIdent + "] Kind=" + declarationKind + ", BlockPrefix=" + blockPrefix);
	}

}
