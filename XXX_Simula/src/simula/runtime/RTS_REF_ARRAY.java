package simula.runtime;

// ************************************************************
// *** REF() ARRAY
// ************************************************************
/**
 * This class represent a Simula ref(T) array. 
 *
 * @param <T> the actual array type
 */
public final class RTS_REF_ARRAY<T> extends RTS_ARRAY {
	/**
	 * The elements in this RTS_REF_ARRAY
	 */
	final private RTS_RTObject[] ELTS;

	/**
	 * Create a ref() array with the given bounds.
	 * @param BOUNDS the array bounds
	 */
	public RTS_REF_ARRAY(final RTS_BOUNDS... BOUNDS) {
		super(BOUNDS);
		ELTS = new RTS_RTObject[SIZE];
	}

	/**
	 * This method will put a object reference into ELTS[ix]
	 * @param ix the index of ELTS
	 * @param val the value to put
	 * @return the value stored
	 */
	public T putELEMENT(int ix, T val) {
		ELTS[ix] = (RTS_RTObject) val;
		return (val);
	}

	/**
	 * This method will return a value from ELTS[x...]
	 * @param x the indexes of ELTS
	 * @return the value loaded
	 */
	@SuppressWarnings("unchecked")
	public T getELEMENT(int... x) {
		return ((T) ELTS[index(x)]);
	}

	@Override
	public RTS_REF_ARRAY<T> COPY() {
		RTS_REF_ARRAY<T> copy = new RTS_REF_ARRAY<T>(BOUNDS);
		System.arraycopy(ELTS, 0, copy.ELTS, 0, SIZE);
		return (copy);
	}
}
