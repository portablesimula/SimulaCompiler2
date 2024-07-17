// JavaLine 1 <== SourceLine 516
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CHECKER1_semchecker1_unary extends CHECKER1_semchecker1_arithop {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=3, firstLine=516, lastLine=529, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 461
    final RTS_LABEL _LABEL_CHECKER1_semchecker1_arithop_CHKcomp_2=new RTS_LABEL(this,2,1,"CHKcomp"); // Local Label #1=CHKcomp At PrefixLevel 2
    // Declare locals as attributes
    public RTS_PRCQNT emit_0() { return(new RTS_PRCQNT(this,CHECKER1_semchecker1_unary_emit.class)); }
    // Normal Constructor
    public CHECKER1_semchecker1_unary(RTS_RTObject staticLink,CHECKER1_semchecker1_exp sp_pred,char sp_ch,CHECKER1_semchecker1_exp sp1_left,CHECKER1_semchecker1_exp sp1_right) {
        super(staticLink,sp_pred,sp_ch,sp1_left,sp1_right);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CHECKER1_semchecker1_unary _STM() {
        CHECKER1_semchecker1_unary _THIS=(CHECKER1_semchecker1_unary)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 27 <== SourceLine 169
                // BEGIN INNER PART
                // JavaLine 29 <== SourceLine 223
                // BEGIN INNER PART
                // JavaLine 31 <== SourceLine 443
                if(_VALUE((p1_right.kind!=(((char)0))))) {
                    {
                        if(_VALUE((p1_right.ctype==('Z')))) {
                            // JavaLine 35 <== SourceLine 444
                            new CHECKER1_semchecker1_checkasexp((_CUR._SL),((CHECKER1_semchecker1_identifier)(p1_right)));
                        }
                    }
                }
                ;
                // JavaLine 41 <== SourceLine 445
                if(_VALUE((p1_left.ctype==('Z')))) {
                    {
                        // JavaLine 44 <== SourceLine 446
                        if(_VALUE((p1_left.kind!=(((char)0))))) {
                            new CHECKER1_semchecker1_checkasexp((_CUR._SL),((CHECKER1_semchecker1_identifier)(p1_left)));
                        }
                    }
                } else {
                    // JavaLine 50 <== SourceLine 448
                    if(_VALUE((p1_left.p_ch==('[')))) {
                        {
                            // JavaLine 53 <== SourceLine 449
                            if(_VALUE(((p_ch==('F'))||((p_ch==('H')))))) {
                                {
                                    // JavaLine 56 <== SourceLine 450
                                    ((CHECKER1_semchecker1)(_CUR._SL)).expv_2=p1_left;
                                    ;
                                    p1_left=p1_right;
                                    ;
                                    p1_right=((CHECKER1_semchecker1)(_CUR._SL)).expv_2;
                                }
                            }
                            ;
                        }
                    }
                }
                ;
                // JavaLine 69 <== SourceLine 452
                type=((CHECKER1)(_CUR._SL._SL)).rtype=p1_right.type;
                ;
                // JavaLine 72 <== SourceLine 453
                ((CHECKER1)(_CUR._SL._SL)).ltype=p1_left.type;
                ;
                // JavaLine 75 <== SourceLine 454
                cl=((char)1);
                ;
                ctype=((char)147);
                ;
                // JavaLine 80 <== SourceLine 456
                if(type<((char)0) || type>((char)15)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                switch(type) { // BEGIN SWITCH STATEMENT
                    case 2: 
                    case 3: 
                    // JavaLine 85 <== SourceLine 457
                    {
                        // JavaLine 87 <== SourceLine 459
                        type=((char)4);
                        ;
                        _GOTO(_LABEL_CHECKER1_semchecker1_arithop_CHKcomp_2); // GOTO EVALUATED LABEL
                    }
                    break;
                    case 4: 
                    case 5: 
                    case 6: 
                    // JavaLine 96 <== SourceLine 461
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
                            // JavaLine 108 <== SourceLine 465
                            if(_VALUE((type<(p1_left.type)))) {
                                type=p1_left.type;
                            }
                            break;
                            default:
                            // JavaLine 114 <== SourceLine 466
                            {
                                // JavaLine 116 <== SourceLine 467
                                ((CHECKER1)(_CUR._SL._SL)).ltype=((char)4);
                                ;
                                new ERRMSG_error2xx((_CUR._SL._SL),429,p1_left.type,p_ch);
                            }
                            break;
                        } // END SWITCH STATEMENT
                    }
                    break;
                    default:
                    // JavaLine 126 <== SourceLine 469
                    {
                        // JavaLine 128 <== SourceLine 470
                        ((CHECKER1)(_CUR._SL._SL)).ltype=((CHECKER1)(_CUR._SL._SL)).rtype=((char)4);
                        ;
                        // JavaLine 131 <== SourceLine 471
                        new ERRMSG_error2xx((_CUR._SL._SL),430,type,p_ch);
                        ;
                        type=((char)15);
                        ;
                    }
                    break;
                } // END SWITCH STATEMENT
                ;
                // JavaLine 140 <== SourceLine 474
                // BEGIN INNER PART
                // JavaLine 142 <== SourceLine 529
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","8 unary",1,516,10,461,27,169,29,223,31,443,35,444,41,445,44,446,50,448,53,449,56,450,69,452,72,453,75,454,80,456,85,457,87,459,96,461,108,465,114,466,116,467,126,469,128,470,131,471,140,474,142,529,157,529);
} // End of Class
