// JavaLine 1 <== SourceLine 916
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER2_recompattrfile_outquantwlist extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=916, lastLine=1072, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_q;
    // Declare local labels
    // JavaLine 11 <== SourceLine 1050
    final RTS_LABEL _LABEL_CLASS_BUILDER2_recompattrfile_outquantwlist_Block949_Block953_Block1035_Block1049_UTQ_0=new RTS_LABEL(this,0,1,"UTQ"); // Local Label #1=UTQ At PrefixLevel 0
    // JavaLine 13 <== SourceLine 1056
    final RTS_LABEL _LABEL_CLASS_BUILDER2_recompattrfile_outquantwlist_Block949_Block953_Block1035_Block1049_Block1051_Block1056_UTP_0=new RTS_LABEL(this,0,2,"UTP"); // Local Label #2=UTP At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 16 <== SourceLine 941
    public CLASS_COMMON_quantity qq=null;
    public RTS_TXT u=null;
    public int k=0;
    public int l=0;
    // JavaLine 21 <== SourceLine 942
    public CLASS_COMMON_idpack cvis=null;
    public CLASS_COMMON_idpack pvis=null;
    public CLASS_COMMON_idpack xvis=null;
    // JavaLine 25 <== SourceLine 948
    public CLASS_COMMON_quantity _inspect_948_4543=null;
    // JavaLine 27 <== SourceLine 999
    public CLASS_COMMON_extbrecord _inspect_999_4544=null;
    // JavaLine 29 <== SourceLine 1007
    public CLASS_COMMON_brecord _inspect_1007_4545=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_BUILDER2_recompattrfile_outquantwlist setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_q=(CLASS_COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_BUILDER2_recompattrfile_outquantwlist(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_BUILDER2_recompattrfile_outquantwlist(RTS_RTObject _SL,CLASS_COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER2_recompattrfile_outquantwlist _STM() {
        CLASS_BUILDER2_recompattrfile_outquantwlist _THIS=(CLASS_BUILDER2_recompattrfile_outquantwlist)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,2); // For ByteCode Engineering
                // JavaLine 63 <== SourceLine 948
                {
                    // BEGIN INSPECTION 
                    _inspect_948_4543=p_q;
                    if(_inspect_948_4543!=null) { // INSPECT _inspect_948_4543  type=ref(QUANTITY)
                        // JavaLine 68 <== SourceLine 949
                        {
                            // JavaLine 70 <== SourceLine 948
                            {
                                // JavaLine 72 <== SourceLine 949
                                k=new CLASS_BUILDER1_exttag((_CUR._SL._SL),((CLASS_COMMON_quantity)_inspect_948_4543))._RESULT;
                                ;
                                // JavaLine 75 <== SourceLine 950
                                if(_VALUE((k>(-2)))) {
                                    {
                                        // JavaLine 78 <== SourceLine 953
                                        if(_VALUE((((CLASS_BUILDER2_recompattrfile)(_CUR._SL)).key>=(((char)240))))) {
                                            new CLASS_BUILDER2_recompattrfile_outquantwlist_recomperr((_CUR),370);
                                        }
                                        ;
                                        // JavaLine 83 <== SourceLine 955
                                        new CLASS_COMMON_attrfile_fetchquant((_CUR._SL));
                                        ;
                                        // JavaLine 86 <== SourceLine 957
                                        if(_VALUE(((_inspect_948_4543.symb_1!=(((CLASS_BUILDER2_recompattrfile)(_CUR._SL)).xident))&&(((_inspect_948_4543.encl_1.kind!=(((char)1)))||((_inspect_948_4543.categ_1>=(((char)3))))))))) {
                                            // JavaLine 88 <== SourceLine 958
                                            l=388;
                                        } else {
                                            // JavaLine 91 <== SourceLine 959
                                            if(_VALUE((((CLASS_BUILDER2_recompattrfile)(_CUR._SL)).xprotect!=(_inspect_948_4543.protect_1)))) {
                                                l=385;
                                            } else {
                                                // JavaLine 95 <== SourceLine 960
                                                if(_VALUE((((CLASS_BUILDER2_recompattrfile)(_CUR._SL)).xtype!=(_inspect_948_4543.type_1)))) {
                                                    l=371;
                                                } else {
                                                    // JavaLine 99 <== SourceLine 961
                                                    if(_VALUE((((CLASS_BUILDER2_recompattrfile)(_CUR._SL)).xkind!=(_inspect_948_4543.kind_1)))) {
                                                        l=372;
                                                    } else {
                                                        // JavaLine 103 <== SourceLine 962
                                                        if(_VALUE((((CLASS_BUILDER2_recompattrfile)(_CUR._SL)).xcateg!=(_inspect_948_4543.categ_1)))) {
                                                            l=373;
                                                        } else {
                                                            // JavaLine 107 <== SourceLine 963
                                                            if(_VALUE((((CLASS_BUILDER2_recompattrfile)(_CUR._SL)).xclf!=(((RTS_UTIL._IS(((CLASS_COMMON_quantity)_inspect_948_4543),CLASS_COMMON_extquantity.class))?(((CLASS_COMMON_extquantity)(((CLASS_COMMON_quantity)_inspect_948_4543))).clf_2):(((char)0))))))) {
                                                                // JavaLine 109 <== SourceLine 965
                                                                l=378;
                                                            } else {
                                                                // JavaLine 112 <== SourceLine 966
                                                                if(_VALUE((k!=(((CLASS_BUILDER2_recompattrfile)(_CUR._SL)).xftag)))) {
                                                                    l=379;
                                                                } else {
                                                                    // JavaLine 116 <== SourceLine 967
                                                                    l=0;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        ;
                                        // JavaLine 126 <== SourceLine 968
                                        if(_VALUE((l!=(0)))) {
                                            {
                                                new CLASS_BUILDER2_recompattrfile_outquantwlist_recomperr((_CUR),l);
                                                ;
                                                l=0;
                                                ;
                                            }
                                        }
                                        ;
                                        // JavaLine 136 <== SourceLine 971
                                        if(_VALUE((_inspect_948_4543.categ_1!=(((char)4))))) {
                                            {
                                                // JavaLine 139 <== SourceLine 972
                                                if(_VALUE(((((CLASS_BUILDER2_recompattrfile)(_CUR._SL)).xdim!=(_inspect_948_4543.dim_1))&&((_inspect_948_4543.dim_1>=(0)))))) {
                                                    // JavaLine 141 <== SourceLine 973
                                                    new CLASS_ERRMSG_error1id((_CUR._SL._SL),375,_inspect_948_4543.symb_1);
                                                }
                                            }
                                        }
                                        ;
                                        // JavaLine 147 <== SourceLine 982
                                        if(_VALUE((((_inspect_948_4543.prefqual_1!=(null)))?((((_inspect_948_4543.kind_1!=(((char)5)))||((_inspect_948_4543.plev_1>(1))))&&((_inspect_948_4543.prefqual_1.symb_1!=(new CLASS_COMMON_boxof((_CUR._SL._SL),((CLASS_BUILDER2_recompattrfile)(_CUR._SL)).xprefqhi,((CLASS_BUILDER2_recompattrfile)(_CUR._SL)).xprefqlo)._RESULT))))):(((((CLASS_BUILDER2_recompattrfile)(_CUR._SL)).xprefqhi!=(((char)0)))||((((CLASS_BUILDER2_recompattrfile)(_CUR._SL)).xprefqlo!=(((char)0))))))))) {
                                            // JavaLine 149 <== SourceLine 987
                                            new CLASS_ERRMSG_error1id((_CUR._SL._SL),374,_inspect_948_4543.symb_1);
                                        }
                                        ;
                                        // JavaLine 153 <== SourceLine 989
                                        if(_VALUE(((((CLASS_BUILDER2_recompattrfile)(_CUR._SL)).xspecial!=(_inspect_948_4543.special_1))||(((_inspect_948_4543.special_1!=(((char)0)))&&(((((CLASS_BUILDER2_recompattrfile)(_CUR._SL)).xarrhi!=(_inspect_948_4543.descr_1.blnohi))||((((CLASS_BUILDER2_recompattrfile)(_CUR._SL)).xarrlo!=(_inspect_948_4543.descr_1.blnolo)))))))))) {
                                            // JavaLine 155 <== SourceLine 992
                                            new CLASS_ERRMSG_error1id((_CUR._SL._SL),384,_inspect_948_4543.symb_1);
                                        }
                                        ;
                                        // JavaLine 159 <== SourceLine 994
                                        if(_VALUE((_inspect_948_4543.categ_1==(((char)4))))) {
                                            {
                                                // JavaLine 162 <== SourceLine 995
                                                if(_VALUE((((CLASS_BUILDER2_recompattrfile)(_CUR._SL)).xlanguage!=(_inspect_948_4543.dim_1)))) {
                                                    new CLASS_BUILDER2_recompattrfile_outquantwlist_recompwarn((_CUR),389);
                                                }
                                                ;
                                                // JavaLine 167 <== SourceLine 996
                                                if(_VALUE((((CLASS_BUILDER2_recompattrfile)(_CUR._SL)).xextident!=(_inspect_948_4543.virtno_1)))) {
                                                    new CLASS_BUILDER2_recompattrfile_outquantwlist_recompwarn((_CUR),390);
                                                }
                                                ;
                                                // JavaLine 172 <== SourceLine 997
                                                if(_VALUE(RTS_UTIL._IS(_inspect_948_4543.descr_1,CLASS_COMMON_extbrecord.class))) {
                                                    // JavaLine 174 <== SourceLine 999
                                                    {
                                                        // BEGIN INSPECTION 
                                                        _inspect_999_4544=((CLASS_COMMON_extbrecord)(_inspect_948_4543.descr_1));
                                                        if(_inspect_999_4544!=null) { // INSPECT _inspect_999_4544  type=ref(EXTBRECORD)
                                                            // JavaLine 179 <== SourceLine 1000
                                                            {
                                                                // JavaLine 181 <== SourceLine 999
                                                                {
                                                                    // JavaLine 183 <== SourceLine 1000
                                                                    if(_VALUE(((((CLASS_BUILDER2_recompattrfile)(_CUR._SL)).xmodulhi!=(_inspect_999_4544.modulhi_1))||((((CLASS_BUILDER2_recompattrfile)(_CUR._SL)).xmodullo!=(_inspect_999_4544.modullo_1)))))) {
                                                                        // JavaLine 185 <== SourceLine 1001
                                                                        new CLASS_BUILDER2_recompattrfile_outquantwlist_recompwarn((_CUR),391);
                                                                    }
                                                                    ;
                                                                    // JavaLine 189 <== SourceLine 1002
                                                                    if(_VALUE(((((CLASS_BUILDER2_recompattrfile)(_CUR._SL)).xchecklo!=(_inspect_999_4544.checklo_1))||((((CLASS_BUILDER2_recompattrfile)(_CUR._SL)).xcheckhi!=(_inspect_999_4544.checkhi_1)))))) {
                                                                        // JavaLine 191 <== SourceLine 1003
                                                                        new CLASS_BUILDER2_recompattrfile_outquantwlist_recomperr((_CUR),377);
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
                                        // JavaLine 204 <== SourceLine 1007
                                        {
                                            // BEGIN INSPECTION 
                                            _inspect_1007_4545=_inspect_948_4543.descr_1;
                                            if(_inspect_1007_4545!=null) { // INSPECT _inspect_1007_4545  type=ref(BRECORD) declared in Connection block at line 948
                                                // JavaLine 209 <== SourceLine 1008
                                                {
                                                    // JavaLine 211 <== SourceLine 1007
                                                    {
                                                        // JavaLine 213 <== SourceLine 1008
                                                        if(_VALUE((_inspect_1007_4545.thisused&&((!(((CLASS_BUILDER2_recompattrfile)(_CUR._SL)).xthisused)))))) {
                                                            new CLASS_BUILDER2_recompattrfile_outquantwlist_recomperr((_CUR),376);
                                                        }
                                                        ;
                                                        // JavaLine 218 <== SourceLine 1010
                                                        if(_VALUE((((CLASS_BUILDER2_recompattrfile)(_CUR._SL)).xconnests!=(RTS_ENVIRONMENT._char(_inspect_1007_4545.connests))))) {
                                                            new CLASS_BUILDER2_recompattrfile_outquantwlist_recomperr((_CUR),387);
                                                        }
                                                        ;
                                                        // JavaLine 223 <== SourceLine 1014
                                                        if(_VALUE((_inspect_1007_4545.hidlist==(null)))) {
                                                            {
                                                                // JavaLine 226 <== SourceLine 1015
                                                                if(_VALUE((((CLASS_BUILDER2_recompattrfile)(_CUR._SL)).xhidlist!=(null)))) {
                                                                    new CLASS_BUILDER2_recompattrfile_outquantwlist_recompwarn((_CUR),385);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } // END INSPECTION
                                        ;
                                        // JavaLine 237 <== SourceLine 1034
                                        if(_VALUE(((_inspect_948_4543.special_1==(((char)0)))&&(RTS_UTIL._IS(_inspect_948_4543.descr_1,CLASS_COMMON_brecord.class))))) {
                                            {
                                                // JavaLine 240 <== SourceLine 1035
                                                l=k=0;
                                                ;
                                                // JavaLine 243 <== SourceLine 1036
                                                if(_VALUE(((_inspect_948_4543.categ_1==(((char)6)))&&((_inspect_948_4543.kind_1==(((char)1))))))) {
                                                    {
                                                        // JavaLine 246 <== SourceLine 1038
                                                        qq=_inspect_948_4543.descr_1.fpar;
                                                        ;
                                                        // JavaLine 249 <== SourceLine 1040
                                                        k=1;
                                                        ;
                                                        _GOTO(_LABEL_CLASS_BUILDER2_recompattrfile_outquantwlist_Block949_Block953_Block1035_Block1049_Block1051_Block1056_UTP_0); // GOTO EVALUATED LABEL
                                                        ;
                                                    }
                                                } else {
                                                    // JavaLine 256 <== SourceLine 1042
                                                    {
                                                        // JavaLine 258 <== SourceLine 1049
                                                        qq=_inspect_948_4543.descr_1.favirt;
                                                        ;
                                                        // JavaLine 261 <== SourceLine 1050
                                                        {
                                                            _SIM_LABEL(1); // DeclaredIn: outquantwlist -> outquantwlist[externalIdent=CLASS_BUILDER2_recompattrfile_outquantwlist] Kind=5, QUAL=ProcedureDeclaration, HashCode=990468141
                                                            while((qq!=(null))) {
                                                                {
                                                                    // JavaLine 266 <== SourceLine 1051
                                                                    if(_VALUE((((k==(0)))?((qq.dim_1!=(0))):(((RTS_UTIL._IS(qq.descr_1,CLASS_COMMON_extbrecord.class))?((((CLASS_COMMON_extbrecord)(qq.descr_1)).status_1==('S'))):(true)))))) {
                                                                        // JavaLine 268 <== SourceLine 1055
                                                                        {
                                                                            // JavaLine 270 <== SourceLine 1056
                                                                            {
                                                                                _SIM_LABEL(2); // DeclaredIn: outquantwlist -> outquantwlist[externalIdent=CLASS_BUILDER2_recompattrfile_outquantwlist] Kind=5, QUAL=ProcedureDeclaration, HashCode=990468141
                                                                                if(_VALUE((l==(0)))) {
                                                                                    {
                                                                                        new CLASS_COMMON_attrfile_nextKey((_CUR._SL));
                                                                                        ;
                                                                                        l=1;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ;
                                                                            // JavaLine 282 <== SourceLine 1057
                                                                            new CLASS_BUILDER2_recompattrfile_outquantwlist((_CUR._SL),qq);
                                                                            ;
                                                                        }
                                                                    }
                                                                    ;
                                                                    // JavaLine 288 <== SourceLine 1059
                                                                    if(_VALUE((qq!=(null)))) {
                                                                        qq=((CLASS_COMMON_quantity)(qq.next));
                                                                    }
                                                                    ;
                                                                }
                                                            }
                                                        }
                                                        ;
                                                        // JavaLine 297 <== SourceLine 1061
                                                        if(_VALUE((k==(0)))) {
                                                            {
                                                                qq=_inspect_948_4543.descr_1.fpar;
                                                                ;
                                                                k=1;
                                                                ;
                                                                _GOTO(_LABEL_CLASS_BUILDER2_recompattrfile_outquantwlist_Block949_Block953_Block1035_Block1049_UTQ_0); // GOTO EVALUATED LABEL
                                                            }
                                                        }
                                                        ;
                                                        // JavaLine 308 <== SourceLine 1062
                                                        if(_VALUE((l!=(0)))) {
                                                            {
                                                                // JavaLine 311 <== SourceLine 1064
                                                                if(_VALUE((((CLASS_BUILDER2_recompattrfile)(_CUR._SL)).key!=(((char)250))))) {
                                                                    new CLASS_BUILDER2_recompattrfile_outquantwlist_recompwarn((_CUR),370);
                                                                } else {
                                                                    // JavaLine 315 <== SourceLine 1065
                                                                    new CLASS_COMMON_attrfile_nextKey((_CUR._SL));
                                                                }
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
                                    }
                                }
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER2.sim","5 outquantwlist",1,916,11,1050,13,1056,16,941,21,942,25,948,27,999,29,1007,63,948,68,949,70,948,72,949,75,950,78,953,83,955,86,957,88,958,91,959,95,960,99,961,103,962,107,963,109,965,112,966,116,967,126,968,136,971,139,972,141,973,147,982,149,987,153,989,155,992,159,994,162,995,167,996,172,997,174,999,179,1000,181,999,183,1000,185,1001,189,1002,191,1003,204,1007,209,1008,211,1007,213,1008,218,1010,223,1014,226,1015,237,1034,240,1035,243,1036,246,1038,249,1040,256,1042,258,1049,261,1050,266,1051,268,1055,270,1056,282,1057,288,1059,297,1061,308,1062,311,1064,315,1065,344,1072);
} // End of Procedure
