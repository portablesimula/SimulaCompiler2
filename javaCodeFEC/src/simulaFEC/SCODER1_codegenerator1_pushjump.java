// JavaLine 1 <== SourceLine 202
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:38 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER1_codegenerator1_pushjump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=202, lastLine=206, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_index;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public SCODER1_codegenerator1_pushjump setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_index=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public SCODER1_codegenerator1_pushjump(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public SCODER1_codegenerator1_pushjump(RTS_RTObject _SL,int sp_index) {
        super(_SL);
        // Parameter assignment to locals
        this.p_index = sp_index;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER1_codegenerator1_pushjump _STM() {
        // JavaLine 39 <== SourceLine 203
        ((SCODER1_codegenerator1)(_CUR._SL)).curjump_4=(((SCODER1_codegenerator1)(_CUR._SL)).curjump_4+(1));
        ;
        // JavaLine 42 <== SourceLine 204
        if(_VALUE((((SCODER1_codegenerator1)(_CUR._SL)).curjump_4>(100)))) {
            new ERRMSG_fatal0((_CUR._SL._SL),250);
        } else {
            // JavaLine 46 <== SourceLine 205
            ((SCODER1_codegenerator1)(_CUR._SL)).jumpstack.putELEMENT(((SCODER1_codegenerator1)(_CUR._SL)).jumpstack.index(((SCODER1_codegenerator1)(_CUR._SL)).curjump_4),p_index);
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER1.sim","5 pushjump",1,202,39,203,42,204,46,205,52,206);
} // End of Procedure
