// JavaLine 1 <== SourceLine 1298
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER1_semchecker1_identifier_dump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1298, lastLine=1314, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 1299
    public RTS_Printfile _inspect_1298_4575=null;
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_identifier_dump(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER1_semchecker1_identifier_dump _STM() {
        // JavaLine 23 <== SourceLine 1298
        {
            // BEGIN INSPECTION 
            _inspect_1298_4575=RTS_BASICIO.sysout();
            if(_inspect_1298_4575!=null) { // INSPECT _inspect_1298_4575  type=ref(PRINTFILE)
                // JavaLine 28 <== SourceLine 1300
                {
                    // JavaLine 30 <== SourceLine 1299
                    {
                        // JavaLine 32 <== SourceLine 1300
                        new CLASS_CHECKER1_semchecker1_exp_expdump((_CUR._SL),((((((((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).p_ch==('Z'))|((((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).p_ch==(((char)129)))))|((((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).p_ch==('L'))))|((((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).p_ch==('s')))))?(new RTS_TXT(" IDENT")):(((((((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).p_ch==('"'))|((((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).p_ch==(((char)134))))))?(new RTS_TXT("   NEW")):(new RTS_TXT("PREFIX"))))));
                        ;
                        // JavaLine 35 <== SourceLine 1305
                        if(_VALUE((((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).meaning!=(null)))) {
                            {
                                // JavaLine 38 <== SourceLine 1306
                                _inspect_1298_4575.outtext(CONC(CONC(new RTS_TXT("("),((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).meaning.symb_1.symbol),new RTS_TXT(")")));
                                ;
                                _inspect_1298_4575.outimage();
                                ;
                                // JavaLine 43 <== SourceLine 1307
                                if(_VALUE((((CLASS_CHECKER1)(_CUR._SL._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('T'))!=(((char)0))))) {
                                    new CLASS_COMMON_quantity_dump(((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).meaning);
                                }
                                ;
                            }
                        } else {
                            // JavaLine 50 <== SourceLine 1308
                            _inspect_1298_4575.outimage();
                        }
                        ;
                        // JavaLine 54 <== SourceLine 1309
                        if(_VALUE((((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)).ctype==('Z')))) {
                            {
                                // JavaLine 57 <== SourceLine 1310
                                if(_VALUE(RTS_UTIL._IS(((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)),CLASS_CHECKER1_semchecker1_dotIdent.class))) {
                                    {
                                        // JavaLine 60 <== SourceLine 1311
                                        _inspect_1298_4575.outtext(new RTS_TXT(" DOT"));
                                        ;
                                        // JavaLine 63 <== SourceLine 1312
                                        ((CLASS_CHECKER1_semchecker1_dotIdent)(((CLASS_CHECKER1_semchecker1_identifier)(_CUR._SL)))).p2_dotexp.dump_0().CPF();
                                        ;
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","5 dump",1,1298,10,1299,23,1298,28,1300,30,1299,32,1300,35,1305,38,1306,43,1307,50,1308,54,1309,57,1310,60,1311,63,1312,77,1314);
} // End of Procedure
