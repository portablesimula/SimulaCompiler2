// JavaLine 1 <== SourceLine 81
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:29 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class COMMON_sembox extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=0, firstLine=81, lastLine=84, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 82
    public COMMON_sembox prevmeaning=null;
    // JavaLine 12 <== SourceLine 83
    public COMMON_sembox next=null;
    // Normal Constructor
    public COMMON_sembox(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public COMMON_sembox _STM() {
        // JavaLine 24 <== SourceLine 84
        // BEGIN INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","8 sembox",1,81,10,82,12,83,24,84,29,84);
} // End of Class
