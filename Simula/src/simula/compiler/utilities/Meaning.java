/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.utilities;

import java.lang.classfile.CodeBuilder;
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import java.lang.classfile.constantpool.FieldRefEntry;
import java.lang.constant.ClassDesc;

import simula.compiler.syntaxClass.declaration.BlockDeclaration;
import simula.compiler.syntaxClass.declaration.ConnectionBlock;
import simula.compiler.syntaxClass.declaration.Declaration;
import simula.compiler.syntaxClass.declaration.DeclarationScope;
import simula.compiler.syntaxClass.declaration.ProcedureDeclaration;
import simula.compiler.syntaxClass.declaration.SimpleVariableDeclaration;
import simula.compiler.syntaxClass.declaration.Thunk;
import simula.compiler.syntaxClass.expression.Constant;
import simula.compiler.syntaxClass.expression.Expression;
import simula.compiler.syntaxClass.expression.TypeConversion;
import simula.compiler.syntaxClass.expression.VariableExpression;

/**
 * Utility class Meaning.
 * <p>
 * Holding the semantic meaning of an identifier.
 * <p>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/utilities/Meaning.java"><b>Source File</b></a>.
 * 
 * @author Øystein Myhre Andersen
 *
 */
public final class Meaning {
	/**
	 * True if it was found behind invisible
	 */
	public boolean foundBehindInvisible; // Behind hidden/protected
	
	/**
	 * The corresponding declaration
	 */
	public Declaration declaredAs;
	
	/**
	 * Where it was declared
	 */
	public DeclarationScope declaredIn; // Search started here (modified in ConnectionBlock)
	
	/**
	 * Where it was found
	 */
	public DeclarationScope foundIn; // Search ended here

	/**
	 * Create a new Meaning.
	 * @param declaredAs the corresponding declaration
	 * @param declaredIn where it was declared
	 * @param foundIn where it was found
	 * @param foundBehindInvisible true if it was found behind invisible
	 */
	public Meaning(final Declaration declaredAs,final DeclarationScope declaredIn,final DeclarationScope foundIn,final boolean foundBehindInvisible) {
		this.declaredAs = declaredAs;
		this.declaredIn = declaredIn;
		this.foundIn = foundIn;
		this.foundBehindInvisible = foundBehindInvisible;
	}

	/**
	 * Create a new Meaning.
	 * @param declaredAs the corresponding declaration
	 * @param declaredIn where it was declared
	 */
	public Meaning(final Declaration declaredAs,final DeclarationScope declaredIn) {
		this(declaredAs, declaredIn,null,false);
	}

	/**
	 * Returns the constant element or null.
	 * @return the constant element or null
	 */
	public Expression getConstant() {
		if(declaredAs instanceof SimpleVariableDeclaration simple) {
			if(simple.isConstant()) return(simple.constantElement);
		}
		return(null);
	}

	/**
	 * Returns true if it was declared in a ConnectionBlock.
	 * @return true if it was declared in a ConnectionBlock
	 */
	public boolean isConnected() {
		return (declaredIn instanceof ConnectionBlock);
	}

	/**
	 * Returns the inspected expression or null.
	 * @return the inspected expression or null
	 */
	public Expression getInspectedExpression() {
		if (isConnected())
			 return (((ConnectionBlock) declaredIn).getInspectedExpression());
		else return (null);
	}

	public VariableExpression getInspectedVariable() {
		Expression inspected = getInspectedExpression();
		if(inspected instanceof TypeConversion tc) inspected = tc.expression;
		VariableExpression inspectedVariable = (VariableExpression)inspected;
		return(inspectedVariable);
	}

	// ***************************************************************************************
	// *** CODING: edUnqualifiedStaticLink
	// ***************************************************************************************
	/**
	 * Coding utility: Edit unqualified static link chain.
	 * @return the resulting string
	 */
	public String edUnqualifiedStaticLink() {
		// Edit staticLink reference
		String staticLink;
		Expression connectedObject = getInspectedExpression();
		if (connectedObject != null)
			staticLink = connectedObject.toJavaCode();
		else {
			staticLink = declaredIn.edCTX();
		}
		return (staticLink);
	}

	// ***************************************************************************************
	// *** CODING: edQualifiedStaticLink
	// ***************************************************************************************
	/**
	 * Coding utility: Edit qualified static link chain.
	 * @return the resulting string
	 */
	public String edQualifiedStaticLink() {
		// Edit staticLink reference
		String staticLink;
		Expression connectedObject = getInspectedExpression();
		if (connectedObject != null)
			staticLink = connectedObject.toJavaCode();
		else {
			staticLink = declaredIn.edCTX();
			String cast = declaredIn.getJavaIdentifier();
			staticLink = "((" + cast + ")" + staticLink + ')';
		}
		return (staticLink);
	}

