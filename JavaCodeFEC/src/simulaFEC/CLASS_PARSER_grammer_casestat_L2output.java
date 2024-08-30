// JavaLine 1 <== SourceLine 1823
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_casestat_L2output extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1823, lastLine=1824, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public char p_code;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_PARSER_grammer_casestat_L2output setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_code=(char)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_PARSER_grammer_casestat_L2output(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_PARSER_grammer_casestat_L2output(RTS_RTObject _SL,char sp_code) {
        super(_SL);
        // Parameter assignment to locals
        this.p_code = sp_code;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_casestat_L2output _STM() {
        // JavaLine 39 <== SourceLine 1824
        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn='W';
        ;
        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opdlo=p_code;
        ;
        call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,1824);
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 L2output",1,1823,39,1824,47,1824);
} // End of Procedure
