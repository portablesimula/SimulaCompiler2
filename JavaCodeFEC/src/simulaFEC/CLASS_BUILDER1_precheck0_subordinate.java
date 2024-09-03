// JavaLine 1 <== SourceLine 525
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER1_precheck0_subordinate extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=525, lastLine=534, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_qa;
    public CLASS_COMMON_quantity p_qb;
    // Declare locals as attributes
    public boolean _RESULT=false;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_BUILDER1_precheck0_subordinate setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_qa=(CLASS_COMMON_quantity)objectValue(param); break;
                case 1: p_qb=(CLASS_COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_BUILDER1_precheck0_subordinate(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public CLASS_BUILDER1_precheck0_subordinate(RTS_RTObject _SL,CLASS_COMMON_quantity sp_qa,CLASS_COMMON_quantity sp_qb) {
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
    public CLASS_BUILDER1_precheck0_subordinate _STM() {
        // JavaLine 45 <== SourceLine 528
        if(_VALUE((p_qa.type_1==(p_qb.type_1)))) {
            {
                // JavaLine 48 <== SourceLine 529
                if(_VALUE(((p_qa.type_1==(((char)7)))||((p_qa.type_1==(((char)9))))))) {
                    // JavaLine 50 <== SourceLine 530
                    _RESULT=new CLASS_BUILDER1_precheck0_subclass((_CUR._SL),p_qa.prefqual_1,p_qb.prefqual_1)._RESULT;
                } else {
                    // JavaLine 53 <== SourceLine 531
                    _RESULT=true;
                }
                ;
            }
        } else {
            // JavaLine 59 <== SourceLine 533
            _RESULT=(p_qb.type_1==(((char)14)));
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER1.sim","5 subordinate",1,525,45,528,48,529,50,530,53,531,59,533,65,534);
} // End of Procedure
