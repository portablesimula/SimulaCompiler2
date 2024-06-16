package simula.compiler.utilities;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Vector;

import simula.runtime.RTS_EndProgram;

/**
 * SimulaClassLoader.
 */
public class SimulaClassLoader extends ClassLoader {
	private final static boolean TESTING = false;
	
	/**
	 * Default Constructor.
	 */
	public SimulaClassLoader() {}
	
	public void loadClass(String name, byte[] bytes) {
		Class<?> clazz = Global.simulaClassLoader.findLoadedClass(name);
		if(clazz != null) {
			if(TESTING) System.out.println("SimulaClassLoader.loadClass: " + name + " FAILED: " + clazz);
//			Util.IERR();
		} else {
			if(TESTING) System.out.println("SimulaClassLoader.loadClass: TRY " + name);
			clazz = Global.simulaClassLoader.defineClass(name, bytes, 0, bytes.length);
			Global.simulaClassLoader.resolveClass(clazz);
			if(TESTING) System.out.println("SimulaClassLoader.loadClass: " + name + " SUCCESS");
		}
	}
	
	public void runClass(String name, final Vector<String> cmd) {
		
//		System.out.print("SimulaClassLoader.runClass: " + name);
//		for(String s:cmd) System.out.print(" "+s); System.out.println("");
		
		String[] cmds = new String[cmd.size()];
		cmd.copyInto(cmds);
		Class<?> clazz = Global.simulaClassLoader.findLoadedClass(name);
		
//		Method[] methods = clazz.getMethods();
//		for(Method method:methods) System.out.println(""+method);
		
		Class<?> argTypes[] = { (new String[0]).getClass() };
		Method main = null;
		try {
			main = clazz.getMethod("main", argTypes);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		Object[] arg = { cmds };
			
		if(TESTING) System.out.println("SimulaClassLoader.runClass: BEFORE INVOKE clazz = " + clazz);
		try {
			main.invoke(null, arg);
		} catch (IllegalAccessException e) {
			if(TESTING)	System.out.println("SimulaClassLoader.runClass: EXCEPTION-1 AFTER INVOKE clazz = " + clazz);
			Util.IERR();
		} catch (InvocationTargetException e) {
			Throwable cause = e.getCause();
			if(TESTING)	System.out.println("SimulaClassLoader.runClass: EXCEPTION-2 AFTER INVOKE cause = " + cause + ", clazz = " + clazz);
			if(cause instanceof RTS_EndProgram) ; // OK
			else if(cause instanceof RuntimeException err) throw err;
			else Util.IERR("SimulaClassLoader.runClass: EXCEPTION AFTER INVOKE cause = "+cause);
		}
		if(TESTING) System.out.println("SimulaClassLoader.runClass: AFTER INVOKE clazz = " + clazz);
	}

}

