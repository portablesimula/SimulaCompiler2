// JavaLine 1 <== SourceLine 29
package simulaTestBatch;
// Simula-2.0 Compiled at Fri Jun 28 10:20:09 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst105_P extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=29, lastLine=47, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p__case;
    public RTS_NAME<Double> p_F;
    public double p_val;
    public RTS_TXT p_facit;
    // Declare locals as attributes
    // JavaLine 14 <== SourceLine 31
    public int i=0;
    // JavaLine 16 <== SourceLine 32
    public double X=0.0d;
    public double Y=0.0d;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public simtst105_P setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 4: p__case=(RTS_TXT)objectValue(param); break;
                case 3: p_F=(RTS_NAME<Double>)param; break;
                case 2: p_val=doubleValue(param); break;
                case 1: p_facit=(RTS_TXT)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public simtst105_P(RTS_RTObject _SL) {
        super(_SL,4); // Expecting 4 parameters
    }
    // Normal Constructor
    public simtst105_P(RTS_RTObject _SL,RTS_TXT sp__case,RTS_NAME<Double> sp_F,double sp_val,RTS_TXT sp_facit) {
        super(_SL);
        // Parameter assignment to locals
        this.p__case = sp__case;
        this.p_F = sp_F;
        this.p_val = sp_val;
        this.p_facit = sp_facit;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public simtst105_P _STM() {
        // JavaLine 53 <== SourceLine 33
        X=((double)(i=(int)Math.round(Y=p_F.put(p_val))));
        ;
        // JavaLine 56 <== SourceLine 35
        ((simtst105)(_CUR._SL)).result_1=RTS_ENVIRONMENT.blanks(80);
        ;
        // JavaLine 59 <== SourceLine 36
        _ASGSTR(new simtst105_FIELD((_CUR._SL),2)._RESULT,"X=");
        ;
        RTS_TXT.putfix(new simtst105_FIELD((_CUR._SL),6)._RESULT,X,4);
        ;
        // JavaLine 64 <== SourceLine 37
        _ASGSTR(new simtst105_FIELD((_CUR._SL),4)._RESULT,", i=");
        ;
        RTS_TXT.putint(new simtst105_FIELD((_CUR._SL),1)._RESULT,i);
        ;
        // JavaLine 69 <== SourceLine 38
        _ASGSTR(new simtst105_FIELD((_CUR._SL),4)._RESULT,", Y=");
        ;
        RTS_TXT.putfix(new simtst105_FIELD((_CUR._SL),6)._RESULT,Y,4);
        ;
        // JavaLine 74 <== SourceLine 39
        _ASGSTR(new simtst105_FIELD((_CUR._SL),4)._RESULT,", F=");
        ;
        RTS_TXT.putfix(new simtst105_FIELD((_CUR._SL),6)._RESULT,p_F.get(),4);
        ;
        // JavaLine 79 <== SourceLine 40
        ((simtst105)(_CUR._SL)).result_1=RTS_TXT.strip(((simtst105)(_CUR._SL)).result_1);
        ;
        // JavaLine 82 <== SourceLine 41
        if(_VALUE((false|(_TXTREL_NE(((simtst105)(_CUR._SL)).result_1,p_facit))))) {
            {
                // JavaLine 85 <== SourceLine 42
                if(_VALUE(_TXTREL_NE(((simtst105)(_CUR._SL)).result_1,p_facit))) {
                    new SimulaTest_err((_CUR._SL),new RTS_TXT("Failed"));
                }
                ;
                // JavaLine 90 <== SourceLine 43
                RTS_BASICIO.sysout().outtext(CONC(CONC(CONC(new RTS_TXT("Test "),p__case),new RTS_TXT(": results: ")),((simtst105)(_CUR._SL)).result_1));
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 95 <== SourceLine 44
                RTS_BASICIO.sysout().outtext(CONC(new RTS_TXT("               facit: "),p_facit));
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                RTS_BASICIO.sysout().outimage();
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst105.sim","5 P",1,29,14,31,16,32,53,33,56,35,59,36,64,37,69,38,74,39,79,40,82,41,85,42,90,43,95,44,107,47);
} // End of Procedure
