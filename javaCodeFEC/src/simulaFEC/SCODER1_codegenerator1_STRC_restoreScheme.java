// JavaLine 1 <== SourceLine 55
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:38 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER1_codegenerator1_STRC_restoreScheme extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=55, lastLine=64, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public SCODER1_codegenerator1_STRC_restoreScheme(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER1_codegenerator1_STRC_restoreScheme _STM() {
        // JavaLine 21 <== SourceLine 56
        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),56,new RTS_TXT("-- BEGIN"),new RTS_TXT("RESTORE SCHEME"));
        ;
        // JavaLine 24 <== SourceLine 57
        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),57,new RTS_TXT("PRECALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u00054"))._RESULT);
        ;
        // JavaLine 27 <== SourceLine 58
        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),58,new RTS_TXT("CALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u00055"))._RESULT);
        ;
        // JavaLine 30 <== SourceLine 59
        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),59,new RTS_TXT("PUSH"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000Q"))._RESULT);
        ;
        // JavaLine 33 <== SourceLine 60
        new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER1"),60,new RTS_TXT("RESTORE"));
        ;
        // JavaLine 36 <== SourceLine 61
        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),61,new RTS_TXT("PRECALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u00056"))._RESULT);
        ;
        // JavaLine 39 <== SourceLine 62
        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),62,new RTS_TXT("CALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u00057"))._RESULT);
        ;
        // JavaLine 42 <== SourceLine 63
        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),63,new RTS_TXT("-- END"),new RTS_TXT("RESTORE SCHEME"));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER1.sim","5 STRC_restoreScheme",1,55,21,56,24,57,27,58,30,59,33,60,36,61,39,62,42,63,47,64);
} // End of Procedure
