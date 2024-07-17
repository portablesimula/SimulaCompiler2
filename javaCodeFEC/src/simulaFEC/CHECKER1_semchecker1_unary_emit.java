// JavaLine 1 <== SourceLine 519
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER1_semchecker1_unary_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=519, lastLine=526, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 520
    public CHECKER1_semchecker1_exp _inspect_520_4559=null;
    // Normal Constructor
    public CHECKER1_semchecker1_unary_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER1_semchecker1_unary_emit _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_520_4559=((CHECKER1_semchecker1_unary)(_CUR._SL)).p1_left;
            if(_inspect_520_4559!=null) { // INSPECT _inspect_520_4559
                {
                    {
                        _inspect_520_4559.cl=((char)1);
                        ;
                        _inspect_520_4559.emit_0().CPF();
                        ;
                        // JavaLine 33 <== SourceLine 521
                        if(_VALUE((_inspect_520_4559.type==(((char)2))))) {
                            {
                                // JavaLine 36 <== SourceLine 522
                                ((CHECKER1)(_CUR._SL._SL._SL)).opc_6=((char)136);
                                ;
                                ((CHECKER1)(_CUR._SL._SL._SL)).opt=((char)4);
                                ;
                                call(((CHECKER1)(_CUR._SL._SL._SL)).coder,522);
                            }
                        }
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        // JavaLine 50 <== SourceLine 525
        ((CHECKER1)(_CUR._SL._SL._SL)).opc_6=((char)146);
        ;
        call(((CHECKER1)(_CUR._SL._SL._SL)).coder,525);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","5 emit",1,519,10,520,33,521,36,522,50,525,57,526);
} // End of Procedure
