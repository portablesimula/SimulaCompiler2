// JavaLine 1 <== SourceLine 2136
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_index_dump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=2136, lastLine=2140, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_index_dump(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_index_dump _STM() {
        // JavaLine 21 <== SourceLine 2137
        RTS_BASICIO.sysout().outtext(new RTS_TXT(" INDEX #"));
        ;
        // JavaLine 24 <== SourceLine 2138
        RTS_BASICIO.sysout().outint(((CLASS_CHECKER1_semchecker1_index)(_CUR._SL)).p_argno,0);
        ;
        RTS_BASICIO.sysout().outchar(':');
        ;
        ((CLASS_CHECKER1_semchecker1_index)(_CUR._SL)).p_actual.dump_0().CPF();
        ;
        // JavaLine 31 <== SourceLine 2139
        if(_VALUE((((CLASS_CHECKER1_semchecker1_index)(_CUR._SL)).nextarg!=(null)))) {
            ((CLASS_CHECKER1_semchecker1_index)(_CUR._SL)).nextarg.dump_0().CPF();
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 dump",1,2136,21,2137,24,2138,31,2139,38,2140);
} // End of Procedure
