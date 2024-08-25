// JavaLine 1 <== SourceLine 659
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER1_semchecker1_textconc_insert extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=659, lastLine=671, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 660
    public CHECKER1_semchecker1_exp op=null;
    // Normal Constructor
    public CHECKER1_semchecker1_textconc_insert(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER1_semchecker1_textconc_insert _STM() {
        op=((CHECKER1_semchecker1)(_CUR._SL._SL)).exptop_2;
        ;
        // JavaLine 25 <== SourceLine 661
        while((op.p_ch==('Q'))) {
            // JavaLine 27 <== SourceLine 662
            op=((CHECKER1_semchecker1_expinparantes)(op)).p1_right;
        }
        ;
        // JavaLine 31 <== SourceLine 663
        if(_VALUE((op.p_ch==('T')))) {
            {
                // JavaLine 34 <== SourceLine 664
                ((CHECKER1_semchecker1_textconc)(_CUR._SL)).ntext_1=(((CHECKER1_semchecker1_textconc)(_CUR._SL)).ntext_1+(((CHECKER1_semchecker1_textconc)(op)).ntext_1));
                ;
                // JavaLine 37 <== SourceLine 665
                ((CHECKER1_semchecker1_textconc)(_CUR._SL)).last_1.next=((CHECKER1_semchecker1_textconc)(op)).first_1;
                ;
                // JavaLine 40 <== SourceLine 666
                ((CHECKER1_semchecker1_textconc)(_CUR._SL)).last_1=((CHECKER1_semchecker1_textconc)(op)).last_1;
            }
        } else {
            // JavaLine 44 <== SourceLine 667
            {
                // JavaLine 46 <== SourceLine 668
                ((CHECKER1_semchecker1_textconc)(_CUR._SL)).ntext_1=(((CHECKER1_semchecker1_textconc)(_CUR._SL)).ntext_1+(1));
                ;
                // JavaLine 49 <== SourceLine 669
                ((CHECKER1_semchecker1_textconc)(_CUR._SL)).last_1=((CHECKER1_semchecker1_textconc)(_CUR._SL)).last_1.next=new CHECKER1_semchecker1_textoperand((_CUR._SL._SL),op)._STM();
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","5 insert",1,659,10,660,25,661,27,662,31,663,34,664,37,665,40,666,44,667,46,668,49,669,57,671);
} // End of Procedure
