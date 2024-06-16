// JavaLine 1 <== SourceLine 54
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCANNER_dump_opt extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=54, lastLine=56, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public char p_opt;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public SCANNER_dump_opt setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_opt=(char)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public SCANNER_dump_opt(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public SCANNER_dump_opt(RTS_RTObject _SL,char sp_opt) {
        super(_SL);
        // Parameter assignment to locals
        this.p_opt = sp_opt;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCANNER_dump_opt _STM() {
        // JavaLine 39 <== SourceLine 55
        RTS_BASICIO.sysout().outtext(new RTS_TXT(" OPT*"));
        ;
        RTS_BASICIO.sysout().outint(RTS_ENVIRONMENT.rank(p_opt),3);
        ;
        RTS_BASICIO.sysout().outchar('=');
        ;
        // JavaLine 46 <== SourceLine 56
        RTS_BASICIO.sysout().outtext(((SCANNER)(_CUR._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(p_opt)));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCANNER.sim","5 dump_opt",1,54,39,55,46,56,51,56);
} // End of Procedure
