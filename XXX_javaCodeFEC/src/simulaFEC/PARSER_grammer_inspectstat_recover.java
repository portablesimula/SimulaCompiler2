// JavaLine 1 <== SourceLine 1703
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_inspectstat_recover extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1703, lastLine=1710, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare locals as attributes
    public boolean _RESULT=false;
    // Normal Constructor
    public PARSER_grammer_inspectstat_recover(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_inspectstat_recover _STM() {
        // JavaLine 24 <== SourceLine 1704
        _RESULT=false;
        ;
        // JavaLine 27 <== SourceLine 1705
        if(_VALUE(((((PARSER_grammer_inspectstat)(_CUR._SL)).errorno==(1))||((((PARSER_grammer_inspectstat)(_CUR._SL)).errorno==(2)))))) {
            {
                // JavaLine 30 <== SourceLine 1706
                ((PARSER)(_CUR._SL._SL._SL)).opn='i';
                ;
                call(((PARSER)(_CUR._SL._SL._SL)).coder,1706);
            }
        }
        ;
        // JavaLine 37 <== SourceLine 1707
        ((PARSER)(_CUR._SL._SL._SL)).opn=((((PARSER_grammer_inspectstat)(_CUR._SL)).iothwsent_1)?(((char)135)):('j'));
        ;
        call(((PARSER)(_CUR._SL._SL._SL)).coder,1707);
        ;
        // JavaLine 42 <== SourceLine 1708
        if(_VALUE(((PARSER_grammer_inspectstat)(_CUR._SL)).enclgen_1)) {
            {
                ((PARSER_grammer_inspectstat)(_CUR._SL)).enclgen_1=false;
                ;
                // JavaLine 47 <== SourceLine 1709
                ((PARSER_grammer)(_CUR._SL._SL)).blockfound_1=0;
                ;
                ((PARSER)(_CUR._SL._SL._SL)).opn=((char)16);
                ;
                call(((PARSER)(_CUR._SL._SL._SL)).coder,1709);
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 recover",1,1703,24,1704,27,1705,30,1706,37,1707,42,1708,47,1709,58,1710);
} // End of Procedure
