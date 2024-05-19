/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass.expression;

import java.lang.constant.ClassDesc;
import java.lang.constant.MethodTypeDesc;
import java.util.Iterator;
import java.util.Vector;
import java.lang.classfile.CodeBuilder;
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import simula.compiler.syntaxClass.SyntaxClass;
import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.declaration.*;
import simula.compiler.utilities.CD;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.Meaning;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Util;

/**
 * Coding Utilities: Call Procedure
 * <p>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/expression/BuildProcedureCall.java">
 * <b>Source File</b></a>.
 * 
 * @author Øystein Myhre Andersen
 *
 */
public final class BuildProcedureCall {
	/**
	 * Default constructor.
	 */
	BuildProcedureCall(){}

	// ********************************************************************
	// *** BuildProcedureCall.normal
	// ********************************************************************
	/**
	 * BuildProcedureCall.normal
	 * 
	 * @param variable the procedure variable
	 * @param codeBuilder the CodeBuilder
	 */
	static void normal(final VariableExpression variable,final ProcedureDeclaration prc,final CodeBuilder codeBuilder) {
		//  	kkk := P(444);
		// ==>  kkk=new adHoc00_P((_CUR),444)._RESULT;
		//
		//    1: new           #46                 // class simulaTestPrograms/adHoc00_P
		// *  4: dup
		//    5: getstatic     #48                 // Field _CUR:Lsimula/runtime/RTS_RTObject;
		//    8: sipush        444
		//   11: invokespecial #51                 // Method simulaTestPrograms/adHoc00_P."<init>":(Lsimula/runtime/RTS_RTObject;I)V
		//-* 14: pop
		// * 14: getfield      #54                 // Field simulaTestPrograms/adHoc00_P._RESULT:I
		ClassDesc CD_prc=prc.getClassDesc();
		codeBuilder
			.new_(CD_prc)
			.dup();
		variable.meaning.buildQualifiedStaticLink(codeBuilder); // SL
		// Push parameters
		if(variable.checkedParams != null) {
			int n=variable.checkedParams.size();
			for(int i=0;i<n;i++) {
				Parameter p=prc.parameterList.get(i);
				p.buildParamCode(codeBuilder, variable.checkedParams.get(i));
			}
		}
		codeBuilder.invokespecial(CD_prc, "<init>", prc.getConstructorMethodTypeDesc());
		SyntaxClass backLink = variable.backLink;
		if(prc.type != null && backLink != null) {
			codeBuilder.getfield(prc.getResultFieldRefEntry(codeBuilder.constantPool()));
		} else codeBuilder.pop();
	}

