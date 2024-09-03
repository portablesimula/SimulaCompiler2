// JavaLine 1 <== SourceLine 1300
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER2_prechecker_allocate_alloc2_checkhid extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=5, firstLine=1300, lastLine=1323, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_cq;
    // Declare local labels
    // JavaLine 11 <== SourceLine 1321
    final RTS_LABEL _LABEL_CLASS_BUILDER2_prechecker_allocate_alloc2_checkhid_Block1307_NXT_0=new RTS_LABEL(this,0,1,"NXT"); // Local Label #1=NXT At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 14 <== SourceLine 1302
    public CLASS_COMMON_idpack cvis=null;
    // JavaLine 16 <== SourceLine 1306
    public CLASS_COMMON_brecord _inspect_1305_4547=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_BUILDER2_prechecker_allocate_alloc2_checkhid setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_cq=(CLASS_COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_BUILDER2_prechecker_allocate_alloc2_checkhid(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_BUILDER2_prechecker_allocate_alloc2_checkhid(RTS_RTObject _SL,CLASS_COMMON_quantity sp_cq) {
        super(_SL);
        // Parameter assignment to locals
        this.p_cq = sp_cq;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER2_prechecker_allocate_alloc2_checkhid _STM() {
        CLASS_BUILDER2_prechecker_allocate_alloc2_checkhid _THIS=(CLASS_BUILDER2_prechecker_allocate_alloc2_checkhid)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 50 <== SourceLine 1305
                {
                    // BEGIN INSPECTION 
                    _inspect_1305_4547=((CLASS_BUILDER2_prechecker_allocate_alloc2)(_CUR._SL)).p_brc;
                    if(_inspect_1305_4547!=null) { // INSPECT _inspect_1305_4547  type=ref(BRECORD)
                        // JavaLine 55 <== SourceLine 1306
                        {
                            while(((_inspect_1305_4547.hidlist!=(null))&&((p_cq!=(null))))) {
                                {
                                    // JavaLine 59 <== SourceLine 1307
                                    if(_VALUE((p_cq.visible_1==(((char)0))))) {
                                        {
                                            // JavaLine 62 <== SourceLine 1308
                                            cvis=_inspect_1305_4547.hidlist;
                                            ;
                                            // JavaLine 65 <== SourceLine 1309
                                            while((cvis!=(null))) {
                                                {
                                                    // JavaLine 68 <== SourceLine 1310
                                                    if(_VALUE((p_cq.symb_1==(new CLASS_COMMON_boxof((_CUR._SL._SL._SL._SL),cvis.idhi,cvis.idlo)._RESULT)))) {
                                                        // JavaLine 70 <== SourceLine 1311
                                                        {
                                                            // JavaLine 72 <== SourceLine 1312
                                                            if(_VALUE((cvis.line>(0)))) {
                                                                {
                                                                    // JavaLine 75 <== SourceLine 1313
                                                                    if(_VALUE((p_cq.protect_1==(((char)1))))) {
                                                                        {
                                                                            // JavaLine 78 <== SourceLine 1314
                                                                            cvis.line=(-(cvis.line));
                                                                            ;
                                                                            _GOTO(_LABEL_CLASS_BUILDER2_prechecker_allocate_alloc2_checkhid_Block1307_NXT_0); // GOTO EVALUATED LABEL
                                                                        }
                                                                    }
                                                                    ;
                                                                    // JavaLine 85 <== SourceLine 1315
                                                                    new CLASS_ERRMSG_removeVis((_CUR._SL._SL._SL._SL),((CLASS_COMMON_brecord)_inspect_1305_4547),cvis,369);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    ;
                                                    // JavaLine 92 <== SourceLine 1318
                                                    cvis=cvis.next;
                                                    ;
                                                }
                                            }
                                            ;
                                        }
                                    }
                                    ;
                                    // JavaLine 101 <== SourceLine 1321
                                    {
                                        _SIM_LABEL(1); // DeclaredIn: checkhid -> checkhid[externalIdent=CLASS_BUILDER2_prechecker_allocate_alloc2_checkhid] Kind=5, QUAL=ProcedureDeclaration, HashCode=1923489377
                                        p_cq=((CLASS_COMMON_quantity)(p_cq.next));
                                    }
                                }
                            }
                        }
                    }
                } // END INSPECTION
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER2.sim","5 checkhid",1,1300,11,1321,14,1302,16,1306,50,1305,55,1306,59,1307,62,1308,65,1309,68,1310,70,1311,72,1312,75,1313,78,1314,85,1315,92,1318,101,1321,121,1323);
} // End of Procedure
