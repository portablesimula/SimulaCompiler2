// JavaLine 1 <== SourceLine 228
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_setCurPos extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=228, lastLine=234, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 232
    public CLASS_SCANNER_recognizer _inspect_231_4499=null;
    // Normal Constructor
    public CLASS_PARSER_grammer_setCurPos(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_setCurPos _STM() {
        // JavaLine 23 <== SourceLine 229
        new CLASS_SCANNER_setP1line((_CUR._SL._SL));
        ;
        // JavaLine 26 <== SourceLine 231
        {
            // BEGIN INSPECTION 
            _inspect_231_4499=((CLASS_PARSER)(_CUR._SL._SL)).lexScanner_2;
            if(_inspect_231_4499!=null) { // INSPECT _inspect_231_4499  type=ref(RECOGNIZER)
                // JavaLine 31 <== SourceLine 232
                {
                    ((CLASS_PARSER_grammer)(_CUR._SL)).currentPos_1=((((((((CLASS_PARSER)(_CUR._SL._SL)).optx!=(((char)0)))&&(_inspect_231_4499.getopt))&&((_inspect_231_4499.opdline_1==(((CLASS_PARSER)(_CUR._SL._SL)).linenr)))))?(_inspect_231_4499.opdpos_1):(_inspect_231_4499.optpos_1))+(1));
                }
            }
        } // END INSPECTION
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 setCurPos",1,228,10,232,23,229,26,231,31,232,40,234);
} // End of Procedure
