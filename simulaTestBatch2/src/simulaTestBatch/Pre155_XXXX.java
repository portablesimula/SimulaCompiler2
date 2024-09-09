// JavaLine 1 <== SourceLine 27
package simulaTestBatch;
// Simula-2.0 Compiled at Tue Jul 30 09:27:11 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class Pre155_XXXX extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=0, firstLine=27, lastLine=30, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 28
    public final int iiii=(int)(444);
    // Normal Constructor
    public Pre155_XXXX(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public Pre155_XXXX _STM() {
        // JavaLine 23 <== SourceLine 29
        detach(29);
        ;
        // JavaLine 26 <== SourceLine 30
        // BEGIN INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("Pre155.sim","8 XXXX",1,27,11,28,23,29,26,30,31,30);
} // End of Class
