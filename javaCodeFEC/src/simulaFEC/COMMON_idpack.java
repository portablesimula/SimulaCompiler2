// JavaLine 1 <== SourceLine 849
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:29 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class COMMON_idpack extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=0, firstLine=849, lastLine=859, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 850
    public char idhi=0;
    public char idlo=0;
    // JavaLine 13 <== SourceLine 851
    public int line=0;
    // JavaLine 15 <== SourceLine 852
    public COMMON_idpack next=null;
    // Normal Constructor
    public COMMON_idpack(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public COMMON_idpack _STM() {
        // JavaLine 27 <== SourceLine 859
        // BEGIN INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","8 idpack",1,849,10,850,13,851,15,852,27,859,32,859);
} // End of Class
