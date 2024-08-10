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
import java.lang.classfile.Label;
import java.lang.classfile.attribute.SourceFileAttribute;
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import java.lang.constant.ClassDesc;
import java.lang.constant.MethodTypeDesc;
import java.util.Vector;

import simula.compiler.AttributeInputStream;
import simula.compiler.AttributeOutputStream;
import simula.compiler.GeneratedJavaClass;
import simula.compiler.parsing.Parse;
import simula.compiler.syntaxClass.SyntaxClass;
import simula.compiler.syntaxClass.statement.BlockStatement;
import simula.compiler.syntaxClass.statement.DummyStatement;
import simula.compiler.syntaxClass.statement.Statement;
import simula.compiler.utilities.CD;
import simula.compiler.utilities.ClassHierarchy;
import simula.compiler.utilities.DeclarationList;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.LabelList;
import simula.compiler.utilities.KeyWord;
import simula.compiler.utilities.Meaning;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.ObjectList;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * Maybe Block Declaration. I.e: CompoundStatement or SubBlock depends on
 * whether it contains declarations.
 * 
 * <pre>
 * Simula Standard: 4.9 Compound statement
 * Simula Standard: 4.9 Blocks
 *  
 *   MaybeBlockDeclaration = compound-statement | subblock
 * 
 *	    compound-statement = BEGIN [ { statement ; } ] END
 *
 * 	    subblock = BEGIN [ { declaration ; } ]  [ { statement ; } ] END
 *
 * </pre>
 * 
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/declaration/MaybeBlockDeclaration.java">
 * <b>Source File</b></a>.
 * 
 * @author SIMULA Standards Group
 * @author Øystein Myhre Andersen
 */
public final class MaybeBlockDeclaration extends BlockDeclaration {

	// ***********************************************************************************************
	// *** CONSTRUCTORS
	// ***********************************************************************************************
	// Used by expectMaybeBlock, i.e. CompoundStatement or SubBlock.
	/**
	 * Create a new MaybeBlockDeclaration.
	 * 
	 * @param identifier block identifier
	 */
	public MaybeBlockDeclaration(final String identifier) {
		super(identifier);
		if(identifier != null)
			modifyIdentifier(identifier);
		else modifyIdentifier("Block" + lineNumber);
//		System.out.println("NEW MaybeBlockDeclaration: "+this.identifier+", declaredIn="+this.declaredIn+", CurrentScope="+Global.getCurrentScope());
	}

	// ***********************************************************************************************
	// *** createMainProgramBlock
	// ***********************************************************************************************
	/**
	 * Create the main program block. Used by ProgramModule.
	 * 
	 * @return the main program block
	 */
	public static MaybeBlockDeclaration createMainProgramBlock() {
		int lineNumber=Parse.prevToken.lineNumber;
		if (Option.internal.TRACE_PARSE)	Util.TRACE("BlockStatement.createMainProgramBlock: line="+lineNumber+" "+Parse.prevToken);
		MaybeBlockDeclaration module = new MaybeBlockDeclaration(Global.sourceName);
		module.isMainModule = true;
		module.declarationKind = ObjectKind.SimulaProgram;
		module.expectMaybeBlock(lineNumber);
		return (module);
	}

	// ***********************************************************************************************
	// *** Parsing: expectMaybeBlock
	// ***********************************************************************************************
	/**
	 * Parse CompoundStatement or SubBlock.
	 * 
	 * <pre>
	 * Syntax:
	 * 
	 * Block = CompoundStatement | SubBlock
	 * 
	 *	 CompoundStatement = BEGIN [ { Statement ; } ] END
	 *
	 * 	 SubBlock = BEGIN [ { Declaration ; } ]  [ { Statement ; } ] END
	 *
	 * </pre>
	 * Pre-condition: BEGIN is already read.
	 * @param line source line number
	 * @return a BlockStatement
	 */
	public BlockStatement expectMaybeBlock(int line) {
		this.lineNumber=line;
		if (Option.internal.TRACE_PARSE)
			Parse.TRACE("Parse MayBeBlock");
		while (Declaration.acceptDeclaration(this))
			Parse.expect(KeyWord.SEMICOLON);
		while (!Parse.accept(KeyWord.END)) {
			Statement stm = Statement.expectStatement();
			if (stm != null) statements.add(stm);
		}
		if (declarationKind != ObjectKind.SimulaProgram) {
			if (!declarationList.isEmpty()) {
				declarationKind = ObjectKind.SubBlock;
			} else {
				declarationKind = ObjectKind.CompoundStatement;
				if (labelList != null && labelList.declaredLabelSize() != 0)
					moveLabelsFrom(this); // Label is also declaration
			}
		}
		this.lastLineNumber = Global.sourceLineNumber;
		BlockStatement blk = new BlockStatement(this);
		Global.setScope(declaredIn);
		return (blk);
	}

