// JavaLine 1 <== SourceLine 3
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_BUILDER1 extends CLASS_PAS1INIT {
    // ClassDeclaration: Kind=9, BlockLevel=1, PrefixLevel=6, firstLine=3, lastLine=802, hasLocalClasses=true, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 43
    public boolean BoundCheck_6=false;
    public boolean NoneCheck_6=false;
    public boolean QuaCheck_6=false;
    public boolean ReuseProc_6=false;
    // JavaLine 15 <== SourceLine 44
    public boolean ingotostmt_6=false;
    // JavaLine 17 <== SourceLine 45
    public boolean inswitchdecl_6=false;
    // JavaLine 19 <== SourceLine 46
    public boolean generalgoto_6=false;
    // JavaLine 21 <== SourceLine 47
    public boolean notinconditional_6=false;
    // JavaLine 23 <== SourceLine 51
    public char opc_6=0;
    // JavaLine 25 <== SourceLine 52
    public char cblev_6=0;
    // JavaLine 27 <== SourceLine 53
    public char crtblev_6=0;
    // JavaLine 29 <== SourceLine 55
    public char qblev_6=0;
    // JavaLine 31 <== SourceLine 56
    public char stepfasthi_6=0;
    public char stepfastlo_6=0;
    public char opihi_6=0;
    public char opilo_6=0;
    // JavaLine 36 <== SourceLine 59
    public int ssnuma_6=0;
    // JavaLine 38 <== SourceLine 60
    public int lastusedtag_6=0;
    // JavaLine 40 <== SourceLine 61
    public int noofextmodules_6=0;
    // JavaLine 42 <== SourceLine 63
    public CLASS_BUILDER1_extmodule firstextmodule_6=null;
    // JavaLine 44 <== SourceLine 64
    public CLASS_BUILDER1_casedescr curcase_6=null;
    // JavaLine 46 <== SourceLine 313
    public CLASS_BUILDER1_precheck0 checker0_6=null;
    // JavaLine 48 <== SourceLine 728
    public int nextexttag_6=0;
    // Normal Constructor
    public CLASS_BUILDER1(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_BUILDER1 _STM() {
        // JavaLine 59 <== SourceLine 1323
        // BEGIN CLASS_COMMON INNER PART
        // JavaLine 61 <== SourceLine 993
        // BEGIN CLASS_ERRMSG INNER PART
        // JavaLine 63 <== SourceLine 2395
        // BEGIN CLASS_SCANNER INNER PART
        // JavaLine 65 <== SourceLine 89
        // BEGIN CLASS_SCANINP INNER PART
        // JavaLine 67 <== SourceLine 2698
        // BEGIN CLASS_PARSER INNER PART
        // JavaLine 69 <== SourceLine 262
        new CLASS_PAS1INIT_main_statements_of_PAS1INIT((_CUR));
        ;
        // JavaLine 72 <== SourceLine 265
        // BEGIN CLASS_PAS1INIT INNER PART
        // JavaLine 74 <== SourceLine 802
        // BEGIN CLASS_BUILDER1 INNER PART
        // ENDOF CLASS_BUILDER1 INNER PART
        // ENDOF CLASS_PAS1INIT INNER PART
        // ENDOF CLASS_PARSER INNER PART
        // ENDOF CLASS_SCANINP INNER PART
        // ENDOF CLASS_SCANNER INNER PART
        // ENDOF CLASS_ERRMSG INNER PART
        // ENDOF CLASS_COMMON INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER1.sim","9 CLASS_BUILDER1",1,3,10,43,15,44,17,45,19,46,21,47,23,51,25,52,27,53,29,55,31,56,36,59,38,60,40,61,42,63,44,64,46,313,48,728,59,1323,61,993,63,2395,65,89,67,2698,69,262,72,265,74,802,85,802);
} // End of Class
