// JavaLine 1 <== SourceLine 787
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class BUILDER1_extmodule extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=0, firstLine=787, lastLine=794, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 788
    public COMMON_quantity qty=null;
    // JavaLine 12 <== SourceLine 789
    public BUILDER1_extmodule next=null;
    // JavaLine 14 <== SourceLine 790
    public int pptag=0;
    // JavaLine 16 <== SourceLine 791
    public int attrlayout=0;
    // JavaLine 18 <== SourceLine 792
    public char checkhi=0;
    // JavaLine 20 <== SourceLine 793
    public char checklo=0;
    // Normal Constructor
    public BUILDER1_extmodule(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public BUILDER1_extmodule _STM() {
        // JavaLine 32 <== SourceLine 794
        // BEGIN INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER1.sim","8 extmodule",1,787,10,788,12,789,14,790,16,791,18,792,20,793,32,794,37,794);
} // End of Class
