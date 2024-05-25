/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass.statement;

import java.io.IOException;
import java.lang.classfile.CodeBuilder;
import java.lang.classfile.Label;
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import java.lang.classfile.constantpool.FieldRefEntry;
import java.lang.constant.ClassDesc;
import java.lang.constant.ConstantDescs;
import java.lang.constant.MethodTypeDesc;
import java.util.Iterator;
import java.util.Vector;

import simula.compiler.AttributeInputStream;
import simula.compiler.AttributeOutputStream;
import simula.compiler.GeneratedJavaClass;
import simula.compiler.parsing.Parse;
import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.declaration.BlockDeclaration;
import simula.compiler.syntaxClass.declaration.ClassDeclaration;
import simula.compiler.syntaxClass.declaration.Declaration;
import simula.compiler.syntaxClass.declaration.Parameter;
import simula.compiler.syntaxClass.declaration.SimpleVariableDeclaration;
import simula.compiler.syntaxClass.expression.Constant;
import simula.compiler.syntaxClass.expression.Expression;
import simula.compiler.syntaxClass.expression.TypeConversion;
import simula.compiler.syntaxClass.expression.VariableExpression;
import simula.compiler.utilities.CD;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.KeyWord;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;


/**
 * For Statement.
 * 
 * <pre>
 * 
 * Simula Standard: 4.4 For-statement
 * 
 *  for-statement = FOR variable :- reference-list DO statement
 *                | FOR variable := value-list DO statement
 *               
 *      reference-list = reference-list-element { , reference-list-element }
 * 
 *          reference-list-element = reference-expression [ WHILE Boolean-expression ]
 * 
 *      value-list = value-list-element { , value-list-element }
 * 
 *          value-list-element = value-expression [ WHILE Boolean-expression ]
 *                             | arithmetic-expression STEP arithmetic-expression UNTIL arithmetic-expression
 *
 * </pre>
 * The Implementation of the for-statement is a bit tricky. The basic idea is to create a
 * ForList iterator that iterates over a set of FOR_Element iterators. The following subclasses of
 * FOR_Element are defined:
 * <pre>
 *                - FOR_SingleELT&lt;T>    for basic types T control variable
 *                - FOR_SingleTValElt   for Text type control variable
 *                - FOR_StepUntil       for numeric types
 *                - FOR_WhileElt&lt;T>     for basic types T control variable
 *                - FOR_WhileTValElt    representing For t:= &lt;TextExpr> while &lt;Cond>
 *                                  With text value assignment
 * </pre>
 * Each of which deliver a boolean value 'CB' used to indicate whether this for-element is
 * exhausted. All parameters to these classes are transferred 'by name'. This is done to
 * ensure that all expressions are evaluated in the right order. The assignment to the
 * 'control variable' is done within the various for-elements when the 'next' method is
 * invoked. To get a full overview of all the details you are encouraged to study the
 * generated code together with the 'FRAMEWORK for for-list iteration' found in the
 * runtime class RTS_RTObject.
 * <p>
 * Example, the following for-statement:
 * <pre>
 *           for i:=1,6,13 step 6 until 66,i+1 while i &lt; 80 do j:=j+i;
 * </pre>
 * Is compiled to:
 * <pre>
 *           for(boolean CB:new ForList(
 *               new FOR_SingleELT&lt;Number>(...)
 *              ,new FOR_SingleELT&lt;Number>(...)
 *              ,new FOR_StepUntil(...)
 *              ,new FOR_WhileElt&lt;Number>(...)
 *           )) { if(!CB) continue;
 *                j=j+i;
 *              }
 *              </pre>
 * Another example with control variable of type Text:
 * <pre>
 *           for t:="one",other while k &lt; 7 do &lt;statement>
 * </pre>
 * Where 'other' is a text procedure, is compiled to:
 * <pre>
 *           for(boolean CB:new ForList(
 *               new FOR_SingleTValElt(...)
 *              ,new FOR_WhileTValElt(...)
 *            )) { if(!CB) continue;
 *                 … // Statement
 *               }
 * </pre>
 * 
 * <h2>Optimized For-Statement</h2>
 * However; most of the for-statements with only one for-list element are optimized.
 * <p>
 * Single for step-until statements are optimized when the step-expression is constant.
 * I.e. the following for-statements:
 * <pre>
 *           for i:=&lt;expr-1> step 1  until &lt;expr-2> do &lt;statements>
 *           for i:=&lt;expr-1> step -1 until &lt;expr-2> do &lt;statements>
 *           for i:=&lt;expr-1> step 6  until &lt;expr-2> do &lt;statements>
 *           for i:=&lt;expr-1> step -6 until &lt;expr-2> do &lt;statements>
 * </pre>
 * are compiled to:
 * <pre>
 *           for(i = &lt;expr-1>; i &lt;= &lt;expr-2>; i++) { &lt;statements> }
 *           for(i = &lt;expr-1>; i >= &lt;expr-2>; i--) { &lt;statements> }
 *           for(i = &lt;expr-1>; i &lt;= &lt;expr-2>; i=i+6) { &lt;statements> }
 *           for(i = &lt;expr-1>; i >= &lt;expr-2>; i=i-6) { &lt;statements> }
 * </pre>
 * The other kinds of single elements are optimized in these ways:
 * <pre>
 *           for i:=&lt;expr> do &lt;statements>
 *           for i:=&lt;expr> while &lt;cond> do &lt;statements>
 * </pre>
 * are compiled to:
 * <pre>
 *           i = &lt;expr>; { &lt;statements> }
 *           
 *           i = &lt;expr>;
 *           While( &lt;cond> ) {
 *                  &lt;statements>;
 *                  i = &lt;expr>;
 *           }
 * </pre>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/statement/ForStatement.java">
 * <b>Source File</b></a>.
 * 
 * @author SIMULA Standards Group
 * @author Øystein Myhre Andersen
 */