	/**
	 * Utility: Moves labels from the givent block.
	 * <p>
	 * Special case: Labels in a CompoundStatement or ConnectionBlock.
	 * <p>
	 * Move Label Declaration to nearest enclosing Block which is not
	 * a CompoundStatement or ConnectionBlock.
	 * @param block the block containing labels to be moved
	 */
	static void moveLabelsFrom(DeclarationScope block) {
		DeclarationScope declaredIn = block.declaredIn;
		Vector<LabelDeclaration> labelList = block.labelList.getDeclaredLabels();
		DeclarationScope enc = declaredIn;
		while (enc.declarationKind == ObjectKind.CompoundStatement
				&& enc.declarationKind == ObjectKind.ConnectionBlock
				&& enc.declarationList.isEmpty())
			enc = enc.declaredIn;
		
		for (LabelDeclaration lab : labelList) {
			lab.movedTo=enc;
			if(enc.labelList == null) enc.labelList = new LabelList(enc);
			enc.labelList.add(lab);
			lab.updateDeclaredIn(enc);
		}
		block.labelList = null;
	}

	// ***********************************************************************************************
	// *** Checking
	// ***********************************************************************************************
	@Override
	public void doChecking() {
		if (IS_SEMANTICS_CHECKED())	return;
		Global.sourceLineNumber = lineNumber;
		Global.enterScope(this);
			LabelList.accumLabelList(this);
			for (Declaration dcl : declarationList)	dcl.doChecking();
			for (Statement stm : statements) stm.doChecking();
//			doCheckLabelList(null);
		Global.exitScope();
		SET_SEMANTICS_CHECKED();
	}
	
	@Override
	public int getRTBlockLevel() {
		ASSERT_SEMANTICS_CHECKED();
		int rtBlockLevel = declaredIn.getRTBlockLevel();
		if(declarationKind == ObjectKind.SubBlock)
			rtBlockLevel = rtBlockLevel+1;
//		System.out.println("DeclarationScope.getRTBlockLevel: "+this.getClass().getSimpleName()+" "+this);
		return rtBlockLevel;
	}

	// ***********************************************************************************************
	// *** Utility: findVisibleAttributeMeaning
	// ***********************************************************************************************
	@Override
	public Meaning findVisibleAttributeMeaning(final String ident) {
		if(Option.internal.TRACE_FIND_MEANING>0) Util.println("BEGIN Checking MayBeBlock for "+ident+" ================================== "+identifier+" ==================================");
		for (Declaration declaration : declarationList) {
			if(Option.internal.TRACE_FIND_MEANING>1) Util.println("Checking Local "+declaration);
			if (Util.equals(ident, declaration.identifier))
				return (new Meaning(declaration, this, this, false));
		}
		if(labelList != null) for (LabelDeclaration label : labelList.getDeclaredLabels()) {
			if(Option.internal.TRACE_FIND_MEANING>1) Util.println("Checking Label "+label);
			if (Util.equals(ident, label.identifier))
				return (new Meaning(label, this, this, false));
		}
		if(Option.internal.TRACE_FIND_MEANING>0) Util.println("ENDOF Checking MayBeBlock for "+ident+" ================================== "+identifier+" ==================================");
		return (null);
	}

