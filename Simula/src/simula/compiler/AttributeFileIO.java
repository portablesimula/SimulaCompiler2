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
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.zip.ZipEntry;

import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.declaration.BlockDeclaration;
import simula.compiler.syntaxClass.declaration.ClassDeclaration;
import simula.compiler.syntaxClass.declaration.Declaration;
import simula.compiler.syntaxClass.declaration.ExternalDeclaration;
import simula.compiler.syntaxClass.declaration.ProcedureDeclaration;
import simula.compiler.syntaxClass.statement.ProgramModule;
import simula.compiler.utilities.ClassHierarchy;
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
	static void writeAttributeFile(final ProgramModule program) throws IOException {
		String relativeAttributeFileName = program.getRelativeAttributeFileName();
		if (relativeAttributeFileName == null) return;
		File file = new File(Global.tempClassFileDir,relativeAttributeFileName);
		if (Option.verbose)
			Util.println("*** BEGIN Generate SimulaAttributeFile: \"" + file+"\"");
		byte[] bytes = buildAttrFile(program);
		String entryName = program.getRelativeAttributeFileName();

//		if(Option.internal.USE_SimulaClassLoader && Global.simulaClassLoader != null) {
		if(Option.internal.USE_SimulaClassLoader) {
			if(Global.jarFileBuilder!=null) {
				Global.jarFileBuilder.addJarEntry(entryName, bytes);
			}
			else Util.IERR();
			
		} else {
			Global.jarFileBuilder.addJarEntry(entryName, bytes);
		}
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

		if(Option.internal.TESTING_PRECOMP) {
			ClassHierarchy.writeObject(oupt);
		}

		// Write External Head
		if(program.externalHead != null) {
			for(ExternalDeclaration xdecl:program.externalHead) {
				oupt.writeObj(xdecl);
			}
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
			if(zipEntry == null)
				Util.IERR("No Attribute File found in "+file);

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
					System.out.println("***       Read External " + ObjectKind.edit(module.declarationKind) + ' ' + module.identifier
							+ '[' + module.externalIdent + ']' +"  ==>  "+declarationList.identifier);
			}
//    		if(!Option.internal.USE_SimulaClassLoader) {
    			JarFileBuilder.addToIncludeQueue(jarFile);
//    			JarFileBuilder.loadJarEntries(jarFile, Global.simulaClassLoader);	
//    		}
    			
//        	if(Option.internal.USE_SimulaClassLoader) {
//        		JarFileBuilder.addToIncludeQueue(jarFile);
////        		JarFileBuilder.loadJarEntries(jarFile, Global.simulaClassLoader);	
//        	} else {
//        		Global.jarFileBuilder.addJarEntries(jarFile);
//        		Util.IERR();
//        	}
    			
		} catch (IOException e) {
			Util.error("Unable to read Attribute File: " + file + " caused by: " + e);
			Util.warning("It may be necessary to recompile '" + identifier + "'");
			Util.IERR("Caused by:", e);
		}
		return (moduleType);
	}
	
	private static BlockDeclaration buildSyntaxTree(String fileID,byte[] attrFile) throws IOException {
//		System.out.println("AttributeFileIO.buildSyntaxTree: size="+attrFile.length+", File="+fileID);
		AttributeInputStream inpt = new AttributeInputStream(new ByteArrayInputStream(attrFile), fileID);

		String vers = inpt.readString();
		if(!(vers.equals(version))) Util.error("Malformed SimulaAttributeFile: " + fileID);


		if(Option.internal.TESTING_PRECOMP) {
			ClassHierarchy.readObject(inpt);
		}

		// Read External Head ?
		int declarationKind = inpt.readKind();
		while(declarationKind == ObjectKind.ExternalDeclaration) {
			ExternalDeclaration xdecl = ExternalDeclaration.readObject(inpt);
			xdecl.readExternal();
			declarationKind = inpt.readKind();
		}
		
		BlockDeclaration module=null;
		if(declarationKind == ObjectKind.Procedure)  module = ProcedureDeclaration.readObject(inpt);
		else if(declarationKind == ObjectKind.Class) module = ClassDeclaration.readObject(inpt);
		else Util.IERR();
		inpt.close();
		if (Option.verbose)	Util.TRACE("*** ENDOF Read SimulaAttributeFile: " + fileID);
		
//		System.out.println("AttributeFileIO.buildSyntaxTree: =========== Resulting ObjectReference Map ================");
//		inpt.objectReference.print();

		module.isPreCompiledFromFile = fileID;
		return module;
	}

}