public final class ForStatement extends Statement {
	
	/**
	 * The control variable
	 */
	private VariableExpression controlVariable;
	
	/**
	 * Assignment operator  := or :-
	 */
	private int assignmentOperator; // KeyWord := or :-
	
	/**
	 * The list of ForList elements.
	 */
	private Vector<ForListElement> forList = new Vector<ForListElement>();
	
	/**
	 * The statement after DO.
	 */
	private Statement doStatement;

	/**
	 * Create a new ForStatement.
	 * 
	 * @param line the source line number
	 */
	ForStatement(final int line) {
		super(line);
		if (Option.TRACE_PARSE)
			Parse.TRACE("Parse ForStatement");
		controlVariable = new VariableExpression(Parse.expectIdentifier());
		if (!Parse.accept(KeyWord.ASSIGNVALUE))
			Parse.expect(KeyWord.ASSIGNREF);
		assignmentOperator = Parse.prevToken.getKeyWord();
		do {
			forList.add(expectForListElement());
		} while (Parse.accept(KeyWord.COMMA));
		Parse.expect(KeyWord.DO);
		Statement doStatement = Statement.expectStatement();
		if (doStatement == null) {
			Util.error("No statement following DO in For statement");
			doStatement = new DummyStatement(line);
		}
		this.doStatement = doStatement;
		if (Option.TRACE_PARSE)
			Util.TRACE("Line " + this.lineNumber + ": ForStatement: " + this);
	}

	/**
	 * Parse a for-list element.
	 * @return the resulting ForListElement
	 */
	private ForListElement expectForListElement() {
		if (Option.TRACE_PARSE)
			Parse.TRACE("Parse ForListElement");
		Expression expr1 = Expression.expectExpression();
		if (Parse.accept(KeyWord.WHILE))
			return (new WhileElement(expr1, Expression.expectExpression()));
		if (Parse.accept(KeyWord.STEP)) {
			Expression expr2 = Expression.expectExpression();
			Parse.expect(KeyWord.UNTIL);
			return (new StepUntilElement(expr1, expr2, Expression.expectExpression()));
		} else
			return (new ForListElement(expr1));
	}

	@Override
	public void doChecking() {
		if (IS_SEMANTICS_CHECKED())
			return;
		Global.sourceLineNumber = lineNumber;
		controlVariable.doChecking();
		Type type = controlVariable.type; // Type of control variable
		Declaration decl = controlVariable.meaning.declaredAs;
		if (decl instanceof Parameter par && par.mode == Parameter.Mode.name)
			Util.error(
					"For-Statement's Controled Variable(" + controlVariable + ") can't be a formal parameter by Name");
		if (type.keyWord != Type.T_TEXT && assignmentOperator == KeyWord.ASSIGNVALUE && type.isReferenceType())
			Util.error("Illegal For-Statement with object value assignment ( := )");
		Iterator<ForListElement> iterator = forList.iterator();
		while (iterator.hasNext()) {
			iterator.next().doChecking();
		}
		doStatement.doChecking();
		SET_SEMANTICS_CHECKED();
	}

	@Override
	public void doJavaCoding() {
		ForListElement singleElement = getSingleOptimizableElement();
		if (singleElement != null) {
			singleElement.doSimplifiedJavaCoding();
			return;
		}

		// ------------------------------------------------------------
		// Example:
		//
		// for(boolean CB_:new FOR_List(
		//     new FOR_SingleELT<Number>(n1)
		//    ,new FOR_SingleELT<Number>(n3)
		//    ,new FOR_StepUntil(n5,n3,n201)
		//    ,new FOR_WhileElt<Number>(n4,b1)
		// )) { if(!CB_) continue;
		//      // Statements ...
		// }
		// ------------------------------------------------------------
		Global.sourceLineNumber = lineNumber;
		ASSERT_SEMANTICS_CHECKED();
		boolean refType = controlVariable.type.isReferenceType();
		String CB = "CB_" + lineNumber;
		GeneratedJavaClass.code("for(boolean " + CB + ":new FOR_List(");
		char del = ' ';
		for (ForListElement elt : forList) {
			String classIdent = (refType) ? elt.expr1.type.getJavaRefIdent() : "Number";
			switch(elt.expr1.type.keyWord) {
				case Type.T_CHARACTER -> classIdent = "Character"; // AD'HOC
				case Type.T_BOOLEAN -> classIdent = "Boolean"; // AD'HOC
				case Type.T_TEXT -> classIdent = "RTS_TXT"; // AD'HOC
			}
			GeneratedJavaClass.code("   " + del + elt.edCode(classIdent, elt.expr1.type));
			del = ',';
		}
		GeneratedJavaClass.code("   )) { if(!" + CB + ") continue;");
		doStatement.doJavaCoding();
		GeneratedJavaClass.code("}");
	}

