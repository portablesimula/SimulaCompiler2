// JavaLine 1 <== SourceLine 66
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:19 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class COMMON_symbolbox extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=0, firstLine=66, lastLine=72, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 67
    public char idhi=0;
    public char idlo=0;
    // JavaLine 13 <== SourceLine 68
    public int idtag=0;
    // JavaLine 15 <== SourceLine 70
    public COMMON_symbolbox next=null;
    // JavaLine 17 <== SourceLine 71
    public RTS_TXT symbol=null;
    // Normal Constructor
    public COMMON_symbolbox(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public COMMON_symbolbox _STM() {
        // JavaLine 29 <== SourceLine 72
        // BEGIN INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","8 symbolbox",1,66,10,67,13,68,15,70,17,71,29,72,34,72);
} // End of Class
