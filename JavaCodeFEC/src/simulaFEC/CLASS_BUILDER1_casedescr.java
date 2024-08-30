// JavaLine 1 <== SourceLine 66
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:30 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_BUILDER1_casedescr extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=0, firstLine=66, lastLine=74, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    public int p_ndests;
    public int p_lb;
    public int p_ub;
    public CLASS_BUILDER1_casedescr p_prev;
    public char p_type;
    // Declare locals as attributes
    // JavaLine 15 <== SourceLine 71
    public int tag=0;
    public int jumptag=0;
    // JavaLine 18 <== SourceLine 72
    public int errortag=0;
    // JavaLine 20 <== SourceLine 73
    public CLASS_BUILDER1_indexelt firstelt=null;
    // Normal Constructor
    public CLASS_BUILDER1_casedescr(RTS_RTObject staticLink,int sp_ndests,int sp_lb,int sp_ub,CLASS_BUILDER1_casedescr sp_prev,char sp_type) {
        super(staticLink);
        // Parameter assignment to locals
        this.p_ndests = sp_ndests;
        this.p_lb = sp_lb;
        this.p_ub = sp_ub;
        this.p_prev = sp_prev;
        this.p_type = sp_type;
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_BUILDER1_casedescr _STM() {
        // JavaLine 37 <== SourceLine 74
        // BEGIN casedescr INNER PART
        // ENDOF casedescr INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER1.sim","8 casedescr",1,66,15,71,18,72,20,73,37,74,42,74);
} // End of Class
