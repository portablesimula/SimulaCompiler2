// JavaLine 1 <== SourceLine 356
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_SCANNER_input extends RTS_CLASS {
    // ClassDeclaration: Kind=9, BlockLevel=2, PrefixLevel=0, firstLine=356, lastLine=390, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    public boolean p_inserted;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 359
    public boolean liston=false;
    // JavaLine 13 <== SourceLine 360
    public char lexatom=0;
    // JavaLine 15 <== SourceLine 361
    public int lexpos=0;
    public int lexlen=0;
    // JavaLine 18 <== SourceLine 362
    public RTS_TXT lexline=null;
    // JavaLine 20 <== SourceLine 363
    public int linlen=0;
    // JavaLine 22 <== SourceLine 364
    public CLASS_SCANNER_input prev=null;
    // JavaLine 24 <== SourceLine 365
    public RTS_TXT t=null;
public RTS_PRCQNT close_0(){ throw new RTS_SimulaRuntimeError("No Virtual Match: close"); }
    // Normal Constructor
    public CLASS_SCANNER_input(RTS_RTObject staticLink,boolean sp_inserted) {
        super(staticLink);
        // Parameter assignment to locals
        this.p_inserted = sp_inserted;
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_SCANNER_input _STM() {
        // JavaLine 38 <== SourceLine 390
        // BEGIN input INNER PART
        // ENDOF input INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCANNER.sim","9 input",1,356,11,359,13,360,15,361,18,362,20,363,22,364,24,365,38,390,43,390);
} // End of Class
