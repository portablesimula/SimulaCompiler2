/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass.declaration;

import java.io.IOException;
import java.lang.classfile.ClassBuilder;
import java.lang.classfile.ClassFile;
import java.lang.classfile.CodeBuilder;
import java.lang.classfile.Label;
import java.lang.classfile.attribute.SourceFileAttribute;
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import java.lang.constant.ClassDesc;
import java.lang.constant.MethodTypeDesc;
import java.util.Iterator;
import java.util.Vector;

import simula.compiler.AttributeInputStream;
import simula.compiler.AttributeOutputStream;
import simula.compiler.GeneratedJavaClass;
import simula.compiler.parsing.Parse;
import simula.compiler.syntaxClass.HiddenSpecification;
import simula.compiler.syntaxClass.ProtectedSpecification;
import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.statement.DummyStatement;
import simula.compiler.syntaxClass.statement.InnerStatement;
import simula.compiler.syntaxClass.statement.Statement;
import simula.compiler.utilities.CD;
import simula.compiler.utilities.ClassHierarchy;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.LabelList;
import simula.compiler.utilities.KeyWord;
import simula.compiler.utilities.Meaning;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * Simula Class Declaration.
 * 
 * <pre>
 * 
 * Simula Standard: 5.5 Class declaration
 * 
 * class-declaration = [ prefix ] main-part
 * 
 *   prefix = class-identifier
 *
 *   main-part = CLASS class-identifier
 *               [ formal-parameter-part ; [ value-part ] specification-part ] ;
 *               [ protection-part ; ]
 *               [ virtual-part ; ]
 *               class-body
 *   
 *      class-identifier = identifier
 * 
 *      formal-parameter-part = "(" FormalParameter { , FormalParameter } ")"
 *            FormalParameter = identifier
 *
 *      value-part = VALUE identifier-list
 *
 *      specification-part = class-parameter-specifier  identifier-list ; { class-parameter-specifier  identifier-list ; }
 *               class-parameter-specifier = Type | [Type] ARRAY 
 *
 *      protection-part = protection-specification { ; protection-specification }
 *               protection-specification = HIDDEN identifier-list | HIDDEN PROTECTED identifier-list
 *                                        | PROTECTED identifier-list | PROTECTED HIDDEN identifier-list
 *
 *      virtual-part = VIRTUAL: virtual-spec ; { virtual-spec ; }
 *         virtual-spec
 *             = virtual-specifier identifier-list
 *             | PROCEDURE procedure-identifier  procedure-specification
 *             
 *                virtual-Specifier = [ type ] PROCEDURE | LABEL | SWITCH
 *                
 *                procedure-specification = IS procedure-declaration
 *
 *      
 *      class-body = statement | split-body
 *      
 *         split-body = initial-operations inner-part final-operations
 *         
 *            initial-operations = ( BEGIN | block-head ; ) { statement ; }
 *         
 *            inner-part = [ label : ] INNER ;
 *'
 *            final-operations
 *               = END
 *               | ; statement { ; statement } END
 *
 * </pre>
 * 
 * <p>
 * This class is prefix to StandardClass and PrefixedBlockDeclaration.
 * <p>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/declaration/ClassDeclaration.java">
 * <b>Source File</b></a>.
 * 
 * @author SIMULA Standards Group
 * @author Øystein Myhre Andersen
 */
public class ClassDeclaration extends BlockDeclaration {
	/**
	 * The external prefix'identifier.
	 */
//	private String externalPrefixIdent;

	/**
	 * The parameter list.
	 */
	Vector<Parameter> parameterList = new Vector<Parameter>();

	/**
	 * The virtual spec list.
	 */
	protected Vector<VirtualSpecification> virtualSpecList = new Vector<VirtualSpecification>();

	/**
	 * The virtual match list.
	 */
	protected Vector<VirtualMatch> virtualMatchList = new Vector<VirtualMatch>();

	/**
	 * The protected list.
	 */
	Vector<ProtectedSpecification> protectedList = new Vector<ProtectedSpecification>();

	/**
	 * The hidden list.
	 */
	public Vector<HiddenSpecification> hiddenList = new Vector<HiddenSpecification>();

	/**
	 * Possible statements before inner.
	 * If this is non-null then 'statements' contains the statements after inner
	 */
	public Vector<Statement> statements1; // Statement code before inner

	/**
	 * Class Prefix in case of a SubClass or Prefixed Block.
	 */
	public String prefix;

	/**
	 * Class Prefix in case of a SubClass or Prefixed Block.
	 * <p>
	 * Set by coChecking
	 */
	public ClassDeclaration prefixClass;

	/**
	 * Set true when attribute procedure 'detach' is used in/on this class.
	 */
	public boolean detachUsed = false;

	// ***********************************************************************************************
	// *** CONSTRUCTOR
	// ***********************************************************************************************
	/**
	 * Create a new ClassDeclaration.
	 * 
	 * @param identifier the given identifier
	 */
	protected ClassDeclaration(String identifier) {
		super(identifier);
		this.declarationKind = ObjectKind.Class;
	}

	// ***********************************************************************************************
	// *** Parsing: expectClassDeclaration
	// ***********************************************************************************************
	/**
	 * Parse Class Declaration.
 * <pre>
 * 
 * Syntax:
 * 
 * class-declaration = [ prefix ] main-part
 * 
 *   prefix = class-identifier
 *
 *   main-part = CLASS class-identifier
 *               [ formal-parameter-part ; [ value-part ] specification-part ] ;
 *               [ protection-part ; ]
 *               [ virtual-part ; ]
 *               class-body
 *
 * </pre>
	 * 
	 * @param prefix class identifier
	 * @return the resulting ClassDeclaration
	 */
	public static ClassDeclaration expectClassDeclaration(final String prefix) {
		ClassDeclaration cls = new ClassDeclaration(null);
		cls.lineNumber = Parse.prevToken.lineNumber;
		cls.prefix = prefix;
		cls.declaredIn.hasLocalClasses = true;
		if (cls.prefix == null)
			cls.prefix = StandardClass.CLASS.identifier;
		cls.modifyIdentifier(Parse.expectIdentifier());
		if (Parse.accept(KeyWord.BEGPAR)) {
			expectFormalParameterPart(cls.parameterList);
			Parse.expect(KeyWord.SEMICOLON);
			acceptValuePart(cls.parameterList);
			acceptParameterSpecificationPart(cls.parameterList);
		} else
			Parse.expect(KeyWord.SEMICOLON);

		acceptProtectionPart(cls);
		if (Parse.accept(KeyWord.VIRTUAL))
			VirtualSpecification.expectVirtualPart(cls);
		expectClassBody(cls);
		
		cls.lastLineNumber = Global.sourceLineNumber;
		cls.type = Type.Ref(cls.identifier);
		if (Option.internal.TRACE_PARSE)
			Parse.TRACE("Line " + cls.lineNumber + ": ClassDeclaration: " + cls);
		Global.setScope(cls.declaredIn);
		return (cls);
	}
	
	// ***********************************************************************************************
	// *** PARSING: acceptValuePart
	// ***********************************************************************************************
	/**
	 * Parse utility: Accept value part and set matching parameter's mode.
	 * 
	 * <pre>
	 * Syntax:
	 *              VALUE identifier-list ;
	 * </pre>
	 * 
	 * @param pList Parameter list
	 */
	private static void acceptValuePart(final Vector<Parameter> pList) {
		if (Parse.accept(KeyWord.VALUE)) {
			do {
				String identifier = Parse.expectIdentifier();
				Parameter parameter = null;
				for (Parameter par : pList)
					if (Util.equals(identifier, par.identifier)) {
						parameter = par;
						break;
					}
				if (parameter == null) {
					Util.error("Identifier " + identifier + " is not defined in this scope");
					parameter = new Parameter(identifier);
				}
				parameter.setMode(Parameter.Mode.value);
			} while (Parse.accept(KeyWord.COMMA));
			Parse.expect(KeyWord.SEMICOLON);
		}
	}

