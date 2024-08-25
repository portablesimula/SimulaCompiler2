package simula.runtime;

import java.util.Iterator;

// *******************************************************
// *** FRAMEWORK for for-list iteration
// *******************************************************
/**
 * The Implementation of the for-statement is a bit tricky.
 * The basic idea is to create a ForList iterator that iterates over a set of ForElt iterators.
 * The following subclasses of ForElt are defined:
 * <ul>
 * <li> {@link SingleElt SingleElt&lt;T>} for basic types T control variable
 * <li> {@link SingleTValElt SingleTValElt} for Text type control variable
 * <li> {@link StepUntil StepUntil} for numeric types
 * <li> {@link WhileElt WhileElt&lt;T>} for basic types T control variable
 * <li> {@link WhileTValElt WhileTValElt} representing For t:= &lt;TextExpr> while &lt;Cond>
 *                  	With text value assignment
 * </ul>
 * Each of which has a boolean method 'hasNext' indicating whether this for-element is exhausted.
 * All parameters to these classes are transferred 'by name'.
 * This is done to ensure that all expressions are evaluated in the right order.
 * The assignment to the 'control variable' is done within the various for-elements when the 'next' method is invoked.
 *
 */

/**
 * Simula for-statement for-list iterator
 * 
 */
public final class FOR_ListIterator implements Iterator<Boolean> {
	/**
	 * The ForElt array.
	 */
	final FOR_Element[] forElt;
	/**
	 * Current index into the ForElt array.
	 */
	int index;

	/**
	 * Create a ForListIterator consisting of an array of ForElt Iterators.
	 * @param forElt an array of ForElt Iterators.
	 */
	public FOR_ListIterator(final FOR_Element... forElt) {
		this.forElt = forElt;
	}

	@Override
	public boolean hasNext() {
		return (index < forElt.length && forElt[index].hasNext());
	}

	@Override
	public Boolean next() {
		Boolean val = forElt[index].next();
		if (!forElt[index].hasNext())
			index++;
		return (val);
	}
}
