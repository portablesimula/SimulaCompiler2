// JavaLine 1 <== SourceLine 559
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:19 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class COMMON_quantity extends COMMON_sembox {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=1, firstLine=559, lastLine=762, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 560
    public char type_1=0;
    public char kind_1=0;
    public char categ_1=0;
    public char special_1=0;
    // JavaLine 15 <== SourceLine 561
    public char protect_1=0;
    // JavaLine 17 <== SourceLine 562
    public char visible_1=0;
    // JavaLine 19 <== SourceLine 563
    public int plev_1=0;
    // JavaLine 21 <== SourceLine 565
    public int dim_1=0;
    // JavaLine 23 <== SourceLine 566
    public int virtno_1=0;
    // JavaLine 25 <== SourceLine 567
    public int ftag_1=0;
    // JavaLine 27 <== SourceLine 568
    public int line_1=0;
    // JavaLine 29 <== SourceLine 569
    public COMMON_symbolbox symb_1=null;
    // JavaLine 31 <== SourceLine 570
    public COMMON_brecord encl_1=null;
    // JavaLine 33 <== SourceLine 572
    public COMMON_brecord descr_1=null;
    // JavaLine 35 <== SourceLine 573
    public COMMON_quantity prefqual_1=null;
    // JavaLine 37 <== SourceLine 574
    public COMMON_quantity match_1=null;
    // Normal Constructor
    public COMMON_quantity(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public COMMON_quantity _STM() {
        // JavaLine 48 <== SourceLine 84
        // BEGIN INNER PART
        // JavaLine 50 <== SourceLine 762
        // BEGIN INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","8 quantity",1,559,10,560,15,561,17,562,19,563,21,565,23,566,25,567,27,568,29,569,31,570,33,572,35,573,37,574,48,84,50,762,56,762);
} // End of Class
