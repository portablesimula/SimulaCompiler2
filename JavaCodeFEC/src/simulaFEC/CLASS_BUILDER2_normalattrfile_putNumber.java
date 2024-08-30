// JavaLine 1 <== SourceLine 549
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER2_normalattrfile_putNumber extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=549, lastLine=553, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_i;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_BUILDER2_normalattrfile_putNumber setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_i=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_BUILDER2_normalattrfile_putNumber(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_BUILDER2_normalattrfile_putNumber(RTS_RTObject _SL,int sp_i) {
        super(_SL);
        // Parameter assignment to locals
        this.p_i = sp_i;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER2_normalattrfile_putNumber _STM() {
        // JavaLine 39 <== SourceLine 550
        new CLASS_COMMON_TRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),550,CONC(new RTS_TXT("putNumber: "),RTS_ENVIRONMENT.edit(p_i)));
        ;
        // JavaLine 42 <== SourceLine 551
        RTS_ENVIRONMENT.storeChar(RTS_ENVIRONMENT._char((p_i/(256))),((CLASS_BUILDER2_normalattrfile)(_CUR._SL)).attrbuffer,((CLASS_BUILDER2_normalattrfile)(_CUR._SL)).p);
        ;
        // JavaLine 45 <== SourceLine 552
        RTS_ENVIRONMENT.storeChar(RTS_ENVIRONMENT._char(RTS_ENVIRONMENT.mod(p_i,256)),((CLASS_BUILDER2_normalattrfile)(_CUR._SL)).attrbuffer,(((CLASS_BUILDER2_normalattrfile)(_CUR._SL)).p+(1)));
        ;
        ((CLASS_BUILDER2_normalattrfile)(_CUR._SL)).p=(((CLASS_BUILDER2_normalattrfile)(_CUR._SL)).p+(2));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER2.sim","5 putNumber",1,549,39,550,42,551,45,552,52,553);
} // End of Procedure
