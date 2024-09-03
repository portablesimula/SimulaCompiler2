// JavaLine 1 <== SourceLine 611
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:50 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER1_precheck0_hide extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=611, lastLine=685, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_q;
    public boolean p_attrHide;
    // Declare local labels
    // JavaLine 12 <== SourceLine 638
    final RTS_LABEL _LABEL_CLASS_BUILDER1_precheck0_hide_Block629_REP_0=new RTS_LABEL(this,0,1,"REP"); // Local Label #1=REP At PrefixLevel 0
    // JavaLine 14 <== SourceLine 639
    final RTS_LABEL _LABEL_CLASS_BUILDER1_precheck0_hide_Block629_SCAN_0=new RTS_LABEL(this,0,2,"SCAN"); // Local Label #2=SCAN At PrefixLevel 0
    // JavaLine 16 <== SourceLine 657
    final RTS_LABEL _LABEL_CLASS_BUILDER1_precheck0_hide_Block629_Block640_Block641_Block643_Block645_Block647_Block654_Block657_SETM_0=new RTS_LABEL(this,0,3,"SETM"); // Local Label #3=SETM At PrefixLevel 0
    // JavaLine 18 <== SourceLine 670
    final RTS_LABEL _LABEL_CLASS_BUILDER1_precheck0_hide_Block629_Block640_NEXTATTR_0=new RTS_LABEL(this,0,4,"NEXTATTR"); // Local Label #4=NEXTATTR At PrefixLevel 0
    // JavaLine 20 <== SourceLine 679
    final RTS_LABEL _LABEL_CLASS_BUILDER1_precheck0_hide_Block629_REMM_0=new RTS_LABEL(this,0,5,"REMM"); // Local Label #5=REMM At PrefixLevel 0
    // JavaLine 22 <== SourceLine 683
    final RTS_LABEL _LABEL_CLASS_BUILDER1_precheck0_hide_Block629_NXTP_0=new RTS_LABEL(this,0,6,"NXTP"); // Local Label #6=NXTP At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 25 <== SourceLine 617
    public CLASS_COMMON_quantity qz=null;
    public CLASS_COMMON_idpack cvis=null;
    public CLASS_COMMON_idpack fvis=null;
    // JavaLine 29 <== SourceLine 618
    public int nhid=0;
    public boolean inlocals=false;
    // JavaLine 32 <== SourceLine 619
    public int curplev=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_BUILDER1_precheck0_hide setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_q=(CLASS_COMMON_quantity)objectValue(param); break;
                case 1: p_attrHide=(boolean)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_BUILDER1_precheck0_hide(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public CLASS_BUILDER1_precheck0_hide(RTS_RTObject _SL,CLASS_COMMON_quantity sp_q,boolean sp_attrHide) {
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
    public CLASS_BUILDER1_precheck0_hide _STM() {
        CLASS_BUILDER1_precheck0_hide _THIS=(CLASS_BUILDER1_precheck0_hide)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,6); // For ByteCode Engineering
                // JavaLine 68 <== SourceLine 623
                ((CLASS_BUILDER1)(_CUR._SL._SL)).prefixchain.putELEMENT(((CLASS_BUILDER1)(_CUR._SL._SL)).prefixchain.index(1),qz=p_q);
                ;
                curplev=1;
                ;
                // JavaLine 73 <== SourceLine 624
                while((curplev<(p_q.plev_1))) {
                    {
                        // JavaLine 76 <== SourceLine 625
                        curplev=(curplev+(1));
                        ;
                        ((CLASS_BUILDER1)(_CUR._SL._SL)).prefixchain.putELEMENT(((CLASS_BUILDER1)(_CUR._SL._SL)).prefixchain.index(curplev),qz=qz.prefqual_1);
                        ;
                    }
                }
                ;
                // JavaLine 84 <== SourceLine 628
                while((curplev!=(0))) {
                    {
                        // JavaLine 87 <== SourceLine 629
                        p_q=((CLASS_BUILDER1)(_CUR._SL._SL)).prefixchain.getELEMENT(curplev);
                        ;
                        ((CLASS_BUILDER1)(_CUR._SL._SL)).prefixchain.putELEMENT(((CLASS_BUILDER1)(_CUR._SL._SL)).prefixchain.index(curplev),null);
                        ;
                        // JavaLine 92 <== SourceLine 630
                        curplev=(curplev-(1));
                        ;
                        // JavaLine 95 <== SourceLine 631
                        new CLASS_BUILDER1_precheck0_unprotect((_CUR._SL),p_q);
                        ;
                        // JavaLine 98 <== SourceLine 632
                        fvis=p_q.descr_1.hidlist;
                        ;
                        // JavaLine 101 <== SourceLine 633
                        if(_VALUE((fvis==(null)))) {
                            _GOTO(_LABEL_CLASS_BUILDER1_precheck0_hide_Block629_NXTP_0); // GOTO EVALUATED LABEL
                        }
                        ;
                        // JavaLine 106 <== SourceLine 634
                        cvis=fvis;
                        ;
                        nhid=0;
                        ;
                        // JavaLine 111 <== SourceLine 635
                        while((cvis!=(null))) {
                            {
                                // JavaLine 114 <== SourceLine 636
                                nhid=(nhid+(1));
                                ;
                                cvis=cvis.next;
                            }
                        }
                        ;
                        // JavaLine 121 <== SourceLine 638
                        {
                            _SIM_LABEL(1); // DeclaredIn: hide -> hide[externalIdent=CLASS_BUILDER1_precheck0_hide] Kind=5, QUAL=ProcedureDeclaration, HashCode=1401589925
                            qz=p_q.descr_1.fpar;
                        }
                        ;
                        inlocals=true;
                        ;
                        // JavaLine 129 <== SourceLine 639
                        {
                            _SIM_LABEL(2); // DeclaredIn: hide -> hide[externalIdent=CLASS_BUILDER1_precheck0_hide] Kind=5, QUAL=ProcedureDeclaration, HashCode=1401589925
                            while((qz!=(null))) {
                                {
                                    // JavaLine 134 <== SourceLine 640
                                    if(_VALUE((qz.visible_1==(((char)0))))) {
                                        {
                                            // JavaLine 137 <== SourceLine 641
                                            cvis=fvis;
                                            ;
                                            // JavaLine 140 <== SourceLine 642
                                            while((cvis!=(null))) {
                                                {
                                                    // JavaLine 143 <== SourceLine 643
                                                    if(_VALUE((cvis.line>=(0)))) {
                                                        {
                                                            // JavaLine 146 <== SourceLine 645
                                                            if(_VALUE((new CLASS_COMMON_boxof((_CUR._SL._SL),cvis.idhi,cvis.idlo)._RESULT==(qz.symb_1)))) {
                                                                // JavaLine 148 <== SourceLine 646
                                                                {
                                                                    // JavaLine 150 <== SourceLine 647
                                                                    if(_VALUE((p_attrHide&(((qz.categ_1==(((char)3)))|((qz.categ_1==(((char)6))))))))) {
                                                                        // JavaLine 152 <== SourceLine 650
                                                                        new CLASS_BUILDER1_precheck0_ignore((_CUR._SL),cvis,qz)._STM();
                                                                    }
                                                                    ;
                                                                    // JavaLine 156 <== SourceLine 651
                                                                    qz.visible_1=((char)1);
                                                                    ;
                                                                    // JavaLine 159 <== SourceLine 652
                                                                    if(_VALUE(inlocals)) {
                                                                        {
                                                                            // JavaLine 162 <== SourceLine 654
                                                                            if(_VALUE(((qz.match_1==(null))||((qz.match_1.categ_1==(((char)6))))))) {
                                                                                // JavaLine 164 <== SourceLine 656
                                                                                {
                                                                                    // JavaLine 166 <== SourceLine 657
                                                                                    {
                                                                                        _SIM_LABEL(3); // DeclaredIn: hide -> hide[externalIdent=CLASS_BUILDER1_precheck0_hide] Kind=5, QUAL=ProcedureDeclaration, HashCode=1401589925
                                                                                        cvis.line=(-(cvis.line));
                                                                                    }
                                                                                    ;
                                                                                    // JavaLine 172 <== SourceLine 658
                                                                                    nhid=(nhid-(1));
                                                                                    ;
                                                                                    // JavaLine 175 <== SourceLine 659
                                                                                    if(_VALUE((nhid==(0)))) {
                                                                                        _GOTO(_LABEL_CLASS_BUILDER1_precheck0_hide_Block629_REMM_0); // GOTO EVALUATED LABEL
                                                                                    }
                                                                                    ;
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        // JavaLine 184 <== SourceLine 663
                                                                        if(_VALUE((qz.dim_1==(1)))) {
                                                                            _GOTO(_LABEL_CLASS_BUILDER1_precheck0_hide_Block629_Block640_Block641_Block643_Block645_Block647_Block654_Block657_SETM_0); // GOTO EVALUATED LABEL
                                                                        }
                                                                    }
                                                                    ;
                                                                    // JavaLine 190 <== SourceLine 664
                                                                    _GOTO(_LABEL_CLASS_BUILDER1_precheck0_hide_Block629_Block640_NEXTATTR_0); // GOTO EVALUATED LABEL
                                                                    ;
                                                                }
                                                            }
                                                            ;
                                                        }
                                                    }
                                                    ;
                                                    // JavaLine 199 <== SourceLine 667
                                                    cvis=cvis.next;
                                                    ;
                                                }
                                            }
                                            ;
                                        }
                                    }
                                    ;
                                    // JavaLine 208 <== SourceLine 670
                                    {
                                        _SIM_LABEL(4); // DeclaredIn: hide -> hide[externalIdent=CLASS_BUILDER1_precheck0_hide] Kind=5, QUAL=ProcedureDeclaration, HashCode=1401589925
                                        qz=((CLASS_COMMON_quantity)(qz.next));
                                    }
                                    ;
                                }
                            }
                        }
                        ;
                        // JavaLine 218 <== SourceLine 672
                        if(_VALUE(inlocals)) {
                            {
                                // JavaLine 221 <== SourceLine 673
                                inlocals=false;
                                ;
                                qz=p_q.descr_1.favirt;
                                ;
                                _GOTO(_LABEL_CLASS_BUILDER1_precheck0_hide_Block629_SCAN_0); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 230 <== SourceLine 675
                        if(_VALUE((p_q.plev_1>(1)))) {
                            {
                                // JavaLine 233 <== SourceLine 676
                                p_q=p_q.prefqual_1;
                                ;
                                _GOTO(_LABEL_CLASS_BUILDER1_precheck0_hide_Block629_REP_0); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 240 <== SourceLine 679
                        {
                            _SIM_LABEL(5); // DeclaredIn: hide -> hide[externalIdent=CLASS_BUILDER1_precheck0_hide] Kind=5, QUAL=ProcedureDeclaration, HashCode=1401589925
                            cvis=fvis;
                        }
                        ;
                        // JavaLine 246 <== SourceLine 680
                        while((cvis!=(null))) {
                            {
                                // JavaLine 249 <== SourceLine 681
                                if(_VALUE((cvis.line<(0)))) {
                                    cvis.line=(-(cvis.line));
                                }
                                ;
                                // JavaLine 254 <== SourceLine 682
                                cvis=cvis.next;
                            }
                        }
                        ;
                        // JavaLine 259 <== SourceLine 683
                        {
                            _SIM_LABEL(6); // DeclaredIn: hide -> hide[externalIdent=CLASS_BUILDER1_precheck0_hide] Kind=5, QUAL=ProcedureDeclaration, HashCode=1401589925
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER1.sim","5 hide",1,611,12,638,14,639,16,657,18,670,20,679,22,683,25,617,29,618,32,619,68,623,73,624,76,625,84,628,87,629,92,630,95,631,98,632,101,633,106,634,111,635,114,636,121,638,129,639,134,640,137,641,140,642,143,643,146,645,148,646,150,647,152,650,156,651,159,652,162,654,164,656,166,657,172,658,175,659,184,663,190,664,199,667,208,670,218,672,221,673,230,675,233,676,240,679,246,680,249,681,254,682,259,683,276,685);
} // End of Procedure
