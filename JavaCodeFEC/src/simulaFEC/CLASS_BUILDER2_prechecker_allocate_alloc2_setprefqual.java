// JavaLine 1 <== SourceLine 1383
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER2_prechecker_allocate_alloc2_setprefqual extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=5, firstLine=1383, lastLine=1424, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_Q;
    public boolean p_param;
    // Declare local labels
    // JavaLine 14 <== SourceLine 1423
    final RTS_LABEL _LABEL_CLASS_BUILDER2_prechecker_allocate_alloc2_setprefqual_out_0=new RTS_LABEL(this,0,1,"out"); // Local Label #1=out At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 17 <== SourceLine 1385
    public CLASS_COMMON_quantity QX=null;
    public CLASS_COMMON_symbolbox symx=null;
    // JavaLine 20 <== SourceLine 1386
    public int i=0;
    // JavaLine 22 <== SourceLine 1383
    public CLASS_COMMON_quantity _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_BUILDER2_prechecker_allocate_alloc2_setprefqual setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_Q=(CLASS_COMMON_quantity)objectValue(param); break;
                case 1: p_param=(boolean)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_BUILDER2_prechecker_allocate_alloc2_setprefqual(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public CLASS_BUILDER2_prechecker_allocate_alloc2_setprefqual(RTS_RTObject _SL,CLASS_COMMON_quantity sp_Q,boolean sp_param) {
        super(_SL);
        // Parameter assignment to locals
        this.p_Q = sp_Q;
        this.p_param = sp_param;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER2_prechecker_allocate_alloc2_setprefqual _STM() {
        CLASS_BUILDER2_prechecker_allocate_alloc2_setprefqual _THIS=(CLASS_BUILDER2_prechecker_allocate_alloc2_setprefqual)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 58 <== SourceLine 1388
                while((p_Q!=(null))) {
                    {
                        // JavaLine 61 <== SourceLine 1389
                        if(_VALUE(p_param)) {
                            {
                                // JavaLine 64 <== SourceLine 1390
                                if(_VALUE((p_Q.categ_1==(((char)3))))) {
                                    _GOTO(_LABEL_CLASS_BUILDER2_prechecker_allocate_alloc2_setprefqual_out_0); // GOTO EVALUATED LABEL
                                }
                                ;
                                // JavaLine 69 <== SourceLine 1391
                                if(_VALUE((p_Q.categ_1==(((char)4))))) {
                                    _GOTO(_LABEL_CLASS_BUILDER2_prechecker_allocate_alloc2_setprefqual_out_0); // GOTO EVALUATED LABEL
                                }
                            }
                        }
                        ;
                        // JavaLine 76 <== SourceLine 1392
                        if(_VALUE((p_Q.type_1==(((char)7))))) {
                            // JavaLine 78 <== SourceLine 1393
                            {
                                // JavaLine 80 <== SourceLine 1394
                                if(_VALUE((p_Q.line_1<(0)))) {
                                    // JavaLine 82 <== SourceLine 1395
                                    {
                                        i=(-(p_Q.line_1));
                                        ;
                                        p_Q.line_1=0;
                                    }
                                } else {
                                    // JavaLine 89 <== SourceLine 1396
                                    {
                                        i=(-(p_Q.ftag_1));
                                        ;
                                        p_Q.ftag_1=0;
                                    }
                                }
                                ;
                                // JavaLine 97 <== SourceLine 1397
                                symx=new CLASS_COMMON_getBox((_CUR._SL._SL._SL._SL),i)._RESULT;
                                ;
                                // JavaLine 100 <== SourceLine 1398
                                QX=new CLASS_BUILDER1_meaningof((_CUR._SL._SL._SL._SL),symx)._RESULT;
                                ;
                                // JavaLine 103 <== SourceLine 1399
                                if(_VALUE((QX==(null)))) {
                                    QX=new CLASS_ERRMSG_newnotseen((_CUR._SL._SL._SL._SL),symx)._RESULT;
                                }
                                ;
                                // JavaLine 108 <== SourceLine 1400
                                if(_VALUE((QX.categ_1==(((char)5))))) {
                                    {
                                        // JavaLine 111 <== SourceLine 1402
                                        if(_VALUE(RTS_UTIL._IS(p_Q,CLASS_COMMON_quantity.class))) {
                                            {
                                                // JavaLine 114 <== SourceLine 1403
                                                new CLASS_ERRMSG_errQTN((_CUR._SL._SL._SL._SL),p_Q,412,QX);
                                                ;
                                                p_Q.type_1=((char)15);
                                            }
                                        } else {
                                            // JavaLine 120 <== SourceLine 1404
                                            if(_VALUE((QX.kind_1==(((char)7))))) {
                                                p_Q.type_1=((char)9);
                                            }
                                        }
                                        ;
                                        // JavaLine 126 <== SourceLine 1405
                                        p_Q.prefqual_1=QX;
                                        ;
                                    }
                                } else {
                                    // JavaLine 131 <== SourceLine 1407
                                    if(_VALUE((QX.kind_1!=(((char)5))))) {
                                        {
                                            // JavaLine 134 <== SourceLine 1408
                                            if(_VALUE((QX.kind_1==(((char)7))))) {
                                                {
                                                    // JavaLine 137 <== SourceLine 1409
                                                    p_Q.prefqual_1=QX;
                                                    ;
                                                    p_Q.type_1=((char)9);
                                                }
                                            } else {
                                                // JavaLine 143 <== SourceLine 1410
                                                {
                                                    new CLASS_ERRMSG_errQTN((_CUR._SL._SL._SL._SL),p_Q,413,QX);
                                                    ;
                                                    p_Q.type_1=((char)15);
                                                }
                                            }
                                        }
                                    } else {
                                        // JavaLine 152 <== SourceLine 1412
                                        p_Q.prefqual_1=QX;
                                    }
                                }
                                ;
                                // JavaLine 157 <== SourceLine 1413
                                p_Q.plev_1=1;
                                ;
                            }
                        }
                        ;
                        // JavaLine 163 <== SourceLine 1416
                        if(_VALUE(((p_Q.kind_1==(((char)5)))||((p_Q.kind_1==(((char)7))))))) {
                            // JavaLine 165 <== SourceLine 1417
                            {
                                // JavaLine 167 <== SourceLine 1418
                                if(_VALUE((p_Q.prefqual_1==(null)))) {
                                    {
                                        // JavaLine 170 <== SourceLine 1419
                                        if(_VALUE(((p_Q.ftag_1<(0))|((p_Q.line_1<(0)))))) {
                                            new CLASS_BUILDER2_prechecker_allocate_alloc2_setprefix((_CUR._SL),p_Q);
                                        }
                                        ;
                                    }
                                }
                            }
                        }
                        ;
                        // JavaLine 180 <== SourceLine 1421
                        p_Q=((CLASS_COMMON_quantity)(p_Q.next));
                        ;
                    }
                }
                ;
                // JavaLine 186 <== SourceLine 1423
                {
                    _SIM_LABEL(1); // DeclaredIn: setprefqual
                    _RESULT=p_Q;
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER2.sim","5 setprefqual",1,1383,14,1423,17,1385,20,1386,22,1383,58,1388,61,1389,64,1390,69,1391,76,1392,78,1393,80,1394,82,1395,89,1396,97,1397,100,1398,103,1399,108,1400,111,1402,114,1403,120,1404,126,1405,131,1407,134,1408,137,1409,143,1410,152,1412,157,1413,163,1416,165,1417,167,1418,170,1419,180,1421,186,1423,201,1424);
} // End of Procedure
