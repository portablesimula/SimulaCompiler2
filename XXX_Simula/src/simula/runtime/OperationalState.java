package simula.runtime;

/**
 * Simula object Operational States
 */
public enum OperationalState {
	/**
	 * The object is attached
	 */
	attached,
	/**
	 * The object is detached
	 */
	detached,
	/**
	 * The object is resumed
	 */
	resumed,
	/**
	 * The object is terminated
	 */
	terminated,
	/**
	 * The Process object is shuting down
	 */
	terminatingProcess
}
