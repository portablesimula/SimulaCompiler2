// JavaLine 1 <== SourceLine 137
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:37 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER0_codegenerator0_checkasdzero extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=137, lastLine=143, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public SCODER0_codegenerator0_checkasdzero(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER0_codegenerator0_checkasdzero _STM() {
        // JavaLine 21 <== SourceLine 142
        if(_VALUE((((SCODER0_codegenerator0)(_CUR._SL)).asd_4!=(0)))) {
            new BUILDER1_visiblegenerator_asderror((_CUR._SL),176);
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER0.sim","5 checkasdzero",1,137,21,142,28,143);
} // End of Procedure
