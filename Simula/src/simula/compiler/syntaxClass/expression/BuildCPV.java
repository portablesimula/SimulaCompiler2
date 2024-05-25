package simula.compiler.syntaxClass.expression;

import java.lang.classfile.CodeBuilder;
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import java.lang.constant.ClassDesc;
import java.lang.constant.MethodTypeDesc;
import java.util.Iterator;

import simula.compiler.syntaxClass.SyntaxClass;
import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.declaration.BlockDeclaration;
import simula.compiler.syntaxClass.declaration.Declaration;
import simula.compiler.syntaxClass.declaration.Parameter;
import simula.compiler.syntaxClass.declaration.ProcedureDeclaration;
import simula.compiler.syntaxClass.declaration.ProcedureSpecification;
import simula.compiler.syntaxClass.declaration.Thunk;
import simula.compiler.syntaxClass.declaration.VirtualSpecification;
import simula.compiler.utilities.CD;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.Meaning;

public class BuildCPV {

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
			variable.buildIdentifierAccess(false, codeBuilder);
			codeBuilder
//				.aload(0)
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
		    	ClassDesc owner = meaning.declaredIn.getClassDesc();
		    	inspectedVariable.buildIdentifierAccess(false, codeBuilder);
				codeBuilder
//					.aload(0)
					.getfield(pool.fieldRefEntry(BlockDeclaration.currentClassDesc(), inspectedVariable.getJavaIdentifier(), inspectedVariable.type.toClassDesc()))
					.invokevirtual(pool.methodRefEntry(owner, ident, MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_PRCQNT;")));
//			    BuildCPF.buildCPF(variable,virtual.procedureSpec,codeBuilder);
				if(virtual.procedureSpec != null) {
					BuildCPV.buildCSVP(variable, virtual.procedureSpec, codeBuilder);					
				} else {
					BuildCPF.buildCPF(variable, codeBuilder);
				}
			    
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
		    	ClassDesc owner = meaning.declaredIn.getClassDesc();
				codeBuilder
					.invokevirtual(pool.methodRefEntry(owner, ident, MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_PRCQNT;")));
				
				if(virtual.procedureSpec != null)
					 buildCSVP(variable, virtual.procedureSpec, codeBuilder);					
				else BuildCPF.buildCPF(variable, codeBuilder);
				
			    if(variable.backLink == null) codeBuilder.pop();
		    }
	    }
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
		
		if(virtual.procedureSpec != null)
			 buildCSVP(variable, virtual.procedureSpec, codeBuilder);					
		else BuildCPF.buildCPF(variable, codeBuilder);
		
	    if(backLink == null) codeBuilder.pop();
	}
	
	// ********************************************************************
	// *** codeCSVP  -- Call Specified Virtual Procedure
	// ********************************************************************
	/**
	 * Coding Utility: Build Call Specified Virtual Procedure.
	 * @param ident the procedure identifier
	 * @param variable the procedure variable
	 * @param procedureSpec the procedure spec
	 * @param codeBuilder the CodeBuilder
	 */
	static void buildCSVP(final VariableExpression variable,final ProcedureSpecification procedureSpec,CodeBuilder codeBuilder) {
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
		BuildCPF.maybeBuildLoad_RESULT(variable, codeBuilder);
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

}
