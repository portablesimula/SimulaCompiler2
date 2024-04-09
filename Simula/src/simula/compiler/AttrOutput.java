package simula.compiler;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import simula.compiler.syntaxClass.SyntaxClass;
import simula.compiler.syntaxClass.Type;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Util;

public class AttrOutput {
	DataOutputStream oupt;

	private boolean TRACE = true;

    public AttrOutput(OutputStream oupt) throws IOException {
    	this.oupt = new DataOutputStream(oupt);
    }

    public void writeKind(int i) throws IOException {
		if(TRACE) System.out.println("AttrOutput.writeKind: "+i+':'+ObjectKind.edit(i));
		oupt.writeInt(300+i);
	}

    public void writeObj(SyntaxClass obj) throws IOException {
		if(obj == null) {
			if(TRACE) System.out.println("AttrOutput.writeObj: null");
			writeKind(ObjectKind.NULL);
		} else if(obj.SEQU != 0) {
			if(TRACE) System.out.println("AttrOutput.writeObj: ObjectReference "+(obj.SEQU));
			writeKind(ObjectKind.ObjectReference);
			writeInt(obj.SEQU);
		} else {
			obj.SEQU = Global.Object_SEQU++;
			if(TRACE) System.out.println("AttrOutput.writeObj: "+obj.SEQU+": "+obj.getClass().getSimpleName()+"  "+obj);
			obj.writeAttr(this);
		}
	}

	
//    public void writeObject(Object obj) throws IOException {
//		if(TRACE) {
//			if(obj != null) 
//				 System.out.println("AttrOutput.writeObject: "+obj.getClass().getSimpleName()+"  "+obj);
//			else System.out.println("AttrOutput.writeObject: null");
//		}
//		oupt.writeObject(obj);
//	}

	
    public void writeType(Type type) throws IOException {
		if(TRACE) System.out.println("AttrOutput.writeType: "+type);
		if(type == null) {
			oupt.writeInt(-1);
		} else {
			oupt.writeInt(type.keyWord);
			writeString(type.classIdent);
		}
//		oupt.writeObject(qual);
//		oupt.writeObject(declaredIn);
	}
	
    public void writeBoolean(boolean b) throws IOException {
		if(TRACE) System.out.println("AttrOutput.writeBoolean: "+b);
		oupt.writeBoolean(b);
	}

	
    public void writeByte(int b) throws IOException {
		Util.IERR("SHOULD NOT BE USED");
		if(TRACE) System.out.println("AttrOutput.writeByte: "+b);
		if(b < 0 || b > 0x7f) Util.IERR("");
		oupt.writeByte(b);
	}

	
    public void writeShort(int s) throws IOException {
		Util.IERR("SHOULD NOT BE USED");
		if(TRACE) System.out.println("AttrOutput.writeShort: "+s);
		oupt.writeShort(s);
	}

	
    public void writeChar(int c) throws IOException {
		if(TRACE) System.out.println("AttrOutput.writeChar: "+c);
		oupt.writeChar(c);
	}

	
    public void writeInt(int i) throws IOException {
		if(TRACE) System.out.println("AttrOutput.writeInt: "+i);
		oupt.writeInt(i);
	}

	
    public void writeLong(long l) throws IOException {
		if(TRACE) System.out.println("AttrOutput.writeLong: "+l);
		oupt.writeLong(l);
	}

	
    public void writeFloat(float f) throws IOException {
		if(TRACE) System.out.println("AttrOutput.writeFloat: "+f);
		oupt.writeFloat(f);
	}

	
    public void writeDouble(double d) throws IOException {
		if(TRACE) System.out.println("AttrOutput.writeDouble: "+d);
		oupt.writeDouble(d);
	}

    public void writeString(String s) throws IOException {
		if(TRACE) System.out.println("AttrOutput.writeUTF: "+s);
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