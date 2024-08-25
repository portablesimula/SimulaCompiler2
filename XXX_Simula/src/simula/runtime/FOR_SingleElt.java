package simula.runtime;

/**
 * For-statement single value element, not text.
 * 
 * <pre>
 * 		For i:= &lt;Expr>
 * </pre>
 *
 * @param <T> the type of this element
 */
public final class FOR_SingleElt<T> extends FOR_Element {
	/**
	 * The for-statement control variable.
	 */
	final RTS_NAME<T> cvar;
	/**
	 * Next value.
	 */
	RTS_NAME<T> nextValue;

	/**
	 * Create single value element, not text.
	 * 
	 * @param cvar the for-statement control variable
	 * @param val the text value expression
	 * 
	 */
	public FOR_SingleElt(final RTS_NAME<T> cvar, final RTS_NAME<T> val) {
		this.cvar = cvar;
		this.nextValue = val;
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
		T val = nextValue.get();
		cvar.put(val);
		nextValue = null;
		return (true);
	}
}
