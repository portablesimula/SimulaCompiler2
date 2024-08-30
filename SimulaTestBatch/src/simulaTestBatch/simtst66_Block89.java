package simulaTestBatch;
// Simula-2.0 Compiled at Thu Aug 29 12:01:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst66_Block89 extends RTS_BASICIO {
    // SubBlock: Kind=4, BlockLevel=2, firstLine=88, lastLine=99, hasLocalClasses=false, System=false
    // Declare locals as attributes
    // JavaLine 8 <== SourceLine 89
    public int i=0;
    // Normal Constructor
    public simtst66_Block89(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 4 Statements
    @Override
    public RTS_RTObject _STM() {
        // JavaLine 19 <== SourceLine 90
        new SimulaTest_err((_CUR._SL),new RTS_TXT("Reading from file."));
        ;
        // JavaLine 22 <== SourceLine 91
        RTS_BASICIO.sysout().outtext(new RTS_TXT("            Lines read from file :"));
        ;
        // JavaLine 25 <== SourceLine 92
        RTS_BASICIO.sysout().outimage();
        ;
        RTS_BASICIO.sysout().outimage();
        ;
        // JavaLine 30 <== SourceLine 93
        for(boolean CB_93:new FOR_List(
        new FOR_StepUntil(new RTS_NAME<Number>(){ public Number put(Number x_){i=x_.intValue(); return(x_);};  public Number get(){return((Number)i); }	},new RTS_NAME<Number>() { public Number get(){return(1); }},new RTS_NAME<Number>() { public Number get(){return(1); }},new RTS_NAME<Number>() { public Number get(){return(((simtst66)(_CUR._SL)).fil1_1.lnr); }})
       ,new FOR_StepUntil(new RTS_NAME<Number>(){ public Number put(Number x_){i=x_.intValue(); return(x_);};  public Number get(){return((Number)i); }	},new RTS_NAME<Number>() { public Number get(){return((i+(1))); }},new RTS_NAME<Number>() { public Number get(){return(1); }},new RTS_NAME<Number>() { public Number get(){return(((simtst66)(_CUR._SL)).fil2_1.lnr); }})
           )) { if(!CB_93) continue;
            // JavaLine 35 <== SourceLine 94
            {
                // JavaLine 37 <== SourceLine 95
                RTS_BASICIO.sysout().outtext(new RTS_TXT(" 1 : "));
                ;
                RTS_BASICIO.sysout().outtext(((RTS_TEXT_ARRAY)((simtst66)(_CUR._SL)).fil1_1.linjer).getELEMENT(i));
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 44 <== SourceLine 96
                RTS_BASICIO.sysout().outtext(new RTS_TXT(" 2 : "));
                ;
                RTS_BASICIO.sysout().outtext(((RTS_TEXT_ARRAY)((simtst66)(_CUR._SL)).fil2_1.linjer).getELEMENT(i));
                ;
                RTS_BASICIO.sysout().outimage();
                ;
                // JavaLine 51 <== SourceLine 97
                RTS_BASICIO.sysout().outimage();
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of 4 Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("simtst66.sim","4 Block89",8,89,19,90,22,91,25,92,30,93,35,94,37,95,44,96,51,97,59,99);
} // End of SubBlock
