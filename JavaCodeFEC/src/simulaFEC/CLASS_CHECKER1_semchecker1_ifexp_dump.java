// JavaLine 1 <== SourceLine 1086
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_ifexp_dump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1086, lastLine=1091, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 1087
    public RTS_Printfile _inspect_1086_4570=null;
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_ifexp_dump(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_ifexp_dump _STM() {
        // JavaLine 23 <== SourceLine 1086
        {
            // BEGIN INSPECTION 
            _inspect_1086_4570=RTS_BASICIO.sysout();
            if(_inspect_1086_4570!=null) { // INSPECT _inspect_1086_4570  type=ref(PRINTFILE)
                // JavaLine 28 <== SourceLine 1087
                {
                    {
                        new CLASS_CHECKER1_semchecker1_exp_expdump((_CUR._SL),new RTS_TXT("IFEXPR"));
                        ;
                        _inspect_1086_4570.outimage();
                        ;
                        // JavaLine 35 <== SourceLine 1088
                        _inspect_1086_4570.outtext(new RTS_TXT("   if"));
                        ;
                        ((CLASS_CHECKER1_semchecker1_ifexp)(_CUR._SL)).p2_testexp.dump_0().CPF();
                        ;
                        // JavaLine 40 <== SourceLine 1089
                        _inspect_1086_4570.outtext(new RTS_TXT(" then"));
                        ;
                        ((CLASS_CHECKER1_semchecker1_ifexp)(_CUR._SL)).p1_left.dump_0().CPF();
                        ;
                        // JavaLine 45 <== SourceLine 1090
                        _inspect_1086_4570.outtext(new RTS_TXT(" else"));
                        ;
                        ((CLASS_CHECKER1_semchecker1_ifexp)(_CUR._SL)).p1_right.dump_0().CPF();
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 dump",1,1086,10,1087,23,1086,28,1087,35,1088,40,1089,45,1090,56,1091);
} // End of Procedure