	/**
	 * Check if this ForListElement is a single optimizable element.
	 * @return a single optimizable element or null
	 */
	private ForListElement getSingleOptimizableElement() {
		if (forList.size() != 1)
			return (null);
		ForListElement elt = forList.firstElement();
		return (elt.isOptimisable());
	}

	/**
	 * Coding Utility: Edit control variable by name.
	 * @param classIdent Java class identifier
	 * @param xType control variable's type
	 * @return the resulting Java source code for this ForListElement
	 */
	private String edControlVariableByName(final String classIdent, Type xType) {
		String cv = controlVariable.toJavaCode();
		String castVar = "x_;";
		switch (controlVariable.type.keyWord) {
			case Type.T_INTEGER -> castVar = "x_.intValue();";
			case Type.T_REAL -> castVar = "x_.floatValue();";
			case Type.T_LONG_REAL -> castVar = "x_.doubleValue();";
			default -> {
				if (controlVariable.type.isReferenceType()) {
					ClassDeclaration qual = controlVariable.type.getQual();
					if (!(controlVariable.type.equals(xType)))
						castVar = "(" + qual.getJavaIdentifier() + ")x_;";
				}
			}
		}
		String cvName = "new RTS_NAME<" + classIdent + ">()" + "{ public " + classIdent + " put(" + classIdent + " x_){"
				+ cv + "=" + castVar + " return(x_);};" + "  public " + classIdent + " get(){return((" + classIdent
				+ ")" + cv + "); }	}";
		return (cvName);
	}

	@Override
	public void print(final int indent) {
		String spc = edIndent(indent);
		String fl = forList.toString().replace('[', ' ').replace(']', ' ');
		Util.println(spc + "FOR " + controlVariable + " " + KeyWord.edit(assignmentOperator) + fl + "DO");
		if (doStatement != null)
			doStatement.print(indent);
	}

	@Override
	public void printTree(final int indent) {
		String fl = forList.toString().replace('[', ' ').replace(']', ' ');
		System.out.println(edTreeIndent(indent)+"FOR " + controlVariable + " " + KeyWord.edit(assignmentOperator) + fl + " DO ");
		doStatement.printTree(indent+1);
	}

	@Override
	public String toString() {
		String fl = forList.toString().replace('[', ' ').replace(']', ' ');
		return ("FOR " + controlVariable + " " + KeyWord.edit(assignmentOperator) + fl + " DO " + doStatement);
	}

	// ************************************************************************************
	// *** ForListElement -- Single Value
	// ************************************************************************************
	/**
	 * Utility class ForListElement implementing a single value element.
	 */
	private class ForListElement {
		/**
		 * The first expression
		 */
		Expression expr1;

		/**
		 * Create a new ForListElement.
		 * @param expr1 The first expression
		 */
		public ForListElement(final Expression expr1) {
			this.expr1 = expr1;
			if (Option.TRACE_PARSE)
				Util.TRACE("NEW ForListElement: " + toString());
		}

		/**
		 * Perform semantic checking.
		 */
		public void doChecking() {
			if (Option.TRACE_CHECKER)
				Util.TRACE("BEGIN ForListElement(" + this + ").doChecking - Current Scope Chain: "
						+ Global.getCurrentScope().edScopeChain());
			expr1.doChecking();
			expr1 = TypeConversion.testAndCreate(controlVariable.type, expr1);
			expr1.doChecking();
			expr1.backLink = ForStatement.this; // To ensure _RESULT from functions
		}

