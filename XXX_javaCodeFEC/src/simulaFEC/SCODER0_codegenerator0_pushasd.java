// JavaLine 1 <== SourceLine 123
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:37 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER0_codegenerator0_pushasd extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=123, lastLine=128, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public SCODER0_codegenerator0_pushasd(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER0_codegenerator0_pushasd _STM() {
        // JavaLine 21 <== SourceLine 126
        if(_VALUE((((SCODER0_codegenerator0)(_CUR._SL)).curasd_4>=(30)))) {
            new ERRMSG_fatal0((_CUR._SL._SL),246);
        } else {
            // JavaLine 25 <== SourceLine 127
            {
                ((SCODER0_codegenerator0)(_CUR._SL)).curasd_4=(((SCODER0_codegenerator0)(_CUR._SL)).curasd_4+(1));
                ;
                ((SCODER0_codegenerator0)(_CUR._SL)).asdstack.putELEMENT(((SCODER0_codegenerator0)(_CUR._SL)).asdstack.index(((SCODER0_codegenerator0)(_CUR._SL)).curasd_4),((SCODER0_codegenerator0)(_CUR._SL)).asd_4);
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER0.sim","5 pushasd",1,123,21,126,25,127,35,128);
} // End of Procedure
