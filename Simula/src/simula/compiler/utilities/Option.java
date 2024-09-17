/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.utilities;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Compile Time Options.
 * <p>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/utilities/Option.java"><b>Source File</b></a>.
 * 
 * @author Øystein Myhre Andersen
 *
 */
public final class Option {
	
	/**
	 * Source file is case sensitive.
	 */
	public static boolean CaseSensitive=false;
	
	/**
	 * Output messages about what the compiler is doing.
	 */
	public static boolean verbose = false; 
	
	/**
	 * Generate warning messages
	 */
	public static boolean WARNINGS=true;
	
	/**
	 * true: Don't execute generated .jar file
	 */
	public static boolean noExecution = false;
	
	/**
	 * false: Disable all language extensions. In other words,
	 * follow the Simula Standard literally
	 */
	public static boolean EXTENSIONS=true;

	/**
	 * Testing and debugging options
	 */
	public static class internal {
		/** Default Constructor: NOT USED */ public internal() { Util.IERR(); }

		/**
		 * Use the SimulaClassLoader instead of the executable jar file
		 */
		public static boolean USE_SimulaClassLoader = false;
		
		/**
		 * Used to insert code to enforce 'stack size mismatch'
		 */
		public static boolean TESTING_STACK_SIZE = false;

		/**
		 * Create Java source intermediate files
		 */
		public static boolean CREATE_JAVA_SOURCE = false;

		/**
		 * List generated .class files
		 */
		public static boolean LIST_GENERATED_CLASS_FILES = false;

		/**
		 * INLINE_TESTING on/off
		 */
		public static boolean INLINE_TESTING = false; 
		
		/**
		 * S-PORT extensions  on/off
		 */
		public static boolean SPORT=false;
		
		/**
		 * Used by Java-Coding to save the generated .java files.
		 * If not set, a temp directory is used/created.
		 */
		public static File keepJava = null;


		// Overall TRACING Options
		/** Debug option */	public static boolean TRACING=false;
		/** Debug option */	public static boolean DEBUGGING=false;		// Set by EditorMenues - doDebugAction

		// Scanner Trace Options
		/** Debug option */	public static boolean TRACE_SCAN=false;
		/** Debug option */	public static boolean TRACE_COMMENTS=false;

		// Parser Trace Options
		/** Debug option */	public static boolean TRACE_PARSE=false;
		/** Debug option */	public static int PRINT_SYNTAX_TREE=0;
		/** Debug option */	public static boolean TRACE_ATTRIBUTE_OUTPUT=false;
		/** Debug option */	public static boolean TRACE_ATTRIBUTE_INPUT=false;

		// Checker Trace Options
		/** Debug option */	public static boolean TRACE_CHECKER=false;
		/** Debug option */	public static boolean TRACE_CHECKER_OUTPUT=false;
		/** Debug option */	public static int TRACE_FIND_MEANING=0;

		// Java Coder Options
		/** Debug option */	public static boolean TRACE_CODING=false;         // Only when .java output
		/** Debug option */	public static boolean GNERATE_LINE_CALLS=false;   // Only when .java output

		// Byte code engineering Options
		/** Debug option */	public static boolean TRACE_BYTECODE_OUTPUT=false;
		/** Debug option */	public static boolean LIST_REPAIRED_INSTRUCTION_LIST=false;
		/** Debug option */	public static boolean TRACE_REPAIRING=false;
		/** Debug option */	public static boolean LIST_INPUT_INSTRUCTION_LIST=false;
		/** Debug option */	public static boolean TRACE_REPAIRING_INPUT=false;
		/** Debug option */	public static boolean TRACE_REPAIRING_OUTPUT=false;

		/** Runtime Options */ public static String SOURCE_FILE="";
		/** Runtime Options */ public static String RUNTIME_USER_DIR="";
		
