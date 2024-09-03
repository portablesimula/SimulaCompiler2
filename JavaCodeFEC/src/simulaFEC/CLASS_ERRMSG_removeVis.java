// JavaLine 1 <== SourceLine 360
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:47 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_ERRMSG_removeVis extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=360, lastLine=370, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_brecord p_brc;
    public CLASS_COMMON_idpack p_visp;
    public int p_err;
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 363
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
        // JavaLine 48 <== SourceLine 364
        ((CLASS_ERRMSG)(_CUR._SL)).messageLinenr=p_visp.line;
        ;
        // JavaLine 51 <== SourceLine 365
        ((CLASS_ERRMSG)(_CUR._SL)).diag.putELEMENT(((CLASS_ERRMSG)(_CUR._SL)).diag.index(0),new CLASS_COMMON_boxof((_CUR._SL),p_visp.idhi,p_visp.idlo)._RESULT.symbol);
        ;
        new CLASS_ERRMSG_error0((_CUR._SL),(-(p_err)));
        ;
        // JavaLine 56 <== SourceLine 366
        cur=p_brc.hidlist;
        ;
        // JavaLine 59 <== SourceLine 367
        while((cur!=(p_visp))) {
            {
                prev=cur;
                ;
                cur=cur.next;
            }
        }
        ;
        // JavaLine 68 <== SourceLine 368
        if(_VALUE((prev==(null)))) {
            p_brc.hidlist=p_visp.next;
        } else {
            // JavaLine 72 <== SourceLine 369
            prev.next=p_visp.next;
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_ERRMSG.sim","5 removeVis",1,360,13,363,48,364,51,365,56,366,59,367,68,368,72,369,78,370);
} // End of Procedure
