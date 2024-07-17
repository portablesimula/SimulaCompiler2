// JavaLine 1 <== SourceLine 3
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:22 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class ERRMSG extends COMMON {
    // ClassDeclaration: Kind=8, BlockLevel=1, PrefixLevel=1, firstLine=3, lastLine=998, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 34
    public int numwarnfound_1=0;
    // JavaLine 12 <== SourceLine 35
    public int maxerrno_1=0;
    // JavaLine 14 <== SourceLine 36
    public final int uplim_1=(int)(450);
    // JavaLine 16 <== SourceLine 38
    public RTS_Directfile ERRORFILE_1=null;
    public boolean ERRnotopen_1=false;
    // JavaLine 19 <== SourceLine 40
    public final int messlength_1=(int)(50);
    // JavaLine 21 <== SourceLine 160
    public int lasterrpos_1=0;
    public int lasterrmess_1=0;
    public int errloop_1=0;
    // JavaLine 25 <== SourceLine 161
    public int lasterrline_1=0;
    public RTS_PRCQNT COMMONerror_0() { return(new RTS_PRCQNT(this,ERRMSG_COMMONerror.class)); }
    // Normal Constructor
    public ERRMSG(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public ERRMSG _STM() {
        // JavaLine 37 <== SourceLine 1322
        // BEGIN INNER PART
        // JavaLine 39 <== SourceLine 998
        // BEGIN INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("ERRMSG.sim","8 ERRMSG",1,3,10,34,12,35,14,36,16,38,19,40,21,160,25,161,37,1322,39,998,45,998);
} // End of Class
