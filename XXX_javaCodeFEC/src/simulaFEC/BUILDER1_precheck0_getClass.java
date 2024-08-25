// JavaLine 1 <== SourceLine 364
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER1_precheck0_getClass extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=364, lastLine=404, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public COMMON_quantity p_qty;
    public char p_foundblev;
    // Declare local labels
    // JavaLine 14 <== SourceLine 384
    final RTS_LABEL _LABEL_BUILDER1_precheck0_getClass_Block377_Block378_Block381_LOOP_0=new RTS_LABEL(this,0,1,"LOOP"); // Local Label #1=LOOP At PrefixLevel 0
    // JavaLine 16 <== SourceLine 400
    final RTS_LABEL _LABEL_BUILDER1_precheck0_getClass_Block377_Block378_nextbl_0=new RTS_LABEL(this,0,2,"nextbl"); // Local Label #2=nextbl At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 19 <== SourceLine 369
    public COMMON_quantity cqt=null;
    // JavaLine 21 <== SourceLine 370
    public char bl=0;
    // JavaLine 23 <== SourceLine 377
    public COMMON_brecord _inspect_377_4528=null;
    // JavaLine 25 <== SourceLine 364
    public COMMON_quantity _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public BUILDER1_precheck0_getClass setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_qty=(COMMON_quantity)objectValue(param); break;
                case 1: p_foundblev=(char)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public BUILDER1_precheck0_getClass(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public BUILDER1_precheck0_getClass(RTS_RTObject _SL,COMMON_quantity sp_qty,char sp_foundblev) {
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
    public BUILDER1_precheck0_getClass _STM() {
        BUILDER1_precheck0_getClass _THIS=(BUILDER1_precheck0_getClass)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,2); // For ByteCode Engineering
                // JavaLine 61 <== SourceLine 374
                bl=((BUILDER1)(_CUR._SL._SL)).cblev_6;
                ;
                // JavaLine 64 <== SourceLine 375
                while((bl>=(p_foundblev))) {
                    {
                        // JavaLine 67 <== SourceLine 377
                        {
                            // BEGIN INSPECTION 
                            _inspect_377_4528=((BUILDER1)(_CUR._SL._SL)).display.getELEMENT(RTS_ENVIRONMENT.rank(bl));
                            if(_inspect_377_4528!=null) { // INSPECT _inspect_377_4528
                                // JavaLine 72 <== SourceLine 378
                                {
                                    // JavaLine 74 <== SourceLine 377
                                    {
                                        // JavaLine 76 <== SourceLine 378
                                        if(_VALUE((_inspect_377_4528.kind==(((char)1))))) {
                                            ;
                                        } else {
                                            if(_VALUE((_inspect_377_4528.kind==(((char)8))))) {
                                                ;
                                            } else {
                                                // JavaLine 83 <== SourceLine 380
                                                {
                                                    // JavaLine 85 <== SourceLine 381
                                                    cqt=_inspect_377_4528.declquant;
                                                    ;
                                                    // JavaLine 88 <== SourceLine 384
                                                    {
                                                        _SIM_LABEL(1); // DeclaredIn: getClass -> getClass[externalIdent=BUILDER1_precheck0_getClass] Kind=5, QUAL=ProcedureDeclaration, HashCode=892981061
                                                        if(_VALUE((cqt.symb_1!=(p_qty.symb_1)))) {
                                                            {
                                                                // JavaLine 93 <== SourceLine 385
                                                                if(_VALUE((cqt.plev_1>(1)))) {
                                                                    {
                                                                        // JavaLine 96 <== SourceLine 386
                                                                        cqt=cqt.prefqual_1;
                                                                        ;
                                                                        _GOTO(_LABEL_BUILDER1_precheck0_getClass_Block377_Block378_Block381_LOOP_0); // GOTO EVALUATED LABEL
                                                                    }
                                                                }
                                                                ;
                                                                // JavaLine 103 <== SourceLine 387
                                                                _GOTO(_LABEL_BUILDER1_precheck0_getClass_Block377_Block378_nextbl_0); // GOTO EVALUATED LABEL
                                                                ;
                                                            }
                                                        }
                                                    }
                                                    ;
                                                    // JavaLine 110 <== SourceLine 389
                                                    _RESULT=cqt;
                                                    ;
                                                    // JavaLine 113 <== SourceLine 397
                                                    ((BUILDER1_precheck0)(_CUR._SL)).enclLevel=_inspect_377_4528.rtblev;
                                                    ;
                                                    // JavaLine 116 <== SourceLine 398
                                                    bl=p_foundblev;
                                                    ;
                                                }
                                            }
                                        }
                                        ;
                                        // JavaLine 123 <== SourceLine 400
                                        {
                                            _SIM_LABEL(2); // DeclaredIn: getClass -> getClass[externalIdent=BUILDER1_precheck0_getClass] Kind=5, QUAL=ProcedureDeclaration, HashCode=892981061
                                            ;
                                        }
                                    }
                                }
                            }
                        } // END INSPECTION
                        ;
                        // JavaLine 133 <== SourceLine 401
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER1.sim","5 getClass",1,364,14,384,16,400,19,369,21,370,23,377,25,364,61,374,64,375,67,377,72,378,74,377,76,378,83,380,85,381,88,384,93,385,96,386,103,387,110,389,113,397,116,398,123,400,133,401,148,404);
} // End of Procedure
