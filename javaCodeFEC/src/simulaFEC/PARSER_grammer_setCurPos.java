// JavaLine 1 <== SourceLine 227
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_setCurPos extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=227, lastLine=233, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 231
    public SCANNER_recognizer _inspect_230_4499=null;
    // Normal Constructor
    public PARSER_grammer_setCurPos(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_setCurPos _STM() {
        // JavaLine 23 <== SourceLine 228
        new SCANNER_setP1line((_CUR._SL._SL));
        ;
        // JavaLine 26 <== SourceLine 230
        {
            // BEGIN INSPECTION 
            _inspect_230_4499=((PARSER)(_CUR._SL._SL)).lexScanner_2;
            if(_inspect_230_4499!=null) { // INSPECT _inspect_230_4499
                // JavaLine 31 <== SourceLine 231
                {
                    ((PARSER_grammer)(_CUR._SL)).currentPos_1=((((((((PARSER)(_CUR._SL._SL)).optx!=(((char)0)))&&(_inspect_230_4499.getopt))&&((_inspect_230_4499.opdline_1==(((PARSER)(_CUR._SL._SL)).linenr)))))?(_inspect_230_4499.opdpos_1):(_inspect_230_4499.optpos_1))+(1));
                }
            }
        } // END INSPECTION
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 setCurPos",1,227,10,231,23,228,26,230,31,231,40,233);
} // End of Procedure
