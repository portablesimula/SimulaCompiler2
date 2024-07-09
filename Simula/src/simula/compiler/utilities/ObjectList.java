package simula.compiler.utilities;

import java.io.IOException;
import java.util.Vector;

import simula.compiler.AttributeInputStream;
import simula.compiler.AttributeOutputStream;
import simula.compiler.syntaxClass.SyntaxClass;

public class ObjectList<E> {
	Vector<E> objects;
	
	public void add(E obj) {
		objects.add(obj);
	}
	
	public E get(int i) {
		return objects.get(i);
	}
	
	public void writeObject(AttributeOutputStream oupt) throws IOException {
		if(objects != null) {
			oupt.writeShort(objects.size());
			for(E stm:objects) oupt.writeObj((SyntaxClass) stm);
		} else oupt.writeShort(0);
	}

	public static Vector<SyntaxClass> readObject(AttributeInputStream inpt) throws IOException {
		Vector<SyntaxClass> objects = null;
		int n = inpt.readShort();
		if (n > 0)
			objects = new Vector<SyntaxClass>();
		for (int i = 0; i < n; i++) {
			SyntaxClass stm = inpt.readObj();
			objects.add(stm);
		}
		return objects;
	}
	
}
