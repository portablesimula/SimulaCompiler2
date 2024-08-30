// JavaLine 1 <== SourceLine 44
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:27 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCANNER_P1error extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=44, lastLine=46, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_n;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCANNER_P1error setPar(Object param) {
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
    public CLASS_SCANNER_P1error(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_SCANNER_P1error(RTS_RTObject _SL,int sp_n) {
        super(_SL);
        // Parameter assignment to locals
        this.p_n = sp_n;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCANNER_P1error _STM() {
        // JavaLine 39 <== SourceLine 45
        new CLASS_SCANNER_setP1line((_CUR._SL));
        ;
        new CLASS_ERRMSG_outP1message((_CUR._SL),(((CLASS_SCANNER)(_CUR._SL)).lexScanner_2.linepos_1+(1)),p_n,((char)2));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCANNER.sim","5 P1error",1,44,39,45,46,46);
} // End of Procedure
