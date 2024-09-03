// JavaLine 1 <== SourceLine 1363
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:53 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER3_codegenerator3_fnp_acc_smp extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1363, lastLine=1427, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 1367
    public boolean saveEmit=false;
    // JavaLine 12 <== SourceLine 1368
    public int tmpasd=0;
    // JavaLine 14 <== SourceLine 1370
    public CLASS_COMMON_quantity _inspect_1370_4655=null;
    // Normal Constructor
    public CLASS_SCODER3_codegenerator3_fnp_acc_smp(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER3_codegenerator3_fnp_acc_smp _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_1370_4655=((CLASS_SCODER3_codegenerator3)(_CUR._SL)).opq_3;
            if(_inspect_1370_4655!=null) { // INSPECT _inspect_1370_4655  type=ref(QUANTITY)
                // JavaLine 31 <== SourceLine 1371
                {
                    // JavaLine 33 <== SourceLine 1370
                    {
                        // JavaLine 35 <== SourceLine 1371
                        new CLASS_SCODER2_codegenerator2_addrPARQNT((_CUR._SL));
                        ;
                        // JavaLine 38 <== SourceLine 1372
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),1372,new RTS_TXT("SELECTV"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001e"))._RESULT);
                        ;
                        // JavaLine 41 <== SourceLine 1373
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),1373,new RTS_TXT("PUSHC"),new RTS_TXT("TRUE"));
                        ;
                        // JavaLine 44 <== SourceLine 1374
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),1374,new RTS_TXT("IF"),new RTS_TXT("EQ"));
                        ;
                        // JavaLine 47 <== SourceLine 1375
                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0095"),new RTS_TXT("\u0001e")),new RTS_TXT("Q")),new RTS_TXT("\u001c")),new RTS_TXT("?")),new RTS_TXT("y")));
                        ;
                        // JavaLine 50 <== SourceLine 1378
                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(1));
                        ;
                        new CLASS_SCODER0_codegenerator0_pushasd((_CUR._SL));
                        ;
                        // JavaLine 55 <== SourceLine 1379
                        new CLASS_SCODER2_codegenerator2_addrPARQNT((_CUR._SL));
                        ;
                        // JavaLine 58 <== SourceLine 1380
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),1380,new RTS_TXT("SELECTV"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001d"))._RESULT);
                        ;
                        // JavaLine 61 <== SourceLine 1381
                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u0095"),new RTS_TXT("\u0001d")));
                        ;
                        // JavaLine 64 <== SourceLine 1382
                        new CLASS_SCODER2_codegenerator2_addrPARQNT((_CUR._SL));
                        ;
                        // JavaLine 67 <== SourceLine 1383
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),1383,new RTS_TXT("SELECTV"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0001f"))._RESULT);
                        ;
                        // JavaLine 70 <== SourceLine 1384
                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),1384,new RTS_TXT("LOCATE"));
                        ;
                        // JavaLine 73 <== SourceLine 1385
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),1385,new RTS_TXT("REFER"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).typetag.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_1370_4655.type_1)))._RESULT);
                        ;
                        // JavaLine 76 <== SourceLine 1386
                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0095"),new RTS_TXT("\u0001f")),new RTS_TXT("L")),new RTS_TXT("H")));
                        ;
                        // JavaLine 79 <== SourceLine 1388
                        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).typetag.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_1370_4655.type_1)));
                        ;
                        // JavaLine 82 <== SourceLine 1391
                        tmpasd=((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asdstack.getELEMENT(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curasd_4);
                        ;
                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asdstack.putELEMENT(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asdstack.index(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).curasd_4),(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(1)));
                        ;
                        // JavaLine 87 <== SourceLine 1392
                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=tmpasd;
                        ;
                        // JavaLine 90 <== SourceLine 1393
                        saveEmit=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4>(0));
                        ;
                        // JavaLine 93 <== SourceLine 1394
                        if(_VALUE((saveEmit&&((((CLASS_SCODER3)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('Y'))!=(((char)0))))))) {
                            // JavaLine 95 <== SourceLine 1395
                            new CLASS_SCODER1_codegenerator1_outTrace((_CUR._SL),new RTS_TXT("save-FNP\u005fACC"));
                        }
                        ;
                        // JavaLine 99 <== SourceLine 1396
                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),1396,new RTS_TXT("FETCH"));
                        ;
                        // JavaLine 102 <== SourceLine 1397
                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),1397,new RTS_TXT("ELSE"));
                        ;
                        // JavaLine 105 <== SourceLine 1398
                        if(_VALUE(saveEmit)) {
                            new CLASS_SCODER1_codegenerator1_STRC_saveScheme((_CUR._SL));
                        }
                        ;
                        // JavaLine 110 <== SourceLine 1399
                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(((saveEmit)?(CONC(CONC(new RTS_TXT("G"),new RTS_TXT("@")),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).saveScheme_6)):(CONC(new RTS_TXT("G"),new RTS_TXT("@")))));
                        ;
                        // JavaLine 113 <== SourceLine 1403
                        new CLASS_SCODER2_codegenerator2_addrPARQNT((_CUR._SL));
                        ;
                        // JavaLine 116 <== SourceLine 1404
                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),1404,new RTS_TXT("DEREF"));
                        ;
                        // JavaLine 119 <== SourceLine 1405
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),1405,new RTS_TXT("ASSCALL"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0005\u00e9"))._RESULT);
                        ;
                        // JavaLine 122 <== SourceLine 1406
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),1406,new RTS_TXT("CALL"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0005\u00ea"))._RESULT);
                        ;
                        // JavaLine 125 <== SourceLine 1407
                        if(_VALUE(saveEmit)) {
                            new CLASS_SCODER1_codegenerator1_STRC_restoreScheme((_CUR._SL));
                        }
                        ;
                        // JavaLine 130 <== SourceLine 1408
                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(((saveEmit)?(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("I"),new RTS_TXT("\u0088")),new RTS_TXT("\u0005\u00e9")),new RTS_TXT("F")),new RTS_TXT("\u0005\u00ea")),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).restoreScheme_6)):(CONC(CONC(CONC(CONC(new RTS_TXT("I"),new RTS_TXT("\u0088")),new RTS_TXT("\u0005\u00e9")),new RTS_TXT("F")),new RTS_TXT("\u0005\u00ea")))));
                        ;
                        // JavaLine 133 <== SourceLine 1416
                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4=(((CLASS_SCODER3_codegenerator3)(_CUR._SL)).asd_4-(1));
                        ;
                        // JavaLine 136 <== SourceLine 1417
                        new CLASS_SCODER2_codegenerator2_addrPARQNT((_CUR._SL));
                        ;
                        // JavaLine 139 <== SourceLine 1418
                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER3"),1418,new RTS_TXT("DEREF"));
                        ;
                        // JavaLine 142 <== SourceLine 1419
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),1419,new RTS_TXT("ASSCALL"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).e_fnp_acc1.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_1370_4655.type_1)))._RESULT);
                        ;
                        // JavaLine 145 <== SourceLine 1420
                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(new RTS_TXT("I"),new RTS_TXT("\u0088")));
                        ;
                        // JavaLine 148 <== SourceLine 1421
                        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).e_fnp_acc1.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_1370_4655.type_1)));
                        ;
                        // JavaLine 151 <== SourceLine 1422
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER3"),1422,new RTS_TXT("CALL"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).e_fnp_acc2.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_1370_4655.type_1)))._RESULT);
                        ;
                        // JavaLine 154 <== SourceLine 1423
                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(70);
                        ;
                        // JavaLine 157 <== SourceLine 1424
                        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((CLASS_SCODER3_codegenerator3)(_CUR._SL)).e_fnp_acc2.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_1370_4655.type_1)));
                        ;
                        // JavaLine 160 <== SourceLine 1425
                        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outbyte(65);
                        ;
                        new CLASS_SCODER0_codegenerator0_checkequalandpop((_CUR._SL));
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER3.sim","5 fnp_acc_smp",1,1363,10,1367,12,1368,14,1370,31,1371,33,1370,35,1371,38,1372,41,1373,44,1374,47,1375,50,1378,55,1379,58,1380,61,1381,64,1382,67,1383,70,1384,73,1385,76,1386,79,1388,82,1391,87,1392,90,1393,93,1394,95,1395,99,1396,102,1397,105,1398,110,1399,113,1403,116,1404,119,1405,122,1406,125,1407,130,1408,133,1416,136,1417,139,1418,142,1419,145,1420,148,1421,151,1422,154,1423,157,1424,160,1425,172,1427);
} // End of Procedure
