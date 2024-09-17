package simula.compiler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.attribute.FileTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.Map.Entry;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;

import simula.compiler.syntaxClass.declaration.ClassDeclaration;
import simula.compiler.syntaxClass.statement.ProgramModule;
import simula.compiler.utilities.ClassHierarchy;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.SimulaClassLoader;
import simula.compiler.utilities.Util;

public class JarFileBuilder {
	
	/**
	 * The ProgramModule.
	 */
	private ProgramModule programModule;
	
	/**
	 * The output .jar file
	 */
	private File outputJarFile;
	
	/**
	 * Main entry name.
	 */
	private String mainEntry;

	/**
	 * The intermediate classFileMap.
	 */
	private final HashMap<String,byte[]> classFileMap;

	/**
	 * The target JarOutputStream.
	 */
	private JarOutputStream jarOutputStream;

	private final static boolean TESTING = false;
	
	/**
	 * Construct a new JarFileBuilder.
	 */
	public JarFileBuilder() {
		if(TESTING) System.out.println("\nNEW JarFileBuilder");
		this.classFileMap = new HashMap<String,byte[]>();
	}
	
	/**
	 * Open the JarFileBuilder.
	 * @param program the relevant ProgramModule
	 * @throws IOException if something went wrong
	 */
	public void open(final ProgramModule program) throws IOException {
		if(TESTING) System.out.println("JarFileBuilder.open: " + program);
		if(jarOutputStream != null) Util.IERR();
		this.programModule = program;
		if (Option.internal.TRACING)
			Util.println("BEGIN Create .jar File");
		outputJarFile = new File(Global.outputDir, program.getIdentifier() + ".jar");
		outputJarFile.getParentFile().mkdirs();
		Manifest manifest = new Manifest();
		mainEntry = Global.packetName + '/' + program.getIdentifier();
		mainEntry = mainEntry.replace('/', '.');
		if (Option.internal.TRACING)
			Util.println("Output " + outputJarFile + " MANIFEST'mainEntry=\"" + mainEntry + "\"");
		manifest.getMainAttributes().put(Attributes.Name.MANIFEST_VERSION, "1.0");
		manifest.getMainAttributes().putValue("Created-By", Global.simulaReleaseID + " (Portable Simula)");
		if (program.isExecutable()) {
			manifest.getMainAttributes().put(Attributes.Name.MAIN_CLASS, mainEntry);
		} else {
			String relativeAttributeFileName = program.getRelativeAttributeFileName();
			if (relativeAttributeFileName != null)
				manifest.getMainAttributes().putValue("SIMULA-INFO", relativeAttributeFileName);
		}
		jarOutputStream = new JarOutputStream(new FileOutputStream(outputJarFile), manifest);
		
		if(!Option.internal.CREATE_JAVA_SOURCE) {
			// Add initial entry: 
			String entryName = Global.packetName + '/';
			writeJarEntry(entryName, null);
		}
	}
	
	/**
	 * Put a JarEntry to the intermediate classFileMap.
	 * @param entryName the entry name
	 * @param bytes the bytes, may be null
	 */
	public void putMapEntry(String entryName, byte[] bytes) {
		if(TESTING)	System.out.println("JarOutputSet.putMapEntry: "+entryName);
		byte[] prev = classFileMap.put(entryName,bytes);
		if(prev != null) {
			if(Option.verbose)
				System.out.println("JarOutputSet.putMapEntry: "+entryName+" WAS REPLACED");
		}
	}
	
	/**
	 * Write a JarEntry to the JarOutputStream.
	 * @param entryName the entry name
	 * @param bytes the bytes, may be null
	 * @throws IOException if something went wrong
	 */
	public void writeJarEntry(String entryName, byte[] bytes) throws IOException {
		if(TESTING) System.out.println("JarFileBuilder.writeJarEntry: "+entryName);
		JarEntry entry = new JarEntry(entryName);
		jarOutputStream.putNextEntry(entry);
		if(bytes != null) jarOutputStream.write(bytes);
		jarOutputStream.closeEntry();
	}
	
