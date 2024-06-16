// JavaLine 1 <== SourceLine 984
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class ERRMSG_AbortCompilation extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=984, lastLine=996, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public ERRMSG_AbortCompilation(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public ERRMSG_AbortCompilation _STM() {
        // JavaLine 21 <== SourceLine 986
        RTS_ENVIRONMENT.giveIntInfo(1,6);
        ;
        // JavaLine 24 <== SourceLine 987
        ((ERRMSG)(_CUR._SL)).termstatus='6';
        ;
        // JavaLine 27 <== SourceLine 988
        new ERRMSG_printDiag((_CUR._SL),(((((ERRMSG)(_CUR._SL)).numerrfound>(((ERRMSG)(_CUR._SL)).maxerrno_1)))?(new RTS_TXT("*** COMPILATION STOPPED: Too many errors ***")):((((((ERRMSG)(_CUR._SL)).numerrfound==(0)))?(new RTS_TXT("*** COMPILATION ABORTED ***")):(new RTS_TXT("*** COMPILATION CANNOT CONTINUE ***"))))));
        ;
        // JavaLine 30 <== SourceLine 993
        RTS_ENVIRONMENT.rts_utility(4,0);
        ;
        // JavaLine 33 <== SourceLine 994
        if(_VALUE((((ERRMSG)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('T'))!=(((char)0))))) {
            RTS_ENVIRONMENT.sqrt(-1.0d);
        }
        ;
        // JavaLine 38 <== SourceLine 995
        ((ERRMSG)(_CUR._SL)).ENDCOMP_0().CPF();
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("ERRMSG.sim","5 AbortCompilation",1,984,21,986,24,987,27,988,30,993,33,994,38,995,43,996);
} // End of Procedure
