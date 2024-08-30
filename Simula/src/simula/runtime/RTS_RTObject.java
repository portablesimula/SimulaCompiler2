/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.runtime;

/**
 * This class is the main superclass used to form all other Simula classes
 * <p>
 * Link to GitHub: <a href="https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/runtime/RTS_RTObject.java"><b>Source File</b></a>.
 * @author Øystein Myhre Andersen
 */
public abstract class RTS_RTObject {

	/**
	 * The default input line length. I.e. BASICIO'INPUT_LINELENGTH
	 */
	static final int _INPUT_LINELENGTH = 80;
	/**
	 * The default output line length. I.e. BASICIO'OUTPUT_LINELENGTH
	 */
	static final int _OUTPUT_LINELENGTH = 132;
	/**
	 * The variable SYSIN. 
	 */
	static RTS_Infile _SYSIN;
	
	/**
	 * The intenal pointer to sysout.
	 */
	public static RTS_Printfile _SYSOUT;

	/**
	 * Implementation of Simula's Procedure sysin.
	 * @return a pointer to _SYSIN
	 */
	public static RTS_Infile sysin() {
		return (_SYSIN);
	}

	/**
	 * Implementation of Simula's Procedure sysout.
	 * @return a pointer to _SYSOUT
	 */
	public static RTS_Printfile sysout() {
		return (_SYSOUT);
	}

	/**
	 * Execution stat time in millis
	 */
	static long startTimeMs;


	/**
	 * This object's Operational State.
	 * @see OperationalState
	 */
	public OperationalState _STATE;
	
	/**
	 * This is a pointer to the Coroutine in which this block instance is running.
	 * <br>
	 * If this block instance is detached it is used to save the complete
	 * reactivation point (call stack and the continuation point).
	 */
	public RTS_Coroutine _CORUT;

	/**
	 * Outermost Block Instance
	 */
	public static final RTS_BASICIO _CTX = new RTS_BASICIO(null);

	/**
	 * Outermost user Block Instance
	 */
	public static RTS_BASICIO _USR;
	
	/**
	 * Current Block Instance
	 */
	public static RTS_RTObject _CUR = _CTX;
	
	/**
	 * Jump Table Index used by _STM()
	 */
	public int _JTX;

	/**
	 * This is a static property generated by the compiler.
	 * <br>
	 * It will return true for Block or Prefixed Block with local classes.
	 * <br>
	 * This method is redefined in every subclass which represent a Simula Block.
	 * 
	 * @return true: this object is a QPS System block
	 */
	public boolean isQPSystemBlock() {
		return (false);
	} // Needs Redefinition

	/**
	 * This is a static property generated by the compiler.
	 * <br>
	 * It will return true for Blocks in which 'detach' is used.
	 * <br>
	 * This method is redefined in every subclass which represent a Simula Block.
	 * 
	 * @return true: this object is a QPS System block
	 */
	public boolean isDetachUsed() {
		return (false);
	} // Needs Redefinition

	/**
	 * This is a pointer to the object of the nearest textually enclosing block
	 * instance, also called 'static link'.
	 */
	public RTS_RTObject _SL; // Static Link

	/**
	 * If this block instance is attached this is a pointer to the object of the
	 * block instance to which the instance is attached (also called dynamic link),
	 * i.e. it points to the block instance which called this one.
	 */
	RTS_RTObject _DL; // Dynamic Link

	// ************************************************************
	// *** Constructor
	// ************************************************************

	/**
	 * Constructor
	 * 
	 * @param SL Static Link, may be null when creating CONTEXT, TEXTOBJ and TXTREF
	 */
	public RTS_RTObject(final RTS_RTObject SL) {
		if (SL != null) {
			this._SL = SL;
			this._CORUT = RTS_Coroutine.getCurrentCoroutine();
		}
	}











	// ********************************************************************
	// *** Parameter Transmission in case of Formal/Virtual Procedure Call
	// ********************************************************************
	
	/**
	 * Utility method to support Parameter Transmission in case of Formal/Virtual Procedure Call.
	 * <p>
	 * If the parameter is 'by name' the parameter is evaluated.
	 * <p>
	 * See {@link simula.compiler.syntaxClass.declaration.ProcedureDeclaration#doCodePrepareFormal() simula.compiler.declaration.ProcedureDeclaration#doCodePrepareFormal}
	 * @param par an Object
	 * @return a RTS_ARRAY value
	 */
	public RTS_ARRAY arrayValue(final Object par) {
		if (par instanceof RTS_NAME<?> arr)
			return ((RTS_ARRAY) arr.get());
		return ((RTS_ARRAY) par);
	}

