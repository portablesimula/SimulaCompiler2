// JavaLine 1 <== SourceLine 703
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:45 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_COMMON_quantity_dump_outblno extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=703, lastLine=706, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_brecord p_brc;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_COMMON_quantity_dump_outblno setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_brc=(CLASS_COMMON_brecord)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_COMMON_quantity_dump_outblno(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_COMMON_quantity_dump_outblno(RTS_RTObject _SL,CLASS_COMMON_brecord sp_brc) {
        super(_SL);
        // Parameter assignment to locals
        this.p_brc = sp_brc;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_COMMON_quantity_dump_outblno _STM() {
        // JavaLine 39 <== SourceLine 704
        if(_VALUE((p_brc!=(null)))) {
            {
                RTS_BASICIO.sysout().outtext(new RTS_TXT("#"));
                ;
                // JavaLine 44 <== SourceLine 705
                new CLASS_COMMON_brecord_outblno(p_brc);
                ;
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","5 outblno",1,703,39,704,44,705,51,706);
} // End of Procedure
