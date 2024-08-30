// JavaLine 1 <== SourceLine 73
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_codebuffer_termModul extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=73, lastLine=84, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 74
    public char optxp=0;
    public char opdhip=0;
    public char opdlop=0;
    // Normal Constructor
    public CLASS_PARSER_codebuffer_termModul(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_codebuffer_termModul _STM() {
        // JavaLine 25 <== SourceLine 75
        opdhip=((CLASS_PARSER)(_CUR._SL._SL)).opdhi;
        ;
        opdlop=((CLASS_PARSER)(_CUR._SL._SL)).opdlo;
        ;
        optxp=((CLASS_PARSER)(_CUR._SL._SL)).optx;
        ;
        // JavaLine 32 <== SourceLine 76
        if(_VALUE(((CLASS_PARSER)(_CUR._SL._SL)).separatecomp)) {
            ;
        } else {
            // JavaLine 36 <== SourceLine 77
            {
                // JavaLine 38 <== SourceLine 78
                ((CLASS_PARSER)(_CUR._SL._SL)).opn='o';
                ;
                call(((CLASS_PARSER_codebuffer)(_CUR._SL)).prev_4,78);
                ;
                // JavaLine 43 <== SourceLine 79
                ((CLASS_PARSER)(_CUR._SL._SL)).opn='\\';
                ;
                call(((CLASS_PARSER_codebuffer)(_CUR._SL)).prev_4,79);
                ;
                // JavaLine 48 <== SourceLine 80
                ((CLASS_PARSER_grammer)(((CLASS_PARSER)(_CUR._SL._SL)).parser)).blockfound_1=1;
                ;
            }
        }
        ;
        // JavaLine 54 <== SourceLine 82
        new CLASS_PARSER_codebuffer_terminate((_CUR._SL));
        ;
        // JavaLine 57 <== SourceLine 83
        ((CLASS_PARSER)(_CUR._SL._SL)).opdhi=opdhip;
        ;
        ((CLASS_PARSER)(_CUR._SL._SL)).opdlo=opdlop;
        ;
        ((CLASS_PARSER)(_CUR._SL._SL)).optx=optxp;
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 termModul",1,73,10,74,25,75,32,76,36,77,38,78,43,79,48,80,54,82,57,83,66,84);
} // End of Procedure
