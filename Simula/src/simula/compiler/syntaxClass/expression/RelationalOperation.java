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
import java.lang.classfile.Label;
import java.lang.constant.ClassDesc;
import java.lang.constant.MethodTypeDesc;

import simula.compiler.syntaxClass.SyntaxClass;
import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.declaration.BlockDeclaration;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.KeyWord;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * Relational Operation.
 * 
 * <pre>
 * 
 * Simula Standard: 3.3 Relations
 * 
 * </pre>
 * 
 * <h2>Syntax used during Parsing:</h2>
 * 
 * <pre>
 * 
 *   relational-operation = expression  relational-operator  expression
 *   
 *      relational-operator = value-relational-operator | reference-comparator
 *      
 *         value-relational-operator =  &lt; | &lt;= | = | >= | > | &lt;>
 *         
 *         reference-comparator =  == | =/= 
 * </pre>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/expression/RelationalOperation.java">
 * <b>Source File</b></a>.
 * 
 * @author Øystein Myhre Andersen
 */
public final class RelationalOperation extends Expression {

	/**
	 * The left hand side
	 */
	private Expression lhs;

	/**
	 * The relational operation
	 */
	private KeyWord opr;

	/**
	 * The right hand side
	 */
	private Expression rhs;

	/**
	 * Create a new RelationalOperation.
	 * @param lhs the left hand side
	 * @param opr the relation
	 * @param rhs the right hand side
	 */
	RelationalOperation(final Expression lhs,final KeyWord opr,final Expression rhs) {
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
		if (IS_SEMANTICS_CHECKED())	return;
		Global.sourceLineNumber = lineNumber;
		if (Option.TRACE_CHECKER)
			Util.TRACE("BEGIN RelationalOperation" + toString() + ".doChecking - Current Scope Chain: "	+ Global.getCurrentScope().edScopeChain());
		switch (opr) {
		case LT: case LE: case EQ: case NE: case GE: case GT: {
			lhs.doChecking();
			rhs.doChecking();
			Type type1 = lhs.type;
			Type type2 = rhs.type;
			if (type1.equals(Type.Text) && type2.equals(Type.Text)) {
				this.type = Type.Boolean;
				break;
			}
			if (type1.equals(Type.Character) && type2.equals(Type.Character)) {
				this.type = Type.Boolean;
				break;
			}
			if (type1.equals(Type.Boolean) && type2.equals(Type.Boolean)) {
				this.type = Type.Boolean;
				break;
			}
			// Arithmetic Relation
			Type atype = Type.arithmeticTypeConversion(type1, type2);
			if (atype == null)
				Util.error("Incompatible types in binary operation: " + toString());
			this.type = Type.Boolean;
			lhs = (Expression) TypeConversion.testAndCreate(atype, lhs);
			rhs = (Expression) TypeConversion.testAndCreate(atype, rhs);
			break;
		}
		case EQR: case NER: {
			// Object =/= Object or Object == Object
			lhs.doChecking();
			rhs.doChecking();
			Type type1 = lhs.type;
			Type type2 = rhs.type;
			if ((!type1.isReferenceType()) || (!type2.isReferenceType()))
				Util.error("RelationalOperation: Illegal types: " + type1 + " " + opr + " " + type2);

			this.type = Type.Boolean;
			break;
		}
		default:
			Util.IERR("*** NOT IMPLEMENTED: " +"RelationalOperation -- Util.error(Something went wrong) opr=" + opr);
			this.type = rhs.type;
		}
		if (Option.TRACE_CHECKER)
			Util.TRACE("END RelationalOperation" + toString() + ".doChecking - Result type=" + this.type);
		SET_SEMANTICS_CHECKED();
	}

	// Returns true if this expression may be used as a statement.
	@Override
	public boolean maybeStatement() {
		ASSERT_SEMANTICS_CHECKED();
		return (false);
	}

	@Override
	public String toJavaCode() {
		ASSERT_SEMANTICS_CHECKED();
		switch (opr) {
			case LT: case LE: case EQ: case NE: case GE: case GT: {
				Type type1 = lhs.type;
				Type type2 = rhs.type;
				if (type1.equals(Type.Text) && type2.equals(Type.Text))
					return (doCodeTextValueRelation());
			}
			case EQR: case NER: {
				Type type1 = lhs.type;
				Type type2 = rhs.type;
				if (type1.equals(Type.Text) && type2.equals(Type.Text))
					return (doCodeTextRefRelation());
			}
			default: {
				if (this.backLink == null)
					 return (lhs.get() + opr.toJavaCode() + '(' + rhs.get() + ')');
				else return ("(" + lhs.get() + opr.toJavaCode() + '(' + rhs.get() + "))");
			}
		}
	}

