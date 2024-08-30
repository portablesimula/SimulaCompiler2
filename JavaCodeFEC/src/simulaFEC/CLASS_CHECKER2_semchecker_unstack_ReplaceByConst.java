// JavaLine 1 <== SourceLine 406
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:33 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER2_semchecker_unstack_ReplaceByConst extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=406, lastLine=418, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_val;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 409
    public int i=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_CHECKER2_semchecker_unstack_ReplaceByConst setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_val=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_CHECKER2_semchecker_unstack_ReplaceByConst(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_CHECKER2_semchecker_unstack_ReplaceByConst(RTS_RTObject _SL,int sp_val) {
        super(_SL);
        // Parameter assignment to locals
        this.p_val = sp_val;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER2_semchecker_unstack_ReplaceByConst _STM() {
        // JavaLine 41 <== SourceLine 411
        RTS_TXT.putint(((CLASS_CHECKER2)(_CUR._SL._SL._SL)).leftintbuf,p_val);
        ;
        // JavaLine 44 <== SourceLine 412
        i=11;
        ;
        while((RTS_ENVIRONMENT.loadChar(((CLASS_CHECKER2)(_CUR._SL._SL._SL)).leftintbuf,i)!=(((char)32)))) {
            i=(i-(1));
        }
        ;
        // JavaLine 51 <== SourceLine 413
        ((CLASS_CHECKER2)(_CUR._SL._SL._SL)).simsymbol=RTS_TXT.sub(((CLASS_CHECKER2)(_CUR._SL._SL._SL)).leftintbuf,(i+(2)),(11-(i)));
        ;
        new CLASS_COMMON_DEFCONST((_CUR._SL._SL._SL));
        ;
        // JavaLine 56 <== SourceLine 414
        ((CLASS_CHECKER2_semchecker)(_CUR._SL._SL)).exptop_2=new CLASS_CHECKER1_semchecker1_arithconst((_CUR._SL._SL),((CLASS_CHECKER2_semchecker_unstack)(_CUR._SL)).sos.p_pred,'[')._STM();
        ;
        // JavaLine 59 <== SourceLine 415
        ((CLASS_CHECKER1_semchecker1_arithconst)(((CLASS_CHECKER2_semchecker)(_CUR._SL._SL)).exptop_2)).ixhi_1=((CLASS_CHECKER2)(_CUR._SL._SL._SL)).hashhi;
        ;
        // JavaLine 62 <== SourceLine 416
        ((CLASS_CHECKER1_semchecker1_arithconst)(((CLASS_CHECKER2_semchecker)(_CUR._SL._SL)).exptop_2)).ixlo_1=((CLASS_CHECKER2)(_CUR._SL._SL._SL)).hashlo;
        ;
        // JavaLine 65 <== SourceLine 417
        ((CLASS_CHECKER2_semchecker)(_CUR._SL._SL)).exptop_2.type=((CLASS_CHECKER2_semchecker)(_CUR._SL._SL)).exptop_2.ctype=((char)4);
        ;
        ((CLASS_CHECKER2_semchecker)(_CUR._SL._SL)).exptop_2.cl=((char)1);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER2.sim","5 ReplaceByConst",1,406,11,409,41,411,44,412,51,413,56,414,59,415,62,416,65,417,72,418);
} // End of Procedure
