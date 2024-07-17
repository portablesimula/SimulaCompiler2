// JavaLine 1 <== SourceLine 772
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_declaration_recover extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=772, lastLine=781, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare locals as attributes
    public boolean _RESULT=false;
    // Normal Constructor
    public PARSER_grammer_declaration_recover(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_declaration_recover _STM() {
        // JavaLine 24 <== SourceLine 773
        if(_VALUE((((PARSER_grammer_declaration)(_CUR._SL)).errorno==(2)))) {
            {
                // JavaLine 27 <== SourceLine 776
                if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs==('X')))) {
                    {
                        // JavaLine 30 <== SourceLine 777
                        ((PARSER)(_CUR._SL._SL._SL)).opn=((((((PARSER_grammer_declaration)(_CUR._SL)).rp<=(((char)1)))||(((((PARSER_grammer_declaration)(_CUR._SL)).rp==(((char)2)))&(((PARSER_grammer_declaration)(_CUR._SL)).innerseen_1)))))?(((char)16)):('u'));
                        ;
                        // JavaLine 33 <== SourceLine 779
                        ((PARSER)(_CUR._SL._SL._SL)).opdlo=((char)1);
                        ;
                        call(((PARSER)(_CUR._SL._SL._SL)).coder,779);
                        ;
                        ((PARSER_grammer)(_CUR._SL._SL)).blockfound_1=(((PARSER_grammer)(_CUR._SL._SL)).blockfound_1-(1));
                        ;
                    }
                } else {
                    // JavaLine 42 <== SourceLine 780
                    ((PARSER_grammer_declaration)(_CUR._SL)).recovered=_RESULT=true;
                }
                ;
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 recover",1,772,24,773,27,776,30,777,33,779,42,780,50,781);
} // End of Procedure
