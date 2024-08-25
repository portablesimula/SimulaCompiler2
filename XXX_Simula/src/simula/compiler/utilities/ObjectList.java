package simula.compiler.utilities;

import java.io.IOException;
import java.util.Vector;

import simula.compiler.AttributeInputStream;
import simula.compiler.AttributeOutputStream;
import simula.compiler.syntaxClass.SyntaxClass;

@SuppressWarnings("serial")
public class ObjectList<E> extends Vector<E> {
	
	@SuppressWarnings("unchecked")
	public boolean add(Object obj) {
		return super.add((E) obj);
	}
	
	public static void write(ObjectList<?> list, AttributeOutputStream oupt) throws IOException {
		if(list != null) {
			oupt.writeShort(list.size());
			for(Object stm:list) oupt.writeObj((SyntaxClass) stm);
		} else oupt.writeShort(-1);
	}

	public static ObjectList<?> read(AttributeInputStream inpt) throws IOException {
		ObjectList<?> list = null;
		int n = inpt.readShort();
		if (n >= 0)
			list = new ObjectList<Object>();
		if(n > 0) {
			for (int i = 0; i < n; i++)
				list.add(inpt.readObj());
		}
		return list;
	}
	
}
