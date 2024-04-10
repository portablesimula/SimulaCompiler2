/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass.expression;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.classfile.CodeBuilder;
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import java.lang.classfile.constantpool.FieldRefEntry;
import java.lang.constant.ClassDesc;
import java.lang.constant.ConstantDescs;
import java.lang.constant.MethodTypeDesc;
import java.util.Iterator;
import java.util.Vector;

import simula.compiler.AttributeInputStream;
import simula.compiler.AttributeOutputStream;
import simula.compiler.parsing.Parse;
import simula.compiler.syntaxClass.OverLoad;
import simula.compiler.syntaxClass.SyntaxClass;
import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.declaration.ArrayDeclaration;
import simula.compiler.syntaxClass.declaration.BlockDeclaration;
import simula.compiler.syntaxClass.declaration.ClassDeclaration;
import simula.compiler.syntaxClass.declaration.ConnectionBlock;
import simula.compiler.syntaxClass.declaration.Declaration;
import simula.compiler.syntaxClass.declaration.DeclarationScope;
import simula.compiler.syntaxClass.declaration.LabelDeclaration;
import simula.compiler.syntaxClass.declaration.Parameter;
import simula.compiler.syntaxClass.declaration.ProcedureDeclaration;
import simula.compiler.syntaxClass.declaration.ProcedureSpecification;
import simula.compiler.syntaxClass.declaration.SimpleVariableDeclaration;
import simula.compiler.syntaxClass.declaration.StandardProcedure;
import simula.compiler.syntaxClass.declaration.VirtualSpecification;
import simula.compiler.utilities.CD;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.KeyWord;
import simula.compiler.utilities.Meaning;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * Variable.
 * 
 * <pre>
 * 
 * Simula Standard: 3.1 Variables
 * Simula Standard: 3.1.3. Array elements
 * Simula Standard: 3.1.4. Function designators
 * 
 * variable = simple-variable | subscripted-variable | simple-object-expression . variable
 * 
 *    simple-object-expression = NONE | variable | function-designator | object-generator
 *                             | local-object | qualified-object | ( object-expression )
 *                             
 *    simple-variable = identifier
 * 
 *    subscripted-variable = function-designator | array-element
 * 
 *       function-designator = procedure-identifier ( [ actual-parameter-part ] )
 *  
 *          actual-parameter-part = actual-parameter { , actual-parameter }
 *          
 *             actual-parameter = expression | array-identifier1 
 *                              | switch-identifier1 | procedure-identifier1
 *                              
 *                identifier1 = identifier | remote-identifier
 *                
 *                   remote-identifier = simple-object-expression . attribute-identifier
 *                                     | text-primary . attribute-identifier
 *
 *       array-element = array-identifier [ subscript-list ]
 *       
 *          subscript-list = arithmetic-expression { , arithmetic-expression }
 * 
 * </pre>
 * <b>Function designators:</b>
 * <p>
 * A function designator defines a value which results through the application
 * of a given set of rules defined by a procedure declaration (see 5.4) to a
 * fixed set of actual parameters. The rules governing specification of actual
 * parameters are given in 4.6.
 * 
 * Note: Not every procedure declaration defines rules for determining the value
 * of a function designator (cf. 5.4.1).
 * <p>
 * <b>Array elements:</b>
 * <p>
 * Subscripted variables designate values which are components of multi-
 * dimensional arrays. Each arithmetic expression of the subscript list occupies
 * one subscript position of the subscripted variable and is called a subscript.
 * The complete list of subscripts is enclosed by the subscript parentheses ( ).
 * The array component referred to by a subscripted variable is specified by
 * the actual value of its subscripts.
 * <p>
 * Each subscript position acts like a variable of type integer and the
 * evaluation of the subscript is understood to be equivalent to an assignment
 * to this fictitious variable. The value of the subscripted variable is defined
 * only if the actual integer value of each subscript expression is within the
 * associated subscript bounds of the array. A subscript expression value
 * outside its associated bounds causes a run time error.
 * <p>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/expression/Variable.java">
 * <b>Source File</b></a>.
 * 
 * @author SIMULA Standards Group
 * @author Øystein Myhre Andersen
 */
public final class VariableExpression extends Expression {

	/**
	 * The variable's identifier.
	 */
	public String identifier;

	/**
	 * The meaning of this variable.
	 */
	public Meaning meaning;

	/**
	 * Indicates that this variable is remotely accessed.
	 */
	private boolean remotelyAccessed;

	/**
	 * The parsed parameters.
	 */
	Vector<Expression> params;

	/**
	 * The checked parameters set by doChecking.
	 */
	public Vector<Expression> checkedParams; // Set by doChecking

	/**
	 * Create a new Variable.
	 * 
	 * @param identifier the variable's identifier
	 */
	public VariableExpression(final String identifier) {
		this.identifier = identifier;
		if (Option.TRACE_PARSE)
			Util.TRACE("NEW Variable: " + identifier);
	}

	/**
	 * Returns true if this variable has arguments.
	 * 
	 * @return true if this variable has arguments
	 */
	public boolean hasArguments() {
		return (params != null);
	}

	/**
	 * Returns a suitable java identifier for this variable.
	 * 
	 * @return a suitable java identifier
	 */
	public String getJavaIdentifier() {
		return (meaning.declaredAs.getJavaIdentifier());
	}

