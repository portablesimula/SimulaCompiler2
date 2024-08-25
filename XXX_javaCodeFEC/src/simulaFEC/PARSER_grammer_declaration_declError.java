// JavaLine 1 <== SourceLine 783
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_declaration_declError extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=783, lastLine=784, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_i;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public PARSER_grammer_declaration_declError setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_i=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public PARSER_grammer_declaration_declError(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public PARSER_grammer_declaration_declError(RTS_RTObject _SL,int sp_i) {
        super(_SL);
        // Parameter assignment to locals
        this.p_i = sp_i;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_declaration_declError _STM() {
        // JavaLine 39 <== SourceLine 784
        ((PARSER_grammer_declaration)(_CUR._SL)).errorno=1;
        ;
        new PARSER_grammer_syntaxerror((_CUR._SL._SL),p_i);
        ;
        _GOTO(((PARSER_grammer_declaration)(_CUR._SL))._LABEL_PARSER_grammer_declaration_Block842_PARSE_0); // GOTO EVALUATED LABEL
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 declError",1,783,39,784,47,784);
} // End of Procedure