	// ***********************************************************************************************
	// *** PARSING: acceptParameterSpecificationPart
	// ***********************************************************************************************
	/**
	 * Parse Utility: Accept Class Parameter specification-part updating Parameter's type and kind.
	 * <pre>
	 * Syntax:
	 * 
	 *     specification-part
     *           = class-parameter-specifier identifier-list { ; class-parameter-specifier identifier-list }
	 *     
	 *        class-parameter-specifier = Type | [Type] ARRAY
	 * </pre>
	 * @param pList the parameter list
	 */
	private static void acceptParameterSpecificationPart(final Vector<Parameter> pList) {
		if (Option.internal.TRACE_PARSE)
			Parse.TRACE("Parse ParameterSpecifications");
		while (true) {
			Type type;
			int kind = Parameter.Kind.Simple;
			type = Parse.acceptType();
			if (Parse.accept(KeyWord.ARRAY)) {
				if (type == null) {
					// See Simula Standard 5.2 -
					// If no type is given the type real is understood.
					type = Type.Real;
				}
				kind = Parameter.Kind.Array;
			}
			if (type == null)
				return;
			do {
				String identifier = Parse.expectIdentifier();
				Parameter parameter = null;
				for (Parameter par : pList)
					if (Util.equals(identifier, par.identifier)) {
						parameter = par;
						break;
					}
				if (parameter == null) {
					Util.error("Identifier " + identifier + " is not defined in this scope");
					parameter = new Parameter(identifier);
				}
				parameter.setTypeAndKind(type, kind);
			} while (Parse.accept(KeyWord.COMMA));

			Parse.expect(KeyWord.SEMICOLON);
		}
	}


	// ***********************************************************************************************
	// *** PARSING: acceptProtectionPart
	// ***********************************************************************************************
	/**
	 * Parse Utility: Accept protection-part updating Hidden and Protected lists.
	 * <pre>
	 * Syntax:
	 * 
	 *      protection-part = protection-specification { ; protection-specification }
	 *      
	 *           protection-specification
	 *                = HIDDEN identifier-list
	 *                | HIDDEN PROTECTED identifier-list
	 *                | PROTECTED identifier-list
	 *                | PROTECTED HIDDEN identifier-list
	 * </pre>
	 * @param cls the ClassDeclaration
	 */
	private static void acceptProtectionPart(ClassDeclaration cls) {
		while (true) {
			if (Parse.accept(KeyWord.HIDDEN)) {
				if (Parse.accept(KeyWord.PROTECTED))
					expectHiddenProtectedList(cls, true, true);
				else
					expectHiddenProtectedList(cls, true, false);
			} else if (Parse.accept(KeyWord.PROTECTED)) {
				if (Parse.accept(KeyWord.HIDDEN))
					expectHiddenProtectedList(cls, true, true);
				else
					expectHiddenProtectedList(cls, false, true);
			} else
				break;
		}	
	}
	
	/**
	 * Parse Utility: Expect Hidden Protected list.
	 * <pre>
	 * Syntax:
	 * 
	 *      identifier-list
	 * </pre>
	 * @param cls the ClassDeclaration
	 * @param hidden if true, update the hidden list
	 * @param prtected if true, update the protected list
	 */
	private static void expectHiddenProtectedList(final ClassDeclaration cls, final boolean hidden, final boolean prtected) {
		do {
			String identifier = Parse.expectIdentifier();
			if (hidden)
				cls.hiddenList.add(new HiddenSpecification(cls, identifier));
			if (prtected)
				cls.protectedList.add(new ProtectedSpecification(cls, identifier));
		} while (Parse.accept(KeyWord.COMMA));
		Parse.expect(KeyWord.SEMICOLON);
	}

	// ***********************************************************************************************
	// *** PARSING: expectClassBody
	// ***********************************************************************************************
	/**
	 * Parse Utility: Expect class-body.
	 * In case of a split-body, updating the class's declaration and statement lists.
	 * <pre>
	 * Syntax:
	 *                
	 *      class-body = statement | split-body
	 *      
	 *         split-body = initial-operations inner-part final-operations
	 *         
	 *            initial-operations = ( BEGIN | block-head ; ) { statement ; }
	 *         
	 *            inner-part = [ label : ] INNER ;
	 *'
	 *            final-operations
	 *               = END
	 *               | ; statement { ; statement } END
	 * </pre>
	 * 
	 * @param cls the ClassDeclaration
	 */
	private static void expectClassBody(ClassDeclaration cls) {
		if (Parse.accept(KeyWord.BEGIN)) {
			Statement stm;
			if (Option.internal.TRACE_PARSE)
				Parse.TRACE("Parse Block");
			while (Declaration.acceptDeclaration(cls)) {
				Parse.accept(KeyWord.SEMICOLON);
			}
			boolean seen = false;
			while (!Parse.accept(KeyWord.END)) {
				stm = Statement.expectStatement();
				if (stm != null)
					cls.statements.add(stm);
				if (Parse.accept(KeyWord.INNER)) {
					if (seen)
						Util.error("Max one INNER per Block");
					else
						cls.statements.add(new InnerStatement(Parse.currentToken.lineNumber));
					seen = true;
				}
			}
			if (!seen)
				cls.statements.add(new InnerStatement(Parse.currentToken.lineNumber)); // Implicit INNER
		}
		else {
			if(Parse.currentToken.keyWord != KeyWord.SEMICOLON)
				cls.statements.add(Statement.expectStatement());
			cls.statements.add(new InnerStatement(Parse.currentToken.lineNumber)); // Implicit INNER
		}
	}

	// ***********************************************************************************************
	// *** Utility: isSubClassOf
	// ***********************************************************************************************
	/**
	 * Checks if this class is a subclass of the 'other' class.
	 * <p>
	 * Consider the class definitions:
	 * 
	 * <pre>
	 *  
	 *      Class A ......;
	 *    A Class B ......;
	 *    B Class C ......;
	 * </pre>
	 * 
	 * Then Class B is a subclass of Class A, While Class C is subclass of both B
	 * and A.
	 * 
	 * @param other the other ClassDeclaration
	 * @return Boolean true iff this class is a subclass of the 'other' class.
	 */
	public boolean isSubClassOf(final ClassDeclaration other) {
		ClassDeclaration prefixClass = getPrefixClass();
		if (prefixClass != null)
			do {
				if (other == prefixClass)
					return (true);
			} while ((prefixClass = prefixClass.getPrefixClass()) != null);
		return (false);
	}