	/**
	 * This variable is remotely accessed through 'meaning'.
	 * 
	 * @param meaning before dot
	 */
	void setRemotelyAccessed(final Meaning meaning) {
		this.meaning = meaning;
		remotelyAccessed = true;
		this.doChecking();
		SET_SEMANTICS_CHECKED(); // Checked as remote attribute
	}

	/**
	 * Returns the meaning.
	 * <p>
	 * If meaning is not set by setRemotelyAccessed then meaning by identifier will
	 * be set.
	 * 
	 * @return the meaning
	 */
	public Meaning getMeaning() {
		if (meaning == null) {
			meaning = Global.getCurrentScope().findMeaning(identifier);
		}
		return (meaning);
	}

	/**
	 * Parse Utility: Expect Variable.
	 * <pre>
	 * Variable  =  Identifier  |  SubscriptedVariable
	 *	SubscriptedVariable  =  Identifier  "("  Expression  {  ,  Expression  }  ")"
	 * </pre>
	 * Precondition: Identifier  is already read.
	 * @param ident the variable identifier
	 * @return the created Variable
	 */
	public static VariableExpression expectVariable(final String ident) {
		if (Option.TRACE_PARSE)
			Util.TRACE("Parse Variable, current=" + Parse.currentToken + ", prev=" + Parse.prevToken);
		VariableExpression variable = new VariableExpression(ident);
		if (Parse.accept(KeyWord.BEGPAR)) {
			variable.params = new Vector<Expression>();
			do {
				Expression par = acceptExpression();
				if (par == null)
					Util.error("Missing procedure parameter");
				else
					variable.params.add(par);
			} while (Parse.accept(KeyWord.COMMA));
			Parse.expect(KeyWord.ENDPAR);
		}
		if (Option.TRACE_PARSE)
			Util.TRACE("NEW Variable: " + variable);
		return (variable);
	}

	@Override
	// Is redefined in Variable, RemoteVariable and TypeConversion
	public VariableExpression getWriteableVariable() {
		return (this);
	}

	@Override
	public void doChecking() {
//		System.out.println("VariableExpression.doChecking: "+this+"  "+IS_SEMANTICS_CHECKED());
		if (IS_SEMANTICS_CHECKED())
			return;
		Global.sourceLineNumber = lineNumber;
		Declaration declaredAs = getMeaning().declaredAs;
		if (declaredAs != null)
			this.type = declaredAs.type;

		if (type != null && this.type.getRefIdent() != null && meaning.declaredIn instanceof ConnectionBlock conn) {
			if (type != null)
				type = new Type(type, conn);
		}

		if (meaning.declaredAs instanceof StandardProcedure) {
			if (Util.equals(identifier, "detach")) {
				if (meaning.declaredIn instanceof ConnectionBlock conn)
					conn.classDeclaration.detachUsed = true;
				else if (meaning.declaredIn instanceof ClassDeclaration cdecl)
					cdecl.detachUsed = true;
				else
					Util.error("Variable(" + identifier + ").doChecking:INTERNAL ERROR, "
							+ meaning.declaredIn.getClass().getSimpleName());
			}
		}
		if (!this.hasArguments()) {
			SET_SEMANTICS_CHECKED();
			return;
		}
		checkedParams = new Vector<Expression>();
		Declaration decl = meaning.declaredAs;

		if (decl != null)
			switch (decl.declarationKind) {
			case ObjectKind.ArrayDeclaration:
				ArrayDeclaration array = (ArrayDeclaration) decl;
				this.type = array.type;
				// Check parameters
				if (params.size() != array.nDim)
					Util.error("Wrong number of indices to " + array);
				for (Expression actualParameter : params) {
					actualParameter.doChecking();
					Expression checkedParameter = TypeConversion.testAndCreate(Type.Integer, actualParameter);
					checkedParameter.backLink = this;
					checkedParams.add(checkedParameter);
				}
				break;

			case ObjectKind.Class:
			case ObjectKind.StandardClass:
			case ObjectKind.Procedure:
			case ObjectKind.ContextFreeMethod:
			case ObjectKind.MemberMethod:
				this.type = decl.type;
				Type overloadedType = this.type;
				Iterator<Parameter> formalIterator;
				if (decl instanceof ClassDeclaration cdecl)
					formalIterator = cdecl.new ClassParameterIterator();
				else {
					formalIterator = ((ProcedureDeclaration) decl).parameterList.iterator();
					if(!Option.CREATE_JAVA_SOURCE) {
						if(decl instanceof StandardProcedure prc) {
//							System.out.println("VariableExpression.doChecking: StandardProcedure="+prc);
							ProcedureSpecification overLoadMatch = prc.getOverLoadMatch(params);
							if(overLoadMatch != null)
								overloadedType = overLoadMatch.type;
						}
					}
				}
				if (params != null) {
					// Check parameters
					Iterator<Expression> actualIterator = params.iterator();
					LOOP: while (actualIterator.hasNext()) {
						if (!formalIterator.hasNext()) {
							Util.error("Wrong number of parameters to " + decl);
							break LOOP;
						}
						Parameter formalParameter = (Parameter) formalIterator.next();
						Type formalType = formalParameter.type;
						Expression actualParameter = actualIterator.next();
						actualParameter.doChecking();
						
//						if (formalType instanceof OverLoad) {
//							formalType = actualParameter.type; // AD'HOC for add/subepsilon
//							overloadedType = formalType;
//						}
						
						if (formalType instanceof OverLoad otp) {
							if(identifier.equalsIgnoreCase("addepsilon") || identifier.equalsIgnoreCase("subepsilon")) {
								formalType = actualParameter.type; // AD'HOC for add/subepsilon
								overloadedType = formalType;
							} else {
//								System.out.println("VariableExpression.doChecking: identifier="+this.identifier);
//								System.out.println("VariableExpression.doChecking: formalParameter="+formalParameter);
//								System.out.println("VariableExpression.doChecking: actualParameter="+actualParameter.type);
								
//								formalType = otp.type[0];
//								LOOP2: for(Type tp:otp.type) {
//									if(tp.equals(actualParameter.type)) {
//										formalType = tp; break LOOP2;
//									}
//								}
							}
						}
						
						if (formalParameter.kind == Parameter.Kind.Array) {
//							if (formalType != null && formalType != actualParameter.type
							if (formalType != null && (!formalType.equals(actualParameter.type))
									&& formalType.isArithmeticType())
								Util.error("Parameter Array " + actualParameter + " must be of Type " + formalType);
						}
						Expression checkedParameter = TypeConversion.testAndCreate(formalType, actualParameter);
						checkedParameter.backLink = this;
						checkedParams.add(checkedParameter);
					}
				}
				if (formalIterator.hasNext())
					Util.error("Wrong number of parameters to " + decl);
				if (type instanceof OverLoad)
					this.type = overloadedType;
				break;

			case ObjectKind.Parameter:
				Parameter spec = (Parameter) decl;
				int kind = spec.kind;
				Util.ASSERT(kind == Parameter.Kind.Array || kind == Parameter.Kind.Procedure, "Invariant ?");
				this.type = spec.type;
				if (kind == Parameter.Kind.Array)
					spec.nDim = params.size();
				Iterator<Expression> actualIterator = params.iterator();
				while (actualIterator.hasNext()) {
					Expression actualParameter = actualIterator.next();
					actualParameter.doChecking();
					if (kind == Parameter.Kind.Array) {
						if (!actualParameter.type.isArithmeticType())
							Util.error("Illegal index-type");
						Expression checkedParameter = TypeConversion.testAndCreate(Type.Integer, actualParameter);
						checkedParameter.backLink = this;
						checkedParams.add(checkedParameter);
					} else
						checkedParams.add(actualParameter);
				}
				break;
			case ObjectKind.VirtualSpecification:
				VirtualSpecification vspec = (VirtualSpecification) decl;
				this.type = vspec.type;
				Iterator<Expression> pactualIterator = params.iterator();
				while (pactualIterator.hasNext()) {
					Expression actualParameter = pactualIterator.next();
					actualParameter.doChecking();
					checkedParams.add(actualParameter);
				}
				break;

			default:
				Util.IERR("Variable.doChecking: Impossible - " + decl.declarationKind + "  " + decl);
			}

		if (Option.TRACE_CHECKER)
			Util.TRACE("END Variable(" + identifier + ").doChecking: type=" + type);
		SET_SEMANTICS_CHECKED();
	}

