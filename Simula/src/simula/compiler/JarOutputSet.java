package simula.compiler;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;

public class JarOutputSet {
//	private final JarOutputStream jarOutputStream;
//	private final HashMap<String,byte[]> classFileMap;
//	
//	private final static boolean TESTING = false;
//	
//	public JarOutputSet(OutputStream oupt, Manifest manifest) throws IOException {
//		this.jarOutputStream = new JarOutputStream(oupt, manifest);
//		this.classFileMap = new HashMap<String,byte[]>();
//	}
//	
//	/**
//	 * Add a JarEntry to the JarOutputSet.
//	 * @param entryName the entry name
//	 * @param bytes the bytes, may be null
//	 * @throws IOException if something went wrong
//	 */
//	public void putJarEntry(String entryName, byte[] bytes) throws IOException {
//		if(TESTING) System.out.println("JarOutputSet.addJarEntry: "+entryName);
//		byte[] prev = classFileMap.put(entryName,bytes);
//		if(prev != null) {
//			System.out.println("JarOutputSet.addJarEntry: "+entryName+" WAS REPLACED");
//		}
//	}
//
//	public void close() throws IOException {
//        for (Entry<String, byte[]> entry : classFileMap.entrySet()) {
//            String entryName = entry.getKey();
//            byte[] bytes = entry.getValue();
////            System.out.println("JarOutputSet.close: Write "+entryName);
//			JarEntry jarEntry = new JarEntry(entryName);
//			jarOutputStream.putNextEntry(jarEntry);
//			if(bytes != null) jarOutputStream.write(bytes);
//			jarOutputStream.closeEntry();
//        }
//        jarOutputStream.close();
//	}

}
