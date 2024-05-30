package simula.runtime;

// ************************************************************
// *** FRAMEWORK for NonLocal Label-Parameters in Java Coding
// ************************************************************
/**
 * This class represent a Simula Label quantity
 *
 */
@SuppressWarnings("serial")
public final class RTS_EndProgram extends RuntimeException {
//	static final long serialVersionUID = 42L;

	// Constructor
	/**
	 * Constructs a new RTS_EndProgram exception with the specified detail message. 
	 * @param message the detail message.
	 */
	public RTS_EndProgram(final String message) {
		super(message);
	}
}
