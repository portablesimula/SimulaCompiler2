package simula.runtime;

// ************************************************************
// *** ARRAY OBJECTS
// ************************************************************

/**
 * This class is used to hold bound pairs in RTS_ARRAY objects.
 *
 */
public final class RTS_BOUNDS {
	/**
	 * An array upper bound
	 */
	final public int LB;
	/**
	 * An array ELEMENTS size
	 */
	final public int SIZE;

	/**
	 * Create an array bound pair object
	 * @param LB Lower bound
	 * @param UB Upper bound
	 */
	public RTS_BOUNDS(final int LB, final int UB) {
		if (LB > UB)
			throw new RTS_SimulaRuntimeError("Lower bound(" + LB + ") > upper bound(" + UB + ")");
		this.LB = LB;
		SIZE = UB - LB + 1;
	}

	@Override
	public String toString() {
		return ("" + LB + ':' + (LB + SIZE - 1));
	}
}
