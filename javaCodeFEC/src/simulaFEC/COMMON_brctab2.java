// JavaLine 1 <== SourceLine 377
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:29 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class COMMON_brctab2 extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=0, firstLine=377, lastLine=381, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 379
    public RTS_REF_ARRAY<COMMON_brecord> val=null;
    // Normal Constructor
    public COMMON_brctab2(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
        val=new RTS_REF_ARRAY<COMMON_brecord>(new RTS_BOUNDS(0,255));
    }
    // Class Statements
    @Override
    public COMMON_brctab2 _STM() {
        // JavaLine 23 <== SourceLine 381
        // BEGIN INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","8 brctab2",1,377,10,379,23,381,28,381);
} // End of Class
