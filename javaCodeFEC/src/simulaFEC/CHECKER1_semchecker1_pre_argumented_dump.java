// JavaLine 1 <== SourceLine 1726
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER1_semchecker1_pre_argumented_dump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1726, lastLine=1729, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 1727
    public RTS_Printfile _inspect_1726_4579=null;
    // Normal Constructor
    public CHECKER1_semchecker1_pre_argumented_dump(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER1_semchecker1_pre_argumented_dump _STM() {
        // JavaLine 23 <== SourceLine 1726
        {
            // BEGIN INSPECTION 
            _inspect_1726_4579=RTS_BASICIO.sysout();
            if(_inspect_1726_4579!=null) { // INSPECT _inspect_1726_4579
                // JavaLine 28 <== SourceLine 1727
                {
                    {
                        ((CHECKER1_semchecker1_pre_argumented)(_CUR._SL)).p1_ident.dump_0().CPF();
                        ;
                        _inspect_1726_4579.outtext(new RTS_TXT(" ARG===>>"));
                        ;
                        // JavaLine 35 <== SourceLine 1728
                        ((CHECKER1_semchecker1_pre_argumented)(_CUR._SL)).p1_arguments.dump_0().CPF();
                        ;
                        _inspect_1726_4579.outtext(new RTS_TXT(" <<===ARG"));
                        ;
                        _inspect_1726_4579.outimage();
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","5 dump",1,1726,10,1727,23,1726,28,1727,35,1728,48,1729);
} // End of Procedure
