package simula.runtime;

/**
 * For-statement single text value element.
 * 
 * <pre>
 * 		For t:= &lt;TextExpr> // Text Value Assignment
 * </pre>
 *
 */
public final class FOR_SingleTValElt extends FOR_Element {
	/**
	 * The for-statement control variable.
	 */
	final RTS_NAME<RTS_TXT> cvar;
	/**
	 * Next value.
	 */
	RTS_NAME<RTS_TXT> nextValue;

	/**
	 * Create single text value element.
	 * 
	 * @param cvar the for-statement control variable
	 * @param tval the text value expression
	 * 
	 */
	public FOR_SingleTValElt(final RTS_NAME<RTS_TXT> cvar, final RTS_NAME<RTS_TXT> tval) {
		this.cvar = cvar;
		this.nextValue = tval;
		more = true;
	}

	@Override
	public boolean hasNext() {
		return (nextValue != null);
	}

	@Override
	public Boolean next() {
		if (nextValue == null)
			return (false);
		RTS_TXT val = nextValue.get();
		RTS_UTIL._ASGTXT(cvar.get(), val);
		nextValue = null;
		return (true);
	}
}