	// ***************************************************************************************
	// *** CODING: buildQualifiedStaticLink
	// ***************************************************************************************
	/**
	 * Coding utility: Build qualified static link chain.
	 */
	public void buildQualifiedStaticLink(CodeBuilder codeBuilder) {
		// Edit staticLink reference
		if(this.isConnected()) {
	    	VariableExpression inspectedVariable = getInspectedVariable();
			String id = inspectedVariable.getJavaIdentifier();
			ConstantPoolBuilder pool=codeBuilder.constantPool();
			FieldRefEntry FRE=pool.fieldRefEntry(BlockDeclaration.currentClassDesc(),id, inspectedVariable.type.toClassDesc());
			codeBuilder
				.aload(0)
				.getfield(FRE);
		}
		else {
			String cast = declaredIn.getJavaIdentifier();
			boolean withFollowSL = declaredIn.buildCTX(codeBuilder);
//			if(withFollowSL) codeBuilder.checkcast(ClassDesc.of(Global.packetName,cast));
			if(withFollowSL) codeBuilder.checkcast(declaredIn.getClassDesc());
		}
	}

	// ***************************************************************************************
	// *** JVM CODING: getFieldRefEntry
	// ***************************************************************************************
	public FieldRefEntry getFieldRefEntry(ConstantPoolBuilder pool) {
		ClassDesc CD_type=declaredAs.type.toClassDesc();
		ClassDesc CD_cls=ClassDesc.of(declaredIn.getJavaIdentifier());
		return(pool.fieldRefEntry(CD_cls, declaredIn.getJavaIdentifier(), CD_type));
	}

//	/**
//	 * Returns the inspected variable FieldRefEntry or null.
//	 * @return the inspected variable FieldRefEntry or null
//	 */
//	public FieldRefEntry getInspectedFieldRefEntry(ConstantPoolBuilder pool) {
//		if (isConnected()) {
////			 return (((ConnectionBlock) declaredIn).getInspectedExpression());
//			ConnectionBlock connectionBlock=(ConnectionBlock)declaredIn;
//			VariableExpression inspectedVariable=connectionBlock.inspectedVariable;
//			VariableExpression inspVar=(VariableExpression)inspectedVariable;
//			SimpleVariableDeclaration inspVarDecl=(SimpleVariableDeclaration)inspVar.meaning.declaredAs;
//			System.out.println("Meaning.getInspectedFieldRefEntry: inspVarDecl: "+inspVarDecl.getClass().getSimpleName()+"  "+inspVarDecl);
//			FieldRefEntry FRE1 = inspVarDecl.getFieldRefEntry(pool);
//			System.out.println("Meaning.getInspectedFieldRefEntry: FRE1=" + inspVarDecl + "  ===>  " + FRE1);
//
//			Util.IERR();
//			return(FRE1);
//		}
//		else return (null);
//	}

