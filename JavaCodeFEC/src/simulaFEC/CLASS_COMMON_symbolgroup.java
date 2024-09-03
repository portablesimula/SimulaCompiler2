// JavaLine 1 <== SourceLine 58
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:45 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_COMMON_symbolgroup extends RTS_CLASS {
    // ClassDeclaration: Kind=9, BlockLevel=2, PrefixLevel=0, firstLine=58, lastLine=64, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 60
    public RTS_REF_ARRAY<CLASS_COMMON_symbolbox> val=null;
    // Normal Constructor
    public CLASS_COMMON_symbolgroup(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
        val=new RTS_REF_ARRAY<CLASS_COMMON_symbolbox>(new RTS_BOUNDS(0,255));
    }
    // Class Statements
    @Override
    public CLASS_COMMON_symbolgroup _STM() {
        // JavaLine 23 <== SourceLine 64
        // BEGIN symbolgroup INNER PART
        // ENDOF symbolgroup INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","9 symbolgroup",1,58,10,60,23,64,28,64);
} // End of Class
