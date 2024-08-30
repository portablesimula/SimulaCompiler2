// JavaLine 1 <== SourceLine 194
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:37 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER4_codegenerator4_procLIIDNlab extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=194, lastLine=249, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 241
    final RTS_LABEL _LABEL_CLASS_SCODER4_codegenerator4_procLIIDNlab_Block209_Block240_generallabel_0=new RTS_LABEL(this,0,1,"generallabel"); // Local Label #1=generallabel At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 205
    public int lablevel=0;
    public int conlev=0;
    // JavaLine 16 <== SourceLine 208
    public CLASS_COMMON_quantity _inspect_208_4658=null;
    // Normal Constructor
    public CLASS_SCODER4_codegenerator4_procLIIDNlab(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER4_codegenerator4_procLIIDNlab _STM() {
        CLASS_SCODER4_codegenerator4_procLIIDNlab _THIS=(CLASS_SCODER4_codegenerator4_procLIIDNlab)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                {
                    // BEGIN INSPECTION 
                    _inspect_208_4658=((CLASS_SCODER4_codegenerator4)(_CUR._SL)).opq_3;
                    if(_inspect_208_4658!=null) { // INSPECT _inspect_208_4658  type=ref(QUANTITY)
                        // JavaLine 37 <== SourceLine 209
                        {
                            // JavaLine 39 <== SourceLine 208
                            {
                                // JavaLine 41 <== SourceLine 209
                                if(_VALUE((((((CLASS_SCODER4)(_CUR._SL._SL)).inswitchdecl_6&&(((CLASS_SCODER4)(_CUR._SL._SL)).notinconditional_6))&&((_inspect_208_4658.categ_1!=(((char)6)))))&&((_inspect_208_4658.categ_1!=(((char)2))))))) {
                                    // JavaLine 43 <== SourceLine 211
                                    {
                                        // JavaLine 45 <== SourceLine 212
                                        lablevel=(RTS_ENVIRONMENT.rank(((CLASS_SCODER4_codegenerator4)(_CUR._SL)).curcall_6.encl_1.rtblev)-(RTS_ENVIRONMENT.rank(_inspect_208_4658.encl_1.rtblev)));
                                        ;
                                        // JavaLine 48 <== SourceLine 214
                                        if(_VALUE((_inspect_208_4658.categ_1==(((char)3))))) {
                                            {
                                                // JavaLine 51 <== SourceLine 215
                                                conlev=new CLASS_SCODER1_codegenerator1_conlevel((_CUR._SL),((CLASS_COMMON_quantity)_inspect_208_4658))._RESULT;
                                                ;
                                                // JavaLine 54 <== SourceLine 216
                                                new CLASS_SCODER4_codegenerator4_swteltconst((_CUR._SL),false,(_inspect_208_4658.ftag_1+(0)),lablevel,0,conlev);
                                                ;
                                            }
                                        } else {
                                            // JavaLine 59 <== SourceLine 220
                                            new CLASS_SCODER4_codegenerator4_swteltconst((_CUR._SL),false,0,lablevel,(_inspect_208_4658.ftag_1+(0)),0);
                                        }
                                        ;
                                    }
                                } else {
                                    // JavaLine 65 <== SourceLine 222
                                    if(_VALUE(RTS_UTIL._IS(((CLASS_SCODER4_codegenerator4)(_CUR._SL)).curcall_6,CLASS_COMMON_extquantity.class))) {
                                        {
                                            // JavaLine 68 <== SourceLine 223
                                            if(_VALUE((((CLASS_COMMON_extquantity)(((CLASS_SCODER4_codegenerator4)(_CUR._SL)).curcall_6)).clf_2==(((char)1))))) {
                                                {
                                                    // JavaLine 71 <== SourceLine 224
                                                    if(_VALUE((_inspect_208_4658.categ_1!=(((char)3))))) {
                                                        {
                                                            // JavaLine 74 <== SourceLine 225
                                                            new CLASS_ERRMSG_error1id((_CUR._SL._SL),329,new CLASS_COMMON_getBox((_CUR._SL._SL),((CLASS_SCODER4_codegenerator4)(_CUR._SL)).curcall_6.dim_1)._RESULT);
                                                            ;
                                                        }
                                                    } else {
                                                        // JavaLine 79 <== SourceLine 228
                                                        if(_VALUE((_inspect_208_4658.encl_1.blev!=(((CLASS_SCODER4)(_CUR._SL._SL)).cblev_6)))) {
                                                            {
                                                                // JavaLine 82 <== SourceLine 229
                                                                new CLASS_ERRMSG_error1id((_CUR._SL._SL),330,new CLASS_COMMON_getBox((_CUR._SL._SL),((CLASS_SCODER4_codegenerator4)(_CUR._SL)).curcall_6.dim_1)._RESULT);
                                                                ;
                                                            }
                                                        } else {
                                                            // JavaLine 87 <== SourceLine 232
                                                            {
                                                                // JavaLine 89 <== SourceLine 233
                                                                ((CLASS_SCODER4_codegenerator4)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\u0014")));
                                                                ;
                                                                // JavaLine 92 <== SourceLine 234
                                                                ((CLASS_SCODER4_codegenerator4)(_CUR._SL)).asd_4=(((CLASS_SCODER4_codegenerator4)(_CUR._SL)).asd_4+(1));
                                                                ;
                                                                // JavaLine 95 <== SourceLine 235
                                                                new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(_inspect_208_4658.ftag_1+(0)));
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                // JavaLine 102 <== SourceLine 237
                                                _GOTO(_LABEL_CLASS_SCODER4_codegenerator4_procLIIDNlab_Block209_Block240_generallabel_0); // GOTO EVALUATED LABEL
                                            }
                                            ;
                                        }
                                    } else {
                                        // JavaLine 108 <== SourceLine 239
                                        {
                                            // JavaLine 110 <== SourceLine 240
                                            {
                                                _SIM_LABEL(1); // DeclaredIn: procLIIDNlab -> procLIIDNlab[externalIdent=CLASS_SCODER4_codegenerator4_procLIIDNlab] Kind=5, QUAL=ProcedureDeclaration, HashCode=1071766272
                                                // JavaLine 113 <== SourceLine 241
                                                if(_VALUE(((CLASS_SCODER4)(_CUR._SL._SL)).ingotostmt_6)) {
                                                    ((CLASS_SCODER4)(_CUR._SL._SL)).generalgoto_6=true;
                                                } else {
                                                    // JavaLine 117 <== SourceLine 242
                                                    if(_VALUE(((CLASS_SCODER4)(_CUR._SL._SL)).inswitchdecl_6)) {
                                                        // JavaLine 119 <== SourceLine 243
                                                        new CLASS_ERRMSG_notimp((_CUR._SL._SL),new RTS_TXT("switch element requiring thunk"));
                                                    }
                                                }
                                            }
                                            ;
                                            // JavaLine 125 <== SourceLine 245
                                            new CLASS_SCODER2_codegenerator2_get_LABQNT((_CUR._SL));
                                            ;
                                        }
                                    }
                                }
                                ;
                            }
                        }
                    }
                } // END INSPECTION
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER4.sim","5 procLIIDNlab",1,194,10,241,13,205,16,208,37,209,39,208,41,209,43,211,45,212,48,214,51,215,54,216,59,220,65,222,68,223,71,224,74,225,79,228,82,229,87,232,89,233,92,234,95,235,102,237,108,239,110,240,113,241,117,242,119,243,125,245,146,249);
} // End of Procedure
