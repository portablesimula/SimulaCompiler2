package simula.runtime;

import java.util.Iterator;

/**
 * 
 * Abstract class representing a for-statement element, all of 
 * which are Iterator's.
 * 
 */
public abstract class FOR_Element implements Iterator<Boolean> {
	/**
	 * More to come ?
	 */
	boolean more;

	/**
	 * Create a for-stament element.
	 */
	public FOR_Element() {
		more = true;
	}

	@Override
	public boolean hasNext() {
		return (more);
	}
}
