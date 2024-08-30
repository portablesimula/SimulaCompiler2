// JavaLine 1 <== SourceLine 369
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:30 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER1_precheck0_getClass extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=369, lastLine=409, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_qty;
    public char p_foundblev;
    // Declare local labels
    // JavaLine 14 <== SourceLine 389
    final RTS_LABEL _LABEL_CLASS_BUILDER1_precheck0_getClass_Block382_Block383_Block386_LOOP_0=new RTS_LABEL(this,0,1,"LOOP"); // Local Label #1=LOOP At PrefixLevel 0
    // JavaLine 16 <== SourceLine 405
    final RTS_LABEL _LABEL_CLASS_BUILDER1_precheck0_getClass_Block382_Block383_nextbl_0=new RTS_LABEL(this,0,2,"nextbl"); // Local Label #2=nextbl At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 19 <== SourceLine 374
    public CLASS_COMMON_quantity cqt=null;
    // JavaLine 21 <== SourceLine 375
    public char bl=0;
    // JavaLine 23 <== SourceLine 382
    public CLASS_COMMON_brecord _inspect_382_4528=null;
    // JavaLine 25 <== SourceLine 369
    public CLASS_COMMON_quantity _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_BUILDER1_precheck0_getClass setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_qty=(CLASS_COMMON_quantity)objectValue(param); break;
                case 1: p_foundblev=(char)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_BUILDER1_precheck0_getClass(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public CLASS_BUILDER1_precheck0_getClass(RTS_RTObject _SL,CLASS_COMMON_quantity sp_qty,char sp_foundblev) {
        super(_SL);
        // Parameter assignment to locals
        this.p_qty = sp_qty;
        this.p_foundblev = sp_foundblev;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER1_precheck0_getClass _STM() {
        CLASS_BUILDER1_precheck0_getClass _THIS=(CLASS_BUILDER1_precheck0_getClass)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,2); // For ByteCode Engineering
                // JavaLine 61 <== SourceLine 379
                bl=((CLASS_BUILDER1)(_CUR._SL._SL)).cblev_6;
                ;
                // JavaLine 64 <== SourceLine 380
                while((bl>=(p_foundblev))) {
                    {
                        // JavaLine 67 <== SourceLine 382
                        {
                            // BEGIN INSPECTION 
                            _inspect_382_4528=((CLASS_BUILDER1)(_CUR._SL._SL)).display.getELEMENT(RTS_ENVIRONMENT.rank(bl));
                            if(_inspect_382_4528!=null) { // INSPECT _inspect_382_4528  type=ref(BRECORD)
                                // JavaLine 72 <== SourceLine 383
                                {
                                    // JavaLine 74 <== SourceLine 382
                                    {
                                        // JavaLine 76 <== SourceLine 383
                                        if(_VALUE((_inspect_382_4528.kind==(((char)1))))) {
                                            ;
                                        } else {
                                            if(_VALUE((_inspect_382_4528.kind==(((char)8))))) {
                                                ;
                                            } else {
                                                // JavaLine 83 <== SourceLine 385
                                                {
                                                    // JavaLine 85 <== SourceLine 386
                                                    cqt=_inspect_382_4528.declquant;
                                                    ;
                                                    // JavaLine 88 <== SourceLine 389
                                                    {
                                                        _SIM_LABEL(1); // DeclaredIn: getClass -> getClass[externalIdent=CLASS_BUILDER1_precheck0_getClass] Kind=5, QUAL=ProcedureDeclaration, HashCode=698743076
                                                        if(_VALUE((cqt.symb_1!=(p_qty.symb_1)))) {
                                                            {
                                                                // JavaLine 93 <== SourceLine 390
                                                                if(_VALUE((cqt.plev_1>(1)))) {
                                                                    {
                                                                        // JavaLine 96 <== SourceLine 391
                                                                        cqt=cqt.prefqual_1;
                                                                        ;
                                                                        _GOTO(_LABEL_CLASS_BUILDER1_precheck0_getClass_Block382_Block383_Block386_LOOP_0); // GOTO EVALUATED LABEL
                                                                    }
                                                                }
                                                                ;
                                                                // JavaLine 103 <== SourceLine 392
                                                                _GOTO(_LABEL_CLASS_BUILDER1_precheck0_getClass_Block382_Block383_nextbl_0); // GOTO EVALUATED LABEL
                                                                ;
                                                            }
                                                        }
                                                    }
                                                    ;
                                                    // JavaLine 110 <== SourceLine 394
                                                    _RESULT=cqt;
                                                    ;
                                                    // JavaLine 113 <== SourceLine 402
                                                    ((CLASS_BUILDER1_precheck0)(_CUR._SL)).enclLevel=_inspect_382_4528.rtblev;
                                                    ;
                                                    // JavaLine 116 <== SourceLine 403
                                                    bl=p_foundblev;
                                                    ;
                                                }
                                            }
                                        }
                                        ;
                                        // JavaLine 123 <== SourceLine 405
                                        {
                                            _SIM_LABEL(2); // DeclaredIn: getClass -> getClass[externalIdent=CLASS_BUILDER1_precheck0_getClass] Kind=5, QUAL=ProcedureDeclaration, HashCode=698743076
                                            ;
                                        }
                                    }
                                }
                            }
                        } // END INSPECTION
                        ;
                        // JavaLine 133 <== SourceLine 406
                        bl=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(bl)-(1)));
                        ;
                    }
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER1.sim","5 getClass",1,369,14,389,16,405,19,374,21,375,23,382,25,369,61,379,64,380,67,382,72,383,74,382,76,383,83,385,85,386,88,389,93,390,96,391,103,392,110,394,113,402,116,403,123,405,133,406,148,409);
} // End of Procedure