	/**
	 * Utility method to support Parameter Transmission in case of Formal/Virtual Procedure Call.
	 * <p>
	 * If the parameter is 'by name' the parameter is evaluated.
	 * <p>
	 * See {@link simula.compiler.syntaxClass.declaration.ProcedureDeclaration#doCodePrepareFormal() simula.compiler.declaration.ProcedureDeclaration#doCodePrepareFormal}
	 * @param par an Object
	 * @return a RTS_PRCQNT value
	 */
	public RTS_PRCQNT procValue(final Object par) {
		if (par instanceof RTS_NAME<?> proc)
			return ((RTS_PRCQNT) proc.get());
		return ((RTS_PRCQNT) par);
	}

	/**
	 * Utility method to support Parameter Transmission in case of Formal/Virtual Procedure Call.
	 * <p>
	 * If the parameter is 'by name' the parameter is evaluated.
	 * <p>
	 * If the parameter is a RTS_PRCQNT that procedure is called 
	 * <p>
	 * See {@link simula.compiler.syntaxClass.declaration.ProcedureDeclaration#doCodePrepareFormal() simula.compiler.declaration.ProcedureDeclaration#doCodePrepareFormal}
	 * @param par an Object
	 * @return a Object value
	 */
	public Object objectValue(Object par) {
		if (par instanceof RTS_NAME<?> npar)
			par = npar.get();
		if (par instanceof RTS_PRCQNT proc)
			par = proc.CPF()._RESULT();
		return (par);
	}

	/**
	 * Utility method to support Parameter Transmission in case of Formal/Virtual Procedure Call.
	 * <p>
	 * If the parameter is 'by name' the parameter is evaluated.
	 * <p>
	 * If the parameter is a _PRCQNT that procedure is called 
	 * <p>
	 * If the parameter is a Float or Double they are casted to Integer 
	 * <p>
	 * See {@link simula.compiler.syntaxClass.declaration.ProcedureDeclaration#doCodePrepareFormal() simula.compiler.declaration.ProcedureDeclaration#doCodePrepareFormal}
	 * @param par an Object
	 * @return an Integer value
	 */
	public int intValue(Object par) {
		if (par instanceof RTS_NAME<?> npar)
			par = npar.get();
		if (par instanceof RTS_PRCQNT proc)
			par = proc.CPF()._RESULT();
		if (par instanceof Float f)
			return (f.intValue());
		if (par instanceof Double d)
			return (d.intValue());
		if (par instanceof Integer i)
			return (i);
		throw new ClassCastException("Incompatible Types: int," + par.getClass().getSimpleName());
	}

	/**
	 * Utility method to support Parameter Transmission in case of Formal/Virtual Procedure Call.
	 * <p>
	 * If the parameter is 'by name' the parameter is evaluated.
	 * <p>
	 * If the parameter is a _PRCQNT that procedure is called 
	 * <p>
	 * If the parameter is a Integer or Double they are casted to Float 
	 * <p>
	 * See {@link simula.compiler.syntaxClass.declaration.ProcedureDeclaration#doCodePrepareFormal() simula.compiler.declaration.ProcedureDeclaration#doCodePrepareFormal}
	 * @param par an Object
	 * @return a Float value
	 */
	public float floatValue(Object par) {
		if (par instanceof RTS_NAME<?> npar)
			par = npar.get();
		if (par instanceof RTS_PRCQNT proc)
			par = proc.CPF()._RESULT();
		if (par instanceof Float f)
			return (f);
		if (par instanceof Double d)
			return (d.floatValue());
		if (par instanceof Integer i)
			return (i.floatValue());
		throw new ClassCastException("Incompatible Types: float," + par.getClass().getSimpleName());
	}

	/**
	 * Utility method to support Parameter Transmission in case of Formal/Virtual Procedure Call.
	 * <p>
	 * If the parameter is 'by name' the parameter is evaluated.
	 * <p>
	 * If the parameter is a _PRCQNT that procedure is called 
	 * <p>
	 * If the parameter is an Integer or Float they are casted to Double 
	 * <p>
	 * See {@link simula.compiler.syntaxClass.declaration.ProcedureDeclaration#doCodePrepareFormal() simula.compiler.declaration.ProcedureDeclaration#doCodePrepareFormal}
	 * @param par an Object
	 * @return a Double value
	 */
	public double doubleValue(Object par) {
		if (par instanceof RTS_NAME<?> npar)
			par = npar.get();
		if (par instanceof RTS_PRCQNT proc)
			par = proc.CPF()._RESULT();
		if (par instanceof Float f)
			return (f.doubleValue());
		if (par instanceof Double d)
			return (d);
		if (par instanceof Integer i)
			return (i.doubleValue());
		throw new ClassCastException("Incompatible Types: double," + par.getClass().getSimpleName());
	}

