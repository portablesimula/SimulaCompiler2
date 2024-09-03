// JavaLine 1 <== SourceLine 123
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_exp_expdump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=123, lastLine=140, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_T;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 124
    public RTS_Printfile _inspect_124_4551=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_CHECKER1_semchecker1_exp_expdump setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_T=(RTS_TXT)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_CHECKER1_semchecker1_exp_expdump(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_exp_expdump(RTS_RTObject _SL,RTS_TXT sp_T) {
        super(_SL);
        // Parameter assignment to locals
        this.p_T = sp_T;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_exp_expdump _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_124_4551=RTS_BASICIO.sysout();
            if(_inspect_124_4551!=null) { // INSPECT _inspect_124_4551  type=ref(PRINTFILE)
                // JavaLine 45 <== SourceLine 125
                {
                    // JavaLine 47 <== SourceLine 124
                    {
                        // JavaLine 49 <== SourceLine 125
                        _inspect_124_4551.outtext(CONC(new RTS_TXT("   "),p_T));
                        ;
                        _inspect_124_4551.outchar(((char)32));
                        ;
                        // JavaLine 54 <== SourceLine 126
                        _inspect_124_4551.outtext(((CLASS_CHECKER1)(_CUR._SL._SL._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_CHECKER1_semchecker1_exp)(_CUR._SL)).type)));
                        ;
                        // JavaLine 57 <== SourceLine 127
                        _inspect_124_4551.outtext((((((CLASS_CHECKER1_semchecker1_exp)(_CUR._SL)).cl==(((char)0))))?(new RTS_TXT("     ")):((((((CLASS_CHECKER1_semchecker1_exp)(_CUR._SL)).cl==(((char)1))))?(new RTS_TXT(" expr")):((((((CLASS_CHECKER1_semchecker1_exp)(_CUR._SL)).cl==(((char)2))))?(new RTS_TXT(" IFex")):((((((CLASS_CHECKER1_semchecker1_exp)(_CUR._SL)).cl==(((char)3))))?(new RTS_TXT(" IFst")):((((((CLASS_CHECKER1_semchecker1_exp)(_CUR._SL)).cl==(((char)4))))?(new RTS_TXT("   to")):((((((CLASS_CHECKER1_semchecker1_exp)(_CUR._SL)).cl==(((char)5))))?(new RTS_TXT(" acte")):((((((CLASS_CHECKER1_semchecker1_exp)(_CUR._SL)).cl==(((char)6))))?(new RTS_TXT(" text")):(new RTS_TXT("illegal cl"))))))))))))))));
                        ;
                        // JavaLine 60 <== SourceLine 134
                        _inspect_124_4551.outtext((((((CLASS_CHECKER1_semchecker1_exp)(_CUR._SL)).issimple!=(0)))?(new RTS_TXT(" S")):(new RTS_TXT("  "))));
                        ;
                        // JavaLine 63 <== SourceLine 135
                        if(_VALUE((((CLASS_CHECKER1_semchecker1_exp)(_CUR._SL)).qual!=(null)))) {
                            {
                                // JavaLine 66 <== SourceLine 136
                                _inspect_124_4551.outtext(CONC(new RTS_TXT(" QUAL:"),((CLASS_CHECKER1_semchecker1_exp)(_CUR._SL)).qual.symb_1.symbol));
                                ;
                                // JavaLine 69 <== SourceLine 137
                                if(_VALUE((((CLASS_CHECKER1)(_CUR._SL._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('T'))!=(((char)0))))) {
                                    {
                                        // JavaLine 72 <== SourceLine 138
                                        _inspect_124_4551.outimage();
                                        ;
                                        _inspect_124_4551.outtext(new RTS_TXT("   "));
                                        ;
                                        new CLASS_COMMON_quantity_dump(((CLASS_CHECKER1_semchecker1_exp)(_CUR._SL)).qual);
                                    }
                                }
                            }
                        }
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 expdump",1,123,11,124,45,125,47,124,49,125,54,126,57,127,60,134,63,135,66,136,69,137,72,138,89,140);
} // End of Procedure
