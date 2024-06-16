// JavaLine 1 <== SourceLine 282
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class ERRMSG_newnotseen extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=282, lastLine=301, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public COMMON_symbolbox p_symx;
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 283
    public COMMON_quantity q=null;
    // JavaLine 15 <== SourceLine 284
    public COMMON_quantity _inspect_284_4461=null;
    // JavaLine 17 <== SourceLine 282
    public COMMON_quantity _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public ERRMSG_newnotseen setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_symx=(COMMON_symbolbox)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public ERRMSG_newnotseen(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public ERRMSG_newnotseen(RTS_RTObject _SL,COMMON_symbolbox sp_symx) {
        super(_SL);
        // Parameter assignment to locals
        this.p_symx = sp_symx;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public ERRMSG_newnotseen _STM() {
        // JavaLine 47 <== SourceLine 284
        {
            // BEGIN INSPECTION 
            _inspect_284_4461=new COMMON_quantity((_CUR._SL))._STM();
            if(_inspect_284_4461!=null) { // INSPECT _inspect_284_4461
                // JavaLine 52 <== SourceLine 285
                {
                    // JavaLine 54 <== SourceLine 284
                    {
                        // JavaLine 56 <== SourceLine 285
                        q=((ERRMSG)(_CUR._SL)).unknowns.fpar;
                        ;
                        // JavaLine 59 <== SourceLine 286
                        if(_VALUE((q==(null)))) {
                            // JavaLine 61 <== SourceLine 287
                            {
                                ((ERRMSG)(_CUR._SL)).unknowns.fpar=((COMMON_quantity)_inspect_284_4461);
                                ;
                                _inspect_284_4461.virtno_1=1;
                            }
                        } else {
                            // JavaLine 68 <== SourceLine 288
                            {
                                while((q.next!=(null))) {
                                    q=((COMMON_quantity)(q.next));
                                }
                                ;
                                // JavaLine 74 <== SourceLine 289
                                q.next=((COMMON_quantity)_inspect_284_4461);
                                ;
                                // JavaLine 77 <== SourceLine 290
                                _inspect_284_4461.virtno_1=(q.virtno_1+(1));
                                ;
                            }
                        }
                        ;
                        // JavaLine 83 <== SourceLine 292
                        _inspect_284_4461.symb_1=p_symx;
                        ;
                        // JavaLine 86 <== SourceLine 293
                        _inspect_284_4461.categ_1=((char)5);
                        ;
                        _inspect_284_4461.kind_1=((char)10);
                        ;
                        _inspect_284_4461.type_1=((char)15);
                        ;
                        _inspect_284_4461.plev_1=1;
                        ;
                        // JavaLine 95 <== SourceLine 294
                        _inspect_284_4461.line_1=((ERRMSG)(_CUR._SL)).linenr;
                        ;
                        _inspect_284_4461.dim_1=1;
                        ;
                        _inspect_284_4461.encl_1=((ERRMSG)(_CUR._SL)).unknowns;
                        ;
                        // JavaLine 102 <== SourceLine 297
                        _RESULT=((COMMON_quantity)(((COMMON_identsymbol)(_inspect_284_4461.symb_1)).curmeaning_1=((COMMON_quantity)_inspect_284_4461)));
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("ERRMSG.sim","5 newnotseen",1,282,13,283,15,284,17,282,47,284,52,285,54,284,56,285,59,286,61,287,68,288,74,289,77,290,83,292,86,293,95,294,102,297,112,301);
} // End of Procedure
