// JavaLine 1 <== SourceLine 774
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER1_newextquantbrec extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=774, lastLine=785, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public char p_blv;
    public char p_rtblv;
    public char p_stat;
    public COMMON_extquantity p_caus;
    // Declare locals as attributes
    // JavaLine 16 <== SourceLine 777
    public COMMON_extquantity qe=null;
    // JavaLine 18 <== SourceLine 779
    public COMMON_extbrecord _inspect_779_4534=null;
    // JavaLine 20 <== SourceLine 774
    public COMMON_extquantity _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public BUILDER1_newextquantbrec setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 4: p_blv=(char)objectValue(param); break;
                case 3: p_rtblv=(char)objectValue(param); break;
                case 2: p_stat=(char)objectValue(param); break;
                case 1: p_caus=(COMMON_extquantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public BUILDER1_newextquantbrec(RTS_RTObject _SL) {
        super(_SL,4); // Expecting 4 parameters
    }
    // Normal Constructor
    public BUILDER1_newextquantbrec(RTS_RTObject _SL,char sp_blv,char sp_rtblv,char sp_stat,COMMON_extquantity sp_caus) {
        super(_SL);
        // Parameter assignment to locals
        this.p_blv = sp_blv;
        this.p_rtblv = sp_rtblv;
        this.p_stat = sp_stat;
        this.p_caus = sp_caus;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER1_newextquantbrec _STM() {
        // JavaLine 56 <== SourceLine 779
        {
            // BEGIN INSPECTION 
            _inspect_779_4534=new COMMON_extbrecord((_CUR._SL))._STM();
            if(_inspect_779_4534!=null) { // INSPECT _inspect_779_4534
                // JavaLine 61 <== SourceLine 780
                {
                    // JavaLine 63 <== SourceLine 779
                    {
                        // JavaLine 65 <== SourceLine 780
                        _inspect_779_4534.blev=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(p_blv)+(1)));
                        ;
                        _inspect_779_4534.rtblev=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(p_rtblv)+(1)));
                        ;
                        // JavaLine 70 <== SourceLine 781
                        _RESULT=qe=new COMMON_extquantity((_CUR._SL),((COMMON_extbrecord)_inspect_779_4534))._STM();
                        ;
                        // JavaLine 73 <== SourceLine 782
                        qe.descr_1=((COMMON_extbrecord)_inspect_779_4534);
                        ;
                        // JavaLine 76 <== SourceLine 783
                        _inspect_779_4534.declquant=qe;
                        ;
                        _inspect_779_4534.status_1=p_stat;
                        ;
                        _inspect_779_4534.cause_1=p_caus;
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER1.sim","5 newextquantbrec",1,774,16,777,18,779,20,774,56,779,61,780,63,779,65,780,70,781,73,782,76,783,90,785);
} // End of Procedure
