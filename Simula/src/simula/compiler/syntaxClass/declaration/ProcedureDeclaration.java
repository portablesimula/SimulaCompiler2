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
import java.lang.classfile.CodeBuilder.BlockCodeBuilder;
import java.lang.classfile.Label;
import java.lang.classfile.MethodBuilder;
import java.lang.classfile.MethodSignature;
import java.lang.classfile.attribute.SignatureAttribute;
import java.lang.classfile.attribute.SourceFileAttribute;
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import java.lang.classfile.constantpool.FieldRefEntry;
import java.lang.classfile.instruction.SwitchCase;
import java.lang.constant.ClassDesc;
import java.lang.constant.ConstantDescs;
import java.lang.constant.MethodTypeDesc;
import java.util.List;
import java.util.Vector;

import simula.compiler.AttrInput;
import simula.compiler.AttrOutput;
import simula.compiler.GeneratedJavaClass;
import simula.compiler.parsing.Parse;
import simula.compiler.syntaxClass.HiddenSpecification;
import simula.compiler.syntaxClass.ProtectedSpecification;
import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.expression.Constant;
import simula.compiler.syntaxClass.statement.DummyStatement;
import simula.compiler.syntaxClass.statement.Statement;
import simula.compiler.utilities.CD;
import simula.compiler.utilities.DeclarationList;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.KeyWord;
import simula.compiler.utilities.Meaning;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * Procedure Declaration.
 * <pre>
 * Simula Standard: 5.4 Procedure declaration
 * 
 *      procedure-declaration
 *          = [ type ] PROCEDURE procedure-heading ; procedure-body
 *      
 *            procedure-heading
 *                = procedure-identifier [ formal-parameter-part ; [ mode-part ] specification-part ] 
 *                
 *               procedure-identifier = identifier
 *                
 *               formal-parameter-part = "(" formal-parameter { , formal-parameter } ")"
 *            
 *                  formal-parameter = identifier
 *            
 *               specification-part = specifier identifier-list { ; specifier identifier-list }
 *            
 *                  specifier
 *                      = type [ ARRAY | PROCEDURE ]
 *                      | LABEL
 *                      | SWITCH 
 *                
 *               mode-part
 *                   = name-part [ value-part ]
 *                   | value-part [ name-part ]
 *            
 *                  name-part = NAME identifier-list ;
 *            
 *                  value-part = VALUE identifier-list ;
 *            
 *               identifier-list = identifier { , identifier }
 *                
 *            procedure-body = statement
 * </pre>
 * This class is prefix to StandardProcedure and SwitchDeclaration.
 * <p>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/declaration/ProcedureDeclaration.java">
 * <b>Source File</b></a>.
 * 
 * @author SIMULA Standards Group
 * @author Øystein Myhre Andersen
 */
public class ProcedureDeclaration extends BlockDeclaration {

	/**
	 * Result in case of Type Procedure 
	 */
	SimpleVariableDeclaration result;

	/**
	 * Parameter list.
	 */
	public Vector<Parameter> parameterList = new Vector<Parameter>();
	
	/**
	 * Virtual Match indicator. 
	 * <p>
	 * If myVirtual != null, this Procedure is a Virtual Match.
	 * <p>
	 * Set during doChecking.
	 */
	public VirtualMatch myVirtual; // Set during doChecking

	// ***********************************************************************************************
	// *** CONSTRUCTORS
	// ***********************************************************************************************
	/**
	 * Create a new ProcedureDeclaration.
	 * @param identifier procedure identifier
	 * @param declarationKind procedure or switch
	 */
	protected ProcedureDeclaration(final String identifier,final int declarationKind) {
		super(identifier);
		this.declarationKind = declarationKind;
	}

	// ***********************************************************************************************
	// *** Parsing: expectProcedureDeclaration
	// ***********************************************************************************************
	/**
	 * Parse and build a ProcedureDeclaration.
	 * 
	 * <pre>
	 * Syntax:
	 * 
	 *      procedure-declaration
	 *          = [ type ] PROCEDURE procedure-heading ; procedure-body
	 *      
	 *            procedure-heading
	 *                = procedure-identifier [ formal-parameter-part ; [ mode-part ] specification-part ] 
	 *                
	 *            procedure-identifier = identifier
	 * </pre>
	 * 
	 * Precondition: [ type ] PROCEDURE is already read.
	 * 
	 * @param type procedure's type
	 * @return a newly created ProcedureDeclaration
	 */
	public static ProcedureDeclaration expectProcedureDeclaration(final Type type) {
		ProcedureDeclaration proc = new ProcedureDeclaration(null, ObjectKind.Procedure);
		proc.lineNumber=Parse.prevToken.lineNumber;
		proc.type = type;
		if (Option.TRACE_PARSE)	Parse.TRACE("Parse ProcedureDeclaration, type=" + type);
		proc.modifyIdentifier(Parse.expectIdentifier());
		if (Parse.accept(KeyWord.BEGPAR)) {
			expectFormalParameterPart(proc.parameterList);
			Parse.expect(KeyWord.SEMICOLON);
			while(acceptModePart(proc.parameterList));
			expectSpecificationPart(proc);
		} else Parse.expect(KeyWord.SEMICOLON);
		expectProcedureBody(proc);

		proc.lastLineNumber = Global.sourceLineNumber;
		if (Option.TRACE_PARSE)	Util.TRACE("Line "+proc.lineNumber+": ProcedureDeclaration: "+proc);
		Global.setScope(proc.declaredIn);
		return (proc);
	}
	
