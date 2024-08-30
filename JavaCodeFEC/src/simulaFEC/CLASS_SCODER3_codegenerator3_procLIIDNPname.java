// JavaLine 1 <== SourceLine 992
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:36 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER3_codegenerator3_procLIIDNPname extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=992, lastLine=1041, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 993
    public boolean saveEmit=false;
    // Normal Constructor
    public CLASS_SCODER3_codegenerator3_procLIIDNPname(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER3_codegenerator3_procLIIDNPname _STM() {
        // JavaLine 23 <== SourceLine 994
        if(_VALUE(((((CLASS_SCODER3)(_CUR._SL._SL)).opilo_6==(((char)1)))&&((((CLASS_SCODER3_codegenerator3)(_CUR._SL)).opq_3.type_1==(((char)8))))))) {
            // JavaLine 25 <== SourceLine 996
            {
                // JavaLine 27 <== SourceLine 997
                new CLASS_SCODER3_codegenerator3_GADDRval((_CUR._SL));
                ;
                // JavaLine 30 <== SourceLine 998
                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),998,new RTS_TXT("REFER"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u00019"))._RESULT);
                ;
                // JavaLine 33 <== SourceLine 999
                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(new RTS_TXT("H"),new RTS_TXT("\u00019")));
                ;
            }
        } else {
            // JavaLine 38 <== SourceLine 1001
            {
                // JavaLine 40 <== SourceLine 1003
                saveEmit=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4>(0));
                ;
                // JavaLine 43 <== SourceLine 1004
                new CLASS_SCODER2_codegenerator2_addrPARQNT((_CUR._SL));
                ;
                // JavaLine 46 <== SourceLine 1005
                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),1005,new RTS_TXT("SELECTV"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001c"))._RESULT);
                ;
                // JavaLine 49 <== SourceLine 1006
                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),1006,new RTS_TXT("REMOTEV"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001N"))._RESULT);
                ;
                // JavaLine 52 <== SourceLine 1007
                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),1007,new RTS_TXT("PUSHC"),new RTS_TXT("C-INT 4"));
                ;
                // JavaLine 55 <== SourceLine 1008
                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),1008,new RTS_TXT("SKIPIF"),new RTS_TXT("NE"));
                ;
                // JavaLine 58 <== SourceLine 1009
                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0095"),new RTS_TXT("\u0001c")),new RTS_TXT("\u0096")),new RTS_TXT("\u0001N")),new RTS_TXT("Q")),new RTS_TXT("\r")),new RTS_TXT("\u00014")),new RTS_TXT("=")),new RTS_TXT("\u007c")));
                ;
                // JavaLine 61 <== SourceLine 1017
                if(_VALUE(saveEmit)) {
                    {
                        // JavaLine 64 <== SourceLine 1018
                        new CLASS_SCODER1_codegenerator1_STRC_saveScheme((_CUR._SL));
                        ;
                        // JavaLine 67 <== SourceLine 1019
                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).saveScheme_6);
                        ;
                    }
                }
                ;
                // JavaLine 73 <== SourceLine 1021
                if(_VALUE((saveEmit&&((((CLASS_SCODER3)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('Y'))!=(((char)0))))))) {
                    // JavaLine 75 <== SourceLine 1022
                    new CLASS_SCODER1_codegenerator1_outTrace((_CUR._SL),new RTS_TXT("save-FNP\u005fASS"));
                }
                ;
                // JavaLine 79 <== SourceLine 1023
                new CLASS_SCODER2_codegenerator2_addrPARQNT((_CUR._SL));
                ;
                // JavaLine 82 <== SourceLine 1024
                new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),1024,new RTS_TXT("DEREF"));
                ;
                // JavaLine 85 <== SourceLine 1025
                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),1025,new RTS_TXT("ASSCALL"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0005\u00be"))._RESULT);
                ;
                // JavaLine 88 <== SourceLine 1026
                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),1026,new RTS_TXT("CALL"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0005\u00bf"))._RESULT);
                ;
                // JavaLine 91 <== SourceLine 1027
                if(_VALUE(saveEmit)) {
                    new CLASS_SCODER1_codegenerator1_STRC_restoreScheme((_CUR._SL));
                }
                ;
                // JavaLine 96 <== SourceLine 1028
                new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),1028,new RTS_TXT("ENDSKIP"));
                ;
                // JavaLine 99 <== SourceLine 1029
                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(((saveEmit)?(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("I"),new RTS_TXT("\u0088")),new RTS_TXT("\u0005\u00be")),new RTS_TXT("F")),new RTS_TXT("\u0005\u00bf")),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).restoreScheme_6),new RTS_TXT(">"))):(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("I"),new RTS_TXT("\u0088")),new RTS_TXT("\u0005\u00be")),new RTS_TXT("F")),new RTS_TXT("\u0005\u00bf")),new RTS_TXT(">")))));
                ;
                // JavaLine 102 <== SourceLine 1039
                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(2));
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER3.sim","5 procLIIDNPname",1,992,10,993,23,994,25,996,27,997,30,998,33,999,38,1001,40,1003,43,1004,46,1005,49,1006,52,1007,55,1008,58,1009,61,1017,64,1018,67,1019,73,1021,75,1022,79,1023,82,1024,85,1025,88,1026,91,1027,96,1028,99,1029,102,1039,110,1041);
} // End of Procedure
