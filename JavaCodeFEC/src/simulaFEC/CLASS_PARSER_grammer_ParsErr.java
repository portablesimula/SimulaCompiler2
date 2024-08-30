// JavaLine 1 <== SourceLine 266
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_ParsErr extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=266, lastLine=270, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_n;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_PARSER_grammer_ParsErr setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_n=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_PARSER_grammer_ParsErr(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_PARSER_grammer_ParsErr(RTS_RTObject _SL,int sp_n) {
        super(_SL);
        // Parameter assignment to locals
        this.p_n = sp_n;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_ParsErr _STM() {
        // JavaLine 39 <== SourceLine 267
        if(_VALUE(((p_n!=(212))||((((CLASS_PARSER)(_CUR._SL._SL)).numerrfound==(0)))))) {
            // JavaLine 41 <== SourceLine 268
            {
                // JavaLine 43 <== SourceLine 269
                new CLASS_PARSER_grammer_setCurPos((_CUR._SL));
                ;
                new CLASS_ERRMSG_outP1message((_CUR._SL._SL),((CLASS_PARSER_grammer)(_CUR._SL)).currentPos_1,p_n,((char)2));
                ;
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 ParsErr",1,266,39,267,41,268,43,269,52,270);
} // End of Procedure
