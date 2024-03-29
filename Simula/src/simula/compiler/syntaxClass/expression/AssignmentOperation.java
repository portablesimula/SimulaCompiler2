/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass.expression;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.classfile.CodeBuilder;
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import java.lang.classfile.constantpool.FieldRefEntry;
import java.lang.constant.ClassDesc;
import java.lang.constant.ConstantDescs;
import java.lang.constant.MethodTypeDesc;

import simula.compiler.syntaxClass.SyntaxClass;
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
	private KeyWord opr;

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
	public AssignmentOperation(final Expression lhs, final KeyWord opr, final Expression rhs) {
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
		if (Option.TRACE_CHECKER)
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
			this.textValueAssignment = toType.equals(Type.Text);
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
		if (rhs instanceof Constant cnst) {
			Object value = cnst.value;
			if (value != null) {
				s.append("_ASGSTR(").append(lhs.toJavaCode()).append(",\"").append(value).append("\")");
				return (s.toString());
			}
		}
		s.append("_ASGTXT(").append(lhs.toJavaCode()).append(',').append(rhs.toJavaCode()).append(')');
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
//				System.out.println("AssignmentOperation.doCodeAssignment: beforeDot = " + beforeDot + ", decl=" + decl);
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
//		System.out.println("AssignmentOperation.doAccessRemoteArray: decl="+decl.getClass().getSimpleName()+"  "+decl);
		if(decl instanceof Parameter par) { // TESTING_ARRAY
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
		ASSERT_SEMANTICS_CHECKED();
		if (this.textValueAssignment)
			buildTextValueAssignment(codeBuilder);
		else
			buildAssignment(codeBuilder);
	}


	public void buildTextValueAssignment(CodeBuilder codeBuilder) {
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		if (rhs instanceof Constant cnst) {
			Object value = cnst.value;
			if (value != null) {
				lhs.buildEvaluation(null,codeBuilder);
				codeBuilder.ldc(pool.stringEntry(value.toString()));

				ClassDesc CD = BlockDeclaration.currentClassDesc();
				MethodTypeDesc MTD=MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_TXT;Ljava/lang/String;)Lsimula/runtime/RTS_TXT;");
				codeBuilder.invokestatic(CD, "_ASGSTR", MTD);
				if(this.backLink == null) codeBuilder.pop();
				return;
			}
		}
		lhs.buildEvaluation(null,codeBuilder);
		rhs.buildEvaluation(null,codeBuilder);
		ClassDesc CD = BlockDeclaration.currentClassDesc();
		MethodTypeDesc MTD=MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_TXT;Lsimula/runtime/RTS_TXT;)Lsimula/runtime/RTS_TXT;");
		codeBuilder.invokestatic(CD, "_ASGTXT", MTD);
		if(this.backLink == null) codeBuilder.pop();
	}


	public void buildAssignment(CodeBuilder codeBuilder) {
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		if(lhs instanceof VariableExpression var) {
			Declaration decl = var.meaning.declaredAs;
//			System.out.println("AssignmentOperation.buildAssignment: decl="+decl.getClass().getSimpleName()+"  "+decl+"  "+this);

			if(decl instanceof SimpleVariableDeclaration simplevar) {
				buildSimple(simplevar,var,opr==KeyWord.ASSIGNREF,codeBuilder);
			} else if(decl instanceof Parameter par) {
				buildParameter(par,var,opr==KeyWord.ASSIGNREF,codeBuilder);
			} else if(decl.getClass() == ProcedureDeclaration.class) {
				buildProc((ProcedureDeclaration)decl,opr==KeyWord.ASSIGNREF,codeBuilder);
			} else if(decl instanceof ArrayDeclaration arr) {
				var.meaning.buildIdentifierAccess(false,codeBuilder);
				arr.arrayPutElement(var,false,rhs,codeBuilder);
				if(this.backLink == null) {
					if(this.type.equals(Type.LongReal))
						codeBuilder.pop2();
					else codeBuilder.pop();
				}
			}
			else Util.IERR("NOT IMPL: "+decl.getClass().getSimpleName()+"  "+decl);
		} else if(lhs instanceof RemoteVariable var) {
			if(!tryRemoteArray(var, codeBuilder)) {
				var.obj.buildEvaluation(null,codeBuilder);
				rhs.buildEvaluation(null,codeBuilder);
				// Prepare for multiple assignment
				if(this.backLink != null) {
					if(this.type.equals(Type.LongReal))
						 codeBuilder.dup2_x1();
					else codeBuilder.dup_x1();
				}
				codeBuilder.putfield(var.getFieldRefEntry(pool));
			}
		}
		else Util.IERR("NOT IMPL: "+lhs.getClass().getSimpleName()+"  "+lhs);
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
				if(this.type.equals(Type.LongReal))
					codeBuilder.pop2();
				else codeBuilder.pop();
			}
			return(true);
		}
		return(false);
	}

	private void buildSimple(SimpleVariableDeclaration simplevar,VariableExpression var,boolean assignRef,CodeBuilder codeBuilder) {
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		var.buildIdentifierAccess(true,codeBuilder);
		rhs.buildEvaluation(null,codeBuilder);
		
		// Prepare for multiple assignment
		if(this.backLink != null) {
			if(this.type.equals(Type.LongReal))
				 codeBuilder.dup2_x1();
			else codeBuilder.dup_x1();
		}
		codeBuilder.putfield(simplevar.getFieldRefEntry(pool));
	}
	
	private void buildProc(ProcedureDeclaration proc,boolean assignRef,CodeBuilder codeBuilder) {
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		VariableExpression var = (VariableExpression)lhs;
		var.buildIdentifierAccess(true,codeBuilder);
		rhs.buildEvaluation(null,codeBuilder);
		codeBuilder.putfield(pool.fieldRefEntry(proc.getClassDesc(), "_RESULT", type.toClassDesc()));
	}
	
	private void buildParameter(Parameter par,VariableExpression var,boolean assignRef,CodeBuilder codeBuilder) {
//		System.out.println("AssignmentOperation.buildParameter: "+par+", kind="+par.kind);
		switch(par.kind) {
			case Simple:    buildSimpleParameter(par,var,assignRef,codeBuilder); break;
			case Array:     buildArrayParameter(par,var,assignRef,codeBuilder); break;
			case Label:     Util.IERR(""); break;
			case Procedure: Util.IERR(""); break;
			default: Util.IERR("IMPOSSIBLE");
		}
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
				if(par.type.equals(Type.Integer))
					codeBuilder
						.checkcast(ConstantDescs.CD_Integer)
						.invokevirtual(pool.methodRefEntry(ConstantDescs.CD_Integer, "intValue", MethodTypeDesc.ofDescriptor("()I")));
				else if(par.type.equals(Type.Real))
					codeBuilder
						.checkcast(ConstantDescs.CD_Float)
						.invokevirtual(pool.methodRefEntry(ConstantDescs.CD_Float, "floatValue", MethodTypeDesc.ofDescriptor("()F")));
				else if(par.type.equals(Type.LongReal))
					codeBuilder
						.checkcast(ConstantDescs.CD_Double)
						.invokevirtual(pool.methodRefEntry(ConstantDescs.CD_Double, "doubleValue", MethodTypeDesc.ofDescriptor("()D")));
				else if(par.type.equals(Type.Boolean))
					codeBuilder
						.checkcast(ConstantDescs.CD_Boolean)
						.invokevirtual(pool.methodRefEntry(ConstantDescs.CD_Boolean, "booleanValue", MethodTypeDesc.ofDescriptor("()Z")));
				else if(par.type.equals(Type.Character))
					codeBuilder
						.checkcast(ConstantDescs.CD_Character)
						.invokevirtual(pool.methodRefEntry(ConstantDescs.CD_Character, "charValue", MethodTypeDesc.ofDescriptor("()C")));
				else Util.IERR("FYLL PÅ TYPE: "+type);
			}
			return; // DONE !
		} else {
			// Simple Parameter by value/default
			codeBuilder.aload(0);
			rhs.buildEvaluation(null,codeBuilder);

			// Prepare for multiple assignment
			if(this.backLink != null) {
				if(this.type.equals(Type.LongReal))
					 codeBuilder.dup2_x1();
				else codeBuilder.dup_x1();
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
		return ("(" + lhs + ' ' + opr + ' ' + rhs + ")");
	}

	// ***********************************************************************************************
	// *** Externalization
	// ***********************************************************************************************
	/**
	 * Default constructor used by Externalization.
	 */
	public AssignmentOperation() {
	}

	@Override
	public void writeExternal(ObjectOutput oupt) throws IOException {
		Util.TRACE_OUTPUT("BEGIN Write "+this.getClass().getSimpleName());
		if(!Option.NEW_ATTR_FILE)
			oupt.writeBoolean(CHECKED);
		oupt.writeInt(lineNumber);
		Type.outType(type,oupt);
		oupt.writeObject(backLink);
		oupt.writeObject(lhs);
		oupt.writeObject(opr);
		oupt.writeObject(rhs);
	}
	
	@Override
	public void readExternal(ObjectInput inpt) throws IOException, ClassNotFoundException {
		Util.TRACE_INPUT("BEGIN Read "+this.getClass().getSimpleName());
		if(!Option.NEW_ATTR_FILE)
			CHECKED=inpt.readBoolean();
		lineNumber = inpt.readInt();
		type = Type.inType(inpt);
		backLink = (SyntaxClass) inpt.readObject();
		lhs = (Expression) inpt.readObject();
		opr = (KeyWord) inpt.readObject();
		rhs = (Expression) inpt.readObject();
	}
	

}
