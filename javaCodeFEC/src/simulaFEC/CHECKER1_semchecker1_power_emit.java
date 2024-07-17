// JavaLine 1 <== SourceLine 497
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER1_semchecker1_power_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=497, lastLine=506, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 498
    public CHECKER1_semchecker1_exp _inspect_498_4558=null;
    // Normal Constructor
    public CHECKER1_semchecker1_power_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER1_semchecker1_power_emit _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_498_4558=((CHECKER1_semchecker1_power)(_CUR._SL)).p1_left;
            if(_inspect_498_4558!=null) { // INSPECT _inspect_498_4558
                {
                    {
                        _inspect_498_4558.cl=((char)1);
                        ;
                        _inspect_498_4558.emit_0().CPF();
                    }
                }
            }
        } // END INSPECTION
        ;
        // JavaLine 37 <== SourceLine 500
        ((CHECKER1)(_CUR._SL._SL._SL)).opc_6='J';
        ;
        ((CHECKER1)(_CUR._SL._SL._SL)).opilo_6=((char)1);
        ;
        // JavaLine 42 <== SourceLine 501
        ((CHECKER1)(_CUR._SL._SL._SL)).opt=((CHECKER1_semchecker1_power)(_CUR._SL)).p1_right.type;
        ;
        ((CHECKER1)(_CUR._SL._SL._SL)).optx=((CHECKER1_semchecker1_power)(_CUR._SL)).basetype_3;
        ;
        call(((CHECKER1)(_CUR._SL._SL._SL)).coder,501);
        ;
        // JavaLine 49 <== SourceLine 502
        ((CHECKER1_semchecker1_power)(_CUR._SL)).p1_right.cl=((char)1);
        ;
        ((CHECKER1_semchecker1_power)(_CUR._SL)).p1_right.emit_0().CPF();
        ;
        // JavaLine 54 <== SourceLine 504
        ((CHECKER1)(_CUR._SL._SL._SL)).opc_6='J';
        ;
        // JavaLine 57 <== SourceLine 505
        ((CHECKER1)(_CUR._SL._SL._SL)).opt=((CHECKER1_semchecker1_power)(_CUR._SL)).p1_right.type;
        ;
        ((CHECKER1)(_CUR._SL._SL._SL)).optx=((CHECKER1_semchecker1_power)(_CUR._SL)).basetype_3;
        ;
        call(((CHECKER1)(_CUR._SL._SL._SL)).coder,505);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","5 emit",1,497,10,498,37,500,42,501,49,502,54,504,57,505,66,506);
} // End of Procedure