		/**
		 * Edit Java source code for this ForListElement.
		 * @param classIdent Java class identifier
		 * @param xType control variable's type
		 * @return the resulting Java source code for this ForListElement
		 */
		public String edCode(final String classIdent, Type xType) {
			String forElt = (controlVariable.type.keyWord == Type.T_TEXT && assignmentOperator == KeyWord.ASSIGNVALUE) ? "TValElt"
					: "Elt<" + classIdent + ">";
			return ("new FOR_Single" + forElt + "(" + edControlVariableByName(classIdent, xType) + ",new RTS_NAME<"
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
			String cv = controlVariable.toJavaCode();
			String val = this.expr1.toJavaCode();
			if (expr1.type != controlVariable.type) {
				switch (controlVariable.type.keyWord) {
					case Type.T_INTEGER ->   val = "(int)" + val;
					case Type.T_REAL ->      val = "(float)" + val;
					case Type.T_LONG_REAL -> val = "(double)" + val;
					default -> {
						if (controlVariable.type.isReferenceType()) {
							ClassDeclaration qual = controlVariable.type.getQual();
							if (!(controlVariable.type.equals(this.expr1.type)))
								val = "(" + qual.getJavaIdentifier() + ")" + val;
						}
					}
				}
			}
			GeneratedJavaClass.code(cv + "=" + val + "; {");
			doStatement.doJavaCoding();
			GeneratedJavaClass.code("}");
		}

//		@Override
		public void doSingleElementByteCoding(CodeBuilder codeBuilder) {
	        // 0: aload_0
	        // 1: aload_0
	        // 2: getfield      #16                 // Field k:I
	        // 5: putfield      #19                 // Field l:I
			SimpleVariableDeclaration decl = (SimpleVariableDeclaration)controlVariable.meaning.declaredAs;

			// controlVariable := expr1
			controlVariable.buildIdentifierAccess(true, codeBuilder);
			expr1.buildEvaluation(null,codeBuilder); // evaluate expr1
			
			// GeneratedJavaClass.code(cv + "=" + val + "; {");
			codeBuilder.putfield(decl.getFieldRefEntry(codeBuilder.constantPool()));

			doStatement.buildByteCode(codeBuilder);
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

//		@Override
		public void writeObject(AttributeOutputStream oupt) throws IOException {
			Util.TRACE_OUTPUT("writeForListElement: " + this);
			oupt.writeShort(1);
			oupt.writeObj(expr1);
		}

		public static ForListElement readObject(ForStatement x, AttributeInputStream inpt) throws IOException {
			Util.TRACE_INPUT("BEGIN readForListElement: ");
			ForListElement stm = null;
			int nExpr = inpt.readShort();
			switch(nExpr) {
			case 1:
				Expression expr1 = (Expression) inpt.readObj();
				stm = x.new ForListElement(expr1);
				break;
			case 2: 
				Expression expr21 = (Expression) inpt.readObj();
				Expression expr22 = (Expression) inpt.readObj();
				stm = x.new WhileElement(expr21,expr22);
				break;
			case 3: 
				Expression expr31 = (Expression) inpt.readObj();
				Expression expr32 = (Expression) inpt.readObj();
				Expression expr33 = (Expression) inpt.readObj();
				stm = x.new StepUntilElement(expr31,expr32,expr33);
				break;
			}
			Util.TRACE_INPUT("ForListElement: " + stm);
			return(stm);
		}

	}

	// ************************************************************************************
	// *** ForListElement -- While Element
	// ************************************************************************************
	/**
	 * Utility class: For-list While element.
	 */
	private class WhileElement extends ForListElement {
		
		/**
		 * The second expression.
		 */
		final Expression expr2;

		/**
		 * Create a new WhileElement.
		 * @param expr1 first expression 
		 * @param expr2 second expression
		 */
		public WhileElement(final Expression expr1, final Expression expr2) {
			super(expr1);
			this.expr2 = expr2;
		}

		@Override
		public void doChecking() {
			if (Option.TRACE_CHECKER)
				Util.TRACE("BEGIN WhileElement(" + this + ").doChecking - Current Scope Chain: "
						+ Global.getCurrentScope().edScopeChain());
			expr1.doChecking();
			expr2.doChecking();
			if (expr2.type.keyWord != Type.T_BOOLEAN)
				Util.error("While " + expr2 + " is not of type Boolean");
			expr1 = TypeConversion.testAndCreate(controlVariable.type, expr1);
			expr1.backLink = ForStatement.this; // To ensure _RESULT from functions
			expr2.backLink = ForStatement.this; // To ensure _RESULT from functions
		}

		@Override
		public String edCode(final String classIdent, Type xType) {
			String forElt = (controlVariable.type.keyWord == Type.T_TEXT && assignmentOperator == KeyWord.ASSIGNVALUE) ? "TValElt" : "Elt<" + classIdent + ">";
			return ("new FOR_While" + forElt + "(" + edControlVariableByName(classIdent, xType) + ",new RTS_NAME<"
					+ classIdent + ">() { public " + classIdent + " get(){return(" + expr1.toJavaCode() + "); }}"
					+ ",new RTS_NAME<Boolean>() { public Boolean get(){return(" + expr2.toJavaCode() + "); }})");
		}

		@Override
		public ForListElement isOptimisable() {
			return (this);
		}

		@Override
		public void doSimplifiedJavaCoding() {
			String cv = controlVariable.toJavaCode();
			String cond = this.expr2.toJavaCode();
			// ------------------------------------------------------------
			// cv=expr1; while(cond) { Statements ... cv=expr1; }
			// ------------------------------------------------------------
			GeneratedJavaClass.code(cv + "=" + this.expr1.toJavaCode() + ";");
			GeneratedJavaClass.code("while(" + cond + ") {");
			doStatement.doJavaCoding();
			GeneratedJavaClass.code(cv + "=" + this.expr1.toJavaCode() + ";");
			GeneratedJavaClass.code("}");
		}

		@Override
		public void doSingleElementByteCoding(CodeBuilder codeBuilder) {
			
			// V while B REPEAT: C:= V;
			//                   if not B then goto END;
			//                   S;
			//                   goto REPEAT; 
			//           END:
			//                 ... next statement
			Label repeatLabel = codeBuilder.newLabel();
			Label endLabel = codeBuilder.newLabel();
			SimpleVariableDeclaration decl = (SimpleVariableDeclaration)controlVariable.meaning.declaredAs;
			FieldRefEntry FRE=decl.getFieldRefEntry(codeBuilder.constantPool());

			codeBuilder.labelBinding(repeatLabel);
			// controlVariable := expr1
			controlVariable.buildIdentifierAccess(true, codeBuilder);
			this.expr1.buildEvaluation(null,codeBuilder); // evaluate expr1
			codeBuilder.putfield(FRE);
			
			this.expr2.buildEvaluation(null,codeBuilder); // evaluate condition
			codeBuilder
				.iconst_1()
				.if_icmpne(endLabel);
			doStatement.buildByteCode(codeBuilder);
			codeBuilder
				.goto_(repeatLabel)
				.labelBinding(endLabel);
		}

		@Override
		public void buildByteCode(CodeBuilder codeBuilder,VariableExpression controlVariable) {
			codeBuilder
				.new_(CD.FOR_WhileElt)
				.dup();
			Parameter.buildNameParam(codeBuilder,controlVariable);
			Parameter.buildNameParam(codeBuilder,expr1); // PARAMETER: RTS_NAME<T> expr
			Parameter.buildNameParam(codeBuilder,expr2); // PARAMETER: RTS_NAME<T> cond

			MethodTypeDesc MTD=MethodTypeDesc.ofDescriptor(
					"(Lsimula/runtime/RTS_NAME;Lsimula/runtime/RTS_NAME;Lsimula/runtime/RTS_NAME;)V");
			codeBuilder.invokespecial(CD.FOR_WhileElt, "<init>", MTD); // Invoke Constructor
		}

		// ***********************************************************************************************
		// *** Attribute File I/O
		// ***********************************************************************************************

		@Override
		public void writeObject(AttributeOutputStream oupt) throws IOException {
			Util.TRACE_OUTPUT("writeForListElement: " + this);
			oupt.writeShort(2);
			oupt.writeObj(expr1);
			oupt.writeObj(expr2);
		}

		public String toString() {
			return ("" + expr1 + " while " + expr2);
		}
	}

	// ************************************************************************************
	// *** ForListElement -- Step Until Element
	// ************************************************************************************
	/**
	 * Utility class: For-list Step until element.
	 */
	private class StepUntilElement extends ForListElement {
		/**
		 * The second expression.
		 */
		Expression expr2;
		
		/**
		 * The third expression.
		 */
		Expression expr3;

		/**
		 * Create a new StepUntilElement.
		 * @param expr1 The first expression
		 * @param expr2 The second expression
		 * @param expr3 The third expression
		 */
		public StepUntilElement(final Expression expr1, final Expression expr2, final Expression expr3) {
			super(expr1);
			this.expr2 = expr2;
			this.expr3 = expr3;
			if (expr1 == null)
				Util.error("Missing expression before 'step' in ForStatement");
			if (expr2 == null)
				Util.error("Missing expression after 'step' in ForStatement");
			if (expr3 == null)
				Util.error("Missing expression after 'until' in ForStatement");
		}

		@Override
		public void doChecking() {
			expr1.doChecking();
			expr1 = TypeConversion.testAndCreate(controlVariable.type, expr1);
			expr2.doChecking();
			expr2 = TypeConversion.testAndCreate(controlVariable.type, expr2);
			expr3.doChecking();
			expr3 = TypeConversion.testAndCreate(controlVariable.type, expr3);
			expr1.backLink = ForStatement.this; // To ensure _RESULT from functions
			expr2.backLink = ForStatement.this; // To ensure _RESULT from functions
			expr3.backLink = ForStatement.this; // To ensure _RESULT from functions
		}

		@Override
		public String edCode(final String classIdent, Type xType) {
			return ("new FOR_StepUntil(" + edControlVariableByName(classIdent, xType)
					+ ",new RTS_NAME<Number>() { public Number get(){return(" + expr1.toJavaCode() + "); }}"
					+ ",new RTS_NAME<Number>() { public Number get(){return(" + expr2.toJavaCode() + "); }}"
					+ ",new RTS_NAME<Number>() { public Number get(){return(" + expr3.toJavaCode() + "); }})");

		}

		@Override
		public ForListElement isOptimisable() {
			return this; // All for-step-until elements are optimisable.
		}

		@Override
		public void doSimplifiedJavaCoding() {
			Number num2 = expr2.getNumber();
			if(num2 == null) {
				generalCase();
				return;
			}
			int step = num2.intValue();
			String cv = controlVariable.toJavaCode();
			String stepClause, incrClause;
			if (step >= 0) {
				// ------------------------------------------------------------
				// for(cv=expr1; cv<=expr3; cv=cv+step) { Statements ... }
				// ------------------------------------------------------------
				stepClause = cv + "<=" + this.expr3.toJavaCode() + ";";
				if (step == 1)
					incrClause = cv + "++";
				else
					incrClause = cv + "=" + cv + "+" + step;
			} else {
				// ------------------------------------------------------------
				// for(cv=expr1; cv>=expr3; cv=cv+step) { Statements ... }
				// ------------------------------------------------------------
				stepClause = cv + ">=" + this.expr3.toJavaCode() + ";";
				if (step == -1)
					incrClause = cv + "--";
				else
					incrClause = cv + "=" + cv + step;
			}
			GeneratedJavaClass
					.code("for(" + cv + "=" + this.expr1.toJavaCode() + ";" + stepClause + incrClause + ") {");
			doStatement.doJavaCoding();
			GeneratedJavaClass.code("}");
		}
		
		/**
		 * <pre>
		 * FOR controlVariable := expr1 STEP expr2 UNTIL expr3 DO statement;
		 *
		 * According to Simula Standard:
		 *
		 * 		int/float/double DELTA; // Local
		 * 
		 *		controlVariable = expr1();
		 * 		DELTA = expr2();
		 * 		while( DELTA*(controlVariable-expr3()) <= 0) {
		 * 			STATEMENT();
		 * 			DELTA = expr2();
		 * 			controlVariable = controlVariable + DELTA;
		 * 		}  // end while;
		 *
		 *
		*/
		private static int SEQU=0;
		private void generalCase() {
//			System.out.println("ForStatement.generalCase: "+this);
			String cv = controlVariable.toJavaCode();
			String deltaType=expr2.type.toJavaType();
			String deltaID = "DELTA_" + (SEQU++);
			GeneratedJavaClass.debug("// ForStatement:");
			GeneratedJavaClass.code(deltaType + " " + deltaID + ';');
			GeneratedJavaClass.code(cv + " = " + this.expr1.toJavaCode() + ";");
			GeneratedJavaClass.code(deltaID + " = " + this.expr2.toJavaCode() + ";");
			GeneratedJavaClass.code("while( "+ deltaID + " * ( " + cv + " - (" + this.expr3.toJavaCode() + ") ) <= 0 ) {");
			
			doStatement.doJavaCoding();
			
			GeneratedJavaClass.code(deltaID + " = " + this.expr2.toJavaCode() + ";");
			GeneratedJavaClass.code(cv + " = " + cv + " + " + deltaID + ';');
			GeneratedJavaClass.code("}","end while");
		}

		
		/**
		 * <pre>
		 * FOR controlVariable := expr1 STEP expr2 UNTIL expr3 DO statement;
		 *
		 *
		 * int/float/double DELTA; // Local
		 * 
		 * controlVariable = expr1();
		 * DELTA = expr2();
		 * while( sign(DELTA) * (controlVariable - expr3() ) <= 0) {
		 * 		STATEMENT();
		 * 		DELTA = expr2();
		 * 		controlVariable = controlVariable + DELTA;
		 * }  // end while;
		 * 
		 * 
    	 *   // controlVariable = expr1();
         *   aload_0
         *   aload_0
         *   invokevirtual #24                 // Method expr1:()I
         *   putfield      #12                 // Field controlVariable:I
         * 
	     * // DELTA = expr2();
         *   aload_0
         *   invokevirtual #26                 // Method expr2:()I
         *   istore_1	   // Local DELTA
		 *
         * TST:
	     * // if(DELTA*(controlVariable-expr3()) > 0) goto END
         *   iload_1       // Local DELTA
         *   aload_0
         *   getfield      #12                 // Field controlVariable:I
         *   aload_0
         *   invokevirtual #30                 // Method expr3:()I
         *   isub
         *   imul
         *   ifle          END
		 *
         * // STATEMENT
         *   aload_0
         *   invokevirtual #28                 // Method STATEMENT:()V
         *   
         * // DELTA = expr2();
         *   aload_0
         *   invokevirtual #26                 // Method expr2:()I
         *   istore_1      // Local DELTA
         *   
         * // controlVariable = controlVariable + DELTA;  
         *   aload_0
         *   dup
         *   getfield      #12                 // Field controlVariable:I
         *   iload_1       // Local DELTA
         *   iadd
         *   putfield      #12                 // Field controlVariable:I
         *
         *   goto          TST
         *   
         * END:  
         * </pre>
		 */
		@Override
		public void doSingleElementByteCoding(CodeBuilder codeBuilder) {
			Label tstLabel = codeBuilder.newLabel();
			Label endLabel = codeBuilder.newLabel();
			
			FieldRefEntry CTRL = null;
			if(controlVariable.meaning.declaredAs instanceof SimpleVariableDeclaration var) {
				CTRL=var.getFieldRefEntry(codeBuilder.constantPool());
			} else if(controlVariable.meaning.declaredAs instanceof Parameter par) {
				CTRL=par.getFieldRefEntry(codeBuilder.constantPool());
			} else Util.IERR();
			
			int DELTA = BlockDeclaration.currentBlock.allocateLocalVariable(expr2.type); // Local Slot 1, 2 ...

	    	//      // controlVariable = expr1();
	        //      aload_0
	        //      aload_0
	        //      invokevirtual #24                 // Method expr1:()I
	        //      putfield      #12                 // Field controlVariable:I
			controlVariable.buildIdentifierAccess(true, codeBuilder);
			this.expr1.buildEvaluation(null,codeBuilder);
			TypeConversion.buildMayBeConvert(expr1.type, controlVariable.type, codeBuilder);
			codeBuilder.putfield(CTRL);

			// LOOP:
		    //      // DELTA = expr2();
	        //      aload_0
	        //      invokevirtual #26                 // Method expr2:()I
	        //      istore_1
			this.expr2.buildEvaluation(null,codeBuilder); // init
			switch(expr2.type.keyWord) {
				case Type.T_INTEGER ->   codeBuilder.istore(DELTA);
				case Type.T_REAL ->      codeBuilder.fstore(DELTA);
				case Type.T_LONG_REAL -> codeBuilder.dstore(DELTA);
				default -> Util.IERR();
			}

			// TST:
			//      // if(DELTA*(controlVariable-expr3()) > 0) goto END
			//      iload_1                           // Local DELTA
			//      aload_0
			//      getfield      #12                 // Field controlVariable:I
			//      aload_0
			//      invokevirtual #30                 // Method expr3:()I
			//      isub
			//      imul
			//      ifle          16  // STM
			codeBuilder.labelBinding(tstLabel);
			switch(controlVariable.type.keyWord) {
				case Type.T_INTEGER -> {
					codeBuilder
						.iload(DELTA)
						.invokestatic(BlockDeclaration.currentClassDesc(), "isign", MethodTypeDesc.ofDescriptor("(I)I"));
				}
				case Type.T_REAL -> {
					codeBuilder
						.fload(DELTA)
						.invokestatic(BlockDeclaration.currentClassDesc(), "fsign", MethodTypeDesc.ofDescriptor("(F)F"));
				}
				case Type.T_LONG_REAL -> {
					codeBuilder
						.dload(DELTA)
						.invokestatic(BlockDeclaration.currentClassDesc(), "dsign", MethodTypeDesc.ofDescriptor("(D)D"));
				}
				default -> Util.IERR();
			}
			controlVariable.buildIdentifierAccess(true, codeBuilder);
			codeBuilder.getfield(CTRL);

			this.expr3.buildEvaluation(null,codeBuilder);
			TypeConversion.buildMayBeConvert(controlVariable.type,this.expr3.type, codeBuilder);
			
			switch(controlVariable.type.keyWord) {
				case Type.T_INTEGER ->   codeBuilder.isub().imul();
				case Type.T_REAL ->      codeBuilder.fsub().fmul().fconst_0().fcmpg();
				case Type.T_LONG_REAL -> codeBuilder.dsub().dmul().dconst_0().dcmpg();
				default -> Util.IERR();
			}
			
			codeBuilder.ifgt(endLabel);
			
			
	        // STM: STATEMENT
	        //      aload_0
	        //      invokevirtual #28                 // Method STATEMENT:()V
			doStatement.buildByteCode(codeBuilder);

			// DELTA = expr2();
			//      aload_0
			//      invokevirtual #26                 // Method expr2:()I
			//      istore_1
			this.expr2.buildEvaluation(null,codeBuilder);
			switch(expr2.type.keyWord) {
				case Type.T_INTEGER ->   codeBuilder.istore(DELTA);
				case Type.T_REAL ->      codeBuilder.fstore(DELTA);
				case Type.T_LONG_REAL -> codeBuilder.dstore(DELTA);
				default -> Util.IERR();
			}
			
	        // controlVariable = controlVariable + DELTA;  
	        // 25: aload_0
	        // 26: dup
	        // 27: getfield      #12                 // Field controlVariable:I
	        // 30: iload_1
	        // 31: iadd
	        // 32: putfield      #12                 // Field controlVariable:I
			controlVariable.buildIdentifierAccess(true, codeBuilder);
			codeBuilder
				.dup()
				.getfield(CTRL);
			switch(expr2.type.keyWord) {
				case Type.T_INTEGER ->   codeBuilder.iload(DELTA).iadd();
				case Type.T_REAL ->      codeBuilder.fload(DELTA).fadd();
				case Type.T_LONG_REAL -> codeBuilder.dload(DELTA).dadd();
				default -> Util.IERR();
			}
			
			// MAY BE CONVERT   TOS:DELTA to controlVariable.type
			TypeConversion.buildMayBeConvert(expr2.type, controlVariable.type, codeBuilder);
			
			codeBuilder.putfield(CTRL);

	        // 13: goto          35  // TST
			codeBuilder.goto_(tstLabel);
			
			codeBuilder.labelBinding(endLabel);
		}


		@Override
		public void buildByteCode(CodeBuilder codeBuilder,VariableExpression controlVariable) {
			codeBuilder
				.new_(CD.FOR_StepUntil)
				.dup();
			Parameter.buildNameParam(codeBuilder,controlVariable);
			Parameter.buildNameParam(codeBuilder,expr1); // PARAMETER: RTS_NAME<T> init
			Parameter.buildNameParam(codeBuilder,expr2); // PARAMETER: RTS_NAME<T> step
			Parameter.buildNameParam(codeBuilder,expr3); // PARAMETER: RTS_NAME<T> until

			MethodTypeDesc MTD=MethodTypeDesc.ofDescriptor(
					"(Lsimula/runtime/RTS_NAME;Lsimula/runtime/RTS_NAME;Lsimula/runtime/RTS_NAME;Lsimula/runtime/RTS_NAME;)V");
			codeBuilder.invokespecial(CD.FOR_StepUntil, "<init>", MTD); // Invoke Constructor
		}

		// ***********************************************************************************************
		// *** Attribute File I/O
		// ***********************************************************************************************

		@Override
		public void writeObject(AttributeOutputStream oupt) throws IOException {
			Util.TRACE_OUTPUT("writeForListElement: " + this);
			oupt.writeShort(3);
			oupt.writeObj(expr1);
			oupt.writeObj(expr2);
			oupt.writeObj(expr3);
		}

		@Override
		public String toString() {
			return ("" + expr1 + " step " + expr2 + " until " + expr3);
		}
	}


	@Override
	public void buildByteCode(CodeBuilder codeBuilder) {
		ASSERT_SEMANTICS_CHECKED();
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		if (forList.size() == 1) {
			ForListElement singleElement = forList.firstElement();
			singleElement.doSingleElementByteCoding(codeBuilder);
			return;
		}

		// ------------------------------------------------------------
		// Example:
		//
		// for(boolean CB_:new ForList(
		//     new FOR_SingleELT<Number>(n1)
		//    ,new FOR_SingleELT<Number>(n3)
		//    ,new FOR_StepUntil(n5,n3,n201)
		//    ,new FOR_WhileElt<Number>(n4,b1)
		// )) { if(!CB_) continue;
		//      // Statements ...
		// }
		// ------------------------------------------------------------
		Global.sourceLineNumber = lineNumber;
		ASSERT_SEMANTICS_CHECKED();
		
		codeBuilder
			.new_(CD.FOR_List)
			.dup();
		Constant.buildIntConst(codeBuilder, this.forList.size());
		codeBuilder
			.anewarray(CD.FOR_Element)
			.dup();

		int n = this.forList.size();
		for(int i=0;i<n;i++) {
			Constant.buildIntConst(codeBuilder, i); // Index in 
			forList.get(i).buildByteCode(codeBuilder,controlVariable);
		    //   aastore
		    //   dup        // ONLY IF i < (n-1)
			codeBuilder.aastore();
			if(i<(n-1)) codeBuilder.dup();
		}
		MethodTypeDesc MTD = MethodTypeDesc.ofDescriptor("([Lsimula/runtime/FOR_Element;)V");
		codeBuilder.invokespecial(CD.FOR_List, "<init>", MTD); // Invoke ForList'Constructor
		
		Label contLabel = codeBuilder.newLabel();
		Label stmLabel = codeBuilder.newLabel();
		Label endLabel = codeBuilder.newLabel();
		int index1 = BlockDeclaration.currentBlock.allocateLocalVariable(Type.Ref);
		ClassDesc CD_Iterator = ClassDesc.of("java.util.Iterator");
		codeBuilder
			.invokevirtual(pool.methodRefEntry(CD.FOR_List, "iterator", MethodTypeDesc.ofDescriptor("()Ljava/util/Iterator;")))
			.astore(index1)
			.labelBinding(contLabel)
			.aload(index1)
			.invokeinterface(CD_Iterator, "hasNext", MethodTypeDesc.ofDescriptor("()Z"))
			.ifeq(endLabel)
			.aload(index1)
			.invokeinterface(CD_Iterator, "next", MethodTypeDesc.ofDescriptor("()Ljava/lang/Object;"))
			.checkcast(ConstantDescs.CD_Boolean)
			.invokevirtual(pool.methodRefEntry(ConstantDescs.CD_Boolean, "booleanValue", MethodTypeDesc.ofDescriptor("()Z")))
			.ifne(stmLabel)
			.goto_(contLabel)
			.labelBinding(stmLabel);
		doStatement.buildByteCode(codeBuilder);
		codeBuilder
			.goto_(contLabel)
			.labelBinding(endLabel);
	}

	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************
	/**
	 * Default constructor used by Attribute File I/O
	 */
	public ForStatement() {
		super(0);
	}

	@Override
	public void writeObject(AttributeOutputStream oupt) throws IOException {
		Util.TRACE_OUTPUT("writeForStatement: " + this);
		oupt.writeKind(ObjectKind.ForStatement);
		oupt.writeShort(SEQU);
		oupt.writeShort(lineNumber);
		oupt.writeObj(controlVariable);
		oupt.writeShort(assignmentOperator);
		oupt.writeShort(forList.size());
		for(ForListElement ent:forList) ent.writeObject(oupt);
		oupt.writeObj(doStatement);
	}

	public static ForStatement readObject(AttributeInputStream inpt) throws IOException {
		Util.TRACE_INPUT("BEGIN readForStatement: ");
		ForStatement stm = new ForStatement();
		stm.SEQU = inpt.readSEQU(stm);
		stm.lineNumber = inpt.readShort();
		stm.controlVariable = (VariableExpression) inpt.readObj();
		stm.assignmentOperator = inpt.readShort();
		int n = inpt.readShort();
		if(n > 0) {
			stm.forList = new Vector<ForListElement>();
			for(int i=0;i<n;i++)
				stm.forList.add(ForListElement.readObject(stm,inpt));
		}
		stm.doStatement = (Statement) inpt.readObj();
		Util.TRACE_INPUT("ForStatement: " + stm);
		return(stm);
	}

}
