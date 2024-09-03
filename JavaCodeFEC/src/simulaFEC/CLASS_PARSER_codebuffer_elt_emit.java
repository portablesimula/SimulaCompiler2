// JavaLine 1 <== SourceLine 62
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_codebuffer_elt_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=62, lastLine=65, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_PARSER_codebuffer_elt_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_codebuffer_elt_emit _STM() {
        // JavaLine 21 <== SourceLine 63
        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opdhi=((CLASS_PARSER_codebuffer_elt)(_CUR._SL)).opdhii;
        ;
        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opdlo=((CLASS_PARSER_codebuffer_elt)(_CUR._SL)).opdloo;
        ;
        // JavaLine 26 <== SourceLine 64
        ((CLASS_PARSER)(_CUR._SL._SL._SL)).optx=((CLASS_PARSER_codebuffer_elt)(_CUR._SL)).optxx;
        ;
        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn=((CLASS_PARSER_codebuffer_elt)(_CUR._SL)).opnn;
        ;
        call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,64);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 emit",1,62,21,63,26,64,35,65);
} // End of Procedure
