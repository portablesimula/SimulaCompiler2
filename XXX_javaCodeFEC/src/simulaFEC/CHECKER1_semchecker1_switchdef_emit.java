// JavaLine 1 <== SourceLine 2543
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER1_semchecker1_switchdef_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=2543, lastLine=2557, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 2544
    public CHECKER1_semchecker1_switchelement swel=null;
    // Normal Constructor
    public CHECKER1_semchecker1_switchdef_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER1_semchecker1_switchdef_emit _STM() {
        // JavaLine 23 <== SourceLine 2545
        ((CHECKER1)(_CUR._SL._SL._SL)).opc_6='/';
        ;
        // JavaLine 26 <== SourceLine 2546
        ((CHECKER1)(_CUR._SL._SL._SL)).coder.opq_3=((((((CHECKER1_semchecker1_switchdef)(_CUR._SL)).sw_1.categ_1==(((char)6)))&&((((CHECKER1_semchecker1_switchdef)(_CUR._SL)).sw_1.match_1!=(null)))))?(((CHECKER1_semchecker1_switchdef)(_CUR._SL)).sw_1.match_1):(((CHECKER1_semchecker1_switchdef)(_CUR._SL)).sw_1));
        ;
        // JavaLine 29 <== SourceLine 2548
        ((CHECKER1)(_CUR._SL._SL._SL)).opilo_6=((((CHECKER1_semchecker1_switchdef)(_CUR._SL)).plain_1)?(((char)1)):(((char)2)));
        ;
        call(((CHECKER1)(_CUR._SL._SL._SL)).coder,2548);
        ;
        // JavaLine 34 <== SourceLine 2549
        swel=((CHECKER1_semchecker1_switchdef)(_CUR._SL)).elements_1;
        ;
        // JavaLine 37 <== SourceLine 2550
        while((swel!=(null))) {
            // JavaLine 39 <== SourceLine 2551
            {
                new CHECKER1_semchecker1_switchelement_emit(swel);
                ;
                // JavaLine 43 <== SourceLine 2552
                ((CHECKER1)(_CUR._SL._SL._SL)).notinconditional_6=true;
                ;
                // JavaLine 46 <== SourceLine 2553
                ((CHECKER1)(_CUR._SL._SL._SL)).opc_6=((char)144);
                ;
                // JavaLine 49 <== SourceLine 2554
                swel=swel.next;
                ;
            }
        }
        ;
        // JavaLine 55 <== SourceLine 2556
        ((CHECKER1)(_CUR._SL._SL._SL)).opc_6=((char)143);
        ;
        call(((CHECKER1)(_CUR._SL._SL._SL)).coder,2556);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","5 emit",1,2543,10,2544,23,2545,26,2546,29,2548,34,2549,37,2550,39,2551,43,2552,46,2553,49,2554,55,2556,62,2557);
} // End of Procedure
