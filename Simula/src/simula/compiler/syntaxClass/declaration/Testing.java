package simula.compiler.syntaxClass.declaration;

import java.lang.classfile.ClassFile;
import java.lang.classfile.CodeBuilder;
import java.lang.classfile.Label;
import java.lang.classfile.CodeBuilder.BlockCodeBuilder;
import java.lang.classfile.attribute.SourceFileAttribute;
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import java.lang.classfile.constantpool.FieldRefEntry;
import java.lang.classfile.instruction.SwitchCase;
import java.lang.constant.ClassDesc;
import java.lang.constant.ConstantDescs;
import java.lang.constant.MethodTypeDesc;
import java.util.Vector;

import simula.compiler.syntaxClass.Type;
import simula.compiler.utilities.CD;

//import simula.compiler.utilities.CD;
//import simula.compiler.utilities.ClassHierarchy;
//import simula.compiler.utilities.Global;
//import simula.compiler.utilities.Option;

public class Testing {
	private Vector<SwitchCase> tableSwitchCases = new Vector<SwitchCase>();
	
	public static void main(String[] args) {
		new Testing().buildClassFile();
	}
	
	public byte[] buildClassFile() {
		ClassDesc CD_ThisClass = ClassDesc.of("testing.MyClass");
//		byte[] bytes = ClassFile.of(ClassFile.ClassHierarchyResolverOption.of(ClassHierarchy.getResolver())).build(CD_ThisClass,
		byte[] bytes = ClassFile.of().build(CD_ThisClass,
				classBuilder -> {
//					classBuilder
//						.with(SourceFileAttribute.of(Global.sourceFileName))
//						.withFlags(ClassFile.ACC_PUBLIC + ClassFile.ACC_FINAL + ClassFile.ACC_SUPER)
//						.withSuperclass(CD.RTS_BASICIO);

					classBuilder
//						.withMethodBody("<init>",
//							MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_RTObject;)V"), ClassFile.ACC_PUBLIC, codeBuilder -> buildConstructor(codeBuilder))
						.withMethodBody("_STM",
							MethodTypeDesc.ofDescriptor("()Lsimula/runtime/RTS_RTObject;"), ClassFile.ACC_PUBLIC, codeBuilder -> buildMethod_STM(codeBuilder));
				}
		);
		return(bytes);
	}

