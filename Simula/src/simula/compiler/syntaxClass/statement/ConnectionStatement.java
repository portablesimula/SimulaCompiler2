/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass.statement;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.classfile.CodeBuilder;
import java.lang.classfile.Label;
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import java.lang.classfile.constantpool.FieldRefEntry;
import java.lang.constant.ClassDesc;
import java.util.Vector;

import simula.compiler.AttrInput;
import simula.compiler.AttrOutput;
import simula.compiler.GeneratedJavaClass;
import simula.compiler.parsing.Parse;
import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.declaration.BlockDeclaration;
import simula.compiler.syntaxClass.declaration.ClassDeclaration;
import simula.compiler.syntaxClass.declaration.ConnectionBlock;
import simula.compiler.syntaxClass.declaration.DeclarationScope;
import simula.compiler.syntaxClass.declaration.LabelDeclaration;
import simula.compiler.syntaxClass.declaration.SimpleVariableDeclaration;
import simula.compiler.syntaxClass.expression.AssignmentOperation;
import simula.compiler.syntaxClass.expression.Expression;
import simula.compiler.syntaxClass.expression.VariableExpression;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.KeyWord;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * Connection Statement.
 * 
 * <pre>
 * 
 * Simula Standard: 4.8 Connection statement
 *
 *	connection-statement
 *			= INSPECT object-expression when-clause { when-clause } [ otherwise-clause ]
 *			| INSPECT object-expression DO statement [ otherwise-clause ]
 *
 *			when-clause = WHEN class-identifier DO statement
 *
 *			otherwise-clause = OTHERWISE statement
 *
 *
 * The connection statement is implemented using Java's <b>instanceof</b> operator and the
 * if statement. For example, the connection statement:
 * 
 *         <b>inspect</b> x <b>do</b> image:-t;
 *         
 * Where 'x' is declared as a reference to an ImageFile, is compiled to:
 * 
 *         if(x!=null) x.image=t;
 *         
 * Other examples that also use '<b>ref</b>(Imagefile) x' may be:
 * 
 *      1) <b>inspect</b> x <b>do</b> image:-t <b>otherwise</b> t:-<b>notext</b>;
 *      
 *      2) <b>inspect</b> x
 *            <b>when</b> infile <b>do</b> t:-intext(12)
 *            <b>when</b> outfile <b>do</b> outtext(t);
 *            
 *      3) <b>inspect</b> x
 *            <b>when</b> infile <b>do</b> t:-intext(12)
 *            <b>when</b> outfile <b>do</b> outtext(t)
 *         <b>otherwise</b> t:-<b>notext</b>;
 * 
 * These examples are compiled to:
 * 
 *      1) <b>if</b>(x!=<b>null</b>) x.image=t; <b>else</b> t=null;
 *      
 *      2) <b>if</b>(x <b>instanceof</b> RTS_Infile) t=((RTS_Infile)x).intext(12);
 *         <b>else</b> <b>if</b>(x <b>instanceof</b> RTS_Outfile) ((RTS_Outfile)x).outtext(t);
 *          
 *      3) <b>if</b>(x <b>instanceof</b> RTS_Infile) t=((RTS_Infile)x).intext(12);
 *         <b>else</b> <b>if</b>(x <b>instanceof</b> RTS_Outfile) ((RTS_Outfile)x).outtext(t);
 *         <b>else</b> t=null;
 * 
 * </pre>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/statement/ConnectionStatement.java">
 * <b>Source File</b></a>.
 * 
 * @author SIMULA Standards Group
 * @author Øystein Myhre Andersen
 */
public final class ConnectionStatement extends Statement {
	
	/**
	 * The inspected object.
	 */
	private Expression objectExpression;
	
	/**
	 * Utility Variable to hold the evaluated object-expression.
	 */
	private VariableExpression inspectedVariable;
	
	/**
	 * The inspected variable's declaration.
	 */
	private SimpleVariableDeclaration inspectVariableDeclaration;
	
	/**
	 * The connection parts. A DoPart or a list of WhenParts.
	 */
	private Vector<DoPart> connectionPart = new Vector<DoPart>();
	
	/**
	 * The otherwise statement.
	 */
	private Statement otherwise;
	
	/**
	 * True if this connection statement contains WhenPart(s).
	 */
	private boolean hasWhenPart;
	
