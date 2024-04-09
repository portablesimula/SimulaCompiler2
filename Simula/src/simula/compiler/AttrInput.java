package simula.compiler;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import simula.compiler.syntaxClass.SyntaxClass;
import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.declaration.ArrayDeclaration;
import simula.compiler.syntaxClass.declaration.ClassDeclaration;
import simula.compiler.syntaxClass.declaration.ConnectionBlock;
import simula.compiler.syntaxClass.declaration.LabelDeclaration;
import simula.compiler.syntaxClass.declaration.MaybeBlockDeclaration;
import simula.compiler.syntaxClass.declaration.PrefixedBlockDeclaration;
import simula.compiler.syntaxClass.declaration.ProcedureDeclaration;
import simula.compiler.syntaxClass.declaration.SimpleVariableDeclaration;
import simula.compiler.syntaxClass.declaration.StandardClass;
import simula.compiler.syntaxClass.expression.ArithmeticExpression;
import simula.compiler.syntaxClass.expression.AssignmentOperation;
import simula.compiler.syntaxClass.expression.BooleanExpression;
import simula.compiler.syntaxClass.expression.ConditionalExpression;
import simula.compiler.syntaxClass.expression.Constant;
import simula.compiler.syntaxClass.expression.LocalObject;
import simula.compiler.syntaxClass.expression.ObjectGenerator;
import simula.compiler.syntaxClass.expression.ObjectRelation;
import simula.compiler.syntaxClass.expression.QualifiedObject;
import simula.compiler.syntaxClass.expression.RelationalOperation;
import simula.compiler.syntaxClass.expression.RemoteVariable;
import simula.compiler.syntaxClass.expression.TextExpression;
import simula.compiler.syntaxClass.expression.TypeConversion;
import simula.compiler.syntaxClass.expression.UnaryOperation;
import simula.compiler.syntaxClass.expression.VariableExpression;
import simula.compiler.syntaxClass.statement.ActivationStatement;
import simula.compiler.syntaxClass.statement.BlockStatement;
import simula.compiler.syntaxClass.statement.ConditionalStatement;
import simula.compiler.syntaxClass.statement.ConnectionStatement;
import simula.compiler.syntaxClass.statement.DummyStatement;
import simula.compiler.syntaxClass.statement.ForStatement;
import simula.compiler.syntaxClass.statement.GotoStatement;
import simula.compiler.syntaxClass.statement.InlineStatement;
import simula.compiler.syntaxClass.statement.InnerStatement;
import simula.compiler.syntaxClass.statement.LabeledStatement;
import simula.compiler.syntaxClass.statement.ProgramModule;
import simula.compiler.syntaxClass.statement.StandaloneExpression;
import simula.compiler.syntaxClass.statement.SwitchStatement;
import simula.compiler.syntaxClass.statement.WhileStatement;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.ObjectReferenceMap;
import simula.compiler.utilities.Util;

public class AttrInput {
	DataInputStream inpt;
	
	/**
	 * The Object Reference Table.
	 * Used during Attribute File Input to fixup Object References.
	 */
	private ObjectReferenceMap objectReference;
	
	private boolean TRACE = false; //true;

    public AttrInput(InputStream inpt) throws IOException {
    	this.inpt = new DataInputStream(inpt);
		objectReference = new ObjectReferenceMap();
    }

	
	public void close() throws IOException { inpt.close(); }
    
    public int readKind() throws IOException {
    	int i = inpt.readInt() - 300;
    	if(TRACE) System.out.println("AttrInput.readKind: "+i+"  "+(i+300)+':'+ObjectKind.edit((i<0)?i+300:i));
    	return i;
	}
	
//	public Object readObject() throws ClassNotFoundException, IOException {
//		Util.IERR("");
//		Object obj = inpt.readObject();
////		System.out.println("AttrInput.readObject: "+obj.getClass().getSimpleName()+"  "+obj);
//		if(TRACE) {
//			if(obj != null) 
//				 System.out.println("AttrInput.readObject: "+obj.getClass().getSimpleName()+"  "+obj);
//			else System.out.println("AttrInput.readObject: null");
//		}
//		return obj;
//	}
	
	
    public Type readType() throws IOException {
		int keyWord = inpt.readInt();
		if(keyWord == -1) return(null);
		String classIdent = readString();
//		qual=(ClassDeclaration) inpt.readObject();
//		declaredIn=(ConnectionBlock) inpt.readObject();
		Type type = new Type(keyWord,classIdent);			
    	if(TRACE) System.out.println("AttrInput.readType: "+type);
    	return type;
    }
	
