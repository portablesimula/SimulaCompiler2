// JavaLine 1 <== SourceLine 377
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:45 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_COMMON_brctab2 extends RTS_CLASS {
    // ClassDeclaration: Kind=9, BlockLevel=2, PrefixLevel=0, firstLine=377, lastLine=381, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 379
    public RTS_REF_ARRAY<CLASS_COMMON_brecord> val=null;
    // Normal Constructor
    public CLASS_COMMON_brctab2(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
        val=new RTS_REF_ARRAY<CLASS_COMMON_brecord>(new RTS_BOUNDS(0,255));
    }
    // Class Statements
    @Override
    public CLASS_COMMON_brctab2 _STM() {
        // JavaLine 23 <== SourceLine 381
        // BEGIN brctab2 INNER PART
        // ENDOF brctab2 INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","9 brctab2",1,377,10,379,23,381,28,381);
} // End of Class
