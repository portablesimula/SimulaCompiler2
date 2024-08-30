// JavaLine 1 <== SourceLine 57
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:38 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODMAIN_codegenerator_DirectIdentifierReference extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=57, lastLine=183, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 83
    final RTS_LABEL _LABEL_CLASS_SCODMAIN_codegenerator_DirectIdentifierReference_Block82_IIDNsimple_0=new RTS_LABEL(this,0,1,"IIDNsimple"); // Local Label #1=IIDNsimple At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 141
    public CLASS_COMMON_sembox _inspect_141_4673=null;
    // Normal Constructor
    public CLASS_SCODMAIN_codegenerator_DirectIdentifierReference(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODMAIN_codegenerator_DirectIdentifierReference _STM() {
        CLASS_SCODMAIN_codegenerator_DirectIdentifierReference _THIS=(CLASS_SCODMAIN_codegenerator_DirectIdentifierReference)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 30 <== SourceLine 59
                new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),59,CONC(new RTS_TXT("+++++++++++++++++++++++++++++++++++++++++++++ IDNT SWITCH: "),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).opq_3.kind_1))));
                ;
                // JavaLine 33 <== SourceLine 60
                if(((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).opq_3.kind_1<((char)0) || ((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).opq_3.kind_1>((char)13)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                switch(((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).opq_3.kind_1) { // BEGIN SWITCH STATEMENT
                    case 6: 
                    // JavaLine 37 <== SourceLine 61
                    {
                        // JavaLine 39 <== SourceLine 62
                        new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                        ;
                        // JavaLine 42 <== SourceLine 63
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),63,new RTS_TXT("REMOTE"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).opq_3.ftag_1+(0)))._RESULT);
                        ;
                        // JavaLine 45 <== SourceLine 64
                        ((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).outbyte(75);
                        ;
                        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).opq_3.ftag_1+(0)));
                        ;
                        // JavaLine 50 <== SourceLine 65
                        new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODMAIN"),65,new RTS_TXT(" +++++++++++++++++++++++ FORTSETT HER SEINERE !!!"));
                        ;
                        RTS_BASICIO.terminate_program();
                        ;
                        // JavaLine 55 <== SourceLine 67
                        _GOTO(((CLASS_SCODMAIN_codegenerator)(_CUR._SL))._LABEL_CLASS_SCODMAIN_codegenerator_Block192_Block196_Block415_Block432_PUSJ_0); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 1: 
                    case 5: 
                    // JavaLine 62 <== SourceLine 68
                    {
                        // JavaLine 64 <== SourceLine 69
                        if(_VALUE((((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).calldepth_6==(0)))) {
                            {
                                // JavaLine 67 <== SourceLine 70
                                ((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).calldepth_6=1;
                                ;
                                ((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).curcall_6=((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).opq_3;
                                ;
                                _GOTO(((CLASS_SCODMAIN_codegenerator)(_CUR._SL))._LABEL_CLASS_SCODMAIN_codegenerator_Block192_Block196_NXT_0); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 76 <== SourceLine 71
                        new CLASS_SCODER1_codegenerator1_pushcall((_CUR._SL));
                        ;
                        // JavaLine 79 <== SourceLine 73
                        _GOTO(((CLASS_SCODMAIN_codegenerator)(_CUR._SL))._LABEL_CLASS_SCODMAIN_codegenerator_Block192_Block196_NXT_0); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 2: 
                    // JavaLine 85 <== SourceLine 75
                    {
                        // JavaLine 87 <== SourceLine 76
                        if(_VALUE((((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).calldepth_6==(0)))) {
                            {
                                // JavaLine 90 <== SourceLine 77
                                ((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).calldepth_6=1;
                                ;
                                ((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).curcall_6=((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).opq_3;
                                ;
                                _GOTO(_LABEL_CLASS_SCODMAIN_codegenerator_DirectIdentifierReference_Block82_IIDNsimple_0); // GOTO EVALUATED LABEL
                                ;
                            }
                        }
                        ;
                        // JavaLine 100 <== SourceLine 78
                        new CLASS_SCODER1_codegenerator1_pushcall((_CUR._SL));
                        ;
                        // JavaLine 103 <== SourceLine 79
                        _GOTO(_LABEL_CLASS_SCODMAIN_codegenerator_DirectIdentifierReference_Block82_IIDNsimple_0); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 0: 
                    // JavaLine 109 <== SourceLine 81
                    {
                        // JavaLine 111 <== SourceLine 82
                        {
                            _SIM_LABEL(1); // DeclaredIn: DirectIdentifierReference -> DirectIdentifierReference[externalIdent=CLASS_SCODMAIN_codegenerator_DirectIdentifierReference] Kind=5, QUAL=ProcedureDeclaration, HashCode=979869740
                            // JavaLine 114 <== SourceLine 83
                            if(_VALUE((((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).opq_3.categ_1==(((char)2))))) {
                                {
                                    // JavaLine 117 <== SourceLine 84
                                    if(_VALUE((((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).opq_3.kind_1==(((char)0))))) {
                                        new CLASS_SCODER3_codegenerator3_fnp_acc_smp((_CUR._SL));
                                    } else {
                                        new CLASS_SCODER3_codegenerator3_fnp_acc_arr((_CUR._SL));
                                    }
                                    ;
                                    // JavaLine 124 <== SourceLine 85
                                    _GOTO(((CLASS_SCODMAIN_codegenerator)(_CUR._SL))._LABEL_CLASS_SCODMAIN_codegenerator_Block192_Block196_NXT_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                            }
                        }
                        ;
                        // JavaLine 131 <== SourceLine 129
                        new CLASS_SCODER1_codegenerator1_staticencl((_CUR._SL));
                        ;
                        // JavaLine 134 <== SourceLine 130
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),130,new RTS_TXT("REMOTEV"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).opq_3.ftag_1+(0)))._RESULT);
                        ;
                        // JavaLine 137 <== SourceLine 131
                        ((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).outbyte(150);
                        ;
                        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).opq_3.ftag_1+(0)));
                        ;
                        // JavaLine 142 <== SourceLine 132
                        _GOTO(((CLASS_SCODMAIN_codegenerator)(_CUR._SL))._LABEL_CLASS_SCODMAIN_codegenerator_Block192_Block196_NXT_0); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 3: 
                    // JavaLine 148 <== SourceLine 134
                    {
                        // JavaLine 150 <== SourceLine 135
                        if(_VALUE((((((CLASS_SCODMAIN)(_CUR._SL._SL)).ingotostmt_6&&(((CLASS_SCODMAIN)(_CUR._SL._SL)).notinconditional_6))&&((((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).opq_3.encl_1.blev==(((CLASS_SCODMAIN)(_CUR._SL._SL)).cblev_6))))&&((((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).opq_3.categ_1==(((char)3))))))) {
                            // JavaLine 152 <== SourceLine 137
                            {
                                // JavaLine 154 <== SourceLine 138
                                if(_VALUE((((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).opq_3.dim_1>=(0)))) {
                                    // JavaLine 156 <== SourceLine 139
                                    new CLASS_SCODER2_codegenerator2_forwardGOTO((_CUR._SL));
                                } else {
                                    // JavaLine 159 <== SourceLine 140
                                    if(_VALUE((((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).opq_3.plev_1>(1)))) {
                                        {
                                            // JavaLine 162 <== SourceLine 141
                                            {
                                                // BEGIN INSPECTION 
                                                _inspect_141_4673=((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).opq_3.prevmeaning;
                                                if(_inspect_141_4673!=null) { // INSPECT _inspect_141_4673  type=ref(SEMBOX)
                                                    // JavaLine 167 <== SourceLine 142
                                                    {
                                                        // JavaLine 169 <== SourceLine 141
                                                        {
                                                            // JavaLine 171 <== SourceLine 143
                                                            new CLASS_SCODER1_codegenerator1_outbjump((_CUR._SL),RTS_ENVIRONMENT.rank(((CLASS_COMMON_stackedi)(((CLASS_COMMON_sembox)_inspect_141_4673))).p1_rehi));
                                                            ;
                                                            // JavaLine 174 <== SourceLine 144
                                                            ((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).opq_3.prevmeaning=_inspect_141_4673.prevmeaning;
                                                            ;
                                                            ((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).opq_3.plev_1=(((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).opq_3.plev_1-(1));
                                                            ;
                                                        }
                                                    }
                                                }
                                            } // END INSPECTION
                                        }
                                    } else {
                                        // JavaLine 185 <== SourceLine 147
                                        {
                                            // JavaLine 187 <== SourceLine 148
                                            if(_VALUE((((CLASS_SCODMAIN)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('Y'))!=(((char)0))))) {
                                                // JavaLine 189 <== SourceLine 149
                                                new CLASS_SCODER1_codegenerator1_outTrace((_CUR._SL),CONC(new RTS_TXT("GOTO "),((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).opq_3.symb_1.symbol));
                                            }
                                            ;
                                            // JavaLine 193 <== SourceLine 150
                                            ((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\u0014")));
                                            ;
                                            // JavaLine 196 <== SourceLine 151
                                            new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).opq_3.ftag_1+(0)));
                                            ;
                                            // JavaLine 199 <== SourceLine 152
                                            ((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).outbyte(94);
                                            ;
                                        }
                                    }
                                }
                                ;
                                // JavaLine 206 <== SourceLine 154
                                new CLASS_SCODER0_codegenerator0_checkasdzero((_CUR._SL));
                                ;
                            }
                        } else {
                            // JavaLine 211 <== SourceLine 155
                            new CLASS_SCODER4_codegenerator4_procLIIDNlab((_CUR._SL));
                        }
                        ;
                        // JavaLine 215 <== SourceLine 156
                        _GOTO(((CLASS_SCODMAIN_codegenerator)(_CUR._SL))._LABEL_CLASS_SCODMAIN_codegenerator_Block192_Block196_NXT_0); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    case 4: 
                    // JavaLine 221 <== SourceLine 158
                    {
                        // JavaLine 223 <== SourceLine 164
                        if(_VALUE(((CLASS_SCODMAIN)(_CUR._SL._SL)).ingotostmt_6)) {
                            {
                                if(_VALUE(((CLASS_SCODMAIN)(_CUR._SL._SL)).notinconditional_6)) {
                                    {
                                        // JavaLine 228 <== SourceLine 165
                                        if(_VALUE((((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).opq_3.plev_1==(1)))) {
                                            {
                                                // JavaLine 231 <== SourceLine 166
                                                if(_VALUE((((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).opq_3.encl_1.blev==(((CLASS_SCODMAIN)(_CUR._SL._SL)).cblev_6)))) {
                                                    // JavaLine 233 <== SourceLine 167
                                                    {
                                                        // JavaLine 235 <== SourceLine 168
                                                        ((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).optmSwitch_10=true;
                                                        ;
                                                        // JavaLine 238 <== SourceLine 169
                                                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),169,new RTS_TXT("PUSH"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).opq_3.ftag_1+(0)))._RESULT);
                                                        ;
                                                        // JavaLine 241 <== SourceLine 170
                                                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODMAIN"),170,new RTS_TXT("SELECT"),new CLASS_SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\u0088"))._RESULT);
                                                        ;
                                                        // JavaLine 244 <== SourceLine 171
                                                        ((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).outbyte(80);
                                                        ;
                                                        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).opq_3.ftag_1+(0)));
                                                        ;
                                                        ((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).asd_4=(((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).asd_4+(1));
                                                        ;
                                                        // JavaLine 251 <== SourceLine 172
                                                        ((CLASS_SCODMAIN_codegenerator)(_CUR._SL)).outtext(CONC(new RTS_TXT("J"),new RTS_TXT("\u0000\u0088")));
                                                        ;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        ;
                        // JavaLine 263 <== SourceLine 179
                        _GOTO(((CLASS_SCODMAIN_codegenerator)(_CUR._SL))._LABEL_CLASS_SCODMAIN_codegenerator_Block192_Block196_Block415_Block432_PUSJ_0); // GOTO EVALUATED LABEL
                        ;
                    }
                    break;
                    default:
                    // JavaLine 269 <== SourceLine 181
                    new CLASS_BUILDER1_visiblegenerator_StopScode_1((_CUR._SL),((char)17),181);
                    break;
                } // END SWITCH STATEMENT
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODMAIN.sim","5 DirectIdentifierReference",1,57,10,83,13,141,30,59,33,60,37,61,39,62,42,63,45,64,50,65,55,67,62,68,64,69,67,70,76,71,79,73,85,75,87,76,90,77,100,78,103,79,109,81,111,82,114,83,117,84,124,85,131,129,134,130,137,131,142,132,148,134,150,135,152,137,154,138,156,139,159,140,162,141,167,142,169,141,171,143,174,144,185,147,187,148,189,149,193,150,196,151,199,152,206,154,211,155,215,156,221,158,223,164,228,165,231,166,233,167,235,168,238,169,241,170,244,171,251,172,263,179,269,181,283,183);
} // End of Procedure
