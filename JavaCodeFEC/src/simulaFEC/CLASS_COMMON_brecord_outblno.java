// JavaLine 1 <== SourceLine 445
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:45 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_COMMON_brecord_outblno extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=445, lastLine=446, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_COMMON_brecord_outblno(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_COMMON_brecord_outblno _STM() {
        // JavaLine 21 <== SourceLine 446
        RTS_BASICIO.sysout().outint(((RTS_ENVIRONMENT.rank(((CLASS_COMMON_brecord)(_CUR._SL)).blnohi)*(256))+(RTS_ENVIRONMENT.rank(((CLASS_COMMON_brecord)(_CUR._SL)).blnolo))),4);
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","5 outblno",1,445,21,446,25,446);
} // End of Procedure