    public boolean readBoolean() throws IOException {
    	boolean b = inpt.readBoolean();
    	if(TRACE) System.out.println("AttrInput.readBoolean: "+b);
    	return b;
    }

	
//    public byte readByte() throws IOException {
//		Util.IERR("SHOULD NOT BE USED");
//		byte b = inpt.readByte();
//    	if(TRACE) System.out.println("AttrInput.readByte: "+b);
//    	return b;
//	}
//
//	
//    public int readUnsignedByte() throws IOException {
//		Util.IERR("SHOULD NOT BE USED");
//    	int b = inpt.readUnsignedByte();
//    	if(TRACE) System.out.println("AttrInput.readUnsignedByte: "+b);
//    	return b;
//	}
//
//	
//    public short readShort() throws IOException {
//		Util.IERR("SHOULD NOT BE USED");
//    	short s = inpt.readShort();
//    	if(TRACE) System.out.println("AttrInput.readShort: "+s);
//    	return s;
//	}
//
//	
//    public int readUnsignedShort() throws IOException {
//		Util.IERR("SHOULD NOT BE USED");
//    	int s = inpt.readUnsignedShort();
//    	if(TRACE) System.out.println("AttrInput.readUnsignedShort: "+s);
//    	return s;
//	}

	
    public char readChar() throws IOException {
    	char c = inpt.readChar();
    	if(TRACE) System.out.println("AttrInput.readChar: "+c);
    	return c;
	}

	
    public int readInt() throws IOException {
    	int i = inpt.readInt();
    	if(TRACE) System.out.println("AttrInput.readInt: "+i);
    	return i;
	}

	
    public long readLong() throws IOException {
    	long l = inpt.readLong();
    	if(TRACE) System.out.println("AttrInput.readLong: "+l);
    	return l;
	}

	
    public float readFloat() throws IOException {
    	float f = inpt.readFloat();
    	if(TRACE) System.out.println("AttrInput.readFloat: "+f);
    	return f;
	}

	
    public double readDouble() throws IOException {
    	double d = inpt.readDouble();
    	if(TRACE) System.out.println("AttrInput.readDouble: "+d);
    	return d;
	}

    public String readString() throws IOException {
//    	if(TRACE) System.out.println("BEGIN AttrInput.readUTF: ");
//    	String s = inpt.readString();
    	int lng = inpt.readInt();
    	if(TRACE) System.out.println("AttrInput.readString: lng="+lng);
    	if(lng < 0) {
        	if(TRACE) System.out.println("AttrInput.readString: null");
    		return null;
    	}
    	StringBuffer sb = new StringBuffer();
    	for(int i=0;i<lng;i++) {
    		char c = inpt.readChar();
//        	if(TRACE) System.out.println("AttrInput.readUTF: c="+c);
    		sb.append(c);
    	}
    	String s = sb.toString();
    	if(TRACE) System.out.println("AttrInput.readString: "+s);
    	return s;
    }

	public SyntaxClass readObj() throws IOException {
		int kind = readKind();
		if(kind == ObjectKind.NULL) {
			if(TRACE) System.out.println("AttrInput.readObj: null");
			return null;
		} else if(kind == ObjectKind.ObjectReference) {
			int SEQU = inpt.readInt();
			if(TRACE) System.out.println("AttrInput.readObj: SEQU="+SEQU);
			SyntaxClass obj = objectReference.get(SEQU);
			return(obj);
		} else {
//			if(TRACE) System.out.println("AttrInput.readObj: kind="+kind+":"+ObjectKind.edit(kind));
			SyntaxClass obj = readObj(kind,this);
			objectReference.put(obj.SEQU, obj);
			if(TRACE) System.out.println("AttrInput.readObj: obj="+obj);
			return(obj);
		}
	}

