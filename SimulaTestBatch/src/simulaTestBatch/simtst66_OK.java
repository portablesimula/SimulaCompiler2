// JavaLine 1 <== SourceLine 70
package simulaTestBatch;
// Simula-2.0 Compiled at Thu Aug 29 12:01:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst66_OK extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=70, lastLine=76, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public simtst66_InputFile p_f1;
    public simtst66_InputFile p_f2;
    public int p_l;
    // Declare locals as attributes
    public boolean _RESULT=false;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public simtst66_OK setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 3: p_f1=(simtst66_InputFile)objectValue(param); break;
                case 2: p_f2=(simtst66_InputFile)objectValue(param); break;
                case 1: p_l=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public simtst66_OK(RTS_RTObject _SL) {
        super(_SL,3); // Expecting 3 parameters
    }
    // Normal Constructor
    public simtst66_OK(RTS_RTObject _SL,simtst66_InputFile sp_f1,simtst66_InputFile sp_f2,int sp_l) {
        super(_SL);
        // Parameter assignment to locals
        this.p_f1 = sp_f1;
        this.p_f2 = sp_f2;
        this.p_l = sp_l;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public simtst66_OK _STM() {
        // JavaLine 48 <== SourceLine 73
        if(_VALUE(((p_l>(p_f1.lnr))&((p_l>(p_f2.lnr)))))) {
            // JavaLine 50 <== SourceLine 74
            _RESULT=true;
        } else {
            // JavaLine 53 <== SourceLine 76
            _RESULT=(RTS_UTIL._TXTREL_EQ(((RTS_TEXT_ARRAY)p_f1.linjer).getELEMENT(p_l),((RTS_TEXT_ARRAY)p_f2.linjer).getELEMENT(p_l))&(new simtst66_OK((_CUR._SL),p_f1,p_f2,(p_l+(1)))._RESULT));
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst66.sim","5 OK",1,70,48,73,50,74,53,76,58,76);
} // End of Procedure
