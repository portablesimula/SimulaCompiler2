// JavaLine 1 <== SourceLine 123
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:33 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER0_codegenerator0_pushasd extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=123, lastLine=128, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_SCODER0_codegenerator0_pushasd(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER0_codegenerator0_pushasd _STM() {
        // JavaLine 21 <== SourceLine 126
        if(_VALUE((((CLASS_SCODER0_codegenerator0)(_CUR._SL)).curasd_4>=(30)))) {
            new CLASS_ERRMSG_fatal0((_CUR._SL._SL),246);
        } else {
            // JavaLine 25 <== SourceLine 127
            {
                ((CLASS_SCODER0_codegenerator0)(_CUR._SL)).curasd_4=(((CLASS_SCODER0_codegenerator0)(_CUR._SL)).curasd_4+(1));
                ;
                ((CLASS_SCODER0_codegenerator0)(_CUR._SL)).asdstack.putELEMENT(((CLASS_SCODER0_codegenerator0)(_CUR._SL)).asdstack.index(((CLASS_SCODER0_codegenerator0)(_CUR._SL)).curasd_4),((CLASS_SCODER0_codegenerator0)(_CUR._SL)).asd_4);
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER0.sim","5 pushasd",1,123,21,126,25,127,35,128);
} // End of Procedure
