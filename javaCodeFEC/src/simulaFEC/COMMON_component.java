// JavaLine 1 <== SourceLine 861
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:19 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class COMMON_component extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=0, firstLine=861, lastLine=864, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 862
    public char cs=0;
    public boolean getopt=false;
    // Normal Constructor
    public COMMON_component(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public COMMON_component _STM() {
        // JavaLine 23 <== SourceLine 864
        // BEGIN INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","8 component",1,861,10,862,23,864,28,864);
} // End of Class
