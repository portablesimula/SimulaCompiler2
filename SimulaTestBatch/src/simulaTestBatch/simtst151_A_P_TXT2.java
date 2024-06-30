// JavaLine 1 <== SourceLine 73
package simulaTestBatch;
// Simula-2.0 Compiled at Fri Jun 28 10:41:55 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst151_A_P_TXT2 extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=73, lastLine=82, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public RTS_TXT p_par_T;
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 74
    public RTS_TXT P_T=null;
    // JavaLine 15 <== SourceLine 73
    public RTS_TXT _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public simtst151_A_P_TXT2 setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_par_T=(RTS_TXT)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public simtst151_A_P_TXT2(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public simtst151_A_P_TXT2(RTS_RTObject _SL,RTS_TXT sp_par_T) {
        super(_SL);
        // Parameter assignment to locals
        this.p_par_T = sp_par_T;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public simtst151_A_P_TXT2 _STM() {
        // JavaLine 45 <== SourceLine 75
        p_par_T=RTS_ENVIRONMENT.blanks(10);
        ;
        // JavaLine 48 <== SourceLine 76
        ((simtst151_A)(_CUR._SL)).A_T=RTS_ENVIRONMENT.blanks(10);
        ;
        // JavaLine 51 <== SourceLine 77
        P_T=RTS_ENVIRONMENT.blanks(10);
        ;
        // JavaLine 54 <== SourceLine 78
        _RESULT=RTS_ENVIRONMENT.blanks(10);
        ;
        // JavaLine 57 <== SourceLine 79
        _ASGTXT(P_T,_ASGTXT(_RESULT,_ASGTXT(p_par_T,_ASGSTR(((simtst151_A)(_CUR._SL)).A_T,"Cadab"))));
        ;
        // JavaLine 60 <== SourceLine 81
        new simtst151_trace((_CUR._SL._SL),CONC(CONC(CONC(new RTS_TXT("P\u005fT="),P_T),new RTS_TXT(", par\u005fT=")),p_par_T));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst151.sim","5 P_TXT2",1,73,13,74,15,73,45,75,48,76,51,77,54,78,57,79,60,81,65,82);
} // End of Procedure
