package simula.compiler.utilities;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Vector;

/**
 *
 * SEE: https://www.digitalocean.com/community/tutorials/java-classloader
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
			clazz = Global.simulaClassLoader.defineClass(name, bytes, 0, bytes.length);
			Global.simulaClassLoader.resolveClass(clazz);
			if(TESTING) System.out.println("SimulaClassLoader.loadClass: " + name + " SUCCESS");
		}
	}
	
	public void runClass(String name, final Vector<String> cmd) {
		String[] cmds = new String[cmd.size()];
		cmd.copyInto(cmds);
//		try {
			Class<?> clazz = Global.simulaClassLoader.findLoadedClass(name);
			Class<?> mainArgType[] = { (new String[0]).getClass() };
			Method main = null;
			try {
				main = clazz.getMethod("main", mainArgType);
			} catch (NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}
			Object[] arg = { cmds };
			
			if(TESTING) System.out.println("SimulaClassLoader.runClass: BEFORE INVOKE clazz = " + clazz);
			try {
				main.invoke(null, arg);
			} catch (IllegalAccessException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(TESTING) System.out.println("SimulaClassLoader.runClass: AFTER INVOKE clazz = " + clazz);
			
//			Thread thread =
//			Thread.ofVirtual().start(new Runnable(){
//				@Override
//				public void run() {
//					if(TESTING) System.out.println("SimulaClassLoader.runClass: BEFORE INVOKE clazz = " + clazz);
//					try {
//						main.invoke(null, arg);
//					} catch (Exception e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					if(TESTING) System.out.println("SimulaClassLoader.runClass: AFTER INVOKE clazz = " + clazz);
//				}});
//			if(TESTING) System.out.println("SimulaClassLoader.runClass: AFTER NEW THREAD clazz = " + clazz);
//			if(TESTING) System.out.println("SimulaClassLoader.runClass: NEW THREAD STATE = " + thread.getState());
//			while(thread.getState() != Thread.State.TERMINATED) {
//				Thread.sleep(10);
//				if(TESTING) System.out.println("SimulaClassLoader.runClass: NEW THREAD STATE = " + thread.getState());
//			}
//			if(TESTING) System.out.println("SimulaClassLoader.runClass: NEW THREAD FINAL STATE = " + thread.getState());
			

//		} catch(Exception e) {
//			e.printStackTrace();
////			throw new RTS_EndProgram("Simula - endProgram");
////			Util.IERR();
//		}
	}

}

