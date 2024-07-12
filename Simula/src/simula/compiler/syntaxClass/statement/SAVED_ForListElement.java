package simula.compiler.syntaxClass.statement;

import java.io.IOException;
import java.lang.classfile.CodeBuilder;
import java.lang.constant.MethodTypeDesc;

import simula.compiler.AttributeInputStream;
import simula.compiler.AttributeOutputStream;
import simula.compiler.GeneratedJavaClass;
import simula.compiler.syntaxClass.SyntaxClass;
import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.declaration.ClassDeclaration;
import simula.compiler.syntaxClass.declaration.Parameter;
import simula.compiler.syntaxClass.declaration.SimpleVariableDeclaration;
import simula.compiler.syntaxClass.expression.Expression;
import simula.compiler.syntaxClass.expression.TypeConversion;
import simula.compiler.syntaxClass.expression.VariableExpression;
import simula.compiler.utilities.CD;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.KeyWord;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

// ************************************************************************************
// *** ForListElement -- Single Value
// ************************************************************************************
/**
 * Utility class ForListElement implementing a single value element.
 */
public class ForListElement extends SyntaxClass {
	/**
	 * The For-statement
	 */
	ForStatement forStatement;

	/**
	 * The first expression
	 */
	Expression expr1;

	/**
	 * Create a new ForListElement.
	 * @param expr1 The first expression
	 */
	public ForListElement(final ForStatement forStatement, final Expression expr1) {
		this.forStatement = forStatement;
		this.expr1 = expr1;
		if (Option.internal.TRACE_PARSE)
			Util.TRACE("NEW ForListElement: " + toString());
	}

	/**
	 * Perform semantic checking.
	 */
	public void doChecking() {
		if (Option.internal.TRACE_CHECKER)
			Util.TRACE("BEGIN ForListElement(" + this + ").doChecking - Current Scope Chain: "
					+ Global.getCurrentScope().edScopeChain());
		expr1.doChecking();
		expr1 = TypeConversion.testAndCreate(forStatement.controlVariable.type, expr1);
		expr1.doChecking();
		expr1.backLink = forStatement; // To ensure _RESULT from functions
	}

	/**
	 * Edit Java source code for this ForListElement.
	 * @param classIdent Java class identifier
	 * @param xType control variable's type
	 * @return the resulting Java source code for this ForListElement
	 */
	public String edCode(final String classIdent, Type xType) {
		String forElt = (forStatement.controlVariable.type.keyWord == Type.T_TEXT && forStatement.assignmentOperator == KeyWord.ASSIGNVALUE) ? "TValElt"
				: "Elt<" + classIdent + ">";
		return ("new FOR_Single" + forElt + "(" + forStatement.edControlVariableByName(classIdent, xType) + ",new RTS_NAME<"
				+ classIdent + ">() { public " + classIdent + " get(){return(" + expr1.toJavaCode() + "); }})");
	}

	/**
	 * Checks if this ForListElement can be optimized.
	 * @return this ForListElement if it can be optimized
	 */
	public ForListElement isOptimisable() {
		return (this);
	}

	/**
	 * Perform simplified JavaCoding.
	 */
	public void doSimplifiedJavaCoding() {
		String cv = forStatement.controlVariable.toJavaCode();
		String val = this.expr1.toJavaCode();
		if (expr1.type != forStatement.controlVariable.type) {
			switch (forStatement.controlVariable.type.keyWord) {
				case Type.T_INTEGER ->   val = "(int)" + val;
				case Type.T_REAL ->      val = "(float)" + val;
				case Type.T_LONG_REAL -> val = "(double)" + val;
				default -> {
					if (forStatement.controlVariable.type.isReferenceType()) {
						ClassDeclaration qual = forStatement.controlVariable.type.getQual();
						if (!(forStatement.controlVariable.type.equals(this.expr1.type)))
							val = "(" + qual.getJavaIdentifier() + ")" + val;
					}
				}
			}
		}
		GeneratedJavaClass.code(cv + "=" + val + "; {");
		forStatement.doStatement.doJavaCoding();
		GeneratedJavaClass.code("}");
	}

//	@Override
	public void doSingleElementByteCoding(CodeBuilder codeBuilder) {
        // 0: aload_0
        // 1: aload_0
        // 2: getfield      #16                 // Field k:I
        // 5: putfield      #19                 // Field l:I
		SimpleVariableDeclaration decl = (SimpleVariableDeclaration)forStatement.controlVariable.meaning.declaredAs;

		// forStatement.controlVariable := expr1
		forStatement.controlVariable.buildIdentifierAccess(true, codeBuilder);
		expr1.buildEvaluation(null,codeBuilder); // evaluate expr1
		
		// GeneratedJavaClass.code(cv + "=" + val + "; {");
		codeBuilder.putfield(decl.getFieldRefEntry(codeBuilder.constantPool()));

		forStatement.doStatement.buildByteCode(codeBuilder);
	}

