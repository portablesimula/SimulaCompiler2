// JavaLine 1 <== SourceLine 246
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_boolop_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=246, lastLine=253, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_boolop_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_boolop_emit _STM() {
        // JavaLine 21 <== SourceLine 247
        ((CLASS_CHECKER1_semchecker1_boolop)(_CUR._SL)).p1_left.cl=((char)1);
        ;
        ((CLASS_CHECKER1_semchecker1_boolop)(_CUR._SL)).p1_left.emit_0().CPF();
        ;
        // JavaLine 26 <== SourceLine 249
        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=((CLASS_CHECKER1_semchecker1_boolop)(_CUR._SL)).p_ch;
        ;
        // JavaLine 29 <== SourceLine 250
        ((CLASS_CHECKER1_semchecker1_boolop)(_CUR._SL)).p1_right.cl=((char)1);
        ;
        ((CLASS_CHECKER1_semchecker1_boolop)(_CUR._SL)).p1_right.emit_0().CPF();
        ;
        // JavaLine 34 <== SourceLine 252
        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=((CLASS_CHECKER1_semchecker1_boolop)(_CUR._SL)).p_ch;
        ;
        call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,252);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 emit",1,246,21,247,26,249,29,250,34,252,41,253);
} // End of Procedure
