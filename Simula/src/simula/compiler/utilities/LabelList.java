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
	
	public DeclarationScope declaredIn;
	public Vector<LabelDeclaration> labels;
	private Vector<SwitchCase> tableSwitchCases; // Set by MAKE_READY_FOR_CODING
	
	private boolean READY_FOR_CODING;

	public LabelList(DeclarationScope declaredIn) {
		if(TRACING) {
			this.sequ = (LABEL_SEQU++);
			this.declaredIn = declaredIn;
		}
		this.labels = new Vector<LabelDeclaration>();
		if(TRACING) System.out.println("NEW " + this);
	}
	
	private String ident() {
		if(declaredIn == null) return "LabelList["+sequ+"]";
		return "LabelList["+sequ+':'+declaredIn.identifier+"]";
	}
	
	public int tableSize() {
		return (labels == null)?0:labels.size();
	}

	public boolean isEmpty() {
		return tableSize() == 0;
	}
	
	public LabelDeclaration getLastLabel(String ident) {
		int n = tableSize();
		if(n > 0) {
			for(int i=n-1;i>=0;i--) {
				LabelDeclaration lab = labels.get(i);
				if(lab.identifier.equalsIgnoreCase(ident)) return lab;
			}
		}
		return null;
	}
	
	public void add(LabelDeclaration lab) {
		if(TRACING) System.out.println(ident()+".add: "+lab.identifier+'['+lab.externalIdent+']');
		if(READY_FOR_CODING) Util.IERR("Can't add a new Label when LabelLisit is marked READY_FOR_CODING");
//		if(get(lab.identifier) == null)
		labels.add(lab);
		if(TRACING) System.out.println(ident()+".add: DONE: LabelList = "+this);
		
//		System.out.println("LabelLisit.add: "+lab);
//		Thread.dumpStack();
	}
	
//	private LabelDeclaration get(String identifier) {
//		for(LabelDeclaration lab:labels) if(lab.identifier.equals(identifier)) return lab;
//		return null;
//	}
	
	// Used by ClassDeclaration and PrefixedBlockDeclaration
	public static void accumLabelList(ClassDeclaration cls) {
		if(cls.prefixClass != null) {
			LabelList newList = new LabelList(cls);
			if(cls.prefixClass.labelList != null) 
				for(LabelDeclaration lab:cls.prefixClass.labelList.labels)
					newList.add(lab);
			
			if(cls.labelList != null) 
				for(LabelDeclaration lab:cls.labelList.labels) newList.add(lab);
			
			cls.labelList = newList;				
		}
	}
	
	public void setLabelIdexes() {
		int nextIndex = 1;
		for (LabelDeclaration label : labels) label.index = nextIndex++;
	}
	
	public List<SwitchCase> getTableSwitchCases(CodeBuilder codeBuilder) {
		if(!READY_FOR_CODING) MAKE_READY_FOR_CODING(codeBuilder);
		if(TRACING) System.out.println(ident()+".getTableSwitchCases: "+this);
		if(TRACING) System.out.println("LabelList.getTableSwitchCases: "+this);
		if(tableSwitchCases == null) Util.IERR();
		return tableSwitchCases;
	}
	
	private void MAKE_READY_FOR_CODING(CodeBuilder codeBuilder) {
		if(READY_FOR_CODING) return;
		if(TRACING) System.out.println("\n" + ident() +".MAKE_READY_FOR_CODING: "+this);
		if(tableSize() > 0) {
			tableSwitchCases = new Vector<SwitchCase>();
			if(TRACING) System.out.println(ident()+".MAKE_READY_FOR_CODING: nLabels="+tableSize());
			for (int i = 1; i <= tableSize(); i++) {
				Label lab = codeBuilder.newLabel();
				tableSwitchCases.add(SwitchCase.of(i, lab));
				if(TRACING) System.out.println(ident()+".MAKE_READY_FOR_CODING: add "+i+"  "+labels.get(i-1).identifier+" = "+lab);
			}
		}
		READY_FOR_CODING = true;
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
		Label defaultTarget = codeBuilder.newLabel(); // beginning of the default handler block.
		int lowValue = 1;            // the minimum key value.
		int highValue = tableSize(); // the maximum key value.
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
		if(TRACING) System.out.println(ident()+".labelBinding: labelContext="+labelContext);
		if(TRACING) System.out.println(ident()+".labelBinding: currentList="+currentList);
		SwitchCase switchCase=currentList.tableSwitchCases.get(label.index-1);
		if(TRACING) System.out.println(ident()+".labelBinding: "+label+"   SwitchCase="+switchCase);
		codeBuilder.labelBinding(switchCase.target());
	}

	public void printTree(final int indent) {
		System.out.println(SyntaxClass.edIndent(indent)+this);
	}
	
	public String toString() {
		String s = "LabelList[" +sequ + "]:";
		String sep = " ";
		if(tableSize() > 0) {
			for(LabelDeclaration lab:labels) {
				s = s + sep + lab.identifier + '[' + lab.declaredIn.externalIdent + ':' + lab.index + ']';				
				s = s + "  " + lab.lineNumber;
				sep = "\n";
			}
		} else s = s + " With no labels";
		return(s);
	}
	

	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************

	public static void writeLabelList(LabelList labelList,AttributeOutputStream oupt) throws IOException {
//		Util.IERR();
		if(labelList == null) {
			oupt.writeBoolean(false);
		} else {
			oupt.writeBoolean(true);
			Util.TRACE_OUTPUT(""+labelList);
			oupt.writeObj(labelList.declaredIn);
			oupt.writeShort(labelList.tableSize());			
			for(LabelDeclaration lab:labelList.labels) oupt.writeObj(lab);
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
