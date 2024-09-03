// JavaLine 1 <== SourceLine 1430
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:53 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER3_codegenerator3_fnp_acc_arr extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1430, lastLine=1439, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_SCODER3_codegenerator3_fnp_acc_arr(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER3_codegenerator3_fnp_acc_arr _STM() {
        // JavaLine 21 <== SourceLine 1435
        new CLASS_SCODER2_codegenerator2_addrNAMEQNT((_CUR._SL));
        ;
        // JavaLine 24 <== SourceLine 1436
        ((CLASS_SCODER3_codegenerator3)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("I"),new RTS_TXT("\u0088")),new RTS_TXT("\u0006\u0015")),new RTS_TXT("F")),new RTS_TXT("\u0006\u0016")));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER3.sim","5 fnp_acc_arr",1,1430,21,1435,24,1436,29,1439);
} // End of Procedure