	/**
	 * Utility to help generate unique identifiers to the inspected variable.
	 */
	private static int SEQU = 4444; //0;

	/**
	 * 
	 */	
	private Label endLabel;

	/**
	 * Create a new ConnectionStatement.
	 * <p>
	 * Pre-Condition: INSPECT  is already read.
	 * @param line the source line number
	 */
	ConnectionStatement(final int line) {
		super(line);
		if (Option.TRACE_PARSE)	Parse.TRACE("Parse ConnectionStatement");
		objectExpression = Expression.expectExpression();
		objectExpression.backLink = this;
		String ident = "_inspect_" + lineNumber + '_' + (SEQU++);
		inspectedVariable = new VariableExpression(ident);
		inspectVariableDeclaration = new SimpleVariableDeclaration(Type.Ref("RTObject"), ident);
		DeclarationScope scope = Global.getCurrentScope();
		while (scope.declarationKind == 0 || scope instanceof ConnectionBlock) {
			scope = scope.declaredIn;
		}
		scope.declarationList.add(inspectVariableDeclaration);
		inspectVariableDeclaration.declaredIn = scope;

		boolean hasDoPart=false;
		boolean hasWhenPart=false;
		if (Parse.accept(KeyWord.DO)) {
			hasDoPart = true;
			ConnectionBlock connectionBlock = new ConnectionBlock(inspectedVariable, null);
			connectionBlock.declaredIn = scope;
			Statement statement = Statement.expectStatement();
			connectionPart.add(new DoPart(connectionBlock, statement));
			connectionBlock.end();
		} else {
			while (Parse.accept(KeyWord.WHEN)) {
				String classIdentifier = Parse.expectIdentifier();
				Parse.expect(KeyWord.DO);
				ConnectionBlock connectionBlock = new ConnectionBlock(inspectedVariable, classIdentifier);
				connectionBlock.declaredIn = scope;
				hasWhenPart = true;
				Statement statement = Statement.expectStatement();
				connectionPart.add(new WhenPart(classIdentifier, connectionBlock, statement));
				connectionBlock.end();
			}
		}
		if(!(hasDoPart | hasWhenPart)) Util.error("Incomplete Inspect statement: "+objectExpression);
		Statement otherwise = null;
		if (Parse.accept(KeyWord.OTHERWISE)) otherwise = Statement.expectStatement();
		this.otherwise=otherwise;
		this.hasWhenPart=hasWhenPart;
		if (Option.TRACE_PARSE)	Util.TRACE("Line "+this.lineNumber+": ConnectionStatement: "+this);
	}

	/**
	 * Utility class to hold the single do-part.
	 */
	private class DoPart {
		
		/**
		 * The associated connection block.
		 */
		ConnectionBlock connectionBlock;

		/**
		 * Create a new do-part.
		 * @param connectionBlock The associated connection block
		 * @param statement the statement after DO
		 */
		private DoPart(final ConnectionBlock connectionBlock,final Statement statement) {
			this.connectionBlock = connectionBlock; // this.statement=statement;
			connectionBlock.setStatement(statement);
			if (Option.TRACE_PARSE)
				Util.TRACE("NEW DoPart: " + toString());
		}

		/**
		 * Perform semantic checking.
		 */
		public void doChecking() {
			Type type = inspectVariableDeclaration.type;
			String refIdentifier = type.getRefIdent();
			if (refIdentifier == null)
				Util.error("The Variable " + inspectedVariable + " is not ref() type");
			connectionBlock.setClassDeclaration(AssignmentOperation.getQualification(refIdentifier));
			connectionBlock.doChecking();
//			SET_SEMANTICS_CHECKED();
		}

		/**
		 * Perform Java coding.
		 * @param first true if coding the first when-part
		 */
		public void doCoding(final boolean first) {
			ASSERT_SEMANTICS_CHECKED();
			connectionBlock.doJavaCoding();
		}

		public void buildByteCode(CodeBuilder codeBuilder) {
			ASSERT_SEMANTICS_CHECKED();
			connectionBlock.buildByteCode(codeBuilder);
			codeBuilder.goto_(endLabel);
		}

//		/**
//		 * Utility print method.
//		 * @param indent the indent
//		 */
//		public void print(final int indent) {
//	    	String spc=edIndent(indent);
//			Util.println(spc + "DO ");
//			connectionBlock.print(indent);
//		}