	public void buildByteCode(CodeBuilder codeBuilder,VariableExpression controlVariable) {
		codeBuilder
			.new_(CD.FOR_SingleElt)
			.dup();

		// PARAMETER: RTS_NAME<T> cvar  -- Control Variable
        //   getstatic     #25                 // Field _CUR:Lsimula/runtime/RTS_RTObject;
        //   new           #29                 // class simulaTestPrograms/adHoc13$THUNK
        //   dup
        //   aload_0
        //   invokespecial #31                 // Method simulaTestPrograms/adHoc13$1."<init>":(LsimulaTestPrograms/adHoc13;)V
		Parameter.buildNameParam(codeBuilder,controlVariable);

		// PARAMETER: RTS_NAME<T> value
		Parameter.buildNameParam(codeBuilder,expr1);

		MethodTypeDesc MTD=MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_NAME;Lsimula/runtime/RTS_NAME;)V");
		codeBuilder.invokespecial(CD.FOR_SingleElt, "<init>", MTD); // Invoke Constructor
	}

	@Override
	public String toString() {
		return ("" + expr1);
	}

	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************
	/**
	 * Default constructor used by Attribute File I/O
	 */
	ForListElement() {}

//	public void writeObject(AttributeOutputStream oupt) throws IOException {
//		Util.TRACE_OUTPUT("writeForListElement: " + this);
//		oupt.writeShort(1);
//		oupt.writeObj(expr1);
//	}

	@Override
	public void writeObject(AttributeOutputStream oupt) throws IOException {
		Util.TRACE_OUTPUT("writeDoPart: " + this);
		oupt.writeKind(ObjectKind.ForListElement);
		oupt.writeShort(SEQU);
		// *** SyntaxClass
		oupt.writeShort(lineNumber);
		// *** ForListElement
		oupt.writeObj(forStatement);
		oupt.writeObj(expr1);
	}
	
	public static ForListElement readObject(AttributeInputStream inpt) throws IOException {
		ForListElement elt = new ForListElement();
		elt.SEQU = inpt.readSEQU(elt);
		// *** SyntaxClass
		elt.lineNumber = inpt.readShort();
		// *** ForListElement
		elt.forStatement = (ForStatement) inpt.readObj();
		elt.expr1 = (Expression) inpt.readObj();
		Util.TRACE_INPUT("ConnectionDoPart: " + elt);
		return(elt);
	}
	
//	public static ForListElement readObject(ForStatement x, AttributeInputStream inpt) throws IOException {
//		ForListElement stm = null;
//		int nExpr = inpt.readShort();
//		switch(nExpr) {
//		case 1:
//			Expression expr1 = (Expression) inpt.readObj();
//			stm = x.new ForListElement(expr1);
//			break;
//		case 2: 
//			Expression expr21 = (Expression) inpt.readObj();
//			Expression expr22 = (Expression) inpt.readObj();
//			stm = x.new ForWhileElement(expr21,expr22);
//			break;
//		case 3: 
//			Expression expr31 = (Expression) inpt.readObj();
//			Expression expr32 = (Expression) inpt.readObj();
//			Expression expr33 = (Expression) inpt.readObj();
//			stm = x.new StepUntilElement(expr31,expr32,expr33);
//			break;
//		}
//		Util.TRACE_INPUT("ForListElement: " + stm);
//		return(stm);
//	}

}
