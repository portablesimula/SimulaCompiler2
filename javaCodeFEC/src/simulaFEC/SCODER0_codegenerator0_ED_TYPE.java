// JavaLine 1 <== SourceLine 288
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:37 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER0_codegenerator0_ED_TYPE extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=288, lastLine=307, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public int p_ttag;
    // Declare locals as attributes
    public RTS_TXT _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public SCODER0_codegenerator0_ED_TYPE setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_ttag=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public SCODER0_codegenerator0_ED_TYPE(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public SCODER0_codegenerator0_ED_TYPE(RTS_RTObject _SL,int sp_ttag) {
        super(_SL);
        // Parameter assignment to locals
        this.p_ttag = sp_ttag;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER0_codegenerator0_ED_TYPE _STM() {
        // JavaLine 42 <== SourceLine 290
        _RESULT=RTS_ENVIRONMENT.copy(copy(CONC(new RTS_TXT("TYPE\u005f"),RTS_ENVIRONMENT.edit(p_ttag))));
        ;
        // JavaLine 45 <== SourceLine 291
        if(_VALUE((p_ttag<=(RTS_ENVIRONMENT.rank(((char)15)))))) {
            // JavaLine 47 <== SourceLine 292
            if(p_ttag<0 || p_ttag>((char)15)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
            switch(p_ttag) { // BEGIN SWITCH STATEMENT
                case 14: 
                // JavaLine 51 <== SourceLine 293
                _RESULT=RTS_ENVIRONMENT.copy(copy(new RTS_TXT("notype")));
                break;
                case 4: 
                // JavaLine 55 <== SourceLine 294
                _RESULT=RTS_ENVIRONMENT.copy(copy(new RTS_TXT("integer")));
                break;
                case 3: 
                // JavaLine 59 <== SourceLine 295
                _RESULT=RTS_ENVIRONMENT.copy(copy(new RTS_TXT("short integer")));
                break;
                case 5: 
                // JavaLine 63 <== SourceLine 296
                _RESULT=RTS_ENVIRONMENT.copy(copy(new RTS_TXT("real")));
                break;
                case 6: 
                // JavaLine 67 <== SourceLine 297
                _RESULT=RTS_ENVIRONMENT.copy(copy(new RTS_TXT("long real")));
                break;
                case 1: 
                // JavaLine 71 <== SourceLine 298
                _RESULT=RTS_ENVIRONMENT.copy(copy(new RTS_TXT("boolean")));
                break;
                case 2: 
                // JavaLine 75 <== SourceLine 299
                _RESULT=RTS_ENVIRONMENT.copy(copy(new RTS_TXT("character")));
                break;
                case 11: 
                // JavaLine 79 <== SourceLine 300
                _RESULT=RTS_ENVIRONMENT.copy(copy(new RTS_TXT("label (switch)")));
                break;
                case 8: 
                // JavaLine 83 <== SourceLine 301
                _RESULT=RTS_ENVIRONMENT.copy(copy(new RTS_TXT("text")));
                break;
                case 7: 
                // JavaLine 87 <== SourceLine 302
                _RESULT=RTS_ENVIRONMENT.copy(copy(new RTS_TXT("ref")));
                break;
                case 9: 
                // JavaLine 91 <== SourceLine 303
                _RESULT=RTS_ENVIRONMENT.copy(copy(new RTS_TXT("pointer to record")));
                break;
                case 15: 
                // JavaLine 95 <== SourceLine 304
                _RESULT=RTS_ENVIRONMENT.copy(copy(new RTS_TXT("universal")));
                break;
                default:
                // JavaLine 99 <== SourceLine 305
                _RESULT=RTS_ENVIRONMENT.copy(copy(new RTS_TXT("unknown")));
                break;
            } // END SWITCH STATEMENT
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER0.sim","5 ED_TYPE",1,288,42,290,45,291,47,292,51,293,55,294,59,295,63,296,67,297,71,298,75,299,79,300,83,301,87,302,91,303,95,304,99,305,107,307);
} // End of Procedure
