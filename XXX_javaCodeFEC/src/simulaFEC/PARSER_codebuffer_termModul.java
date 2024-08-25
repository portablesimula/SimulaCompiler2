// JavaLine 1 <== SourceLine 72
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_codebuffer_termModul extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=72, lastLine=83, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 73
    public char optxp=0;
    public char opdhip=0;
    public char opdlop=0;
    // Normal Constructor
    public PARSER_codebuffer_termModul(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_codebuffer_termModul _STM() {
        // JavaLine 25 <== SourceLine 74
        opdhip=((PARSER)(_CUR._SL._SL)).opdhi;
        ;
        opdlop=((PARSER)(_CUR._SL._SL)).opdlo;
        ;
        optxp=((PARSER)(_CUR._SL._SL)).optx;
        ;
        // JavaLine 32 <== SourceLine 75
        if(_VALUE(((PARSER)(_CUR._SL._SL)).separatecomp)) {
            ;
        } else {
            // JavaLine 36 <== SourceLine 76
            {
                // JavaLine 38 <== SourceLine 77
                ((PARSER)(_CUR._SL._SL)).opn='o';
                ;
                call(((PARSER_codebuffer)(_CUR._SL)).prev_4,77);
                ;
                // JavaLine 43 <== SourceLine 78
                ((PARSER)(_CUR._SL._SL)).opn='\\';
                ;
                call(((PARSER_codebuffer)(_CUR._SL)).prev_4,78);
                ;
                // JavaLine 48 <== SourceLine 79
                ((PARSER_grammer)(((PARSER)(_CUR._SL._SL)).parser)).blockfound_1=1;
                ;
            }
        }
        ;
        // JavaLine 54 <== SourceLine 81
        new PARSER_codebuffer_terminate((_CUR._SL));
        ;
        // JavaLine 57 <== SourceLine 82
        ((PARSER)(_CUR._SL._SL)).opdhi=opdhip;
        ;
        ((PARSER)(_CUR._SL._SL)).opdlo=opdlop;
        ;
        ((PARSER)(_CUR._SL._SL)).optx=optxp;
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 termModul",1,72,10,73,25,74,32,75,36,76,38,77,43,78,48,79,54,81,57,82,66,83);
} // End of Procedure
