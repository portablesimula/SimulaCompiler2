package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:38 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER1_codegenerator1_staticencl_Block479_Block525_Block533 extends RTS_BASICIO {
    // SubBlock: Kind=4, BlockLevel=4, firstLine=532, lastLine=538, hasLocalClasses=false, System=false
    // Declare locals as attributes
    // JavaLine 8 <== SourceLine 533
    public int ix=0;
    // Normal Constructor
    public SCODER1_codegenerator1_staticencl_Block479_Block525_Block533(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 4 Statements
    @Override
    public RTS_RTObject _STM() {
        // JavaLine 19 <== SourceLine 534
        new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER1"),534,new RTS_TXT("PUSHV"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u00009"))._RESULT);
        ;
        for(ix=1;ix<=((SCODER1_codegenerator1_staticencl)(_CUR._SL)).st_rblev;ix++) {
            // JavaLine 23 <== SourceLine 536
            new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODER1"),536,new RTS_TXT("REMOTEV"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL._SL),new RTS_TXT("\u0000\u0090"))._RESULT);
        }
        ;
        // JavaLine 27 <== SourceLine 537
        ((SCODER1_codegenerator1)(_CUR._SL._SL)).outtext(((SCODER1_codegenerator1)(_CUR._SL._SL)).followSL.getELEMENT(((SCODER1_codegenerator1_staticencl)(_CUR._SL)).st_rblev));
        ;
        EBLK();
        return(this);
    } // End of 4 Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER1.sim","4 Block533",8,533,19,534,23,536,27,537,32,538);
} // End of SubBlock
