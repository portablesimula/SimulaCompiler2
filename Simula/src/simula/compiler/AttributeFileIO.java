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

import simula.compiler.syntaxClass.Type;
import simula.compiler.syntaxClass.declaration.BlockDeclaration;
import simula.compiler.syntaxClass.declaration.ClassDeclaration;
import simula.compiler.syntaxClass.declaration.Declaration;
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
	final File attributeFile;
	
	/**
	 * Create a new AttributeFileIO.
	 * @param aFile the attributeFile 
	 */
	private AttributeFileIO(final File aFile) {
		this.attributeFile = aFile;
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
		AttributeFileIO attributeFile = new AttributeFileIO(file);
		attributeFile.write((BlockDeclaration) program.module);
//		if (Option.TRACE_ATTRIBUTE_OUTPUT) {
//			try { attributeFile.listAttributeFile(file);
//			} catch (ClassNotFoundException e) {
//				Util.IERR("Unable to list Attribute File: "+file, e);
//			}
//		}
		if (Option.verbose)	Util.TRACE("*** ENDOF Generate SimulaAttributeFile: " + file);
	}

	/**
	 * Read an attribute file.
	 * @param inputStream argument
	 * @param file argument
	 * @param declarationList argument
	 * @return the module type
	 * @throws IOException if an input operation fail
	 */
	public static Type readAttributeFile(final InputStream inputStream,final File file,
            final BlockDeclaration enclosure) throws IOException {
//		System.out.println("AttributeFileIO.readAttributeFile: enclosure="+enclosure.getClass().getSimpleName()+"  "+enclosure);
//		DeclarationScope.printScopeChain(Global.getCurrentScope());  // TODO: TESTING3
//		Util.IERR("");;
		DeclarationList declarationList=enclosure.declarationList;
		AttributeFileIO attributeFile = new AttributeFileIO(file);
		if (Option.verbose)	Util.TRACE("*** BEGIN Read SimulaAttributeFile: " + file);
		
//		ObjectInputStream inpt = new ObjectInputStream(inputStream);
		byte[] attrFile = inputStream.readAllBytes();
		System.out.println("AttributeFileIO.readAttributeFile: size="+attrFile.length+", File="+file);
		AttrInput inpt = new AttrInput(new ByteArrayInputStream(attrFile));
		
		String vers = inpt.readString();
		if(!(vers.equals(version))) Util.error("Malformed SimulaAttributeFile: " + attributeFile);
		Type moduleType=null;
//		System.out.println("AttributeFileIO.read: ");
		BlockDeclaration module=null;
//		Boolean isClass = inpt.readBoolean();
		int declarationKind = inpt.readKind();
		if(declarationKind == ObjectKind.Class)
			 module = ClassDeclaration.readAttr(inpt);
		else if(declarationKind == ObjectKind.Procedure)
			module = ProcedureDeclaration.readAttr(inpt);
		else Util.IERR("IMPOSSIBLE");
			
		module.isPreCompiled = true;
		Declaration d=declarationList.find(module.identifier);
		if(d!=null) {
			Util.warning("Multiple declarations with the same name: "+module+" and "+d);
		} else {
//			System.out.println("AttributeFileIO.readAttributeFile: Add Module: "+module.getClass().getSimpleName()+"  "+module+"  ===>  "+enclosure.identifier);
//			enclosure.printTree(1);
			declarationList.add(module);
//			enclosure.printTree(1);

			moduleType=module.type;
			if (Option.verbose)
				System.out.println("***       Read External " + module.declarationKind + ' ' + module.identifier + '[' + module.externalIdent + ']'
						+"  ==>  "+declarationList.identifier);
			if (Option.TRACE_ATTRIBUTE_INPUT) {
//				System.out.println("\nAttributeFileIO.readAttributeFile: BEGIN Module.print:");
				module.print(0);
//				System.out.println("AttributeFileIO.readAttributeFile: ENDOF Module.print:");
			}
		}
//		Util.IERR("");
		inpt.close();
		if (Option.verbose)	Util.TRACE("*** ENDOF Read SimulaAttributeFile: " + file);
		
		
//		DeclarationScope.printScopeChain(Global.getCurrentScope());  // TODO: TESTING3
//		Util.IERR("");;
		return(moduleType);
	}	

	/**
	 * Write a module's attribute file.
	 * @param module the module
	 * @throws IOException if an io-error occurs
	 */
	private void write(final BlockDeclaration module) throws IOException {
		File attributeDir = new File(Global.tempClassFileDir,Global.packetName);
		attributeDir.mkdirs();
		attributeFile.createNewFile();
		FileOutputStream fileOutputStream = new FileOutputStream(attributeFile);
		byte[] attrFile = buildAttrFile(module);
		fileOutputStream.write(attrFile);
		fileOutputStream.flush();
		fileOutputStream.close();
	}

	/**
	 * Build a module's attribute file.
	 * @param module the module
	 * @throws IOException if an io-error occurs
	 */
	private byte[] buildAttrFile(final BlockDeclaration module) throws IOException {
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		AttrOutput oupt = new AttrOutput(byteArrayOutputStream);
		// writeVersion:
		oupt.writeString(version);
//		System.out.println("AttributeFileIO.write: Option.NEW_ATTR_FILE="+Option.NEW_ATTR_FILE);
//			System.out.println("AttributeFileIO.write: "+module);
			if(module instanceof ProcedureDeclaration pro)  pro.writeAttr(oupt);
			else if(module instanceof ClassDeclaration cls) cls.writeAttr(oupt);
			else Util.IERR("");
		oupt.flush(); oupt.close();
		return(byteArrayOutputStream.toByteArray());
	}
	  
	/**
	 * List an attribute file.
	 * @param aFile the attributeFile
	 * @throws IOException if an io-error occurs
	 */
	private void listAttributeFile(final File aFile) throws IOException {
		if (Option.verbose)	Util.TRACE("*** BEGIN Read SimulaAttributeFile: " + aFile);
		FileInputStream fileInputStream = new FileInputStream(aFile);
		ObjectInputStream inpt = new ObjectInputStream(fileInputStream);
		String vers = inpt.readString();
		if(!(vers.equals(version))) Util.error("Malformed SimulaAttributeFile: " + aFile);
		BlockDeclaration blockDeclaration=(BlockDeclaration)inpt.readObject();
		inpt.close();
		if (Option.verbose) {
			if (Option.TRACE_ATTRIBUTE_INPUT) {
				Util.TRACE("*** ENDOF Read SimulaAttributeFile: " + aFile);
				blockDeclaration.print(0);
			}
		}
	}	

}
