// JavaLine 1 <== SourceLine 387
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:47 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER4_codegenerator4_StartProcPar extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=387, lastLine=409, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 393
    public COMMON_quantity _inspect_393_4660=null;
    // Normal Constructor
    public SCODER4_codegenerator4_StartProcPar(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER4_codegenerator4_StartProcPar _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_393_4660=((SCODER4_codegenerator4)(_CUR._SL)).checker_5.actqty_2;
            if(_inspect_393_4660!=null) { // INSPECT _inspect_393_4660
                // JavaLine 27 <== SourceLine 394
                {
                    // JavaLine 29 <== SourceLine 393
                    {
                        // JavaLine 31 <== SourceLine 394
                        if(_VALUE(((!(_IS(((COMMON_quantity)_inspect_393_4660),COMMON_extquantity.class)))||((((COMMON_extquantity)(((COMMON_quantity)_inspect_393_4660))).clf_2==(((char)0))))))) {
                            // JavaLine 33 <== SourceLine 396
                            {
                                // JavaLine 35 <== SourceLine 397
                                new BUILDER1_newTags((_CUR._SL._SL),3);
                                ;
                                ((SCODER4_codegenerator4)(_CUR._SL)).Etag_10=((SCODER4)(_CUR._SL._SL)).lastusedtag_6;
                                ;
                                ((SCODER4_codegenerator4)(_CUR._SL)).Btag_10=(((SCODER4_codegenerator4)(_CUR._SL)).Etag_10-(1));
                                ;
                                ((SCODER4_codegenerator4)(_CUR._SL)).Ptag_10=(((SCODER4_codegenerator4)(_CUR._SL)).Btag_10-(1));
                                ;
                                // JavaLine 44 <== SourceLine 398
                                ((SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(new RTS_TXT(";"),new RTS_TXT("\u001e")));
                                ;
                                new SCODER0_codegenerator0_outtag((_CUR._SL),((SCODER4_codegenerator4)(_CUR._SL)).Ptag_10);
                                ;
                                // JavaLine 49 <== SourceLine 399
                                ((SCODER4_codegenerator4)(_CUR._SL)).outbyte(36);
                                ;
                                new SCODER0_codegenerator0_outtag((_CUR._SL),((SCODER4_codegenerator4)(_CUR._SL)).Etag_10);
                                ;
                                // JavaLine 54 <== SourceLine 400
                                ((SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(new RTS_TXT("%"),new RTS_TXT("'")));
                                ;
                                new SCODER0_codegenerator0_outtag((_CUR._SL),((SCODER4_codegenerator4)(_CUR._SL)).Btag_10);
                                ;
                                // JavaLine 59 <== SourceLine 401
                                new SCODER0_codegenerator0_outtag((_CUR._SL),((SCODER4_codegenerator4)(_CUR._SL)).Ptag_10);
                                ;
                                // JavaLine 62 <== SourceLine 402
                                ((SCODER4_codegenerator4)(_CUR._SL)).outbyte(148);
                                ;
                                new SCODER0_codegenerator0_outtag((_CUR._SL),((SCODER4_codegenerator4)(_CUR._SL)).Etag_10);
                                ;
                                // JavaLine 67 <== SourceLine 403
                                ((SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\u0094"),new RTS_TXT("\u00009")),new RTS_TXT("K")),new RTS_TXT("\u0000\u0099")),new RTS_TXT("\u0087")),new RTS_TXT("T")));
                                ;
                                // JavaLine 70 <== SourceLine 406
                                new SCODER0_codegenerator0_pushasd((_CUR._SL));
                                ;
                                ((SCODER4_codegenerator4)(_CUR._SL)).asd_4=0;
                                ;
                            }
                        } else {
                            // JavaLine 77 <== SourceLine 408
                            {
                                ((SCODER4_codegenerator4)(_CUR._SL)).Etag_10=0;
                                ;
                                ((SCODER4_codegenerator4)(_CUR._SL)).Btag_10=(_inspect_393_4660.ftag_1+(1));
                            }
                        }
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER4.sim","5 StartProcPar",1,387,10,393,27,394,29,393,31,394,33,396,35,397,44,398,49,399,54,400,59,401,62,402,67,403,70,406,77,408,91,409);
} // End of Procedure
