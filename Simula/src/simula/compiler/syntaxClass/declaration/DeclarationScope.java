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
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import java.lang.constant.ClassDesc;
import simula.compiler.utilities.DeclarationList;
import simula.compiler.utilities.RTS;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.LabelList;
import simula.compiler.utilities.Meaning;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * Declaration Scope.
 * <p>
 * This class is prefix to BlockDeclaration and ConnectionBlock, and superclass
 * of ClassDeclaration, ProcedureDeclaration and MaybeBlockDeclaration.
 * <p>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/declaration/DeclarationScope.java">
 * <b>Source File</b></a>.
 * 
 * @author Øystein Myhre Andersen
 */
public abstract class DeclarationScope extends Declaration  {

	/**
	 * The source file name.
	 */
	public String sourceFileName;

	/**
	 * The source block level. Set during Parsing.
	 */
	public int sourceBlockLevel;

	/**
	 * Indicate if this scope has local classes.
	 */
	public boolean hasLocalClasses = false;
	
	/**
	 * If not null; this Class/Procedure is Pre-Compiled from a .jar file
	 */
	public String isPreCompiledFromFile;

	/**
	 * The declaration list.
	 */
	public DeclarationList declarationList;

	/**
	 * The label list.
	 */
	public LabelList labelList; // = new LabelList();

	// ***********************************************************************************************
	// *** Constructor
	// ***********************************************************************************************
	/**
	 * Create a new DeclarationScope.
	 * 
	 * @param ident scope identifier
	 */
	protected DeclarationScope(final String ident) {
		super(ident);
		declarationList = new DeclarationList(getClass().getSimpleName() + ':' + ident + ":Line=" + Global.sourceLineNumber);
		declaredIn = Global.getCurrentScope();
		
//		System.out.println("NEW DeclarationScope: "+this.getClass().getSimpleName()+"  "+ident+", declaredIn="+declaredIn);
		
		Global.setScope(this);
		if (declaredIn != null)
			sourceBlockLevel = declaredIn.sourceBlockLevel + 1;
	}
	
	/**
	 * Modify the identifier of this class, procedure, ...
	 * 
	 * @param newIdentifier the new identifier
	 */
	protected void modifyIdentifier(final String newIdentifier) {
		this.identifier = newIdentifier;
		checkAlreadyDefined();
		if (declarationKind == ObjectKind.ContextFreeMethod) externalIdent = this.identifier;
		else if (declarationKind == ObjectKind.MemberMethod) externalIdent = this.identifier;
		else if (externalIdent == null)	externalIdent = edJavaClassName();
	}

	// ***********************************************************************************************
	// *** Utility: edJavaClassName
	// ***********************************************************************************************
	/**
	 * Utility to edit JavaClass'Name
	 * 
	 * @return the edited JavaClass'Name
	 */
	protected String edJavaClassName() {
		DeclarationScope scope = this;
		String id = null;
		while (scope != null) {
			if ((scope instanceof BlockDeclaration) && !(scope instanceof StandardClass)
					&& !(scope instanceof StandardProcedure)) {
				if (id == null)
					id = scope.identifier;
				else
					id = scope.identifier + '_' + id;
			}
			scope = scope.declaredIn;
		}
		return (id);
	}

	// ***********************************************************************************************
	// *** After Checking: getRTBlockLevel
	// ***********************************************************************************************
	/**
	 * Utility: Get Runtime BlockLevel.
	 */
//	@Override
	public int getRTBlockLevel() {
//		System.out.println("DeclarationScope.getRTBlockLevel: "+this.getClass().getSimpleName()+" "+this);
//		ASSERT_SEMANTICS_CHECKED();
		int rtBlockLevel = declaredIn.getRTBlockLevel() + 1;
//		System.out.println("DeclarationScope.getRTBlockLevel: "+this.getClass().getSimpleName()+" "+this);
		return rtBlockLevel;
	}

