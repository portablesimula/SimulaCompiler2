/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass.declaration;

import java.io.IOException;
import java.util.Vector;

import simula.compiler.AttributeInputStream;
import simula.compiler.AttributeOutputStream;
import simula.compiler.syntaxClass.Type;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * Procedure Specification.
 * <pre>
 * Simula Standard: 5.5.3 Virtual quantities
 * Simula Standard: 6.3 External procedure declaration
 * 
 * procedure-specification
 *     = [ type ] PROCEDURE procedure-identifier procedure-head empty-body
 *     
 *    procedure-head
 *        = [ formal-parameter-part ; [ mode-part ] specification-part  ] ;
 *         
 *    empty-body = dummy-statement
 * 
 *    procedure-identifier = identifier
 * 
 *       formal-parameter-part = "(" formal-parameter { , formal-parameter } ")"
 *       
 *          formal-parameter = identifier
 *          
 *       specification-part = specifier identifier-list ; { specifier identifier-list ; }
 *       
 *          specifier
 *             = type [ array | procedure ]
 *             | label
 *             | switch
 *             
 *       mode-part 
 *          = name-part [ value-part ]
 *          | value-part [ name-part ]
 *          
 *          name-part = name identifier-list ;
 *          value-part = value identifier-list ;
 *          
 *             identifier-list = identifier { , identifier }
 * </pre>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/declaration/ProcedureSpecification.java">
 * <b>Source File</b></a>.
 * 
 * @author SIMULA Standards Group
 * @author Øystein Myhre Andersen
 */
public final class ProcedureSpecification {
	
	/**
	 * The procedure identifier.
	 */
	private String identifier;

	/**
	 * The procedure's type.
	 */
	public Type type;
	
	/**
	 * The parameter list.
	 */
	public Vector<Parameter> parameterList;

	// ***********************************************************************************************
	// *** CONSTRUCTORS
	// ***********************************************************************************************
	/**
	 * Create a new ProcedureSpecification
	 * @param identifier procedure-identifier
	 * @param type procedure's type or null
	 * @param pList the parameter lList
	 */
	public ProcedureSpecification(final String identifier, final Type type, final Vector<Parameter> pList) {
		this.identifier = identifier;
		this.type = type;
		this.parameterList = pList;
	}

	// ***********************************************************************************************
	// *** Parsing: expectProcedureSpecification
	// ***********************************************************************************************
	/**
	 * Procedure Specification.
	 * 
	 * <pre>
	 * Syntax:
	 * 
	 * procedure-specification
	 *     = [ type ] PROCEDURE procedure-identifier procedure-head empty-body
	 *     
	 *    procedure-head
	 *        = [ formal-parameter-part ; [ mode-part ] procedure-specification-part  ] ;
	 *         
	 *    empty-body = dummy-statement
	 * 
	 *    procedure-identifier = identifier
	 * 
	 * </pre>
	 * Precondition:  [ type ] PROCEDURE  is already read.
	 * @param type procedure's type
	 * @return a newly created ProcedureSpecification
	 */
	static ProcedureSpecification expectProcedureSpecification(final Type type) {
		ProcedureDeclaration block = ProcedureDeclaration.expectProcedureDeclaration(type);
		if (Option.internal.TRACE_PARSE)
			Util.TRACE("END ProcedureSpecification: " + block);
		Global.setScope(block.declaredIn);
		ProcedureSpecification procedureSpecification = new ProcedureSpecification(block.identifier, type, block.parameterList);
		return (procedureSpecification);
	}

	// ***********************************************************************************************
	// *** Utility: doChecking
	// ***********************************************************************************************
	/**
	 * Perform semantic checking.
	 * 
	 * @param scope the DeclarationScope
	 */
	void doChecking(final DeclarationScope scope) {
		if (type != null)
			type.doChecking(scope);
		// Check parameters
		for (Parameter par : parameterList)
			par.doChecking();
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		if (type != null)
			s.append(type).append(' ');
		s.append("PROCEDURE ").append(identifier).append(Parameter.editParameterList(parameterList));
		return (s.toString());
	}

	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************
	/**
	 * Default constructor used by Attribute File I/O
	 */
	public ProcedureSpecification() {
	}

	public static void writeProcedureSpec(ProcedureSpecification spec,AttributeOutputStream oupt) throws IOException {
		if(spec == null) {
			oupt.writeBoolean(false);
		} else {
			Util.TRACE_OUTPUT("BEGIN Write ProcedureSpecification: " + spec.identifier);
			oupt.writeBoolean(true);
			oupt.writeString(spec.identifier);
			oupt.writeType(spec.type);

			// oupt.writeObject(parameterList);
			oupt.writeShort(spec.parameterList.size());
			for(Parameter par:spec.parameterList) {
				par.writeParameter(oupt);
			}
		}
	}
	
	public static ProcedureSpecification readProcedureSpec(AttributeInputStream inpt) throws IOException {
		Util.TRACE_INPUT("BEGIN readProcedureSpec: ");
		boolean present = inpt.readBoolean();
		if(!present) return(null);
		ProcedureSpecification spec = new ProcedureSpecification();
		spec.identifier = inpt.readString();
		spec.type = inpt.readType();

		//spec.parameterList = (Vector<Parameter>) inpt.readObject();
		int nPar = inpt.readShort();
		if(nPar > 0) {
			spec.parameterList = new Vector<Parameter>();
			for(int i=0;i<nPar;i++)
				spec.parameterList.add(Parameter.readParameter(inpt));
		}
		Util.TRACE_INPUT("END Read ProcedureSpecification: " + spec.identifier);
		return(spec);
	}

}
