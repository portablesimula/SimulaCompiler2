// JavaLine 1 <== SourceLine 854
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:29 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class COMMON_idpack_dump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=854, lastLine=857, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public COMMON_idpack_dump(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public COMMON_idpack_dump _STM() {
        // JavaLine 21 <== SourceLine 855
        RTS_BASICIO.sysout().outtext(new RTS_TXT("**IDPACK: "));
        ;
        // JavaLine 24 <== SourceLine 856
        RTS_BASICIO.sysout().outtext(new COMMON_nameof((_CUR._SL._SL),((COMMON_idpack)(_CUR._SL)).idhi,((COMMON_idpack)(_CUR._SL)).idlo)._RESULT);
        ;
        RTS_BASICIO.sysout().outint(((COMMON_idpack)(_CUR._SL)).line,6);
        ;
        RTS_BASICIO.sysout().outimage();
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","5 dump",1,854,21,855,24,856,33,857);
} // End of Procedure
