package simula.runtime;

// ************************************************************
// *** REAL ARRAY
// ************************************************************
/**
 * This class represent a Simula real array. 
 *
 */
public final class RTS_REAL_ARRAY extends RTS_REALTYPE_ARRAY {
	/**
	 * The elements in this RTS_REAL_ARRAY
	 */
	final float[] ELTS;

	/**
	 * Create a real array with the given bounds.
	 * @param BOUNDS the array bounds
	 */
	public RTS_REAL_ARRAY(final RTS_BOUNDS... BOUNDS) {
		super(BOUNDS);
		ELTS = new float[SIZE];
	}

	/**
	 * This method will put a value into ELTS[ix]
	 * @param ix the index of ELTS
	 * @param val the value to put
	 * @return the value stored
	 */
	public float putELEMENT(int ix, float val) {
		ELTS[ix] = val;
		return (val);
	}

	/**
	 * This method will return a value from ELTS[x...]
	 * @param x the index of ELTS
	 * @return the value loaded
	 */
	public float getELEMENT(int... x) {
		return (ELTS[index(x)]);
	}

	/**
	 * Abstract method redefined for all subclass &lt;type>_ARRAY
	 * @return a copy of this RTS_REAL_ARRAY
	 */
	@Override
	public RTS_REAL_ARRAY COPY() {
		RTS_REAL_ARRAY copy = new RTS_REAL_ARRAY(BOUNDS);
		System.arraycopy(ELTS, 0, copy.ELTS, 0, SIZE);
		return (copy);
	}

	@Override
	public double getRealTypeELEMENT(int i) {
		return (ELTS[i]);
	}
}