	/**
	 * Close the JarFileBuilder by writing the .jar file.
	 * @return the outputJarFile
	 * @throws IOException if something went wrong
	 */
	public File close() throws IOException {
		// Write the actual .jar file
		if(TESTING) printClassFileMap("END JarFileBuilder.close");
        for (Entry<String, byte[]> entry : classFileMap.entrySet()) {
            String entryName = entry.getKey();
            byte[] bytes = entry.getValue();
            writeJarEntry(entryName, bytes);
        }
       
		if (programModule.isExecutable()) {
			if(TESTING) System.out.println("JarFileBuilder.close: Executable "+programModule);
			// Add the Runtime System
			File rtsHome = new File(Global.simulaRtsLib, "simula/runtime");
			add(false, rtsHome, Global.simulaRtsLib.toString().length());
		} else {
			String id = programModule.getIdentifier();
			String kind = (programModule.mainModule instanceof ClassDeclaration) ? "Class " : "Procedure ";
			Util.warning("No execution - Separate Compiled " + kind + id + " is written to: \"" + outputJarFile + "\"");
		}
        
        jarOutputStream.close();
		
		if(TESTING) {
			System.out.println("JarFileBuilder.close: ");
			listJarFile(outputJarFile);
		}

		if (Option.internal.TRACING)
			Util.println("END Create .jar File: " + outputJarFile);
//		if (Option.internal.DEBUGGING) {
//			Util.println(
//					"SimulaCompiler.createJarFile: BEGIN LIST GENERATED .jar FILE  ========================================================");
//			listJarFile(outputJarFile);
//			Util.println(
//					"SimulaCompiler.createJarFile: ENDOF LIST GENERATED .jar FILE  ========================================================");
//		}
		return (outputJarFile);
	}
	
	/**
	 * Add temp .class files to jarOutputStream.
	 * @throws IOException if something went wrong
	 */
	public void addTempClassFiles() throws IOException {
		if(!Option.internal.CREATE_JAVA_SOURCE) Util.IERR();
		// ADD TEMP .class FILES
		add(true, new File(Global.tempClassFileDir, Global.packetName), Global.tempClassFileDir.toString().length());
	}	
	
	/**
	 * Add directory or a file to a JarOutputStream, or
	 * Put it into the intermediate classFileMap.
	 * @param doPut true:put it, otherwise add it
	 * @param source source file or directory
	 * @param pathSize the path size
	 * @throws IOException if something went wrong
	 */
	private void add(final boolean doPut, final File source, final int pathSize) throws IOException {
		if(!source.exists())
			Util.IERR("SimulaCompiler.add: source="+source+", exists="+source.exists());
		if (source.isDirectory()) {
			String name = source.getPath().replace("\\", "/");
			if (!name.isEmpty()) {
				if (!name.endsWith("/")) name += "/";
				name = name.substring(pathSize);
				if (name.startsWith("/")) name = name.substring(1);
				if(doPut)
					 putMapEntry(name, null);
				else writeJarEntry(name, null);
			}
			for (File nestedFile : source.listFiles())
				add(doPut, nestedFile, pathSize);
			return;
		}
		String entryName = source.getPath().replace("\\", "/");
		if (!entryName.endsWith(".jasm")) {
			entryName = entryName.substring(pathSize);
			if (entryName.startsWith("/"))
				entryName = entryName.substring(1);
			if (Option.internal.TRACING && (!entryName.startsWith("simula/runtime")))
				Util.println("ADD-TO-JAR: "+entryName);

			try (InputStream inpt = new FileInputStream(source)) {
				byte[] bytes = inpt.readAllBytes();
				if(doPut)
					 putMapEntry(entryName, bytes);
				else writeJarEntry(entryName, bytes);
			}
		}
	}
	
	/**
	 * Expand .jar file entries into the classFileMap.
	 * @param jarFile the .jar file to read
	 * @throws IOException if something went wrong
	 */
	public void expandJarFile(final JarFile jarFile) throws IOException {
		if(TESTING) System.out.println("JarFileBuilder.expandJarFile: JarFileName="+jarFile.getName());
		if (Option.verbose)
			Util.println("---------  INCLUDE .jar File: " + jarFile.getName() + "  ---------");
		Enumeration<JarEntry> entries = jarFile.entries();
		LOOP: while (entries.hasMoreElements()) {
			JarEntry inputEntry = entries.nextElement();

			String entryName = inputEntry.getName();
			if (!entryName.startsWith(Global.packetName))	continue LOOP;
			if (!entryName.endsWith(".class"))				continue LOOP;

			InputStream inputStream = null;
			try {
				inputStream = jarFile.getInputStream(inputEntry);
				byte[] bytes = inputStream.readAllBytes();
				putMapEntry(entryName, bytes);
			} finally {	if (inputStream != null) inputStream.close(); }
		}
		if(TESTING) printClassFileMap("END JarFileBuilder.expandJarFile");
	}
	
