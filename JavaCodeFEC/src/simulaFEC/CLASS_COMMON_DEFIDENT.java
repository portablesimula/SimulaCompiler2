// JavaLine 1 <== SourceLine 161
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:24 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_COMMON_DEFIDENT extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=161, lastLine=198, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 177
    final RTS_LABEL _LABEL_CLASS_COMMON_DEFIDENT_Block167_F_0=new RTS_LABEL(this,0,1,"F"); // Local Label #1=F At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 162
    public CLASS_COMMON_symbolgroup symhi=null;
    public int i=0;
    // JavaLine 16 <== SourceLine 163
    public CLASS_COMMON_symbolbox cursym=null;
    // JavaLine 18 <== SourceLine 177
    public CLASS_COMMON_identsymbol _inspect_177_4444=null;
    // Normal Constructor
    public CLASS_COMMON_DEFIDENT(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_COMMON_DEFIDENT _STM() {
        CLASS_COMMON_DEFIDENT _THIS=(CLASS_COMMON_DEFIDENT)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 35 <== SourceLine 164
                if(_VALUE(RTS_UTIL.TRF_EQ(((CLASS_COMMON)(_CUR._SL)).simsymbol,null))) {
                    ((CLASS_COMMON)(_CUR._SL)).hashhi=((CLASS_COMMON)(_CUR._SL)).hashlo=((char)0);
                } else {
                    // JavaLine 39 <== SourceLine 165
                    {
                        // JavaLine 41 <== SourceLine 167
                        ((CLASS_COMMON)(_CUR._SL)).hashlo=RTS_ENVIRONMENT._char(RTS_ENVIRONMENT.hash(RTS_ENVIRONMENT.lowcase(((CLASS_COMMON)(_CUR._SL)).simsymbol)));
                        ;
                        // JavaLine 44 <== SourceLine 168
                        cursym=((CLASS_COMMON)(_CUR._SL)).hashtab.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_COMMON)(_CUR._SL)).hashlo));
                        ;
                        // JavaLine 47 <== SourceLine 169
                        if(_VALUE((cursym!=(null)))) {
                            {
                                // JavaLine 50 <== SourceLine 170
                                while(RTS_UTIL._TXTREL_NE(cursym.symbol,((CLASS_COMMON)(_CUR._SL)).simsymbol)) {
                                    // JavaLine 52 <== SourceLine 171
                                    {
                                        // JavaLine 54 <== SourceLine 172
                                        if(_VALUE((cursym.next==(null)))) {
                                            _GOTO(_LABEL_CLASS_COMMON_DEFIDENT_Block167_F_0); // GOTO EVALUATED LABEL
                                        }
                                        ;
                                        // JavaLine 59 <== SourceLine 173
                                        cursym=cursym.next;
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 65 <== SourceLine 175
                                ((CLASS_COMMON)(_CUR._SL)).hashhi=cursym.idhi;
                                ;
                                ((CLASS_COMMON)(_CUR._SL)).hashlo=cursym.idlo;
                                ;
                            }
                        } else {
                            // JavaLine 72 <== SourceLine 177
                            {
                                _SIM_LABEL(1); // DeclaredIn: DEFIDENT -> DEFIDENT[externalIdent=CLASS_COMMON_DEFIDENT] Kind=5, QUAL=ProcedureDeclaration, HashCode=142666848
                                {
                                    // BEGIN INSPECTION 
                                    _inspect_177_4444=new CLASS_COMMON_identsymbol((_CUR._SL))._STM();
                                    if(_inspect_177_4444!=null) { // INSPECT _inspect_177_4444  type=ref(IDENTSYMBOL)
                                        // JavaLine 79 <== SourceLine 178
                                        {
                                            // JavaLine 81 <== SourceLine 177
                                            {
                                                // JavaLine 83 <== SourceLine 178
                                                _inspect_177_4444.symbol=RTS_ENVIRONMENT.copy(copy(((CLASS_COMMON)(_CUR._SL)).simsymbol));
                                                ;
                                                // JavaLine 86 <== SourceLine 179
                                                _inspect_177_4444.next=((CLASS_COMMON)(_CUR._SL)).hashtab.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_COMMON)(_CUR._SL)).hashlo));
                                                ;
                                                // JavaLine 89 <== SourceLine 180
                                                ((CLASS_COMMON)(_CUR._SL)).hashtab.putELEMENT(((CLASS_COMMON)(_CUR._SL)).hashtab.index(RTS_ENVIRONMENT.rank(((CLASS_COMMON)(_CUR._SL)).hashlo)),((CLASS_COMMON_symbolbox)_inspect_177_4444));
                                                ;
                                                // JavaLine 92 <== SourceLine 181
                                                if(_VALUE((((CLASS_COMMON)(_CUR._SL)).identlo==(((char)255))))) {
                                                    {
                                                        // JavaLine 95 <== SourceLine 182
                                                        _inspect_177_4444.idlo=((CLASS_COMMON)(_CUR._SL)).identlo=((CLASS_COMMON)(_CUR._SL)).hashlo=((char)0);
                                                        ;
                                                        // JavaLine 98 <== SourceLine 183
                                                        _inspect_177_4444.idhi=((CLASS_COMMON)(_CUR._SL)).hashhi=((CLASS_COMMON)(_CUR._SL)).identhi=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((CLASS_COMMON)(_CUR._SL)).identhi)+(1)));
                                                    }
                                                } else {
                                                    // JavaLine 102 <== SourceLine 184
                                                    {
                                                        // JavaLine 104 <== SourceLine 185
                                                        _inspect_177_4444.idlo=((CLASS_COMMON)(_CUR._SL)).hashlo=((CLASS_COMMON)(_CUR._SL)).identlo=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((CLASS_COMMON)(_CUR._SL)).identlo)+(1)));
                                                        ;
                                                        // JavaLine 107 <== SourceLine 186
                                                        _inspect_177_4444.idhi=((CLASS_COMMON)(_CUR._SL)).hashhi=((CLASS_COMMON)(_CUR._SL)).identhi;
                                                    }
                                                }
                                                ;
                                                // JavaLine 112 <== SourceLine 187
                                                if(_VALUE(((_inspect_177_4444.idhi==(((CLASS_COMMON)(_CUR._SL)).consthi))&&((_inspect_177_4444.idlo>=(((CLASS_COMMON)(_CUR._SL)).constlo)))))) {
                                                    // JavaLine 114 <== SourceLine 189
                                                    ((CLASS_COMMON)(_CUR._SL)).COMMONerror_0().CPF().setPar(297)._ENT();
                                                }
                                                ;
                                                // JavaLine 118 <== SourceLine 190
                                                symhi=((CLASS_COMMON)(_CUR._SL)).symtab.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_177_4444.idhi));
                                                ;
                                                // JavaLine 121 <== SourceLine 191
                                                if(_VALUE((symhi==(((CLASS_COMMON)(_CUR._SL)).dummyGroup)))) {
                                                    {
                                                        // JavaLine 124 <== SourceLine 192
                                                        symhi=new CLASS_COMMON_symbolgroup((_CUR._SL))._STM();
                                                        ;
                                                        for(i=0;i<=255;i++) {
                                                            // JavaLine 128 <== SourceLine 193
                                                            symhi.val.putELEMENT(symhi.val.index(i),((CLASS_COMMON)(_CUR._SL)).dummyBox);
                                                        }
                                                        ;
                                                        // JavaLine 132 <== SourceLine 194
                                                        ((CLASS_COMMON)(_CUR._SL)).symtab.putELEMENT(((CLASS_COMMON)(_CUR._SL)).symtab.index(RTS_ENVIRONMENT.rank(_inspect_177_4444.idhi)),symhi);
                                                    }
                                                }
                                                ;
                                                // JavaLine 137 <== SourceLine 195
                                                symhi.val.putELEMENT(symhi.val.index(RTS_ENVIRONMENT.rank(_inspect_177_4444.idlo)),((CLASS_COMMON_symbolbox)_inspect_177_4444));
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","5 DEFIDENT",1,161,10,177,13,162,16,163,18,177,35,164,39,165,41,167,44,168,47,169,50,170,52,171,54,172,59,173,65,175,72,177,79,178,81,177,83,178,86,179,89,180,92,181,95,182,98,183,102,184,104,185,107,186,112,187,114,189,118,190,121,191,124,192,128,193,132,194,137,195,159,198);
} // End of Procedure
