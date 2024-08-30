// JavaLine 1 <== SourceLine 68
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_codebuffer_copyexpr extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=68, lastLine=71, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_PARSER_codebuffer_elt p_oldelt;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_PARSER_codebuffer_copyexpr setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_oldelt=(CLASS_PARSER_codebuffer_elt)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_PARSER_codebuffer_copyexpr(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_PARSER_codebuffer_copyexpr(RTS_RTObject _SL,CLASS_PARSER_codebuffer_elt sp_oldelt) {
        super(_SL);
        // Parameter assignment to locals
        this.p_oldelt = sp_oldelt;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_codebuffer_copyexpr _STM() {
        // JavaLine 39 <== SourceLine 69
        while((p_oldelt!=(null))) {
            {
                // JavaLine 42 <== SourceLine 70
                new CLASS_PARSER_codebuffer_elt_emit(p_oldelt);
                ;
                p_oldelt=p_oldelt.next;
                ;
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 copyexpr",1,68,39,69,42,70,51,71);
} // End of Procedure