	private void printClassFileMap(String title) {
		System.out.println("============================== printClassFileMap: "+title+" ==============================");
        for (Entry<String, byte[]> entry : classFileMap.entrySet()) {
            String entryName = entry.getKey();
            byte[] bytes = entry.getValue();
            System.out.println("JarFileBuilder.printClassFileMap: "+entryName+"   Size="+((bytes==null)?0:bytes.length));
        }		
		System.out.println("END ========================== printClassFileMap: "+title+" ==============================");
	}


	/**
	 * Find the .jar file containing an external class or procedure.
	 * @param identifier class or procedure identifier
	 * @param externalIdentifier the external identifier if any
	 * @return the resulting File
	 */
	public static File findJarFile(final String identifier, final String externalIdentifier) {
		File jarFile = null;
		try {
			if (externalIdentifier == null || externalIdentifier.length() == 0) {
				// If present search extLib
				if (Global.extLib != null) {
					jarFile = new File(Global.extLib, identifier + ".jar");
//					System.out.println("JarFileBuilder.findJarFile(1) "+jarFile);
					if (jarFile.exists())
						return (jarFile);
				}
				jarFile = new File(Global.outputDir, identifier + ".jar");
//				System.out.println("JarFileBuilder.findJarFile(2) "+jarFile);
				if (jarFile.exists())
					return (jarFile);
			} else {
				jarFile = new File(externalIdentifier);
				if (jarFile.exists())
					return (jarFile);
			}
		} catch (Exception e) {
			Util.IERR("Can't find attribute file: " + jarFile, e);
		}
		Util.error("Can't find attribute file: " + identifier + '[' + externalIdentifier + ']');
		return (null);
	}

	/**
	 * Add the jarFile to the includeQueue.
	 * @param jarFile
	 * @throws IOException if something went wrong
	 */
	public static void addToIncludeQueue(final JarFile jarFile) throws IOException {
		if(Global.includeQueue == null) Global.includeQueue = new LinkedList<JarFile>();
		Global.includeQueue.add(jarFile);			
	}

	public void addIncludeQueue() throws IOException {
//		System.out.println("JarFileBuilder.loadIncludeQueue: "+Global.includeQueue);
		if(Global.includeQueue != null) {
			for(JarFile jarFile:Global.includeQueue) {
				if(TESTING)
					System.out.println("JarFileBuilder.addIncludeQueue: expandJarFile: "+jarFile.getName());
				expandJarFile(jarFile);	
//				jarFile.close();
			}
		}
	}

	public static void loadIncludeQueue() throws IOException {
//		System.out.println("JarFileBuilder.loadIncludeQueue: "+Global.includeQueue);
		if(Global.includeQueue != null) {
			for(JarFile jarFile:Global.includeQueue) {
				if(TESTING)
					System.out.println("JarFileBuilder.loadIncludeQueue: loadJarEntries: "+jarFile.getName());
				loadJarEntries(jarFile, Global.simulaClassLoader);	
//				jarFile.close();
			}
		}
	}
	
