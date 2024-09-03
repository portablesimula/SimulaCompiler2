// JavaLine 1 <== SourceLine 41
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:52 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER1E_codegenerator1e_GenerateSequPPtags extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=41, lastLine=92, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_q;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 43
    public CLASS_COMMON_quantity qty=null;
    public CLASS_BUILDER1_extmodule eee=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCODER1E_codegenerator1e_GenerateSequPPtags setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_q=(CLASS_COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_SCODER1E_codegenerator1e_GenerateSequPPtags(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_SCODER1E_codegenerator1e_GenerateSequPPtags(RTS_RTObject _SL,CLASS_COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER1E_codegenerator1e_GenerateSequPPtags _STM() {
        // JavaLine 42 <== SourceLine 44
        if(_VALUE((((CLASS_SCODER1E)(_CUR._SL._SL)).simob_level>(3)))) {
            {
                // JavaLine 45 <== SourceLine 50
                if(_VALUE((((p_q.kind_1==(((char)1)))&((p_q.plev_1<(2))))|((p_q.kind_1==(((char)5))))))) {
                    {
                        // JavaLine 48 <== SourceLine 51
                        ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outbyte(4);
                        ;
                        // JavaLine 51 <== SourceLine 52
                        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(p_q.ftag_1+(-1)));
                        ;
                        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),3);
                    }
                }
                ;
            }
        }
        ;
        // JavaLine 61 <== SourceLine 55
        qty=p_q.descr_1.fpar;
        ;
        // JavaLine 64 <== SourceLine 56
        while((qty!=(null))) {
            {
                // JavaLine 67 <== SourceLine 58
                if(_VALUE(RTS_UTIL._IS(qty,CLASS_COMMON_quantity.class))) {
                    {
                        // JavaLine 70 <== SourceLine 59
                        if(_VALUE((((CLASS_SCODER1E)(_CUR._SL._SL)).simob_level>(3)))) {
                            {
                                // JavaLine 73 <== SourceLine 63
                                if(_VALUE((((qty.kind_1==(((char)1)))&&(((qty.categ_1==(((char)3)))||((qty.categ_1==(((char)4)))))))||((qty.kind_1==(((char)5))))))) {
                                    // JavaLine 75 <== SourceLine 66
                                    {
                                        // JavaLine 77 <== SourceLine 68
                                        new CLASS_BUILDER1_newTTag((_CUR._SL._SL),new RTS_TXT("xsobtag"));
                                        // JavaLine 79 <== SourceLine 69
                                        if(_VALUE(((CLASS_SCODER1E)(_CUR._SL._SL)).simob_descr)) {
                                            {
                                                // JavaLine 82 <== SourceLine 70
                                                ((CLASS_SCODER1E_codegenerator1e)(_CUR._SL)).outbyte(4);
                                                ;
                                                new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((CLASS_SCODER1E)(_CUR._SL._SL)).lastusedtag_6);
                                                ;
                                                // JavaLine 87 <== SourceLine 71
                                                new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),3);
                                            }
                                        }
                                        ;
                                    }
                                }
                                ;
                            }
                        }
                        ;
                        // JavaLine 98 <== SourceLine 75
                        if(_VALUE(RTS_UTIL._IS(qty.descr_1,CLASS_COMMON_extbrecord.class))) {
                            // JavaLine 100 <== SourceLine 76
                            {
                                // JavaLine 102 <== SourceLine 79
                                eee=((CLASS_SCODER1E)(_CUR._SL._SL)).firstextmodule_6;
                                ;
                                // JavaLine 105 <== SourceLine 80
                                while((eee!=(null))) {
                                    {
                                        // JavaLine 108 <== SourceLine 81
                                        if(_VALUE((eee.qty!=(qty)))) {
                                            eee=eee.next;
                                        } else {
                                            // JavaLine 112 <== SourceLine 82
                                            {
                                                // JavaLine 114 <== SourceLine 83
                                                eee.pptag=(qty.ftag_1+(1));
                                                ;
                                                // JavaLine 117 <== SourceLine 84
                                                eee=null;
                                                ;
                                            }
                                        }
                                        ;
                                    }
                                }
                                ;
                            }
                        }
                        ;
                        // JavaLine 129 <== SourceLine 88
                        qty=((CLASS_COMMON_quantity)(qty.next));
                        ;
                    }
                } else {
                    // JavaLine 134 <== SourceLine 90
                    qty=null;
                }
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER1E.sim","5 GenerateSequPPtags",1,41,11,43,42,44,45,50,48,51,51,52,61,55,64,56,67,58,70,59,73,63,75,66,77,68,79,69,82,70,87,71,98,75,100,76,102,79,105,80,108,81,112,82,114,83,117,84,129,88,134,90,143,92);
} // End of Procedure
