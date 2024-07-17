// JavaLine 1 <== SourceLine 919
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:19 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class COMMON_attrfile_edKey extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=919, lastLine=937, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public char p_k;
    // Declare locals as attributes
    public RTS_TXT _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public COMMON_attrfile_edKey setPar(Object param) {
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
    public COMMON_attrfile_edKey(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public COMMON_attrfile_edKey(RTS_RTObject _SL,char sp_k) {
        super(_SL);
        // Parameter assignment to locals
        this.p_k = sp_k;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public COMMON_attrfile_edKey _STM() {
        // JavaLine 42 <== SourceLine 920
        if(_VALUE((p_k==(((char)255))))) {
            _RESULT=RTS_ENVIRONMENT.copy(copy(CONC(CONC(new RTS_TXT("longSwap\u005b"),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(p_k))),new RTS_TXT("\u005d"))));
        } else {
            // JavaLine 46 <== SourceLine 921
            if(_VALUE((p_k==(((char)254))))) {
                _RESULT=RTS_ENVIRONMENT.copy(copy(CONC(CONC(new RTS_TXT("bufSwap\u005b"),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(p_k))),new RTS_TXT("\u005d"))));
            } else {
                // JavaLine 50 <== SourceLine 922
                if(_VALUE((p_k==(((char)253))))) {
                    _RESULT=RTS_ENVIRONMENT.copy(copy(CONC(CONC(new RTS_TXT("longText\u005b"),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(p_k))),new RTS_TXT("\u005d"))));
                } else {
                    // JavaLine 54 <== SourceLine 923
                    if(_VALUE((p_k==(((char)252))))) {
                        _RESULT=RTS_ENVIRONMENT.copy(copy(CONC(CONC(new RTS_TXT("mainKey\u005b"),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(p_k))),new RTS_TXT("\u005d"))));
                    } else {
                        // JavaLine 58 <== SourceLine 924
                        if(_VALUE((p_k==(((char)251))))) {
                            _RESULT=RTS_ENVIRONMENT.copy(copy(CONC(CONC(new RTS_TXT("begList\u005b"),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(p_k))),new RTS_TXT("\u005d"))));
                        } else {
                            // JavaLine 62 <== SourceLine 925
                            if(_VALUE((p_k==(((char)250))))) {
                                _RESULT=RTS_ENVIRONMENT.copy(copy(CONC(CONC(new RTS_TXT("endlist\u005b"),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(p_k))),new RTS_TXT("\u005d"))));
                            } else {
                                // JavaLine 66 <== SourceLine 926
                                if(_VALUE((p_k==(((char)249))))) {
                                    _RESULT=RTS_ENVIRONMENT.copy(copy(CONC(CONC(new RTS_TXT("protMark\u005b"),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(p_k))),new RTS_TXT("\u005d"))));
                                } else {
                                    // JavaLine 70 <== SourceLine 927
                                    if(_VALUE((p_k==(((char)248))))) {
                                        _RESULT=RTS_ENVIRONMENT.copy(copy(CONC(CONC(new RTS_TXT("hidMark\u005b"),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(p_k))),new RTS_TXT("\u005d"))));
                                    } else {
                                        // JavaLine 74 <== SourceLine 928
                                        if(_VALUE((p_k==(((char)247))))) {
                                            _RESULT=RTS_ENVIRONMENT.copy(copy(CONC(CONC(new RTS_TXT("nestMark\u005b"),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(p_k))),new RTS_TXT("\u005d"))));
                                        } else {
                                            // JavaLine 78 <== SourceLine 929
                                            if(_VALUE((p_k==(((char)246))))) {
                                                _RESULT=RTS_ENVIRONMENT.copy(copy(CONC(CONC(new RTS_TXT("xMark\u005b"),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(p_k))),new RTS_TXT("\u005d"))));
                                            } else {
                                                // JavaLine 82 <== SourceLine 930
                                                if(_VALUE((p_k==(((char)245))))) {
                                                    _RESULT=RTS_ENVIRONMENT.copy(copy(CONC(CONC(new RTS_TXT("yMark\u005b"),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(p_k))),new RTS_TXT("\u005d"))));
                                                } else {
                                                    // JavaLine 86 <== SourceLine 931
                                                    if(_VALUE((p_k==(((char)244))))) {
                                                        _RESULT=RTS_ENVIRONMENT.copy(copy(CONC(CONC(new RTS_TXT("specMark\u005b"),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(p_k))),new RTS_TXT("\u005d"))));
                                                    } else {
                                                        // JavaLine 90 <== SourceLine 932
                                                        if(_VALUE((p_k==(((char)243))))) {
                                                            _RESULT=RTS_ENVIRONMENT.copy(copy(CONC(CONC(new RTS_TXT("overMark\u005b"),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(p_k))),new RTS_TXT("\u005d"))));
                                                        } else {
                                                            // JavaLine 94 <== SourceLine 933
                                                            if(_VALUE((p_k==(((char)242))))) {
                                                                _RESULT=RTS_ENVIRONMENT.copy(copy(CONC(CONC(new RTS_TXT("dimMark\u005b"),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(p_k))),new RTS_TXT("\u005d"))));
                                                            } else {
                                                                // JavaLine 98 <== SourceLine 934
                                                                if(_VALUE((p_k==(((char)241))))) {
                                                                    _RESULT=RTS_ENVIRONMENT.copy(copy(CONC(CONC(new RTS_TXT("forcMark\u005b"),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(p_k))),new RTS_TXT("\u005d"))));
                                                                } else {
                                                                    // JavaLine 102 <== SourceLine 935
                                                                    if(_VALUE((p_k==(((char)240))))) {
                                                                        _RESULT=RTS_ENVIRONMENT.copy(copy(CONC(CONC(new RTS_TXT("thisMark\u005b"),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(p_k))),new RTS_TXT("\u005d"))));
                                                                    } else {
                                                                        // JavaLine 106 <== SourceLine 936
                                                                        _RESULT=RTS_ENVIRONMENT.copy(copy(CONC(new RTS_TXT("Unknown key: "),RTS_ENVIRONMENT.edit(p_k))));
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
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","5 edKey",1,919,42,920,46,921,50,922,54,923,58,924,62,925,66,926,70,927,74,928,78,929,82,930,86,931,90,932,94,933,98,934,102,935,106,936,127,937);
} // End of Procedure
