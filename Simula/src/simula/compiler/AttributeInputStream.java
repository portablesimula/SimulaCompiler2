package simula.compiler;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import simula.compiler.syntaxClass.SyntaxClass;
import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.declaration.ArrayDeclaration;
import simula.compiler.syntaxClass.declaration.ClassDeclaration;
import simula.compiler.syntaxClass.declaration.ConnectionBlock;
import simula.compiler.syntaxClass.declaration.Declaration;
import simula.compiler.syntaxClass.declaration.ExternalDeclaration;
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
import simula.compiler.syntaxClass.expression.Expression;
import simula.compiler.syntaxClass.expression.ExpressionReference;
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
import simula.compiler.syntaxClass.statement.Statement;
import simula.compiler.syntaxClass.statement.StatementReference;
import simula.compiler.syntaxClass.statement.SwitchStatement;
import simula.compiler.syntaxClass.statement.WhileStatement;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.ObjectReferenceMap;
import simula.compiler.utilities.Util;

public class AttributeInputStream {
	DataInputStream inpt;
	public String jarFileName;
	
	/**
	 * The Object Reference Table.
	 * Used during Attribute File Input to fixup Object References.
	 */
	public ObjectReferenceMap objectReference;
	
	private boolean TRACE = false; //true;

    public AttributeInputStream(InputStream inpt,String jarFileName) throws IOException {
    	this.inpt = new DataInputStream(inpt);
    	this.jarFileName = jarFileName;
		objectReference = new ObjectReferenceMap();
    }

	public void close() throws IOException { inpt.close(); }
    
    public int readKind() throws IOException {
    	int kind = inpt.readByte();
    	if(TRACE) System.out.println("AttributeInputStream.readKind: "+kind+':'+ObjectKind.edit(kind));
    	return kind;
	}
	
    public Type readType() throws IOException {
		int keyWord = inpt.readUnsignedByte();
		if(keyWord == 0) {
	    	if(TRACE) System.out.println("AttributeInputStream.readType: null");
			return null;
		}
		String classIdent = readString();
		Type type = new Type(keyWord,classIdent);			
    	if(TRACE) System.out.println("AttributeInputStream.readType: "+type);
    	return type;
    }
	
    public boolean readBoolean() throws IOException {
    	boolean b = inpt.readBoolean();
    	if(TRACE) System.out.println("AttributeInputStream.readBoolean: "+b);
    	return b;
    }
	
    public int readShort() throws IOException {
    	short i = inpt.readShort();
    	if(TRACE) System.out.println("AttributeInputStream.readInt: "+i);
    	return i;
	}

    public Object readConstant() throws IOException {
    	int key = inpt.readByte();
    	if(TRACE) System.out.println("AttributeInputStream.readConstant: key=" + (int)key + " \"" + key +"\"");
    	Object res = null;
		switch(key) {
			case Type.T_VOID:		res = null; break;
			case Type.T_BOOLEAN:	res = inpt.readBoolean(); break;
			case Type.T_CHARACTER:	res = inpt.readChar(); break;
			case Type.T_INTEGER:	res = inpt.readShort(); break;
			case Type.T_REAL:		res = inpt.readFloat(); break;
			case Type.T_LONG_REAL:	res = inpt.readDouble(); break;
			case Type.T_TEXT:		res = readString(); break;
			default: throw new RuntimeException("key = "+key);
		}
    	if(TRACE) System.out.println("AttributeInputStream.readDouble: "+res);
    	return res;
	}

