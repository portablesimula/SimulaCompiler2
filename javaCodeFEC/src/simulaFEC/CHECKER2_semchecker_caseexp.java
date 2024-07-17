// JavaLine 1 <== SourceLine 278
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:35 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CHECKER2_semchecker_caseexp extends CHECKER1_semchecker1_exp {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=1, firstLine=278, lastLine=321, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    public int p1_lb;
    public int p1_ub;
    public char p1_casetype;
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 281
    public RTS_BOOLEAN_ARRAY seen=null;
    public RTS_PRCQNT emit_0() { return(new RTS_PRCQNT(this,CHECKER2_semchecker_caseexp_emit.class)); }
    // Normal Constructor
    public CHECKER2_semchecker_caseexp(RTS_RTObject staticLink,CHECKER1_semchecker1_exp sp_pred,char sp_ch,int sp1_lb,int sp1_ub,char sp1_casetype) {
        super(staticLink,sp_pred,sp_ch);
        // Parameter assignment to locals
        this.p1_lb = sp1_lb;
        this.p1_ub = sp1_ub;
        this.p1_casetype = sp1_casetype;
        // Declaration Code
        // JavaLine 24 <== SourceLine 281
        seen=new RTS_BOOLEAN_ARRAY(new RTS_BOUNDS(0,p1_ub-(p1_lb)));
    }
    // Class Statements
    @Override
    public CHECKER2_semchecker_caseexp _STM() {
        // JavaLine 30 <== SourceLine 169
        // BEGIN INNER PART
        // JavaLine 32 <== SourceLine 316
        if(_VALUE(((p1_ub-(p1_lb))>=(32768)))) {
            {
                // JavaLine 35 <== SourceLine 317
                new ERRMSG_error0((_CUR._SL._SL),440);
                ;
                p1_ub=(p1_lb+(32767));
                ;
                type=((char)15);
            }
        }
        ;
        // JavaLine 44 <== SourceLine 318
        ((CHECKER2)(_CUR._SL._SL)).curcase_6=new BUILDER1_casedescr((_CUR._SL._SL),((p1_ub-(p1_lb))+(1)),p1_lb,p1_ub,((CHECKER2)(_CUR._SL._SL)).curcase_6,p1_casetype)._STM();
        ;
        // JavaLine 47 <== SourceLine 319
        ((CHECKER2)(_CUR._SL._SL)).opc_6='W';
        ;
        call(((CHECKER2)(_CUR._SL._SL)).coder,319);
        ;
        // JavaLine 52 <== SourceLine 321
        // BEGIN INNER PART
        // ENDOF INNER PART
        // ENDOF INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER2.sim","8 caseexp",1,278,13,281,24,281,30,169,32,316,35,317,44,318,47,319,52,321,58,321);
} // End of Class