	// ***********************************************************************************************
	// *** Coding: doJavaCoding
	// ***********************************************************************************************
	@Override
	public void doJavaCoding() {
		ASSERT_SEMANTICS_CHECKED();
		if (this.isPreCompiledFromFile != null) {
			if(Option.verbose) System.out.println("Skip  doJavaCoding: "+this.identifier+" -- It is read from "+isPreCompiledFromFile);		
		} else {
			if (declarationKind == ObjectKind.CompoundStatement)
				 doCompoundStatementCoding();
			else doSubBlockCoding();
		}
	}

	// ***********************************************************************************************
	// *** Coding: CompoundStatement as Java Subblock
	// ***********************************************************************************************
	/**
	 * Code utility: Code compound statement
	 */
	private void doCompoundStatementCoding() {
		Global.sourceLineNumber = lineNumber;
		ASSERT_SEMANTICS_CHECKED();
		Util.ASSERT(declarationList.isEmpty(), "Invariant");
		Util.ASSERT(labelList == null || labelList.declaredLabelSize() == 0, "Invariant");
		Global.enterScope(this);
		GeneratedJavaClass.code("{");
		if(labelcodeList!=null) {
			for(String labCode:labelcodeList) {
				GeneratedJavaClass.code(labCode);
			}
		}
		for (Statement stm : statements) stm.doJavaCoding();
		GeneratedJavaClass.code("}");
		Global.exitScope();
	}

	// ***********************************************************************************************
	// *** Coding: SUBBLOCK ==> .java file
	// ***********************************************************************************************
	/**
	 * Code utility: Code sub-block
	 */
	private void doSubBlockCoding() {
		Global.sourceLineNumber = lineNumber;
		ASSERT_SEMANTICS_CHECKED();
		GeneratedJavaClass javaModule = new GeneratedJavaClass(this);
		Global.enterScope(this);
			labelList.setLabelIdexes();
			boolean duringSTM_Coding=Global.duringSTM_Coding;
			Global.duringSTM_Coding=false;
			GeneratedJavaClass.code("@SuppressWarnings(\"unchecked\")");
			GeneratedJavaClass.code("public final class " + getJavaIdentifier() + " extends RTS_BASICIO" + " {");
			GeneratedJavaClass.debug("// SubBlock: Kind=" + declarationKind + ", BlockLevel=" + getRTBlockLevel() + ", firstLine="
					+ lineNumber + ", lastLine=" + lastLineNumber + ", hasLocalClasses="
					+ ((hasLocalClasses) ? "true" : "false") + ", System=" + ((isQPSystemBlock()) ? "true" : "false"));
			if (isQPSystemBlock())
				GeneratedJavaClass.code("public boolean isQPSystemBlock() { return(true); }");
			if(this.hasAccumLabel()) {
				GeneratedJavaClass.debug("// Declare local labels");
				for (LabelDeclaration lab : labelList.getAccumLabels())
					lab.declareLocalLabel(this);
			}
			GeneratedJavaClass.debug("// Declare locals as attributes");
			for (Declaration decl : declarationList) decl.doJavaCoding();
			doCodeConstructor();
			Global.duringSTM_Coding=true;
			doCodeStatements();
			Global.duringSTM_Coding=duringSTM_Coding;
			if (this.isMainModule) {
				GeneratedJavaClass.code("");
				GeneratedJavaClass.code("public static void main(String[] args) {");
				GeneratedJavaClass.debug("//System.setProperty(\"file.encoding\",\"UTF-8\");");
				GeneratedJavaClass.code("RTS_COMMON.setRuntimeOptions(args);");
				
	//			GeneratedJavaClass.code("new " + getJavaIdentifier() + "(_CTX)._STM();");
				
				GeneratedJavaClass.code("RTS_RTObject prog = new " + getJavaIdentifier() + "(_CTX);");
				GeneratedJavaClass.code("    try { prog._STM(); } catch(Throwable e) { RTS_RTObject.treatException(e, prog); }");
	
				GeneratedJavaClass.code("}", "End of main");
			}
			javaModule.codeProgramInfo();
			GeneratedJavaClass.code("}", "End of SubBlock");
		Global.exitScope();
		javaModule.closeJavaOutput();
	}