	// Returns true if this variable may be used as a statement.
	@Override
	public boolean maybeStatement() {
		ASSERT_SEMANTICS_CHECKED();
		if (meaning == null)
			return (false); // Error Recovery
		Declaration declaredAs = meaning.declaredAs;
		if (declaredAs == null)
			return (false); // Error Recovery
		switch (declaredAs.declarationKind) {
		case ObjectKind.Procedure:
			return (true);
//			case ObjectKind.ExternalProcedure: return(true);
		case ObjectKind.ContextFreeMethod:
			return (true);
		case ObjectKind.MemberMethod:
			return (true);
		case ObjectKind.Parameter:
			Parameter par = (Parameter) declaredAs;
			return (par.kind == Parameter.Kind.Procedure);
		case ObjectKind.VirtualSpecification:
			VirtualSpecification vir = (VirtualSpecification) declaredAs;
			return (vir.kind == VirtualSpecification.Kind.Procedure);
		default:
		}
		return (false); // Variable, Parameter, Array, Class, Switch
	}

	// ******************************************************************
	// *** Coding: toJavaCode
	// ******************************************************************
	@Override
	public String toJavaCode() {
		ASSERT_SEMANTICS_CHECKED();
		return (get());
	}

	// ******************************************************************
	// *** Coding: put
	// ******************************************************************
	// Generate code for putting an value(expression) into this Variable
	public String put(final String rightPart) {
		ASSERT_SEMANTICS_CHECKED();
		String edited = this.editVariable(rightPart); // Is a Destination
		return (edited);
	}

	// ******************************************************************
	// *** Coding: get
	// ******************************************************************
	// Generate code for getting the value of this Variable
	public String get() {
		ASSERT_SEMANTICS_CHECKED();
		String result = this.editVariable(null); // Not a destination
		// System.out.println("Variable.get: RETURN "+result);
		return (result);
	}

	// ******************************************************************
	// *** Coding: doGetELEMENT
	// ******************************************************************
	/**
	 * Coding utility: doGetELEMENT.
	 * 
	 * @param var the variable
	 * @return a suitable java code
	 */
	public String doGetELEMENT(final String var) {
		StringBuilder s = new StringBuilder();
		s.append(var);
		char sep = '(';
		// A.getELEMENT(i);
		s.append(".getELEMENT");
		for (Expression ix : checkedParams) {
			String index = ix.toJavaCode();
			s.append(sep).append(index);
			sep = ',';
		}
		s.append(")");
		return (s.toString());
	}

