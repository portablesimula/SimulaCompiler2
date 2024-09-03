// JavaLine 1 <== SourceLine 385
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:45 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_COMMON_leftint extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=385, lastLine=389, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public int p_i;
    // Declare locals as attributes
    public RTS_TXT _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_COMMON_leftint setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_i=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_COMMON_leftint(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_COMMON_leftint(RTS_RTObject _SL,int sp_i) {
        super(_SL);
        // Parameter assignment to locals
        this.p_i = sp_i;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_COMMON_leftint _STM() {
        // JavaLine 42 <== SourceLine 386
        RTS_TXT.putint(((CLASS_COMMON)(_CUR._SL)).leftintbuf,p_i);
        ;
        p_i=11;
        ;
        // JavaLine 47 <== SourceLine 387
        while((RTS_ENVIRONMENT.loadChar(((CLASS_COMMON)(_CUR._SL)).leftintbuf,p_i)!=(((char)32)))) {
            p_i=(p_i-(1));
        }
        ;
        // JavaLine 52 <== SourceLine 388
        _RESULT=RTS_ENVIRONMENT.copy(copy(RTS_TXT.sub(((CLASS_COMMON)(_CUR._SL)).leftintbuf,(p_i+(2)),(11-(p_i)))));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","5 leftint",1,385,42,386,47,387,52,388,57,389);
} // End of Procedure
