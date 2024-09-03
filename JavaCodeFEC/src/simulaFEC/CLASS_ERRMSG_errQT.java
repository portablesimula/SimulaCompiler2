// JavaLine 1 <== SourceLine 249
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:47 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_ERRMSG_errQT extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=249, lastLine=253, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_q;
    public int p_n;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_ERRMSG_errQT setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_q=(CLASS_COMMON_quantity)objectValue(param); break;
                case 1: p_n=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_ERRMSG_errQT(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public CLASS_ERRMSG_errQT(RTS_RTObject _SL,CLASS_COMMON_quantity sp_q,int sp_n) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        this.p_n = sp_n;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_ERRMSG_errQT _STM() {
        // JavaLine 42 <== SourceLine 250
        if(_VALUE((p_q!=(null)))) {
            // JavaLine 44 <== SourceLine 251
            {
                ((CLASS_ERRMSG)(_CUR._SL)).messageLinenr=p_q.line_1;
                ;
                new CLASS_ERRMSG_error1id((_CUR._SL),p_n,p_q.symb_1);
                ;
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_ERRMSG.sim","5 errQT",1,249,42,250,44,251,54,253);
} // End of Procedure
