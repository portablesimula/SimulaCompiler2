// JavaLine 1 <== SourceLine 49
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:45 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_COMMON_TRC extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=49, lastLine=55, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_m1;
    public int p_line;
    public RTS_TXT p_m2;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_COMMON_TRC setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 3: p_m1=(RTS_TXT)objectValue(param); break;
                case 2: p_line=intValue(param); break;
                case 1: p_m2=(RTS_TXT)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_COMMON_TRC(RTS_RTObject _SL) {
        super(_SL,3); // Expecting 3 parameters
    }
    // Normal Constructor
    public CLASS_COMMON_TRC(RTS_RTObject _SL,RTS_TXT sp_m1,int sp_line,RTS_TXT sp_m2) {
        super(_SL);
        // Parameter assignment to locals
        this.p_m1 = sp_m1;
        this.p_line = sp_line;
        this.p_m2 = sp_m2;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_COMMON_TRC _STM() {
        // JavaLine 45 <== SourceLine 51
        RTS_BASICIO.sysout().outtext(CONC(CONC(CONC(p_m1,new RTS_TXT(".LINE ")),RTS_ENVIRONMENT.edit(p_line)),new RTS_TXT(": TRC: ")));
        ;
        // JavaLine 48 <== SourceLine 52
        RTS_BASICIO.sysout().outtext(p_m2);
        ;
        // JavaLine 51 <== SourceLine 53
        RTS_BASICIO.sysout().outimage();
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","5 TRC",1,49,45,51,48,52,51,53,56,55);
} // End of Procedure