		/**
		 * Initiate Compiler options
		 */
		public static void InitCompilerOptions() {
			Option.internal.SPORT=false;

			// Overall TRACING Options
			Option.internal.TRACING=false;
			Option.internal.DEBUGGING=false;

			// Scanner Trace Options
			Option.internal.TRACE_SCAN=false;
			Option.internal.TRACE_COMMENTS=false;

			// Parser Trace Options
			Option.internal.TRACE_PARSE=false;

			// Checker Trace Options
			Option.internal.TRACE_CHECKER=false;
			Option.internal.TRACE_CHECKER_OUTPUT=false;

			// Coder Trace Options
			Option.internal.TRACE_CODING=false;

		}

	}
	
	/**
	 * The default constructor
	 */
	private Option() {}
	
	/**
	 * Initiate Compiler options.
	 */
	public static void InitCompilerOptions() {
		Option.CaseSensitive=false;
		Option.verbose = false;
		Option.noExecution = false;
		Option.WARNINGS=false;
		Option.EXTENSIONS=true;
		
		Option.internal.InitCompilerOptions();
	}

	/**
	 * Returns the option name 'id'
	 * @param id option id
	 * @return the option name 'id'
	 */
	public static boolean getOption(String id) {
		if(id.equalsIgnoreCase("CaseSensitive")) return(CaseSensitive); 
		if(id.equalsIgnoreCase("VERBOSE")) return(verbose); 
		if(id.equalsIgnoreCase("noExecution")) return(noExecution); 
		if(id.equalsIgnoreCase("WARNINGS")) return(WARNINGS); 
		if(id.equalsIgnoreCase("EXTENSIONS")) return(EXTENSIONS); 
		if(id.equalsIgnoreCase("SPORT")) return(internal.SPORT); 
		if(id.equalsIgnoreCase("TRACING")) return(internal.TRACING); 
		if(id.equalsIgnoreCase("TRACE_SCAN")) return(internal.TRACE_SCAN); 
		if(id.equalsIgnoreCase("TRACE_COMMENTS")) return(internal.TRACE_COMMENTS); 
		if(id.equalsIgnoreCase("TRACE_PARSE")) return(internal.TRACE_PARSE); 
		if(id.equalsIgnoreCase("TRACE_ATTRIBUTE_OUTPUT")) return(internal.TRACE_ATTRIBUTE_OUTPUT); 
		if(id.equalsIgnoreCase("TRACE_ATTRIBUTE_INPUT")) return(internal.TRACE_ATTRIBUTE_INPUT); 
		if(id.equalsIgnoreCase("TRACE_CHECKER")) return(internal.TRACE_CHECKER); 
		if(id.equalsIgnoreCase("TRACE_CHECKER_OUTPUT")) return(internal.TRACE_CHECKER_OUTPUT); 
		if(id.equalsIgnoreCase("TRACE_CODING")) return(internal.TRACE_CODING); 
		if(id.equalsIgnoreCase("TRACE_BYTECODE_OUTPUT")) return(internal.TRACE_BYTECODE_OUTPUT); 
		return(false);
	}


