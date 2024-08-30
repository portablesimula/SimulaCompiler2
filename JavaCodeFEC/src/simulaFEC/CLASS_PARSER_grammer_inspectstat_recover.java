// JavaLine 1 <== SourceLine 1704
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_inspectstat_recover extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1704, lastLine=1711, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare locals as attributes
    public boolean _RESULT=false;
    // Normal Constructor
    public CLASS_PARSER_grammer_inspectstat_recover(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_inspectstat_recover _STM() {
        // JavaLine 24 <== SourceLine 1705
        _RESULT=false;
        ;
        // JavaLine 27 <== SourceLine 1706
        if(_VALUE(((((CLASS_PARSER_grammer_inspectstat)(_CUR._SL)).errorno==(1))||((((CLASS_PARSER_grammer_inspectstat)(_CUR._SL)).errorno==(2)))))) {
            {
                // JavaLine 30 <== SourceLine 1707
                ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn='i';
                ;
                call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,1707);
            }
        }
        ;
        // JavaLine 37 <== SourceLine 1708
        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn=((((CLASS_PARSER_grammer_inspectstat)(_CUR._SL)).iothwsent_1)?(((char)135)):('j'));
        ;
        call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,1708);
        ;
        // JavaLine 42 <== SourceLine 1709
        if(_VALUE(((CLASS_PARSER_grammer_inspectstat)(_CUR._SL)).enclgen_1)) {
            {
                ((CLASS_PARSER_grammer_inspectstat)(_CUR._SL)).enclgen_1=false;
                ;
                // JavaLine 47 <== SourceLine 1710
                ((CLASS_PARSER_grammer)(_CUR._SL._SL)).blockfound_1=0;
                ;
                ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn=((char)16);
                ;
                call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,1710);
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 recover",1,1704,24,1705,27,1706,30,1707,37,1708,42,1709,47,1710,58,1711);
} // End of Procedure
