package simula.runtime;

import java.io.File;

/**
 *  S-PORT Options
 *
 */
public class RTS_SPORT_Option {
	/**
	 * Default constructor.
	 */
	private RTS_SPORT_Option() {}
	
	/**
	 * Returns S-PORT Module name
	 * @return S-PORT Module name
	 */
	private static String getModuleName() {
		return (new File(SPORT_SourceFileName).getName());
	}

	/**
	 * S-PORT: Source directory name
	 */
	static String SourceDirName = "C:/GitHub/SimulaCompiler/Simula/src/sport/rts";

	/**
	 * S-PORT: Source file name
	 */
	static String SPORT_SourceFileName = SourceDirName + "/ModuleName";

	/**
	 * S-PORT: Source file name
	 */
	static String SPORT_SCodeFileName = null;
	
	/**
	 * S-PORT: Sysinsert directory name.
	 */
	static String SPORT_SysInsertDirName = "C:/WorkSpaces/SPort-System/S_Port/src/sport/rts";

	/**
	 * Returns the source file name.
	 * <p>
	 * Used by ENVIRONMENT'getTextInfo
	 * @return the source file name
	 */
	static String getSourceFileName() {
		return (SPORT_SourceFileName);
	}

	/**
	 * The S-PORT listing file
	 */
	static String ListingFileName = null; //"#sysout";
	
	public static void print_SPORT_Options() {
		System.out.println("print_SPORT_Options: FEC_Verbose:            " + FEC_Verbose);
		System.out.println("print_SPORT_Options: FEC_TraceLevel:         " + FEC_TraceLevel);
		System.out.println("print_SPORT_Options: ModuleName:             " + getModuleName());
		System.out.println("print_SPORT_Options: SourceDirName:          " + SourceDirName);
		System.out.println("print_SPORT_Options: SPORT_SourceFileName:   " + SPORT_SourceFileName);
		System.out.println("print_SPORT_Options: SPORT_SysInsertDirName: " + SPORT_SysInsertDirName);
		System.out.println("print_SPORT_Options: ListingFileName:        " + ListingFileName);
		System.out.println("print_SPORT_Options: SCodeFileName():        " + getSCodeFileName());
		System.out.println("print_SPORT_Options: FEC_TraceScode:         " + FEC_TraceScode);
	}

	/**
	 * Returns the S-Code file name.
	 * <p>
	 * Used by ENVIRONMENT'getTextInfo
	 * @return the S-Code file name
	 */
	static String getSCodeFileName() {
		if(SPORT_SCodeFileName != null)	return SPORT_SCodeFileName;
		return (createSubfileName("scode", getModuleName() + ".scd"));
	}

	/**
	 * Utility: Create sub-file-name
	 * @param subdir sub-directory
	 * @param name file-name
	 * @return the resulting file-name
	 */
	private static String createSubfileName(String subdir, String name) {
		String tempFileName = SourceDirName + "/" + subdir + "/" + name;
		File file = new File(tempFileName);
		file.getParentFile().mkdirs();
		return (tempFileName);
	}

	/**
	 * Returns the scratch file name.
	 * <p>
	 * Used by ENVIRONMENT'getTextInfo
	 * @return the scratch file name
	 */
	static String getScratchFileName() {
		return (createSubfileName("temp", getModuleName() + ".tmp"));
	}

	/**
	 * Returns the attribute output file name.
	 * <p>
	 * Used by ENVIRONMENT'getTextInfo
	 * @return the attribute output file name
	 */
	static String getAttributeOutputFileName() {
		return (createSubfileName("temp", currentModuleID + ".atr"));
	}

	/**
	 * Returns the external attribute file name.
	 * <p>
	 * Used by ENVIRONMENT'getTextInfo
	 * @return the external attribute file name
	 */
	static String getExternalAttributeFileName() {
		// 12 What is the name of the attribute file for an external declaration?
		// Before this request is issued, the environment will have received the
		// identifier (extIdent) and the
		// external identifier (extFile) for the external declaration through the
		// routine give_textinfo
		if (extFile != null) {
			return (extFile);
		}
		String fileName = createSubfileName("temp", extIdent + ".atr");
		File file = new File(fileName);
		if (!file.exists()) {
			String name = extIdent;
			int i = name.indexOf('.');
			if (i > 0)
				name = name.substring(0, i);
			fileName = SPORT_SysInsertDirName + "/temp/" + name + ".atr";
			file = new File(fileName);
//			if (!file.exists())
//				System.out.println("_RT.getExternalAttributeFileName: \"" + file + "\"  does NOT exists");
		}
		return (fileName);
	}

	/**
	 * Selectors for conditional compilation.
	 */
	static String Selectors = "AZ";

	// The following file is created when front-end compiling the RTS:
	/**
	 * Name of attribute file for the predefined classes etc. 
	 * <p>
	 * NOTE: This file is created when front-end compiling the RTS:
	 */
//	static String PredefFileName = "C:/WorkSpaces/SPort-System/S_Port/Attrs/FEC/PREDEF.atr";
	static String PredefFileName = "C:/GitHub/S-Port-Simula/FEC/Attrs/FEC/PREDEF.atr";

	/**
	 * Name of a file containing seldom used information for the front end compiler,
	 * such as extended error messages.
	 */
	static String XmessageFileName = "C:/WorkSpaces/SPort-System/S_Port/src/sport/fec/FECERROR.txt";
	
	/** Used by getIntInfo. */ static int GenerateScode = 1;
	/** Used by getIntInfo. */ static int MaxErrors = 50;
	/** Used by getIntInfo. */ static int GiveNotes = 1;
//	/** Used by getIntInfo. */ static int TraceLevel = 0;
	/** Used by getIntInfo. */ static int Recompilation = 0;
	/** Used by getIntInfo. */ static int SimobLevel = 0;
	/** Used by getIntInfo. */ static int FEC_Verbose = 0;
	/** Used by getIntInfo. */ static int FEC_TraceScode = 0;
	/** Used by getIntInfo. */ static int FEC_TraceLevel = 0;

	/**
	 * Used by giveTextInfo(1) The identifier of a class or procedure being separately compiled.
	 * E.g class or procedure identifier
	 */
	static String currentModuleID;
	/**
	 * Used by giveTextInfo(2)The identifier given in an external declaration that is being processed.
	 * E.g class or procedure identifier
	 */
	static String extIdent;
	/**
	 * Used by giveTextInfo(3) The external identification given in an external declaration that
	 * is being processed. E.g. FileName
	 */
	static String extFile;
}

