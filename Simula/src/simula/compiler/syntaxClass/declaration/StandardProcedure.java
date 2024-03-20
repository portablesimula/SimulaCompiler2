/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass.declaration;

import java.lang.constant.MethodTypeDesc;
import java.util.Vector;

import simula.compiler.syntaxClass.OverLoad;
import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.expression.Expression;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * Standard Procedure.
 * <p>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/declaration/StandardProcedure.java">
 * <b>Source File</b></a>.
 * 
 * @author Øystein Myhre Andersen
 */
public final class StandardProcedure extends ProcedureDeclaration {
	
	/**
	 * Create a new StandardProcedure without parameters.
	 * @param declaredIn the enclosing scope
	 * @param kind the declaration kind
	 * @param type the procedure's type
	 * @param ident the procedure identifier
	 */
	StandardProcedure(DeclarationScope declaredIn,Declaration.Kind kind,Type type, String ident) {
		super(ident,kind); this.declaredIn=declaredIn; this.type=type; }

	/**
	 * Create a new StandardProcedure with parameters.
	 * @param declaredIn the enclosing scope
	 * @param kind the declaration kind
	 * @param type the procuedre's type
	 * @param ident the procedure identifier
	 * @param param the parameters
	 */
	StandardProcedure(DeclarationScope declaredIn,Declaration.Kind kind,Type type, String ident,Parameter... param) {
		this(declaredIn,kind,type,ident);
		for(int i=0;i<param.length;i++) param[i].into(parameterList); }

	@Override
	public void doChecking() {
		if(IS_SEMANTICS_CHECKED()) return;
		Global.enterScope(this);
		Global.sourceLineNumber=lineNumber;
		String name=this.getClass().getSimpleName();
		if(Option.TRACE_CHECKER) Util.TRACE("BEGIN "+name+".doChecking");
		Global.exitScope();
		if(Option.TRACE_CHECKER) Util.TRACE("END StandardProcedure("+toString()+").doChecking - Result type="+this.type);
		SET_SEMANTICS_CHECKED();
	}
	
	public MethodTypeDesc getMethodTypeDesc(Expression beforeDot,Vector<Expression> params) {
		return(MethodTypeDesc.ofDescriptor(this.edMethodTypeDesc(beforeDot,params)));
	}
	private String edMethodTypeDesc(Expression beforeDot,Vector<Expression> params) {
		// MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_Printfile;");
		StringBuilder sb=new StringBuilder("(");
		if(beforeDot != null) {
//			sb.append(beforeDot.type.toJVMType());
			if(beforeDot.type instanceof OverLoad ovl) {
				boolean found=false;
				for(Type alt:ovl.type) {
					if(beforeDot.type.equals(alt)) {
						found=true;
						sb.append(beforeDot.type.toJVMType());
					}
				} if(!found) Util.IERR("OverLoad");
			} else sb.append(beforeDot.type.toJVMType());
		}
		if(parameterList!=null) for(int i=0;i<parameterList.size();i++) {
			Parameter par = parameterList.get(i);
///			System.out.println("StandardProcedure.edMethodTypeDesc: par="+par.kind);
			if(par.mode == Parameter.Mode.name) {
				sb.append("Lsimula/runtime/RTS_NAME;");
			} else if(par.kind == Parameter.Kind.Array) {
				sb.append("Lsimula/runtime/RTS_ARRAY;");				
			} else if(par.type instanceof OverLoad ovl) {
				boolean found=false;
				for(Type alt:ovl.type) {
					if(params.get(i).type.equals(alt)) {
						found=true;
						sb.append(params.get(i).type.toJVMType());
					}
				} if(!found) Util.IERR("OverLoad: "+ this);
			} else sb.append(par.type.toJVMType());
		}
		String id=identifier;
		if(id.equals("detach") | id.equals("call") | id.equals("resume")) {
			// Push extra parameter 'sourceLineNumber'
			Parameter lno=new Parameter(id,Type.Integer,Parameter.Kind.Simple);
			sb.append(lno.type.toJVMType());
//			System.out.println("StandardProcedure.edMethodTypeDesc: ExtraPar: "+id);
		}
		sb.append(')');
		if(this.type != null) {
			if(this.type instanceof OverLoad ovl) {
				boolean found=false;
				Type params1Type = params.get(0).type;
				for(Type alt:ovl.type) {
					if(params1Type.equals(alt)) {
						found=true;
						sb.append(params1Type.toJVMType());
					}
				} if(!found) Util.IERR("OverLoad");
			} else sb.append(this.type.toJVMType());
		} else sb.append('V');
//		System.out.println("StandardProcedure.edMethodTypeDesc: "+this.identifier+" ==> res="+sb);
//		Util.IERR("");
		return(sb.toString());
	}

	@Override
	public String toString() {
		String pfx=""; if(type!=null) pfx=type.toString()+" ";
		return(pfx+"PROCEDURE "+identifier);
	}


	// ***********************************************************************************************
	// *** Externalization
	// ***********************************************************************************************
	/**
	 * Default constructor used by Externalization.
	 */
	public StandardProcedure() {}

}
