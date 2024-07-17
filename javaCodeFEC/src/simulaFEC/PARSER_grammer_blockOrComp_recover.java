// JavaLine 1 <== SourceLine 983
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_blockOrComp_recover extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=983, lastLine=995, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare locals as attributes
    public boolean _RESULT=false;
    // Normal Constructor
    public PARSER_grammer_blockOrComp_recover(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_blockOrComp_recover _STM() {
        // JavaLine 24 <== SourceLine 984
        if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs==('X')))) {
            // JavaLine 26 <== SourceLine 985
            {
                if(_VALUE(((((PARSER_grammer_blockOrComp)(_CUR._SL)).blocktype_1==(((char)2)))|(((((PARSER_grammer_blockOrComp)(_CUR._SL)).blocktype_1==(((char)1)))&((!(((PARSER_grammer_blockOrComp)(_CUR._SL)).unlabbody_1)))))))) {
                    // JavaLine 29 <== SourceLine 987
                    {
                        ((PARSER)(_CUR._SL._SL._SL)).opn=((char)16);
                        ;
                        call(((PARSER)(_CUR._SL._SL._SL)).coder,987);
                        ;
                        // JavaLine 35 <== SourceLine 988
                        ((PARSER_grammer)(_CUR._SL._SL)).blockfound_1=(((PARSER_grammer)(_CUR._SL._SL)).blockfound_1-(1));
                    }
                }
                ;
            }
        } else {
            // JavaLine 42 <== SourceLine 990
            {
                ((PARSER_grammer_blockOrComp)(_CUR._SL)).recoverno_1=(((((PARSER_grammer)(_CUR._SL._SL)).cs==('O')))?(1):((((((PARSER_grammer)(_CUR._SL._SL)).cs==(((char)16))))?(2):(3))));
                ;
                // JavaLine 46 <== SourceLine 992
                if(_VALUE((((PARSER_grammer_blockOrComp)(_CUR._SL)).recoverno_1!=(3)))) {
                    ((PARSER_grammer_blockOrComp)(_CUR._SL)).recovered=_RESULT=true;
                }
                ;
                // JavaLine 51 <== SourceLine 993
                ((PARSER_grammer_blockOrComp)(_CUR._SL)).rp=((char)2);
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 recover",1,983,24,984,26,985,29,987,35,988,42,990,46,992,51,993,59,995);
} // End of Procedure
