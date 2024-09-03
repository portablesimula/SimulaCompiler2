// JavaLine 1 <== SourceLine 1070
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:45 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_COMMON_attrfile_nextNumber extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1070, lastLine=1073, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare locals as attributes
    public int _RESULT=0;
    // Normal Constructor
    public CLASS_COMMON_attrfile_nextNumber(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_COMMON_attrfile_nextNumber _STM() {
        // JavaLine 24 <== SourceLine 1071
        _RESULT=((RTS_ENVIRONMENT.rank(RTS_ENVIRONMENT.loadChar(((CLASS_COMMON_attrfile)(_CUR._SL)).attrbuffer,((CLASS_COMMON_attrfile)(_CUR._SL)).p))*(256))+(RTS_ENVIRONMENT.rank(RTS_ENVIRONMENT.loadChar(((CLASS_COMMON_attrfile)(_CUR._SL)).attrbuffer,(((CLASS_COMMON_attrfile)(_CUR._SL)).p+(1))))));
        ;
        // JavaLine 27 <== SourceLine 1072
        ((CLASS_COMMON_attrfile)(_CUR._SL)).p=(((CLASS_COMMON_attrfile)(_CUR._SL)).p+(2));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","5 nextNumber",1,1070,24,1071,27,1072,32,1073);
} // End of Procedure
