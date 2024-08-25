// JavaLine 1 <== SourceLine 148
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER2_normalattrfile_expxerr extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=148, lastLine=151, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public char p_ch;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public BUILDER2_normalattrfile_expxerr setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_ch=(char)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public BUILDER2_normalattrfile_expxerr(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public BUILDER2_normalattrfile_expxerr(RTS_RTObject _SL,char sp_ch) {
        super(_SL);
        // Parameter assignment to locals
        this.p_ch = sp_ch;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER2_normalattrfile_expxerr _STM() {
        // JavaLine 39 <== SourceLine 149
        ((BUILDER2)(_CUR._SL._SL)).diag.putELEMENT(((BUILDER2)(_CUR._SL._SL)).diag.index(0),RTS_ENVIRONMENT.blanks(1));
        ;
        RTS_TXT.putchar(((BUILDER2)(_CUR._SL._SL)).diag.getELEMENT(0),p_ch);
        ;
        // JavaLine 44 <== SourceLine 150
        ((BUILDER2)(_CUR._SL._SL)).diag.putELEMENT(((BUILDER2)(_CUR._SL._SL)).diag.index(1),((BUILDER2_normalattrfile)(_CUR._SL)).CURF.filename());
        ;
        new ERRMSG_fatal0((_CUR._SL._SL),428);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER2.sim","5 expxerr",1,148,39,149,44,150,51,151);
} // End of Procedure
