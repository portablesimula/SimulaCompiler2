// JavaLine 1 <== SourceLine 76
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class BUILDER1_indexelt extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=0, firstLine=76, lastLine=79, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 77
    public int index=0;
    // JavaLine 12 <== SourceLine 78
    public BUILDER1_indexelt next=null;
    // Normal Constructor
    public BUILDER1_indexelt(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public BUILDER1_indexelt _STM() {
        // JavaLine 24 <== SourceLine 79
        // BEGIN INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER1.sim","8 indexelt",1,76,10,77,12,78,24,79,29,79);
} // End of Class