	// ******************************************************************
	// *** Coding: doPutELEMENT
	// ******************************************************************
	/**
	 * Coding utility: doPutELEMENT.
	 * 
	 * @param var       the variable
	 * @param rightPart the right hand side
	 * @return a suitable java code
	 */
	public String doPutELEMENT(final String var, final String rightPart) {
		StringBuilder s = new StringBuilder();
		s.append(var);
		char sep = '(';
		// A.putELEMENT(rightPart,i);
		s.append(".putELEMENT(").append(var).append(".index");
		for (Expression ix : checkedParams) {
			String index = ix.toJavaCode();
			s.append(sep).append(index);
			sep = ',';
		}
		s.append("),").append(rightPart).append(")");
		return (s.toString());
	}

	// ******************************************************************
	// *** Coding: editVariable
	// ******************************************************************
	/**
	 * Coding Utility: Edit this Variable.
	 * @param rightPart When destination, this is the right part of the assignment
	 * @return the resulting Java source code
	 */
	private String editVariable(final String rightPart) {
		boolean destination = (rightPart != null);
		Declaration decl = meaning.declaredAs;
		ASSERT_SEMANTICS_CHECKED();
		Expression inspectedVariable = meaning.getInspectedExpression();
		StringBuilder s;
//		System.out.println("Variable.editVariable: "+decl.declarationKind);
		switch (decl.declarationKind) {

		case ObjectKind.ArrayDeclaration:
			s = new StringBuilder();
			if (this.hasArguments()) { // Array Element Access
				String var = edIdentifierAccess(false);
				if (rightPart != null)
					return (doPutELEMENT(var, rightPart));
				else
					return (doGetELEMENT(var));
			} else {
				if (rightPart != null) {
					s.append(edIdentifierAccess(false)).append('=').append(rightPart);
				} else
					s.append(edIdentifierAccess(false));
			}
			return (s.toString());

		case ObjectKind.Class:
		case ObjectKind.StandardClass:
			Util.error("Illegal use of class identifier: " + decl.identifier);
			return (edIdentifierAccess(destination));

		case ObjectKind.LabelDeclaration:
			if (rightPart != null)
				Util.IERR("TEST DETTE -- Variable.editVariable: LabelDeclaration: rightPart=" + rightPart);
			VirtualSpecification virtSpec = VirtualSpecification.getVirtualSpecification(decl);
			if (virtSpec != null)
				return (edIdentifierAccess(virtSpec.getVirtualIdentifier(), destination));
			return (edIdentifierAccess(destination));

		case ObjectKind.Parameter:
			s = new StringBuilder();
			Parameter par = (Parameter) decl;
			switch (par.kind) {
			case Parameter.Kind.Array: // Parameter Array
				String var = edIdentifierAccess(false);
				if (inspectedVariable != null)
					var = inspectedVariable.toJavaCode() + '.' + var;
				if (par.mode == Parameter.Mode.name)
					var = var + ".get()";
				if (this.hasArguments()) {
					String arrType = type.toJavaArrayType();
					String castedVar = "((" + arrType + ")" + var + ")";
					if (rightPart != null)
						return (doPutELEMENT(castedVar, rightPart));
					else
						return (doGetELEMENT(castedVar));
				} else {
					if (rightPart != null) {
						s.append(var).append('=').append(rightPart);
					} else {
						s.append(var);
					}
				}
				break;
			case Parameter.Kind.Procedure: // Parameter Procedure
				if (destination)
					Util.IERR("TEST DETTE -- Variable.editVariable: Parameter Procedure: rightPart=" + rightPart);
				if (inspectedVariable != null)
					s.append(inspectedVariable.toJavaCode()).append('.');
				if (par.mode == Parameter.Mode.value)
					Util.error("Parameter " + this + " by Value is not allowed - Rewrite Program");
				else // Procedure By Reference or Name.
					s.append(CallProcedure.formal(this, par));
				if (rightPart != null) {
					s.append('=').append(rightPart);
				}
				break;
			case Parameter.Kind.Simple:
			case Parameter.Kind.Label:
				var = edIdentifierAccess(destination); // Kind: Simple/Label
				if (!destination && par.mode == Parameter.Mode.name) {
					s.append(var).append(".get()");
				} else if (rightPart != null) {
					if (par.mode == Parameter.Mode.name) {
						s.append(var + ".put(" + rightPart + ')');
					} else
						s.append(var).append('=').append(rightPart);
				} else {
					s.append(edIdentifierAccess(destination)); // Kind: Simple/Label
				}
			}
			return (s.toString());

		case ObjectKind.ContextFreeMethod:
			// Standard Library Procedure
			if (Util.equals(identifier, "sourceline"))
				return ("" + Global.sourceLineNumber);
			if (destination) {
				return ("_RESULT=" + rightPart);
			}
			return (CallProcedure.asStaticMethod(this, true));

		case ObjectKind.MemberMethod:
			if (destination) {
				return ("_RESULT=" + rightPart);
			}
			return (CallProcedure.asNormalMethod(this));

		case ObjectKind.Procedure:
//     		case ObjectKind.ExternalProcedure:
			// This Variable is a Procedure-Identifier.
			// When 'destination' it is a variable used to carry the resulting value until
			// the final return.
			// otherwise; it is a ordinary procedure-call.
			if (destination) { // return("_RESULT");
				ProcedureDeclaration proc = (ProcedureDeclaration) meaning.declaredAs;
				ProcedureDeclaration found = Global.getCurrentScope().findProcedure(proc.identifier);
				String res = null;
				if (found != null) {
					if (found.rtBlockLevel == Global.getCurrentScope().rtBlockLevel) {
						res = "_RESULT";
					} else {
						String cast = found.getJavaIdentifier();
						res = "((" + cast + ")" + found.edCTX() + ")._RESULT";
					}
				} else {
					Util.error("Can't assign to procedure " + proc.identifier);
					res = proc.identifier; // Error recovery
				}
				if (rightPart != null)
					res = res + "=" + rightPart;
				return (res);
			} else {
				ProcedureDeclaration procedure = (ProcedureDeclaration) decl;
				if (procedure.myVirtual != null)
					return (CallProcedure.virtual(this, procedure.myVirtual.virtualSpec, remotelyAccessed));
				else
					return (CallProcedure.normal(this));
			}

		case ObjectKind.SimpleVariableDeclaration:
			if (rightPart != null)
				return (edIdentifierAccess(destination) + '=' + rightPart);
			else
				return (edIdentifierAccess(destination));

		case ObjectKind.VirtualSpecification:
			if (rightPart != null)
				Util.IERR("TEST DETTE -- Variable.editVariable: VirtualSpecification: rightPart=" + rightPart);
			VirtualSpecification virtual = (VirtualSpecification) decl;
			return (CallProcedure.virtual(this, virtual, remotelyAccessed));

		default:
			Util.IERR("Variable.editVariable: Impossible - " + decl.declarationKind);
		}
		return (null);

	}

