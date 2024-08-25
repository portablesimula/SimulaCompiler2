// JavaLine 1 <== SourceLine 997
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_blockOrComp_recoversetting extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=997, lastLine=1017, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public PARSER_grammer_blockOrComp_recoversetting(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_blockOrComp_recoversetting _STM() {
        // JavaLine 21 <== SourceLine 999
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)13))),true);
        ;
        // JavaLine 24 <== SourceLine 1000
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)5))),true);
        ;
        // JavaLine 27 <== SourceLine 1001
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)1))),true);
        ;
        // JavaLine 30 <== SourceLine 1002
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)7))),true);
        ;
        // JavaLine 33 <== SourceLine 1003
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)2))),true);
        ;
        // JavaLine 36 <== SourceLine 1004
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)3))),true);
        ;
        // JavaLine 39 <== SourceLine 1005
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)18))),true);
        ;
        // JavaLine 42 <== SourceLine 1006
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('/')),true);
        ;
        // JavaLine 45 <== SourceLine 1007
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)4))),true);
        ;
        // JavaLine 48 <== SourceLine 1008
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)8))),true);
        ;
        // JavaLine 51 <== SourceLine 1009
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)6))),true);
        ;
        // JavaLine 54 <== SourceLine 1010
        ((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)12))),true);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 recoversetting",1,997,21,999,24,1000,27,1001,30,1002,33,1003,36,1004,39,1005,42,1006,45,1007,48,1008,51,1009,54,1010,59,1017);
} // End of Procedure
