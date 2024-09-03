// JavaLine 1 <== SourceLine 1485
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_simpleIdent_sameAs extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1485, lastLine=1489, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public CLASS_CHECKER1_semchecker1_exp p_e;
    // Declare locals as attributes
    public boolean _RESULT=false;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_CHECKER1_semchecker1_simpleIdent_sameAs setPar(Object param) {
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
    public CLASS_CHECKER1_semchecker1_simpleIdent_sameAs(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_simpleIdent_sameAs(RTS_RTObject _SL,CLASS_CHECKER1_semchecker1_exp sp_e) {
        super(_SL);
        // Parameter assignment to locals
        this.p_e = sp_e;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_simpleIdent_sameAs _STM() {
        // JavaLine 42 <== SourceLine 1486
        if(_VALUE((((CLASS_CHECKER1_semchecker1_simpleIdent)(_CUR._SL)).kind!=(((char)1))))) {
            {
                if(_VALUE((((CLASS_CHECKER1_semchecker1_simpleIdent)(_CUR._SL)).issimple!=(0)))) {
                    {
                        // JavaLine 47 <== SourceLine 1488
                        if(_VALUE(RTS_UTIL._IS(p_e,CLASS_CHECKER1_semchecker1_simpleIdent.class))) {
                            _RESULT=(p_e.meaning==(((CLASS_CHECKER1_semchecker1_simpleIdent)(_CUR._SL)).meaning));
                        }
                        ;
                    }
                }
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 sameAs",1,1485,42,1486,47,1488,58,1489);
} // End of Procedure
