// JavaLine 1 <== SourceLine 36
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:47 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_ERRMSG_printDiag extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=36, lastLine=44, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_t;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 41
    public RTS_Printfile _inspect_41_4460=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_ERRMSG_printDiag setPar(Object param) {
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
    public CLASS_ERRMSG_printDiag(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_ERRMSG_printDiag(RTS_RTObject _SL,RTS_TXT sp_t) {
        super(_SL);
        // Parameter assignment to locals
        this.p_t = sp_t;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_ERRMSG_printDiag _STM() {
        // JavaLine 41 <== SourceLine 37
        if(_VALUE(RTS_UTIL.TRF_NE(p_t,null))) {
            {
                // JavaLine 44 <== SourceLine 38
                RTS_BASICIO.sysout().outimage();
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                RTS_BASICIO.sysout().outtext(new RTS_TXT("ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR "));
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 53 <== SourceLine 39
                RTS_BASICIO.sysout().outtext(p_t);
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 58 <== SourceLine 40
                RTS_BASICIO.sysout().outtext(new RTS_TXT("ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR "));
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 65 <== SourceLine 41
                if(_VALUE((((CLASS_ERRMSG)(_CUR._SL)).listfile!=(RTS_BASICIO.sysout())))) {
                    {
                        // BEGIN INSPECTION 
                        _inspect_41_4460=((CLASS_ERRMSG)(_CUR._SL)).listfile;
                        if(_inspect_41_4460!=null) { // INSPECT _inspect_41_4460  type=ref(PRINTFILE)
                            // JavaLine 71 <== SourceLine 42
                            {
                                // JavaLine 73 <== SourceLine 41
                                {
                                    // JavaLine 75 <== SourceLine 42
                                    _inspect_41_4460.outtext(p_t);
                                    ;
                                    _inspect_41_4460.outimage();
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_ERRMSG.sim","5 printDiag",1,36,11,41,41,37,44,38,53,39,58,40,65,41,71,42,73,41,75,42,90,44);
} // End of Procedure
