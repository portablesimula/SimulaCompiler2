package simula.compiler.utilities;

import java.io.IOException;
import java.lang.classfile.CodeBuilder;
import java.lang.classfile.Label;
import java.lang.classfile.CodeBuilder.BlockCodeBuilder;
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import java.lang.classfile.constantpool.FieldRefEntry;
import java.lang.classfile.instruction.SwitchCase;
import java.lang.constant.ConstantDescs;
import java.util.List;
import java.util.Vector;

import simula.compiler.AttributeInputStream;
import simula.compiler.AttributeOutputStream;
import simula.compiler.syntaxClass.SyntaxClass;
import simula.compiler.syntaxClass.declaration.BlockDeclaration;
import simula.compiler.syntaxClass.declaration.ClassDeclaration;
import simula.compiler.syntaxClass.declaration.DeclarationScope;
import simula.compiler.syntaxClass.declaration.LabelDeclaration;

public class LabelList {
	private static boolean TRACING = false;
	private static int LABEL_SEQU = 0;
	private int sequ;
	
	private DeclarationScope declaredIn;
	private Vector<LabelDeclaration> declaredLabels;
	
	private boolean READY_FOR_CODING;
	private Vector<LabelDeclaration> accumLabels; // Set by MAKE_READY_FOR_CODING  or  accumLabelList
	private Label defaultTarget; // beginning of the default handler block. Set by MAKE_READY_FOR_CODING
	private Vector<SwitchCase> tableSwitchCases;  // Set by MAKE_READY_FOR_CODING
	

	public LabelList(DeclarationScope declaredIn) {
		if(declaredIn == null) Util.IERR();
		this.sequ = (LABEL_SEQU++);
		this.declaredIn = declaredIn;
		this.declaredLabels = new Vector<LabelDeclaration>();
		if(TRACING) System.out.println("NEW " + this);
	}
	
	public void clear() {
		tableSwitchCases = null;
		READY_FOR_CODING = false;
	}
	
	private String ident() {
		return "LabelList["+sequ+':'+declaredIn.identifier+"]";
	}
	
	public Vector<LabelDeclaration> getDeclaredLabels(){
		return declaredLabels;
	}
	
	public Vector<LabelDeclaration> getAccumLabels(){
		return accumLabels;
	}
	
	public int accumLabelSize() {
		return (accumLabels == null)?0:accumLabels.size();
	}
	
	public int declaredLabelSize() {
		return (declaredLabels == null)?0:declaredLabels.size();
	}
	
	public LabelDeclaration getLastDeclaredLabel(String ident) {
//		int n = tableSize();
		int n = declaredLabelSize();
		if(n > 0) {
			for(int i=n-1;i>=0;i--) {
				LabelDeclaration lab = declaredLabels.get(i);
				if(lab.identifier.equalsIgnoreCase(ident)) return lab;
			}
		}
		return null;
	}
	
	public void add(LabelDeclaration lab) {
		if(TRACING) System.out.println(ident()+".add: "+lab.identifier+'['+lab.externalIdent+']');
		if(READY_FOR_CODING) Util.IERR("Can't add a new Label when LabelLisit is marked READY_FOR_CODING");
		declaredLabels.add(lab);
		if(TRACING) System.out.println(ident()+".add: DONE: LabelList = "+this);
	}
	
	// Used when generating .java source
	public static void accumLabelList(BlockDeclaration blk) {
		Vector<LabelDeclaration> accumLabels = new Vector<LabelDeclaration>();
		if(blk instanceof ClassDeclaration cls) {
			ClassDeclaration prefix = cls.prefixClass;
			while(prefix != null) {
				if(prefix.labelList != null) { 
					for(LabelDeclaration lab:prefix.labelList.declaredLabels)
						accumLabels.add(lab);
				}
				prefix = prefix.prefixClass;
			}
		}
		if(blk.labelList != null) 
			for(LabelDeclaration lab:blk.labelList.declaredLabels)
				accumLabels.add(lab);
		if(accumLabels != null) {
			if(blk.labelList == null) blk.labelList = new LabelList(blk);
			blk.labelList.accumLabels = accumLabels;
		}					
	}
	