	// ***********************************************************************************************
	// *** Checking
	// ***********************************************************************************************
	@Override
	public void doChecking() {
		if(isPreCompiledFromFile != null && !isBlockLevelUpdated)
			updateBlockLevels(DeclarationScope.currentRTBlockLevel);
		if (IS_SEMANTICS_CHECKED())
			return;
		Global.sourceLineNumber = lineNumber;
		currentRTBlockLevel++;
		rtBlockLevel = currentRTBlockLevel;
		Global.enterScope(this);
		
		if (hasRealPrefix()) {
			prefixClass = getPrefixClass();
			prefixClass.doChecking();
			
			LabelList.accumLabelList(this);
			
			if (prefixClass.declarationKind != ObjectKind.StandardClass) {
				if (sourceBlockLevel != prefixClass.sourceBlockLevel)
					Util.warning("Subclass on a deeper block level not allowed.");
			}
		}
		if(type != null) type.doChecking(declaredIn);
		int prfx = prefixLevel();
		for (Parameter par : this.parameterList)
			par.setExternalIdentifier(prfx);
		for (Declaration par : new ClassParameterIterator())
			par.doChecking();
		for (VirtualSpecification vrt : virtualSpecList)
			vrt.doChecking();
		for (Declaration dcl : declarationList)
			dcl.doChecking();
		if(statements1 != null) 
			for (Statement stm : statements1) 
				stm.doChecking();  		
			
		
		for (Statement stm : statements)
			stm.doChecking();
		checkProtectedList();
		checkHiddenList();
		doCheckLabelList(prefixClass);
		Global.exitScope();
		currentRTBlockLevel--;
		SET_SEMANTICS_CHECKED();
	}

	// ***********************************************************************************************
	// *** Utility: checkHiddenList
	// ***********************************************************************************************
	/**
	 * Perform sematic checking of the Hidden list.
	 */
	private void checkHiddenList() {
		for (HiddenSpecification hdn : hiddenList)
			hdn.doChecking();
	}

	// ***********************************************************************************************
	// *** Utility: checkProtectedList
	// ***********************************************************************************************
	/**
	 * Perform sematic checking of the Protected list.
	 */
	private void checkProtectedList() {
		for (ProtectedSpecification pct : protectedList) {
			pct.doChecking();
		}
	}

	// ***********************************************************************************************
	// *** Utility: searchVirtualSpecList -- - Search VirtualSpec-list for 'ident'
	// ***********************************************************************************************
	/**
	 * Utility: Search VirtualSpec-list for 'ident'
	 * 
	 * @param ident argument
	 * @return a VirtualSpecification when it was found, otherwise null
	 */
	public VirtualSpecification searchVirtualSpecList(final String ident) {
		for (VirtualSpecification virtual : virtualSpecList) {
			if (Util.equals(ident, virtual.identifier))
				return (virtual);
		}
		return (null);
	}

	// ***********************************************************************************************
	// *** Utility: prefixLevel
	// ***********************************************************************************************
	/**
	 * Returns the prefix level.
	 * 
	 * @return the prefix level
	 */
	@Override
	public int prefixLevel() {
		if (!hasRealPrefix())
			return (0);
		ClassDeclaration prfx = getPrefixClass();
		if (prfx != null)
			return (prfx.prefixLevel() + 1);
		return (-1);
	}

	// ***********************************************************************************************
	// *** Utility: findLocalAttribute
	// ***********************************************************************************************
	/**
	 * Utility: Search for an attribute named 'ident'
	 * 
	 * @param ident argument
	 * @return a ProcedureDeclaration when it was found, otherwise null
	 */
	public Declaration findLocalAttribute(final String ident) {
		if (Option.internal.TRACE_FIND_MEANING > 0)
			Util.println("BEGIN Checking Class for " + ident + " ================================== " + identifier + " ==================================");
		for (Parameter parameter : parameterList) {
			if (Option.internal.TRACE_FIND_MEANING > 1)
				Util.println("Checking Parameter " + parameter);
			if (Util.equals(ident, parameter.identifier))
				return (parameter);
		}
		for (Declaration declaration : declarationList) {
			if (Option.internal.TRACE_FIND_MEANING > 1)
				Util.println("Checking Local " + declaration);
			if (Util.equals(ident, declaration.identifier))
				return (declaration);
		}
		if(labelList != null) for (LabelDeclaration label : labelList.labels) {
			if (Option.internal.TRACE_FIND_MEANING > 1)
				Util.println("Checking Label " + label);
			if (Util.equals(ident, label.identifier))
				return (label);
		}
		for (VirtualMatch match : virtualMatchList) {
			if (Option.internal.TRACE_FIND_MEANING > 1)
				Util.println("Checking Match " + match);
			if (Util.equals(ident, match.identifier))
				return (match);
		}
		for (VirtualSpecification virtual : virtualSpecList) {
			if (Option.internal.TRACE_FIND_MEANING > 1)
				Util.println("Checking Virtual " + virtual);
			if (Util.equals(ident, virtual.identifier))
				return (virtual);
		}
		if (Option.internal.TRACE_FIND_MEANING > 0)
			Util.println("ENDOF Checking Class for " + ident + " ================================== " + identifier + " ==================================");
		return (null);
	}

	// ***********************************************************************************************
	// *** Utility: findLocalProcedure
	// ***********************************************************************************************
	/**
	 * Utility: Search Declaration-list for a procedure named 'ident'
	 * 
	 * @param ident argument
	 * @return a ProcedureDeclaration when it was found, otherwise null
	 */
	ProcedureDeclaration findLocalProcedure(final String ident) {
		for (Declaration decl : declarationList)
			if (Util.equals(ident, decl.identifier)) {
				if (decl instanceof ProcedureDeclaration proc)
					 return (proc);
				else return (null);
			}
		return (null);
	}

	// ***********************************************************************************************
	// *** Utility: findRemoteAttributeMeaning
	// ***********************************************************************************************
	/**
	 * Find Remote Attribute's Meaning.
	 * 
	 * @param ident attribute identifier
	 * @return the resulting Meaning
	 */
	public Meaning findRemoteAttributeMeaning(final String ident) {
		boolean behindProtected = false;
		ClassDeclaration scope = this;
		Declaration decl = scope.findLocalAttribute(ident);
		if (decl != null) {
			boolean prtected = decl.isProtected != null;
			VirtualSpecification virtSpec = VirtualSpecification.getVirtualSpecification(decl);
			if (virtSpec != null && virtSpec.isProtected != null)
				prtected = true;
			if (!prtected)
				return (new Meaning(decl, this, scope, behindProtected));
		}
		SEARCH: while (scope != null) {
			HiddenSpecification hdn = scope.searchHiddenList(ident);
			if (hdn != null) {
				scope = hdn.getScopeBehindHidden();
				behindProtected = true;
				continue SEARCH;
			}
			Declaration decl2 = scope.findLocalAttribute(ident);
			if (decl2 != null) {
				boolean prtected = decl2.isProtected != null;
				if (withinScope(scope))
					prtected = false;
				if (!prtected)
					return (new Meaning(decl2, this, scope, behindProtected));
				behindProtected = true;
			}
			scope = scope.getPrefixClass();
		}
		return (null);
	}

	// ***********************************************************************************************
	// *** Utility: searchProtectedList - Search Protected-list for 'ident'
	// ***********************************************************************************************
	/**
	 * Utility: Search Protected-list for 'ident'
	 * 
	 * @param ident argument
	 * @return a ProtectedSpecification when it was found, otherwise null
	 */
	public ProtectedSpecification searchProtectedList(final String ident) {
		for (ProtectedSpecification pct : protectedList)
			if (Util.equals(ident, pct.identifier))
				return (pct);
		return (null);
	}

	// ***********************************************************************************************
	// *** Utility: withinScope -- Used by findRemoteAttributeMeaning
	// ***********************************************************************************************
	/**
	 * Checks if the other scope is this scope or any of the prefixes.
	 * @param otherScope the other scope
	 * @return true if the other scope is this scope or any of the prefixes
	 */
	private static boolean withinScope(final DeclarationScope otherScope) {
		DeclarationScope scope = Global.getCurrentScope();
		while (scope != null) {
			if (scope == otherScope)
				return (true);
			if (scope instanceof ClassDeclaration cls) {
				ClassDeclaration prfx = cls.getPrefixClass();
				while (prfx != null) {
					if (prfx == otherScope)
						return (true);
					prfx = prfx.getPrefixClass();
				}
			}
			scope = scope.declaredIn;
		}
		return (false);
	}

