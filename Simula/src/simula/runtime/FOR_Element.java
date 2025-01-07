/// (CC) This work is licensed under a Creative Commons
/// Attribution 4.0 International License.
/// 
/// You find a copy of the License on the following
/// page: https://creativecommons.org/licenses/by/4.0/
package simula.runtime;

import java.util.Iterator;

/// Abstract class representing a for-statement element, all of 
/// which are Iterator's.
public abstract class FOR_Element implements Iterator<Boolean> {
	/// More to come ?
	boolean more;

	/// Create a for-stament element.
	public FOR_Element() {
		more = true;
	}

	@Override
	public boolean hasNext() {
		return (more);
	}
}