	/**
	 * Utility method to support Parameter Transmission in case of Formal/Virtual Procedure Call.
	 * <p>
	 * If the parameter is 'by name' the parameter is evaluated.
	 * <p>
	 * If the parameter is a _PRCQNT that procedure is called 
	 * <p>
	 * See {@link simula.compiler.syntaxClass.declaration.ProcedureDeclaration#doCodePrepareFormal() simula.compiler.declaration.ProcedureDeclaration#doCodePrepareFormal}
	 * @param par an Object
	 * @return a boolean value
	 */
	public boolean booleanValue(Object par) {
		if (par instanceof RTS_NAME<?> npar)
			par = npar.get();
		if (par instanceof RTS_PRCQNT proc)
			par = proc.CPF()._RESULT();
//		if (par instanceof Float f)
//			return (f.doubleValue());
//		if (par instanceof Double d)
//			return (d);
		if (par instanceof Boolean b)
			return (b.booleanValue());
		throw new ClassCastException("Incompatible Types: boolean," + par.getClass().getSimpleName());
	}

	/**
	 * Utility method to support Parameter Transmission in case of Formal/Virtual Procedure Call.
	 * <p>
	 * If the parameter is 'by name' the parameter is evaluated.
	 * <p>
	 * If the parameter is a _PRCQNT that procedure is called 
	 * <p>
	 * See {@link simula.compiler.syntaxClass.declaration.ProcedureDeclaration#doCodePrepareFormal() simula.compiler.declaration.ProcedureDeclaration#doCodePrepareFormal}
	 * @param par an Object
	 * @return a boolean value
	 */
	public char charValue(Object par) {
		if (par instanceof RTS_NAME<?> npar)
			par = npar.get();
		if (par instanceof RTS_PRCQNT proc)
			par = proc.CPF()._RESULT();
//		if (par instanceof Float f)
//			return (f.doubleValue());
//		if (par instanceof Double d)
//			return (d);
		if (par instanceof Character c)
			return (c.charValue());
		throw new ClassCastException("Incompatible Types: character," + par.getClass().getSimpleName());
	}

	/**
	 * The operator &amp; permits text concatenation.
	 * 
	 * @param T1 the first text to be concatenated
	 * @param T2 the second text to be concatenated
	 * @return  the concatenated text
	 */
	public RTS_TXT CONC(RTS_TXT T1, RTS_TXT T2) {
		if (T1 == null)
			T1 = RTS_UTIL.NOTEXT;
		if (T2 == null)
			T2 = RTS_UTIL.NOTEXT;
		RTS_TXT U = RTS_ENVIRONMENT.blanks(RTS_TXT.length(T1) + RTS_TXT.length(T2));
		RTS_UTIL._ASGTXT(RTS_TXT.sub(U, 1, RTS_TXT.length(T1)), T1);
		RTS_UTIL._ASGTXT(RTS_TXT.sub(U, 1 + RTS_TXT.length(T1), RTS_TXT.length(T2)), T2);
		return (U);
	}

	// **************************************************************
	// *** USED IN CONDITIONAL STATEMENT TO PREVENT DEAD-CODE REMOVAL
	// **************************************************************
	/**
	 * Used in Conditional Statement to prevent 'dead code removal'.
	 * @param cond a boolean condition
	 * @return the same conditional
	 */
	public boolean _VALUE(boolean cond) {
		return (cond);
	}

//	// ************************************************************
//	// *** lOCAL JUMP/LABEL - Meant for Byte-Code Engineering
//	// ************************************************************
//	/**
//	 * Method meant for Byte-Code Engineering.
//	 * <br>
//	 * During Byte-Code Engineering this method-call is used to signal the occurrence of a Simula Label.
//	 */
//	public static void _PRE_LABEL() {
//		// Local LABEL - Needs ByteCode Engineering.
//	}

//	// ************************************************************
//	// *** lOCAL JUMP/LABEL - Meant for Byte-Code Engineering -- TODO: OLD VERSION
//	// ************************************************************
//	/**
//	 * Method meant for Byte-Code Engineering.
//	 * <br>
//	 * During Byte-Code Engineering this method-call is used to signal the occurrence of a Simula Label.
//	 * The bytecode address is collected and some instruction are removed.
//	 * The parameter 'labelIndex' is the label's ordinal number.
//	 * <p>deprecated
//     * This method will be removed when java.lang.classfile becomes available.
//     * @param labelIndex the label's ordinal number.
//	 * @param ident the label's identifier
//	 */
//	public static void _LABEL(final int labelIndex, final String ident) {
//		// Local LABEL - Needs ByteCode Engineering.
//	}