	/**
	 * Parse Utility: Accept mode-part and set matching parameter's mode.
	 * <pre>
	 *   mode-part
	 *      = name-part [ value-part ]
	 *      | value-part [ name-part ]
	 *            
	 *   name-part = NAME identifier-list ;
	 *            
	 *   value-part = VALUE identifier-list ;
	 *            
	 *   identifier-list = identifier { , identifier }
	 * </pre>
	 * @param pList the parameter list
	 */
	private static boolean acceptModePart(Vector<Parameter> pList) {
		if (Parse.accept(KeyWord.VALUE, KeyWord.NAME)) {
			int mode = (Parse.prevToken.getKeyWord() == KeyWord.VALUE)
					? Parameter.Mode.value
					: Parameter.Mode.name;
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
				parameter.setMode(mode);
			} while (Parse.accept(KeyWord.COMMA));
			Parse.expect(KeyWord.SEMICOLON);
			return(true);
		}
		return(false);
	}
	
	/**
	 * Parse Utility: Accept Procedure Parameter specification-part updating Parameter's type and kind.
	 * <pre>
	 * Syntax:
	 * 
	 *     specification-part
     *           = specifier identifier-list { ; specifier identifier-list }
	 *     
	 *        specifier = Type | [Type] ARRAY | [Type] PROCEDURE ] | LABEL | SWITCH
	 * </pre>
	 * @param proc the procedure declaration
	 */
	private static void expectSpecificationPart(ProcedureDeclaration proc) {
		if (Option.TRACE_PARSE)	Parse.TRACE("Parse ParameterSpecifications");
		LOOP: while(true) {
			Type type;
			int kind = Parameter.Kind.Simple;
			if (Parse.accept(KeyWord.SWITCH)) {
				type = Type.Label;
				kind = Parameter.Kind.Procedure;
			} else if (Parse.accept(KeyWord.LABEL))
				type = Type.Label;
			else {
				type = Parse.acceptType();
				//if (type == null) return (false);
				if (Parse.accept(KeyWord.ARRAY)) {
					if (type == null) {
						// See Simula Standard 5.2 -
						// If no type is given the type real is understood.
						type=Type.Real;
					}
					kind = Parameter.Kind.Array;
				}
				else if (Parse.accept(KeyWord.PROCEDURE)) kind = Parameter.Kind.Procedure;
				else if(type == null) break LOOP;
			}
			do {
				String identifier = Parse.expectIdentifier();
				Parameter parameter = null;
				for (Parameter par : proc.parameterList)
					if (Util.equals(identifier,par.identifier)) { parameter = par; break; }
				if (parameter == null) {
					Util.error("Identifier " + identifier + " is not defined in this scope");
					parameter = new Parameter(identifier);
				}
				parameter.setTypeAndKind(type, kind);
			} while (Parse.accept(KeyWord.COMMA));
			Parse.expect(KeyWord.SEMICOLON);
			continue LOOP;
		}
		for (Parameter par : proc.parameterList) {
			if (par.kind != 0)
				switch (par.kind) {
				case Parameter.Kind.Array:
				case Parameter.Kind.Label:
				case Parameter.Kind.Procedure:
					break; // OK
				case Parameter.Kind.Simple:
				default:
					if (par.type == null)
						Util.error("Missing specification of parameter: " + par.identifier);
				}
		}
	}

	/**
	 * Parse Utility: Expect procedure-body.
	 * In case of a compound-statement, updating the procedure's declaration and statement lists.
	 * <pre>
	 * Syntax:
	 *                
	 *        procedure-body = statement
	 * </pre>
	 * 
	 * @param proc the procedure
	 */
	private static void expectProcedureBody(ProcedureDeclaration proc) {
		if (Parse.accept(KeyWord.BEGIN)) {
//			expectStatementBodyBlock(proc);
			// BEGIN declaration { ; declaration } statement { ; statement } END
			Statement stm;
			if (Option.TRACE_PARSE)	Parse.TRACE("Parse Procedure Block");
			while (Declaration.acceptDeclaration(proc)) {
				Parse.accept(KeyWord.SEMICOLON);
			}
			Vector<Statement> stmList = proc.statements;
			while (!Parse.accept(KeyWord.END)) {
				stm = Statement.expectStatement();
				if (stm != null) stmList.add(stm);
			}
		}
		else proc.statements.add(Statement.expectStatement());
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
		if (declarationKind == ObjectKind.ContextFreeMethod) externalIdent = this.identifier;
		if (declarationKind == ObjectKind.MemberMethod) externalIdent = this.identifier;
		else if (externalIdent == null)	externalIdent = edJavaClassName();

		currentRTBlockLevel++;
		rtBlockLevel = currentRTBlockLevel;
		Global.enterScope(this);
			if(type != null) {
//				type.doChecking(declaredIn); // TODO: TESTING
				this.result = new SimpleVariableDeclaration(type, "_RESULT");
				declarationList.add(result);
			}
			int prfx = 0;// prefixLevel();
			if (declarationKind == ObjectKind.Procedure)
				for (Parameter par : this.parameterList) par.setExternalIdentifier(prfx);
			for (Declaration par : this.parameterList) par.doChecking();
			for (Declaration dcl : declarationList)	dcl.doChecking();
			for (Statement stm : statements) stm.doChecking();
			doCheckLabelList(null);
			VirtualSpecification virtualSpec = VirtualSpecification.getVirtualSpecification(this);
			if (virtualSpec != null) {
				// This Procedure is a Virtual Match
				myVirtual = new VirtualMatch(virtualSpec, this);
				ClassDeclaration decl = (ClassDeclaration) declaredIn;
				decl.virtualMatchList.add(myVirtual);
				if (decl == virtualSpec.declaredIn) virtualSpec.hasDefaultMatch = true;
			}
		Global.exitScope();
		currentRTBlockLevel--;
		SET_SEMANTICS_CHECKED();
	}

	// ***********************************************************************************************
	// *** Utility: findVisibleAttributeMeaning
	// ***********************************************************************************************
	@Override
	public Meaning findVisibleAttributeMeaning(final String ident) {
		if(Option.TRACE_FIND_MEANING>0) Util.println("BEGIN Checking Procedure for "+ident+" ================================== "+identifier+" ==================================");
		for (Declaration declaration : declarationList) {
			if(Option.TRACE_FIND_MEANING>1) Util.println("Checking Local "+declaration);
			if (Util.equals(ident, declaration.identifier))
				return (new Meaning(declaration, this, this, false));
		}
		for (Parameter parameter : parameterList) {
			if(Option.TRACE_FIND_MEANING>1) Util.println("Checking Parameter "+parameter);
			if (Util.equals(ident, parameter.identifier))
				return (new Meaning(parameter, this, this, false));
		}
		for (LabelDeclaration label : labelList) {
			if(Option.TRACE_FIND_MEANING>1) Util.println("Checking Label "+label);
			if (Util.equals(ident, label.identifier))
				return (new Meaning(label, this, this, false));
		}
		if(Option.TRACE_FIND_MEANING>0) Util.println("ENDOF Checking Procedure for "+ident+" ================================== "+identifier+" ==================================");
		return (null);
	}

	// ***********************************************************************************************
	// *** Coding: doJavaCoding
	// ***********************************************************************************************
	@Override
	public void doJavaCoding() {
		ASSERT_SEMANTICS_CHECKED();
		if (this.isPreCompiled)	return;
		switch (declarationKind) {
		case ObjectKind.ContextFreeMethod -> doMethodJavaCoding("static ", false);
		case ObjectKind.MemberMethod -> doMethodJavaCoding("", true);
		case ObjectKind.Procedure -> doProcedureCoding();
		default -> Util.IERR("Impossible Situation !");
		}
	}

	// ***********************************************************************************************
	// *** Coding: METHOD -- Generate Inline Method code for Procedure.
	// ***********************************************************************************************
	/**
	 * Generate Inline Method code for Procedure.
	 * @param modifier mthod modifier: "static " or ""
	 * @param addStaticLink add static link as 0'th parameter
	 */
	private void doMethodJavaCoding(final String modifier,final boolean addStaticLink) {

		Util.IERR("DEAD CODE ? NOT BELEAVED TO BE IN USE");
		
		Global.sourceLineNumber = lineNumber;
		ASSERT_SEMANTICS_CHECKED();
		Global.enterScope(this);
		String line = "public " + modifier + ((type == null) ? "void" : type.toJavaType());
		line = line + ' ' + getJavaIdentifier() + ' ' + edFormalParameterList(true, addStaticLink);
		GeneratedJavaClass.code(line);
		if (type != null) {
			GeneratedJavaClass.debug("// Declare return value as variable");
			GeneratedJavaClass.code(type.toJavaType() + ' ' + "_RESULT" + '=' + type.edDefaultValue() + ';');
		}
		for (Declaration decl : labelList) decl.doJavaCoding();
		for (Declaration decl : declarationList) decl.doJavaCoding();
		for (Statement stm : statements) stm.doJavaCoding();
		if (type != null) GeneratedJavaClass.code("return(_RESULT);");
		GeneratedJavaClass.code("}");
		Global.exitScope();
	}

	// ***********************************************************************************************
	// *** Coding Utility: edFormalParameterList
	// ***********************************************************************************************
	/**
	 * Edit the formal parameter list
	 * @param isInlineMethod true if generating an inline method, otherwise false
	 * @param addStaticLink add static link as 0'th parameter
	 * @return the resulting Java code
	 */
	private String edFormalParameterList(final boolean isInlineMethod,final boolean addStaticLink) {
		// Accumulates through prefix-chain when class
		StringBuilder s = new StringBuilder();
		s.append('(');
		boolean withparams = false;
		if (addStaticLink) {
			s.append("RTS_RTObject _SL");
			withparams = true;
		}
		for (Declaration par : this.parameterList) {
			if (withparams)	s.append(',');
			withparams = true;
			s.append(((Parameter) par).toJavaType()).append(' ');
			if (isInlineMethod)
				 s.append(par.identifier);
			else s.append('s').append(par.externalIdent); // s to indicate Specified Parameter
		}
		s.append(") {");
		return (s.toString());
	}

	// ***********************************************************************************************
	// *** Coding: PROCEDURE
	// ***********************************************************************************************
	/**
	 * Generate java source code for this Procedure.
	 */
	private void doProcedureCoding() {
		Global.sourceLineNumber = lineNumber;
		ASSERT_SEMANTICS_CHECKED();
		if (this.isPreCompiled)	return;
		GeneratedJavaClass javaModule = new GeneratedJavaClass(this);
		Global.enterScope(this);
		GeneratedJavaClass.code("@SuppressWarnings(\"unchecked\")");
		GeneratedJavaClass.code("public final class " + getJavaIdentifier() + " extends RTS_PROCEDURE {");
		GeneratedJavaClass.debug("// ProcedureDeclaration: Kind=" + declarationKind + ", BlockLevel=" + rtBlockLevel
					+ ", firstLine=" + lineNumber + ", lastLine=" + lastLineNumber + ", hasLocalClasses="
					+ ((hasLocalClasses) ? "true" : "false") + ", System=" + ((isQPSystemBlock()) ? "true" : "false"));
		if (isQPSystemBlock())
			GeneratedJavaClass.code("public boolean isQPSystemBlock() { return(true); }");
		if (declarationKind == ObjectKind.Procedure && type != null) {
			GeneratedJavaClass.code("@Override");
			GeneratedJavaClass.code("public Object _RESULT() { return("+this.result.identifier+"); }");
		}
		GeneratedJavaClass.debug("// Declare parameters as attributes");
		boolean hasParameter = false;
		for (Parameter par : parameterList) {
			String tp = par.toJavaType();
			hasParameter = true;
			GeneratedJavaClass.code("public " + tp + ' ' + par.externalIdent + ';');
		}
		if (!labelList.isEmpty()) {
			GeneratedJavaClass.debug("// Declare local labels");
			for (Declaration decl : labelList) decl.doJavaCoding();
		}
		GeneratedJavaClass.debug("// Declare locals as attributes");
		for (Declaration decl : declarationList) decl.doJavaCoding();
		if (declarationKind == ObjectKind.Procedure && hasParameter) doCodePrepareFormal();
		doCodeConstructor();
		codeProcedureBody();
		javaModule.codeProgramInfo();
		GeneratedJavaClass.code("}", "End of Procedure");
		Global.exitScope();
		javaModule.closeJavaOutput();
	}

	// ***********************************************************************************************
	// *** Coding Utility: doCodeConstructor
	// ***********************************************************************************************
	/**
	 * Generate Java source code for the constructor.
	 */
	private void doCodeConstructor() {
		GeneratedJavaClass.debug("// Normal Constructor");
		GeneratedJavaClass.code("public " + getJavaIdentifier() + edFormalParameterList(false, true));
		GeneratedJavaClass.code("super(_SL);");
		GeneratedJavaClass.debug("// Parameter assignment to locals");
		for (Parameter par : parameterList)
			GeneratedJavaClass.code("this." + par.externalIdent + " = s" + par.externalIdent + ';');
		GeneratedJavaClass.code("BBLK();");
		GeneratedJavaClass.debug("// Declaration Code");
		for (Declaration decl : declarationList) decl.doDeclarationCoding();
		GeneratedJavaClass.code("_STM();");
		GeneratedJavaClass.code("}");
	}

	// ***********************************************************************************************
	// *** Coding Utility: doCodePrepareFormal
	// ***********************************************************************************************
	/**
	 * Generate Java source code prepared for 'call formal procedure'.
	 */
	private void doCodePrepareFormal() {
		GeneratedJavaClass.debug("// Parameter Transmission in case of Formal/Virtual Procedure Call");
		GeneratedJavaClass.code("@Override");
		GeneratedJavaClass.code("public " + getJavaIdentifier() + " setPar(Object param) {");
//		GeneratedJavaClass.debug("//Util.BREAK(\"CALL " + getJavaIdentifier()
//				+ ".setPar: param=\"+param+\", qual=\"+param.getClass().getSimpleName()+\", npar=\"+_nParLeft+\", staticLink=\"+_SL);");
		GeneratedJavaClass.code("try {");
		GeneratedJavaClass.code("switch(_nParLeft--) {");
		int nPar = 0;
		for (Parameter par : parameterList) {
			String tp = par.toJavaType();
			String typeValue;
			if (par.mode == Parameter.Mode.name) typeValue = ("(" + tp + ")param");
			else if (par.kind == Parameter.Kind.Array) {
				typeValue = ("arrayValue(param)");
				if (par.mode == Parameter.Mode.value) typeValue = typeValue + ".COPY()";
			} else if (par.kind == Parameter.Kind.Procedure) typeValue = ("procValue(param)");
			else if (par.kind != Parameter.Kind.Simple)	typeValue = ("(" + tp + ")param");
			else if (par.type.isArithmeticType()) typeValue = (tp + "Value(param)");
			else typeValue = ("(" + tp + ")objectValue(param)");
			GeneratedJavaClass.code("case " + ( parameterList.size() - (nPar++)) + ": " + par.externalIdent + "=" + typeValue + "; break;");
		}
		GeneratedJavaClass.code("default: throw new RTS_SimulaRuntimeError(\"Too many parameters\");");
		GeneratedJavaClass.code("}");
		GeneratedJavaClass.code("}");
		GeneratedJavaClass.code("catch(ClassCastException e) { throw new RTS_SimulaRuntimeError(\"Wrong type of parameter: \"+param,e);}");
		GeneratedJavaClass.code("return(this);");
		GeneratedJavaClass.code("}");
		GeneratedJavaClass.debug("// Constructor in case of Formal/Virtual Procedure Call");
		GeneratedJavaClass.code("public " + getJavaIdentifier() + "(RTS_RTObject _SL) {");
		GeneratedJavaClass.code("super(_SL,"+parameterList.size()+");","Expecting "+parameterList.size()+" parameters");
		GeneratedJavaClass.code("}");
	}

	// ***********************************************************************************************
	// *** Coding Utility: codeProcedureBody -- Redefined in SwitchDeclaration
	// ***********************************************************************************************
	/**
	 * Coding Utility: codeProcedureBody. Redefined in SwitchDeclaration.
	 */
	protected void codeProcedureBody() {
		boolean duringSTM_Coding=Global.duringSTM_Coding;
		Global.duringSTM_Coding=true;
		GeneratedJavaClass.debug("// Procedure Statements");
		GeneratedJavaClass.code("@Override");
		GeneratedJavaClass.code("public " + getJavaIdentifier() + " _STM() {");
		codeSTMBody();
		GeneratedJavaClass.code("EBLK();");
		GeneratedJavaClass.code("return(this);");
		GeneratedJavaClass.code("}", "End of Procedure BODY");
		Global.duringSTM_Coding=duringSTM_Coding;
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
						.withFlags(ClassFile.ACC_PUBLIC + ClassFile.ACC_FINAL + ClassFile.ACC_SUPER)
						.withSuperclass(CD.RTS_PROCEDURE);
					// Add Fields (Return, attributes and parameters)
					if(type != null) {
						classBuilder
							.withMethodBody("_RESULT", MethodTypeDesc.ofDescriptor("()Ljava/lang/Object;"), ClassFile.ACC_PUBLIC,
								codeBuilder -> buildMethod_RESULT(codeBuilder));
					}
					for (Parameter par:parameterList) par.buildField(classBuilder,this);
					for (LabelDeclaration lab : labelList) lab.buildField(classBuilder,this);
					for (Declaration decl : declarationList) decl.buildField(classBuilder,this);

					classBuilder
						.withMethod("<init>", MTD_Constructor(true), ClassFile.ACC_PUBLIC,
							codeBuilder -> buildConstructor(codeBuilder));
					
					if(parameterList.size() > 0) {
					classBuilder
						.withMethod("<init>", MTD_Constructor(false), ClassFile.ACC_PUBLIC,
							codeBuilder -> buildConstructor2(codeBuilder))
						.withMethod("setPar", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)Lsimula/runtime/RTS_PROCEDURE;"), ClassFile.ACC_PUBLIC,
							codeBuilder -> buildSetPar(codeBuilder));
					}
					
					classBuilder
						.withMethodBody("_STM", MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_RTObject;"), ClassFile.ACC_PUBLIC,
							codeBuilder -> buildMethod_STM(codeBuilder));
				}
		);
		return(bytes);
	}

	private MethodTypeDesc MTD_Constructor(boolean withParams) {
//		System.out.println("ProcedureDeclaration.MTD_Constructor: "+this);
		StringBuilder sb=new StringBuilder("(Lsimula/runtime/RTS_RTObject;");
		if(withParams) for(Parameter par:parameterList) {
//			System.out.println("ProcedureDeclaration.MTD_Constructor: "+par+" "+par.kind);
			sb.append(par.type_toClassDesc().descriptorString());
		}
		sb.append(")V");
//		System.out.println("ProcedureDeclaration.MTD_Constructor: "+sb);
		return(MethodTypeDesc.ofDescriptor(sb.toString()));
	}

	public FieldRefEntry getResultFieldRefEntry(ConstantPoolBuilder pool) {
		String className=Global.packetName+"."+this.getJavaIdentifier();
		return(pool.fieldRefEntry(ClassDesc.of(className), "_RESULT", type.toClassDesc()));
	}
	
	// ***********************************************************************************************
	// *** ByteCoding: edConstructorSignature
	// ***********************************************************************************************
	@Override
	public String edConstructorSignature() {
		// MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_RTObject;I)V");
		StringBuilder sb=new StringBuilder("(Lsimula/runtime/RTS_RTObject;");
		for(Parameter par:parameterList) {
			if(par.mode==Parameter.Mode.name) sb.append("Lsimula/runtime/RTS_NAME;");
			else switch(par.kind) {
				case Parameter.Kind.Array:			  sb.append("Lsimula/runtime/RTS_ARRAY;"); break;
				case Parameter.Kind.Label:           sb.append("Lsimula/runtime/RTS_LABEL;"); break;
				case Parameter.Kind.Procedure:       sb.append("Lsimula/runtime/RTS_PRCQNT;");  break;
				case Parameter.Kind.Simple: default: sb.append(par.type.toJVMType(par.kind, par.mode));
			}
		}
		sb.append(")V");
		return(sb.toString());
	}

	
	// ***********************************************************************************************
	// *** ByteCoding: buildConstructor
	// ***********************************************************************************************
	private void buildConstructor(MethodBuilder methodBuilder) {
		methodBuilder
			.withFlags(ClassFile.ACC_PUBLIC)
			.with(SignatureAttribute.of(MethodSignature.parseFrom(edConstructorSignature())))
			.withCode(codeBuilder -> buildConstructorCode(codeBuilder));		
	}
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
	 */
	private void buildConstructorCode(CodeBuilder codeBuilder) {
		ASSERT_SEMANTICS_CHECKED();
		Global.enterScope(this);
			ConstantPoolBuilder pool=codeBuilder.constantPool();
			Label begScope = codeBuilder.newLabel();
			Label endScope = codeBuilder.newLabel();
			codeBuilder
				.labelBinding(begScope)
				.localVariable(0,"this",currentClassDesc(),begScope,endScope)
				.localVariable(1,"staticLink",CD.RTS_RTObject,begScope,endScope);

			// Declare local parameters
			for(Parameter par:parameterList) {
				ClassDesc TD=par.type_toClassDesc();
				codeBuilder.localVariable(1,par.getJavaIdentifier(),TD,begScope,endScope);
			}

			// super(staticLink);
			codeBuilder
				.aload(0)
				.aload(1)
				.invokespecial(pool.methodRefEntry(CD.RTS_PROCEDURE
						,"<init>", MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_RTObject;)V")));

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
			int parOfst=2;
			for(Parameter par:parameterList) {
				codeBuilder.aload(0);
				par.loadParameter(codeBuilder, parOfst++);
				if(par.type!=null && par.type.equals(Type.LongReal) && (par.mode != Parameter.Mode.name)) parOfst++;
				codeBuilder.putfield(par.getFieldRefEntry(pool));
			}

			// BBLK();
			codeBuilder
				.aload(0)
				.invokevirtual(pool.methodRefEntry(currentClassDesc(),"BBLK", MethodTypeDesc.ofDescriptor("()V")));

			// Add Declaration Code to Constructor
			for (Declaration decl : declarationList) {
				decl.buildDeclarationCode(codeBuilder);
			}

			// _STM();
			codeBuilder
				.aload(0)
				.invokevirtual(pool.methodRefEntry(currentClassDesc(),"_STM", MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_RTObject;")))
				.pop();

			codeBuilder
				.return_()
				.labelBinding(endScope);
		Global.exitScope();
	}
	
	// ***********************************************************************************************
	// *** ByteCoding: buildConstructor
	// ***********************************************************************************************
	private void buildConstructor2(MethodBuilder methodBuilder) {
		methodBuilder
			.withFlags(ClassFile.ACC_PUBLIC)
			.with(SignatureAttribute.of(MethodSignature.parseFrom("(Lsimula/runtime/RTS_RTObject;)V")))
			.withCode(codeBuilder -> buildConstructorCode2(codeBuilder));		
	}
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
	 *
	 *    // Constructor in case of Formal/Virtual Procedure Call
	 *    public adHoc000_PPP(RTS_RTObject _SL) {
	 *        super(_SL,n); // Expecting n parameters
	 *    }
	 * </pre>
	 * @param codeBuilder the CodeBuilder
	 */
	private void buildConstructorCode2(CodeBuilder codeBuilder) {
		ASSERT_SEMANTICS_CHECKED();
		Global.enterScope(this);
			ConstantPoolBuilder pool=codeBuilder.constantPool();
			Label begScope = codeBuilder.newLabel();
			Label endScope = codeBuilder.newLabel();
			codeBuilder
				.labelBinding(begScope)
				.localVariable(0,"this",currentClassDesc(),begScope,endScope)
				.localVariable(1,"staticLink",CD.RTS_RTObject,begScope,endScope);

			// super(staticLink);
			codeBuilder
				.aload(0)
				.aload(1);
				
			Constant.buildIntConst(codeBuilder,parameterList.size());
			
			codeBuilder
				.invokespecial(pool.methodRefEntry(CD.RTS_PROCEDURE
						,"<init>", MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_RTObject;I)V")));

			codeBuilder
				.return_()
				.labelBinding(endScope);
		Global.exitScope();
	}
	
	// ***********************************************************************************************
	// *** ByteCoding: buildSetPar
	// ***********************************************************************************************
	private void buildSetPar(MethodBuilder methodBuilder) {
		methodBuilder
			.withFlags(ClassFile.ACC_PUBLIC)
			.with(SignatureAttribute.of(MethodSignature.parseFrom("(Lsimula/runtime/RTS_RTObject;)V")))
			.withCode(codeBuilder -> buildSetParCode(codeBuilder));		
	}
	/**
	 * Generate byteCode for the Constructor.
	 * <pre>
	 *     public adHoc000_R setPar(Object param) {
	 *        try {
	 *           switch(_nParLeft--) {
	 *              case 1: p_SFD=procValue(param); break;
	 *              case 2: ... ...
	 *              default: throw new RTS_SimulaRuntimeError("Too many parameters");
	 *           }
	 *        } catch(ClassCastException e) {
	 *            throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);
	 *        }
	 *        return(this);
	 *     }
	 * </pre>
	 * @param codeBuilder the CodeBuilder
	 */
	private void buildSetParCode(CodeBuilder codeBuilder) {
		ASSERT_SEMANTICS_CHECKED();
		Global.enterScope(this);
			Label begScope = codeBuilder.newLabel();
			Label endScope = codeBuilder.newLabel();
			codeBuilder
				.labelBinding(begScope)
				.localVariable(0,"this",currentClassDesc(),begScope,endScope);

			codeBuilder.trying(
					blockCodeBuilder -> {
						build_SWITCH(blockCodeBuilder);
					},
					catchBuilder -> catchBuilder.catching(ClassDesc.of("java.lang.ClassCastException"),
							blockCodeBuilder -> buildCatchBlock(blockCodeBuilder)));

			codeBuilder
				.aload(0)
				.areturn()
				.labelBinding(endScope);
		Global.exitScope();
	}
	
	private void buildCatchBlock(BlockCodeBuilder codeBuilder) {
		// throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);
		codeBuilder.astore(2);
		Util.buildSimulaRuntimeError("Wrong type of parameter: ", codeBuilder);
	}
	
	private void build_SWITCH(BlockCodeBuilder codeBuilder) {
		//  switch(_nParLeft--) {
		//     case 1: p_SFD=procValue(param); break;
		//     case 2: ... ...
		//     default: throw new RTS_SimulaRuntimeError("Too many parameters");
		//  }
		int tableSize = parameterList.size();
		List<SwitchCase> tableSwitchCases = new Vector<SwitchCase>();
		for (int i = 1; i <= tableSize; i++) {
			tableSwitchCases.add(SwitchCase.of(i, codeBuilder.newLabel()));
		}
		Label defaultTarget = codeBuilder.newLabel(); // beginning of the default handler block.
		Label breakLabel = codeBuilder.newLabel(); // beginning of the default handler block.
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		
		FieldRefEntry FRE_nParLeft=pool.fieldRefEntry(BlockDeclaration.currentClassDesc(),"_nParLeft",ConstantDescs.CD_int);
		codeBuilder
			.aload(0)
			.dup()
			.getfield(FRE_nParLeft)
			.dup_x1()
			.iconst_1()
			.isub()
			.putfield(FRE_nParLeft)
			
			.lookupSwitchInstruction(defaultTarget, tableSwitchCases);
		
		codeBuilder.labelBinding(defaultTarget);
		Util.buildSimulaRuntimeError("Too many parameters", codeBuilder);
		
		for(int i=0;i<tableSize;i++) {
			Label lab = tableSwitchCases.get(i).target();
			codeBuilder
				.labelBinding(lab)
				.aload(0);
			Parameter par = parameterList.get(tableSize-i-1);
			if (par.mode == Parameter.Mode.name) {
				codeBuilder
					.aload(1) // param
					.checkcast(CD.RTS_NAME)
					.putfield(par.getFieldRefEntry(pool))
					.goto_(breakLabel);
			}
			else if (par.kind == Parameter.Kind.Array) {
				codeBuilder
					.aload(0)
					.aload(1) // param
					.invokevirtual(pool.methodRefEntry(currentClassDesc(),
							"arrayValue", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)Lsimula/runtime/RTS_ARRAY;")));
				if(par.mode == Parameter.Mode.value) {
					codeBuilder.invokevirtual(CD.RTS_ARRAY, "COPY", MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_ARRAY;"));
				}
				codeBuilder
					.putfield(par.getFieldRefEntry(pool))
					.goto_(breakLabel);
			} else if (par.kind == Parameter.Kind.Procedure) {
				codeBuilder
					.aload(0)
					.aload(1) // param
					.invokevirtual(pool.methodRefEntry(currentClassDesc(),
							"procValue", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)Lsimula/runtime/RTS_PRCQNT;"))) // TODO: MÅ RETTES
					.putfield(par.getFieldRefEntry(pool))
					.goto_(breakLabel);
			}
			else if (par.kind != Parameter.Kind.Simple) {
//				typeValue = ("(" + tp + ")param");
				Util.IERR("");
			}
			else if (par.type.isArithmeticType()) {
				codeBuilder
					.aload(0)
					.aload(1); // param
				buildGetArithmeticValue(par.type,codeBuilder);
				codeBuilder
					.putfield(par.getFieldRefEntry(pool))
					.goto_(breakLabel);
			}
			else {
//				typeValue = ("(" + tp + ")objectValue(param)");
				codeBuilder
					.aload(0)
					.aload(1); // param
					buildCastObject(par,codeBuilder);
				codeBuilder
					.putfield(par.getFieldRefEntry(pool))
					.goto_(breakLabel);
			}
		}
		codeBuilder.labelBinding(breakLabel);
	}
	
	private void buildCastObject(Parameter par,CodeBuilder codeBuilder) {
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		if(par.type.equals(Type.Integer)) {
			codeBuilder.invokevirtual(pool.methodRefEntry(currentClassDesc(),"intValue", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)I")));
		}
		else if(par.type.equals(Type.Real)) {
			codeBuilder.invokevirtual(pool.methodRefEntry(currentClassDesc(),"floatValue", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)F")));
		}
		else if(par.type.equals(Type.LongReal)) {
			codeBuilder.invokevirtual(pool.methodRefEntry(currentClassDesc(),"doubleValue", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)D")));
		}
		else if(par.type.equals(Type.Boolean)) {
			codeBuilder.invokevirtual(pool.methodRefEntry(currentClassDesc(),"booleanValue", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)Z")));
		}
		else if(par.type.equals(Type.Character)) {
			codeBuilder.invokevirtual(pool.methodRefEntry(currentClassDesc(),"charValue", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)C")));
		}
		else {
			codeBuilder.invokevirtual(pool.methodRefEntry(currentClassDesc(),"objectValue", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)Ljava/lang/Object;")));
			codeBuilder.checkcast(par.type_toClassDesc());
		}
	}
	
	public void buildGetArithmeticValue(Type type,CodeBuilder codeBuilder) {
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		if(type.equals(Type.Integer)) 
			codeBuilder.invokevirtual(pool.methodRefEntry(currentClassDesc(),"intValue", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)I")));
		else if(type.equals(Type.Real)) 
			codeBuilder.invokevirtual(pool.methodRefEntry(currentClassDesc(),"floatValue", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)F")));
		else if(type.equals(Type.LongReal)) 
			codeBuilder.invokevirtual(pool.methodRefEntry(currentClassDesc(),"doubleValue", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)D")));
		else if(type.equals(Type.Boolean))
			codeBuilder.invokevirtual(pool.methodRefEntry(currentClassDesc(),"booleanValue", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)Z")));
		else if(type.equals(Type.Character))
			codeBuilder.invokevirtual(pool.methodRefEntry(currentClassDesc(),"charValue", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)C")));
		else Util.IERR("ProcedureDeclaration.buildGetArithmeticValue: FYLL PÅ TYPE: "+type);
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
//		Util.IERR("STOP: "+this.getClass().getSimpleName());
	}

	@Override
	public void buildInitAttribute(CodeBuilder codeBuilder) {
		Global.sourceLineNumber = lineNumber;
//		Util.IERR("Method buildInitAttribute need a redefinition in "+this.getClass().getSimpleName());
	}

	// ***********************************************************************************************
	// *** ByteCoding: buildMethod_STM_BODY
	// ***********************************************************************************************
	/**
	 * Generate byteCode for the '_STM' method.
	 *
	 * @param codeBuilder the CodeBuilder
	 */
	@Override
	protected void build_STM_BODY(CodeBuilder codeBuilder) {
		for (Statement stm : statements) {
			if(!(stm instanceof DummyStatement)) Util.buildLineNumber(codeBuilder,stm);
			stm.buildByteCode(codeBuilder);
		}
	}

	// ***********************************************************************************************
	// *** ByteCoding: buildMethod_STM_BODY
	// ***********************************************************************************************
	/**
	 * Generate byteCode for the '_RESULT' method.
	 *
	 * @param codeBuilder the CodeBuilder
	 */
	private void buildMethod_RESULT(CodeBuilder codeBuilder) {
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		ClassDesc DC_RESULT = type.toClassDesc(declaredIn);
		FieldRefEntry FDE=pool.fieldRefEntry(BlockDeclaration.currentClassDesc(),"_RESULT", DC_RESULT);
		codeBuilder
			.aload(0)
			.getfield(FDE);
    	type.buildObjectValueOf(codeBuilder);
		codeBuilder.areturn();
	}


	// ***********************************************************************************************
	// *** Printing Utility: print
	// ***********************************************************************************************
	@Override
	public void print(final int indent) {
    	String spc=edIndent(indent);
		StringBuilder s = new StringBuilder(spc);
		s.append('[').append(sourceBlockLevel).append(':').append(rtBlockLevel).append("] ");
		s.append(declarationKind).append(' ').append(identifier);
		s.append('[').append(externalIdent).append("] ");
		s.append(Parameter.editParameterList(parameterList));
		s.append("  isProtected=").append(isProtected);
		Util.println(s.toString());
		String beg = "begin[" + edScopeChain() + ']';
		Util.println(spc + beg);
		for (Declaration decl : declarationList) decl.print(indent + 1);
		for (Statement stm : statements) stm.print(indent + 1);
		Util.println(spc + "end[" + edScopeChain() + ']');
	}
	
	@Override
	public void printTree(final int indent) {
		String typeID=(type==null)?"":type.toString()+" ";
		System.out.println(edTreeIndent(indent)+typeID+"PROCEDURE "+identifier+"  BL="+this.rtBlockLevel);
		for(Parameter p:parameterList) p.printTree(indent+1);
		printDeclarationList(indent+1);
		printStatementList(indent+1);
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(identifier).append("[externalIdent=").append(externalIdent).append("] Kind=")
		.append(declarationKind).append(", QUAL=").append(this.getClass().getSimpleName()).append(", HashCode=").append(hashCode());
		if (isProtected != null) {
			s.append(", Protected by ").append(isProtected.identifier);
			s.append(" defined in ");
			s.append((isProtected.definedIn != null) ? isProtected.definedIn.identifier : "MISSING");
		}
		return (s.toString());
	}

	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************
	/**
	 * Default constructor used by Externalization.
	 */
	public ProcedureDeclaration() {	super(null); }

	@Override
	public void writeAttr(AttrOutput oupt) throws IOException {
		Util.TRACE_OUTPUT("BEGIN Write ProcedureDeclaration: "+identifier);
		oupt.writeKind(declarationKind); // Mark: This is a ProcedureDeclaration
		oupt.writeString(identifier);
		oupt.writeString(externalIdent);
//		oupt.writeType(type);
		oupt.writeType(type);
//		oupt.writeObject(declaredIn);  // MEDFØRER AT SEPARAT KOMPILERING GÅR I LOOP !!!
		oupt.writeKind(declarationKind);
		oupt.writeInt(rtBlockLevel);
		oupt.writeBoolean(hasLocalClasses);

		//oupt.writeObject(parameterList);
		oupt.writeInt(parameterList.size());
		for(Parameter par:parameterList) par.writeParameter(oupt);
		
		
//		oupt.writeObject(labelList);
//		oupt.writeObject(declarationList);
		Util.TRACE_OUTPUT("END Write ProcedureDeclaration: "+identifier);
	}
	
	private DeclarationList prep(DeclarationList declarationList) {
		DeclarationList res = new DeclarationList("");
		for(Declaration decl:declarationList) {
			if(decl instanceof ArrayDeclaration) res.add(decl);
			else if(decl instanceof ClassDeclaration) res.add(decl);
			else if(decl instanceof ExternalDeclaration) res.add(decl);
			else if(decl instanceof LabelDeclaration) res.add(decl);
			else if(decl instanceof ProcedureDeclaration) res.add(decl);
			else if(decl instanceof SimpleVariableDeclaration) res.add(decl);
			else if(decl instanceof SwitchDeclaration) res.add(decl);
		}
		return(res);
	}

	@SuppressWarnings("unchecked")
	public static ProcedureDeclaration readAttr(AttrInput inpt) throws IOException {
//		Util.TRACE_INPUT("BEGIN Read ProcedureDeclaration: " + identifier + ", Declared in: " + this.declaredIn);
		String identifier = inpt.readString();
		ProcedureDeclaration pro = new ProcedureDeclaration(identifier, ObjectKind.Procedure);

//		System.out.println("ProcedureDeclaration.readAttr: END Read ProcedureDeclaration: " + identifier + ", Declared in: " + pro.declaredIn);
//		pro.print(2);
//		Util.IERR("");

		pro.externalIdent = inpt.readString();
		pro.type=inpt.readType();
//		pro.declaredIn = (DeclarationScope) inpt.readObject();   // MEDFØRER AT SEPARAT KOMPILERING GÅR I LOOP !!!
		pro.declarationKind = inpt.readInt();
		pro.rtBlockLevel = inpt.readInt();
		pro.hasLocalClasses = inpt.readBoolean();
		
		//pro.parameterList=(Vector<Parameter>) inpt.readObject();
		int n = inpt.readInt();
		for(int i=0;i<n;i++)
			pro.parameterList.add(Parameter.readParameter(inpt));

//		pro.labelList=(Vector<LabelDeclaration>) inpt.readObject();
//		pro.declarationList=(DeclarationList) inpt.readObject();
		Util.TRACE_INPUT("END Read ProcedureDeclaration: "+identifier+", Declared in: "+pro.declaredIn);
		Global.setScope(pro.declaredIn);
		return(pro);
	}

//	// ***********************************************************************************************
//	// *** Externalization
//	// ***********************************************************************************************
//
//	@Override
//	public void writeExternal(ObjectOutput oupt) throws IOException {
//		Util.TRACE_OUTPUT("BEGIN Write ProcedureDeclaration: "+identifier);
//		if(Option.NEW_ATTR_FILE && this instanceof StandardProcedure) Util.IERR(""+this+"  Declared in "+this.declaredIn);
//		oupt.writeString(identifier);
//		oupt.writeString(externalIdent);
////		oupt.writeType(type);
//		oupt.writeType(type);
////		oupt.writeObject(declaredIn);  // MEDFØRER AT SEPARAT KOMPILERING GÅR I LOOP !!!
//		oupt.writeInt(declarationKind);
//		oupt.writeInt(rtBlockLevel);
//		oupt.writeBoolean(hasLocalClasses);
//
//		oupt.writeObject(parameterList);
//		oupt.writeObject(labelList);
////		oupt.writeObject(declarationList);
//		Util.TRACE_OUTPUT("END Write ProcedureDeclaration: "+identifier);
//	}
//
//	@Override
//	@SuppressWarnings("unchecked")
//	public void readExternal(ObjectInput inpt) throws IOException {
//		identifier = inpt.readString();
//		Util.TRACE_INPUT("BEGIN Read ProcedureDeclaration: "+identifier+", Declared in: "+this.declaredIn);
//		if(Option.NEW_ATTR_FILE && this instanceof StandardProcedure) Util.IERR("");
//		externalIdent = inpt.readString();
//		type=inpt.readType();
////		declaredIn = (DeclarationScope) inpt.readObject();   // MEDFØRER AT SEPARAT KOMPILERING GÅR I LOOP !!!
//		declarationKind = inpt.readInt();
//		rtBlockLevel=inpt.readInt();
//		hasLocalClasses=inpt.readBoolean();
//		
//		parameterList=(Vector<Parameter>) inpt.readObject();
//		labelList=(Vector<LabelDeclaration>) inpt.readObject();
////		declarationList=(DeclarationList) inpt.readObject();
//		Util.TRACE_INPUT("END Read ProcedureDeclaration: "+identifier+", Declared in: "+this.declaredIn);
//		
////		if(identifier.equals("outtext"))
////		System.out.println("END Read ProcedureDeclaration: "+identifier+", Declared in: "+this.declaredIn);
//		
//		Global.setScope(this.declaredIn);
//	}

}
