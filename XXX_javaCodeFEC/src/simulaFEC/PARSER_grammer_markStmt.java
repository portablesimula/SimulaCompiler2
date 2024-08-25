// JavaLine 1 <== SourceLine 645
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_markStmt extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=645, lastLine=657, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public PARSER_grammer_markStmt(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_markStmt _STM() {
        // JavaLine 21 <== SourceLine 647
        if(_VALUE((((((PARSER_grammer)(_CUR._SL)).last_1.blockstatus==(((char)1)))||((((PARSER_grammer)(_CUR._SL)).stmtwnt_1==(((char)3)))))||((((PARSER_grammer)(_CUR._SL)).stmtwnt_1==(((char)5))))))) {
            // JavaLine 23 <== SourceLine 649
            {
                // JavaLine 25 <== SourceLine 650
                ((PARSER_grammer)(_CUR._SL)).last_1.blockstatus=((char)3);
                ;
                // JavaLine 28 <== SourceLine 651
                ((PARSER)(_CUR._SL._SL)).opn='o';
                ;
                call(((PARSER)(_CUR._SL._SL)).coder,651);
                ;
            }
        }
        ;
        // JavaLine 36 <== SourceLine 654
        ((PARSER)(_CUR._SL._SL)).opn='Y';
        ;
        call(((PARSER)(_CUR._SL._SL)).coder,654);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 markStmt",1,645,21,647,23,649,25,650,28,651,36,654,43,657);
} // End of Procedure
