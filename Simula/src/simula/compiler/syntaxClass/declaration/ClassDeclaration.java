/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass.declaration;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.classfile.ClassBuilder;
import java.lang.classfile.ClassFile;
import java.lang.classfile.CodeBuilder;
import java.lang.classfile.Label;
import java.lang.classfile.attribute.SourceFileAttribute;
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import java.lang.classfile.constantpool.FieldRefEntry;
import java.lang.constant.ClassDesc;
import java.lang.constant.MethodTypeDesc;
import java.util.Iterator;
import java.util.Vector;

import simula.compiler.GeneratedJavaClass;
import simula.compiler.CodeLine;
import simula.compiler.parsing.Parse;
import simula.compiler.syntaxClass.HiddenSpecification;
import simula.compiler.syntaxClass.ProtectedSpecification;
import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.statement.DummyStatement;
import simula.compiler.syntaxClass.statement.InnerStatement;
import simula.compiler.syntaxClass.statement.Statement;
import simula.compiler.utilities.CD;
import simula.compiler.utilities.DeclarationList;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.KeyWord;
import simula.compiler.utilities.Meaning;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Token;
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
public class ClassDeclaration extends BlockDeclaration implements Externalizable {
	/**
	 * The external prefix'identifier.
	 */
	private String externalPrefixIdent;

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
		this.declarationKind = Declaration.Kind.Class;
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
//			while (acceptParameterSpecificationPart(cls.parameterList))
//				Parse.expect(KeyWord.SEMICOLON);
			acceptParameterSpecificationPart(cls.parameterList);
		} else
			Parse.expect(KeyWord.SEMICOLON);

		acceptProtectionPart(cls);
		if (Parse.accept(KeyWord.VIRTUAL))
			VirtualSpecification.expectVirtualPart(cls);
		expectClassBody(cls);
		
		cls.lastLineNumber = Global.sourceLineNumber;
		cls.type = Type.Ref(cls.identifier);
		if (Option.TRACE_PARSE)
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
		if (Option.TRACE_PARSE)
			Parse.TRACE("Parse ParameterSpecifications");
		while (true) {
			Type type;
			Parameter.Kind kind = Parameter.Kind.Simple;
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
	private static void expectHiddenProtectedList(final ClassDeclaration cls, final boolean hidden,
			final boolean prtected) {
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
//	private static void expectClassBody(ClassDeclaration cls) {
//		if (Parse.accept(KeyWord.BEGIN)) {
//			Statement stm;
//			if (Option.TRACE_PARSE)
//				Parse.TRACE("Parse Block");
//			while (Declaration.acceptDeclaration(cls.declarationList)) {
//				Parse.accept(KeyWord.SEMICOLON);
//			}
//			boolean seen = false;
//			Vector<Statement> stmList = cls.statements;
//			while (!Parse.accept(KeyWord.END)) {
//				stm = Statement.expectStatement();
//				if (stm != null)
//					stmList.add(stm);
//				if (Parse.accept(KeyWord.INNER)) {
//					if (seen)
//						Util.error("Max one INNER per Block");
//					else
//						stmList.add(new InnerStatement(Parse.currentToken.lineNumber));
//					seen = true;
//				}
//			}
//			if (!seen)
//				stmList.add(new InnerStatement(Parse.currentToken.lineNumber)); // Implicit INNER
//		}
//		else {
//			cls.statements.add(Statement.expectStatement());
//			cls.statements.add(new InnerStatement(Parse.currentToken.lineNumber)); // Implicit INNER
//		}
//	}
	private static void expectClassBody(ClassDeclaration cls) {
		if (Parse.accept(KeyWord.BEGIN)) {
			Statement stm;
			if (Option.TRACE_PARSE)
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
		if(isPreCompiled && !isBlockLevelUpdated)
			updateBlockLevels(DeclarationScope.currentRTBlockLevel);
		if (IS_SEMANTICS_CHECKED())
			return;
		Global.sourceLineNumber = lineNumber;
		if (externalIdent == null)
			externalIdent = edJavaClassName();
		currentRTBlockLevel++;
		rtBlockLevel = currentRTBlockLevel;
		Global.enterScope(this);
		
		ClassDeclaration prefixClass = null;
		if (!hasNoRealPrefix()) {
			prefixClass = getPrefixClass();
			if (prefixClass.declarationKind != Declaration.Kind.StandardClass) {
				if (sourceBlockLevel != prefixClass.sourceBlockLevel)
					Util.warning("Subclass on a deeper block level not allowed.");
			}
		}
		type.doChecking(declaredIn); // TODO: TESTING
		int prfx = prefixLevel();
		for (Parameter par : this.parameterList)
			par.setExternalIdentifier(prfx);
		for (Declaration par : new ClassParameterIterator())
			par.doChecking();
		for (VirtualSpecification vrt : virtualSpecList)
			vrt.doChecking();
		for (Declaration dcl : declarationList)
			dcl.doChecking();
		if(statements1 != null) {
			for (Statement stm : statements1) {
//				System.out.println("ClassDeclaration.doChecking: stm="+stm.getClass().getSimpleName()+"  "+stm);
				stm.doChecking();  		
			}
		}
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
	public int prefixLevel() {
		if (hasNoRealPrefix())
			return (0);
		ClassDeclaration prfx = getPrefixClass();
		if (prfx != null)
			return (prfx.prefixLevel() + 1);
		return (-1);
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
	int getNlabels() {
		if (hasNoRealPrefix()) return (labelList.size());
		return (labelList.size() + getPrefixClass().getNlabels());
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
		if (Option.TRACE_FIND_MEANING > 0)
			Util.println("BEGIN Checking Class for " + ident + " ================================== " + identifier
					+ " ==================================");
		for (Parameter parameter : parameterList) {
			if (Option.TRACE_FIND_MEANING > 1)
				Util.println("Checking Parameter " + parameter);
			if (Util.equals(ident, parameter.identifier))
				return (parameter);
		}
		for (Declaration declaration : declarationList) {
			if (Option.TRACE_FIND_MEANING > 1)
				Util.println("Checking Local " + declaration);
			if (Util.equals(ident, declaration.identifier))
				return (declaration);
		}
		for (LabelDeclaration label : labelList) {
			if (Option.TRACE_FIND_MEANING > 1)
				Util.println("Checking Label " + label);
			if (Util.equals(ident, label.identifier))
				return (label);
		}
		for (VirtualMatch match : virtualMatchList) {
			if (Option.TRACE_FIND_MEANING > 1)
				Util.println("Checking Match " + match);
			if (Util.equals(ident, match.identifier))
				return (match);
		}
		for (VirtualSpecification virtual : virtualSpecList) {
			if (Option.TRACE_FIND_MEANING > 1)
				Util.println("Checking Virtual " + virtual);
			if (Util.equals(ident, virtual.identifier))
				return (virtual);
		}
		if (Option.TRACE_FIND_MEANING > 0)
			Util.println("ENDOF Checking Class for " + ident + " ================================== " + identifier
					+ " ==================================");
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
				else
					return (null);
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
		if (Option.TRACE_FIND_MEANING > 0)
			Util.println("BEGIN Checking Class for " + ident + " ================================== " + identifier
					+ " ==================================");
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
		if (Option.TRACE_FIND_MEANING > 0)
			Util.println("ENDOF Checking Class for " + ident + " ================================== " + identifier
					+ " ==================================");
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
		Meaning meaning = declaredIn.findMeaning(prefix);
		if (meaning == null)
			Util.error("Undefined prefix: " + prefix);
		Declaration decl = meaning.declaredAs;
		if (decl == this) {
			Util.error("Class prefix chain loops: " + identifier);
		}
		if (decl instanceof ClassDeclaration cls)
			return (cls);
		if (decl instanceof StandardClass scl)
			return (scl);
		Util.error("Prefix " + prefix + " is not a Class");
		return (null);
	}

	// ***********************************************************************************************
	// *** Coding Utility: hasNoRealPrefix
	// ***********************************************************************************************
	/**
	 * Check if this class has a real prefix.
	 * @return true if this class has a real prefix, otherwise false.
	 */
	boolean hasNoRealPrefix() {
		ClassDeclaration prfx = getPrefixClass();
		boolean noPrefix = true;
		if (prfx != null) {
			noPrefix = false;
			String prfxString = prfx.identifier;
			if (Util.equals(prfxString, "CLASS"))
				noPrefix = true;
		}
		return (noPrefix);
	}

	// ***********************************************************************************************
	// *** Coding: isDetachUsed -- If the 'detach' attribute is used
	// ***********************************************************************************************
	//
	// COMMENT FROM Stein: Ta utgangspunkt i hvilke klasser man har kalt "detach"
	// i, altså kvalifikasjonen av de X som er brukt i "X.detach". Men da må man jo
	// også holde greie på hvilke slike som har forekommet i eksterne "moduler" (som
	// f.eks. SIMULATION), uten at det burde være problematisk.
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
	// *** Utility: ClassParameterIterator - // Iterates through prefix-chain
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
		if (this.isPreCompiled)
			return;
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
		if (!labelList.isEmpty()) {
			GeneratedJavaClass.debug("// Declare local labels");
			for (Declaration decl : labelList)
				decl.doJavaCoding();
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

		if (hasNoRealPrefix())
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
	// *** Coding Utility: hasLabel
	// ***********************************************************************************************
	@Override
	protected boolean hasLabel() {
		if (!labelList.isEmpty())
			return (true);
		if (!this.hasNoRealPrefix()) {
			ClassDeclaration prfx = this.getPrefixClass();
			if (prfx != null)
				return (prfx.hasLabel());
		}
		return (false);
	}

	// ***********************************************************************************************
	// *** Coding Utility: saveClassStms
	// ***********************************************************************************************
//	private void saveClassStms() {
//		if (code1 == null) {
//			code1 = new Vector<CodeLine>();
//			Global.currentJavaModule.saveCode = code1;
//			for (Statement stm : statements)
//				stm.doJavaCoding();
//			Global.currentJavaModule.saveCode = null;
//		}
//	}

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
		if (!this.hasNoRealPrefix()) {
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
		if (!this.hasNoRealPrefix()) {
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
		Global.duringSTM_Coding = true;
		GeneratedJavaClass.debug("// Class Statements");
		GeneratedJavaClass.code("@Override");
		GeneratedJavaClass.code("public " + getJavaIdentifier() + " _STM() {");
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
		if(this.hasNoRealPrefix())
			return(CD.RTS_CLASS);
		else return(this.getPrefixClass().getClassDesc());
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
					for (LabelDeclaration lab : labelList) lab.buildField(classBuilder,this);
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
					
					if (isDetachUsed()) {
						//GeneratedJavaClass.code("public boolean isDetachUsed() { return(true); }");
						MethodTypeDesc MTD_isDetachUsed=MethodTypeDesc.ofDescriptor("()Z");
						classBuilder
							.withMethodBody("isDetachUsed", MTD_isDetachUsed, ClassFile.ACC_PUBLIC,
								codeBuilder -> buildIsMethodDetachUsed(codeBuilder));
					}
				}
		);
		return(bytes);
	}

	protected MethodTypeDesc MTD_Constructor() {
		// MethodTypeDesc MTD_Constructor=MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_RTObject;I)V");
		StringBuilder sb=new StringBuilder("(Lsimula/runtime/RTS_RTObject;");
		Iterator<Parameter> parameterIterator = this.parameterIterator();
		while(parameterIterator.hasNext()) {
			Parameter par = parameterIterator.next();
			sb.append(par.type.toJVMType(par.kind,par.mode));
		}
		sb.append(")V");
		return(MethodTypeDesc.ofDescriptor(sb.toString()));
	}

	public FieldRefEntry getResultFieldRefEntry(ConstantPoolBuilder pool) {
		return(pool.fieldRefEntry(this.getClassDesc(), "_RESULT", type.toClassDesc()));
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
			if(this.hasNoRealPrefix()) {
				MTD_Super = MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_RTObject;)V");
			} else {
				ClassDeclaration prefixClass = this.getPrefixClass();
				String pfxSignatur=prefixClass.edConstructorSignature();
				MTD_Super = MethodTypeDesc.ofDescriptor(pfxSignatur);
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
			if(!hasNoRealPrefix()) {
				ClassDeclaration prefixClass = this.getPrefixClass();
				Iterator<Parameter> parIterator = prefixClass.parameterIterator();
				while(parIterator.hasNext()) {
					Parameter par = parIterator.next();
					par.loadParameter(codeBuilder, parOfst++);
					if(par.type.equals(Type.LongReal)) Util.IERR("HVA GJØR VI HER ???");
				}
			}
			codeBuilder
				.invokespecial(pool.methodRefEntry(this.superClassDesc(),"<init>", MTD_Super));

			if (!labelList.isEmpty()) {
				// Declare local labels
				for (LabelDeclaration lab : labelList)
					lab.buildInitAttribute(codeBuilder);
			}
			// Add and Initialize attributes
			for (Declaration decl : declarationList) {
				decl.buildInitAttribute(codeBuilder);
			}

			// Parameter assignment to locals
			//		int parOfst=2;
			for(Parameter par:parameterList) {
				codeBuilder.aload(0);
				par.loadParameter(codeBuilder, parOfst++);
				if(par.type.equals(Type.LongReal)) parOfst++;
				codeBuilder.putfield(par.getFieldRefEntry(pool));
			}

			if (this.isMainModule) { // E.g. Main program is Prefixed Block
				// GeneratedJavaClass.code("BPRG(\"" + identifier + "\");");
				codeBuilder
					.aload(0)
					.ldc(pool.stringEntry(this.edJavaClassName()))
					.invokevirtual(pool.methodRefEntry(currentClassDesc(),"BPRG", MethodTypeDesc.ofDescriptor("(Ljava/lang/String;)V")));
			}

			// BBLK(); // Iff no prefix
			if (hasNoRealPrefix()) {
				codeBuilder.aload(0)
					.invokevirtual(pool.methodRefEntry(currentClassDesc(),"BBLK", MethodTypeDesc.ofDescriptor("()V")));
			}

			// Add Declaration Code to Constructor
			for (Declaration decl : declarationList) {
				decl.buildDeclarationCode(codeBuilder);
			}

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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void buildInitAttribute(CodeBuilder codeBuilder) {
		Global.sourceLineNumber = lineNumber;
//		Util.IERR("Method buildInitAttribute need a redefinition in "+this.getClass().getSimpleName());
	}


	// ***********************************************************************************************
	// *** ByteCoding: edConstructorSignature
	// ***********************************************************************************************
	@Override
	public String edConstructorSignature() {
		// MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_RTObject;I)V");
		StringBuilder sb=new StringBuilder("(Lsimula/runtime/RTS_RTObject;");
		Iterator<Parameter> parameterIterator = parameterIterator();
		while(parameterIterator.hasNext()) {
			Parameter par = parameterIterator.next();
			sb.append(par.type.toJVMType(par.kind,par.mode));
		}
		sb.append(")V");
		return(sb.toString());
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
	protected void build_STM_BODY(CodeBuilder codeBuilder) {
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		Label begScope = codeBuilder.newLabel();
		Label endScope = codeBuilder.newLabel();
		codeBuilder
			.labelBinding(begScope)
			.localVariable(0,"this",currentClassDesc(),begScope,endScope);

		buildStatementsBeforeInner(codeBuilder);
		buildStatementsAfterInner(codeBuilder);

		codeBuilder
			.aload(0)
			.invokevirtual(pool.methodRefEntry(currentClassDesc(),"EBLK", MethodTypeDesc.ofDescriptor("()V")))
			.aload(0)
			.areturn()
			.labelBinding(endScope);
	}

	// ***********************************************************************************************
	// *** Coding Utility: buildStatementsBeforeInner
	// ***********************************************************************************************
	/**
	 * Coding utility: buildStatementsBeforeInner
	 */
	private void buildStatementsBeforeInner(CodeBuilder codeBuilder) { // TODO: NEW_INNER_IMPL
		if (!this.hasNoRealPrefix()) {
			ClassDeclaration prfx = this.getPrefixClass();
			if (prfx != null) prfx.buildStatementsBeforeInner(codeBuilder);
		}
		if(statements1 != null) for (Statement stm : statements1) {
			if(!(stm instanceof DummyStatement)) Util.buildLineNumber(codeBuilder,stm);
			stm.buildByteCode(codeBuilder);
		}
	}

	// ***********************************************************************************************
	// *** Coding Utility: buildStatementsAfterInner
	// ***********************************************************************************************
	/**
	 * Coding utility: buildStatementsAfterInner
	 */
	private void buildStatementsAfterInner(CodeBuilder codeBuilder) { // TODO: NEW_INNER_IMPL
		for (Statement stm : statements){
			if(!(stm instanceof DummyStatement)) Util.buildLineNumber(codeBuilder,stm);
			stm.buildByteCode(codeBuilder);
		}
		if (!this.hasNoRealPrefix()) {
			ClassDeclaration prfx = this.getPrefixClass();
			if (prfx != null) prfx.buildStatementsAfterInner(codeBuilder);
		}
	}

	// ***********************************************************************************************
	// *** ByteCoding: buildMethod_STM2
	// ***********************************************************************************************
	/**
	 * Generate byteCode for the '_STM' method.
	 *
	 * @param codeBuilder the CodeBuilder
	 */
	void buildMethod_STM2(CodeBuilder codeBuilder) {

//    	public simula.runtime.RTS_RTObject _STM();
//        descriptor: ()Lsimula/runtime/RTS_RTObject;
//        flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
//        Code:
//          stack=1, locals=1, args_size=1
//             0: aload_0
//             1: invokevirtual #57                 // Method _STM:()LsimulaTestPrograms/adHoc03_A;
//             4: areturn

		ConstantPoolBuilder pool=codeBuilder.constantPool();
		Label begScope = codeBuilder.newLabel();
		Label endScope = codeBuilder.newLabel();
		codeBuilder
				.labelBinding(begScope)
				.aload(0)
				.invokevirtual(pool.methodRefEntry(currentClassDesc()
						,"_STM", MethodTypeDesc.ofDescriptor("()LsimulaTestPrograms/adHoc03_A;")))
				.areturn()
				.labelBinding(endScope);
	}



	// ***********************************************************************************************
	// *** Printing Utility: print
	// ***********************************************************************************************
	@Override
	public void print(final int indent) {
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
		System.out.println(edTreeIndent(indent)+"CLASS "+identifier);
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
		printStatementList(indent+1);
	}

	@Override
	public String toString() {
		return ("" + identifier + '[' + externalIdent + "] DeclarationKind=" + declarationKind);
	}

	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************

	public void writeAttr(ObjectOutput oupt) throws IOException {
//		this.print(10);
		oupt.writeBoolean(true); // Mark: This is a ClassDeclaration
		oupt.writeObject(identifier);
		oupt.writeObject(externalIdent);
//		Type.outType(type,oupt);
		Type.outType(type,oupt);
		oupt.writeInt(rtBlockLevel);
		oupt.writeObject(prefix);
		oupt.writeBoolean(hasLocalClasses);
		oupt.writeBoolean(detachUsed);
		oupt.writeObject(externalPrefixIdent);

		oupt.writeObject(parameterList);
		oupt.writeObject(virtualSpecList);
		oupt.writeObject(hiddenList);
		oupt.writeObject(protectedList);
		oupt.writeObject(labelList);
		
//		oupt.writeObject(declarationList);
		oupt.writeObject(prep(declarationList));

//		System.out.println("ClassDeclaration.writeExternal: Class " + this.identifier+ ": STATEMENTS BEFORE INNER: "+statements1);
//		System.out.println("ClassDeclaration.writeExternal: Class " + this.identifier+ ": STATEMENTS AFTER INNER: "+statements);
		oupt.writeObject(statements1);
		oupt.writeObject(statements);

		Util.TRACE_OUTPUT("END Write ClassDeclaration: " + identifier);
	}
	
	private DeclarationList prep(DeclarationList declarationList) {
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

	@SuppressWarnings("unchecked")
	public static ClassDeclaration readAttr(ObjectInput inpt) throws IOException, ClassNotFoundException {
		String identifier = (String) inpt.readObject();
		ClassDeclaration cls = new ClassDeclaration(identifier);
		Util.TRACE_INPUT("BEGIN Read ClassDeclaration: " + identifier + ", Declared in: " + cls.declaredIn);
		cls.declarationKind = Declaration.Kind.Class;
		cls.externalIdent = (String) inpt.readObject();
		cls.type = Type.inType(inpt);
		cls.rtBlockLevel = inpt.readInt();
		cls.prefix = (String) inpt.readObject();
		cls.hasLocalClasses = inpt.readBoolean();
		cls.detachUsed = inpt.readBoolean();
		cls.externalPrefixIdent = (String) inpt.readObject();

		cls.parameterList = (Vector<Parameter>) inpt.readObject();
		cls.virtualSpecList = (Vector<VirtualSpecification>) inpt.readObject();
		cls.hiddenList = (Vector<HiddenSpecification>) inpt.readObject();
		cls.protectedList = (Vector<ProtectedSpecification>) inpt.readObject();
		cls.labelList = (Vector<LabelDeclaration>) inpt.readObject();
		cls.declarationList = (DeclarationList) inpt.readObject();
//		Util.IERR("");

		cls.statements1 = (Vector<Statement>) inpt.readObject();
		cls.statements = (Vector<Statement>) inpt.readObject();			

//		System.out.println("ClassDeclaration.readAttr: END Read ClassDeclaration: " + identifier + ", Declared in: " + cls.declaredIn);
//		cls.print(2);
//		Util.IERR("");
		
		Util.TRACE_INPUT("END Read ClassDeclaration: " + identifier + ", Declared in: " + cls.declaredIn);
		Global.setScope(cls.declaredIn);
		return(cls);
	}

	// ***********************************************************************************************
	// *** Externalization
	// ***********************************************************************************************
	/**
	 * Default constructor used by Externalization.
	 */
	public ClassDeclaration() {
		super(null);
	}

	@Override
	public void writeExternal(ObjectOutput oupt) throws IOException {
		Util.TRACE_OUTPUT("BEGIN Write ClassDeclaration: " + identifier);
		if(Option.NEW_ATTR_FILE && this instanceof StandardClass) Util.IERR(""+this+"  Declared in "+this.declaredIn);
		oupt.writeObject(identifier);
		oupt.writeObject(externalIdent);
		Type.outType(type,oupt);
		oupt.writeInt(rtBlockLevel);
		oupt.writeObject(prefix);
		oupt.writeBoolean(hasLocalClasses);
		oupt.writeBoolean(detachUsed);

		oupt.writeObject(parameterList);
		oupt.writeObject(virtualSpecList);
		oupt.writeObject(hiddenList);
		oupt.writeObject(protectedList);
		oupt.writeObject(labelList);
		oupt.writeObject(declarationList);
//		oupt.writeObject(virtualMatchList);
//		oupt.writeObject(code1);
//		oupt.writeObject(code2);
		oupt.writeObject(externalPrefixIdent);

//		System.out.println("ClassDeclaration.writeExternal: Class " + this.identifier+ ": STATEMENTS BEFORE INNER: "+statements1);
//		System.out.println("ClassDeclaration.writeExternal: Class " + this.identifier+ ": STATEMENTS AFTER INNER: "+statements);
		oupt.writeObject(statements1);
		oupt.writeObject(statements);

		Util.TRACE_OUTPUT("END Write ClassDeclaration: " + identifier);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void readExternal(ObjectInput inpt) throws IOException, ClassNotFoundException {
		declarationKind = Declaration.Kind.Class;
		identifier = (String) inpt.readObject();
		Util.TRACE_INPUT("BEGIN Read ClassDeclaration: " + identifier + ", Declared in: " + this.declaredIn);
		externalIdent = (String) inpt.readObject();
		type = Type.inType(inpt);
		rtBlockLevel = inpt.readInt();
		prefix = (String) inpt.readObject();
		hasLocalClasses = inpt.readBoolean();
		detachUsed = inpt.readBoolean();

		parameterList = (Vector<Parameter>) inpt.readObject();
		virtualSpecList = (Vector<VirtualSpecification>) inpt.readObject();
		hiddenList = (Vector<HiddenSpecification>) inpt.readObject();
		protectedList = (Vector<ProtectedSpecification>) inpt.readObject();
		labelList = (Vector<LabelDeclaration>) inpt.readObject();
		declarationList = (DeclarationList) inpt.readObject();
//		virtualMatchList=(Vector<VirtualMatch>) inpt.readObject();
//		code1 = (Vector<CodeLine>) inpt.readObject();
//		code2 = (Vector<CodeLine>) inpt.readObject();
		externalPrefixIdent = (String) inpt.readObject();

		statements1 = (Vector<Statement>) inpt.readObject();
		statements = (Vector<Statement>) inpt.readObject();			
//		System.out.println("ClassDeclaration.readExternal: Class " + this.identifier+ ": STATEMENTS BEFORE INNER: "+statements1);
//		System.out.println("ClassDeclaration.readExternal: Class " + this.identifier+ ": STATEMENTS AFTER INNER: "+statements);

		Util.TRACE_INPUT("END Read ClassDeclaration: " + identifier + ", Declared in: " + this.declaredIn);
		Global.setScope(this.declaredIn);
	}

}
