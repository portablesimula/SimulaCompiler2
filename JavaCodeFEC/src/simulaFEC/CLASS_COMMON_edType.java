// JavaLine 1 <== SourceLine 128
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:45 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_COMMON_edType extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=128, lastLine=144, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public char p_t;
    // Declare locals as attributes
    public RTS_TXT _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_COMMON_edType setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_t=(char)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_COMMON_edType(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_COMMON_edType(RTS_RTObject _SL,char sp_t) {
        super(_SL);
        // Parameter assignment to locals
        this.p_t = sp_t;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_COMMON_edType _STM() {
        // JavaLine 42 <== SourceLine 129
        if(_VALUE((p_t==(((char)1))))) {
            _RESULT=new RTS_TXT("boolean");
        } else {
            // JavaLine 46 <== SourceLine 130
            if(_VALUE((p_t==(((char)2))))) {
                _RESULT=new RTS_TXT("character");
            } else {
                // JavaLine 50 <== SourceLine 131
                if(_VALUE((p_t==(((char)3))))) {
                    _RESULT=new RTS_TXT("short");
                } else {
                    // JavaLine 54 <== SourceLine 132
                    if(_VALUE((p_t==(((char)4))))) {
                        _RESULT=new RTS_TXT("integer");
                    } else {
                        // JavaLine 58 <== SourceLine 133
                        if(_VALUE((p_t==(((char)5))))) {
                            _RESULT=new RTS_TXT("real");
                        } else {
                            // JavaLine 62 <== SourceLine 134
                            if(_VALUE((p_t==(((char)6))))) {
                                _RESULT=new RTS_TXT("long");
                            } else {
                                // JavaLine 66 <== SourceLine 135
                                if(_VALUE((p_t==(((char)7))))) {
                                    _RESULT=new RTS_TXT("ref");
                                } else {
                                    // JavaLine 70 <== SourceLine 136
                                    if(_VALUE((p_t==(((char)8))))) {
                                        _RESULT=new RTS_TXT("text");
                                    } else {
                                        // JavaLine 74 <== SourceLine 137
                                        if(_VALUE((p_t==(((char)9))))) {
                                            _RESULT=new RTS_TXT("\u005fpointer");
                                        } else {
                                            // JavaLine 78 <== SourceLine 138
                                            if(_VALUE((p_t==(((char)10))))) {
                                                _RESULT=new RTS_TXT("value");
                                            } else {
                                                // JavaLine 82 <== SourceLine 139
                                                if(_VALUE((p_t==(((char)11))))) {
                                                    _RESULT=new RTS_TXT("label");
                                                } else {
                                                    // JavaLine 86 <== SourceLine 140
                                                    if(_VALUE((p_t==(((char)12))))) {
                                                        _RESULT=new RTS_TXT("procedure");
                                                    } else {
                                                        // JavaLine 90 <== SourceLine 141
                                                        if(_VALUE((p_t==(((char)13))))) {
                                                            _RESULT=new RTS_TXT("array");
                                                        } else {
                                                            // JavaLine 94 <== SourceLine 142
                                                            if(_VALUE((p_t==(((char)14))))) {
                                                                _RESULT=new RTS_TXT("no type");
                                                            } else {
                                                                // JavaLine 98 <== SourceLine 143
                                                                _RESULT=RTS_ENVIRONMENT.edit(p_t);
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","5 edType",1,128,42,129,46,130,50,131,54,132,58,133,62,134,66,135,70,136,74,137,78,138,82,139,86,140,90,141,94,142,98,143,117,144);
} // End of Procedure
