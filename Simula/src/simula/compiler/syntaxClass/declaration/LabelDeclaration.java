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
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import java.lang.classfile.constantpool.FieldRefEntry;
import java.lang.classfile.instruction.SwitchCase;
import java.lang.constant.ClassDesc;
import java.lang.constant.MethodTypeDesc;

import simula.compiler.AttrInput;
import simula.compiler.AttrOutput;
import simula.compiler.GeneratedJavaClass;
import simula.compiler.syntaxClass.HiddenSpecification;
import simula.compiler.syntaxClass.ProtectedSpecification;
import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.expression.Constant;
import simula.compiler.utilities.CD;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * Label Declaration.
 * <p>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/declaration/LabelDeclaration.java">
 * <b>Source File</b></a>.
 * 
 * @author Øystein Myhre Andersen
 */
public final class LabelDeclaration extends SimpleVariableDeclaration {
	/**
	 * The label index. Set by BlockDeclaration.doCheckLabelList.
	 */
	public int index;

	/**
	 * Special case: Labels in a CompoundStatement or ConnectionBlock are moved to
	 * nearest enclosing Block which is not a CompoundStatement or ConnectionBlock.
	 */
	public DeclarationScope movedTo;
	
	/**
	 * Indicates that codeBuilder.labelBinding is called.
	 */
	public boolean isBinded;
	

	/**
	 * Create a new Label Declaration.
	 * 
	 * @param identifier label identifier
	 */
	public LabelDeclaration(final String identifier) {
		super(Type.Label, identifier);
		this.externalIdent = "_LABEL_" + identifier;
		this.declarationKind = ObjectKind.LabelDeclaration;
	}

	@Override
	public void doChecking() {
		if (IS_SEMANTICS_CHECKED())
			return;
		Global.sourceLineNumber = lineNumber;
		DeclarationScope declaredIn = Global.getCurrentScope();
		type.doChecking(declaredIn);
		VirtualSpecification virtSpec = VirtualSpecification.getVirtualSpecification(this);
		if (virtSpec == null) {
			// Label attributes are implicit specified 'protected'
			if (declaredIn.declarationKind == ObjectKind.Class)
				((ClassDeclaration) declaredIn).protectedList
						.add(new ProtectedSpecification((ClassDeclaration) declaredIn, identifier));
		} else {
			// This Label is a Virtual Match
			ClassDeclaration decl = (ClassDeclaration) declaredIn;
			if (decl == virtSpec.declaredIn)
				virtSpec.hasDefaultMatch = true;
		}
		SET_SEMANTICS_CHECKED();
	}

	@Override
//	public void doJavaCoding() {
//		Global.sourceLineNumber = lineNumber;
//		String ident = getJavaIdentifier();
//		VirtualSpecification virtSpec = VirtualSpecification.getVirtualSpecification(this);
//		if (virtSpec != null)
//			GeneratedJavaClass.code("public RTS_LABEL " + virtSpec.getVirtualIdentifier()
//					+ " { return(new RTS_LABEL(this," + index + ",\"" + identifier + "\")); }",
//					" // Virtual Label #" + index + '=' + identifier);
//		else
//			GeneratedJavaClass.code(
//					"final RTS_LABEL " + ident + "=new RTS_LABEL(this," + index + ",\"" + identifier + "\");",
//					"Local Label #" + index + '=' + identifier);
//	}
	public void doJavaCoding() {
		Global.sourceLineNumber = lineNumber;
		String ident = getJavaIdentifier();
		int prefixLevel=0;
		if(movedTo != null) {
			if(movedTo instanceof ClassDeclaration cls) prefixLevel=cls.prefixLevel();
		} else {
			if(declaredIn instanceof ClassDeclaration cls) prefixLevel=cls.prefixLevel();			
		}
		VirtualSpecification virtSpec = VirtualSpecification.getVirtualSpecification(this);
		if (virtSpec != null) {
			GeneratedJavaClass.code("public RTS_LABEL " + virtSpec.getVirtualIdentifier()
					+ " { return(new RTS_LABEL(this," + prefixLevel + ',' + index + ",\"" + identifier + "\")); }",
					" // Virtual Label #" + index + '=' + identifier + " At PrefixLevel " + prefixLevel);
		} else {
			GeneratedJavaClass.code(
					"final RTS_LABEL " + ident + "=new RTS_LABEL(this," +prefixLevel + ',' + index + ",\"" + identifier + "\");",
					"Local Label #" + index + '=' + identifier + " At PrefixLevel " + prefixLevel);
		}
	}

//	@Override
//	public void buildField(ClassBuilder classBuilder,BlockDeclaration encloser) {
//		String ident = getFieldIdentifier();
////		System.out.println("LabelDeclaration.buildField: "+externalIdent+", ident="+ident);
//		ClassDesc CD.RTS_LABEL = CD.RTS_LABEL;
//		classBuilder.withField(ident, CD.RTS_LABEL, ClassFile.ACC_PUBLIC);
//	}

