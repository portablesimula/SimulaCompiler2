// JavaLine 1 <== SourceLine 131
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:37 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER0_codegenerator0_popasd extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=131, lastLine=134, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public SCODER0_codegenerator0_popasd(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER0_codegenerator0_popasd _STM() {
        // JavaLine 21 <== SourceLine 133
        ((SCODER0_codegenerator0)(_CUR._SL)).asd_4=((SCODER0_codegenerator0)(_CUR._SL)).asdstack.getELEMENT(((SCODER0_codegenerator0)(_CUR._SL)).curasd_4);
        ;
        // JavaLine 24 <== SourceLine 134
        ((SCODER0_codegenerator0)(_CUR._SL)).curasd_4=(((SCODER0_codegenerator0)(_CUR._SL)).curasd_4-(1));
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER0.sim","5 popasd",1,131,21,133,24,134,28,134);
} // End of Procedure