	/**
	 * Set the option named 'id' to the given value
	 * @param id option id
	 * @param val new option value
	 */
	public static void setOption(String id,boolean val) {
		if(id.equalsIgnoreCase("CaseSensitive")) CaseSensitive=val; 
		if(id.equalsIgnoreCase("VERBOSE")) verbose=val; 
		if(id.equalsIgnoreCase("noExecution")) noExecution=val; 
		if(id.equalsIgnoreCase("WARNINGS")) WARNINGS=val; 
		if(id.equalsIgnoreCase("EXTENSIONS")) EXTENSIONS=val; 
		if(id.equalsIgnoreCase("SPORT")) internal.SPORT=val; 
		if(id.equalsIgnoreCase("TRACING")) internal.TRACING=val; 
		if(id.equalsIgnoreCase("TRACE_SCAN")) internal.TRACE_SCAN=val; 
		if(id.equalsIgnoreCase("TRACE_COMMENTS")) internal.TRACE_COMMENTS=val; 
		if(id.equalsIgnoreCase("TRACE_PARSE")) internal.TRACE_PARSE=val; 
		if(id.equalsIgnoreCase("TRACE_ATTRIBUTE_OUTPUT")) internal.TRACE_ATTRIBUTE_OUTPUT=val; 
		if(id.equalsIgnoreCase("TRACE_ATTRIBUTE_INPUT")) internal.TRACE_ATTRIBUTE_INPUT=val; 
		if(id.equalsIgnoreCase("TRACE_CHECKER")) internal.TRACE_CHECKER=val; 
		if(id.equalsIgnoreCase("TRACE_CHECKER_OUTPUT")) internal.TRACE_CHECKER_OUTPUT=val; 
		if(id.equalsIgnoreCase("TRACE_CODING")) internal.TRACE_CODING=val; 
		if(id.equalsIgnoreCase("TRACE_BYTECODE_OUTPUT")) internal.TRACE_BYTECODE_OUTPUT=val; 
	}

	/**
	 * Editor Utility: Select Compiler Options.
	 */
	public static void selectCompilerOptions() {
		JPanel panel=new JPanel();
		panel.setBackground(Color.white);
		panel.add(checkBox("CaseSensitive","Source file is case sensitive."));
		panel.add(checkBox("Verbose","Output messages about what the compiler is doing"));
		panel.add(checkBox("Warnings","Generate warning messages"));
		panel.add(checkBox("Extensions","Disable all language extensions. In other words, follow the Simula Standard literally"));
		panel.add(checkBox("noExecution","Don't execute generated .jar file"));
		if(Option.internal.DEBUGGING) {
			panel.add(checkBox("TRACING","Debug option"));
			panel.add(checkBox("TRACE_SCAN","Debug option"));
			panel.add(checkBox("TRACE_COMMENTS","Debug option"));
			panel.add(checkBox("TRACE_PARSE","Debug option"));
			panel.add(checkBox("TRACE_ATTRIBUTE_OUTPUT","Debug option"));
			panel.add(checkBox("TRACE_ATTRIBUTE_INPUT","Debug option"));
			panel.add(checkBox("TRACE_CHECKER","Debug option"));
			panel.add(checkBox("TRACE_CHECKER_OUTPUT","Debug option"));
			panel.add(checkBox("TRACE_CODING","Debug option"));
			panel.add(checkBox("TRACE_BYTECODE_OUTPUT","Debug option"));
		}
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		Util.optionDialog(panel,"Select Compiler Options",JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE,"Ok");
	}

	/**
	 * Editor Utility: Create a checkBox with tooltips.
	 * @param id option id
	 * @param tooltip option's tooltip or null
	 * @return the resulting check box
	 */
	private static JCheckBox checkBox(String id,String tooltip) {
        JCheckBox item = new JCheckBox(id);
    	item.setBackground(Color.white);
        item.setSelected(Option.getOption(id));
        item.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Option.setOption(id,item.isSelected());
		}});
        if(tooltip != null) item.setToolTipText(tooltip);
        item.addMouseListener(new MouseAdapter() {
            Color color = item.getBackground();
            @Override
            public void mouseEntered(MouseEvent me) {
               color = item.getBackground();
               item.setBackground(Color.lightGray); // change the color to lightGray when mouse over a button
            }
            @Override
            public void mouseExited(MouseEvent me) {
            	item.setBackground(color);
            }
         });
        return(item);
	}

	
//	public static JFrame popup(JCheckBox checkBox) {
//    	JFrame frame=new JFrame();
////        frame.setSize(800, 500); // Initial frame size
//        frame.setSize(950, 500); // Initial frame size
//        frame.setTitle("Runtime Console");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLocationRelativeTo(checkBox);
//
//        frame.getContentPane().add(new JTextArea("Abracadab"));
//        frame.setVisible(true);
//        return(frame);
//    }

}