// JavaLine 1 <== SourceLine 1181
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1__const_sameAs extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1181, lastLine=1183, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public CLASS_CHECKER1_semchecker1_exp p_e;
    // Declare locals as attributes
    public boolean _RESULT=false;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_CHECKER1_semchecker1__const_sameAs setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_e=(CLASS_CHECKER1_semchecker1_exp)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_CHECKER1_semchecker1__const_sameAs(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1__const_sameAs(RTS_RTObject _SL,CLASS_CHECKER1_semchecker1_exp sp_e) {
        super(_SL);
        // Parameter assignment to locals
        this.p_e = sp_e;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1__const_sameAs _STM() {
        // JavaLine 42 <== SourceLine 1182
        if(_VALUE((p_e.p_ch==('[')))) {
            {
                if(_VALUE((((CLASS_CHECKER1_semchecker1__const)(p_e)).ixlo_1==(((CLASS_CHECKER1_semchecker1__const)(_CUR._SL)).ixlo_1)))) {
                    // JavaLine 46 <== SourceLine 1183
                    _RESULT=(((CLASS_CHECKER1_semchecker1__const)(p_e)).ixhi_1==(((CLASS_CHECKER1_semchecker1__const)(_CUR._SL)).ixhi_1));
                }
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 sameAs",1,1181,42,1182,46,1183,53,1183);
} // End of Procedure
