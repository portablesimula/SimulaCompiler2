// JavaLine 1 <== SourceLine 45
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:22 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class ERRMSG_printDiag extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=45, lastLine=53, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_t;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 50
    public RTS_Printfile _inspect_50_4460=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public ERRMSG_printDiag setPar(Object param) {
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
    public ERRMSG_printDiag(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public ERRMSG_printDiag(RTS_RTObject _SL,RTS_TXT sp_t) {
        super(_SL);
        // Parameter assignment to locals
        this.p_t = sp_t;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public ERRMSG_printDiag _STM() {
        // JavaLine 41 <== SourceLine 46
        if(_VALUE(TRF_NE(p_t,null))) {
            {
                // JavaLine 44 <== SourceLine 47
                RTS_BASICIO.sysout().outimage();
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                RTS_BASICIO.sysout().outtext(new RTS_TXT("ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR "));
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 53 <== SourceLine 48
                RTS_BASICIO.sysout().outtext(p_t);
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 58 <== SourceLine 49
                RTS_BASICIO.sysout().outtext(new RTS_TXT("ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR "));
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 65 <== SourceLine 50
                if(_VALUE((((ERRMSG)(_CUR._SL)).listfile!=(RTS_BASICIO.sysout())))) {
                    {
                        // BEGIN INSPECTION 
                        _inspect_50_4460=((ERRMSG)(_CUR._SL)).listfile;
                        if(_inspect_50_4460!=null) { // INSPECT _inspect_50_4460
                            // JavaLine 71 <== SourceLine 51
                            {
                                // JavaLine 73 <== SourceLine 50
                                {
                                    // JavaLine 75 <== SourceLine 51
                                    _inspect_50_4460.outtext(p_t);
                                    ;
                                    _inspect_50_4460.outimage();
                                    ;
                                }
                            }
                        }
                    } // END INSPECTION
                }
                ;
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("ERRMSG.sim","5 printDiag",1,45,11,50,41,46,44,47,53,48,58,49,65,50,71,51,73,50,75,51,90,53);
} // End of Procedure