    public String readString() throws IOException {
    	int lng = inpt.readShort()-1;
    	if(lng < 0) {
        	if(TRACE) System.out.println("AttributeInputStream.readString: null");
    		return null;
    	}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < lng; i++) sb.append(inpt.readChar());
    	String s = sb.toString();
    	if(TRACE) System.out.println("AttributeInputStream.readString: \""+s+'"');
    	return s;
    }

    public int readSEQU(SyntaxClass obj) throws IOException {
    	int SEQU = inpt.readShort();
    	if(TRACE) System.out.println("AttributeInputStream.readSEQU: " + SEQU + "  ====>  " + obj.getClass().getSimpleName());
		objectReference.put(SEQU, obj);
    	return SEQU;
	}
    
	public SyntaxClass readObj() throws IOException {
		int kind = readKind();
		switch(kind) {
		case ObjectKind.NULL:
			if(TRACE) System.out.println("AttributeInputStream.readObj: null");
			return null;
		case ObjectKind.ObjectReference:
			int SEQU = inpt.readShort();
			if(TRACE) System.out.println("AttributeInputStream.readObj: SEQU="+SEQU);
			SyntaxClass obj = objectReference.get(SEQU);
			if(obj == null) { objectReference.print(); Util.IERR(); }
			return(obj);
		case ObjectKind.DeclarationReference:
			SEQU = inpt.readShort();
			if(TRACE) System.out.println("AttributeInputStream.readObj: SEQU="+SEQU);
			Declaration decl = (Declaration) objectReference.get(SEQU);
			if(decl == null) { objectReference.print(); Util.IERR(); }
			if(TRACE) System.out.println("AttributeInputStream.readObj: Declaration="+decl);
			return(decl);
		case ObjectKind.StatementReference:
			SEQU = inpt.readShort();
			if(TRACE) System.out.println("AttributeInputStream.readObj: SEQU="+SEQU);
			Statement stm = new StatementReference(SEQU,objectReference);
			if(TRACE) System.out.println("AttributeInputStream.readObj: "+stm);
			return(stm);
		case ObjectKind.ExpressionReference:
			SEQU = inpt.readShort();
			if(TRACE) System.out.println("AttributeInputStream.readObj: SEQU="+SEQU);
			Expression expr = new ExpressionReference(SEQU,objectReference);
			if(TRACE) System.out.println("AttributeInputStream.readObj: "+expr);
			return(expr);
		default:
			obj = readObj(kind,this);
			if(obj.SEQU == 0) Util.IERR();
			objectReference.put(obj.SEQU, obj);
			if(TRACE) System.out.println("AttributeInputStream.readObj: obj="+obj);
			return(obj);
		}	
	}

	private SyntaxClass readObj(int kind,AttributeInputStream inpt) throws IOException {
		switch(kind) {
			case ObjectKind.NULL:						return null;
			
			case ObjectKind.StandardClass:				return StandardClass.readObject(inpt);
			case ObjectKind.ConnectionBlock:			return ConnectionBlock.readObject(inpt);
			case ObjectKind.CompoundStatement:			return MaybeBlockDeclaration.readObject(inpt);
//			case ObjectKind.SubBlock:					return SubBlock.readObject(inpt);
			case ObjectKind.Procedure:					return ProcedureDeclaration.readObject(inpt);
//			case ObjectKind.Switch:						return SwitchDeclaration.readObject(inpt);
//			case ObjectKind.MemberMethod:				return MemberMethod.readObject(inpt);
//			case ObjectKind.ContextFreeMethod:			return ContextFreeMethod.readObject(inpt);
			case ObjectKind.Class:						return ClassDeclaration.readObject(inpt);
			case ObjectKind.PrefixedBlock:				return PrefixedBlockDeclaration.readObject(inpt);
//			case ObjectKind.SimulaProgram:				return SimulaProgram.readObject(inpt);
			case ObjectKind.ArrayDeclaration:			return ArrayDeclaration.readObject(inpt);
//			case ObjectKind.VirtualSpecification:		return VirtualSpecification.readObject(inpt);
//			case ObjectKind.VirtualMatch:				return VirtualMatch.readObject(inpt);
//			case ObjectKind.Parameter:					return Parameter.readObject(inpt);
//			case ObjectKind.Thunk:						return Thunk.readObject(inpt);
			case ObjectKind.LabelDeclaration:			return LabelDeclaration.readObject(inpt);
			case ObjectKind.SimpleVariableDeclaration:	return SimpleVariableDeclaration.readObject(inpt);
			case ObjectKind.ExternalDeclaration:		return ExternalDeclaration.readObject(inpt);

			case ObjectKind.ActivationStatement:		return ActivationStatement.readObject(inpt);
			case ObjectKind.BlockStatement:				return BlockStatement.readObject(inpt);
			case ObjectKind.ConditionalStatement:		return ConditionalStatement.readObject(inpt);
			case ObjectKind.ConnectionStatement:		return ConnectionStatement.readObject(inpt);
			case ObjectKind.DummyStatement:				return DummyStatement.readObject(inpt);
			case ObjectKind.ForStatement:				return ForStatement.readObject(inpt);
			case ObjectKind.GotoStatement:				return GotoStatement.readObject(inpt);
			case ObjectKind.InlineStatement:			return InlineStatement.readObject(inpt);
			case ObjectKind.InnerStatement:				return InnerStatement.readObject(inpt);
			case ObjectKind.LabeledStatement:			return LabeledStatement.readObject(inpt);
			case ObjectKind.ProgramModule:				return ProgramModule.readObject(inpt);
			case ObjectKind.StandaloneExpression:		return StandaloneExpression.readObject(inpt);
			case ObjectKind.SwitchStatement:			return SwitchStatement.readObject(inpt);
			case ObjectKind.WhileStatement:				return WhileStatement.readObject(inpt);

			case ObjectKind.ArithmeticExpression:		return ArithmeticExpression.readObject(inpt);
			case ObjectKind.AssignmentOperation:		return AssignmentOperation.readObject(inpt);
			case ObjectKind.BooleanExpression:			return BooleanExpression.readObject(inpt);
			case ObjectKind.ConditionalExpression:		return ConditionalExpression.readObject(inpt);
			case ObjectKind.Constant:					return Constant.readObject(inpt);
			case ObjectKind.LocalObject:				return LocalObject.readObject(inpt);
			case ObjectKind.ObjectGenerator:			return ObjectGenerator.readObject(inpt);
			case ObjectKind.ObjectRelation:				return ObjectRelation.readObject(inpt);
			case ObjectKind.QualifiedObject:			return QualifiedObject.readObject(inpt);
			case ObjectKind.RelationalOperation:		return RelationalOperation.readObject(inpt);
			case ObjectKind.RemoteVariable:				return RemoteVariable.readObject(inpt);
			case ObjectKind.TextExpression:				return TextExpression.readObject(inpt);
			case ObjectKind.TypeConversion:				return TypeConversion.readObject(inpt);
			case ObjectKind.UnaryOperation:				return UnaryOperation.readObject(inpt);
			case ObjectKind.VariableExpression:			return VariableExpression.readObject(inpt);

		}	
		Util.IERR("IMPOSSIBLE "+kind);
		return(null);
	}



}
