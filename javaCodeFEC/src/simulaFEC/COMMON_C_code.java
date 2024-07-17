// JavaLine 1 <== SourceLine 114
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:19 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class COMMON_C_code extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=114, lastLine=125, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public char p_k;
    // Declare locals as attributes
    public RTS_TXT _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public COMMON_C_code setPar(Object param) {
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
    public COMMON_C_code(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public COMMON_C_code(RTS_RTObject _SL,char sp_k) {
        super(_SL);
        // Parameter assignment to locals
        this.p_k = sp_k;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public COMMON_C_code _STM() {
        // JavaLine 42 <== SourceLine 116
        if(_VALUE((p_k==(((char)5))))) {
            _RESULT=new RTS_TXT("default");
        } else {
            // JavaLine 46 <== SourceLine 117
            if(_VALUE((p_k==(((char)3))))) {
                _RESULT=new RTS_TXT("local");
            } else {
                // JavaLine 50 <== SourceLine 118
                if(_VALUE((p_k==(((char)1))))) {
                    _RESULT=new RTS_TXT("value");
                } else {
                    // JavaLine 54 <== SourceLine 119
                    if(_VALUE((p_k==(((char)2))))) {
                        _RESULT=new RTS_TXT("name");
                    } else {
                        // JavaLine 58 <== SourceLine 120
                        if(_VALUE((p_k==(((char)0))))) {
                            _RESULT=new RTS_TXT("unspec");
                        } else {
                            // JavaLine 62 <== SourceLine 121
                            if(_VALUE((p_k==(((char)6))))) {
                                _RESULT=new RTS_TXT("virt");
                            } else {
                                // JavaLine 66 <== SourceLine 122
                                if(_VALUE((p_k==(((char)4))))) {
                                    _RESULT=new RTS_TXT("extnal");
                                } else {
                                    // JavaLine 70 <== SourceLine 123
                                    if(_VALUE((p_k==(((char)7))))) {
                                        _RESULT=new RTS_TXT("block");
                                    } else {
                                        // JavaLine 74 <== SourceLine 124
                                        _RESULT=new RTS_TXT("illegal");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","5 C_code",1,114,42,116,46,117,50,118,54,119,58,120,62,121,66,122,70,123,74,124,87,125);
} // End of Procedure
