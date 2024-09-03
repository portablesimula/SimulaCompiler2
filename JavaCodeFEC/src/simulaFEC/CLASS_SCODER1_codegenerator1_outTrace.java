// JavaLine 1 <== SourceLine 38
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:52 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER1_codegenerator1_outTrace extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=38, lastLine=39, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_t;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 39
    public RTS_Printfile _inspect_38_4624=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCODER1_codegenerator1_outTrace setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_t=(RTS_TXT)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_SCODER1_codegenerator1_outTrace(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_SCODER1_codegenerator1_outTrace(RTS_RTObject _SL,RTS_TXT sp_t) {
        super(_SL);
        // Parameter assignment to locals
        this.p_t = sp_t;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER1_codegenerator1_outTrace _STM() {
        // JavaLine 41 <== SourceLine 38
        {
            // BEGIN INSPECTION 
            _inspect_38_4624=RTS_BASICIO.sysout();
            if(_inspect_38_4624!=null) { // INSPECT _inspect_38_4624  type=ref(PRINTFILE)
                // JavaLine 46 <== SourceLine 39
                {
                    {
                        _inspect_38_4624.outint(((CLASS_SCODER1)(_CUR._SL._SL)).linenr,5);
                        ;
                        _inspect_38_4624.outtext(CONC(new RTS_TXT(":"),p_t));
                        ;
                        _inspect_38_4624.outimage();
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER1.sim","5 outTrace",1,38,11,39,41,38,46,39,60,39);
} // End of Procedure
