// JavaLine 1 <== SourceLine 984
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_blockOrComp_recover extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=984, lastLine=996, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare locals as attributes
    public boolean _RESULT=false;
    // Normal Constructor
    public CLASS_PARSER_grammer_blockOrComp_recover(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_blockOrComp_recover _STM() {
        // JavaLine 24 <== SourceLine 985
        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs==('X')))) {
            // JavaLine 26 <== SourceLine 986
            {
                if(_VALUE(((((CLASS_PARSER_grammer_blockOrComp)(_CUR._SL)).blocktype_1==(((char)2)))|(((((CLASS_PARSER_grammer_blockOrComp)(_CUR._SL)).blocktype_1==(((char)1)))&((!(((CLASS_PARSER_grammer_blockOrComp)(_CUR._SL)).unlabbody_1)))))))) {
                    // JavaLine 29 <== SourceLine 988
                    {
                        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn=((char)16);
                        ;
                        call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,988);
                        ;
                        // JavaLine 35 <== SourceLine 989
                        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).blockfound_1=(((CLASS_PARSER_grammer)(_CUR._SL._SL)).blockfound_1-(1));
                    }
                }
                ;
            }
        } else {
            // JavaLine 42 <== SourceLine 991
            {
                ((CLASS_PARSER_grammer_blockOrComp)(_CUR._SL)).recoverno_1=(((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs==('O')))?(1):((((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs==(((char)16))))?(2):(3))));
                ;
                // JavaLine 46 <== SourceLine 993
                if(_VALUE((((CLASS_PARSER_grammer_blockOrComp)(_CUR._SL)).recoverno_1!=(3)))) {
                    ((CLASS_PARSER_grammer_blockOrComp)(_CUR._SL)).recovered=_RESULT=true;
                }
                ;
                // JavaLine 51 <== SourceLine 994
                ((CLASS_PARSER_grammer_blockOrComp)(_CUR._SL)).rp=((char)2);
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 recover",1,984,24,985,26,986,29,988,35,989,42,991,46,993,51,994,59,996);
} // End of Procedure
