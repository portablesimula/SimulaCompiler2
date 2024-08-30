// JavaLine 1 <== SourceLine 727
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_CHECKER1_semchecker1_valassign extends CLASS_CHECKER1_semchecker1_exp {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=1, firstLine=727, lastLine=909, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    public CLASS_CHECKER1_semchecker1_exp p1_target;
    public CLASS_CHECKER1_semchecker1_exp p1_source;
    // Declare local labels
    // JavaLine 13 <== SourceLine 830
    final RTS_LABEL _LABEL_CLASS_CHECKER1_semchecker1_valassign_Block812_NONCOMP_0=new RTS_LABEL(this,1,1,"NONCOMP"); // Local Label #1=NONCOMP At PrefixLevel 1
    // JavaLine 15 <== SourceLine 902
    final RTS_LABEL _LABEL_CLASS_CHECKER1_semchecker1_valassign_Block812_EXIT_0=new RTS_LABEL(this,1,2,"EXIT"); // Local Label #2=EXIT At PrefixLevel 1
    // Declare locals as attributes
    // JavaLine 18 <== SourceLine 875
    public CLASS_CHECKER1_semchecker1_argumented _inspect_875_4566=null;
    public RTS_PRCQNT dump_0() { return(new RTS_PRCQNT(this,CLASS_CHECKER1_semchecker1_valassign_dump.class)); }
    public RTS_PRCQNT emit_0() { return(new RTS_PRCQNT(this,CLASS_CHECKER1_semchecker1_valassign_emit.class)); }
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_valassign(RTS_RTObject staticLink,CLASS_CHECKER1_semchecker1_exp sp_pred,char sp_ch,CLASS_CHECKER1_semchecker1_exp sp1_target,CLASS_CHECKER1_semchecker1_exp sp1_source) {
        super(staticLink,sp_pred,sp_ch);
        // Parameter assignment to locals
        this.p1_target = sp1_target;
        this.p1_source = sp1_source;
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_CHECKER1_semchecker1_valassign _STM() {
        CLASS_CHECKER1_semchecker1_valassign _THIS=(CLASS_CHECKER1_semchecker1_valassign)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,2); // For ByteCode Engineering
                // JavaLine 37 <== SourceLine 169
                // BEGIN exp INNER PART
                // JavaLine 39 <== SourceLine 810
                while(true) {
                    {
                        // JavaLine 42 <== SourceLine 812
                        type=p1_target.type;
                        ;
                        // JavaLine 45 <== SourceLine 815
                        if(type<((char)0) || type>((char)15)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                        switch(type) { // BEGIN SWITCH STATEMENT
                            case 7: 
                            // JavaLine 49 <== SourceLine 817
                            if(_VALUE((p1_source.type==(((char)7))))) {
                                {
                                    // JavaLine 52 <== SourceLine 818
                                    new CLASS_ERRMSG_error0((_CUR._SL._SL),-159);
                                    ;
                                    // JavaLine 55 <== SourceLine 819
                                    if(_VALUE((((CLASS_CHECKER1_semchecker1)(_CUR._SL)).refassList_2==(null)))) {
                                        // JavaLine 57 <== SourceLine 820
                                        new CLASS_CHECKER1_semchecker1_refassign((_CUR._SL),p_pred,'S',p1_target,p1_source)._START();
                                    } else {
                                        // JavaLine 60 <== SourceLine 821
                                        call(((CLASS_CHECKER1_semchecker1)(_CUR._SL)).refassList_2,821);
                                    }
                                    ;
                                    // JavaLine 64 <== SourceLine 822
                                    ((CLASS_CHECKER1_semchecker1)(_CUR._SL)).valassList_2=((CLASS_CHECKER1_semchecker1_valassign)(_CUR));
                                    ;
                                    _GOTO(_LABEL_CLASS_CHECKER1_semchecker1_valassign_Block812_EXIT_0); // GOTO EVALUATED LABEL
                                }
                            } else {
                                // JavaLine 70 <== SourceLine 823
                                new CLASS_ERRMSG_error0((_CUR._SL._SL),156);
                            }
                            break;
                            case 15: 
                            ;
                            break;
                            case 2: 
                            case 3: 
                            case 4: 
                            case 5: 
                            case 6: 
                            // JavaLine 82 <== SourceLine 827
                            if(p1_source.type<((char)0) || p1_source.type>((char)15)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                            switch(p1_source.type) { // BEGIN SWITCH STATEMENT
                                case 1: 
                                case 8: 
                                case 14: 
                                // JavaLine 88 <== SourceLine 830
                                {
                                    _SIM_LABEL(1); // DeclaredIn: valassign -> valassign[CLASS_CHECKER1_semchecker1_valassign] DeclarationKind=Class
                                    new CLASS_CHECKER1_semchecker1_exp_incompTypes((_CUR),type,p1_source.type);
                                }
                                break;
                                case 7: 
                                // JavaLine 95 <== SourceLine 831
                                new CLASS_ERRMSG_error0((_CUR._SL._SL),157);
                                break;
                            } // END SWITCH STATEMENT
                            break;
                            default:
                            // JavaLine 101 <== SourceLine 834
                            if(_VALUE((type!=(p1_source.type)))) {
                                _GOTO(_LABEL_CLASS_CHECKER1_semchecker1_valassign_Block812_NONCOMP_0); // GOTO EVALUATED LABEL
                            }
                            break;
                        } // END SWITCH STATEMENT
                        ;
                        // JavaLine 108 <== SourceLine 837
                        if(_VALUE((p1_source.ctype==('Z')))) {
                            {
                                if(_VALUE((p1_source.kind!=(((char)0))))) {
                                    // JavaLine 112 <== SourceLine 838
                                    new CLASS_CHECKER1_semchecker1_checkasexp((_CUR._SL),((CLASS_CHECKER1_semchecker1_identifier)(p1_source)));
                                }
                            }
                        }
                        ;
                        // JavaLine 118 <== SourceLine 841
                        if(_VALUE((p1_target.ctype==('Z')))) {
                            {
                                // JavaLine 121 <== SourceLine 842
                                p1_target.cl=(((((CLASS_CHECKER1_semchecker1_identifier)(p1_target)).type==(((char)8))))?(((char)6)):(((char)4)));
                                ;
                                // JavaLine 124 <== SourceLine 844
                                if(p1_target.kind<((char)0) || p1_target.kind>((char)13)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                switch(p1_target.kind) { // BEGIN SWITCH STATEMENT
                                    case 0: 
                                    case 10: 
                                    // JavaLine 129 <== SourceLine 845
                                    {
                                        // JavaLine 131 <== SourceLine 846
                                        issimple=p1_target.issimple;
                                        ;
                                        // JavaLine 134 <== SourceLine 847
                                        if(_VALUE((p1_target.meaning.protect_1==(((char)2))))) {
                                            {
                                                // JavaLine 137 <== SourceLine 848
                                                if(_VALUE((((CLASS_CHECKER1_semchecker1)(_CUR._SL)).readonly_2==(p1_target.meaning)))) {
                                                    ((CLASS_CHECKER1_semchecker1)(_CUR._SL)).readonly_2=null;
                                                } else {
                                                    // JavaLine 141 <== SourceLine 849
                                                    new CLASS_CHECKER1_semchecker1_identifier_identError(((CLASS_CHECKER1_semchecker1_identifier)(p1_target)),253);
                                                }
                                                ;
                                            }
                                        }
                                        ;
                                    }
                                    break;
                                    case 6: 
                                    // JavaLine 151 <== SourceLine 852
                                    new CLASS_CHECKER1_semchecker1_identifier_identError(((CLASS_CHECKER1_semchecker1_identifier)(p1_target)),340);
                                    break;
                                    case 2: 
                                    // JavaLine 155 <== SourceLine 853
                                    new CLASS_CHECKER1_semchecker1_identifier_identError(((CLASS_CHECKER1_semchecker1_identifier)(p1_target)),340);
                                    break;
                                    case 3: 
                                    // JavaLine 159 <== SourceLine 854
                                    new CLASS_CHECKER1_semchecker1_identifier_identError(((CLASS_CHECKER1_semchecker1_identifier)(p1_target)),341);
                                    break;
                                    case 4: 
                                    // JavaLine 163 <== SourceLine 855
                                    new CLASS_CHECKER1_semchecker1_identifier_identError(((CLASS_CHECKER1_semchecker1_identifier)(p1_target)),342);
                                    break;
                                    case 5: 
                                    // JavaLine 167 <== SourceLine 856
                                    new CLASS_CHECKER1_semchecker1_identifier_identError(((CLASS_CHECKER1_semchecker1_identifier)(p1_target)),343);
                                    break;
                                    case 7: 
                                    // JavaLine 171 <== SourceLine 857
                                    new CLASS_CHECKER1_semchecker1_identifier_identError(((CLASS_CHECKER1_semchecker1_identifier)(p1_target)),343);
                                    break;
                                    case 1: 
                                    // JavaLine 175 <== SourceLine 858
                                    {
                                        // JavaLine 177 <== SourceLine 861
                                        if(_VALUE(new CLASS_CHECKER1_semchecker1_identifier_result(((CLASS_CHECKER1_semchecker1_identifier)(p1_target)))._RESULT)) {
                                            {
                                                // JavaLine 180 <== SourceLine 862
                                                issimple=1;
                                                ;
                                                // JavaLine 183 <== SourceLine 863
                                                if(_VALUE((p1_target.type==(((char)14))))) {
                                                    // JavaLine 185 <== SourceLine 864
                                                    new CLASS_CHECKER1_semchecker1_identifier_identError(((CLASS_CHECKER1_semchecker1_identifier)(p1_target)),338);
                                                }
                                            }
                                        } else {
                                            // JavaLine 190 <== SourceLine 865
                                            if(_VALUE((p1_target.type==(((char)8))))) {
                                                {
                                                    // JavaLine 193 <== SourceLine 866
                                                    new CLASS_CHECKER1_semchecker1_checkasexp((_CUR._SL),((CLASS_CHECKER1_semchecker1_identifier)(p1_target)));
                                                    ;
                                                    // JavaLine 196 <== SourceLine 867
                                                    p1_target.cl=((char)1);
                                                    ;
                                                }
                                            } else {
                                                // JavaLine 201 <== SourceLine 868
                                                new CLASS_CHECKER1_semchecker1_identifier_identError(((CLASS_CHECKER1_semchecker1_identifier)(p1_target)),339);
                                            }
                                        }
                                        ;
                                    }
                                    break;
                                    default:
                                    // JavaLine 209 <== SourceLine 870
                                    new CLASS_ERRMSG_internerr((_CUR._SL._SL),((char)8),870);
                                    break;
                                } // END SWITCH STATEMENT
                            }
                        } else {
                            // JavaLine 215 <== SourceLine 873
                            if(_VALUE((p1_target.ctype==(((char)129))))) {
                                {
                                    // JavaLine 218 <== SourceLine 875
                                    {
                                        // BEGIN INSPECTION 
                                        _inspect_875_4566=((CLASS_CHECKER1_semchecker1_argumented)(p1_target));
                                        if(_inspect_875_4566!=null) { // INSPECT _inspect_875_4566  type=ref(ARGUMENTED)
                                            // JavaLine 223 <== SourceLine 876
                                            {
                                                // JavaLine 225 <== SourceLine 875
                                                {
                                                    // JavaLine 227 <== SourceLine 876
                                                    ((CLASS_CHECKER1_semchecker1_valassign)(_CUR)).issimple=_inspect_875_4566.issimple;
                                                    ;
                                                    // JavaLine 230 <== SourceLine 877
                                                    _inspect_875_4566.cl=((char)4);
                                                    ;
                                                    // JavaLine 233 <== SourceLine 878
                                                    if(_inspect_875_4566.p1_ident.kind<((char)0) || _inspect_875_4566.p1_ident.kind>((char)13)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                                    switch(_inspect_875_4566.p1_ident.kind) { // BEGIN SWITCH STATEMENT
                                                        case 10: 
                                                        case 2: 
                                                        case 6: 
                                                        // JavaLine 239 <== SourceLine 880
                                                        if(_VALUE((_inspect_875_4566.p1_ident.meaning.protect_1==(((char)2))))) {
                                                            {
                                                                // JavaLine 242 <== SourceLine 881
                                                                if(_VALUE((((CLASS_CHECKER1_semchecker1)(_CUR._SL)).readonly_2==(_inspect_875_4566.p1_ident.meaning)))) {
                                                                    ((CLASS_CHECKER1_semchecker1)(_CUR._SL)).readonly_2=null;
                                                                } else {
                                                                    // JavaLine 246 <== SourceLine 882
                                                                    new CLASS_CHECKER1_semchecker1_identifier_identError(_inspect_875_4566.p1_ident,253);
                                                                }
                                                                ;
                                                            }
                                                        }
                                                        break;
                                                        default:
                                                        // JavaLine 254 <== SourceLine 885
                                                        if(_VALUE((_inspect_875_4566.type==(((char)8))))) {
                                                            _inspect_875_4566.cl=((char)1);
                                                        } else {
                                                            // JavaLine 258 <== SourceLine 888
                                                            new CLASS_CHECKER1_semchecker1_identifier_identError(_inspect_875_4566.p1_ident,344);
                                                        }
                                                        break;
                                                    } // END SWITCH STATEMENT
                                                    ;
                                                }
                                            }
                                        }
                                    } // END INSPECTION
                                }
                            } else {
                                // JavaLine 270 <== SourceLine 892
                                if(_VALUE((p1_target.p_ch==('Q')))) {
                                    {
                                        // JavaLine 273 <== SourceLine 893
                                        p1_target.cl=((char)1);
                                        ;
                                        // JavaLine 276 <== SourceLine 894
                                        if(_VALUE((p1_target.type!=(((char)8))))) {
                                            new CLASS_ERRMSG_error0((_CUR._SL._SL),158);
                                        }
                                        ;
                                    }
                                } else {
                                    // JavaLine 283 <== SourceLine 896
                                    if(_VALUE((p1_target.p_ch==('[')))) {
                                        {
                                            // JavaLine 286 <== SourceLine 897
                                            p1_target.cl=((char)1);
                                            ;
                                            new CLASS_ERRMSG_error0((_CUR._SL._SL),152);
                                        }
                                    } else {
                                        // JavaLine 292 <== SourceLine 898
                                        new CLASS_ERRMSG_error0((_CUR._SL._SL),150);
                                    }
                                }
                            }
                        }
                        ;
                        // JavaLine 299 <== SourceLine 899
                        ((CLASS_CHECKER1_semchecker1)(_CUR._SL)).exptop_2=((CLASS_CHECKER1_semchecker1_valassign)(_CUR));
                        ;
                        // JavaLine 302 <== SourceLine 900
                        {
                            _SIM_LABEL(2); // DeclaredIn: valassign -> valassign[CLASS_CHECKER1_semchecker1_valassign] DeclarationKind=Class
                            // JavaLine 305 <== SourceLine 902
                            detach(902);
                        }
                        ;
                        // JavaLine 309 <== SourceLine 904
                        ((CLASS_CHECKER1_semchecker1)(_CUR._SL)).valassList_2=null;
                        ;
                        // JavaLine 312 <== SourceLine 906
                        p1_source=((CLASS_CHECKER1_semchecker1)(_CUR._SL)).exptop_2;
                        ;
                        p1_target=p1_source.p_pred;
                        ;
                        p_pred=p1_target.p_pred;
                        ;
                        // JavaLine 319 <== SourceLine 907
                        cl=ctype=kind=((char)0);
                        ;
                        issimple=0;
                        ;
                    }
                    if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
                }
                ;
                // JavaLine 328 <== SourceLine 909
                // BEGIN valassign INNER PART
                // ENDOF valassign INNER PART
                // ENDOF exp INNER PART
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","8 valassign",1,727,13,830,15,902,18,875,37,169,39,810,42,812,45,815,49,817,52,818,55,819,57,820,60,821,64,822,70,823,82,827,88,830,95,831,101,834,108,837,112,838,118,841,121,842,124,844,129,845,131,846,134,847,137,848,141,849,151,852,155,853,159,854,163,855,167,856,171,857,175,858,177,861,180,862,183,863,185,864,190,865,193,866,196,867,201,868,209,870,215,873,218,875,223,876,225,875,227,876,230,877,233,878,239,880,242,881,246,882,254,885,258,888,270,892,273,893,276,894,283,896,286,897,292,898,299,899,302,900,305,902,309,904,312,906,319,907,328,909,341,909);
} // End of Class
