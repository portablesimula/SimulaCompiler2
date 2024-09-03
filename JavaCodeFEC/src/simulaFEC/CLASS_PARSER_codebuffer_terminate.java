// JavaLine 1 <== SourceLine 86
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_codebuffer_terminate extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=86, lastLine=97, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 91
    public CLASS_PARSER_codebuffer_elt _inspect_91_4497=null;
    // Normal Constructor
    public CLASS_PARSER_codebuffer_terminate(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_codebuffer_terminate _STM() {
        // JavaLine 23 <== SourceLine 87
        ((CLASS_PARSER)(_CUR._SL._SL)).coder=((CLASS_PARSER_codebuffer)(_CUR._SL)).prev_4;
        ;
        ((CLASS_PARSER_codebuffer)(_CUR._SL)).prev_4=null;
        ;
        // JavaLine 28 <== SourceLine 88
        ((CLASS_PARSER_codebuffer)(_CUR._SL)).curelt_4=((CLASS_PARSER_codebuffer)(_CUR._SL)).firstelt_4.next;
        ;
        ((CLASS_PARSER_codebuffer)(_CUR._SL)).firstelt_4.next=null;
        ;
        // JavaLine 33 <== SourceLine 89
        while((((CLASS_PARSER_codebuffer)(_CUR._SL)).curelt_4!=(null))) {
            // JavaLine 35 <== SourceLine 91
            {
                // BEGIN INSPECTION 
                _inspect_91_4497=((CLASS_PARSER_codebuffer)(_CUR._SL)).curelt_4;
                if(_inspect_91_4497!=null) { // INSPECT _inspect_91_4497  type=ref(ELT)
                    // JavaLine 40 <== SourceLine 92
                    {
                        // JavaLine 42 <== SourceLine 91
                        {
                            // JavaLine 44 <== SourceLine 92
                            ((CLASS_PARSER)(_CUR._SL._SL)).opdhi=_inspect_91_4497.opdhii;
                            ;
                            ((CLASS_PARSER)(_CUR._SL._SL)).opdlo=_inspect_91_4497.opdloo;
                            ;
                            // JavaLine 49 <== SourceLine 93
                            ((CLASS_PARSER)(_CUR._SL._SL)).optx=_inspect_91_4497.optxx;
                            ;
                            ((CLASS_PARSER)(_CUR._SL._SL)).opn=_inspect_91_4497.opnn;
                            ;
                            call(((CLASS_PARSER)(_CUR._SL._SL)).coder,93);
                            ;
                            // JavaLine 56 <== SourceLine 94
                            ((CLASS_PARSER_codebuffer)(_CUR._SL)).curelt_4=_inspect_91_4497.next;
                            ;
                        }
                    }
                }
            } // END INSPECTION
        }
        ;
        // JavaLine 65 <== SourceLine 96
        ((CLASS_PARSER_codebuffer)(_CUR._SL)).curelt_4=((CLASS_PARSER_codebuffer)(_CUR._SL)).firstelt_4;
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 terminate",1,86,10,91,23,87,28,88,33,89,35,91,40,92,42,91,44,92,49,93,56,94,65,96,70,97);
} // End of Procedure