	// ***********************************************************************************************
	// *** Utility: findVisibleAttributeMeaning
	// ***********************************************************************************************
	@Override
	public Meaning findVisibleAttributeMeaning(final String ident) {
		if (Option.internal.TRACE_FIND_MEANING > 0)
			Util.println("BEGIN Checking Class for " + ident + " ================================== " + identifier + " ==================================");
		boolean searchBehindHidden = false;
		ClassDeclaration scope = this;
		Declaration decl = scope.findLocalAttribute(ident);
		if (decl != null) {
			Meaning meaning = new Meaning(decl, this, scope, searchBehindHidden);
			return (meaning);
		}
		scope = scope.getPrefixClass();
		SEARCH: while (scope != null) {
			HiddenSpecification hdn = scope.searchHiddenList(ident);
			if (hdn != null) {
				scope = hdn.getScopeBehindHidden();
				searchBehindHidden = true;
				continue SEARCH;
			}
			decl = scope.findLocalAttribute(ident);
			if (decl != null) {
				Meaning meaning = new Meaning(decl, this, scope, searchBehindHidden);
				return (meaning);
			}
			scope = scope.getPrefixClass();
		}
		if (Option.internal.TRACE_FIND_MEANING > 0)
			Util.println("ENDOF Checking Class for " + ident + " ================================== " + identifier + " ==================================");
		return (null);
	}

	// ***********************************************************************************************
	// *** Utility: searchHiddenList -- Search Hidden-list for 'ident'
	// ***********************************************************************************************
	/**
	 * Utility: Search Hidden-list for 'ident'
	 * 
	 * @param ident argument
	 * @return a HiddenSpecification when it was found, otherwise null
	 */
	HiddenSpecification searchHiddenList(final String ident) {
		for (HiddenSpecification hdn : hiddenList)
			if (Util.equals(ident, hdn.identifier))
				return (hdn);
		return (null);
	}

	// ***********************************************************************************************
	// *** Utility: getPrefixClass
	// ***********************************************************************************************
	/**
	 * Returns the prefix ClassDeclaration or null.
	 * 
	 * @return the prefix ClassDeclaration or null
	 */
	public ClassDeclaration getPrefixClass() {
		if (prefix == null)
			return (null);
		if(prefixClass != null) return(prefixClass);
		
		Meaning meaning = declaredIn.findMeaning(prefix);
		if (meaning == null)
			Util.error("Undefined prefix: " + prefix);
		Declaration decl = meaning.declaredAs;
		if (decl == this) {
			Util.error("Class prefix chain loops: " + identifier);
		}
		if (decl instanceof ClassDeclaration cls) {
			prefixClass = cls;
			return (cls);
		}
		Util.error("Prefix " + prefix + " is not a Class");
		return (null);
	}
	
	public String edCallChain() {
		StackTraceElement stackTraceElement[] = Thread.currentThread().getStackTrace();
		StringBuilder sb = new StringBuilder();
		int n = stackTraceElement.length;
		if(n > 6) n = 6;
		for (int i = 3; i < n; i++) {
			String methodName =stackTraceElement[i].getMethodName();
			String className = stackTraceElement[i].getClassName();
			int lno = stackTraceElement[i].getLineNumber();
			int p = className.lastIndexOf('.');
			className = className.substring(p+1);
			if(i > 3) sb.append(", ");
			sb.append(className+'.'+methodName+'('+lno+')');
		}
		return(sb.toString());
	}

	// ***********************************************************************************************
	// *** Coding Utility: hasRealPrefix
	// ***********************************************************************************************
	/**
	 * Check if this class has a real prefix.
	 * @return true if this class has a real prefix, otherwise false.
	 */
	boolean hasRealPrefix() {
		String prfx = prefix;
		boolean res = false;
		if (prfx != null) {
			res = true;
			if (Util.equals(prfx, "CLASS"))
				res = false;
		}
		return res;
	}

	// ***********************************************************************************************
	// *** Coding: isDetachUsed -- If the 'detach' attribute is used
	// ***********************************************************************************************
	//
	// COMMENT FROM Stein: Ta utgangspunkt i hvilke klasser man har kalt "detach" i, altså
	// kvalifikasjonen av de X som er brukt i "X.detach". Men da må man jo også holde greie på
	// hvilke slike som har forekommet i eksterne "moduler" (som f.eks. SIMULATION), uten at det
	// burde være problematisk.
	// ***********************************************************************************************
	/**
	 * Returns true if detach is called in/on this class.
	 * 
	 * @return true if detach is called in/on this class
	 */
	public boolean isDetachUsed() {
		// TRAVERSER PREFIX LOOKING FOR (detachUsed==true)
		if (this.detachUsed)
			return (true);
		if (this instanceof ClassDeclaration) {
			ClassDeclaration prfx = ((ClassDeclaration) this).getPrefixClass();
			if (prfx != null)
				return (prfx.isDetachUsed());
		}
		return (false);
	}

	// ***********************************************************************************************
	// *** Utility: ClassParameterIterator - Iterates through prefix-chain
	// ***********************************************************************************************
	/**
	 * Utility: ClassParameterIterator - Iterates through prefix-chain.
	 *
	 */
	public final class ClassParameterIterator implements Iterator<Parameter>, Iterable<Parameter> {
		/**
		 * The prefix Iterator
		 */
		private Iterator<Parameter> prefixIterator;
		/**
		 * The local Iterator
		 */
		private Iterator<Parameter> localIterator;

		/**
		 * Constructor
		 */
		public ClassParameterIterator() {
			ClassDeclaration prefix = getPrefixClass();
			if (prefix != null)
				prefixIterator = prefix.parameterIterator();
			localIterator = parameterList.iterator();
		}

		@Override
		public boolean hasNext() {
			if (prefixIterator != null) {
				if (prefixIterator.hasNext())
					return (true);
				prefixIterator = null;
			}
			return (localIterator.hasNext());
		}

		@Override
		public Parameter next() {
			if (!hasNext())
				return (null);
			if (prefixIterator != null)
				return (prefixIterator.next());
			return (localIterator.next());
		}

		@Override
		public Iterator<Parameter> iterator() {
			return (new ClassParameterIterator());
		}
	}

	/**
	 * Iterates through all class parameters.
	 * 
	 * @return a ClassParameterIterator
	 */
	public Iterator<Parameter> parameterIterator() {
		return (new ClassParameterIterator());
	}

	// ***********************************************************************************************
	// *** Coding: doJavaCoding
	// ***********************************************************************************************
	@Override
	public void doJavaCoding() {
		ASSERT_SEMANTICS_CHECKED();
		if (this.isPreCompiledFromFile != null) {
			if(Option.verbose) System.out.println("Skip  doJavaCoding: "+this.identifier+" -- It is read from "+isPreCompiledFromFile);	
			return;
		}
		Global.sourceLineNumber = lineNumber;
		GeneratedJavaClass javaModule = new GeneratedJavaClass(this);
		Global.enterScope(this);
		GeneratedJavaClass.code("@SuppressWarnings(\"unchecked\")");
		String line = "public class " + getJavaIdentifier();
		line = line + " extends " + getPrefixClass().getJavaIdentifier();
		GeneratedJavaClass.code(line + " {");
		GeneratedJavaClass.debug("// ClassDeclaration: Kind=" + declarationKind + ", BlockLevel=" + rtBlockLevel
				+ ", PrefixLevel=" + prefixLevel() + ", firstLine=" + lineNumber + ", lastLine=" + lastLineNumber
				+ ", hasLocalClasses=" + ((hasLocalClasses) ? "true" : "false") + ", System="
				+ ((isQPSystemBlock()) ? "true" : "false") + ", detachUsed=" + ((detachUsed) ? "true" : "false"));
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
			for (LabelDeclaration lab : labelList.labels)
				lab.declareLocalLabel(this);
		}
		GeneratedJavaClass.debug("// Declare locals as attributes");
		for (Declaration decl : declarationList)
			decl.doJavaCoding();

