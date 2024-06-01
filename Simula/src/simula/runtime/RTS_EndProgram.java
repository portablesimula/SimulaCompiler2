package simula.runtime;

@SuppressWarnings("serial")
public final class RTS_EndProgram extends RuntimeException {

	/**
	 * Constructs a new RTS_EndProgram exception with the specified detail message. 
	 * @param message the detail message.
	 */
	public RTS_EndProgram(final String message) {
		super(message);
	}
}
