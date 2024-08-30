package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:38 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODMAIN_codegenerator_Block192_Block196_Block2778_Block2781_Block2785_Block2786 extends RTS_BASICIO {
    // SubBlock: Kind=4, BlockLevel=3, firstLine=2785, lastLine=2795, hasLocalClasses=false, System=false
    // Declare locals as attributes
    // JavaLine 8 <== SourceLine 2786
    public int inrtag=0;
    // Normal Constructor
    public CLASS_SCODMAIN_codegenerator_Block192_Block196_Block2778_Block2781_Block2785_Block2786(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 4 Statements
    @Override
    public RTS_RTObject _STM() {
        // JavaLine 19 <== SourceLine 2787
        ((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\u0014")));
        ;
        // JavaLine 22 <== SourceLine 2788
        inrtag=new CLASS_SCODER1_codegenerator1_outINRtag((_CUR._SL),((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).opq_3)._RESULT;
        ;
        // JavaLine 25 <== SourceLine 2789
        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),2789,new RTS_TXT("PUSHC"),CONC(new RTS_TXT("C-PADDR "),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),inrtag)._RESULT));
        ;
        // JavaLine 28 <== SourceLine 2790
        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),2790,new RTS_TXT("GOTO"));
        ;
        // JavaLine 31 <== SourceLine 2791
        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),2791,new RTS_TXT("ESEG"));
        ;
        // JavaLine 34 <== SourceLine 2792
        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),2792,new RTS_TXT("EMPTY"));
        ;
        // JavaLine 37 <== SourceLine 2793
        ((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u005e"),new RTS_TXT("<")),new RTS_TXT("U")));
        ;
        EBLK();
        return(this);
    } // End of 4 Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODMAIN.sim","4 Block2786",8,2786,19,2787,22,2788,25,2789,28,2790,31,2791,34,2792,37,2793,42,2795);
} // End of SubBlock
