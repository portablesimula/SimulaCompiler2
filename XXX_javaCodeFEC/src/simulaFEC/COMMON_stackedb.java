// JavaLine 1 <== SourceLine 826
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:19 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class COMMON_stackedb extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=0, firstLine=826, lastLine=833, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    public char p_oldblev;
    public char p_oldrtblev;
    public int p_oldconnests;
    public char p_oldinsp;
    public COMMON_stackedb p_prev;
    // Declare locals as attributes
    // JavaLine 15 <== SourceLine 833
    public COMMON_stackedi redeclChain=null;
    // Normal Constructor
    public COMMON_stackedb(RTS_RTObject staticLink,char sp_oldblev,char sp_oldrtblev,int sp_oldconnests,char sp_oldinsp,COMMON_stackedb sp_prev) {
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
    public COMMON_stackedb _STM() {
        // BEGIN INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","8 stackedb",1,826,15,833,36,833);
} // End of Class
