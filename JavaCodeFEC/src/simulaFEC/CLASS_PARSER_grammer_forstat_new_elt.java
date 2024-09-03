// JavaLine 1 <== SourceLine 1500
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_forstat_new_elt extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1500, lastLine=1504, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public char p_opn;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 1502
    public CLASS_PARSER_codebuffer _inspect_1502_4501=null;
    public CLASS_PARSER_codebuffer_elt _inspect_1502_4502=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_PARSER_grammer_forstat_new_elt setPar(Object param) {
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
    public CLASS_PARSER_grammer_forstat_new_elt(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_PARSER_grammer_forstat_new_elt(RTS_RTObject _SL,char sp_opn) {
        super(_SL);
        // Parameter assignment to locals
        this.p_opn = sp_opn;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_forstat_new_elt _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_1502_4501=((CLASS_PARSER_grammer_forstat)(_CUR._SL)).forcoder_1;
            if(_inspect_1502_4501!=null) { // INSPECT _inspect_1502_4501  type=ref(CODEBUFFER)
                {
                    {
                        // BEGIN INSPECTION 
                        _inspect_1502_4502=new CLASS_PARSER_codebuffer_elt(_inspect_1502_4501)._STM();
                        if(_inspect_1502_4502!=null) { // INSPECT _inspect_1502_4502  type=ref(ELT)
                            {
                                {
                                    _inspect_1502_4502.opnn=p_opn;
                                    ;
                                    // JavaLine 55 <== SourceLine 1503
                                    _inspect_1502_4502.next=_inspect_1502_4501.curelt_4.next;
                                    ;
                                    _inspect_1502_4501.curelt_4=_inspect_1502_4501.curelt_4.next=((CLASS_PARSER_codebuffer_elt)_inspect_1502_4502);
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 new_elt",1,1500,11,1502,55,1503,69,1504);
} // End of Procedure