	public List<SwitchCase> getTableSwitchCases(CodeBuilder codeBuilder) {
		if(!READY_FOR_CODING) MAKE_READY_FOR_CODING(codeBuilder);
		if(TRACING) System.out.println(ident()+".getTableSwitchCases: "+this);
		if(TRACING) System.out.println("LabelList.getTableSwitchCases: "+this);
		if(tableSwitchCases == null) Util.IERR();
		return tableSwitchCases;
	}

	public void setLabelIdexes() {
		if(accumLabels != null) {
			int nextIndex = 1;
			for (LabelDeclaration label : accumLabels) label.index = nextIndex++;
		}
		print("setLabelIdexes: Testing");
	}
	
	private void MAKE_READY_FOR_CODING(CodeBuilder codeBuilder) {
		if(READY_FOR_CODING) return;
		if(TRACING) System.out.println("\n" + ident() +".MAKE_READY_FOR_CODING: "+this);
//		Vector<LabelDeclaration> accumLabels = doAccumLabels(declaredIn);
//		accumLabels = doAccumLabels(declaredIn);
		if(accumLabelSize() > 0) {
			defaultTarget = codeBuilder.newLabel();
			tableSwitchCases = new Vector<SwitchCase>();
			if(TRACING) System.out.println(ident()+".MAKE_READY_FOR_CODING: nLabels="+accumLabels.size());
			for (int i = 1; i <= accumLabels.size(); i++) {
				Label lab = codeBuilder.newLabel();
				tableSwitchCases.add(SwitchCase.of(i, lab));
//					if(TRACING)
					LabelDeclaration labelDecl = accumLabels.get(i-1);
					System.out.println(ident()+".MAKE_READY_FOR_CODING: add "+i+"  " + labelDecl.identifier + "(index=" +labelDecl.index + ") = "+lab);
			}
		}			
		READY_FOR_CODING = true;
		print("READY_FOR_CODING: Testing");
//		Util.IERR();
	}
	
	public void build_JUMPTABLE(BlockCodeBuilder codeBuilder) {
		if(!READY_FOR_CODING) MAKE_READY_FOR_CODING(codeBuilder);
		if(TRACING) System.out.println(ident()+".build_JUMPTABLE: "+this);
		// *******************************************************************************
		// *** JUMPTABLE Case
		// *******************************************************************************
		// iconst_n // Number of cases (tableSize)
		// invokestatic _JUMPTABLE
		//
		// Output:
		//
		// tableswitch ...
		//
		// *******************************************************************************
		// Build the TableSwitch Instruction
//		Label defaultTarget = codeBuilder.newLabel(); // beginning of the default handler block.
		int lowValue = 1;            // the minimum key value.
		int highValue = accumLabelSize(); // the maximum key value.
		ConstantPoolBuilder pool=codeBuilder.constantPool();
		FieldRefEntry FDE_JTX=pool.fieldRefEntry(BlockDeclaration.currentClassDesc(),"_JTX", ConstantDescs.CD_int);
		codeBuilder
			.aload(0)
			.getfield(FDE_JTX)
			.tableswitch(lowValue, highValue, defaultTarget, this.getTableSwitchCases(codeBuilder))
			.labelBinding(defaultTarget);
	}
	
	public void labelBinding(LabelDeclaration label,CodeBuilder codeBuilder) {
		if(!READY_FOR_CODING) MAKE_READY_FOR_CODING(codeBuilder);
		BlockDeclaration labelContext = BlockDeclaration.labelContext;
		LabelList currentList = labelContext.labelList;
		if(TRACING) System.out.println(ident()+".labelBinding: labelContext="+labelContext+", codeBuilder="+codeBuilder);
		if(TRACING) System.out.println(ident()+".labelBinding: currentList="+currentList);
		SwitchCase switchCase=currentList.tableSwitchCases.get(label.index-1);
		if(TRACING) System.out.println(ident()+".labelBinding: "+label+"   SwitchCase="+switchCase);
		codeBuilder.labelBinding(switchCase.target());
	}

