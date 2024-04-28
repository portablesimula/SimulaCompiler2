package simula.compiler;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import simula.compiler.syntaxClass.SyntaxClass;
import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.declaration.Declaration;
import simula.compiler.syntaxClass.declaration.LabelDeclaration;
import simula.compiler.syntaxClass.expression.Expression;
import simula.compiler.syntaxClass.statement.Statement;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Util;

public class AttributeOutputStream {
	DataOutputStream oupt;

	private boolean TRACE = false; //true;

    public AttributeOutputStream(OutputStream oupt) throws IOException {
    	this.oupt = new DataOutputStream(oupt);
    }

    public void writeKind(int i) throws IOException {
		if(TRACE) System.out.println("AttributeOutputStream.writeKind: "+i+':'+ObjectKind.edit(i));
		oupt.writeInt(300+i);
	}

    public void writeObj(SyntaxClass obj) throws IOException {
		if(obj == null) {
			if(TRACE) System.out.println("AttributeOutputStream.writeObj: null");
			writeKind(ObjectKind.NULL);
		} else if(obj.SEQU != 0) {
			int kind = 0;
			if(obj instanceof Declaration)		kind = ObjectKind.DeclarationReference;
			else if(obj instanceof Statement)	kind = ObjectKind.StatementReference;
			else if(obj instanceof Expression)	kind = ObjectKind.ExpressionReference;
			else 								kind = ObjectKind.ObjectReference;
			if(TRACE) System.out.println("AttributeOutputStream.writeObj: "+ObjectKind.edit(kind)+" "+(obj.SEQU));
			writeKind(kind);
			writeInt(obj.SEQU);
		} else {
			obj.SEQU = Global.Object_SEQU++;
			if(TRACE) System.out.println("AttributeOutputStream.writeObj: SEQU="+obj.SEQU+": "+obj.getClass().getSimpleName()+"  "+obj);
			obj.writeObject(this);
		}

    }

	
//    public void writeObject(Object obj) throws IOException {
//		if(TRACE) {
//			if(obj != null) 
//				 System.out.println("AttributeOutputStream.writeObject: "+obj.getClass().getSimpleName()+"  "+obj);
//			else System.out.println("AttributeOutputStream.writeObject: null");
//		}
//		oupt.writeObject(obj);
//	}

    public void writeType(Type type) throws IOException {
		if(TRACE) System.out.println("AttributeOutputStream.writeType: "+type);
		if(type == null) {
			writeInt(-1);
		} else {
			writeInt(type.keyWord);
			writeString(type.classIdent);
		}
//		oupt.writeObject(qual);
//		oupt.writeObject(declaredIn);
	}
	
    public void writeBoolean(boolean b) throws IOException {
		if(TRACE) System.out.println("AttributeOutputStream.writeBoolean: "+b);
		oupt.writeBoolean(b);
	}

	
    public void writeByte(int b) throws IOException {
		Util.IERR("SHOULD NOT BE USED");
		if(TRACE) System.out.println("AttributeOutputStream.writeByte: "+b);
		if(b < 0 || b > 0x7f) Util.IERR("");
		oupt.writeByte(b);
	}

	
    public void writeShort(int s) throws IOException {
		Util.IERR("SHOULD NOT BE USED");
		if(TRACE) System.out.println("AttributeOutputStream.writeShort: "+s);
		oupt.writeShort(s);
	}

	
    public void writeChar(int c) throws IOException {
		if(TRACE) System.out.println("AttributeOutputStream.writeChar: "+c);
		oupt.writeChar(c);
	}

	
    public void writeInt(int i) throws IOException {
		if(TRACE) System.out.println("AttributeOutputStream.writeInt: "+i);
		oupt.writeInt(i);
	}

	
    public void writeLong(long l) throws IOException {
		if(TRACE) System.out.println("AttributeOutputStream.writeLong: "+l);
		oupt.writeLong(l);
	}

	
    public void writeFloat(float f) throws IOException {
		if(TRACE) System.out.println("AttributeOutputStream.writeFloat: "+f);
		oupt.writeFloat(f);
	}

	
    public void writeDouble(double d) throws IOException {
		if(TRACE) System.out.println("AttributeOutputStream.writeDouble: "+d);
		oupt.writeDouble(d);
	}

    public void writeString(String s) throws IOException {
		if(TRACE) System.out.println("AttributeOutputStream.writeString: "+s);
//		oupt.writeString(s);
		if(s == null) oupt.writeInt(-1);
		else {
			int lng = s.length();
			oupt.writeInt(lng);
			for(int i=0;i<lng;i++) oupt.writeChar(s.charAt(i));
		}
//		oupt.writeChars(s);
	}

	
	public void flush() throws IOException { oupt.flush(); }

	
	public void close() throws IOException { oupt.close(); }

}