	// ***********************************************************************************************
	// *** Coding Utility: doCodeConstructor
	// ***********************************************************************************************
	/**
	 * Code utility: Code constructor
	 */
	private void doCodeConstructor() {
		GeneratedJavaClass.debug("// Normal Constructor");
		GeneratedJavaClass.code("public " + getJavaIdentifier() + "(RTS_RTObject staticLink) {");
		GeneratedJavaClass.code("super(staticLink);");
		GeneratedJavaClass.code("BBLK();");
		if (declarationKind == ObjectKind.SimulaProgram) GeneratedJavaClass.code("BPRG(\"" + identifier + "\");");
		GeneratedJavaClass.debug("// Declaration Code");
		for (Declaration decl : declarationList) decl.doDeclarationCoding();
		GeneratedJavaClass.code("}");
	}

	// ***********************************************************************************************
	// *** Coding Utility: doCodeStatements
	// ***********************************************************************************************
	/**
	 * Code utility: Code statements
	 */
	private void doCodeStatements() {
		GeneratedJavaClass.debug("// " + declarationKind + " Statements");
		GeneratedJavaClass.code("@Override");
		GeneratedJavaClass.code("public RTS_RTObject _STM() {");
		codeSTMBody();
		GeneratedJavaClass.code("EBLK();");
		GeneratedJavaClass.code("return(this);");
		GeneratedJavaClass.code("}", "End of " + declarationKind + " Statements");
	}