	@Override
	public void buildField(ClassBuilder classBuilder,BlockDeclaration encloser) {
		String ident = getFieldIdentifier();
		int prefixLevel = getPrefixLevel();
		
		VirtualSpecification virtSpec = VirtualSpecification.getVirtualSpecification(this);
		if (virtSpec != null) {
			MethodTypeDesc MTD_STM=MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_RTObject$RTS_LABEL;");
			classBuilder
				.withMethodBody(virtSpec.getSimpleVirtualIdentifier(), MTD_STM, ClassFile.ACC_PUBLIC,
						codeBuilder -> buildVirtualMatchMethodBody(prefixLevel,codeBuilder));
		} else {
			classBuilder.withField(ident, CD.RTS_LABEL, ClassFile.ACC_PUBLIC);
		}
	}
	
	private int getPrefixLevel() {
		int prefixLevel=0;
		if(movedTo != null) {
			if(movedTo instanceof ClassDeclaration cls) prefixLevel=cls.prefixLevel();
		} else {
			if(declaredIn instanceof ClassDeclaration cls) prefixLevel=cls.prefixLevel();			
		}
		return(prefixLevel);
	}
	
	private void buildVirtualMatchMethodBody(int prefixLevel,CodeBuilder codeBuilder) {
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		// Build virtual match method:
		// public RTS_LABEL " + virtSpec.getVirtualIdentifier()
		// { return(new RTS_LABEL(this, prefixLevel, index, "identifier")); }
//        0: new           #1                  // class simula/runtime/RTS_RTObject$RTS_LABEL
//        3: dup
//        4: aload_0
//        5: aload_0
//        6: iconst_1			// prefixLevel
//        7: iconst_1			// index
//        8: ldc           #3	// String L
//       10: invokespecial #5   // Method simula/runtime/RTS_RTObject$RTS_LABEL."<init>":(Lsimula/runtime/RTS_RTObject;Lsimula/runtime/RTS_RTObject;IILjava/lang/String;)V
//       13: areturn
		codeBuilder
			.new_(CD.RTS_LABEL)
			.dup()
			.aload(0)
			.aload(0);
		Constant.buildIntConst(codeBuilder, prefixLevel);
		Constant.buildIntConst(codeBuilder, index);
		codeBuilder.ldc(pool.stringEntry(this.identifier));
		codeBuilder
			.invokespecial(CD.RTS_LABEL, "<init>", MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_RTObject;Lsimula/runtime/RTS_RTObject;IILjava/lang/String;)V"))
			.areturn();
	}


	@Override
	public FieldRefEntry getFieldRefEntry(ConstantPoolBuilder pool) {
//		System.out.println("LabelDeclaration.getFieldRefEntry: BEGIN: "+this+" delatedIn="+this.declaredIn);
		DeclarationScope declaredIn = (movedTo != null)? movedTo : this.declaredIn;
		ClassDesc owner=declaredIn.getClassDesc();
		return(pool.fieldRefEntry(owner, getFieldIdentifier(), CD.RTS_LABEL));
	}
	
	@Override
	public String getFieldIdentifier() {
//		System.out.println("LabelDeclaration.getFieldIdentifier: "+externalIdent);
		return(this.externalIdent);
	}

	public void buildInitAttribute(CodeBuilder codeBuilder) {
		VirtualSpecification virtSpec = VirtualSpecification.getVirtualSpecification(this);
		if (virtSpec == null) {
			buildLabelQuant(codeBuilder);
			ConstantPoolBuilder pool=codeBuilder.constantPool();
//			ClassDesc CD.RTS_LABEL = CD.RTS_LABEL;
//			// 19: putfield #14  // Field _LABEL_L1:Lsimula/runtime/RTS_RTObject$RTS_LABEL;
//			codeBuilder.putfield(pool.fieldRefEntry(BlockDeclaration.currentClassDesc(),getFieldIdentifier(), CD.RTS_LABEL));
			codeBuilder.putfield(getFieldRefEntry(pool));
		}
	}
	
