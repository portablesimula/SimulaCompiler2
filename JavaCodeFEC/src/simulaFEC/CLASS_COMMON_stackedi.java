// JavaLine 1 <== SourceLine 822
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:45 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_COMMON_stackedi extends CLASS_COMMON_sembox {
    // ClassDeclaration: Kind=9, BlockLevel=2, PrefixLevel=1, firstLine=822, lastLine=824, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    public char p1_rehi;
    public char p1_relo;
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_COMMON_stackedi(RTS_RTObject staticLink,char sp1_rehi,char sp1_relo) {
        super(staticLink);
        // Parameter assignment to locals
        this.p1_rehi = sp1_rehi;
        this.p1_relo = sp1_relo;
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_COMMON_stackedi _STM() {
        // JavaLine 23 <== SourceLine 84
        // BEGIN sembox INNER PART
        // JavaLine 25 <== SourceLine 824
        // BEGIN stackedi INNER PART
        // ENDOF stackedi INNER PART
        // ENDOF sembox INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","9 stackedi",1,822,23,84,25,824,31,824);
} // End of Class
