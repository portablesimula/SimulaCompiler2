/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass.expression;

import java.io.IOException;
import java.lang.classfile.CodeBuilder;
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import java.lang.classfile.constantpool.FieldRefEntry;
import java.lang.constant.ClassDesc;
import java.lang.constant.MethodTypeDesc;

import simula.compiler.AttributeInputStream;
import simula.compiler.AttributeOutputStream;
import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.declaration.ArrayDeclaration;
import simula.compiler.syntaxClass.declaration.BlockDeclaration;
import simula.compiler.syntaxClass.declaration.Declaration;
import simula.compiler.syntaxClass.declaration.Parameter;
import simula.compiler.syntaxClass.declaration.ProcedureDeclaration;
import simula.compiler.syntaxClass.declaration.SimpleVariableDeclaration;
import simula.compiler.utilities.CD;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.KeyWord;
import simula.compiler.utilities.Meaning;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * Assignment Operation.
 * <p>
 * The Simula assignment statement is for convenience implemented as an assignment operation.
 * <pre>
 * 
 * Simula Standard: 4.1 Assignment statements
 * 
 *   assignment-operation = expression  assignment-operator  expression
 *   
 *		assignment-operator =  :=  |  :-
 *   
 * </pre>
 * Link to GitHub: <a href="https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/expression/AssignmentOperation.java">
 * <b>Source File</b></a>.
 * 
 * @author SIMULA Standards Group
 * @author Øystein Myhre Andersen
 */
public final class AssignmentOperation extends Expression {

	/**
	 * The left hand side
	 */
	private Expression lhs;

	/**
	 * The arithmetic operation
	 */
	private int opr;

	/**
	 * The right hand side
	 */
	private Expression rhs;
	
	/**
	 * Indicates that this assignment is a text value assignment.
	 */
	private boolean textValueAssignment = false; // Set by doChecking

	/**
	 * AssignmentOperation.
	 * @param lhs the left hand side
	 * @param opr the operation
	 * @param rhs the right hand side
	 */
	public AssignmentOperation(final Expression lhs, final int opr, final Expression rhs) {
		this.lhs = lhs;
		this.opr = opr;
		this.rhs = rhs;
		if (this.lhs == null) {
			Util.error("Missing operand before " + opr);
			this.lhs = new VariableExpression("UNKNOWN_");
		}
		if (this.rhs == null) {
			Util.error("Missing operand after " + opr);
			this.rhs = new VariableExpression("UNKNOWN_");
		}
		this.lhs.backLink = this.rhs.backLink = this;
	}

	@Override
	public void doChecking() {
		if (IS_SEMANTICS_CHECKED())
			return;
		Global.sourceLineNumber = lineNumber;
		if (Option.internal.TRACE_CHECKER)
			Util.TRACE("BEGIN Assignment" + toString() + ".doChecking - Current Scope Chain: "
					+ Global.getCurrentScope().edScopeChain());
		lhs.doChecking();
		Type toType = lhs.type;
		if (lhs instanceof VariableExpression var) {
			Meaning meaning = var.getMeaning();
			if (meaning.declaredAs instanceof SimpleVariableDeclaration dcl) {
				if (dcl.isConstant())
					Util.error("Assignment to Constant: '" + lhs + "' is Illegal");
			}
		} else {
			if (lhs.getWriteableVariable() == null)
				Util.error("Can't assign to " + lhs);
		}
		rhs.doChecking();
		Type fromType = rhs.type;
		if (opr == KeyWord.ASSIGNVALUE)
			this.textValueAssignment = (toType.keyWord == Type.T_TEXT);
		rhs = (Expression) TypeConversion.testAndCreate(toType, rhs);
		this.type = toType;
		if (this.type == null)
			Util.error("doAssignmentChecking: Illegal types: " + toType + " := " + fromType);
		SET_SEMANTICS_CHECKED();
	}

	// Returns true if this expression may be used as a statement.
	@Override
	public boolean maybeStatement() {
		ASSERT_SEMANTICS_CHECKED();
		return (true);
	}

	@Override
	public String toJavaCode() {
		ASSERT_SEMANTICS_CHECKED();
		if (this.textValueAssignment)
			return (doCodeTextValueAssignment());
		else
			return (doCodeAssignment());
	}

