// JavaLine 1 <== SourceLine 43
package simulaTestBatch;
// Simula-2.0 Compiled at Fri Sep 06 08:05:49 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst157_P extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=43, lastLine=57, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_NAME<Integer> p_np;
    public int p_pp;
    public RTS_ARRAY p_arr;
    public RTS_PRCQNT p_fnc;
    public RTS_LABEL p_lab;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public simtst157_P setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 5: p_np=(RTS_NAME<Integer>)param; break;
                case 4: p_pp=intValue(param); break;
                case 3: p_arr=arrayValue(param); break;
                case 2: p_fnc=procValue(param); break;
                case 1: p_lab=(RTS_LABEL)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public simtst157_P(RTS_RTObject _SL) {
        super(_SL,5); // Expecting 5 parameters
    }
    // Normal Constructor
    public simtst157_P(RTS_RTObject _SL,RTS_NAME<Integer> sp_np,int sp_pp,RTS_ARRAY sp_arr,RTS_PRCQNT sp_fnc,RTS_LABEL sp_lab) {
        super(_SL);
        // Parameter assignment to locals
        this.p_np = sp_np;
        this.p_pp = sp_pp;
        this.p_arr = sp_arr;
        this.p_fnc = sp_fnc;
        this.p_lab = sp_lab;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public simtst157_P _STM() {
        // JavaLine 51 <== SourceLine 44
        new simtst157_P_Block44((_CUR))._STM();
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst157.sim","5 P",1,43,51,44,56,57);
} // End of Procedure
