// JavaLine 1 <== SourceLine 428
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER1_semchecker1_arithop_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=428, lastLine=440, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 429
    public CHECKER1_semchecker1_exp _inspect_429_4557=null;
    // Normal Constructor
    public CHECKER1_semchecker1_arithop_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER1_semchecker1_arithop_emit _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_429_4557=((CHECKER1_semchecker1_arithop)(_CUR._SL)).p1_left;
            if(_inspect_429_4557!=null) { // INSPECT _inspect_429_4557
                // JavaLine 27 <== SourceLine 430
                {
                    // JavaLine 29 <== SourceLine 429
                    {
                        // JavaLine 31 <== SourceLine 430
                        _inspect_429_4557.cl=((char)1);
                        ;
                        _inspect_429_4557.emit_0().CPF();
                        ;
                        // JavaLine 36 <== SourceLine 431
                        if(_VALUE((((CHECKER1_semchecker1_arithop)(_CUR._SL)).type!=(_inspect_429_4557.type)))) {
                            // JavaLine 38 <== SourceLine 432
                            new CHECKER1_semchecker1_MaybeConvert((_CUR._SL._SL),((CHECKER1_semchecker1_arithop)(_CUR._SL)).type,_inspect_429_4557.type);
                        }
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        // JavaLine 47 <== SourceLine 435
        ((CHECKER1)(_CUR._SL._SL._SL)).opc_6=((CHECKER1_semchecker1_arithop)(_CUR._SL)).p_ch;
        ;
        // JavaLine 50 <== SourceLine 436
        ((CHECKER1_semchecker1_arithop)(_CUR._SL)).p1_right.cl=((char)1);
        ;
        ((CHECKER1_semchecker1_arithop)(_CUR._SL)).p1_right.emit_0().CPF();
        ;
        // JavaLine 55 <== SourceLine 437
        if(_VALUE((((CHECKER1_semchecker1_arithop)(_CUR._SL)).type!=(((CHECKER1_semchecker1_arithop)(_CUR._SL)).p1_right.type)))) {
            new CHECKER1_semchecker1_MaybeConvert((_CUR._SL._SL),((CHECKER1_semchecker1_arithop)(_CUR._SL)).type,((CHECKER1_semchecker1_arithop)(_CUR._SL)).p1_right.type);
        }
        ;
        // JavaLine 60 <== SourceLine 439
        ((CHECKER1)(_CUR._SL._SL._SL)).opc_6=((CHECKER1_semchecker1_arithop)(_CUR._SL)).p_ch;
        ;
        ((CHECKER1)(_CUR._SL._SL._SL)).opt=((CHECKER1_semchecker1_arithop)(_CUR._SL)).type;
        ;
        call(((CHECKER1)(_CUR._SL._SL._SL)).coder,439);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","5 emit",1,428,10,429,27,430,29,429,31,430,36,431,38,432,47,435,50,436,55,437,60,439,69,440);
} // End of Procedure
