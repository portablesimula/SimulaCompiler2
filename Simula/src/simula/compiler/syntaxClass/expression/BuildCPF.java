package simula.compiler.syntaxClass.expression;

import java.lang.classfile.CodeBuilder;
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import java.lang.constant.MethodTypeDesc;
import simula.compiler.syntaxClass.SyntaxClass;
import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.declaration.Declaration;
import simula.compiler.syntaxClass.declaration.Parameter;
import simula.compiler.syntaxClass.declaration.StandardProcedure;
import simula.compiler.syntaxClass.declaration.Thunk;
import simula.compiler.utilities.CD;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Util;

public abstract class BuildCPF {

	// ********************************************************************
	// *** BuildCP.formal
	// ********************************************************************
	/**
	 * BuildCP.formal
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
		BuildCPF.buildCPF(variable, codeBuilder);
	}
	
	// ********************************************************************
	// *** buildCPF
	// ********************************************************************
	/**
	 * Coding Utility: Build Call Procedure Formal.
	 * @param variable the procedure variable
	 * @param codeBuilder the CodeBuilder
	 */
	static void buildCPF(final VariableExpression variable, CodeBuilder codeBuilder) {
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
//						case ObjectKind.Switch -> kind=Parameter.Kind.Procedure;
						case ObjectKind.ContextFreeMethod -> kind=Parameter.Kind.Simple;
						case ObjectKind.ArrayDeclaration -> kind=Parameter.Kind.Array;
						case ObjectKind.LabelDeclaration -> kind=Parameter.Kind.Label;
						case ObjectKind.Class -> kind=Parameter.Kind.Simple; // Error Recovery
						default -> Util.IERR();
					}
				}
				
				// Evaluate and set Parameter
				Thunk.buildInvoke(kind, actualParameter, codeBuilder);
				codeBuilder.invokevirtual(pool.methodRefEntry(CD.RTS_PROCEDURE,
					"setPar", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)Lsimula/runtime/RTS_PROCEDURE;")));
			}
			// s.append("._ENT()"); // Only when any parameter
			codeBuilder.invokevirtual(pool.methodRefEntry(CD.RTS_PROCEDURE,
				"_ENT", MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_PROCEDURE;")));
		}
		maybeBuildLoad_RESULT(variable, codeBuilder);
	}
	
	static void maybeBuildLoad_RESULT(VariableExpression variable, CodeBuilder codeBuilder) {
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
	
}
