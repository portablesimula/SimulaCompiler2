// JavaLine 1 <== SourceLine 579
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_notBoundPair extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=579, lastLine=596, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public char p_colon;
    // Declare local labels
    // JavaLine 13 <== SourceLine 596
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_notBoundPair_EXIT_0=new RTS_LABEL(this,0,1,"EXIT"); // Local Label #1=EXIT At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 16 <== SourceLine 579
    public int _RESULT=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_PARSER_grammer_notBoundPair setPar(Object param) {
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
    public CLASS_PARSER_grammer_notBoundPair(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_PARSER_grammer_notBoundPair(RTS_RTObject _SL,char sp_colon) {
        super(_SL);
        // Parameter assignment to locals
        this.p_colon = sp_colon;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_notBoundPair _STM() {
        CLASS_PARSER_grammer_notBoundPair _THIS=(CLASS_PARSER_grammer_notBoundPair)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 50 <== SourceLine 581
                ((CLASS_PARSER_grammer)(_CUR._SL)).detach(581);
                ;
                _RESULT=0;
                ;
                // JavaLine 55 <== SourceLine 583
                call(((CLASS_PARSER_grammer)(_CUR._SL)).ex_1,583);
                ;
                // JavaLine 58 <== SourceLine 584
                if(_VALUE(((CLASS_PARSER_grammer)(_CUR._SL)).ex_1.wasNotexpr)) {
                    {
                        // JavaLine 61 <== SourceLine 585
                        _RESULT=4;
                        ;
                        new CLASS_PARSER_grammer_syntaxerror((_CUR._SL),188);
                        ;
                        _GOTO(_LABEL_CLASS_PARSER_grammer_notBoundPair_EXIT_0); // GOTO EVALUATED LABEL
                    }
                }
                ;
                // JavaLine 70 <== SourceLine 586
                if(_VALUE(((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=('M'))&&((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=('S')))))) {
                    {
                        // JavaLine 73 <== SourceLine 587
                        _RESULT=4;
                        ;
                        new CLASS_PARSER_grammer_syntaxerror((_CUR._SL),189);
                        ;
                        _GOTO(_LABEL_CLASS_PARSER_grammer_notBoundPair_EXIT_0); // GOTO EVALUATED LABEL
                    }
                }
                ;
                // JavaLine 82 <== SourceLine 588
                ((CLASS_PARSER)(_CUR._SL._SL)).opn=p_colon;
                ;
                // JavaLine 85 <== SourceLine 589
                if(_VALUE((p_colon==(((char)137))))) {
                    {
                        ((CLASS_PARSER)(_CUR._SL._SL)).opn='W';
                        ;
                        ((CLASS_PARSER)(_CUR._SL._SL)).opdlo=((char)137);
                    }
                }
                ;
                // JavaLine 94 <== SourceLine 590
                call(((CLASS_PARSER)(_CUR._SL._SL)).coder,590);
                ;
                // JavaLine 97 <== SourceLine 591
                if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('S')))) {
                    ((CLASS_PARSER_grammer)(_CUR._SL)).cs='G';
                } else {
                    // JavaLine 101 <== SourceLine 592
                    ((CLASS_PARSER_grammer)(_CUR._SL)).detach(592);
                }
                ;
                // JavaLine 105 <== SourceLine 593
                call(((CLASS_PARSER_grammer)(_CUR._SL)).ex_1,593);
                ;
                // JavaLine 108 <== SourceLine 594
                if(_VALUE(((CLASS_PARSER_grammer)(_CUR._SL)).ex_1.wasNotexpr)) {
                    {
                        // JavaLine 111 <== SourceLine 595
                        _RESULT=5;
                        ;
                        new CLASS_PARSER_grammer_syntaxerror((_CUR._SL),188);
                    }
                }
                ;
                // JavaLine 118 <== SourceLine 596
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 notBoundPair",1,579,13,596,16,579,50,581,55,583,58,584,61,585,70,586,73,587,82,588,85,589,94,590,97,591,101,592,105,593,108,594,111,595,118,596,132,596);
} // End of Procedure
