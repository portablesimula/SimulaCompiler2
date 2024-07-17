// JavaLine 1 <== SourceLine 209
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:38 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER1_codegenerator1_pushnewjump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=209, lastLine=214, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public SCODER1_codegenerator1_pushnewjump(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER1_codegenerator1_pushnewjump _STM() {
        // JavaLine 21 <== SourceLine 210
        new SCODER0_codegenerator0_getnewindex((_CUR._SL));
        ;
        ((SCODER1_codegenerator1)(_CUR._SL)).curjump_4=(((SCODER1_codegenerator1)(_CUR._SL)).curjump_4+(1));
        ;
        // JavaLine 26 <== SourceLine 212
        if(_VALUE((((SCODER1_codegenerator1)(_CUR._SL)).curjump_4>(100)))) {
            new ERRMSG_fatal0((_CUR._SL._SL),250);
        } else {
            // JavaLine 30 <== SourceLine 213
            ((SCODER1_codegenerator1)(_CUR._SL)).jumpstack.putELEMENT(((SCODER1_codegenerator1)(_CUR._SL)).jumpstack.index(((SCODER1_codegenerator1)(_CUR._SL)).curjump_4),((SCODER1_codegenerator1)(_CUR._SL)).curindex_5);
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER1.sim","5 pushnewjump",1,209,21,210,26,212,30,213,36,214);
} // End of Procedure
