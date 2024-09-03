// JavaLine 1 <== SourceLine 261
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:52 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER0_codegenerator0_GET_TAG extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=261, lastLine=266, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public RTS_TXT p_m;
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 262
    public int hi=0;
    public int lo=0;
    public int tag=0;
    // JavaLine 17 <== SourceLine 261
    public int _RESULT=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCODER0_codegenerator0_GET_TAG setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_m=(RTS_TXT)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_SCODER0_codegenerator0_GET_TAG(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_SCODER0_codegenerator0_GET_TAG(RTS_RTObject _SL,RTS_TXT sp_m) {
        super(_SL);
        // Parameter assignment to locals
        this.p_m = sp_m;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER0_codegenerator0_GET_TAG _STM() {
        // JavaLine 47 <== SourceLine 263
        RTS_TXT.setpos(p_m,1);
        ;
        // JavaLine 50 <== SourceLine 264
        hi=RTS_ENVIRONMENT.rank(RTS_TXT.getchar(p_m));
        ;
        lo=RTS_ENVIRONMENT.rank(RTS_TXT.getchar(p_m));
        ;
        // JavaLine 55 <== SourceLine 265
        _RESULT=((hi*(256))+(lo));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER0.sim","5 GET_TAG",1,261,13,262,17,261,47,263,50,264,55,265,60,266);
} // End of Procedure
