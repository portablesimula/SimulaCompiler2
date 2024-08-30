// JavaLine 1 <== SourceLine 1308
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:36 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER3_codegenerator3_procLIRGPA extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1308, lastLine=1359, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 1310
    public CLASS_CHECKER2_semchecker _inspect_1310_4654=null;
    // Normal Constructor
    public CLASS_SCODER3_codegenerator3_procLIRGPA(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER3_codegenerator3_procLIRGPA _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_1310_4654=((CLASS_SCODER3_codegenerator3)(_CUR._SL)).checker_5;
            if(_inspect_1310_4654!=null) { // INSPECT _inspect_1310_4654  type=ref(SEMCHECKER)
                {
                    {
                        // JavaLine 29 <== SourceLine 1311
                        if(_VALUE((((CLASS_SCODER3)(_CUR._SL._SL)).opt==(((char)11))))) {
                            {
                                // JavaLine 32 <== SourceLine 1313
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),1313,new RTS_TXT("PUSHV"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u00009"))._RESULT);
                                ;
                                // JavaLine 35 <== SourceLine 1314
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),1314,new RTS_TXT("REMOTE"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\u00b8"))._RESULT);
                                ;
                                // JavaLine 38 <== SourceLine 1315
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),1315,new RTS_TXT("SELECT"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001w"))._RESULT);
                                ;
                                // JavaLine 41 <== SourceLine 1316
                                new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),1316,new RTS_TXT("RUPDATE"));
                                ;
                                // JavaLine 44 <== SourceLine 1317
                                new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),1317,new RTS_TXT("POP"));
                                ;
                                // JavaLine 47 <== SourceLine 1318
                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0094"),new RTS_TXT("\u00009")),new RTS_TXT("K")),new RTS_TXT("\u0000\u00b8")),new RTS_TXT("J")),new RTS_TXT("\u0001w")),new RTS_TXT("\u0087")),new RTS_TXT("T")));
                                ;
                            }
                        } else {
                            // JavaLine 52 <== SourceLine 1323
                            {
                                // JavaLine 54 <== SourceLine 1327
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),1327,new RTS_TXT("PUSHV"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u00009"))._RESULT);
                                ;
                                // JavaLine 57 <== SourceLine 1328
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),1328,new RTS_TXT("REMOTE"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\u00b8"))._RESULT);
                                ;
                                // JavaLine 60 <== SourceLine 1329
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),1329,new RTS_TXT("SELECT"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).quantvarianttag.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_SCODER3)(_CUR._SL._SL)).opt)))._RESULT);
                                ;
                                // JavaLine 63 <== SourceLine 1330
                                new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),1330,new RTS_TXT("RUPDATE"));
                                ;
                                // JavaLine 66 <== SourceLine 1331
                                new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),1331,new RTS_TXT("POP"));
                                ;
                                // JavaLine 69 <== SourceLine 1332
                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("\u0094"),new RTS_TXT("\u00009")),new RTS_TXT("K")),new RTS_TXT("\u0000\u00b8")),new RTS_TXT("J")));
                                ;
                                // JavaLine 72 <== SourceLine 1335
                                new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).quantvarianttag.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_SCODER3)(_CUR._SL._SL)).opt)));
                                ;
                                // JavaLine 75 <== SourceLine 1336
                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u0087"),new RTS_TXT("T")));
                                ;
                            }
                        }
                        ;
                        // JavaLine 81 <== SourceLine 1338
                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(1));
                        ;
                        // JavaLine 84 <== SourceLine 1339
                        new CLASS_SCODER3_codegenerator3_thunk_endthunk(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).lastThunk_9);
                        ;
                        // JavaLine 87 <== SourceLine 1340
                        new CLASS_SCODER3_codegenerator3_constPARDES((_CUR._SL),3,((char)0),((CLASS_SCODER3)(_CUR._SL._SL)).opt,((CLASS_SCODER3_codegenerator3)(_CUR._SL)).opq_3,((CLASS_SCODER3_codegenerator3)(_CUR._SL)).thunklabel_9);
                        ;
                        // JavaLine 90 <== SourceLine 1342
                        if(_VALUE((((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curpar_6==(null)))) {
                            // JavaLine 92 <== SourceLine 1343
                            new CLASS_SCODER3_codegenerator3_thunktounspecified((_CUR._SL),((CLASS_SCODER3)(_CUR._SL._SL)).opt,((CLASS_SCODER3_codegenerator3)(_CUR._SL)).opq_3);
                        } else {
                            // JavaLine 95 <== SourceLine 1344
                            {
                                // JavaLine 97 <== SourceLine 1345
                                new CLASS_SCODER2_codegenerator2_update_PARQNT((_CUR._SL),355);
                                ;
                                // JavaLine 100 <== SourceLine 1346
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),1346,new RTS_TXT("PUSHC"),CONC(new RTS_TXT("C-OADDR "),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).PDC_9)._RESULT));
                                ;
                                // JavaLine 103 <== SourceLine 1347
                                new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),1347,new RTS_TXT("ASSIGN"));
                                ;
                                // JavaLine 106 <== SourceLine 1348
                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\u0012")));
                                ;
                                // JavaLine 109 <== SourceLine 1349
                                new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).PDC_9);
                                ;
                                // JavaLine 112 <== SourceLine 1350
                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(111);
                                ;
                                // JavaLine 115 <== SourceLine 1351
                                new CLASS_SCODER3_codegenerator3_select_PARQNT((_CUR._SL),356);
                                ;
                                // JavaLine 118 <== SourceLine 1352
                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),1352,new RTS_TXT("PUSHV"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u00009"))._RESULT);
                                ;
                                // JavaLine 121 <== SourceLine 1353
                                new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),1353,new RTS_TXT("ASSSIGN"));
                                ;
                                // JavaLine 124 <== SourceLine 1354
                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0094"),new RTS_TXT("\u00009")),new RTS_TXT("o")));
                                ;
                                // JavaLine 127 <== SourceLine 1356
                                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(2));
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER3.sim","5 procLIRGPA",1,1308,10,1310,29,1311,32,1313,35,1314,38,1315,41,1316,44,1317,47,1318,52,1323,54,1327,57,1328,60,1329,63,1330,66,1331,69,1332,72,1335,75,1336,81,1338,84,1339,87,1340,90,1342,92,1343,95,1344,97,1345,100,1346,103,1347,106,1348,109,1349,112,1350,115,1351,118,1352,121,1353,124,1354,127,1356,139,1359);
} // End of Procedure
