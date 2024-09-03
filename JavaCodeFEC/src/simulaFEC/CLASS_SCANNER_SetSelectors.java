// JavaLine 1 <== SourceLine 469
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCANNER_SetSelectors extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=469, lastLine=478, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_t;
    public int p_val;
    // Declare locals as attributes
    // JavaLine 12 <== SourceLine 470
    public int i=0;
    public boolean b=false;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCANNER_SetSelectors setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_t=(RTS_TXT)objectValue(param); break;
                case 1: p_val=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_SCANNER_SetSelectors(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public CLASS_SCANNER_SetSelectors(RTS_RTObject _SL,RTS_TXT sp_t,int sp_val) {
        super(_SL);
        // Parameter assignment to locals
        this.p_t = sp_t;
        this.p_val = sp_val;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCANNER_SetSelectors _STM() {
        // JavaLine 45 <== SourceLine 471
        if(_VALUE((p_val==(0)))) {
            for(i=47;i<=127;i++) {
                // JavaLine 48 <== SourceLine 472
                ((CLASS_SCANNER)(_CUR._SL)).selector.putELEMENT(((CLASS_SCANNER)(_CUR._SL)).selector.index(i),false);
            }
        }
        ;
        // JavaLine 53 <== SourceLine 473
        b=(p_val!=(2));
        ;
        RTS_TXT.setpos(p_t,1);
        ;
        // JavaLine 58 <== SourceLine 474
        while(RTS_TXT.more(p_t)) {
            {
                // JavaLine 61 <== SourceLine 475
                i=RTS_ENVIRONMENT.rank(RTS_TXT.getchar(p_t));
                ;
                if(_VALUE((i>(127)))) {
                    i=(i-(128));
                }
                ;
                // JavaLine 68 <== SourceLine 476
                if(_VALUE((i>(47)))) {
                    ((CLASS_SCANNER)(_CUR._SL)).selector.putELEMENT(((CLASS_SCANNER)(_CUR._SL)).selector.index(i),b);
                }
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCANNER.sim","5 SetSelectors",1,469,12,470,45,471,48,472,53,473,58,474,61,475,68,476,78,478);
} // End of Procedure
