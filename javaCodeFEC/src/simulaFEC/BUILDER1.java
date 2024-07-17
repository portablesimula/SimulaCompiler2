// JavaLine 1 <== SourceLine 3
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class BUILDER1 extends PAS1INIT {
    // ClassDeclaration: Kind=8, BlockLevel=1, PrefixLevel=6, firstLine=3, lastLine=797, hasLocalClasses=true, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 70
    final RTS_LABEL _LABEL_PAS1INIT_SETem_5=new RTS_LABEL(this,5,1,"SETem"); // Local Label #1=SETem At PrefixLevel 5
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 43
    public boolean BoundCheck_6=false;
    public boolean NoneCheck_6=false;
    public boolean QuaCheck_6=false;
    public boolean ReuseProc_6=false;
    // JavaLine 18 <== SourceLine 44
    public boolean ingotostmt_6=false;
    // JavaLine 20 <== SourceLine 45
    public boolean inswitchdecl_6=false;
    // JavaLine 22 <== SourceLine 46
    public boolean generalgoto_6=false;
    // JavaLine 24 <== SourceLine 47
    public boolean notinconditional_6=false;
    // JavaLine 26 <== SourceLine 51
    public char opc_6=0;
    // JavaLine 28 <== SourceLine 52
    public char cblev_6=0;
    // JavaLine 30 <== SourceLine 53
    public char crtblev_6=0;
    // JavaLine 32 <== SourceLine 55
    public char qblev_6=0;
    // JavaLine 34 <== SourceLine 56
    public char stepfasthi_6=0;
    public char stepfastlo_6=0;
    public char opihi_6=0;
    public char opilo_6=0;
    // JavaLine 39 <== SourceLine 59
    public int ssnuma_6=0;
    // JavaLine 41 <== SourceLine 60
    public int lastusedtag_6=0;
    // JavaLine 43 <== SourceLine 61
    public int noofextmodules_6=0;
    // JavaLine 45 <== SourceLine 63
    public BUILDER1_extmodule firstextmodule_6=null;
    // JavaLine 47 <== SourceLine 64
    public BUILDER1_casedescr curcase_6=null;
    // JavaLine 49 <== SourceLine 308
    public BUILDER1_precheck0 checker0_6=null;
    // JavaLine 51 <== SourceLine 723
    public int nextexttag_6=0;
    // Normal Constructor
    public BUILDER1(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public BUILDER1 _STM() {
        BUILDER1 _THIS=(BUILDER1)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 66 <== SourceLine 1322
                // BEGIN INNER PART
                // JavaLine 68 <== SourceLine 998
                // BEGIN INNER PART
                // JavaLine 70 <== SourceLine 2395
                // BEGIN INNER PART
                // JavaLine 72 <== SourceLine 89
                // BEGIN INNER PART
                // JavaLine 74 <== SourceLine 2697
                // BEGIN INNER PART
                // JavaLine 76 <== SourceLine 33
                L2NAME=RTS_ENVIRONMENT.getTextInfo(7);
                ;
                nscodename=RTS_ENVIRONMENT.getTextInfo(4);
                ;
                // JavaLine 81 <== SourceLine 37
                recomp=(RTS_ENVIRONMENT.getIntInfo(22)==(1));
                ;
                // JavaLine 84 <== SourceLine 38
                GenerateScode=(RTS_ENVIRONMENT.getIntInfo(1)==(1));
                ;
                // JavaLine 87 <== SourceLine 40
                timestamp=RTS_ENVIRONMENT.datetime();
                ;
                // JavaLine 90 <== SourceLine 41
                maxerrno_1=RTS_ENVIRONMENT.getIntInfo(4);
                ;
                // JavaLine 93 <== SourceLine 42
                GiveNotes=(RTS_ENVIRONMENT.getIntInfo(5)==(0));
                ;
                // JavaLine 96 <== SourceLine 43
                simob_level=RTS_ENVIRONMENT.getIntInfo(30);
                ;
                // JavaLine 99 <== SourceLine 44
                simob_descr=(simob_level>(0));
                ;
                // JavaLine 102 <== SourceLine 45
                simob_entity=(simob_level>=(2));
                ;
                simob_const=(simob_level>=(3));
                ;
                // JavaLine 107 <== SourceLine 50
                listname_5=RTS_ENVIRONMENT.getTextInfo(2);
                ;
                listlength=RTS_TXT.length(RTS_BASICIO.sysout().image);
                ;
                // JavaLine 112 <== SourceLine 51
                if(_VALUE(TRF_NE(listname_5,null))) {
                    {
                        // JavaLine 115 <== SourceLine 52
                        t_5=RTS_ENVIRONMENT.copy(copy(listname_5));
                        ;
                        t_5=RTS_ENVIRONMENT.lowcase(t_5);
                        ;
                        // JavaLine 120 <== SourceLine 53
                        if(_VALUE(_TXTREL_EQ(t_5,new RTS_TXT("sysout")))) {
                            listfile=RTS_BASICIO.sysout();
                        } else {
                            // JavaLine 124 <== SourceLine 54
                            {
                                // BEGIN INSPECTION 
                                _inspect_54_4511_5=new RTS_Printfile(_CTX,listname_5)._STM();
                                if(_inspect_54_4511_5!=null) { // INSPECT _inspect_54_4511_5
                                    // JavaLine 129 <== SourceLine 55
                                    {
                                        // JavaLine 131 <== SourceLine 54
                                        {
                                            // JavaLine 133 <== SourceLine 55
                                            listlength=RTS_ENVIRONMENT.getIntInfo(7);
                                            ;
                                            t_5=RTS_ENVIRONMENT.blanks(listlength);
                                            ;
                                            // JavaLine 138 <== SourceLine 56
                                            if(_VALUE((!(_inspect_54_4511_5.open(t_5))))) {
                                                {
                                                    // JavaLine 141 <== SourceLine 57
                                                    listlength=0;
                                                    ;
                                                    new ERRMSG_error1((_CUR),-366,listname_5);
                                                }
                                            } else {
                                                // JavaLine 147 <== SourceLine 58
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
                // JavaLine 160 <== SourceLine 61
                listingon=(listfile!=(null));
                ;
                // JavaLine 163 <== SourceLine 65
                t_5=RTS_ENVIRONMENT.getTextInfo(16);
                ;
                // JavaLine 166 <== SourceLine 66
                while(RTS_TXT.more(t_5)) {
                    if(_VALUE((RTS_TXT.getchar(t_5)==(':')))) {
                        {
                            // JavaLine 170 <== SourceLine 67
                            if(_VALUE(RTS_TXT.more(t_5))) {
                                feoptions_5=RTS_ENVIRONMENT.copy(copy(RTS_TXT.sub(t_5,RTS_TXT.pos(t_5),((RTS_TXT.length(t_5)-(RTS_TXT.pos(t_5)))+(1)))));
                            }
                            ;
                            // JavaLine 175 <== SourceLine 68
                            t_5=RTS_TXT.sub(t_5,1,(RTS_TXT.pos(t_5)-(2)));
                            ;
                            _GOTO(_LABEL_PAS1INIT_SETem_5); // GOTO EVALUATED LABEL
                            ;
                        }
                    }
                }
                ;
                // JavaLine 184 <== SourceLine 70
                {
                    _SIM_LABEL(1); // DeclaredIn: PAS1INIT
                    new SCANNER_SetSelectors((_CUR),t_5,0);
                }
                ;
                // JavaLine 190 <== SourceLine 71
                while(RTS_TXT.more(feoptions_5)) {
                    new COMMON_setopt((_CUR),RTS_TXT.getchar(feoptions_5),'1');
                }
                ;
                // JavaLine 195 <== SourceLine 73
                termstatus='3';
                ;
                // JavaLine 198 <== SourceLine 74
                currentpass='1';
                ;
                // JavaLine 201 <== SourceLine 77
                leftintbuf=RTS_ENVIRONMENT.blanks(12);
                ;
                // JavaLine 204 <== SourceLine 78
                leftsintbuf=RTS_ENVIRONMENT.blanks(7);
                ;
                // JavaLine 207 <== SourceLine 2
                TAGTAB=new COMMON_TAGTABLE((_CUR))._STM();
                ;
                // JavaLine 210 <== SourceLine 6
                dummyBox=new COMMON_identsymbol((_CUR))._STM();
                ;
                // JavaLine 213 <== SourceLine 8
                dummyGroup=new COMMON_symbolgroup((_CUR))._STM();
                ;
                for(i_5=0;i_5<=255;i_5++) {
                    // JavaLine 217 <== SourceLine 9
                    dummyGroup.val.putELEMENT(dummyGroup.val.index(i_5),dummyBox);
                }
                ;
                for(i_5=0;i_5<=127;i_5++) {
                    // JavaLine 222 <== SourceLine 10
                    symtab.putELEMENT(symtab.index(i_5),dummyGroup);
                }
                ;
                // JavaLine 226 <== SourceLine 13
                symtab.putELEMENT(symtab.index(0),new COMMON_symbolgroup((_CUR))._STM());
                ;
                symtab.getELEMENT(0).val.putELEMENT(symtab.getELEMENT(0).val.index(0),dummyBox);
                ;
                // JavaLine 231 <== SourceLine 14
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
                    // JavaLine 312 <== SourceLine 103
                    {
                        hashlo=RTS_ENVIRONMENT._char(RTS_ENVIRONMENT.hash(simsymbol));
                        ;
                        // JavaLine 316 <== SourceLine 106
                        {
                            // BEGIN INSPECTION 
                            _inspect_106_4512_5=new COMMON_identsymbol((_CUR))._STM();
                            if(_inspect_106_4512_5!=null) { // INSPECT _inspect_106_4512_5
                                // JavaLine 321 <== SourceLine 107
                                {
                                    // JavaLine 323 <== SourceLine 106
                                    {
                                        // JavaLine 325 <== SourceLine 107
                                        _inspect_106_4512_5.symbol=simsymbol;
                                        ;
                                        // JavaLine 328 <== SourceLine 108
                                        _inspect_106_4512_5.idlo=identlo=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(identlo)+(1)));
                                        ;
                                        // JavaLine 331 <== SourceLine 109
                                        _inspect_106_4512_5.next=hashtab.getELEMENT(RTS_ENVIRONMENT.rank(hashlo));
                                        ;
                                        // JavaLine 334 <== SourceLine 110
                                        symtab.getELEMENT(0).val.putELEMENT(symtab.getELEMENT(0).val.index(RTS_ENVIRONMENT.rank(identlo)),hashtab.putELEMENT(hashtab.index(RTS_ENVIRONMENT.rank(hashlo)),((COMMON_symbolbox)_inspect_106_4512_5)));
                                        ;
                                        // JavaLine 337 <== SourceLine 112
                                        if(_VALUE(((_inspect_106_4512_5.next!=(null))&&((option.getELEMENT(RTS_ENVIRONMENT.rank('Y'))!=(((char)0))))))) {
                                            // JavaLine 339 <== SourceLine 113
                                            {
                                                // BEGIN INSPECTION 
                                                _inspect_113_4513_5=RTS_BASICIO.sysout();
                                                if(_inspect_113_4513_5!=null) { // INSPECT _inspect_113_4513_5
                                                    // JavaLine 344 <== SourceLine 114
                                                    {
                                                        // JavaLine 346 <== SourceLine 113
                                                        {
                                                            // JavaLine 348 <== SourceLine 114
                                                            _inspect_113_4513_5.outtext(CONC(CONC(CONC(new RTS_TXT("HASH: collision between "),simsymbol),new RTS_TXT(" and ")),_inspect_106_4512_5.next.symbol));
                                                            ;
                                                            // JavaLine 351 <== SourceLine 116
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
                // JavaLine 367 <== SourceLine 122
                i_5=(RTS_ENVIRONMENT.rank(identlo)+(1));
                ;
                // JavaLine 370 <== SourceLine 123
                while((i_5<=(255))) {
                    {
                        // JavaLine 373 <== SourceLine 124
                        symtab.getELEMENT(0).val.putELEMENT(symtab.getELEMENT(0).val.index(i_5),dummyBox);
                        ;
                        i_5=(i_5+(1));
                    }
                }
                ;
                // JavaLine 380 <== SourceLine 126
                consthi=((char)128);
                ;
                // JavaLine 383 <== SourceLine 128
                simsymbol=new RTS_TXT("0");
                ;
                new COMMON_DEFCONST((_CUR));
                ;
                // JavaLine 388 <== SourceLine 130
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)1))),new RTS_TXT("BOOL"));
                ;
                // JavaLine 391 <== SourceLine 131
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)2))),new RTS_TXT("CHAR"));
                ;
                // JavaLine 394 <== SourceLine 132
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)3))),new RTS_TXT("SHOR"));
                ;
                // JavaLine 397 <== SourceLine 133
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)4))),new RTS_TXT("INTG"));
                ;
                // JavaLine 400 <== SourceLine 134
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)5))),new RTS_TXT("REAL"));
                ;
                // JavaLine 403 <== SourceLine 135
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)6))),new RTS_TXT("LONG"));
                ;
                // JavaLine 406 <== SourceLine 136
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)7))),new RTS_TXT(" REF"));
                ;
                // JavaLine 409 <== SourceLine 137
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)8))),new RTS_TXT("TEXT"));
                ;
                // JavaLine 412 <== SourceLine 138
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)9))),new RTS_TXT("PTR "));
                ;
                // JavaLine 415 <== SourceLine 139
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)10))),new RTS_TXT("VALU"));
                ;
                // JavaLine 418 <== SourceLine 140
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)11))),new RTS_TXT("LABE"));
                ;
                // JavaLine 421 <== SourceLine 141
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)12))),new RTS_TXT("PROC"));
                ;
                // JavaLine 424 <== SourceLine 142
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)13))),new RTS_TXT("ARRA"));
                ;
                // JavaLine 427 <== SourceLine 143
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)14))),new RTS_TXT("NOTY"));
                ;
                // JavaLine 430 <== SourceLine 144
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)15))),new RTS_TXT("ELSE"));
                ;
                // JavaLine 433 <== SourceLine 145
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)16))),new RTS_TXT(" END"));
                ;
                // JavaLine 436 <== SourceLine 146
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)17))),new RTS_TXT(" EQV"));
                ;
                // JavaLine 439 <== SourceLine 147
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)18))),new RTS_TXT("EXTR"));
                ;
                // JavaLine 442 <== SourceLine 148
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)19))),new RTS_TXT(" FOR"));
                ;
                // JavaLine 445 <== SourceLine 149
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)20))),new RTS_TXT("  GO"));
                ;
                // JavaLine 448 <== SourceLine 150
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)21))),new RTS_TXT("GOTO"));
                ;
                // JavaLine 451 <== SourceLine 151
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)22))),new RTS_TXT("HIDD"));
                ;
                // JavaLine 454 <== SourceLine 152
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)23))),new RTS_TXT("  IF"));
                ;
                // JavaLine 457 <== SourceLine 153
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)24))),new RTS_TXT(" IMP"));
                ;
                // JavaLine 460 <== SourceLine 154
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)25))),new RTS_TXT("  IN"));
                ;
                // JavaLine 463 <== SourceLine 155
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)26))),new RTS_TXT("INNE"));
                ;
                // JavaLine 466 <== SourceLine 156
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)27))),new RTS_TXT("INSP"));
                ;
                // JavaLine 469 <== SourceLine 157
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)28))),new RTS_TXT("  DO"));
                ;
                // JavaLine 472 <== SourceLine 158
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)29))),new RTS_TXT("  IS"));
                ;
                // JavaLine 475 <== SourceLine 159
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)30))),new RTS_TXT("CLAS"));
                ;
                // JavaLine 478 <== SourceLine 160
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)31))),new RTS_TXT("RCRD"));
                ;
                // JavaLine 481 <== SourceLine 161
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)32))),new RTS_TXT("BEGI"));
                ;
                // JavaLine 484 <== SourceLine 162
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('!')),new RTS_TXT("NAME"));
                ;
                // JavaLine 487 <== SourceLine 163
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('"')),new RTS_TXT(" NEW"));
                ;
                // JavaLine 490 <== SourceLine 164
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('#')),new RTS_TXT(" NOT"));
                ;
                // JavaLine 493 <== SourceLine 165
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('$')),new RTS_TXT("  OR"));
                ;
                // JavaLine 496 <== SourceLine 166
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('%')),new RTS_TXT("OTHW"));
                ;
                // JavaLine 499 <== SourceLine 167
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('&')),new RTS_TXT("PRIO"));
                ;
                // JavaLine 502 <== SourceLine 168
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)39))),new RTS_TXT("DELA"));
                ;
                // JavaLine 505 <== SourceLine 169
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('(')),new RTS_TXT("PRTC"));
                ;
                // JavaLine 508 <== SourceLine 170
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(')')),new RTS_TXT(" QUA"));
                ;
                // JavaLine 511 <== SourceLine 171
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('*')),new RTS_TXT("REAC"));
                ;
                // JavaLine 514 <== SourceLine 172
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('+')),new RTS_TXT("  AT"));
                ;
                // JavaLine 517 <== SourceLine 173
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(',')),new RTS_TXT("BEFO"));
                ;
                // JavaLine 520 <== SourceLine 174
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('-')),new RTS_TXT(" AND"));
                ;
                // JavaLine 523 <== SourceLine 175
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('.')),new RTS_TXT("STEP"));
                ;
                // JavaLine 526 <== SourceLine 176
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('/')),new RTS_TXT("SWIT"));
                ;
                // JavaLine 529 <== SourceLine 177
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('0')),new RTS_TXT("ACTV"));
                ;
                // JavaLine 532 <== SourceLine 178
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('1')),new RTS_TXT("THEN"));
                ;
                // JavaLine 535 <== SourceLine 179
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('2')),new RTS_TXT("THIS"));
                ;
                // JavaLine 538 <== SourceLine 180
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('3')),new RTS_TXT("  TO"));
                ;
                // JavaLine 541 <== SourceLine 181
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('4')),new RTS_TXT("UNTI"));
                ;
                // JavaLine 544 <== SourceLine 182
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('5')),new RTS_TXT("AFTR"));
                ;
                // JavaLine 547 <== SourceLine 183
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('6')),new RTS_TXT("VIRT"));
                ;
                // JavaLine 550 <== SourceLine 184
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('7')),new RTS_TXT("WHEN"));
                ;
                // JavaLine 553 <== SourceLine 185
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('8')),new RTS_TXT("WHIL"));
                ;
                // JavaLine 556 <== SourceLine 186
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('9')),new RTS_TXT("  LT"));
                ;
                // JavaLine 559 <== SourceLine 187
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(':')),new RTS_TXT("  EQ"));
                ;
                // JavaLine 562 <== SourceLine 188
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(';')),new RTS_TXT("  LE"));
                ;
                // JavaLine 565 <== SourceLine 189
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('<')),new RTS_TXT("  GT"));
                ;
                // JavaLine 568 <== SourceLine 190
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('=')),new RTS_TXT("  NE"));
                ;
                // JavaLine 571 <== SourceLine 191
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('>')),new RTS_TXT("  GE"));
                ;
                // JavaLine 574 <== SourceLine 192
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('?')),new RTS_TXT("COMN"));
                ;
                // JavaLine 577 <== SourceLine 193
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('@')),new RTS_TXT("NONE"));
                ;
                // JavaLine 580 <== SourceLine 194
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('A')),new RTS_TXT("NOTE"));
                ;
                // JavaLine 583 <== SourceLine 195
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('B')),new RTS_TXT("TRUE"));
                ;
                // JavaLine 586 <== SourceLine 196
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('C')),new RTS_TXT("FALS"));
                ;
                // JavaLine 589 <== SourceLine 197
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('D')),new RTS_TXT("RFEQ"));
                ;
                // JavaLine 592 <== SourceLine 198
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('E')),new RTS_TXT("RFNE"));
                ;
                // JavaLine 595 <== SourceLine 199
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('F')),new RTS_TXT("PLUS"));
                ;
                // JavaLine 598 <== SourceLine 200
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('G')),new RTS_TXT("MINU"));
                ;
                // JavaLine 601 <== SourceLine 201
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('H')),new RTS_TXT("MULT"));
                ;
                // JavaLine 604 <== SourceLine 202
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('I')),new RTS_TXT("SLAS"));
                ;
                // JavaLine 607 <== SourceLine 203
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('J')),new RTS_TXT("POWE"));
                ;
                // JavaLine 610 <== SourceLine 204
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('K')),new RTS_TXT("IDIV"));
                ;
                // JavaLine 613 <== SourceLine 205
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('L')),new RTS_TXT(" DOT"));
                ;
                // JavaLine 616 <== SourceLine 206
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('M')),new RTS_TXT("  CL"));
                ;
                // JavaLine 619 <== SourceLine 207
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('N')),new RTS_TXT("COMA"));
                ;
                // JavaLine 622 <== SourceLine 208
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('O')),new RTS_TXT("SMCL"));
                ;
                // JavaLine 625 <== SourceLine 209
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('P')),new RTS_TXT("LFPA"));
                ;
                // JavaLine 628 <== SourceLine 210
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('Q')),new RTS_TXT("RGPA"));
                ;
                // JavaLine 631 <== SourceLine 211
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('R')),new RTS_TXT("ASSG"));
                ;
                // JavaLine 634 <== SourceLine 212
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('S')),new RTS_TXT("DENO"));
                ;
                // JavaLine 637 <== SourceLine 213
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('T')),new RTS_TXT("CONC"));
                ;
                // JavaLine 640 <== SourceLine 214
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('U')),new RTS_TXT("CAND"));
                ;
                // JavaLine 643 <== SourceLine 215
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('V')),new RTS_TXT(" COR"));
                ;
                // JavaLine 646 <== SourceLine 216
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('W')),new RTS_TXT("CASE"));
                ;
                // JavaLine 649 <== SourceLine 217
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('X')),new RTS_TXT(" EOP"));
                ;
                // JavaLine 652 <== SourceLine 218
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('Y')),new RTS_TXT("ROPD"));
                ;
                // JavaLine 655 <== SourceLine 219
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('Z')),new RTS_TXT(" IDN"));
                ;
                // JavaLine 658 <== SourceLine 220
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('[')),new RTS_TXT("CONS"));
                ;
                // JavaLine 661 <== SourceLine 221
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('\\')),new RTS_TXT("BLKB"));
                ;
                // JavaLine 664 <== SourceLine 222
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(']')),new RTS_TXT("BPRF"));
                ;
                // JavaLine 667 <== SourceLine 223
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('^')),new RTS_TXT("DCLI"));
                ;
                // JavaLine 670 <== SourceLine 224
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('_')),new RTS_TXT("FRMP"));
                ;
                // JavaLine 673 <== SourceLine 225
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('`')),new RTS_TXT("ABTE"));
                ;
                // JavaLine 676 <== SourceLine 226
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('a')),new RTS_TXT("ACTE"));
                ;
                // JavaLine 679 <== SourceLine 227
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('b')),new RTS_TXT("ARGE"));
                ;
                // JavaLine 682 <== SourceLine 228
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('c')),new RTS_TXT("ARDE"));
                ;
                // JavaLine 685 <== SourceLine 229
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('d')),new RTS_TXT("ASGE"));
                ;
                // JavaLine 688 <== SourceLine 230
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('e')),new RTS_TXT("BLNO"));
                ;
                // JavaLine 691 <== SourceLine 231
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('f')),new RTS_TXT("BNDE"));
                ;
                // JavaLine 694 <== SourceLine 232
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('g')),new RTS_TXT("BREC"));
                ;
                // JavaLine 697 <== SourceLine 233
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('h')),new RTS_TXT("CAPE"));
                ;
                // JavaLine 700 <== SourceLine 234
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('i')),new RTS_TXT("CONB"));
                ;
                // JavaLine 703 <== SourceLine 235
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('j')),new RTS_TXT("CONE"));
                ;
                // JavaLine 706 <== SourceLine 236
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('k')),new RTS_TXT("CPRF"));
                ;
                // JavaLine 709 <== SourceLine 237
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('l')),new RTS_TXT("CSPC"));
                ;
                // JavaLine 712 <== SourceLine 238
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('m')),new RTS_TXT("DCLA"));
                ;
                // JavaLine 715 <== SourceLine 239
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('n')),new RTS_TXT("DCLC"));
                ;
                // JavaLine 718 <== SourceLine 240
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('o')),new RTS_TXT("DCLE"));
                ;
                // JavaLine 721 <== SourceLine 241
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('p')),new RTS_TXT("DCLP"));
                ;
                // JavaLine 724 <== SourceLine 242
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('q')),new RTS_TXT("DCLS"));
                ;
                // JavaLine 727 <== SourceLine 243
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('r')),new RTS_TXT("DIME"));
                ;
                // JavaLine 730 <== SourceLine 244
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('s')),new RTS_TXT("DOTP"));
                ;
                // JavaLine 733 <== SourceLine 245
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('t')),new RTS_TXT("EEXP"));
                ;
                // JavaLine 736 <== SourceLine 246
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('u')),new RTS_TXT("ECWI"));
                ;
                // JavaLine 739 <== SourceLine 247
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('v')),new RTS_TXT("ELME"));
                ;
                // JavaLine 742 <== SourceLine 248
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('w')),new RTS_TXT("ELSB"));
                ;
                // JavaLine 745 <== SourceLine 249
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('x')),new RTS_TXT("EPRM"));
                ;
                // JavaLine 748 <== SourceLine 250
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('y')),new RTS_TXT("EREC"));
                ;
                // JavaLine 751 <== SourceLine 251
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('z')),new RTS_TXT("ESTM"));
                ;
                // JavaLine 754 <== SourceLine 252
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('{')),new RTS_TXT("EXNM"));
                    ;
                    // JavaLine 757 <== SourceLine 253
                    DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('|')),new RTS_TXT("FASG"));
                    ;
                    // JavaLine 760 <== SourceLine 254
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('}')),new RTS_TXT("FDNO"));
                ;
                // JavaLine 763 <== SourceLine 255
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank('~')),new RTS_TXT("FORE"));
                ;
                // JavaLine 766 <== SourceLine 256
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)127))),new RTS_TXT("FWHN"));
                ;
                // JavaLine 769 <== SourceLine 257
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)128))),new RTS_TXT(" GOE"));
                ;
                // JavaLine 772 <== SourceLine 258
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)129))),new RTS_TXT("IDNP"));
                ;
                // JavaLine 775 <== SourceLine 259
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)130))),new RTS_TXT("IFSB"));
                ;
                // JavaLine 778 <== SourceLine 260
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)131))),new RTS_TXT("IFSE"));
                ;
                // JavaLine 781 <== SourceLine 261
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)132))),new RTS_TXT("LANG"));
                ;
                // JavaLine 784 <== SourceLine 262
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)133))),new RTS_TXT("LINE"));
                ;
                // JavaLine 787 <== SourceLine 263
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)134))),new RTS_TXT("NEWP"));
                ;
                // JavaLine 790 <== SourceLine 264
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)135))),new RTS_TXT("OTHE"));
                ;
                // JavaLine 793 <== SourceLine 265
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)136))),new RTS_TXT("PRHI"));
                ;
                // JavaLine 796 <== SourceLine 266
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)137))),new RTS_TXT("PSPC"));
                ;
                // JavaLine 799 <== SourceLine 267
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)138))),new RTS_TXT("SCST"));
                ;
                // JavaLine 802 <== SourceLine 268
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)139))),new RTS_TXT("SIDN"));
                ;
                // JavaLine 805 <== SourceLine 269
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)140))),new RTS_TXT("SIMU"));
                ;
                // JavaLine 808 <== SourceLine 270
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)141))),new RTS_TXT("SSWA"));
                ;
                // JavaLine 811 <== SourceLine 271
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)142))),new RTS_TXT("SSWB"));
                ;
                // JavaLine 814 <== SourceLine 272
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)143))),new RTS_TXT("SWDE"));
                ;
                // JavaLine 817 <== SourceLine 273
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)144))),new RTS_TXT("SWEE"));
                ;
                // JavaLine 820 <== SourceLine 274
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)145))),new RTS_TXT("THSB"));
                ;
                // JavaLine 823 <== SourceLine 275
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)146))),new RTS_TXT("UMNS"));
                ;
                // JavaLine 826 <== SourceLine 276
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)147))),new RTS_TXT("UPLS"));
                ;
                // JavaLine 829 <== SourceLine 277
                DB.putELEMENT(DB.index(RTS_ENVIRONMENT.rank(((char)148))),new RTS_TXT("VSPC"));
                ;
                // JavaLine 832 <== SourceLine 89
                predefname=RTS_ENVIRONMENT.getTextInfo(19);
                ;
                // JavaLine 835 <== SourceLine 91
                dummygen_2=false;
                ;
                // JavaLine 838 <== SourceLine 96
                {
                    // BEGIN INSPECTION 
                    _inspect_96_4514_5=((PARSER_grammer)new PARSER_grammer((_CUR))._START());
                    if(_inspect_96_4514_5!=null) { // INSPECT _inspect_96_4514_5
                        // JavaLine 843 <== SourceLine 97
                        {
                            // JavaLine 845 <== SourceLine 96
                            {
                                // JavaLine 847 <== SourceLine 98
                                parser=((COMMON_component)_inspect_96_4514_5);
                                ;
                                // JavaLine 850 <== SourceLine 100
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)1))),((char)1));
                                ;
                                // JavaLine 853 <== SourceLine 101
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)2))),((char)1));
                                ;
                                // JavaLine 856 <== SourceLine 102
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)3))),((char)1));
                                ;
                                // JavaLine 859 <== SourceLine 103
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)4))),((char)1));
                                ;
                                // JavaLine 862 <== SourceLine 104
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)5))),((char)1));
                                ;
                                // JavaLine 865 <== SourceLine 105
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)6))),((char)1));
                                ;
                                // JavaLine 868 <== SourceLine 106
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)7))),((char)1));
                                ;
                                // JavaLine 871 <== SourceLine 107
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)8))),((char)1));
                                ;
                                // JavaLine 874 <== SourceLine 108
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)12))),((char)1));
                                ;
                                // JavaLine 877 <== SourceLine 109
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)13))),((char)1));
                                ;
                                // JavaLine 880 <== SourceLine 110
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)30))),((char)1));
                                ;
                                // JavaLine 883 <== SourceLine 111
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)31))),((char)1));
                                ;
                                // JavaLine 886 <== SourceLine 112
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('/')),((char)1));
                                ;
                                // JavaLine 889 <== SourceLine 113
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)18))),((char)1));
                                ;
                                // JavaLine 892 <== SourceLine 118
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('Y')),((char)2));
                                ;
                                // JavaLine 895 <== SourceLine 119
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('5')),((char)2));
                                ;
                                // JavaLine 898 <== SourceLine 120
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('1')),((char)2));
                                ;
                                // JavaLine 901 <== SourceLine 121
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('+')),((char)2));
                                ;
                                // JavaLine 904 <== SourceLine 122
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('4')),((char)2));
                                ;
                                // JavaLine 907 <== SourceLine 123
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(',')),((char)2));
                                ;
                                // JavaLine 910 <== SourceLine 124
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('7')),((char)2));
                                ;
                                // JavaLine 913 <== SourceLine 125
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)39))),((char)2));
                                ;
                                // JavaLine 916 <== SourceLine 126
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('O')),((char)2));
                                ;
                                // JavaLine 919 <== SourceLine 127
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('S')),((char)2));
                                ;
                                // JavaLine 922 <== SourceLine 128
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('X')),((char)2));
                                ;
                                // JavaLine 925 <== SourceLine 129
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)28))),((char)2));
                                ;
                                // JavaLine 928 <== SourceLine 130
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)16))),((char)2));
                                ;
                                // JavaLine 931 <== SourceLine 131
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)15))),((char)2));
                                ;
                                // JavaLine 934 <== SourceLine 132
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('Q')),((char)2));
                                ;
                                // JavaLine 937 <== SourceLine 133
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('%')),((char)2));
                                ;
                                // JavaLine 940 <== SourceLine 134
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('N')),((char)2));
                                ;
                                // JavaLine 943 <== SourceLine 135
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('&')),((char)2));
                                ;
                                // JavaLine 946 <== SourceLine 136
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('M')),((char)2));
                                ;
                                // JavaLine 949 <== SourceLine 137
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('.')),((char)2));
                                ;
                                // JavaLine 952 <== SourceLine 138
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('R')),((char)2));
                                ;
                                // JavaLine 955 <== SourceLine 147
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('F')),((char)3));
                                ;
                                // JavaLine 958 <== SourceLine 148
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('J')),((char)3));
                                ;
                                // JavaLine 961 <== SourceLine 149
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('G')),((char)3));
                                ;
                                // JavaLine 964 <== SourceLine 150
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('K')),((char)3));
                                ;
                                // JavaLine 967 <== SourceLine 151
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('H')),((char)3));
                                ;
                                // JavaLine 970 <== SourceLine 152
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('T')),((char)3));
                                ;
                                // JavaLine 973 <== SourceLine 153
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('I')),((char)3));
                                ;
                                // JavaLine 976 <== SourceLine 157
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(':')),((char)4));
                                ;
                                // JavaLine 979 <== SourceLine 158
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('9')),((char)4));
                                ;
                                // JavaLine 982 <== SourceLine 159
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('>')),((char)4));
                                ;
                                // JavaLine 985 <== SourceLine 160
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('=')),((char)4));
                                ;
                                // JavaLine 988 <== SourceLine 161
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('<')),((char)4));
                                ;
                                // JavaLine 991 <== SourceLine 162
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('D')),((char)4));
                                ;
                                // JavaLine 994 <== SourceLine 163
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(';')),((char)4));
                                ;
                                // JavaLine 997 <== SourceLine 164
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('E')),((char)4));
                                ;
                                // JavaLine 1000 <== SourceLine 168
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('-')),((char)5));
                                ;
                                // JavaLine 1003 <== SourceLine 169
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('$')),((char)5));
                                ;
                                // JavaLine 1006 <== SourceLine 170
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)17))),((char)5));
                                ;
                                // JavaLine 1009 <== SourceLine 171
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('U')),((char)5));
                                ;
                                // JavaLine 1012 <== SourceLine 172
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank(((char)24))),((char)5));
                                ;
                                // JavaLine 1015 <== SourceLine 173
                                _inspect_96_4514_5.symboltype.putELEMENT(_inspect_96_4514_5.symboltype.index(RTS_ENVIRONMENT.rank('V')),((char)5));
                                ;
                            }
                        }
                    }
                } // END INSPECTION
                ;
                // JavaLine 1023 <== SourceLine 179
                call(parser,179);
                ;
                // JavaLine 1026 <== SourceLine 185
                {
                    // BEGIN INSPECTION 
                    _inspect_185_4515_5=((SCANNER_recognizer)new SCANNER_recognizer((_CUR))._START());
                    if(_inspect_185_4515_5!=null) { // INSPECT _inspect_185_4515_5
                        // JavaLine 1031 <== SourceLine 186
                        {
                            // JavaLine 1033 <== SourceLine 185
                            {
                                // JavaLine 1035 <== SourceLine 186
                                lexScanner_2=((SCANNER_recognizer)(scanner=((COMMON_component)_inspect_185_4515_5)));
                                ;
                                _inspect_185_4515_5.hashbuf_1=RTS_ENVIRONMENT.blanks(180);
                                ;
                                for(i_5=35;i_5<=255;i_5++) {
                                    // JavaLine 1041 <== SourceLine 188
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)7));
                                }
                                ;
                                // JavaLine 1045 <== SourceLine 190
                                _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(0),_inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(127),((char)9)));
                                ;
                                for(i_5=1;i_5<=7;i_5++) {
                                    // JavaLine 1049 <== SourceLine 192
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)8));
                                }
                                ;
                                for(i_5=14;i_5<=31;i_5++) {
                                    // JavaLine 1054 <== SourceLine 193
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)8));
                                }
                                ;
                                for(i_5=8;i_5<=13;i_5++) {
                                    // JavaLine 1059 <== SourceLine 195
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)6));
                                }
                                ;
                                // JavaLine 1063 <== SourceLine 196
                                _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(32),((char)6));
                                ;
                                // JavaLine 1066 <== SourceLine 198
                                _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(33),((char)5));
                                ;
                                // JavaLine 1069 <== SourceLine 200
                                _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(34),((char)4));
                                ;
                                for(i_5=38;i_5<=47;i_5++) {
                                    // JavaLine 1073 <== SourceLine 201
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)4));
                                }
                                ;
                                for(i_5=58;i_5<=62;i_5++) {
                                    // JavaLine 1078 <== SourceLine 202
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)4));
                                }
                                ;
                                for(i_5=48;i_5<=57;i_5++) {
                                    // JavaLine 1083 <== SourceLine 204
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)2));
                                }
                                ;
                                for(i_5=65;i_5<=90;i_5++) {
                                    // JavaLine 1088 <== SourceLine 206
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)0));
                                }
                                ;
                                for(i_5=97;i_5<=122;i_5++) {
                                    // JavaLine 1093 <== SourceLine 207
                                    _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(i_5),((char)0));
                                }
                                ;
                                // JavaLine 1097 <== SourceLine 209
                                _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(67),_inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(99),((char)1)));
                                ;
                                // JavaLine 1100 <== SourceLine 211
                                _inspect_185_4515_5.InputClass.putELEMENT(_inspect_185_4515_5.InputClass.index(95),((char)3));
                                ;
                                // JavaLine 1103 <== SourceLine 213
                                _inspect_185_4515_5.IdScanner_1=((SCANNER_recognizer_identifierScanner)new SCANNER_recognizer_identifierScanner(_inspect_185_4515_5)._START());
                                ;
                                // JavaLine 1106 <== SourceLine 214
                                _inspect_185_4515_5.unsignedInt_1=((SCANNER_recognizer_unsignedInteger)new SCANNER_recognizer_unsignedInteger(_inspect_185_4515_5)._START());
                                ;
                            }
                        }
                    }
                } // END INSPECTION
                ;
                // JavaLine 1114 <== SourceLine 220
                signiflength=255;
                ;
                // JavaLine 1117 <== SourceLine 221
                cursource_2=((SCANNER_SourceElt)new SCANNER_SourceElt((_CUR),false,RTS_ENVIRONMENT.getTextInfo(1))._START());
                ;
                // JavaLine 1120 <== SourceLine 222
                incrlnr_2=true;
                ;
                // JavaLine 1123 <== SourceLine 226
                if(_VALUE(TRF_EQ(L2NAME,null))) {
                    new ERRMSG_openerror((_CUR),new RTS_TXT(" *** SCRATCH FILE (L2) ***"));
                }
                ;
                // JavaLine 1128 <== SourceLine 227
                {
                    // BEGIN INSPECTION 
                    _inspect_227_4516_5=((SCANNER_L2Coder)new SCANNER_L2Coder((_CUR),L2NAME)._START());
                    if(_inspect_227_4516_5!=null) { // INSPECT _inspect_227_4516_5
                        // JavaLine 1133 <== SourceLine 228
                        {
                            // JavaLine 1135 <== SourceLine 227
                            {
                                // JavaLine 1137 <== SourceLine 228
                                P1coder_2=((SCANNER_L2Coder)_inspect_227_4516_5);
                                ;
                                coder=P1coder_2;
                                ;
                                // JavaLine 1142 <== SourceLine 232
                                brctab.putELEMENT(brctab.index(0),new COMMON_brctab2((_CUR))._STM());
                                ;
                                // JavaLine 1145 <== SourceLine 233
                                if(_VALUE((!((option.getELEMENT(RTS_ENVIRONMENT.rank('F'))!=(((char)0))))))) {
                                    {
                                        // JavaLine 1148 <== SourceLine 234
                                        {
                                            // BEGIN INSPECTION 
                                            _inspect_234_4517_5=new COMMON_brecord((_CUR))._STM();
                                            if(_inspect_234_4517_5!=null) { // INSPECT _inspect_234_4517_5
                                                // JavaLine 1153 <== SourceLine 235
                                                {
                                                    // JavaLine 1155 <== SourceLine 234
                                                    {
                                                        // JavaLine 1157 <== SourceLine 235
                                                        _inspect_234_4517_5.kind=((char)13);
                                                        ;
                                                        brctab.getELEMENT(0).val.putELEMENT(brctab.getELEMENT(0).val.index(0),((COMMON_brecord)_inspect_234_4517_5));
                                                        ;
                                                        // JavaLine 1162 <== SourceLine 236
                                                        {
                                                            // BEGIN INSPECTION 
                                                            _inspect_236_4518_5=new COMMON_quantity((_CUR))._STM();
                                                            if(_inspect_236_4518_5!=null) { // INSPECT _inspect_236_4518_5
                                                                // JavaLine 1167 <== SourceLine 237
                                                                {
                                                                    // JavaLine 1169 <== SourceLine 236
                                                                    {
                                                                        // JavaLine 1171 <== SourceLine 237
                                                                        _inspect_234_4517_5.fpar=((COMMON_quantity)_inspect_236_4518_5);
                                                                        ;
                                                                        // JavaLine 1174 <== SourceLine 238
                                                                        _inspect_236_4518_5.plev_1=1;
                                                                        ;
                                                                        // JavaLine 1177 <== SourceLine 239
                                                                        _inspect_236_4518_5.type_1=((char)14);
                                                                        ;
                                                                        _inspect_236_4518_5.kind_1=((char)5);
                                                                        ;
                                                                        // JavaLine 1182 <== SourceLine 240
                                                                        _inspect_236_4518_5.categ_1=((char)4);
                                                                        ;
                                                                        // JavaLine 1185 <== SourceLine 244
                                                                        _inspect_236_4518_5.symb_1=new COMMON_boxof((_CUR),((char)0),'I')._RESULT;
                                                                        ;
                                                                        // JavaLine 1188 <== SourceLine 245
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
                                // JavaLine 1204 <== SourceLine 252
                                nextbllo=((char)1);
                                ;
                                // JavaLine 1207 <== SourceLine 253
                                new SCANNER_L2Coder_brecinit(_inspect_227_4516_5,((char)13));
                                ;
                            }
                        }
                    }
                } // END INSPECTION
                ;
                // JavaLine 1215 <== SourceLine 257
                // BEGIN INNER PART
                // JavaLine 1217 <== SourceLine 797
                // BEGIN INNER PART
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER1.sim","8 BUILDER1",1,3,10,70,13,43,18,44,20,45,22,46,24,47,26,51,28,52,30,53,32,55,34,56,39,59,41,60,43,61,45,63,47,64,49,308,51,723,66,1322,68,998,70,2395,72,89,74,2697,76,33,81,37,84,38,87,40,90,41,93,42,96,43,99,44,102,45,107,50,112,51,115,52,120,53,124,54,129,55,131,54,133,55,138,56,141,57,147,58,160,61,163,65,166,66,170,67,175,68,184,70,190,71,195,73,198,74,201,77,204,78,207,2,210,6,213,8,217,9,222,10,226,13,231,14,312,103,316,106,321,107,323,106,325,107,328,108,331,109,334,110,337,112,339,113,344,114,346,113,348,114,351,116,367,122,370,123,373,124,380,126,383,128,388,130,391,131,394,132,397,133,400,134,403,135,406,136,409,137,412,138,415,139,418,140,421,141,424,142,427,143,430,144,433,145,436,146,439,147,442,148,445,149,448,150,451,151,454,152,457,153,460,154,463,155,466,156,469,157,472,158,475,159,478,160,481,161,484,162,487,163,490,164,493,165,496,166,499,167,502,168,505,169,508,170,511,171,514,172,517,173,520,174,523,175,526,176,529,177,532,178,535,179,538,180,541,181,544,182,547,183,550,184,553,185,556,186,559,187,562,188,565,189,568,190,571,191,574,192,577,193,580,194,583,195,586,196,589,197,592,198,595,199,598,200,601,201,604,202,607,203,610,204,613,205,616,206,619,207,622,208,625,209,628,210,631,211,634,212,637,213,640,214,643,215,646,216,649,217,652,218,655,219,658,220,661,221,664,222,667,223,670,224,673,225,676,226,679,227,682,228,685,229,688,230,691,231,694,232,697,233,700,234,703,235,706,236,709,237,712,238,715,239,718,240,721,241,724,242,727,243,730,244,733,245,736,246,739,247,742,248,745,249,748,250,751,251,754,252,757,253,760,254,763,255,766,256,769,257,772,258,775,259,778,260,781,261,784,262,787,263,790,264,793,265,796,266,799,267,802,268,805,269,808,270,811,271,814,272,817,273,820,274,823,275,826,276,829,277,832,89,835,91,838,96,843,97,845,96,847,98,850,100,853,101,856,102,859,103,862,104,865,105,868,106,871,107,874,108,877,109,880,110,883,111,886,112,889,113,892,118,895,119,898,120,901,121,904,122,907,123,910,124,913,125,916,126,919,127,922,128,925,129,928,130,931,131,934,132,937,133,940,134,943,135,946,136,949,137,952,138,955,147,958,148,961,149,964,150,967,151,970,152,973,153,976,157,979,158,982,159,985,160,988,161,991,162,994,163,997,164,1000,168,1003,169,1006,170,1009,171,1012,172,1015,173,1023,179,1026,185,1031,186,1033,185,1035,186,1041,188,1045,190,1049,192,1054,193,1059,195,1063,196,1066,198,1069,200,1073,201,1078,202,1083,204,1088,206,1093,207,1097,209,1100,211,1103,213,1106,214,1114,220,1117,221,1120,222,1123,226,1128,227,1133,228,1135,227,1137,228,1142,232,1145,233,1148,234,1153,235,1155,234,1157,235,1162,236,1167,237,1169,236,1171,237,1174,238,1177,239,1182,240,1185,244,1188,245,1204,252,1207,253,1215,257,1217,797,1235,797);
} // End of Class
