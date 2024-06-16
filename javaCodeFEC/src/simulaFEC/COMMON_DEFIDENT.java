// JavaLine 1 <== SourceLine 161
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:29 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class COMMON_DEFIDENT extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=161, lastLine=198, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 177
    final RTS_LABEL _LABEL_COMMON_DEFIDENT_CompoundStatement197_F_0=new RTS_LABEL(this,0,1,"F"); // Local Label #1=F At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 162
    public COMMON_symbolgroup symhi=null;
    public int i=0;
    // JavaLine 16 <== SourceLine 163
    public COMMON_symbolbox cursym=null;
    // JavaLine 18 <== SourceLine 177
    public COMMON_identsymbol _inspect_177_4444=null;
    // Normal Constructor
    public COMMON_DEFIDENT(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public COMMON_DEFIDENT _STM() {
        COMMON_DEFIDENT _THIS=(COMMON_DEFIDENT)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 35 <== SourceLine 164
                if(_VALUE(TRF_EQ(((COMMON)(_CUR._SL)).simsymbol,null))) {
                    ((COMMON)(_CUR._SL)).hashhi=((COMMON)(_CUR._SL)).hashlo=((char)0);
                } else {
                    // JavaLine 39 <== SourceLine 165
                    {
                        // JavaLine 41 <== SourceLine 167
                        ((COMMON)(_CUR._SL)).hashlo=RTS_ENVIRONMENT._char(RTS_ENVIRONMENT.hash(RTS_ENVIRONMENT.lowcase(((COMMON)(_CUR._SL)).simsymbol)));
                        ;
                        // JavaLine 44 <== SourceLine 168
                        cursym=((COMMON)(_CUR._SL)).hashtab.getELEMENT(RTS_ENVIRONMENT.rank(((COMMON)(_CUR._SL)).hashlo));
                        ;
                        // JavaLine 47 <== SourceLine 169
                        if(_VALUE((cursym!=(null)))) {
                            {
                                // JavaLine 50 <== SourceLine 170
                                while(_TXTREL_NE(cursym.symbol,((COMMON)(_CUR._SL)).simsymbol)) {
                                    // JavaLine 52 <== SourceLine 171
                                    {
                                        // JavaLine 54 <== SourceLine 172
                                        if(_VALUE((cursym.next==(null)))) {
                                            _GOTO(_LABEL_COMMON_DEFIDENT_CompoundStatement197_F_0); // GOTO EVALUATED LABEL
                                        }
                                        ;
                                        // JavaLine 59 <== SourceLine 173
                                        cursym=cursym.next;
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 65 <== SourceLine 175
                                ((COMMON)(_CUR._SL)).hashhi=cursym.idhi;
                                ;
                                ((COMMON)(_CUR._SL)).hashlo=cursym.idlo;
                                ;
                            }
                        } else {
                            // JavaLine 72 <== SourceLine 177
                            {
                                _SIM_LABEL(1); // DeclaredIn: DEFIDENT -> DEFIDENT[externalIdent=COMMON_DEFIDENT] Kind=5, QUAL=ProcedureDeclaration, HashCode=1975358023
                                {
                                    // BEGIN INSPECTION 
                                    _inspect_177_4444=new COMMON_identsymbol((_CUR._SL))._STM();
                                    if(_inspect_177_4444!=null) { // INSPECT _inspect_177_4444
                                        // JavaLine 79 <== SourceLine 178
                                        {
                                            // JavaLine 81 <== SourceLine 177
                                            {
                                                // JavaLine 83 <== SourceLine 178
                                                _inspect_177_4444.symbol=RTS_ENVIRONMENT.copy(copy(((COMMON)(_CUR._SL)).simsymbol));
                                                ;
                                                // JavaLine 86 <== SourceLine 179
                                                _inspect_177_4444.next=((COMMON)(_CUR._SL)).hashtab.getELEMENT(RTS_ENVIRONMENT.rank(((COMMON)(_CUR._SL)).hashlo));
                                                ;
                                                // JavaLine 89 <== SourceLine 180
                                                ((COMMON)(_CUR._SL)).hashtab.putELEMENT(((COMMON)(_CUR._SL)).hashtab.index(RTS_ENVIRONMENT.rank(((COMMON)(_CUR._SL)).hashlo)),((COMMON_symbolbox)_inspect_177_4444));
                                                ;
                                                // JavaLine 92 <== SourceLine 181
                                                if(_VALUE((((COMMON)(_CUR._SL)).identlo==(((char)255))))) {
                                                    {
                                                        // JavaLine 95 <== SourceLine 182
                                                        _inspect_177_4444.idlo=((COMMON)(_CUR._SL)).identlo=((COMMON)(_CUR._SL)).hashlo=((char)0);
                                                        ;
                                                        // JavaLine 98 <== SourceLine 183
                                                        _inspect_177_4444.idhi=((COMMON)(_CUR._SL)).hashhi=((COMMON)(_CUR._SL)).identhi=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((COMMON)(_CUR._SL)).identhi)+(1)));
                                                    }
                                                } else {
                                                    // JavaLine 102 <== SourceLine 184
                                                    {
                                                        // JavaLine 104 <== SourceLine 185
                                                        _inspect_177_4444.idlo=((COMMON)(_CUR._SL)).hashlo=((COMMON)(_CUR._SL)).identlo=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((COMMON)(_CUR._SL)).identlo)+(1)));
                                                        ;
                                                        // JavaLine 107 <== SourceLine 186
                                                        _inspect_177_4444.idhi=((COMMON)(_CUR._SL)).hashhi=((COMMON)(_CUR._SL)).identhi;
                                                    }
                                                }
                                                ;
                                                // JavaLine 112 <== SourceLine 187
                                                if(_VALUE(((_inspect_177_4444.idhi==(((COMMON)(_CUR._SL)).consthi))&&((_inspect_177_4444.idlo>=(((COMMON)(_CUR._SL)).constlo)))))) {
                                                    // JavaLine 114 <== SourceLine 189
                                                    ((COMMON)(_CUR._SL)).COMMONerror_0().CPF().setPar(297)._ENT();
                                                }
                                                ;
                                                // JavaLine 118 <== SourceLine 190
                                                symhi=((COMMON)(_CUR._SL)).symtab.getELEMENT(RTS_ENVIRONMENT.rank(_inspect_177_4444.idhi));
                                                ;
                                                // JavaLine 121 <== SourceLine 191
                                                if(_VALUE((symhi==(((COMMON)(_CUR._SL)).dummyGroup)))) {
                                                    {
                                                        // JavaLine 124 <== SourceLine 192
                                                        symhi=new COMMON_symbolgroup((_CUR._SL))._STM();
                                                        ;
                                                        for(i=0;i<=255;i++) {
                                                            // JavaLine 128 <== SourceLine 193
                                                            symhi.val.putELEMENT(symhi.val.index(i),((COMMON)(_CUR._SL)).dummyBox);
                                                        }
                                                        ;
                                                        // JavaLine 132 <== SourceLine 194
                                                        ((COMMON)(_CUR._SL)).symtab.putELEMENT(((COMMON)(_CUR._SL)).symtab.index(RTS_ENVIRONMENT.rank(_inspect_177_4444.idhi)),symhi);
                                                    }
                                                }
                                                ;
                                                // JavaLine 137 <== SourceLine 195
                                                symhi.val.putELEMENT(symhi.val.index(RTS_ENVIRONMENT.rank(_inspect_177_4444.idlo)),((COMMON_symbolbox)_inspect_177_4444));
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","5 DEFIDENT",1,161,10,177,13,162,16,163,18,177,35,164,39,165,41,167,44,168,47,169,50,170,52,171,54,172,59,173,65,175,72,177,79,178,81,177,83,178,86,179,89,180,92,181,95,182,98,183,102,184,104,185,107,186,112,187,114,189,118,190,121,191,124,192,128,193,132,194,137,195,159,198);
} // End of Procedure
