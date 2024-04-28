package simula.runtime;

// ************************************************************
// *** REAL TYPE ARRAY
// ************************************************************
/**
 * This class is the common superclass for real type arrays. 
 * It is introduced to implement overloading of real type parameter arrays.
 *
 */
public abstract class RTS_REALTYPE_ARRAY extends RTS_ARRAY {

	/**
	 * Create a real-type array with the given bounds.
	 * @param BOUNDS the array bounds
	 */
	public RTS_REALTYPE_ARRAY(final RTS_BOUNDS... BOUNDS) {
		super(BOUNDS);
	}

	/**
	 * Utility for fetching value of a real type array
	 * <p>
	 * Used by: Reandom drawing discrete and linear procedures.
	 * @param i index
	 * @return value of ELTS[i]
	 */
	public abstract double getRealTypeELEMENT(int i);
}
