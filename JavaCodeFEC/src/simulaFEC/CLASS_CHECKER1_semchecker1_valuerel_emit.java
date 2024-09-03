// JavaLine 1 <== SourceLine 346
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_valuerel_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=346, lastLine=371, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_valuerel_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_valuerel_emit _STM() {
        // JavaLine 21 <== SourceLine 347
        ((CLASS_CHECKER1_semchecker1_valuerel)(_CUR._SL)).p1_left.cl=((CLASS_CHECKER1_semchecker1_valuerel)(_CUR._SL)).p1_right.cl=((char)1);
        ;
        // JavaLine 24 <== SourceLine 348
        if(_VALUE((((CLASS_CHECKER1_semchecker1_valuerel)(_CUR._SL)).opttype_2==(((char)8))))) {
            {
                // JavaLine 27 <== SourceLine 350
                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=((CLASS_CHECKER1_semchecker1_valuerel)(_CUR._SL)).p_ch;
                ;
                // JavaLine 30 <== SourceLine 351
                ((CLASS_CHECKER1_semchecker1_valuerel)(_CUR._SL)).p1_left.emit_0().CPF();
                ;
                // JavaLine 33 <== SourceLine 353
                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6='M';
                ;
                call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,353);
                ;
                // JavaLine 38 <== SourceLine 354
                ((CLASS_CHECKER1_semchecker1_valuerel)(_CUR._SL)).p1_right.emit_0().CPF();
                ;
                // JavaLine 41 <== SourceLine 356
                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6='O';
                ;
                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opihi_6=((CLASS_CHECKER1_semchecker1_valuerel)(_CUR._SL)).p_ch;
                ;
            }
        } else {
            // JavaLine 48 <== SourceLine 358
            {
                // JavaLine 50 <== SourceLine 359
                ((CLASS_CHECKER1_semchecker1_valuerel)(_CUR._SL)).p1_left.emit_0().CPF();
                ;
                // JavaLine 53 <== SourceLine 360
                if(_VALUE((((CLASS_CHECKER1_semchecker1_valuerel)(_CUR._SL)).opttype_2!=(((CLASS_CHECKER1_semchecker1_valuerel)(_CUR._SL)).p1_left.type)))) {
                    // JavaLine 55 <== SourceLine 361
                    new CLASS_CHECKER1_semchecker1_MaybeConvert((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1_valuerel)(_CUR._SL)).opttype_2,((CLASS_CHECKER1_semchecker1_valuerel)(_CUR._SL)).p1_left.type);
                }
                ;
                // JavaLine 59 <== SourceLine 362
                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=((CLASS_CHECKER1_semchecker1_valuerel)(_CUR._SL)).p_ch;
                ;
                // JavaLine 62 <== SourceLine 363
                ((CLASS_CHECKER1_semchecker1_valuerel)(_CUR._SL)).p1_right.emit_0().CPF();
                ;
                // JavaLine 65 <== SourceLine 364
                if(_VALUE((((CLASS_CHECKER1_semchecker1_valuerel)(_CUR._SL)).opttype_2!=(((CLASS_CHECKER1_semchecker1_valuerel)(_CUR._SL)).p1_right.type)))) {
                    // JavaLine 67 <== SourceLine 365
                    new CLASS_CHECKER1_semchecker1_MaybeConvert((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1_valuerel)(_CUR._SL)).opttype_2,((CLASS_CHECKER1_semchecker1_valuerel)(_CUR._SL)).p1_right.type);
                }
                ;
                // JavaLine 71 <== SourceLine 367
                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=((CLASS_CHECKER1_semchecker1_valuerel)(_CUR._SL)).p_ch;
                ;
            }
        }
        ;
        // JavaLine 77 <== SourceLine 369
        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opilo_6=((CLASS_CHECKER1_semchecker1_valuerel)(_CUR._SL)).cl;
        ;
        call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,369);
        ;
        // JavaLine 82 <== SourceLine 370
        ((CLASS_CHECKER1_semchecker1)(_CUR._SL._SL)).valrelList_2=((CLASS_CHECKER1_semchecker1_valuerel)(_CUR._SL));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 emit",1,346,21,347,24,348,27,350,30,351,33,353,38,354,41,356,48,358,50,359,53,360,55,361,59,362,62,363,65,364,67,365,71,367,77,369,82,370,87,371);
} // End of Procedure
