// JavaLine 1 <== SourceLine 428
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_arithop_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=428, lastLine=440, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 429
    public CLASS_CHECKER1_semchecker1_exp _inspect_429_4557=null;
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_arithop_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_arithop_emit _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_429_4557=((CLASS_CHECKER1_semchecker1_arithop)(_CUR._SL)).p1_left;
            if(_inspect_429_4557!=null) { // INSPECT _inspect_429_4557  type=ref(EXP)
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
                        if(_VALUE((((CLASS_CHECKER1_semchecker1_arithop)(_CUR._SL)).type!=(_inspect_429_4557.type)))) {
                            // JavaLine 38 <== SourceLine 432
                            new CLASS_CHECKER1_semchecker1_MaybeConvert((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1_arithop)(_CUR._SL)).type,_inspect_429_4557.type);
                        }
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        // JavaLine 47 <== SourceLine 435
        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=((CLASS_CHECKER1_semchecker1_arithop)(_CUR._SL)).p_ch;
        ;
        // JavaLine 50 <== SourceLine 436
        ((CLASS_CHECKER1_semchecker1_arithop)(_CUR._SL)).p1_right.cl=((char)1);
        ;
        ((CLASS_CHECKER1_semchecker1_arithop)(_CUR._SL)).p1_right.emit_0().CPF();
        ;
        // JavaLine 55 <== SourceLine 437
        if(_VALUE((((CLASS_CHECKER1_semchecker1_arithop)(_CUR._SL)).type!=(((CLASS_CHECKER1_semchecker1_arithop)(_CUR._SL)).p1_right.type)))) {
            new CLASS_CHECKER1_semchecker1_MaybeConvert((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1_arithop)(_CUR._SL)).type,((CLASS_CHECKER1_semchecker1_arithop)(_CUR._SL)).p1_right.type);
        }
        ;
        // JavaLine 60 <== SourceLine 439
        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=((CLASS_CHECKER1_semchecker1_arithop)(_CUR._SL)).p_ch;
        ;
        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opt=((CLASS_CHECKER1_semchecker1_arithop)(_CUR._SL)).type;
        ;
        call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,439);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 emit",1,428,10,429,27,430,29,429,31,430,36,431,38,432,47,435,50,436,55,437,60,439,69,440);
} // End of Procedure
