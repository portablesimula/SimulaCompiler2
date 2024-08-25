// JavaLine 1 <== SourceLine 1073
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:42 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER2_codegenerator2_addrPARQNT extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1073, lastLine=1079, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public SCODER2_codegenerator2_addrPARQNT(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER2_codegenerator2_addrPARQNT _STM() {
        // JavaLine 21 <== SourceLine 1075
        new SCODER1_codegenerator1_staticencl((_CUR._SL));
        ;
        // JavaLine 24 <== SourceLine 1076
        new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),1076,new RTS_TXT("REMOTE"),new SCODER0_codegenerator0_ED_TAG((_CUR._SL),(((SCODER2_codegenerator2)(_CUR._SL)).opq_3.ftag_1+(0)))._RESULT);
        ;
        // JavaLine 27 <== SourceLine 1077
        ((SCODER2_codegenerator2)(_CUR._SL)).outbyte(75);
        ;
        // JavaLine 30 <== SourceLine 1078
        new SCODER0_codegenerator0_outtag((_CUR._SL),(((SCODER2_codegenerator2)(_CUR._SL)).opq_3.ftag_1+(0)));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER2.sim","5 addrPARQNT",1,1073,21,1075,24,1076,27,1077,30,1078,35,1079);
} // End of Procedure
