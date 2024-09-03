// JavaLine 1 <== SourceLine 826
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:45 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_COMMON_stackedb extends RTS_CLASS {
    // ClassDeclaration: Kind=9, BlockLevel=2, PrefixLevel=0, firstLine=826, lastLine=833, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    public char p_oldblev;
    public char p_oldrtblev;
    public int p_oldconnests;
    public char p_oldinsp;
    public CLASS_COMMON_stackedb p_prev;
    // Declare locals as attributes
    // JavaLine 15 <== SourceLine 833
    public CLASS_COMMON_stackedi redeclChain=null;
    // Normal Constructor
    public CLASS_COMMON_stackedb(RTS_RTObject staticLink,char sp_oldblev,char sp_oldrtblev,int sp_oldconnests,char sp_oldinsp,CLASS_COMMON_stackedb sp_prev) {
        super(staticLink);
        // Parameter assignment to locals
        this.p_oldblev = sp_oldblev;
        this.p_oldrtblev = sp_oldrtblev;
        this.p_oldconnests = sp_oldconnests;
        this.p_oldinsp = sp_oldinsp;
        this.p_prev = sp_prev;
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_COMMON_stackedb _STM() {
        // BEGIN stackedb INNER PART
        // ENDOF stackedb INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","9 stackedb",1,826,15,833,36,833);
} // End of Class
