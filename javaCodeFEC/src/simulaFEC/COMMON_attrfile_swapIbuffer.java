// JavaLine 1 <== SourceLine 1048
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:29 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class COMMON_attrfile_swapIbuffer extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1048, lastLine=1059, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 1049
    public int bufsize=0;
    // JavaLine 12 <== SourceLine 1053
    public RTS_Inbytefile _inspect_1053_4459=null;
    // Normal Constructor
    public COMMON_attrfile_swapIbuffer(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public COMMON_attrfile_swapIbuffer _STM() {
        // JavaLine 25 <== SourceLine 1050
        ((COMMON_attrfile)(_CUR._SL)).xidentstring=RTS_ENVIRONMENT.copy(copy(((COMMON_attrfile)(_CUR._SL)).xidentstring));
        ;
        // JavaLine 28 <== SourceLine 1053
        {
            // BEGIN INSPECTION 
            _inspect_1053_4459=((COMMON_attrfile)(_CUR._SL)).CURF;
            if(_inspect_1053_4459!=null) { // INSPECT _inspect_1053_4459
                // JavaLine 33 <== SourceLine 1054
                {
                    // JavaLine 35 <== SourceLine 1053
                    {
                        // JavaLine 37 <== SourceLine 1054
                        if(_VALUE(_inspect_1053_4459.endfile())) {
                            {
                                // JavaLine 40 <== SourceLine 1055
                                ((COMMON)(_CUR._SL._SL)).diag.putELEMENT(((COMMON)(_CUR._SL._SL)).diag.index(0),_inspect_1053_4459.filename());
                                ;
                                ((COMMON)(_CUR._SL._SL)).COMMONerror_0().CPF().setPar(307)._ENT();
                            }
                        }
                        ;
                        // JavaLine 47 <== SourceLine 1056
                        bufsize=new COMMON_attrfile_nextNumber((_CUR._SL))._RESULT;
                        ;
                        // JavaLine 50 <== SourceLine 1057
                        _inspect_1053_4459.intext(RTS_TXT.sub(((COMMON_attrfile)(_CUR._SL)).attrbuffer,1,bufsize));
                        ;
                        ((COMMON_attrfile)(_CUR._SL)).p=0;
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","5 swapIbuffer",1,1048,10,1049,12,1053,25,1050,28,1053,33,1054,35,1053,37,1054,40,1055,47,1056,50,1057,62,1059);
} // End of Procedure
