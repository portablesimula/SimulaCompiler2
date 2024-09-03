// JavaLine 1 <== SourceLine 46
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:47 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_ERRMSG_GiveMessage extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=46, lastLine=75, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public char p_ec;
    public int p_index;
    // Declare locals as attributes
    // JavaLine 12 <== SourceLine 47
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
        // JavaLine 46 <== SourceLine 48
        if(_VALUE((((CLASS_ERRMSG)(_CUR._SL)).messageLinenr<=(0)))) {
            ((CLASS_ERRMSG)(_CUR._SL)).messageLinenr=((CLASS_ERRMSG)(_CUR._SL)).linenr;
        }
        ;
        // JavaLine 51 <== SourceLine 49
        t=(((p_ec==(((char)0))))?(new RTS_TXT("Note!: ")):((((p_ec==(((char)1))))?(new RTS_TXT("Warn.: ")):((((p_ec==(((char)2))))?(new RTS_TXT("ERROR: ")):(new RTS_TXT("FATAL: ")))))));
        ;
        // JavaLine 54 <== SourceLine 51
        if(_VALUE((((((CLASS_ERRMSG)(_CUR._SL)).currentpass>('1'))|((p_ec>=(((char)3)))))&&((((CLASS_ERRMSG)(_CUR._SL)).messageLinenr>(0)))))) {
            // JavaLine 56 <== SourceLine 52
            {
                // JavaLine 58 <== SourceLine 53
                tout=new CLASS_COMMON_leftint((_CUR._SL),((CLASS_ERRMSG)(_CUR._SL)).messageLinenr)._RESULT;
                ;
                t=CONC(CONC(CONC(t,new RTS_TXT("(l. ")),tout),new RTS_TXT(") "));
                ;
            }
        }
        ;
        // JavaLine 66 <== SourceLine 55
        ((CLASS_ERRMSG)(_CUR._SL)).messageLinenr=0;
        ;
        i=(RTS_TXT.length(t)+(1));
        ;
        // JavaLine 71 <== SourceLine 57
        tout=new CLASS_ERRMSG_diagmerge((_CUR._SL),p_index)._RESULT;
        ;
        t=CONC(t,tout);
        ;
        // JavaLine 76 <== SourceLine 59
        while((RTS_TXT.length(t)>(78))) {
            {
                // JavaLine 79 <== SourceLine 60
                RTS_TXT.setpos(t,79);
                ;
                // JavaLine 82 <== SourceLine 61
                while((RTS_TXT.getchar(t)!=(((char)32)))) {
                    RTS_TXT.setpos(t,(RTS_TXT.pos(t)-(2)));
                }
                ;
                // JavaLine 87 <== SourceLine 62
                tout=RTS_TXT.sub(t,1,(RTS_TXT.pos(t)-(2)));
                ;
                t=RTS_TXT.sub(t,RTS_TXT.pos(t),((RTS_TXT.length(t)-(RTS_TXT.pos(t)))+(1)));
                ;
                // JavaLine 92 <== SourceLine 63
                new CLASS_ERRMSG_printDiag((_CUR._SL),tout);
                ;
            }
        }
        ;
        // JavaLine 98 <== SourceLine 66
        new CLASS_ERRMSG_printDiag((_CUR._SL),t);
        ;
        // JavaLine 101 <== SourceLine 67
        if(_VALUE((p_ec==(((char)1))))) {
            ((CLASS_ERRMSG)(_CUR._SL)).numwarnfound_1=(((CLASS_ERRMSG)(_CUR._SL)).numwarnfound_1+(1));
        }
        ;
        // JavaLine 106 <== SourceLine 68
        if(_VALUE((p_ec==(((char)2))))) {
            {
                // JavaLine 109 <== SourceLine 69
                ((CLASS_ERRMSG)(_CUR._SL)).numerrfound=(((CLASS_ERRMSG)(_CUR._SL)).numerrfound+(1));
                ;
                // JavaLine 112 <== SourceLine 70
                if(_VALUE((((CLASS_ERRMSG)(_CUR._SL)).termstatus<('5')))) {
                    ((CLASS_ERRMSG)(_CUR._SL)).termstatus='5';
                }
                ;
                // JavaLine 117 <== SourceLine 71
                RTS_ENVIRONMENT.giveIntInfo(1,(RTS_ENVIRONMENT.rank(((CLASS_ERRMSG)(_CUR._SL)).termstatus)-(RTS_ENVIRONMENT.rank('0'))));
                ;
            }
        }
        ;
        // JavaLine 123 <== SourceLine 74
        if(_VALUE(((((CLASS_ERRMSG)(_CUR._SL)).numerrfound>(((CLASS_ERRMSG)(_CUR._SL)).maxerrno_1))|((p_ec>(((char)2))))))) {
            new CLASS_ERRMSG_AbortCompilation((_CUR._SL));
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_ERRMSG.sim","5 GiveMessage",1,46,12,47,46,48,51,49,54,51,56,52,58,53,66,55,71,57,76,59,79,60,82,61,87,62,92,63,98,66,101,67,106,68,109,69,112,70,117,71,123,74,130,75);
} // End of Procedure
