// JavaLine 1 <== SourceLine 146
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:37 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER0_codegenerator0_checkequalandpop extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=146, lastLine=149, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public SCODER0_codegenerator0_checkequalandpop(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER0_codegenerator0_checkequalandpop _STM() {
        // JavaLine 21 <== SourceLine 147
        if(_VALUE((((SCODER0_codegenerator0)(_CUR._SL)).asd_4!=(((SCODER0_codegenerator0)(_CUR._SL)).asdstack.getELEMENT(((SCODER0_codegenerator0)(_CUR._SL)).curasd_4))))) {
            new BUILDER1_visiblegenerator_asderror((_CUR._SL),177);
        }
        ;
        // JavaLine 26 <== SourceLine 148
        ((SCODER0_codegenerator0)(_CUR._SL)).asd_4=((SCODER0_codegenerator0)(_CUR._SL)).asdstack.getELEMENT(((SCODER0_codegenerator0)(_CUR._SL)).curasd_4);
        ;
        ((SCODER0_codegenerator0)(_CUR._SL)).curasd_4=(((SCODER0_codegenerator0)(_CUR._SL)).curasd_4-(1));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER0.sim","5 checkequalandpop",1,146,21,147,26,148,33,149);
} // End of Procedure
