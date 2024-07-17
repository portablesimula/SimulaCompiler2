// JavaLine 1 <== SourceLine 222
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:38 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER1_codegenerator1_setbdest extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=222, lastLine=226, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public SCODER1_codegenerator1_setbdest(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER1_codegenerator1_setbdest _STM() {
        // JavaLine 21 <== SourceLine 223
        new SCODER0_codegenerator0_getnewindex((_CUR._SL));
        ;
        // JavaLine 24 <== SourceLine 224
        ((SCODER1_codegenerator1)(_CUR._SL)).bdeststack.putELEMENT(((SCODER1_codegenerator1)(_CUR._SL)).bdeststack.index(((SCODER1_codegenerator1)(_CUR._SL)).curbdest_6),((SCODER1_codegenerator1)(_CUR._SL)).curindex_5);
        ;
        ((SCODER1_codegenerator1)(_CUR._SL)).curbdest_6=(((SCODER1_codegenerator1)(_CUR._SL)).curbdest_6+(1));
        ;
        // JavaLine 29 <== SourceLine 225
        ((SCODER1_codegenerator1)(_CUR._SL)).outbyte(56);
        ;
        ((SCODER1_codegenerator1)(_CUR._SL)).outbyte(((SCODER1_codegenerator1)(_CUR._SL)).curindex_5);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER1.sim","5 setbdest",1,222,21,223,24,224,29,225,36,226);
} // End of Procedure
