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
import java.lang.classfile.attribute.SignatureAttribute;
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import java.lang.classfile.constantpool.FieldRefEntry;
import java.lang.constant.ClassDesc;
import java.lang.constant.MethodTypeDesc;
import java.util.Vector;

import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.expression.Expression;
import simula.compiler.syntaxClass.expression.RemoteVariable;
import simula.compiler.syntaxClass.expression.VariableExpression;
import simula.compiler.utilities.CD;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.KeyWord;
import simula.compiler.utilities.Util;
	
/**
 * Parameter Declaration.
 * <p>
 * A parameter models class and procedure parameters.
 * <p>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/declaration/Parameter.java">
 * <b>Source File</b></a>.
 * 
 * @author Øystein Myhre Andersen
 *
 */
public final class Parameter extends Declaration implements Externalizable {
	// String identifier; // Inherited
	// String externalIdent; // Inherited
	// Type type; // Inherited:
	
	/**
	 * Parameter transfer Mode.
	 */
	public Parameter.Mode mode;
	
	/**
	 * Parameter Kind.
	 */
	public Parameter.Kind kind;
	
	/**
	 * Parameter's number of dimension in case of array kind.
	 * Set during doChecking
	 */
	public int nDim = -1;

	/**
	 * Procedure parameter transfer Mode.
	 */
	public enum Mode {
		/**
		 * Parameter transfered by value
		 */
		value,
		/**
		 * Parameter transfered by name
		 */
		name
	}

	/**
	 * Procedure parameter Kind.
	 */
	public enum Kind {
		/**
		 * Simple parameter.
		 */
		Simple,
		/**
		 * Procedure parameter.
		 */
		Procedure,
		/**
		 * Array parameter.
		 */
		Array,
		/**
		 * Label parameter.
		 */
		Label
	}

	/**
	 * Create a new Parameter.
	 * @param identifier parameter identifier
	 */
	Parameter(final String identifier) {
		super(identifier);
		this.declarationKind = Declaration.Kind.Parameter;
	}

	/**
	 * Create a new Parameter.
	 * @param identifier parameter identifier
	 * @param type parameter type
	 * @param kind parameter kind
	 */
	Parameter(final String identifier, final Type type, final Parameter.Kind kind) {
		this(identifier);
		this.type = type;
		this.kind = kind;
	}

	/**
	 * Create a new Parameter.
	 * @param identifier parameter identifier
	 * @param type parameter type
	 * @param kind parameter kind
	 * @param nDim parameter's number of dimension in case of array kind.
	 */
	public Parameter(final String identifier, final Type type, final Parameter.Kind kind, final int nDim) {
		this(identifier, type, kind);
		this.nDim = nDim;
	}