	/**
	 * Expand .jar file entries into the target SimulaClassLoader.
	 * @param jarFile the .jar file
	 * @param destDir the output directory
	 * @throws IOException if something went wrong
	 */
	private static void loadJarEntries(final JarFile jarFile, final SimulaClassLoader loader) throws IOException {
		if(TESTING) System.out.println("JarFileBuilder.loadJarEntries: JarFileName="+jarFile.getName());
		if (Option.verbose)
			Util.println("---------  INCLUDE .jar File: " + jarFile.getName() + "  ---------");
		Enumeration<JarEntry> entries = jarFile.entries();
		Map<String,InputStream> delayedLoadings = null;

		LOOP: while (entries.hasMoreElements()) {
			JarEntry inputEntry = entries.nextElement();

			String entryName = inputEntry.getName();
			if (!entryName.startsWith(Global.packetName))	continue LOOP;
			if (!entryName.endsWith(".class"))				continue LOOP;

			InputStream inputStream = null;
			try {
				inputStream = jarFile.getInputStream(inputEntry);
				String name = entryName.substring(0, entryName.length() - 6).replace('/', '.');

				String supClassName = ClassHierarchy.getRealPrefix(name);
				boolean readyToLoad = true;
				if(supClassName != null) {
					boolean prefixLoaded = loader.isClassLoaded(supClassName);
					if(TESTING) System.out.println("JarFileBuilder.loadJarEntries: supClassName="+supClassName+", prefixLoaded="+prefixLoaded);
					if(! prefixLoaded) {
						readyToLoad = false;
						if(delayedLoadings == null) delayedLoadings = new HashMap<String,InputStream>();
						delayedLoadings.put(name, inputStream);
						inputStream = null;
					}
				}
				if(readyToLoad) {
					byte[] bytes = inputStream.readAllBytes();
					loader.loadClass(name, bytes, jarFile.getName());
				}

			} finally {	if (inputStream != null) inputStream.close(); }
		}

		int NNN = 4000;
		while(delayedLoadings != null) {
			if(--NNN < 0) Util.IERR();
//			if(TESTING)
				System.out.println("\nJarFileBuilder.loadJarEntries: delayedLoadings +++++++++++++++++++");
			Vector<String> loaded = new Vector<String>();

			for (Entry<String, InputStream> entry : delayedLoadings.entrySet()) {
				String name = entry.getKey();
				InputStream inputStream = entry.getValue();
				String supClassName = ClassHierarchy.getRealPrefix(name);
//				if(TESTING)
					System.out.println("JarFileBuilder.loadJarEntries: Check Class: "+name+" extends "+supClassName);
				boolean readyToLoad = true;
				if(supClassName != null) {
					boolean prefixLoaded = loader.isClassLoaded(supClassName);
					if(! prefixLoaded) readyToLoad = false;
				}
				if(readyToLoad) {
					try {
//						if(TESTING)
							System.out.println("JarFileBuilder.loadJarEntries: Load Class: "+name);
						byte[] bytes = inputStream.readAllBytes();
						loader.loadClass(name, bytes, jarFile.getName());
						loaded.add(name);
					} finally {	if (inputStream != null) inputStream.close(); }
				}
			}

			if(loaded.size() == 0) Util.IERR();
			for(String name:loaded) {
//				if(TESTING)
					System.out.println("JarFileBuilder.loadJarEntries: Remove: "+name);
				delayedLoadings.remove(name);
				if(delayedLoadings.size() == 0) delayedLoadings = null;
			}
			//			Util.IERR();
		}
		//		if (Option.verbose)
		//			Util.println("---------  END INCLUDE .jar File, " + (jarEntryNames.size()) + " Entries Added  ---------");
	}

	
	// ***************************************************************
	// *** LIST .jar file
	// ***************************************************************
	/**
	 * List .jar file
	 * @param file the .jar file
	 */
	public static void listJarFile(final File file) {
		Util.println("---------  LIST .jar File: " + file + "  ---------");
		if (!(file.exists() && file.canRead())) {
			Util.error("Can't read .jar file: " + file);
			return;
		}
		JarFile jarFile = null;
		try {
			jarFile = new JarFile(file);
			Manifest manifest = jarFile.getManifest();
			Attributes mainAttributes = manifest.getMainAttributes();
			Set<Object> keys = mainAttributes.keySet();
			for (Object key : keys) {
				String val = mainAttributes.getValue(key.toString());
				Util.println(key.toString() + "=\"" + val + "\"");
			}

			Enumeration<JarEntry> entries = jarFile.entries();
			while (entries.hasMoreElements()) {
				JarEntry entry = entries.nextElement();
				String size = "" + entry.getSize();
				while (size.length() < 6)
					size = " " + size;
				FileTime fileTime = entry.getLastModifiedTime();
				String date = DateTimeFormatter.ofPattern("uuuu-MMM-dd HH:mm:ss", Locale.getDefault())
						.withZone(ZoneId.systemDefault()).format(fileTime.toInstant());
				Util.println("Jar-Entry: " + size + "  " + date + "  \"" + entry + "\"");
			}
		} catch (IOException e) {
			Util.IERR("Caused by:", e);
		} finally {
			if (jarFile != null)
				try {
					jarFile.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}


}
