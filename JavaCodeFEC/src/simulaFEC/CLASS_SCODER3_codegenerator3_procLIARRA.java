// JavaLine 1 <== SourceLine 1234
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:36 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER3_codegenerator3_procLIARRA extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1234, lastLine=1305, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 1236
    public char ccc=0;
    public CLASS_COMMON_quantity qqq=null;
    // Normal Constructor
    public CLASS_SCODER3_codegenerator3_procLIARRA(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER3_codegenerator3_procLIARRA _STM() {
        // JavaLine 24 <== SourceLine 1237
        if(_VALUE((RTS_UTIL._IS(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).callstack.getELEMENT((((CLASS_SCODER3_codegenerator3)(_CUR._SL)).calldepth_6-(1))),CLASS_COMMON_extquantity.class)&&((((CLASS_COMMON_extquantity)(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).callstack.getELEMENT((((CLASS_SCODER3_codegenerator3)(_CUR._SL)).calldepth_6-(1))))).clf_2!=(((char)0))))))) {
            // JavaLine 26 <== SourceLine 1239
            {
                // JavaLine 28 <== SourceLine 1241
                new CLASS_SCODER1_codegenerator1_endsubscription((_CUR._SL));
                ;
                // JavaLine 31 <== SourceLine 1242
                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("M"),new RTS_TXT("\u007d")),new RTS_TXT("I")));
                ;
                ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(1));
                ;
                // JavaLine 36 <== SourceLine 1243
                new CLASS_SCODER1_codegenerator1_popcall((_CUR._SL));
                ;
            }
        } else {
            // JavaLine 41 <== SourceLine 1245
            {
                // JavaLine 43 <== SourceLine 1246
                if(_VALUE((((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curcall_6.kind_1==(((char)4))))) {
                    {
                    }
                } else {
                    // JavaLine 48 <== SourceLine 1250
                    {
                        // JavaLine 50 <== SourceLine 1251
                        new CLASS_SCODER1_codegenerator1_endsubscription((_CUR._SL));
                        ;
                        // JavaLine 53 <== SourceLine 1252
                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),1252,new RTS_TXT("INDEX"));
                        ;
                        // JavaLine 56 <== SourceLine 1253
                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),1253,new RTS_TXT("EVAL"));
                        ;
                        // JavaLine 59 <== SourceLine 1254
                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),1254,new RTS_TXT("DEREF"));
                        ;
                        // JavaLine 62 <== SourceLine 1255
                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),1255,new RTS_TXT("DUP"));
                        ;
                        // JavaLine 65 <== SourceLine 1256
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),1256,new RTS_TXT("CONVERT"),new RTS_TXT("OADDR"));
                        ;
                        // JavaLine 68 <== SourceLine 1257
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),1257,new RTS_TXT("PUSHV"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u00009"))._RESULT);
                        ;
                        // JavaLine 71 <== SourceLine 1258
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),1258,new RTS_TXT("REMOTE"),CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\u00b8"))._RESULT,new RTS_TXT("  -- Infix(Quant)")));
                        ;
                        // JavaLine 74 <== SourceLine 1259
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),1259,new RTS_TXT("SELECT"),CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001y"))._RESULT,new RTS_TXT("  -- Quant.ins")));
                        ;
                        // JavaLine 77 <== SourceLine 1261
                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),1261,new RTS_TXT("RUPDATE"));
                        ;
                        // JavaLine 80 <== SourceLine 1262
                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),1262,new RTS_TXT("POP"));
                        ;
                        // JavaLine 83 <== SourceLine 1264
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),1264,new RTS_TXT("CONVERT"),new RTS_TXT("AADDR"));
                        ;
                        // JavaLine 86 <== SourceLine 1265
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),1265,new RTS_TXT("PUSHV"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u00009"))._RESULT);
                        ;
                        // JavaLine 89 <== SourceLine 1266
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),1266,new RTS_TXT("REMOTE"),CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\u00b8"))._RESULT,new RTS_TXT("  -- Infix(Quant)")));
                        ;
                        // JavaLine 92 <== SourceLine 1267
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),1267,new RTS_TXT("SELECT"),CONC(new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001z"))._RESULT,new RTS_TXT("  -- Quant.fld")));
                        ;
                        // JavaLine 95 <== SourceLine 1269
                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),1269,new RTS_TXT("RUPDATE"));
                        ;
                        // JavaLine 98 <== SourceLine 1270
                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),1270,new RTS_TXT("POP"));
                        ;
                        // JavaLine 101 <== SourceLine 1271
                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("M"),new RTS_TXT("\u007d")),new RTS_TXT("I")),new RTS_TXT("S")),new RTS_TXT("q")),new RTS_TXT("\u0000\b")),new RTS_TXT("\u0094")),new RTS_TXT("\u00009")),new RTS_TXT("K")),new RTS_TXT("\u0000\u00b8")),new RTS_TXT("J")),new RTS_TXT("\u0001y")),new RTS_TXT("\u0087")),new RTS_TXT("T")),new RTS_TXT("q")),new RTS_TXT("\u0000\u0007")),new RTS_TXT("\u0094")),new RTS_TXT("\u00009")),new RTS_TXT("K")),new RTS_TXT("\u0000\u00b8")),new RTS_TXT("J")),new RTS_TXT("\u0001z")),new RTS_TXT("\u0087")),new RTS_TXT("T")));
                        ;
                        // JavaLine 104 <== SourceLine 1284
                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(2));
                        ;
                    }
                }
                ;
                // JavaLine 110 <== SourceLine 1286
                new CLASS_SCODER3_codegenerator3_thunk_endthunk(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).lastThunk_9);
                ;
                // JavaLine 113 <== SourceLine 1287
                qqq=((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curcall_6.prefqual_1;
                ;
                ccc=((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curcall_6.type_1;
                ;
                // JavaLine 118 <== SourceLine 1288
                new CLASS_SCODER1_codegenerator1_popcall((_CUR._SL));
                ;
                // JavaLine 121 <== SourceLine 1289
                new CLASS_SCODER3_codegenerator3_constPARDES((_CUR._SL),4,((char)0),ccc,qqq,((CLASS_SCODER3_codegenerator3)(_CUR._SL)).thunklabel_9);
                ;
                // JavaLine 124 <== SourceLine 1290
                if(_VALUE((((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curpar_6==(null)))) {
                    {
                        // JavaLine 127 <== SourceLine 1292
                        new CLASS_SCODER3_codegenerator3_thunktounspecified((_CUR._SL),ccc,qqq);
                        ;
                    }
                } else {
                    // JavaLine 132 <== SourceLine 1294
                    {
                        // JavaLine 134 <== SourceLine 1295
                        new CLASS_SCODER2_codegenerator2_update_PARQNT((_CUR._SL),355);
                        ;
                        // JavaLine 137 <== SourceLine 1296
                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\u0012")));
                        ;
                        // JavaLine 140 <== SourceLine 1297
                        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).PDC_9);
                        ;
                        // JavaLine 143 <== SourceLine 1298
                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),1298,new RTS_TXT("ASSIGN"));
                        ;
                        // JavaLine 146 <== SourceLine 1299
                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(111);
                        ;
                        // JavaLine 149 <== SourceLine 1300
                        new CLASS_SCODER3_codegenerator3_select_PARQNT((_CUR._SL),356);
                        ;
                        // JavaLine 152 <== SourceLine 1301
                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0094"),new RTS_TXT("\u00009")),new RTS_TXT("o")));
                        ;
                        // JavaLine 155 <== SourceLine 1302
                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(2));
                        ;
                    }
                }
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER3.sim","5 procLIARRA",1,1234,10,1236,24,1237,26,1239,28,1241,31,1242,36,1243,41,1245,43,1246,48,1250,50,1251,53,1252,56,1253,59,1254,62,1255,65,1256,68,1257,71,1258,74,1259,77,1261,80,1262,83,1264,86,1265,89,1266,92,1267,95,1269,98,1270,101,1271,104,1284,110,1286,113,1287,118,1288,121,1289,124,1290,127,1292,132,1294,134,1295,137,1296,140,1297,143,1298,146,1299,149,1300,152,1301,155,1302,166,1305);
} // End of Procedure
