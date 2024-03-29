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
import java.lang.constant.ClassDesc;
import java.lang.constant.MethodTypeDesc;
import java.util.Iterator;
import java.util.Vector;

import simula.compiler.parsing.Parse;
import simula.compiler.syntaxClass.SyntaxClass;
import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.declaration.ArrayDeclaration;
import simula.compiler.syntaxClass.declaration.ClassDeclaration;
import simula.compiler.syntaxClass.declaration.Declaration;
import simula.compiler.syntaxClass.declaration.Parameter;
import simula.compiler.utilities.CD;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.KeyWord;
import simula.compiler.utilities.Meaning;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * ObjectGenerator i.e. new Object expression.
 * 
 * <pre>
 * 
 * Simula Standard: 3.8 Object expressions
 * 
 * object-generator = NEW class-identifier [ ( actual-parameter-part ) ]
 * 
 *    actual-parameter-part
 *         =  "("  actual-parameter  {  ,  actual-parameter  }  ")"
 *
 *       actual-parameter
 *           =  expression
 *           |  array-identifier-1
 *           |  switch-identifier
 *           |  procedure-identifier-1
 * 
 * </pre>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/expression/ObjectGenerator.java"><b>Source File</b></a>.
 * 
 * @author SIMULA Standards Group
 * @author Øystein Myhre Andersen
 */
public final class ObjectGenerator extends Expression {
	
	/**
	 * The class-identifier
	 */
	private String classIdentifier;
	
	/**
	 * The semantic meaning 
	 */
	Meaning meaning;
	
	/**
	 * The actual parameters before checking
	 */
	private Vector<Expression> params;
	
	/**
	 * The actual parameters after checking
	 */
	private Vector<Expression> checkedParams = new Vector<Expression>();

	/**
	 * Create a new ObjectGenerator
	 * @param ident class-identifier
	 * @param params the actual parameters
	 */
	private ObjectGenerator(final String ident,final Vector<Expression> params) {
		this.classIdentifier = ident;
		this.type = Type.Ref(classIdentifier);
		this.params = params;
		if (Option.TRACE_PARSE) Util.TRACE("NEW ObjectGenerator: " + toString());
	}

	/**
	 * Parse an object generator
	 * <pre>
	 * object-generator = NEW class-identifier [ ( actual-parameter-part ) ]
	 * 
	 *    actual-parameter-part
	 *         =  "("  actual-parameter  {  ,  actual-parameter  }  ")"
	 * </pre>
	 * @return the newly created ObjectGenerator.
	 */
	static Expression expectNew() {
		if (Option.TRACE_PARSE)
			Util.TRACE("Parse ObjectGenerator, current=" + Parse.currentToken);
		String classIdentifier = Parse.expectIdentifier();
		Vector<Expression> params = new Vector<Expression>();
		if (Parse.accept(KeyWord.BEGPAR)) {
			do {
				Expression par=acceptExpression();
				if(par==null) Util.error("Missing class parameter");
				else params.add(par);
			} while (Parse.accept(KeyWord.COMMA));
			Parse.expect(KeyWord.ENDPAR);
		}

		Expression expr = new ObjectGenerator(classIdentifier, params);
		return (expr);
	}

	@Override
	public void doChecking() {
		if (IS_SEMANTICS_CHECKED())	return;
		Global.sourceLineNumber = lineNumber;
		if (Option.TRACE_CHECKER)
			Util.TRACE("BEGIN ObjectGenerator(" + classIdentifier + ").doChecking - Current Scope Chain: " + Global.getCurrentScope().edScopeChain());
		meaning = Global.getCurrentScope().findMeaning(classIdentifier);
		if (meaning == null) {
			Util.error("Undefined class identifier: " + classIdentifier);
			meaning = new Meaning(null, null); // Error Recovery: No Meaning
		}
		if (!(meaning.declaredAs instanceof ClassDeclaration)) {
			Util.error("NEW " + classIdentifier + ": Not a Class");
			return;
		}
		ClassDeclaration cls = (ClassDeclaration) meaning.declaredAs;
		// Check parameters
		Iterator<Parameter> formalIterator = cls.parameterIterator();
		Iterator<Expression> actualIterator = params.iterator();
		while (actualIterator.hasNext()) {
			if (!formalIterator.hasNext())
				Util.error("Wrong number of parameters to " + cls);
			Declaration formalParameter = formalIterator.next();
			Type formalType = formalParameter.type;
			if (Option.TRACE_CHECKER)
				Util.TRACE("Formal Parameter: " + formalParameter + ", Formal Type=" + formalType);
			Expression actualParameter = actualIterator.next();
			actualParameter.doChecking();

			Type actualType = actualParameter.type;
			if (Option.TRACE_CHECKER)
				Util.TRACE("Actual Parameter: " + actualType + " " + actualParameter + ", Actual Type=" + actualType);
			Expression checkedParameter = TypeConversion.testAndCreate(formalType, actualParameter);
			checkedParameter.backLink = this;
			checkedParams.add(checkedParameter);

		}
		if (formalIterator.hasNext())
			Util.error("Missing parameter("+formalIterator.next()+") to " + cls);
		if (Option.TRACE_CHECKER)
			Util.TRACE("END ObjectGenerator(" + classIdentifier + ").doChecking: type=" + type);
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
		StringBuilder s = new StringBuilder();
		String classIdent = meaning.declaredAs.getJavaIdentifier();
		s.append("new ").append(classIdent).append('(');
		s.append(meaning.edUnqualifiedStaticLink());

		ClassDeclaration cls = (ClassDeclaration) meaning.declaredAs;
		Iterator<Parameter> formalIterator = cls.parameterIterator();
		for (Expression par : checkedParams) {
			Parameter formalParameter = formalIterator.next();
			if (formalParameter.mode == Parameter.Mode.value) {
				if (par.type.equals(Type.Text))
					s.append(",copy(").append(par.toJavaCode()).append(')');
				else if (formalParameter.kind == Parameter.Kind.Array) {
					String cast=par.type.toJavaArrayType();
					s.append(",((").append(cast).append(')').append(par.toJavaCode()).append(").COPY()");
				}
				else
					s.append(',').append(par.toJavaCode());
			} else
				s.append(',').append(par.toJavaCode());
		}

		s.append(')');
		if (cls.isDetachUsed()) {
			s.append("._START()");
			String start=s.toString();
			if(backLink!=null) start="(("+classIdent+')'+start+')';
			return(start);
		} else
			s.append("._STM()");
		return (s.toString());
	}

