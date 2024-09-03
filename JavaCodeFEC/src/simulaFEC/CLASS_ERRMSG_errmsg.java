// JavaLine 1 <== SourceLine 145
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:47 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_ERRMSG_errmsg extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=145, lastLine=151, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public int p_i;
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 146
    public RTS_TXT t=null;
    // JavaLine 15 <== SourceLine 145
    public RTS_TXT _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_ERRMSG_errmsg setPar(Object param) {
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
    public CLASS_ERRMSG_errmsg(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_ERRMSG_errmsg(RTS_RTObject _SL,int sp_i) {
        super(_SL);
        // Parameter assignment to locals
        this.p_i = sp_i;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_ERRMSG_errmsg _STM() {
        // JavaLine 45 <== SourceLine 147
        if(_VALUE((((CLASS_ERRMSG)(_CUR._SL)).errtxt_1==(null)))) {
            ((CLASS_ERRMSG)(_CUR._SL)).errtxt_1=new CLASS_ERRMSG_ERRORTEXT((_CUR._SL))._STM();
        }
        ;
        // JavaLine 50 <== SourceLine 148
        t=((RTS_TEXT_ARRAY)((CLASS_ERRMSG)(_CUR._SL)).errtxt_1.msg).getELEMENT(p_i);
        ;
        // JavaLine 53 <== SourceLine 150
        _RESULT=CONC(CONC(RTS_ENVIRONMENT.edit(p_i),new RTS_TXT(": ")),t);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_ERRMSG.sim","5 errmsg",1,145,13,146,15,145,45,147,50,148,53,150,58,151);
} // End of Procedure