	// ************************************************************
	// *** lOCAL JUMP/LABEL - Meant for Byte-Code Engineering
	// ************************************************************
	/**
	 * Method meant for Byte-Code Engineering.
	 * <br>
	 * During Byte-Code Engineering this method-call is used to signal the occurrence of a Simula Label.
	 * A pseudo label instruction is added some instruction are removed.
	 * The parameter 'labelIndex' is the label's ordinal number.
	 * @param labelIndex the label's ordinal number.
	 */
	public static void _SIM_LABEL(final int labelIndex) {
		// Local LABEL - Needs ByteCode Engineering.
	}

//	/**
//	 * Method meant for Byte-Code Engineering.
//	 * <br>
//	 * This method-call is a placeholder for where to put in a Jump-Table.
//	 * <br>
//	 * See <a href="doc/SimulaRTS.pdf">Mapping Simula to Java (runtime design)</a> 
//	 * Sect. 6.1.2 Byte Code Engineering.
//	 */
//	public static void _PRE_TABLE() {}

	/**
	 * Method meant for Byte-Code Engineering.
	 * <br>
	 * This method-call is a placeholder for where to put in a Jump-Table.
	 * <br>
	 * See <a href="doc/SimulaRTS.pdf">Mapping Simula to Java (runtime design)</a> 
	 * Sect. 6.1.2 Byte Code Engineering.
	 * 
	 * @param labelIndex the label index
	 * @param tableSize the jumptable size
	 */
	public static void _JUMPTABLE(final int labelIndex,final int tableSize) {
		// Local GOTO - Needs ByteCode Engineering.
		if (RTS_Option.GOTO_TRACING)
			RTS_UTIL.TRACE("_RTObject._JUMPTABLE: labelIndex=" + labelIndex);
		String msg = "FATAL ERROR: Local GOTO LABEL#" + labelIndex + " Needs ByteCode Engineering.";
		RTS_UTIL.println(msg);
		if (labelIndex == 0)
			return;
		RTS_UTIL.println(msg);
		throw new RTS_SimulaRuntimeError(msg);
	}
	
//	// ************************************************************
//	// *** lOCAL JUMP/LABEL - Meant for Byte-Code Engineering --  TODO: OLD VERSION
//	// ************************************************************
//	/**
//	 * Method meant for Byte-Code Engineering.
//	 * <p>deprecated
//     * This method will be removed when java.lang.classfile becomes available.
//	 * @param labelIndex the label index
//	 */
//	public static void _JUMPTABLE(final int labelIndex) {
//		_JUMPTABLE(labelIndex,0);
//	}
	

	// ************************************************************
	// *** _GOTO -- To avoid Java-error: "Unreachable code" after GOTO
	// ************************************************************
	/**
	 * Utility method to avoid Java-error: "Unreachable code" after GOTO
	 * @param q the RTS_LABEL
	 */
	public void _GOTO(final RTS_LABEL q) {
		if (RTS_Option.GOTO_TRACING) {
			RTS_UTIL.TRACE("RTS_RTObject.GOTO: " + q);
		
//			System.out.println("\nRTS_RTObject._GOTO: "+q.identifier + ", CUR="+_CUR);
//			System.out.println("RTS_RTObject._GOTO: "+q.identifier+" = "+q);
//	        new Exception("With Operating Chain:").printStackTrace(System.out);
		}
		throw q;
	}

	// ************************************************************
	// *** GOTO: _TREAT_GOTO_CATCH_BLOCK
	// ************************************************************
	/**
	 * Utility method to set current object terminated and re-throw the label.
	 */
	public static void _TREAT_GOTO_CATCH_BLOCK(RTS_RTObject _THIS, RTS_LABEL q) {
//		System.out.println("RTS_RTObject._TREAT_GOTO_CATCH_BLOCK: "+q);
        _CUR=_THIS;
        if(q._SL!=_CUR) {
            if(RTS_Option.GOTO_TRACING)
            	TRACE_GOTO(_CUR.getClass().getSimpleName()+":NON-LOCAL",q);
            _CUR._STATE=OperationalState.terminated;
            throw q;
        }
        if(RTS_Option.GOTO_TRACING)
        	TRACE_GOTO(_CUR.getClass().getSimpleName()+":LOCAL",q);
//        _JTX=q.index; continue _LOOP; // EG. GOTO Lx
    }

	// ************************************************************
	// *** TRACING: TRACE_GOTO
	// ************************************************************
	/**
	 * Utility method to trace GOTO Statements
	 * @param msg a descriptive message
	 * @param label the label quant
	 */
	public static void TRACE_GOTO(final String msg, final RTS_LABEL label) {
		RTS_UTIL.TRACE(msg + " GOTO " + label);
		
		System.out.println("\nRTS_RTObject.TRACE_GOTO: "+label.identifier + ", CUR="+_CUR);
        new Exception("With Operating Chain:").printStackTrace(System.out);
		
	}