	// ***********************************************************************
	// *** Coding: edIdentifierAccess
	// ***********************************************************************
	/**
	 * Coding utility: Edit identifier access.
	 * 
	 * @param destination true if this variable is a destination
	 * @return a suitable java code
	 */
	public String edIdentifierAccess(boolean destination) {
		Declaration decl = meaning.declaredAs;
		String id = decl.getJavaIdentifier();
		String res = edIdentifierAccess(id, destination);
		return (res);
	}

	/**
	 * Coding Utility: Edit identifier access.
	 * @param id the identifier
	 * @param destination true if destination
	 * @return a suitable java code
	 */
	private String edIdentifierAccess(String id, boolean destination) {
		Expression constantElement = meaning.getConstant();
		if (constantElement != null) {
			if (constantElement instanceof Constant constant) {
				return (constant.toJavaCode());
			}
		}
		if (remotelyAccessed) {
			return (id);
		}
		if (meaning.isConnected()) {
			Expression inspectedVariable = ((ConnectionBlock) meaning.declaredIn).getInspectedExpression();
			if (meaning.foundBehindInvisible) {
				String remoteCast = meaning.foundIn.getJavaIdentifier();
				id = "((" + remoteCast + ")(" + inspectedVariable.toJavaCode() + "))." + id;
			} else {
				id = inspectedVariable.toJavaCode() + "." + id;
			}
		} else if (!(meaning.declaredIn.declarationKind == ObjectKind.ContextFreeMethod
				|| meaning.declaredIn.declarationKind == ObjectKind.MemberMethod)) {
			String cast = meaning.declaredIn.getJavaIdentifier();
			int n = meaning.declaredIn.rtBlockLevel;
			if (meaning.foundBehindInvisible)
				cast = meaning.foundIn.getJavaIdentifier();
			else if (n == Global.getCurrentScope().rtBlockLevel)
				return (id); // currentScope may be a sub-block
			id = "((" + cast + ")" + meaning.declaredIn.edCTX() + ")." + id; // ØM
		}
		return (id);
	}


	// **********************************************************************************************************************************
	// **********************************************************************************************************************************
	// **********************************************************************************************************************************
	// **********************************************************************************************************************************
	// **********************************************************************************************************************************
	// **********************************************************************************************************************************


	/**
	 * Coding Utility: Edit identifier access.
	 * @param id the identifier
	 * @param destination true if destination
	 * @param codeBuilder the CodeBuilder
	 */
	public void buildIdentifierAccess(boolean destination,CodeBuilder codeBuilder) {
		if (remotelyAccessed) return;
		meaning.buildIdentifierAccess(destination, codeBuilder);
	}

