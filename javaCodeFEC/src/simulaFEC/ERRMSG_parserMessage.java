// JavaLine 1 <== SourceLine 204
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class ERRMSG_parserMessage extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=204, lastLine=207, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_errpos;
    public int p_n1;
    public int p_n2;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public ERRMSG_parserMessage setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 3: p_errpos=intValue(param); break;
                case 2: p_n1=intValue(param); break;
                case 1: p_n2=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public ERRMSG_parserMessage(RTS_RTObject _SL) {
        super(_SL,3); // Expecting 3 parameters
    }
    // Normal Constructor
    public ERRMSG_parserMessage(RTS_RTObject _SL,int sp_errpos,int sp_n1,int sp_n2) {
        super(_SL);
        // Parameter assignment to locals
        this.p_errpos = sp_errpos;
        this.p_n1 = sp_n1;
        this.p_n2 = sp_n2;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public ERRMSG_parserMessage _STM() {
        // JavaLine 45 <== SourceLine 205
        if(_VALUE((p_n2!=(0)))) {
            {
                // JavaLine 48 <== SourceLine 206
                ((ERRMSG)(_CUR._SL)).diag.putELEMENT(((ERRMSG)(_CUR._SL)).diag.index(0),new ERRMSG_errmsg((_CUR._SL),p_n2)._RESULT);
                ;
                ((ERRMSG)(_CUR._SL)).diag.putELEMENT(((ERRMSG)(_CUR._SL)).diag.index(0),CONC(new RTS_TXT(" - "),((ERRMSG)(_CUR._SL)).diag.getELEMENT(0)));
            }
        }
        ;
        // JavaLine 55 <== SourceLine 207
        new ERRMSG_outP1message((_CUR._SL),p_errpos,p_n1,((char)2));
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("ERRMSG.sim","5 parserMessage",1,204,45,205,48,206,55,207,59,207);
} // End of Procedure