	// ************************************************************
	// *** BBLK - Begin Block
	// ************************************************************
	/**
	 * This routine is used to initiate a block instance. Its functions are:
	 * <ul>
	 * <li>Attach the block to its dynamic environment.</li>
	 * <li>Update the current instance pointer(_CUR).</li>
	 * </ul>
	 */
	public void BBLK() {
		_DL = _CUR;
		_CUR = this;
		_CORUT = _DL._CORUT;
		_STATE = OperationalState.attached;
		if (RTS_Option.BLOCK_TRACING)
		RTS_UTIL.TRACE("BEGIN " + edObjectAttributes());
//		System.out.println("RTS_RTObject.BBLK: USR="+_USR);
		if (_SL == null) {
//			Thread.dumpStack();
			throw new RTS_SimulaRuntimeError("NONE-CHECK FAILED: Remote Call on Procedure x.proc, x==none");
		}
	}

	// *********************************************************************
	// *** EBLK - End Block
	// *********************************************************************
	/**
	 * End Block.
	 * <p>
	 * This routine is used to terminate a block instance when control passes
	 * through the final end (of the outermost prefix for class and prefixed block).
	 * <p>
	 * According to the different categories of block instances, we have the
	 * following cases:
	 * <ul>
	 * <li>Terminate prefixed block instance.
	 * <p>
	 * Update the '_CUR' pointer and return to Compiler generated code.</li>
	 * <li>Terminate class instance.
	 * <p>
	 * The object is marked 'terminated' and the '_CUR' pointer is updated.</li>
	 * </ul>
	 * If the class instance is detached: The instance is marked as terminated. The
	 * sub-block or prefixed block representing the quasiparallel system of which
	 * the instance was a component is located. The main program of the system is
	 * then 'resumed'.
	 * <p>
	 * Finally; Yield continuation and return to Compiler generated code.
	 * <p>
	 * However; If the program passes through its final end sysout.outimage is
	 * called. The the entire program is terminated.
	 */
	public void EBLK() {
		switch (_STATE) {
		case attached -> {
			if (RTS_Option.BLOCK_TRACING)
				RTS_UTIL.TRACE("END ATTACHED BLOCK " + edObjectAttributes());
			_STATE = OperationalState.terminated;
			_CUR = _DL; // Make the dynamic enclosure the new current instance.
		}
		case resumed -> {
			// Treat the case of a resumed and operating object.
			// It is the head of an object component. The class
			// object enters the terminated state, and the object component
			// disappears from its system. The main component of that system
			// takes its place as the operating component of the system.
			// Invariant: _CUR._STATE = resumed and _CUR.DL = main.SL
			_STATE = OperationalState.terminated;
			// Find main component (and system) head. It must be the static
			// enclosure since the object has been RESUMEd.
			RTS_RTObject main = _SL;
			// The main component becomes the operating component.
			RTS_RTObject dl = _DL;
			_DL = null;
			_CUR = main._DL;
			main._DL = dl;
			if (RTS_Option.BLOCK_TRACING)
				RTS_UTIL.TRACE("END COMPONENT " + edObjectAttributes());
		}
		case terminatingProcess -> {
			if (RTS_Option.BLOCK_TRACING)
				RTS_UTIL.TRACE("TERMINATING PROCESS " + edObjectAttributes());
			_STATE = OperationalState.terminated;
			_CORUT = null; // Leave it to the GarbageCollector
			return; // Let this Continuation R.I.P.
		}
		default -> throw new RTS_SimulaRuntimeError("_RTObject.EBLK: Internal Error " + edObjectAttributes());
		}
		if (_CUR == null || _CUR == _CTX) {
			if (RTS_Option.BLOCK_TRACING)
				RTS_UTIL.TRACE("PROGRAM PASSES THROUGH FINAL END " + edObjectAttributes());
			RTS_UTIL.endProgram(0);
		} else {
			if (this._CORUT != null && this.isDetachUsed()) {
				RTS_Coroutine.detach();
			}
		}
	}

	// *********************************************************************
	// *** QUASI PARALLEL SEQUENCING
	// *********************************************************************