	// ***********************************************************************
	// *** CODE: doCodeTextValueAssignment
	// ***********************************************************************
	/**
	 * Coding Utility: Code text value assignment.
	 * @return the resulting Java source code
	 */
	private String doCodeTextValueAssignment() {
		StringBuilder s = new StringBuilder();

		String target = lhs.toJavaCode();

		if(lhs instanceof VariableExpression var) {
			if(!var.hasArguments()) {
				Declaration declaredAs = var.meaning.declaredAs;
				if(declaredAs instanceof ProcedureDeclaration proc) {
					if (proc.getRTBlockLevel() == Global.getCurrentScope().getRTBlockLevel()) {
						target = "_RESULT";
					} else {
						String cast = proc.getJavaIdentifier();
						target = "((" + cast + ")" + proc.edCTX() + ")._RESULT";
					}
				}
			}
		}

		if (rhs instanceof Constant cnst) {
			Object value = cnst.value;
			if (value != null) {
				s.append("_ASGSTR(").append(target).append(",\"").append(value).append("\")");
				return (s.toString());
			}
		}
		s.append("_ASGTXT(").append(target).append(',').append(rhs.toJavaCode()).append(')');
		return (s.toString());			

	}

	// ***********************************************************************
	// *** CODE: doCodeAssignment
	// ***********************************************************************
	/**
	 * Coding Utility: Code assignment.
	 * @return the resulting Java source code
	 */
	private String doCodeAssignment() {
		StringBuilder s = new StringBuilder();
		// -------------------------------------------------------------------------
		// CHECK FOR SPECIAL CASE:
		// OBJECT DOT ARRAY(x1,x2,...) := Expression ;
		// SHOULD BE CODED LIKES:
		// OBJECT.ARRAY.putELEMENT(OBJECT.ARRAY.index(x1,x2),Expression);
		// -------------------------------------------------------------------------
		if (lhs instanceof RemoteVariable rem) {
			Expression afterDot = ((RemoteVariable) lhs).var;
			if (afterDot instanceof VariableExpression varAfterDot && varAfterDot.hasArguments()) {
				Declaration decl = varAfterDot.meaning.declaredAs;
				Expression beforeDot = rem.obj;
				if (decl instanceof ArrayDeclaration)
					return (doAccessRemoteArray(beforeDot, varAfterDot, rhs.toJavaCode()));
				else if (decl instanceof Parameter par) {
					if (par.kind == Parameter.Kind.Array)
						return (doAccessRemoteArray(beforeDot, varAfterDot, rhs.toJavaCode()));
				}

			}
		}
		s.append(lhs.put(rhs.get()));			
		return (s.toString());
	}

	// ***********************************************************************
	// *** CODE: doAccessRemoteArray
	// ***********************************************************************
	/**
	 * Coding Utility: Code access remote array.
	 * @param beforeDot expression before dot
	 * @param array the array  variable
	 * @param rightPart right part of assignment
	 * @return the resulting Java source code
	 */
	private String doAccessRemoteArray(final Expression beforeDot, final VariableExpression array, final String rightPart) {
		String obj = beforeDot.toJavaCode();
		String remoteIdent = obj + '.' + array.edIdentifierAccess(true);
		Declaration decl = array.meaning.declaredAs;
		if(decl instanceof Parameter par) {
			String arrayType = par.type.getArrayType();
			remoteIdent = "(("+arrayType+")"+remoteIdent+")";
		}
		return (array.doPutELEMENT(remoteIdent, rightPart));
	}

	
	
	/*******************************************************************************************************************
	/**
	 * Build Java ByteCode.
	 */
	@Override
	public void buildEvaluation(Expression rightPart,CodeBuilder codeBuilder) {
//		System.out.println("AssignmentOperation.buildEvaluation: type="+type+"  "+this);
		ASSERT_SEMANTICS_CHECKED();
		if (this.textValueAssignment)
			 buildTextValueAssignment(codeBuilder);
		else
			buildAssignment(codeBuilder);
	}


	private void buildTextValueAssignment(CodeBuilder codeBuilder) {
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		
		boolean isRESULT = false;
		if(lhs instanceof VariableExpression var) {
			if(!var.hasArguments()) {
				Declaration declaredAs = var.meaning.declaredAs;
				if(declaredAs instanceof ProcedureDeclaration proc) {
					isRESULT = true;
					int diff = Global.getCurrentScope().getRTBlockLevel() - proc.getRTBlockLevel();
					codeBuilder
						.aload(0);
					while((diff--) > 0)	codeBuilder.getfield(CD.RTS_RTObject, "_SL", CD.RTS_RTObject);
					codeBuilder
						.checkcast(proc.getClassDesc())
						.getfield(proc.getClassDesc(), "_RESULT", proc.type.toClassDesc());
				}
			}
		}

		if (rhs instanceof Constant cnst) {
			Object value = cnst.value;
			if (value != null) {
				
				if(!isRESULT)
					lhs.buildEvaluation(null,codeBuilder);
				codeBuilder.ldc(pool.stringEntry(value.toString()));

				ClassDesc CD = BlockDeclaration.currentClassDesc();
				MethodTypeDesc MTD=MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_TXT;Ljava/lang/String;)Lsimula/runtime/RTS_TXT;");
				codeBuilder.invokestatic(CD, "_ASGSTR", MTD);
				if(this.backLink == null) codeBuilder.pop();
				return;
			}
		}
		
