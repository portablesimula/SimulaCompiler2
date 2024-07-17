// JavaLine 1 <== SourceLine 96
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:40 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER1E_codegenerator1e_identifiertag extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=96, lastLine=117, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public COMMON_symbolbox p_symb;
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 97
    public int len=0;
    // JavaLine 15 <== SourceLine 98
    public COMMON_symbolbox _inspect_98_4635=null;
    // JavaLine 17 <== SourceLine 96
    public int _RESULT=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public SCODER1E_codegenerator1e_identifiertag setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_symb=(COMMON_symbolbox)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public SCODER1E_codegenerator1e_identifiertag(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public SCODER1E_codegenerator1e_identifiertag(RTS_RTObject _SL,COMMON_symbolbox sp_symb) {
        super(_SL);
        // Parameter assignment to locals
        this.p_symb = sp_symb;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER1E_codegenerator1e_identifiertag _STM() {
        // JavaLine 47 <== SourceLine 98
        {
            // BEGIN INSPECTION 
            _inspect_98_4635=p_symb;
            if(_inspect_98_4635!=null) { // INSPECT _inspect_98_4635
                // JavaLine 52 <== SourceLine 99
                {
                    // JavaLine 54 <== SourceLine 98
                    {
                        // JavaLine 56 <== SourceLine 99
                        if(_VALUE((_inspect_98_4635.idtag==(0)))) {
                            {
                                // JavaLine 59 <== SourceLine 101
                                ((SCODER1E_codegenerator1e)(_CUR._SL)).lastidenttag_7=_inspect_98_4635.idtag=new BUILDER1_newTTag((_CUR._SL._SL),new RTS_TXT("idtag"))._RESULT;
                                // JavaLine 61 <== SourceLine 102
                                len=RTS_TXT.length(_inspect_98_4635.symbol);
                                ;
                                // JavaLine 64 <== SourceLine 103
                                ((SCODER1E_codegenerator1e)(_CUR._SL)).outbyte(53);
                                ;
                                new SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),_inspect_98_4635.idtag);
                                ;
                                // JavaLine 69 <== SourceLine 104
                                ((SCODER1E_codegenerator1e)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u0001\u0082"),new RTS_TXT("\b")));
                                ;
                                // JavaLine 72 <== SourceLine 105
                                ((SCODER1E_codegenerator1e)(_CUR._SL)).out2byte(len);
                                ;
                                // JavaLine 75 <== SourceLine 106
                                ((SCODER1E_codegenerator1e)(_CUR._SL)).outtext(CONC(CONC(CONC(CONC(CONC(new RTS_TXT("\n"),new RTS_TXT("\u0001\u0082")),new RTS_TXT("\u0004")),new RTS_TXT("\u0001\u0083")),new RTS_TXT("\u0000\u0003")),new RTS_TXT("\r")));
                                ;
                                // JavaLine 78 <== SourceLine 109
                                new SCODER0_codegenerator0_outsint((_CUR._SL),len);
                                ;
                                // JavaLine 81 <== SourceLine 110
                                ((SCODER1E_codegenerator1e)(_CUR._SL)).outtext(CONC(CONC(CONC(new RTS_TXT("\u0004"),new RTS_TXT("\u0001\u0084")),new RTS_TXT("\u0000\u0002")),new RTS_TXT("\u000b")));
                                ;
                                // JavaLine 84 <== SourceLine 112
                                ((SCODER1E_codegenerator1e)(_CUR._SL)).out2byte(len);
                                ;
                                ((SCODER1E_codegenerator1e)(_CUR._SL)).outtext(_inspect_98_4635.symbol);
                                ;
                                // JavaLine 89 <== SourceLine 113
                                ((SCODER1E_codegenerator1e)(_CUR._SL)).outbyte(9);
                                ;
                            }
                        }
                        ;
                        // JavaLine 95 <== SourceLine 115
                        _RESULT=_inspect_98_4635.idtag;
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER1E.sim","5 identifiertag",1,96,13,97,15,98,17,96,47,98,52,99,54,98,56,99,59,101,61,102,64,103,69,104,72,105,75,106,78,109,81,110,84,112,89,113,95,115,105,117);
} // End of Procedure