	// ******************************************************************
	// *** Coding: buildEvaluation
	// ******************************************************************
	/**
	 * Coding Utility: Build this Variable.
	 * @param rightPart When destination, this is the right part of the assignment
	 * @param codeBuilder the CodeBuilder
	 */
	@Override
	public void buildEvaluation(Expression rightPart,CodeBuilder codeBuilder) {
		ASSERT_SEMANTICS_CHECKED();
		Declaration decl=meaning.declaredAs;
//		System.out.println("VariableExpression.buildEvaluation: "+identifier+", kind="+decl.declarationKind);
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		boolean destination = (rightPart != null);
		
		VariableExpression inspectedVariable = meaning.getInspectedVariable();

		switch (decl.declarationKind) {

			case ObjectKind.ArrayDeclaration:
				if (this.hasArguments()) { // Array Element Access
					if (destination) {
//						return (doPutELEMENT(var, rightPart));
						Util.IERR("NOT IMPL");
					} else {
						ArrayDeclaration arr=(ArrayDeclaration)decl;
//						return (doGetELEMENT(var));
						buildIdentifierAccess(false,codeBuilder);
						arr.arrayGetElement(this, false, codeBuilder);
					}
				} else {
					if (destination) {
//						s.append(edIdentifierAccess(false)).append('=').append(rightPart);
						Util.IERR("NOT IMPL");
					} else {
//						s.append(edIdentifierAccess(false));
						buildIdentifierAccess(false,codeBuilder);
						ArrayDeclaration arr=(ArrayDeclaration)decl;
						// getfield  #7 // Field Ai:Lsimula/runtime/RTS_RTObject$RTS_INTEGER_ARRAY;
						FieldRefEntry FRE_ARR=pool.fieldRefEntry(arr.declaredIn.getClassDesc(), arr.identifier, ArrayDeclaration.getClassDesc(type));
						codeBuilder.getfield(FRE_ARR);
					}
				}
				break;

			case ObjectKind.Class:
			case ObjectKind.StandardClass:
				Util.error("Illegal use of class identifier: " + decl.identifier);
//				return (edIdentifierAccess(destination));
				Util.IERR("NOT IMPL");
				break;

			case ObjectKind.LabelDeclaration:
				if (destination)
					Util.IERR("TEST DETTE -- Variable.editVariable: LabelDeclaration:"); // rightPart=" + rightPart);
//				System.out.println("VariableExpression.buildEvaluation: LabelDeclaration");
				buildIdentifierAccess(destination,codeBuilder);
				LabelDeclaration lab=(LabelDeclaration)decl;
				VirtualSpecification virtSpec = VirtualSpecification.getVirtualSpecification(decl);
				if (virtSpec == null) {
					codeBuilder.getfield(lab.getFieldRefEntry(pool));
				} else {
					String ident = virtSpec.getFieldIdentifier();
					MethodTypeDesc MTD=MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_RTObject$RTS_LABEL;");
					codeBuilder.invokevirtual(BlockDeclaration.currentClassDesc(), ident, MTD);
				}
				break;

			case ObjectKind.Parameter:
				buildParameter((Parameter) decl,inspectedVariable,rightPart,codeBuilder);
				break;

			case ObjectKind.ContextFreeMethod:
				// Standard Library Procedure

				if (Util.equals(identifier, "sourceline")) {
					//return ("" + Global.sourceLineNumber);
					Constant.buildIntConst(codeBuilder, this.lineNumber);
					return;
				} else if (destination) {
					Util.IERR("NOT IMPL: "+identifier);
					//return ("_RESULT=" + rightPart);
				} else {
					BuildProcedureCall.callStandardProcedure(this,codeBuilder);
					return; // OK
				}
				Util.IERR("NOT IMPL: "+identifier);

			case ObjectKind.MemberMethod:
//				if (destination) {
//					return ("_RESULT=" + rightPart);
//				}
				BuildProcedureCall.asNormalMethod(this, codeBuilder);
				break;

			case ObjectKind.Procedure:
//     		case ObjectKind.ExternalProcedure:
				// This Variable is a Procedure-Identifier.
				// When 'destination' it is a variable used to carry the resulting value until the final return.
				// otherwise; it is a ordinary procedure-call.
				
				
				if (destination) { // return("_RESULT");
//					ProcedureDeclaration proc = (ProcedureDeclaration) meaning.declaredAs;
//					ProcedureDeclaration found = Global.getCurrentScope().findProcedure(proc.identifier);
//					String res = null;
//					if (found != null) {
//						if (found.rtBlockLevel == Global.getCurrentScope().rtBlockLevel) {
//							res = "_RESULT";
//						} else {
//							String cast = found.getJavaIdentifier();
//							res = "((" + cast + ")" + found.edCTX() + ")._RESULT";
//						}
//					} else {
//						Util.error("Can't assign to procedure " + proc.identifier);
//						res = proc.identifier; // Error recovery
//					}
//					if (destination)
//						res = res + "=" + rightPart;
//					return (res);
					Util.IERR("");
				} else {
					ProcedureDeclaration procedure = (ProcedureDeclaration) decl;
					if (procedure.myVirtual != null) {
						BuildProcedureCall.virtual(this, procedure.myVirtual.virtualSpec, remotelyAccessed, codeBuilder);
					} else
						BuildProcedureCall.normal(this, procedure, codeBuilder);
				}
				break;

			case ObjectKind.SimpleVariableDeclaration:
				SimpleVariableDeclaration var=(SimpleVariableDeclaration)decl;
				if(var.constantElement != null) {
					var.constantElement.buildEvaluation(null,codeBuilder);
					break;
				}
				if(inspectedVariable != null) {
					ConnectionBlock cblk=(ConnectionBlock)meaning.declaredIn;
					DeclarationScope encl=cblk.declaredIn;
					String inspectedVariableIdentifier = inspectedVariable.identifier;
					ClassDesc CD_blck = encl.getClassDesc();
					ClassDesc CD_type=inspectedVariable.type.toClassDesc();
					FieldRefEntry FRE_inspvar=pool.fieldRefEntry(CD_blck,inspectedVariableIdentifier, CD_type );
					
					boolean withFollowSL = meaning.declaredIn.buildCTX(codeBuilder);
					if(withFollowSL) {
						String cast = encl.externalIdent;
						codeBuilder.checkcast(ClassDesc.of(Global.packetName,cast));
					}
					
					codeBuilder
						.getfield(FRE_inspvar)
						.getfield(var.getFieldRefEntry(pool));
				} else {
					buildIdentifierAccess(destination,codeBuilder);
					codeBuilder.getfield(var.getFieldRefEntry(pool));
				}
				break;

			case ObjectKind.VirtualSpecification:
				VirtualSpecification virtual = (VirtualSpecification) decl;
				BuildProcedureCall.virtual(this, virtual, remotelyAccessed,codeBuilder);
				break;

			default:
				Util.IERR("Variable.editVariable: Impossible - " + decl.declarationKind);
		}
	}

	
	
