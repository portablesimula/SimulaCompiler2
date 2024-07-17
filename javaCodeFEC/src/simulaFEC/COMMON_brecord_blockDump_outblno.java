// JavaLine 1 <== SourceLine 450
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:19 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class COMMON_brecord_blockDump_outblno extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=450, lastLine=453, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public COMMON_brecord p_brc;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public COMMON_brecord_blockDump_outblno setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_brc=(COMMON_brecord)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public COMMON_brecord_blockDump_outblno(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public COMMON_brecord_blockDump_outblno(RTS_RTObject _SL,COMMON_brecord sp_brc) {
        super(_SL);
        // Parameter assignment to locals
        this.p_brc = sp_brc;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public COMMON_brecord_blockDump_outblno _STM() {
        // JavaLine 39 <== SourceLine 451
        if(_VALUE((p_brc!=(null)))) {
            {
                RTS_BASICIO.sysout().outtext(new RTS_TXT("#"));
                ;
                // JavaLine 44 <== SourceLine 452
                new COMMON_brecord_outblno(p_brc);
                ;
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","5 outblno",1,450,39,451,44,452,51,453);
} // End of Procedure
