// JavaLine 1 <== SourceLine 222
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER1_visiblegenerator_StopScode_1 extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=222, lastLine=225, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public char p_m;
    public int p_n;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public BUILDER1_visiblegenerator_StopScode_1 setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_m=(char)objectValue(param); break;
                case 1: p_n=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public BUILDER1_visiblegenerator_StopScode_1(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public BUILDER1_visiblegenerator_StopScode_1(RTS_RTObject _SL,char sp_m,int sp_n) {
        super(_SL);
        // Parameter assignment to locals
        this.p_m = sp_m;
        this.p_n = sp_n;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER1_visiblegenerator_StopScode_1 _STM() {
        // JavaLine 42 <== SourceLine 223
        if(_VALUE((((BUILDER1)(_CUR._SL._SL)).numerrfound==(0)))) {
            new ERRMSG_internerr((_CUR._SL._SL),p_m,p_n);
        }
        ;
        // JavaLine 47 <== SourceLine 224
        new BUILDER1_StopScode((_CUR._SL._SL));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER1.sim","5 StopScode_1",1,222,42,223,47,224,52,225);
} // End of Procedure
