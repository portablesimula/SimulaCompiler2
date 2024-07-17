// JavaLine 1 <== SourceLine 649
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:53 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODMAIN_codegenerator_doCodeSINGLE_STRONG extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=649, lastLine=675, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public SCODMAIN_codegenerator_doCodeSINGLE_STRONG(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODMAIN_codegenerator_doCodeSINGLE_STRONG _STM() {
        // JavaLine 21 <== SourceLine 652
        ((SCODMAIN_codegenerator)(_CUR._SL)).curparno_6=(((SCODMAIN_codegenerator)(_CUR._SL)).curparno_6+(1));
        ;
        // JavaLine 24 <== SourceLine 653
        if(_VALUE((((SCODMAIN_codegenerator)(_CUR._SL)).opq_3!=(null)))) {
            {
                // JavaLine 27 <== SourceLine 654
                if(_VALUE((((SCODMAIN_codegenerator)(_CUR._SL)).curpar_6!=(null)))) {
                    new SCODER1_codegenerator1_termpar((_CUR._SL));
                }
                ;
                // JavaLine 32 <== SourceLine 655
                ((SCODMAIN_codegenerator)(_CUR._SL)).curpar_6=((SCODMAIN_codegenerator)(_CUR._SL)).opq_3;
                ;
                // JavaLine 35 <== SourceLine 656
                if(_VALUE((((((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.dim_1==(RTS_ENVIRONMENT.rank('L')))||((((SCODMAIN_codegenerator)(_CUR._SL)).curcall_6.dim_1==(RTS_ENVIRONMENT.rank('M')))))&&((((SCODMAIN_codegenerator)(_CUR._SL)).curpar_6.kind_1==(((char)1))))))) {
                    // JavaLine 37 <== SourceLine 660
                    new SCODER4_codegenerator4_StartProcPar((_CUR._SL));
                } else {
                    // JavaLine 40 <== SourceLine 661
                    if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).opc_6==('^')))) {
                        {
                            // JavaLine 43 <== SourceLine 662
                            if(_VALUE(((_IS(((SCODMAIN_codegenerator)(_CUR._SL)).curpar_6,COMMON_extquantity.class))?((((COMMON_extquantity)(((SCODMAIN_codegenerator)(_CUR._SL)).curpar_6)).clf_2==(((char)0)))):(true)))) {
                                // JavaLine 45 <== SourceLine 665
                                {
                                    // JavaLine 47 <== SourceLine 666
                                    new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),666,new RTS_TXT(""),new RTS_TXT("============================= new thunk"));
                                    ;
                                    // JavaLine 50 <== SourceLine 667
                                    new SCODER3_codegenerator3_thunk((_CUR._SL))._STM();
                                    ;
                                }
                            }
                            ;
                        }
                    }
                }
                ;
            }
        } else {
            // JavaLine 62 <== SourceLine 671
            if(_VALUE((((SCODMAIN)(_CUR._SL._SL)).opc_6==('^')))) {
                {
                    // JavaLine 65 <== SourceLine 672
                    new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),672,new RTS_TXT(""),new RTS_TXT("============================= new thunk"));
                    ;
                    // JavaLine 68 <== SourceLine 673
                    new SCODER3_codegenerator3_thunk((_CUR._SL))._STM();
                    ;
                }
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODMAIN.sim","5 doCodeSINGLE_STRONG",1,649,21,652,24,653,27,654,32,655,35,656,37,660,40,661,43,662,45,665,47,666,50,667,62,671,65,672,68,673,77,675);
} // End of Procedure
