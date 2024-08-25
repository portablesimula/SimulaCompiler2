// JavaLine 1 <== SourceLine 61
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_codebuffer_elt_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=61, lastLine=64, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public PARSER_codebuffer_elt_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_codebuffer_elt_emit _STM() {
        // JavaLine 21 <== SourceLine 62
        ((PARSER)(_CUR._SL._SL._SL)).opdhi=((PARSER_codebuffer_elt)(_CUR._SL)).opdhii;
        ;
        ((PARSER)(_CUR._SL._SL._SL)).opdlo=((PARSER_codebuffer_elt)(_CUR._SL)).opdloo;
        ;
        // JavaLine 26 <== SourceLine 63
        ((PARSER)(_CUR._SL._SL._SL)).optx=((PARSER_codebuffer_elt)(_CUR._SL)).optxx;
        ;
        ((PARSER)(_CUR._SL._SL._SL)).opn=((PARSER_codebuffer_elt)(_CUR._SL)).opnn;
        ;
        call(((PARSER)(_CUR._SL._SL._SL)).coder,63);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 emit",1,61,21,62,26,63,35,64);
} // End of Procedure
