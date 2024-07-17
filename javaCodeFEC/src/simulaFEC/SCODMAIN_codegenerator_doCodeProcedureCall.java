// JavaLine 1 <== SourceLine 1225
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:53 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODMAIN_codegenerator_doCodeProcedureCall extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1225, lastLine=1722, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public SCODMAIN_codegenerator_doCodeProcedureCall(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODMAIN_codegenerator_doCodeProcedureCall _STM() {
        // JavaLine 21 <== SourceLine 1227
        new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),1227,CONC(new RTS_TXT("**************************************************** IEPRM: Clf="),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(((_IS(((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6,COMMON_extquantity.class))?(((COMMON_extquantity)(((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6)).clf_2):(((char)0)))))));
        ;
        // JavaLine 24 <== SourceLine 1228
        if(((_IS(((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6,COMMON_extquantity.class))?(((COMMON_extquantity)(((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6)).clf_2):(((char)0)))<((char)0) || ((_IS(((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6,COMMON_extquantity.class))?(((COMMON_extquantity)(((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6)).clf_2):(((char)0)))>'0') throw new RTS_SimulaRuntimeError("Switch key outside key interval");
        switch(((_IS(((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6,COMMON_extquantity.class))?(((COMMON_extquantity)(((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6)).clf_2):(((char)0)))) { // BEGIN SWITCH STATEMENT
            case 0: 
            // JavaLine 28 <== SourceLine 1230
            {
                // JavaLine 30 <== SourceLine 1231
                if(_VALUE((((SCODMAIN_codegenerator)(_CUR._SL)).curpar_6!=(null)))) {
                    // JavaLine 32 <== SourceLine 1233
                    {
                        // JavaLine 34 <== SourceLine 1257
                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),1257,new RTS_TXT("ASSCALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0004\u00ac"))._RESULT);
                        ;
                        // JavaLine 37 <== SourceLine 1258
                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),1258,new RTS_TXT("CALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0004\u00ad"))._RESULT);
                        ;
                        // JavaLine 40 <== SourceLine 1259
                        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0004\u00ac")),new RTS_TXT("F")),new RTS_TXT("\u0004\u00ad")));
                        ;
                        // JavaLine 43 <== SourceLine 1261
                        ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4-(1));
                        ;
                    }
                }
                ;
                // JavaLine 49 <== SourceLine 1263
                if(_VALUE(((SCODMAIN_codegenerator)(_CUR._SL)).saveemitted.getELEMENT(((SCODMAIN_codegenerator)(_CUR._SL)).saveindex_4))) {
                    {
                        // JavaLine 52 <== SourceLine 1264
                        new SCODER1_codegenerator1_STRC_restoreScheme((_CUR._SL));
                        ;
                        // JavaLine 55 <== SourceLine 1265
                        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(((SCODMAIN_codegenerator)(_CUR._SL)).restoreScheme_6);
                        ;
                        // JavaLine 58 <== SourceLine 1266
                        new SCODER0_codegenerator0_popasd((_CUR._SL));
                        ;
                        ((SCODMAIN_codegenerator)(_CUR._SL)).saveemitted.putELEMENT(((SCODMAIN_codegenerator)(_CUR._SL)).saveemitted.index(((SCODMAIN_codegenerator)(_CUR._SL)).saveindex_4),false);
                        ;
                    }
                }
                ;
                // JavaLine 66 <== SourceLine 1268
                ((SCODMAIN_codegenerator)(_CUR._SL)).saveindex_4=(((SCODMAIN_codegenerator)(_CUR._SL)).saveindex_4-(1));
                ;
                // JavaLine 69 <== SourceLine 1269
                if(_VALUE((((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.type_1!=(((char)14))))) {
                    {
                        // JavaLine 72 <== SourceLine 1270
                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),1270,new RTS_TXT("PUSH"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000@"))._RESULT);
                        ;
                        // JavaLine 75 <== SourceLine 1271
                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),1271,new RTS_TXT("SELECTV"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001s"))._RESULT);
                        ;
                        // JavaLine 78 <== SourceLine 1272
                        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),1272,new RTS_TXT("REMOTEV"),new SCODER0_codegenerator0_ED_TAG((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).resulttag.getELEMENT(RTS_ENVIRONMENT.rank(((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.type_1)))._RESULT);
                        ;
                        // JavaLine 81 <== SourceLine 1273
                        new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),1273,new RTS_TXT("EVAL"));
                        ;
                        // JavaLine 84 <== SourceLine 1274
                        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001s")),new RTS_TXT("\u0096")));
                        ;
                        // JavaLine 87 <== SourceLine 1277
                        new SCODER0_codegenerator0_outtag((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).resulttag.getELEMENT(RTS_ENVIRONMENT.rank(((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.type_1)));
                        ;
                        // JavaLine 90 <== SourceLine 1278
                        ((SCODMAIN_codegenerator)(_CUR._SL)).outbyte(125);
                        ;
                        // JavaLine 93 <== SourceLine 1279
                        ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4+(1));
                        ;
                    }
                }
            }
            break;
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            ;
            break;
            case 20: 
            // JavaLine 110 <== SourceLine 1282
            {
                // JavaLine 112 <== SourceLine 1283
                ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4-(1));
                ;
                // JavaLine 115 <== SourceLine 1284
                ((SCODMAIN_codegenerator)(_CUR._SL)).outbyte(102);
                ;
            }
            break;
            case 21: 
            // JavaLine 121 <== SourceLine 1286
            ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("G"),new RTS_TXT("S")),new RTS_TXT("Q")),new RTS_TXT("\r")),new RTS_TXT("\u00010")),new RTS_TXT("?")),new RTS_TXT("w")),new RTS_TXT("g")),new RTS_TXT("A")));
            break;
            case 22: 
            // JavaLine 125 <== SourceLine 1291
            ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("G"),new RTS_TXT("S")),new RTS_TXT("Q")),new RTS_TXT("\u000f")),new RTS_TXT("\u00010")),new RTS_TXT("?")),new RTS_TXT("w")),new RTS_TXT("g")),new RTS_TXT("A")));
            break;
            case 23: 
            // JavaLine 129 <== SourceLine 1296
            ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("G"),new RTS_TXT("S")),new RTS_TXT("Q")),new RTS_TXT("\u0010")),new RTS_TXT("\u00010")),new RTS_TXT("?")),new RTS_TXT("w")),new RTS_TXT("g")),new RTS_TXT("A")));
            break;
            case 24: 
            // JavaLine 133 <== SourceLine 1301
            ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("G"),new RTS_TXT("S")),new RTS_TXT("Q")),new RTS_TXT("\r")),new RTS_TXT("\u00010")),new RTS_TXT("?")),new RTS_TXT("\u007c")),new RTS_TXT("Q")),new RTS_TXT("\r")),new RTS_TXT("\u00010")),new RTS_TXT("?")),new RTS_TXT("w")),new RTS_TXT("Q")),new RTS_TXT("\r")),new RTS_TXT("\u0002-1")),new RTS_TXT("@")),new RTS_TXT("Q")),new RTS_TXT("\r")),new RTS_TXT("\u00011")),new RTS_TXT("A")),new RTS_TXT("A")));
            break;
            case 25: 
            // JavaLine 137 <== SourceLine 1313
            ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("G"),new RTS_TXT("S")),new RTS_TXT("Q")),new RTS_TXT("\u000f")),new RTS_TXT("\u00010")),new RTS_TXT("?")),new RTS_TXT("\u007c")),new RTS_TXT("Q")),new RTS_TXT("\u000f")),new RTS_TXT("\u00010")),new RTS_TXT("?")),new RTS_TXT("w")),new RTS_TXT("Q")),new RTS_TXT("\r")),new RTS_TXT("\u0002-1")),new RTS_TXT("@")),new RTS_TXT("Q")),new RTS_TXT("\r")),new RTS_TXT("\u00011")),new RTS_TXT("A")),new RTS_TXT("@")),new RTS_TXT("q")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("A")));
            break;
            case 26: 
            // JavaLine 141 <== SourceLine 1341
            ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("G"),new RTS_TXT("S")),new RTS_TXT("Q")),new RTS_TXT("\u0010")),new RTS_TXT("\u00010")),new RTS_TXT("?")),new RTS_TXT("\u007c")),new RTS_TXT("Q")),new RTS_TXT("\u0010")),new RTS_TXT("\u00010")),new RTS_TXT("?")),new RTS_TXT("w")),new RTS_TXT("Q")),new RTS_TXT("\r")),new RTS_TXT("\u0002-1")),new RTS_TXT("@")),new RTS_TXT("Q")),new RTS_TXT("\r")),new RTS_TXT("\u00011")),new RTS_TXT("A")),new RTS_TXT("@")),new RTS_TXT("q")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("A")));
            break;
            case 27: 
            case 28: 
            // JavaLine 146 <== SourceLine 1356
            ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(new RTS_TXT("q"),new RTS_TXT("\u0000\u0002")));
            break;
            case 29: 
            case 30: 
            // JavaLine 151 <== SourceLine 1360
            ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(new RTS_TXT("q"),new RTS_TXT("\u0000\u0003")));
            break;
            case 31: 
            // JavaLine 155 <== SourceLine 1362
            {
                // JavaLine 157 <== SourceLine 1363
                ((SCODMAIN_codegenerator)(_CUR._SL)).outbyte(151);
                ;
                ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4-(1));
                ;
            }
            break;
            case 32: 
            // JavaLine 165 <== SourceLine 1365
            {
                // JavaLine 167 <== SourceLine 1366
                ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("M"),new RTS_TXT("\u0087")),new RTS_TXT("T")));
                ;
                // JavaLine 170 <== SourceLine 1367
                ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4-(3));
                ;
            }
            break;
            case 33: 
            // JavaLine 176 <== SourceLine 1370
            {
                // JavaLine 178 <== SourceLine 1371
                ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4-(1));
                ;
                // JavaLine 181 <== SourceLine 1372
                ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001n")),new RTS_TXT("\u0087")),new RTS_TXT("T")),new RTS_TXT("G")),new RTS_TXT("S")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001n")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001n")),new RTS_TXT("\u0087")),new RTS_TXT("?")),new RTS_TXT("{")),new RTS_TXT("T")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001n")),new RTS_TXT("A")));
                    ;
                }
                break;
                case 34: 
                // JavaLine 187 <== SourceLine 1387
                {
                    // JavaLine 189 <== SourceLine 1388
                    ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4-(1));
                    ;
                    // JavaLine 192 <== SourceLine 1389
                    ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001p")),new RTS_TXT("\u0087")),new RTS_TXT("T")),new RTS_TXT("G")),new RTS_TXT("S")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001p")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001p")),new RTS_TXT("\u0087")),new RTS_TXT("?")),new RTS_TXT("{")),new RTS_TXT("T")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001p")),new RTS_TXT("A")));
                        ;
                    }
                    break;
                    case 35: 
                    // JavaLine 198 <== SourceLine 1404
                    {
                        // JavaLine 200 <== SourceLine 1405
                        ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4-(1));
                        ;
                        // JavaLine 203 <== SourceLine 1406
                        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001q")),new RTS_TXT("\u0087")),new RTS_TXT("T")),new RTS_TXT("G")),new RTS_TXT("S")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001q")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001q")),new RTS_TXT("\u0087")),new RTS_TXT("?")),new RTS_TXT("{")),new RTS_TXT("T")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001q")),new RTS_TXT("A")));
                            ;
                        }
                        break;
                        case 36: 
                        // JavaLine 209 <== SourceLine 1421
                        {
                            // JavaLine 211 <== SourceLine 1422
                            ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4-(1));
                            ;
                            // JavaLine 214 <== SourceLine 1423
                            ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001r")),new RTS_TXT("\u0087")),new RTS_TXT("T")),new RTS_TXT("G")),new RTS_TXT("S")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001r")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001r")),new RTS_TXT("\u0087")),new RTS_TXT("?")),new RTS_TXT("{")),new RTS_TXT("T")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001r")),new RTS_TXT("A")));
                                ;
                            }
                            break;
                            case 37: 
                            // JavaLine 220 <== SourceLine 1438
                            {
                                // JavaLine 222 <== SourceLine 1439
                                ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4-(1));
                                ;
                                // JavaLine 225 <== SourceLine 1440
                                ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001n")),new RTS_TXT("\u0087")),new RTS_TXT("T")),new RTS_TXT("G")),new RTS_TXT("S")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001n")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001n")),new RTS_TXT("\u0087")),new RTS_TXT("?")),new RTS_TXT("w")),new RTS_TXT("T")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001n")),new RTS_TXT("A")));
                                ;
                            }
                            break;
                            case 38: 
                            // JavaLine 231 <== SourceLine 1455
                            {
                                // JavaLine 233 <== SourceLine 1456
                                ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4-(1));
                                ;
                                // JavaLine 236 <== SourceLine 1457
                                ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001p")),new RTS_TXT("\u0087")),new RTS_TXT("T")),new RTS_TXT("G")),new RTS_TXT("S")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001p")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001p")),new RTS_TXT("\u0087")),new RTS_TXT("?")),new RTS_TXT("w")),new RTS_TXT("T")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001p")),new RTS_TXT("A")));
                                ;
                            }
                            break;
                            case 39: 
                            // JavaLine 242 <== SourceLine 1472
                            {
                                // JavaLine 244 <== SourceLine 1473
                                ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4-(1));
                                ;
                                // JavaLine 247 <== SourceLine 1474
                                ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001q")),new RTS_TXT("\u0087")),new RTS_TXT("T")),new RTS_TXT("G")),new RTS_TXT("S")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001q")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001q")),new RTS_TXT("\u0087")),new RTS_TXT("?")),new RTS_TXT("w")),new RTS_TXT("T")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001q")),new RTS_TXT("A")));
                                ;
                            }
                            break;
                            case 40: 
                            // JavaLine 253 <== SourceLine 1489
                            {
                                // JavaLine 255 <== SourceLine 1490
                                ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4-(1));
                                ;
                                // JavaLine 258 <== SourceLine 1491
                                ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001r")),new RTS_TXT("\u0087")),new RTS_TXT("T")),new RTS_TXT("G")),new RTS_TXT("S")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001r")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001r")),new RTS_TXT("\u0087")),new RTS_TXT("?")),new RTS_TXT("w")),new RTS_TXT("T")),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001r")),new RTS_TXT("A")));
                                ;
                            }
                            break;
                            case 41: 
                            // JavaLine 264 <== SourceLine 1506
                            {
                                // JavaLine 266 <== SourceLine 1507
                                ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4+(1));
                                ;
                                // JavaLine 269 <== SourceLine 1508
                                ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\r")));
                                ;
                                new SCODER0_codegenerator0_outinteger((_CUR._SL),((SCODMAIN)(_CUR._SL._SL)).linenr);
                                ;
                            }
                            break;
                            case 42: 
                            case 43: 
                            // JavaLine 278 <== SourceLine 1517
                            ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("G"),new RTS_TXT("P")),new RTS_TXT("\u0000P")),new RTS_TXT("\u0087")),new RTS_TXT("T")),new RTS_TXT("P")),new RTS_TXT("\u0000P")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001;")),new RTS_TXT("P")),new RTS_TXT("\u0000P")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001=")),new RTS_TXT("v")),new RTS_TXT("w")));
                            break;
                            case 44: 
                            case 45: 
                            // JavaLine 283 <== SourceLine 1536
                            ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("G"),new RTS_TXT("P")),new RTS_TXT("\u0000P")),new RTS_TXT("\u0087")),new RTS_TXT("T")),new RTS_TXT("P")),new RTS_TXT("\u0000P")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001;")),new RTS_TXT("P")),new RTS_TXT("\u0000P")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001<")),new RTS_TXT("c")),new RTS_TXT("Q")),new RTS_TXT("\r")),new RTS_TXT("\u00011")),new RTS_TXT("b")));
                            break;
                            case 46: 
                            case 47: 
                            // JavaLine 288 <== SourceLine 1555
                            ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("G"),new RTS_TXT("P")),new RTS_TXT("\u0000P")),new RTS_TXT("\u0087")),new RTS_TXT("T")),new RTS_TXT("P")),new RTS_TXT("\u0000P")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001=")),new RTS_TXT("P")),new RTS_TXT("\u0000P")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001<")),new RTS_TXT("c")));
                            break;
                            case 48: 
                            // JavaLine 292 <== SourceLine 1570
                            ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("G"),new RTS_TXT("P")),new RTS_TXT("\u0000P")),new RTS_TXT("\u0087")),new RTS_TXT("T")),new RTS_TXT("P")),new RTS_TXT("\u0000P")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001<")),new RTS_TXT("Q")),new RTS_TXT("\r")),new RTS_TXT("\u00011")),new RTS_TXT("b")));
                            break;
                            default:
                            // JavaLine 296 <== SourceLine 1616
                            {
                                // JavaLine 298 <== SourceLine 1617
                                new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),1617,new RTS_TXT("CALL"),new SCODER0_codegenerator0_ED_TAG((_CUR._SL),(((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.ftag_1+(1)))._RESULT);
                                ;
                                // JavaLine 301 <== SourceLine 1618
                                ((SCODMAIN_codegenerator)(_CUR._SL)).outbyte(70);
                                ;
                                new SCODER0_codegenerator0_outtag((_CUR._SL),(((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.ftag_1+(1)));
                                ;
                                // JavaLine 306 <== SourceLine 1619
                                if(_VALUE((((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.type_1==(((char)14))))) {
                                    ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4-(1));
                                }
                                ;
                                // JavaLine 311 <== SourceLine 1620
                                if(_VALUE(((SCODMAIN_codegenerator)(_CUR._SL)).saveemitted.getELEMENT(((SCODMAIN_codegenerator)(_CUR._SL)).saveindex_4))) {
                                    {
                                        // JavaLine 314 <== SourceLine 1622
                                        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext((((((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.type_1==(((char)1))))?(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001m")),new RTS_TXT("\u0087")),new RTS_TXT("T")),((SCODMAIN_codegenerator)(_CUR._SL)).restoreScheme_6),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001m")),new RTS_TXT("\u007d"))):(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000P")),new RTS_TXT("\u0087")),new RTS_TXT("T")),((SCODMAIN_codegenerator)(_CUR._SL)).restoreScheme_6),new RTS_TXT("\u0094")),new RTS_TXT("\u0000P")),new RTS_TXT("\u007d")))));
                                        ;
                                        // JavaLine 317 <== SourceLine 1685
                                        new SCODER0_codegenerator0_popasd((_CUR._SL));
                                        ;
                                        ((SCODMAIN_codegenerator)(_CUR._SL)).saveemitted.putELEMENT(((SCODMAIN_codegenerator)(_CUR._SL)).saveemitted.index(((SCODMAIN_codegenerator)(_CUR._SL)).saveindex_4),false);
                                        ;
                                        // JavaLine 322 <== SourceLine 1686
                                        ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4+(1));
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 328 <== SourceLine 1688
                                ((SCODMAIN_codegenerator)(_CUR._SL)).saveindex_4=(((SCODMAIN_codegenerator)(_CUR._SL)).saveindex_4-(1));
                                ;
                                // JavaLine 331 <== SourceLine 1690
                                if(_VALUE((((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.descr_1!=(null)))) {
                                    {
                                        // JavaLine 334 <== SourceLine 1691
                                        if(_VALUE(((((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.dim_1==(RTS_ENVIRONMENT.rank('L')))||((((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.dim_1==(RTS_ENVIRONMENT.rank('M'))))))) {
                                            // JavaLine 336 <== SourceLine 1693
                                            {
                                                // JavaLine 338 <== SourceLine 1694
                                                if(_VALUE((((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.type_1==(((char)8))))) {
                                                    {
                                                        // JavaLine 341 <== SourceLine 1696
                                                        if(_VALUE((((SCODMAIN_codegenerator)(_CUR._SL)).asd_4>(1)))) {
                                                            {
                                                                // JavaLine 344 <== SourceLine 1697
                                                                if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('Y'))!=(((char)0))))) {
                                                                    // JavaLine 346 <== SourceLine 1698
                                                                    new SCODER1_codegenerator1_outTrace((_CUR._SL),new RTS_TXT("save:C text proc"));
                                                                }
                                                                ;
                                                                // JavaLine 350 <== SourceLine 1701
                                                                ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("P"),new RTS_TXT("\u0000@")),new RTS_TXT("J")),new RTS_TXT("\u0001s")),new RTS_TXT("\u0087")),new RTS_TXT("T")),((SCODMAIN_codegenerator)(_CUR._SL)).saveScheme_6),new RTS_TXT("P")),new RTS_TXT("\u0000@")),new RTS_TXT("\u0095")),new RTS_TXT("\u0001s")),new RTS_TXT("\u0088")),new RTS_TXT("\u0005h")),new RTS_TXT("F")),new RTS_TXT("\u0005i")),new RTS_TXT("P")),new RTS_TXT("\u0000P")),new RTS_TXT("\u0087")),new RTS_TXT("T")),((SCODMAIN_codegenerator)(_CUR._SL)).restoreScheme_6),new RTS_TXT("\u0094")),new RTS_TXT("\u0000P")));
                                                            }
                                                        } else {
                                                            // JavaLine 354 <== SourceLine 1714
                                                            ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0088"),new RTS_TXT("\u0005h")),new RTS_TXT("F")),new RTS_TXT("\u0005i")));
                                                        }
                                                        ;
                                                    }
                                                } else {
                                                    // JavaLine 360 <== SourceLine 1717
                                                    if(_VALUE((((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.type_1==(((char)7))))) {
                                                        // JavaLine 362 <== SourceLine 1718
                                                        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("Q"),new RTS_TXT("\u000e")),new RTS_TXT("\u0000\u0096")),new RTS_TXT("O")));
                                                    }
                                                }
                                                ;
                                            }
                                        }
                                    }
                                }
                                ;
                            }
                            break;
                        } // END SWITCH STATEMENT
                        ;
                        EBLK();
                        return(this);
                    } // End of Procedure BODY
                    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODMAIN.sim","5 doCodeProcedureCall",1,1225,21,1227,24,1228,28,1230,30,1231,32,1233,34,1257,37,1258,40,1259,43,1261,49,1263,52,1264,55,1265,58,1266,66,1268,69,1269,72,1270,75,1271,78,1272,81,1273,84,1274,87,1277,90,1278,93,1279,110,1282,112,1283,115,1284,121,1286,125,1291,129,1296,133,1301,137,1313,141,1341,146,1356,151,1360,155,1362,157,1363,165,1365,167,1366,170,1367,176,1370,178,1371,181,1372,187,1387,189,1388,192,1389,198,1404,200,1405,203,1406,209,1421,211,1422,214,1423,220,1438,222,1439,225,1440,231,1455,233,1456,236,1457,242,1472,244,1473,247,1474,253,1489,255,1490,258,1491,264,1506,266,1507,269,1508,278,1517,283,1536,288,1555,292,1570,296,1616,298,1617,301,1618,306,1619,311,1620,314,1622,317,1685,322,1686,328,1688,331,1690,334,1691,336,1693,338,1694,341,1696,344,1697,346,1698,350,1701,354,1714,360,1717,362,1718,378,1722);
                } // End of Procedure
