/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.syntaxClass.statement;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.classfile.CodeBuilder;

import simula.compiler.AttributeInputStream;
import simula.compiler.AttributeOutputStream;
import simula.compiler.GeneratedJavaClass;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * Dummy Statement.
 * 
 * <pre>
 * 
 * Simula Standard: 4.11 Dummy statement
 * 
 *   dummy-statement = empty
 * 
 * </pre>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/syntaxClass/statement/DummyStatement.java"><b>Source File
 * </b></a>.
 * 
 * @author SIMULA Standards Group
 * @author Øystein Myhre Andersen
 */
public final class DummyStatement extends Statement {
	
	/**
	 * Create a new DummyStatement.
	 * @param line the source line number
	 */
	DummyStatement(final int line) {
		super(line);
		if (Option.TRACE_PARSE) Util.TRACE("Line "+lineNumber+": DummyStatement: "+this);
	}

	@Override
	public void doChecking() {
		if (IS_SEMANTICS_CHECKED())	return;
		// No Checking
		SET_SEMANTICS_CHECKED();
	}

	@Override
	public void doJavaCoding() { /* No Coding */
		ASSERT_SEMANTICS_CHECKED();
		GeneratedJavaClass.code(";");
	}

	@Override
	public void buildByteCode(CodeBuilder codeBuilder) {
	}

	@Override
	public void print(final int indent) {
	}
	
	@Override
	public void printTree(final int indent) {
//		System.out.println(edTreeIndent(indent)+"DUMMY ");
	}

	@Override
	public String toString() {
		return ("DUMMY");
	}

	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************
	/**
	 * Default constructor used by Attribute File I/O
	 */
	public DummyStatement() { super(0); }

	@Override
	public void writeObject(AttributeOutputStream oupt) throws IOException {
		Util.TRACE_OUTPUT("writeDummyStatement: " + this);
		oupt.writeKind(ObjectKind.DummyStatement);
		oupt.writeShort(SEQU);
		oupt.writeShort(lineNumber);
	}

	public static DummyStatement readObject(AttributeInputStream inpt) throws IOException {
		Util.TRACE_INPUT("BEGIN readDummyStatement: ");
		DummyStatement stm = new DummyStatement();
//		stm.SEQU = inpt.readShort();
		stm.SEQU = inpt.readSEQU(stm);
		stm.lineNumber = inpt.readShort();
		Util.TRACE_INPUT("DummyStatement: " + stm);
		return(stm);
	}

}
