// JavaLine 1 <== SourceLine 2142
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_index_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=2142, lastLine=2150, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_index_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_index_emit _STM() {
        // JavaLine 21 <== SourceLine 2143
        ((CLASS_CHECKER1_semchecker1_index)(_CUR._SL)).p_actual.cl=((char)1);
        ;
        ((CLASS_CHECKER1_semchecker1_index)(_CUR._SL)).p_actual.emit_0().CPF();
        ;
        // JavaLine 26 <== SourceLine 2144
        if(_VALUE((((CLASS_CHECKER1_semchecker1_index)(_CUR._SL)).p_actual.type!=(((char)4))))) {
            // JavaLine 28 <== SourceLine 2145
            new CLASS_CHECKER1_semchecker1_MaybeConvert((_CUR._SL._SL),((char)4),((CLASS_CHECKER1_semchecker1_index)(_CUR._SL)).p_actual.type);
        }
        ;
        // JavaLine 32 <== SourceLine 2146
        if(_VALUE((((CLASS_CHECKER1_semchecker1_index)(_CUR._SL)).nextarg!=(null)))) {
            {
                // JavaLine 35 <== SourceLine 2147
                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6='N';
                ;
                call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,2147);
                ;
                // JavaLine 40 <== SourceLine 2148
                ((CLASS_CHECKER1_semchecker1_index)(_CUR._SL)).nextarg.emit_0().CPF();
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 emit",1,2142,21,2143,26,2144,28,2145,32,2146,35,2147,40,2148,48,2150);
} // End of Procedure
