// JavaLine 1 <== SourceLine 822
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:29 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class COMMON_stackedi extends COMMON_sembox {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=1, firstLine=822, lastLine=824, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    public char p1_rehi;
    public char p1_relo;
    // Declare locals as attributes
    // Normal Constructor
    public COMMON_stackedi(RTS_RTObject staticLink,char sp1_rehi,char sp1_relo) {
        super(staticLink);
        // Parameter assignment to locals
        this.p1_rehi = sp1_rehi;
        this.p1_relo = sp1_relo;
        // Declaration Code
    }
    // Class Statements
    @Override
    public COMMON_stackedi _STM() {
        // JavaLine 23 <== SourceLine 84
        // BEGIN INNER PART
        // JavaLine 25 <== SourceLine 824
        // BEGIN INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","8 stackedi",1,822,23,84,25,824,31,824);
} // End of Class
