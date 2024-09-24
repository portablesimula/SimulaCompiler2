package simula.runtime;

/**
 *  Runtime Options
 *
 */
public class RTS_Option {
	
	/**
	 * Default constructor.
	 */
	RTS_Option() {}
	public static boolean TESTING = true; //false; //true;

	/**
	 * Output messages about what the RTS is doing.
	 * Default: false.
	 */
	public static boolean VERBOSE = false;
	
	/**
	 * Map sysout and sysin to a popUp Console.
	 * Default: false.
	 */
	public static boolean USE_CONSOLE = false;
	
	/**
	 * Debug: Trace enter and exit of blocks, classes and procedures.
	 * Default: false.
	 */
	public static boolean BLOCK_TRACING = false;
	
	/**
	 * Debug: Trace goto statements.
	 * Default: false.
	 */
	public static boolean GOTO_TRACING = false;
	
	/**
	 *  Debug: Trace detach, resume and call.
	 * Default: false.
	 */
	public static boolean QPS_TRACING = false;
	
	/**
	 * Debug: Trace Simulation events.
	 * Default: false.
	 */
	public static boolean SML_TRACING = false;
	
	/**
	 * Specify where Simula files (Outfile, Infile, ...) are written and read.
	 * Default: User working directory. System.property("user.dir")
	 */
	public static String RUNTIME_USER_DIR = "";
}