	/**
	 * Coding Utility: Edit identifier access.
	 * @param id the identifier
	 * @param destination true if destination
	 * @return a suitable java code
	 */
	public void buildIdentifierAccess(boolean destination,CodeBuilder codeBuilder) {
//		System.out.println("Meaning.buildIdentifierAccess: "+this);
//		Util.IERR();
		Meaning meaning=this;
//		Expression constantElement = meaning.getConstant();
//		if (constantElement != null) {
//			if (constantElement instanceof Constant constant) {
//				Util.IERR(""+constant);
//				//return (constant.toJavaCode());
//			}
//		}
		
		
		
		if (meaning.isConnected()) {
			Expression inspectedExpression = ((ConnectionBlock) meaning.declaredIn).getInspectedExpression();
//			System.out.println("Meaning.buildIdentifierAccess: inspectedExpression="+inspectedExpression);
			if (meaning.foundBehindInvisible) {
//				String remoteCast = meaning.foundIn.getJavaIdentifier();
				//id = "((" + remoteCast + ")(" + inspectedVariable.toJavaCode() + "))." + id;
				inspectedExpression.buildEvaluation(null, codeBuilder);
			} else {
				//id = inspectedVariable.toJavaCode() + "." + id;
		        // 0: aload_0
		        // 1: getfield      #1    IF WITHIN THUNK    // Field this$0:LsimulaTestPrograms/adHoc00;
		        // 4: getfield      #13   // Field simulaTestPrograms/adHoc00._inspect_17_0:LsimulaTestPrograms/adHoc00_A;
//				Util.buildSNAPSHOT(codeBuilder, "BEFORE ");
		 		
//	 			System.out.println("Meaning.buildIdentifierAccess: inspectedVariable="+inspectedVariable.getClass().getSimpleName()+"  "+inspectedVariable);
//	 			System.out.println("Meaning.buildIdentifierAccess: inspectedVariable.type="+inspectedVariable.type);
//	 			System.out.println("Meaning.buildIdentifierAccess: inspectedVariable.identifier="+inspectedVariable.identifier);
//				Util.IERR();
				
				inspectedExpression.buildEvaluation(null, codeBuilder);
			}
		} else if(declaredAs instanceof ProcedureDeclaration) {			
//			System.out.println("Meaning.buildIdentifierAccess: ****************** "+this+" ******************");
//			System.out.println("Meaning.buildIdentifierAccess: Current Scope: "+Global.getCurrentScope().externalIdent+"  rtBlockLevel="+Global.getCurrentScope().rtBlockLevel);
//			System.out.println("Meaning.buildIdentifierAccess: DeclaredAs: "+declaredAs);
//			System.out.println("Meaning.buildIdentifierAccess: DeclaredIn: "+declaredIn);
//			Util.IERR();

			String cast = meaning.declaredAs.getJavaIdentifier();
			if (meaning.foundBehindInvisible) {
				cast = meaning.foundIn.getJavaIdentifier();
				Util.IERR();
			}
	        // 0: getstatic     #17                 // Field _CUR:Lsimula/runtime/RTS_RTObject;
	        // 3: getfield      #21                 // Field simula/runtime/RTS_RTObject._SL:Lsimula/runtime/RTS_RTObject;
	        // 6: checkcast     #26                 // class simulaTestPrograms/adHoc000_PPP
	 		int corr = 1;
	 		
	 		if(Global.getCurrentScope() instanceof Thunk) {
				cast = meaning.declaredIn.getJavaIdentifier();
	 		}
	 		
			boolean withFollowSL = meaning.declaredIn.buildCTX(corr,codeBuilder);
			if(withFollowSL) {
//				System.out.println("Meaning.buildIdentifierAccess(1): meaning.declaredAs="+meaning.declaredAs);
//				System.out.println("Meaning.buildIdentifierAccess(1): meaning.declaredIn="+meaning.declaredIn);
				codeBuilder.checkcast(meaning.declaredIn.getClassDesc());
//				System.out.println(meaning.declaredAs);
//				System.out.println(meaning.declaredIn);
//				if(cast.equalsIgnoreCase("RTS_ENVIRONMENT")) Util.IERR();
			}
			
		} else if (!(meaning.declaredIn.declarationKind == ObjectKind.ContextFreeMethod
				|| meaning.declaredIn.declarationKind == ObjectKind.MemberMethod)) {
			
//			int n = meaning.declaredIn.rtBlockLevel;
//			System.out.println("Meaning.buildIdentifierAccess: ****************** "+this+" ******************");
//			System.out.println("Meaning.buildIdentifierAccess: declaredAs="+this.declaredAs.getClass().getSimpleName()+"  "+this.declaredAs);
//			System.out.println("Meaning.buildIdentifierAccess: Current Scope: "+Global.getCurrentScope().externalIdent+"  rtBlockLevel="+Global.getCurrentScope().rtBlockLevel);
//			System.out.println("Meaning.buildIdentifierAccess: DeclaredIn Scope: "+meaning.declaredIn.externalIdent+"  rtBlockLevel="+n);
//			Util.IERR();

			// id = "((" + cast + ")" + meaning.declaredIn.edCTX() + ")." + id; // ØM
			if (meaning.foundBehindInvisible) {
				meaning.declaredIn.buildCTX(codeBuilder);
				codeBuilder.checkcast(meaning.foundIn.getClassDesc());
			} else {
				boolean withFollowSL = meaning.declaredIn.buildCTX(codeBuilder);
				if(withFollowSL) {
//					System.out.println("Meaning.buildIdentifierAccess(2): meaning.declaredAs="+meaning.declaredAs);
//					System.out.println("Meaning.buildIdentifierAccess(2): meaning.declaredIn="+meaning.declaredIn);
//					String cast = meaning.declaredIn.getJavaIdentifier();
//					codeBuilder.checkcast(ClassDesc.of(Global.packetName,cast));
					codeBuilder.checkcast(meaning.declaredIn.getClassDesc());
				}
			}
		}
	}

	@Override
	public String toString() {
		if (declaredAs == null)	return ("NO MEANING");
		return ("DeclaredAs " + declaredAs + ", foundBehindInvisible=" + foundBehindInvisible
				+ "  (ctBlockLevel="+ declaredIn.ctBlockLevel + ", rtBlockLevel="+ declaredIn.rtBlockLevel
				+ ",declaredIn=" + declaredIn + ",foundIn=" + foundIn + ')');
	}

//	// ***********************************************************************************************
//	// *** Externalization
//	// ***********************************************************************************************
//	/**
//	 * Default constructor used by Attribute File I/O
//	 */
//	public Meaning() {
//	}
//
//	@Override
//	public void writeExternal(ObjectOutput oupt) throws IOException {
//		Util.TRACE_OUTPUT("BEGIN Write Meaning: "+this);
//		oupt.writeObject(declaredAs);
//		oupt.writeObject(declaredIn);
//		oupt.writeObject(foundIn);
//		oupt.writeObject(foundBehindInvisible);
//	}
//	
//	@Override
//	public void readExternal(ObjectInput inpt) throws IOException {
//		Util.TRACE_INPUT("BEGIN Read Meaning: ");
//		declaredAs = (Declaration) inpt.readObject();
//		declaredIn = (DeclarationScope) inpt.readObject();
//		foundIn = (DeclarationScope) inpt.readObject();
//		foundBehindInvisible = (boolean) inpt.readObject();
//	}
//	

}
