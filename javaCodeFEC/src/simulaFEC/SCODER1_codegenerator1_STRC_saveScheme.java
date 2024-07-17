// JavaLine 1 <== SourceLine 41
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:38 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER1_codegenerator1_STRC_saveScheme extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=41, lastLine=48, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public SCODER1_codegenerator1_STRC_saveScheme(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER1_codegenerator1_STRC_saveScheme _STM() {
        // JavaLine 21 <== SourceLine 42
        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),42,new RTS_TXT("-- BEGIN"),new RTS_TXT("SAVE SCHEME"));
        ;
        // JavaLine 24 <== SourceLine 43
        new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER1"),43,new RTS_TXT("PUSHLEN"));
        ;
        // JavaLine 27 <== SourceLine 44
        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),44,new RTS_TXT("ASSCALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u00050"))._RESULT);
        ;
        // JavaLine 30 <== SourceLine 45
        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),45,new RTS_TXT("CALL"),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u00051"))._RESULT);
        ;
        // JavaLine 33 <== SourceLine 46
        new SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER1"),46,new RTS_TXT("SAVE"));
        ;
        // JavaLine 36 <== SourceLine 47
        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER1"),47,new RTS_TXT("-- END"),new RTS_TXT("SAVE SCHEME"));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER1.sim","5 STRC_saveScheme",1,41,21,42,24,43,27,44,30,45,33,46,36,47,41,48);
} // End of Procedure
