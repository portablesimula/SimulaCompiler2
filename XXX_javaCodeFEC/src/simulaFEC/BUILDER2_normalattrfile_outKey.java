// JavaLine 1 <== SourceLine 518
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER2_normalattrfile_outKey extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=518, lastLine=521, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public char p_k;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public BUILDER2_normalattrfile_outKey setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_k=(char)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public BUILDER2_normalattrfile_outKey(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public BUILDER2_normalattrfile_outKey(RTS_RTObject _SL,char sp_k) {
        super(_SL);
        // Parameter assignment to locals
        this.p_k = sp_k;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER2_normalattrfile_outKey _STM() {
        // JavaLine 39 <== SourceLine 519
        new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),519,CONC(new RTS_TXT("outKey: "),new COMMON_attrfile_edKey((_CUR._SL),p_k)._RESULT));
        ;
        // JavaLine 42 <== SourceLine 520
        RTS_ENVIRONMENT.storeChar(p_k,((BUILDER2_normalattrfile)(_CUR._SL)).attrbuffer,((BUILDER2_normalattrfile)(_CUR._SL)).p);
        ;
        ((BUILDER2_normalattrfile)(_CUR._SL)).p=(((BUILDER2_normalattrfile)(_CUR._SL)).p+(1));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER2.sim","5 outKey",1,518,39,519,42,520,49,521);
} // End of Procedure
