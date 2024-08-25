// JavaLine 1 <== SourceLine 1141
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_whilstat_recover extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1141, lastLine=1145, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare locals as attributes
    public boolean _RESULT=false;
    // Normal Constructor
    public PARSER_grammer_whilstat_recover(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_whilstat_recover _STM() {
        // JavaLine 24 <== SourceLine 1142
        if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs==(((char)28))))) {
            {
                ((PARSER_grammer_whilstat)(_CUR._SL)).rp=((char)2);
                ;
                ((PARSER_grammer_whilstat)(_CUR._SL)).recovered=_RESULT=true;
            }
        } else {
            // JavaLine 32 <== SourceLine 1143
            {
                ((PARSER_grammer_whilstat)(_CUR._SL)).recovered=false;
                ;
                ((PARSER)(_CUR._SL._SL._SL)).opn='C';
                ;
                call(((PARSER)(_CUR._SL._SL._SL)).coder,1143);
                ;
                // JavaLine 40 <== SourceLine 1144
                ((PARSER)(_CUR._SL._SL._SL)).opn=((char)131);
                ;
                call(((PARSER)(_CUR._SL._SL._SL)).coder,1144);
                ;
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 recover",1,1141,24,1142,32,1143,40,1144,49,1145);
} // End of Procedure