	// ***********************************************************************************************
	// *** Utility: scopeID
	// ***********************************************************************************************
	/**
	 * Returns a printable scope ID.
	 * 
	 * @return a printable scope ID
	 */
	public String scopeID() {
		if (getRTBlockLevel() > 1)
			return (declaredIn.scopeID() + '.' + identifier);
		return identifier;
	}

	// ***********************************************************************************************
	// *** Utility: prefixLevel
	// ***********************************************************************************************
	/**
	 * Returns the prefix level.
	 * <p>
	 * Redefined in ClassDeclaration
	 * @return the prefix level
	 */
	public int prefixLevel() {
		return 0;
	}

	// ***********************************************************************************************
	// *** Utility: findVisibleAttributeMeaning
	// ***********************************************************************************************
	/**
	 * Find visible attribute's Meaning
	 * 
	 * @param ident attribute identifier
	 * @return the resulting Meaning
	 */
	public Meaning findVisibleAttributeMeaning(final String ident) {
		Util.IERR("DeclarationScope.findVisibleAttributeMeaning: SHOULD BEEN REDEFINED: " + identifier + " IN " + this.getClass().getSimpleName());
		return null;
	}

	// ***********************************************************************************************
	// *** Utility: findMeaning
	// ***********************************************************************************************
	/**
	 * Find Meaning
	 * 
	 * @param identifier declared identifier
	 * @return the resulting Meaning
	 */
	public Meaning findMeaning(final String identifier) {
		Meaning meaning = findVisibleAttributeMeaning(identifier);
		if (meaning == null && declaredIn != null)
			meaning = declaredIn.findMeaning(identifier);
		
		if (meaning == null) {
			if (!Global.duringParsing) {
//				DeclarationScope.printScopeChain(Global.getCurrentScope(),"");
				Util.error("Undefined variable: " + identifier);
				Thread.dumpStack();
			}
			meaning = new Meaning(null, null); // Error Recovery: No Meaning
		}
		return (meaning);
	}

	// ***********************************************************************************************
	// *** Utility: findLabelMeaning
	// ***********************************************************************************************
	/**
	 * Find Label's Meaning
	 * 
	 * @param identifier declared label identifier
	 * @return the resulting Meaning
	 */
	public Meaning findLabelMeaning(final String identifier) {
		for (LabelDeclaration dcl : labelList.getDeclaredLabels())
			if (Util.equals(dcl.identifier, identifier))
				return (new Meaning(dcl, this, this, false));
		
		if(this instanceof ClassDeclaration cls && cls.hasRealPrefix())
			return(cls.getPrefixClass().findLabelMeaning(identifier));

		if (declaredIn != null)
			return (declaredIn.findLabelMeaning(identifier));
		return (null);
	}

	// ***********************************************************************************************
	// *** Utility: findProcedure -- Follow Static Chain Looking for a Procedure named 'identifier'
	// ***********************************************************************************************
	/**
	 * Follow Static Chain Looking for a Procedure named 'identifier'
	 * 
	 * @param identifier the procedure identifier
	 * @return the resulting ProcedureDeclaration
	 */
	public ProcedureDeclaration findProcedure(final String identifier) {
		DeclarationScope scope = this;
		while (scope != null) {
			if (Util.equals(identifier, scope.identifier)) {
				if (scope instanceof ProcedureDeclaration proc)
					return (proc);
				return (null);
			}
			scope = scope.declaredIn;
		}
		return (null);
	}

	// ***********************************************************************************************
	// *** Coding Utility: edCTX
	// ***********************************************************************************************
	/**
	 * Coding utility: Edit current context chain.
	 * 
	 * @return edited context chain
	 */
	public String edCTX() {
		if (getRTBlockLevel() == 0)	return ("_USR");			
		int curLevel = Global.getCurrentScope().getRTBlockLevel();
		int ctxDiff = curLevel - getRTBlockLevel();
		return (edCTX(ctxDiff));

	}