	// ***********************************************************************
	// *** CODE: doCodeTextValueRelation
	// ***********************************************************************
	/**
	 * Coding Utility: Code text value relation
	 * @return the resulting Java source code
	 */
	private String doCodeTextValueRelation() {
		StringBuilder s = new StringBuilder();
		String fnc = "??";
		switch (opr) {
		    case LT -> fnc = "LT(";
		    case EQ -> fnc = "EQ(";
		    case LE -> fnc = "LE(";
		    case GT -> fnc = "GT(";
		    case NE -> fnc = "NE(";
		    case GE -> fnc = "GE(";
		    default -> Util.IERR("Unexpected value: " + opr);
		}
		s.append("_TXTREL_").append(fnc);
		s.append(lhs.get()).append(',');
		s.append(rhs.get()).append(')');
		return (s.toString());
	}

	// ***********************************************************************
	// *** CODE: doCodeTextRefRelation
	// ***********************************************************************
	/**
	 * Coding Utility: Code text reference relation
	 * @return the resulting Java source code
	 */
	private String doCodeTextRefRelation() {
		String fnc = "TRF_EQ(";
		StringBuilder s = new StringBuilder();
		if (opr == KeyWord.NER)	fnc = "TRF_NE(";
		s.append(fnc);
		s.append(lhs.get()).append(',');
		s.append(rhs.get()).append(')');
		return (s.toString());
	}

	@Override
	public void buildEvaluation(Expression rightPart,CodeBuilder codeBuilder) {
		ASSERT_SEMANTICS_CHECKED();
//		System.out.println("RelationalOperation.buildByteCode: "+this+", lhs.type="+lhs.type+", rhs.type="+rhs.type);
		if(lhs.type.equals(Type.Text)) {
			buildTextRelation(codeBuilder);
			return;
		}
		lhs.buildEvaluation(null,codeBuilder);
		rhs.buildEvaluation(null,codeBuilder);
		Label target = codeBuilder.newLabel();
		Label lab2 = codeBuilder.newLabel();
		if(lhs.type.equals(Type.Integer) || lhs.type.equals(Type.Character)) {
			switch (opr) {
				case GE -> codeBuilder.if_icmplt(target);
				case NE -> codeBuilder.if_icmpeq(target);
				case GT -> codeBuilder.if_icmple(target);
				case LE -> codeBuilder.if_icmpgt(target);
				case EQ -> codeBuilder.if_icmpne(target);
				case LT -> codeBuilder.if_icmpge(target);
				default -> Util.IERR("Unexpected value: " + opr);
			}
		} else if(lhs.type.equals(Type.Real)) {
			codeBuilder.fcmpl();
				switch (opr) {
					case GE -> codeBuilder.iflt(target);
					case NE -> codeBuilder.ifeq(target);
					case GT -> codeBuilder.ifle(target);
					case LE -> codeBuilder.ifgt(target);
					case EQ -> codeBuilder.ifne(target);
					case LT -> codeBuilder.ifge(target);
					default -> Util.IERR("Unexpected value: " + opr);
				}
		} else if(lhs.type.equals(Type.LongReal)) {
			codeBuilder.dcmpl();
			switch (opr) {
				case GE -> codeBuilder.iflt(target);
				case NE -> codeBuilder.ifeq(target);
				case GT -> codeBuilder.ifle(target);
				case LE -> codeBuilder.ifgt(target);
				case EQ -> codeBuilder.ifne(target);
				case LT -> codeBuilder.ifge(target);
				default -> Util.IERR("Unexpected value: " + opr);
			}
		} else if(lhs.type.isReferenceType()) {
			switch (opr) {
				case EQR -> codeBuilder.if_acmpne(target);
				case NER -> codeBuilder.if_acmpeq(target);
				default -> Util.IERR("Unexpected value: " + opr);
			}
		} else Util.IERR("STOP IN "+this.getClass().getSimpleName()+"  Type="+lhs.type+"  "+this);
		codeBuilder.iconst_1();
		codeBuilder.goto_(lab2);
		codeBuilder.labelBinding(target);
		codeBuilder.iconst_0();
		codeBuilder.labelBinding(lab2);
	}

	private void buildTextRelation(CodeBuilder codeBuilder) {
		lhs.buildEvaluation(null,codeBuilder);
		rhs.buildEvaluation(null,codeBuilder);

		String textRelMethod=null;
		switch (opr) {
			case GE -> textRelMethod="_TXTREL_GE";
			case NE -> textRelMethod="_TXTREL_NE";
			case GT -> textRelMethod="_TXTREL_GT";
			case LE -> textRelMethod="_TXTREL_LE";
			case EQ -> textRelMethod="_TXTREL_EQ";
			case LT -> textRelMethod="_TXTREL_LT";
			case EQR -> textRelMethod="TRF_EQ";
			case NER -> textRelMethod="TRF_NE";
			default -> Util.IERR("Unexpected value: " + lhs + " " + opr + " "+ rhs);
		}
		ClassDesc CD = BlockDeclaration.currentClassDesc();
		MethodTypeDesc MTD=MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_TXT;Lsimula/runtime/RTS_TXT;)Z");
		codeBuilder.invokestatic(CD, textRelMethod, MTD);
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
	public RelationalOperation() {
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
