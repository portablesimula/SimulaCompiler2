/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler.utilities;

/**
 * The Simula Keywords and some additional symbols.
 * <p>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/utilities/ConsolePanel.java"><b>Source File</b></a>.
 * 
 * @author Øystein Myhre Andersen
 *
 */
public class KeyWord {
	// Simula Reserved Words
	/** Simula Keyword */ public final static int ACTIVATE   = 1;
	/** Simula Keyword */ public final static int AND        = 2;
	/** Simula Keyword */ public final static int AFTER      = 3;
	/** Simula Keyword */ public final static int ARRAY      = 4;
	/** Simula Keyword */ public final static int AT         = 5;
	/** Simula Keyword */ public final static int BEFORE     = 6;
	/** Simula Keyword */ public final static int BEGIN      = 7;
	/** Simula Keyword */ public final static int BOOLEAN    = 8;
	/** Simula Keyword */ public final static int CHARACTER  = 9;
	/** Simula Keyword */ public final static int CLASS      = 10;
	/** Simula Keyword */ public final static int COMMENT    = 11;
	/** Simula Keyword */ public final static int CONC       = 12;
	/** Simula Keyword */ public final static int DELAY      = 13;
	/** Simula Keyword */ public final static int DO         = 14;
	/** Simula Keyword */ public final static int ELSE       = 15;
	/** Simula Keyword */ public final static int END        = 16;
	/** Simula Keyword */ public final static int EQ         = 17;
	/** Simula Keyword */ public final static int EQV        = 18;
	/** Simula Keyword */ public final static int EXTERNAL   = 19;
	/** Simula Keyword */ public final static int FALSE      = 20;
	/** Simula Keyword */ public final static int FOR        = 21;
	/** Simula Keyword */ public final static int GE         = 22;
	/** Simula Keyword */ public final static int GO         = 23;
	/** Simula Keyword */ public final static int GOTO       = 24;
	/** Simula Keyword */ public final static int GT         = 25;
	/** Simula Keyword */ public final static int HIDDEN     = 26;
	/** Simula Keyword */ public final static int IF         = 27;
	/** Simula Keyword */ public final static int IMP        = 28;
	/** Simula Keyword */ public final static int IN         = 29;
	/** Simula Keyword */ public final static int INNER      = 30;
	/** Simula Keyword */ public final static int INSPECT    = 31;
	/** Simula Keyword */ public final static int INTEGER    = 32;
	/** Simula Keyword */ public final static int IS         = 33;
	/** Simula Keyword */ public final static int LABEL      = 34;
	/** Simula Keyword */ public final static int LE         = 35;
	/** Simula Keyword */ public final static int LONG       = 36;
	/** Simula Keyword */ public final static int LT         = 37;
	/** Simula Keyword */ public final static int NAME       = 38;
	/** Simula Keyword */ public final static int NE         = 39;
	/** Simula Keyword */ public final static int NEW        = 40;
	/** Simula Keyword */ public final static int NONE       = 41;
	/** Simula Keyword */ public final static int NOT        = 42;
	/** Simula Keyword */ public final static int NOTEXT     = 43;
	/** Simula Keyword */ public final static int OR         = 44;
	/** Simula Keyword */ public final static int OTHERWISE  = 45;
	/** Simula Keyword */ public final static int PRIOR      = 46;
	/** Simula Keyword */ public final static int PROCEDURE  = 47;
	/** Simula Keyword */ public final static int PROTECTED  = 48;
	/** Simula Keyword */ public final static int QUA        = 49;
	/** Simula Keyword */ public final static int REACTIVATE = 50;
	/** Simula Keyword */ public final static int REAL       = 51;
	/** Simula Keyword */ public final static int REF        = 52;
	/** Simula Keyword */ public final static int SHORT      = 53;
	/** Simula Keyword */ public final static int STEP       = 54;
	/** Simula Keyword */ public final static int SWITCH     = 55;
	/** Simula Keyword */ public final static int TEXT       = 56;
	/** Simula Keyword */ public final static int THEN       = 57;
	/** Simula Keyword */ public final static int THIS       = 58;
	/** Simula Keyword */ public final static int TO         = 59;
	/** Simula Keyword */ public final static int TRUE       = 60;
	/** Simula Keyword */ public final static int UNTIL      = 61;
	/** Simula Keyword */ public final static int VALUE      = 62;
	/** Simula Keyword */ public final static int VIRTUAL    = 63;
	/** Simula Keyword */ public final static int WHEN       = 64;
	/** Simula Keyword */ public final static int WHILE      = 65;
	// Other Symbols
	/** Simula Symbol */ public final static int ASSIGNVALUE = 66;
	/** Simula Symbol */ public final static int ASSIGNREF = 67;
	/** Simula Symbol */ public final static int COMMA = 68;
	/** Simula Symbol */ public final static int COLON = 69;
	/** Simula Symbol */ public final static int SEMICOLON = 70;
	/** Simula Symbol */ public final static int BEGPAR = 71;
	/** Simula Symbol */ public final static int ENDPAR = 72;
	/** Simula Symbol */ public final static int BEGBRACKET =73;
	/** Simula Symbol */ public final static int ENDBRACKET = 74;
	/** Simula Symbol */ public final static int EQR = 75;
	/** Simula Symbol */ public final static int NER = 76;
	/** Simula Symbol */ public final static int PLUS = 77;
	/** Simula Symbol */ public final static int MINUS = 78;
	/** Simula Symbol */ public final static int MUL = 79;
	/** Simula Symbol */ public final static int DIV = 80;
	/** Simula Symbol */ public final static int INTDIV = 81;
	/** Simula Symbol */ public final static int EXP = 82;
	/** Simula Symbol */ public final static int IDENTIFIER = 83;
	/** Simula Symbol */ public final static int BOOLEANKONST = 84;
	/** Simula Symbol */ public final static int INTEGERKONST = 85;
	/** Simula Symbol */ public final static int CHARACTERKONST = 86;
	/** Simula Symbol */ public final static int REALKONST = 87;
	/** Simula Symbol */ public final static int TEXTKONST = 88;
	/** Simula Symbol */ public final static int OR_ELSE = 89;
	/** Simula Symbol */ public final static int AND_THEN = 90;
	/** Simula Symbol */ public final static int DOT = 91;
	/** Simula Symbol */ public final static int NEWLINE = 92;
	/** Simula Symbol */ public final static int STRING = 93;
	
