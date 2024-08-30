// JavaLine 1 <== SourceLine 707
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:24 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_COMMON_quantity_dump_NL extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=707, lastLine=710, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_COMMON_quantity_dump_NL(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_COMMON_quantity_dump_NL _STM() {
        // JavaLine 21 <== SourceLine 708
        if(_VALUE((((CLASS_COMMON_quantity_dump)(_CUR._SL)).linesh&((RTS_BASICIO.sysout().pos()>(70)))))) {
            {
                // JavaLine 24 <== SourceLine 709
                RTS_BASICIO.sysout().outimage();
                ;
                RTS_BASICIO.sysout().outtext(new RTS_TXT("            "));
                ;
                ((CLASS_COMMON_quantity_dump)(_CUR._SL)).linesh=false;
                ;
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","5 NL",1,707,21,708,24,709,35,710);
} // End of Procedure
