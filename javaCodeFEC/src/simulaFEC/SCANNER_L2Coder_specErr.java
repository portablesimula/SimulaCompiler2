// JavaLine 1 <== SourceLine 1598
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCANNER_L2Coder_specErr extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1598, lastLine=1599, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_n;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public SCANNER_L2Coder_specErr setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_n=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public SCANNER_L2Coder_specErr(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public SCANNER_L2Coder_specErr(RTS_RTObject _SL,int sp_n) {
        super(_SL);
        // Parameter assignment to locals
        this.p_n = sp_n;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCANNER_L2Coder_specErr _STM() {
        // JavaLine 39 <== SourceLine 1599
        ((SCANNER)(_CUR._SL._SL)).diag.putELEMENT(((SCANNER)(_CUR._SL._SL)).diag.index(0),new COMMON_nameof((_CUR._SL._SL),((SCANNER)(_CUR._SL._SL)).opdhi,((SCANNER)(_CUR._SL._SL)).opdlo)._RESULT);
        ;
        new SCANNER_P1error((_CUR._SL._SL),p_n);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCANNER.sim","5 specErr",1,1598,39,1599,46,1599);
} // End of Procedure
