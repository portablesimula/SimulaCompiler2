// JavaLine 1 <== SourceLine 993
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:53 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODMAIN_codegenerator_doCodeEndInsp1 extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=993, lastLine=1006, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public SCODMAIN_codegenerator_doCodeEndInsp1(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODMAIN_codegenerator_doCodeEndInsp1 _STM() {
        // JavaLine 21 <== SourceLine 994
        ((SCODMAIN_codegenerator)(_CUR._SL)).fdi_12=((SCODMAIN_codegenerator)(_CUR._SL)).jumpstack.getELEMENT(((SCODMAIN_codegenerator)(_CUR._SL)).curjump_4);
        ;
        // JavaLine 24 <== SourceLine 995
        if(_VALUE((((SCODMAIN_codegenerator)(_CUR._SL)).fdi_12!=(0)))) {
            new SCODER1_codegenerator1_outfdest((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).fdi_12);
        }
        ;
        // JavaLine 29 <== SourceLine 996
        ((SCODMAIN_codegenerator)(_CUR._SL)).fdi_12=((SCODMAIN_codegenerator)(_CUR._SL)).jumpstack.getELEMENT((((SCODMAIN_codegenerator)(_CUR._SL)).curjump_4-(1)));
        ;
        // JavaLine 32 <== SourceLine 997
        if(_VALUE((((SCODMAIN_codegenerator)(_CUR._SL)).fdi_12!=(0)))) {
            new SCODER1_codegenerator1_outfdest((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).fdi_12);
        }
        ;
        // JavaLine 37 <== SourceLine 999
        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("Q"),new RTS_TXT("\u0019")),new RTS_TXT("\u0094")),new RTS_TXT("\u00009")),new RTS_TXT("K")));
        ;
        // JavaLine 40 <== SourceLine 1001
        new SCODER0_codegenerator0_outtag((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).tagstacktop_6);
        ;
        // JavaLine 43 <== SourceLine 1002
        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u0087"),new RTS_TXT("T")));
        ;
        // JavaLine 46 <== SourceLine 1003
        ((SCODMAIN_codegenerator)(_CUR._SL)).fdi_12=((SCODMAIN_codegenerator)(_CUR._SL)).jumpstack.getELEMENT((((SCODMAIN_codegenerator)(_CUR._SL)).curjump_4-(2)));
        ;
        ((SCODMAIN_codegenerator)(_CUR._SL)).curjump_4=(((SCODMAIN_codegenerator)(_CUR._SL)).curjump_4-(3));
        ;
        // JavaLine 51 <== SourceLine 1004
        if(_VALUE((((SCODMAIN_codegenerator)(_CUR._SL)).fdi_12!=(0)))) {
            new SCODER1_codegenerator1_outfdest((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).fdi_12);
        }
        ;
        // JavaLine 56 <== SourceLine 1005
        new SCODER1_codegenerator1_poptag((_CUR._SL));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODMAIN.sim","5 doCodeEndInsp1",1,993,21,994,24,995,29,996,32,997,37,999,40,1001,43,1002,46,1003,51,1004,56,1005,61,1006);
} // End of Procedure
