// JavaLine 1 <== SourceLine 1221
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_ifstat_recover extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1221, lastLine=1230, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare locals as attributes
    public boolean _RESULT=false;
    // Normal Constructor
    public CLASS_PARSER_grammer_ifstat_recover(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_ifstat_recover _STM() {
        // JavaLine 24 <== SourceLine 1222
        ((CLASS_PARSER_grammer_ifstat)(_CUR._SL)).recovered=_RESULT=true;
        ;
        // JavaLine 27 <== SourceLine 1223
        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs==('1')))) {
            ((CLASS_PARSER_grammer_ifstat)(_CUR._SL)).rp=((char)3);
        } else {
            // JavaLine 31 <== SourceLine 1224
            if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs==(((char)15))))) {
                {
                    // JavaLine 34 <== SourceLine 1225
                    ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn=((char)145);
                    ;
                    call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,1225);
                    ;
                    ((CLASS_PARSER_grammer_ifstat)(_CUR._SL)).rp=((char)4);
                }
            } else {
                // JavaLine 42 <== SourceLine 1226
                {
                    ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn=((char)145);
                    ;
                    call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,1226);
                    ;
                    // JavaLine 48 <== SourceLine 1227
                    ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn=((char)131);
                    ;
                    call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,1227);
                    ;
                    // JavaLine 53 <== SourceLine 1228
                    ((CLASS_PARSER_grammer_ifstat)(_CUR._SL)).recovered=_RESULT=false;
                    ;
                }
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 recover",1,1221,24,1222,27,1223,31,1224,34,1225,42,1226,48,1227,53,1228,62,1230);
} // End of Procedure
