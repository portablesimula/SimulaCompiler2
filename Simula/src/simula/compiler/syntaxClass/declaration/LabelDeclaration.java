/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass.declaration;

import java.io.IOException;
import java.lang.classfile.ClassBuilder;
import java.lang.classfile.ClassFile;
import java.lang.classfile.CodeBuilder;
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import java.lang.classfile.constantpool.FieldRefEntry;
import java.lang.constant.ClassDesc;
import java.lang.constant.MethodTypeDesc;
import simula.compiler.AttributeInputStream;
import simula.compiler.AttributeOutputStream;
import simula.compiler.GeneratedJavaClass;
import simula.compiler.syntaxClass.ProtectedSpecification;
import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.expression.Constant;
import simula.compiler.utilities.CD;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.ObjectKind;
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
		this.externalIdent = "_LABEL_" + declaredIn.externalIdent + '_' + identifier + '_' + declaredIn.prefixLevel();
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
	
	public void updateDeclaredIn(DeclarationScope declaredIn) {
		this.declaredIn = declaredIn;
	}
	
	public void declareLocalLabel(BlockDeclaration encloser) {
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
			if(this.isLatestVirtualLabel(encloser)) {
				GeneratedJavaClass.code("    public RTS_LABEL " + virtSpec.getVirtualIdentifier()
					+ " { return(new RTS_LABEL(this," + prefixLevel + ',' + index + ",\"" + identifier + "\")); }",
					" // Virtual Label #" + index + '=' + identifier + " At PrefixLevel " + prefixLevel);
			}
		} else {
			GeneratedJavaClass.code(
					"final RTS_LABEL " + ident + "=new RTS_LABEL(this," +prefixLevel + ',' + index + ",\"" + identifier + "\");",
					"Local Label #" + index + '=' + identifier + " At PrefixLevel " + prefixLevel);
		}
	}

	@Override
	public void buildField(ClassBuilder classBuilder,BlockDeclaration encloser) {
		String ident = getFieldIdentifier();
		int prefixLevel = getPrefixLevel();
		
		VirtualSpecification virtSpec = VirtualSpecification.getVirtualSpecification(this);
		if (virtSpec != null) {
			if(this.isLatestVirtualLabel(encloser)) {
				MethodTypeDesc MTD_STM=MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_LABEL;");
				classBuilder
					.withMethodBody(virtSpec.getSimpleVirtualIdentifier(), MTD_STM, ClassFile.ACC_PUBLIC,
						codeBuilder -> buildVirtualMatchMethodBody(prefixLevel,codeBuilder));
			}
		} else {
			classBuilder.withField(ident, CD.RTS_LABEL, ClassFile.ACC_PUBLIC);
		}
	}
	
	private boolean isLatestVirtualLabel(DeclarationScope encloser) {
		LabelDeclaration last = encloser.labelList.getLastLabel(this.identifier);
		if(this.index == last.index) {
			return true;
		}
		return false;
	}
	
	private int getPrefixLevel() {
		int prefixLevel=0;
		if(movedTo != null) {
			if(movedTo instanceof ClassDeclaration cls) prefixLevel=cls.prefixLevel();
		} else {
			if(declaredIn instanceof ClassDeclaration cls) prefixLevel=cls.prefixLevel();			
		}
		return prefixLevel;
	}
	
	private void buildVirtualMatchMethodBody(int prefixLevel,CodeBuilder codeBuilder) {
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		// Build virtual match method:
		// public RTS_LABEL " + virtSpec.getVirtualIdentifier()
		// { return(new RTS_LABEL(this, prefixLevel, index, "identifier")); }
		codeBuilder
			.new_(CD.RTS_LABEL)
			.dup()
			.aload(0); // this
		Constant.buildIntConst(codeBuilder, prefixLevel);
		Constant.buildIntConst(codeBuilder, index);
		codeBuilder.ldc(pool.stringEntry(this.identifier));
		codeBuilder
			.invokespecial(CD.RTS_LABEL, "<init>", MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_RTObject;IILjava/lang/String;)V"))
			.areturn();
	}


	@Override
	public FieldRefEntry getFieldRefEntry(ConstantPoolBuilder pool) {
		DeclarationScope declaredIn = (movedTo != null)? movedTo : this.declaredIn;
		ClassDesc owner=declaredIn.getClassDesc();
		return(pool.fieldRefEntry(owner, getFieldIdentifier(), CD.RTS_LABEL));
	}
	
	@Override
	public String getFieldIdentifier() {
		return(this.externalIdent);
	}

	public void buildInitAttribute(CodeBuilder codeBuilder) {
		VirtualSpecification virtSpec = VirtualSpecification.getVirtualSpecification(this);
		if (virtSpec == null) {
			ConstantPoolBuilder pool=codeBuilder.constantPool();
			buildLabelQuant(codeBuilder);
			codeBuilder.putfield(getFieldRefEntry(pool));
		}
	}
	
	public void doBind(CodeBuilder codeBuilder) {
		if(isBinded) Util.IERR();
		BlockDeclaration labelContext = BlockDeclaration.labelContext;
		labelContext.labelList.labelBinding(this,codeBuilder);
		isBinded = true;
	}
	
	public void buildLabelQuant(CodeBuilder codeBuilder) {
		int prefixLevel=0;
		if(movedTo != null) {
			if(movedTo instanceof ClassDeclaration cls) prefixLevel=cls.prefixLevel();
		} else {
			if(declaredIn instanceof ClassDeclaration cls) prefixLevel=cls.prefixLevel();			
		}

		// new RTS_LABEL(this,0,1,"L1"); // Local Label #1=L1 At PrefixLevel 0
		codeBuilder
			.aload(0)
			.new_(CD.RTS_LABEL)
			.dup()
			.aload(0); // this
		Constant.buildIntConst(codeBuilder, prefixLevel);
		Constant.buildIntConst(codeBuilder, index);
		codeBuilder
			.ldc(codeBuilder.constantPool().stringEntry(identifier))
			.invokespecial(CD.RTS_LABEL, "<init>", MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_RTObject;IILjava/lang/String;)V"));
	}
	
	@Override
	public String toString() {
		String comment = "DeclaredIn: "+declaredIn.identifier;
		if(movedTo != null) comment = comment+" -> "+movedTo;
		return ("LABEL " + identifier + '[' + externalIdent + ']' + ", index=" + index + " IN " + comment);
	}

	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************
	
	@Override
	public void writeObject(AttributeOutputStream oupt) throws IOException {
		Util.TRACE_OUTPUT("writeLabelDeclaration: " + identifier);
		oupt.writeKind(declarationKind);
		oupt.writeString(identifier);
		oupt.writeShort(SEQU);
		oupt.writeShort(lineNumber);
		oupt.writeShort(index);
		oupt.writeObj(movedTo);
	}
	
	public static LabelDeclaration readObject(AttributeInputStream inpt) throws IOException {
		Util.TRACE_INPUT("BEGIN readLabelDeclaration: ");
		String identifier = inpt.readString();
		LabelDeclaration lab = new LabelDeclaration(identifier);
		lab.SEQU = inpt.readSEQU(lab);
		lab.lineNumber = inpt.readShort();
		lab.index = inpt.readShort();
		lab.movedTo = (DeclarationScope) inpt.readObj();
		Util.TRACE_INPUT("readLabelDeclaration: " + lab);
		return(lab);
	}

}