	protected void buildMethod_STM(CodeBuilder codeBuilder) {
		ConstantPoolBuilder pool = codeBuilder.constantPool();
		Label begScope = codeBuilder.newLabel();
		Label endScope = codeBuilder.newLabel();
		codeBuilder
			.labelBinding(begScope)
//			.localVariable(0,"this",currentClassDesc(),begScope,endScope)
			;
		
//		// Build code with labels
//		buildSomeCode(codeBuilder);
////		for(int i=0;i<64;i++) {
//		for(int i=0;i<65;i++) {
//			Label lab = codeBuilder.newLabel();
//			tableSwitchCases.add(SwitchCase.of(i, lab));
//			System.out.println("add "+i+"  "+lab);
//			codeBuilder
//				.labelBinding(lab);
//			buildSomeCode(codeBuilder);	
//		}
//			
//		// Build the TableSwitch Instruction
//		Label defaultTarget = codeBuilder.newLabel(); // beginning of the default handler block.
//		int lowValue = 1;            			 // the minimum key value.
//		int highValue = tableSwitchCases.size(); // the maximum key value.
////		FieldRefEntry FDE_JTX=pool.fieldRefEntry(BlockDeclaration.currentClassDesc(),"_JTX", ConstantDescs.CD_int);
//		codeBuilder
//			.aload(0)
////			.getfield(FDE_JTX)
//			.tableswitch(lowValue, highValue, defaultTarget, tableSwitchCases)
//			.labelBinding(defaultTarget);

		
		build_TRY_CATCH(codeBuilder,begScope,endScope);

		
		
		// Return
		codeBuilder
			.aload(0)
			.areturn()
			.labelBinding(endScope);
	}
	
	
	// ***********************************************************************************************
	// *** ByteCoding: build_TRY_CATCH
	// ***********************************************************************************************
	/**
	 * Generate byteCode for the try-catch part of the '_STM' method.
	 *
	 * @param codeBuilder the CodeBuilder
	 */
	// ==================================================================================
    //    adHoc000 _THIS=(adHoc000)_CUR;
    //    _LOOP:while(_JTX>=0) {
    //        try {
    //            _JUMPTABLE(_JTX); // For ByteCode Engineering
    //            // ... Simple Statement code
    //            break _LOOP;
    //        }
    //        catch(RTS_LABEL q) {
    //            RTS_RTObject._TREAT_GOTO_CATCH_BLOCK(_THIS, q);
    //            _JTX=q.index; continue _LOOP; // EG. GOTO Lx
    //        }
    //    }
	// ==================================================================================
	private int local_THIS;
	int local_LABEL_q;
	protected void build_TRY_CATCH(CodeBuilder codeBuilder,Label begScope,Label endScope) {
		ConstantPoolBuilder pool=codeBuilder.constantPool();
//		Label loopWhile = codeBuilder.newLabel();
//		Label loopEnd = codeBuilder.newLabel();
		Label contLabel = codeBuilder.newLabel();
		
//		local_THIS = ((BlockDeclaration)BlockDeclaration.currentBlock).allocateLocalVariable(Type.Ref);
//		local_LABEL_q = ((BlockDeclaration)BlockDeclaration.currentBlock).allocateLocalVariable(Type.Ref);
//		codeBuilder.localVariable(local_THIS,"_THIS",CD.RTS_RTObject,begScope,endScope);
//		codeBuilder.localVariable(local_LABEL_q,"label_q",CD.RTS_LABEL,begScope,endScope);
//		
//	    // adHoc000 _THIS=(adHoc000)_CUR;
//		codeBuilder
//			.aload(0)
//			.astore(local_THIS);  // THIS
//		
//	    // _LOOP:while(_JTX>=0) {
//		codeBuilder
//			.labelBinding(loopWhile)
//			.aload(0)
//			.getfield(pool.fieldRefEntry(BlockDeclaration.currentClassDesc(),"_JTX", ConstantDescs.CD_int))
//			.iflt(loopEnd);
		
		codeBuilder.trying(
				blockCodeBuilder -> {
//					labelList.build_JUMPTABLE(blockCodeBuilder);
//					build_STM_BODY(blockCodeBuilder, begScope, endScope);  // Virtual
					
					
					// Build code with labels
					buildSomeCode(blockCodeBuilder);
//					for(int i=0;i<64;i++) {
					for(int i=0;i<64;i++) {
						Label lab = codeBuilder.newLabel();
						tableSwitchCases.add(SwitchCase.of(i, lab));
						System.out.println("add "+i+"  "+lab);
						blockCodeBuilder
							.labelBinding(lab);
						buildSomeCode(blockCodeBuilder);	
					}
						
					// Build the TableSwitch Instruction
					Label defaultTarget = blockCodeBuilder.newLabel(); // beginning of the default handler block.
					int lowValue = 1;            			 // the minimum key value.
					int highValue = tableSwitchCases.size(); // the maximum key value.
//					FieldRefEntry FDE_JTX=pool.fieldRefEntry(BlockDeclaration.currentClassDesc(),"_JTX", ConstantDescs.CD_int);
					blockCodeBuilder
						.aload(0)
//						.getfield(FDE_JTX)
						.tableswitch(lowValue, highValue, defaultTarget, tableSwitchCases)
						.labelBinding(defaultTarget);

					
					
					// break _LOOP;
					blockCodeBuilder.goto_(blockCodeBuilder.breakLabel());
				},
				catchBuilder -> catchBuilder.catching(CD.RTS_LABEL,
//						blockCodeBuilder -> buildCatchBlock(blockCodeBuilder,loopWhile)));
//		codeBuilder.labelBinding(loopEnd);
						blockCodeBuilder -> buildCatchBlock(blockCodeBuilder,contLabel)));
		codeBuilder.labelBinding(contLabel);
	}

	// ==================================================================================
    //        catch(RTS_LABEL q) {
    //            RTS_RTObject._TREAT_GOTO_CATCH_BLOCK(_THIS, q);
    //            _JTX=q.index; continue _LOOP; // EG. GOTO Lx
    //        }
	// ==================================================================================
	private void buildCatchBlock(CodeBuilder  codeBuilder,Label contLabel) {
		ConstantPoolBuilder pool=codeBuilder.constantPool();

		// RTS_RTObject._TREAT_GOTO_CATCH_BLOCK(_THIS, q);
		codeBuilder
			.astore(local_LABEL_q)
			.aload(local_THIS)
			.aload(local_LABEL_q)
			.invokestatic(CD.RTS_RTObject,
					"_TREAT_GOTO_CATCH_BLOCK", MethodTypeDesc.ofDescriptor("(Lsimula/runtime/RTS_RTObject;Lsimula/runtime/RTS_LABEL;)V"));

		// _JTX=q.index; continue _LOOP; // EG. GOTO Lx
		codeBuilder
			.aload(0)
//			.aload(local_LABEL_q)
//			.getfield(pool.fieldRefEntry(CD.RTS_LABEL,"index", ConstantDescs.CD_int))
//			.putfield(pool.fieldRefEntry(BlockDeclaration.currentClassDesc(),"_JTX", ConstantDescs.CD_int))
			.goto_(contLabel);
	}
	

	
	void buildSomeCode(CodeBuilder codeBuilder) {
		for(int i=0;i<500;i++) {
			codeBuilder
				.aload(0)
				.pop();
		}
	}

}