		for (VirtualSpecification virtual : virtualSpecList) {
			if (!virtual.hasDefaultMatch)
				virtual.doJavaCoding();
		}
		for (VirtualMatch match : virtualMatchList)
			match.doJavaCoding();
		doCodeConstructor();
		codeClassStatements();
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
		} else
			GeneratedJavaClass.code("super(staticLink);");
		GeneratedJavaClass.debug("// Parameter assignment to locals");
		for (Parameter par : parameterList)
			GeneratedJavaClass.code("this." + par.externalIdent + " = s" + par.externalIdent + ';');

		if (!hasRealPrefix())
			GeneratedJavaClass.code("BBLK(); // Iff no prefix");

		GeneratedJavaClass.debug("// Declaration Code");
		for (Declaration decl : declarationList)
			decl.doDeclarationCoding();
		GeneratedJavaClass.code("}");
	}

	// ***********************************************************************************************
	// *** Coding Utility: edFormalParameterList
	// ***********************************************************************************************
	/**
	 * Edit the formal parameter list
	 * <p>
	 * Also used by subclass PrefixedBlockDeclaration.
	 * 
	 * @return the resulting Java code
	 */
	protected String edFormalParameterList() {
		// Accumulates through prefix-chain when class
		StringBuilder s = new StringBuilder();
		s.append('(');
		s.append("RTS_RTObject staticLink");
		for (Declaration par : new ClassParameterIterator()) {
			// Iterates through prefix-chain
			s.append(',');
			s.append(((Parameter) par).toJavaType());
			s.append(' ');
			s.append('s').append(par.externalIdent); // s to indicate Specified Parameter
		}
		s.append(") {");
		return (s.toString());
	}

	// ***********************************************************************************************
	// *** Utility: hasLabel
	// ***********************************************************************************************
	@Override
	protected boolean hasLabel() {
		if (labelList != null && !labelList.isEmpty())
			return (true);
		if (hasRealPrefix()) {
			ClassDeclaration prfx = this.getPrefixClass();
			if (prfx != null)
				return (prfx.hasLabel());
		}
		return (false);
	}

	// ***********************************************************************************************
	// *** Utility: getNlabels
	// ***********************************************************************************************
	/**
	 * Returns the number of labels in this class.
	 * 
	 * @return the number of labels in this class
	 */
	@Override
	public int getNlabels() {
		ASSERT_SEMANTICS_CHECKED();
		int size = (labelList==null)?0:labelList.tableSize();
		return size;
	}

	// ***********************************************************************************************
	// *** Coding Utility: codeStatements
	// ***********************************************************************************************
	@Override
	public void codeStatements() {
		codeStatementsBeforeInner();
		codeStatementsAfterInner();
	}

	// ***********************************************************************************************
	// *** Coding Utility: codeStatementsBeforeInner
	// ***********************************************************************************************
	/**
	 * Coding utility: codeStatementsBeforeInner
	 */
	private void codeStatementsBeforeInner() {
		if (hasRealPrefix()) {
			ClassDeclaration prfx = this.getPrefixClass();
			if (prfx != null) prfx.codeStatementsBeforeInner();
		}
		if(statements1 != null) for (Statement stm : statements1) stm.doJavaCoding();
		GeneratedJavaClass.code("// BEGIN INNER PART");
	}

	// ***********************************************************************************************
	// *** Coding Utility: codeStatementsAfterInner
	// ***********************************************************************************************
	/**
	 * Coding utility: codeStatementsAfterInner
	 */
	private void codeStatementsAfterInner() {
		GeneratedJavaClass.code("// ENDOF INNER PART");
		for (Statement stm : statements) stm.doJavaCoding();
		if (hasRealPrefix()) {
			ClassDeclaration prfx = this.getPrefixClass();
			if (prfx != null) prfx.codeStatementsAfterInner();
		}
	}

	// ***********************************************************************************************
	// *** Coding Utility: codeClassStatements
	// ***********************************************************************************************
	/**
	 * Coding utility: Code class statements.
	 */
	protected void codeClassStatements() {
		boolean duringSTM_Coding = Global.duringSTM_Coding;
		Global.duringSTM_Coding = false;
		GeneratedJavaClass.debug("// Class Statements");
		GeneratedJavaClass.code("@Override");
		GeneratedJavaClass.code("public " + getJavaIdentifier() + " _STM() {");
		Global.duringSTM_Coding = true;
		codeSTMBody();
		GeneratedJavaClass.code("EBLK();");
		GeneratedJavaClass.code("return(this);");
		GeneratedJavaClass.code("}", "End of Class Statements");
		Global.duringSTM_Coding = duringSTM_Coding;
	}

	// ***********************************************************************************************
	// *** Coding Utility: edCompleteParameterList
	// ***********************************************************************************************
	/**
	 * Coding Utility: Edit the complete parameter list including all prefixes.
	 * 
	 * @return the resulting Java code
	 */
	protected String edCompleteParameterList() {
		StringBuilder s = new StringBuilder();
		s.append("(staticLink");
		for (Parameter par : new ClassParameterIterator()) // Iterates through prefix-chain
			s.append(",s").append(par.externalIdent); // s to indicate Specified Parameter
		s.append(");");
		return (s.toString());
	}



	// ***********************************************************************************************
	// *** ByteCoding Utility: superClassDesc
	// ***********************************************************************************************
	public ClassDesc superClassDesc() {
		if(hasRealPrefix())
			return getPrefixClass().getClassDesc();
		return CD.RTS_CLASS;
	}
	
	
	private boolean isLoaded;
    /**
     * Defined in DeclarationScope - Redefined in ClassDeclaration
     * @throws IOException
     */
	@Override
    protected void buildAndLoadOrAddClassFile() throws IOException {
		if(this.isLoaded) return;
		if(this instanceof StandardClass) return;
		if(hasRealPrefix()) {
			ClassDeclaration prefix = this.getPrefixClass();
//			System.out.println("ClassDeclaration.buildAndLoadOrAddClassFile: prefix="+prefix);
			if(!prefix.isLoaded) {
//				System.out.println("ClassDeclaration.buildAndLoadOrAddClassFile: prefix.buildAndLoadOrAddClassFile");
//				Util.IERR();
				prefix.buildAndLoadOrAddClassFile();
			}
		}
    	byte[] bytes = doBuildClassFile();
    	loadOrAddClassFile(bytes);
    	this.isLoaded = true;
    }

	// ***********************************************************************************************
	// *** ByteCoding: buildClassFile
	// ***********************************************************************************************
	@Override
	public byte[] buildClassFile() {
		ClassDesc CD_ThisClass = currentClassDesc();
		ClassDesc CD_SuperClass = superClassDesc();
		if(Option.verbose) System.out.println("Begin buildClassFile: "+CD_ThisClass+" extends "+CD_SuperClass);
		ClassHierarchy.addClassToSuperClass(CD_ThisClass, CD_SuperClass);
		
		byte[] bytes = ClassFile.of(ClassFile.ClassHierarchyResolverOption.of(ClassHierarchy.getResolver())).build(CD_ThisClass,
				classBuilder -> {
					classBuilder
						.with(SourceFileAttribute.of(Global.sourceFileName))
						.withFlags(ClassFile.ACC_PUBLIC + ClassFile.ACC_SUPER)
						.withSuperclass(CD_SuperClass);

					if(labelList != null)
						for (LabelDeclaration lab : labelList.labels)
							lab.buildField(classBuilder,this);

					for (Declaration decl : declarationList)
						decl.buildField(classBuilder,this);
					
					for (Parameter par : parameterList)
						par.buildField(classBuilder,this);
					
					for (VirtualSpecification virtual : virtualSpecList) 
						if (!virtual.hasDefaultMatch) 
							virtual.buildMethod(classBuilder);
					
					for (VirtualMatch match : virtualMatchList)
						match.buildMethod(classBuilder);

					classBuilder
						.withMethodBody("<init>", MethodTypeDesc.ofDescriptor(edConstructorSignature()), ClassFile.ACC_PUBLIC,
							codeBuilder -> buildConstructor(codeBuilder))
						.withMethodBody("_STM", MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_RTObject;"), ClassFile.ACC_PUBLIC,
							codeBuilder -> buildMethod_STM(codeBuilder));
					
					if (isDetachUsed()) 
						classBuilder
							.withMethodBody("isDetachUsed", MethodTypeDesc.ofDescriptor("()Z"), ClassFile.ACC_PUBLIC,
								codeBuilder -> buildIsMethodDetachUsed(codeBuilder));
				}
		);
		return(bytes);
	}

	// ***********************************************************************************************
	// *** ByteCoding: edConstructorSignature
	// ***********************************************************************************************
	/**
	 * Edit the constructor signature.
	 * <p>
	 * Example: (Lsimula/runtime/RTS_RTObject;IID)V
	 * <p>
	 * Also used by PrefixedBlockDeclaration.
	 * @return the MethodTypeDesc for the constructor
	 */
	@Override
	public String edConstructorSignature() {
		StringBuilder sb = new StringBuilder("(Lsimula/runtime/RTS_RTObject;");
		Iterator<Parameter> parameterIterator = parameterIterator();
		while(parameterIterator.hasNext()) {
			Parameter par = parameterIterator.next();
			sb.append(par.type.toJVMType(par.kind,par.mode));
		}
		sb.append(")V");
		return(sb.toString());
	}

	// ***********************************************************************************************
	// *** ByteCoding: buildConstructor
	// ***********************************************************************************************
	/**
	 * Generate byteCode for the Constructor.
	 * <pre>
	 *     public Program'name(RTS_RTObject staticLink, par, par ...) {
	 *         super(staticLink);
	 *		   // Parameter assignment to locals
	 *		   BBLK();
	 *		   // Declaration Code
	 *		   _STM();
	 *	   }
	 * </pre>
	 * Also used by PrefixedBlockDeclaration
	 * @param codeBuilder the CodeBuilder
	 * @param pool the ConstantPoolBuilder
	 */
	protected void buildConstructor(CodeBuilder codeBuilder) {
		ASSERT_SEMANTICS_CHECKED();
		Global.enterScope(this);
			ConstantPoolBuilder pool=codeBuilder.constantPool();
		
			Label begScope = codeBuilder.newLabel();
			Label endScope = codeBuilder.newLabel();
			MethodTypeDesc MTD_Super;
			if(hasRealPrefix()) {
				ClassDeclaration prefixClass = this.getPrefixClass();
				String pfxSignatur=prefixClass.edConstructorSignature();
				MTD_Super = MethodTypeDesc.ofDescriptor(pfxSignatur);
			} else {
				MTD_Super = MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_RTObject;)V");
			}
			codeBuilder
				.labelBinding(begScope)
				.localVariable(0,"this",currentClassDesc(),begScope,endScope)
				.localVariable(1,"staticLink",CD.RTS_RTObject,begScope,endScope);
			Iterator<Parameter> parameterIterator = this.parameterIterator();
			int npar=2;
			while(parameterIterator.hasNext()) {
				Parameter par = parameterIterator.next();
				codeBuilder
					.localVariable(npar++,par.externalIdent,par.type.toClassDesc(par.declaredIn),begScope,endScope);
			}

			// super(staticLink);
			codeBuilder
				.aload(0)
				.aload(1);
			// Load parameters
			int parOfst=2;
			if(hasRealPrefix()) {
				ClassDeclaration prefixClass = this.getPrefixClass();
				Iterator<Parameter> parIterator = prefixClass.parameterIterator();
				while(parIterator.hasNext()) {
					Parameter par = parIterator.next();
					par.loadParameter(codeBuilder, parOfst++);
					if(par.type.keyWord == Type.T_LONG_REAL) parOfst++;
				}
			}
			codeBuilder
				.invokespecial(pool.methodRefEntry(this.superClassDesc(),"<init>", MTD_Super));

			if(hasLabel()) // Declare local labels
				for (LabelDeclaration lab : labelList.labels)
					lab.buildInitAttribute(codeBuilder);
			
			// Add and Initialize attributes
			for (Declaration decl : declarationList)
				decl.buildInitAttribute(codeBuilder);

			// Parameter assignment to locals
			for(Parameter par:parameterList) {
				codeBuilder.aload(0);
				par.loadParameter(codeBuilder, parOfst++);
				if(par.type.keyWord == Type.T_LONG_REAL) parOfst++;
				codeBuilder.putfield(par.getFieldRefEntry(pool));
			}

			if (this.isMainModule) // E.g. Main program is Prefixed Block
				// GeneratedJavaClass.code("BPRG(\"" + identifier + "\");");
				codeBuilder
					.aload(0)
					.ldc(pool.stringEntry(this.edJavaClassName()))
					.invokevirtual(pool.methodRefEntry(currentClassDesc(),"BPRG", MethodTypeDesc.ofDescriptor("(Ljava/lang/String;)V")));

			// BBLK(); // Iff no prefix
			if (!hasRealPrefix())
				codeBuilder
					.aload(0)
					.invokevirtual(pool.methodRefEntry(currentClassDesc(),"BBLK", MethodTypeDesc.ofDescriptor("()V")));

			// Add Declaration Code to Constructor
			for (Declaration decl : declarationList)
				decl.buildDeclarationCode(codeBuilder);

			codeBuilder
				.return_()
				.labelBinding(endScope);
		Global.exitScope();
	}
	
	@Override
	public void buildField(ClassBuilder classBuilder, BlockDeclaration encloser) {
		Global.sourceLineNumber = lineNumber;
		try {
			this.createJavaClassFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void buildInitAttribute(CodeBuilder codeBuilder) {
		Global.sourceLineNumber = lineNumber;
	}

	// ***********************************************************************************************
	// *** ByteCoding: buildMethod_STM
	// ***********************************************************************************************
	/**
	 * Generate byteCode for the '_STM' method.
	 *
	 * @param codeBuilder the CodeBuilder
	 */
	@Override
	protected void build_STM_BODY(CodeBuilder codeBuilder, Label begScope, Label endScope) {
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		clearLabelList();
		stmStack.push(labelContext);
		labelContext = this;
		if(this.getPrefixClass() == StandardClass.CatchingErrors) {	
			if(this instanceof PrefixedBlockDeclaration)
				buildMethod_CatchingErrors_TRY_CATCH(codeBuilder, begScope, endScope);
			else {
				Util.error("It is not allowed to declare a subclass of StandardClass CatchingErrors");
				buildStatementsBeforeInner(codeBuilder);
				buildStatementsAfterInner(codeBuilder);
			}
		} else {
			buildStatementsBeforeInner(codeBuilder);
			buildStatementsAfterInner(codeBuilder);
		}
		labelContext = stmStack.pop();

		codeBuilder
			.aload(0)
			.invokevirtual(pool.methodRefEntry(currentClassDesc(),"EBLK", MethodTypeDesc.ofDescriptor("()V")))
			.aload(0)
			.areturn();
	}
	
	private void clearLabelList() {
//		System.out.println("ClassDeclaration.clearLabelList: ");
		if(labelList != null) for(LabelDeclaration lab:this.labelList.labels) lab.isBinded = false;
		if(prefixClass != null) prefixClass.clearLabelList();
	}


	// ***********************************************************************************************
	// *** ByteCoding: buildMethod_STM
	// ***********************************************************************************************
	/**
	 * Generate byteCode for the '_STM' method.
	 *
	 * @param codeBuilder the CodeBuilder
	 */
	private void buildMethod_CatchingErrors_TRY_CATCH(CodeBuilder codeBuilder, Label begScope, Label endScope) {
		codeBuilder.trying(
			tryCodeBuilder -> {
				buildStatementsBeforeInner(tryCodeBuilder);
				buildStatementsAfterInner(tryCodeBuilder);
			},
			catchBuilder -> catchBuilder.catching(CD.JAVA_LANG_RUNTIME_EXCEPTION,
				catchCodeBuilder -> buildMyCatchBlock(catchCodeBuilder, begScope, endScope)));
	}

	private void buildMyCatchBlock(CodeBuilder  codeBuilder, Label begScope, Label endScope) {
		ConstantPoolBuilder pool = codeBuilder.constantPool();
		int local_EXEPTN = BlockDeclaration.currentBlock.allocateLocalVariable(Type.Ref);
		codeBuilder.localVariable(local_EXEPTN,"exception",CD.JAVA_LANG_RUNTIME_EXCEPTION,begScope,endScope);
		// catch(RuntimeException e) { _CUR=this; _onError(e,onError_0()); }
        //  astore_1
        //  aload_0
        //  putstatic     #28                 // Field _CUR:Lsimula/runtime/RTS_RTObject;
        //  aload_0
        //  aload_1
        //  aload_0
        //  invokevirtual #32                 // Method onError_0:()Lsimula/runtime/RTS_PRCQNT;
        //  invokevirtual #36                 // Method _onError:(Ljava/lang/RuntimeException;Lsimula/runtime/RTS_PRCQNT;)V

		codeBuilder
			.astore(local_EXEPTN)  // The caught exception will be on top of the operand stack when the catch block is entered.
			.aload(0)
			.putstatic(pool.fieldRefEntry(currentClassDesc(), "_CUR", CD.RTS_RTObject))
			.aload(0)
			.aload(local_EXEPTN)
			.aload(0)
			.invokevirtual(pool.methodRefEntry(currentClassDesc(),
				"onError_0", MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_PRCQNT;")))
			.invokevirtual(pool.methodRefEntry(currentClassDesc(),
				"_onError", MethodTypeDesc.ofDescriptor("(Ljava/lang/RuntimeException;Lsimula/runtime/RTS_PRCQNT;)V")));
		;
	}

	// ***********************************************************************************************
	// *** Coding Utility: buildStatementsBeforeInner
	// ***********************************************************************************************
	/**
	 * Coding utility: buildStatementsBeforeInner
	 */
	private void buildStatementsBeforeInner(CodeBuilder codeBuilder) {
		if (hasRealPrefix()) {
			ClassDeclaration prfx = this.getPrefixClass();
			if (prfx != null) prfx.buildStatementsBeforeInner(codeBuilder);
		}
		if(statements1 != null) for (Statement stm : statements1) {
			if(!(stm instanceof DummyStatement)) Util.buildLineNumber(codeBuilder,stm);
//			System.out.println("ClassDeclaration.buildStatementsBeforeInner: "+stm.getClass().getSimpleName()+"  "+stm);
			stm.buildByteCode(codeBuilder);
		}
	}

	// ***********************************************************************************************
	// *** Coding Utility: buildStatementsAfterInner
	// ***********************************************************************************************
	/**
	 * Coding utility: buildStatementsAfterInner
	 */
	private void buildStatementsAfterInner(CodeBuilder codeBuilder) {
		for (Statement stm : statements){
			if(!(stm instanceof DummyStatement)) Util.buildLineNumber(codeBuilder,stm);
//			System.out.println("ClassDeclaration.buildStatementsAfterInner: "+stm.getClass().getSimpleName()+"  "+stm);
			stm.buildByteCode(codeBuilder);
		}
		if (hasRealPrefix()) {
			ClassDeclaration prfx = this.getPrefixClass();
			if (prfx != null) prfx.buildStatementsAfterInner(codeBuilder);
		}
	}


	// ***********************************************************************************************
	// *** Printing Utility: print
	// ***********************************************************************************************
	@Override
	public void print(final int indent) {
//		Util.IERR();
		String spc = edIndent(indent);
		StringBuilder s = new StringBuilder(spc);
		s.append('[').append(sourceBlockLevel).append(':').append(rtBlockLevel).append("] ");
		if (prefix != null)
			s.append(prefix).append(' ');
		s.append(declarationKind).append(' ').append(identifier);
		s.append('[').append(externalIdent).append("] ");
		s.append(Parameter.editParameterList(parameterList));
		Util.println(s.toString());
		if (!virtualSpecList.isEmpty())
			Util.println(spc + "    VIRTUAL-SPEC" + virtualSpecList);
		if (!virtualMatchList.isEmpty())
			Util.println(spc + "    VIRTUAL-MATCH" + virtualMatchList);
		if (!hiddenList.isEmpty())
			Util.println(spc + "    HIDDEN" + hiddenList);
		if (!protectedList.isEmpty())
			Util.println(spc + "    PROTECTED" + protectedList);
		String beg = "begin[" + edScopeChain() + ']';
		Util.println(spc + beg);
		for (Declaration decl : declarationList)
			decl.print(indent + 1);
		for (Statement stm : statements)
			stm.print(indent + 1);
		Util.println(spc + "end[" + edScopeChain() + ']');
	}
	
	@Override
	public void printTree(final int indent) {
		System.out.println(edTreeIndent(indent)+"CLASS "+identifier+"  BL="+this.rtBlockLevel+"  PrefixLevel="+prefixLevel());
		if(labelList != null) labelList.printTree(indent+1);
		for(Parameter p:parameterList) p.printTree(indent+1);
		if (!virtualSpecList.isEmpty())
			for( VirtualSpecification v:virtualSpecList) v.printTree(indent+1);
		if (!virtualMatchList.isEmpty())
			for( VirtualMatch m:virtualMatchList) m.printTree(indent+1);
		if (!hiddenList.isEmpty())
			for( HiddenSpecification h:hiddenList) h.printTree(indent+1);
		if (!protectedList.isEmpty())
			for( ProtectedSpecification p:protectedList) p.printTree(indent+1);
		printDeclarationList(indent+1);
		for(Statement s:statements1) s.printTree(indent+1);
		printStatementList(indent+1);
	}

	@Override
	public String toString() {
		return ("" + identifier + '[' + externalIdent + "] DeclarationKind=" + ObjectKind.edit(declarationKind));
	}

	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************
	/**
	 * Default constructor used by Attribute File I/O
	 */
	public ClassDeclaration() {
		super(null);
	}

	public void writeObject(AttributeOutputStream oupt) throws IOException {
		Util.TRACE_OUTPUT("BEGIN Write ClassDeclaration: " + identifier + ", Declared in: " + declaredIn);
		oupt.writeKind(declarationKind); // Mark: This is a ClassDeclaration
		oupt.writeString(identifier);
		oupt.writeShort(SEQU);
		
//		// ================ SyntaxClass =================
//		oupt.writeShort(lineNumber);
//		oupt.writeString(insertName);
//
//		// ================ Declaration =================
////		oupt.writeString(identifier);
//		oupt.writeString(externalIdent);
//		oupt.writeType(type);
//
//		// ================ DeclarationScope =================
////		oupt.writeShort(ctBlockLevel);
//		oupt.writeShort(rtBlockLevel);
//		oupt.writeString(isPreCompiledFromFile);
//		oupt.writeBoolean(hasLocalClasses);
//
//		LabelList.writeLabelList(labelList, oupt);
//
//		DeclarationList decls = prep(declarationList);
//		oupt.writeShort(decls.size());
//		for(Declaration decl:decls) oupt.writeObj(decl);
//		
//		
//		// ================ BlockDeclaration =================
//		if(statements != null) {
//			oupt.writeShort(statements.size());
//			for(Statement stm:statements) oupt.writeObj(stm);
//		} else oupt.writeShort(0);
//
//		
//		// ================ ClassDeclaration =================
//		oupt.writeString(prefix);
//		oupt.writeBoolean(detachUsed);
//
//		oupt.writeShort(parameterList.size());
//		for(Parameter par:parameterList) par.writeParameter(oupt);
//		
//		oupt.writeShort(virtualSpecList.size());
//		for(VirtualSpecification virt:virtualSpecList) VirtualSpecification.writeVirtSpec(virt, oupt);
//
//		oupt.writeShort(hiddenList.size());
//		for(HiddenSpecification virt:hiddenList) virt.writeHiddenSpecification(oupt);
//
//		oupt.writeShort(protectedList.size());
//		for(ProtectedSpecification spec:protectedList) spec.writeProtectedSpecification(oupt);
//
//		if(statements1 != null) {
//			oupt.writeShort(statements1.size());
//			for(Statement stm:statements1) oupt.writeObj(stm);
//		} else oupt.writeShort(0);


		writeAttributes(oupt);
		Util.TRACE_OUTPUT("END Write ClassDeclaration: " + identifier);
	}

	public static ClassDeclaration readObject(AttributeInputStream inpt) throws IOException {
		String identifier = (String) inpt.readString();
		ClassDeclaration cls = new ClassDeclaration(identifier);
		Util.TRACE_INPUT("BEGIN Read ClassDeclaration: " + identifier + ", Declared in: " + cls.declaredIn);
		cls.declarationKind = ObjectKind.Class;
		cls.SEQU = inpt.readSEQU(cls);
		
		
//		// ================ SyntaxClass =================
//		cls.lineNumber = inpt.readShort();
//		cls.insertName = inpt.readString();
//
//		// ================ Declaration =================
////		cls.identifier = inpt.readString();
//		cls.externalIdent = inpt.readString();
//		cls.type = inpt.readType();
//
//		// ================ DeclarationScope =================
////		ctBlockLevel = inpt.readShort();
//		cls.rtBlockLevel = inpt.readShort();
//		cls.isPreCompiledFromFile = inpt.readString();
//		cls.hasLocalClasses = inpt.readBoolean();
//
//		cls.labelList = LabelList.readLabelList(inpt);
//
//		int n = inpt.readShort();
//		for(int i=0;i<n;i++) {
//			Declaration decl = (Declaration) inpt.readObj();
//			cls.declarationList.add(decl);
//		}
//		
//		// ================ BlockDeclaration =================		
//		n = inpt.readShort();
//		if(n > 0) {
//			cls.statements = new Vector<Statement>();
//			for(int i=0;i<n;i++) {
//				Statement stm = (Statement) inpt.readObj();
//				cls.statements.add(stm);
//			}
//		}
//
//		// ================ ClassDeclaration =================
//
//		cls.prefix = inpt.readString();
//		cls.detachUsed = inpt.readBoolean();
//
//		n = inpt.readShort();
//		for(int i=0;i<n;i++)
//			cls.parameterList.add(Parameter.readParameter(inpt));
//
//		n = inpt.readShort();
//		for(int i=0;i<n;i++)
//			cls.virtualSpecList.add(VirtualSpecification.readVirtSpec(inpt));
//		
//		n = inpt.readShort();
//		for(int i=0;i<n;i++)
//			cls.hiddenList.add(HiddenSpecification.readHiddenSpecification(inpt));
//		
//		n = inpt.readShort();
//		for(int i=0;i<n;i++)
//			cls.protectedList.add(ProtectedSpecification.readProtectedSpecification(inpt));
//
//		n = inpt.readShort();
//		if(n > 0) cls.statements1 = new Vector<Statement>();
//		for(int i=0;i<n;i++) {
//			Statement stm = (Statement) inpt.readObj();
//			cls.statements1.add(stm);
//		}
		
		cls.readAttributes(inpt);
		Util.TRACE_INPUT("END Read ClassDeclaration: " + identifier + ", Declared in: " + cls.declaredIn);
		Global.setScope(cls.declaredIn);
		return(cls);
	}

	@Override
	public void writeAttributes(AttributeOutputStream oupt) throws IOException {
		super.writeAttributes(oupt);
		oupt.writeString(prefix);
		oupt.writeBoolean(detachUsed);

		oupt.writeShort(parameterList.size());
		for(Parameter par:parameterList) par.writeParameter(oupt);
		
		oupt.writeShort(virtualSpecList.size());
		for(VirtualSpecification virt:virtualSpecList) VirtualSpecification.writeVirtSpec(virt, oupt);

		oupt.writeShort(hiddenList.size());
		for(HiddenSpecification virt:hiddenList) virt.writeHiddenSpecification(oupt);

		oupt.writeShort(protectedList.size());
		for(ProtectedSpecification spec:protectedList) spec.writeProtectedSpecification(oupt);

		if(statements1 != null) {
			oupt.writeShort(statements1.size());
			for(Statement stm:statements1) oupt.writeObj(stm);
		} else oupt.writeShort(0);
	}

	@Override
	public void readAttributes(AttributeInputStream inpt) throws IOException {
		super.readAttributes(inpt);
		prefix = inpt.readString();
		detachUsed = inpt.readBoolean();

		int n = inpt.readShort();
		for(int i=0;i<n;i++)
			parameterList.add(Parameter.readParameter(inpt));

		n = inpt.readShort();
		for(int i=0;i<n;i++)
			virtualSpecList.add(VirtualSpecification.readVirtSpec(inpt));
		
		n = inpt.readShort();
		for(int i=0;i<n;i++)
			hiddenList.add(HiddenSpecification.readHiddenSpecification(inpt));
		
		n = inpt.readShort();
		for(int i=0;i<n;i++)
			protectedList.add(ProtectedSpecification.readProtectedSpecification(inpt));

		n = inpt.readShort();
		if(n > 0) statements1 = new Vector<Statement>();
		for(int i=0;i<n;i++) {
			Statement stm = (Statement) inpt.readObj();
			statements1.add(stm);
		}
		if(!Option.internal.CREATE_JAVA_SOURCE)
			isPreCompiledFromFile = inpt.jarFileName;
//		System.out.println("ClassDeclaration.readAttributes: Class "+identifier+" isPreCompiledFromFile="+isPreCompiledFromFile);
	}
	
}