	// ***********************************************************************************************
	// *** Utility: into
	// ***********************************************************************************************
	/**
	 * Add this parameter to the given parameter list.
	 * @param parameterList the given parameter list
	 */
	void into(final Vector<Parameter> parameterList) {
		for (Parameter par : parameterList)
			if (Util.equals(par.identifier, this.identifier)) {
				Util.error("Parameter already defined: " + identifier);
				return;
			}
		parameterList.add(this);
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof Parameter))
			return (false);
		Parameter otherPar = (Parameter) other;
		if (!type.equals(otherPar.type))
			return (false);
		if (kind != otherPar.kind)
			return (false);
		if (mode != otherPar.mode)
			return (false);
		return (true);
	}

	/**
	 * Utility: Set new parameter mode.
	 * @param mode the new mode
	 */
	void setMode(final Parameter.Mode mode) {
		if (this.mode != null)
			Util.error("Parameter " + identifier + " is already specified by " + this.mode);
		this.mode = mode;
	}

	/**
	 * Utility: Set new type and kind.
	 * @param type the new type
	 * @param kind the new kind
	 */
	void setTypeAndKind(final Type type, final Parameter.Kind kind) {
		this.type = type;
		this.kind = kind;
	}

	/**
	 * Utility: Set new external identifier based on the given prefix level.
	 * @param prefixLevel the given prefix level
	 */
	void setExternalIdentifier(final int prefixLevel) {
		if (prefixLevel > 0)
			externalIdent = "p" + prefixLevel + '_' + identifier;
		else
			externalIdent = "p_" + identifier;
	}

	@Override
	public void doChecking() {
		if (IS_SEMANTICS_CHECKED())
			return;
		Global.sourceLineNumber = lineNumber;
		if (kind == null) {
			Util.error("Parameter " + identifier + " is not specified -- assumed Simple Integer");
			kind = Kind.Simple;
			type = Type.Integer;
		}
		if (type != null)
			type.doChecking(Global.getCurrentScope().declaredIn);
		if (!legalTransmitionMode())
			Util.error("Illegal transmission mode: " + mode + ' ' + kind + ' ' + identifier + " by "
					+ ((mode != null) ? mode : "default") + " is not allowed");
		SET_SEMANTICS_CHECKED();
	}

	/**
	 * Check if the parameter has a legal transmission mode.
	 * <p>
	 * The available transmission modes for the different kinds of parameters to
	 * procedures.
	 * 
	 * <pre>
	 *     --------------------------------------------------------------
	 *    |                       |         Transmission modes           |
	 *    |   Parameter           | - - - - - - - - - - - - - - - - - - -|
	 *    |                       |  by value | by reference |  by name  |
	 *    |--------------------------------------------------------------|
	 *    |   value type          |     D     |       I      |     O     |
	 *    |   object ref. type    |     I     |       D      |     O     |
	 *    |   text                |     O     |       D      |     O     |
	 *    |   value type array    |     O     |       D      |     O     |
	 *    |   reference type array|     I     |       D      |     O     |
	 *    |   procedure           |     I     |       D      |     O     |
	 *    |   type procedure      |     I     |       D      |     O     |
	 *    |   label               |     I     |       D      |     O     |
	 *    |   switch              |     I     |       D      |     O     |
	 *     --------------------------------------------------------------
	 *
	 *        D:  default mode       O:  optional mode       I:  illegal
	 * </pre>
	 * @return true if the parameter has a legal transmission mode
	 */
	private boolean legalTransmitionMode() {
		boolean illegal = false;
		switch (kind) {
		case Simple:
			if (type.equals(Type.Text))
				break; // Simple Text
			else if (type.isReferenceType()) {
				if (mode == Parameter.Mode.value)
					illegal = true;
			} // Simple ref(ClassIdentifier)
			else if (mode == null)
				mode = Parameter.Mode.value; // Simple Type Integer, Real, Character
			break;
		case Array:
			if (type.isReferenceType() && mode == Parameter.Mode.value)
				illegal = true;
			break;
		case Procedure:
		case Label:
			if (mode == Parameter.Mode.value)
				illegal = true;
			break;
		default:
		}
		return (!illegal);
	}

	/**
	 * Coding utility: edit Java code version of this parameter's type.
	 * @return the resulting Java code
	 */
	String toJavaType() {
		ASSERT_SEMANTICS_CHECKED();
		if (mode == Parameter.Mode.name) {
			switch (kind) {
			case Simple:
				if (type.equals(Type.Label))
					return ("RTS_NAME<RTS_LABEL>");
				return ("RTS_NAME<" + type.toJavaTypeClass() + ">");
			case Procedure:
				return ("RTS_NAME<RTS_PRCQNT>");
			case Label:
				return ("RTS_NAME<RTS_LABEL>");
			case Array:
				return ("RTS_NAME<RTS_ARRAY>");
			}
		}
		switch (kind) {
		case Array:
			return ("RTS_ARRAY");
		case Label:
			return ("RTS_LABEL");
		case Procedure:
			return ("RTS_PRCQNT");
		case Simple: // Fall through
		}
		return (type.toJavaType());
	}

	@Override
	public String toJavaCode() {
		return (toJavaType() + ' ' + externalIdent);
	}
	
	public void buildParamCode(CodeBuilder codeBuilder,Expression expr) {
//		ASSERT_SEMANTICS_CHECKED();
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		if (mode == Parameter.Mode.name) {
			buildNameParam(codeBuilder,this,expr);
		} else {
		switch (kind) {
			case Array:
//				System.out.println("Parameter.buildParamCode: expr="+expr.getClass().getSimpleName()+"  "+expr);
				expr.buildEvaluation(null,codeBuilder);
				if(mode == Parameter.Mode.value) {
					codeBuilder.invokevirtual(ArrayDeclaration.getClassDesc(type),
							"COPY", MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_RTObject$"+type.getArrayType()+';'));
				}
				break;
			case Label:
				Util.IERR("LABEL");
//				return ("RTS_LABEL");
				break;
			case Procedure:
//				return ("RTS_PRCQNT");
//				new RTS_PRCQNT(((adHoc000)(_CUR))
//		         4: getstatic     #21                 // Field _CUR:Lsimula/runtime/RTS_RTObject;
//		         7: new           #25                 // class simula/runtime/RTS_PRCQNT
//		        10: dup
//		        11: getstatic     #21                 // Field _CUR:Lsimula/runtime/RTS_RTObject;
//		        14: checkcast     #8                  // class simulaTestPrograms/adHoc000
//		        17: ldc           #27                 // class simulaTestPrograms/adHoc000_PPP
//		        19: invokespecial #29                 // Method simula/runtime/RTS_PRCQNT."<init>":(Lsimula/runtime/RTS_RTObject;Ljava/lang/Class;)V

//				System.out.println("Parameter.buildParamCode: par="+this);
//				System.out.println("Parameter.buildParamCode: expr="+expr.getClass().getSimpleName()+"  "+expr);
				Expression beforeDot = null;
				if(expr instanceof RemoteVariable rem) {
					beforeDot = rem.obj;
					expr = rem.var;
				}
				VariableExpression var=(VariableExpression)expr;
//				System.out.println("Parameter.buildParamCode: var.identifier="+var.identifier);
//				System.out.println("Parameter.buildParamCode: var.meaning="+var.meaning);
//				System.out.println("Parameter.buildParamCode: var.meaning.declaredAs="+var.meaning.declaredAs.getClass().getSimpleName());
				
				Declaration decl = var.meaning.declaredAs;
				if(decl instanceof ProcedureDeclaration proc) {
//					System.out.println("Parameter.buildParamCode: par="+proc.externalIdent);
					codeBuilder
						.new_(CD.RTS_PRCQNT)
						.dup();

					if(beforeDot == null) {
						codeBuilder
							.aload(0)
							.checkcast(BlockDeclaration.currentClassDesc());
					} else {
						beforeDot.buildEvaluation(null, codeBuilder);
					}

					MethodTypeDesc MTD_THIS=MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_RTObject;Ljava/lang/Class;)V");
					codeBuilder
						.ldc(pool.loadableConstantEntry(proc.getClassDesc()))
						.invokespecial(CD.RTS_PRCQNT, "<init>", MTD_THIS);
				} else if(decl instanceof Parameter par) {
//				        10: aload_0
//				        11: getfield      #9                  // Field p_FFF:Lsimula/runtime/RTS_NAME;
//				        14: invokevirtual #63                 // Method simula/runtime/RTS_NAME.get:()Ljava/lang/Object;
//				        17: checkcast     #67                 // class simula/runtime/RTS_PRCQNT
					MethodTypeDesc MTD=MethodTypeDesc.ofDescriptor("()Ljava/lang/Object;");
					codeBuilder
						.aload(0)
						.getfield(par.getFieldRefEntry(pool))
						.invokevirtual(pool.methodRefEntry(CD.RTS_NAME, "get", MTD))
						.checkcast(CD.RTS_PRCQNT);
				} else {
					Util.IERR("PROC: "+decl.getClass().getSimpleName());
				}
				break;
			case Simple: // Fall through
				expr.buildEvaluation(null,codeBuilder);
				if(mode == Parameter.Mode.value && type.equals(Type.Text)) {
					codeBuilder.invokestatic(CD.RTS_ENVIRONMENT,
							"copy", MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_TXT;)Lsimula/runtime/RTS_TXT;"));
				}
			}
		}
	}
	
	public static void buildNameParam(CodeBuilder codeBuilder,Expression expr) {
		buildNameParam(codeBuilder,null,expr);
	}	
	
	public static void buildNameParam(CodeBuilder codeBuilder,Parameter par,Expression expr) {
//		System.out.println("Parameter.buildNameParam: par="+par);
//		System.out.println("Parameter.buildNameParam: expr="+expr+"  type="+expr.type);
		Thunk.buildInvoke((par==null)?null:par.kind, expr, codeBuilder);
	}
	

	public FieldRefEntry getFieldRefEntry(ConstantPoolBuilder pool) {
//		System.out.println("Parameter.getFieldRefEntry: BEGIN: "+this+" delatedIn="+this.declaredIn);
		ClassDesc CD_cls=declaredIn.getClassDesc();
		ClassDesc CD_type=null; //type.toClassDesc2(kind,mode);
		if(kind==Kind.Procedure)
			 CD_type=Type.Procedure.toClassDesc2(kind,mode);
		else CD_type=type.toClassDesc2(kind,mode);
		return(pool.fieldRefEntry(CD_cls, getFieldIdentifier(), CD_type));
	}
	
	@Override
	public String getFieldIdentifier() {
		if(declaredIn instanceof ClassDeclaration cls)
			return("p"+cls.prefixLevel()+'_'+identifier);
		else return("p_"+identifier);
	}

	@Override
	public void buildField(ClassBuilder classBuilder,BlockDeclaration encloser) {
		String ident = getFieldIdentifier();
		if (mode == Parameter.Mode.name) {
//			System.out.println("Parameter.buildField: "+this);
			if (kind == Parameter.Kind.Procedure) {
				classBuilder.withField(ident, CD.RTS_NAME, ClassFile.ACC_PUBLIC);
			} else {			
				classBuilder.withField(ident, CD.RTS_NAME, fieldBuilder -> {
					fieldBuilder
					.withFlags(ClassFile.ACC_PUBLIC)
					.with(SignatureAttribute.of(type.toClassSignature(mode)));
				});
			}
		} else if (kind == Parameter.Kind.Array) {
			classBuilder.withField(ident, CD.RTS_ARRAY, ClassFile.ACC_PUBLIC);
		} else if (kind == Parameter.Kind.Procedure) {
			classBuilder.withField(ident, CD.RTS_PRCQNT, ClassFile.ACC_PUBLIC);
		} else {
//			System.out.println("Parameter.buildField: "+this);
			ClassDesc CD=type.toClassDesc(kind,mode);
			classBuilder.withField(ident, CD, ClassFile.ACC_PUBLIC);
		}
	}
	
	public ClassDesc type_toClassDesc() {
		switch(this.kind) {
		case Array: return(this.type.toClassDesc(this.kind,this.mode));
		case Label:
			Util.IERR("");
			return(null);
		case Procedure:		  return(Type.Procedure.toClassDesc(this.kind,this.mode));
		case Simple: default: return(this.type.toClassDesc(this.kind,this.mode));
		}
	}

	public void loadParameter(CodeBuilder codeBuilder,int ofst) {
//		System.out.println("CUtil.loadParameter: codeBuilder.<"+type+">load("+ofst+")");
		if (mode == Parameter.Mode.name) codeBuilder.aload(ofst);
		else if (kind == Parameter.Kind.Array) codeBuilder.aload(ofst);
		else if (kind == Parameter.Kind.Procedure) codeBuilder.aload(ofst);
		else if(type.getKeyWord()==KeyWord.REF) codeBuilder.aload(ofst);
		else if(type.equals(Type.Integer)) codeBuilder.iload(ofst);
		else if(type.equals(Type.LongReal)) codeBuilder.dload(ofst);
		else if(type.equals(Type.Real)) codeBuilder.fload(ofst);
		else if(type.equals(Type.Boolean)) codeBuilder.iload(ofst);
		else if(type.equals(Type.Character)) codeBuilder.iload(ofst);
		else if(type.equals(Type.Text)) codeBuilder.aload(ofst);
		else if(type.equals(Type.Procedure)) codeBuilder.aload(ofst);
		else if(type.equals(Type.Label)) codeBuilder.aload(ofst);
		else Util.IERR("NOT IMPLEMENTED: loadParameter "+type);
	}
	

	// ***********************************************************************************************
	// *** Printing Utility: editParameterList
	// ***********************************************************************************************
	/**
	 * Printing Utility: edit parameter list.
	 * @param parameterList the given parameter list
	 * @return the resulting string
	 */
	static String editParameterList(Vector<Parameter> parameterList) {
		StringBuilder s = new StringBuilder();
		s.append('(');
		boolean first = true;
		for (Parameter par : parameterList) {
			if (!first)
				s.append(',');
			s.append(par);
			first = false;
		}
		s.append(");");
		return (s.toString());
	}
	
	@Override
	public void printTree(final int indent) {
		System.out.println(edTreeIndent(indent)+this);
	}
	
	@Override
	public String toString() {
		String s = "";
		if (type != null)
			s = s + type;
		else
			s = "NOTYPE";
		if (mode != null)
			s = "" + mode + " " + type;
		if (kind == null)
			s = s + " NOKIND";
		if (nDim > 0)
			s = s + " " + nDim + "-Dimentional";
		else if (kind != Parameter.Kind.Simple)
			s = s + " " + kind;
		return (s + ' ' + identifier + "(" + externalIdent + ')');
	}

	// ***********************************************************************************************
	// *** Externalization
	// ***********************************************************************************************
	/**
	 * Default constructor used by Externalization.
	 */
	public Parameter() {
		super(null);
		this.declarationKind = Declaration.Kind.Parameter;
	}

	@Override
	public void writeExternal(ObjectOutput oupt) throws IOException {
		Util.TRACE_OUTPUT("Parameter: " + type + ' ' + identifier + ' ' + kind + ' ' + mode);
		oupt.writeObject(identifier);
		oupt.writeObject(externalIdent);
//		Type.outType(type,oupt);
		Type.outType(type,oupt);
		oupt.writeObject(kind);
		oupt.writeObject(mode);
	}

	@Override
	public void readExternal(ObjectInput inpt) throws IOException, ClassNotFoundException {
		identifier = (String) inpt.readObject();
		externalIdent = (String) inpt.readObject();
		type = Type.inType(inpt);
		kind = (Parameter.Kind) inpt.readObject();
		mode = (Parameter.Mode) inpt.readObject();
		Util.TRACE_INPUT("Parameter: " + type + ' ' + identifier + ' ' + kind + ' ' + mode);
	}

}
