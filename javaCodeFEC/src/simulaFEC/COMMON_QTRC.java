// JavaLine 1 <== SourceLine 57
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:29 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class COMMON_QTRC extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=57, lastLine=70, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_m1;
    public int p_line;
    public RTS_TXT p_m2;
    public COMMON_quantity p_q;
    // Declare locals as attributes
    // JavaLine 14 <== SourceLine 59
    public RTS_TXT qid=null;
    // JavaLine 16 <== SourceLine 65
    public COMMON_quantity _inspect_65_4446=null;
    // JavaLine 18 <== SourceLine 67
    public COMMON_brecord _inspect_67_4447=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public COMMON_QTRC setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 4: p_m1=(RTS_TXT)objectValue(param); break;
                case 3: p_line=intValue(param); break;
                case 2: p_m2=(RTS_TXT)objectValue(param); break;
                case 1: p_q=(COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public COMMON_QTRC(RTS_RTObject _SL) {
        super(_SL,4); // Expecting 4 parameters
    }
    // Normal Constructor
    public COMMON_QTRC(RTS_RTObject _SL,RTS_TXT sp_m1,int sp_line,RTS_TXT sp_m2,COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_m1 = sp_m1;
        this.p_line = sp_line;
        this.p_m2 = sp_m2;
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public COMMON_QTRC _STM() {
        // JavaLine 54 <== SourceLine 60
        qid=(((p_q==(null)))?(RTS_ENVIRONMENT.copy(copy(new RTS_TXT("NO-Q")))):(new COMMON_quantity_ident(p_q)._RESULT));
        ;
        // JavaLine 57 <== SourceLine 61
        _ASGTXT(RTS_BASICIO.sysout().image,CONC(CONC(CONC(p_m1,new RTS_TXT(".LINE ")),RTS_ENVIRONMENT.edit(p_line)),new RTS_TXT(": QTRC: ")));
        ;
        // JavaLine 60 <== SourceLine 64
        RTS_BASICIO.sysout().outimage();
        ;
        // JavaLine 63 <== SourceLine 65
        {
            // BEGIN INSPECTION 
            _inspect_65_4446=p_q;
            if(_inspect_65_4446!=null) { // INSPECT _inspect_65_4446
                // JavaLine 68 <== SourceLine 66
                {
                    // JavaLine 70 <== SourceLine 65
                    {
                        // JavaLine 72 <== SourceLine 66
                        new COMMON_quantity_quantDump(_inspect_65_4446,new RTS_TXT("QTRC:"));
                        ;
                        // JavaLine 75 <== SourceLine 67
                        {
                            // BEGIN INSPECTION 
                            _inspect_67_4447=_inspect_65_4446.descr_1;
                            if(_inspect_67_4447!=null) { // INSPECT _inspect_67_4447
                                {
                                    new COMMON_brecord_blockDump(_inspect_67_4447,new RTS_TXT("QTRC:"));
                                }
                            }
                        } // END INSPECTION
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","5 QTRC",1,57,14,59,16,65,18,67,54,60,57,61,60,64,63,65,68,66,70,65,72,66,75,67,93,70);
} // End of Procedure