	// ******************************************************************
	// *** Coding: buildParameter
	// ******************************************************************
	/**
	 * Coding Utility: Build this Parameter.
	 * @param par the Parameter
	 * @param inspectedVariable then inspected variable or null
	 * @param rightPart When destination, this is the right part of the assignment
	 * @param codeBuilder the CodeBuilder
	 */
	private void buildParameter(Parameter par,Expression inspectedVariable,Expression rightPart,CodeBuilder codeBuilder) {
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		boolean destination = (rightPart != null);
				
		switch (par.kind) {
		case Parameter.Kind.Array: // Parameter Array
//			System.out.println("VariableExpression.buildParameter'Array: "+par);
//			String var = edIdentifierAccess(false);
			if (inspectedVariable != null) {
//				var = inspectedVariable.toJavaCode() + '.' + var;
				Util.IERR("NOT IMPL");
			}
			if (par.mode == Parameter.Mode.name) {
				codeBuilder
					.aload(0)
					.getfield(par.getFieldRefEntry(pool))
					.invokevirtual(pool.methodRefEntry(CD.RTS_NAME, "get", MethodTypeDesc.ofDescriptor("()Ljava/lang/Object;")))
					.checkcast(CD.RTS_ARRAY(type));
				if(checkedParams != null) {
					ArrayDeclaration.arrayGetElement2(type,par.getFieldIdentifier(),checkedParams,codeBuilder);
				}
			} else {
				if (this.hasArguments()) {
//					String arrType = type.toJavaArrayType();
//					String castedVar = "((" + arrType + ")" + var + ")";
					if (destination) {
						meaning.buildIdentifierAccess(false,codeBuilder);
						ArrayDeclaration.arrayPutElement(meaning,par.getFieldIdentifier(),true,this.checkedParams,rightPart,codeBuilder);
					} else {
						codeBuilder.aload(0);
						ArrayDeclaration.arrayGetElement(type,par.getFieldIdentifier(),true,this.checkedParams,null,par.declaredIn,codeBuilder);
					}
				} else {
					if (destination) {
//						s.append(var).append('=').append(rightPart);
						Util.IERR("NOT IMPL");
					} else {
						buildIdentifierAccess(destination,codeBuilder);
						if (par.mode == Parameter.Mode.name) {
							MethodTypeDesc MTD=MethodTypeDesc.ofDescriptor("()Ljava/lang/Object;");
							codeBuilder
								.invokevirtual(pool.methodRefEntry(CD.RTS_NAME, "get", MTD));
							Util.IERR("NOT IMPL");
						}
						else if(par.kind == Parameter.Kind.Array) {
							codeBuilder.getfield(BlockDeclaration.currentClassDesc(), par.getFieldIdentifier(), CD.RTS_ARRAY);
						}
					}
				}
			}
			break;

		case Parameter.Kind.Procedure: // Parameter Procedure
			if (destination)
				Util.IERR("TEST DETTE -- Variable.editVariable: Parameter Procedure: rightPart=" + rightPart);
			if (inspectedVariable != null) {
//				s.append(inspectedVariable.toJavaCode()).append('.');
				Util.IERR("");
			}
			if (par.mode == Parameter.Mode.value)
				Util.error("Parameter " + this + " by Value is not allowed - Rewrite Program");
			else { // Procedure By Reference or Name.
				BuildProcedureCall.formal(this, par, codeBuilder);
				if(par.type == null) codeBuilder.pop();
			}
			break;

		case Parameter.Kind.Simple:
		case Parameter.Kind.Label:
//			var = edIdentifierAccess(destination); // Kind: Simple/Label
			buildIdentifierAccess(destination,codeBuilder); // Kind: Simple/Label
//			if (!destination && par.mode == Parameter.Mode.name) {
//				s.append(var).append(".get()");
//			} else if (destination) {
//				if (par.mode == Parameter.Mode.name) {
//					s.append(var + ".put(" + rightPart + ')');
//				} else
//					s.append(var).append('=').append(rightPart);
//			} else {
//				s.append(edIdentifierAccess(destination)); // Kind: Simple/Label
//			}

			codeBuilder.getfield(par.getFieldRefEntry(pool));
			
			if (!destination && par.mode == Parameter.Mode.name) {
				codeBuilder.invokevirtual(pool.methodRefEntry(CD.RTS_NAME,
						"get", MethodTypeDesc.ofDescriptor("()Ljava/lang/Object;")));
				if(par.type.equals(Type.Integer)) {
					codeBuilder
						.checkcast(ConstantDescs.CD_Integer)
						.invokevirtual(pool.methodRefEntry(ConstantDescs.CD_Integer, "intValue", MethodTypeDesc.ofDescriptor("()I")));
				} else if(par.type.equals(Type.Real)) {
						codeBuilder
							.checkcast(ConstantDescs.CD_Float)
							.invokevirtual(pool.methodRefEntry(ConstantDescs.CD_Float, "floatValue", MethodTypeDesc.ofDescriptor("()F")));
				} else if(par.type.equals(Type.LongReal)) {
					codeBuilder
						.checkcast(ConstantDescs.CD_Double)
						.invokevirtual(pool.methodRefEntry(ConstantDescs.CD_Double, "doubleValue", MethodTypeDesc.ofDescriptor("()D")));
				} else if(par.type.equals(Type.Boolean)) {
					codeBuilder
						.checkcast(ConstantDescs.CD_Boolean)
						.invokevirtual(pool.methodRefEntry(ConstantDescs.CD_Boolean, "booleanValue", MethodTypeDesc.ofDescriptor("()Z")));
				} else if(par.type.equals(Type.Character)) {
					codeBuilder
						.checkcast(ConstantDescs.CD_Character)
						.invokevirtual(pool.methodRefEntry(ConstantDescs.CD_Character, "charValue", MethodTypeDesc.ofDescriptor("()C")));
				} else if(par.type.equals(Type.Text)) {
					codeBuilder
						.checkcast(CD.RTS_TXT);
				} else if(par.type.equals(Type.Label)) {
					codeBuilder
						.checkcast(CD.RTS_LABEL);
				} else if(par.type.isReferenceType()) {
					codeBuilder
						.checkcast(par.type.toClassDesc(par));
				} else {
					System.out.println("VarableExpression.buildEvaluation: Simple: "+this+"  "+this.meaning);
					Util.IERR("FYLL PÅ FLERE TYPER: "+par.type);
				}
			}
			break; // OK
		}
	}

