// JavaLine 1 <== SourceLine 504
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_readspecification_specificationerror extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=504, lastLine=514, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_errno;
    // Declare local labels
    // JavaLine 11 <== SourceLine 506
    final RTS_LABEL _LABEL_PARSER_grammer_readspecification_specificationerror_searchagain_0=new RTS_LABEL(this,0,1,"searchagain"); // Local Label #1=searchagain At PrefixLevel 0
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public PARSER_grammer_readspecification_specificationerror setPar(Object param) {
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
    public PARSER_grammer_readspecification_specificationerror(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public PARSER_grammer_readspecification_specificationerror(RTS_RTObject _SL,int sp_errno) {
        super(_SL);
        // Parameter assignment to locals
        this.p_errno = sp_errno;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_readspecification_specificationerror _STM() {
        PARSER_grammer_readspecification_specificationerror _THIS=(PARSER_grammer_readspecification_specificationerror)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 46 <== SourceLine 505
                new PARSER_grammer_ParsErr((_CUR._SL._SL),p_errno);
                ;
                // JavaLine 49 <== SourceLine 506
                {
                    _SIM_LABEL(1); // DeclaredIn: specificationerror
                    new PARSER_grammer_search((_CUR._SL._SL));
                }
                ;
                // JavaLine 55 <== SourceLine 507
                if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs==(((char)16))))) {
                    {
                        // JavaLine 58 <== SourceLine 508
                        ((PARSER_grammer)(_CUR._SL._SL)).detach(508);
                        ;
                        _GOTO(_LABEL_PARSER_grammer_readspecification_specificationerror_searchagain_0); // GOTO EVALUATED LABEL
                    }
                }
                ;
                // JavaLine 65 <== SourceLine 509
                if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs==('N')))) {
                    _GOTO(((PARSER_grammer_readspecification)(_CUR._SL))._LABEL_PARSER_grammer_readspecification_Block519_P3_0); // GOTO EVALUATED LABEL
                }
                ;
                // JavaLine 70 <== SourceLine 510
                if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs==('O')))) {
                    {
                        // JavaLine 73 <== SourceLine 511
                        ((PARSER_grammer)(_CUR._SL._SL)).detach(511);
                        ;
                        _GOTO(((PARSER_grammer_readspecification)(_CUR._SL))._LABEL_PARSER_grammer_readspecification_spes_0); // GOTO EVALUATED LABEL
                    }
                }
                ;
                // JavaLine 80 <== SourceLine 512
                if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).symboltype.getELEMENT(RTS_ENVIRONMENT.rank(((PARSER_grammer)(_CUR._SL._SL)).cs))==(((char)1))))) {
                    _GOTO(((PARSER_grammer_readspecification)(_CUR._SL))._LABEL_PARSER_grammer_readspecification_spes_0); // GOTO EVALUATED LABEL
                }
                ;
                // JavaLine 85 <== SourceLine 513
                _GOTO(((PARSER_grammer_readspecification)(_CUR._SL))._LABEL_PARSER_grammer_readspecification_readspecificationexit_0); // GOTO EVALUATED LABEL
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 specificationerror",1,504,11,506,46,505,49,506,55,507,58,508,65,509,70,510,73,511,80,512,85,513,97,514);
} // End of Procedure
