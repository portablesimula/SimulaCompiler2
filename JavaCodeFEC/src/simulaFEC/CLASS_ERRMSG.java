// JavaLine 1 <== SourceLine 3
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:47 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_ERRMSG extends CLASS_COMMON {
    // ClassDeclaration: Kind=9, BlockLevel=1, PrefixLevel=1, firstLine=3, lastLine=993, hasLocalClasses=true, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 27
    public int numwarnfound_1=0;
    // JavaLine 12 <== SourceLine 28
    public int maxerrno_1=0;
    // JavaLine 14 <== SourceLine 29
    public final int uplim_1=(int)(450);
    // JavaLine 16 <== SourceLine 31
    public RTS_Directfile ERRORFILE_1=null;
    public boolean ERRnotopen_1=false;
    // JavaLine 19 <== SourceLine 32
    public final int messlength_1=(int)(50);
    // JavaLine 21 <== SourceLine 155
    public int lasterrpos_1=0;
    public int lasterrmess_1=0;
    public int errloop_1=0;
    // JavaLine 25 <== SourceLine 156
    public int lasterrline_1=0;
    // JavaLine 27 <== SourceLine 457
    public CLASS_ERRMSG_ERRORTEXT errtxt_1=null;
    public RTS_PRCQNT COMMONerror_0() { return(new RTS_PRCQNT(this,CLASS_ERRMSG_COMMONerror.class)); }
    // Normal Constructor
    public CLASS_ERRMSG(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_ERRMSG _STM() {
        // JavaLine 39 <== SourceLine 1323
        // BEGIN CLASS_COMMON INNER PART
        // JavaLine 41 <== SourceLine 993
        // BEGIN CLASS_ERRMSG INNER PART
        // ENDOF CLASS_ERRMSG INNER PART
        // ENDOF CLASS_COMMON INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_ERRMSG.sim","9 CLASS_ERRMSG",1,3,10,27,12,28,14,29,16,31,19,32,21,155,25,156,27,457,39,1323,41,993,47,993);
} // End of Class