		/**
		 * Utility print method.
		 * @param indent the indent
		 */
		public void printTree(final int indent) {
	    	String spc=edTreeIndent(indent);
			Util.println(spc + "DO ");
			connectionBlock.printTree(indent);
		}

		@Override
		public String toString() {
			return (connectionBlock.toString());
		}

		// ***********************************************************************************************
		// *** Attribute File I/O
		// ***********************************************************************************************
		/**
		 * Default constructor used by Attribute File I/O
		 */
		private DoPart() {}

//		@Override
		public void writeAttr(AttrOutput oupt) throws IOException {
			Util.TRACE_OUTPUT("writeDoPart: " + this);
			oupt.writeInt(1);
			oupt.writeObj(connectionBlock);
		}

		public static DoPart readAttr(ConnectionStatement x, AttrInput inpt) throws IOException {
			Util.TRACE_INPUT("BEGIN readDoPart: ");
			int n = inpt.readInt();
			switch(n) {
			case 1:
				DoPart stm = x.new DoPart();
				stm.connectionBlock = (ConnectionBlock) inpt.readObj();
				Util.TRACE_INPUT("DoPart: " + stm);
				return(stm);
			case 2:
				WhenPart whn = x.new WhenPart();
				whn.classIdentifier = inpt.readString();
				whn.connectionBlock = (ConnectionBlock) inpt.readObj();
				Util.TRACE_INPUT("WhenPart: " + whn);
				return(whn);
			}
			Util.IERR("");
			return(null);
		}
	}

	/**
	 * Utility class to hold a when-part.
	 */
	private final class WhenPart extends DoPart {
		/**
		 *  The WHEN class-identifier
		 */
		String classIdentifier;
		
		/**
		 * The class declaration correspondig to the class identifier.
		 * Set during checking.
		 */
		ClassDeclaration classDeclaration;
		
		/**
		 * Indicator to signal an impossible when-part.
		 * Set during checking if object-expression is not compatible with the WHEN class.
		 */
		boolean impossibleWhenPart; // Set by doChecking

		/**
		 * Create a new when-part.
		 * @param classIdentifier the WHEN class-identifier
		 * @param connectionBlock The associated connection block
		 * @param statement the statement after DO
		 */
		public WhenPart(final String classIdentifier,final ConnectionBlock connectionBlock,final Statement statement) {
			super(connectionBlock, statement);
			this.classIdentifier = classIdentifier;
			if (Option.TRACE_PARSE)
				Util.TRACE("NEW DoPart: " + toString());
		}

		@Override
		public void doChecking() {
			if (classIdentifier == null) { // && objectExpression!=null)
				Type type = inspectVariableDeclaration.type;
				classIdentifier = type.getRefIdent();
				if (classIdentifier == null)
					Util.error("The Variable " + inspectedVariable + " is not ref() type");
			}
			if (classIdentifier != null) {
				classDeclaration = AssignmentOperation.getQualification(classIdentifier);
				connectionBlock.setClassDeclaration(classDeclaration);
			}
			if (!AssignmentOperation.checkCompatibility(objectExpression, classIdentifier)) {
				Util.warning("Impossible When Part: " + objectExpression + " is not compatible with " + classIdentifier);
				impossibleWhenPart = true;
			}
			connectionBlock.doChecking();
		}

		@Override
		public void doCoding(final boolean first) {
			ASSERT_SEMANTICS_CHECKED();
			String prfx = (first) ? "" : "else ";
			String cid = classDeclaration.getJavaIdentifier();
			if (!impossibleWhenPart) {
				GeneratedJavaClass.code(prfx + "if(" + inspectedVariable.toJavaCode() + " instanceof " + cid + ") {","WHEN "	+ cid + " DO ");
				connectionBlock.doJavaCoding();
				GeneratedJavaClass.code("}");
			} else
				GeneratedJavaClass.code(prfx,"WHEN " + cid + " DO -- IMPOSSIBLE REMOVED");
		}

		@Override
		public void buildByteCode(CodeBuilder codeBuilder) {
			ASSERT_SEMANTICS_CHECKED();
			if (!impossibleWhenPart) {
				inspectedVariable.buildEvaluation(null, codeBuilder);
//				classDeclaration.getClassDesc(); // TESTING
				Label elseLabel = codeBuilder.newLabel();
				codeBuilder
					.instanceof_(classDeclaration.getClassDesc())
					.ifeq(elseLabel);
				
				connectionBlock.buildByteCode(codeBuilder);
				
				codeBuilder
					.goto_(endLabel)
					.labelBinding(elseLabel);
			}
		}

//		@Override
//		public void print(final int indent) {
//	    	String spc=edIndent(indent);
//			Util.println(spc + "WHEN " + classIdentifier + " DO ");
//			connectionBlock.printTree(indent);
//		}

