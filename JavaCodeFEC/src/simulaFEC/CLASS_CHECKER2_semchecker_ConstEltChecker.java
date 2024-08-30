// JavaLine 1 <== SourceLine 331
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:33 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_CHECKER2_semchecker_ConstEltChecker extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=0, firstLine=331, lastLine=382, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 340
    final RTS_LABEL _LABEL_CLASS_CHECKER2_semchecker_ConstEltChecker_REP_0=new RTS_LABEL(this,0,1,"REP"); // Local Label #1=REP At PrefixLevel 0
    // JavaLine 13 <== SourceLine 379
    final RTS_LABEL _LABEL_CLASS_CHECKER2_semchecker_ConstEltChecker_Block341_EXIT_0=new RTS_LABEL(this,0,2,"EXIT"); // Local Label #2=EXIT At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 16 <== SourceLine 332
    public CLASS_COMMON_quantity meaning=null;
    // JavaLine 18 <== SourceLine 334
    public char type=0;
    // JavaLine 20 <== SourceLine 335
    public char etype=0;
    // JavaLine 22 <== SourceLine 364
    public CLASS_COMMON_brecord _inspect_364_4597=null;
    // Normal Constructor
    public CLASS_CHECKER2_semchecker_ConstEltChecker(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_CHECKER2_semchecker_ConstEltChecker _STM() {
        CLASS_CHECKER2_semchecker_ConstEltChecker _THIS=(CLASS_CHECKER2_semchecker_ConstEltChecker)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,2); // For ByteCode Engineering
                // JavaLine 38 <== SourceLine 340
                {
                    _SIM_LABEL(1); // DeclaredIn: ConstEltChecker
                    while(true) {
                        {
                            // JavaLine 43 <== SourceLine 341
                            detach(341);
                            ;
                            // JavaLine 46 <== SourceLine 344
                            meaning=new CLASS_BUILDER1_meaningof((_CUR._SL._SL),((CLASS_CHECKER2_semchecker)(_CUR._SL)).opdSymb_2)._RESULT;
                            ;
                            type=meaning.type_1;
                            ;
                            // JavaLine 51 <== SourceLine 345
                            if(_VALUE((meaning.special_1!=(((char)3))))) {
                                new CLASS_ERRMSG_internerr((_CUR._SL._SL),((char)9),345);
                            }
                            ;
                            // JavaLine 56 <== SourceLine 346
                            if(_VALUE((meaning==(null)))) {
                                new CLASS_ERRMSG_internerr((_CUR._SL._SL),((char)9),346);
                            }
                            ;
                            // JavaLine 61 <== SourceLine 348
                            detach(348);
                            ;
                            // JavaLine 64 <== SourceLine 351
                            if(_VALUE((((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2.p_ch!=('[')))) {
                                {
                                    new CLASS_CHECKER2_semchecker_ConstEltChecker_Cerror((_CUR),170);
                                    ;
                                    _GOTO(_LABEL_CLASS_CHECKER2_semchecker_ConstEltChecker_Block341_EXIT_0); // GOTO EVALUATED LABEL
                                }
                            }
                            ;
                            // JavaLine 73 <== SourceLine 352
                            etype=((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2.type;
                            ;
                            // JavaLine 76 <== SourceLine 353
                            if(_VALUE((type!=(etype)))) {
                                {
                                    // JavaLine 79 <== SourceLine 354
                                    if(_VALUE(((type==(((char)3)))&((etype==(((char)4))))))) {
                                        ;
                                    } else {
                                        // JavaLine 83 <== SourceLine 360
                                        {
                                            new CLASS_CHECKER2_semchecker_ConstEltChecker_Cerror((_CUR),255);
                                            ;
                                            _GOTO(_LABEL_CLASS_CHECKER2_semchecker_ConstEltChecker_Block341_EXIT_0); // GOTO EVALUATED LABEL
                                        }
                                    }
                                    ;
                                }
                            }
                            ;
                            // JavaLine 94 <== SourceLine 362
                            if(_VALUE((meaning.descr_1!=(null)))) {
                                new CLASS_ERRMSG_internerr((_CUR._SL._SL),((char)9),362);
                            }
                            ;
                            // JavaLine 99 <== SourceLine 363
                            meaning.special_1=((char)2);
                            ;
                            // JavaLine 102 <== SourceLine 364
                            {
                                // BEGIN INSPECTION 
                                _inspect_364_4597=new CLASS_COMMON_brecord((_CUR._SL._SL))._STM();
                                if(_inspect_364_4597!=null) { // INSPECT _inspect_364_4597  type=ref(BRECORD)
                                    // JavaLine 107 <== SourceLine 365
                                    {
                                        // JavaLine 109 <== SourceLine 364
                                        {
                                            // JavaLine 111 <== SourceLine 365
                                            meaning.descr_1=((CLASS_COMMON_brecord)_inspect_364_4597);
                                            ;
                                            _inspect_364_4597.declquant=meaning;
                                            ;
                                            // JavaLine 116 <== SourceLine 366
                                            _inspect_364_4597.blnohi=((CLASS_CHECKER1_semchecker1__const)(((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2)).ixhi_1;
                                            ;
                                            // JavaLine 119 <== SourceLine 367
                                            _inspect_364_4597.blnolo=((CLASS_CHECKER1_semchecker1__const)(((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2)).ixlo_1;
                                            ;
                                        }
                                    }
                                }
                            } // END INSPECTION
                            ;
                            // JavaLine 127 <== SourceLine 369
                            if(_VALUE((type==(((char)8))))) {
                                {
                                    // JavaLine 130 <== SourceLine 370
                                    if(_VALUE((((CLASS_CHECKER1_semchecker1__const)(((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2)).ixhi_1!=(((char)0))))) {
                                        // JavaLine 132 <== SourceLine 371
                                        {
                                            // JavaLine 134 <== SourceLine 372
                                            ((CLASS_CHECKER2)(_CUR._SL._SL)).opihi_6=((CLASS_CHECKER1_semchecker1__const)(((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2)).ixhi_1;
                                            ;
                                            // JavaLine 137 <== SourceLine 373
                                            ((CLASS_CHECKER2)(_CUR._SL._SL)).opilo_6=((CLASS_CHECKER1_semchecker1__const)(((CLASS_CHECKER2_semchecker)(_CUR._SL)).exptop_2)).ixlo_1;
                                            ;
                                            // JavaLine 140 <== SourceLine 374
                                            ((CLASS_CHECKER2)(_CUR._SL._SL)).opc_6='"';
                                            ;
                                            ((CLASS_CHECKER2)(_CUR._SL._SL)).coder.opq_3=meaning;
                                            ;
                                            call(((CLASS_CHECKER2)(_CUR._SL._SL)).coder,374);
                                            ;
                                        }
                                    }
                                }
                            }
                            ;
                            // JavaLine 152 <== SourceLine 379
                            {
                                _SIM_LABEL(2); // DeclaredIn: ConstEltChecker -> ConstEltChecker[CLASS_CHECKER2_semchecker_ConstEltChecker] DeclarationKind=Class
                                new CLASS_CHECKER1_semchecker1_popExpStack((_CUR._SL));
                            }
                            ;
                        }
                        if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
                    }
                }
                ;
                // JavaLine 163 <== SourceLine 382
                // BEGIN ConstEltChecker INNER PART
                // ENDOF ConstEltChecker INNER PART
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER2.sim","8 ConstEltChecker",1,331,11,340,13,379,16,332,18,334,20,335,22,364,38,340,43,341,46,344,51,345,56,346,61,348,64,351,73,352,76,353,79,354,83,360,94,362,99,363,102,364,107,365,109,364,111,365,116,366,119,367,127,369,130,370,132,371,134,372,137,373,140,374,152,379,163,382,175,382);
} // End of Class
