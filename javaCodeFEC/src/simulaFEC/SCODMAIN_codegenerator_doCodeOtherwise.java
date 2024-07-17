// JavaLine 1 <== SourceLine 965
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:53 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODMAIN_codegenerator_doCodeOtherwise extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=965, lastLine=990, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public SCODMAIN_codegenerator_doCodeOtherwise(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODMAIN_codegenerator_doCodeOtherwise _STM() {
        // JavaLine 21 <== SourceLine 966
        ((SCODMAIN_codegenerator)(_CUR._SL)).fdi_12=((SCODMAIN_codegenerator)(_CUR._SL)).jumpstack.getELEMENT(((SCODMAIN_codegenerator)(_CUR._SL)).curjump_4);
        ;
        // JavaLine 24 <== SourceLine 967
        if(_VALUE((((SCODMAIN_codegenerator)(_CUR._SL)).fdi_12==(0)))) {
            {
                // JavaLine 27 <== SourceLine 968
                new SCODER0_codegenerator0_getnewindex((_CUR._SL));
                ;
                ((SCODMAIN_codegenerator)(_CUR._SL)).fdi_12=((SCODMAIN_codegenerator)(_CUR._SL)).jumpstack.putELEMENT(((SCODMAIN_codegenerator)(_CUR._SL)).jumpstack.index(((SCODMAIN_codegenerator)(_CUR._SL)).curjump_4),((SCODMAIN_codegenerator)(_CUR._SL)).curindex_5);
            }
        } else {
            // JavaLine 33 <== SourceLine 969
            {
                ((SCODMAIN_codegenerator)(_CUR._SL)).outbyte(55);
                ;
                ((SCODMAIN_codegenerator)(_CUR._SL)).outbyte(((SCODMAIN_codegenerator)(_CUR._SL)).fdi_12);
            }
        }
        ;
        // JavaLine 41 <== SourceLine 973
        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("Q"),new RTS_TXT("\u0019")),new RTS_TXT("\u0094")),new RTS_TXT("\u00009")),new RTS_TXT("K")));
        ;
        // JavaLine 44 <== SourceLine 975
        new SCODER0_codegenerator0_outtag((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).tagstacktop_6);
        ;
        // JavaLine 47 <== SourceLine 976
        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0087"),new RTS_TXT("T")),new RTS_TXT("Y")));
        ;
        // JavaLine 50 <== SourceLine 977
        ((SCODMAIN_codegenerator)(_CUR._SL)).outbyte(((SCODMAIN_codegenerator)(_CUR._SL)).fdi_12);
        ;
        // JavaLine 53 <== SourceLine 979
        ((SCODMAIN_codegenerator)(_CUR._SL)).fdi_12=((SCODMAIN_codegenerator)(_CUR._SL)).jumpstack.getELEMENT((((SCODMAIN_codegenerator)(_CUR._SL)).curjump_4-(1)));
        ;
        // JavaLine 56 <== SourceLine 980
        if(_VALUE((((SCODMAIN_codegenerator)(_CUR._SL)).fdi_12!=(0)))) {
            new SCODER1_codegenerator1_outfdest((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).fdi_12);
        }
        ;
        // JavaLine 61 <== SourceLine 983
        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("Q"),new RTS_TXT("\u0019")),new RTS_TXT("\u0094")),new RTS_TXT("\u00009")),new RTS_TXT("K")));
        ;
        // JavaLine 64 <== SourceLine 985
        new SCODER0_codegenerator0_outtag((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).tagstacktop_6);
        ;
        // JavaLine 67 <== SourceLine 986
        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u0087"),new RTS_TXT("T")));
        ;
        // JavaLine 70 <== SourceLine 987
        ((SCODMAIN_codegenerator)(_CUR._SL)).fdi_12=((SCODMAIN_codegenerator)(_CUR._SL)).jumpstack.getELEMENT((((SCODMAIN_codegenerator)(_CUR._SL)).curjump_4-(2)));
        ;
        // JavaLine 73 <== SourceLine 988
        if(_VALUE((((SCODMAIN_codegenerator)(_CUR._SL)).fdi_12!=(0)))) {
            new SCODER1_codegenerator1_outfdest((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).fdi_12);
        }
        ;
        // JavaLine 78 <== SourceLine 989
        new SCODER1_codegenerator1_poptag((_CUR._SL));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODMAIN.sim","5 doCodeOtherwise",1,965,21,966,24,967,27,968,33,969,41,973,44,975,47,976,50,977,53,979,56,980,61,983,64,985,67,986,70,987,73,988,78,989,83,990);
} // End of Procedure