		@Override
		public String toString() {
			return ("WHEN " + classIdentifier + " DO ..."); // +statement);
		}

		// ***********************************************************************************************
		// *** Attribute File I/O
		// ***********************************************************************************************
		/**
		 * Default constructor used by Attribute File I/O
		 */
		private WhenPart() {}

		@Override
		public void writeAttr(AttrOutput oupt) throws IOException {
			Util.TRACE_OUTPUT("writeDoPart: " + this);
			oupt.writeInt(2);
			oupt.writeString(classIdentifier);
			oupt.writeObj(connectionBlock);
		}

	}

	@Override
	public void doChecking() {
		if (IS_SEMANTICS_CHECKED())	return;
		Global.sourceLineNumber = lineNumber;
		if (Option.TRACE_CHECKER)
			Util.TRACE("BEGIN ConnectionStatement(" + toString() + ").doChecking - Current Scope Chain: " + Global.getCurrentScope().edScopeChain());
		objectExpression.doChecking();
		Type exprType = objectExpression.type;
		exprType.doChecking(Global.getCurrentScope());
		inspectVariableDeclaration.type = exprType;
		inspectedVariable.type = exprType;
		inspectedVariable.doChecking();
		for(DoPart part:connectionPart) part.doChecking();
		if (otherwise != null) otherwise.doChecking();
		inspectedVariable.identifier = inspectVariableDeclaration.getFieldIdentifier();
		SET_SEMANTICS_CHECKED();
	}

	@Override
	public void doJavaCoding() {
		Global.sourceLineNumber = lineNumber;
		ASSERT_SEMANTICS_CHECKED();
		GeneratedJavaClass.code("{");
		GeneratedJavaClass.debug("// BEGIN INSPECTION ");
		Expression assignment = new AssignmentOperation(inspectedVariable, KeyWord.ASSIGNREF, objectExpression);
		assignment.doChecking();
		GeneratedJavaClass.code(assignment.toJavaCode() + ';');
		if (!hasWhenPart) GeneratedJavaClass.code("if(" + inspectedVariable.toJavaCode() + "!=null) {","INSPECT " + inspectedVariable);
		boolean first = true;
		for(DoPart part:connectionPart) { part.doCoding(first);	first = false; }
		if (!hasWhenPart) GeneratedJavaClass.code("}");
		if (otherwise != null) {
			GeneratedJavaClass.code("else {","OTHERWISE ");
			otherwise.doJavaCoding();
			GeneratedJavaClass.code("}","END OTHERWISE ");
		}
		// JavaModule.debug("// END INSPECTION ");
		GeneratedJavaClass.code("}","END INSPECTION");
	}

	@Override
	public void buildByteCode(CodeBuilder codeBuilder) {
		ASSERT_SEMANTICS_CHECKED();
//		System.out.println("inspectedVariable="+inspectedVariable.getClass().getSimpleName()+"  "+inspectedVariable);
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		codeBuilder.aload(0);
		objectExpression.buildEvaluation(null,codeBuilder);
		ClassDesc CD_type=inspectedVariable.type.toClassDesc();
		FieldRefEntry FRE=pool.fieldRefEntry(BlockDeclaration.currentClassDesc(),inspectedVariable.identifier, CD_type);
		codeBuilder.putfield(FRE);

		endLabel = codeBuilder.newLabel();
		if (!hasWhenPart) {
			codeBuilder.aload(0);
			codeBuilder.getfield(FRE);
			codeBuilder.if_null(endLabel);
		}
		for(DoPart part:connectionPart) {
			part.buildByteCode(codeBuilder);
		}
		if (otherwise != null) {
			otherwise.buildByteCode(codeBuilder);
		}
		codeBuilder.labelBinding(endLabel);
	}

	
	@Override
	public void printTree(final int indent) {
		System.out.println(edTreeIndent(indent)+"INSPECT " + inspectedVariable);
		for (DoPart doPart : connectionPart) doPart.printTree(indent+1);
		if(otherwise != null) {
			System.out.println(edTreeIndent(indent)+"OTHERWISE");
			otherwise.printTree(indent+1);
		}
	}

