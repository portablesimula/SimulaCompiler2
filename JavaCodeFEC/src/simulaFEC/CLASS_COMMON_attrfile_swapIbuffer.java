// JavaLine 1 <== SourceLine 1049
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:45 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_COMMON_attrfile_swapIbuffer extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1049, lastLine=1060, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 1050
    public int bufsize=0;
    // JavaLine 12 <== SourceLine 1054
    public RTS_Inbytefile _inspect_1054_4459=null;
    // Normal Constructor
    public CLASS_COMMON_attrfile_swapIbuffer(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_COMMON_attrfile_swapIbuffer _STM() {
        // JavaLine 25 <== SourceLine 1051
        ((CLASS_COMMON_attrfile)(_CUR._SL)).xidentstring=RTS_ENVIRONMENT.copy(copy(((CLASS_COMMON_attrfile)(_CUR._SL)).xidentstring));
        ;
        // JavaLine 28 <== SourceLine 1054
        {
            // BEGIN INSPECTION 
            _inspect_1054_4459=((CLASS_COMMON_attrfile)(_CUR._SL)).CURF;
            if(_inspect_1054_4459!=null) { // INSPECT _inspect_1054_4459  type=ref(INBYTEFILE)
                // JavaLine 33 <== SourceLine 1055
                {
                    // JavaLine 35 <== SourceLine 1054
                    {
                        // JavaLine 37 <== SourceLine 1055
                        if(_VALUE(_inspect_1054_4459.endfile())) {
                            {
                                // JavaLine 40 <== SourceLine 1056
                                ((CLASS_COMMON)(_CUR._SL._SL)).diag.putELEMENT(((CLASS_COMMON)(_CUR._SL._SL)).diag.index(0),_inspect_1054_4459.filename());
                                ;
                                ((CLASS_COMMON)(_CUR._SL._SL)).COMMONerror_0().CPF().setPar(307)._ENT();
                            }
                        }
                        ;
                        // JavaLine 47 <== SourceLine 1057
                        bufsize=new CLASS_COMMON_attrfile_nextNumber((_CUR._SL))._RESULT;
                        ;
                        // JavaLine 50 <== SourceLine 1058
                        _inspect_1054_4459.intext(RTS_TXT.sub(((CLASS_COMMON_attrfile)(_CUR._SL)).attrbuffer,1,bufsize));
                        ;
                        ((CLASS_COMMON_attrfile)(_CUR._SL)).p=0;
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","5 swapIbuffer",1,1049,10,1050,12,1054,25,1051,28,1054,33,1055,35,1054,37,1055,40,1056,47,1057,50,1058,62,1060);
} // End of Procedure
