package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER2_semchecker_Block870_Block872_Block876_Block877 extends RTS_BASICIO {
    // SubBlock: Kind=4, BlockLevel=3, firstLine=877, lastLine=884, hasLocalClasses=false, System=false
    // Declare locals as attributes
    public CLASS_CHECKER1_semchecker1_exp expv=null;
    public int i=0;
    // Normal Constructor
    public CLASS_CHECKER2_semchecker_Block870_Block872_Block876_Block877(RTS_RTObject staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // 4 Statements
    @Override
    public RTS_RTObject _STM() {
        // JavaLine 19 <== SourceLine 878
        ((CLASS_CHECKER2_semchecker)(_CUR._SL))._inspect_875_4606.outtext(new RTS_TXT("  exp-stack:"));
        ;
        ((CLASS_CHECKER2_semchecker)(_CUR._SL))._inspect_875_4606.outimage();
        ;
        // JavaLine 24 <== SourceLine 879
        for(boolean CB_879:new FOR_List(
        new FOR_SingleElt<CLASS_CHECKER1_semchecker1_exp>(new RTS_NAME<CLASS_CHECKER1_semchecker1_exp>(){ public CLASS_CHECKER1_semchecker1_exp put(CLASS_CHECKER1_semchecker1_exp x_){expv=x_; return(x_);};  public CLASS_CHECKER1_semchecker1_exp get(){return((CLASS_CHECKER1_semchecker1_exp)expv); }	},new RTS_NAME<CLASS_CHECKER1_semchecker1_exp>() { public CLASS_CHECKER1_semchecker1_exp get(){return(((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2); }})
       ,new FOR_WhileElt<CLASS_CHECKER1_semchecker1_exp>(new RTS_NAME<CLASS_CHECKER1_semchecker1_exp>(){ public CLASS_CHECKER1_semchecker1_exp put(CLASS_CHECKER1_semchecker1_exp x_){expv=x_; return(x_);};  public CLASS_CHECKER1_semchecker1_exp get(){return((CLASS_CHECKER1_semchecker1_exp)expv); }	},new RTS_NAME<CLASS_CHECKER1_semchecker1_exp>() { public CLASS_CHECKER1_semchecker1_exp get(){return(expv.p_pred); }},new RTS_NAME<Boolean>() { public Boolean get(){return((expv!=(null))); }})
           )) { if(!CB_879) continue;
            // JavaLine 29 <== SourceLine 880
            expv.dump_0().CPF();
        }
        ;
        // JavaLine 33 <== SourceLine 881
        ((CLASS_CHECKER2_semchecker)(_CUR._SL))._inspect_875_4606.outtext(new RTS_TXT("operator-stack:"));
        ;
        ((CLASS_CHECKER2_semchecker)(_CUR._SL))._inspect_875_4606.outimage();
        ;
        for(i=((CLASS_CHECKER2_semchecker)(_CUR._SL)).opttop_2;i>=0;i--) {
            // JavaLine 39 <== SourceLine 882
            {
                // JavaLine 41 <== SourceLine 883
                ((CLASS_CHECKER2_semchecker)(_CUR._SL))._inspect_875_4606.outtext(((CLASS_CHECKER2)(_CUR._SL._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(((RTS_CHARACTER_ARRAY)((CLASS_CHECKER2_semchecker)(_CUR._SL)).ust_3.optstack).getELEMENT(i))));
                ;
                ((CLASS_CHECKER2_semchecker)(_CUR._SL))._inspect_875_4606.outimage();
            }
        }
        ;
        EBLK();
        return(this);
    } // End of 4 Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER2.sim","4 Block877",19,878,24,879,29,880,33,881,39,882,41,883,50,884);
} // End of SubBlock
