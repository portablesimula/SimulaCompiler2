// JavaLine 1 <== SourceLine 742
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:38 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER1_codegenerator1_poptag extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=742, lastLine=747, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public SCODER1_codegenerator1_poptag(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER1_codegenerator1_poptag _STM() {
        // JavaLine 21 <== SourceLine 743
        if(_VALUE((((SCODER1_codegenerator1)(_CUR._SL)).tagstackdepth_6<=(0)))) {
            new ERRMSG_internerr((_CUR._SL._SL),((char)11),743);
        } else {
            // JavaLine 25 <== SourceLine 744
            {
                // JavaLine 27 <== SourceLine 745
                ((SCODER1_codegenerator1)(_CUR._SL)).tagstackdepth_6=(((SCODER1_codegenerator1)(_CUR._SL)).tagstackdepth_6-(1));
                ;
                // JavaLine 30 <== SourceLine 746
                ((SCODER1_codegenerator1)(_CUR._SL)).tagstacktop_6=((SCODER1_codegenerator1)(_CUR._SL)).tagstack.getELEMENT(((SCODER1_codegenerator1)(_CUR._SL)).tagstackdepth_6);
                ;
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER1.sim","5 poptag",1,742,21,743,25,744,27,745,30,746,37,747);
} // End of Procedure
