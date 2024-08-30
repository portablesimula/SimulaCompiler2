// JavaLine 1 <== SourceLine 1082
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_CHECKER1_semchecker1_ifexp extends CLASS_CHECKER1_semchecker1_operation {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=2, firstLine=1082, lastLine=1164, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    public CLASS_CHECKER1_semchecker1_exp p2_testexp;
    // Declare local labels
    // JavaLine 11 <== SourceLine 1137
    final RTS_LABEL _LABEL_CLASS_CHECKER1_semchecker1_ifexp_NONCOMP_2=new RTS_LABEL(this,2,1,"NONCOMP"); // Local Label #1=NONCOMP At PrefixLevel 2
    // Declare locals as attributes
    public RTS_PRCQNT dump_0() { return(new RTS_PRCQNT(this,CLASS_CHECKER1_semchecker1_ifexp_dump.class)); }
    public RTS_PRCQNT emit_0() { return(new RTS_PRCQNT(this,CLASS_CHECKER1_semchecker1_ifexp_emit.class)); }
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_ifexp(RTS_RTObject staticLink,CLASS_CHECKER1_semchecker1_exp sp_pred,char sp_ch,CLASS_CHECKER1_semchecker1_exp sp1_left,CLASS_CHECKER1_semchecker1_exp sp1_right,CLASS_CHECKER1_semchecker1_exp sp2_testexp) {
        super(staticLink,sp_pred,sp_ch,sp1_left,sp1_right);
        // Parameter assignment to locals
        this.p2_testexp = sp2_testexp;
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_CHECKER1_semchecker1_ifexp _STM() {
        CLASS_CHECKER1_semchecker1_ifexp _THIS=(CLASS_CHECKER1_semchecker1_ifexp)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 30 <== SourceLine 169
                // BEGIN exp INNER PART
                // JavaLine 32 <== SourceLine 223
                // BEGIN operation INNER PART
                // JavaLine 34 <== SourceLine 1116
                type=p1_left.type;
                ;
                qual=p1_left.qual;
                ;
                // JavaLine 39 <== SourceLine 1117
                if(_VALUE((p1_left.ctype==('Z')))) {
                    new CLASS_CHECKER1_semchecker1_checkasexp((_CUR._SL),((CLASS_CHECKER1_semchecker1_identifier)(p1_left)));
                }
                ;
                // JavaLine 44 <== SourceLine 1118
                if(_VALUE((p1_right.ctype==('Z')))) {
                    new CLASS_CHECKER1_semchecker1_checkasexp((_CUR._SL),((CLASS_CHECKER1_semchecker1_identifier)(p1_right)));
                }
                ;
                // JavaLine 49 <== SourceLine 1119
                cl=((char)1);
                ;
                // JavaLine 52 <== SourceLine 1120
                if(_VALUE((p2_testexp.type!=(((char)1))))) {
                    {
                        if(_VALUE((p2_testexp.type!=(((char)15))))) {
                            // JavaLine 56 <== SourceLine 1121
                            new CLASS_ERRMSG_error0((_CUR._SL._SL),161);
                        }
                    }
                }
                ;
                // JavaLine 62 <== SourceLine 1122
                if(_VALUE((p2_testexp.ctype==('Z')))) {
                    // JavaLine 64 <== SourceLine 1123
                    new CLASS_CHECKER1_semchecker1_checkasexp((_CUR._SL),((CLASS_CHECKER1_semchecker1_identifier)(p2_testexp)));
                }
                ;
                // JavaLine 68 <== SourceLine 1126
                if(type<((char)0) || type>((char)15)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                switch(type) { // BEGIN SWITCH STATEMENT
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: 
                    case 6: 
                    // JavaLine 76 <== SourceLine 1129
                    if(p1_right.type<((char)0) || p1_right.type>((char)15)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                    switch(p1_right.type) { // BEGIN SWITCH STATEMENT
                        case 2: 
                        case 3: 
                        case 4: 
                        case 5: 
                        case 6: 
                        // JavaLine 84 <== SourceLine 1132
                        if(_VALUE((type<(p1_right.type)))) {
                            type=p1_right.type;
                        }
                        break;
                        case 15: 
                        ;
                        break;
                        case 1: 
                        case 8: 
                        // JavaLine 94 <== SourceLine 1136
                        if(_VALUE((type!=(p1_right.type)))) {
                            // JavaLine 96 <== SourceLine 1137
                            {
                                _SIM_LABEL(1); // DeclaredIn: ifexp
                                new CLASS_CHECKER1_semchecker1_exp_incompTypes((_CUR),type,p1_right.type);
                            }
                        }
                        break;
                        default:
                        // JavaLine 104 <== SourceLine 1138
                        _GOTO(_LABEL_CLASS_CHECKER1_semchecker1_ifexp_NONCOMP_2); // GOTO EVALUATED LABEL
                        break;
                    } // END SWITCH STATEMENT
                    break;
                    case 7: 
                    // JavaLine 110 <== SourceLine 1141
                    if(_VALUE((p1_right.type==(type)))) {
                        {
                            // JavaLine 113 <== SourceLine 1142
                            if(_VALUE((qual!=(p1_right.qual)))) {
                                {
                                    // JavaLine 116 <== SourceLine 1143
                                    if(_VALUE((qual==(null)))) {
                                        qual=p1_right.qual;
                                    } else {
                                        // JavaLine 120 <== SourceLine 1144
                                        if(_VALUE((p1_right.qual!=(null)))) {
                                            new CLASS_CHECKER1_semchecker1_ifexp_Block1142_Block1143_Block1145((_CUR))._STM();
                                        }
                                    }
                                    ;
                                }
                            }
                            ;
                        }
                    } else {
                        // JavaLine 131 <== SourceLine 1156
                        _GOTO(_LABEL_CLASS_CHECKER1_semchecker1_ifexp_NONCOMP_2); // GOTO EVALUATED LABEL
                    }
                    break;
                    case 15: 
                    // JavaLine 136 <== SourceLine 1157
                    {
                        // JavaLine 138 <== SourceLine 1158
                        type=p1_right.type;
                        ;
                        qual=p1_right.qual;
                    }
                    break;
                    default:
                    // JavaLine 145 <== SourceLine 1161
                    if(_VALUE((type!=(p1_right.type)))) {
                        _GOTO(_LABEL_CLASS_CHECKER1_semchecker1_ifexp_NONCOMP_2); // GOTO EVALUATED LABEL
                    }
                    break;
                } // END SWITCH STATEMENT
                ;
                // JavaLine 152 <== SourceLine 1164
                // BEGIN ifexp INNER PART
                // ENDOF ifexp INNER PART
                // ENDOF operation INNER PART
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","8 ifexp",1,1082,11,1137,30,169,32,223,34,1116,39,1117,44,1118,49,1119,52,1120,56,1121,62,1122,64,1123,68,1126,76,1129,84,1132,94,1136,96,1137,104,1138,110,1141,113,1142,116,1143,120,1144,131,1156,136,1157,138,1158,145,1161,152,1164,166,1164);
} // End of Class
