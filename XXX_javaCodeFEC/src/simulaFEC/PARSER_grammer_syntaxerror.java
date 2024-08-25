// JavaLine 1 <== SourceLine 237
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_syntaxerror extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=237, lastLine=256, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_errorno;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 238
    public int c=0;
    public PARSER_grammer_statement stmnt=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public PARSER_grammer_syntaxerror setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_errorno=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public PARSER_grammer_syntaxerror(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public PARSER_grammer_syntaxerror(RTS_RTObject _SL,int sp_errorno) {
        super(_SL);
        // Parameter assignment to locals
        this.p_errorno = sp_errorno;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_syntaxerror _STM() {
        // JavaLine 42 <== SourceLine 239
        if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs!=('X')))) {
            {
                new PARSER_grammer_setCurPos((_CUR._SL));
                ;
                // JavaLine 47 <== SourceLine 240
                new ERRMSG_parserMessage((_CUR._SL._SL),((PARSER_grammer)(_CUR._SL)).currentPos_1,p_errorno,((PARSER_grammer)(_CUR._SL)).experrorno_1);
            }
        }
        ;
        // JavaLine 52 <== SourceLine 241
        ((PARSER_grammer)(_CUR._SL)).experrorno_1=0;
        ;
        for(c=1;c<=150;c++) {
            // JavaLine 56 <== SourceLine 242
            ((PARSER_grammer)(_CUR._SL)).recoversymbol.putELEMENT(((PARSER_grammer)(_CUR._SL)).recoversymbol.index(c),false);
        }
        ;
        // JavaLine 60 <== SourceLine 243
        new PARSER_grammer_setbasicrecovery((_CUR._SL));
        ;
        // JavaLine 63 <== SourceLine 244
        stmnt=((PARSER_grammer)(_CUR._SL)).first_1;
        ;
        // JavaLine 66 <== SourceLine 245
        while((stmnt!=(null))) {
            {
                // JavaLine 69 <== SourceLine 246
                stmnt.recoversetting_0().CPF();
                ;
                stmnt=stmnt.next;
            }
        }
        ;
        // JavaLine 76 <== SourceLine 247
        new PARSER_grammer_search((_CUR._SL));
        ;
        // JavaLine 79 <== SourceLine 248
        while((!(((boolean)(((PARSER_grammer)(_CUR._SL)).last_1.recover_0().CPF()._RESULT()))))) {
            {
                // JavaLine 82 <== SourceLine 249
                if(_VALUE((((PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                    // JavaLine 84 <== SourceLine 250
                    new SCANNER_W1((_CUR._SL._SL),new RTS_TXT("UNSTACK - cs:"),RTS_ENVIRONMENT.rank(((PARSER_grammer)(_CUR._SL)).cs));
                }
                ;
                // JavaLine 88 <== SourceLine 251
                ((PARSER_grammer)(_CUR._SL)).last_1=((PARSER_grammer)(_CUR._SL)).last_1.caller;
                ;
            }
        }
        ;
        // JavaLine 94 <== SourceLine 252
        ((PARSER_grammer)(_CUR._SL)).last_1.next=null;
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 syntaxerror",1,237,11,238,42,239,47,240,52,241,56,242,60,243,63,244,66,245,69,246,76,247,79,248,82,249,84,250,88,251,94,252,99,256);
} // End of Procedure
