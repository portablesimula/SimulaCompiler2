// JavaLine 1 <== SourceLine 1009
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:53 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODMAIN_codegenerator_doCodeEndProgram extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1009, lastLine=1044, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public SCODMAIN_codegenerator_doCodeEndProgram(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODMAIN_codegenerator_doCodeEndProgram _STM() {
        // JavaLine 21 <== SourceLine 1010
        if(_VALUE(((SCODMAIN)(_CUR._SL._SL)).simob_descr)) {
            new SCODER1E_codegenerator1e_moduleinfogeneration((_CUR._SL));
        }
        ;
        // JavaLine 26 <== SourceLine 1012
        if(_VALUE(((SCODMAIN)(_CUR._SL._SL)).separatecomp)) {
            {
                // JavaLine 29 <== SourceLine 1013
                new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),1013,new RTS_TXT("ENDMODULE"));
                ;
                // JavaLine 32 <== SourceLine 1014
                new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),1014,new RTS_TXT("ENDPROGRAM"));
                ;
            }
        } else {
            // JavaLine 37 <== SourceLine 1015
            {
                // JavaLine 39 <== SourceLine 1016
                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),1016,new RTS_TXT("PRECALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\t\u008d"))._RESULT);
                ;
                // JavaLine 42 <== SourceLine 1017
                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),1017,new RTS_TXT("   PUCHC"),new RTS_TXT("C-INT \"0\""));
                ;
                // JavaLine 45 <== SourceLine 1018
                new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),1018,new RTS_TXT("   ASSPAR"));
                ;
                // JavaLine 48 <== SourceLine 1019
                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),1019,new RTS_TXT("   PUSHV"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000M"))._RESULT);
                ;
                // JavaLine 51 <== SourceLine 1020
                new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),1020,new RTS_TXT("   ASSPAR"));
                ;
                // JavaLine 54 <== SourceLine 1021
                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),1021,new RTS_TXT("CALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\t\u008e"))._RESULT);
                ;
                // JavaLine 57 <== SourceLine 1022
                new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),1022,new RTS_TXT("ENDPROGRAM"));
                ;
            }
        }
        ;
        // JavaLine 63 <== SourceLine 1025
        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(((((SCODMAIN)(_CUR._SL._SL)).separatecomp)?(CONC(new RTS_TXT("."),new RTS_TXT("\u0084"))):(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("C"),new RTS_TXT("\t\u008d")),new RTS_TXT("Q")),new RTS_TXT("\r")),new RTS_TXT("\u00010")),new RTS_TXT("D")),new RTS_TXT("\u0094")),new RTS_TXT("\u0000M")),new RTS_TXT("D")),new RTS_TXT("F")),new RTS_TXT("\t\u008e")),new RTS_TXT("\u0084")))));
        ;
        // JavaLine 66 <== SourceLine 1034
        if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).termstatus<('4')))) {
            ((SCODMAIN)(_CUR._SL._SL)).termstatus='0';
        }
        ;
        // JavaLine 71 <== SourceLine 1035
        if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('O'))!=(((char)0))))) {
            {
                // JavaLine 74 <== SourceLine 1036
                RTS_BASICIO.sysout().outtext(new RTS_TXT(" *** END PASS 2 *** "));
                ;
                // JavaLine 77 <== SourceLine 1040
                RTS_BASICIO.sysout().outimage();
                ;
            }
        }
        ;
        // JavaLine 83 <== SourceLine 1043
        ((SCODMAIN)(_CUR._SL._SL)).ENDCOMP_0().CPF();
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODMAIN.sim","5 doCodeEndProgram",1,1009,21,1010,26,1012,29,1013,32,1014,37,1015,39,1016,42,1017,45,1018,48,1019,51,1020,54,1021,57,1022,63,1025,66,1034,71,1035,74,1036,77,1040,83,1043,88,1044);
} // End of Procedure