	// ***********************************************************************************************
	// *** Coding Utility: edCTX
	// ***********************************************************************************************
	/**
	 * Coding utility: Edit context chain.
	 * 
	 * @param ctxDiff block level difference.
	 * @return edited context chain
	 */
	public static String edCTX(int ctxDiff) {
		String ret = "_CUR";
		while ((ctxDiff--) > 0)
			ret = ret + "._SL";
		return ("(" + ret + ')');
	}

	// ***********************************************************************************************
	// *** Byte Coding Utility: buildCTX
	// ***********************************************************************************************
	/**
	 * Coding utility: Build current context chain.
	 */
	public boolean buildCTX(CodeBuilder codeBuilder) {
		return(buildCTX(0, codeBuilder));
	}
	
	public boolean buildCTX(int corr,CodeBuilder codeBuilder) {
		ConstantPoolBuilder pool = codeBuilder.constantPool();
		DeclarationScope endScope=this;                     // The scope of the attribute to access.
		int endLevel = endScope.getRTBlockLevel();
		if(endLevel == 0) {
			codeBuilder.getstatic(RTS.FRE.RTObject_USR(pool));
			return(true);
		}
		
		DeclarationScope curScope=Global.getCurrentScope(); // The current scope. In case of Thunk one level up to Thunk.ENV
		int curLevel = curScope.getRTBlockLevel();
		int ctxDiff = curLevel - endLevel - corr;
//		System.out.println("DeclarationScope.buildCTX: curLevel="+curLevel);
//		System.out.println("DeclarationScope.buildCTX: endScope.rtBlockLevel="+endScope.getRTBlockLevel());
		
		codeBuilder.aload(0); // Current Object
		
		boolean withFollowSL = false;
		if(Global.getCurrentScope() instanceof Thunk thunk) {
			curScope=thunk.declaredIn;
			DeclarationScope encl = curScope;
			while(encl instanceof ConnectionBlock) encl = encl.declaredIn;
			codeBuilder
//				.getfield(RTS.CD.RTS_NAME,"_CUR",RTS.CD.RTS_RTObject)
				.getfield(RTS.FRE.NAME_CUR(pool))
				.checkcast(encl.getClassDesc());
			ctxDiff = curScope.getRTBlockLevel() - getRTBlockLevel();
//			System.out.println("DeclarationScope.buildCTX(1): ctxDiff="+ctxDiff+", curScope="+curScope);
		}
		
//		System.out.println("DeclarationScope.buildCTX(2): ctxDiff="+ctxDiff+", curScope="+curScope);
//		printStaticChain("DeclarationScope.buildCTX: ",0);
		
		while ((ctxDiff--) > 0) {
			curScope=curScope.declaredIn;
//			System.out.println("DeclarationScope.buildCTX(3): ctxDiff="+ctxDiff+", curScope="+curScope);
//			codeBuilder.getfield(RTS.CD.RTS_RTObject,"_SL",RTS.CD.RTS_RTObject);
			codeBuilder.getfield(RTS.FRE.RTObject_SL(pool));
			withFollowSL = true;			
		}
		return(withFollowSL);
	}

	

	// ***********************************************************************************************
	// *** Coding Utility: buildCTX
	// ***********************************************************************************************
	/**
	 * Coding utility: Build context chain.
	 *
	 * @param ctxDiff block level difference.
	 * @return edited context chain
	 */
	public static boolean buildCTX2(int ctxDiff,CodeBuilder codeBuilder) {
		ConstantPoolBuilder pool = codeBuilder.constantPool();
		DeclarationScope curScope=Global.getCurrentScope();
		boolean withFollowSL = false;
//		ClassDesc CD_RTObject=RTS.CD.RTS_RTObject;
		codeBuilder.aload(0);
		while ((ctxDiff--) > 0) {
			curScope=curScope.declaredIn;
			withFollowSL = true;			
//			codeBuilder.getfield(CD_RTObject,"_SL",CD_RTObject);
			codeBuilder.getfield(RTS.FRE.RTObject_SL(pool));
		}
		return(withFollowSL);
	}
	
