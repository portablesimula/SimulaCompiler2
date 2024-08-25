// JavaLine 1 <== SourceLine 606
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER1_precheck0_hide extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=606, lastLine=680, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public COMMON_quantity p_q;
    public boolean p_attrHide;
    // Declare local labels
    // JavaLine 12 <== SourceLine 633
    final RTS_LABEL _LABEL_BUILDER1_precheck0_hide_Block624_REP_0=new RTS_LABEL(this,0,1,"REP"); // Local Label #1=REP At PrefixLevel 0
    // JavaLine 14 <== SourceLine 634
    final RTS_LABEL _LABEL_BUILDER1_precheck0_hide_Block624_SCAN_0=new RTS_LABEL(this,0,2,"SCAN"); // Local Label #2=SCAN At PrefixLevel 0
    // JavaLine 16 <== SourceLine 652
    final RTS_LABEL _LABEL_BUILDER1_precheck0_hide_Block624_Block635_Block636_Block638_Block640_Block642_Block649_Block652_SETM_0=new RTS_LABEL(this,0,3,"SETM"); // Local Label #3=SETM At PrefixLevel 0
    // JavaLine 18 <== SourceLine 665
    final RTS_LABEL _LABEL_BUILDER1_precheck0_hide_Block624_Block635_NEXTATTR_0=new RTS_LABEL(this,0,4,"NEXTATTR"); // Local Label #4=NEXTATTR At PrefixLevel 0
    // JavaLine 20 <== SourceLine 674
    final RTS_LABEL _LABEL_BUILDER1_precheck0_hide_Block624_REMM_0=new RTS_LABEL(this,0,5,"REMM"); // Local Label #5=REMM At PrefixLevel 0
    // JavaLine 22 <== SourceLine 678
    final RTS_LABEL _LABEL_BUILDER1_precheck0_hide_Block624_NXTP_0=new RTS_LABEL(this,0,6,"NXTP"); // Local Label #6=NXTP At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 25 <== SourceLine 612
    public COMMON_quantity qz=null;
    public COMMON_idpack cvis=null;
    public COMMON_idpack fvis=null;
    // JavaLine 29 <== SourceLine 613
    public int nhid=0;
    public boolean inlocals=false;
    // JavaLine 32 <== SourceLine 614
    public int curplev=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public BUILDER1_precheck0_hide setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_q=(COMMON_quantity)objectValue(param); break;
                case 1: p_attrHide=(boolean)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public BUILDER1_precheck0_hide(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public BUILDER1_precheck0_hide(RTS_RTObject _SL,COMMON_quantity sp_q,boolean sp_attrHide) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        this.p_attrHide = sp_attrHide;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER1_precheck0_hide _STM() {
        BUILDER1_precheck0_hide _THIS=(BUILDER1_precheck0_hide)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,6); // For ByteCode Engineering
                // JavaLine 68 <== SourceLine 618
                ((BUILDER1)(_CUR._SL._SL)).prefixchain.putELEMENT(((BUILDER1)(_CUR._SL._SL)).prefixchain.index(1),qz=p_q);
                ;
                curplev=1;
                ;
                // JavaLine 73 <== SourceLine 619
                while((curplev<(p_q.plev_1))) {
                    {
                        // JavaLine 76 <== SourceLine 620
                        curplev=(curplev+(1));
                        ;
                        ((BUILDER1)(_CUR._SL._SL)).prefixchain.putELEMENT(((BUILDER1)(_CUR._SL._SL)).prefixchain.index(curplev),qz=qz.prefqual_1);
                        ;
                    }
                }
                ;
                // JavaLine 84 <== SourceLine 623
                while((curplev!=(0))) {
                    {
                        // JavaLine 87 <== SourceLine 624
                        p_q=((BUILDER1)(_CUR._SL._SL)).prefixchain.getELEMENT(curplev);
                        ;
                        ((BUILDER1)(_CUR._SL._SL)).prefixchain.putELEMENT(((BUILDER1)(_CUR._SL._SL)).prefixchain.index(curplev),null);
                        ;
                        // JavaLine 92 <== SourceLine 625
                        curplev=(curplev-(1));
                        ;
                        // JavaLine 95 <== SourceLine 626
                        new BUILDER1_precheck0_unprotect((_CUR._SL),p_q);
                        ;
                        // JavaLine 98 <== SourceLine 627
                        fvis=p_q.descr_1.hidlist;
                        ;
                        // JavaLine 101 <== SourceLine 628
                        if(_VALUE((fvis==(null)))) {
                            _GOTO(_LABEL_BUILDER1_precheck0_hide_Block624_NXTP_0); // GOTO EVALUATED LABEL
                        }
                        ;
                        // JavaLine 106 <== SourceLine 629
                        cvis=fvis;
                        ;
                        nhid=0;
                        ;
                        // JavaLine 111 <== SourceLine 630
                        while((cvis!=(null))) {
                            {
                                // JavaLine 114 <== SourceLine 631
                                nhid=(nhid+(1));
                                ;
                                cvis=cvis.next;
                            }
                        }
                        ;
                        // JavaLine 121 <== SourceLine 633
                        {
                            _SIM_LABEL(1); // DeclaredIn: hide -> hide[externalIdent=BUILDER1_precheck0_hide] Kind=5, QUAL=ProcedureDeclaration, HashCode=1161255903
                            qz=p_q.descr_1.fpar;
                        }
                        ;
                        inlocals=true;
                        ;
                        // JavaLine 129 <== SourceLine 634
                        {
                            _SIM_LABEL(2); // DeclaredIn: hide -> hide[externalIdent=BUILDER1_precheck0_hide] Kind=5, QUAL=ProcedureDeclaration, HashCode=1161255903
                            while((qz!=(null))) {
                                {
                                    // JavaLine 134 <== SourceLine 635
                                    if(_VALUE((qz.visible_1==(((char)0))))) {
                                        {
                                            // JavaLine 137 <== SourceLine 636
                                            cvis=fvis;
                                            ;
                                            // JavaLine 140 <== SourceLine 637
                                            while((cvis!=(null))) {
                                                {
                                                    // JavaLine 143 <== SourceLine 638
                                                    if(_VALUE((cvis.line>=(0)))) {
                                                        {
                                                            // JavaLine 146 <== SourceLine 640
                                                            if(_VALUE((new COMMON_boxof((_CUR._SL._SL),cvis.idhi,cvis.idlo)._RESULT==(qz.symb_1)))) {
                                                                // JavaLine 148 <== SourceLine 641
                                                                {
                                                                    // JavaLine 150 <== SourceLine 642
                                                                    if(_VALUE((p_attrHide&(((qz.categ_1==(((char)3)))|((qz.categ_1==(((char)6))))))))) {
                                                                        // JavaLine 152 <== SourceLine 645
                                                                        new BUILDER1_precheck0_ignore((_CUR._SL),cvis,qz)._STM();
                                                                    }
                                                                    ;
                                                                    // JavaLine 156 <== SourceLine 646
                                                                    qz.visible_1=((char)1);
                                                                    ;
                                                                    // JavaLine 159 <== SourceLine 647
                                                                    if(_VALUE(inlocals)) {
                                                                        {
                                                                            // JavaLine 162 <== SourceLine 649
                                                                            if(_VALUE(((qz.match_1==(null))||((qz.match_1.categ_1==(((char)6))))))) {
                                                                                // JavaLine 164 <== SourceLine 651
                                                                                {
                                                                                    // JavaLine 166 <== SourceLine 652
                                                                                    {
                                                                                        _SIM_LABEL(3); // DeclaredIn: hide -> hide[externalIdent=BUILDER1_precheck0_hide] Kind=5, QUAL=ProcedureDeclaration, HashCode=1161255903
                                                                                        cvis.line=(-(cvis.line));
                                                                                    }
                                                                                    ;
                                                                                    // JavaLine 172 <== SourceLine 653
                                                                                    nhid=(nhid-(1));
                                                                                    ;
                                                                                    // JavaLine 175 <== SourceLine 654
                                                                                    if(_VALUE((nhid==(0)))) {
                                                                                        _GOTO(_LABEL_BUILDER1_precheck0_hide_Block624_REMM_0); // GOTO EVALUATED LABEL
                                                                                    }
                                                                                    ;
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        // JavaLine 184 <== SourceLine 658
                                                                        if(_VALUE((qz.dim_1==(1)))) {
                                                                            _GOTO(_LABEL_BUILDER1_precheck0_hide_Block624_Block635_Block636_Block638_Block640_Block642_Block649_Block652_SETM_0); // GOTO EVALUATED LABEL
                                                                        }
                                                                    }
                                                                    ;
                                                                    // JavaLine 190 <== SourceLine 659
                                                                    _GOTO(_LABEL_BUILDER1_precheck0_hide_Block624_Block635_NEXTATTR_0); // GOTO EVALUATED LABEL
                                                                    ;
                                                                }
                                                            }
                                                            ;
                                                        }
                                                    }
                                                    ;
                                                    // JavaLine 199 <== SourceLine 662
                                                    cvis=cvis.next;
                                                    ;
                                                }
                                            }
                                            ;
                                        }
                                    }
                                    ;
                                    // JavaLine 208 <== SourceLine 665
                                    {
                                        _SIM_LABEL(4); // DeclaredIn: hide -> hide[externalIdent=BUILDER1_precheck0_hide] Kind=5, QUAL=ProcedureDeclaration, HashCode=1161255903
                                        qz=((COMMON_quantity)(qz.next));
                                    }
                                    ;
                                }
                            }
                        }
                        ;
                        // JavaLine 218 <== SourceLine 667
                        if(_VALUE(inlocals)) {
                            {
                                // JavaLine 221 <== SourceLine 668
                                inlocals=false;
                                ;
                                qz=p_q.descr_1.favirt;
                                ;
                                _GOTO(_LABEL_BUILDER1_precheck0_hide_Block624_SCAN_0); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 230 <== SourceLine 670
                        if(_VALUE((p_q.plev_1>(1)))) {
                            {
                                // JavaLine 233 <== SourceLine 671
                                p_q=p_q.prefqual_1;
                                ;
                                _GOTO(_LABEL_BUILDER1_precheck0_hide_Block624_REP_0); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 240 <== SourceLine 674
                        {
                            _SIM_LABEL(5); // DeclaredIn: hide -> hide[externalIdent=BUILDER1_precheck0_hide] Kind=5, QUAL=ProcedureDeclaration, HashCode=1161255903
                            cvis=fvis;
                        }
                        ;
                        // JavaLine 246 <== SourceLine 675
                        while((cvis!=(null))) {
                            {
                                // JavaLine 249 <== SourceLine 676
                                if(_VALUE((cvis.line<(0)))) {
                                    cvis.line=(-(cvis.line));
                                }
                                ;
                                // JavaLine 254 <== SourceLine 677
                                cvis=cvis.next;
                            }
                        }
                        ;
                        // JavaLine 259 <== SourceLine 678
                        {
                            _SIM_LABEL(6); // DeclaredIn: hide -> hide[externalIdent=BUILDER1_precheck0_hide] Kind=5, QUAL=ProcedureDeclaration, HashCode=1161255903
                            ;
                        }
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER1.sim","5 hide",1,606,12,633,14,634,16,652,18,665,20,674,22,678,25,612,29,613,32,614,68,618,73,619,76,620,84,623,87,624,92,625,95,626,98,627,101,628,106,629,111,630,114,631,121,633,129,634,134,635,137,636,140,637,143,638,146,640,148,641,150,642,152,645,156,646,159,647,162,649,164,651,166,652,172,653,175,654,184,658,190,659,199,662,208,665,218,667,221,668,230,670,233,671,240,674,246,675,249,676,254,677,259,678,276,680);
} // End of Procedure
