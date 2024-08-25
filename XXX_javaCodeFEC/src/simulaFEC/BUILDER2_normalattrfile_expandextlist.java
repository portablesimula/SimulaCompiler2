// JavaLine 1 <== SourceLine 232
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER2_normalattrfile_expandextlist extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=232, lastLine=317, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public COMMON_extbrecord p_module;
    public COMMON_brecord p_encl;
    // Declare local labels
    // JavaLine 12 <== SourceLine 252
    final RTS_LABEL _LABEL_BUILDER2_normalattrfile_expandextlist_Block247_Block252_GENQ_0=new RTS_LABEL(this,0,1,"GENQ"); // Local Label #1=GENQ At PrefixLevel 0
    // JavaLine 14 <== SourceLine 260
    final RTS_LABEL _LABEL_BUILDER2_normalattrfile_expandextlist_Block247_Block252_GENOQ_0=new RTS_LABEL(this,0,2,"GENOQ"); // Local Label #2=GENOQ At PrefixLevel 0
    // JavaLine 16 <== SourceLine 293
    final RTS_LABEL _LABEL_BUILDER2_normalattrfile_expandextlist_Block247_Block252_ExpDescr_0=new RTS_LABEL(this,0,3,"ExpDescr"); // Local Label #3=ExpDescr At PrefixLevel 0
    // JavaLine 18 <== SourceLine 312
    final RTS_LABEL _LABEL_BUILDER2_normalattrfile_expandextlist_EXIT_0=new RTS_LABEL(this,0,4,"EXIT"); // Local Label #4=EXIT At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 21 <== SourceLine 234
    public COMMON_extquantity cq=null;
    public COMMON_extquantity lq=null;
    public int overload=0;
    // JavaLine 25 <== SourceLine 235
    public boolean genqnt=false;
    // JavaLine 27 <== SourceLine 293
    public COMMON_brecord _inspect_293_4535=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public BUILDER2_normalattrfile_expandextlist setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_module=(COMMON_extbrecord)objectValue(param); break;
                case 1: p_encl=(COMMON_brecord)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public BUILDER2_normalattrfile_expandextlist(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public BUILDER2_normalattrfile_expandextlist(RTS_RTObject _SL,COMMON_extbrecord sp_module,COMMON_brecord sp_encl) {
        super(_SL);
        // Parameter assignment to locals
        this.p_module = sp_module;
        this.p_encl = sp_encl;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER2_normalattrfile_expandextlist _STM() {
        BUILDER2_normalattrfile_expandextlist _THIS=(BUILDER2_normalattrfile_expandextlist)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,4); // For ByteCode Engineering
                // JavaLine 63 <== SourceLine 240
                ((BUILDER2)(_CUR._SL._SL)).indent=(((BUILDER2)(_CUR._SL._SL)).indent+(1));
                ;
                // JavaLine 66 <== SourceLine 242
                new COMMON_attrfile_nextKey((_CUR._SL));
                ;
                // JavaLine 69 <== SourceLine 243
                overload=0;
                ;
                // JavaLine 72 <== SourceLine 245
                while((((BUILDER2_normalattrfile)(_CUR._SL)).key<(((char)240)))) {
                    {
                        // JavaLine 75 <== SourceLine 247
                        genqnt=new COMMON_attrfile_fetchquant((_CUR._SL))._RESULT;
                        ;
                        // JavaLine 78 <== SourceLine 249
                        if(_VALUE((overload>(0)))) {
                            // JavaLine 80 <== SourceLine 250
                            {
                                overload=(overload-(1));
                                ;
                                _GOTO(_LABEL_BUILDER2_normalattrfile_expandextlist_Block247_Block252_GENOQ_0); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 88 <== SourceLine 251
                        if(_VALUE(genqnt)) {
                            {
                                // JavaLine 91 <== SourceLine 252
                                {
                                    _SIM_LABEL(1); // DeclaredIn: expandextlist -> expandextlist[externalIdent=BUILDER2_normalattrfile_expandextlist] Kind=5, QUAL=ProcedureDeclaration, HashCode=42314793
                                    if(_VALUE((((BUILDER2_normalattrfile)(_CUR._SL)).xlongindic!=(((char)0))))) {
                                        {
                                            // JavaLine 96 <== SourceLine 253
                                            overload=RTS_ENVIRONMENT.rank(((BUILDER2_normalattrfile)(_CUR._SL)).xlongindic);
                                            ;
                                            // JavaLine 99 <== SourceLine 254
                                            if(_VALUE((overload>(10)))) {
                                                overload=(overload-((((overload>(20)))?(20):(10))));
                                            }
                                            ;
                                            // JavaLine 104 <== SourceLine 256
                                            if(_VALUE((((BUILDER2_normalattrfile)(_CUR._SL)).xclf==(((char)5))))) {
                                                // JavaLine 106 <== SourceLine 257
                                                overload=((overload+(overload))+(1));
                                            }
                                            ;
                                        }
                                    } else {
                                        // JavaLine 112 <== SourceLine 259
                                        if(_VALUE((((BUILDER2_normalattrfile)(_CUR._SL)).xclf==(((char)5))))) {
                                            overload=1;
                                        }
                                    }
                                }
                                ;
                                // JavaLine 119 <== SourceLine 260
                                {
                                    _SIM_LABEL(2); // DeclaredIn: expandextlist -> expandextlist[externalIdent=BUILDER2_normalattrfile_expandextlist] Kind=5, QUAL=ProcedureDeclaration, HashCode=42314793
                                    cq=((((((BUILDER2_normalattrfile)(_CUR._SL)).xcateg==(((char)4)))&&((((BUILDER2_normalattrfile)(_CUR._SL)).xclf!=(((char)1))))))?(new BUILDER1_newextquantbrec((_CUR._SL._SL),p_encl.blev,p_encl.rtblev,'B',((COMMON_extquantity)(p_module.declquant)))._RESULT):(new COMMON_extquantity((_CUR._SL._SL),p_module)._STM()));
                                }
                                ;
                                // JavaLine 125 <== SourceLine 265
                                new BUILDER2_normalattrfile_fillextquantity((_CUR._SL),cq);
                                ;
                                // JavaLine 128 <== SourceLine 267
                                cq.encl_1=p_encl;
                                ;
                                // JavaLine 131 <== SourceLine 268
                                if(_VALUE((cq.categ_1!=(((char)6))))) {
                                    {
                                        // JavaLine 134 <== SourceLine 269
                                        if(_VALUE((p_encl.fpar==(null)))) {
                                            p_encl.fpar=lq=cq;
                                        } else {
                                            // JavaLine 138 <== SourceLine 270
                                            if(_VALUE((lq!=(null)))) {
                                                lq=((COMMON_extquantity)(lq.next=cq));
                                            }
                                        }
                                        ;
                                        // JavaLine 144 <== SourceLine 273
                                        new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),273,CONC(CONC(CONC(CONC(new RTS_TXT("CHECK PAR-3 "),cq.symb_1.symbol),new RTS_TXT(" ")),new RTS_TXT("cq.categ=")),new COMMON_C_code((_CUR._SL._SL),cq.categ_1)._RESULT));
                                        ;
                                        // JavaLine 147 <== SourceLine 274
                                        if(_VALUE(((cq.categ_1!=(((char)3)))&&((cq.categ_1!=(((char)4))))))) {
                                            // JavaLine 149 <== SourceLine 276
                                            {
                                                // JavaLine 151 <== SourceLine 277
                                                new COMMON_QTRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),277,CONC(CONC(CONC(new RTS_TXT("NPAR+1: "),p_encl.declquant.symb_1.symbol),new RTS_TXT(".npar=")),RTS_ENVIRONMENT.edit(p_encl.npar)),cq);
                                                ;
                                                // JavaLine 154 <== SourceLine 278
                                                p_encl.npar=(p_encl.npar+(1));
                                                ;
                                            }
                                        }
                                        ;
                                        // JavaLine 160 <== SourceLine 280
                                        if(_VALUE((cq.kind_1==(((char)5))))) {
                                            p_encl.localclasses=true;
                                        }
                                        ;
                                    }
                                } else {
                                    // JavaLine 167 <== SourceLine 282
                                    {
                                        // JavaLine 169 <== SourceLine 283
                                        if(_VALUE((p_encl.favirt==(null)))) {
                                            p_encl.favirt=lq=cq;
                                        } else {
                                            // JavaLine 173 <== SourceLine 284
                                            lq=((COMMON_extquantity)(lq.next=cq));
                                        }
                                        ;
                                        // JavaLine 177 <== SourceLine 286
                                        if(_VALUE((((BUILDER2_normalattrfile)(_CUR._SL)).key==(((char)251))))) {
                                            _GOTO(_LABEL_BUILDER2_normalattrfile_expandextlist_Block247_Block252_ExpDescr_0); // GOTO EVALUATED LABEL
                                        }
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 185 <== SourceLine 289
                                if(_VALUE((((cq.categ_1==(((char)3)))||(((cq.categ_1==(((char)4)))&&((cq.descr_1==(null))))))&&(((cq.kind_1==(((char)1)))||((cq.kind_1==(((char)5))))))))) {
                                    // JavaLine 187 <== SourceLine 293
                                    {
                                        _SIM_LABEL(3); // DeclaredIn: expandextlist -> expandextlist[externalIdent=BUILDER2_normalattrfile_expandextlist] Kind=5, QUAL=ProcedureDeclaration, HashCode=42314793
                                        {
                                            // BEGIN INSPECTION 
                                            _inspect_293_4535=new COMMON_brecord((_CUR._SL._SL))._STM();
                                            if(_inspect_293_4535!=null) { // INSPECT _inspect_293_4535
                                                // JavaLine 194 <== SourceLine 294
                                                {
                                                    // JavaLine 196 <== SourceLine 293
                                                    {
                                                        // JavaLine 198 <== SourceLine 294
                                                        _inspect_293_4535.blev=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(p_encl.blev)+(1)));
                                                        ;
                                                        // JavaLine 201 <== SourceLine 295
                                                        _inspect_293_4535.rtblev=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(p_encl.rtblev)+(1)));
                                                        ;
                                                        // JavaLine 204 <== SourceLine 296
                                                        cq.descr_1=((COMMON_brecord)_inspect_293_4535);
                                                        ;
                                                        _inspect_293_4535.declquant=cq;
                                                        ;
                                                        _inspect_293_4535.kind=((BUILDER2_normalattrfile)(_CUR._SL)).xkind;
                                                        ;
                                                        // JavaLine 211 <== SourceLine 297
                                                        _inspect_293_4535.thisused=((BUILDER2_normalattrfile)(_CUR._SL)).xthisused;
                                                        ;
                                                        // JavaLine 214 <== SourceLine 300
                                                        _inspect_293_4535.inrtag=((BUILDER2_normalattrfile)(_CUR._SL)).xinrtag;
                                                        ;
                                                        _inspect_293_4535.hasCode=((BUILDER2_normalattrfile)(_CUR._SL)).xhascode;
                                                        ;
                                                        // JavaLine 219 <== SourceLine 302
                                                        if(_VALUE((((BUILDER2_normalattrfile)(_CUR._SL)).key==(((char)251))))) {
                                                            // JavaLine 221 <== SourceLine 303
                                                            new BUILDER2_normalattrfile_expandextlist((_CUR._SL),p_module,((COMMON_brecord)_inspect_293_4535));
                                                        }
                                                        ;
                                                        // JavaLine 225 <== SourceLine 304
                                                        new COMMON_QTRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),304,new RTS_TXT("NEW BRECORD "),_inspect_293_4535.declquant);
                                                        ;
                                                    }
                                                }
                                            }
                                        } // END INSPECTION
                                    }
                                }
                                ;
                            }
                        } else {
                            // JavaLine 237 <== SourceLine 308
                            if(_VALUE((((BUILDER2_normalattrfile)(_CUR._SL)).key==(((char)251))))) {
                                new BUILDER2_normalattrfile_skipList((_CUR._SL));
                            }
                        }
                        ;
                    }
                }
                ;
                // JavaLine 246 <== SourceLine 312
                {
                    _SIM_LABEL(4); // DeclaredIn: expandextlist
                    if(_VALUE((((BUILDER2_normalattrfile)(_CUR._SL)).key!=(((char)250))))) {
                        new BUILDER2_normalattrfile_expxerr((_CUR._SL),'E');
                    }
                }
                ;
                // JavaLine 254 <== SourceLine 313
                ((BUILDER2)(_CUR._SL._SL)).indent=(((BUILDER2)(_CUR._SL._SL)).indent-(1));
                ;
                // JavaLine 257 <== SourceLine 314
                new COMMON_attrfile_nextKey((_CUR._SL));
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER2.sim","5 expandextlist",1,232,12,252,14,260,16,293,18,312,21,234,25,235,27,293,63,240,66,242,69,243,72,245,75,247,78,249,80,250,88,251,91,252,96,253,99,254,104,256,106,257,112,259,119,260,125,265,128,267,131,268,134,269,138,270,144,273,147,274,149,276,151,277,154,278,160,280,167,282,169,283,173,284,177,286,185,289,187,293,194,294,196,293,198,294,201,295,204,296,211,297,214,300,219,302,221,303,225,304,237,308,246,312,254,313,257,314,269,317);
} // End of Procedure
