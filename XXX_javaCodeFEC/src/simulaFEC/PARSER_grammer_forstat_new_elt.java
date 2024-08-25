// JavaLine 1 <== SourceLine 1499
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_forstat_new_elt extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1499, lastLine=1503, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public char p_opn;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 1501
    public PARSER_codebuffer _inspect_1501_4501=null;
    public PARSER_codebuffer_elt _inspect_1501_4502=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public PARSER_grammer_forstat_new_elt setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_opn=(char)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public PARSER_grammer_forstat_new_elt(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public PARSER_grammer_forstat_new_elt(RTS_RTObject _SL,char sp_opn) {
        super(_SL);
        // Parameter assignment to locals
        this.p_opn = sp_opn;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_forstat_new_elt _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_1501_4501=((PARSER_grammer_forstat)(_CUR._SL)).forcoder_1;
            if(_inspect_1501_4501!=null) { // INSPECT _inspect_1501_4501
                {
                    {
                        // BEGIN INSPECTION 
                        _inspect_1501_4502=new PARSER_codebuffer_elt(_inspect_1501_4501)._STM();
                        if(_inspect_1501_4502!=null) { // INSPECT _inspect_1501_4502
                            {
                                {
                                    _inspect_1501_4502.opnn=p_opn;
                                    ;
                                    // JavaLine 55 <== SourceLine 1502
                                    _inspect_1501_4502.next=_inspect_1501_4501.curelt_4.next;
                                    ;
                                    _inspect_1501_4501.curelt_4=_inspect_1501_4501.curelt_4.next=((PARSER_codebuffer_elt)_inspect_1501_4502);
                                    ;
                                }
                            }
                        }
                    } // END INSPECTION
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 new_elt",1,1499,11,1501,55,1502,69,1503);
} // End of Procedure
