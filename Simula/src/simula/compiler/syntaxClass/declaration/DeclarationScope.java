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
import java.lang.constant.ClassDesc;
import simula.compiler.utilities.CD;
import simula.compiler.utilities.DeclarationList;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.LabelList;
import simula.compiler.utilities.Meaning;
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
	 * Current Runtime Block level - Used during doChecking
	 */
	protected static int currentRTBlockLevel = 0;

	/**
	 * The source block level. Set during Parsing.
	 */
	public int sourceBlockLevel;

	/**
	 * The Compile time block level. Set during doChecking.
	 */
	public int ctBlockLevel;

	/**
	 * The Runtime block level. Set during doChecking.
	 */
	public int rtBlockLevel;

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
		Global.setScope(this);
		if (declaredIn != null)
			sourceBlockLevel = declaredIn.sourceBlockLevel + 1;
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
		if (rtBlockLevel > 1)
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
			if (!Global.duringParsing)
				Util.error("Undefined variable: " + identifier);
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
		for (LabelDeclaration dcl : labelList.labels)
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
		if (rtBlockLevel == 0)
			return ("_CTX");
		int curLevel = Global.getCurrentScope().rtBlockLevel;
		int ctxDiff = curLevel - rtBlockLevel;
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
		DeclarationScope curScope=Global.getCurrentScope(); // The current scope. In case of Thunk one level up to Thunk.ENV
		DeclarationScope endScope=this;                     // The scope of the attribute to access.
		int curLevel = curScope.rtBlockLevel;
		int ctxDiff = curLevel - endScope.rtBlockLevel - corr;
		
		codeBuilder.aload(0); // Current Object
		
		boolean withFollowSL = false;
		if(Global.getCurrentScope() instanceof Thunk thunk) {
			curScope=thunk.declaredIn;
			DeclarationScope encl = curScope;
			while(encl instanceof ConnectionBlock) encl = encl.declaredIn;
			codeBuilder
				.getfield(CD.RTS_NAME,"_CUR",CD.RTS_RTObject)
				.checkcast(encl.getClassDesc());
			ctxDiff = curScope.rtBlockLevel - rtBlockLevel;
		}
		while ((ctxDiff--) > 0) {
			curScope=curScope.declaredIn;
			codeBuilder.getfield(CD.RTS_RTObject,"_SL",CD.RTS_RTObject);
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
		DeclarationScope curScope=Global.getCurrentScope();
		boolean withFollowSL = false;
		ClassDesc CD_RTObject=CD.RTS_RTObject;
		codeBuilder.aload(0);
		while ((ctxDiff--) > 0) {
			curScope=curScope.declaredIn;
			withFollowSL = true;			
			codeBuilder.getfield(CD_RTObject,"_SL",CD_RTObject);
		}
		return(withFollowSL);
	}
	
	public static void printScopeChain(DeclarationScope scope,String title) {
		System.out.println("\n   ================== Current Scope Chain: "+title+" ==================");
		while(scope != null) {
			System.out.println("   DeclarationScope.buildCTX: Scope: "+scope.externalIdent+"  rtBlockLevel="+scope.rtBlockLevel);
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
	// *** ByteCoding Utility: getClassDesc   -- Redefined in StandardClass and ConnectionBlock
	// ***********************************************************************************************
	public ClassDesc getClassDesc() {
		return(ClassDesc.of(Global.packetName + '.' + externalIdent));
	}
	
	public void printStaticChain(String title) {
		System.out.println("\nDeclarationScope.printStaticChain: **************** "+title+" ****************");
		DeclarationScope scope=this.declaredIn;
		int lim = 5;//7;
		for(int i=1;i<lim;i++) {
			System.out.println("DeclarationScope.printStaticChain: " + scope.declarationKind + ' ' + scope.identifier + '[' + scope.externalIdent + ']');
			for(Declaration decl:scope.declarationList) {
				System.out.println("DeclarationScope.printStaticChain:                  "+decl);			
			} scope=scope.declaredIn;
		}
	}
	
	protected void printDeclarationList(int indent) {
		for(Declaration d:declarationList) d.printTree(indent);
		if(labelList != null) for(LabelDeclaration d:labelList.labels) d.printTree(indent);
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
    private boolean CLASSFILE_ALREADY_GENERATED;
	/**
	 * Create Java ClassFile.
	 * @throws IOException 
	 */
    public void createJavaClassFile() throws IOException {
    	if (this.isPreCompiledFromFile != null)	return;
    	if(CLASSFILE_ALREADY_GENERATED) return;
    	CLASSFILE_ALREADY_GENERATED = true;
    	
//    	byte[] bytes;
//    	if(this instanceof BlockDeclaration blk) {
//    		blk.prevBlock = BlockDeclaration.currentBlock;
//    		BlockDeclaration.currentBlock = blk;
//    			bytes = buildClassFile();
//    		BlockDeclaration.currentBlock = blk.prevBlock;
//    	} else {
//    		bytes = buildClassFile();
//    	}
//
//    	if(bytes != null) {
//    		if(Option.internal.USE_SimulaClassLoader) {
//    			if(Global.simulaClassLoader != null) {
//    				String name = Global.packetName + "." + externalIdent;
//    				Global.simulaClassLoader.loadClass(name, bytes);
//    			} else {
//        			String entryName = Global.packetName + "/" + externalIdent + ".class";
//        			Global.jarFileBuilder.addJarEntry(entryName, bytes);
//    			}
//    		} else {
//    			String entryName = Global.packetName + "/" + externalIdent + ".class";
//    			Global.jarFileBuilder.addJarEntry(entryName, bytes);
//    		}
//
//   			if(Option.internal.LIST_GENERATED_CLASS_FILES)
//   				listGeneratedClassFile(bytes);
//    	}

    	buildAndLoadOrAddClassFile();
    }
	
    /**
     * Redefined in ClassDeclaration
     * @throws IOException
     */
    protected void buildAndLoadOrAddClassFile() throws IOException {
    	if(isPreCompiledFromFile == null) {
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
    
    protected void loadOrAddClassFile(byte[] bytes) throws IOException {  // TODO: TESTING
    	if(bytes != null) {
    		if(Option.internal.USE_SimulaClassLoader) {
    			if(Global.simulaClassLoader != null) {
    				String name = Global.packetName + "." + externalIdent;
    				Global.simulaClassLoader.loadClass(name, bytes);
    			} else {
        			String entryName = Global.packetName + "/" + externalIdent + ".class";
        			Global.jarFileBuilder.addJarEntry(entryName, bytes);
    			}
    		} else {
    			String entryName = Global.packetName + "/" + externalIdent + ".class";
    			Global.jarFileBuilder.addJarEntry(entryName, bytes);
    		}

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

}
