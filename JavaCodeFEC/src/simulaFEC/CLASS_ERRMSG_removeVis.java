// JavaLine 1 <== SourceLine 365
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_ERRMSG_removeVis extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=365, lastLine=375, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_brecord p_brc;
    public CLASS_COMMON_idpack p_visp;
    public int p_err;
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 368
    public CLASS_COMMON_idpack prev=null;
    public CLASS_COMMON_idpack cur=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_ERRMSG_removeVis setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 3: p_brc=(CLASS_COMMON_brecord)objectValue(param); break;
                case 2: p_visp=(CLASS_COMMON_idpack)objectValue(param); break;
                case 1: p_err=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_ERRMSG_removeVis(RTS_RTObject _SL) {
        super(_SL,3); // Expecting 3 parameters
    }
    // Normal Constructor
    public CLASS_ERRMSG_removeVis(RTS_RTObject _SL,CLASS_COMMON_brecord sp_brc,CLASS_COMMON_idpack sp_visp,int sp_err) {
        super(_SL);
        // Parameter assignment to locals
        this.p_brc = sp_brc;
        this.p_visp = sp_visp;
        this.p_err = sp_err;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_ERRMSG_removeVis _STM() {
        // JavaLine 48 <== SourceLine 369
        ((CLASS_ERRMSG)(_CUR._SL)).messageLinenr=p_visp.line;
        ;
        // JavaLine 51 <== SourceLine 370
        ((CLASS_ERRMSG)(_CUR._SL)).diag.putELEMENT(((CLASS_ERRMSG)(_CUR._SL)).diag.index(0),new CLASS_COMMON_boxof((_CUR._SL),p_visp.idhi,p_visp.idlo)._RESULT.symbol);
        ;
        new CLASS_ERRMSG_error0((_CUR._SL),(-(p_err)));
        ;
        // JavaLine 56 <== SourceLine 371
        cur=p_brc.hidlist;
        ;
        // JavaLine 59 <== SourceLine 372
        while((cur!=(p_visp))) {
            {
                prev=cur;
                ;
                cur=cur.next;
            }
        }
        ;
        // JavaLine 68 <== SourceLine 373
        if(_VALUE((prev==(null)))) {
            p_brc.hidlist=p_visp.next;
        } else {
            // JavaLine 72 <== SourceLine 374
            prev.next=p_visp.next;
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_ERRMSG.sim","5 removeVis",1,365,13,368,48,369,51,370,56,371,59,372,68,373,72,374,78,375);
} // End of Procedure
