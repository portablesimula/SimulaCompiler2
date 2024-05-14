package simula.compiler.syntaxClass.statement;

import java.lang.classfile.CodeBuilder;
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import java.lang.constant.MethodTypeDesc;

import simula.compiler.GeneratedJavaClass;
import simula.compiler.syntaxClass.declaration.BlockDeclaration;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.Util;

public final class InlineStatement extends Statement {
	String kind;
	
	public InlineStatement(String kind) {
		super(1);
		this.kind = kind;
	}

	@Override
	public void doChecking() {
		if (IS_SEMANTICS_CHECKED())	return;
		SET_SEMANTICS_CHECKED();
	}

	@Override
	public void doJavaCoding() {
		Global.sourceLineNumber = lineNumber;
		ASSERT_SEMANTICS_CHECKED();
		if(kind.equals("detach")) GeneratedJavaClass.code("detach();","Process'detach");
		else if(kind.equals("terminate")) GeneratedJavaClass.code("terminate();","Process'terminate");
		else if(kind.equals("try")) GeneratedJavaClass.code("try {");
		else if(kind.equals("catch")) GeneratedJavaClass.code("} catch(RuntimeException e) { _CUR=this; _onError(e,onError_0()); }");
		else Util.IERR();
	}

	@Override
	public void buildByteCode(CodeBuilder codeBuilder) {
		Global.sourceLineNumber=lineNumber;
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		ASSERT_SEMANTICS_CHECKED();
		if(kind.equals("detach")) {
			// GeneratedJavaClass.code("detach();","Process'detach");
			codeBuilder
					.aload(0)
					.invokevirtual(pool.methodRefEntry(BlockDeclaration.currentClassDesc(),"detach", MethodTypeDesc.ofDescriptor("()V")));
		}
		else if(kind.equals("terminate")) {
			// GeneratedJavaClass.code("terminate();","Process'terminate");
			codeBuilder
					.aload(0)
					.invokevirtual(pool.methodRefEntry(BlockDeclaration.currentClassDesc(),"terminate", MethodTypeDesc.ofDescriptor("()V")));
		}
		else if(kind.equals("try")) ;   // Nothing. Treated by ClassDeclaration.buildMethod_CatchingErrors_TRY_CATCH
		else if(kind.equals("catch")) ; // Nothing. Treated by ClassDeclaration.buildMethod_CatchingErrors_TRY_CATCH
		else Util.IERR();
	}

	@Override
	public void printTree(final int indent) {
		System.out.println(edTreeIndent(indent)+"INLINE "+kind);
//		label.printTree(indent+1);
	}

	@Override
	public String toString() {
		return ("INLINE " + kind);
	}


//	// ***********************************************************************************************
//	// *** Externalization
//	// ***********************************************************************************************
//	/**
//	 * Default constructor used by Externalization.
//	 */
//	public InlineStatement() {
//		super(0);
//	}
//
//	@Override
//	public void writeExternal(ObjectOutput oupt) throws IOException {
//		Util.TRACE_OUTPUT("BEGIN Write "+this.getClass().getSimpleName());
//		if(!Option.NEW_ATTR_FILE)
//			oupt.writeBoolean(CHECKED);
//		oupt.writeShort(lineNumber);
//		oupt.writeString(kind);
//	}
//	
//	@Override
//	public void readExternal(ObjectInput inpt) throws IOException {
//		Util.TRACE_INPUT("BEGIN Read "+this.getClass().getSimpleName());
//		if(!Option.NEW_ATTR_FILE)
//			CHECKED=inpt.readBoolean();
//		lineNumber = inpt.readShort();
//		kind = inpt.readString();
//	}
	

}
