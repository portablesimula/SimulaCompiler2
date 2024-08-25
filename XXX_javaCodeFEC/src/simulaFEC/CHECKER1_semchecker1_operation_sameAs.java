// JavaLine 1 <== SourceLine 205
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER1_semchecker1_operation_sameAs extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=205, lastLine=216, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public CHECKER1_semchecker1_exp p_e;
    // Declare local labels
    // JavaLine 13 <== SourceLine 213
    final RTS_LABEL _LABEL_CHECKER1_semchecker1_operation_sameAs_Block209_Block212_CR_0=new RTS_LABEL(this,0,1,"CR"); // Local Label #1=CR At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 16 <== SourceLine 205
    public boolean _RESULT=false;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CHECKER1_semchecker1_operation_sameAs setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_e=(CHECKER1_semchecker1_exp)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CHECKER1_semchecker1_operation_sameAs(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CHECKER1_semchecker1_operation_sameAs(RTS_RTObject _SL,CHECKER1_semchecker1_exp sp_e) {
        super(_SL);
        // Parameter assignment to locals
        this.p_e = sp_e;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER1_semchecker1_operation_sameAs _STM() {
        CHECKER1_semchecker1_operation_sameAs _THIS=(CHECKER1_semchecker1_operation_sameAs)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 50 <== SourceLine 208
                if(_VALUE(p_e instanceof CHECKER1_semchecker1_operation)) {
                    {
                        // JavaLine 53 <== SourceLine 209
                        if(_VALUE((((CHECKER1_semchecker1_operation)(_CUR._SL)).p1_left==(null)))) {
                            {
                                // JavaLine 56 <== SourceLine 210
                                if(_VALUE((((CHECKER1_semchecker1_operation)(p_e)).p1_left==(null)))) {
                                    _GOTO(_LABEL_CHECKER1_semchecker1_operation_sameAs_Block209_Block212_CR_0); // GOTO EVALUATED LABEL
                                }
                            }
                        } else {
                            // JavaLine 62 <== SourceLine 211
                            if(_VALUE((((CHECKER1_semchecker1_operation)(p_e)).p1_left!=(null)))) {
                                {
                                    // JavaLine 65 <== SourceLine 212
                                    if(_VALUE(((boolean)(((CHECKER1_semchecker1_operation)(_CUR._SL)).p1_left.sameAs_0().CPF().setPar(((CHECKER1_semchecker1_operation)(p_e)).p1_left)._ENT()._RESULT())))) {
                                        // JavaLine 67 <== SourceLine 213
                                        {
                                            _SIM_LABEL(1); // DeclaredIn: sameAs -> sameAs[externalIdent=CHECKER1_semchecker1_operation_sameAs] Kind=5, QUAL=ProcedureDeclaration, HashCode=671949051
                                            _RESULT=((boolean)(((CHECKER1_semchecker1_operation)(_CUR._SL)).p1_right.sameAs_0().CPF().setPar(((CHECKER1_semchecker1_operation)(p_e)).p1_right)._ENT()._RESULT()));
                                        }
                                    }
                                    ;
                                }
                            }
                        }
                        ;
                    }
                }
                ;
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","5 sameAs",1,205,13,213,16,205,50,208,53,209,56,210,62,211,65,212,67,213,90,216);
} // End of Procedure
