// JavaLine 1 <== SourceLine 143
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER1_findTagid extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=143, lastLine=150, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public RTS_TXT p_id;
    // Declare local labels
    // JavaLine 13 <== SourceLine 150
    final RTS_LABEL _LABEL_BUILDER1_findTagid_E_0=new RTS_LABEL(this,0,1,"E"); // Local Label #1=E At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 16 <== SourceLine 144
    public int i=0;
    // JavaLine 18 <== SourceLine 143
    public boolean _RESULT=false;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public BUILDER1_findTagid setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_id=(RTS_TXT)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public BUILDER1_findTagid(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public BUILDER1_findTagid(RTS_RTObject _SL,RTS_TXT sp_id) {
        super(_SL);
        // Parameter assignment to locals
        this.p_id = sp_id;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER1_findTagid _STM() {
        BUILDER1_findTagid _THIS=(BUILDER1_findTagid)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 52 <== SourceLine 144
                _RESULT=false;
                ;
                for(i=0;i<=((BUILDER1)(_CUR._SL)).lastusedtag_6;i++) {
                    // JavaLine 56 <== SourceLine 145
                    {
                        // JavaLine 58 <== SourceLine 146
                        if(_VALUE(_TXTREL_EQ(p_id,((RTS_TEXT_ARRAY)((BUILDER1)(_CUR._SL)).TAGTAB.ident).getELEMENT(i)))) {
                            {
                                // JavaLine 61 <== SourceLine 147
                                _RESULT=true;
                                ;
                                _GOTO(_LABEL_BUILDER1_findTagid_E_0); // GOTO EVALUATED LABEL
                                ;
                            }
                        }
                        ;
                    }
                }
                ;
                // JavaLine 72 <== SourceLine 150
                {
                    _SIM_LABEL(1); // DeclaredIn: findTagid
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER1.sim","5 findTagid",1,143,13,150,16,144,18,143,52,144,56,145,58,146,61,147,72,150,86,150);
} // End of Procedure
