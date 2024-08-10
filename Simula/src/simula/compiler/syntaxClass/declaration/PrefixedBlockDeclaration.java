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
import simula.compiler.AttributeInputStream;
import simula.compiler.AttributeOutputStream;
import simula.compiler.GeneratedJavaClass;
import simula.compiler.parsing.Parse;
import simula.compiler.syntaxClass.HiddenSpecification;
import simula.compiler.syntaxClass.ProtectedSpecification;
import simula.compiler.syntaxClass.expression.Expression;
import simula.compiler.syntaxClass.expression.VariableExpression;
import simula.compiler.syntaxClass.statement.Statement;
import simula.compiler.utilities.CD;
import simula.compiler.utilities.ClassHierarchy;
import simula.compiler.utilities.DeclarationList;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.LabelList;
import simula.compiler.utilities.KeyWord;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.ObjectList;
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
	 */
	private PrefixedBlockDeclaration(boolean isMainModule) {
		super(null);
		if(isMainModule)
			modifyIdentifier(Global.sourceName);
		else modifyIdentifier("PBLK" + lineNumber);
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
		PrefixedBlockDeclaration block=new PrefixedBlockDeclaration(isMainModule);
		block.lineNumber=Parse.prevToken.lineNumber;
		block.declarationKind=ObjectKind.PrefixedBlock;
		Util.ASSERT(blockPrefix != null,"blockPrefix == null");
		block.blockPrefix = blockPrefix;
		block.prefix = blockPrefix.identifier;
		block.isMainModule=isMainModule;
		if (Option.internal.TRACE_PARSE)	Parse.TRACE("Parse PrefixedBlock");
		while (Declaration.acceptDeclaration(block)) Parse.accept(KeyWord.SEMICOLON);
		while (!Parse.accept(KeyWord.END)) {
			Statement stm = Statement.expectStatement();
			if (stm != null) block.statements.add(stm);
		}
//		block.externalIdent = block.identifier;
		block.lastLineNumber = Global.sourceLineNumber;
		if (Option.internal.TRACE_PARSE)	Util.TRACE("Line "+block.lineNumber+": PrefixedBlockDeclaration: "+block);
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
		Util.ASSERT(blockPrefix != null, "Invariant");
		if (blockPrefix != null) {
			Global.enterScope(this.declaredIn);
			blockPrefix.doChecking();
			this.prefix = blockPrefix.identifier;
			ClassDeclaration prefix=this.getPrefixClass();
			if(prefix!=null) {
				prefix.doChecking();
//				LabelList.accumLabelList(this);
			}
			LabelList.accumLabelList(this);
			Global.exitScope();
		}
		Global.enterScope(this);
		Util.ASSERT(parameterList.isEmpty(), "Invariant");
		Util.ASSERT(virtualSpecList.isEmpty(), "Invariant");
		Util.ASSERT(hiddenList.isEmpty(), "Invariant");
		Util.ASSERT(protectedList.isEmpty(), "Invariant");

		for (Declaration dcl : declarationList)	dcl.doChecking();
		for (Statement stm : statements) stm.doChecking();
//		doCheckLabelList(this.getPrefixClass());
		Global.exitScope();
		SET_SEMANTICS_CHECKED();
	}

	// ***********************************************************************************************
	// *** Coding: doJavaCoding
	// ***********************************************************************************************
	@Override
	public void doJavaCoding() {
		Global.sourceLineNumber = lineNumber;
		ASSERT_SEMANTICS_CHECKED();
		if (this.isPreCompiledFromFile != null) {
			if(Option.verbose) System.out.println("Skip  doJavaCoding: "+this.identifier+" -- It is read from "+isPreCompiledFromFile);	
			return;
		}
		GeneratedJavaClass javaModule = new GeneratedJavaClass(this);
		Global.enterScope(this);
			labelList.setLabelIdexes();
			boolean duringSTM_Coding=Global.duringSTM_Coding;
			Global.duringSTM_Coding=false;
			GeneratedJavaClass.code("@SuppressWarnings(\"unchecked\")");
			String line = "public final class " + getJavaIdentifier();
			if (prefix != null)
				 line = line + " extends " + getPrefixClass().getJavaIdentifier();
			else line = line + " extends RTS_BASICIO";
			GeneratedJavaClass.code(line + " {");
			GeneratedJavaClass.debug("// PrefixedBlockDeclaration: Kind=" + declarationKind + ", BlockLevel=" + getRTBlockLevel()
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
			if(this.hasAccumLabel()) {
				GeneratedJavaClass.debug("// Declare local labels");
				for (LabelDeclaration lab : labelList.getAccumLabels())
					lab.declareLocalLabel(this);
			}
			GeneratedJavaClass.debug("// Declare locals as attributes");
			for (Declaration decl : declarationList) decl.doJavaCoding();
			for (VirtualMatch match : virtualMatchList)	match.doJavaCoding();
			doCodeConstructor();
			Global.duringSTM_Coding=true;
			codeClassStatements();
			Global.duringSTM_Coding=duringSTM_Coding;
	
			if (this.isMainModule) {
				GeneratedJavaClass.code("");
				GeneratedJavaClass.code("public static void main(String[] args) {");
				GeneratedJavaClass.debug("//System.setProperty(\"file.encoding\",\"UTF-8\");");
				GeneratedJavaClass.code("RTS_COMMON.setRuntimeOptions(args);");
				
				StringBuilder sb = new StringBuilder();
				sb.append("new " + getJavaIdentifier() + "(_CTX");
				if (blockPrefix != null && blockPrefix.hasArguments()) {
					for (Expression par : blockPrefix.checkedParams) {
						sb.append(',').append(par.toJavaCode());
					}
				} sb.append(");");
				
				GeneratedJavaClass.code("RTS_RTObject prog = " + sb);
				GeneratedJavaClass.code("    try { prog._STM(); } catch(Throwable e) { RTS_RTObject.treatException(e, prog); }");
				
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
		if (this.isPreCompiledFromFile != null) {
			if(Option.verbose)
				System.out.println("Skip  buildClassFile: "+this.identifier+" extends "+this.prefix+" -- It is read from "+isPreCompiledFromFile);		
		} else {
			try { createJavaClassFile(); } catch (IOException e) { e.printStackTrace(); }
		}

		// ===================================================
		//  new adHoc05_PBLK14((_CUR), par1, ...)._STM();
		// ===================================================
		ClassDesc CD_pblk=this.getClassDesc();
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
		//         new adHoc00_PBLK4((_CUR))._START();

		String resultType="Lsimula/runtime/RTS_RTObject;";
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		String name = (isDetachUsed())? "_START" : "_STM";
		codeBuilder
//			.invokevirtual(pool.methodRefEntry(CD_pblk,"_STM", MethodTypeDesc.ofDescriptor("()"+resultType)))
			.invokevirtual(pool.methodRefEntry(CD_pblk,name, MethodTypeDesc.ofDescriptor("()"+resultType)))
			.pop()
		;
	}

	// ***********************************************************************************************
	// *** ByteCoding: buildClassFile
	// ***********************************************************************************************
	@Override
	public byte[] buildClassFile() {
		labelList.setLabelIdexes();
		ClassDesc CD_ThisClass = currentClassDesc();
		ClassDesc CD_SuperClass = superClassDesc();
		if(Option.verbose) System.out.println("Begin buildClassFile: PrefixecBlock " + CD_ThisClass + " extends " + CD_SuperClass);
		
		ClassHierarchy.addClassToSuperClass(CD_ThisClass, this.superClassDesc());
		
		byte[] bytes = ClassFile.of(ClassFile.ClassHierarchyResolverOption.of(ClassHierarchy.getResolver())).build(CD_ThisClass,
				classBuilder -> {
					classBuilder
						.with(SourceFileAttribute.of(Global.sourceFileName))
						.withFlags(ClassFile.ACC_PUBLIC + ClassFile.ACC_SUPER)
						.withSuperclass(this.superClassDesc());

					// Add Fields (Attributes and parameters)
					if(this.hasAccumLabel())
						for (LabelDeclaration lab : labelList.getAccumLabels())
							lab.buildDeclaration(classBuilder,this);
					
					for (Declaration decl : declarationList)
						decl.buildDeclaration(classBuilder,this);
					
					for(Parameter par:parameterList)
						par.buildDeclaration(classBuilder,this);
					
					for (VirtualSpecification virtual : virtualSpecList)
						if (!virtual.hasDefaultMatch)
							//virtual.doJavaCoding();
							virtual.buildMethod(classBuilder);
					
					for (VirtualMatch match : virtualMatchList)
						match.buildMethod(classBuilder);

					classBuilder
						.withMethodBody("<init>", MethodTypeDesc.ofDescriptor(edConstructorSignature()), ClassFile.ACC_PUBLIC,
							codeBuilder -> buildConstructor(codeBuilder))
						.withMethodBody("_STM", MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_RTObject;"), ClassFile.ACC_PUBLIC,
							codeBuilder -> buildMethod_STM(codeBuilder) );
					
					if (isQPSystemBlock())
						classBuilder
							.withMethodBody("isQPSystemBlock", MethodTypeDesc.ofDescriptor("()Z"), ClassFile.ACC_PUBLIC,
								codeBuilder -> buildIsQPSystemBlock(codeBuilder));
					
					if (isDetachUsed())
						//GeneratedJavaClass.code("public boolean isDetachUsed() { return(true); }");
						classBuilder
							.withMethodBody("isDetachUsed", MethodTypeDesc.ofDescriptor("()Z"), ClassFile.ACC_PUBLIC,
								codeBuilder -> buildIsMethodDetachUsed(codeBuilder));
					
					if (this.isMainModule)
						classBuilder
							.withMethodBody("main", MethodTypeDesc.ofDescriptor("([Ljava/lang/String;)V"),
									ClassFile.ACC_PUBLIC + ClassFile.ACC_STATIC + ClassFile.ACC_VARARGS,
								codeBuilder -> buildMethodMain(codeBuilder));
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
		s.append('[').append(sourceBlockLevel).append(':').append(getRTBlockLevel()).append("] ");
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
	public void printTree(final int indent, final Object head) {
		verifyTree(head);
		String BL = (IS_SEMANTICS_CHECKED()) ? "  BL=" + getRTBlockLevel() : "";
		System.out.println(edTreeIndent(indent) + blockPrefix + " begin" + BL);
		if(labelList != null) labelList.printTree(indent+1,this);
		for(Parameter p : parameterList) p.printTree(indent+1,this);
		printDeclarationList(indent+1);
		printStatementList(indent+1);
	}

	@Override
	public String toString() {
		return ("" + identifier + '[' + externalIdent + "] Kind=" + declarationKind + ", BlockPrefix=" + blockPrefix);
	}

	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************
	private PrefixedBlockDeclaration() {
		super(null);
	}

	public void writeObject(AttributeOutputStream oupt) throws IOException {
		Util.TRACE_OUTPUT("PrefixedBlockDeclaration: " + identifier + ", Declared in: " + declaredIn);
		oupt.writeKind(declarationKind); // Mark: This is a PrefixedBlockDeclaration
		oupt.writeString(identifier);
		oupt.writeShort(OBJECT_SEQU);
		// *** SyntaxClass
		oupt.writeShort(lineNumber);
		
		// *** Declaration
		//oupt.writeString(identifier);
		oupt.writeString(externalIdent);
		oupt.writeType(type);// Declaration
//		oupt.writeObj(declaredIn);// Declaration
		
		// *** DeclarationScope
		oupt.writeString(sourceFileName);
		oupt.writeString(isPreCompiledFromFile);
		oupt.writeBoolean(hasLocalClasses);
		LabelList.writeLabelList(labelList, oupt);
		DeclarationList decls = prep(declarationList);
		decls.writeObject(oupt);

		// *** BlockDeclaration
		oupt.writeBoolean(isMainModule);
		oupt.writeObjectList(statements);
		
		// *** ClassDeclaration
		oupt.writeString(prefix);
		oupt.writeBoolean(detachUsed);
		oupt.writeObjectList(parameterList);
		oupt.writeObjectList(virtualSpecList);
		oupt.writeObjectList(hiddenList);
		oupt.writeObjectList(protectedList);
		oupt.writeObjectList(statements1);
		
		// *** PrefixedBlockDeclaration
		oupt.writeObj(blockPrefix);
	}

	@SuppressWarnings("unchecked")
	public static PrefixedBlockDeclaration readObject(AttributeInputStream inpt) throws IOException {
		PrefixedBlockDeclaration pbl = new PrefixedBlockDeclaration();
		pbl.identifier = (String) inpt.readString();
		pbl.declarationKind = ObjectKind.Class;
		pbl.OBJECT_SEQU = inpt.readSEQU(pbl);
		// *** SyntaxClass
		pbl.lineNumber = inpt.readShort();

		// *** Declaration
		//pbl.identifier = inpt.readString();
		pbl.externalIdent = inpt.readString();
		pbl.type = inpt.readType();
//		pbl.declaredIn = (DeclarationScope) inpt.readObj();

		// *** DeclarationScope
		pbl.sourceFileName = inpt.readString();
		pbl.isPreCompiledFromFile = inpt.readString();
		pbl.hasLocalClasses = inpt.readBoolean();
		pbl.labelList = LabelList.readLabelList(inpt);
		pbl.declarationList = DeclarationList.readObject(inpt);

		// *** BlockDeclaration
		pbl.isMainModule = inpt.readBoolean();
		pbl.statements = (ObjectList<Statement>) inpt.readObjectList();
		
		// *** ClassDeclaration
		pbl.prefix = inpt.readString();
		pbl.detachUsed = inpt.readBoolean();
		pbl.parameterList = (ObjectList<Parameter>) inpt.readObjectList();
		pbl.virtualSpecList = (ObjectList<VirtualSpecification>) inpt.readObjectList();
		pbl.hiddenList = (ObjectList<HiddenSpecification>) inpt.readObjectList();
		pbl.protectedList = (ObjectList<ProtectedSpecification>) inpt.readObjectList();
		pbl.statements1 = (ObjectList<Statement>) inpt.readObjectList();
		if(!Option.internal.CREATE_JAVA_SOURCE)
			pbl.isPreCompiledFromFile = inpt.jarFileName;
		
		// *** PrefixedBlockDeclaration
		pbl.blockPrefix = (VariableExpression) inpt.readObj();
		
		if(!Option.internal.CREATE_JAVA_SOURCE)
			pbl.isPreCompiledFromFile = inpt.jarFileName;
//		System.out.println("PrefixedBlockDeclaration.readObject: PrefixedBlock "+pbl.identifier+" isPreCompiledFromFile="+pbl.isPreCompiledFromFile);
		Util.TRACE_INPUT("END Read PrefixedBlockDeclaration: " + pbl.identifier + ", Declared in: " + pbl.declaredIn);
		Global.setScope(pbl.declaredIn);
		return(pbl);
	}

}
