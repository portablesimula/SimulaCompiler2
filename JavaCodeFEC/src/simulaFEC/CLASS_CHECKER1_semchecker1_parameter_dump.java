// JavaLine 1 <== SourceLine 2170
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_parameter_dump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=2170, lastLine=2178, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_parameter_dump(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_parameter_dump _STM() {
        // JavaLine 21 <== SourceLine 2171
        RTS_BASICIO.sysout().outtext(new RTS_TXT(" PARAM #"));
        ;
        RTS_BASICIO.sysout().outint(((CLASS_CHECKER1_semchecker1_parameter)(_CUR._SL)).p_argno,0);
        ;
        // JavaLine 26 <== SourceLine 2172
        RTS_BASICIO.sysout().outtext(new RTS_TXT(" formal:"));
        ;
        // JavaLine 29 <== SourceLine 2173
        if(_VALUE((((CLASS_CHECKER1_semchecker1_parameter)(_CUR._SL)).p1_formal!=(null)))) {
            // JavaLine 31 <== SourceLine 2174
            {
                if(_VALUE((((CLASS_CHECKER1)(_CUR._SL._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('T'))!=(((char)0))))) {
                    new CLASS_COMMON_quantity_dump(((CLASS_CHECKER1_semchecker1_parameter)(_CUR._SL)).p1_formal);
                } else {
                    // JavaLine 36 <== SourceLine 2175
                    RTS_BASICIO.sysout().outtext(CONC(CONC(new RTS_TXT("("),((CLASS_CHECKER1_semchecker1_parameter)(_CUR._SL)).p1_formal.symb_1.symbol),new RTS_TXT(")")));
                }
                ;
            }
        } else {
            // JavaLine 42 <== SourceLine 2176
            RTS_BASICIO.sysout().outtext(new RTS_TXT("none"));
        }
        ;
        // JavaLine 46 <== SourceLine 2177
        RTS_BASICIO.sysout().outimage();
        ;
        RTS_BASICIO.sysout().outtext(new RTS_TXT(" actual:"));
        ;
        ((CLASS_CHECKER1_semchecker1_parameter)(_CUR._SL)).p_actual.dump_0().CPF();
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 dump",1,2170,21,2171,26,2172,29,2173,31,2174,36,2175,42,2176,46,2177,55,2178);
} // End of Procedure
