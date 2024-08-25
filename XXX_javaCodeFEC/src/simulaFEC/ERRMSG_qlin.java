// JavaLine 1 <== SourceLine 243
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:22 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class ERRMSG_qlin extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=243, lastLine=251, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public COMMON_quantity p_r;
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 244
    public RTS_TXT ltxt=null;
    // JavaLine 15 <== SourceLine 243
    public RTS_TXT _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public ERRMSG_qlin setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_r=(COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public ERRMSG_qlin(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public ERRMSG_qlin(RTS_RTObject _SL,COMMON_quantity sp_r) {
        super(_SL);
        // Parameter assignment to locals
        this.p_r = sp_r;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public ERRMSG_qlin _STM() {
        // JavaLine 45 <== SourceLine 245
        if(_VALUE((p_r!=(null)))) {
            {
                // JavaLine 48 <== SourceLine 246
                if(_VALUE((p_r.line_1>(0)))) {
                    {
                        // JavaLine 51 <== SourceLine 247
                        ltxt=new COMMON_leftint((_CUR._SL),p_r.line_1)._RESULT;
                        ;
                        ltxt=CONC(CONC(new RTS_TXT("(l. "),ltxt),new RTS_TXT(")"));
                        ;
                    }
                } else {
                    // JavaLine 58 <== SourceLine 248
                    ltxt=new RTS_TXT("(ext.)");
                }
                ;
                // JavaLine 62 <== SourceLine 249
                _RESULT=CONC(p_r.symb_1.symbol,ltxt);
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("ERRMSG.sim","5 qlin",1,243,13,244,15,243,45,245,48,246,51,247,58,248,62,249,70,251);
} // End of Procedure
