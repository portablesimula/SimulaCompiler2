// JavaLine 1 <== SourceLine 12
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:19 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class COMMON_TAGTABLE extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=0, firstLine=12, lastLine=1395, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 15
    public RTS_TEXT_ARRAY ident=null;
    // JavaLine 12 <== SourceLine 16
    public RTS_TXT undef=null;
    // Normal Constructor
    public COMMON_TAGTABLE(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
        // JavaLine 20 <== SourceLine 15
        ident=new RTS_TEXT_ARRAY(new RTS_BOUNDS(0,3953));
    }
    // Class Statements
    @Override
    public COMMON_TAGTABLE _STM() {
        // JavaLine 26 <== SourceLine 1393
        new COMMON_TAGTABLE_INIT((_CUR));
        ;
        // JavaLine 29 <== SourceLine 1395
        // BEGIN INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","8 TAGTABLE",1,12,10,15,12,16,20,15,26,1393,29,1395,34,1395);
} // End of Class
