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

import simula.compiler.GeneratedJavaClass;
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
public final class DummyStatement extends Statement implements Externalizable {
	
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
	// *** Externalization
	// ***********************************************************************************************
	/**
	 * Default constructor used by Externalization.
	 */
	public DummyStatement() {
		super(0);
	}

	@Override
	public void writeExternal(ObjectOutput oupt) throws IOException {
		Util.TRACE_OUTPUT("BEGIN Write "+this.getClass().getSimpleName());
		oupt.writeBoolean(CHECKED);
		oupt.writeInt(lineNumber);
//		oupt.writeObject(lineNumber);
	}
	
	@Override
	public void readExternal(ObjectInput inpt) throws IOException, ClassNotFoundException {
		Util.TRACE_INPUT("BEGIN Read "+this.getClass().getSimpleName());
		CHECKED=inpt.readBoolean();
		lineNumber = inpt.readInt();
	}
	

}
