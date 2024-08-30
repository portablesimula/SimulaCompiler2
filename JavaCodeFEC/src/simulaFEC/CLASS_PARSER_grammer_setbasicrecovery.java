// JavaLine 1 <== SourceLine 610
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_setbasicrecovery extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=610, lastLine=627, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_PARSER_grammer_setbasicrecovery(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_setbasicrecovery _STM() {
        // JavaLine 21 <== SourceLine 612
        ((CLASS_PARSER_grammer)(_CUR._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)16))),true);
        ;
        // JavaLine 24 <== SourceLine 613
        ((CLASS_PARSER_grammer)(_CUR._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('O')),true);
        ;
        // JavaLine 27 <== SourceLine 614
        ((CLASS_PARSER_grammer)(_CUR._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)32))),true);
        ;
        // JavaLine 30 <== SourceLine 615
        ((CLASS_PARSER_grammer)(_CUR._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)21))),true);
        ;
        // JavaLine 33 <== SourceLine 616
        ((CLASS_PARSER_grammer)(_CUR._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('8')),true);
        ;
        // JavaLine 36 <== SourceLine 618
        ((CLASS_PARSER_grammer)(_CUR._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)27))),true);
        ;
        // JavaLine 39 <== SourceLine 619
        ((CLASS_PARSER_grammer)(_CUR._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)19))),true);
        ;
        // JavaLine 42 <== SourceLine 620
        ((CLASS_PARSER_grammer)(_CUR._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank(((char)26))),true);
        ;
        // JavaLine 45 <== SourceLine 621
        ((CLASS_PARSER_grammer)(_CUR._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('0')),true);
        ;
        // JavaLine 48 <== SourceLine 622
        ((CLASS_PARSER_grammer)(_CUR._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('*')),true);
        ;
        // JavaLine 51 <== SourceLine 623
        ((CLASS_PARSER_grammer)(_CUR._SL)).recoversymbol.putELEMENT(((CLASS_PARSER_grammer)(_CUR._SL)).recoversymbol.index(RTS_ENVIRONMENT.rank('X')),true);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 setbasicrecovery",1,610,21,612,24,613,27,614,30,615,33,616,36,618,39,619,42,620,45,621,48,622,51,623,56,627);
} // End of Procedure
