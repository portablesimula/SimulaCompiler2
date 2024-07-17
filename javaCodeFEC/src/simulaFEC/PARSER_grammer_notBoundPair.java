// JavaLine 1 <== SourceLine 578
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_notBoundPair extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=578, lastLine=595, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public char p_colon;
    // Declare local labels
    // JavaLine 13 <== SourceLine 595
    final RTS_LABEL _LABEL_PARSER_grammer_notBoundPair_EXIT_0=new RTS_LABEL(this,0,1,"EXIT"); // Local Label #1=EXIT At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 16 <== SourceLine 578
    public int _RESULT=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public PARSER_grammer_notBoundPair setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_colon=(char)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public PARSER_grammer_notBoundPair(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public PARSER_grammer_notBoundPair(RTS_RTObject _SL,char sp_colon) {
        super(_SL);
        // Parameter assignment to locals
        this.p_colon = sp_colon;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_notBoundPair _STM() {
        PARSER_grammer_notBoundPair _THIS=(PARSER_grammer_notBoundPair)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 50 <== SourceLine 580
                ((PARSER_grammer)(_CUR._SL)).detach(580);
                ;
                _RESULT=0;
                ;
                // JavaLine 55 <== SourceLine 582
                call(((PARSER_grammer)(_CUR._SL)).ex_1,582);
                ;
                // JavaLine 58 <== SourceLine 583
                if(_VALUE(((PARSER_grammer)(_CUR._SL)).ex_1.wasNotexpr)) {
                    {
                        // JavaLine 61 <== SourceLine 584
                        _RESULT=4;
                        ;
                        new PARSER_grammer_syntaxerror((_CUR._SL),188);
                        ;
                        _GOTO(_LABEL_PARSER_grammer_notBoundPair_EXIT_0); // GOTO EVALUATED LABEL
                    }
                }
                ;
                // JavaLine 70 <== SourceLine 585
                if(_VALUE(((((PARSER_grammer)(_CUR._SL)).cs!=('M'))&&((((PARSER_grammer)(_CUR._SL)).cs!=('S')))))) {
                    {
                        // JavaLine 73 <== SourceLine 586
                        _RESULT=4;
                        ;
                        new PARSER_grammer_syntaxerror((_CUR._SL),189);
                        ;
                        _GOTO(_LABEL_PARSER_grammer_notBoundPair_EXIT_0); // GOTO EVALUATED LABEL
                    }
                }
                ;
                // JavaLine 82 <== SourceLine 587
                ((PARSER)(_CUR._SL._SL)).opn=p_colon;
                ;
                // JavaLine 85 <== SourceLine 588
                if(_VALUE((p_colon==(((char)137))))) {
                    {
                        ((PARSER)(_CUR._SL._SL)).opn='W';
                        ;
                        ((PARSER)(_CUR._SL._SL)).opdlo=((char)137);
                    }
                }
                ;
                // JavaLine 94 <== SourceLine 589
                call(((PARSER)(_CUR._SL._SL)).coder,589);
                ;
                // JavaLine 97 <== SourceLine 590
                if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==('S')))) {
                    ((PARSER_grammer)(_CUR._SL)).cs='G';
                } else {
                    // JavaLine 101 <== SourceLine 591
                    ((PARSER_grammer)(_CUR._SL)).detach(591);
                }
                ;
                // JavaLine 105 <== SourceLine 592
                call(((PARSER_grammer)(_CUR._SL)).ex_1,592);
                ;
                // JavaLine 108 <== SourceLine 593
                if(_VALUE(((PARSER_grammer)(_CUR._SL)).ex_1.wasNotexpr)) {
                    {
                        // JavaLine 111 <== SourceLine 594
                        _RESULT=5;
                        ;
                        new PARSER_grammer_syntaxerror((_CUR._SL),188);
                    }
                }
                ;
                // JavaLine 118 <== SourceLine 595
                {
                    _SIM_LABEL(1); // DeclaredIn: notBoundPair
                    ;
                }
                break _LOOP;
            }
            catch(RTS_LABEL q) {
                RTS_RTObject._TREAT_GOTO_CATCH_BLOCK(_THIS, q);
                _JTX=q.index; continue _LOOP; // EG. GOTO Lx
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 notBoundPair",1,578,13,595,16,578,50,580,55,582,58,583,61,584,70,585,73,586,82,587,85,588,94,589,97,590,101,591,105,592,108,593,111,594,118,595,132,595);
} // End of Procedure
