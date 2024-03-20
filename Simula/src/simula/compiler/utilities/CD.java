package simula.compiler.utilities;

import java.lang.constant.ClassDesc;

import simula.compiler.syntaxClass.Type;

public class CD {
	public static final ClassDesc RTS_RTObject    = ClassDesc.of("simula.runtime.RTS_RTObject");
	public static final	ClassDesc RTS_ENVIRONMENT = ClassDesc.of("simula.runtime.RTS_ENVIRONMENT"); 
	public static final	ClassDesc RTS_BASICIO     = ClassDesc.of("simula.runtime.RTS_BASICIO");
	public static final	ClassDesc RTS_CLASS       = ClassDesc.of("simula.runtime.RTS_CLASS");  
	public static final	ClassDesc RTS_PROCEDURE   = ClassDesc.of("simula.runtime.RTS_PROCEDURE");
	
	public static final ClassDesc RTS_TXT         = ClassDesc.of("simula.runtime.RTS_TXT");
	public static final	ClassDesc RTS_ARRAY       = ClassDesc.of("simula.runtime.RTS_ARRAY");
	public static final ClassDesc RTS_BOUNDS      = ClassDesc.of("simula.runtime.RTS_RTObject$RTS_BOUNDS");
	public static final	ClassDesc RTS_LABEL       = ClassDesc.of("simula.runtime.RTS_RTObject$RTS_LABEL");
	public static final	ClassDesc RTS_NAME        = ClassDesc.of("simula.runtime.RTS_NAME"); 
	public static final	ClassDesc RTS_PRCQNT      = ClassDesc.of("simula.runtime.RTS_PRCQNT");

	public static final	ClassDesc JAVA_LANG_MATH  = ClassDesc.of("java.lang.Math");  
	
	public static ClassDesc RTS_RTObject(String id) {
		return(ClassDesc.of("simula.runtime.RTS_RTObject$"+id));
	}
	
	public static ClassDesc RTS_ARRAY(Type type) {
		return(RTS_RTObject(type.toJavaArrayType2()));
	}
	
}