	private SyntaxClass readObj(int kind,AttrInput inpt) throws IOException {
		switch(kind) {
			case ObjectKind.NULL:						return null;
			
			case ObjectKind.StandardClass:				return StandardClass.readAttr(inpt);
			case ObjectKind.ConnectionBlock:			return ConnectionBlock.readAttr(inpt);
			case ObjectKind.CompoundStatement:			return MaybeBlockDeclaration.readAttr(inpt);
//			case ObjectKind.SubBlock:					return SubBlock.readAttr(inpt);
			case ObjectKind.Procedure:					return ProcedureDeclaration.readAttr(inpt);
//			case ObjectKind.MemberMethod:				return MemberMethod.readAttr(inpt);
//			case ObjectKind.ContextFreeMethod:			return ContextFreeMethod.readAttr(inpt);
			case ObjectKind.Class:						return ClassDeclaration.readAttr(inpt);
			case ObjectKind.PrefixedBlock:				return PrefixedBlockDeclaration.readAttr(inpt);
//			case ObjectKind.SimulaProgram:				return SimulaProgram.readAttr(inpt);
			case ObjectKind.ArrayDeclaration:			return ArrayDeclaration.readAttr(inpt);
//			case ObjectKind.VirtualSpecification:		return VirtualSpecification.readAttr(inpt);
//			case ObjectKind.VirtualMatch:				return VirtualMatch.readAttr(inpt);
//			case ObjectKind.Parameter:					return Parameter.readAttr(inpt);
//			case ObjectKind.Thunk:						return Thunk.readAttr(inpt);
			case ObjectKind.LabelDeclaration:			return LabelDeclaration.readAttr(inpt);
			case ObjectKind.SimpleVariableDeclaration:	return SimpleVariableDeclaration.readAttr(inpt);
//			case ObjectKind.ExternalDeclaration:		return ExternalDeclaration.readAttr(inpt);

			case ObjectKind.ActivationStatement:		return ActivationStatement.readAttr(inpt);
			case ObjectKind.BlockStatement:				return BlockStatement.readAttr(inpt);
			case ObjectKind.ConditionalStatement:		return ConditionalStatement.readAttr(inpt);
			case ObjectKind.ConnectionStatement:		return ConnectionStatement.readAttr(inpt);
			case ObjectKind.DummyStatement:				return DummyStatement.readAttr(inpt);
			case ObjectKind.ForStatement:				return ForStatement.readAttr(inpt);
			case ObjectKind.GotoStatement:				return GotoStatement.readAttr(inpt);
			case ObjectKind.InlineStatement:			return InlineStatement.readAttr(inpt);
			case ObjectKind.InnerStatement:				return InnerStatement.readAttr(inpt);
			case ObjectKind.LabeledStatement:			return LabeledStatement.readAttr(inpt);
			case ObjectKind.ProgramModule:				return ProgramModule.readAttr(inpt);
			case ObjectKind.StandaloneExpression:		return StandaloneExpression.readAttr(inpt);
			case ObjectKind.SwitchStatement:			return SwitchStatement.readAttr(inpt);
			case ObjectKind.WhileStatement:				return WhileStatement.readAttr(inpt);

			case ObjectKind.ArithmeticExpression:		return ArithmeticExpression.readAttr(inpt);
			case ObjectKind.AssignmentOperation:		return AssignmentOperation.readAttr(inpt);
			case ObjectKind.BooleanExpression:			return BooleanExpression.readAttr(inpt);
			case ObjectKind.ConditionalExpression:		return ConditionalExpression.readAttr(inpt);
			case ObjectKind.Constant:					return Constant.readAttr(inpt);
			case ObjectKind.LocalObject:				return LocalObject.readAttr(inpt);
			case ObjectKind.ObjectGenerator:			return ObjectGenerator.readAttr(inpt);
			case ObjectKind.ObjectRelation:				return ObjectRelation.readAttr(inpt);
			case ObjectKind.QualifiedObject:			return QualifiedObject.readAttr(inpt);
			case ObjectKind.RelationalOperation:		return RelationalOperation.readAttr(inpt);
			case ObjectKind.RemoteVariable:				return RemoteVariable.readAttr(inpt);
			case ObjectKind.TextExpression:				return TextExpression.readAttr(inpt);
			case ObjectKind.TypeConversion:				return TypeConversion.readAttr(inpt);
			case ObjectKind.UnaryOperation:				return UnaryOperation.readAttr(inpt);
			case ObjectKind.VariableExpression:			return VariableExpression.readAttr(inpt);

		}	
		Util.IERR("IMPOSSIBLE "+kind);
		return(null);
	}



}
