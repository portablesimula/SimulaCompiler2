// JavaLine 1 <== SourceLine 85
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_codebuffer_terminate extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=85, lastLine=96, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 90
    public PARSER_codebuffer_elt _inspect_90_4497=null;
    // Normal Constructor
    public PARSER_codebuffer_terminate(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_codebuffer_terminate _STM() {
        // JavaLine 23 <== SourceLine 86
        ((PARSER)(_CUR._SL._SL)).coder=((PARSER_codebuffer)(_CUR._SL)).prev_4;
        ;
        ((PARSER_codebuffer)(_CUR._SL)).prev_4=null;
        ;
        // JavaLine 28 <== SourceLine 87
        ((PARSER_codebuffer)(_CUR._SL)).curelt_4=((PARSER_codebuffer)(_CUR._SL)).firstelt_4.next;
        ;
        ((PARSER_codebuffer)(_CUR._SL)).firstelt_4.next=null;
        ;
        // JavaLine 33 <== SourceLine 88
        while((((PARSER_codebuffer)(_CUR._SL)).curelt_4!=(null))) {
            // JavaLine 35 <== SourceLine 90
            {
                // BEGIN INSPECTION 
                _inspect_90_4497=((PARSER_codebuffer)(_CUR._SL)).curelt_4;
                if(_inspect_90_4497!=null) { // INSPECT _inspect_90_4497
                    // JavaLine 40 <== SourceLine 91
                    {
                        // JavaLine 42 <== SourceLine 90
                        {
                            // JavaLine 44 <== SourceLine 91
                            ((PARSER)(_CUR._SL._SL)).opdhi=_inspect_90_4497.opdhii;
                            ;
                            ((PARSER)(_CUR._SL._SL)).opdlo=_inspect_90_4497.opdloo;
                            ;
                            // JavaLine 49 <== SourceLine 92
                            ((PARSER)(_CUR._SL._SL)).optx=_inspect_90_4497.optxx;
                            ;
                            ((PARSER)(_CUR._SL._SL)).opn=_inspect_90_4497.opnn;
                            ;
                            call(((PARSER)(_CUR._SL._SL)).coder,92);
                            ;
                            // JavaLine 56 <== SourceLine 93
                            ((PARSER_codebuffer)(_CUR._SL)).curelt_4=_inspect_90_4497.next;
                            ;
                        }
                    }
                }
            } // END INSPECTION
        }
        ;
        // JavaLine 65 <== SourceLine 95
        ((PARSER_codebuffer)(_CUR._SL)).curelt_4=((PARSER_codebuffer)(_CUR._SL)).firstelt_4;
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 terminate",1,85,10,90,23,86,28,87,33,88,35,90,40,91,42,90,44,91,49,92,56,93,65,95,70,96);
} // End of Procedure
