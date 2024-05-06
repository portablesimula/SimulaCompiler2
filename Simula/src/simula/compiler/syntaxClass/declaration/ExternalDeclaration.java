/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass.declaration;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Vector;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.zip.ZipEntry;

import simula.compiler.AttributeFileIO;
import simula.compiler.AttributeInputStream;
import simula.compiler.AttributeOutputStream;
import simula.compiler.JarFileIO;
import simula.compiler.parsing.Parse;
import simula.compiler.syntaxClass.Type;
import simula.compiler.utilities.DeclarationList;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.KeyWord;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Token;
import simula.compiler.utilities.Util;

/**
 * External Declaration.
 * <pre>
 * Simula Standard: 6.1 External declarations
 * 
 *   external-head = external-declaration ; { external-declaration ; }
 *   
 *   external-declaration
 *      = external-procedure-declaration | external-class-declaration
 * </pre>
 * An external declaration is a substitute for a complete introduction of the
 * corresponding source module referred to, including its external head. In the
 * case where multiple but identical external declarations occur as a
 * consequence of this rule, this declaration will be incorporated only once.
 *
 * 
 * External Class Declaration
 * 
 * <pre>
 *    external-class-declaration
 *        =  EXTERNAL  CLASS  external-list
 * </pre>
 * 
 * An implementation may restrict the number of block levels at which an
 * external class declaration may occur.
 * <p>
 * Note: As a consequence of 5.5.1 all classes belonging to the prefix chain of
 * a separately compiled class must be declared in the same block as this class.
 * However, this need not be done explicitly; an external declaration of a
 * separately compiled class implicitly declares all classes in its prefix chain
 * (since these will be declared in the external head of the class in question).
 * 
 * 
 * 
 * 
 * External procedure declaration
 * 
 * <pre>
 * 
 * external-procedure-declaration
 *         = EXTERNAL [ kind ] [ type ] PROCEDURE external-list
 *         | EXTERNAL kind PROCEDURE external-item  IS procedure-declaration
 *         
 *    external-list = external-item { , external-item }
 * 	  external-item = identifier [ "=" external-identification ]
 * 
 *		 kind  =  identifier  // E.g. FORTRAN, JAVA, ...
 *		 external-identification = string   // E.g  a file-name
 * 
 * </pre>
 * <p>
 * The kind of an external procedure declaration may indicate the source
 * language in which the separately compiled procedure is written (e.g assembly,
 * Cobol, Fortran, PL1 etc.). The kind must be empty if this language is Simula.
 * The interpretation of kind (if given) is implementation-dependent.
 * <p>
 * If an external procedure declaration contains a procedure specification, the
 * procedure body of the procedure declaration must be empty. This specifies a
 * procedure whose actual body, which embodies the algorithm required, is
 * supplied in a separate (non-Simula) module. The procedure heading of the
 * procedure declaration will determine the procedure identifier (function
 * designator) to be used within the source module in which the external
 * declaration occurs, as well as the type, order, and transmission mode of the
 * parameters.
 * <p>
 * A non-Simula procedure cannot be used as an actual parameter corresponding to
 * a formal procedure.
 * <p> 
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/declaration/ExternalDeclaration.java">
 * <b>Source File</b></a>.
 * 
 * @author SIMULA Standards Group
 * @author Øystein Myhre Andersen
 */
public final class ExternalDeclaration extends Declaration {
	
	/**
	 * Create a new ExternalDeclaration.
	 */
	private ExternalDeclaration(String identifier,String extIdentitier) {
		super(identifier);
		this.declarationKind = ObjectKind.ExternalDeclaration;
		this.externalIdent = extIdentitier;
	}
	private ExternalDeclaration() {
		super(null);
		this.declarationKind = ObjectKind.ExternalDeclaration;
	}

