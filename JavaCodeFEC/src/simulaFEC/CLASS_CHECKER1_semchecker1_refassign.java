// JavaLine 1 <== SourceLine 912
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_CHECKER1_semchecker1_refassign extends CLASS_CHECKER1_semchecker1_exp {
    // ClassDeclaration: Kind=9, BlockLevel=3, PrefixLevel=1, firstLine=912, lastLine=1080, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    public CLASS_CHECKER1_semchecker1_exp p1_target;
    public CLASS_CHECKER1_semchecker1_exp p1_source;
    // Declare local labels
    // JavaLine 13 <== SourceLine 1017
    final RTS_LABEL _LABEL_CLASS_CHECKER1_semchecker1_refassign_Block991_Block1007_Block1009_Block1017_QE_0=new RTS_LABEL(this,1,1,"QE"); // Local Label #1=QE At PrefixLevel 1
    // JavaLine 15 <== SourceLine 1073
    final RTS_LABEL _LABEL_CLASS_CHECKER1_semchecker1_refassign_Block991_EXIT_0=new RTS_LABEL(this,1,2,"EXIT"); // Local Label #2=EXIT At PrefixLevel 1
    // Declare locals as attributes
    // JavaLine 18 <== SourceLine 919
    public boolean implqua_1=false;
    // JavaLine 20 <== SourceLine 1057
    public CLASS_CHECKER1_semchecker1_argumented _inspect_1057_4569=null;
    public RTS_PRCQNT dump_0() { return(new RTS_PRCQNT(this,CLASS_CHECKER1_semchecker1_refassign_dump.class)); }
    public RTS_PRCQNT emit_0() { return(new RTS_PRCQNT(this,CLASS_CHECKER1_semchecker1_refassign_emit.class)); }
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_refassign(RTS_RTObject staticLink,CLASS_CHECKER1_semchecker1_exp sp_pred,char sp_ch,CLASS_CHECKER1_semchecker1_exp sp1_target,CLASS_CHECKER1_semchecker1_exp sp1_source) {
        super(staticLink,sp_pred,sp_ch);
        // Parameter assignment to locals
        this.p1_target = sp1_target;
        this.p1_source = sp1_source;
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_CHECKER1_semchecker1_refassign _STM() {
        CLASS_CHECKER1_semchecker1_refassign _THIS=(CLASS_CHECKER1_semchecker1_refassign)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,2); // For ByteCode Engineering
                // JavaLine 39 <== SourceLine 169
                // BEGIN exp INNER PART
                // JavaLine 41 <== SourceLine 988
                while(true) {
                    {
                        // JavaLine 44 <== SourceLine 991
                        type=p1_target.type;
                        ;
                        // JavaLine 47 <== SourceLine 993
                        if(type<((char)0) || type>((char)15)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                        switch(type) { // BEGIN SWITCH STATEMENT
                            case 1: 
                            case 2: 
                            case 3: 
                            case 4: 
                            case 5: 
                            case 6: 
                            // JavaLine 56 <== SourceLine 995
                            if(_VALUE((type==(p1_source.type)))) {
                                {
                                    // JavaLine 59 <== SourceLine 996
                                    new CLASS_ERRMSG_error0((_CUR._SL._SL),-159);
                                    ;
                                    // JavaLine 62 <== SourceLine 997
                                    if(_VALUE((((CLASS_CHECKER1_semchecker1)(_CUR._SL)).valassList_2==(null)))) {
                                        // JavaLine 64 <== SourceLine 998
                                        new CLASS_CHECKER1_semchecker1_valassign((_CUR._SL),p_pred,'R',p1_target,p1_source)._START();
                                    } else {
                                        // JavaLine 67 <== SourceLine 999
                                        call(((CLASS_CHECKER1_semchecker1)(_CUR._SL)).valassList_2,999);
                                    }
                                    ;
                                    // JavaLine 71 <== SourceLine 1000
                                    ((CLASS_CHECKER1_semchecker1)(_CUR._SL)).refassList_2=((CLASS_CHECKER1_semchecker1_refassign)(_CUR));
                                    ;
                                    _GOTO(_LABEL_CLASS_CHECKER1_semchecker1_refassign_Block991_EXIT_0); // GOTO EVALUATED LABEL
                                }
                            } else {
                                // JavaLine 77 <== SourceLine 1002
                                if(_VALUE(((p1_source.type==(((char)7)))||((p1_source.type==(((char)8))))))) {
                                    // JavaLine 79 <== SourceLine 1003
                                    {
                                        new CLASS_CHECKER1_semchecker1_exp_typeError((_CUR),304);
                                        ;
                                        type=p1_source.type;
                                        ;
                                    }
                                } else {
                                    // JavaLine 87 <== SourceLine 1004
                                    new CLASS_CHECKER1_semchecker1_exp_incompTypes((_CUR),type,p1_source.type);
                                }
                            }
                            break;
                            case 7: 
                            case 8: 
                            case 9: 
                            // JavaLine 95 <== SourceLine 1006
                            if(_VALUE((type==(p1_source.type)))) {
                                {
                                    // JavaLine 98 <== SourceLine 1007
                                    if(_VALUE((p1_target.qual==(null)))) {
                                        qual=p1_source.qual;
                                    } else {
                                        // JavaLine 102 <== SourceLine 1008
                                        {
                                            // JavaLine 104 <== SourceLine 1009
                                            qual=p1_target.qual;
                                            ;
                                            // JavaLine 107 <== SourceLine 1010
                                            if(_VALUE((p1_source.qual==(null)))) {
                                                ;
                                            } else {
                                                // JavaLine 111 <== SourceLine 1011
                                                if(_VALUE(new CLASS_BUILDER1_precheck0_subclass((_CUR._SL),p1_source.qual,qual)._RESULT)) {
                                                    ;
                                                } else {
                                                    // JavaLine 115 <== SourceLine 1012
                                                    if(_VALUE(new CLASS_BUILDER1_precheck0_subclass((_CUR._SL),qual,p1_source.qual)._RESULT)) {
                                                        {
                                                            // JavaLine 118 <== SourceLine 1014
                                                            if(_VALUE(RTS_UTIL._IS(p1_source,CLASS_CHECKER1_semchecker1_newIdent.class))) {
                                                                _GOTO(_LABEL_CLASS_CHECKER1_semchecker1_refassign_Block991_Block1007_Block1009_Block1017_QE_0); // GOTO EVALUATED LABEL
                                                            }
                                                            ;
                                                            // JavaLine 123 <== SourceLine 1015
                                                            implqua_1=(((CLASS_CHECKER1)(_CUR._SL._SL)).QuaCheck_6&&((qual.kind_1==(((char)5)))));
                                                            ;
                                                        }
                                                    } else {
                                                        // JavaLine 128 <== SourceLine 1016
                                                        {
                                                            // JavaLine 130 <== SourceLine 1017
                                                            {
                                                                _SIM_LABEL(1); // DeclaredIn: refassign -> refassign[CLASS_CHECKER1_semchecker1_refassign] DeclarationKind=Class
                                                                new CLASS_ERRMSG_error2quants((_CUR._SL._SL),403,qual,p1_source.qual);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            ;
                                        }
                                    }
                                    ;
                                }
                            } else {
                                // JavaLine 145 <== SourceLine 1020
                                new CLASS_CHECKER1_semchecker1_exp_typeError(p1_source,305);
                            }
                            break;
                            case 15: 
                            // JavaLine 150 <== SourceLine 1022
                            type=p1_source.type;
                            break;
                        } // END SWITCH STATEMENT
                        ;
                        // JavaLine 155 <== SourceLine 1025
                        if(_VALUE((p1_source.ctype==('Z')))) {
                            {
                                if(_VALUE((p1_source.kind!=(((char)0))))) {
                                    // JavaLine 159 <== SourceLine 1026
                                    new CLASS_CHECKER1_semchecker1_checkasexp((_CUR._SL),((CLASS_CHECKER1_semchecker1_identifier)(p1_source)));
                                }
                            }
                        }
                        ;
                        // JavaLine 165 <== SourceLine 1029
                        if(_VALUE((p1_target.ctype==('Z')))) {
                            {
                                // JavaLine 168 <== SourceLine 1030
                                if(p1_target.kind<((char)0) || p1_target.kind>((char)13)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                switch(p1_target.kind) { // BEGIN SWITCH STATEMENT
                                    case 0: 
                                    case 10: 
                                    // JavaLine 173 <== SourceLine 1031
                                    {
                                        // JavaLine 175 <== SourceLine 1032
                                        issimple=p1_target.issimple;
                                        ;
                                        // JavaLine 178 <== SourceLine 1033
                                        if(_VALUE((p1_target.meaning.protect_1==(((char)2))))) {
                                            {
                                                // JavaLine 181 <== SourceLine 1034
                                                if(_VALUE((((CLASS_CHECKER1_semchecker1)(_CUR._SL)).readonly_2==(p1_target.meaning)))) {
                                                    ((CLASS_CHECKER1_semchecker1)(_CUR._SL)).readonly_2=null;
                                                } else {
                                                    // JavaLine 185 <== SourceLine 1035
                                                    new CLASS_CHECKER1_semchecker1_identifier_identError(((CLASS_CHECKER1_semchecker1_identifier)(p1_target)),253);
                                                }
                                                ;
                                            }
                                        }
                                        ;
                                    }
                                    break;
                                    case 2: 
                                    case 6: 
                                    // JavaLine 196 <== SourceLine 1039
                                    new CLASS_CHECKER1_semchecker1_identifier_identError(((CLASS_CHECKER1_semchecker1_identifier)(p1_target)),347);
                                    break;
                                    case 3: 
                                    // JavaLine 200 <== SourceLine 1041
                                    new CLASS_CHECKER1_semchecker1_identifier_identError(((CLASS_CHECKER1_semchecker1_identifier)(p1_target)),348);
                                    break;
                                    case 4: 
                                    // JavaLine 204 <== SourceLine 1043
                                    new CLASS_CHECKER1_semchecker1_identifier_identError(((CLASS_CHECKER1_semchecker1_identifier)(p1_target)),349);
                                    break;
                                    case 5: 
                                    case 7: 
                                    // JavaLine 209 <== SourceLine 1045
                                    new CLASS_CHECKER1_semchecker1_identifier_identError(((CLASS_CHECKER1_semchecker1_identifier)(p1_target)),350);
                                    break;
                                    case 1: 
                                    // JavaLine 213 <== SourceLine 1047
                                    if(_VALUE(new CLASS_CHECKER1_semchecker1_identifier_result(((CLASS_CHECKER1_semchecker1_identifier)(p1_target)))._RESULT)) {
                                        {
                                            // JavaLine 216 <== SourceLine 1048
                                            issimple=1;
                                            ;
                                            // JavaLine 219 <== SourceLine 1049
                                            if(_VALUE((p1_target.type==(((char)14))))) {
                                                // JavaLine 221 <== SourceLine 1050
                                                new CLASS_CHECKER1_semchecker1_identifier_identError(((CLASS_CHECKER1_semchecker1_identifier)(p1_target)),345);
                                            }
                                        }
                                    } else {
                                        // JavaLine 226 <== SourceLine 1051
                                        new CLASS_CHECKER1_semchecker1_identifier_identError(((CLASS_CHECKER1_semchecker1_identifier)(p1_target)),346);
                                    }
                                    break;
                                    default:
                                    // JavaLine 231 <== SourceLine 1052
                                    new CLASS_ERRMSG_internerr((_CUR._SL._SL),((char)8),1052);
                                    break;
                                } // END SWITCH STATEMENT
                            }
                        } else {
                            // JavaLine 237 <== SourceLine 1055
                            if(_VALUE((p1_target.ctype==(((char)129))))) {
                                {
                                    // JavaLine 240 <== SourceLine 1057
                                    {
                                        // BEGIN INSPECTION 
                                        _inspect_1057_4569=((CLASS_CHECKER1_semchecker1_argumented)(p1_target));
                                        if(_inspect_1057_4569!=null) { // INSPECT _inspect_1057_4569  type=ref(ARGUMENTED)
                                            // JavaLine 245 <== SourceLine 1058
                                            {
                                                // JavaLine 247 <== SourceLine 1057
                                                {
                                                    // JavaLine 249 <== SourceLine 1058
                                                    ((CLASS_CHECKER1_semchecker1_refassign)(_CUR)).issimple=_inspect_1057_4569.p1_ident.issimple;
                                                    ;
                                                    // JavaLine 252 <== SourceLine 1059
                                                    if(_inspect_1057_4569.p1_ident.kind<((char)0) || _inspect_1057_4569.p1_ident.kind>((char)13)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                                                    switch(_inspect_1057_4569.p1_ident.kind) { // BEGIN SWITCH STATEMENT
                                                        case 10: 
                                                        case 2: 
                                                        case 6: 
                                                        // JavaLine 258 <== SourceLine 1061
                                                        if(_VALUE((_inspect_1057_4569.p1_ident.meaning.protect_1==(((char)2))))) {
                                                            {
                                                                // JavaLine 261 <== SourceLine 1062
                                                                if(_VALUE((((CLASS_CHECKER1_semchecker1)(_CUR._SL)).readonly_2==(_inspect_1057_4569.p1_ident.meaning)))) {
                                                                    ((CLASS_CHECKER1_semchecker1)(_CUR._SL)).readonly_2=null;
                                                                } else {
                                                                    // JavaLine 265 <== SourceLine 1063
                                                                    new CLASS_CHECKER1_semchecker1_identifier_identError(_inspect_1057_4569.p1_ident,253);
                                                                }
                                                                ;
                                                            }
                                                        }
                                                        break;
                                                        default:
                                                        // JavaLine 273 <== SourceLine 1065
                                                        new CLASS_CHECKER1_semchecker1_identifier_identError(_inspect_1057_4569.p1_ident,351);
                                                        break;
                                                    } // END SWITCH STATEMENT
                                                    ;
                                                }
                                            }
                                        }
                                    } // END INSPECTION
                                }
                            } else {
                                // JavaLine 284 <== SourceLine 1069
                                new CLASS_ERRMSG_error0((_CUR._SL._SL),160);
                            }
                        }
                        ;
                        // JavaLine 289 <== SourceLine 1070
                        ((CLASS_CHECKER1_semchecker1)(_CUR._SL)).exptop_2=((CLASS_CHECKER1_semchecker1_refassign)(_CUR));
                        ;
                        // JavaLine 292 <== SourceLine 1071
                        {
                            _SIM_LABEL(2); // DeclaredIn: refassign -> refassign[CLASS_CHECKER1_semchecker1_refassign] DeclarationKind=Class
                            // JavaLine 295 <== SourceLine 1073
                            detach(1073);
                        }
                        ;
                        // JavaLine 299 <== SourceLine 1075
                        ((CLASS_CHECKER1_semchecker1)(_CUR._SL)).refassList_2=null;
                        ;
                        // JavaLine 302 <== SourceLine 1077
                        p1_source=((CLASS_CHECKER1_semchecker1)(_CUR._SL)).exptop_2;
                        ;
                        p1_target=p1_source.p_pred;
                        ;
                        p_pred=p1_target.p_pred;
                        ;
                        // JavaLine 309 <== SourceLine 1078
                        cl=ctype=kind=((char)0);
                        ;
                        issimple=0;
                        ;
                        implqua_1=false;
                        ;
                    }
                    if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
                }
                ;
                // JavaLine 320 <== SourceLine 1080
                // BEGIN refassign INNER PART
                // ENDOF refassign INNER PART
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","9 refassign",1,912,13,1017,15,1073,18,919,20,1057,39,169,41,988,44,991,47,993,56,995,59,996,62,997,64,998,67,999,71,1000,77,1002,79,1003,87,1004,95,1006,98,1007,102,1008,104,1009,107,1010,111,1011,115,1012,118,1014,123,1015,128,1016,130,1017,145,1020,150,1022,155,1025,159,1026,165,1029,168,1030,173,1031,175,1032,178,1033,181,1034,185,1035,196,1039,200,1041,204,1043,209,1045,213,1047,216,1048,219,1049,221,1050,226,1051,231,1052,237,1055,240,1057,245,1058,247,1057,249,1058,252,1059,258,1061,261,1062,265,1063,273,1065,284,1069,289,1070,292,1071,295,1073,299,1075,302,1077,309,1078,320,1080,333,1080);
} // End of Class