	public void doBind(CodeBuilder codeBuilder) {
		BlockDeclaration blk=(BlockDeclaration) this.declaredIn;
//		System.out.println("LabelDeclaration.doBind: blk="+blk.getClass().getSimpleName()+"  "+blk);
		
		while(!blk.hasLabel()) {
			blk = (BlockDeclaration)blk.declaredIn;			
		}
		
		SwitchCase switchCase=blk.tableSwitchCases.get(index-1);
//		System.out.println("LabelDeclaration.doBind: "+this+"   SwitchCase="+switchCase);
		if(isBinded) {
			System.out.println("LabelDeclaration.doBind: "+this+"   SwitchCase="+switchCase);
			System.out.println("LabelDeclaration.doBind: blk="+blk.getClass().getSimpleName()+"  "+blk);
			Util.IERR("IMPOSSIBLE: "+switchCase);
		}
		codeBuilder.labelBinding(switchCase.target());
		isBinded = true;
	}
	
	public void buildLabelQuant(CodeBuilder codeBuilder) {
		// new RTS_LABEL(this,0,1,"L1"); // Local Label #1=L1 At PrefixLevel 0
//        5: aload_0
//        6: new           #7                  // class simula/runtime/RTS_RTObject$RTS_LABEL
//        9: dup
//       10: aload_0
//       11: aload_0
//       12: iconst_0
//       13: iconst_1
//       14: ldc           #9                  // String L1
//       16: invokespecial #11                 // Method simula/runtime/RTS_RTObject$RTS_LABEL."<init>":(Lsimula/runtime/RTS_RTObject;Lsimula/runtime/RTS_RTObject;IILjava/lang/String;)V
		codeBuilder
			.aload(0)
			.new_(CD.RTS_LABEL)
			.dup()
			.aload(0)
			.aload(0);
		
		int prefixLevel=0;
		if(movedTo != null) {
			if(movedTo instanceof ClassDeclaration cls) prefixLevel=cls.prefixLevel();
		} else {
			if(declaredIn instanceof ClassDeclaration cls) prefixLevel=cls.prefixLevel();			
		}
		Constant.buildIntConst(codeBuilder, prefixLevel);
		Constant.buildIntConst(codeBuilder, index);
		MethodTypeDesc MTD=MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_RTObject;Lsimula/runtime/RTS_RTObject;IILjava/lang/String;)V");
		codeBuilder
			.ldc(codeBuilder.constantPool().stringEntry(identifier))
			.invokespecial(CD.RTS_LABEL, "<init>", MTD);
	}


	@Override
	public String toString() {
		String comment = "DeclaredIn: "+declaredIn.identifier;
		if(movedTo != null) comment = comment+" -> "+movedTo;
		return ("LABEL " + identifier + ", index=" + index + " IN " + comment);
	}

	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************

	/**
	 * Default constructor used by Externalization.
	 */
	public LabelDeclaration() {}

	@Override
	public void writeAttr(AttrOutput oupt) throws IOException {
		Util.TRACE_OUTPUT("writeLabelDeclaration: " + identifier);
		oupt.writeKind(declarationKind);
		oupt.writeString(identifier);
		oupt.writeInt(lineNumber);
		oupt.writeInt(index);
		oupt.writeObj(movedTo);
	}
	
	public static LabelDeclaration readAttr(AttrInput inpt) throws IOException {
		Util.TRACE_INPUT("BEGIN readLabelDeclaration: ");
		LabelDeclaration lab = new LabelDeclaration();
		lab.identifier = inpt.readString();
		lab.lineNumber = inpt.readInt();
		lab.index = inpt.readInt();
		lab.movedTo = (DeclarationScope) inpt.readObj();
		Util.TRACE_INPUT("readLabelDeclaration: " + lab.identifier);
		return(lab);
	}

//	// ***********************************************************************************************
//	// *** Externalization
//	// ***********************************************************************************************
//	/**
//	 * Default constructor used by Externalization.
//	 */
//	public LabelDeclaration() {
//	}
//
//	@Override
//	public void writeExternal(ObjectOutput oupt) throws IOException {
//		super.writeExternal(oupt);
//		Util.TRACE_OUTPUT("BEGIN Write "+this.getClass().getSimpleName());
//		if(!Option.NEW_ATTR_FILE)
//			oupt.writeBoolean(CHECKED);
//		oupt.writeInt(lineNumber);
//		oupt.writeInt(index);
//		oupt.writeObject(movedTo);
//	}
//	
//	@Override
//	public void readExternal(ObjectInput inpt) throws IOException {
//		super.readExternal(inpt);
//		Util.TRACE_INPUT("BEGIN Read "+this.getClass().getSimpleName());
//		if(!Option.NEW_ATTR_FILE)
//			CHECKED=inpt.readBoolean();
//		lineNumber = inpt.readInt();
//		index = inpt.readInt();
//		movedTo = (DeclarationScope) inpt.readObject();
//	}
//	

}