	// *********************************************************************
	// *** DETACH - See Simula Standard 7.3.1 Detach
	// *********************************************************************
	/**
	 * Standard procedure 'detach'.
	 * <p>
	 * Consider a call of the detach attribute of a block instance X.
	 * <p>
	 * If X is an instance of a prefixed block the detach statement has no effect.
	 * Assume that X is a class object. The following cases arise:
	 * <ol>
	 * <li>X is an attached object.<br>
	 * If X is not operating the detach statement constitutes an error. Assume X is
	 * operating. The effect of the detach statement is:
	 * <ul>
	 * <li>X becomes detached and thereby (the head of) a new non-operative object
	 * component, its reactivation point positioned immediately after the detach
	 * statement. As a consequence, that part of the operating chain which is
	 * dynamically enclosed by X becomes the (non-operating) reactivation chain of
	 * X.
	 * 
	 * <li>The PSC returns to the block instance to which X was attached and
	 * execution continues immediately after the associated object generator or call
	 * statement (see 7.3.2).
	 * </ul>
	 * If X is local to a system head, the new component becomes a member of the
	 * associated system. It is a consequence of the language definition that, prior
	 * to the execution of the detach statement, X was dynamically enclosed by the
	 * head of the operative component of this system. The operative component
	 * remains operative.
	 * 
	 * <li>X is a detached object.<br>
	 * The detach statement then constitutes an error.
	 * 
	 * <li>X is a resumed object.<br>
	 * X is then (the head of) an operative system component. Let S be the
	 * associated system. It is a consequence of the language definition that X must
	 * be operating. The effect of the detach statement is:
	 * <ul>
	 * <li>X enters the detached state and becomes non-operative, its reactivation
	 * point positioned immediately after the detach statement. As a consequence,
	 * that part of the operating chain which is dynamically enclosed by X becomes
	 * the (non-operating) reactivation chain of X.
	 * 
	 * <li>The PSC is moved to the current reactivation point of the main component
	 * of S, whereby this main component becomes operative and operating. As a
	 * consequence, all block instances on the reactivation chain of the main
	 * component also become operating.
	 * </ul>
	 * <li>X is a terminated object.<br>
	 * The detach statement then constitutes an error.
	 * </ol>
	 */
	public void detach() {
		// if (_RT.Option.QPS_TRACING) _RT.TRACE("BEGIN DETACH " + this.edObjectIdent() + " ==> " + _CUR.edObjectIdent());
		if (isQPSystemBlock())
			return; // Detach QPS System Block is no-operation.
		// Make sure that this object is on the operating chain.
		// Note that a detached or terminated object cannot be on the operating chain.
		RTS_RTObject dl = _CUR;
		while (dl != this) {
			dl = dl._DL;
			if (dl == null)
				throw new RTS_SimulaRuntimeError("x.Detach: x is not on the operating chain.");
		}
		switch (this._STATE) {
		case resumed -> {
			// Find main component for component to be detached. The main
			// component head must be the static enclosure of the object.
			RTS_RTObject main = this._SL;
			// Rotate the contents of '_CUR', 'this._DL' and 'main._DL'.
			// <main._DL,this._DL,_CUR> := <this._DL,_CUR,main._DL>
			dl = main._DL;
			main._DL = this._DL;
			this._DL = _CUR;
			_CUR = dl;
		}
		case attached -> {
			// Swap the contents of object's 'this._DL' and '_CUR'.
			// <this._DL,_CUR> := <_CUR,this._DL>
			dl = this._DL;
			this._DL = _CUR;
			_CUR = dl;
		}
		default -> throw new RTS_SimulaRuntimeError("Illegal Detach");
		}
		this._STATE = OperationalState.detached;

		if (RTS_Option.QPS_TRACING)
			RTS_UTIL.TRACE("DETACH " + this.edObjectIdent() + " ==> " + _CUR.edObjectIdent());
		RTS_Coroutine.detach();
	}

	/**
	 * See {@link RTS_RTObject#detach()}
	 * @param SL The object to be Detached
	 */
	public static void detach(RTS_RTObject SL) {
		SL.detach();
	}
	
	/**
	 * See {@link RTS_RTObject#detach()}
	 * @param sourceLine the sourceline of the call
	 */
	public void detach(int sourceLine) {
		if (RTS_Option.QPS_TRACING)
			RTS_UTIL.TRACE("LINE " + sourceLine + ": BEGIN DETACH " + this.edObjectIdent() + " ==> " + _CUR.edObjectIdent());
		detach();
		if (RTS_Option.QPS_TRACING)
			RTS_UTIL.TRACE("LINE " + sourceLine + ": DETACH(" + this.edObjectIdent() + ") CONTINUE IN "
					+ _CUR.edObjectIdent());
	}


