// JavaLine 1 <== SourceLine 167
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:29 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class COMMON_K_code extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=167, lastLine=184, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public char p_k;
    // Declare locals as attributes
    public RTS_TXT _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public COMMON_K_code setPar(Object param) {
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
    public COMMON_K_code(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public COMMON_K_code(RTS_RTObject _SL,char sp_k) {
        super(_SL);
        // Parameter assignment to locals
        this.p_k = sp_k;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public COMMON_K_code _STM() {
        // JavaLine 42 <== SourceLine 169
        if(_VALUE((p_k==(((char)10))))) {
            _RESULT=new RTS_TXT("unknwn");
        } else {
            // JavaLine 46 <== SourceLine 170
            if(_VALUE((p_k==(((char)0))))) {
                _RESULT=new RTS_TXT("ident");
            } else {
                // JavaLine 50 <== SourceLine 171
                if(_VALUE((p_k==(((char)2))))) {
                    _RESULT=new RTS_TXT("array");
                } else {
                    // JavaLine 54 <== SourceLine 172
                    if(_VALUE((p_k==(((char)6))))) {
                        _RESULT=new RTS_TXT("infix array");
                    } else {
                        // JavaLine 58 <== SourceLine 173
                        if(_VALUE((p_k==(((char)1))))) {
                            _RESULT=new RTS_TXT("procedure");
                        } else {
                            // JavaLine 62 <== SourceLine 174
                            if(_VALUE((p_k==(((char)5))))) {
                                _RESULT=new RTS_TXT("class");
                            } else {
                                // JavaLine 66 <== SourceLine 175
                                if(_VALUE((p_k==(((char)3))))) {
                                    _RESULT=new RTS_TXT("label");
                                } else {
                                    // JavaLine 70 <== SourceLine 176
                                    if(_VALUE((p_k==(((char)4))))) {
                                        _RESULT=new RTS_TXT("switch");
                                    } else {
                                        // JavaLine 74 <== SourceLine 177
                                        if(_VALUE((p_k==(((char)8))))) {
                                            _RESULT=new RTS_TXT("subbl");
                                        } else {
                                            // JavaLine 78 <== SourceLine 178
                                            if(_VALUE((p_k==(((char)9))))) {
                                                _RESULT=new RTS_TXT("prefbl");
                                            } else {
                                                // JavaLine 82 <== SourceLine 179
                                                if(_VALUE((p_k==(((char)7))))) {
                                                    _RESULT=new RTS_TXT("record");
                                                } else {
                                                    // JavaLine 86 <== SourceLine 180
                                                    if(_VALUE((p_k==(((char)11))))) {
                                                        _RESULT=new RTS_TXT("labbl");
                                                    } else {
                                                        // JavaLine 90 <== SourceLine 181
                                                        if(_VALUE((p_k==(((char)12))))) {
                                                            _RESULT=new RTS_TXT("unknwn");
                                                        } else {
                                                            // JavaLine 94 <== SourceLine 182
                                                            if(_VALUE((p_k==(((char)13))))) {
                                                                _RESULT=new RTS_TXT("predef");
                                                            } else {
                                                                // JavaLine 98 <== SourceLine 183
                                                                _RESULT=new RTS_TXT("illegal");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","5 K_code",1,167,42,169,46,170,50,171,54,172,58,173,62,174,66,175,70,176,74,177,78,178,82,179,86,180,90,181,94,182,98,183,117,184);
} // End of Procedure
