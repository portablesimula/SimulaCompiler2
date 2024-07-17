// JavaLine 1 <== SourceLine 191
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:37 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER0_codegenerator0_outTagWithIdent extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=191, lastLine=197, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_t;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 192
    public RTS_TXT id=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public SCODER0_codegenerator0_outTagWithIdent setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_t=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public SCODER0_codegenerator0_outTagWithIdent(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public SCODER0_codegenerator0_outTagWithIdent(RTS_RTObject _SL,int sp_t) {
        super(_SL);
        // Parameter assignment to locals
        this.p_t = sp_t;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER0_codegenerator0_outTagWithIdent _STM() {
        id=new COMMON_tagID((_CUR._SL._SL),p_t)._RESULT;
        ;
        // JavaLine 43 <== SourceLine 194
        ((SCODER0_codegenerator0)(_CUR._SL)).out2byte(0);
        ;
        ((SCODER0_codegenerator0)(_CUR._SL)).out2byte(p_t);
        ;
        // JavaLine 48 <== SourceLine 195
        ((SCODER0_codegenerator0)(_CUR._SL)).outbyte(RTS_TXT.length(id));
        ;
        // JavaLine 51 <== SourceLine 196
        ((SCODER0_codegenerator0)(_CUR._SL)).outtext(id);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER0.sim","5 outTagWithIdent",1,191,11,192,43,194,48,195,51,196,56,197);
} // End of Procedure