	@Override
	public void printTree(final int indent) {
		System.out.println(edTreeIndent(indent)+this);
	}

	// ***********************************************************************
	// *** Utility: toString
	// ***********************************************************************
	@Override
	public String toString() {
		if (params == null)
			return ("" + identifier);
		else
			return (("" + identifier + params).replace('[', '(').replace(']', ')'));
	}

	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************
	/**
	 * Default constructor used by Attribute File I/O.
	 */
	public VariableExpression() {
	}

	@Override
	public void writeObject(AttributeOutputStream oupt) throws IOException {
		Util.TRACE_OUTPUT("BEGIN Write VariableExpression: "+this);
//		oupt.writeBoolean(CHECKED);
		oupt.writeKind(ObjectKind.VariableExpression);
		oupt.writeInt(lineNumber);
		oupt.writeType(type);
		oupt.writeObj(backLink);
		oupt.writeString(identifier);
//		oupt.writeObject(meaning);
		oupt.writeBoolean(remotelyAccessed);
		
		//oupt.writeObj(params);
		if(params == null) {
			oupt.writeInt(0);			
		} else {
			oupt.writeInt(params.size());
			for(Expression par:params) oupt.writeObj(par);
		}
//		oupt.writeObject(checkedParams);			
	}
	
	public static VariableExpression readObject(AttributeInputStream inpt) throws IOException {
		Util.TRACE_INPUT("BEGIN readVariableExpression: ");
		VariableExpression var = new VariableExpression();
//		CHECKED=inpt.readBoolean();
		
		var.lineNumber = inpt.readInt();
		System.out.println("VariableExpression.readObject: lineNumber="+var.lineNumber);
		var.type = inpt.readType();
		System.out.println("VariableExpression.readObject: type="+var.type);
		var.backLink = (SyntaxClass) inpt.readObj();
		var.identifier = inpt.readString();
//		meaning = (Meaning) inpt.readObject();
		var.remotelyAccessed = inpt.readBoolean();
		
		//params = (Vector<Expression>) inpt.readObject();
		int n = inpt.readInt();
		if(n > 0) {
			for(int i=0;i<n;i++)
				var.params.add((Expression) inpt.readObj());
		}
		
//		checkedParams = (Vector<Expression>) inpt.readObject();			
		Util.TRACE_INPUT("readVariableExpression: " + var);
		return(var);
	}

//	// ***********************************************************************************************
//	// *** Externalization
//	// ***********************************************************************************************
//	/**
//	 * Default constructor used by Externalization.
//	 */
//	public VariableExpression() {
//	}
//
//	@Override
//	public void writeExternal(ObjectOutput oupt) throws IOException {
//		Util.TRACE_OUTPUT("BEGIN Write VariableExpression: "+this);
////		oupt.writeBoolean(CHECKED);
//		oupt.writeInt(lineNumber);
//		oupt.writeType(type);
//		oupt.writeObject(backLink);
//		oupt.writeString(identifier);
////		oupt.writeObject(meaning);
//		oupt.writeObject(remotelyAccessed);
//		oupt.writeObject(params);
////		oupt.writeObject(checkedParams);			
//	}
//	
//	@SuppressWarnings("unchecked")
//	@Override
//	public void readExternal(ObjectInput inpt) throws IOException {
//		Util.TRACE_INPUT("BEGIN Read VariableExpression: ");
////		CHECKED=inpt.readBoolean();
//		lineNumber = inpt.readInt();
//		type = inpt.readType();
//		backLink = (SyntaxClass) inpt.readObject();
//		identifier = inpt.readString();
////		meaning = (Meaning) inpt.readObject();
//		remotelyAccessed = (boolean) inpt.readObject();
//		params = (Vector<Expression>) inpt.readObject();
////		checkedParams = (Vector<Expression>) inpt.readObject();			
//	}
//		

}
