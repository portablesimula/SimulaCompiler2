// JavaLine 1 <== SourceLine 646
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_markStmt extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=646, lastLine=658, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_PARSER_grammer_markStmt(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_markStmt _STM() {
        // JavaLine 21 <== SourceLine 648
        if(_VALUE((((((CLASS_PARSER_grammer)(_CUR._SL)).last_1.blockstatus==(((char)1)))||((((CLASS_PARSER_grammer)(_CUR._SL)).stmtwnt_1==(((char)3)))))||((((CLASS_PARSER_grammer)(_CUR._SL)).stmtwnt_1==(((char)5))))))) {
            // JavaLine 23 <== SourceLine 650
            {
                // JavaLine 25 <== SourceLine 651
                ((CLASS_PARSER_grammer)(_CUR._SL)).last_1.blockstatus=((char)3);
                ;
                // JavaLine 28 <== SourceLine 652
                ((CLASS_PARSER)(_CUR._SL._SL)).opn='o';
                ;
                call(((CLASS_PARSER)(_CUR._SL._SL)).coder,652);
                ;
            }
        }
        ;
        // JavaLine 36 <== SourceLine 655
        ((CLASS_PARSER)(_CUR._SL._SL)).opn='Y';
        ;
        call(((CLASS_PARSER)(_CUR._SL._SL)).coder,655);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 markStmt",1,646,21,648,23,650,25,651,28,652,36,655,43,658);
} // End of Procedure
