package simula.runtime;

import java.util.Iterator;

public final class FOR_List implements Iterable<Boolean> {
	/**
	 * The ForList Iterator.
	 */
	FOR_ListIterator forListIterator;

	/**
	 * Create a ForList Iterator.
	 * @param forElt an array of ForElt Iterators.
	 */
	public FOR_List(final FOR_Element... forElt) {
		forListIterator = new FOR_ListIterator(forElt);
	}

	@Override
	public Iterator<Boolean> iterator() {
		return (forListIterator);
	}
}
