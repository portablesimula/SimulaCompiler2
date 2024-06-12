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
	public static final ClassDesc RTS_BOUNDS      = ClassDesc.of("simula.runtime.RTS_BOUNDS");
	public static final	ClassDesc RTS_LABEL       = ClassDesc.of("simula.runtime.RTS_LABEL");
	public static final	ClassDesc RTS_NAME        = ClassDesc.of("simula.runtime.RTS_NAME"); 
	public static final	ClassDesc RTS_PRCQNT      = ClassDesc.of("simula.runtime.RTS_PRCQNT");
	
	

	public static final	ClassDesc FOR_List			= ClassDesc.of("simula.runtime.FOR_List");
	public static final	ClassDesc FOR_Element		= ClassDesc.of("simula.runtime.FOR_Element");
	public static final	ClassDesc FOR_SingleElt		= ClassDesc.of("simula.runtime.FOR_SingleElt");
	public static final	ClassDesc FOR_WhileElt		= ClassDesc.of("simula.runtime.FOR_WhileElt");
	public static final	ClassDesc FOR_StepUntil		= ClassDesc.of("simula.runtime.FOR_StepUntil");
	
	
	public static final	ClassDesc JAVA_LANG_MATH                = ClassDesc.of("java.lang.Math");  
	public static final	ClassDesc JAVA_LANG_THROWABLE           = ClassDesc.of("java.lang.Throwable");  
	public static final	ClassDesc JAVA_LANG_RUNTIME_EXCEPTION   = ClassDesc.of("java.lang.RuntimeException");
	public static final	ClassDesc JAVA_LANG_CLASSCAST_EXCEPTION = ClassDesc.of("java.lang.ClassCastException");
	public static final	ClassDesc JAVA_UTIL_ITERATOR            = ClassDesc.of("java.util.Iterator");
	
	public static ClassDesc RTS_ARRAY(Type type) {
		return(ClassDesc.of("simula.runtime."+type.getArrayType()));
	}
	
}
