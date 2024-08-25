// JavaLine 1 <== SourceLine 1203
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:45 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER3_codegenerator3_procLIPROCformal extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1203, lastLine=1231, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 1206
    public CHECKER2_semchecker _inspect_1205_4653=null;
    // Normal Constructor
    public SCODER3_codegenerator3_procLIPROCformal(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER3_codegenerator3_procLIPROCformal _STM() {
        // JavaLine 23 <== SourceLine 1205
        {
            // BEGIN INSPECTION 
            _inspect_1205_4653=((SCODER3_codegenerator3)(_CUR._SL)).checker_5;
            if(_inspect_1205_4653!=null) { // INSPECT _inspect_1205_4653
                // JavaLine 28 <== SourceLine 1206
                {
                    {
                        // JavaLine 31 <== SourceLine 1207
                        if(_VALUE((((SCODER3_codegenerator3)(_CUR._SL)).asd_4!=(0)))) {
                            {
                                // JavaLine 34 <== SourceLine 1208
                                if(_VALUE((((SCODER3)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('Y'))!=(((char)0))))) {
                                    new SCODER1_codegenerator1_outTrace((_CUR._SL),new RTS_TXT("save-FML\u005fPRO"));
                                }
                                ;
                                // JavaLine 39 <== SourceLine 1209
                                new SCODER1_codegenerator1_STRC_saveScheme((_CUR._SL));
                                ;
                                // JavaLine 42 <== SourceLine 1210
                                ((SCODER3_codegenerator3)(_CUR._SL)).outtext(((SCODER3_codegenerator3)(_CUR._SL)).saveScheme_6);
                                ;
                                // JavaLine 45 <== SourceLine 1211
                                new SCODER0_codegenerator0_pushasd((_CUR._SL));
                                ;
                                ((SCODER3_codegenerator3)(_CUR._SL)).saveemitted.putELEMENT(((SCODER3_codegenerator3)(_CUR._SL)).saveemitted.index(((SCODER3_codegenerator3)(_CUR._SL)).saveindex_4),true);
                                ;
                                // JavaLine 50 <== SourceLine 1212
                                ((SCODER3_codegenerator3)(_CUR._SL)).asd_4=0;
                                ;
                            }
                        }
                        ;
                        // JavaLine 56 <== SourceLine 1214
                        new SCODER3_codegenerator3_get_PROQNT((_CUR._SL),true);
                        ;
                        // JavaLine 59 <== SourceLine 1215
                        if(_VALUE((((SCODER3)(_CUR._SL._SL)).opilo_6==(((char)0))))) {
                            {
                                // JavaLine 62 <== SourceLine 1216
                                ((SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0006A")),new RTS_TXT("F")),new RTS_TXT("\u0006B")));
                                ;
                                // JavaLine 65 <== SourceLine 1218
                                ((SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((SCODER3_codegenerator3)(_CUR._SL)).asd_4-(1));
                                ;
                            }
                        } else {
                            // JavaLine 70 <== SourceLine 1220
                            {
                                // JavaLine 72 <== SourceLine 1221
                                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),1221,new RTS_TXT("ASSCALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0006E"))._RESULT);
                                ;
                                // JavaLine 75 <== SourceLine 1222
                                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),1222,new RTS_TXT("PUSHC"),CONC(new RTS_TXT("C-INT "),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(((SCODER3)(_CUR._SL._SL)).opilo_6))));
                                ;
                                // JavaLine 78 <== SourceLine 1223
                                new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),1223,new RTS_TXT("ASSPAR"));
                                ;
                                // JavaLine 81 <== SourceLine 1224
                                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),1224,new RTS_TXT("CALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0006F"))._RESULT);
                                ;
                                // JavaLine 84 <== SourceLine 1225
                                ((SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0006E")),new RTS_TXT("Q")),new RTS_TXT("\r")));
                                ;
                                // JavaLine 87 <== SourceLine 1227
                                new SCODER0_codegenerator0_outsint((_CUR._SL),RTS_ENVIRONMENT.rank(((SCODER3)(_CUR._SL._SL)).opilo_6));
                                ;
                                // JavaLine 90 <== SourceLine 1228
                                ((SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("D"),new RTS_TXT("F")),new RTS_TXT("\u0006F")));
                                ;
                            }
                        }
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER3.sim","5 procLIPROCformal",1,1203,10,1206,23,1205,28,1206,31,1207,34,1208,39,1209,42,1210,45,1211,50,1212,56,1214,59,1215,62,1216,65,1218,70,1220,72,1221,75,1222,78,1223,81,1224,84,1225,87,1227,90,1228,102,1231);
} // End of Procedure
