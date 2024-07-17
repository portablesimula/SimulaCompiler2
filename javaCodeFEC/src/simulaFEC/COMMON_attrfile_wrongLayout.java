// JavaLine 1 <== SourceLine 965
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:19 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class COMMON_attrfile_wrongLayout extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=965, lastLine=966, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public COMMON_attrfile_wrongLayout(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public COMMON_attrfile_wrongLayout _STM() {
        // JavaLine 21 <== SourceLine 966
        ((COMMON)(_CUR._SL._SL)).diag.putELEMENT(((COMMON)(_CUR._SL._SL)).diag.index(0),((COMMON_attrfile)(_CUR._SL)).CURF.filename());
        ;
        ((COMMON)(_CUR._SL._SL)).COMMONerror_0().CPF().setPar(308)._ENT();
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","5 wrongLayout",1,965,21,966,27,966);
} // End of Procedure