	// *********************************************************************
	// *** CALL - See Simula Standard 7.3.1 Call
	// *********************************************************************
	/**
	 * Standard procedure 'call'.
	 * <p>
	 * "call" is formally a procedure with one object reference parameter qualified
	 * by a fictitious class 'CLASS' including all classes. Let Y denote the object
	 * referenced by a call statement.
	 * 
	 * <p>
	 * If Y is terminated, attached or resumed, or Y == none, the call statement
	 * constitutes an error.
	 * 
	 * <p>
	 * Assume Y is a detached object. The effect of the call statement is:
	 * <ul>
	 * <li>Y becomes attached to the block instance containing the call statement,
	 * whereby Y loses its status as a component head. As a consequence the system
	 * to which Y belongs (if any) loses the associated component.
	 * 
	 * <li>The PSC is moved to the (former) reactivation point of Y. As a
	 * consequence, all block instances on the reactivation chain of Y become
	 * operating.
	 * </ul>
	 * 
	 * @param ins The object to be Called (Coroutine)
	 */
	public void call(final RTS_RTObject ins) {
		RTS_RTObject dl; // Temporary reference to dynamic enclosure.
		if (ins == null)
			throw new RTS_SimulaRuntimeError("Call(x): x is none.");
		if (ins._STATE != OperationalState.detached)
			throw new RTS_SimulaRuntimeError("Call(x): x is not in detached state.");
		// The object to be attached cannot be on the operating chain,
		// because then its state would have been resumed and not detached.

		// Swap the contents of '_CUR' and object's 'dl'.
		// <ins._DL,_CUR>:=<_CUR,ins._DL>;
		dl = ins._DL;
		ins._DL = _CUR;
		_CUR = dl;
		// From now on the object is in attached state.
		// It is no longer a component head.
		ins._STATE = OperationalState.attached;
		// if (_RT.Option.QPS_TRACING) _RT.TRACE("CALL " + this.edObjectIdent() + " ==>
		// " + _CUR.edObjectIdent());
		swapCoroutines();
	}
	
	/**
	 * See {@link RTS_RTObject#call(RTS_RTObject)}
	 * @param ins The object to be Called (Coroutine)
	 * @param sourceLine the sourceline of the call
	 */
	public void call(final RTS_RTObject ins, int sourceLine) {
		if (RTS_Option.QPS_TRACING)
			RTS_UTIL.TRACE("LINE " + sourceLine + ": BEGIN CALL " + this.edObjectIdent() + " ==> " + _CUR.edObjectIdent());
		call(ins);
		if (RTS_Option.QPS_TRACING)
			RTS_UTIL.TRACE(
					"LINE " + sourceLine + ": CALL(" + this.edObjectIdent() + ") CONTINUE IN " + _CUR.edObjectIdent());
	}


	// *********************************************************************
	// *** RESUME - See Simula Standard 7.3.1 Resume
	// *********************************************************************
	/**
	 * <p>
	 * "resume" is formally a procedure with one object reference parameter
	 * qualified by a fictitious class 'CLASS' including all classes. Let Y denote
	 * the object referenced by a resume statement.
	 * 
	 * <p>
	 * If Y is not local to a system head, i.e. if Y is local to a class object or
	 * an instance of a procedure body, the resume statement constitutes an error.
	 * 
	 * <p>
	 * If Y is terminated or attached, or Y==none, the resume statement constitutes
	 * an error.
	 * 
	 * <p>
	 * If Y is a resumed object, the resume statement has no effect (it is a
	 * consequence of the language definition that Y must then be operating.)
	 * 
	 * <p>
	 * Assume Y is a detached object being (the head of) a non-operative system
	 * component. Let S be the associated system and let X denote (the head of) the
	 * current operative component of S. It is a consequence of the language
	 * definition that X must be operating, and that X is either the main component
	 * of S or local to the head of S. The effect of the resume statement is:
	 * <ul>
	 * <li>X becomes non-operative, its reactivation point positioned immediately
	 * after the resume statement. As a consequence, that part of the operating
	 * chain which is dynamically enclosed by X becomes the (non-operating)
	 * reactivation chain of X. If X is an object component its head enters the
	 * detached state.
	 * 
	 * <li>The PSC is moved to the reactivation point of Y, whereby Y enters the
	 * resumed state and becomes operative and operating. As a consequence, all
	 * block instances on the reactivation chain of Y also become operating.
	 * </ul>
	 * 
	 * @param ins The object to be Resumed
	 */
	public void resume(final RTS_RTObject ins) {
		resume(ins, true); // Normal Case
	}

	/**
	 * See {@link RTS_RTObject#resume(RTS_RTObject)}
	 * @param ins The object to be Resumed
	 * @param sourceLine the sourceline of the call
	 */
	public void resume(final RTS_RTObject ins, int sourceLine) {
		if (RTS_Option.QPS_TRACING)
			RTS_UTIL.TRACE("LINE " + sourceLine + ": BEGIN RESUME " + this.edObjectIdent() + " ==> " + _CUR.edObjectIdent());
		resume(ins);
	}

