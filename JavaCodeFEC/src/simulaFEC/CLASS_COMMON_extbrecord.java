// JavaLine 1 <== SourceLine 765
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:45 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_COMMON_extbrecord extends CLASS_COMMON_brecord {
    // ClassDeclaration: Kind=9, BlockLevel=2, PrefixLevel=1, firstLine=765, lastLine=799, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 766
    public CLASS_COMMON_extquantity cause_1=null;
    // JavaLine 12 <== SourceLine 775
    public int exttagnum_1=0;
    // JavaLine 14 <== SourceLine 778
    public int ftag_1=0;
    // JavaLine 16 <== SourceLine 780
    public char checkhi_1=0;
    public char checklo_1=0;
    // JavaLine 19 <== SourceLine 782
    public char modulhi_1=0;
    public char modullo_1=0;
    // JavaLine 22 <== SourceLine 783
    public char status_1=0;
    // Normal Constructor
    public CLASS_COMMON_extbrecord(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_COMMON_extbrecord _STM() {
        // JavaLine 33 <== SourceLine 556
        // BEGIN brecord INNER PART
        // JavaLine 35 <== SourceLine 799
        // BEGIN extbrecord INNER PART
        // ENDOF extbrecord INNER PART
        // ENDOF brecord INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","9 extbrecord",1,765,10,766,12,775,14,778,16,780,19,782,22,783,33,556,35,799,41,799);
} // End of Class
