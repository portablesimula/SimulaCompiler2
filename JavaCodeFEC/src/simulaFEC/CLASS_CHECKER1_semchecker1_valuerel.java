// JavaLine 1 <== SourceLine 339
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_CHECKER1_semchecker1_valuerel extends CLASS_CHECKER1_semchecker1_relation {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=3, firstLine=339, lastLine=419, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 407
    final RTS_LABEL _LABEL_CLASS_CHECKER1_semchecker1_valuerel_Block375_Block407_TypErr_0=new RTS_LABEL(this,3,1,"TypErr"); // Local Label #1=TypErr At PrefixLevel 3
    // Declare locals as attributes
    public RTS_PRCQNT emit_0() { return(new RTS_PRCQNT(this,CLASS_CHECKER1_semchecker1_valuerel_emit.class)); }
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_valuerel(RTS_RTObject staticLink,CLASS_CHECKER1_semchecker1_exp sp_pred,char sp_ch,CLASS_CHECKER1_semchecker1_exp sp1_left,CLASS_CHECKER1_semchecker1_exp sp1_right) {
        super(staticLink,sp_pred,sp_ch,sp1_left,sp1_right);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_CHECKER1_semchecker1_valuerel _STM() {
        CLASS_CHECKER1_semchecker1_valuerel _THIS=(CLASS_CHECKER1_semchecker1_valuerel)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 28 <== SourceLine 169
                // BEGIN exp INNER PART
                // JavaLine 30 <== SourceLine 223
                // BEGIN operation INNER PART
                // JavaLine 32 <== SourceLine 268
                // BEGIN relation INNER PART
                // JavaLine 34 <== SourceLine 373
                while(true) {
                    {
                        // JavaLine 37 <== SourceLine 375
                        ((CLASS_CHECKER1_semchecker1)(_CUR._SL)).exptop_2=((CLASS_CHECKER1_semchecker1_valuerel)(_CUR));
                        ;
                        // JavaLine 40 <== SourceLine 377
                        opttype_2=p1_left.type;
                        ;
                        ctype=':';
                        ;
                        // JavaLine 45 <== SourceLine 378
                        if(_VALUE((p1_left.ctype==('Z')))) {
                            new CLASS_CHECKER1_semchecker1_checkasexp((_CUR._SL),((CLASS_CHECKER1_semchecker1_identifier)(p1_left)));
                        }
                        ;
                        // JavaLine 50 <== SourceLine 379
                        if(_VALUE((p1_right.ctype==('Z')))) {
                            new CLASS_CHECKER1_semchecker1_checkasexp((_CUR._SL),((CLASS_CHECKER1_semchecker1_identifier)(p1_right)));
                        }
                        ;
                        // JavaLine 55 <== SourceLine 380
                        cl=((char)1);
                        ;
                        // JavaLine 58 <== SourceLine 382
                        if(opttype_2<((char)0) || opttype_2>((char)15)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                        switch(opttype_2) { // BEGIN SWITCH STATEMENT
                            case 1: 
                            case 7: 
                            // JavaLine 63 <== SourceLine 384
                            if(_VALUE((p_ch==(((char)17))))) {
                                p_ch=':';
                            } else {
                                _GOTO(_LABEL_CLASS_CHECKER1_semchecker1_valuerel_Block375_Block407_TypErr_0); // GOTO EVALUATED LABEL
                            }
                            break;
                            case 2: 
                            case 3: 
                            case 4: 
                            case 5: 
                            case 6: 
                            // JavaLine 75 <== SourceLine 387
                            if(p1_right.type<((char)0) || p1_right.type>((char)15)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                            switch(p1_right.type) { // BEGIN SWITCH STATEMENT
                                case 2: 
                                case 3: 
                                case 4: 
                                case 5: 
                                case 6: 
                                // JavaLine 83 <== SourceLine 388
                                {
                                    // JavaLine 85 <== SourceLine 391
                                    ((CLASS_CHECKER1)(_CUR._SL._SL)).rtype=p1_right.type;
                                    ;
                                    // JavaLine 88 <== SourceLine 392
                                    if(_VALUE((((opttype_2<=(((char)4)))&&((((CLASS_CHECKER1)(_CUR._SL._SL)).rtype==(((char)2)))))||(((opttype_2==(((char)2)))&&(((((CLASS_CHECKER1)(_CUR._SL._SL)).rtype==(((char)4)))|((((CLASS_CHECKER1)(_CUR._SL._SL)).rtype==(((char)3))))))))))) {
                                        // JavaLine 90 <== SourceLine 395
                                        opttype_2=((char)2);
                                    } else {
                                        // JavaLine 93 <== SourceLine 396
                                        if(_VALUE((p1_right.type>(opttype_2)))) {
                                            opttype_2=p1_right.type;
                                        }
                                    }
                                    ;
                                }
                                break;
                                case 15: 
                                ;
                                break;
                                default:
                                // JavaLine 105 <== SourceLine 399
                                new CLASS_ERRMSG_error2xx((_CUR._SL._SL),432,p1_right.type,p_ch);
                                break;
                            } // END SWITCH STATEMENT
                            break;
                            case 8: 
                            case 9: 
                            // JavaLine 112 <== SourceLine 403
                            if(_VALUE((opttype_2!=(p1_right.type)))) {
                                // JavaLine 114 <== SourceLine 404
                                new CLASS_CHECKER1_semchecker1_exp_incompTypes((_CUR),opttype_2,p1_right.type);
                            }
                            break;
                            case 15: 
                            ;
                            break;
                            default:
                            // JavaLine 122 <== SourceLine 406
                            {
                                // JavaLine 124 <== SourceLine 407
                                {
                                    _SIM_LABEL(1); // DeclaredIn: valuerel -> valuerel[CLASS_CHECKER1_semchecker1_valuerel] DeclarationKind=Class
                                    new CLASS_ERRMSG_error2xx((_CUR._SL._SL),431,opttype_2,p_ch);
                                }
                                ;
                                opttype_2=((char)15);
                            }
                            break;
                        } // END SWITCH STATEMENT
                        ;
                        // JavaLine 135 <== SourceLine 411
                        type=((char)1);
                        ;
                        // JavaLine 138 <== SourceLine 413
                        detach(413);
                        ;
                        // JavaLine 141 <== SourceLine 415
                        ((CLASS_CHECKER1_semchecker1)(_CUR._SL)).valrelList_2=null;
                        ;
                        // JavaLine 144 <== SourceLine 416
                        p1_right=((CLASS_CHECKER1_semchecker1)(_CUR._SL)).exptop_2;
                        ;
                        p1_left=p1_right.p_pred;
                        ;
                        p_pred=p1_left.p_pred;
                        ;
                        // JavaLine 151 <== SourceLine 417
                        issimple=0;
                        ;
                    }
                    if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
                }
                ;
                // JavaLine 158 <== SourceLine 419
                // BEGIN valuerel INNER PART
                // ENDOF valuerel INNER PART
                // ENDOF relation INNER PART
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","8 valuerel",1,339,11,407,28,169,30,223,32,268,34,373,37,375,40,377,45,378,50,379,55,380,58,382,63,384,75,387,83,388,85,391,88,392,90,395,93,396,105,399,112,403,114,404,122,406,124,407,135,411,138,413,141,415,144,416,151,417,158,419,173,419);
} // End of Class
