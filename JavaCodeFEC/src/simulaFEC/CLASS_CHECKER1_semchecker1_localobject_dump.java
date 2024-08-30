// JavaLine 1 <== SourceLine 615
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_localobject_dump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=615, lastLine=615, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_localobject_dump(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_localobject_dump _STM() {
        new CLASS_CHECKER1_semchecker1_exp_expdump((_CUR._SL),new RTS_TXT("  THIS"));
        ;
        RTS_BASICIO.sysout().outimage();
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 dump",1,615,26,615);
} // End of Procedure
