// JavaLine 1 <== SourceLine 508
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER1_precheck0_subclass extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=508, lastLine=517, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public COMMON_quantity p_qx;
    public COMMON_quantity p_qy;
    // Declare locals as attributes
    public boolean _RESULT=false;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public BUILDER1_precheck0_subclass setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_qx=(COMMON_quantity)objectValue(param); break;
                case 1: p_qy=(COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public BUILDER1_precheck0_subclass(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public BUILDER1_precheck0_subclass(RTS_RTObject _SL,COMMON_quantity sp_qx,COMMON_quantity sp_qy) {
        super(_SL);
        // Parameter assignment to locals
        this.p_qx = sp_qx;
        this.p_qy = sp_qy;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER1_precheck0_subclass _STM() {
        // JavaLine 45 <== SourceLine 513
        while((p_qx.plev_1>(p_qy.plev_1))) {
            p_qx=p_qx.prefqual_1;
        }
        ;
        // JavaLine 50 <== SourceLine 514
        if(_VALUE((((p_qx==(p_qy))||((p_qx.kind_1==(((char)10)))))||((p_qy.kind_1==(((char)10))))))) {
            // JavaLine 52 <== SourceLine 516
            _RESULT=true;
        } else {
            _RESULT=false;
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER1.sim","5 subclass",1,508,45,513,50,514,52,516,60,517);
} // End of Procedure
