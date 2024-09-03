// JavaLine 1 <== SourceLine 1407
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_identifier_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1407, lastLine=1476, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 1433
    final RTS_LABEL _LABEL_CLASS_CHECKER1_semchecker1_identifier_emit_Block1411_Block1432_IDNout_0=new RTS_LABEL(this,0,1,"IDNout"); // Local Label #1=IDNout At PrefixLevel 0
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_identifier_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_identifier_emit _STM() {
        CLASS_CHECKER1_semchecker1_identifier_emit _THIS=(CLASS_CHECKER1_semchecker1_identifier_emit)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 28 <== SourceLine 1409
                if(((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).cl<((char)0) || ((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).cl>((char)6)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                switch(((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).cl) { // BEGIN SWITCH STATEMENT
                    case 1: 
                    // JavaLine 32 <== SourceLine 1410
                    {
                        // JavaLine 34 <== SourceLine 1411
                        if(((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).p_ch<((char)0) || ((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).p_ch>((char)134)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                        switch(((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).p_ch) { // BEGIN SWITCH STATEMENT
                            case 93: 
                            case 92: 
                            // JavaLine 39 <== SourceLine 1412
                            {
                                // JavaLine 41 <== SourceLine 1414
                                ((CLASS_CHECKER1_semchecker1)(_CUR._SL._SL)).blockpref_1=((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).meaning;
                                ;
                                new CLASS_BUILDER2_prechecker_allocate((_CUR._SL._SL));
                                ;
                                // JavaLine 46 <== SourceLine 1415
                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder.opq_3=new CLASS_COMMON_getBrc((_CUR._SL._SL._SL),((CLASS_CHECKER1_semchecker1)(_CUR._SL._SL)).lastblhi,((CLASS_CHECKER1_semchecker1)(_CUR._SL._SL)).lastbllo)._RESULT.declquant;
                                ;
                                // JavaLine 49 <== SourceLine 1416
                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6='\\';
                                ;
                                call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,1416);
                                ;
                                // JavaLine 54 <== SourceLine 1417
                                if(_VALUE((((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).p_ch==(']')))) {
                                    {
                                        // JavaLine 57 <== SourceLine 1418
                                        if(_VALUE((((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).meaning!=(null)))) {
                                            {
                                                // JavaLine 60 <== SourceLine 1420
                                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=',';
                                                ;
                                                call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,1420);
                                                ;
                                            }
                                        }
                                        ;
                                        // JavaLine 68 <== SourceLine 1422
                                        new CLASS_CHECKER1_semchecker1_enterblock((_CUR._SL._SL));
                                        ;
                                    }
                                }
                            }
                            break;
                            case 115: 
                            // JavaLine 76 <== SourceLine 1425
                            {
                                // JavaLine 78 <== SourceLine 1426
                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6='s';
                                ;
                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder.opq_3=((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).meaning;
                                ;
                                call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,1426);
                                ;
                            }
                            break;
                            case 129: 
                            case 134: 
                            // JavaLine 89 <== SourceLine 1427
                            {
                                // JavaLine 91 <== SourceLine 1428
                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6='Z';
                                ;
                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder.opq_3=((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).meaning;
                                ;
                                call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,1428);
                                ;
                            }
                            break;
                            case 34: 
                            // JavaLine 101 <== SourceLine 1429
                            {
                                // JavaLine 103 <== SourceLine 1430
                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6='Z';
                                ;
                                _GOTO(_LABEL_CLASS_CHECKER1_semchecker1_identifier_emit_Block1411_Block1432_IDNout_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 90: 
                            case 76: 
                            // JavaLine 111 <== SourceLine 1431
                            {
                                // JavaLine 113 <== SourceLine 1432
                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).p_ch;
                                ;
                                // JavaLine 116 <== SourceLine 1433
                                {
                                    _SIM_LABEL(1); // DeclaredIn: emit -> emit[externalIdent=CLASS_CHECKER1_semchecker1_identifier_emit] Kind=5, QUAL=ProcedureDeclaration, HashCode=1935274924
                                    ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder.opq_3=((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).meaning;
                                }
                                ;
                                call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,1433);
                                ;
                                // JavaLine 124 <== SourceLine 1434
                                if(((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).kind<((char)0) || ((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).kind>((char)13)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                switch(((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).kind) { // BEGIN SWITCH STATEMENT
                                    case 1: 
                                    // JavaLine 128 <== SourceLine 1435
                                    {
                                        // JavaLine 130 <== SourceLine 1436
                                        ((CLASS_CHECKER1_semchecker1)(_CUR._SL._SL)).lastopc=((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6;
                                        ;
                                        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=((char)12);
                                        ;
                                        call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,1436);
                                        ;
                                        // JavaLine 137 <== SourceLine 1437
                                        ((CLASS_CHECKER1_semchecker1)(_CUR._SL._SL)).lastopc=((char)12);
                                        ;
                                        // JavaLine 140 <== SourceLine 1438
                                        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=(((((((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).meaning.categ_1==(((char)3)))||((((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).meaning.categ_1==(((char)4)))))||(((((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).meaning.categ_1==(((char)6)))&&((((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).meaning.descr_1!=(null)))))))?('x'):(((char)147)));
                                        ;
                                        // JavaLine 143 <== SourceLine 1445
                                        call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,1445);
                                        ;
                                    }
                                    break;
                                    case 5: 
                                    // JavaLine 149 <== SourceLine 1446
                                    {
                                        // JavaLine 151 <== SourceLine 1448
                                        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6='+';
                                        ;
                                        call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,1448);
                                        ;
                                    }
                                    break;
                                } // END SWITCH STATEMENT
                                ;
                            }
                            break;
                        } // END SWITCH STATEMENT
                        ;
                    }
                    break;
                    case 6: 
                    case 4: 
                    // JavaLine 168 <== SourceLine 1454
                    {
                        // JavaLine 170 <== SourceLine 1455
                        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder.opq_3=((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).meaning;
                        ;
                        // JavaLine 173 <== SourceLine 1456
                        if(_VALUE((((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).kind==(((char)1))))) {
                            {
                                // JavaLine 176 <== SourceLine 1457
                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6='p';
                                ;
                                // JavaLine 179 <== SourceLine 1458
                                if(_VALUE((((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).meaning.categ_1==(((char)6))))) {
                                    // JavaLine 181 <== SourceLine 1459
                                    ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder.opq_3=((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).meaning.match_1;
                                }
                                ;
                            }
                        } else {
                            // JavaLine 187 <== SourceLine 1461
                            {
                                // JavaLine 189 <== SourceLine 1462
                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=((char)129);
                                ;
                                if(_VALUE((((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).cl==(((char)6))))) {
                                    ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opilo_6=((char)1);
                                }
                                ;
                            }
                        }
                        ;
                        // JavaLine 199 <== SourceLine 1464
                        call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,1464);
                        ;
                    }
                    break;
                    case 5: 
                    // JavaLine 205 <== SourceLine 1466
                    {
                        // JavaLine 207 <== SourceLine 1467
                        ((CLASS_CHECKER1_semchecker1)(_CUR._SL._SL)).lastopc=((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6;
                        ;
                        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=((char)141);
                        ;
                        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder.opq_3=((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).meaning;
                        ;
                        // JavaLine 214 <== SourceLine 1468
                        call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,1468);
                        ;
                    }
                    break;
                    default:
                    // JavaLine 220 <== SourceLine 1471
                    new CLASS_ERRMSG_internerr((_CUR._SL._SL._SL),((char)8),1471);
                    break;
                } // END SWITCH STATEMENT
                ;
                // JavaLine 225 <== SourceLine 1474
                if(_VALUE(RTS_UTIL._IS(((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)),CLASS_CHECKER1_semchecker1_simpleIdent.class))) {
                    // JavaLine 227 <== SourceLine 1475
                    ((CLASS_CHECKER1_semchecker1)(_CUR._SL._SL)).simpleList_2=((CLASS_CHECKER1_semchecker1_simpleIdent)(((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL))));
                }
                ;
                break _LOOP;
            }
            catch(RTS_LABEL q) {
                RTS_RTObject._TREAT_GOTO_CATCH_BLOCK(_THIS, q);
                _JTX=q.index; continue _LOOP; // EG. GOTO Lx
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 emit",1,1407,10,1433,28,1409,32,1410,34,1411,39,1412,41,1414,46,1415,49,1416,54,1417,57,1418,60,1420,68,1422,76,1425,78,1426,89,1427,91,1428,101,1429,103,1430,111,1431,113,1432,116,1433,124,1434,128,1435,130,1436,137,1437,140,1438,143,1445,149,1446,151,1448,168,1454,170,1455,173,1456,176,1457,179,1458,181,1459,187,1461,189,1462,199,1464,205,1466,207,1467,214,1468,220,1471,225,1474,227,1475,240,1476);
} // End of Procedure
