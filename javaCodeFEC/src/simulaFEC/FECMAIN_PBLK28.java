package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 10:00:08 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class FECMAIN_PBLK28 extends SCODMAIN {
    // PrefixedBlockDeclaration: Kind=9, BlockLevel=1, firstLine=27, lastLine=93, hasLocalClasses=false, System=true, detachUsed=false
public boolean isQPSystemBlock() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 70
    final RTS_LABEL _LABEL_PAS1INIT_SETem_5=new RTS_LABEL(this,5,1,"SETem"); // Local Label #1=SETem At PrefixLevel 5
    // JavaLine 12 <== SourceLine 47
    final RTS_LABEL _LABEL_FECMAIN_PBLK28_FINI_18=new RTS_LABEL(this,18,2,"FINI"); // Local Label #2=FINI At PrefixLevel 18
    // Declare locals as attributes
    // JavaLine 15 <== SourceLine 28
    public int numberoflines_18=0;
    // JavaLine 17 <== SourceLine 49
    public COMMON_outcodefile _inspect_49_4444_18=null;
    // JavaLine 19 <== SourceLine 54
    public BUILDER1_precheck0 _inspect_54_4445_18=null;
    public BUILDER2_normalattrfile _inspect_54_4446_18=null;
    public RTS_PRCQNT ENDCOMP_0() { return(new RTS_PRCQNT(this,FECMAIN_PBLK28_ENDCOMP.class)); }
    // Normal Constructor
    public FECMAIN_PBLK28(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public FECMAIN_PBLK28 _STM() {
        FECMAIN_PBLK28 _THIS=(FECMAIN_PBLK28)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,2); // For ByteCode Engineering
                // JavaLine 36 <== SourceLine 1322
                // BEGIN INNER PART
                // JavaLine 38 <== SourceLine 998
                // BEGIN INNER PART
                // JavaLine 40 <== SourceLine 2395
                // BEGIN INNER PART
                // JavaLine 42 <== SourceLine 89
                // BEGIN INNER PART
                // JavaLine 44 <== SourceLine 2697
                // BEGIN INNER PART
                // JavaLine 46 <== SourceLine 33
                L2NAME=RTS_ENVIRONMENT.getTextInfo(7);
                ;
                nscodename=RTS_ENVIRONMENT.getTextInfo(4);
                ;
                // JavaLine 51 <== SourceLine 37
                recomp=(RTS_ENVIRONMENT.getIntInfo(22)==(1));
                ;
                // JavaLine 54 <== SourceLine 38
                GenerateScode=(RTS_ENVIRONMENT.getIntInfo(1)==(1));
                ;
                // JavaLine 57 <== SourceLine 40
                timestamp=RTS_ENVIRONMENT.datetime();
                ;
                // JavaLine 60 <== SourceLine 41
                maxerrno_1=RTS_ENVIRONMENT.getIntInfo(4);
                ;
                // JavaLine 63 <== SourceLine 42
                GiveNotes=(RTS_ENVIRONMENT.getIntInfo(5)==(0));
                ;
                // JavaLine 66 <== SourceLine 43
                simob_level=RTS_ENVIRONMENT.getIntInfo(30);
                ;
                // JavaLine 69 <== SourceLine 44
                simob_descr=(simob_level>(0));
                ;
                // JavaLine 72 <== SourceLine 45
                simob_entity=(simob_level>=(2));
                ;
                simob_const=(simob_level>=(3));
                ;
                // JavaLine 77 <== SourceLine 50
                listname_5=RTS_ENVIRONMENT.getTextInfo(2);
                ;
                listlength=RTS_TXT.length(RTS_BASICIO.sysout().image);
                ;
                // JavaLine 82 <== SourceLine 51
                if(_VALUE(TRF_NE(listname_5,null))) {
                    {
                        // JavaLine 85 <== SourceLine 52
                        t_5=RTS_ENVIRONMENT.copy(copy(listname_5));
                        ;
                        t_5=RTS_ENVIRONMENT.lowcase(t_5);
                        ;
                        // JavaLine 90 <== SourceLine 53
                        if(_VALUE(_TXTREL_EQ(t_5,new RTS_TXT("sysout")))) {
                            listfile=RTS_BASICIO.sysout();
                        } else {
                            // JavaLine 94 <== SourceLine 54
                            {
                                // BEGIN INSPECTION 
                                _inspect_54_4511_5=new RTS_Printfile(_CTX,listname_5)._STM();
                                if(_inspect_54_4511_5!=null) { // INSPECT _inspect_54_4511_5
                                    // JavaLine 99 <== SourceLine 55
                                    {
                                        // JavaLine 101 <== SourceLine 54
                                        {
                                            // JavaLine 103 <== SourceLine 55
                                            listlength=RTS_ENVIRONMENT.getIntInfo(7);
                                            ;
                                            t_5=RTS_ENVIRONMENT.blanks(listlength);
                                            ;
                                            // JavaLine 108 <== SourceLine 56
                                            if(_VALUE((!(_inspect_54_4511_5.open(t_5))))) {
                                                {
                                                    // JavaLine 111 <== SourceLine 57
                                                    listlength=0;
                                                    ;
                                                    new ERRMSG_error1((_CUR),-366,listname_5);
                                                }
                                            } else {
                                                // JavaLine 117 <== SourceLine 58
                                                listfile=((RTS_Printfile)_inspect_54_4511_5);
                                            }
                                            ;
                                        }
                                    }
                                }
                            } // END INSPECTION
                        }
                        ;
                    }
                }
                ;
                // JavaLine 130 <== SourceLine 61
                listingon=(listfile!=(null));
                ;
                // JavaLine 133 <== SourceLine 65
                t_5=RTS_ENVIRONMENT.getTextInfo(16);
                ;
                // JavaLine 136 <== SourceLine 66
                while(RTS_TXT.more(t_5)) {
                    if(_VALUE((RTS_TXT.getchar(t_5)==(':')))) {
                        {
                            // JavaLine 140 <== SourceLine 67
                            if(_VALUE(RTS_TXT.more(t_5))) {
                                feoptions_5=RTS_ENVIRONMENT.copy(copy(RTS_TXT.sub(t_5,RTS_TXT.pos(t_5),((RTS_TXT.length(t_5)-(RTS_TXT.pos(t_5)))+(1)))));
                            }
                            ;
                            // JavaLine 145 <== SourceLine 68
                            t_5=RTS_TXT.sub(t_5,1,(RTS_TXT.pos(t_5)-(2)));
                            ;
                            _GOTO(_LABEL_PAS1INIT_SETem_5); // GOTO EVALUATED LABEL
                            ;
                        }
                    }
                }
                ;
                // JavaLine 154 <== SourceLine 70
                {
                    _SIM_LABEL(1); // DeclaredIn: PAS1INIT
                    new SCANNER_SetSelectors((_CUR),t_5,0);
                }
                ;
                // JavaLine 160 <== SourceLine 71
                while(RTS_TXT.more(feoptions_5)) {
                    new COMMON_setopt((_CUR),RTS_TXT.getchar(feoptions_5),'1');
                }
                ;
                // JavaLine 165 <== SourceLine 73
                termstatus='3';
                ;
                // JavaLine 168 <== SourceLine 74
                currentpass='1';
                ;
                // JavaLine 171 <== SourceLine 77
                leftintbuf=RTS_ENVIRONMENT.blanks(12);
                ;
                // JavaLine 174 <== SourceLine 78
                leftsintbuf=RTS_ENVIRONMENT.blanks(7);
                ;
                // JavaLine 177 <== SourceLine 2
                TAGTAB=new COMMON_TAGTABLE((_CUR))._STM();
                ;
                // JavaLine 180 <== SourceLine 6
                dummyBox=new COMMON_identsymbol((_CUR))._STM();
                ;
                // JavaLine 183 <== SourceLine 8
                dummyGroup=new COMMON_symbolgroup((_CUR))._STM();
                ;
                for(i_5=0;i_5<=255;i_5++) {
                    // JavaLine 187 <== SourceLine 9
                    dummyGroup.val.putELEMENT(dummyGroup.val.index(i_5),dummyBox);
                }
                ;
                for(i_5=0;i_5<=127;i_5++) {
                    // JavaLine 192 <== SourceLine 10
                    symtab.putELEMENT(symtab.index(i_5),dummyGroup);
                }
                ;
                // JavaLine 196 <== SourceLine 13
                symtab.putELEMENT(symtab.index(0),new COMMON_symbolgroup((_CUR))._STM());
                ;
                symtab.getELEMENT(0).val.putELEMENT(symtab.getELEMENT(0).val.index(0),dummyBox);
                ;
                // JavaLine 201 <== SourceLine 14
                for(boolean CB_14:new FOR_List(
                new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("boolean")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("character")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("short")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("integer")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("real")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("long")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("ref")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("text")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT(" pointer")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("value")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("label")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("procedure")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("array")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("no type")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("else")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("end")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("eqv")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("external")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("for")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("go")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("goto")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("hidden")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("if")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("imp")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("in")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("inner")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("inspect")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("do")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("is")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("class")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("record")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("begin")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("name")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("new")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("not")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("or")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("otherwise")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("prior")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("delay")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("protected")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("qua")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("reactivate")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("at")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("before")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("and")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("step")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("switch")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("activate")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("then")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("this")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("to")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("until")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("after")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("virtual")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("when")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("while")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("lt")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("eq")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("le")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("gt")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("ne")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("ge")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("comment")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("none")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("notext")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("true")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("false")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("detach")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("printfile")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("infile")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("\u005ferrid")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("\u005ftext")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("\u005fpredefmodule")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("match stat")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT(" record")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("c")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("pascal")); }})
               ,new FOR_SingleElt<RTS_TXT>(new RTS_NAME<RTS_TXT>(){ public RTS_TXT put(RTS_TXT x_){simsymbol=x_; return(x_);};  public RTS_TXT get(){return((RTS_TXT)simsymbol); }	},new RTS_NAME<RTS_TXT>() { public RTS_TXT get(){return(new RTS_TXT("library")); }})
                   )) { if(!CB_14) continue;
                    // JavaLine 282 <== SourceLine 103
                    {
                        hashlo=RTS_ENVIRONMENT._char(RTS_ENVIRONMENT.hash(simsymbol));
                        ;
                        // JavaLine 286 <== SourceLine 106
                        {
                            // BEGIN INSPECTION 
                            _inspect_106_4512_5=new COMMON_identsymbol((_CUR))._STM();
                            if(_inspect_106_4512_5!=null) { // INSPECT _inspect_106_4512_5
                                // JavaLine 291 <== SourceLine 107
                                {
                                    // JavaLine 293 <== SourceLine 106
                                    {
                                        // JavaLine 295 <== SourceLine 107
                                        _inspect_106_4512_5.symbol=simsymbol;
                                        ;
                                        // JavaLine 298 <== SourceLine 108
                                        _inspect_106_4512_5.idlo=identlo=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(identlo)+(1)));
                                        ;
                                        // JavaLine 301 <== SourceLine 109
                                        _inspect_106_4512_5.next=hashtab.getELEMENT(RTS_ENVIRONMENT.rank(hashlo));
                                        ;
                                        // JavaLine 304 <== SourceLine 110
                                        symtab.getELEMENT(0).val.putELEMENT(symtab.getELEMENT(0).val.index(RTS_ENVIRONMENT.rank(identlo)),hashtab.putELEMENT(hashtab.index(RTS_ENVIRONMENT.rank(hashlo)),((COMMON_symbolbox)_inspect_106_4512_5)));
                                        ;
                                        // JavaLine 307 <== SourceLine 112
                                        if(_VALUE(((_inspect_106_4512_5.next!=(null))&&((option.getELEMENT(RTS_ENVIRONMENT.rank('Y'))!=(((char)0))))))) {
                                            // JavaLine 309 <== SourceLine 113
                                            {
                                                // BEGIN INSPECTION 
                                                _inspect_113_4513_5=RTS_BASICIO.sysout();
                                                if(_inspect_113_4513_5!=null) { // INSPECT _inspect_113_4513_5
                                                    // JavaLine 314 <== SourceLine 114
                                                    {
                                                        // JavaLine 316 <== SourceLine 113
                                                        {
                                                            // JavaLine 318 <== SourceLine 114
                                                            _inspect_113_4513_5.outtext(CONC(CONC(CONC(new RTS_TXT("HASH: collision between "),simsymbol),new RTS_TXT(" and ")),_inspect_106_4512_5.next.symbol));
                                                            ;
                                                            // JavaLine 321 <== SourceLine 116
                                                            _inspect_113_4513_5.outimage();
                                                        }
                                                    }
                                                }
                                            } // END INSPECTION
                                        }
                                        ;
                                    }
                                }
                            }
                        } // END INSPECTION
                        ;
                    }
                }
                ;
                // JavaLine 337 <== SourceLine 122
                i_5=(RTS_ENVIRONMENT.rank(identlo)+(1));
                ;
                // JavaLine 340 <== SourceLine 123
                while((i_5<=(255))) {
                    {
                        // JavaLine 343 <== SourceLine 124
                        symtab.getELEMENT(0).val.putELEMENT(symtab.getELEMENT(0).val.index(i_5),dummyBox);
                        ;
                        i_5=(i_5+(1));
                    }
                }
                ;
                // JavaLine 350 <== SourceLine 126
                consthi=((char)128);
                ;
                // JavaLine 353 <== SourceLine 128
                simsymbol=new RTS_TXT("0");
                ;
                new COMMON_DEFCONST((_CUR));
                ;
                // JavaLine 358 <== SourceLine 130
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)1))),new RTS_TXT("BOOL"));
                ;
                // JavaLine 361 <== SourceLine 131
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)2))),new RTS_TXT("CHAR"));
                ;
                // JavaLine 364 <== SourceLine 132
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)3))),new RTS_TXT("SHOR"));
                ;
                // JavaLine 367 <== SourceLine 133
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)4))),new RTS_TXT("INTG"));
                ;
                // JavaLine 370 <== SourceLine 134
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)5))),new RTS_TXT("REAL"));
                ;
                // JavaLine 373 <== SourceLine 135
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)6))),new RTS_TXT("LONG"));
                ;
                // JavaLine 376 <== SourceLine 136
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)7))),new RTS_TXT(" REF"));
                ;
                // JavaLine 379 <== SourceLine 137
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)8))),new RTS_TXT("TEXT"));
                ;
                // JavaLine 382 <== SourceLine 138
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)9))),new RTS_TXT("PTR "));
                ;
                // JavaLine 385 <== SourceLine 139
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)10))),new RTS_TXT("VALU"));
                ;
                // JavaLine 388 <== SourceLine 140
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)11))),new RTS_TXT("LABE"));
                ;
                // JavaLine 391 <== SourceLine 141
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)12))),new RTS_TXT("PROC"));
                ;
                // JavaLine 394 <== SourceLine 142
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)13))),new RTS_TXT("ARRA"));
                ;
                // JavaLine 397 <== SourceLine 143
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)14))),new RTS_TXT("NOTY"));
                ;
                // JavaLine 400 <== SourceLine 144
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)15))),new RTS_TXT("ELSE"));
                ;
                // JavaLine 403 <== SourceLine 145
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)16))),new RTS_TXT(" END"));
                ;
                // JavaLine 406 <== SourceLine 146
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)17))),new RTS_TXT(" EQV"));
                ;
                // JavaLine 409 <== SourceLine 147
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)18))),new RTS_TXT("EXTR"));
                ;
                // JavaLine 412 <== SourceLine 148
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)19))),new RTS_TXT(" FOR"));
                ;
                // JavaLine 415 <== SourceLine 149
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)20))),new RTS_TXT("  GO"));
                ;
                // JavaLine 418 <== SourceLine 150
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)21))),new RTS_TXT("GOTO"));
                ;
                // JavaLine 421 <== SourceLine 151
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)22))),new RTS_TXT("HIDD"));
                ;
                // JavaLine 424 <== SourceLine 152
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)23))),new RTS_TXT("  IF"));
                ;
                // JavaLine 427 <== SourceLine 153
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)24))),new RTS_TXT(" IMP"));
                ;
                // JavaLine 430 <== SourceLine 154
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)25))),new RTS_TXT("  IN"));
                ;
                // JavaLine 433 <== SourceLine 155
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)26))),new RTS_TXT("INNE"));
                ;
                // JavaLine 436 <== SourceLine 156
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)27))),new RTS_TXT("INSP"));
                ;
                // JavaLine 439 <== SourceLine 157
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)28))),new RTS_TXT("  DO"));
                ;
                // JavaLine 442 <== SourceLine 158
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)29))),new RTS_TXT("  IS"));
                ;
                // JavaLine 445 <== SourceLine 159
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)30))),new RTS_TXT("CLAS"));
                ;
                // JavaLine 448 <== SourceLine 160
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)31))),new RTS_TXT("RCRD"));
                ;
                // JavaLine 451 <== SourceLine 161
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)32))),new RTS_TXT("BEGI"));
                ;
                // JavaLine 454 <== SourceLine 162
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('!')),new RTS_TXT("NAME"));
                ;
                // JavaLine 457 <== SourceLine 163
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('"')),new RTS_TXT(" NEW"));
                ;
                // JavaLine 460 <== SourceLine 164
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('#')),new RTS_TXT(" NOT"));
                ;
                // JavaLine 463 <== SourceLine 165
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('$')),new RTS_TXT("  OR"));
                ;
                // JavaLine 466 <== SourceLine 166
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('%')),new RTS_TXT("OTHW"));
                ;
                // JavaLine 469 <== SourceLine 167
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('&')),new RTS_TXT("PRIO"));
                ;
                // JavaLine 472 <== SourceLine 168
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)39))),new RTS_TXT("DELA"));
                ;
                // JavaLine 475 <== SourceLine 169
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('(')),new RTS_TXT("PRTC"));
                ;
                // JavaLine 478 <== SourceLine 170
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(')')),new RTS_TXT(" QUA"));
                ;
                // JavaLine 481 <== SourceLine 171
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('*')),new RTS_TXT("REAC"));
                ;
                // JavaLine 484 <== SourceLine 172
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('+')),new RTS_TXT("  AT"));
                ;
                // JavaLine 487 <== SourceLine 173
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(',')),new RTS_TXT("BEFO"));
                ;
                // JavaLine 490 <== SourceLine 174
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('-')),new RTS_TXT(" AND"));
                ;
                // JavaLine 493 <== SourceLine 175
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('.')),new RTS_TXT("STEP"));
                ;
                // JavaLine 496 <== SourceLine 176
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('/')),new RTS_TXT("SWIT"));
                ;
                // JavaLine 499 <== SourceLine 177
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('0')),new RTS_TXT("ACTV"));
                ;
                // JavaLine 502 <== SourceLine 178
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('1')),new RTS_TXT("THEN"));
                ;
                // JavaLine 505 <== SourceLine 179
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('2')),new RTS_TXT("THIS"));
                ;
                // JavaLine 508 <== SourceLine 180
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('3')),new RTS_TXT("  TO"));
                ;
                // JavaLine 511 <== SourceLine 181
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('4')),new RTS_TXT("UNTI"));
                ;
                // JavaLine 514 <== SourceLine 182
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('5')),new RTS_TXT("AFTR"));
                ;
                // JavaLine 517 <== SourceLine 183
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('6')),new RTS_TXT("VIRT"));
                ;
                // JavaLine 520 <== SourceLine 184
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('7')),new RTS_TXT("WHEN"));
                ;
                // JavaLine 523 <== SourceLine 185
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('8')),new RTS_TXT("WHIL"));
                ;
                // JavaLine 526 <== SourceLine 186
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('9')),new RTS_TXT("  LT"));
                ;
                // JavaLine 529 <== SourceLine 187
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(':')),new RTS_TXT("  EQ"));
                ;
                // JavaLine 532 <== SourceLine 188
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(';')),new RTS_TXT("  LE"));
                ;
                // JavaLine 535 <== SourceLine 189
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('<')),new RTS_TXT("  GT"));
                ;
                // JavaLine 538 <== SourceLine 190
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('=')),new RTS_TXT("  NE"));
                ;
                // JavaLine 541 <== SourceLine 191
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('>')),new RTS_TXT("  GE"));
                ;
                // JavaLine 544 <== SourceLine 192
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('?')),new RTS_TXT("COMN"));
                ;
                // JavaLine 547 <== SourceLine 193
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('@')),new RTS_TXT("NONE"));
                ;
                // JavaLine 550 <== SourceLine 194
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('A')),new RTS_TXT("NOTE"));
                ;
                // JavaLine 553 <== SourceLine 195
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('B')),new RTS_TXT("TRUE"));
                ;
                // JavaLine 556 <== SourceLine 196
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('C')),new RTS_TXT("FALS"));
                ;
                // JavaLine 559 <== SourceLine 197
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('D')),new RTS_TXT("RFEQ"));
                ;
                // JavaLine 562 <== SourceLine 198
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('E')),new RTS_TXT("RFNE"));
                ;
                // JavaLine 565 <== SourceLine 199
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('F')),new RTS_TXT("PLUS"));
                ;
                // JavaLine 568 <== SourceLine 200
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('G')),new RTS_TXT("MINU"));
                ;
                // JavaLine 571 <== SourceLine 201
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('H')),new RTS_TXT("MULT"));
                ;
                // JavaLine 574 <== SourceLine 202
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('I')),new RTS_TXT("SLAS"));
                ;
                // JavaLine 577 <== SourceLine 203
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('J')),new RTS_TXT("POWE"));
                ;
                // JavaLine 580 <== SourceLine 204
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('K')),new RTS_TXT("IDIV"));
                ;
                // JavaLine 583 <== SourceLine 205
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('L')),new RTS_TXT(" DOT"));
                ;
                // JavaLine 586 <== SourceLine 206
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('M')),new RTS_TXT("  CL"));
                ;
                // JavaLine 589 <== SourceLine 207
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('N')),new RTS_TXT("COMA"));
                ;
                // JavaLine 592 <== SourceLine 208
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('O')),new RTS_TXT("SMCL"));
                ;
                // JavaLine 595 <== SourceLine 209
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('P')),new RTS_TXT("LFPA"));
                ;
                // JavaLine 598 <== SourceLine 210
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('Q')),new RTS_TXT("RGPA"));
                ;
                // JavaLine 601 <== SourceLine 211
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('R')),new RTS_TXT("ASSG"));
                ;
                // JavaLine 604 <== SourceLine 212
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('S')),new RTS_TXT("DENO"));
                ;
                // JavaLine 607 <== SourceLine 213
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('T')),new RTS_TXT("CONC"));
                ;
                // JavaLine 610 <== SourceLine 214
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('U')),new RTS_TXT("CAND"));
                ;
                // JavaLine 613 <== SourceLine 215
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('V')),new RTS_TXT(" COR"));
                ;
                // JavaLine 616 <== SourceLine 216
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('W')),new RTS_TXT("CASE"));
                ;
                // JavaLine 619 <== SourceLine 217
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('X')),new RTS_TXT(" EOP"));
                ;
                // JavaLine 622 <== SourceLine 218
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('Y')),new RTS_TXT("ROPD"));
                ;
                // JavaLine 625 <== SourceLine 219
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('Z')),new RTS_TXT(" IDN"));
                ;
                // JavaLine 628 <== SourceLine 220
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('[')),new RTS_TXT("CONS"));
                ;
                // JavaLine 631 <== SourceLine 221
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('\\')),new RTS_TXT("BLKB"));
                ;
                // JavaLine 634 <== SourceLine 222
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(']')),new RTS_TXT("BPRF"));
                ;
                // JavaLine 637 <== SourceLine 223
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('^')),new RTS_TXT("DCLI"));
                ;
                // JavaLine 640 <== SourceLine 224
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('_')),new RTS_TXT("FRMP"));
                ;
                // JavaLine 643 <== SourceLine 225
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('`')),new RTS_TXT("ABTE"));
                ;
                // JavaLine 646 <== SourceLine 226
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('a')),new RTS_TXT("ACTE"));
                ;
                // JavaLine 649 <== SourceLine 227
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('b')),new RTS_TXT("ARGE"));
                ;
                // JavaLine 652 <== SourceLine 228
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('c')),new RTS_TXT("ARDE"));
                ;
                // JavaLine 655 <== SourceLine 229
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('d')),new RTS_TXT("ASGE"));
                ;
                // JavaLine 658 <== SourceLine 230
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('e')),new RTS_TXT("BLNO"));
                ;
                // JavaLine 661 <== SourceLine 231
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('f')),new RTS_TXT("BNDE"));
                ;
                // JavaLine 664 <== SourceLine 232
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('g')),new RTS_TXT("BREC"));
                ;
                // JavaLine 667 <== SourceLine 233
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('h')),new RTS_TXT("CAPE"));
                ;
                // JavaLine 670 <== SourceLine 234
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('i')),new RTS_TXT("CONB"));
                ;
                // JavaLine 673 <== SourceLine 235
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('j')),new RTS_TXT("CONE"));
                ;
                // JavaLine 676 <== SourceLine 236
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('k')),new RTS_TXT("CPRF"));
                ;
                // JavaLine 679 <== SourceLine 237
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('l')),new RTS_TXT("CSPC"));
                ;
                // JavaLine 682 <== SourceLine 238
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('m')),new RTS_TXT("DCLA"));
                ;
                // JavaLine 685 <== SourceLine 239
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('n')),new RTS_TXT("DCLC"));
                ;
                // JavaLine 688 <== SourceLine 240
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('o')),new RTS_TXT("DCLE"));
                ;
                // JavaLine 691 <== SourceLine 241
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('p')),new RTS_TXT("DCLP"));
                ;
                // JavaLine 694 <== SourceLine 242
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('q')),new RTS_TXT("DCLS"));
                ;
                // JavaLine 697 <== SourceLine 243
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('r')),new RTS_TXT("DIME"));
                ;
                // JavaLine 700 <== SourceLine 244
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('s')),new RTS_TXT("DOTP"));
                ;
                // JavaLine 703 <== SourceLine 245
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('t')),new RTS_TXT("EEXP"));
                ;
                // JavaLine 706 <== SourceLine 246
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('u')),new RTS_TXT("ECWI"));
                ;
                // JavaLine 709 <== SourceLine 247
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('v')),new RTS_TXT("ELME"));
                ;
                // JavaLine 712 <== SourceLine 248
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('w')),new RTS_TXT("ELSB"));
                ;
                // JavaLine 715 <== SourceLine 249
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('x')),new RTS_TXT("EPRM"));
                ;
                // JavaLine 718 <== SourceLine 250
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('y')),new RTS_TXT("EREC"));
                ;
                // JavaLine 721 <== SourceLine 251
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('z')),new RTS_TXT("ESTM"));
                ;
                // JavaLine 724 <== SourceLine 252
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('{')),new RTS_TXT("EXNM"));
                    ;
                    // JavaLine 727 <== SourceLine 253
                    DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('|')),new RTS_TXT("FASG"));
                    ;
                    // JavaLine 730 <== SourceLine 254
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('}')),new RTS_TXT("FDNO"));
                ;
                // JavaLine 733 <== SourceLine 255
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('~')),new RTS_TXT("FORE"));
                ;
                // JavaLine 736 <== SourceLine 256
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)127))),new RTS_TXT("FWHN"));
                ;
                // JavaLine 739 <== SourceLine 257
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)128))),new RTS_TXT(" GOE"));
                ;
                // JavaLine 742 <== SourceLine 258
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)129))),new RTS_TXT("IDNP"));
                ;
                // JavaLine 745 <== SourceLine 259
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)130))),new RTS_TXT("IFSB"));
                ;
                // JavaLine 748 <== SourceLine 260
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)131))),new RTS_TXT("IFSE"));
                ;
                // JavaLine 751 <== SourceLine 261
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)132))),new RTS_TXT("LANG"));
                ;
                // JavaLine 754 <== SourceLine 262
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)133))),new RTS_TXT("LINE"));
                ;
                // JavaLine 757 <== SourceLine 263
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)134))),new RTS_TXT("NEWP"));
                ;
                // JavaLine 760 <== SourceLine 264
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)135))),new RTS_TXT("OTHE"));
                ;
                // JavaLine 763 <== SourceLine 265
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)136))),new RTS_TXT("PRHI"));
                ;
                // JavaLine 766 <== SourceLine 266
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)137))),new RTS_TXT("PSPC"));
                ;
                // JavaLine 769 <== SourceLine 267
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)138))),new RTS_TXT("SCST"));
                ;
                // JavaLine 772 <== SourceLine 268
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)139))),new RTS_TXT("SIDN"));
                ;
                // JavaLine 775 <== SourceLine 269
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)140))),new RTS_TXT("SIMU"));
                ;
                // JavaLine 778 <== SourceLine 270
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)141))),new RTS_TXT("SSWA"));
                ;
                // JavaLine 781 <== SourceLine 271
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)142))),new RTS_TXT("SSWB"));
                ;
                // JavaLine 784 <== SourceLine 272
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)143))),new RTS_TXT("SWDE"));
                ;
                // JavaLine 787 <== SourceLine 273
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)144))),new RTS_TXT("SWEE"));
                ;
                // JavaLine 790 <== SourceLine 274
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)145))),new RTS_TXT("THSB"));
                ;
                // JavaLine 793 <== SourceLine 275
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)146))),new RTS_TXT("UMNS"));
                ;
                // JavaLine 796 <== SourceLine 276
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)147))),new RTS_TXT("UPLS"));
                ;
                // JavaLine 799 <== SourceLine 277
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)148))),new RTS_TXT("VSPC"));
                ;
                // JavaLine 802 <== SourceLine 89
                predefname=RTS_ENVIRONMENT.getTextInfo(19);
                ;
                // JavaLine 805 <== SourceLine 91
                dummygen_2=false;
                ;
                // JavaLine 808 <== SourceLine 96
                {
                    // BEGIN INSPECTION 
                    _inspect_96_4514_5=((PARSER_grammer)new PARSER_grammer((_CUR))._START());
                    if(_inspect_96_4514_5!=null) { // INSPECT _inspect_96_4514_5
                        // JavaLine 813 <== SourceLine 97
                        {
                            // JavaLine 815 <== SourceLine 96
                            {
                                // JavaLine 817 <== SourceLine 98
                                parser=((COMMON_component)_inspect_96_4514_5);
                                ;
                                // JavaLine 820 <== SourceLine 100
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)1))),((char)1));
                                ;
                                // JavaLine 823 <== SourceLine 101
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)2))),((char)1));
                                ;
                                // JavaLine 826 <== SourceLine 102
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)3))),((char)1));
                                ;
                                // JavaLine 829 <== SourceLine 103
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)4))),((char)1));
                                ;
                                // JavaLine 832 <== SourceLine 104
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)5))),((char)1));
                                ;
                                // JavaLine 835 <== SourceLine 105
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)6))),((char)1));
                                ;
                                // JavaLine 838 <== SourceLine 106
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)7))),((char)1));
                                ;
                                // JavaLine 841 <== SourceLine 107
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)8))),((char)1));
                                ;
                                // JavaLine 844 <== SourceLine 108
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)12))),((char)1));
                                ;
                                // JavaLine 847 <== SourceLine 109
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)13))),((char)1));
                                ;
                                // JavaLine 850 <== SourceLine 110
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)30))),((char)1));
                                ;
                                // JavaLine 853 <== SourceLine 111
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)31))),((char)1));
                                ;
                                // JavaLine 856 <== SourceLine 112
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('/')),((char)1));
                                ;
                                // JavaLine 859 <== SourceLine 113
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)18))),((char)1));
                                ;
                                // JavaLine 862 <== SourceLine 118
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('Y')),((char)2));
                                ;
                                // JavaLine 865 <== SourceLine 119
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('5')),((char)2));
                                ;
                                // JavaLine 868 <== SourceLine 120
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('1')),((char)2));
                                ;
                                // JavaLine 871 <== SourceLine 121
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('+')),((char)2));
                                ;
                                // JavaLine 874 <== SourceLine 122
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('4')),((char)2));
                                ;
                                // JavaLine 877 <== SourceLine 123
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(',')),((char)2));
                                ;
                                // JavaLine 880 <== SourceLine 124
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('7')),((char)2));
                                ;
                                // JavaLine 883 <== SourceLine 125
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)39))),((char)2));
                                ;
                                // JavaLine 886 <== SourceLine 126
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('O')),((char)2));
                                ;
                                // JavaLine 889 <== SourceLine 127
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('S')),((char)2));
                                ;
                                // JavaLine 892 <== SourceLine 128
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('X')),((char)2));
                                ;
                                // JavaLine 895 <== SourceLine 129
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)28))),((char)2));
                                ;
                                // JavaLine 898 <== SourceLine 130
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)16))),((char)2));
                                ;
                                // JavaLine 901 <== SourceLine 131
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)15))),((char)2));
                                ;
                                // JavaLine 904 <== SourceLine 132
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('Q')),((char)2));
                                ;
                                // JavaLine 907 <== SourceLine 133
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('%')),((char)2));
                                ;
                                // JavaLine 910 <== SourceLine 134
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('N')),((char)2));
                                ;
                                // JavaLine 913 <== SourceLine 135
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('&')),((char)2));
                                ;
                                // JavaLine 916 <== SourceLine 136
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('M')),((char)2));
                                ;
                                // JavaLine 919 <== SourceLine 137
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('.')),((char)2));
                                ;
                                // JavaLine 922 <== SourceLine 138
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('R')),((char)2));
                                ;
                                // JavaLine 925 <== SourceLine 147
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('F')),((char)3));
                                ;
                                // JavaLine 928 <== SourceLine 148
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('J')),((char)3));
                                ;
                                // JavaLine 931 <== SourceLine 149
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('G')),((char)3));
                                ;
                                // JavaLine 934 <== SourceLine 150
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('K')),((char)3));
                                ;
                                // JavaLine 937 <== SourceLine 151
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('H')),((char)3));
                                ;
                                // JavaLine 940 <== SourceLine 152
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('T')),((char)3));
                                ;
                                // JavaLine 943 <== SourceLine 153
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('I')),((char)3));
                                ;
                                // JavaLine 946 <== SourceLine 157
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(':')),((char)4));
                                ;
                                // JavaLine 949 <== SourceLine 158
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('9')),((char)4));
                                ;
                                // JavaLine 952 <== SourceLine 159
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('>')),((char)4));
                                ;
                                // JavaLine 955 <== SourceLine 160
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('=')),((char)4));
                                ;
                                // JavaLine 958 <== SourceLine 161
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('<')),((char)4));
                                ;
                                // JavaLine 961 <== SourceLine 162
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('D')),((char)4));
                                ;
                                // JavaLine 964 <== SourceLine 163
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(';')),((char)4));
                                ;
                                // JavaLine 967 <== SourceLine 164
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('E')),((char)4));
                                ;
                                // JavaLine 970 <== SourceLine 168
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('-')),((char)5));
                                ;
                                // JavaLine 973 <== SourceLine 169
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('$')),((char)5));
                                ;
                                // JavaLine 976 <== SourceLine 170
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)17))),((char)5));
                                ;
                                // JavaLine 979 <== SourceLine 171
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('U')),((char)5));
                                ;
                                // JavaLine 982 <== SourceLine 172
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)24))),((char)5));
                                ;
                                // JavaLine 985 <== SourceLine 173
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('V')),((char)5));
                                ;
                            }
                        }
                    }
                } // END INSPECTION
                ;
                // JavaLine 993 <== SourceLine 179
                call(parser,179);
                ;
                // JavaLine 996 <== SourceLine 185
                {
                    // BEGIN INSPECTION 
                    _inspect_185_4515_5=((SCANNER_recognizer)new SCANNER_recognizer((_CUR))._START());
                    if(_inspect_185_4515_5!=null) { // INSPECT _inspect_185_4515_5
                        // JavaLine 1001 <== SourceLine 186
                        {
                            // JavaLine 1003 <== SourceLine 185
                            {
                                // JavaLine 1005 <== SourceLine 186
                                lexScanner_2=((SCANNER_recognizer)(scanner=((COMMON_component)_inspect_185_4515_5)));
                                ;
                                _inspect_185_4515_5.hashbuf_1=RTS_ENVIRONMENT.blanks(180);
                                ;
                                for(i_5=35;i_5<=255;i_5++) {
                                    // JavaLine 1011 <== SourceLine 188
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)7));
                                }
                                ;
                                // JavaLine 1015 <== SourceLine 190
                                _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(0),_inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(127),((char)9)));
                                ;
                                for(i_5=1;i_5<=7;i_5++) {
                                    // JavaLine 1019 <== SourceLine 192
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)8));
                                }
                                ;
                                for(i_5=14;i_5<=31;i_5++) {
                                    // JavaLine 1024 <== SourceLine 193
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)8));
                                }
                                ;
                                for(i_5=8;i_5<=13;i_5++) {
                                    // JavaLine 1029 <== SourceLine 195
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)6));
                                }
                                ;
                                // JavaLine 1033 <== SourceLine 196
                                _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(32),((char)6));
                                ;
                                // JavaLine 1036 <== SourceLine 198
                                _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(33),((char)5));
                                ;
                                // JavaLine 1039 <== SourceLine 200
                                _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(34),((char)4));
                                ;
                                for(i_5=38;i_5<=47;i_5++) {
                                    // JavaLine 1043 <== SourceLine 201
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)4));
                                }
                                ;
                                for(i_5=58;i_5<=62;i_5++) {
                                    // JavaLine 1048 <== SourceLine 202
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)4));
                                }
                                ;
                                for(i_5=48;i_5<=57;i_5++) {
                                    // JavaLine 1053 <== SourceLine 204
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)2));
                                }
                                ;
                                for(i_5=65;i_5<=90;i_5++) {
                                    // JavaLine 1058 <== SourceLine 206
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)0));
                                }
                                ;
                                for(i_5=97;i_5<=122;i_5++) {
                                    // JavaLine 1063 <== SourceLine 207
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)0));
                                }
                                ;
                                // JavaLine 1067 <== SourceLine 209
                                _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(67),_inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(99),((char)1)));
                                ;
                                // JavaLine 1070 <== SourceLine 211
                                _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(95),((char)3));
                                ;
                                // JavaLine 1073 <== SourceLine 213
                                _inspect_185_4515_5.IdScanner_1=((SCANNER_recognizer_identifierScanner)new SCANNER_recognizer_identifierScanner(_inspect_185_4515_5)._START());
                                ;
                                // JavaLine 1076 <== SourceLine 214
                                _inspect_185_4515_5.unsignedInt_1=((SCANNER_recognizer_unsignedInteger)new SCANNER_recognizer_unsignedInteger(_inspect_185_4515_5)._START());
                                ;
                            }
                        }
                    }
                } // END INSPECTION
                ;
                // JavaLine 1084 <== SourceLine 220
                signiflength=255;
                ;
                // JavaLine 1087 <== SourceLine 221
                cursource_2=((SCANNER_SourceElt)new SCANNER_SourceElt((_CUR),false,RTS_ENVIRONMENT.getTextInfo(1))._START());
                ;
                // JavaLine 1090 <== SourceLine 222
                incrlnr_2=true;
                ;
                // JavaLine 1093 <== SourceLine 226
                if(_VALUE(TRF_EQ(L2NAME,null))) {
                    new ERRMSG_openerror((_CUR),new RTS_TXT(" *** SCRATCH FILE (L2) ***"));
                }
                ;
                // JavaLine 1098 <== SourceLine 227
                {
                    // BEGIN INSPECTION 
                    _inspect_227_4516_5=((SCANNER_L2Coder)new SCANNER_L2Coder((_CUR),L2NAME)._START());
                    if(_inspect_227_4516_5!=null) { // INSPECT _inspect_227_4516_5
                        // JavaLine 1103 <== SourceLine 228
                        {
                            // JavaLine 1105 <== SourceLine 227
                            {
                                // JavaLine 1107 <== SourceLine 228
                                P1coder_2=((SCANNER_L2Coder)_inspect_227_4516_5);
                                ;
                                coder=P1coder_2;
                                ;
                                // JavaLine 1112 <== SourceLine 232
                                brctab.putELEMENT(brctab.index(0),new COMMON_brctab2((_CUR))._STM());
                                ;
                                // JavaLine 1115 <== SourceLine 233
                                if(_VALUE((!((option.getELEMENT(RTS_ENVIRONMENT.rank('F'))!=(((char)0))))))) {
                                    {
                                        // JavaLine 1118 <== SourceLine 234
                                        {
                                            // BEGIN INSPECTION 
                                            _inspect_234_4517_5=new COMMON_brecord((_CUR))._STM();
                                            if(_inspect_234_4517_5!=null) { // INSPECT _inspect_234_4517_5
                                                // JavaLine 1123 <== SourceLine 235
                                                {
                                                    // JavaLine 1125 <== SourceLine 234
                                                    {
                                                        // JavaLine 1127 <== SourceLine 235
                                                        _inspect_234_4517_5.kind=((char)13);
                                                        ;
                                                        brctab.getELEMENT(0).val.putELEMENT(brctab.getELEMENT(0).val.index(0),((COMMON_brecord)_inspect_234_4517_5));
                                                        ;
                                                        // JavaLine 1132 <== SourceLine 236
                                                        {
                                                            // BEGIN INSPECTION 
                                                            _inspect_236_4518_5=new COMMON_quantity((_CUR))._STM();
                                                            if(_inspect_236_4518_5!=null) { // INSPECT _inspect_236_4518_5
                                                                // JavaLine 1137 <== SourceLine 237
                                                                {
                                                                    // JavaLine 1139 <== SourceLine 236
                                                                    {
                                                                        // JavaLine 1141 <== SourceLine 237
                                                                        _inspect_234_4517_5.fpar=((COMMON_quantity)_inspect_236_4518_5);
                                                                        ;
                                                                        // JavaLine 1144 <== SourceLine 238
                                                                        _inspect_236_4518_5.plev_1=1;
                                                                        ;
                                                                        // JavaLine 1147 <== SourceLine 239
                                                                        _inspect_236_4518_5.type_1=((char)14);
                                                                        ;
                                                                        _inspect_236_4518_5.kind_1=((char)5);
                                                                        ;
                                                                        // JavaLine 1152 <== SourceLine 240
                                                                        _inspect_236_4518_5.categ_1=((char)4);
                                                                        ;
                                                                        // JavaLine 1155 <== SourceLine 244
                                                                        _inspect_236_4518_5.symb_1=new COMMON_boxof((_CUR),((char)0),'I')._RESULT;
                                                                        ;
                                                                        // JavaLine 1158 <== SourceLine 245
                                                                        new COMMON_QTRC((_CUR),new RTS_TXT("PAS1INIT"),245,new RTS_TXT("NEW Quantity: "),_inspect_234_4517_5.fpar);
                                                                        ;
                                                                    }
                                                                }
                                                            }
                                                        } // END INSPECTION
                                                        ;
                                                    }
                                                }
                                            }
                                        } // END INSPECTION
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 1174 <== SourceLine 252
                                nextbllo=((char)1);
                                ;
                                // JavaLine 1177 <== SourceLine 253
                                new SCANNER_L2Coder_brecinit(_inspect_227_4516_5,((char)13));
                                ;
                            }
                        }
                    }
                } // END INSPECTION
                ;
                // JavaLine 1185 <== SourceLine 257
                // BEGIN INNER PART
                // JavaLine 1187 <== SourceLine 797
                // BEGIN INNER PART
                // JavaLine 1189 <== SourceLine 1883
                // BEGIN INNER PART
                // JavaLine 1191 <== SourceLine 2636
                // BEGIN INNER PART
                // JavaLine 1193 <== SourceLine 1664
                // BEGIN INNER PART
                // JavaLine 1195 <== SourceLine 311
                // BEGIN INNER PART
                // JavaLine 1197 <== SourceLine 903
                // BEGIN INNER PART
                // JavaLine 1199 <== SourceLine 371
                // BEGIN INNER PART
                // JavaLine 1201 <== SourceLine 1251
                // BEGIN INNER PART
                // JavaLine 1203 <== SourceLine 1444
                // BEGIN INNER PART
                // JavaLine 1205 <== SourceLine 494
                // BEGIN INNER PART
                // JavaLine 1207 <== SourceLine 646
                // BEGIN INNER PART
                // JavaLine 1209 <== SourceLine 3563
                // BEGIN INNER PART
                // BEGIN INNER PART
                // ENDOF INNER PART
                // JavaLine 1213 <== SourceLine 34
                numberoflines_18=new SCANINP_Pass1((_CUR))._RESULT;
                ;
                // JavaLine 1216 <== SourceLine 40
                new SCODMAIN_codegenerator((_CUR),nscodename)._START();
                ;
                // JavaLine 1219 <== SourceLine 41
                call(checker0_6,41);
                ;
                // JavaLine 1222 <== SourceLine 46
                {
                    _SIM_LABEL(2); // DeclaredIn: PBLK28
                    // JavaLine 1225 <== SourceLine 47
                    if(_VALUE((currentpass==('1')))) {
                        new SCANNER_ClosePass1((_CUR));
                    } else {
                        // JavaLine 1229 <== SourceLine 48
                        {
                            // JavaLine 1231 <== SourceLine 49
                            {
                                // BEGIN INSPECTION 
                                _inspect_49_4444_18=coder;
                                if(_inspect_49_4444_18 instanceof BUILDER1_visiblegenerator) { // WHEN BUILDER1_visiblegenerator DO 
                                    // JavaLine 1236 <== SourceLine 50
                                    {
                                        // JavaLine 1238 <== SourceLine 49
                                        {
                                            // JavaLine 1240 <== SourceLine 50
                                            if(_VALUE((((BUILDER1_visiblegenerator)(_inspect_49_4444_18)).SCF_4==(null)))) {
                                                {
                                                    // JavaLine 1243 <== SourceLine 51
                                                    if(_VALUE((termstatus<('3')))) {
                                                        termstatus='3';
                                                    }
                                                }
                                            } else {
                                                // JavaLine 1249 <== SourceLine 52
                                                ((BUILDER1_visiblegenerator)(_inspect_49_4444_18)).SCF_4.close();
                                            }
                                            ;
                                        }
                                    }
                                }
                            } // END INSPECTION
                            ;
                            // JavaLine 1258 <== SourceLine 54
                            {
                                // BEGIN INSPECTION 
                                _inspect_54_4445_18=checker0_6;
                                if(_inspect_54_4445_18 instanceof CHECKER2_semchecker) { // WHEN CHECKER2_semchecker DO 
                                    {
                                        {
                                            // BEGIN INSPECTION 
                                            _inspect_54_4446_18=Afile_7;
                                            if(_inspect_54_4446_18!=null) { // INSPECT _inspect_54_4446_18
                                                // JavaLine 1268 <== SourceLine 55
                                                {
                                                    // JavaLine 1270 <== SourceLine 54
                                                    {
                                                        // JavaLine 1272 <== SourceLine 55
                                                        if(_VALUE((_inspect_54_4446_18.AOF!=(null)))) {
                                                            _inspect_54_4446_18.AOF.close();
                                                        }
                                                        ;
                                                        // JavaLine 1277 <== SourceLine 56
                                                        if(_VALUE((_inspect_54_4446_18.CURF!=(null)))) {
                                                            _inspect_54_4446_18.CURF.close();
                                                        }
                                                        ;
                                                    }
                                                }
                                            }
                                        } // END INSPECTION
                                    }
                                }
                            } // END INSPECTION
                            ;
                        }
                    }
                }
                ;
                // JavaLine 1294 <== SourceLine 60
                if(_VALUE((L2INPT!=(null)))) {
                    L2INPT.close();
                }
                ;
                // JavaLine 1299 <== SourceLine 61
                if(_VALUE((listfile!=(null)))) {
                    {
                        if(_VALUE((listfile!=(RTS_BASICIO.sysout())))) {
                            // JavaLine 1303 <== SourceLine 62
                            listfile.close();
                        }
                    }
                }
                ;
                // JavaLine 1309 <== SourceLine 65
                if(_VALUE((numerrfound>(0)))) {
                    // JavaLine 1311 <== SourceLine 66
                    {
                        RTS_BASICIO.sysout().outimage();
                        ;
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("   NUMBER OF ERRORS:   "));
                        ;
                        // JavaLine 1317 <== SourceLine 67
                        RTS_BASICIO.sysout().outint(numerrfound,0);
                        ;
                        RTS_BASICIO.sysout().outimage();
                        ;
                        // JavaLine 1322 <== SourceLine 68
                        if(_VALUE((termstatus<('4')))) {
                            termstatus='4';
                        }
                        ;
                    }
                }
                ;
                // JavaLine 1330 <== SourceLine 70
                if(_VALUE((numwarnfound_1>(0)))) {
                    // JavaLine 1332 <== SourceLine 71
                    {
                        RTS_BASICIO.sysout().outtext(new RTS_TXT("   NUMBER OF WARNINGS: "));
                        ;
                        // JavaLine 1336 <== SourceLine 72
                        RTS_BASICIO.sysout().outint(numwarnfound_1,0);
                        ;
                        RTS_BASICIO.sysout().outimage();
                        ;
                    }
                }
                ;
                // JavaLine 1344 <== SourceLine 81
                if(_VALUE((ERRORFILE_1!=(null)))) {
                    ERRORFILE_1.close();
                }
                ;
                // JavaLine 1349 <== SourceLine 84
                if(_VALUE(((listfile!=(null))&&((listfile!=(RTS_BASICIO.sysout())))))) {
                    // JavaLine 1351 <== SourceLine 85
                    listfile.close();
                }
                ;
                // JavaLine 1355 <== SourceLine 87
                RTS_ENVIRONMENT.giveIntInfo(1,(RTS_ENVIRONMENT.rank(termstatus)-(48)));
                ;
                // JavaLine 1358 <== SourceLine 88
                RTS_ENVIRONMENT.giveIntInfo(2,maxnumoftags);
                ;
                RTS_ENVIRONMENT.giveIntInfo(3,numberoflines_18);
                ;
                // JavaLine 1363 <== SourceLine 89
                RTS_ENVIRONMENT.giveIntInfo(4,numerrfound);
                ;
                // JavaLine 1366 <== SourceLine 91
                RTS_ENVIRONMENT.giveIntInfo(5,numwarnfound_1);
                ;
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                // ENDOF INNER PART
                break _LOOP;
            }
            catch(RTS_LABEL q) {
                RTS_RTObject._TREAT_GOTO_CATCH_BLOCK(_THIS, q);
                _JTX=q.index; continue _LOOP; // EG. GOTO Lx
            }
        }
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("FECMAIN.sim","9 PBLK28",10,70,12,47,15,28,17,49,19,54,36,1322,38,998,40,2395,42,89,44,2697,46,33,51,37,54,38,57,40,60,41,63,42,66,43,69,44,72,45,77,50,82,51,85,52,90,53,94,54,99,55,101,54,103,55,108,56,111,57,117,58,130,61,133,65,136,66,140,67,145,68,154,70,160,71,165,73,168,74,171,77,174,78,177,2,180,6,183,8,187,9,192,10,196,13,201,14,282,103,286,106,291,107,293,106,295,107,298,108,301,109,304,110,307,112,309,113,314,114,316,113,318,114,321,116,337,122,340,123,343,124,350,126,353,128,358,130,361,131,364,132,367,133,370,134,373,135,376,136,379,137,382,138,385,139,388,140,391,141,394,142,397,143,400,144,403,145,406,146,409,147,412,148,415,149,418,150,421,151,424,152,427,153,430,154,433,155,436,156,439,157,442,158,445,159,448,160,451,161,454,162,457,163,460,164,463,165,466,166,469,167,472,168,475,169,478,170,481,171,484,172,487,173,490,174,493,175,496,176,499,177,502,178,505,179,508,180,511,181,514,182,517,183,520,184,523,185,526,186,529,187,532,188,535,189,538,190,541,191,544,192,547,193,550,194,553,195,556,196,559,197,562,198,565,199,568,200,571,201,574,202,577,203,580,204,583,205,586,206,589,207,592,208,595,209,598,210,601,211,604,212,607,213,610,214,613,215,616,216,619,217,622,218,625,219,628,220,631,221,634,222,637,223,640,224,643,225,646,226,649,227,652,228,655,229,658,230,661,231,664,232,667,233,670,234,673,235,676,236,679,237,682,238,685,239,688,240,691,241,694,242,697,243,700,244,703,245,706,246,709,247,712,248,715,249,718,250,721,251,724,252,727,253,730,254,733,255,736,256,739,257,742,258,745,259,748,260,751,261,754,262,757,263,760,264,763,265,766,266,769,267,772,268,775,269,778,270,781,271,784,272,787,273,790,274,793,275,796,276,799,277,802,89,805,91,808,96,813,97,815,96,817,98,820,100,823,101,826,102,829,103,832,104,835,105,838,106,841,107,844,108,847,109,850,110,853,111,856,112,859,113,862,118,865,119,868,120,871,121,874,122,877,123,880,124,883,125,886,126,889,127,892,128,895,129,898,130,901,131,904,132,907,133,910,134,913,135,916,136,919,137,922,138,925,147,928,148,931,149,934,150,937,151,940,152,943,153,946,157,949,158,952,159,955,160,958,161,961,162,964,163,967,164,970,168,973,169,976,170,979,171,982,172,985,173,993,179,996,185,1001,186,1003,185,1005,186,1011,188,1015,190,1019,192,1024,193,1029,195,1033,196,1036,198,1039,200,1043,201,1048,202,1053,204,1058,206,1063,207,1067,209,1070,211,1073,213,1076,214,1084,220,1087,221,1090,222,1093,226,1098,227,1103,228,1105,227,1107,228,1112,232,1115,233,1118,234,1123,235,1125,234,1127,235,1132,236,1137,237,1139,236,1141,237,1144,238,1147,239,1152,240,1155,244,1158,245,1174,252,1177,253,1185,257,1187,797,1189,1883,1191,2636,1193,1664,1195,311,1197,903,1199,371,1201,1251,1203,1444,1205,494,1207,646,1209,3563,1213,34,1216,40,1219,41,1222,46,1225,47,1229,48,1231,49,1236,50,1238,49,1240,50,1243,51,1249,52,1258,54,1268,55,1270,54,1272,55,1277,56,1294,60,1299,61,1303,62,1309,65,1311,66,1317,67,1322,68,1330,70,1332,71,1336,72,1344,81,1349,84,1351,85,1355,87,1358,88,1363,89,1366,91,1396,93);
} // End of Class
