// JavaLine 1 <== SourceLine 351
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_readprocpar_procparerror extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=351, lastLine=363, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public int p_errno;
    // Declare local labels
    // JavaLine 11 <== SourceLine 353
    final RTS_LABEL _LABEL_PARSER_grammer_readprocpar_procparerror_searchagain_0=new RTS_LABEL(this,0,1,"searchagain"); // Local Label #1=searchagain At PrefixLevel 0
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public PARSER_grammer_readprocpar_procparerror setPar(Object param) {
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
    public PARSER_grammer_readprocpar_procparerror(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public PARSER_grammer_readprocpar_procparerror(RTS_RTObject _SL,int sp_errno) {
        super(_SL);
        // Parameter assignment to locals
        this.p_errno = sp_errno;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_readprocpar_procparerror _STM() {
        PARSER_grammer_readprocpar_procparerror _THIS=(PARSER_grammer_readprocpar_procparerror)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 46 <== SourceLine 352
                new PARSER_grammer_ParsErr((_CUR._SL._SL),p_errno);
                ;
                // JavaLine 49 <== SourceLine 353
                {
                    _SIM_LABEL(1); // DeclaredIn: procparerror
                    new PARSER_grammer_search((_CUR._SL._SL));
                }
                ;
                // JavaLine 55 <== SourceLine 354
                if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs==(((char)16))))) {
                    {
                        // JavaLine 58 <== SourceLine 355
                        ((PARSER_grammer)(_CUR._SL._SL)).detach(355);
                        ;
                        _GOTO(_LABEL_PARSER_grammer_readprocpar_procparerror_searchagain_0); // GOTO EVALUATED LABEL
                    }
                }
                ;
                // JavaLine 65 <== SourceLine 356
                if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs==('N')))) {
                    _GOTO(((PARSER_grammer_readprocpar)(_CUR._SL))._LABEL_PARSER_grammer_readprocpar_Block392_P1_0); // GOTO EVALUATED LABEL
                }
                ;
                // JavaLine 70 <== SourceLine 357
                if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs==('O')))) {
                    {
                        // JavaLine 73 <== SourceLine 358
                        ((PARSER_grammer)(_CUR._SL._SL)).detach(358);
                        ;
                        _GOTO(((PARSER_grammer_readprocpar)(_CUR._SL))._LABEL_PARSER_grammer_readprocpar_Block392_namevaluepart_0); // GOTO EVALUATED LABEL
                    }
                }
                ;
                // JavaLine 80 <== SourceLine 359
                if(_VALUE(((((PARSER_grammer)(_CUR._SL._SL)).cs==('!'))||((((PARSER_grammer)(_CUR._SL._SL)).cs==(((char)10))))))) {
                    _GOTO(((PARSER_grammer_readprocpar)(_CUR._SL))._LABEL_PARSER_grammer_readprocpar_Block392_namevaluepart_0); // GOTO EVALUATED LABEL
                }
                ;
                // JavaLine 85 <== SourceLine 360
                if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).symboltype.getELEMENT(RTS_ENVIRONMENT.rank(((PARSER_grammer)(_CUR._SL._SL)).cs))==(((char)1))))) {
                    // JavaLine 87 <== SourceLine 361
                    _GOTO(((PARSER_grammer_readprocpar)(_CUR._SL))._LABEL_PARSER_grammer_readprocpar_Block392_specification_0); // GOTO EVALUATED LABEL
                }
                ;
                // JavaLine 91 <== SourceLine 362
                _GOTO(((PARSER_grammer_readprocpar)(_CUR._SL))._LABEL_PARSER_grammer_readprocpar_readprocparexit_0); // GOTO EVALUATED LABEL
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 procparerror",1,351,11,353,46,352,49,353,55,354,58,355,65,356,70,357,73,358,80,359,85,360,87,361,91,362,103,363);
} // End of Procedure
