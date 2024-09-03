// JavaLine 1 <== SourceLine 1785
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_argumented_sameAs extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1785, lastLine=1807, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public CLASS_CHECKER1_semchecker1_exp p_e;
    // Declare local labels
    // JavaLine 13 <== SourceLine 1807
    final RTS_LABEL _LABEL_CLASS_CHECKER1_semchecker1_argumented_sameAs_EX_0=new RTS_LABEL(this,0,1,"EX"); // Local Label #1=EX At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 16 <== SourceLine 1786
    public CLASS_CHECKER1_semchecker1_argument arg1=null;
    public CLASS_CHECKER1_semchecker1_argument arg2=null;
    // JavaLine 19 <== SourceLine 1785
    public boolean _RESULT=false;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_CHECKER1_semchecker1_argumented_sameAs setPar(Object param) {
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
    public CLASS_CHECKER1_semchecker1_argumented_sameAs(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_argumented_sameAs(RTS_RTObject _SL,CLASS_CHECKER1_semchecker1_exp sp_e) {
        super(_SL);
        // Parameter assignment to locals
        this.p_e = sp_e;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_argumented_sameAs _STM() {
        CLASS_CHECKER1_semchecker1_argumented_sameAs _THIS=(CLASS_CHECKER1_semchecker1_argumented_sameAs)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 53 <== SourceLine 1787
                if(_VALUE((p_e.ctype==(((char)129))))) {
                    {
                        // JavaLine 56 <== SourceLine 1788
                        if(_VALUE((p_e.meaning==(((CLASS_CHECKER1_semchecker1_argumented)(_CUR._SL)).p1_ident.meaning)))) {
                            {
                                // JavaLine 59 <== SourceLine 1789
                                if(_VALUE(((boolean)(((CLASS_CHECKER1_semchecker1_argumented)(_CUR._SL)).p1_ident.sameAs_0().CPF().setPar(((CLASS_CHECKER1_semchecker1_argumented)(p_e)).p1_ident)._ENT()._RESULT())))) {
                                    // JavaLine 61 <== SourceLine 1790
                                    {
                                        // JavaLine 63 <== SourceLine 1791
                                        arg1=((CLASS_CHECKER1_semchecker1_argumented)(_CUR._SL)).p1_arguments;
                                        ;
                                        arg2=((CLASS_CHECKER1_semchecker1_argumented)(p_e)).p1_arguments;
                                        ;
                                        // JavaLine 68 <== SourceLine 1792
                                        while((arg1!=(null))) {
                                            {
                                                // JavaLine 71 <== SourceLine 1793
                                                if(_VALUE((arg2==(null)))) {
                                                    _GOTO(_LABEL_CLASS_CHECKER1_semchecker1_argumented_sameAs_EX_0); // GOTO EVALUATED LABEL
                                                }
                                                ;
                                                // JavaLine 76 <== SourceLine 1794
                                                if(_VALUE((!(((boolean)(arg1.p_actual.sameAs_0().CPF().setPar(arg2.p_actual)._ENT()._RESULT())))))) {
                                                    // JavaLine 78 <== SourceLine 1795
                                                    _GOTO(_LABEL_CLASS_CHECKER1_semchecker1_argumented_sameAs_EX_0); // GOTO EVALUATED LABEL
                                                }
                                                ;
                                                // JavaLine 82 <== SourceLine 1796
                                                arg1=arg1.nextarg;
                                                ;
                                                arg2=arg2.nextarg;
                                            }
                                        }
                                        ;
                                        // JavaLine 89 <== SourceLine 1798
                                        _RESULT=true;
                                        ;
                                    }
                                }
                            }
                        }
                    }
                }
                ;
                // JavaLine 99 <== SourceLine 1807
                {
                    _SIM_LABEL(1); // DeclaredIn: sameAs
                    ;
                }
                break _LOOP;
            }
            catch(RTS_LABEL q) {
                RTS_RTObject._TREAT_GOTO_CATCH_BLOCK(_THIS, q);
                _JTX=q.index; continue _LOOP; // EG. GOTO Lx
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 sameAs",1,1785,13,1807,16,1786,19,1785,53,1787,56,1788,59,1789,61,1790,63,1791,68,1792,71,1793,76,1794,78,1795,82,1796,89,1798,99,1807,113,1807);
} // End of Procedure
