// JavaLine 1 <== SourceLine 520
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER1_precheck0_subordinate extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=520, lastLine=529, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public COMMON_quantity p_qa;
    public COMMON_quantity p_qb;
    // Declare locals as attributes
    public boolean _RESULT=false;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public BUILDER1_precheck0_subordinate setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_qa=(COMMON_quantity)objectValue(param); break;
                case 1: p_qb=(COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public BUILDER1_precheck0_subordinate(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public BUILDER1_precheck0_subordinate(RTS_RTObject _SL,COMMON_quantity sp_qa,COMMON_quantity sp_qb) {
        super(_SL);
        // Parameter assignment to locals
        this.p_qa = sp_qa;
        this.p_qb = sp_qb;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER1_precheck0_subordinate _STM() {
        // JavaLine 45 <== SourceLine 523
        if(_VALUE((p_qa.type_1==(p_qb.type_1)))) {
            {
                // JavaLine 48 <== SourceLine 524
                if(_VALUE(((p_qa.type_1==(((char)7)))||((p_qa.type_1==(((char)9))))))) {
                    // JavaLine 50 <== SourceLine 525
                    _RESULT=new BUILDER1_precheck0_subclass((_CUR._SL),p_qa.prefqual_1,p_qb.prefqual_1)._RESULT;
                } else {
                    // JavaLine 53 <== SourceLine 526
                    _RESULT=true;
                }
                ;
            }
        } else {
            // JavaLine 59 <== SourceLine 528
            _RESULT=(p_qb.type_1==(((char)14)));
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER1.sim","5 subordinate",1,520,45,523,48,524,50,525,53,526,59,528,65,529);
} // End of Procedure
