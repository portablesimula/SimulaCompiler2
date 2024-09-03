// JavaLine 1 <== SourceLine 840
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:45 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_COMMON_getBrc extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=840, lastLine=845, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public char p_blnohi;
    public char p_blnolo;
    // Declare locals as attributes
    public CLASS_COMMON_brecord _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_COMMON_getBrc setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_blnohi=(char)objectValue(param); break;
                case 1: p_blnolo=(char)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_COMMON_getBrc(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public CLASS_COMMON_getBrc(RTS_RTObject _SL,char sp_blnohi,char sp_blnolo) {
        super(_SL);
        // Parameter assignment to locals
        this.p_blnohi = sp_blnohi;
        this.p_blnolo = sp_blnolo;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_COMMON_getBrc _STM() {
        // JavaLine 45 <== SourceLine 844
        _RESULT=((RTS_REF_ARRAY<CLASS_COMMON_brecord>)((CLASS_COMMON)(_CUR._SL)).brctab.getELEMENT(RTS_ENVIRONMENT.rank(p_blnohi)).val).getELEMENT(RTS_ENVIRONMENT.rank(p_blnolo));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","5 getBrc",1,840,45,844,50,845);
} // End of Procedure
