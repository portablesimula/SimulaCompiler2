// JavaLine 1 <== SourceLine 245
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:33 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER0_codegenerator0_STRC2 extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=245, lastLine=253, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_m1;
    public int p_line;
    public RTS_TXT p_m2;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCODER0_codegenerator0_STRC2 setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 3: p_m1=(RTS_TXT)objectValue(param); break;
                case 2: p_line=intValue(param); break;
                case 1: p_m2=(RTS_TXT)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_SCODER0_codegenerator0_STRC2(RTS_RTObject _SL) {
        super(_SL,3); // Expecting 3 parameters
    }
    // Normal Constructor
    public CLASS_SCODER0_codegenerator0_STRC2(RTS_RTObject _SL,RTS_TXT sp_m1,int sp_line,RTS_TXT sp_m2) {
        super(_SL);
        // Parameter assignment to locals
        this.p_m1 = sp_m1;
        this.p_line = sp_line;
        this.p_m2 = sp_m2;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER0_codegenerator0_STRC2 _STM() {
        // JavaLine 45 <== SourceLine 247
        RTS_UTIL._ASGSTR(RTS_TXT.sub(RTS_BASICIO.sysout().image,1,8),"SCode: ");
        ;
        // JavaLine 48 <== SourceLine 248
        RTS_UTIL._ASGTXT(RTS_TXT.sub(RTS_BASICIO.sysout().image,8,51),CONC(CONC(CONC(p_m1,new RTS_TXT(".LINE ")),RTS_ENVIRONMENT.edit(p_line)),new RTS_TXT(": ")));
        ;
        // JavaLine 51 <== SourceLine 250
        RTS_UTIL._ASGTXT(RTS_TXT.sub(RTS_BASICIO.sysout().image,32,(RTS_TXT.length(RTS_BASICIO.sysout().image)-(33))),p_m2);
        ;
        // JavaLine 54 <== SourceLine 251
        RTS_BASICIO.sysout().outimage();
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER0.sim","5 STRC2",1,245,45,247,48,248,51,250,54,251,59,253);
} // End of Procedure
