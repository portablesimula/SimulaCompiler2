// JavaLine 1 <== SourceLine 1220
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_ifstat_recover extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1220, lastLine=1229, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare locals as attributes
    public boolean _RESULT=false;
    // Normal Constructor
    public PARSER_grammer_ifstat_recover(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_ifstat_recover _STM() {
        // JavaLine 24 <== SourceLine 1221
        ((PARSER_grammer_ifstat)(_CUR._SL)).recovered=_RESULT=true;
        ;
        // JavaLine 27 <== SourceLine 1222
        if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs==('1')))) {
            ((PARSER_grammer_ifstat)(_CUR._SL)).rp=((char)3);
        } else {
            // JavaLine 31 <== SourceLine 1223
            if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs==(((char)15))))) {
                {
                    // JavaLine 34 <== SourceLine 1224
                    ((PARSER)(_CUR._SL._SL._SL)).opn=((char)145);
                    ;
                    call(((PARSER)(_CUR._SL._SL._SL)).coder,1224);
                    ;
                    ((PARSER_grammer_ifstat)(_CUR._SL)).rp=((char)4);
                }
            } else {
                // JavaLine 42 <== SourceLine 1225
                {
                    ((PARSER)(_CUR._SL._SL._SL)).opn=((char)145);
                    ;
                    call(((PARSER)(_CUR._SL._SL._SL)).coder,1225);
                    ;
                    // JavaLine 48 <== SourceLine 1226
                    ((PARSER)(_CUR._SL._SL._SL)).opn=((char)131);
                    ;
                    call(((PARSER)(_CUR._SL._SL._SL)).coder,1226);
                    ;
                    // JavaLine 53 <== SourceLine 1227
                    ((PARSER_grammer_ifstat)(_CUR._SL)).recovered=_RESULT=false;
                    ;
                }
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 recover",1,1220,24,1221,27,1222,31,1223,34,1224,42,1225,48,1226,53,1227,62,1229);
} // End of Procedure
