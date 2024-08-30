// JavaLine 1 <== SourceLine 477
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_CHECKER1_semchecker1_integerdivide extends CLASS_CHECKER1_semchecker1_arithop {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=3, firstLine=477, lastLine=484, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 461
    final RTS_LABEL _LABEL_CLASS_CHECKER1_semchecker1_arithop_CHKcomp_2=new RTS_LABEL(this,2,1,"CHKcomp"); // Local Label #1=CHKcomp At PrefixLevel 2
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_integerdivide(RTS_RTObject staticLink,CLASS_CHECKER1_semchecker1_exp sp_pred,char sp_ch,CLASS_CHECKER1_semchecker1_exp sp1_left,CLASS_CHECKER1_semchecker1_exp sp1_right) {
        super(staticLink,sp_pred,sp_ch,sp1_left,sp1_right);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_CHECKER1_semchecker1_integerdivide _STM() {
        CLASS_CHECKER1_semchecker1_integerdivide _THIS=(CLASS_CHECKER1_semchecker1_integerdivide)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 26 <== SourceLine 169
                // BEGIN exp INNER PART
                // JavaLine 28 <== SourceLine 223
                // BEGIN operation INNER PART
                // JavaLine 30 <== SourceLine 443
                if(_VALUE((p1_right.kind!=(((char)0))))) {
                    {
                        if(_VALUE((p1_right.ctype==('Z')))) {
                            // JavaLine 34 <== SourceLine 444
                            new CLASS_CHECKER1_semchecker1_checkasexp((_CUR._SL),((CLASS_CHECKER1_semchecker1_identifier)(p1_right)));
                        }
                    }
                }
                ;
                // JavaLine 40 <== SourceLine 445
                if(_VALUE((p1_left.ctype==('Z')))) {
                    {
                        // JavaLine 43 <== SourceLine 446
                        if(_VALUE((p1_left.kind!=(((char)0))))) {
                            new CLASS_CHECKER1_semchecker1_checkasexp((_CUR._SL),((CLASS_CHECKER1_semchecker1_identifier)(p1_left)));
                        }
                    }
                } else {
                    // JavaLine 49 <== SourceLine 448
                    if(_VALUE((p1_left.p_ch==('[')))) {
                        {
                            // JavaLine 52 <== SourceLine 449
                            if(_VALUE(((p_ch==('F'))||((p_ch==('H')))))) {
                                {
                                    // JavaLine 55 <== SourceLine 450
                                    ((CLASS_CHECKER1_semchecker1)(_CUR._SL)).expv_2=p1_left;
                                    ;
                                    p1_left=p1_right;
                                    ;
                                    p1_right=((CLASS_CHECKER1_semchecker1)(_CUR._SL)).expv_2;
                                }
                            }
                            ;
                        }
                    }
                }
                ;
                // JavaLine 68 <== SourceLine 452
                type=((CLASS_CHECKER1)(_CUR._SL._SL)).rtype=p1_right.type;
                ;
                // JavaLine 71 <== SourceLine 453
                ((CLASS_CHECKER1)(_CUR._SL._SL)).ltype=p1_left.type;
                ;
                // JavaLine 74 <== SourceLine 454
                cl=((char)1);
                ;
                ctype=((char)147);
                ;
                // JavaLine 79 <== SourceLine 456
                if(type<((char)0) || type>((char)15)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                switch(type) { // BEGIN SWITCH STATEMENT
                    case 2: 
                    case 3: 
                    // JavaLine 84 <== SourceLine 457
                    {
                        // JavaLine 86 <== SourceLine 459
                        type=((char)4);
                        ;
                        _GOTO(_LABEL_CLASS_CHECKER1_semchecker1_arithop_CHKcomp_2); // GOTO EVALUATED LABEL
                    }
                    break;
                    case 4: 
                    case 5: 
                    case 6: 
                    // JavaLine 95 <== SourceLine 461
                    {
                        _SIM_LABEL(1); // DeclaredIn: arithop
                        if(p1_left.type<((char)0) || p1_left.type>((char)15)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                        switch(p1_left.type) { // BEGIN SWITCH STATEMENT
                            case 2: 
                            case 3: 
                            case 4: 
                            ;
                            break;
                            case 5: 
                            case 6: 
                            // JavaLine 107 <== SourceLine 465
                            if(_VALUE((type<(p1_left.type)))) {
                                type=p1_left.type;
                            }
                            break;
                            default:
                            // JavaLine 113 <== SourceLine 466
                            {
                                // JavaLine 115 <== SourceLine 467
                                ((CLASS_CHECKER1)(_CUR._SL._SL)).ltype=((char)4);
                                ;
                                new CLASS_ERRMSG_error2xx((_CUR._SL._SL),429,p1_left.type,p_ch);
                            }
                            break;
                        } // END SWITCH STATEMENT
                    }
                    break;
                    default:
                    // JavaLine 125 <== SourceLine 469
                    {
                        // JavaLine 127 <== SourceLine 470
                        ((CLASS_CHECKER1)(_CUR._SL._SL)).ltype=((CLASS_CHECKER1)(_CUR._SL._SL)).rtype=((char)4);
                        ;
                        // JavaLine 130 <== SourceLine 471
                        new CLASS_ERRMSG_error2xx((_CUR._SL._SL),430,type,p_ch);
                        ;
                        type=((char)15);
                        ;
                    }
                    break;
                } // END SWITCH STATEMENT
                ;
                // JavaLine 139 <== SourceLine 474
                // BEGIN arithop INNER PART
                // JavaLine 141 <== SourceLine 481
                if(_VALUE((((CLASS_CHECKER1)(_CUR._SL._SL)).ltype>=(((char)5))))) {
                    new CLASS_CHECKER1_semchecker1_exp_typeError(p1_left,302);
                }
                ;
                // JavaLine 146 <== SourceLine 482
                if(_VALUE((((CLASS_CHECKER1)(_CUR._SL._SL)).rtype>=(((char)5))))) {
                    new CLASS_CHECKER1_semchecker1_exp_typeError(p1_right,303);
                }
                ;
                // JavaLine 151 <== SourceLine 483
                type=((char)4);
                ;
                // JavaLine 154 <== SourceLine 484
                // BEGIN integerdivide INNER PART
                // ENDOF integerdivide INNER PART
                // ENDOF arithop INNER PART
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","8 integerdivide",1,477,10,461,26,169,28,223,30,443,34,444,40,445,43,446,49,448,52,449,55,450,68,452,71,453,74,454,79,456,84,457,86,459,95,461,107,465,113,466,115,467,125,469,127,470,130,471,139,474,141,481,146,482,151,483,154,484,169,484);
} // End of Class
