// JavaLine 1 <== SourceLine 76
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_BUILDER1_indexelt extends RTS_CLASS {
    // ClassDeclaration: Kind=9, BlockLevel=2, PrefixLevel=0, firstLine=76, lastLine=79, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 77
    public int index=0;
    // JavaLine 12 <== SourceLine 78
    public CLASS_BUILDER1_indexelt next=null;
    // Normal Constructor
    public CLASS_BUILDER1_indexelt(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_BUILDER1_indexelt _STM() {
        // JavaLine 24 <== SourceLine 79
        // BEGIN indexelt INNER PART
        // ENDOF indexelt INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER1.sim","9 indexelt",1,76,10,77,12,78,24,79,29,79);
} // End of Class
