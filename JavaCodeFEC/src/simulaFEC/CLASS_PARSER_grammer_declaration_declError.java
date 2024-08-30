// JavaLine 1 <== SourceLine 784
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_declaration_declError extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=784, lastLine=785, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_i;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_PARSER_grammer_declaration_declError setPar(Object param) {
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
    public CLASS_PARSER_grammer_declaration_declError(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_PARSER_grammer_declaration_declError(RTS_RTObject _SL,int sp_i) {
        super(_SL);
        // Parameter assignment to locals
        this.p_i = sp_i;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_declaration_declError _STM() {
        // JavaLine 39 <== SourceLine 785
        ((CLASS_PARSER_grammer_declaration)(_CUR._SL)).errorno=1;
        ;
        new CLASS_PARSER_grammer_syntaxerror((_CUR._SL._SL),p_i);
        ;
        _GOTO(((CLASS_PARSER_grammer_declaration)(_CUR._SL))._LABEL_CLASS_PARSER_grammer_declaration_Block843_PARSE_0); // GOTO EVALUATED LABEL
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 declError",1,784,39,785,47,785);
} // End of Procedure