	/**
	 * See {@link RTS_RTObject#resume(RTS_RTObject)}
	 * @param ins The object to be Resumed
	 * @param doSwap decides whether Coroutines should be swapped
	 */
	public void resume(final RTS_RTObject ins, boolean doSwap) {
		RTS_RTObject comp; // Component head.
		RTS_RTObject mainSL; // Static enclosure of main component head.
		RTS_RTObject main; // The head of the main component and also
						// the head of the quasi-parallel system.
		if (ins == null)
			throw new RTS_SimulaRuntimeError("Resume(x): x is none.");

		if (ins._STATE != OperationalState.resumed) { // A no-operation?
			// The object to be resumed must be local to a system head.
			main = ins._SL;
			if (!main.isQPSystemBlock())
				throw new RTS_SimulaRuntimeError("Resume(x): x is not local to sub-block or prefixed block.");
			if (ins._STATE != OperationalState.detached)
				throw new RTS_SimulaRuntimeError("Resume(x): x is not in detached state but " + ins._STATE);
			// Find the operating component of the quasi-parallel system.
			comp = _CUR;
			mainSL = main._SL;
			while (comp._DL != mainSL)
				comp = comp._DL;
			if (comp._STATE == OperationalState.resumed)
				comp._STATE = OperationalState.detached;
			// Rotate the contents of 'ins.dl', 'comp.dl' and '_CUR'.
			// Invariant: comp._DL = mainSL
			// <ins._DL,comp._DL,_CUR>=<comp._DL,_CUR,ins._DL>
			comp._DL = _CUR;
			_CUR = ins._DL;
			ins._DL = mainSL;
			ins._STATE = OperationalState.resumed;
			if (RTS_Option.QPS_TRACING)
				RTS_UTIL.TRACE("RESUME " + this.edObjectIdent() + " ==> " + _CUR.edObjectIdent());
			if (doSwap)
				swapCoroutines();
		}
	}

	/**
	 * Method representing the Statements in this Block
	 * <br>
	 * This method is virtual and must be redefined in blocks.
	 * @return a pointer to this _RTObject
	 */
	public RTS_RTObject _STM() {
		return (this);
	}

	// *********************************************************************
	// *** swapCoroutines
	// *********************************************************************
	/**
	 * Utility: Swap Coroutines.
	 */
	static void swapCoroutines() {
		RTS_Coroutine cont = RTS_Coroutine.getCurrentCoroutine();
//		System.out.println("RTS_RTObject.swapCoroutines: SWAP: CURRENT= "+cont);
		if (cont == null) {
			cont = _CUR._CORUT;
			RTS_RTObject next = _CUR;
			while (next._CORUT != null) {
//				System.out.println("RTS_RTObject.swapCoroutines: SWAP: RUN NEXT "+next);
				next._CORUT.run();
				// Return here when Coroutine is Detached or Done
				next = _CUR;
//				System.out.println("RTS_RTObject.swapCoroutines: SWAP: RUN RETURNED "+next);
			}
		} else {
			// if(_RT.Option.QPS_TRACING) _RT.TRACE("SWAP: YIELD "+cont);
			RTS_Coroutine.detach();
		}
	}

	// *********************************************************************
	// *** TRACING AND DEBUGGING UTILITIES
	// *********************************************************************

	/**
	 * Utility to support trace and debugging.
	 * <p>
	 * An edited string identifier of the static link object is formed.
	 * @param staticLink a reference to the static link object
	 * @return an edited string 
	 */
	public static RTS_TXT objectTraceIdentifier(final RTS_RTObject staticLink) {
		return (new RTS_TXT(staticLink.edObjectIdent()));
	}

	/**
	 * Utility to support trace and debugging.
	 * <p>
	 * An edited string identifier of this object is formed.
	 * @return an edited string 
	 */
	public RTS_TXT objectTraceIdentifier() {
		return (new RTS_TXT(edObjectIdent()));
	}

	/**
	 * Utility to support trace and debugging.
	 * <p>
	 * An edited string identifier of this object's class is formed.
	 * @return an edited string 
	 */
	public String edObjectIdent() {
		StringBuilder s = new StringBuilder();
		s.append(this.getClass().getSimpleName());
		return (s.toString());
	}

	/**
	 * Utility to support trace and debugging.
	 * <p>
	 * An edited string identifier of this object's main attributes is formed.
	 * @return an edited string 
	 */
	public String edObjectAttributes() {
		StringBuilder s = new StringBuilder();
		s.append(edObjectIdent());
		s.append(" SL=").append((_SL == null) ? "null" : _SL.edObjectIdent());
		s.append(" DL=").append((_DL == null) ? "null" : _DL.edObjectIdent());
		s.append(" STATE=").append(_STATE);
		s.append(" CORUT=").append(_CORUT);
		s.append(" CUR=").append(_CUR);
		return (s.toString());
	}

//	public void printStaticContextChain() {
//		_RTObject x = this;
//		_RT.println("STATIC CONTEXT CHAIN:");
//		while (x != null) {
//			_RT.println(" - " + x.edObjectAttributes());
//			x = x._SL;
//		}
//	}

	/**
	 * Returns a string representation of the object.
	 */
	@Override
	public String toString() {
		return (edObjectIdent());
	}

}