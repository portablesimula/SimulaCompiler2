// JavaLine 1 <== SourceLine 805
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:52 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER1_codegenerator1_conlevel extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=805, lastLine=816, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_q;
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 814
    public CLASS_COMMON_brecord _inspect_814_4630=null;
    // JavaLine 15 <== SourceLine 805
    public int _RESULT=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCODER1_codegenerator1_conlevel setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_q=(CLASS_COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_SCODER1_codegenerator1_conlevel(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_SCODER1_codegenerator1_conlevel(RTS_RTObject _SL,CLASS_COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER1_codegenerator1_conlevel _STM() {
        // JavaLine 45 <== SourceLine 811
        p_q=p_q.encl_1.declquant;
        ;
        // JavaLine 48 <== SourceLine 812
        while((p_q.kind_1==(((char)11)))) {
            p_q=p_q.prefqual_1;
        }
        ;
        // JavaLine 53 <== SourceLine 814
        {
            // BEGIN INSPECTION 
            _inspect_814_4630=p_q.descr_1;
            if(_inspect_814_4630!=null) { // INSPECT _inspect_814_4630  type=ref(BRECORD)
                // JavaLine 58 <== SourceLine 815
                {
                    // JavaLine 60 <== SourceLine 814
                    {
                        // JavaLine 62 <== SourceLine 815
                        if(_VALUE((_inspect_814_4630.inspected!=(((char)0))))) {
                            _RESULT=_inspect_814_4630.connests;
                        }
                    }
                }
            }
        } // END INSPECTION
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER1.sim","5 conlevel",1,805,13,814,15,805,45,811,48,812,53,814,58,815,60,814,62,815,73,816);
} // End of Procedure
