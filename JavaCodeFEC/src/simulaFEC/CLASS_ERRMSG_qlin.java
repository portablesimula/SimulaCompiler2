// JavaLine 1 <== SourceLine 238
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:47 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_ERRMSG_qlin extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=238, lastLine=246, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_r;
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 239
    public RTS_TXT ltxt=null;
    // JavaLine 15 <== SourceLine 238
    public RTS_TXT _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_ERRMSG_qlin setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_r=(CLASS_COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_ERRMSG_qlin(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_ERRMSG_qlin(RTS_RTObject _SL,CLASS_COMMON_quantity sp_r) {
        super(_SL);
        // Parameter assignment to locals
        this.p_r = sp_r;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_ERRMSG_qlin _STM() {
        // JavaLine 45 <== SourceLine 240
        if(_VALUE((p_r!=(null)))) {
            {
                // JavaLine 48 <== SourceLine 241
                if(_VALUE((p_r.line_1>(0)))) {
                    {
                        // JavaLine 51 <== SourceLine 242
                        ltxt=new CLASS_COMMON_leftint((_CUR._SL),p_r.line_1)._RESULT;
                        ;
                        ltxt=CONC(CONC(new RTS_TXT("(l. "),ltxt),new RTS_TXT(")"));
                        ;
                    }
                } else {
                    // JavaLine 58 <== SourceLine 243
                    ltxt=new RTS_TXT("(ext.)");
                }
                ;
                // JavaLine 62 <== SourceLine 244
                _RESULT=CONC(p_r.symb_1.symbol,ltxt);
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_ERRMSG.sim","5 qlin",1,238,13,239,15,238,45,240,48,241,51,242,58,243,62,244,70,246);
} // End of Procedure
