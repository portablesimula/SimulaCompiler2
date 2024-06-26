package simula.runtime;

// ************************************************************
// *** INTEGER ARRAY
// ************************************************************
/**
 * This class represent a Simula integer array. 
 *
 */
public final class RTS_INTEGER_ARRAY extends RTS_ARRAY {
	/**
	 * The elements in this RTS_INTEGER_ARRAY
	 */
	final private int[] ELTS;

	/**
	 * Create a integer array with the given bounds.
	 * @param BOUNDS the array bounds
	 */
	public RTS_INTEGER_ARRAY(final RTS_BOUNDS... BOUNDS) {
		super(BOUNDS);
		ELTS = new int[SIZE];
	}

	/**
	 * This method will put a value into ELTS[ix]
	 * @param ix the index of ELTS
	 * @param val the value to put
	 * @return the value stored
	 */
	public int putELEMENT(int ix, int val) {
//		System.out.println("RTS_RTObject.putELEMENT: ELTS["+ix+"] = "+val);
		ELTS[ix] = val;
		return (val);
	}

	/**
	 * This method will return a value from ELTS[x]
	 * @param x the index of ELTS
	 * @return the value loaded
	 */
	public int getELEMENT(int... x) {
		return (ELTS[index(x)]);
	}

	/**
	 * Abstract method redefined for all subclaRTS_BOUNDS;type>_ARRAY
	 * @return a copy of this RTS_INTEGER_ARRAY
	 */
	@Override
	public RTS_INTEGER_ARRAY COPY() {
		RTS_INTEGER_ARRAY copy = new RTS_INTEGER_ARRAY(BOUNDS);
		System.arraycopy(ELTS, 0, copy.ELTS, 0, SIZE);
		return (copy);
	}
}
