/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.zip.ZipEntry;

import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.declaration.BlockDeclaration;
import simula.compiler.syntaxClass.declaration.ClassDeclaration;
import simula.compiler.syntaxClass.declaration.Declaration;
import simula.compiler.syntaxClass.declaration.ExternalDeclaration;
import simula.compiler.syntaxClass.declaration.ProcedureDeclaration;
import simula.compiler.syntaxClass.declaration.StandardClass;
import simula.compiler.syntaxClass.statement.ProgramModule;
import simula.compiler.utilities.DeclarationList;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * Simula attribute file input/output.
 * <p>
 * Link to GitHub: <a href="https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/AttributeFileIO.java"><b>Source File</b></a>.
 * 
 * @author Øystein Myhre Andersen
 *
 */
public final class AttributeFileIO {
	/**
	 * The Simula version.
	 */
	private final static String version="SimulaAttributeFile: Version 2.0";

	/**
	 * The attribute file.
	 */
//	final File attributeFile;
	
	/**
	 * Create a new AttributeFileIO.
	 * @param aFile the attributeFile 
	 */
	private AttributeFileIO(final File aFile) {
//		this.attributeFile = aFile;
	}

	/**
	 * Write an attribute file.
	 * @param program the program module
	 * @throws IOException if an output operation fail
	 */
	static void write(final ProgramModule program) throws IOException {
		String relativeAttributeFileName = program.getRelativeAttributeFileName();
		if (relativeAttributeFileName == null) return;
		File file = new File(Global.tempClassFileDir,relativeAttributeFileName);
		if (Option.verbose)
			Util.println("*** BEGIN Generate SimulaAttributeFile: \"" + file+"\"");
		//AttributeFileIO attributeFile = new AttributeFileIO(file);
		//attributeFile.XXXwrite((BlockDeclaration) program.module,file);
		/**
		 * Write a module's attribute file.
		 * @param module the module
		 * @throws IOException if an io-error occurs
		 */
		//private void XXXwrite(final BlockDeclaration module,final File attributeFile) throws IOException {
			File attributeDir = new File(Global.tempClassFileDir,Global.packetName);
			attributeDir.mkdirs();
			file.createNewFile();
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			byte[] bytes = buildAttrFile(program);
			fileOutputStream.write(bytes);
			fileOutputStream.flush();
			fileOutputStream.close();
		//}
		if (Option.verbose)	Util.TRACE("*** ENDOF Generate SimulaAttributeFile: " + file);
	}

	/**
	 * Build a module's attribute file.
	 * @param module the module
	 * @throws IOException if an io-error occurs
	 */
	private static byte[] buildAttrFile(final ProgramModule program) throws IOException {
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		AttributeOutputStream oupt = new AttributeOutputStream(byteArrayOutputStream);
		// writeVersion:
		oupt.writeString(version);
//		System.out.println("AttributeFileIO.write: Option.NEW_ATTR_FILE="+Option.NEW_ATTR_FILE);
//		System.out.println("AttributeFileIO.write: "+module);
		
		// Write External Head
		if(program.externalHead != null) {
			for(ExternalDeclaration xdecl:program.externalHead) {
				oupt.writeObj(xdecl);
			}
//			Util.IERR();
		}
		
		if(program.module instanceof ProcedureDeclaration pro)  pro.writeObject(oupt);
		else if(program.module instanceof ClassDeclaration cls) cls.writeObject(oupt);
		else Util.IERR();
		oupt.close();
		return(byteArrayOutputStream.toByteArray());
	}

	
	/**
	 * Read an attribute file.
	 * @param identifier class or procedure identifier
	 * @param file the .jar file to read
	 * @param enclosure the declaration list to update
	 * @return the module type
	 */
	public static Type readAttributeFile(final String identifier, final File file, final BlockDeclaration enclosure) {
		Type moduleType = null;
		Util.warning("Separate Compiled Module is read from: \"" + file + "\"");
		if (!(file.exists() && file.canRead())) {
			Util.error("Can't read attribute file: " + file);
			return (null);
		}
		try {
			JarFile jarFile = new JarFile(file);
			Global.externalJarFiles.add(file);
			Manifest manifest = jarFile.getManifest();
			Attributes mainAttributes = manifest.getMainAttributes();
			String simulaInfo = mainAttributes.getValue("SIMULA-INFO");
			ZipEntry zipEntry = jarFile.getEntry(simulaInfo);

			DeclarationList declarationList=enclosure.declarationList;
			if (Option.verbose)	Util.TRACE("*** BEGIN Read SimulaAttributeFile: " + file);

			InputStream inputStream = jarFile.getInputStream(zipEntry);
			byte[] bytes = inputStream.readAllBytes(); inputStream.close();
			BlockDeclaration module = AttributeFileIO.buildSyntaxTree(file.toString(),bytes);
			moduleType = module.type;

			Declaration d=declarationList.find(module.identifier);
			if(d!=null) {
				Util.warning("Multiple declarations with the same name: "+module+" and "+d);
			} else {
				declarationList.add(module);
				if (Option.verbose)
					System.out.println("***       Read External " + module.declarationKind + ' ' + module.identifier + '[' + module.externalIdent + ']'
							+"  ==>  "+declarationList.identifier);
			}
			File destDir = Global.tempClassFileDir;
			expandJarEntries(jarFile, destDir);
			jarFile.close();
//			Global.externalJarFiles.add(file);
		} catch (IOException e) {
			Util.error("Unable to read Attribute File: " + file + " caused by: " + e);
			Util.warning("It may be necessary to recompile '" + identifier + "'");
			Util.IERR("Caused by:", e);
		}
//		System.out.println("ExternalDeclaration.readAttributeFile: END "+moduleType);
		return (moduleType);
	}

