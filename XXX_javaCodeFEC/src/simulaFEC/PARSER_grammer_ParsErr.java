// JavaLine 1 <== SourceLine 265
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_ParsErr extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=265, lastLine=269, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_n;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public PARSER_grammer_ParsErr setPar(Object param) {
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
    public PARSER_grammer_ParsErr(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public PARSER_grammer_ParsErr(RTS_RTObject _SL,int sp_n) {
        super(_SL);
        // Parameter assignment to locals
        this.p_n = sp_n;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_ParsErr _STM() {
        // JavaLine 39 <== SourceLine 266
        if(_VALUE(((p_n!=(212))||((((PARSER)(_CUR._SL._SL)).numerrfound==(0)))))) {
            // JavaLine 41 <== SourceLine 267
            {
                // JavaLine 43 <== SourceLine 268
                new PARSER_grammer_setCurPos((_CUR._SL));
                ;
                new ERRMSG_outP1message((_CUR._SL._SL),((PARSER_grammer)(_CUR._SL)).currentPos_1,p_n,((char)2));
                ;
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 ParsErr",1,265,39,266,41,267,43,268,52,269);
} // End of Procedure
