// JavaLine 1 <== SourceLine 861
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:45 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_COMMON_component extends RTS_CLASS {
    // ClassDeclaration: Kind=9, BlockLevel=2, PrefixLevel=0, firstLine=861, lastLine=864, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 862
    public char cs=0;
    public boolean getopt=false;
    // Normal Constructor
    public CLASS_COMMON_component(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_COMMON_component _STM() {
        // JavaLine 23 <== SourceLine 864
        // BEGIN component INNER PART
        // ENDOF component INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","9 component",1,861,10,862,23,864,28,864);
} // End of Class