	/**
	 * Expand .jar file entries into the given directory.
	 * @param jarFile the .jar file
	 * @param destDir the output directory
	 * @throws IOException if something went wrong
	 */
	private static void expandJarEntries(final JarFile jarFile, final File destDir) throws IOException {
		if (Option.verbose)
			Util.println("---------  EXPAND .jar File: " + jarFile.getName() + "  ---------");
		new File(destDir, Global.packetName).mkdirs(); // Create directories
		Enumeration<JarEntry> entries = jarFile.entries();
		int nEntriesAdded = 0;
		LOOP: while (entries.hasMoreElements()) {
			JarEntry entry = entries.nextElement();

			String name = entry.getName();
			if (!name.startsWith(Global.packetName))
				continue LOOP;
			if (!name.endsWith(".class"))
				continue LOOP;

			InputStream inputStream = null;
			OutputStream outputStream = null;
			try {
				inputStream = jarFile.getInputStream(entry);
				File destFile = new File(destDir, entry.getName());
				// System.out.println("ExternalDeclaration.expandJarEntries: "+destFile);
				outputStream = new FileOutputStream(destFile);
				byte[] buffer = new byte[4096];
				int bytesRead = 0;
				while ((bytesRead = inputStream.read(buffer)) != -1) {
					outputStream.write(buffer, 0, bytesRead);
				}
				nEntriesAdded++;
			} finally {
				if (inputStream != null)
					inputStream.close();
				if (outputStream != null) {
					outputStream.flush();
					outputStream.close();
				}
			}
		}
		if (Option.verbose)
			Util.println("---------  END EXPAND .jar File, " + nEntriesAdded + " Entries Added  ---------");
	}

	public static BlockDeclaration buildSyntaxTree(String fileID,byte[] attrFile) throws IOException {
//		System.out.println("AttributeFileIO.buildSyntaxTree: size="+attrFile.length+", File="+fileID);
		AttributeInputStream inpt = new AttributeInputStream(new ByteArrayInputStream(attrFile));

		String vers = inpt.readString();
		if(!(vers.equals(version))) Util.error("Malformed SimulaAttributeFile: " + fileID);
		
		// Read External Head ?
		int declarationKind = inpt.readKind();
		while(declarationKind == ObjectKind.ExternalDeclaration) {
//			ExternalDeclaration xdecl = (ExternalDeclaration) inpt.readObj();
			ExternalDeclaration xdecl = ExternalDeclaration.readObject(inpt);
			xdecl.readExternal();
//			Util.IERR(""+xdecl);
			declarationKind = inpt.readKind();
		}
		
		BlockDeclaration module=null;
//		int declarationKind = inpt.readKind();
		if(declarationKind == ObjectKind.Procedure)  module = ProcedureDeclaration.readObject(inpt);
		else if(declarationKind == ObjectKind.Class) module = ClassDeclaration.readObject(inpt);
		else Util.IERR();
		inpt.close();
		if (Option.verbose)	Util.TRACE("*** ENDOF Read SimulaAttributeFile: " + fileID);

		module.isPreCompiledFromFile = fileID;
		return module;
	}
	  
	/**
	 * List an attribute file.
	 * @param aFile the attributeFile
	 * @throws IOException if an io-error occurs
	 */
	private void listAttributeFile(final File aFile) throws IOException {
		if (Option.verbose)	Util.TRACE("*** BEGIN Read SimulaAttributeFile: " + aFile);
		FileInputStream fileInputStream = new FileInputStream(aFile);
		AttributeInputStream inpt = new AttributeInputStream(fileInputStream);
		String vers = inpt.readString();
		if(!(vers.equals(version))) Util.error("Malformed SimulaAttributeFile: " + aFile);
		BlockDeclaration blockDeclaration=(BlockDeclaration)inpt.readObj();
		inpt.close();
		if (Option.verbose) {
			if (Option.TRACE_ATTRIBUTE_INPUT) {
				Util.TRACE("*** ENDOF Read SimulaAttributeFile: " + aFile);
				blockDeclaration.print(0);
			}
		}
	}	

}
