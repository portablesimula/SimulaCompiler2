// JavaLine 1 <== SourceLine 23
package simulaTestBatch;
// Simula-2.0 Compiled at Fri Jun 28 10:20:09 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst105_FIELD extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=23, lastLine=27, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public int p_w;
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 24
    public int pos=0;
    // JavaLine 15 <== SourceLine 23
    public RTS_TXT _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public simtst105_FIELD setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_w=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public simtst105_FIELD(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public simtst105_FIELD(RTS_RTObject _SL,int sp_w) {
        super(_SL);
        // Parameter assignment to locals
        this.p_w = sp_w;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public simtst105_FIELD _STM() {
        // JavaLine 45 <== SourceLine 24
        pos=RTS_TXT.pos(((simtst105)(_CUR._SL)).result_1);
        ;
        // JavaLine 48 <== SourceLine 25
        _RESULT=RTS_TXT.sub(((simtst105)(_CUR._SL)).result_1,pos,p_w);
        ;
        // JavaLine 51 <== SourceLine 26
        RTS_TXT.setpos(((simtst105)(_CUR._SL)).result_1,(pos+(p_w)));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst105.sim","5 FIELD",1,23,13,24,15,23,45,24,48,25,51,26,56,27);
} // End of Procedure