	// ********************************************************************
	// *** BuildProcedureCall.remoteVirtual
	// ********************************************************************
	/**
	 * BuildProcedureCall.remoteVirtual
	 * 
	 * @param obj Object Expression before DOT
	 * @param variable the procedure variable
	 * @param virtual Virtual Specification
	 * @param codeBuilder the CodeBuilder
	 */
	static void remoteVirtual(final Expression obj,final VariableExpression variable,final VirtualSpecification virtual,final SyntaxClass backLink,CodeBuilder codeBuilder) {
		//return("<Object>.<IDENT>.CPF().setPar(4).setpar(3.14)._ENT()");

		ConstantPoolBuilder pool=codeBuilder.constantPool();
	    String ident=virtual.getSimpleVirtualIdentifier();
	    
		prepareForValueType(variable, codeBuilder);

		obj.buildEvaluation(null, codeBuilder);
		
		codeBuilder
			.invokevirtual(pool.methodRefEntry(obj.type.toClassDesc(),
				ident, MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_PRCQNT;")));
		
		buildCPF(variable,virtual.procedureSpec,codeBuilder);
	    if(backLink == null) codeBuilder.pop();
	}
	
	// ********************************************************************
	// *** BuildProcedureCall.remote
	// ********************************************************************
	/**
	 * BuildProcedureCall.remote
	 *   
	 * @param obj Object Expression before DOT
	 * @param procedure Procedure Declaration
	 * @param func Function Designator, may be subscripted
	 * @param backLink if not null, this procedure call is part of the backLink Expression/Statement.
	 * @param codeBuilder the CodeBuilder
	 */
	static void remote(final Expression obj,final ProcedureDeclaration procedure,final VariableExpression func,final SyntaxClass backLink,CodeBuilder codeBuilder) {
		if(procedure.myVirtual!=null) {
			// Call Remote Virtual Procedure
			remoteVirtual(obj,func,procedure.myVirtual.virtualSpec,backLink,codeBuilder);
		} else if(procedure.declarationKind==ObjectKind.ContextFreeMethod) {
			// Call Remote Method
			Util.IERR();
		} else if(procedure.declarationKind==ObjectKind.MemberMethod) {
			// Call Remote Method
			asRemoteMethod(obj,procedure,func,codeBuilder);
		} else {
			ClassDesc CD_prc=procedure.getClassDesc();
			codeBuilder
				.new_(CD_prc)
				.dup();
			obj.buildEvaluation(null,codeBuilder);
			// Push parameters
			if(func.checkedParams != null) {
				int n=func.checkedParams.size();
				for(int i=0;i<n;i++) {
					Parameter p=procedure.parameterList.get(i);
					p.buildParamCode(codeBuilder, func.checkedParams.get(i));
				}
			}
			RemoteVariable remVar=(RemoteVariable)func.backLink;
			codeBuilder.invokespecial(CD_prc, "<init>", procedure.getConstructorMethodTypeDesc());
			if(remVar.backLink != null && procedure.type != null)
				 codeBuilder.getfield(procedure.getResultFieldRefEntry(codeBuilder.constantPool()));
			else codeBuilder.pop();
		}
	}

	
	// ********************************************************************
	// *** BuildProcedureCall.asRemoteMethod
	// ********************************************************************
	/**
	 * BuildProcedureCall.remote
	 *   
	 * @param obj Object Expression before DOT
	 * @param pro Procedure Declaration
	 * @param func Function Designator, may be subscripted
	 * @param codeBuilder the CodeBuilder
	 */
	private static void asRemoteMethod(final Expression obj, final ProcedureDeclaration pro, final VariableExpression func,CodeBuilder codeBuilder) {
		BlockDeclaration declaredIn = (BlockDeclaration)pro.declaredIn;
		if(declaredIn.declarationKind == ObjectKind.StandardClass) {
			// Call Standard Member Method
			callRemoteStandardProcedure(obj,(StandardProcedure) pro,func,codeBuilder);
			if(pro.type != null) {
				SyntaxClass backLink = obj.backLink;
				if(backLink instanceof QualifiedObject qua)	backLink = qua.backLink;
				if(backLink instanceof RemoteVariable rem)	backLink = rem.backLink;
				if(backLink == null) codeBuilder.pop();
			}
		} else
			Util.IERR();
	}


	// ********************************************************************
	// *** BuildProcedureCall.callStandardTextProcedure
	// ********************************************************************
	/**
	 * callStandardTextProcedure
	 *
	 */
	public static void callStandardTextProcedure(Expression beforeDot,StandardProcedure pro,final VariableExpression variable, Object backLink,CodeBuilder codeBuilder) {
		beforeDot.buildEvaluation(null,codeBuilder);
		if(variable.checkedParams != null) 
			for(Expression expr:variable.checkedParams)
				expr.buildEvaluation(null,codeBuilder);

		codeBuilder.invokestatic(CD.RTS_TXT, pro.identifier, pro.getMethodTypeDesc(beforeDot,variable.checkedParams));
		if(pro.type != null && backLink == null) {
			codeBuilder.pop();
		}
	}


	// ********************************************************************
	// *** BuildProcedureCall.callRemoteStandardProcedure
	// ********************************************************************
	/**
	 * callRemoteStandardProcedure
	 *
	 */
	private static void callRemoteStandardProcedure(Expression beforeDot,StandardProcedure pro,final VariableExpression variable,CodeBuilder codeBuilder) {
		if (beforeDot instanceof VariableExpression var) {
			Declaration remoteQual = var.meaning.declaredAs;
			if (remoteQual instanceof StandardProcedure prx) {
				BlockDeclaration declaredIn = (BlockDeclaration) var.meaning.declaredIn;
				ClassDesc owner = declaredIn.getClassDesc();
				codeBuilder.invokestatic(owner, prx.identifier, prx.getMethodTypeDesc(null,variable.checkedParams));
			} else beforeDot.buildEvaluation(null, codeBuilder);
		} else beforeDot.buildEvaluation(null, codeBuilder);
		// PUSH Parameter values onto the stack
		checkForExtraParameter(variable);
		if(variable.checkedParams != null) for(Expression par:variable.checkedParams) {
			par.buildEvaluation(null,codeBuilder);
		}
		ClassDesc owner=ClassDesc.of("simula.runtime."+pro.declaredIn.externalIdent);
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		codeBuilder.invokevirtual(pool.methodRefEntry(owner, pro.identifier, pro.getMethodTypeDesc(null,variable.checkedParams)));
		if(pro.type != null && variable.backLink == null)
			codeBuilder.pop();
	}
	
	// ********************************************************************
	// *** BuildProcedureCall.checkForExtraParameter
	// ********************************************************************
	/**
	 * checkForExtraParameter
	 *
	 */
	private static boolean checkForExtraParameter(VariableExpression variable) {
		String id = variable.identifier;
		if (id.equals("detach")) {
			variable.checkedParams = new Vector<Expression>();
			// Push extra parameter 'sourceLineNumber'
			Constant c = new Constant(Type.Integer, variable.lineNumber);
			variable.checkedParams.add(c);
			return true;
		} else if( id.equals("call") | id.equals("resume")) {
			if(variable.checkedParams.size() == 1) {
				// Push extra parameter 'sourceLineNumber'
				Constant c = new Constant(Type.Integer, variable.lineNumber);
				variable.checkedParams.add(c);
				return true;
			}
		}
		return false;
	}


	// ********************************************************************
	// *** BuildProcedureCall.callStandardProcedure
	// ********************************************************************
	/**
	 * callStandardProcedure
	 *
	 */
	static void callStandardProcedure(final VariableExpression variable,CodeBuilder codeBuilder) {
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		Meaning meaning=variable.meaning;
		StandardProcedure pro = (StandardProcedure) meaning.declaredAs;
		if(pro.declarationKind == ObjectKind.MemberMethod) { // EG: File attribute procedure
			if (meaning.isConnected()) {
				Expression inspectedVariable = ((ConnectionBlock) meaning.declaredIn).getInspectedExpression();
				callRemoteStandardProcedure(inspectedVariable, pro, variable, codeBuilder);
			} else {
				// PUSH Parameter values onto the stack
				boolean xpar = checkForExtraParameter(variable);
				boolean withFollowSL = meaning.declaredIn.buildCTX(codeBuilder);
				if(withFollowSL) codeBuilder.checkcast(meaning.declaredIn.getClassDesc());
				if (variable.checkedParams != null) {
					if(xpar) {
						for (Expression par : variable.checkedParams)
							par.buildEvaluation(null,codeBuilder);
					} else {
						int n=variable.checkedParams.size();
						for(int i=0;i<n;i++) {
							Parameter p=pro.parameterList.get(i);
							p.buildParamCode(codeBuilder, variable.checkedParams.get(i));
						}
					}
				}
				ClassDesc owner = meaning.declaredIn.getClassDesc();
				codeBuilder.invokevirtual(pool.methodRefEntry(owner, pro.identifier, pro.getMethodTypeDesc(null,variable.checkedParams)));
				if(pro.type != null && variable.backLink == null)
					codeBuilder.pop();
			}
		} else if(pro.declarationKind == ObjectKind.ContextFreeMethod) {
			// PUSH Parameter values onto the stack
			if (variable.checkedParams != null) {
				int n=variable.checkedParams.size();
				for(int i=0;i<n;i++) {
					Parameter par = pro.parameterList.get(i);
					Expression expr = variable.checkedParams.get(i);
					par.buildParamCode(codeBuilder,expr);
				}
			}
			DeclarationScope declaredIn = variable.meaning.declaredIn;
			ClassDesc owner = declaredIn.getClassDesc();
			MethodTypeDesc MTD = null;
			if(pro.identifier.equalsIgnoreCase("histd")) {
				MTD = MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_REALTYPE_ARRAY;Lsimula/runtime/RTS_NAME;)I");
			} else if(pro.identifier.equalsIgnoreCase("discrete")) {
				MTD = MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_REALTYPE_ARRAY;Lsimula/runtime/RTS_NAME;)I");
			} else if(pro.identifier.equalsIgnoreCase("linear")) {
				MTD = MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_REALTYPE_ARRAY;Lsimula/runtime/RTS_REALTYPE_ARRAY;Lsimula/runtime/RTS_NAME;)D");
			} else MTD = pro.getMethodTypeDesc(null,variable.checkedParams);
			codeBuilder.invokestatic(owner, pro.identifier, MTD);
			if(pro.type != null && variable.backLink == null)
				codeBuilder.pop();
		} else
			Util.IERR();
	}

	// ********************************************************************
	// *** BuildProcedureCall.asNormalMethod
	// ********************************************************************
	/**
	 * BuildProcedureCall.asNormalMethod
	 *
	 * @param variable the procedure variable
	 */

	static void asNormalMethod(final VariableExpression variable,CodeBuilder codeBuilder) {
		Meaning meaning=variable.meaning;
		ProcedureDeclaration procedure = (ProcedureDeclaration) meaning.declaredAs;
		if(meaning.declaredAs instanceof StandardProcedure) {
			callStandardProcedure(variable,codeBuilder);
		} else { // Normal Simula Procedure
			//      P(777);
			// ==>  new adHoc00_P((_CUR),777);
			//
			//   0: new           #46                 // class simulaTestPrograms/adHoc00_P
			//   3: getstatic     #48                 // Field _CUR:Lsimula/runtime/RTS_RTObject;
			//   6: sipush        777
			//   9: invokespecial #51                 // Method simulaTestPrograms/adHoc00_P."<init>":(Lsimula/runtime/RTS_RTObject;I)V
			//
			//  	kkk := P(444);
			// ==>  kkk=new adHoc00_P((_CUR),444)._RESULT;
			//
			//    1: new           #46                 // class simulaTestPrograms/adHoc00_P
			// *  4: dup
			//    5: getstatic     #48                 // Field _CUR:Lsimula/runtime/RTS_RTObject;
			//    8: sipush        444
			//   11: invokespecial #51                 // Method simulaTestPrograms/adHoc00_P."<init>":(Lsimula/runtime/RTS_RTObject;I)V
			// * 14: getfield      #54                 // Field simulaTestPrograms/adHoc00_P._RESULT:I
			ClassDesc CD_prc=procedure.getClassDesc();
			codeBuilder.new_(CD_prc);
			if(variable.backLink != null) codeBuilder.dup();
			codeBuilder.getstatic(CD.RTS_RTObject,"_CUR",CD.RTS_RTObject);

			// Push parameters
			for(Expression expr:variable.checkedParams)
				expr.buildEvaluation(null,codeBuilder);

			codeBuilder.invokespecial(CD_prc, "<init>", procedure.getConstructorMethodTypeDesc());
			ConstantPoolBuilder pool=codeBuilder.constantPool();
			
			if(variable.backLink != null)
				codeBuilder.getfield(procedure.getResultFieldRefEntry(pool));
		}
	}

	// ********************************************************************
	// *** BuildProcedureCall.formal
	// ********************************************************************
	/**
	 * BuildProcedureCall.formal
	 * 
	 * @param variable the procedure variable
	 * @param par declared as parameter 'par'
	 * @param codeBuilder the CodeBuilder
	 */
	static void formal(final VariableExpression variable,final Parameter par,CodeBuilder codeBuilder) {
		//return("<IDENT>.CPF().setPar(4).setpar(3.14)._ENT()");
		SyntaxClass backLink = variable.backLink;
		if(backLink instanceof RemoteVariable rem) backLink = rem.backLink;
		Declaration decl=variable.meaning.declaredAs;
		if(decl.type != null && backLink != null) {
			codeBuilder.aload(0);
		}

		variable.buildIdentifierAccess(false, codeBuilder);

		ConstantPoolBuilder pool=codeBuilder.constantPool();
		codeBuilder.getfield(par.getFieldRefEntry(pool));			
		if(par.mode == Parameter.Mode.name) {
			codeBuilder
				.invokevirtual(pool.methodRefEntry(CD.RTS_NAME, "get", MethodTypeDesc.ofDescriptor("()Ljava/lang/Object;")))
				.checkcast(CD.RTS_PRCQNT);
		}
		buildCPF(variable,null,codeBuilder);
	}

	// ********************************************************************
	// *** BuildProcedureCall.virtual
	// ********************************************************************
	/**
	 * BuildProcedureCall.virtual
	 * 
	 * @param variable the procedure variable
	 * @param virtual the virtual specification
	 * @param remotelyAccessed true if remotely accessed.
	 * @param codeBuilder the CodeBuilder
	 */
	static void virtual(final VariableExpression variable,final VirtualSpecification virtual,final boolean remotelyAccessed,CodeBuilder codeBuilder) {
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		//return("<IDENT>.CPF().setPar(4).setpar(3.14)._ENT()");
	    String ident=virtual.getSimpleVirtualIdentifier();
	    
	    if(virtual.kind==VirtualSpecification.Kind.Label) {
	    	// 	return(ident);
	        // 1: aload_0
	        // 2: invokevirtual #20                 // Method L_0:()Lsimula/runtime/RTS_LABEL;
			ClassDesc owner = BlockDeclaration.currentClassDesc();
			codeBuilder
				.aload(0)
				.invokevirtual(pool.methodRefEntry(owner, ident, MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_LABEL;")));

	    } else {
		    Meaning meaning = variable.meaning;
			prepareForValueType(variable, codeBuilder);
	    	if(meaning.isConnected()) {
	    		// String conn=variable.meaning.declaredIn.toJavaCode();
	    		// ident=conn+"."+ident;
	    		// 32: aload_0
	    		// 33: getfield      #17                 // Field _inspect_21_0:LsimulaTestPrograms/adHoc00_A;
	    		// 36: invokevirtual #37                 // Method simulaTestPrograms/adHoc00_A.P1_0:()Lsimula/runtime/RTS_PRCQNT;
	    		// 39: invokevirtual #43                 // Method simula/runtime/RTS_PRCQNT.CPF:()Lsimula/runtime/RTS_PROCEDURE;
	    		// 42: pop
		    	VariableExpression inspectedVariable = meaning.getInspectedVariable();
				codeBuilder
					.aload(0)
					.getfield(pool.fieldRefEntry(BlockDeclaration.currentClassDesc(), inspectedVariable.getJavaIdentifier(), inspectedVariable.type.toClassDesc()))
					.invokevirtual(pool.methodRefEntry(meaning.declaredIn.getClassDesc(),
						ident, MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_PRCQNT;")));
			    buildCPF(variable,virtual.procedureSpec,codeBuilder);
			    
			    ProcedureDeclaration prc=(ProcedureDeclaration)meaning.declaredAs;
				if(prc.type == null || variable.backLink == null)
					codeBuilder.pop();
	
		    } else {
		        //  0: getstatic     #7                  // Field _CUR:Lsimula/runtime/RTS_RTObject;
		        //  3: checkcast     #8                  // class simulaTestPrograms/adHoc000_PBLK20
		        //  6: invokevirtual #13                 // Method P1_0:()Lsimula/runtime/RTS_PRCQNT;
		        //  9: invokevirtual #17                 // Method simula/runtime/RTS_PRCQNT.CPF:()Lsimula/runtime/RTS_PROCEDURE;
		        // 12: pop
				boolean withFollowSL = meaning.declaredIn.buildCTX(codeBuilder);
				if(withFollowSL) codeBuilder.checkcast(meaning.declaredIn.getClassDesc());
				codeBuilder
					.invokevirtual(pool.methodRefEntry(meaning.declaredIn.getClassDesc(),
						ident, MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_PRCQNT;")));
			    buildCPF(variable,virtual.procedureSpec,codeBuilder);
			    if(variable.backLink == null) codeBuilder.pop();
		    }
	    }
	}
	
	// ********************************************************************
	// *** prepareForValueType
	// ********************************************************************
	private static void prepareForValueType(final VariableExpression variable, CodeBuilder codeBuilder) {
	    // Prepare for possible _RESULT to Object conversion in buildCPF.
		Declaration decl=variable.meaning.declaredAs;
		if(decl.type != null && decl.type.isValueType() && variable.backLink != null) {
			codeBuilder.aload(0);
			if(Global.getCurrentScope() instanceof Thunk thunk) {
				codeBuilder
					.getfield(CD.RTS_NAME,"_CUR",CD.RTS_RTObject)
					.checkcast(thunk.declaredIn.getClassDesc());
			}
		}
	}
	
	// ********************************************************************
	// *** buildCPF
	// ********************************************************************
	/**
	 * Coding Utility: Edit Call Procedure Formal.
	 * @param ident the procedure identifier
	 * @param variable the procedure variable
	 * @param procedureSpec the procedure spec
	 * @return the resulting Java source code
	 */
	private static void buildCPF(final VariableExpression variable,final ProcedureSpecification procedureSpec,CodeBuilder codeBuilder) {
		if(procedureSpec!=null) {
			buildCSVP(variable, procedureSpec, codeBuilder);
			return;
		}
		
//		s.append(ident).append(".CPF()");
//	    p_SFD.CPF().setPar(new RTS_NAME<Integer>(){ public Integer get() { return(1); } })._ENT();
//		0: aload_0
//		1: getfield      #11                 // Field p_SFD:Lsimula/runtime/RTS_PRCQNT;
//		4: invokevirtual #54                 // Method simula/runtime/RTS_PRCQNT.CPF:()Lsimula/runtime/RTS_PROCEDURE;
			
//		7: new           #60                 // class simulaTestPrograms/adHoc000_R$1
//		10: dup
//		11: aload_0
//		12: invokespecial #62                 // Method simulaTestPrograms/adHoc000_R$1."<init>":(LsimulaTestPrograms/adHoc000_R;)V
//		15: invokevirtual #65                 // Method simula/runtime/RTS_PROCEDURE.setPar:(Ljava/lang/Object;)Lsimula/runtime/RTS_PROCEDURE;
			
//		18: invokevirtual #69                 // Method simula/runtime/RTS_PROCEDURE._ENT:()Lsimula/runtime/RTS_PROCEDURE;
//		21: pop
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		codeBuilder.invokevirtual(pool.methodRefEntry(CD.RTS_PRCQNT,
			"CPF", MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_PROCEDURE;")));

		if(variable.hasArguments()) {
			for(int i=0;i<variable.checkedParams.size();i++) {
				Expression actualParameter = variable.checkedParams.get(i);
				actualParameter.backLink=actualParameter;  // To ensure _RESULT from functions
				Type formalType=actualParameter.type;
				int kind=Parameter.Kind.Simple;  // Default, see below
				if((actualParameter instanceof VariableExpression var) && !var.hasArguments()) {
					Declaration decl=var.meaning.declaredAs;
					if(decl instanceof StandardProcedure) {
						if(Util.equals(decl.identifier, "sourceline")) {
							actualParameter=new Constant(Type.Integer,actualParameter.lineNumber);
							actualParameter.doChecking();
						}
					}
					switch(decl.declarationKind) {
						case ObjectKind.SimpleVariableDeclaration -> kind=Parameter.Kind.Simple;
						case ObjectKind.Parameter -> kind=((Parameter)decl).kind;
						case ObjectKind.Procedure -> kind=Parameter.Kind.Procedure;
						case ObjectKind.ContextFreeMethod -> kind=Parameter.Kind.Simple;
						case ObjectKind.ArrayDeclaration -> kind=Parameter.Kind.Array;
						case ObjectKind.LabelDeclaration -> kind=Parameter.Kind.Label;
						case ObjectKind.Class -> kind=Parameter.Kind.Simple; // Error Recovery
						default -> Util.IERR("Flere sånne tilfeller ??? " + ObjectKind.edit(decl.declarationKind));
					}
				}
					
				int mode=Parameter.Mode.name; // NOTE: ALL PARAMETERS BY'NAME !!!
				if(procedureSpec!=null) {
					Parameter p = procedureSpec.parameterList.get(i);
					mode = p.mode;
				}
				buildParameterTransmition(formalType,kind,mode,actualParameter,codeBuilder);
				codeBuilder.invokevirtual(pool.methodRefEntry(CD.RTS_PROCEDURE,
					"setPar", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)Lsimula/runtime/RTS_PROCEDURE;")));
			}
			// s.append("._ENT()"); // Only when any parameter
			codeBuilder.invokevirtual(pool.methodRefEntry(CD.RTS_PROCEDURE,
				"_ENT", MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_PROCEDURE;")));
		}
		maybeBuildLoad_RESULT(variable, codeBuilder);
	}
	
	private static void maybeBuildLoad_RESULT(VariableExpression variable, CodeBuilder codeBuilder) {
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		
		SyntaxClass backLink = variable.backLink;
		if(backLink instanceof RemoteVariable rem) backLink = rem.backLink;
		Declaration proc=variable.meaning.declaredAs;
		if(proc.type != null && backLink != null) {
			codeBuilder.invokevirtual(pool.methodRefEntry(CD.RTS_PROCEDURE,
					"_RESULT", MethodTypeDesc.ofDescriptor("()Ljava/lang/Object;")));
			proc.type.checkCast(codeBuilder);
			proc.type.objectToPrimitiveType(codeBuilder);
		}
	}
	
	// ********************************************************************
	// *** codeCSVP  -- Call Specified Virtual Procedure
	// ********************************************************************
	/**
	 * Coding Utility: Edit Call Specified Virtual Procedure.
	 * @param ident the procedure identifier
	 * @param variable the procedure variable
	 * @param procedureSpec the procedure spec
	 * @param codeBuilder the CodeBuilder
	 */
	private static void buildCSVP(final VariableExpression variable,final ProcedureSpecification procedureSpec,CodeBuilder codeBuilder) {
//        25: invokevirtual #46                 // Method simula/runtime/RTS_PRCQNT.CPF:()Lsimula/runtime/RTS_PROCEDURE;
		
//        28: bipush        7
//        30: invokestatic  #52                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
//        33: invokevirtual #58                 // Method simula/runtime/RTS_PROCEDURE.setPar:(Ljava/lang/Object;)Lsimula/runtime/RTS_PROCEDURE;
		
//        36: bipush        21
//        38: invokestatic  #52                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
//        41: invokevirtual #58                 // Method simula/runtime/RTS_PROCEDURE.setPar:(Ljava/lang/Object;)Lsimula/runtime/RTS_PROCEDURE;
		
//        44: invokevirtual #64                 // Method simula/runtime/RTS_PROCEDURE._ENT:()Lsimula/runtime/RTS_PROCEDURE;
//        47: invokevirtual #67                 // Method simula/runtime/RTS_PROCEDURE._RESULT:()Ljava/lang/Object;
//        50: checkcast     #71                 // class simula/runtime/RTS_File

		
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		codeBuilder.invokevirtual(pool.methodRefEntry(CD.RTS_PRCQNT,
				"CPF", MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_PROCEDURE;")));

		if (variable.hasArguments()) {
			Iterator<Parameter> formalIterator = procedureSpec.parameterList.iterator();
			Iterator<Expression> actualIterator = variable.checkedParams.iterator();
			while (actualIterator.hasNext()) {
				Expression actualParameter = actualIterator.next();
				Parameter formalParameter = (Parameter) formalIterator.next();
				Type formalType = formalParameter.type;
				actualParameter = TypeConversion.testAndCreate(formalType, actualParameter);
				actualParameter.buildEvaluation(null, codeBuilder);
				formalType.buildObjectValueOf(codeBuilder);

				// s.append(".setPar(");
				codeBuilder.invokevirtual(pool.methodRefEntry(CD.RTS_PROCEDURE,
						"setPar", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)Lsimula/runtime/RTS_PROCEDURE;")));
			}
			// s.append("._ENT()"); // Only when any parameter
			codeBuilder.invokevirtual(pool.methodRefEntry(CD.RTS_PROCEDURE,
					"_ENT", MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_PROCEDURE;")));
		}
		maybeBuildLoad_RESULT(variable, codeBuilder);
	}
	
	// ********************************************************************
	// *** doParameterTransmition
	// ********************************************************************
    /**
     * Coding Utility: Edit parameter transmission,
     * @param formalType parameter's formal type
     * @param kind parameter's kind
     * @param mode parameter's transmission mode
     * @param apar the actual parameter
     * @param codeBuilder the CodeBuilder
     */
	private static void buildParameterTransmition(final Type formalType,final int kind,final int mode,final Expression apar,CodeBuilder codeBuilder) {
		switch(kind) {
		    case Parameter.Kind.Simple -> buildSimpleParameter(formalType,kind,mode,apar,codeBuilder);
		    case Parameter.Kind.Procedure -> buildProcedureParameter(formalType,mode,apar,codeBuilder);
		    case Parameter.Kind.Array -> doArrayParameter(formalType,mode,apar,codeBuilder);
//		    case Parameter.Kind.Label -> {
//		    		String labQuant=apar.toJavaCode();
//		    		if(mode==Parameter.Mode.name) {
//		    			s.append("new RTS_NAME<RTS_LABEL>()");
//		    			s.append("{ public RTS_LABEL get() { return("+labQuant+"); }");  // TODO: SJEKK DETTE
//		    			s.append(" }");
//		    		}
//		    		else s.append(labQuant);
//		    	}
		    default -> throw new IllegalArgumentException("Unexpected value: " + kind);
		}
	}

	
	// ********************************************************************
	// *** doSimpleParameter -- Simple Variable as Actual Parameter
	// ********************************************************************
	/**
	 * Coding Utility: Edit simple parameter into the given StringBuilder. 
	 * 
	 * @param s the StringBuilder
	 * @param formalType the formal type
	 * @param mode the parameter's mode
	 * @param apar actual parameter
	 * @param codeBuilder the CodeBuilder
	 */
	private static void buildSimpleParameter(final Type formalType,final int kind,final int mode,final Expression apar,CodeBuilder codeBuilder) {
//		System.out.println("BuildProcedureCall.buildSimpleParameter: formalType="+formalType+", kind="+kind+", mode="+mode+", apar="+apar);
//	    p_SFD.CPF().setPar(new RTS_NAME<Integer>(){ public Integer get() { return(1); } })._ENT();
		if(mode==0) { // Simple Type/Ref/Text by Default
//		  	s.append(apar.toJavaCode());
			Util.IERR();
		} else if(mode==Parameter.Mode.value) { // Simple Type/Ref/Text by Value
		        if(formalType.keyWord == Type.T_TEXT) {
//		    	     s.append("copy(").append(apar.toJavaCode()).append(')');
		        	Util.IERR();
		        } else {
//		        	s.append(apar.toJavaCode());
		        	apar.buildEvaluation(null, codeBuilder);
		        	apar.type.buildObjectValueOf(codeBuilder);
		        }
		} else if(formalType.keyWord == Type.T_LABEL) {
//		    	String labQuant=apar.toJavaCode();
//		    	if(mode==Parameter.Mode.name) {
//			    	  s.append("new RTS_NAME<RTS_LABEL>()");
//				      s.append("{ public RTS_LABEL get() { return("+labQuant+"); }");  // TODO: SJEKK DETTE
//				      s.append(" }");
//			    }
//			    else s.append(labQuant);
			Util.IERR();
		} else { // Simple Type/Ref/Text by Name
			Thunk.buildInvoke(kind, apar, codeBuilder);
		}
	}

	
	// ********************************************************************
	// *** doArrayParameter -- Array as Actual Parameter
	// ********************************************************************
	/**
	 * Coding Utility: Edit Array as Actual Parameter into the given StringBuilder.
	 * @param s the StringBuilder
	 * @param formalType the formal type
	 * @param mode the parameter mode
	 * @param apar actual parameter
	 * @param codeBuilder the CodeBuilder
	 */
	private static void doArrayParameter(final Type formalType,final int mode,final Expression apar,CodeBuilder codeBuilder) {
		if(mode==Parameter.Mode.value) {
//			s.append(apar.toJavaCode()).append(".COPY()");  // TODO: SJEKK DETTE
			Util.IERR();
		}
		else if(mode==Parameter.Mode.name) {
//			s.append("new RTS_NAME<RTS_ARRAY>()");
//			s.append("{ public RTS_ARRAY get() { return("+apar.toJavaCode()+"); }");
//			s.append(" }");	
			
			Thunk.buildInvoke(Parameter.Kind.Array, apar, codeBuilder);
		} else {
//			s.append(apar.toJavaCode());  // TODO: SJEKK DETTE
			Util.IERR();
		}
	}
	
	
	// ********************************************************************
	// *** doProcedureParameter -- Procedure as Actual Parameter
	// ********************************************************************
	/**
	 * Coding Utility: Edit Procedure as Actual Parameter into the given StringBuilder.
	 * @param s the StringBuilder
	 * @param formalType the formal type
	 * @param mode the parameter mode
	 * @param apar actual parameter
	 * @param codeBuilder the CodeBuilder
	 */
	private static void buildProcedureParameter(final Type formalType, final int mode, final Expression apar,CodeBuilder codeBuilder) {
//		String procQuant = edProcedureQuant(apar, codeBuilder);
		if (mode == Parameter.Mode.name) {
			// --- EXAMPLE -------------------------------------------------------------------------
			// r = new ParamSample_Q(this, new RTS_NAME<RTS_PRCQNT>() {
			//     public RTS_PRCQNT get() {
			//         return (new RTS_PRCQNT(ParamSample.this, ParamSample_P.class));
			//     }
			// })._RESULT;
			// -------------------------------------------------------------------------------------
//			s.append("new RTS_NAME<RTS_PRCQNT>()");
//			s.append("{ public RTS_PRCQNT get() { return(" + procQuant + "); }");
//			s.append(" }");
			
			Thunk.buildInvoke(0, apar, codeBuilder);
			
		} else {
			buildProcedureQuant(apar, codeBuilder);
		}
	}
	
	// ********************************************************************
	// *** edProcedureQuant
	// ********************************************************************
	/**
	 * Coding Utility: Edit new procedure quant.
	 * @param apar the actual parameter
	 * @param codeBuilder the CodeBuilder
	 */
	public static void buildProcedureQuant(final Expression apar,CodeBuilder codeBuilder) {
//        0: new           #7                  // class simula/runtime/RTS_PRCQNT
//        3: dup
//        4: getstatic     #9                  // Field simula/runtime/RTS_RTObject._CUR:Lsimula/runtime/RTS_RTObject;
//        7: checkcast     #15                 // class simulaTestPrograms/adHoc000
//       10: ldc           #17                 // class simulaTestPrograms/adHoc000_SWITCH1
//       12: invokespecial #19                 // Method simula/runtime/RTS_PRCQNT."<init>":(Lsimula/runtime/RTS_RTObject;Ljava/lang/Class;)V
		ConstantPoolBuilder pool=codeBuilder.constantPool();
	    if (apar instanceof VariableExpression var) {
			Declaration decl=var.meaning.declaredAs;
	    	String procIdent = decl.getJavaIdentifier();
//			String procQuant = "new RTS_PRCQNT(" + staticLink + "," + procIdent + ".class)";
			if (decl instanceof Parameter par) {
				DeclarationScope curScope=Global.getCurrentScope(); // The current scope. In case of Thunk one level up to Thunk.ENV
				if(curScope instanceof Thunk) curScope = curScope.declaredIn;
				ClassDesc CD_ENV = ClassDesc.of(Global.packetName,curScope.externalIdent);
				codeBuilder
					.aload(0)
					.getfield(CD.RTS_NAME,"_CUR",CD.RTS_RTObject)
					.checkcast(CD_ENV)
					.getfield(par.getFieldRefEntry(pool));
				if (par.mode == Parameter.Mode.name) {
					codeBuilder
						.invokevirtual(pool.methodRefEntry(CD.RTS_NAME, "get", MethodTypeDesc.ofDescriptor("()Ljava/lang/Object;")))
						.checkcast(CD.RTS_PRCQNT);
				}
			} else if (decl instanceof ProcedureDeclaration procedure) {
				if(procedure.myVirtual!=null) {
//    	    		VirtualSpecification vir = procedure.myVirtual.virtualSpec;
//    				procQuant=staticLink+'.'+vir.getVirtualIdentifier();
    				Util.IERR();
    	    	}
    			codeBuilder
    				.new_(CD.RTS_PRCQNT)
    				.dup();
    	    	var.buildIdentifierAccess(false, codeBuilder);
    			codeBuilder
					.ldc(ClassDesc.of(Global.packetName+"."+procIdent))
					.invokespecial(pool.methodRefEntry(CD.RTS_PRCQNT
						,"<init>", MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_RTObject;Ljava/lang/Class;)V")));
			} else if (decl instanceof VirtualSpecification vir) {
//				procQuant=staticLink+'.'+vir.getVirtualIdentifier();  // TODO: SJEKK DETTE
				Util.IERR();
			} else Util.IERR("Flere sånne(1) tilfeller ???  QUAL="+decl.getClass().getSimpleName());
	    } else if (apar instanceof RemoteVariable rem) {
			Declaration decl=rem.var.meaning.declaredAs;
			ClassDesc procIdent = null;
			if (decl instanceof VirtualSpecification vir) {
//				return(staticLink+'.'+vir.getVirtualIdentifier());  // TODO: SJEKK DETTE
				Util.IERR();
			} else if (decl instanceof ProcedureDeclaration procedure) {
    	    	if(procedure.myVirtual!=null) {
//    	    		VirtualSpecification vir = procedure.myVirtual.virtualSpec;  // TODO: SJEKK DETTE
//    				return(staticLink+'.'+vir.getVirtualIdentifier());
    				Util.IERR();
    	    	}
    	    	procIdent = procedure.getClassDesc();
			} else Util.IERR("Flere sånne(2) tilfeller ???  QUAL="+decl.getClass().getSimpleName());
			
//			String procIdent = var.meaning.declaredAs.getJavaIdentifier();
//			return("new RTS_PRCQNT(" + staticLink + "," + procIdent + ".class)");
			codeBuilder
				.new_(CD.RTS_PRCQNT)
				.dup();
			// Check for <ObjectExpression> DOT <Variable>
			rem.obj.buildEvaluation(null,codeBuilder);
			codeBuilder.ldc(procIdent);
			codeBuilder.invokespecial(CD.RTS_PRCQNT
					, "<init>", MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_RTObject;Ljava/lang/Class;)V"));
			
		} else Util.error("Illegal Procedure Expression as Actual Parameter: " + apar);
	}

}