	public void printTree(final int indent, final Object head) {
		if(Option.internal.PRINT_SYNTAX_TREE > 2) {
			System.out.println(SyntaxClass.edIndent(indent)+this);
		} else {
			System.out.println(SyntaxClass.edIndent(indent) + "LabelList with " + (declaredLabels.size()) + " DeclaredLabels ...");
		}
	}
	
	public void print(String title) {
		System.out.println("\n************ BEGIN LabelList[" +sequ + "]: "+title+" ************");
		System.out.println("*** DeclaredIn: "+declaredIn.identifier+"  READY_FOR_CODING="+READY_FOR_CODING);
		System.out.print("*** DeclaredLabels:");
		if(declaredLabelSize() > 0) {
			for(LabelDeclaration lab:getDeclaredLabels()) {
				System.out.print(" " + lab.identifier + '[' + lab.declaredIn.externalIdent + ':' + lab.index + ']' + "atLine:" + lab.lineNumber);
			}
			System.out.println("");
		} else System.out.println(" NONE");
		System.out.print("*** AccumLabels:   ");
		if(accumLabelSize() > 0) {
			for(LabelDeclaration lab:getAccumLabels()) {
				System.out.print(" " + lab.identifier + '[' + lab.declaredIn.externalIdent + ':' + lab.index + ']' + "atLine:" + lab.lineNumber);
			}
			System.out.println("");
		} else System.out.println(" NONE");
		System.out.println("*** DefaultTarget:  "+defaultTarget);
		if(tableSwitchCases != null) {
			for(SwitchCase swc:tableSwitchCases) {
				System.out.println("*** SwitchCase:     "+swc);
			}
		}
		System.out.println("************ ENDOF LabelList[" +sequ + "]: "+title+" ************\n");
	}
	
	public String toString() {
		String s = "LabelList[" +sequ + "]:";
		String sep = " ";
		if(declaredLabelSize() > 0) {
			for(LabelDeclaration lab:declaredLabels) {
				s = s + sep + lab.identifier + '[' + lab.declaredIn.externalIdent + ':' + lab.index + ']';				
				s = s + "atLine:" + lab.lineNumber;
//				sep = "\n";
				sep = " ";
			}
		} else s = s + " With no labels";
		return(s);
	}
	

	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************

	public static void writeLabelList(LabelList labelList,AttributeOutputStream oupt) throws IOException {
		if(labelList == null) {
//		if(labelList == null || labelList.initialList == null) {
			oupt.writeBoolean(false);
		} else {
			oupt.writeBoolean(true);
			Util.TRACE_OUTPUT(""+labelList);
			oupt.writeObj(labelList.declaredIn);
			oupt.writeShort(labelList.declaredLabelSize());			
			for(LabelDeclaration lab:labelList.declaredLabels) {
				System.out.println("LabelList.writeLabelList: "+lab+", declaredIn="+lab.declaredIn+"   labelList.declaredIn="+labelList.declaredIn);
				oupt.writeObj(lab);
			}
		}
	}

	public static LabelList readLabelList(AttributeInputStream inpt) throws IOException {
		boolean present = inpt.readBoolean();
		LabelList labelList = null;
		if(present) {
			DeclarationScope declaredIn = (DeclarationScope) inpt.readObj();
			labelList = new LabelList(declaredIn);
			int n = inpt.readShort();
			if(TRACING)
				System.out.println("LabelList.readLabelList: Read Label List: "+n);
			for(int i=0;i<n;i++) {
				LabelDeclaration lab = (LabelDeclaration) inpt.readObj();
//				System.out.println("LabelList.readLabelList: Read Label: "+lab.identifier);
				labelList.add(lab);
			}
		}
		Util.TRACE_INPUT("LabelList: " + labelList);
//		System.out.println("LabelList.readLabelList: " + labelList);
		return(labelList);
	}

}