	@Override
	public void buildEvaluation(Expression rightPart,CodeBuilder codeBuilder) {
		ASSERT_SEMANTICS_CHECKED();
		//  new adHoc03_A((_CUR))._STM();
		//
		//   0: new           #44                 // class simulaTestPrograms/adHoc03_A
		//   3: dup
		//   4: getstatic     #46                 // Field _CUR:Lsimula/runtime/RTS_RTObject;
		//   7: invokespecial #49                 // Method simulaTestPrograms/adHoc03_A."<init>":(Lsimula/runtime/RTS_RTObject;)V
		//  10: invokevirtual #50                 // Method simulaTestPrograms/adHoc03_A._STM:()LsimulaTestPrograms/adHoc03_A;
		//  13: pop
		//
		// 	x:-new A;
		//   1: new           #19                 // class simulaTestPrograms/adHoc07_A
		//   4: dup
		//   5: getstatic     #21                 // Field _CUR:Lsimula/runtime/RTS_RTObject;
		//   8: invokespecial #25                 // Method simulaTestPrograms/adHoc07_A."<init>":(Lsimula/runtime/RTS_RTObject;)V
		//  11: invokevirtual #26                 // Method simulaTestPrograms/adHoc07_A._START:()Lsimula/runtime/RTS_RTObject;
		//  14: checkcast     #19                 // class simulaTestPrograms/adHoc07_A
		//  17: putfield      #7                  // Field x_2:LsimulaTestPrograms/adHoc07_A;

		ClassDeclaration cls = (ClassDeclaration) meaning.declaredAs;
		ClassDesc CD_cls=cls.getClassDesc();
		codeBuilder
			.new_(CD_cls)
			.dup();
		meaning.buildQualifiedStaticLink(codeBuilder);

		// Push parameters
		Iterator<Parameter> formalIterator = cls.parameterIterator();
		for (Expression par : checkedParams) {
			par.buildEvaluation(null,codeBuilder);
			Parameter formalParameter = formalIterator.next();
			if (formalParameter.mode == Parameter.Mode.value) {
				if (par.type.equals(Type.Text)) {
					codeBuilder.invokestatic(CD.RTS_RTObject,
								"copy", MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_TXT;)Lsimula/runtime/RTS_TXT;"));
				}
				else if (formalParameter.kind == Parameter.Kind.Array) {
					String cast=par.type.toJavaArrayType();
					codeBuilder.invokevirtual(ArrayDeclaration.getClassDesc(par.type),
							"COPY", MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_RTObject$"+cast+';'));
				}
			}
		}

		codeBuilder.invokespecial(CD_cls, "<init>", cls.getConstructorMethodTypeDesc());

		// _STM(); or _START
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		if(cls.isDetachUsed()) {
			String resultType="Lsimula/runtime/RTS_RTObject;";
			codeBuilder.invokevirtual(pool.methodRefEntry(CD_cls, "_START", MethodTypeDesc.ofDescriptor("()" + resultType)));
		} else {
			String resultType="Lsimula/runtime/RTS_RTObject;";
			codeBuilder.invokevirtual(pool.methodRefEntry(CD_cls, "_STM", MethodTypeDesc.ofDescriptor("()" + resultType)));
		}
		if(backLink == null) codeBuilder.pop();
		else codeBuilder.checkcast(CD_cls);
	}


	@Override
	public String toString() {
		return (("NEW " + classIdentifier + params).replace('[', '(').replace(']', ')'));
	}

	// ***********************************************************************************************
	// *** Externalization
	// ***********************************************************************************************
	/**
	 * Default constructor used by Externalization.
	 */
	public ObjectGenerator() {
	}

	@Override
	public void writeExternal(ObjectOutput oupt) throws IOException {
		Util.TRACE_OUTPUT("BEGIN Write "+this.getClass().getSimpleName());
		if(!Option.NEW_ATTR_FILE)
			oupt.writeBoolean(CHECKED);
		oupt.writeInt(lineNumber);
		Type.outType(type,oupt);
		oupt.writeObject(backLink);
		oupt.writeObject(classIdentifier);
		oupt.writeObject(meaning);
		oupt.writeObject(checkedParams);
		oupt.writeObject(params);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void readExternal(ObjectInput inpt) throws IOException, ClassNotFoundException {
		Util.TRACE_INPUT("BEGIN Read "+this.getClass().getSimpleName());
		if(!Option.NEW_ATTR_FILE)
			CHECKED=inpt.readBoolean();
		lineNumber = inpt.readInt();
		type = Type.inType(inpt);
		backLink = (SyntaxClass) inpt.readObject();
		classIdentifier = (String) inpt.readObject();
		meaning = (Meaning) inpt.readObject();
		checkedParams = (Vector<Expression>) inpt.readObject();
		params = (Vector<Expression>) inpt.readObject();
	}
	

}
