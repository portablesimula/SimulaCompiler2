// JavaLine 1 <== SourceLine 2180
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CHECKER1_semchecker1_parameter_emit extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=2180, lastLine=2276, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 2275
    final RTS_LABEL _LABEL_CHECKER1_semchecker1_parameter_emit_Block2183_NxtArg_0=new RTS_LABEL(this,0,1,"NxtArg"); // Local Label #1=NxtArg At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 2182
    public CHECKER1_semchecker1_exp _inspect_2182_4583=null;
    // Normal Constructor
    public CHECKER1_semchecker1_parameter_emit(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CHECKER1_semchecker1_parameter_emit _STM() {
        CHECKER1_semchecker1_parameter_emit _THIS=(CHECKER1_semchecker1_parameter_emit)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                {
                    // BEGIN INSPECTION 
                    _inspect_2182_4583=((CHECKER1_semchecker1_parameter)(_CUR._SL)).p_actual;
                    if(_inspect_2182_4583!=null) { // INSPECT _inspect_2182_4583
                        // JavaLine 34 <== SourceLine 2183
                        {
                            // JavaLine 36 <== SourceLine 2182
                            {
                                // JavaLine 38 <== SourceLine 2183
                                ((CHECKER1)(_CUR._SL._SL._SL)).coder.opq_3=((CHECKER1_semchecker1_parameter)(_CUR._SL)).p1_formal;
                                ;
                                // JavaLine 41 <== SourceLine 2184
                                if(_VALUE(((((CHECKER1_semchecker1_parameter)(_CUR._SL)).p1_formal==(null))||((((CHECKER1_semchecker1_parameter)(_CUR._SL)).p1_formal.categ_1==(((char)2))))))) {
                                    // JavaLine 43 <== SourceLine 2185
                                    {
                                        // JavaLine 45 <== SourceLine 2187
                                        if(_VALUE((_inspect_2182_4583.meaning!=(null)))) {
                                            {
                                                // JavaLine 48 <== SourceLine 2188
                                                if(_VALUE((_inspect_2182_4583.meaning.protect_1==(((char)2))))) {
                                                    {
                                                        // JavaLine 51 <== SourceLine 2189
                                                        if(_VALUE((_inspect_2182_4583.ctype==('Z')))) {
                                                            // JavaLine 53 <== SourceLine 2190
                                                            new CHECKER1_semchecker1_identifier_identError(((CHECKER1_semchecker1_identifier)(((CHECKER1_semchecker1_parameter)(_CUR._SL)).p_actual)),253);
                                                        } else {
                                                            // JavaLine 56 <== SourceLine 2191
                                                            if(_VALUE((_inspect_2182_4583.ctype==(((char)129))))) {
                                                                // JavaLine 58 <== SourceLine 2192
                                                                new CHECKER1_semchecker1_identifier_identError(((CHECKER1_semchecker1_argumented)(((CHECKER1_semchecker1_parameter)(_CUR._SL)).p_actual)).p1_ident,253);
                                                            }
                                                        }
                                                    }
                                                }
                                                ;
                                            }
                                        }
                                        ;
                                        // JavaLine 68 <== SourceLine 2202
                                        if(_VALUE(((_inspect_2182_4583.p_ch==('Z'))&&((_inspect_2182_4583.cl!=(((char)1))))))) {
                                            // JavaLine 70 <== SourceLine 2204
                                            {
                                                ((CHECKER1)(_CUR._SL._SL._SL)).opc_6='q';
                                                ;
                                                // JavaLine 74 <== SourceLine 2205
                                                ((CHECKER1_semchecker1)(_CUR._SL._SL)).actqty_2=_inspect_2182_4583.meaning;
                                                ;
                                            }
                                        } else {
                                            // JavaLine 79 <== SourceLine 2207
                                            if(_VALUE((_inspect_2182_4583.p_ch==('[')))) {
                                                {
                                                    // JavaLine 82 <== SourceLine 2208
                                                    ((CHECKER1)(_CUR._SL._SL._SL)).opc_6='q';
                                                    ;
                                                    call(((CHECKER1)(_CUR._SL._SL._SL)).coder,2208);
                                                    ;
                                                    // JavaLine 87 <== SourceLine 2209
                                                    _inspect_2182_4583.cl=((char)1);
                                                    ;
                                                    // JavaLine 90 <== SourceLine 2210
                                                    if(_inspect_2182_4583.type<((char)0) || _inspect_2182_4583.type>((char)15)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                                    switch(_inspect_2182_4583.type) { // BEGIN SWITCH STATEMENT
                                                        case 1: 
                                                        case 2: 
                                                        case 7: 
                                                        // JavaLine 96 <== SourceLine 2211
                                                        {
                                                            // JavaLine 98 <== SourceLine 2212
                                                            ((CHECKER1)(_CUR._SL._SL._SL)).opc_6=((char)138);
                                                            ;
                                                            ((CHECKER1)(_CUR._SL._SL._SL)).opt=_inspect_2182_4583.type;
                                                            ;
                                                            // JavaLine 103 <== SourceLine 2213
                                                            ((CHECKER1)(_CUR._SL._SL._SL)).opilo_6=((CHECKER1_semchecker1__const)(((CHECKER1_semchecker1_exp)_inspect_2182_4583))).ixlo_1;
                                                            ;
                                                            // JavaLine 106 <== SourceLine 2214
                                                            call(((CHECKER1)(_CUR._SL._SL._SL)).coder,2214);
                                                            ;
                                                            _GOTO(_LABEL_CHECKER1_semchecker1_parameter_emit_Block2183_NxtArg_0); // GOTO EVALUATED LABEL
                                                            ;
                                                        }
                                                        break;
                                                        case 8: 
                                                        // JavaLine 114 <== SourceLine 2216
                                                        {
                                                            // JavaLine 116 <== SourceLine 2217
                                                            if(_VALUE((((CHECKER1_semchecker1__const)(((CHECKER1_semchecker1_exp)_inspect_2182_4583))).ixhi_1==(((char)0))))) {
                                                                // JavaLine 118 <== SourceLine 2218
                                                                {
                                                                    // JavaLine 120 <== SourceLine 2219
                                                                    ((CHECKER1)(_CUR._SL._SL._SL)).opt=((char)8);
                                                                    ;
                                                                    ((CHECKER1)(_CUR._SL._SL._SL)).opc_6=((char)138);
                                                                    ;
                                                                }
                                                            } else {
                                                                // JavaLine 127 <== SourceLine 2220
                                                                {
                                                                    // JavaLine 129 <== SourceLine 2221
                                                                    ((CHECKER1)(_CUR._SL._SL._SL)).opc_6='[';
                                                                    ;
                                                                    // JavaLine 132 <== SourceLine 2224
                                                                    ((CHECKER1)(_CUR._SL._SL._SL)).opihi_6=((CHECKER1_semchecker1__const)(((CHECKER1_semchecker1_exp)_inspect_2182_4583))).ixhi_1;
                                                                    ;
                                                                    // JavaLine 135 <== SourceLine 2225
                                                                    ((CHECKER1)(_CUR._SL._SL._SL)).opilo_6=((CHECKER1_semchecker1__const)(((CHECKER1_semchecker1_exp)_inspect_2182_4583))).ixlo_1;
                                                                    ;
                                                                }
                                                            }
                                                            ;
                                                            // JavaLine 141 <== SourceLine 2227
                                                            call(((CHECKER1)(_CUR._SL._SL._SL)).coder,2227);
                                                            ;
                                                            _GOTO(_LABEL_CHECKER1_semchecker1_parameter_emit_Block2183_NxtArg_0); // GOTO EVALUATED LABEL
                                                            ;
                                                        }
                                                        break;
                                                        case 3: 
                                                        case 4: 
                                                        case 5: 
                                                        case 6: 
                                                        // JavaLine 152 <== SourceLine 2229
                                                        {
                                                            // JavaLine 154 <== SourceLine 2230
                                                            ((CHECKER1)(_CUR._SL._SL._SL)).opc_6=((char)138);
                                                            ;
                                                            ((CHECKER1)(_CUR._SL._SL._SL)).opt=_inspect_2182_4583.type;
                                                            ;
                                                            // JavaLine 159 <== SourceLine 2233
                                                            ((CHECKER1)(_CUR._SL._SL._SL)).opihi_6=((CHECKER1_semchecker1__const)(((CHECKER1_semchecker1_exp)_inspect_2182_4583))).ixhi_1;
                                                            ;
                                                            // JavaLine 162 <== SourceLine 2234
                                                            ((CHECKER1)(_CUR._SL._SL._SL)).opilo_6=((CHECKER1_semchecker1__const)(((CHECKER1_semchecker1_exp)_inspect_2182_4583))).ixlo_1;
                                                            ;
                                                            // JavaLine 165 <== SourceLine 2235
                                                            call(((CHECKER1)(_CUR._SL._SL._SL)).coder,2235);
                                                            ;
                                                            _GOTO(_LABEL_CHECKER1_semchecker1_parameter_emit_Block2183_NxtArg_0); // GOTO EVALUATED LABEL
                                                            ;
                                                        }
                                                        break;
                                                    } // END SWITCH STATEMENT
                                                    ;
                                                    // JavaLine 174 <== SourceLine 2238
                                                    _GOTO(_LABEL_CHECKER1_semchecker1_parameter_emit_Block2183_NxtArg_0); // GOTO EVALUATED LABEL
                                                    ;
                                                }
                                            } else {
                                                // JavaLine 179 <== SourceLine 2241
                                                ((CHECKER1)(_CUR._SL._SL._SL)).opc_6='^';
                                            }
                                        }
                                        ;
                                        // JavaLine 184 <== SourceLine 2242
                                        call(((CHECKER1)(_CUR._SL._SL._SL)).coder,2242);
                                        ;
                                        // JavaLine 187 <== SourceLine 2243
                                        _inspect_2182_4583.cl=(((((_inspect_2182_4583.ctype==('Z'))||((_inspect_2182_4583.ctype==(((char)129)))))&&((_inspect_2182_4583.cl!=(((char)1))))))?(((char)5)):(((char)1)));
                                        ;
                                        // JavaLine 190 <== SourceLine 2247
                                        _inspect_2182_4583.emit_0().CPF();
                                        ;
                                        // JavaLine 193 <== SourceLine 2248
                                        if(_VALUE((((_inspect_2182_4583.ctype==('Z'))||((_inspect_2182_4583.ctype==(((char)129)))))&&((_inspect_2182_4583.cl==(((char)5))))))) {
                                            ;
                                        } else {
                                            // JavaLine 197 <== SourceLine 2252
                                            {
                                                // JavaLine 199 <== SourceLine 2253
                                                ((CHECKER1)(_CUR._SL._SL._SL)).opc_6='Q';
                                                ;
                                                ((CHECKER1)(_CUR._SL._SL._SL)).opt=_inspect_2182_4583.type;
                                                ;
                                                // JavaLine 204 <== SourceLine 2254
                                                if(_VALUE((((CHECKER1)(_CUR._SL._SL._SL)).opt==(((char)7))))) {
                                                    ((CHECKER1)(_CUR._SL._SL._SL)).coder.opq_3=_inspect_2182_4583.qual;
                                                }
                                                ;
                                                // JavaLine 209 <== SourceLine 2255
                                                call(((CHECKER1)(_CUR._SL._SL._SL)).coder,2255);
                                                ;
                                            }
                                        }
                                        ;
                                    }
                                } else {
                                    // JavaLine 217 <== SourceLine 2258
                                    {
                                        // JavaLine 219 <== SourceLine 2260
                                        ((CHECKER1)(_CUR._SL._SL._SL)).opc_6='_';
                                        ;
                                        call(((CHECKER1)(_CUR._SL._SL._SL)).coder,2260);
                                        ;
                                        // JavaLine 224 <== SourceLine 2261
                                        if(_VALUE((_inspect_2182_4583.ctype==('Z')))) {
                                            {
                                                if(_VALUE((_inspect_2182_4583.cl!=(((char)5))))) {
                                                    // JavaLine 228 <== SourceLine 2262
                                                    _inspect_2182_4583.cl=((char)1);
                                                }
                                            }
                                        }
                                        ;
                                        // JavaLine 234 <== SourceLine 2263
                                        _inspect_2182_4583.emit_0().CPF();
                                        ;
                                        // JavaLine 237 <== SourceLine 2264
                                        if(_VALUE((((CHECKER1_semchecker1_parameter)(_CUR._SL)).p1_formal.kind_1==(((char)0))))) {
                                            {
                                                // JavaLine 240 <== SourceLine 2265
                                                ((CHECKER1_semchecker1)(_CUR._SL._SL)).ftype_2=((CHECKER1_semchecker1_parameter)(_CUR._SL)).p1_formal.type_1;
                                                ;
                                                // JavaLine 243 <== SourceLine 2266
                                                if(_VALUE((((CHECKER1_semchecker1_parameter)(_CUR._SL)).p1_formal.type_1!=(_inspect_2182_4583.type)))) {
                                                    // JavaLine 245 <== SourceLine 2267
                                                    new CHECKER1_semchecker1_MaybeConvert((_CUR._SL._SL),((CHECKER1_semchecker1_parameter)(_CUR._SL)).p1_formal.type_1,_inspect_2182_4583.type);
                                                } else {
                                                    // JavaLine 248 <== SourceLine 2268
                                                    if(_VALUE(((CHECKER1_semchecker1_parameter)(_CUR._SL)).implqua_1)) {
                                                        {
                                                            // JavaLine 251 <== SourceLine 2270
                                                            ((CHECKER1)(_CUR._SL._SL._SL)).opc_6='@';
                                                            ;
                                                            // JavaLine 254 <== SourceLine 2271
                                                            ((CHECKER1)(_CUR._SL._SL._SL)).coder.opq_3=((CHECKER1_semchecker1_parameter)(_CUR._SL)).p1_formal.prefqual_1;
                                                            ;
                                                            call(((CHECKER1)(_CUR._SL._SL._SL)).coder,2271);
                                                            ;
                                                        }
                                                    }
                                                }
                                                ;
                                            }
                                        }
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 269 <== SourceLine 2275
                                {
                                    _SIM_LABEL(1); // DeclaredIn: emit -> emit[externalIdent=CHECKER1_semchecker1_parameter_emit] Kind=5, QUAL=ProcedureDeclaration, HashCode=576294984
                                    if(_VALUE((((CHECKER1_semchecker1_parameter)(_CUR._SL)).nextarg!=(null)))) {
                                        ((CHECKER1_semchecker1_parameter)(_CUR._SL)).nextarg.emit_0().CPF();
                                    }
                                }
                                ;
                            }
                        }
                    }
                } // END INSPECTION
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","5 emit",1,2180,10,2275,13,2182,34,2183,36,2182,38,2183,41,2184,43,2185,45,2187,48,2188,51,2189,53,2190,56,2191,58,2192,68,2202,70,2204,74,2205,79,2207,82,2208,87,2209,90,2210,96,2211,98,2212,103,2213,106,2214,114,2216,116,2217,118,2218,120,2219,127,2220,129,2221,132,2224,135,2225,141,2227,152,2229,154,2230,159,2233,162,2234,165,2235,174,2238,179,2241,184,2242,187,2243,190,2247,193,2248,197,2252,199,2253,204,2254,209,2255,217,2258,219,2260,224,2261,228,2262,234,2263,237,2264,240,2265,243,2266,245,2267,248,2268,251,2270,254,2271,269,2275,290,2276);
} // End of Procedure
