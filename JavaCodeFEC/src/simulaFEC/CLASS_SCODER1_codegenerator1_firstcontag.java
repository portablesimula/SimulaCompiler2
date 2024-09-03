// JavaLine 1 <== SourceLine 752
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:52 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER1_codegenerator1_firstcontag extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=752, lastLine=779, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_q;
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 753
    public int incr=0;
    // JavaLine 15 <== SourceLine 762
    public CLASS_COMMON_brecord _inspect_762_4629=null;
    // JavaLine 17 <== SourceLine 752
    public int _RESULT=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCODER1_codegenerator1_firstcontag setPar(Object param) {
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
    public CLASS_SCODER1_codegenerator1_firstcontag(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_SCODER1_codegenerator1_firstcontag(RTS_RTObject _SL,CLASS_COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER1_codegenerator1_firstcontag _STM() {
        // JavaLine 47 <== SourceLine 760
        _RESULT=(p_q.ftag_1+(3));
        ;
        // JavaLine 50 <== SourceLine 761
        if(_VALUE(((p_q.kind_1==(((char)5)))||((p_q.kind_1==(((char)9))))))) {
            {
                // JavaLine 53 <== SourceLine 762
                {
                    // BEGIN INSPECTION 
                    _inspect_762_4629=p_q.descr_1;
                    if(_inspect_762_4629!=null) { // INSPECT _inspect_762_4629  type=ref(BRECORD)
                        // JavaLine 58 <== SourceLine 763
                        {
                            // JavaLine 60 <== SourceLine 762
                            {
                                // JavaLine 62 <== SourceLine 763
                                if(_VALUE((_inspect_762_4629.inrtag!=(((char)0))))) {
                                    incr=(RTS_ENVIRONMENT.rank(_inspect_762_4629.inrtag)+(1));
                                } else {
                                    // JavaLine 66 <== SourceLine 764
                                    if(_VALUE((_inspect_762_4629.stmtag!=(((char)0))))) {
                                        incr=(RTS_ENVIRONMENT.rank(_inspect_762_4629.stmtag)+(1));
                                    } else {
                                        // JavaLine 70 <== SourceLine 765
                                        if(_VALUE((_inspect_762_4629.dcltag!=(((char)0))))) {
                                            incr=(RTS_ENVIRONMENT.rank(_inspect_762_4629.dcltag)+(1));
                                        } else {
                                            // JavaLine 74 <== SourceLine 766
                                            incr=3;
                                        }
                                    }
                                }
                                ;
                                // JavaLine 80 <== SourceLine 767
                                _RESULT=(p_q.ftag_1+(incr));
                                ;
                            }
                        }
                    }
                } // END INSPECTION
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER1.sim","5 firstcontag",1,752,13,753,15,762,17,752,47,760,50,761,53,762,58,763,60,762,62,763,66,764,70,765,74,766,80,767,93,779);
} // End of Procedure
