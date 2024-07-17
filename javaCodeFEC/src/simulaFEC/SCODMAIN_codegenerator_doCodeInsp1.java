// JavaLine 1 <== SourceLine 942
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:53 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODMAIN_codegenerator_doCodeInsp1 extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=942, lastLine=962, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public boolean p_implNone;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public SCODMAIN_codegenerator_doCodeInsp1 setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_implNone=(boolean)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public SCODMAIN_codegenerator_doCodeInsp1(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public SCODMAIN_codegenerator_doCodeInsp1(RTS_RTObject _SL,boolean sp_implNone) {
        super(_SL);
        // Parameter assignment to locals
        this.p_implNone = sp_implNone;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODMAIN_codegenerator_doCodeInsp1 _STM() {
        // JavaLine 39 <== SourceLine 944
        if(_VALUE(p_implNone)) {
            {
                // JavaLine 42 <== SourceLine 945
                new SCODER0_codegenerator0_getnewindex((_CUR._SL));
                ;
                ((SCODMAIN_codegenerator)(_CUR._SL)).fdi_12=((SCODMAIN_codegenerator)(_CUR._SL)).curindex_5;
                ;
                // JavaLine 47 <== SourceLine 946
                ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT("S"),new RTS_TXT("Q")),new RTS_TXT("\u0019")),new RTS_TXT("\u005b")),new RTS_TXT("y")));
                ;
                // JavaLine 50 <== SourceLine 948
                ((SCODMAIN_codegenerator)(_CUR._SL)).outbyte(((SCODMAIN_codegenerator)(_CUR._SL)).fdi_12);
                ;
            }
        } else {
            // JavaLine 55 <== SourceLine 950
            {
                ((SCODMAIN_codegenerator)(_CUR._SL)).fdi_12=0;
                ;
                p_implNone=true;
            }
        }
        ;
        // JavaLine 63 <== SourceLine 952
        new SCODER1_codegenerator1_pushjump((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).fdi_12);
        ;
        // JavaLine 66 <== SourceLine 953
        new SCODER1_codegenerator1_pushjump((_CUR._SL),0);
        ;
        new SCODER1_codegenerator1_pushjump((_CUR._SL),0);
        ;
        // JavaLine 71 <== SourceLine 955
        new SCODER1_codegenerator1_pushtag((_CUR._SL));
        ;
        ((SCODMAIN_codegenerator)(_CUR._SL)).tagstacktop_6=new SCODER1_codegenerator1_conpointtag((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).opq_3.descr_1)._RESULT;
        ;
        // JavaLine 76 <== SourceLine 956
        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0094"),new RTS_TXT("\u00009")),new RTS_TXT("K")));
        ;
        // JavaLine 79 <== SourceLine 957
        new SCODER0_codegenerator0_outtag((_CUR._SL),((SCODMAIN_codegenerator)(_CUR._SL)).tagstacktop_6);
        ;
        // JavaLine 82 <== SourceLine 958
        ((SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u0087"),new RTS_TXT("T")));
        ;
        // JavaLine 85 <== SourceLine 959
        ((SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((SCODMAIN_codegenerator)(_CUR._SL)).asd_4-(1));
        ;
        // JavaLine 88 <== SourceLine 961
        new SCODER2_codegenerator2_outdescriptors((_CUR._SL),((SCODMAIN)(_CUR._SL._SL)).display.getELEMENT(RTS_ENVIRONMENT.rank(((SCODMAIN)(_CUR._SL._SL)).cblev_6)).declquant);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODMAIN.sim","5 doCodeInsp1",1,942,39,944,42,945,47,946,50,948,55,950,63,952,66,953,71,955,76,956,79,957,82,958,85,959,88,961,93,962);
} // End of Procedure
