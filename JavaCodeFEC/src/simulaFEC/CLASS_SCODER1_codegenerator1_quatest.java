// JavaLine 1 <== SourceLine 564
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:52 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER1_codegenerator1_quatest extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=564, lastLine=593, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 568
    public int plv=0;
    // Normal Constructor
    public CLASS_SCODER1_codegenerator1_quatest(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER1_codegenerator1_quatest _STM() {
        // JavaLine 23 <== SourceLine 570
        plv=(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).opq_3.plev_1-(1));
        ;
        // JavaLine 26 <== SourceLine 571
        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("S"),new RTS_TXT("\u0096")),new RTS_TXT("\u0000\u0093")),new RTS_TXT("S")),new RTS_TXT("\u0096")),new RTS_TXT("\u0000\u005f")),new RTS_TXT("Q")),new RTS_TXT("\r")));
        ;
        // JavaLine 29 <== SourceLine 576
        new CLASS_SCODER0_codegenerator0_outsint((_CUR._SL),plv);
        ;
        // JavaLine 32 <== SourceLine 577
        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("="),new RTS_TXT("z")),new RTS_TXT("C")),new RTS_TXT("\u0003\u008f")),new RTS_TXT("F")),new RTS_TXT("\u0003\u0090")),new RTS_TXT("\u008c")));
        ;
        // JavaLine 35 <== SourceLine 580
        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outbyte((((CLASS_SCODER1_codegenerator1)(_CUR._SL)).asd_4+(1)));
        ;
        // JavaLine 38 <== SourceLine 581
        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(new RTS_TXT(">"),new RTS_TXT("K")),new RTS_TXT("\u0000d")),new RTS_TXT("Q")),new RTS_TXT("\r")));
        ;
        // JavaLine 41 <== SourceLine 584
        new CLASS_SCODER0_codegenerator0_outsint((_CUR._SL),plv);
        ;
        // JavaLine 44 <== SourceLine 585
        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(CONC(new RTS_TXT("\u0097"),new RTS_TXT("Q")),new RTS_TXT("\u0012")));
        ;
        // JavaLine 47 <== SourceLine 587
        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).opq_3.ftag_1+(1)));
        ;
        // JavaLine 50 <== SourceLine 588
        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("="),new RTS_TXT("y")),new RTS_TXT("C")),new RTS_TXT("\u0003\u008f")),new RTS_TXT("F")),new RTS_TXT("\u0003\u0090")),new RTS_TXT("\u008c")));
        ;
        // JavaLine 53 <== SourceLine 591
        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outbyte(((CLASS_SCODER1_codegenerator1)(_CUR._SL)).asd_4);
        ;
        // JavaLine 56 <== SourceLine 592
        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outbyte(62);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER1.sim","5 quatest",1,564,10,568,23,570,26,571,29,576,32,577,35,580,38,581,41,584,44,585,47,587,50,588,53,591,56,592,61,593);
} // End of Procedure
