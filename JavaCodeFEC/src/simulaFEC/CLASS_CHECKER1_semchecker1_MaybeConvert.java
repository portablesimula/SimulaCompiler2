// JavaLine 1 <== SourceLine 78
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_MaybeConvert extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=78, lastLine=85, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public char p_typ1;
    public char p_typ2;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_CHECKER1_semchecker1_MaybeConvert setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_typ1=(char)objectValue(param); break;
                case 1: p_typ2=(char)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_CHECKER1_semchecker1_MaybeConvert(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_MaybeConvert(RTS_RTObject _SL,char sp_typ1,char sp_typ2) {
        super(_SL);
        // Parameter assignment to locals
        this.p_typ1 = sp_typ1;
        this.p_typ2 = sp_typ2;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_MaybeConvert _STM() {
        // JavaLine 42 <== SourceLine 81
        if(_VALUE((p_typ1==(((char)3))))) {
            p_typ1=((char)4);
        }
        ;
        // JavaLine 47 <== SourceLine 82
        if(_VALUE((p_typ2==(((char)3))))) {
            p_typ2=((char)4);
        }
        ;
        // JavaLine 52 <== SourceLine 83
        if(_VALUE((p_typ1!=(p_typ2)))) {
            {
                // JavaLine 55 <== SourceLine 84
                ((CLASS_CHECKER1)(_CUR._SL._SL)).opc_6=((char)136);
                ;
                ((CLASS_CHECKER1)(_CUR._SL._SL)).opt=p_typ1;
                ;
                call(((CLASS_CHECKER1)(_CUR._SL._SL)).coder,84);
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 MaybeConvert",1,78,42,81,47,82,52,83,55,84,65,85);
} // End of Procedure
