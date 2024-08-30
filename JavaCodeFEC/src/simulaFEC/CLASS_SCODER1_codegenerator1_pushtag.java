// JavaLine 1 <== SourceLine 733
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:34 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER1_codegenerator1_pushtag extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=733, lastLine=739, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_SCODER1_codegenerator1_pushtag(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER1_codegenerator1_pushtag _STM() {
        // JavaLine 21 <== SourceLine 734
        if(_VALUE((((CLASS_SCODER1_codegenerator1)(_CUR._SL)).tagstackdepth_6>(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).maxtagstack_5)))) {
            new CLASS_ERRMSG_fatal0((_CUR._SL._SL),261);
        } else {
            // JavaLine 25 <== SourceLine 736
            {
                // JavaLine 27 <== SourceLine 737
                ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).tagstack.putELEMENT(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).tagstack.index(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).tagstackdepth_6),((CLASS_SCODER1_codegenerator1)(_CUR._SL)).tagstacktop_6);
                ;
                // JavaLine 30 <== SourceLine 738
                ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).tagstackdepth_6=(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).tagstackdepth_6+(1));
                ;
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER1.sim","5 pushtag",1,733,21,734,25,736,27,737,30,738,37,739);
} // End of Procedure
