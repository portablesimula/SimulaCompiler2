// JavaLine 1 <== SourceLine 56
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_ERRMSG_GiveMessage extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=56, lastLine=85, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public char p_ec;
    public int p_index;
    // Declare locals as attributes
    // JavaLine 12 <== SourceLine 57
    public int i=0;
    public RTS_TXT t=null;
    public RTS_TXT tout=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_ERRMSG_GiveMessage setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_ec=(char)objectValue(param); break;
                case 1: p_index=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_ERRMSG_GiveMessage(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public CLASS_ERRMSG_GiveMessage(RTS_RTObject _SL,char sp_ec,int sp_index) {
        super(_SL);
        // Parameter assignment to locals
        this.p_ec = sp_ec;
        this.p_index = sp_index;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_ERRMSG_GiveMessage _STM() {
        // JavaLine 46 <== SourceLine 58
        if(_VALUE((((CLASS_ERRMSG)(_CUR._SL)).messageLinenr<=(0)))) {
            ((CLASS_ERRMSG)(_CUR._SL)).messageLinenr=((CLASS_ERRMSG)(_CUR._SL)).linenr;
        }
        ;
        // JavaLine 51 <== SourceLine 59
        t=(((p_ec==(((char)0))))?(new RTS_TXT("Note!: ")):((((p_ec==(((char)1))))?(new RTS_TXT("Warn.: ")):((((p_ec==(((char)2))))?(new RTS_TXT("ERROR: ")):(new RTS_TXT("FATAL: ")))))));
        ;
        // JavaLine 54 <== SourceLine 61
        if(_VALUE((((((CLASS_ERRMSG)(_CUR._SL)).currentpass>('1'))|((p_ec>=(((char)3)))))&&((((CLASS_ERRMSG)(_CUR._SL)).messageLinenr>(0)))))) {
            // JavaLine 56 <== SourceLine 62
            {
                // JavaLine 58 <== SourceLine 63
                tout=new CLASS_COMMON_leftint((_CUR._SL),((CLASS_ERRMSG)(_CUR._SL)).messageLinenr)._RESULT;
                ;
                t=CONC(CONC(CONC(t,new RTS_TXT("(l. ")),tout),new RTS_TXT(") "));
                ;
            }
        }
        ;
        // JavaLine 66 <== SourceLine 65
        ((CLASS_ERRMSG)(_CUR._SL)).messageLinenr=0;
        ;
        i=(RTS_TXT.length(t)+(1));
        ;
        // JavaLine 71 <== SourceLine 67
        tout=new CLASS_ERRMSG_diagmerge((_CUR._SL),p_index)._RESULT;
        ;
        t=CONC(t,tout);
        ;
        // JavaLine 76 <== SourceLine 69
        while((RTS_TXT.length(t)>(78))) {
            {
                // JavaLine 79 <== SourceLine 70
                RTS_TXT.setpos(t,79);
                ;
                // JavaLine 82 <== SourceLine 71
                while((RTS_TXT.getchar(t)!=(((char)32)))) {
                    RTS_TXT.setpos(t,(RTS_TXT.pos(t)-(2)));
                }
                ;
                // JavaLine 87 <== SourceLine 72
                tout=RTS_TXT.sub(t,1,(RTS_TXT.pos(t)-(2)));
                ;
                t=RTS_TXT.sub(t,RTS_TXT.pos(t),((RTS_TXT.length(t)-(RTS_TXT.pos(t)))+(1)));
                ;
                // JavaLine 92 <== SourceLine 73
                new CLASS_ERRMSG_printDiag((_CUR._SL),tout);
                ;
            }
        }
        ;
        // JavaLine 98 <== SourceLine 76
        new CLASS_ERRMSG_printDiag((_CUR._SL),t);
        ;
        // JavaLine 101 <== SourceLine 77
        if(_VALUE((p_ec==(((char)1))))) {
            ((CLASS_ERRMSG)(_CUR._SL)).numwarnfound_1=(((CLASS_ERRMSG)(_CUR._SL)).numwarnfound_1+(1));
        }
        ;
        // JavaLine 106 <== SourceLine 78
        if(_VALUE((p_ec==(((char)2))))) {
            {
                // JavaLine 109 <== SourceLine 79
                ((CLASS_ERRMSG)(_CUR._SL)).numerrfound=(((CLASS_ERRMSG)(_CUR._SL)).numerrfound+(1));
                ;
                // JavaLine 112 <== SourceLine 80
                if(_VALUE((((CLASS_ERRMSG)(_CUR._SL)).termstatus<('5')))) {
                    ((CLASS_ERRMSG)(_CUR._SL)).termstatus='5';
                }
                ;
                // JavaLine 117 <== SourceLine 81
                RTS_ENVIRONMENT.giveIntInfo(1,(RTS_ENVIRONMENT.rank(((CLASS_ERRMSG)(_CUR._SL)).termstatus)-(RTS_ENVIRONMENT.rank('0'))));
                ;
            }
        }
        ;
        // JavaLine 123 <== SourceLine 83
        RTS_ENVIRONMENT.rts_utility(RTS_ENVIRONMENT.rank(p_ec),0);
        ;
        // JavaLine 126 <== SourceLine 84
        if(_VALUE(((((CLASS_ERRMSG)(_CUR._SL)).numerrfound>(((CLASS_ERRMSG)(_CUR._SL)).maxerrno_1))|((p_ec>(((char)2))))))) {
            new CLASS_ERRMSG_AbortCompilation((_CUR._SL));
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_ERRMSG.sim","5 GiveMessage",1,56,12,57,46,58,51,59,54,61,56,62,58,63,66,65,71,67,76,69,79,70,82,71,87,72,92,73,98,76,101,77,106,78,109,79,112,80,117,81,123,83,126,84,133,85);
} // End of Procedure
