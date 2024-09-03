// JavaLine 1 <== SourceLine 1120
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER2_prechecker_allocate extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1120, lastLine=1861, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 1135
    public CLASS_COMMON_brecord B1=null;
    public CLASS_COMMON_quantity Q=null;
    public CLASS_COMMON_quantity TUchain=null;
    public CLASS_COMMON_brecord brc=null;
    // Normal Constructor
    public CLASS_BUILDER2_prechecker_allocate(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER2_prechecker_allocate _STM() {
        // JavaLine 26 <== SourceLine 1859
        new CLASS_BUILDER2_prechecker_allocate_main_program_of_allocate((_CUR));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER2.sim","5 allocate",1,1120,10,1135,26,1859,31,1861);
} // End of Procedure
