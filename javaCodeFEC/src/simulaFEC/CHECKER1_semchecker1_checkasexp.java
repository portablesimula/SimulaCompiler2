// JavaLine 1 <== SourceLine 1263
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER1_semchecker1_checkasexp extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1263, lastLine=1277, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CHECKER1_semchecker1_identifier p_id;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CHECKER1_semchecker1_checkasexp setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_id=(CHECKER1_semchecker1_identifier)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CHECKER1_semchecker1_checkasexp(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CHECKER1_semchecker1_checkasexp(RTS_RTObject _SL,CHECKER1_semchecker1_identifier sp_id) {
        super(_SL);
        // Parameter assignment to locals
        this.p_id = sp_id;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER1_semchecker1_checkasexp _STM() {
        // JavaLine 39 <== SourceLine 1270
        if(p_id.kind<((char)0) || p_id.kind>((char)13)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
        switch(p_id.kind) { // BEGIN SWITCH STATEMENT
            case 1: 
            case 5: 
            // JavaLine 44 <== SourceLine 1272
            if(_VALUE((p_id.meaning.descr_1!=(null)))) {
                {
                    // JavaLine 47 <== SourceLine 1273
                    if(_VALUE((p_id.meaning.descr_1.npar>(0)))) {
                        new CHECKER1_semchecker1_identifier_identError(p_id,352);
                    }
                }
            }
            break;
            case 2: 
            case 6: 
            case 4: 
            // JavaLine 57 <== SourceLine 1274
            new CHECKER1_semchecker1_identifier_identError(p_id,353);
            break;
        } // END SWITCH STATEMENT
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","5 checkasexp",1,1263,39,1270,44,1272,47,1273,57,1274,64,1277);
} // End of Procedure