	// ***********************************************************************************************
	// *** ByteCoding: buildClassFile
	// ***********************************************************************************************
	@Override
	public byte[] buildClassFile() {
		labelList.setLabelIdexes();
		ClassDesc CD_ThisClass = currentClassDesc();
		if(Option.verbose) System.out.println("Begin buildClassFile: "+CD_ThisClass);
		ClassHierarchy.addClassToSuperClass(CD_ThisClass, CD.RTS_BASICIO);
		
		byte[] bytes = ClassFile.of(ClassFile.ClassHierarchyResolverOption.of(ClassHierarchy.getResolver())).build(CD_ThisClass,
				classBuilder -> {
					classBuilder
						.with(SourceFileAttribute.of(Global.sourceFileName))
						.withFlags(ClassFile.ACC_PUBLIC + ClassFile.ACC_FINAL + ClassFile.ACC_SUPER)
						.withSuperclass(CD.RTS_BASICIO);

					if(this.hasAccumLabel())
						for (LabelDeclaration lab : labelList.getAccumLabels())
							lab.buildDeclaration(classBuilder,this);
					
					for (Declaration decl : declarationList)
						decl.buildDeclaration(classBuilder,this);
					
					if (isQPSystemBlock())
						classBuilder
							.withMethodBody("isQPSystemBlock", MethodTypeDesc.ofDescriptor("()Z"),
									ClassFile.ACC_PUBLIC, codeBuilder -> buildIsQPSystemBlock(codeBuilder));

					classBuilder
						.withMethodBody("<init>",
							MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_RTObject;)V"), ClassFile.ACC_PUBLIC, codeBuilder -> buildConstructor(codeBuilder))
						.withMethodBody("_STM",
							MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_RTObject;"), ClassFile.ACC_PUBLIC, codeBuilder -> buildMethod_STM(codeBuilder));
					
					if (this.isMainModule)
						classBuilder
							.withMethodBody("main", MethodTypeDesc.ofDescriptor("([Ljava/lang/String;)V"),
								ClassFile.ACC_PUBLIC + ClassFile.ACC_STATIC + ClassFile.ACC_VARARGS, codeBuilder -> buildMethodMain(codeBuilder));
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
	 *     public Program'name(RTS_RTObject staticLink) {
	 *         super(staticLink);
	 *         // Initiate local variables
	 *         // Declaration Code
	 *         BBLK();
	 *         BPRG("adHoc06");
	 *     }
	 * </pre>
	 * @param codeBuilder the CodeBuilder
	 */
	private void buildConstructor(CodeBuilder codeBuilder) {
		Label begScope = codeBuilder.newLabel();
		Label endScope = codeBuilder.newLabel();
		ASSERT_SEMANTICS_CHECKED();
		Global.enterScope(this);
			ConstantPoolBuilder pool=codeBuilder.constantPool();
			codeBuilder
				.labelBinding(begScope)
				.localVariable(0,"this",currentClassDesc(),begScope,endScope)
				.localVariable(1,"staticLink", CD.RTS_RTObject,begScope,endScope);

			// super(staticLink);
			codeBuilder
				.aload(0)
				.aload(1)
				.invokespecial(pool.methodRefEntry(CD.RTS_BASICIO
						,"<init>", MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_RTObject;)V")));

			if (hasDeclaredLabel()) // Declare local labels
				for (LabelDeclaration lab : labelList.getDeclaredLabels())
					lab.buildInitAttribute(codeBuilder);
			
			// Add and Initialize attributes
			for (Declaration decl : declarationList)
				decl.buildInitAttribute(codeBuilder);
			
			// BBLK();
			codeBuilder.aload(0)
				.invokevirtual(pool.methodRefEntry(currentClassDesc(),"BBLK", MethodTypeDesc.ofDescriptor("()V")));

			if (declarationKind == ObjectKind.SimulaProgram) 
				// BPRG("adHoc06");
				codeBuilder
					.aload(0)
					.ldc(pool.stringEntry(this.edJavaClassName()))
					.invokevirtual(pool.methodRefEntry(currentClassDesc(),"BPRG", MethodTypeDesc.ofDescriptor("(Ljava/lang/String;)V")));

			// Add Declaration Code to Constructor
			for (Declaration decl : declarationList)
				decl.buildDeclarationCode(codeBuilder);

			codeBuilder
				.return_()
				.labelBinding(endScope);
		Global.exitScope();
	}

	@Override
	public void buildByteCode(CodeBuilder codeBuilder) {
		Global.sourceLineNumber=lineNumber;
		ASSERT_SEMANTICS_CHECKED();
		if (declarationKind == ObjectKind.CompoundStatement) {
			build_STMS(codeBuilder);
			return;
		}
		Global.enterScope(this);
		if (this.isPreCompiledFromFile != null) {
			if(Option.verbose) System.out.println("Skip  buildClassFile: "+this.identifier);			
		} else {
			try { createJavaClassFile(); } catch (IOException e) { e.printStackTrace();	}
		}

		//  0: new           #42                 // class simulaTestPrograms/adHoc12_SubBlock18
		//  3: dup
		//  4: getstatic     #44                 // Field _CUR:Lsimula/runtime/RTS_RTObject;
		//  7: invokespecial #48                 // Method simulaTestPrograms/adHoc12_SubBlock18."<init>":(Lsimula/runtime/RTS_RTObject;)V
		// 10: invokevirtual #49                 // Method simulaTestPrograms/adHoc12_SubBlock18._STM:()Lsimula/runtime/RTS_RTObject;
		// 13: pop
		ClassDesc CD_cls=this.getClassDesc();
		codeBuilder
			.new_(CD_cls)
			.dup()
			.getstatic(BlockDeclaration.currentClassDesc(),"_CUR",CD.RTS_RTObject);

		codeBuilder.invokespecial(CD_cls, "<init>", this.getConstructorMethodTypeDesc());

		// _STM();
		String resultType="Lsimula/runtime/RTS_RTObject;";
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		codeBuilder
			.invokevirtual(pool.methodRefEntry(CD_cls,"_STM", MethodTypeDesc.ofDescriptor("()"+resultType)))
			.pop();
		Global.exitScope();
	}

	// ***********************************************************************************************
	// *** ByteCoding: edConstructorSignature
	// ***********************************************************************************************
	@Override
	public String edConstructorSignature() {
		return("(Lsimula/runtime/RTS_RTObject;)V");
	}
	
	@Override
	protected void build_STM_BODY(CodeBuilder codeBuilder, Label begScope, Label endScope) {
		stmStack.push(labelContext);
		labelContext = this;
		build_STMS(codeBuilder);
		labelContext = stmStack.pop();
	}

	private void build_STMS(CodeBuilder codeBuilder) {
		for (Statement stm : statements) {
			if(!(stm instanceof DummyStatement)) Util.buildLineNumber(codeBuilder,stm);
			stm.buildByteCode(codeBuilder);
		}
	}


	// ***********************************************************************************************
	// *** Printing Utility: print
	// ***********************************************************************************************
	@Override
	public void print(final int indent) {
    	String spc=edIndent(indent);
		StringBuilder s = new StringBuilder(spc);
		s.append('[').append(sourceBlockLevel).append(':').append(getRTBlockLevel()).append("] ");
		s.append(declarationKind).append(' ').append(identifier);
		s.append('[').append(externalIdent).append("] ");
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
		String block = ObjectKind.edit(declarationKind);
		String BL = (IS_SEMANTICS_CHECKED()) ? "  BL=" + getRTBlockLevel() : "";
		System.out.println(edTreeIndent(indent) + block + " " + identifier + BL + "  declaredIn="+this.declaredIn);
		if(labelList != null) labelList.printTree(indent+1,this);
		printDeclarationList(indent+1);
		printStatementList(indent+1);
	}

	@Override
	public String toString() {
		return identifier + '[' + externalIdent + "] Kind=" + declarationKind;
	}

	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************

	/**
	 * Default constructor used by Attribute File I/O
	 */
	public MaybeBlockDeclaration() { super(null); }

	@Override
	public void writeObject(AttributeOutputStream oupt) throws IOException {
		Util.TRACE_OUTPUT("BEGIN Write "+this.getClass().getSimpleName());
		oupt.writeKind(declarationKind);
		oupt.writeShort(OBJECT_SEQU);
//		writeAttributes(oupt);

		// *** SyntaxClass
		oupt.writeShort(lineNumber);
		
		// *** Declaration
		oupt.writeString(identifier);
		oupt.writeString(externalIdent);
		oupt.writeType(type);// Declaration
		oupt.writeObj(declaredIn);// Declaration  // TODO: NOTE: TESTING
		
		// *** DeclarationScope
		oupt.writeString(sourceFileName);
		oupt.writeString(isPreCompiledFromFile);
		oupt.writeBoolean(hasLocalClasses);
		LabelList.writeLabelList(labelList, oupt);
		DeclarationList decls = prep(declarationList);
		decls.writeObject(oupt);

		// *** BlockDeclaration
		if (declarationKind == ObjectKind.CompoundStatement) {
			oupt.writeBoolean(isMainModule);
			oupt.writeObjectList(statements);
		}
	}
	
	@SuppressWarnings("unchecked")
	public static MaybeBlockDeclaration readObject(AttributeInputStream inpt,int declarationKind) throws IOException {
		DeclarationScope scope = Global.getCurrentScope();
		MaybeBlockDeclaration blk = new MaybeBlockDeclaration();
//		blk.declarationKind = ObjectKind.CompoundStatement;
		blk.declarationKind = declarationKind;
		blk.OBJECT_SEQU = inpt.readSEQU(blk);
		// *** SyntaxClass
		blk.lineNumber = inpt.readShort();

		// *** Declaration
		blk.identifier = inpt.readString();
		blk.externalIdent = inpt.readString();
		blk.type = inpt.readType();
		blk.declaredIn = (DeclarationScope) inpt.readObj();  // TODO: NOTE: TESTING

		// *** DeclarationScope
		blk.sourceFileName = inpt.readString();
		blk.isPreCompiledFromFile = inpt.readString();
		blk.hasLocalClasses = inpt.readBoolean();
		blk.labelList = LabelList.readLabelList(inpt);
		blk.declarationList = DeclarationList.readObject(inpt);

		// *** BlockDeclaration
		if (declarationKind == ObjectKind.CompoundStatement) {
			blk.isMainModule = inpt.readBoolean();
			blk.statements = (ObjectList<Statement>) inpt.readObjectList();
		}

		Global.setScope(scope);
//		blk.isPreCompiledFromFile = inpt.jarFileName;
		Util.TRACE_INPUT("MaybeBlockDeclaration: " + blk);
		return(blk);
	}

}
