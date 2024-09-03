// JavaLine 1 <== SourceLine 276
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_refrel_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=276, lastLine=306, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 279
    public CLASS_CHECKER1_semchecker1_exp _inspect_279_4555=null;
    // JavaLine 12 <== SourceLine 297
    public CLASS_CHECKER1_semchecker1_exp _inspect_297_4556=null;
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_refrel_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_refrel_emit _STM() {
        // JavaLine 25 <== SourceLine 278
        ((CLASS_CHECKER1_semchecker1_refrel)(_CUR._SL)).p1_right.cl=((char)1);
        ;
        // JavaLine 28 <== SourceLine 279
        {
            // BEGIN INSPECTION 
            _inspect_279_4555=((CLASS_CHECKER1_semchecker1_refrel)(_CUR._SL)).p1_left;
            if(_inspect_279_4555!=null) { // INSPECT _inspect_279_4555  type=ref(EXP)
                // JavaLine 33 <== SourceLine 280
                {
                    // JavaLine 35 <== SourceLine 279
                    {
                        // JavaLine 37 <== SourceLine 280
                        _inspect_279_4555.cl=((char)1);
                        ;
                        // JavaLine 40 <== SourceLine 281
                        if(_VALUE((((CLASS_CHECKER1_semchecker1_refrel)(_CUR._SL)).opttype_2==(((char)8))))) {
                            {
                                // JavaLine 43 <== SourceLine 283
                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=((CLASS_CHECKER1_semchecker1_refrel)(_CUR._SL)).p_ch;
                                ;
                                // JavaLine 46 <== SourceLine 284
                                _inspect_279_4555.emit_0().CPF();
                                ;
                                // JavaLine 49 <== SourceLine 286
                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=((char)148);
                                ;
                                call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,286);
                                ;
                                // JavaLine 54 <== SourceLine 287
                                ((CLASS_CHECKER1_semchecker1_refrel)(_CUR._SL)).p1_right.emit_0().CPF();
                                ;
                                // JavaLine 57 <== SourceLine 288
                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=((char)137);
                                ;
                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opihi_6=((CLASS_CHECKER1_semchecker1_refrel)(_CUR._SL)).p_ch;
                                ;
                            }
                        } else {
                            // JavaLine 64 <== SourceLine 290
                            {
                                // JavaLine 66 <== SourceLine 291
                                _inspect_279_4555.emit_0().CPF();
                                ;
                                // JavaLine 69 <== SourceLine 292
                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=((CLASS_CHECKER1_semchecker1_refrel)(_CUR._SL)).p_ch;
                                ;
                                // JavaLine 72 <== SourceLine 293
                                ((CLASS_CHECKER1_semchecker1_refrel)(_CUR._SL)).p1_right.emit_0().CPF();
                                ;
                                // JavaLine 75 <== SourceLine 294
                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=((CLASS_CHECKER1_semchecker1_refrel)(_CUR._SL)).p_ch;
                                ;
                            }
                        }
                        ;
                    }
                }
            }
            else { // OTHERWISE 
                // JavaLine 85 <== SourceLine 297
                {
                    // BEGIN INSPECTION 
                    _inspect_297_4556=((CLASS_CHECKER1_semchecker1_refrel)(_CUR._SL)).p1_right;
                    if(_inspect_297_4556!=null) { // INSPECT _inspect_297_4556  type=ref(EXP)
                        {
                            {
                                // JavaLine 92 <== SourceLine 298
                                if(_VALUE(((_inspect_297_4556.p_ch==('Z'))||((_inspect_297_4556.p_ch==(((char)129))))))) {
                                    // JavaLine 94 <== SourceLine 299
                                    _inspect_297_4556.cl=((char)6);
                                }
                                ;
                                // JavaLine 98 <== SourceLine 300
                                _inspect_297_4556.emit_0().CPF();
                                ;
                                // JavaLine 101 <== SourceLine 301
                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).optx=(((_inspect_297_4556.cl==(((char)6))))?(((char)1)):(((char)0)));
                                ;
                                // JavaLine 104 <== SourceLine 302
                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opc_6=((char)20);
                                ;
                                ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opihi_6=((CLASS_CHECKER1_semchecker1_refrel)(_CUR._SL)).p_ch;
                                ;
                            }
                        }
                    }
                } // END INSPECTION
            } // END OTHERWISE 
        } // END INSPECTION
        ;
        // JavaLine 116 <== SourceLine 305
        ((CLASS_CHECKER1)(_CUR._SL._SL._SL)).opilo_6=((CLASS_CHECKER1_semchecker1_refrel)(_CUR._SL)).cl;
        ;
        call(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).coder,305);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 emit",1,276,10,279,12,297,25,278,28,279,33,280,35,279,37,280,40,281,43,283,46,284,49,286,54,287,57,288,64,290,66,291,69,292,72,293,75,294,85,297,92,298,94,299,98,300,101,301,104,302,116,305,123,306);
} // End of Procedure