	public static String edit(int key) {
		switch (key) {
		case ACTIVATE   : return("ACTIVATE"); // 1;
		case AND        : return("AND"); // 2;
		case AFTER      : return("AFTER"); // 3;
		case ARRAY      : return("ARRAY"); // 4;
		case AT         : return("at"); // 5;
		case BEFORE     : return("BEFORE"); // 6;
		case BEGIN      : return("BEGIN"); // 7;
		case BOOLEAN    : return("BOOLEAN"); // 8;
		case CHARACTER  : return("CHARACTER"); // 9;
		case CLASS      : return("CLASS"); // 10;
		case COMMENT    : return("COMMENT"); // 11;
		case CONC       : return("CONC"); // 12;
		case DELAY      : return("DELAY"); // 13;
		case DO         : return("DO"); // 14;
		case ELSE       : return("ELSE"); // 15;
		case END        : return("END"); // 16;
		case EQ         : return("EQ"); // 17;
		case EQV        : return("EQV"); // 18;
		case EXTERNAL   : return("EXTERNAL"); // 19;
		case FALSE      : return("FALSE"); // 20;
		case FOR        : return("FOR"); // 21;
		case GE         : return("GE"); // 22;
		case GO         : return("GO"); // 23;
		case GOTO       : return("GOTO"); // 24;
		case GT         : return("GT"); // 25;
		case HIDDEN     : return("HIDDEN"); // 26;
		case IF         : return("IF"); // 27;
		case IMP        : return("IMP"); // 28;
		case IN         : return("IN"); // 29;
		case INNER      : return("INNER"); // 30;
		case INSPECT    : return("INSPECT"); // 31;
		case INTEGER    : return("INTEGER"); // 32;
		case IS         : return("IS"); // 33;
		case LABEL      : return("LABEL"); // 34;
		case LE         : return("LE"); // 35;
		case LONG       : return("LONG"); // 36;
		case LT         : return("LT"); // 37;
		case NAME       : return("NAME"); // 38;
		case NE         : return("NE"); // 39;
		case NEW        : return("NEW"); // 40;
		case NONE       : return("NONE"); // 41;
		case NOT        : return("NOT"); // 42;
		case NOTEXT     : return("NOTEXT"); // 43;
		case OR         : return("OR"); // 44;
		case OTHERWISE  : return("OTHERWISE"); // 45;
		case PRIOR      : return("PRIOR"); // 46;
		case PROCEDURE  : return("PROCEDURE"); // 47;
		case PROTECTED  : return("PROTECTED"); // 48;
		case QUA        : return("QUA"); // 49;
		case REACTIVATE : return("REACTIVATE"); // 50;
		case REAL       : return("REAL"); // 51;
		case REF        : return("REF"); // 52;
		case SHORT      : return("SHORT"); // 53;
		case STEP       : return("STEP"); // 54;
		case SWITCH     : return("SWITCH"); // 55;
		case TEXT       : return("TEXT"); // 56;
		case THEN       : return("THEN"); // 57;
		case THIS       : return("THIS"); // 58;
		case TO         : return("TO"); // 59;
		case TRUE       : return("TRUE"); // 60;
		case UNTIL      : return("UNTIL"); // 61;
		case VALUE      : return("VALUE"); // 62;
		case VIRTUAL    : return("VIRTUAL"); // 63;
		case WHEN       : return("WHEN"); // 64;
		case WHILE      : return("WHILE"); // 65;
		// Other Symbols
		case ASSIGNVALUE:    return("ASSIGNVALUE"); // 66;
		case ASSIGNREF:      return("ASSIGNREF"); // 67;
		case COMMA:          return("COMMA"); // 68;
		case COLON:          return("COLON"); // 69;
		case SEMICOLON:      return("SEMICOLON"); // 70;
		case BEGPAR:         return("BEGPAR"); // 71;
		case ENDPAR:         return("ENDPAR"); // 72;
		case BEGBRACKET:     return("BEGBRACKET"); //73;
		case ENDBRACKET:     return(""); // 74;
		case EQR:            return("EQR"); // 75;
		case NER:            return("NER"); // 76;
		case PLUS:           return("PLUS"); // 77;
		case MINUS:          return("MINUS"); // 78;
		case MUL:            return("MUL"); // 79;
		case DIV:            return("DIV"); // 80;
		case INTDIV:         return("INTDIV"); // 81;
		case EXP:            return("EXP"); // 82;
		case IDENTIFIER:     return("IDENTIFIER"); // 83;
		case BOOLEANKONST:   return("BOOLEANKONST"); // 84;
		case INTEGERKONST:   return("INTEGERKONST"); // 85;
		case CHARACTERKONST: return("CHARACTERKONST"); // 86;
		case REALKONST:      return("REALKONST"); // 87;
		case TEXTKONST:      return("TEXTKONST"); // 88;
		case OR_ELSE:        return("OR_ELSE"); // 89;
		case AND_THEN:       return("AND_THEN"); // 90;
		case DOT:            return("DOT"); // 91;
		case NEWLINE:        return("NEWLINE"); // 92;
		case STRING:         return("STRING"); // 93;
		}
		return("Unknown:"+key);
	}
	
	/**
	 * Returns the corresponding Java code.
	 * @return the corresponding Java code
	 */
	public static String toJavaCode(int key) {
		switch (key) {
		case NONE: return("null");
		case NOTEXT: return("null");
		case ASSIGNVALUE: return(":=");
		case ASSIGNREF: return(":-");
		case EQ: return ("==");
		case GE: return (">=");
		case GT: return (">");
		case LE: return ("<=");
		case LT: return ("<");
		case NE: return ("!=");
		case EQR: return ("==");
		case NER: return ("!=");
		case IN: return (" instanceof ");
		case PLUS: return ("+");
		case MINUS: return ("-");
		case MUL: return ("*");
		case DIV: return ("/");
		case INTDIV: return ("/");  
		case EXP: return ("^"); 
		case NOT: return ("!");
		case AND: return ("&");
		case OR: return ("|");
		case IMP: return (" imp "); //  x -> y   ==>   !x | y
		case EQV: return (" == ");
		case AND_THEN: return ("&&");
		case OR_ELSE: return ("||");
		case DOT: return (".");
		default: return (edit(key));
		}
 }

}
