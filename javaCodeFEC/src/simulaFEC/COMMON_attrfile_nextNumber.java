// JavaLine 1 <== SourceLine 1069
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:29 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class COMMON_attrfile_nextNumber extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1069, lastLine=1072, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare locals as attributes
    public int _RESULT=0;
    // Normal Constructor
    public COMMON_attrfile_nextNumber(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public COMMON_attrfile_nextNumber _STM() {
        // JavaLine 24 <== SourceLine 1070
        _RESULT=((RTS_ENVIRONMENT.rank(RTS_ENVIRONMENT.loadChar(((COMMON_attrfile)(_CUR._SL)).attrbuffer,((COMMON_attrfile)(_CUR._SL)).p))*(256))+(RTS_ENVIRONMENT.rank(RTS_ENVIRONMENT.loadChar(((COMMON_attrfile)(_CUR._SL)).attrbuffer,(((COMMON_attrfile)(_CUR._SL)).p+(1))))));
        ;
        // JavaLine 27 <== SourceLine 1071
        ((COMMON_attrfile)(_CUR._SL)).p=(((COMMON_attrfile)(_CUR._SL)).p+(2));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","5 nextNumber",1,1069,24,1070,27,1071,32,1072);
} // End of Procedure
