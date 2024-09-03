// JavaLine 1 <== SourceLine 272
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:52 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER0_codegenerator0_ED_TAG extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=272, lastLine=274, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public int p_tag;
    // Declare locals as attributes
    public RTS_TXT _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCODER0_codegenerator0_ED_TAG setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_tag=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_SCODER0_codegenerator0_ED_TAG(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_SCODER0_codegenerator0_ED_TAG(RTS_RTObject _SL,int sp_tag) {
        super(_SL);
        // Parameter assignment to locals
        this.p_tag = sp_tag;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER0_codegenerator0_ED_TAG _STM() {
        // JavaLine 42 <== SourceLine 273
        _RESULT=RTS_ENVIRONMENT.copy(copy(CONC(CONC(CONC(new CLASS_COMMON_tagID((_CUR._SL._SL),p_tag)._RESULT,new RTS_TXT("\u005bT:")),RTS_ENVIRONMENT.edit(p_tag)),new RTS_TXT("\u005d"))));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER0.sim","5 ED_TAG",1,272,42,273,47,274);
} // End of Procedure
