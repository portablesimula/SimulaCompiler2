// JavaLine 1 <== SourceLine 32
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:35 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CHECKER2_semchecker extends CHECKER1_semchecker1 {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=3, firstLine=32, lastLine=1663, hasLocalClasses=true, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 874
    final RTS_LABEL _LABEL_CHECKER2_semchecker_Block870_Block872_NEXTOPN_0=new RTS_LABEL(this,3,1,"NEXTOPN"); // Local Label #1=NEXTOPN At PrefixLevel 3
    // JavaLine 13 <== SourceLine 924
    final RTS_LABEL _LABEL_CHECKER2_semchecker_Block870_Block872_Block921_gennap_0=new RTS_LABEL(this,3,2,"gennap"); // Local Label #2=gennap At PrefixLevel 3
    // JavaLine 15 <== SourceLine 956
    final RTS_LABEL _LABEL_CHECKER2_semchecker_Block870_Block872_Block955_STACK_0=new RTS_LABEL(this,3,3,"STACK"); // Local Label #3=STACK At PrefixLevel 3
    // JavaLine 17 <== SourceLine 958
    final RTS_LABEL _LABEL_CHECKER2_semchecker_Block870_Block872_Block955_REPLACE_0=new RTS_LABEL(this,3,4,"REPLACE"); // Local Label #4=REPLACE At PrefixLevel 3
    // JavaLine 19 <== SourceLine 984
    final RTS_LABEL _LABEL_CHECKER2_semchecker_Block870_Block872_Block982_OPNOUT_0=new RTS_LABEL(this,3,5,"OPNOUT"); // Local Label #5=OPNOUT At PrefixLevel 3
    // JavaLine 21 <== SourceLine 1026
    final RTS_LABEL _LABEL_CHECKER2_semchecker_Block870_Block872_Block1012_outbb_0=new RTS_LABEL(this,3,6,"outbb"); // Local Label #6=outbb At PrefixLevel 3
    // JavaLine 23 <== SourceLine 1095
    final RTS_LABEL _LABEL_CHECKER2_semchecker_Block870_Block872_Block1094_Acon_0=new RTS_LABEL(this,3,7,"Acon"); // Local Label #7=Acon At PrefixLevel 3
    // JavaLine 25 <== SourceLine 1100
    final RTS_LABEL _LABEL_CHECKER2_semchecker_Block870_Block872_Block1094_SetCon_0=new RTS_LABEL(this,3,8,"SetCon"); // Local Label #8=SetCon At PrefixLevel 3
    // JavaLine 27 <== SourceLine 1105
    final RTS_LABEL _LABEL_CHECKER2_semchecker_Block870_Block872_Block1094_SetCo1_0=new RTS_LABEL(this,3,9,"SetCo1"); // Local Label #9=SetCo1 At PrefixLevel 3
    // JavaLine 29 <== SourceLine 1106
    final RTS_LABEL _LABEL_CHECKER2_semchecker_Block870_Block872_Block1094_SetCo2_0=new RTS_LABEL(this,3,10,"SetCo2"); // Local Label #10=SetCo2 At PrefixLevel 3
    // JavaLine 31 <== SourceLine 1148
    final RTS_LABEL _LABEL_CHECKER2_semchecker_Block870_Block872_Block1148_swap_0=new RTS_LABEL(this,3,11,"swap"); // Local Label #11=swap At PrefixLevel 3
    // JavaLine 33 <== SourceLine 1173
    final RTS_LABEL _LABEL_CHECKER2_semchecker_Block870_Block872_Block1170_POPEXPEXP_0=new RTS_LABEL(this,3,12,"POPEXPEXP"); // Local Label #12=POPEXPEXP At PrefixLevel 3
    // JavaLine 35 <== SourceLine 1209
    final RTS_LABEL _LABEL_CHECKER2_semchecker_Block870_Block872_Block1209_repu_0=new RTS_LABEL(this,3,13,"repu"); // Local Label #13=repu At PrefixLevel 3
    // JavaLine 37 <== SourceLine 1302
    final RTS_LABEL _LABEL_CHECKER2_semchecker_Block870_Block872_Block1301_Eass_0=new RTS_LABEL(this,3,14,"Eass"); // Local Label #14=Eass At PrefixLevel 3
    // JavaLine 39 <== SourceLine 1322
    final RTS_LABEL _LABEL_CHECKER2_semchecker_Block870_Block872_Block1322_LIARGE_0=new RTS_LABEL(this,3,15,"LIARGE"); // Local Label #15=LIARGE At PrefixLevel 3
    // JavaLine 41 <== SourceLine 1365
    final RTS_LABEL _LABEL_CHECKER2_semchecker_Block870_Block872_Block1348_Block1349_KERR1_0=new RTS_LABEL(this,3,16,"KERR1"); // Local Label #16=KERR1 At PrefixLevel 3
    // JavaLine 43 <== SourceLine 1385
    final RTS_LABEL _LABEL_CHECKER2_semchecker_Block870_Block872_Block1348_Block1372_Block1373_KERR2_0=new RTS_LABEL(this,3,17,"KERR2"); // Local Label #17=KERR2 At PrefixLevel 3
    // JavaLine 45 <== SourceLine 1419
    final RTS_LABEL _LABEL_CHECKER2_semchecker_Block870_Block872_Block1417_LIWHEN1_0=new RTS_LABEL(this,3,18,"LIWHEN1"); // Local Label #18=LIWHEN1 At PrefixLevel 3
    // JavaLine 47 <== SourceLine 1432
    final RTS_LABEL _LABEL_CHECKER2_semchecker_Block870_Block872_Block1417_bscp_0=new RTS_LABEL(this,3,19,"bscp"); // Local Label #19=bscp At PrefixLevel 3
    // JavaLine 49 <== SourceLine 1461
    final RTS_LABEL _LABEL_CHECKER2_semchecker_Block870_Block872_Block1461_opqout_0=new RTS_LABEL(this,3,20,"opqout"); // Local Label #20=opqout At PrefixLevel 3
    // JavaLine 51 <== SourceLine 1497
    final RTS_LABEL _LABEL_CHECKER2_semchecker_Block870_Block872_Block1495_LIFORE_0=new RTS_LABEL(this,3,21,"LIFORE"); // Local Label #21=LIFORE At PrefixLevel 3
    // JavaLine 53 <== SourceLine 1569
    final RTS_LABEL _LABEL_CHECKER2_semchecker_Block870_Block872_Block1567_bnde1_0=new RTS_LABEL(this,3,22,"bnde1"); // Local Label #22=bnde1 At PrefixLevel 3
    // Declare locals as attributes
    // JavaLine 56 <== SourceLine 37
    public boolean checkclb_3=false;
    // JavaLine 58 <== SourceLine 38
    public char unstop_3=0;
    // JavaLine 60 <== SourceLine 39
    public int L2p_3=0;
    // JavaLine 62 <== SourceLine 40
    public int opi_3=0;
    // JavaLine 64 <== SourceLine 41
    public RTS_TXT L2buf_3=null;
    // JavaLine 66 <== SourceLine 43
    public CHECKER1_semchecker1_switchdef curswitch_3=null;
    // JavaLine 68 <== SourceLine 44
    public CHECKER1_semchecker1_switchelement curswitchel_3=null;
    // JavaLine 70 <== SourceLine 46
    public CHECKER2_semchecker_unstack ust_3=null;
    // JavaLine 72 <== SourceLine 47
    public CHECKER2_semchecker_ConstEltChecker constantelt_3=null;
    // JavaLine 74 <== SourceLine 53
    public RTS_REF_ARRAY<CHECKER1_semchecker1_exp> expexptop=null;
    // JavaLine 76 <== SourceLine 59
    public COMMON_quantity visq_3=null;
    // JavaLine 78 <== SourceLine 89
    public final int lowpl_3=(int)(0);
    // JavaLine 80 <== SourceLine 876
    public RTS_Printfile _inspect_875_4606_3=null;
    // JavaLine 82 <== SourceLine 890
    public RTS_Printfile _inspect_889_4607_3=null;
    // JavaLine 84 <== SourceLine 994
    public COMMON_brecord _inspect_994_4608_3=null;
    // JavaLine 86 <== SourceLine 1015
    public COMMON_brecord _inspect_1015_4609_3=null;
    // JavaLine 88 <== SourceLine 1019
    public COMMON_quantity _inspect_1018_4610_3=null;
    // JavaLine 90 <== SourceLine 1048
    public COMMON_quantity _inspect_1047_4611_3=null;
    // JavaLine 92 <== SourceLine 1075
    public RTS_Printfile _inspect_1075_4612_3=null;
    // JavaLine 94 <== SourceLine 1083
    public RTS_Printfile _inspect_1083_4613_3=null;
    // JavaLine 96 <== SourceLine 1101
    public RTS_Printfile _inspect_1101_4614_3=null;
    // JavaLine 98 <== SourceLine 1287
    public COMMON_identsymbol _inspect_1286_4615_3=null;
    // JavaLine 100 <== SourceLine 1372
    public CHECKER1_semchecker1_identifier _inspect_1372_4616_3=null;
    // JavaLine 102 <== SourceLine 1450
    public COMMON_quantity _inspect_1450_4617_3=null;
    // JavaLine 104 <== SourceLine 1469
    public COMMON_quantity _inspect_1468_4618_3=null;
    // JavaLine 106 <== SourceLine 1483
    public COMMON_brecord _inspect_1483_4619_3=null;
    // JavaLine 108 <== SourceLine 1497
    public COMMON_brecord _inspect_1497_4620_3=null;
    // JavaLine 110 <== SourceLine 1517
    public CHECKER1_semchecker1_switchelement _inspect_1517_4621_3=null;
    // JavaLine 112 <== SourceLine 1553
    public COMMON_brecord _inspect_1553_4622_3=null;
    // JavaLine 114 <== SourceLine 1651
    public RTS_Printfile _inspect_1651_4623_3=null;
    // Normal Constructor
    public CHECKER2_semchecker(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
        // JavaLine 121 <== SourceLine 53
        expexptop=new RTS_REF_ARRAY<CHECKER1_semchecker1_exp>(new RTS_BOUNDS(0,100));
    }
    // Class Statements
    @Override
    public CHECKER2_semchecker _STM() {
        CHECKER2_semchecker _THIS=(CHECKER2_semchecker)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,22); // For ByteCode Engineering
                // JavaLine 131 <== SourceLine 719
                // BEGIN INNER PART
                // JavaLine 133 <== SourceLine 1881
                // BEGIN INNER PART
                // JavaLine 135 <== SourceLine 2634
                // BEGIN INNER PART
                // JavaLine 137 <== SourceLine 865
                detach(865);
                ;
                // JavaLine 140 <== SourceLine 867
                {
                    // JavaLine 142 <== SourceLine 870
                    while(true) {
                        {
                            // JavaLine 145 <== SourceLine 872
                            {
                                _SIM_LABEL(1); // DeclaredIn: semchecker -> semchecker[CHECKER2_semchecker] DeclarationKind=Class
                                // JavaLine 148 <== SourceLine 874
                                if(_VALUE((exptop_2==(null)))) {
                                    new ERRMSG_internerr((_CUR._SL),((char)9),874);
                                }
                            }
                            ;
                            // JavaLine 154 <== SourceLine 875
                            if(_VALUE((((CHECKER2)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('S'))!=(((char)0))))) {
                                {
                                    // BEGIN INSPECTION 
                                    _inspect_875_4606_3=RTS_BASICIO.sysout();
                                    if(_inspect_875_4606_3!=null) { // INSPECT _inspect_875_4606_3
                                        // JavaLine 160 <== SourceLine 876
                                        {
                                            {
                                                if(_VALUE((((CHECKER2)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('T'))!=(((char)0))))) {
                                                    // JavaLine 164 <== SourceLine 877
                                                    new CHECKER2_semchecker_Block870_Block872_Block876_Block877((_CUR))._STM();
                                                }
                                                ;
                                            }
                                        }
                                    }
                                } // END INSPECTION
                            }
                            ;
                            // JavaLine 174 <== SourceLine 887
                            ((CHECKER2)(_CUR._SL)).opn=RTS_ENVIRONMENT.loadChar(L2buf_3,L2p_3);
                            ;
                            L2p_3=(L2p_3+(1));
                            ;
                            // JavaLine 179 <== SourceLine 889
                            if(_VALUE((((CHECKER2)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('R'))!=(((char)0))))) {
                                {
                                    // BEGIN INSPECTION 
                                    _inspect_889_4607_3=RTS_BASICIO.sysout();
                                    if(_inspect_889_4607_3!=null) { // INSPECT _inspect_889_4607_3
                                        // JavaLine 185 <== SourceLine 890
                                        {
                                            {
                                                _inspect_889_4607_3.outimage();
                                                ;
                                                _inspect_889_4607_3.outtext(new RTS_TXT("opn: "));
                                                ;
                                                _inspect_889_4607_3.outtext(((CHECKER2)(_CUR._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(((CHECKER2)(_CUR._SL)).opn)));
                                                ;
                                                // JavaLine 194 <== SourceLine 891
                                                _inspect_889_4607_3.outint(RTS_ENVIRONMENT.rank(((CHECKER2)(_CUR._SL)).opn),4);
                                                ;
                                                _inspect_889_4607_3.outtext(new RTS_TXT(", L2p:"));
                                                ;
                                                _inspect_889_4607_3.outint(L2p_3,0);
                                            }
                                        }
                                    }
                                } // END INSPECTION
                            }
                            ;
                            // JavaLine 206 <== SourceLine 893
                            if(((CHECKER2)(_CUR._SL)).opn<((char)0) || ((CHECKER2)(_CUR._SL)).opn>((char)148)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                            switch(((CHECKER2)(_CUR._SL)).opn) { // BEGIN SWITCH STATEMENT
                                case 139: 
                                case 90: 
                                // JavaLine 211 <== SourceLine 897
                                {
                                    // JavaLine 213 <== SourceLine 898
                                    new CHECKER2_semchecker_getOpd((_CUR));
                                    ;
                                    // JavaLine 216 <== SourceLine 899
                                    if(_VALUE((simpleList_2==(null)))) {
                                        new CHECKER1_semchecker1_simpleIdent((_CUR),exptop_2,'Z')._START();
                                    } else {
                                        // JavaLine 220 <== SourceLine 900
                                        {
                                            simpleList_2.p_ch='Z';
                                            ;
                                            call(simpleList_2,900);
                                        }
                                    }
                                    ;
                                    // JavaLine 228 <== SourceLine 901
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_NEXTOPN_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 76: 
                                case 115: 
                                // JavaLine 235 <== SourceLine 906
                                {
                                    // JavaLine 237 <== SourceLine 907
                                    new CHECKER2_semchecker_getOpd((_CUR));
                                    ;
                                    // JavaLine 240 <== SourceLine 908
                                    new CHECKER1_semchecker1_dotIdent((_CUR),exptop_2.p_pred,((CHECKER2)(_CUR._SL)).opn,exptop_2)._STM();
                                    ;
                                    // JavaLine 243 <== SourceLine 909
                                    if(_VALUE((((CHECKER2)(_CUR._SL)).opn==('L')))) {
                                        _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_NEXTOPN_0); // GOTO EVALUATED LABEL
                                    }
                                    ;
                                    // JavaLine 248 <== SourceLine 910
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block921_gennap_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 134: 
                                // JavaLine 254 <== SourceLine 914
                                {
                                    // JavaLine 256 <== SourceLine 915
                                    new CHECKER2_semchecker_getOpd((_CUR));
                                    ;
                                    // JavaLine 259 <== SourceLine 916
                                    exptop_2=new CHECKER1_semchecker1_newIdent((_CUR),exptop_2,((char)134))._STM();
                                    ;
                                    // JavaLine 262 <== SourceLine 917
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block921_gennap_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 129: 
                                // JavaLine 268 <== SourceLine 920
                                {
                                    // JavaLine 270 <== SourceLine 921
                                    new CHECKER2_semchecker_getOpd((_CUR));
                                    ;
                                    // JavaLine 273 <== SourceLine 922
                                    if(_VALUE((simpleList_2==(null)))) {
                                        new CHECKER1_semchecker1_simpleIdent((_CUR),exptop_2,((char)129))._START();
                                    } else {
                                        // JavaLine 277 <== SourceLine 923
                                        {
                                            simpleList_2.p_ch=((char)129);
                                            ;
                                            call(simpleList_2,923);
                                        }
                                    }
                                    ;
                                    // JavaLine 285 <== SourceLine 924
                                    {
                                        _SIM_LABEL(2); // DeclaredIn: semchecker -> semchecker[CHECKER2_semchecker] DeclarationKind=Class
                                        if(_VALUE(lastnap_2.inuse)) {
                                            {
                                                // JavaLine 290 <== SourceLine 925
                                                if(_VALUE((lastnap_2.suc==(null)))) {
                                                    // JavaLine 292 <== SourceLine 926
                                                    lastnap_2.suc=((CHECKER1_semchecker1_nextargumentproducer)new CHECKER1_semchecker1_nextargumentproducer((_CUR))._START());
                                                }
                                                ;
                                                // JavaLine 296 <== SourceLine 927
                                                lastnap_2=lastnap_2.suc;
                                                ;
                                            }
                                        }
                                    }
                                    ;
                                    // JavaLine 303 <== SourceLine 936
                                    call(lastnap_2,936);
                                    ;
                                    // JavaLine 306 <== SourceLine 937
                                    ((CHECKER2)(_CUR._SL)).opn='_';
                                    ;
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block955_STACK_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 70: 
                                case 71: 
                                case 73: 
                                case 72: 
                                case 75: 
                                case 74: 
                                case 58: 
                                case 61: 
                                case 62: 
                                case 60: 
                                case 59: 
                                case 57: 
                                case 85: 
                                case 86: 
                                case 45: 
                                case 17: 
                                case 24: 
                                case 36: 
                                case 68: 
                                case 69: 
                                case 146: 
                                case 35: 
                                case 84: 
                                // JavaLine 336 <== SourceLine 945
                                {
                                    // JavaLine 338 <== SourceLine 946
                                    call(ust_3,946);
                                    ;
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block955_STACK_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 11: 
                                case 87: 
                                case 23: 
                                case 80: 
                                case 82: 
                                case 83: 
                                // JavaLine 351 <== SourceLine 953
                                {
                                    // JavaLine 353 <== SourceLine 955
                                    {
                                        _SIM_LABEL(3); // DeclaredIn: semchecker -> semchecker[CHECKER2_semchecker] DeclarationKind=Class
                                        // JavaLine 356 <== SourceLine 956
                                        opttop_2=(opttop_2+(1));
                                    }
                                    ;
                                    // JavaLine 360 <== SourceLine 957
                                    if(_VALUE((opttop_2>(100)))) {
                                        new ERRMSG_fatal0((_CUR._SL),246);
                                    }
                                    ;
                                    // JavaLine 365 <== SourceLine 958
                                    {
                                        _SIM_LABEL(4); // DeclaredIn: semchecker -> semchecker[CHECKER2_semchecker] DeclarationKind=Class
                                        ust_3.optstack.putELEMENT(ust_3.optstack.index(opttop_2),((CHECKER2)(_CUR._SL)).opn);
                                    }
                                    ;
                                    expexptop.putELEMENT(expexptop.index(opttop_2),exptop_2);
                                    ;
                                }
                                break;
                                case 63: 
                                case 89: 
                                // JavaLine 377 <== SourceLine 963
                                {
                                    // JavaLine 379 <== SourceLine 964
                                    opi_3=((RTS_ENVIRONMENT.rank(RTS_ENVIRONMENT.loadChar(L2buf_3,L2p_3))*(256))+(RTS_ENVIRONMENT.rank(RTS_ENVIRONMENT.loadChar(L2buf_3,(L2p_3+(1))))));
                                    ;
                                    // JavaLine 382 <== SourceLine 965
                                    L2p_3=(L2p_3+(2));
                                    ;
                                    // JavaLine 385 <== SourceLine 966
                                    if(_VALUE(((((CHECKER2)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('L'))!=(((char)0)))|((((CHECKER2)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('R'))!=(((char)0))))))) {
                                        // JavaLine 387 <== SourceLine 968
                                        {
                                            RTS_BASICIO.sysout().outchar('/');
                                            ;
                                            RTS_BASICIO.sysout().outint(opi_3,4);
                                        }
                                    }
                                    ;
                                    // JavaLine 395 <== SourceLine 969
                                    if(_VALUE((opi_3>(((CHECKER2)(_CUR._SL)).linenr)))) {
                                        ((CHECKER2)(_CUR._SL)).linenr=opi_3;
                                    }
                                    ;
                                    // JavaLine 400 <== SourceLine 970
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block982_OPNOUT_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 119: 
                                case 131: 
                                case 66: 
                                case 67: 
                                case 28: 
                                case 125: 
                                case 52: 
                                case 135: 
                                // JavaLine 413 <== SourceLine 981
                                {
                                    // JavaLine 415 <== SourceLine 982
                                    {
                                        _SIM_LABEL(5); // DeclaredIn: semchecker -> semchecker[CHECKER2_semchecker] DeclarationKind=Class
                                        // JavaLine 418 <== SourceLine 984
                                        ((CHECKER2)(_CUR._SL)).opc_6=((CHECKER2)(_CUR._SL)).opn;
                                    }
                                    ;
                                    call(((CHECKER2)(_CUR._SL)).coder,984);
                                    ;
                                    // JavaLine 424 <== SourceLine 986
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_NEXTOPN_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 42: 
                                // JavaLine 430 <== SourceLine 990
                                {
                                    // JavaLine 432 <== SourceLine 991
                                    new CHECKER2_semchecker_getlastblno((_CUR));
                                    ;
                                    // JavaLine 435 <== SourceLine 994
                                    {
                                        // BEGIN INSPECTION 
                                        _inspect_994_4608_3=new COMMON_getBrc((_CUR._SL),lastblhi,lastbllo)._RESULT;
                                        if(_inspect_994_4608_3!=null) { // INSPECT _inspect_994_4608_3
                                            // JavaLine 440 <== SourceLine 995
                                            {
                                                // JavaLine 442 <== SourceLine 994
                                                {
                                                    // JavaLine 444 <== SourceLine 995
                                                    visq_3=_inspect_994_4608_3.declquant;
                                                    ;
                                                    // JavaLine 447 <== SourceLine 996
                                                    while((visq_3.plev_1>(1))) {
                                                        visq_3=visq_3.prefqual_1;
                                                    }
                                                    ;
                                                    // JavaLine 452 <== SourceLine 997
                                                    visq_3.prefqual_1=((CHECKER2)(_CUR._SL)).display.getELEMENT(RTS_ENVIRONMENT.rank(((CHECKER2)(_CUR._SL)).cblev_6)).declquant;
                                                    ;
                                                    // JavaLine 455 <== SourceLine 998
                                                    ((CHECKER2)(_CUR._SL)).display.putELEMENT(((CHECKER2)(_CUR._SL)).display.index(RTS_ENVIRONMENT.rank(((CHECKER2)(_CUR._SL)).cblev_6)),((COMMON_brecord)_inspect_994_4608_3));
                                                    ;
                                                    // JavaLine 458 <== SourceLine 999
                                                    ((CHECKER2)(_CUR._SL)).brctab.getELEMENT(RTS_ENVIRONMENT.rank(lastblhi)).val.putELEMENT(((CHECKER2)(_CUR._SL)).brctab.getELEMENT(RTS_ENVIRONMENT.rank(lastblhi)).val.index(RTS_ENVIRONMENT.rank(lastbllo)),null);
                                                    ;
                                                    // JavaLine 461 <== SourceLine 1000
                                                    new BUILDER1_precheck0_vischain((_CUR),_inspect_994_4608_3.fpar,visq_3);
                                                    ;
                                                }
                                            }
                                        }
                                    } // END INSPECTION
                                    ;
                                }
                                break;
                                case 110: 
                                // JavaLine 472 <== SourceLine 1005
                                {
                                    // JavaLine 474 <== SourceLine 1006
                                    new CHECKER2_semchecker_getlastblno((_CUR));
                                    ;
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block1012_outbb_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 112: 
                                case 92: 
                                case 103: 
                                // JavaLine 484 <== SourceLine 1011
                                {
                                    // JavaLine 486 <== SourceLine 1012
                                    new CHECKER2_semchecker_getlastblno((_CUR));
                                    ;
                                    // JavaLine 489 <== SourceLine 1013
                                    if(_VALUE((((CHECKER2)(_CUR._SL)).opn==('\\')))) {
                                        // JavaLine 491 <== SourceLine 1015
                                        {
                                            // BEGIN INSPECTION 
                                            _inspect_1015_4609_3=new COMMON_getBrc((_CUR._SL),lastblhi,lastbllo)._RESULT;
                                            if(_inspect_1015_4609_3!=null) { // INSPECT _inspect_1015_4609_3
                                                // JavaLine 496 <== SourceLine 1016
                                                {
                                                    // JavaLine 498 <== SourceLine 1015
                                                    {
                                                        // JavaLine 500 <== SourceLine 1017
                                                        if(_VALUE((_inspect_1015_4609_3.kind==(((char)1))))) {
                                                            // JavaLine 502 <== SourceLine 1018
                                                            {
                                                                // BEGIN INSPECTION 
                                                                _inspect_1018_4610_3=new COMMON_getBrc((_CUR._SL),_inspect_1015_4609_3.hidlist.idhi,_inspect_1015_4609_3.hidlist.idlo)._RESULT.declquant.match_1;
                                                                if(_inspect_1018_4610_3!=null) { // INSPECT _inspect_1018_4610_3
                                                                    // JavaLine 507 <== SourceLine 1019
                                                                    {
                                                                        {
                                                                            if(_VALUE((_inspect_1018_4610_3.descr_1!=(null)))) {
                                                                                {
                                                                                    // JavaLine 512 <== SourceLine 1020
                                                                                    _inspect_1015_4609_3.hidlist.idhi=_inspect_1018_4610_3.descr_1.blnohi;
                                                                                    ;
                                                                                    _inspect_1015_4609_3.hidlist.idlo=_inspect_1018_4610_3.descr_1.blnolo;
                                                                                    ;
                                                                                }
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
                                            }
                                        } // END INSPECTION
                                    }
                                    ;
                                    // JavaLine 532 <== SourceLine 1025
                                    new BUILDER2_prechecker_allocate((_CUR));
                                    ;
                                    // JavaLine 535 <== SourceLine 1026
                                    {
                                        _SIM_LABEL(6); // DeclaredIn: semchecker -> semchecker[CHECKER2_semchecker] DeclarationKind=Class
                                        ((CHECKER2)(_CUR._SL)).opc_6=(((((CHECKER2)(_CUR._SL)).opn==('g')))?('g'):('\\'));
                                    }
                                    ;
                                    // JavaLine 541 <== SourceLine 1027
                                    ((CHECKER2)(_CUR._SL)).coder.opq_3=new COMMON_getBrc((_CUR._SL),lastblhi,lastbllo)._RESULT.declquant;
                                    ;
                                    // JavaLine 544 <== SourceLine 1028
                                    call(((CHECKER2)(_CUR._SL)).coder,1028);
                                    ;
                                    // JavaLine 547 <== SourceLine 1029
                                    new CHECKER1_semchecker1_enterblock((_CUR));
                                    ;
                                }
                                break;
                                case 117: 
                                case 121: 
                                case 16: 
                                // JavaLine 555 <== SourceLine 1035
                                {
                                    // JavaLine 557 <== SourceLine 1036
                                    ((CHECKER2)(_CUR._SL)).coder.opq_3=((CHECKER2)(_CUR._SL)).display.getELEMENT(RTS_ENVIRONMENT.rank(((CHECKER2)(_CUR._SL)).cblev_6)).declquant;
                                    ;
                                    // JavaLine 560 <== SourceLine 1037
                                    ((CHECKER2)(_CUR._SL)).opc_6=((CHECKER2)(_CUR._SL)).opn;
                                    ;
                                    call(((CHECKER2)(_CUR._SL)).coder,1037);
                                    ;
                                    // JavaLine 565 <== SourceLine 1039
                                    new BUILDER1_precheck0_leaveblock((_CUR));
                                    ;
                                }
                                break;
                                case 77: 
                                // JavaLine 571 <== SourceLine 1043
                                {
                                    // JavaLine 573 <== SourceLine 1044
                                    new CHECKER2_semchecker_getOpd((_CUR));
                                    ;
                                    // JavaLine 576 <== SourceLine 1045
                                    ((CHECKER2)(_CUR._SL)).opc_6=((char)11);
                                    ;
                                    // JavaLine 579 <== SourceLine 1046
                                    ((CHECKER2)(_CUR._SL)).coder.opq_3=new BUILDER1_meaningof((_CUR._SL),opdSymb_2)._RESULT;
                                    ;
                                    // JavaLine 582 <== SourceLine 1047
                                    {
                                        // BEGIN INSPECTION 
                                        _inspect_1047_4611_3=((CHECKER2)(_CUR._SL)).coder.opq_3;
                                        if(_inspect_1047_4611_3!=null) { // INSPECT _inspect_1047_4611_3
                                            // JavaLine 587 <== SourceLine 1048
                                            {
                                                if(_VALUE((_inspect_1047_4611_3.categ_1==(((char)6))))) {
                                                    {
                                                        if(_VALUE((_inspect_1047_4611_3.match_1!=(null)))) {
                                                            // JavaLine 592 <== SourceLine 1049
                                                            ((CHECKER2)(_CUR._SL)).coder.opq_3=_inspect_1047_4611_3.match_1;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        else { // OTHERWISE 
                                            // JavaLine 600 <== SourceLine 1050
                                            ((CHECKER2)(_CUR._SL)).coder.opq_3=new ERRMSG_newnotseen((_CUR._SL),opdSymb_2)._RESULT;
                                        } // END OTHERWISE 
                                    } // END INSPECTION
                                    ;
                                    // JavaLine 605 <== SourceLine 1051
                                    call(((CHECKER2)(_CUR._SL)).coder,1051);
                                    ;
                                }
                                break;
                                case 51: 
                                // JavaLine 611 <== SourceLine 1057
                                {
                                    // JavaLine 613 <== SourceLine 1058
                                    new CHECKER2_semchecker_getOpd((_CUR));
                                    ;
                                    // JavaLine 616 <== SourceLine 1059
                                    call(constantelt_3,1059);
                                    ;
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block955_STACK_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 124: 
                                // JavaLine 624 <== SourceLine 1062
                                {
                                    // JavaLine 626 <== SourceLine 1063
                                    readonly_2=((CHECKER1_semchecker1_identifier)(exptop_2)).meaning;
                                    ;
                                }
                                break;
                                case 34: 
                                // JavaLine 632 <== SourceLine 1068
                                {
                                    // JavaLine 634 <== SourceLine 1069
                                    new CHECKER2_semchecker_getOpd((_CUR));
                                    ;
                                    // JavaLine 637 <== SourceLine 1070
                                    exptop_2=new CHECKER1_semchecker1_newIdent((_CUR),exptop_2,'"')._STM();
                                    ;
                                }
                                break;
                                case 1: 
                                // JavaLine 643 <== SourceLine 1074
                                {
                                    // JavaLine 645 <== SourceLine 1075
                                    if(_VALUE((((CHECKER2)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('R'))!=(((char)0))))) {
                                        {
                                            // BEGIN INSPECTION 
                                            _inspect_1075_4612_3=RTS_BASICIO.sysout();
                                            if(_inspect_1075_4612_3!=null) { // INSPECT _inspect_1075_4612_3
                                                // JavaLine 651 <== SourceLine 1076
                                                {
                                                    // JavaLine 653 <== SourceLine 1075
                                                    {
                                                        // JavaLine 655 <== SourceLine 1076
                                                        _inspect_1075_4612_3.outtext(new RTS_TXT(", opd: "));
                                                        ;
                                                        _inspect_1075_4612_3.outtext(((CHECKER2)(_CUR._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(RTS_ENVIRONMENT.loadChar(L2buf_3,L2p_3))));
                                                        ;
                                                    }
                                                }
                                            }
                                        } // END INSPECTION
                                    }
                                    ;
                                    // JavaLine 666 <== SourceLine 1078
                                    exptop_2=new CHECKER1_semchecker1_boolconst((_CUR),exptop_2,'[')._STM();
                                    ;
                                    // JavaLine 669 <== SourceLine 1079
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block1094_SetCo1_0); // GOTO EVALUATED LABEL
                                }
                                break;
                                case 2: 
                                // JavaLine 674 <== SourceLine 1082
                                {
                                    // JavaLine 676 <== SourceLine 1083
                                    if(_VALUE((((CHECKER2)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('R'))!=(((char)0))))) {
                                        {
                                            // BEGIN INSPECTION 
                                            _inspect_1083_4613_3=RTS_BASICIO.sysout();
                                            if(_inspect_1083_4613_3!=null) { // INSPECT _inspect_1083_4613_3
                                                // JavaLine 682 <== SourceLine 1084
                                                {
                                                    // JavaLine 684 <== SourceLine 1083
                                                    {
                                                        // JavaLine 686 <== SourceLine 1084
                                                        _inspect_1083_4613_3.outtext(new RTS_TXT(", opd: "));
                                                        ;
                                                        _inspect_1083_4613_3.outint(RTS_ENVIRONMENT.rank(RTS_ENVIRONMENT.loadChar(L2buf_3,L2p_3)),3);
                                                    }
                                                }
                                            }
                                        } // END INSPECTION
                                    }
                                    ;
                                    // JavaLine 696 <== SourceLine 1085
                                    exptop_2=new CHECKER1_semchecker1_charconst((_CUR),exptop_2,'[')._STM();
                                    ;
                                    // JavaLine 699 <== SourceLine 1086
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block1094_SetCo1_0); // GOTO EVALUATED LABEL
                                }
                                break;
                                case 3: 
                                // JavaLine 704 <== SourceLine 1089
                                {
                                    // JavaLine 706 <== SourceLine 1090
                                    ((CHECKER2)(_CUR._SL)).opn=((char)4);
                                    ;
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block1094_Acon_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 4: 
                                case 5: 
                                case 6: 
                                // JavaLine 716 <== SourceLine 1093
                                {
                                    // JavaLine 718 <== SourceLine 1094
                                    {
                                        _SIM_LABEL(7); // DeclaredIn: semchecker -> semchecker[CHECKER2_semchecker] DeclarationKind=Class
                                        // JavaLine 721 <== SourceLine 1095
                                        if(_VALUE((aconstList_2!=(null)))) {
                                            {
                                                // JavaLine 724 <== SourceLine 1096
                                                aconstList_2.p_pred=exptop_2;
                                                ;
                                                aconstList_2.p_ch='[';
                                                ;
                                                // JavaLine 729 <== SourceLine 1097
                                                exptop_2=aconstList_2;
                                                ;
                                                aconstList_2=null;
                                                ;
                                            }
                                        } else {
                                            // JavaLine 736 <== SourceLine 1098
                                            exptop_2=new CHECKER1_semchecker1_arithconst((_CUR),exptop_2,'[')._STM();
                                        }
                                    }
                                    ;
                                    // JavaLine 741 <== SourceLine 1099
                                    {
                                        _SIM_LABEL(8); // DeclaredIn: semchecker -> semchecker[CHECKER2_semchecker] DeclarationKind=Class
                                        // JavaLine 744 <== SourceLine 1100
                                        if(_VALUE((((CHECKER2)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('R'))!=(((char)0))))) {
                                            // JavaLine 746 <== SourceLine 1101
                                            {
                                                // BEGIN INSPECTION 
                                                _inspect_1101_4614_3=RTS_BASICIO.sysout();
                                                if(_inspect_1101_4614_3!=null) { // INSPECT _inspect_1101_4614_3
                                                    {
                                                        {
                                                            _inspect_1101_4614_3.outtext(new RTS_TXT(", opd: "));
                                                            ;
                                                            // JavaLine 755 <== SourceLine 1102
                                                            _inspect_1101_4614_3.outtext(new COMMON_nameof((_CUR._SL),RTS_ENVIRONMENT.loadChar(L2buf_3,L2p_3),RTS_ENVIRONMENT.loadChar(L2buf_3,(L2p_3+(1))))._RESULT);
                                                            ;
                                                        }
                                                    }
                                                }
                                            } // END INSPECTION
                                        }
                                    }
                                    ;
                                    // JavaLine 765 <== SourceLine 1104
                                    ((CHECKER1_semchecker1__const)(exptop_2)).ixhi_1=RTS_ENVIRONMENT.loadChar(L2buf_3,L2p_3);
                                    ;
                                    L2p_3=(L2p_3+(1));
                                    ;
                                    // JavaLine 770 <== SourceLine 1105
                                    {
                                        _SIM_LABEL(9); // DeclaredIn: semchecker -> semchecker[CHECKER2_semchecker] DeclarationKind=Class
                                        ((CHECKER1_semchecker1__const)(exptop_2)).ixlo_1=RTS_ENVIRONMENT.loadChar(L2buf_3,L2p_3);
                                    }
                                    ;
                                    L2p_3=(L2p_3+(1));
                                    ;
                                    // JavaLine 778 <== SourceLine 1106
                                    {
                                        _SIM_LABEL(10); // DeclaredIn: semchecker -> semchecker[CHECKER2_semchecker] DeclarationKind=Class
                                        exptop_2.type=exptop_2.ctype=((CHECKER2)(_CUR._SL)).opn;
                                    }
                                    ;
                                    exptop_2.cl=((char)1);
                                    ;
                                }
                                break;
                                case 8: 
                                // JavaLine 789 <== SourceLine 1110
                                {
                                    // JavaLine 791 <== SourceLine 1111
                                    exptop_2=new CHECKER1_semchecker1_textconst((_CUR),exptop_2,'[')._STM();
                                    ;
                                    // JavaLine 794 <== SourceLine 1112
                                    exptop_2.qual=textclass_2;
                                    ;
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block1094_SetCon_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 7: 
                                // JavaLine 802 <== SourceLine 1115
                                {
                                    // JavaLine 804 <== SourceLine 1116
                                    exptop_2=new CHECKER1_semchecker1_refconst((_CUR),exptop_2,'[')._STM();
                                    ;
                                    // JavaLine 807 <== SourceLine 1117
                                    ((CHECKER1_semchecker1__const)(exptop_2)).ixlo_1='@';
                                    ;
                                    // JavaLine 810 <== SourceLine 1118
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block1094_SetCo2_0); // GOTO EVALUATED LABEL
                                }
                                break;
                                case 25: 
                                case 29: 
                                // JavaLine 816 <== SourceLine 1121
                                {
                                    // JavaLine 818 <== SourceLine 1122
                                    new CHECKER2_semchecker_getOpd((_CUR));
                                    ;
                                    // JavaLine 821 <== SourceLine 1123
                                    exptop_2=new CHECKER1_semchecker1_classcomparator((_CUR),exptop_2.p_pred,((CHECKER2)(_CUR._SL)).opn,null,exptop_2)._STM();
                                    ;
                                }
                                break;
                                case 41: 
                                // JavaLine 827 <== SourceLine 1127
                                {
                                    // JavaLine 829 <== SourceLine 1128
                                    new CHECKER2_semchecker_getOpd((_CUR));
                                    ;
                                    // JavaLine 832 <== SourceLine 1129
                                    exptop_2=new CHECKER1_semchecker1_instqual((_CUR),exptop_2.p_pred,')',null,exptop_2)._STM();
                                    ;
                                }
                                break;
                                case 50: 
                                // JavaLine 838 <== SourceLine 1133
                                {
                                    // JavaLine 840 <== SourceLine 1134
                                    new CHECKER2_semchecker_getOpd((_CUR));
                                    ;
                                    // JavaLine 843 <== SourceLine 1135
                                    exptop_2=new CHECKER1_semchecker1_localobject((_CUR),exptop_2,'2',null,true_const_2)._STM();
                                    ;
                                }
                                break;
                                case 95: 
                                // JavaLine 849 <== SourceLine 1140
                                {
                                    // JavaLine 851 <== SourceLine 1141
                                    ((CHECKER2)(_CUR._SL)).opn='^';
                                    ;
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block1148_swap_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 137: 
                                case 49: 
                                case 148: 
                                case 15: 
                                // JavaLine 862 <== SourceLine 1147
                                {
                                    // JavaLine 864 <== SourceLine 1148
                                    {
                                        _SIM_LABEL(11); // DeclaredIn: semchecker -> semchecker[CHECKER2_semchecker] DeclarationKind=Class
                                        call(ust_3,1148);
                                    }
                                    ;
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block955_REPLACE_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 108: 
                                // JavaLine 875 <== SourceLine 1151
                                {
                                    // JavaLine 877 <== SourceLine 1152
                                    if(_VALUE((exptop_2.ctype==('Z')))) {
                                        new CHECKER1_semchecker1_checkasexp((_CUR),((CHECKER1_semchecker1_identifier)(exptop_2)));
                                    }
                                    ;
                                    // JavaLine 882 <== SourceLine 1153
                                    exptop_2.cl=((char)1);
                                    ;
                                    exptop_2.emit_0().CPF();
                                    ;
                                    // JavaLine 887 <== SourceLine 1154
                                    if(_VALUE((exptop_2.type==(((char)2))))) {
                                        {
                                            // JavaLine 890 <== SourceLine 1155
                                            ((CHECKER2)(_CUR._SL)).opc_6=((char)136);
                                            ;
                                            ((CHECKER2)(_CUR._SL)).opt=((char)4);
                                            ;
                                            call(((CHECKER2)(_CUR._SL)).coder,1155);
                                        }
                                    } else {
                                        // JavaLine 898 <== SourceLine 1156
                                        if(_VALUE((exptop_2.type!=(((char)4))))) {
                                            {
                                                if(_VALUE((exptop_2.type!=(((char)3))))) {
                                                    // JavaLine 902 <== SourceLine 1157
                                                    new ERRMSG_error0((_CUR._SL),441);
                                                }
                                            }
                                        }
                                    }
                                    ;
                                    // JavaLine 909 <== SourceLine 1158
                                    new CHECKER1_semchecker1_popExpStack((_CUR));
                                    ;
                                    // JavaLine 912 <== SourceLine 1159
                                    call(ust_3,1159);
                                    ;
                                }
                                break;
                                case 79: 
                                case 116: 
                                // JavaLine 919 <== SourceLine 1164
                                {
                                    // JavaLine 921 <== SourceLine 1165
                                    call(ust_3,1165);
                                    ;
                                }
                                break;
                                case 81: 
                                // JavaLine 927 <== SourceLine 1169
                                {
                                    // JavaLine 929 <== SourceLine 1170
                                    call(ust_3,1170);
                                    ;
                                    // JavaLine 932 <== SourceLine 1171
                                    exptop_2=new CHECKER1_semchecker1_expinparantes((_CUR),exptop_2.p_pred,'Q',null,exptop_2)._STM();
                                    ;
                                    // JavaLine 935 <== SourceLine 1172
                                    {
                                        _SIM_LABEL(12); // DeclaredIn: semchecker -> semchecker[CHECKER2_semchecker] DeclarationKind=Class
                                        // JavaLine 938 <== SourceLine 1173
                                        if(_VALUE((opttop_2>(0)))) {
                                            {
                                                // JavaLine 941 <== SourceLine 1174
                                                expexptop.putELEMENT(expexptop.index(opttop_2),null);
                                                ;
                                                opttop_2=(opttop_2-(1));
                                            }
                                        }
                                    }
                                    ;
                                }
                                break;
                                case 107: 
                                // JavaLine 952 <== SourceLine 1178
                                {
                                    // JavaLine 954 <== SourceLine 1179
                                    call(ust_3,1179);
                                    ;
                                    // JavaLine 957 <== SourceLine 1180
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block1170_POPEXPEXP_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 47: 
                                // JavaLine 963 <== SourceLine 1184
                                {
                                    // JavaLine 965 <== SourceLine 1185
                                    if(_VALUE((((CHECKER2)(_CUR._SL)).opc_6!=(((char)128))))) {
                                        {
                                            // JavaLine 968 <== SourceLine 1186
                                            ((CHECKER2)(_CUR._SL)).opn='&';
                                            ;
                                            _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block982_OPNOUT_0); // GOTO EVALUATED LABEL
                                        }
                                    }
                                    ;
                                }
                                break;
                                case 64: 
                                // JavaLine 978 <== SourceLine 1190
                                {
                                    // JavaLine 980 <== SourceLine 1191
                                    if(_VALUE((!(_IS(exptop_2,CHECKER2_semchecker_caseexp.class))))) {
                                        new ERRMSG_internerr((_CUR._SL),((char)9),1191);
                                    }
                                    ;
                                    // JavaLine 985 <== SourceLine 1192
                                    new CHECKER2_semchecker_caseexp_othwise(((CHECKER2_semchecker_caseexp)(exptop_2)));
                                    ;
                                }
                                break;
                                case 10: 
                                // JavaLine 991 <== SourceLine 1196
                                {
                                    // JavaLine 993 <== SourceLine 1197
                                    ((CHECKER2)(_CUR._SL)).opn='*';
                                    ;
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block982_OPNOUT_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 120: 
                                // JavaLine 1001 <== SourceLine 1201
                                {
                                    // JavaLine 1003 <== SourceLine 1202
                                    if(_VALUE((!(_IS(exptop_2,CHECKER2_semchecker_caseexp.class))))) {
                                        new ERRMSG_internerr((_CUR._SL),((char)9),1202);
                                    }
                                    ;
                                    // JavaLine 1008 <== SourceLine 1203
                                    exptop_2.emit_0().CPF();
                                    ;
                                    // JavaLine 1011 <== SourceLine 1204
                                    new CHECKER1_semchecker1_popExpStack((_CUR));
                                    ;
                                }
                                break;
                                case 96: 
                                // JavaLine 1017 <== SourceLine 1208
                                {
                                    // JavaLine 1019 <== SourceLine 1209
                                    {
                                        _SIM_LABEL(13); // DeclaredIn: semchecker -> semchecker[CHECKER2_semchecker] DeclarationKind=Class
                                        unstop_3=((RTS_CHARACTER_ARRAY)ust_3.optstack).getELEMENT(opttop_2);
                                    }
                                    ;
                                    exptop_2=expexptop.getELEMENT(opttop_2);
                                    ;
                                    // JavaLine 1027 <== SourceLine 1210
                                    if(_VALUE((unstop_3==(((char)14))))) {
                                        _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_NEXTOPN_0); // GOTO EVALUATED LABEL
                                    }
                                    ;
                                    // JavaLine 1032 <== SourceLine 1211
                                    if(_VALUE(((((unstop_3==('_'))|((unstop_3==(((char)21)))))|((unstop_3==('q'))))|((unstop_3==(((char)130))))))) {
                                        // JavaLine 1034 <== SourceLine 1216
                                        {
                                            // JavaLine 1036 <== SourceLine 1217
                                            exptop_2=new CHECKER1_semchecker1_exp((_CUR),exptop_2,((char)15))._STM();
                                            ;
                                            exptop_2.type=((char)15);
                                            ;
                                        }
                                    } else {
                                        // JavaLine 1043 <== SourceLine 1218
                                        {
                                            // JavaLine 1045 <== SourceLine 1219
                                            expexptop.putELEMENT(expexptop.index(opttop_2),null);
                                            ;
                                            opttop_2=(opttop_2-(1));
                                            ;
                                            _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block1209_repu_0); // GOTO EVALUATED LABEL
                                        }
                                    }
                                    ;
                                }
                                break;
                                case 21: 
                                // JavaLine 1057 <== SourceLine 1231
                                {
                                    // JavaLine 1059 <== SourceLine 1232
                                    ((CHECKER2)(_CUR._SL)).ingotostmt_6=((CHECKER2)(_CUR._SL)).notinconditional_6=true;
                                    ;
                                    // JavaLine 1062 <== SourceLine 1233
                                    ((CHECKER2)(_CUR._SL)).opc_6=((char)21);
                                    ;
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block955_STACK_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 130: 
                                // JavaLine 1070 <== SourceLine 1236
                                {
                                    // JavaLine 1072 <== SourceLine 1239
                                    ((CHECKER2)(_CUR._SL)).opc_6=((char)130);
                                    ;
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block955_STACK_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 145: 
                                // JavaLine 1080 <== SourceLine 1248
                                {
                                    // JavaLine 1082 <== SourceLine 1249
                                    call(ust_3,1249);
                                    ;
                                    // JavaLine 1085 <== SourceLine 1250
                                    if(_VALUE((exptop_2.type!=(((char)1))))) {
                                        {
                                            if(_VALUE((exptop_2.type!=(((char)15))))) {
                                                // JavaLine 1089 <== SourceLine 1251
                                                new ERRMSG_error0((_CUR._SL),172);
                                            }
                                        }
                                    }
                                    ;
                                    // JavaLine 1095 <== SourceLine 1252
                                    exptop_2.cl=((char)1);
                                    ;
                                    // JavaLine 1098 <== SourceLine 1253
                                    if(_VALUE((exptop_2.ctype==('Z')))) {
                                        new CHECKER1_semchecker1_checkasexp((_CUR),((CHECKER1_semchecker1_identifier)(exptop_2)));
                                    } else {
                                        // JavaLine 1102 <== SourceLine 1254
                                        if(_VALUE((exptop_2.ctype==(':')))) {
                                            exptop_2.cl=((char)3);
                                        }
                                    }
                                    ;
                                    // JavaLine 1108 <== SourceLine 1255
                                    exptop_2.emit_0().CPF();
                                    ;
                                    // JavaLine 1111 <== SourceLine 1256
                                    ((CHECKER2)(_CUR._SL)).opc_6=((CHECKER2)(_CUR._SL)).opn;
                                    ;
                                    // JavaLine 1114 <== SourceLine 1257
                                    if(_VALUE((exptop_2.ctype!=(':')))) {
                                        call(((CHECKER2)(_CUR._SL)).coder,1257);
                                    }
                                    ;
                                    // JavaLine 1119 <== SourceLine 1258
                                    new CHECKER1_semchecker1_popExpStack((_CUR));
                                    ;
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block1170_POPEXPEXP_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 128: 
                                // JavaLine 1127 <== SourceLine 1262
                                {
                                    // JavaLine 1129 <== SourceLine 1263
                                    call(ust_3,1263);
                                    ;
                                    // JavaLine 1132 <== SourceLine 1264
                                    if(_VALUE((exptop_2.type!=(((char)11))))) {
                                        {
                                            if(_VALUE((exptop_2.type!=(((char)15))))) {
                                                // JavaLine 1136 <== SourceLine 1265
                                                new ERRMSG_error0((_CUR._SL),171);
                                            }
                                        }
                                    }
                                    ;
                                    // JavaLine 1142 <== SourceLine 1266
                                    exptop_2.cl=((char)1);
                                    ;
                                    // JavaLine 1145 <== SourceLine 1267
                                    if(_VALUE((exptop_2.ctype==('Z')))) {
                                        new CHECKER1_semchecker1_checkasexp((_CUR),((CHECKER1_semchecker1_identifier)(exptop_2)));
                                    }
                                    ;
                                    // JavaLine 1150 <== SourceLine 1268
                                    exptop_2.emit_0().CPF();
                                    ;
                                    // JavaLine 1153 <== SourceLine 1269
                                    ((CHECKER2)(_CUR._SL)).opc_6=((char)128);
                                    ;
                                    call(((CHECKER2)(_CUR._SL)).coder,1269);
                                    ;
                                    // JavaLine 1158 <== SourceLine 1270
                                    new CHECKER1_semchecker1_popExpStack((_CUR));
                                    ;
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block1170_POPEXPEXP_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 27: 
                                // JavaLine 1166 <== SourceLine 1274
                                {
                                    // JavaLine 1168 <== SourceLine 1277
                                    ((CHECKER2)(_CUR._SL)).opc_6=((char)27);
                                    ;
                                }
                                break;
                                case 46: 
                                // JavaLine 1174 <== SourceLine 1281
                                {
                                    // JavaLine 1176 <== SourceLine 1282
                                    ((CHECKER2)(_CUR._SL)).opn='d';
                                    ;
                                    new CHECKER2_semchecker_getOpd((_CUR));
                                    ;
                                    call(ust_3,1282);
                                    ;
                                    // JavaLine 1183 <== SourceLine 1283
                                    if(_VALUE((!(_IS(exptop_2,CHECKER1_semchecker1_valassign.class))))) {
                                        new ERRMSG_internerr((_CUR._SL),((char)9),1283);
                                    }
                                    ;
                                    // JavaLine 1188 <== SourceLine 1284
                                    if(_VALUE((((CHECKER1_semchecker1_valassign)(exptop_2)).p1_source.type>(((char)4))))) {
                                        {
                                            // JavaLine 1191 <== SourceLine 1286
                                            {
                                                // BEGIN INSPECTION 
                                                _inspect_1286_4615_3=((COMMON_identsymbol)(opdSymb_2));
                                                if(_inspect_1286_4615_3!=null) { // INSPECT _inspect_1286_4615_3
                                                    // JavaLine 1196 <== SourceLine 1287
                                                    {
                                                        if(_VALUE((((COMMON_quantity)(_inspect_1286_4615_3.curmeaning_1)).symb_1==(((COMMON_identsymbol)_inspect_1286_4615_3))))) {
                                                            // JavaLine 1199 <== SourceLine 1288
                                                            {
                                                                // JavaLine 1201 <== SourceLine 1289
                                                                _inspect_1286_4615_3.curmeaning_1=_inspect_1286_4615_3.curmeaning_1.next;
                                                                ;
                                                                // JavaLine 1204 <== SourceLine 1290
                                                                ((CHECKER1_semchecker1_valassign)(exptop_2)).p1_target.meaning=((COMMON_quantity)(_inspect_1286_4615_3.curmeaning_1));
                                                                ;
                                                                // JavaLine 1207 <== SourceLine 1291
                                                                ((CHECKER1_semchecker1_valassign)(exptop_2)).p1_target.type=((CHECKER1_semchecker1_valassign)(exptop_2)).type=((char)6);
                                                                ;
                                                            }
                                                        }
                                                    }
                                                }
                                            } // END INSPECTION
                                            ;
                                        }
                                    }
                                    ;
                                    // JavaLine 1219 <== SourceLine 1296
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block1301_Eass_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 100: 
                                // JavaLine 1225 <== SourceLine 1300
                                {
                                    // JavaLine 1227 <== SourceLine 1301
                                    call(ust_3,1301);
                                    ;
                                    // JavaLine 1230 <== SourceLine 1302
                                    {
                                        _SIM_LABEL(14); // DeclaredIn: semchecker -> semchecker[CHECKER2_semchecker] DeclarationKind=Class
                                        exptop_2.emit_0().CPF();
                                    }
                                    ;
                                    // JavaLine 1236 <== SourceLine 1304
                                    new CHECKER1_semchecker1_popExpStack((_CUR));
                                    ;
                                    // JavaLine 1239 <== SourceLine 1305
                                    ((CHECKER2)(_CUR._SL)).opc_6='d';
                                    ;
                                    // JavaLine 1242 <== SourceLine 1306
                                    call(((CHECKER2)(_CUR._SL)).coder,1306);
                                    ;
                                }
                                break;
                                case 78: 
                                // JavaLine 1248 <== SourceLine 1310
                                {
                                    // JavaLine 1250 <== SourceLine 1311
                                    call(ust_3,1311);
                                    ;
                                    // JavaLine 1253 <== SourceLine 1312
                                    call(lastnap_2,1312);
                                    ;
                                }
                                break;
                                case 32: 
                                // JavaLine 1259 <== SourceLine 1316
                                {
                                    // JavaLine 1261 <== SourceLine 1317
                                    new CHECKER2_semchecker_getlastblno((_CUR));
                                    ;
                                    // JavaLine 1264 <== SourceLine 1318
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block1322_LIARGE_0); // GOTO EVALUATED LABEL
                                }
                                break;
                                case 98: 
                                case 104: 
                                // JavaLine 1270 <== SourceLine 1321
                                {
                                    // JavaLine 1272 <== SourceLine 1322
                                    {
                                        _SIM_LABEL(15); // DeclaredIn: semchecker -> semchecker[CHECKER2_semchecker] DeclarationKind=Class
                                        call(ust_3,1322);
                                    }
                                    ;
                                    // JavaLine 1278 <== SourceLine 1323
                                    call(lastnap_2,1323);
                                    ;
                                    // JavaLine 1281 <== SourceLine 1324
                                    lastnap_2.inuse=false;
                                    ;
                                    // JavaLine 1284 <== SourceLine 1325
                                    call(lastnap_2,1325);
                                    ;
                                    // JavaLine 1287 <== SourceLine 1327
                                    exptop_2=new CHECKER1_semchecker1_argumented((_CUR),exptop_2.p_pred,(((((CHECKER2)(_CUR._SL)).opn==(((char)32))))?(']'):('b')),((CHECKER1_semchecker1_identifier)(exptop_2)),lastnap_2.firstarg.nextarg,lastnap_2.noofexpargs,lastnap_2.argno)._STM();
                                    ;
                                    // JavaLine 1290 <== SourceLine 1333
                                    lastnap_2=lastnap_2.pred;
                                    ;
                                    // JavaLine 1293 <== SourceLine 1334
                                    if(_VALUE((((CHECKER2)(_CUR._SL)).opn==(((char)32))))) {
                                        {
                                            exptop_2.emit_0().CPF();
                                            ;
                                            new CHECKER1_semchecker1_popExpStack((_CUR));
                                        }
                                    }
                                    ;
                                    // JavaLine 1302 <== SourceLine 1335
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block1170_POPEXPEXP_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 93: 
                                // JavaLine 1308 <== SourceLine 1339
                                {
                                    // JavaLine 1310 <== SourceLine 1340
                                    new CHECKER2_semchecker_getlastblno((_CUR));
                                    ;
                                    // JavaLine 1313 <== SourceLine 1341
                                    new CHECKER2_semchecker_getOpd((_CUR));
                                    ;
                                    // JavaLine 1316 <== SourceLine 1342
                                    new CHECKER1_semchecker1_prefIdent((_CUR),exptop_2,']')._STM().emit_0().CPF();
                                    ;
                                }
                                break;
                                case 122: 
                                // JavaLine 1322 <== SourceLine 1347
                                {
                                    // JavaLine 1324 <== SourceLine 1348
                                    if(_VALUE((exptop_2.ctype==('Z')))) {
                                        {
                                            // JavaLine 1327 <== SourceLine 1349
                                            if(exptop_2.kind<((char)0) || exptop_2.kind>((char)13)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                            switch(exptop_2.kind) { // BEGIN SWITCH STATEMENT
                                                case 10: 
                                                ;
                                                break;
                                                case 1: 
                                                // JavaLine 1334 <== SourceLine 1351
                                                {
                                                    // JavaLine 1336 <== SourceLine 1352
                                                    new CHECKER1_semchecker1_checkasexp((_CUR),((CHECKER1_semchecker1_identifier)(exptop_2)));
                                                    ;
                                                }
                                                break;
                                                case 5: 
                                                // JavaLine 1342 <== SourceLine 1360
                                                new CHECKER1_semchecker1_checkasexp((_CUR),((CHECKER1_semchecker1_identifier)(exptop_2)));
                                                break;
                                                case 2: 
                                                case 6: 
                                                // JavaLine 1347 <== SourceLine 1361
                                                new CHECKER1_semchecker1_identifier_identError(((CHECKER1_semchecker1_identifier)(exptop_2)),360);
                                                break;
                                                case 4: 
                                                // JavaLine 1351 <== SourceLine 1362
                                                new CHECKER1_semchecker1_identifier_identError(((CHECKER1_semchecker1_identifier)(exptop_2)),361);
                                                break;
                                                case 0: 
                                                // JavaLine 1355 <== SourceLine 1363
                                                new CHECKER1_semchecker1_identifier_identError(((CHECKER1_semchecker1_identifier)(exptop_2)),362);
                                                break;
                                                case 3: 
                                                // JavaLine 1359 <== SourceLine 1364
                                                new CHECKER1_semchecker1_identifier_identError(((CHECKER1_semchecker1_identifier)(exptop_2)),363);
                                                break;
                                                default:
                                                // JavaLine 1363 <== SourceLine 1365
                                                {
                                                    _SIM_LABEL(16); // DeclaredIn: semchecker -> semchecker[CHECKER2_semchecker] DeclarationKind=Class
                                                    new BUILDER1_visiblegenerator_StopScode_1(((BUILDER1_visiblegenerator)(((CHECKER2)(_CUR._SL)).coder)),((char)9),1365);
                                                }
                                                break;
                                            } // END SWITCH STATEMENT
                                        }
                                    } else {
                                        // JavaLine 1372 <== SourceLine 1370
                                        if(_VALUE((exptop_2.ctype==(((char)129))))) {
                                            {
                                                // JavaLine 1375 <== SourceLine 1372
                                                {
                                                    // BEGIN INSPECTION 
                                                    _inspect_1372_4616_3=((CHECKER1_semchecker1_argumented)(exptop_2)).p1_ident;
                                                    if(_inspect_1372_4616_3!=null) { // INSPECT _inspect_1372_4616_3
                                                        // JavaLine 1380 <== SourceLine 1373
                                                        {
                                                            // JavaLine 1382 <== SourceLine 1372
                                                            {
                                                                // JavaLine 1384 <== SourceLine 1373
                                                                if(_inspect_1372_4616_3.kind<((char)0) || _inspect_1372_4616_3.kind>((char)13)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                                                switch(_inspect_1372_4616_3.kind) { // BEGIN SWITCH STATEMENT
                                                                    case 10: 
                                                                    case 1: 
                                                                    ;
                                                                    break;
                                                                    case 5: 
                                                                    // JavaLine 1392 <== SourceLine 1375
                                                                    {
                                                                        // JavaLine 1394 <== SourceLine 1376
                                                                        if(_VALUE((_inspect_1372_4616_3.p_ch==(((char)129))))) {
                                                                            new CHECKER1_semchecker1_identifier_identError(_inspect_1372_4616_3,334);
                                                                        }
                                                                        ;
                                                                    }
                                                                    break;
                                                                    case 2: 
                                                                    case 6: 
                                                                    // JavaLine 1403 <== SourceLine 1383
                                                                    new CHECKER1_semchecker1_identifier_identError(_inspect_1372_4616_3,364);
                                                                    break;
                                                                    case 4: 
                                                                    // JavaLine 1407 <== SourceLine 1384
                                                                    new CHECKER1_semchecker1_identifier_identError(_inspect_1372_4616_3,365);
                                                                    break;
                                                                    default:
                                                                    // JavaLine 1411 <== SourceLine 1385
                                                                    {
                                                                        _SIM_LABEL(17); // DeclaredIn: semchecker -> semchecker[CHECKER2_semchecker] DeclarationKind=Class
                                                                        new BUILDER1_visiblegenerator_StopScode_1(((BUILDER1_visiblegenerator)(((CHECKER2)(_CUR._SL)).coder)),((char)9),1385);
                                                                    }
                                                                    break;
                                                                } // END SWITCH STATEMENT
                                                            }
                                                        }
                                                    }
                                                } // END INSPECTION
                                            }
                                        } else {
                                            // JavaLine 1424 <== SourceLine 1391
                                            new ERRMSG_error0((_CUR._SL),173);
                                        }
                                    }
                                    ;
                                    // JavaLine 1429 <== SourceLine 1392
                                    exptop_2.cl=((char)1);
                                    ;
                                    exptop_2.emit_0().CPF();
                                    ;
                                    new CHECKER1_semchecker1_popExpStack((_CUR));
                                    ;
                                    // JavaLine 1436 <== SourceLine 1393
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block982_OPNOUT_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 105: 
                                case 127: 
                                // JavaLine 1443 <== SourceLine 1396
                                {
                                    // JavaLine 1445 <== SourceLine 1397
                                    new CHECKER2_semchecker_getlastblno((_CUR));
                                    ;
                                    // JavaLine 1448 <== SourceLine 1398
                                    call(ust_3,1398);
                                    ;
                                    // JavaLine 1451 <== SourceLine 1399
                                    if(_VALUE((exptop_2.type!=(((char)7))))) {
                                        {
                                            // JavaLine 1454 <== SourceLine 1400
                                            if(_VALUE((exptop_2.type!=(((char)15))))) {
                                                new ERRMSG_error0((_CUR._SL),174);
                                            }
                                        }
                                    }
                                    ;
                                    // JavaLine 1461 <== SourceLine 1401
                                    if(_VALUE((exptop_2.ctype==('Z')))) {
                                        new CHECKER1_semchecker1_checkasexp((_CUR),((CHECKER1_semchecker1_identifier)(exptop_2)));
                                    }
                                    ;
                                    // JavaLine 1466 <== SourceLine 1402
                                    exptop_2.cl=((char)1);
                                    ;
                                    exptop_2.emit_0().CPF();
                                    ;
                                    // JavaLine 1471 <== SourceLine 1404
                                    simpleList_2=null;
                                    ;
                                    // JavaLine 1474 <== SourceLine 1407
                                    if(_VALUE(_IS(exptop_2,CHECKER1_semchecker1_newIdent.class))) {
                                        implNone_2=false;
                                    } else {
                                        // JavaLine 1478 <== SourceLine 1409
                                        if(_VALUE(_IS(exptop_2,CHECKER1_semchecker1_argumented.class))) {
                                            {
                                                // JavaLine 1481 <== SourceLine 1410
                                                if(_VALUE(_IS(((CHECKER1_semchecker1_argumented)(exptop_2)).p1_ident,CHECKER1_semchecker1_newIdent.class))) {
                                                    // JavaLine 1483 <== SourceLine 1411
                                                    implNone_2=false;
                                                }
                                            }
                                        }
                                    }
                                    ;
                                    // JavaLine 1490 <== SourceLine 1412
                                    if(_VALUE((((CHECKER2)(_CUR._SL)).opn==('i')))) {
                                        {
                                            new CHECKER2_semchecker_enterconn((_CUR),exptop_2.qual);
                                            ;
                                            _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block1417_bscp_0); // GOTO EVALUATED LABEL
                                        }
                                    }
                                    ;
                                    // JavaLine 1499 <== SourceLine 1413
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block1417_LIWHEN1_0); // GOTO EVALUATED LABEL
                                }
                                break;
                                case 55: 
                                // JavaLine 1504 <== SourceLine 1416
                                {
                                    // JavaLine 1506 <== SourceLine 1417
                                    new CHECKER2_semchecker_getlastblno((_CUR));
                                    ;
                                    // JavaLine 1509 <== SourceLine 1418
                                    new CHECKER2_semchecker_leaveConn((_CUR));
                                    ;
                                    // JavaLine 1512 <== SourceLine 1419
                                    {
                                        _SIM_LABEL(18); // DeclaredIn: semchecker -> semchecker[CHECKER2_semchecker] DeclarationKind=Class
                                        new CHECKER2_semchecker_getOpd((_CUR));
                                    }
                                    ;
                                    // JavaLine 1518 <== SourceLine 1420
                                    cquant_2=new BUILDER1_meaningof((_CUR._SL),opdSymb_2)._RESULT;
                                    ;
                                    // JavaLine 1521 <== SourceLine 1421
                                    if(_VALUE((cquant_2==(null)))) {
                                        cquant_2=new ERRMSG_newnotseen((_CUR._SL),opdSymb_2)._RESULT;
                                    }
                                    ;
                                    // JavaLine 1526 <== SourceLine 1422
                                    if(_VALUE(((cquant_2.kind_1!=(((char)5)))&&((cquant_2.categ_1!=(((char)5))))))) {
                                        // JavaLine 1528 <== SourceLine 1423
                                        {
                                            new ERRMSG_error1id((_CUR._SL),317,cquant_2.symb_1);
                                            ;
                                            new CHECKER2_semchecker_enterconn((_CUR),null);
                                            ;
                                        }
                                    } else {
                                        // JavaLine 1536 <== SourceLine 1424
                                        {
                                            if(_VALUE((exptop_2.qual!=(null)))) {
                                                // JavaLine 1539 <== SourceLine 1425
                                                {
                                                    if(_VALUE((!((new BUILDER1_precheck0_subclass((_CUR),exptop_2.qual,cquant_2)._RESULT||(new BUILDER1_precheck0_subclass((_CUR),cquant_2,exptop_2.qual)._RESULT)))))) {
                                                        // JavaLine 1542 <== SourceLine 1427
                                                        new ERRMSG_note1id((_CUR._SL),396,opdSymb_2);
                                                    }
                                                    ;
                                                }
                                            }
                                            ;
                                            // JavaLine 1549 <== SourceLine 1429
                                            new CHECKER2_semchecker_enterconn((_CUR),(((cquant_2.kind_1==(((char)5))))?(cquant_2):(null)));
                                            ;
                                        }
                                    }
                                    ;
                                    // JavaLine 1555 <== SourceLine 1431
                                    cquant_2=null;
                                    ;
                                    // JavaLine 1558 <== SourceLine 1432
                                    {
                                        _SIM_LABEL(19); // DeclaredIn: semchecker -> semchecker[CHECKER2_semchecker] DeclarationKind=Class
                                        new CHECKER2_semchecker_enterstmt((_CUR));
                                    }
                                    ;
                                    // JavaLine 1564 <== SourceLine 1433
                                    ((CHECKER2)(_CUR._SL)).coder.opq_3=((CHECKER2)(_CUR._SL)).display.getELEMENT(RTS_ENVIRONMENT.rank(((CHECKER2)(_CUR._SL)).cblev_6)).declquant.prefqual_1;
                                    ;
                                    // JavaLine 1567 <== SourceLine 1434
                                    ((CHECKER2)(_CUR._SL)).opc_6=((CHECKER2)(_CUR._SL)).opn;
                                    ;
                                    call(((CHECKER2)(_CUR._SL)).coder,1434);
                                    ;
                                }
                                break;
                                case 37: 
                                case 106: 
                                // JavaLine 1576 <== SourceLine 1439
                                {
                                    // JavaLine 1578 <== SourceLine 1440
                                    new CHECKER2_semchecker_leaveConn((_CUR));
                                    ;
                                    // JavaLine 1581 <== SourceLine 1441
                                    new CHECKER1_semchecker1_popExpStack((_CUR));
                                    ;
                                    // JavaLine 1584 <== SourceLine 1442
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block982_OPNOUT_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 19: 
                                // JavaLine 1590 <== SourceLine 1445
                                {
                                    // JavaLine 1592 <== SourceLine 1446
                                    new CHECKER2_semchecker_getlastblno((_CUR));
                                    ;
                                    // JavaLine 1595 <== SourceLine 1447
                                    new CHECKER2_semchecker_enterstmt((_CUR));
                                    ;
                                    // JavaLine 1598 <== SourceLine 1448
                                    new CHECKER2_semchecker_getOpd((_CUR));
                                    ;
                                    // JavaLine 1601 <== SourceLine 1449
                                    q_2=new BUILDER1_meaningof((_CUR._SL),opdSymb_2)._RESULT;
                                    ;
                                    // JavaLine 1604 <== SourceLine 1450
                                    {
                                        // BEGIN INSPECTION 
                                        _inspect_1450_4617_3=q_2;
                                        if(_inspect_1450_4617_3!=null) { // INSPECT _inspect_1450_4617_3
                                            // JavaLine 1609 <== SourceLine 1451
                                            {
                                                // JavaLine 1611 <== SourceLine 1450
                                                {
                                                    // JavaLine 1613 <== SourceLine 1451
                                                    if(_VALUE((_inspect_1450_4617_3.categ_1==(((char)2))))) {
                                                        new ERRMSG_error0((_CUR._SL),-180);
                                                    }
                                                    ;
                                                    // JavaLine 1618 <== SourceLine 1452
                                                    if(_VALUE((_inspect_1450_4617_3.kind_1!=(((char)0))))) {
                                                        {
                                                            // JavaLine 1621 <== SourceLine 1453
                                                            if(_VALUE((_inspect_1450_4617_3.kind_1!=(((char)10))))) {
                                                                new ERRMSG_error1id((_CUR._SL),306,_inspect_1450_4617_3.symb_1);
                                                            }
                                                        }
                                                    }
                                                    ;
                                                }
                                            }
                                        }
                                    } // END INSPECTION
                                    ;
                                    // JavaLine 1633 <== SourceLine 1455
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block1461_opqout_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 26: 
                                // JavaLine 1639 <== SourceLine 1460
                                {
                                    // JavaLine 1641 <== SourceLine 1461
                                    {
                                        _SIM_LABEL(20); // DeclaredIn: semchecker -> semchecker[CHECKER2_semchecker] DeclarationKind=Class
                                        ((CHECKER2)(_CUR._SL)).coder.opq_3=((CHECKER2)(_CUR._SL)).display.getELEMENT(RTS_ENVIRONMENT.rank(((CHECKER2)(_CUR._SL)).cblev_6)).declquant;
                                    }
                                    ;
                                    // JavaLine 1647 <== SourceLine 1462
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block982_OPNOUT_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 111: 
                                // JavaLine 1653 <== SourceLine 1465
                                {
                                    // JavaLine 1655 <== SourceLine 1466
                                    ((CHECKER2)(_CUR._SL)).opc_6='o';
                                    ;
                                    // JavaLine 1658 <== SourceLine 1468
                                    {
                                        // BEGIN INSPECTION 
                                        _inspect_1468_4618_3=((CHECKER2)(_CUR._SL)).display.getELEMENT(RTS_ENVIRONMENT.rank(((CHECKER2)(_CUR._SL)).cblev_6)).declquant;
                                        if(_inspect_1468_4618_3!=null) { // INSPECT _inspect_1468_4618_3
                                            // JavaLine 1663 <== SourceLine 1469
                                            {
                                                if(_VALUE(((_inspect_1468_4618_3.kind_1==(((char)5)))||((_inspect_1468_4618_3.kind_1==(((char)9))))))) {
                                                    {
                                                        // JavaLine 1667 <== SourceLine 1470
                                                        ((CHECKER2)(_CUR._SL)).coder.opq_3=((COMMON_quantity)_inspect_1468_4618_3);
                                                        ;
                                                        call(((CHECKER2)(_CUR._SL)).coder,1470);
                                                        ;
                                                    }
                                                }
                                            }
                                        }
                                    } // END INSPECTION
                                    ;
                                }
                                break;
                                case 56: 
                                case 118: 
                                // JavaLine 1682 <== SourceLine 1476
                                {
                                    // JavaLine 1684 <== SourceLine 1477
                                    new CHECKER2_semchecker_getOpd((_CUR));
                                    ;
                                    ((CHECKER2)(_CUR._SL)).coder.opq_3=new BUILDER1_meaningof((_CUR._SL),opdSymb_2)._RESULT;
                                    ;
                                    // JavaLine 1689 <== SourceLine 1478
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block982_OPNOUT_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 53: 
                                // JavaLine 1695 <== SourceLine 1482
                                {
                                    // JavaLine 1697 <== SourceLine 1483
                                    {
                                        // BEGIN INSPECTION 
                                        _inspect_1483_4619_3=((CHECKER2)(_CUR._SL)).display.getELEMENT(RTS_ENVIRONMENT.rank(((CHECKER2)(_CUR._SL)).cblev_6));
                                        if(_inspect_1483_4619_3!=null) { // INSPECT _inspect_1483_4619_3
                                            // JavaLine 1702 <== SourceLine 1484
                                            {
                                                // JavaLine 1704 <== SourceLine 1483
                                                {
                                                    // JavaLine 1706 <== SourceLine 1484
                                                    ((CHECKER2)(_CUR._SL)).coder.opq_3=_inspect_1483_4619_3.declquant;
                                                    ;
                                                    ((CHECKER2)(_CUR._SL)).opc_6=((char)16);
                                                    ;
                                                    call(((CHECKER2)(_CUR._SL)).coder,1484);
                                                    ;
                                                    // JavaLine 1713 <== SourceLine 1485
                                                    visq_3=_inspect_1483_4619_3.fpar;
                                                    ;
                                                    new BUILDER1_precheck0_invischain((_CUR),visq_3);
                                                    ;
                                                    // JavaLine 1718 <== SourceLine 1486
                                                    visq_3=_inspect_1483_4619_3.declquant;
                                                    ;
                                                    // JavaLine 1721 <== SourceLine 1487
                                                    while((visq_3.plev_1>(1))) {
                                                        visq_3=visq_3.prefqual_1;
                                                    }
                                                    ;
                                                    // JavaLine 1726 <== SourceLine 1488
                                                    ((CHECKER2)(_CUR._SL)).display.putELEMENT(((CHECKER2)(_CUR._SL)).display.index(RTS_ENVIRONMENT.rank(((CHECKER2)(_CUR._SL)).cblev_6)),visq_3.prefqual_1.descr_1);
                                                    ;
                                                    // JavaLine 1729 <== SourceLine 1489
                                                    visq_3.prefqual_1=null;
                                                    ;
                                                }
                                            }
                                        }
                                    } // END INSPECTION
                                    ;
                                }
                                break;
                                case 126: 
                                // JavaLine 1740 <== SourceLine 1494
                                {
                                    // JavaLine 1742 <== SourceLine 1495
                                    {
                                        _SIM_LABEL(21); // DeclaredIn: semchecker -> semchecker[CHECKER2_semchecker] DeclarationKind=Class
                                        // JavaLine 1745 <== SourceLine 1497
                                        {
                                            // BEGIN INSPECTION 
                                            _inspect_1497_4620_3=((CHECKER2)(_CUR._SL)).display.getELEMENT(RTS_ENVIRONMENT.rank(((CHECKER2)(_CUR._SL)).cblev_6));
                                            if(_inspect_1497_4620_3!=null) { // INSPECT _inspect_1497_4620_3
                                                // JavaLine 1750 <== SourceLine 1498
                                                {
                                                    // JavaLine 1752 <== SourceLine 1497
                                                    {
                                                        // JavaLine 1754 <== SourceLine 1498
                                                        visq_3=_inspect_1497_4620_3.fpar;
                                                        ;
                                                        new BUILDER1_precheck0_invischain((_CUR),visq_3);
                                                        ;
                                                        // JavaLine 1759 <== SourceLine 1499
                                                        ((CHECKER2)(_CUR._SL)).display.putELEMENT(((CHECKER2)(_CUR._SL)).display.index(RTS_ENVIRONMENT.rank(((CHECKER2)(_CUR._SL)).cblev_6)),_inspect_1497_4620_3.declquant.prefqual_1.descr_1);
                                                        ;
                                                    }
                                                }
                                            }
                                        } // END INSPECTION
                                    }
                                    ;
                                }
                                break;
                                case 113: 
                                // JavaLine 1771 <== SourceLine 1505
                                {
                                    // JavaLine 1773 <== SourceLine 1506
                                    opttop_2=(opttop_2+(1));
                                    ;
                                    if(_VALUE((opttop_2>(100)))) {
                                        new ERRMSG_fatal0((_CUR._SL),246);
                                    }
                                    ;
                                    // JavaLine 1780 <== SourceLine 1507
                                    ust_3.optstack.putELEMENT(ust_3.optstack.index(opttop_2),'q');
                                    ;
                                    expexptop.putELEMENT(expexptop.index(opttop_2),exptop_2);
                                    ;
                                    // JavaLine 1785 <== SourceLine 1508
                                    new CHECKER2_semchecker_getOpd((_CUR));
                                    ;
                                    // JavaLine 1788 <== SourceLine 1509
                                    exptop_2=curswitch_3=new CHECKER1_semchecker1_switchdef((_CUR),exptop_2,((char)14))._STM();
                                    ;
                                    // JavaLine 1791 <== SourceLine 1510
                                    curswitch_3.sw_1=new BUILDER1_meaningof((_CUR._SL),opdSymb_2)._RESULT;
                                    ;
                                    // JavaLine 1794 <== SourceLine 1511
                                    if(_VALUE((curswitch_3.sw_1==(null)))) {
                                        curswitch_3.sw_1=new ERRMSG_newnotseen((_CUR._SL),opdSymb_2)._RESULT;
                                    }
                                    ;
                                }
                                break;
                                case 144: 
                                // JavaLine 1802 <== SourceLine 1515
                                {
                                    // JavaLine 1804 <== SourceLine 1516
                                    call(ust_3,1516);
                                    ;
                                    // JavaLine 1807 <== SourceLine 1517
                                    {
                                        // BEGIN INSPECTION 
                                        _inspect_1517_4621_3=new CHECKER1_semchecker1_switchelement((_CUR),exptop_2)._STM();
                                        if(_inspect_1517_4621_3!=null) { // INSPECT _inspect_1517_4621_3
                                            // JavaLine 1812 <== SourceLine 1518
                                            {
                                                // JavaLine 1814 <== SourceLine 1517
                                                {
                                                    // JavaLine 1816 <== SourceLine 1518
                                                    if(_VALUE((curswitchel_3==(null)))) {
                                                        // JavaLine 1818 <== SourceLine 1519
                                                        curswitch_3.elements_1=curswitchel_3=((CHECKER1_semchecker1_switchelement)_inspect_1517_4621_3);
                                                    } else {
                                                        // JavaLine 1821 <== SourceLine 1520
                                                        curswitchel_3=curswitchel_3.next=((CHECKER1_semchecker1_switchelement)_inspect_1517_4621_3);
                                                    }
                                                    ;
                                                }
                                            }
                                        }
                                    } // END INSPECTION
                                    ;
                                    // JavaLine 1830 <== SourceLine 1522
                                    new CHECKER1_semchecker1_popExpStack((_CUR));
                                    ;
                                }
                                break;
                                case 143: 
                                // JavaLine 1836 <== SourceLine 1526
                                {
                                    // JavaLine 1838 <== SourceLine 1527
                                    new CHECKER1_semchecker1_switchdef_checkplainswitch(curswitch_3);
                                    ;
                                    // JavaLine 1841 <== SourceLine 1528
                                    curswitch_3=null;
                                    ;
                                    curswitchel_3=null;
                                    ;
                                    // JavaLine 1846 <== SourceLine 1529
                                    exptop_2.emit_0().CPF();
                                    ;
                                    new CHECKER1_semchecker1_popExpStack((_CUR));
                                    ;
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block1170_POPEXPEXP_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 109: 
                                // JavaLine 1856 <== SourceLine 1533
                                {
                                    // JavaLine 1858 <== SourceLine 1534
                                    inarraybound_2=true;
                                    ;
                                    // JavaLine 1861 <== SourceLine 1535
                                    new CHECKER2_semchecker_getOpd((_CUR));
                                    ;
                                    // JavaLine 1864 <== SourceLine 1536
                                    q_2=new BUILDER1_meaningof((_CUR._SL),opdSymb_2)._RESULT;
                                    ;
                                    // JavaLine 1867 <== SourceLine 1537
                                    if(_VALUE((q_2==(null)))) {
                                        q_2=new ERRMSG_newnotseen((_CUR._SL),opdSymb_2)._RESULT;
                                    }
                                    ;
                                    // JavaLine 1872 <== SourceLine 1538
                                    checkclb_3=(q_2.dim_1==(1));
                                    ;
                                    // JavaLine 1875 <== SourceLine 1539
                                    if(_VALUE((q_2.dim_1>(10)))) {
                                        // JavaLine 1877 <== SourceLine 1540
                                        new ERRMSG_error1qlin((_CUR._SL),359,q_2);
                                    }
                                    ;
                                    // JavaLine 1881 <== SourceLine 1542
                                    ((CHECKER2)(_CUR._SL)).coder.opq_3=q_2;
                                    ;
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block982_OPNOUT_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 102: 
                                // JavaLine 1889 <== SourceLine 1545
                                {
                                    // JavaLine 1891 <== SourceLine 1546
                                    call(ust_3,1546);
                                    ;
                                    // JavaLine 1894 <== SourceLine 1547
                                    if(_VALUE(checkclb_3)) {
                                        {
                                            checkclb_3=false;
                                            ;
                                            // JavaLine 1899 <== SourceLine 1549
                                            if(_VALUE(_IS(exptop_2,CHECKER1_semchecker1_arithconst.class))) {
                                                {
                                                    // JavaLine 1902 <== SourceLine 1550
                                                    if(_VALUE(inarraybound_2)) {
                                                        {
                                                            // JavaLine 1905 <== SourceLine 1552
                                                            if(_VALUE((q_2.descr_1!=(null)))) {
                                                                new ERRMSG_internerr((_CUR._SL),((char)9),1552);
                                                            }
                                                            ;
                                                            // JavaLine 1910 <== SourceLine 1553
                                                            {
                                                                // BEGIN INSPECTION 
                                                                _inspect_1553_4622_3=new COMMON_brecord((_CUR._SL))._STM();
                                                                if(_inspect_1553_4622_3!=null) { // INSPECT _inspect_1553_4622_3
                                                                    // JavaLine 1915 <== SourceLine 1554
                                                                    {
                                                                        // JavaLine 1917 <== SourceLine 1553
                                                                        {
                                                                            // JavaLine 1919 <== SourceLine 1554
                                                                            _inspect_1553_4622_3.blnohi=((CHECKER1_semchecker1__const)(exptop_2)).ixhi_1;
                                                                            ;
                                                                            // JavaLine 1922 <== SourceLine 1555
                                                                            _inspect_1553_4622_3.blnolo=((CHECKER1_semchecker1__const)(exptop_2)).ixlo_1;
                                                                            ;
                                                                            // JavaLine 1925 <== SourceLine 1556
                                                                            _inspect_1553_4622_3.declquant=q_2;
                                                                            ;
                                                                            q_2.descr_1=((COMMON_brecord)_inspect_1553_4622_3);
                                                                            ;
                                                                        }
                                                                    }
                                                                }
                                                            } // END INSPECTION
                                                            ;
                                                            // JavaLine 1935 <== SourceLine 1558
                                                            q_2.special_1=((char)1);
                                                            ;
                                                        }
                                                    }
                                                    ;
                                                }
                                            }
                                            ;
                                        }
                                    }
                                    ;
                                    // JavaLine 1947 <== SourceLine 1562
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block1567_bnde1_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 99: 
                                case 114: 
                                // JavaLine 1954 <== SourceLine 1566
                                {
                                    // JavaLine 1956 <== SourceLine 1567
                                    call(ust_3,1567);
                                    ;
                                    // JavaLine 1959 <== SourceLine 1568
                                    {
                                        _SIM_LABEL(22); // DeclaredIn: semchecker -> semchecker[CHECKER2_semchecker] DeclarationKind=Class
                                        // JavaLine 1962 <== SourceLine 1569
                                        if(exptop_2.type<((char)0) || exptop_2.type>((char)15)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                        switch(exptop_2.type) { // BEGIN SWITCH STATEMENT
                                            case 2: 
                                            case 3: 
                                            case 4: 
                                            case 5: 
                                            case 6: 
                                            case 15: 
                                            ;
                                            break;
                                            default:
                                            // JavaLine 1974 <== SourceLine 1572
                                            {
                                                // JavaLine 1976 <== SourceLine 1573
                                                ((CHECKER2)(_CUR._SL)).messageLinenr=q_2.line_1;
                                                ;
                                                new ERRMSG_error1id((_CUR._SL),419,q_2.symb_1);
                                            }
                                            break;
                                        } // END SWITCH STATEMENT
                                    }
                                    ;
                                    // JavaLine 1985 <== SourceLine 1575
                                    if(_VALUE((exptop_2.ctype==('Z')))) {
                                        new CHECKER1_semchecker1_checkasexp((_CUR),((CHECKER1_semchecker1_identifier)(exptop_2)));
                                    }
                                    ;
                                    // JavaLine 1990 <== SourceLine 1576
                                    exptop_2.cl=((char)1);
                                    ;
                                    // JavaLine 1993 <== SourceLine 1577
                                    exptop_2.emit_0().CPF();
                                    ;
                                    // JavaLine 1996 <== SourceLine 1578
                                    if(_VALUE((exptop_2.type!=(((char)4))))) {
                                        new CHECKER1_semchecker1_MaybeConvert((_CUR),((char)4),exptop_2.type);
                                    }
                                    ;
                                    // JavaLine 2001 <== SourceLine 1579
                                    new CHECKER1_semchecker1_popExpStack((_CUR));
                                    ;
                                    // JavaLine 2004 <== SourceLine 1580
                                    if(_VALUE((((CHECKER2)(_CUR._SL)).opn==('c')))) {
                                        {
                                            inarraybound_2=false;
                                            ;
                                            q_2=null;
                                        }
                                    }
                                    ;
                                    // JavaLine 2013 <== SourceLine 1581
                                    _GOTO(_LABEL_CHECKER2_semchecker_Block870_Block872_Block982_OPNOUT_0); // GOTO EVALUATED LABEL
                                    ;
                                }
                                break;
                                case 65: 
                                // JavaLine 2019 <== SourceLine 1584
                                {
                                    // JavaLine 2021 <== SourceLine 1585
                                    new CHECKER2_semchecker_getlastblno((_CUR));
                                    ;
                                }
                                break;
                                case 133: 
                                // JavaLine 2027 <== SourceLine 1589
                                {
                                    // JavaLine 2029 <== SourceLine 1590
                                    ((CHECKER2)(_CUR._SL)).linenr=((RTS_ENVIRONMENT.rank(RTS_ENVIRONMENT.loadChar(L2buf_3,L2p_3))*(256))+(RTS_ENVIRONMENT.rank(RTS_ENVIRONMENT.loadChar(L2buf_3,(L2p_3+(1))))));
                                    ;
                                    // JavaLine 2032 <== SourceLine 1592
                                    L2p_3=(L2p_3+(2));
                                    ;
                                    // JavaLine 2035 <== SourceLine 1593
                                    if(_VALUE(((((CHECKER2)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('L'))!=(((char)0)))|((((CHECKER2)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('R'))!=(((char)0))))))) {
                                        // JavaLine 2037 <== SourceLine 1595
                                        {
                                            RTS_BASICIO.sysout().outchar('!');
                                            ;
                                            RTS_BASICIO.sysout().outint(((CHECKER2)(_CUR._SL)).linenr,4);
                                        }
                                    }
                                    ;
                                }
                                break;
                                case 141: 
                                // JavaLine 2048 <== SourceLine 1599
                                {
                                    // JavaLine 2050 <== SourceLine 1600
                                    ((CHECKER2)(_CUR._SL)).ssnuma_6=((RTS_ENVIRONMENT.rank(RTS_ENVIRONMENT.loadChar(L2buf_3,L2p_3))*(256))+(RTS_ENVIRONMENT.rank(RTS_ENVIRONMENT.loadChar(L2buf_3,(L2p_3+(1))))));
                                    ;
                                    // JavaLine 2053 <== SourceLine 1601
                                    L2p_3=(L2p_3+(2));
                                    ;
                                    // JavaLine 2056 <== SourceLine 1602
                                    ((CHECKER2)(_CUR._SL)).opdhi=RTS_ENVIRONMENT.loadChar(L2buf_3,L2p_3);
                                    ;
                                    ((CHECKER2)(_CUR._SL)).opdlo=RTS_ENVIRONMENT.loadChar(L2buf_3,(L2p_3+(1)));
                                    ;
                                    // JavaLine 2061 <== SourceLine 1603
                                    new CHECKER2_semchecker_getOpd((_CUR));
                                    ;
                                    // JavaLine 2064 <== SourceLine 1611
                                    if(_VALUE((((CHECKER2)(_CUR._SL)).ssnuma_6==(256)))) {
                                        ((CHECKER2)(_CUR._SL)).BoundCheck_6=(((CHECKER2)(_CUR._SL)).opdlo!=(((char)0)));
                                    } else {
                                        // JavaLine 2068 <== SourceLine 1612
                                        if(_VALUE((((CHECKER2)(_CUR._SL)).ssnuma_6==(257)))) {
                                            ((CHECKER2)(_CUR._SL)).NoneCheck_6=(((CHECKER2)(_CUR._SL)).opdlo!=(((char)0)));
                                        } else {
                                            // JavaLine 2072 <== SourceLine 1613
                                            if(_VALUE((((CHECKER2)(_CUR._SL)).ssnuma_6==(258)))) {
                                                ((CHECKER2)(_CUR._SL)).QuaCheck_6=(((CHECKER2)(_CUR._SL)).opdlo!=(((char)0)));
                                            } else {
                                                // JavaLine 2076 <== SourceLine 1614
                                                if(_VALUE((((CHECKER2)(_CUR._SL)).ssnuma_6==(259)))) {
                                                    ((CHECKER2)(_CUR._SL)).ReuseProc_6=(((CHECKER2)(_CUR._SL)).opdlo!=(((char)0)));
                                                } else {
                                                    // JavaLine 2080 <== SourceLine 1615
                                                    if(_VALUE((((CHECKER2)(_CUR._SL)).ssnuma_6==(260)))) {
                                                        implNone_2=(((CHECKER2)(_CUR._SL)).opdlo!=(((char)0)));
                                                    } else {
                                                        // JavaLine 2084 <== SourceLine 1616
                                                        if(_VALUE((((CHECKER2)(_CUR._SL)).ssnuma_6==(261)))) {
                                                            ((CHECKER2)(_CUR._SL)).SportOK=(((CHECKER2)(_CUR._SL)).opdlo!=(((char)0)));
                                                        } else {
                                                            // JavaLine 2088 <== SourceLine 1617
                                                            {
                                                                ((CHECKER2)(_CUR._SL)).opc_6=((char)142);
                                                                ;
                                                                call(((CHECKER2)(_CUR._SL)).coder,1617);
                                                                ;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    ;
                                }
                                break;
                                case 142: 
                                // JavaLine 2105 <== SourceLine 1621
                                new CHECKER2_semchecker_Block870_Block872_Block1621((_CUR))._STM();
                                break;
                                case 88: 
                                // JavaLine 2109 <== SourceLine 1627
                                {
                                    // JavaLine 2111 <== SourceLine 1628
                                    ((CHECKER2)(_CUR._SL)).opc_6='X';
                                    ;
                                    call(((CHECKER2)(_CUR._SL)).coder,1628);
                                    ;
                                    // JavaLine 2116 <== SourceLine 1629
                                    RTS_BASICIO.sysout().outtext(new RTS_TXT(" EOP: coder did not terminate"));
                                    ;
                                    RTS_BASICIO.sysout().outimage();
                                    ;
                                    // JavaLine 2121 <== SourceLine 1630
                                    ((CHECKER2)(_CUR._SL)).ENDCOMP_0().CPF();
                                    ;
                                }
                                break;
                                case 123: 
                                // JavaLine 2127 <== SourceLine 1634
                                {
                                    // JavaLine 2129 <== SourceLine 1635
                                    ((CHECKER2)(_CUR._SL)).L2INPT.intext(L2buf_3);
                                    ;
                                    L2p_3=0;
                                    ;
                                }
                                break;
                                default:
                                // JavaLine 2137 <== SourceLine 1651
                                if(_VALUE((((CHECKER2)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('5'))!=(((char)0))))) {
                                    {
                                        // BEGIN INSPECTION 
                                        _inspect_1651_4623_3=RTS_BASICIO.sysout();
                                        if(_inspect_1651_4623_3!=null) { // INSPECT _inspect_1651_4623_3
                                            // JavaLine 2143 <== SourceLine 1652
                                            {
                                                // JavaLine 2145 <== SourceLine 1651
                                                {
                                                    // JavaLine 2147 <== SourceLine 1652
                                                    _inspect_1651_4623_3.outtext(new RTS_TXT("DUMMY to Pass2: "));
                                                    ;
                                                    _inspect_1651_4623_3.outtext(((CHECKER2)(_CUR._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(((CHECKER2)(_CUR._SL)).opn)));
                                                    ;
                                                    // JavaLine 2152 <== SourceLine 1653
                                                    _inspect_1651_4623_3.outimage();
                                                }
                                            }
                                        }
                                    } // END INSPECTION
                                }
                                break;
                            } // END SWITCH STATEMENT
                            ;
                        }
                        if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
                    }
                    ;
                }
                // JavaLine 2167 <== SourceLine 1663
                // BEGIN INNER PART
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER2.sim","8 semchecker",1,32,11,874,13,924,15,956,17,958,19,984,21,1026,23,1095,25,1100,27,1105,29,1106,31,1148,33,1173,35,1209,37,1302,39,1322,41,1365,43,1385,45,1419,47,1432,49,1461,51,1497,53,1569,56,37,58,38,60,39,62,40,64,41,66,43,68,44,70,46,72,47,74,53,76,59,78,89,80,876,82,890,84,994,86,1015,88,1019,90,1048,92,1075,94,1083,96,1101,98,1287,100,1372,102,1450,104,1469,106,1483,108,1497,110,1517,112,1553,114,1651,121,53,131,719,133,1881,135,2634,137,865,140,867,142,870,145,872,148,874,154,875,160,876,164,877,174,887,179,889,185,890,194,891,206,893,211,897,213,898,216,899,220,900,228,901,235,906,237,907,240,908,243,909,248,910,254,914,256,915,259,916,262,917,268,920,270,921,273,922,277,923,285,924,290,925,292,926,296,927,303,936,306,937,336,945,338,946,351,953,353,955,356,956,360,957,365,958,377,963,379,964,382,965,385,966,387,968,395,969,400,970,413,981,415,982,418,984,424,986,430,990,432,991,435,994,440,995,442,994,444,995,447,996,452,997,455,998,458,999,461,1000,472,1005,474,1006,484,1011,486,1012,489,1013,491,1015,496,1016,498,1015,500,1017,502,1018,507,1019,512,1020,532,1025,535,1026,541,1027,544,1028,547,1029,555,1035,557,1036,560,1037,565,1039,571,1043,573,1044,576,1045,579,1046,582,1047,587,1048,592,1049,600,1050,605,1051,611,1057,613,1058,616,1059,624,1062,626,1063,632,1068,634,1069,637,1070,643,1074,645,1075,651,1076,653,1075,655,1076,666,1078,669,1079,674,1082,676,1083,682,1084,684,1083,686,1084,696,1085,699,1086,704,1089,706,1090,716,1093,718,1094,721,1095,724,1096,729,1097,736,1098,741,1099,744,1100,746,1101,755,1102,765,1104,770,1105,778,1106,789,1110,791,1111,794,1112,802,1115,804,1116,807,1117,810,1118,816,1121,818,1122,821,1123,827,1127,829,1128,832,1129,838,1133,840,1134,843,1135,849,1140,851,1141,862,1147,864,1148,875,1151,877,1152,882,1153,887,1154,890,1155,898,1156,902,1157,909,1158,912,1159,919,1164,921,1165,927,1169,929,1170,932,1171,935,1172,938,1173,941,1174,952,1178,954,1179,957,1180,963,1184,965,1185,968,1186,978,1190,980,1191,985,1192,991,1196,993,1197,1001,1201,1003,1202,1008,1203,1011,1204,1017,1208,1019,1209,1027,1210,1032,1211,1034,1216,1036,1217,1043,1218,1045,1219,1057,1231,1059,1232,1062,1233,1070,1236,1072,1239,1080,1248,1082,1249,1085,1250,1089,1251,1095,1252,1098,1253,1102,1254,1108,1255,1111,1256,1114,1257,1119,1258,1127,1262,1129,1263,1132,1264,1136,1265,1142,1266,1145,1267,1150,1268,1153,1269,1158,1270,1166,1274,1168,1277,1174,1281,1176,1282,1183,1283,1188,1284,1191,1286,1196,1287,1199,1288,1201,1289,1204,1290,1207,1291,1219,1296,1225,1300,1227,1301,1230,1302,1236,1304,1239,1305,1242,1306,1248,1310,1250,1311,1253,1312,1259,1316,1261,1317,1264,1318,1270,1321,1272,1322,1278,1323,1281,1324,1284,1325,1287,1327,1290,1333,1293,1334,1302,1335,1308,1339,1310,1340,1313,1341,1316,1342,1322,1347,1324,1348,1327,1349,1334,1351,1336,1352,1342,1360,1347,1361,1351,1362,1355,1363,1359,1364,1363,1365,1372,1370,1375,1372,1380,1373,1382,1372,1384,1373,1392,1375,1394,1376,1403,1383,1407,1384,1411,1385,1424,1391,1429,1392,1436,1393,1443,1396,1445,1397,1448,1398,1451,1399,1454,1400,1461,1401,1466,1402,1471,1404,1474,1407,1478,1409,1481,1410,1483,1411,1490,1412,1499,1413,1504,1416,1506,1417,1509,1418,1512,1419,1518,1420,1521,1421,1526,1422,1528,1423,1536,1424,1539,1425,1542,1427,1549,1429,1555,1431,1558,1432,1564,1433,1567,1434,1576,1439,1578,1440,1581,1441,1584,1442,1590,1445,1592,1446,1595,1447,1598,1448,1601,1449,1604,1450,1609,1451,1611,1450,1613,1451,1618,1452,1621,1453,1633,1455,1639,1460,1641,1461,1647,1462,1653,1465,1655,1466,1658,1468,1663,1469,1667,1470,1682,1476,1684,1477,1689,1478,1695,1482,1697,1483,1702,1484,1704,1483,1706,1484,1713,1485,1718,1486,1721,1487,1726,1488,1729,1489,1740,1494,1742,1495,1745,1497,1750,1498,1752,1497,1754,1498,1759,1499,1771,1505,1773,1506,1780,1507,1785,1508,1788,1509,1791,1510,1794,1511,1802,1515,1804,1516,1807,1517,1812,1518,1814,1517,1816,1518,1818,1519,1821,1520,1830,1522,1836,1526,1838,1527,1841,1528,1846,1529,1856,1533,1858,1534,1861,1535,1864,1536,1867,1537,1872,1538,1875,1539,1877,1540,1881,1542,1889,1545,1891,1546,1894,1547,1899,1549,1902,1550,1905,1552,1910,1553,1915,1554,1917,1553,1919,1554,1922,1555,1925,1556,1935,1558,1947,1562,1954,1566,1956,1567,1959,1568,1962,1569,1974,1572,1976,1573,1985,1575,1990,1576,1993,1577,1996,1578,2001,1579,2004,1580,2013,1581,2019,1584,2021,1585,2027,1589,2029,1590,2032,1592,2035,1593,2037,1595,2048,1599,2050,1600,2053,1601,2056,1602,2061,1603,2064,1611,2068,1612,2072,1613,2076,1614,2080,1615,2084,1616,2088,1617,2105,1621,2109,1627,2111,1628,2116,1629,2121,1630,2127,1634,2129,1635,2137,1651,2143,1652,2145,1651,2147,1652,2152,1653,2167,1663,2182,1663);
} // End of Class
