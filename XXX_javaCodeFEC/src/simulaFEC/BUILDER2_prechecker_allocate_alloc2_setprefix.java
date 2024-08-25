// JavaLine 1 <== SourceLine 1325
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:29 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER2_prechecker_allocate_alloc2_setprefix extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=5, firstLine=1325, lastLine=1381, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public COMMON_quantity p_subq;
    // Declare local labels
    // JavaLine 11 <== SourceLine 1359
    final RTS_LABEL _LABEL_BUILDER2_prechecker_allocate_alloc2_setprefix_Block1338_Block1350_Block1354_PrefErr_0=new RTS_LABEL(this,0,1,"PrefErr"); // Local Label #1=PrefErr At PrefixLevel 0
    // JavaLine 13 <== SourceLine 1370
    final RTS_LABEL _LABEL_BUILDER2_prechecker_allocate_alloc2_setprefix_Block1338_Block1370_setPref_0=new RTS_LABEL(this,0,2,"setPref"); // Local Label #2=setPref At PrefixLevel 0
    // JavaLine 15 <== SourceLine 1379
    final RTS_LABEL _LABEL_BUILDER2_prechecker_allocate_alloc2_setprefix_Block1338_out_0=new RTS_LABEL(this,0,3,"out"); // Local Label #3=out At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 18 <== SourceLine 1331
    public COMMON_quantity PQ=null;
    public COMMON_quantity smlblk=null;
    // JavaLine 21 <== SourceLine 1332
    public COMMON_symbolbox symx=null;
    public int i=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public BUILDER2_prechecker_allocate_alloc2_setprefix setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_subq=(COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public BUILDER2_prechecker_allocate_alloc2_setprefix(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public BUILDER2_prechecker_allocate_alloc2_setprefix(RTS_RTObject _SL,COMMON_quantity sp_subq) {
        super(_SL);
        // Parameter assignment to locals
        this.p_subq = sp_subq;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER2_prechecker_allocate_alloc2_setprefix _STM() {
        BUILDER2_prechecker_allocate_alloc2_setprefix _THIS=(BUILDER2_prechecker_allocate_alloc2_setprefix)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,3); // For ByteCode Engineering
                // JavaLine 56 <== SourceLine 1334
                if(_VALUE((((p_subq.kind_1!=(((char)5)))&((p_subq.kind_1!=(((char)7)))))|((p_subq.prefqual_1!=(null)))))) {
                    // JavaLine 58 <== SourceLine 1336
                    new ERRMSG_internerr((_CUR._SL._SL._SL._SL),((char)7),1336);
                } else {
                    // JavaLine 61 <== SourceLine 1337
                    {
                        // JavaLine 63 <== SourceLine 1338
                        p_subq.match_1=((BUILDER2)(_CUR._SL._SL._SL._SL)).setprefgoing;
                        ;
                        // JavaLine 66 <== SourceLine 1339
                        if(_VALUE((p_subq.line_1<(0)))) {
                            // JavaLine 68 <== SourceLine 1340
                            {
                                i=(-(p_subq.line_1));
                                ;
                                p_subq.line_1=0;
                            }
                        } else {
                            // JavaLine 75 <== SourceLine 1341
                            {
                                i=(-(p_subq.ftag_1));
                                ;
                                p_subq.ftag_1=0;
                            }
                        }
                        ;
                        // JavaLine 83 <== SourceLine 1342
                        symx=new COMMON_getBox((_CUR._SL._SL._SL._SL),i)._RESULT;
                        ;
                        PQ=new BUILDER1_meaningof((_CUR._SL._SL._SL._SL),symx)._RESULT;
                        ;
                        // JavaLine 88 <== SourceLine 1343
                        if(_VALUE((PQ==(null)))) {
                            PQ=new ERRMSG_newnotseen((_CUR._SL._SL._SL._SL),symx)._RESULT;
                        }
                        ;
                        // JavaLine 93 <== SourceLine 1344
                        if(_VALUE(((PQ.categ_1==(((char)5)))|(((PQ.kind_1!=(((char)5)))&((PQ.kind_1!=(((char)7))))))))) {
                            // JavaLine 95 <== SourceLine 1346
                            new ERRMSG_errQTN((_CUR._SL._SL._SL._SL),p_subq,409,PQ);
                        } else {
                            // JavaLine 98 <== SourceLine 1347
                            if(_VALUE((PQ.encl_1.blev!=(p_subq.encl_1.blev)))) {
                                {
                                    // JavaLine 101 <== SourceLine 1350
                                    if(_VALUE(_IS(PQ,COMMON_quantity.class))) {
                                        _GOTO(_LABEL_BUILDER2_prechecker_allocate_alloc2_setprefix_Block1338_Block1350_Block1354_PrefErr_0); // GOTO EVALUATED LABEL
                                    }
                                    ;
                                    // JavaLine 106 <== SourceLine 1351
                                    if(_VALUE((((COMMON_extquantity)(PQ)).clf_2==(((char)9))))) {
                                        {
                                            // JavaLine 109 <== SourceLine 1354
                                            smlblk=p_subq.encl_1.declquant;
                                            ;
                                            // JavaLine 112 <== SourceLine 1355
                                            while((smlblk.plev_1>(2))) {
                                                smlblk=smlblk.prefqual_1;
                                            }
                                            ;
                                            // JavaLine 117 <== SourceLine 1356
                                            if(_VALUE((smlblk.symb_1!=(null)))) {
                                                {
                                                    // JavaLine 120 <== SourceLine 1357
                                                    if(_VALUE(_TXTREL_EQ(smlblk.symb_1.symbol,new RTS_TXT("simulation")))) {
                                                        // JavaLine 122 <== SourceLine 1358
                                                        _GOTO(_LABEL_BUILDER2_prechecker_allocate_alloc2_setprefix_Block1338_Block1370_setPref_0); // GOTO EVALUATED LABEL
                                                    }
                                                }
                                            }
                                            ;
                                            // JavaLine 128 <== SourceLine 1359
                                            {
                                                _SIM_LABEL(1); // DeclaredIn: setprefix -> setprefix[externalIdent=BUILDER2_prechecker_allocate_alloc2_setprefix] Kind=5, QUAL=ProcedureDeclaration, HashCode=1895707642
                                                new ERRMSG_errQTN((_CUR._SL._SL._SL._SL),p_subq,410,PQ);
                                            }
                                            ;
                                        }
                                    } else {
                                        // JavaLine 136 <== SourceLine 1361
                                        if(_VALUE((((COMMON_extquantity)(PQ)).clf_2!=(((char)4))))) {
                                            // JavaLine 138 <== SourceLine 1363
                                            _GOTO(_LABEL_BUILDER2_prechecker_allocate_alloc2_setprefix_Block1338_Block1350_Block1354_PrefErr_0); // GOTO EVALUATED LABEL
                                        }
                                    }
                                    ;
                                    // JavaLine 143 <== SourceLine 1364
                                    _GOTO(_LABEL_BUILDER2_prechecker_allocate_alloc2_setprefix_Block1338_Block1370_setPref_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                            } else {
                                // JavaLine 148 <== SourceLine 1367
                                if(_VALUE((PQ.match_1==(((BUILDER2)(_CUR._SL._SL._SL._SL)).setprefgoing)))) {
                                    // JavaLine 150 <== SourceLine 1368
                                    new ERRMSG_errQT((_CUR._SL._SL._SL._SL),p_subq,318);
                                } else {
                                    // JavaLine 153 <== SourceLine 1369
                                    {
                                        // JavaLine 155 <== SourceLine 1370
                                        {
                                            _SIM_LABEL(2); // DeclaredIn: setprefix -> setprefix[externalIdent=BUILDER2_prechecker_allocate_alloc2_setprefix] Kind=5, QUAL=ProcedureDeclaration, HashCode=1895707642
                                            if(_VALUE((PQ.prefqual_1==(null)))) {
                                                {
                                                    // JavaLine 160 <== SourceLine 1371
                                                    if(_VALUE(((PQ.ftag_1<(0))|((PQ.line_1<(0)))))) {
                                                        // JavaLine 162 <== SourceLine 1372
                                                        new BUILDER2_prechecker_allocate_alloc2_setprefix((_CUR._SL),PQ);
                                                    }
                                                }
                                            }
                                        }
                                        ;
                                        // JavaLine 169 <== SourceLine 1373
                                        p_subq.prefqual_1=PQ;
                                        ;
                                        p_subq.plev_1=(PQ.plev_1+(1));
                                        ;
                                        // JavaLine 174 <== SourceLine 1374
                                        _GOTO(_LABEL_BUILDER2_prechecker_allocate_alloc2_setprefix_Block1338_out_0); // GOTO EVALUATED LABEL
                                        ;
                                    }
                                }
                            }
                        }
                        ;
                        // JavaLine 182 <== SourceLine 1377
                        p_subq.prefqual_1=null;
                        ;
                        // JavaLine 185 <== SourceLine 1378
                        p_subq.plev_1=(((p_subq.kind_1==(((char)5))))?(1):(0));
                        ;
                        // JavaLine 188 <== SourceLine 1379
                        {
                            _SIM_LABEL(3); // DeclaredIn: setprefix -> setprefix[externalIdent=BUILDER2_prechecker_allocate_alloc2_setprefix] Kind=5, QUAL=ProcedureDeclaration, HashCode=1895707642
                            p_subq.match_1=null;
                        }
                        ;
                    }
                }
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER2.sim","5 setprefix",1,1325,11,1359,13,1370,15,1379,18,1331,21,1332,56,1334,58,1336,61,1337,63,1338,66,1339,68,1340,75,1341,83,1342,88,1343,93,1344,95,1346,98,1347,101,1350,106,1351,109,1354,112,1355,117,1356,120,1357,122,1358,128,1359,136,1361,138,1363,143,1364,148,1367,150,1368,153,1369,155,1370,160,1371,162,1372,169,1373,174,1374,182,1377,185,1378,188,1379,205,1381);
} // End of Procedure
