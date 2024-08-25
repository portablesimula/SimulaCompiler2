// JavaLine 1 <== SourceLine 609
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_setbasicrecovery extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=609, lastLine=626, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public PARSER_grammer_setbasicrecovery(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_setbasicrecovery _STM() {
        // JavaLine 21 <== SourceLine 611
        ((PARSER_grammer)(_CUR._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)16))),true);
        ;
        // JavaLine 24 <== SourceLine 612
        ((PARSER_grammer)(_CUR._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('O')),true);
        ;
        // JavaLine 27 <== SourceLine 613
        ((PARSER_grammer)(_CUR._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)32))),true);
        ;
        // JavaLine 30 <== SourceLine 614
        ((PARSER_grammer)(_CUR._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)21))),true);
        ;
        // JavaLine 33 <== SourceLine 615
        ((PARSER_grammer)(_CUR._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('8')),true);
        ;
        // JavaLine 36 <== SourceLine 617
        ((PARSER_grammer)(_CUR._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)27))),true);
        ;
        // JavaLine 39 <== SourceLine 618
        ((PARSER_grammer)(_CUR._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)19))),true);
        ;
        // JavaLine 42 <== SourceLine 619
        ((PARSER_grammer)(_CUR._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)26))),true);
        ;
        // JavaLine 45 <== SourceLine 620
        ((PARSER_grammer)(_CUR._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('0')),true);
        ;
        // JavaLine 48 <== SourceLine 621
        ((PARSER_grammer)(_CUR._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('*')),true);
        ;
        // JavaLine 51 <== SourceLine 622
        ((PARSER_grammer)(_CUR._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('X')),true);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 setbasicrecovery",1,609,21,611,24,612,27,613,30,614,33,615,36,617,39,618,42,619,45,620,48,621,51,622,56,626);
} // End of Procedure
