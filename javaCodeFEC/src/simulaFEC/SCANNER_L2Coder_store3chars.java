// JavaLine 1 <== SourceLine 1705
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:22 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCANNER_L2Coder_store3chars extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1705, lastLine=1711, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public char p_ch1;
    public char p_ch2;
    public char p_ch3;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public SCANNER_L2Coder_store3chars setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 3: p_ch1=(char)objectValue(param); break;
                case 2: p_ch2=(char)objectValue(param); break;
                case 1: p_ch3=(char)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public SCANNER_L2Coder_store3chars(RTS_RTObject _SL) {
        super(_SL,3); // Expecting 3 parameters
    }
    // Normal Constructor
    public SCANNER_L2Coder_store3chars(RTS_RTObject _SL,char sp_ch1,char sp_ch2,char sp_ch3) {
        super(_SL);
        // Parameter assignment to locals
        this.p_ch1 = sp_ch1;
        this.p_ch2 = sp_ch2;
        this.p_ch3 = sp_ch3;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCANNER_L2Coder_store3chars _STM() {
        // JavaLine 45 <== SourceLine 1707
        RTS_ENVIRONMENT.storeChar(p_ch1,((SCANNER_L2Coder)(_CUR._SL)).L2buf_4,((SCANNER_L2Coder)(_CUR._SL)).L2p_4);
        ;
        // JavaLine 48 <== SourceLine 1708
        RTS_ENVIRONMENT.storeChar(p_ch2,((SCANNER_L2Coder)(_CUR._SL)).L2buf_4,(((SCANNER_L2Coder)(_CUR._SL)).L2p_4+(1)));
        ;
        // JavaLine 51 <== SourceLine 1709
        RTS_ENVIRONMENT.storeChar(p_ch3,((SCANNER_L2Coder)(_CUR._SL)).L2buf_4,(((SCANNER_L2Coder)(_CUR._SL)).L2p_4+(2)));
        ;
        ((SCANNER_L2Coder)(_CUR._SL)).L2p_4=(((SCANNER_L2Coder)(_CUR._SL)).L2p_4+(3));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCANNER.sim","5 store3chars",1,1705,45,1707,48,1708,51,1709,58,1711);
} // End of Procedure
