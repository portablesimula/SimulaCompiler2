package simula.runtime;

// ************************************************************
// *** FRAMEWORK for NonLocal Label-Parameters in Java Coding
// ************************************************************
/**
 * This class represent a Simula Label quantity
 *
 */
@SuppressWarnings("serial")
public final class RTS_LABEL extends RuntimeException {
//	static final long serialVersionUID = 42L;
	/**
	 * Static link, i.e. the block in which the label is defined.
	 */
	public final RTS_RTObject _SL;
	
	/**
	 * Prefix level.
	 */
	public final int _PRFX;
	
	/**
	 * Index, I.e. ordinal number of the Label within its Scope(staticLink).
	 */
	public final int index;
	
	/**
	 * Label identifier. To improve error and trace messages.
	 */
	public final String identifier; // To improve error and trace messages.

	// Constructor
	/**
	 * Create a label quantity
	 * @param _SL static link
	 * @param _PRFX prefix level
	 * @param index label index
	 * @param identifier label identifier
	 */
	public RTS_LABEL(final RTS_RTObject _SL, final int _PRFX, final int index, final String identifier) {
		this._SL = _SL;
		this._PRFX = _PRFX;
		this.index = index;
		this.identifier = identifier;
	}

	@Override
	public String toString() {
		return ("RTS_LABEL(" + _SL + ", PRFX=" + _PRFX + ", LABEL#" + index + ", identifier=" + identifier + ')');
	}
}
