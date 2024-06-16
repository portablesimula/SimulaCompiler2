// JavaLine 1 <== SourceLine 58
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:29 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class COMMON_symbolgroup extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=0, firstLine=58, lastLine=64, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 60
    public RTS_REF_ARRAY<COMMON_symbolbox> val=null;
    // Normal Constructor
    public COMMON_symbolgroup(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
        val=new RTS_REF_ARRAY<COMMON_symbolbox>(new RTS_BOUNDS(0,255));
    }
    // Class Statements
    @Override
    public COMMON_symbolgroup _STM() {
        // JavaLine 23 <== SourceLine 64
        // BEGIN INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","8 symbolgroup",1,58,10,60,23,64,28,64);
} // End of Class
