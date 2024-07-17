package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:53 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODMAIN_codegenerator_doCodeEndBlock_Block1050_Block1054_Block1055 extends RTS_BASICIO {
    // SubBlock: Kind=4, BlockLevel=4, firstLine=1054, lastLine=1064, hasLocalClasses=false, System=false
    // Declare locals as attributes
    // JavaLine 8 <== SourceLine 1055
    public int inrtag=0;
    // Normal Constructor
    public SCODMAIN_codegenerator_doCodeEndBlock_Block1050_Block1054_Block1055(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 4 Statements
    @Override
    public RTS_RTObject _STM() {
        // JavaLine 19 <== SourceLine 1056
        ((SCODMAIN_codegenerator)(_CUR._SL._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\u0014")));
        ;
        // JavaLine 22 <== SourceLine 1057
        inrtag=new SCODER1_codegenerator1_outINRtag((_CUR._SL._SL),((SCODMAIN_codegenerator)(_CUR._SL._SL)).opq_3)._RESULT;
        ;
        // JavaLine 25 <== SourceLine 1058
        new SCODER0_codegenerator0_STRC3((_CUR._SL._SL),new RTS_TXT("SCODMAIN"),1058,new RTS_TXT("PUSHC"),CONC(new RTS_TXT("C-PADDR "),new SCODER0_codegenerator0_ED_TAG((_CUR._SL._SL),inrtag)._RESULT));
        ;
        // JavaLine 28 <== SourceLine 1059
        new SCODER0_codegenerator0_STRC2((_CUR._SL._SL),new RTS_TXT("SCODMAIN"),1059,new RTS_TXT("GOTO"));
        ;
        // JavaLine 31 <== SourceLine 1060
        new SCODER0_codegenerator0_STRC2((_CUR._SL._SL),new RTS_TXT("SCODMAIN"),1060,new RTS_TXT("ESEG"));
        ;
        // JavaLine 34 <== SourceLine 1061
        new SCODER0_codegenerator0_STRC2((_CUR._SL._SL),new RTS_TXT("SCODMAIN"),1061,new RTS_TXT("EMPTY"));
        ;
        // JavaLine 37 <== SourceLine 1062
        ((SCODMAIN_codegenerator)(_CUR._SL._SL)).outtext(CONC(CONC(new RTS_TXT("\u005e"),new RTS_TXT("<")),new RTS_TXT("U")));
        ;
        EBLK();
        return(this);
    } // End of 4 Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODMAIN.sim","4 Block1055",8,1055,19,1056,22,1057,25,1058,28,1059,31,1060,34,1061,37,1062,42,1064);
} // End of SubBlock
