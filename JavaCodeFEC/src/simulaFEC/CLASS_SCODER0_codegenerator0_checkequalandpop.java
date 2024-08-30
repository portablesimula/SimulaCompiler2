// JavaLine 1 <== SourceLine 146
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:33 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER0_codegenerator0_checkequalandpop extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=146, lastLine=149, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_SCODER0_codegenerator0_checkequalandpop(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER0_codegenerator0_checkequalandpop _STM() {
        // JavaLine 21 <== SourceLine 147
        if(_VALUE((((CLASS_SCODER0_codegenerator0)(_CUR._SL)).asd_4!=(((CLASS_SCODER0_codegenerator0)(_CUR._SL)).asdstack.getELEMENT(((CLASS_SCODER0_codegenerator0)(_CUR._SL)).curasd_4))))) {
            new CLASS_BUILDER1_visiblegenerator_asderror((_CUR._SL),177);
        }
        ;
        // JavaLine 26 <== SourceLine 148
        ((CLASS_SCODER0_codegenerator0)(_CUR._SL)).asd_4=((CLASS_SCODER0_codegenerator0)(_CUR._SL)).asdstack.getELEMENT(((CLASS_SCODER0_codegenerator0)(_CUR._SL)).curasd_4);
        ;
        ((CLASS_SCODER0_codegenerator0)(_CUR._SL)).curasd_4=(((CLASS_SCODER0_codegenerator0)(_CUR._SL)).curasd_4-(1));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER0.sim","5 checkequalandpop",1,146,21,147,26,148,33,149);
} // End of Procedure