	public static void printScopeChain(DeclarationScope scope,String title) {
		System.out.println("\n   ================== Current Scope Chain: "+title+" ==================");
		while(scope != null) {
//			System.out.println("   DeclarationScope.buildCTX: Scope: "+scope.externalIdent+"  rtBlockLevel="+scope.getRTBlockLevel());
			scope=scope.declaredIn;
		}
		System.out.println("   =========================================================");
	}


	// ***********************************************************************************************
	// *** Print Utility: edScopeChain
	// ***********************************************************************************************
	/**
	 * Edit scope chain.
	 * 
	 * @return edited scope chain
	 */
	public String edScopeChain() {
		if (declaredIn == null)
			return (identifier);
		String encName = declaredIn.edScopeChain();
		return (identifier + '.' + encName);
	}

	// ***********************************************************************************************
	// *** ByteCoding Utility: getClassDesc -- Redefined in StandardClass, SubBlock and ConnectionBlock
	// ***********************************************************************************************
	public ClassDesc getClassDesc() {
		return(RTS.CD.classDesc(externalIdent));
	}
	
	public void printStaticChain(String title,int details) {
		System.out.println("\nDeclarationScope.printStaticChain: **************** "+title+" ****************");
		DeclarationScope scope=this;//.declaredIn;
		int lim = 5;//7;
		for(int i=1;i<lim;i++) {
			System.out.println("DeclarationScope.printStaticChain: " + scope.edScope());
			if(details > 0) {
				for(Declaration decl:scope.declarationList) {
					System.out.println("DeclarationScope.printStaticChain:                  "+decl);			
				}
			}
			scope=scope.declaredIn;
		}
	}
	
	protected void printDeclarationList(int indent) {
		for(Declaration d:declarationList) d.printTree(indent,this);
		if(labelList != null) for(LabelDeclaration d:labelList.getDeclaredLabels()) d.printTree(indent,this);
	}
	
	public String edScope() {
		return "DeclarationScope: BL=" + getRTBlockLevel() + "  "
				+ getClass().getSimpleName() + ' ' + identifier + '[' + externalIdent + "] declaredIn="+declaredIn;
	}

	// ***********************************************************************************************
    // *** ByteCoding: buildClassFile
    // ***********************************************************************************************
    public abstract byte[] buildClassFile();

	// ***********************************************************************************************
	// *** createJavaClassFile
	// ***********************************************************************************************
    /**
     * Indicator used to prevent multiple ClassFile generation.
     * This situation may occur during the class body concatenation process.
     */
    protected boolean CLASSFILE_ALREADY_GENERATED;
	/**
	 * Create Java ClassFile.
	 * @throws IOException 
	 */
    public void createJavaClassFile() throws IOException {
    	if (this.isPreCompiledFromFile != null) {
			if(Option.verbose) System.out.println("Skip  buildClassFile: "+this.identifier+" -- It is read from "+isPreCompiledFromFile);			
    	} else if (CLASSFILE_ALREADY_GENERATED) {
			if(Option.verbose) System.out.println("Skip  buildClassFile: "+this.identifier+" -- It is already generated");			
//    		System.out.println("DeclarationScope.createJavaClassFile: "+this.externalIdent+"   CLASSFILE_ALREADY_GENERATED == TRUE");
    	} else {
    		CLASSFILE_ALREADY_GENERATED = true;
//    		System.out.println("DeclarationScope.createJavaClassFile: "+this.externalIdent+"   CLASSFILE_ALREADY_GENERATED <- TRUE");
    		buildAndLoadOrAddClassFile();
    	}
    }
	
    /**
     * Redefined in ClassDeclaration
     * @throws IOException
     */
    protected void buildAndLoadOrAddClassFile() throws IOException {
		if (this.isPreCompiledFromFile != null) {
			if(Option.verbose) System.out.println("Skip  buildClassFile: "+this.identifier);			
		} else {
	    	byte[] bytes = doBuildClassFile();
	    	loadOrAddClassFile(bytes);
    	}
    }
    
