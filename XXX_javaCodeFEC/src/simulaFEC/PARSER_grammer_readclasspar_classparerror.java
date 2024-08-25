// JavaLine 1 <== SourceLine 433
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_readclasspar_classparerror extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=433, lastLine=444, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_errno;
    // Declare local labels
    // JavaLine 11 <== SourceLine 435
    final RTS_LABEL _LABEL_PARSER_grammer_readclasspar_classparerror_srchagain_0=new RTS_LABEL(this,0,1,"srchagain"); // Local Label #1=srchagain At PrefixLevel 0
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public PARSER_grammer_readclasspar_classparerror setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_errno=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public PARSER_grammer_readclasspar_classparerror(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public PARSER_grammer_readclasspar_classparerror(RTS_RTObject _SL,int sp_errno) {
        super(_SL);
        // Parameter assignment to locals
        this.p_errno = sp_errno;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_readclasspar_classparerror _STM() {
        PARSER_grammer_readclasspar_classparerror _THIS=(PARSER_grammer_readclasspar_classparerror)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 46 <== SourceLine 434
                new PARSER_grammer_ParsErr((_CUR._SL._SL),p_errno);
                ;
                // JavaLine 49 <== SourceLine 435
                {
                    _SIM_LABEL(1); // DeclaredIn: classparerror
                    new PARSER_grammer_search((_CUR._SL._SL));
                }
                ;
                // JavaLine 55 <== SourceLine 436
                if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs==(((char)16))))) {
                    {
                        // JavaLine 58 <== SourceLine 437
                        ((PARSER_grammer)(_CUR._SL._SL)).detach(437);
                        ;
                        _GOTO(_LABEL_PARSER_grammer_readclasspar_classparerror_srchagain_0); // GOTO EVALUATED LABEL
                    }
                }
                ;
                // JavaLine 65 <== SourceLine 438
                if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).symboltype.getELEMENT(RTS_ENVIRONMENT.rank(((PARSER_grammer)(_CUR._SL._SL)).cs))==(((char)1))))) {
                    // JavaLine 67 <== SourceLine 439
                    _GOTO(((PARSER_grammer_readclasspar)(_CUR._SL))._LABEL_PARSER_grammer_readclasspar_Block487_specification_0); // GOTO EVALUATED LABEL
                }
                ;
                // JavaLine 71 <== SourceLine 440
                if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs==('6')))) {
                    _GOTO(((PARSER_grammer_readclasspar)(_CUR._SL))._LABEL_PARSER_grammer_readclasspar_virtualspec_0); // GOTO EVALUATED LABEL
                }
                ;
                // JavaLine 76 <== SourceLine 441
                if(_VALUE((((((PARSER_grammer)(_CUR._SL._SL)).cs==(((char)22)))|((((PARSER_grammer)(_CUR._SL._SL)).cs==('('))))|((((PARSER_grammer)(_CUR._SL._SL)).cs==('3')))))) {
                    // JavaLine 78 <== SourceLine 442
                    _GOTO(((PARSER_grammer_readclasspar)(_CUR._SL))._LABEL_PARSER_grammer_readclasspar_hiddenprotected_0); // GOTO EVALUATED LABEL
                }
                ;
                // JavaLine 82 <== SourceLine 443
                _GOTO(((PARSER_grammer_readclasspar)(_CUR._SL))._LABEL_PARSER_grammer_readclasspar_readclassparexit_0); // GOTO EVALUATED LABEL
                ;
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 classparerror",1,433,11,435,46,434,49,435,55,436,58,437,65,438,67,439,71,440,76,441,78,442,82,443,94,444);
} // End of Procedure
