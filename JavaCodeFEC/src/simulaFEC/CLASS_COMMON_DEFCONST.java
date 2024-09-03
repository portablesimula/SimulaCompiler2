// JavaLine 1 <== SourceLine 202
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:45 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_COMMON_DEFCONST extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=202, lastLine=241, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 220
    final RTS_LABEL _LABEL_CLASS_COMMON_DEFCONST_Block208_F_0=new RTS_LABEL(this,0,1,"F"); // Local Label #1=F At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 203
    public int i=0;
    public CLASS_COMMON_symbolgroup symhi=null;
    // JavaLine 16 <== SourceLine 204
    public CLASS_COMMON_symbolbox cursym=null;
    // JavaLine 18 <== SourceLine 220
    public CLASS_COMMON_constsymbol _inspect_220_4445=null;
    // Normal Constructor
    public CLASS_COMMON_DEFCONST(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_COMMON_DEFCONST _STM() {
        CLASS_COMMON_DEFCONST _THIS=(CLASS_COMMON_DEFCONST)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 35 <== SourceLine 205
                if(_VALUE(RTS_UTIL.TRF_EQ(((CLASS_COMMON)(_CUR._SL)).simsymbol,null))) {
                    ((CLASS_COMMON)(_CUR._SL)).hashhi=((CLASS_COMMON)(_CUR._SL)).hashlo=((char)0);
                } else {
                    // JavaLine 39 <== SourceLine 206
                    {
                        // JavaLine 41 <== SourceLine 208
                        ((CLASS_COMMON)(_CUR._SL)).hashlo=RTS_ENVIRONMENT._char(RTS_ENVIRONMENT.hash(((CLASS_COMMON)(_CUR._SL)).simsymbol));
                        ;
                        // JavaLine 44 <== SourceLine 209
                        ((CLASS_COMMON)(_CUR._SL)).hashlo=(((((CLASS_COMMON)(_CUR._SL)).hashlo>=(((char)203))))?(RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((CLASS_COMMON)(_CUR._SL)).hashlo)-(203)))):(RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((CLASS_COMMON)(_CUR._SL)).hashlo)+(53)))));
                        ;
                        // JavaLine 47 <== SourceLine 211
                        cursym=((CLASS_COMMON)(_CUR._SL)).hashtab.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_COMMON)(_CUR._SL)).hashlo));
                        ;
                        // JavaLine 50 <== SourceLine 212
                        if(_VALUE((cursym!=(null)))) {
                            {
                                // JavaLine 53 <== SourceLine 213
                                while(RTS_UTIL._TXTREL_NE(cursym.symbol,((CLASS_COMMON)(_CUR._SL)).simsymbol)) {
                                    // JavaLine 55 <== SourceLine 214
                                    {
                                        // JavaLine 57 <== SourceLine 215
                                        if(_VALUE((cursym.next==(null)))) {
                                            _GOTO(_LABEL_CLASS_COMMON_DEFCONST_Block208_F_0); // GOTO EVALUATED LABEL
                                        }
                                        ;
                                        // JavaLine 62 <== SourceLine 216
                                        cursym=cursym.next;
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 68 <== SourceLine 218
                                ((CLASS_COMMON)(_CUR._SL)).hashhi=cursym.idhi;
                                ;
                                ((CLASS_COMMON)(_CUR._SL)).hashlo=cursym.idlo;
                                ;
                            }
                        } else {
                            // JavaLine 75 <== SourceLine 220
                            {
                                _SIM_LABEL(1); // DeclaredIn: DEFCONST -> DEFCONST[externalIdent=CLASS_COMMON_DEFCONST] Kind=5, QUAL=ProcedureDeclaration, HashCode=321142942
                                {
                                    // BEGIN INSPECTION 
                                    _inspect_220_4445=new CLASS_COMMON_constsymbol((_CUR._SL))._STM();
                                    if(_inspect_220_4445!=null) { // INSPECT _inspect_220_4445  type=ref(CONSTSYMBOL)
                                        // JavaLine 82 <== SourceLine 221
                                        {
                                            // JavaLine 84 <== SourceLine 220
                                            {
                                                // JavaLine 86 <== SourceLine 221
                                                _inspect_220_4445.symbol=RTS_ENVIRONMENT.copy(copy(((CLASS_COMMON)(_CUR._SL)).simsymbol));
                                                ;
                                                // JavaLine 89 <== SourceLine 222
                                                _inspect_220_4445.next=((CLASS_COMMON)(_CUR._SL)).hashtab.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_COMMON)(_CUR._SL)).hashlo));
                                                ;
                                                // JavaLine 92 <== SourceLine 223
                                                ((CLASS_COMMON)(_CUR._SL)).hashtab.putELEMENT(((CLASS_COMMON)(_CUR._SL)).hashtab.index(RTS_ENVIRONMENT.rank(((CLASS_COMMON)(_CUR._SL)).hashlo)),((CLASS_COMMON_symbolbox)_inspect_220_4445));
                                                ;
                                                // JavaLine 95 <== SourceLine 224
                                                if(_VALUE((((CLASS_COMMON)(_CUR._SL)).constlo==(((char)0))))) {
                                                    {
                                                        // JavaLine 98 <== SourceLine 225
                                                        _inspect_220_4445.idlo=((CLASS_COMMON)(_CUR._SL)).hashlo=((CLASS_COMMON)(_CUR._SL)).constlo=((char)255);
                                                        ;
                                                        // JavaLine 101 <== SourceLine 226
                                                        _inspect_220_4445.idhi=((CLASS_COMMON)(_CUR._SL)).hashhi=((CLASS_COMMON)(_CUR._SL)).consthi=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((CLASS_COMMON)(_CUR._SL)).consthi)-(1)));
                                                    }
                                                } else {
                                                    // JavaLine 105 <== SourceLine 227
                                                    {
                                                        // JavaLine 107 <== SourceLine 228
                                                        _inspect_220_4445.idlo=((CLASS_COMMON)(_CUR._SL)).hashlo=((CLASS_COMMON)(_CUR._SL)).constlo=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((CLASS_COMMON)(_CUR._SL)).constlo)-(1)));
                                                        ;
                                                        // JavaLine 110 <== SourceLine 229
                                                        _inspect_220_4445.idhi=((CLASS_COMMON)(_CUR._SL)).hashhi=((CLASS_COMMON)(_CUR._SL)).consthi;
                                                    }
                                                }
                                                ;
                                                // JavaLine 115 <== SourceLine 230
                                                if(_VALUE(((_inspect_220_4445.idhi==(((CLASS_COMMON)(_CUR._SL)).identhi))&&((_inspect_220_4445.idlo<=(((CLASS_COMMON)(_CUR._SL)).identlo)))))) {
                                                    // JavaLine 117 <== SourceLine 232
                                                    ((CLASS_COMMON)(_CUR._SL)).COMMONerror_0().CPF().setPar(297)._ENT();
                                                }
                                                ;
                                                // JavaLine 121 <== SourceLine 233
                                                symhi=((CLASS_COMMON)(_CUR._SL)).symtab.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_220_4445.idhi));
                                                ;
                                                // JavaLine 124 <== SourceLine 234
                                                if(_VALUE((symhi==(((CLASS_COMMON)(_CUR._SL)).dummyGroup)))) {
                                                    {
                                                        // JavaLine 127 <== SourceLine 235
                                                        symhi=new CLASS_COMMON_symbolgroup((_CUR._SL))._STM();
                                                        ;
                                                        for(i=0;i<=255;i++) {
                                                            // JavaLine 131 <== SourceLine 236
                                                            symhi.val.putELEMENT(symhi.val.index(i),((CLASS_COMMON)(_CUR._SL)).dummyBox);
                                                        }
                                                        ;
                                                        // JavaLine 135 <== SourceLine 237
                                                        ((CLASS_COMMON)(_CUR._SL)).symtab.putELEMENT(((CLASS_COMMON)(_CUR._SL)).symtab.index(RTS_ENVIRONMENT.rank(_inspect_220_4445.idhi)),symhi);
                                                    }
                                                }
                                                ;
                                                // JavaLine 140 <== SourceLine 238
                                                symhi.val.putELEMENT(symhi.val.index(RTS_ENVIRONMENT.rank(_inspect_220_4445.idlo)),((CLASS_COMMON_symbolbox)_inspect_220_4445));
                                                ;
                                            }
                                        }
                                    }
                                } // END INSPECTION
                            }
                        }
                        ;
                    }
                }
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","5 DEFCONST",1,202,10,220,13,203,16,204,18,220,35,205,39,206,41,208,44,209,47,211,50,212,53,213,55,214,57,215,62,216,68,218,75,220,82,221,84,220,86,221,89,222,92,223,95,224,98,225,101,226,105,227,107,228,110,229,115,230,117,232,121,233,124,234,127,235,131,236,135,237,140,238,162,241);
} // End of Procedure