    protected byte[] doBuildClassFile() {  // TODO: TESTING
    	byte[] bytes;
    	if(this instanceof BlockDeclaration blk) {
    		blk.prevBlock = BlockDeclaration.currentBlock;
    		BlockDeclaration.currentBlock = blk;
    			bytes = buildClassFile();
    		BlockDeclaration.currentBlock = blk.prevBlock;
    	} else {
    		bytes = buildClassFile();
    	}
    	return bytes;
    }
    
    protected byte[] getBytesFromFile() {  // TODO: TESTING
    	System.out.println("DeclarationScope.getBytesFromFile: ");
    	Util.IERR();
    	return null;
    }
    
    protected void loadOrAddClassFile(byte[] bytes) throws IOException {  // TODO: TESTING
    	if(bytes != null) {
    		if(Option.compilerMode == Option.CompilerMode.simulaClassLoader) {
    			if(Global.simulaClassLoader != null) {
    				String name = Global.packetName + "." + externalIdent;
    				Global.simulaClassLoader.loadClass(name, bytes, "SourceFile " + Global.sourceFileName);
    			} else {
        			String entryName = Global.packetName + "/" + externalIdent + ".class";
        			Global.jarFileBuilder.writeJarEntry(entryName, bytes);
    			}
    		} else {
    			String entryName = Global.packetName + "/" + externalIdent + ".class";
    			Global.jarFileBuilder.putMapEntry(entryName, bytes);    				
    		}

//    		System.out.println("DeclarationScope.loadOrAddClassFile: "+externalIdent);
// 			if(Option.internal.LIST_GENERATED_CLASS_FILES || externalIdent.equals("CLASS_PAS2INIT_codegeneratorinit"))
// 			if(Option.internal.LIST_GENERATED_CLASS_FILES || externalIdent.equals("CLASS_PAS2INIT_codegeneratorinit_Block340"))
// 			if(Option.internal.LIST_GENERATED_CLASS_FILES || externalIdent.equals("CLASS_CHECKER1_semchecker1_valassign_emit"))
// 			if(Option.internal.LIST_GENERATED_CLASS_FILES || externalIdent.equals("CLASS_SCODER2_codegenerator2_outdescriptors"))
 			if(Option.internal.LIST_GENERATED_CLASS_FILES)
   				listGeneratedClassFile(bytes);
    	}
    	
    }

	private void listGeneratedClassFile(byte[] bytes) throws IOException {
        File outputFile = new File(Global.tempClassFileDir + "\\" + Global.packetName + "\\" + externalIdent + ".class");
        outputFile.getParentFile().mkdirs();
        FileOutputStream oupt = new FileOutputStream(outputFile);
        oupt.write(bytes); oupt.flush(); oupt.close();
        if(Option.verbose) System.out.println("ClassFile written to: " + outputFile + "  nBytes="+bytes.length);

        Util.doListClassFile("" + outputFile); // List generated .class file
        outputFile.delete();
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
			switch(decl.declarationKind) {
				case ObjectKind.ArrayDeclaration -> res.add(decl);
				case ObjectKind.Class -> res.add(decl);
//				case ObjectKind.PrefixedBlock -> res.add(decl);
				case ObjectKind.ExternalDeclaration -> res.add(decl);
				case ObjectKind.LabelDeclaration -> res.add(decl);
				case ObjectKind.Procedure -> res.add(decl);
//				case ObjectKind.Switch -> res.add(decl);
				case ObjectKind.ConnectionBlock -> res.add(decl);
//				case ObjectKind.CompoundStatement -> res.add(decl);
//				case ObjectKind.SubBlock -> res.add(decl);
				case ObjectKind.SimpleVariableDeclaration -> res.add(decl);
				case ObjectKind.InspectVariableDeclaration -> res.add(decl);
			}
		}
		return(res);
	}

}