	/**
	 * Parse an external declaration updating a declaration list.
	 * <pre>
	 *    external-head = external-declaration ; { external-declaration ; }
	 *       external-class-declaration
	 *            =  EXTERNAL  CLASS  external-list
	 *        
	 *       external-procedure-declaration
	 *            = EXTERNAL [ kind ] [ type ] PROCEDURE external-list
	 *            | EXTERNAL kind PROCEDURE external-item  IS procedure-declaration
	 * </pre>
	 * Precondition: EXTERNAL  is already read.
	 * @param declarationList the declaration list which is updated
	 */
	public static Vector<ExternalDeclaration> expectExternalHead(final BlockDeclaration enclosure) {
		String kind = Parse.acceptIdentifier();
		if (kind != null)
			Util.IERR("*** NOT IMPLEMENTED: " + "External " + kind + " Procedure");
		Type expectedType = Parse.acceptType();
		if (!(Parse.accept(KeyWord.CLASS) || Parse.accept(KeyWord.PROCEDURE)))
			Util.error("parseExternalDeclaration: Expecting CLASS or PROCEDURE");

		Vector<ExternalDeclaration> externalDeclarations = new Vector<ExternalDeclaration>();
		String identifier = Parse.expectIdentifier();
		LOOP: while (true) {
			Token externalIdentifier = null;
			if (Parse.accept(KeyWord.EQ)) {
				externalIdentifier = Parse.currentToken;
				Parse.expect(KeyWord.TEXTKONST);
			}
//			System.out.println("expectExternalHead: "+identifier+"  "+externalIdentifier); // TODO: TESTING3
//			Util.IERR("");
			
			String extIdentitier = (externalIdentifier==null)?null:externalIdentifier.getIdentifier();
			
			ExternalDeclaration externalDeclaration = new ExternalDeclaration(identifier,extIdentitier);
			externalDeclarations.add(externalDeclaration);
			
			File jarFile = JarFileIO.findJarFile(identifier, extIdentitier);
			if (jarFile != null) {
				if(checkJarFiles(jarFile)) {
					Type moduleType = AttributeFileIO.readAttributeFile(identifier, jarFile, enclosure);
//					if (moduleType != expectedType) {
					if(moduleType == null) {
						if (expectedType != null) Util.error("Missing external type: "+expectedType);
					}
					else if(expectedType == null) {
//						Util.error("Wrong external type: "+moduleType+". No Type Expected"); // TODO: TESTING3		
					}
					else if (!moduleType.equals(expectedType)) {
						if (expectedType != null)
							Util.error("Wrong external type: "+moduleType+". Expected type: "+expectedType);
					}
				}
			}

			if (Parse.accept(KeyWord.IS)) {
				// ...
				Util.IERR("*** NOT IMPLEMENTED: " + "External non-Simula Procedure");
				break LOOP;
			}
			if (!Parse.accept(KeyWord.COMMA))
				break LOOP;
			identifier = Parse.expectIdentifier();
		}
//		System.out.println("ExternalDeclaration.expectExternalHead: END "+identifier);
		return externalDeclarations;
	}

	private static boolean checkJarFiles(File file) {
		for(File f:Global.externalJarFiles) if(f.equals(file)) {
			Util.warning("External already included: "+file.getName());
			return(false);
		}
		return(true);
	}

	
	public void readExternal() {
//		System.out.println("ExternalDeclaration.readExternal: "+this);
		
		File jarFile = JarFileIO.findJarFile(identifier, externalIdent);
//		Util.IERR(""+jarFile);
		
		if (jarFile != null) {
			if(checkJarFiles(jarFile)) {
//				System.out.println("ExternalDeclaration.readExternal: declaredIn="+declaredIn);
				BlockDeclaration enclosure = StandardClass.BASICIO; //null; // Implies BASICIO
//				BlockDeclaration enclosure = nearestEnclosingBlock();
//				System.out.println("ExternalDeclaration.readExternal: nearestEnclosingBlock="+enclosure);
				Type moduleType = AttributeFileIO.readAttributeFile(identifier, jarFile, enclosure);
//				Util.IERR(""+jarFile);
				
			}
		}		
	}


	public String toString() {
		return "ExternalDeclaration: identifier=" + identifier + ", externalIdent=" + externalIdent;
	}


	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************

	@Override
	public void writeObject(AttributeOutputStream oupt) throws IOException {
		Util.TRACE_OUTPUT("writeExternalDeclaration: " + this);
		oupt.writeKind(declarationKind);
		oupt.writeInt(SEQU);
		oupt.writeString(identifier);
		oupt.writeString(externalIdent);
		oupt.writeInt(lineNumber);
	}
	
	public static ExternalDeclaration readObject(AttributeInputStream inpt) throws IOException {
		Util.TRACE_INPUT("BEGIN readExternalDeclaration: ");
		ExternalDeclaration ext = new ExternalDeclaration();
//		ext.SEQU = inpt.readInt();
		ext.SEQU = inpt.readSEQU(ext);
		ext.identifier = inpt.readString();
		ext.externalIdent = inpt.readString();
		ext.lineNumber = inpt.readInt();
		Util.TRACE_INPUT("readExternalDeclaration: " + ext);
		return(ext);
	}

}
