// JavaLine 1 <== SourceLine 1201
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_textconst_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1201, lastLine=1222, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_textconst_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_textconst_emit _STM() {
        // JavaLine 21 <== SourceLine 1212
        if(_VALUE((((CLASS_CHECKER1_semchecker1_textconst)(_CUR._SL)).ixhi_1==(((char)0))))) {
            {
                // JavaLine 24 <== SourceLine 1213
                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=((char)8);
                ;
            }
        } else {
            // JavaLine 29 <== SourceLine 1216
            if(_VALUE((((CLASS_CHECKER1_semchecker1_textconst)(_CUR._SL)).id_2==(null)))) {
                {
                    // JavaLine 32 <== SourceLine 1218
                    ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6='{';
                        ;
                        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opihi_6=((CLASS_CHECKER1_semchecker1_textconst)(_CUR._SL)).ixhi_1;
                        ;
                        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opilo_6=((CLASS_CHECKER1_semchecker1_textconst)(_CUR._SL)).ixlo_1;
                    }
                } else {
                    // JavaLine 40 <== SourceLine 1219
                    {
                        // JavaLine 42 <== SourceLine 1220
                        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6='S';
                        ;
                        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder.opq_3=((CLASS_CHECKER1_semchecker1_textconst)(_CUR._SL)).id_2.meaning;
                    }
                }
            }
            ;
            // JavaLine 50 <== SourceLine 1221
            call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,1221);
            ;
            EBLK();
            return(this);
        } // End of Procedure BODY
        public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 emit",1,1201,21,1212,24,1213,29,1216,32,1218,40,1219,42,1220,50,1221,55,1222);
    } // End of Procedure
