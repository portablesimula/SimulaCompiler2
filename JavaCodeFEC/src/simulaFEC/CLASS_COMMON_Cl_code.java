// JavaLine 1 <== SourceLine 294
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:24 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_COMMON_Cl_code extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=294, lastLine=301, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public char p_k;
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 295
    public RTS_TXT t=null;
    // JavaLine 15 <== SourceLine 294
    public RTS_TXT _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_COMMON_Cl_code setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_k=(char)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_COMMON_Cl_code(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_COMMON_Cl_code(RTS_RTObject _SL,char sp_k) {
        super(_SL);
        // Parameter assignment to locals
        this.p_k = sp_k;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_COMMON_Cl_code _STM() {
        // JavaLine 45 <== SourceLine 296
        if(_VALUE((p_k<=('0')))) {
            {
                // JavaLine 48 <== SourceLine 297
                _RESULT=t=RTS_ENVIRONMENT.blanks((((RTS_ENVIRONMENT.rank(p_k)<(10)))?(1):((((RTS_ENVIRONMENT.rank(p_k)<(100)))?(2):(3)))));
                ;
                // JavaLine 51 <== SourceLine 299
                RTS_TXT.putint(t,RTS_ENVIRONMENT.rank(p_k));
                ;
            }
        } else {
            // JavaLine 56 <== SourceLine 300
            _RESULT=new RTS_TXT("illegal");
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","5 Cl_code",1,294,13,295,15,294,45,296,48,297,51,299,56,300,61,301);
} // End of Procedure
