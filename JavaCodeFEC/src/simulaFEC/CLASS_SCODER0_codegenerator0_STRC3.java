// JavaLine 1 <== SourceLine 229
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:52 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER0_codegenerator0_STRC3 extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=229, lastLine=243, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_m1;
    public int p_line;
    public RTS_TXT p_m2;
    public RTS_TXT p_m3;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCODER0_codegenerator0_STRC3 setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 4: p_m1=(RTS_TXT)objectValue(param); break;
                case 3: p_line=intValue(param); break;
                case 2: p_m2=(RTS_TXT)objectValue(param); break;
                case 1: p_m3=(RTS_TXT)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_SCODER0_codegenerator0_STRC3(RTS_RTObject _SL) {
        super(_SL,4); // Expecting 4 parameters
    }
    // Normal Constructor
    public CLASS_SCODER0_codegenerator0_STRC3(RTS_RTObject _SL,RTS_TXT sp_m1,int sp_line,RTS_TXT sp_m2,RTS_TXT sp_m3) {
        super(_SL);
        // Parameter assignment to locals
        this.p_m1 = sp_m1;
        this.p_line = sp_line;
        this.p_m2 = sp_m2;
        this.p_m3 = sp_m3;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER0_codegenerator0_STRC3 _STM() {
        // JavaLine 48 <== SourceLine 231
        if(_VALUE((RTS_TXT.length(RTS_BASICIO.sysout().image)<(300)))) {
            RTS_BASICIO.sysout().image=RTS_ENVIRONMENT.blanks(300);
        }
        ;
        // JavaLine 53 <== SourceLine 236
        RTS_UTIL._ASGSTR(RTS_TXT.sub(RTS_BASICIO.sysout().image,1,8),"SCode: ");
        ;
        // JavaLine 56 <== SourceLine 237
        RTS_UTIL._ASGTXT(RTS_TXT.sub(RTS_BASICIO.sysout().image,8,51),CONC(CONC(CONC(p_m1,new RTS_TXT(".LINE ")),RTS_ENVIRONMENT.edit(p_line)),new RTS_TXT(": ")));
        ;
        // JavaLine 59 <== SourceLine 239
        RTS_UTIL._ASGTXT(RTS_TXT.sub(RTS_BASICIO.sysout().image,32,(RTS_TXT.length(RTS_BASICIO.sysout().image)-(33))),p_m2);
        ;
        // JavaLine 62 <== SourceLine 240
        RTS_UTIL._ASGTXT(RTS_TXT.sub(RTS_BASICIO.sysout().image,45,(RTS_TXT.length(RTS_BASICIO.sysout().image)-(46))),p_m3);
        ;
        // JavaLine 65 <== SourceLine 241
        RTS_BASICIO.sysout().outimage();
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER0.sim","5 STRC3",1,229,48,231,53,236,56,237,59,239,62,240,65,241,70,243);
} // End of Procedure