	// ***********************************************************************************************
	// *** Printing Utility: print
	// ***********************************************************************************************
	@Override
	public void print(final int indent) {
    	String spc=edIndent(indent);
		// if(assignment!=null) assignment.print(indent);
		Util.println(spc + "INSPECT " + inspectedVariable);
		for (DoPart doPart : connectionPart) doPart.printTree(indent);
		if (otherwise != null) Util.println(spc + "   OTHERWISE " + otherwise + ';');
	}

	@Override
	public String toString() {
		String otherwisePart = (otherwise == null)?"":" OTHERWISE " + otherwise;
		return ("INSPECT " + inspectedVariable + " " + connectionPart + otherwisePart);
	}

	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************
	/**
	 * Default constructor used by Attribute File I/O
	 */
	public ConnectionStatement() {
		super(0);
	}

	@Override
	public void writeAttr(AttrOutput oupt) throws IOException {
		Util.TRACE_OUTPUT("writeConnectionStatement: " + this);
		oupt.writeKind(ObjectKind.ConnectionStatement);
		oupt.writeInt(lineNumber);
		oupt.writeObj(objectExpression);
		oupt.writeObj(inspectedVariable);
		oupt.writeObj(inspectVariableDeclaration);
//		oupt.writeObj(connectionPart);
		oupt.writeInt(connectionPart.size());
		for(DoPart part:connectionPart) part.writeAttr(oupt);
		oupt.writeObj(otherwise);
		oupt.writeBoolean(hasWhenPart);
	}

	public static ConnectionStatement readAttr(AttrInput inpt) throws IOException {
		Util.TRACE_INPUT("BEGIN readConnectionStatement: ");
		ConnectionStatement stm = new ConnectionStatement();
		stm.lineNumber = inpt.readInt();
		stm.objectExpression = (Expression) inpt.readObj();
		stm.inspectedVariable = (VariableExpression) inpt.readObj();
		stm.inspectVariableDeclaration = (SimpleVariableDeclaration) inpt.readObj();
//		stm.connectionPart = (Vector<DoPart>) inpt.readObj();
		int n = inpt.readInt();
		if(n > 0) {
			stm.connectionPart = new Vector<DoPart>();
			for(int i=0;i<n;i++)
				stm.connectionPart.add(DoPart.readAttr(stm,inpt));
		}
		stm.otherwise = (Statement) inpt.readObj();
		stm.hasWhenPart = inpt.readBoolean();
		Util.TRACE_INPUT("ConnectionStatement: " + stm);
		return(stm);
	}

//	// ***********************************************************************************************
//	// *** Externalization
//	// ***********************************************************************************************
//	/**
//	 * Default constructor used by Externalization.
//	 */
//	public ConnectionStatement() {
//		super(0);
//	}
//
//	@Override
//	public void writeExternal(ObjectOutput oupt) throws IOException {
//		Util.TRACE_OUTPUT("BEGIN Write "+this.getClass().getSimpleName());
//		if(!Option.NEW_ATTR_FILE)
//			oupt.writeBoolean(CHECKED);
//		oupt.writeInt(lineNumber);
//		oupt.writeObject(objectExpression);
//		oupt.writeObject(inspectedVariable);
//		oupt.writeObject(inspectVariableDeclaration);
//		oupt.writeObject(connectionPart);
//		oupt.writeObject(otherwise);
//		oupt.writeObject(hasWhenPart);
//	}
//	
//	@SuppressWarnings("unchecked")
//	@Override
//	public void readExternal(ObjectInput inpt) throws IOException {
//		Util.TRACE_INPUT("BEGIN Read "+this.getClass().getSimpleName());
//		if(!Option.NEW_ATTR_FILE)
//			CHECKED=inpt.readBoolean();
//		lineNumber = inpt.readInt();
//		objectExpression = (Expression) inpt.readObject();
//		inspectedVariable = (VariableExpression) inpt.readObject();
//		inspectVariableDeclaration = (SimpleVariableDeclaration) inpt.readObject();
//		connectionPart = (Vector<DoPart>) inpt.readObject();
//		otherwise = (Statement) inpt.readObject();
//		hasWhenPart = (Boolean) inpt.readObject();
//	}
//	

}
