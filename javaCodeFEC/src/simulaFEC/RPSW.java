// JavaLine 1 <== SourceLine 732
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class RPSW extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=732, lastLine=0, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public int p__SW;
    // Declare locals as attributes
    public RTS_LABEL _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public RPSW setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p__SW=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public RPSW(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public RPSW(RTS_RTObject _SL,int sp__SW) {
        super(_SL);
        // Parameter assignment to locals
        this.p__SW = sp__SW;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Switch Body
    @Override
    public RPSW _STM() {
        switch(p__SW-1) {
            case 0: _RESULT=((CLASS_PARSER_grammer_module)(_CUR._SL))._LABEL_CLASS_PARSER_grammer_module_S0_1; break;
            case 1: _RESULT=((CLASS_PARSER_grammer_module)(_CUR._SL))._LABEL_CLASS_PARSER_grammer_module_Block741_S1_0; break;
            case 2: _RESULT=((CLASS_PARSER_grammer_module)(_CUR._SL))._LABEL_CLASS_PARSER_grammer_module_S2_1; break;
            case 3: _RESULT=((CLASS_PARSER_grammer_module)(_CUR._SL))._LABEL_CLASS_PARSER_grammer_module_Block741_RECOVER1_0; break;
            case 4: _RESULT=((CLASS_PARSER_grammer_module)(_CUR._SL))._LABEL_CLASS_PARSER_grammer_module_RECOVER2_1; break;
            case 5: _RESULT=((CLASS_PARSER_grammer_module)(_CUR._SL))._LABEL_CLASS_PARSER_grammer_module_RECOVER3_1; break;
            case 6: _RESULT=((CLASS_PARSER_grammer_module)(_CUR._SL))._LABEL_CLASS_PARSER_grammer_module_RECOVER4_1; break;
            default: throw new RTS_SimulaRuntimeError("Illegal switch index: "+p__SW);
        }
        EBLK();
        return(this);
    } // End of Switch BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 RPSW",1,732,54,0);
} // End of Procedure
