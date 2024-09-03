// JavaLine 1 <== SourceLine 966
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:45 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_COMMON_attrfile_wrongLayout extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=966, lastLine=967, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_COMMON_attrfile_wrongLayout(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_COMMON_attrfile_wrongLayout _STM() {
        // JavaLine 21 <== SourceLine 967
        ((CLASS_COMMON)(_CUR._SL._SL)).diag.putELEMENT(((CLASS_COMMON)(_CUR._SL._SL)).diag.index(0),((CLASS_COMMON_attrfile)(_CUR._SL)).CURF.filename());
        ;
        ((CLASS_COMMON)(_CUR._SL._SL)).COMMONerror_0().CPF().setPar(308)._ENT();
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","5 wrongLayout",1,966,21,967,27,967);
} // End of Procedure
