// JavaLine 1 <== SourceLine 779
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER1_newextquantbrec extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=779, lastLine=790, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public char p_blv;
    public char p_rtblv;
    public char p_stat;
    public CLASS_COMMON_extquantity p_caus;
    // Declare locals as attributes
    // JavaLine 16 <== SourceLine 782
    public CLASS_COMMON_extquantity qe=null;
    // JavaLine 18 <== SourceLine 784
    public CLASS_COMMON_extbrecord _inspect_784_4534=null;
    // JavaLine 20 <== SourceLine 779
    public CLASS_COMMON_extquantity _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_BUILDER1_newextquantbrec setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 4: p_blv=(char)objectValue(param); break;
                case 3: p_rtblv=(char)objectValue(param); break;
                case 2: p_stat=(char)objectValue(param); break;
                case 1: p_caus=(CLASS_COMMON_extquantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_BUILDER1_newextquantbrec(RTS_RTObject _SL) {
        super(_SL,4); // Expecting 4 parameters
    }
    // Normal Constructor
    public CLASS_BUILDER1_newextquantbrec(RTS_RTObject _SL,char sp_blv,char sp_rtblv,char sp_stat,CLASS_COMMON_extquantity sp_caus) {
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
    public CLASS_BUILDER1_newextquantbrec _STM() {
        // JavaLine 56 <== SourceLine 784
        {
            // BEGIN INSPECTION 
            _inspect_784_4534=new CLASS_COMMON_extbrecord((_CUR._SL))._STM();
            if(_inspect_784_4534!=null) { // INSPECT _inspect_784_4534  type=ref(EXTBRECORD)
                // JavaLine 61 <== SourceLine 785
                {
                    // JavaLine 63 <== SourceLine 784
                    {
                        // JavaLine 65 <== SourceLine 785
                        _inspect_784_4534.blev=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(p_blv)+(1)));
                        ;
                        _inspect_784_4534.rtblev=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(p_rtblv)+(1)));
                        ;
                        // JavaLine 70 <== SourceLine 786
                        _RESULT=qe=new CLASS_COMMON_extquantity((_CUR._SL),((CLASS_COMMON_extbrecord)_inspect_784_4534))._STM();
                        ;
                        // JavaLine 73 <== SourceLine 787
                        qe.descr_1=((CLASS_COMMON_extbrecord)_inspect_784_4534);
                        ;
                        // JavaLine 76 <== SourceLine 788
                        _inspect_784_4534.declquant=qe;
                        ;
                        _inspect_784_4534.status_1=p_stat;
                        ;
                        _inspect_784_4534.cause_1=p_caus;
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER1.sim","5 newextquantbrec",1,779,16,782,18,784,20,779,56,784,61,785,63,784,65,785,70,786,73,787,76,788,90,790);
} // End of Procedure
