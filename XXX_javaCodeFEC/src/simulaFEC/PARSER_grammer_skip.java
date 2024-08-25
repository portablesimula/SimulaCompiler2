// JavaLine 1 <== SourceLine 272
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_skip extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=272, lastLine=278, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_err;
    // Declare local labels
    // JavaLine 11 <== SourceLine 276
    final RTS_LABEL _LABEL_PARSER_grammer_skip_REP_0=new RTS_LABEL(this,0,1,"REP"); // Local Label #1=REP At PrefixLevel 0
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public PARSER_grammer_skip setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_err=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public PARSER_grammer_skip(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public PARSER_grammer_skip(RTS_RTObject _SL,int sp_err) {
        super(_SL);
        // Parameter assignment to locals
        this.p_err = sp_err;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_skip _STM() {
        PARSER_grammer_skip _THIS=(PARSER_grammer_skip)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 46 <== SourceLine 275
                if(_VALUE((p_err!=(0)))) {
                    new PARSER_grammer_ParsErr((_CUR._SL),p_err);
                }
                ;
                // JavaLine 51 <== SourceLine 276
                {
                    _SIM_LABEL(1); // DeclaredIn: skip
                    new PARSER_grammer_search((_CUR._SL));
                }
                ;
                // JavaLine 57 <== SourceLine 277
                if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==('O')))) {
                    new PARSER_grammer_NEXTSYMBOL((_CUR._SL));
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 skip",1,272,11,276,46,275,51,276,57,277,71,278);
} // End of Procedure
