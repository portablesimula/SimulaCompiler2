package simulaTestBatch;
// Simula-2.0 Compiled at Fri Sep 06 08:05:49 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst157_A_Block33_Block34 extends RTS_BASICIO {
    // SubBlock: Kind=4, BlockLevel=4, firstLine=34, lastLine=39, hasLocalClasses=false, System=false
    // Declare locals as attributes
    public int i4=0;
    // Normal Constructor
    public simtst157_A_Block33_Block34(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 4 Statements
    @Override
    public RTS_RTObject _STM() {
        // JavaLine 18 <== SourceLine 35
        i4=444;
        ;
        // JavaLine 21 <== SourceLine 36
        ((simtst157_A_Block33)(_CUR._SL)).i3=222;
        ;
        // JavaLine 24 <== SourceLine 37
        ((simtst157_A)(_CUR._SL._SL)).p_ap=222;
        ;
        // JavaLine 27 <== SourceLine 38
        ((simtst157)(_CUR._SL._SL._SL)).i1_1=111;
        ;
        EBLK();
        return(this);
    } // End of 4 Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst157.sim","4 Block34",18,35,21,36,24,37,27,38,32,39);
} // End of SubBlock
