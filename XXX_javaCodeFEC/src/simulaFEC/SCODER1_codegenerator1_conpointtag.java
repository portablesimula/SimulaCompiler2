// JavaLine 1 <== SourceLine 782
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:38 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER1_codegenerator1_conpointtag extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=782, lastLine=803, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public COMMON_brecord p_brc;
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 790
    public COMMON_quantity q=null;
    // JavaLine 15 <== SourceLine 782
    public int _RESULT=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public SCODER1_codegenerator1_conpointtag setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_brc=(COMMON_brecord)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public SCODER1_codegenerator1_conpointtag(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public SCODER1_codegenerator1_conpointtag(RTS_RTObject _SL,COMMON_brecord sp_brc) {
        super(_SL);
        // Parameter assignment to locals
        this.p_brc = sp_brc;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER1_codegenerator1_conpointtag _STM() {
        // JavaLine 45 <== SourceLine 795
        q=((SCODER1)(_CUR._SL._SL)).display.getELEMENT((RTS_ENVIRONMENT.rank(p_brc.blev)-(p_brc.connests))).declquant;
        ;
        // JavaLine 48 <== SourceLine 797
        while((q.kind_1==(((char)11)))) {
            q=q.prefqual_1;
        }
        ;
        // JavaLine 53 <== SourceLine 800
        if(_VALUE((q.kind_1==(((char)1))))) {
            q=q.prefqual_1;
        }
        ;
        // JavaLine 58 <== SourceLine 801
        _RESULT=((new SCODER1_codegenerator1_firstcontag((_CUR._SL),q)._RESULT+(p_brc.connests))-(1));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER1.sim","5 conpointtag",1,782,13,790,15,782,45,795,48,797,53,800,58,801,63,803);
} // End of Procedure
