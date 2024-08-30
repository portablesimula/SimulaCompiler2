// JavaLine 1 <== SourceLine 1083
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:35 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER2_codegenerator2_addrNAMEQNT extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1083, lastLine=1105, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 1084
    public boolean save_emitted=false;
    // Normal Constructor
    public CLASS_SCODER2_codegenerator2_addrNAMEQNT(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER2_codegenerator2_addrNAMEQNT _STM() {
        // JavaLine 23 <== SourceLine 1085
        if(_VALUE((((CLASS_SCODER2_codegenerator2)(_CUR._SL)).asd_4!=(0)))) {
            {
                // JavaLine 26 <== SourceLine 1086
                if(_VALUE((((CLASS_SCODER2)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('Y'))!=(((char)0))))) {
                    new CLASS_SCODER1_codegenerator1_outTrace((_CUR._SL),new RTS_TXT("save-FNP\u005fACC"));
                }
                ;
                // JavaLine 31 <== SourceLine 1087
                new CLASS_SCODER1_codegenerator1_STRC_saveScheme((_CUR._SL));
                ;
                // JavaLine 34 <== SourceLine 1088
                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(((CLASS_SCODER2_codegenerator2)(_CUR._SL)).saveScheme_6);
                ;
                save_emitted=true;
            }
        } else {
            // JavaLine 40 <== SourceLine 1089
            save_emitted=false;
        }
        ;
        // JavaLine 44 <== SourceLine 1090
        new CLASS_SCODER2_codegenerator2_addrPARQNT((_CUR._SL));
        ;
        // JavaLine 47 <== SourceLine 1091
        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER2"),1091,new RTS_TXT("DEREF"));
        ;
        // JavaLine 50 <== SourceLine 1092
        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),1092,new RTS_TXT("ASSCALL"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0005\u00e9"))._RESULT);
        ;
        // JavaLine 53 <== SourceLine 1093
        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),1093,new RTS_TXT("CALL"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0005\u00ea"))._RESULT);
        ;
        // JavaLine 56 <== SourceLine 1094
        if(_VALUE(save_emitted)) {
            new CLASS_SCODER1_codegenerator1_STRC_restoreScheme((_CUR._SL));
        }
        ;
        // JavaLine 61 <== SourceLine 1095
        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(((save_emitted)?(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("I"),new RTS_TXT("\u0088")),new RTS_TXT("\u0005\u00e9")),new RTS_TXT("F")),new RTS_TXT("\u0005\u00ea")),((CLASS_SCODER2_codegenerator2)(_CUR._SL)).restoreScheme_6)):(CONC(CONC(CONC(CONC(new RTS_TXT("I"),new RTS_TXT("\u0088")),new RTS_TXT("\u0005\u00e9")),new RTS_TXT("F")),new RTS_TXT("\u0005\u00ea")))));
        ;
        // JavaLine 64 <== SourceLine 1103
        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).asd_4=(((CLASS_SCODER2_codegenerator2)(_CUR._SL)).asd_4-(1));
        ;
        // JavaLine 67 <== SourceLine 1104
        new CLASS_SCODER2_codegenerator2_addrPARQNT((_CUR._SL));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER2.sim","5 addrNAMEQNT",1,1083,10,1084,23,1085,26,1086,31,1087,34,1088,40,1089,44,1090,47,1091,50,1092,53,1093,56,1094,61,1095,64,1103,67,1104,72,1105);
} // End of Procedure
