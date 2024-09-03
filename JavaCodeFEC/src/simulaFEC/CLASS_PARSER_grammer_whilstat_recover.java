// JavaLine 1 <== SourceLine 1142
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_whilstat_recover extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1142, lastLine=1146, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare locals as attributes
    public boolean _RESULT=false;
    // Normal Constructor
    public CLASS_PARSER_grammer_whilstat_recover(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_whilstat_recover _STM() {
        // JavaLine 24 <== SourceLine 1143
        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs==(((char)28))))) {
            {
                ((CLASS_PARSER_grammer_whilstat)(_CUR._SL)).rp=((char)2);
                ;
                ((CLASS_PARSER_grammer_whilstat)(_CUR._SL)).recovered=_RESULT=true;
            }
        } else {
            // JavaLine 32 <== SourceLine 1144
            {
                ((CLASS_PARSER_grammer_whilstat)(_CUR._SL)).recovered=false;
                ;
                ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn='C';
                ;
                call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,1144);
                ;
                // JavaLine 40 <== SourceLine 1145
                ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn=((char)131);
                ;
                call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,1145);
                ;
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 recover",1,1142,24,1143,32,1144,40,1145,49,1146);
} // End of Procedure
