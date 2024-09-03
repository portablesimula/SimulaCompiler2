// JavaLine 1 <== SourceLine 231
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER1_visiblegenerator_beforeDump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=231, lastLine=250, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 232
    public RTS_Printfile _inspect_232_4520=null;
    // JavaLine 12 <== SourceLine 233
    public CLASS_BUILDER1_precheck0 _inspect_232_4521=null;
    // JavaLine 14 <== SourceLine 246
    public CLASS_COMMON_quantity _inspect_246_4522=null;
    // Normal Constructor
    public CLASS_BUILDER1_visiblegenerator_beforeDump(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER1_visiblegenerator_beforeDump _STM() {
        // JavaLine 27 <== SourceLine 232
        {
            // BEGIN INSPECTION 
            _inspect_232_4520=RTS_BASICIO.sysout();
            if(_inspect_232_4520!=null) { // INSPECT _inspect_232_4520  type=ref(PRINTFILE)
                {
                    {
                        // BEGIN INSPECTION 
                        _inspect_232_4521=((CLASS_BUILDER1)(_CUR._SL._SL)).checker0_6;
                        if(_inspect_232_4521!=null) { // INSPECT _inspect_232_4521  type=ref(PRECHECK0)
                            // JavaLine 37 <== SourceLine 233
                            {
                                {
                                    if(_VALUE((((((CLASS_BUILDER1)(_CUR._SL._SL)).opc_6==(((char)133)))|((((CLASS_BUILDER1)(_CUR._SL._SL)).opc_6==('Y'))))|((((CLASS_BUILDER1)(_CUR._SL._SL)).opc_6==('?')))))) {
                                        {
                                            // JavaLine 42 <== SourceLine 234
                                            _inspect_232_4520.outimage();
                                            ;
                                            _inspect_232_4520.outtext(new RTS_TXT(" ScodMain: "));
                                            ;
                                            // JavaLine 47 <== SourceLine 235
                                            _inspect_232_4520.outtext(((CLASS_BUILDER1)(_CUR._SL._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_BUILDER1)(_CUR._SL._SL)).opc_6)));
                                            ;
                                            _inspect_232_4520.outint(((CLASS_BUILDER1)(_CUR._SL._SL)).linenr,5);
                                        }
                                    } else {
                                        // JavaLine 53 <== SourceLine 236
                                        {
                                            // JavaLine 55 <== SourceLine 237
                                            _inspect_232_4520.outtext(new RTS_TXT(" ScodMain: "));
                                            ;
                                            // JavaLine 58 <== SourceLine 238
                                            _inspect_232_4520.outtext(((CLASS_BUILDER1)(_CUR._SL._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_BUILDER1)(_CUR._SL._SL)).opc_6)));
                                            ;
                                            // JavaLine 61 <== SourceLine 239
                                            if(_VALUE((((CLASS_BUILDER1)(_CUR._SL._SL)).opt!=('6')))) {
                                                {
                                                    _inspect_232_4520.outtext(new RTS_TXT(", opt="));
                                                    ;
                                                    // JavaLine 66 <== SourceLine 240
                                                    _inspect_232_4520.outtext(((CLASS_BUILDER1)(_CUR._SL._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_BUILDER1)(_CUR._SL._SL)).opt)));
                                                }
                                            }
                                            ;
                                            // JavaLine 71 <== SourceLine 241
                                            if(_VALUE((((CLASS_BUILDER1)(_CUR._SL._SL)).optx!=('6')))) {
                                                {
                                                    _inspect_232_4520.outtext(new RTS_TXT(", optx="));
                                                    ;
                                                    // JavaLine 76 <== SourceLine 242
                                                    _inspect_232_4520.outtext(((CLASS_BUILDER1)(_CUR._SL._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_BUILDER1)(_CUR._SL._SL)).optx)));
                                                }
                                            }
                                            ;
                                            // JavaLine 81 <== SourceLine 243
                                            if(_VALUE(((((CLASS_BUILDER1)(_CUR._SL._SL)).opihi_6!=(((char)0)))||((((CLASS_BUILDER1)(_CUR._SL._SL)).opilo_6!=(((char)0))))))) {
                                                {
                                                    // JavaLine 84 <== SourceLine 244
                                                    _inspect_232_4520.outtext(new RTS_TXT(", opi="));
                                                    ;
                                                    _inspect_232_4520.outint(RTS_ENVIRONMENT.rank(((CLASS_BUILDER1)(_CUR._SL._SL)).opihi_6),0);
                                                    ;
                                                    // JavaLine 89 <== SourceLine 245
                                                    _inspect_232_4520.outchar(',');
                                                    ;
                                                    _inspect_232_4520.outint(RTS_ENVIRONMENT.rank(((CLASS_BUILDER1)(_CUR._SL._SL)).opilo_6),0);
                                                }
                                            }
                                            ;
                                            // JavaLine 96 <== SourceLine 246
                                            {
                                                // BEGIN INSPECTION 
                                                _inspect_246_4522=((CLASS_BUILDER1_visiblegenerator)(_CUR._SL)).opq_3;
                                                if(_inspect_246_4522!=null) { // INSPECT _inspect_246_4522  type=ref(QUANTITY)
                                                    {
                                                        if(_VALUE((((CLASS_BUILDER1_visiblegenerator)(_CUR._SL)).opq_3.symb_1!=(null)))) {
                                                            {
                                                                // JavaLine 104 <== SourceLine 247
                                                                if(_VALUE(((_inspect_246_4522.kind_1!=(((char)8)))&((_inspect_246_4522.kind_1!=(((char)9))))))) {
                                                                    {
                                                                        // JavaLine 107 <== SourceLine 248
                                                                        _inspect_232_4520.outtext(CONC(new RTS_TXT(", opq:-"),((CLASS_BUILDER1_visiblegenerator)(_CUR._SL)).opq_3.symb_1.symbol));
                                                                        ;
                                                                    }
                                                                }
                                                                ;
                                                            }
                                                        }
                                                    }
                                                }
                                            } // END INSPECTION
                                        }
                                    }
                                    ;
                                }
                            }
                        }
                    } // END INSPECTION
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER1.sim","5 beforeDump",1,231,10,232,12,233,14,246,27,232,37,233,42,234,47,235,53,236,55,237,58,238,61,239,66,240,71,241,76,242,81,243,84,244,89,245,96,246,104,247,107,248,130,250);
} // End of Procedure
