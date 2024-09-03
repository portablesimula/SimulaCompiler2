// JavaLine 1 <== SourceLine 81
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:45 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_COMMON_sembox extends RTS_CLASS {
    // ClassDeclaration: Kind=9, BlockLevel=2, PrefixLevel=0, firstLine=81, lastLine=84, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 82
    public CLASS_COMMON_sembox prevmeaning=null;
    // JavaLine 12 <== SourceLine 83
    public CLASS_COMMON_sembox next=null;
    // Normal Constructor
    public CLASS_COMMON_sembox(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_COMMON_sembox _STM() {
        // JavaLine 24 <== SourceLine 84
        // BEGIN sembox INNER PART
        // ENDOF sembox INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","9 sembox",1,81,10,82,12,83,24,84,29,84);
} // End of Class