		if(!isRESULT)
			lhs.buildEvaluation(this,codeBuilder);
		
		rhs.buildEvaluation(null,codeBuilder);
		ClassDesc CD = BlockDeclaration.currentClassDesc();
		MethodTypeDesc MTD=MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_TXT;Lsimula/runtime/RTS_TXT;)Lsimula/runtime/RTS_TXT;");
		codeBuilder.invokestatic(CD, "_ASGTXT", MTD);
		if(this.backLink == null) codeBuilder.pop();
	}

	private void buildAssignment(CodeBuilder codeBuilder) {
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		if(lhs instanceof VariableExpression var) {
			Declaration decl = var.meaning.declaredAs;
			switch(decl.declarationKind) {
				case ObjectKind.SimpleVariableDeclaration -> {
					var.buildIdentifierAccess(true,codeBuilder);
					rhs.buildEvaluation(null,codeBuilder);
					
					// Prepare for multiple assignment
					if(this.backLink != null) {
//						if(this.type.keyWord == Type.T_LONG_REAL)
//							 codeBuilder.dup2_x1();
//						else codeBuilder.dup_x1();
						type.dup_x1(codeBuilder);
					}
					SimpleVariableDeclaration simplevar = (SimpleVariableDeclaration)decl;
					codeBuilder.putfield(simplevar.getFieldRefEntry(pool));
				}
					
				case ObjectKind.Parameter -> {
					Parameter par = (Parameter)decl;
					boolean assignRef = opr==KeyWord.ASSIGNREF;
					switch(par.kind) {
						case Parameter.Kind.Simple -> buildSimpleParameter(par,var,assignRef,codeBuilder);
						case Parameter.Kind.Array  -> buildArrayParameter(par,var,assignRef,codeBuilder);
						default -> Util.IERR();
					}
				}
						
				case ObjectKind.Procedure -> {
					ProcedureDeclaration proc = (ProcedureDeclaration) decl;
					int diff = Global.getCurrentScope().getRTBlockLevel() - proc.getRTBlockLevel();
					codeBuilder.aload(0);
					while((diff--) > 0)	codeBuilder.getfield(CD.RTS_RTObject, "_SL", CD.RTS_RTObject);
					codeBuilder.checkcast(proc.getClassDesc());

					rhs.buildEvaluation(null,codeBuilder);
					
					// Prepare for multiple assignment
					if(this.backLink != null) {
						type.dup_x1(codeBuilder);
					}
					codeBuilder.putfield(pool.fieldRefEntry(proc.getClassDesc(), "_RESULT", type.toClassDesc()));
				}
					
				case ObjectKind.ArrayDeclaration -> {
					ArrayDeclaration arr = (ArrayDeclaration) decl;
					var.meaning.buildIdentifierAccess(false,codeBuilder);
					arr.arrayPutElement(var,false,rhs,codeBuilder);
					if(this.backLink == null) {
						type.pop(codeBuilder);
					}
				}
				
				default -> Util.IERR();
			}
			
		} else if(lhs instanceof RemoteVariable var) {
			if(!tryRemoteArray(var, codeBuilder)) {
				var.obj.buildEvaluation(null,codeBuilder);
				rhs.buildEvaluation(null,codeBuilder);
				// Prepare for multiple assignment
				if(this.backLink != null) {
					type.dup_x1(codeBuilder);
				}
				codeBuilder.putfield(var.getFieldRefEntry(pool));
			}
		}
		else Util.IERR();
	}
	
	private boolean tryRemoteArray(RemoteVariable remvar, CodeBuilder codeBuilder) {
		if(remvar.var instanceof VariableExpression) {
			Declaration decl = remvar.var.meaning.declaredAs;
			if(decl instanceof ArrayDeclaration arr) {
				remvar.obj.buildEvaluation(null,codeBuilder);
				arr.arrayPutElement(remvar.var,false,rhs,codeBuilder);
			} else if(decl instanceof Parameter par) {
				if(par.kind != Parameter.Kind.Array) return(false);
				remvar.obj.buildEvaluation(null,codeBuilder);
				ArrayDeclaration.arrayPutElement(remvar.var.meaning,par.getFieldIdentifier(),true,remvar.var.checkedParams, rhs, codeBuilder);
			} else return(false);
			
			// Prepare for multiple assignment
			if(this.backLink == null) {
//				if(this.type.keyWord == Type.T_LONG_REAL)
//					codeBuilder.pop2();
//				else codeBuilder.pop();
				type.pop(codeBuilder);
			}
			return(true);
		}
		return(false);
	}
	
	private void buildSimpleParameter(Parameter par,VariableExpression var,boolean assignRef,CodeBuilder codeBuilder) {
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		FieldRefEntry FDE=par.getFieldRefEntry(pool);
		if(par.mode == Parameter.Mode.name) {
			codeBuilder
				.aload(0)
				.getfield(FDE);
			rhs.buildEvaluation(null,codeBuilder); // Result may be int,float, ...		
        	par.type.buildObjectValueOf(codeBuilder);

			codeBuilder
				.invokevirtual(pool.methodRefEntry(CD.RTS_NAME
					, "put", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)Ljava/lang/Object;")));
			
			// Prepare for multiple assignment
			if(this.backLink == null) {
				codeBuilder.pop();
			} else {
				par.type.checkCast(codeBuilder);
				par.type.valueToPrimitiveType(codeBuilder);
			}
		} else {
			// Simple Parameter by value/default
			codeBuilder.aload(0);
			rhs.buildEvaluation(null,codeBuilder);

			// Prepare for multiple assignment
			if(this.backLink != null) {
//				if(this.type.keyWord == Type.T_LONG_REAL)
//					 codeBuilder.dup2_x1();
//				else codeBuilder.dup_x1();
				type.dup_x1(codeBuilder);
			}
			codeBuilder.putfield(FDE);
		}
	}
	
	private void buildArrayParameter(Parameter par,VariableExpression var,boolean assignRef,CodeBuilder codeBuilder) {
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		if(par.mode == Parameter.Mode.name) {
			//    	 0: aload_0
			//    	 1: getfield      #9                  // Field p_ia:Lsimula/runtime/RTS_NAME;
			//    	 4: invokevirtual #55                 // Method simula/runtime/RTS_NAME.get:()Ljava/lang/Object;
			//    	 7: checkcast     #59                 // class simula/runtime/RTS_RTObject$RTS_INTEGER_ARRAY
			//    	10: aload_0
			//    	11: getfield      #9                  // Field p_ia:Lsimula/runtime/RTS_NAME;
			//    	14: invokevirtual #55                 // Method simula/runtime/RTS_NAME.get:()Ljava/lang/Object;
			//    	17: checkcast     #59                 // class simula/runtime/RTS_RTObject$RTS_INTEGER_ARRAY

			codeBuilder
				.aload(0)
				.getfield(par.getFieldRefEntry(pool))
				.invokevirtual(pool.methodRefEntry(CD.RTS_NAME, "get", MethodTypeDesc.ofDescriptor("()Ljava/lang/Object;")))
				.checkcast(CD.RTS_ARRAY(par.type))
				.dup();
			ArrayDeclaration.arrayPutElement2(var.meaning,var.checkedParams,rhs,codeBuilder);
		} else {
			lhs.buildEvaluation(rhs,codeBuilder);
		}
		if(this.backLink == null) codeBuilder.pop();
	}


	@Override
	public String toString() {
		return ("(" + lhs + ' ' + KeyWord.edit(opr) + ' ' + rhs + ")");
	}

	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************
	/**
	 * Default constructor used by Attribute File I/O
	 */
	private AssignmentOperation() {}

	@Override
	public void writeObject(AttributeOutputStream oupt) throws IOException {
		Util.TRACE_OUTPUT("writeAssignmentOperation: " + this);
		oupt.writeKind(ObjectKind.AssignmentOperation);
		oupt.writeShort(SEQU);
//		oupt.writeShort(lineNumber);
//		oupt.writeType(type);
//		oupt.writeObj(backLink);
//		oupt.writeObj(lhs);
//		oupt.writeShort(opr);
//		oupt.writeObj(rhs);
		writeAttributes(oupt);
	}
	
	public static AssignmentOperation readObject(AttributeInputStream inpt) throws IOException {
		Util.TRACE_INPUT("BEGIN readAssignmentOperation: ");
		AssignmentOperation expr = new AssignmentOperation();
		expr.SEQU = inpt.readSEQU(expr);
//		expr.lineNumber = inpt.readShort();
//		expr.type = inpt.readType();
//		expr.backLink = (SyntaxClass) inpt.readObj();
//		expr.lhs = (Expression) inpt.readObj();
//		expr.opr = inpt.readShort();
//		expr.rhs = (Expression) inpt.readObj();
		expr.readAttributes(inpt);
		Util.TRACE_INPUT("readAssignmentOperation: " + expr);
		return(expr);
	}

//	writeAttributes(oupt);
//	expr.readAttributes(inpt);
	@Override
	public void writeAttributes(AttributeOutputStream oupt) throws IOException {
		super.writeAttributes(oupt);
		oupt.writeObj(lhs);
		oupt.writeShort(opr);
		oupt.writeObj(rhs);
	}

	@Override
	public void readAttributes(AttributeInputStream inpt) throws IOException {
		super.readAttributes(inpt);
		lhs = (Expression) inpt.readObj();
		opr = inpt.readShort();
		rhs = (Expression) inpt.readObj();
	}

}
