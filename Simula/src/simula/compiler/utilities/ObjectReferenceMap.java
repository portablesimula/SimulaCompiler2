package simula.compiler.utilities;

import java.util.HashMap;
import java.util.Map;

import simula.compiler.syntaxClass.SyntaxClass;

public class ObjectReferenceMap {
	Map<Integer,SyntaxClass> objectReference;
	
	public ObjectReferenceMap() {
		objectReference = new HashMap<Integer,SyntaxClass>();
	}
	
	public void put(Integer key, SyntaxClass value) {
		System.out.println("ObjectReferenceMap.put:" + key + "  <= =>  " + value);
		if(key == null) Util.IERR("");
		if(value == null) Util.IERR("");
//		System.out.println("ObjectReferenceMap.put:" + key + "  <= =>  " + value.getClass().getSimpleName());
		objectReference.put(key, value);
//		Util.IERR("");
	}
	
	public SyntaxClass get(int key) {
		return(objectReference.get(key));
	}
	
	public void print() {
		System.out.println("ObjectReferenceMap.print: BEGIN Print OBJECT REFERENCE TABLE:");
		Map<Integer, SyntaxClass> map = objectReference;
		map.forEach((key, value) -> System.out.println("   " + key + "  <==>  " + value));
		System.out.println("ObjectReferenceMap.print: ENDOF Print OBJECT REFERENCE TABLE:");
	}

}
