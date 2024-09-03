// JavaLine 1 <== SourceLine 1482
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:51 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_CHECKER1_semchecker1_simpleIdent extends CLASS_CHECKER1_semchecker1_identifier {
    // ClassDeclaration: Kind=9, BlockLevel=3, PrefixLevel=2, firstLine=1482, lastLine=1554, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare locals as attributes
    public RTS_PRCQNT sameAs_0() { return(new RTS_PRCQNT(this,CLASS_CHECKER1_semchecker1_simpleIdent_sameAs.class)); }
    // Normal Constructor
    public CLASS_CHECKER1_semchecker1_simpleIdent(RTS_RTObject staticLink,CLASS_CHECKER1_semchecker1_exp sp_pred,char sp_ch) {
        super(staticLink,sp_pred,sp_ch);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_CHECKER1_semchecker1_simpleIdent _STM() {
        // JavaLine 21 <== SourceLine 169
        // BEGIN exp INNER PART
        // JavaLine 23 <== SourceLine 1480
        // BEGIN identifier INNER PART
        // JavaLine 25 <== SourceLine 1491
        ctype='Z';
        ;
        // JavaLine 28 <== SourceLine 1492
        while(true) {
            {
                // JavaLine 31 <== SourceLine 1494
                ((CLASS_CHECKER1_semchecker1)(_CUR._SL)).exptop_2=((CLASS_CHECKER1_semchecker1_identifier)(_CUR));
                ;
                // JavaLine 34 <== SourceLine 1495
                meaning=new CLASS_BUILDER1_meaningof((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1)(_CUR._SL)).opdSymb_2)._RESULT;
                ;
                // JavaLine 37 <== SourceLine 1497
                if(_VALUE((meaning==(null)))) {
                    {
                        // JavaLine 40 <== SourceLine 1498
                        meaning=new CLASS_ERRMSG_newnotseen((_CUR._SL._SL),((CLASS_CHECKER1_semchecker1)(_CUR._SL)).opdSymb_2)._RESULT;
                        ;
                        // JavaLine 43 <== SourceLine 1499
                        type=((char)15);
                        ;
                        ;
                        kind=((char)10);
                        ;
                        // JavaLine 49 <== SourceLine 1501
                        new CLASS_ERRMSG_error1id((_CUR._SL._SL),337,((CLASS_CHECKER1_semchecker1)(_CUR._SL)).opdSymb_2);
                        ;
                        meaning.dim_1=2;
                        ;
                        // JavaLine 54 <== SourceLine 1502
                        qual=null;
                        ;
                        issimple=0;
                        ;
                    }
                } else {
                    // JavaLine 61 <== SourceLine 1504
                    {
                        // JavaLine 63 <== SourceLine 1505
                        type=meaning.type_1;
                        ;
                        kind=meaning.kind_1;
                        ;
                        // JavaLine 68 <== SourceLine 1506
                        qual=(((type==(((char)8))))?(((CLASS_CHECKER1_semchecker1)(_CUR._SL)).textclass_2):(meaning.prefqual_1));
                        ;
                        // JavaLine 71 <== SourceLine 1510
                        issimple=1;
                        ;
                        // JavaLine 74 <== SourceLine 1511
                        if(meaning.categ_1<((char)0) || meaning.categ_1>((char)7)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                        switch(meaning.categ_1) { // BEGIN SWITCH STATEMENT
                            case 3: 
                            case 4: 
                            // JavaLine 79 <== SourceLine 1513
                            if(_VALUE((meaning.special_1>(((char)1))))) {
                                // JavaLine 81 <== SourceLine 1516
                                new CLASS_CHECKER1_semchecker1_identifier_NamedConstant((_CUR));
                            } else {
                                // JavaLine 84 <== SourceLine 1517
                                if(_VALUE(((CLASS_CHECKER1_semchecker1)(_CUR._SL)).inarraybound_2)) {
                                    {
                                        // JavaLine 87 <== SourceLine 1518
                                        if(_VALUE((meaning.encl_1.rtblev==(((CLASS_CHECKER1)(_CUR._SL._SL)).cblev_6)))) {
                                            // JavaLine 89 <== SourceLine 1519
                                            new CLASS_ERRMSG_errQT((_CUR._SL._SL),meaning,316);
                                        }
                                    }
                                }
                            }
                            break;
                            case 2: 
                            // JavaLine 97 <== SourceLine 1521
                            issimple=0;
                            break;
                            case 6: 
                            // JavaLine 101 <== SourceLine 1523
                            if(_VALUE(((CLASS_CHECKER1_semchecker1)(_CUR._SL)).inarraybound_2)) {
                                new CLASS_ERRMSG_errQT((_CUR._SL._SL),meaning,312);
                            }
                            break;
                        } // END SWITCH STATEMENT
                        ;
                    }
                }
                ;
                // JavaLine 111 <== SourceLine 1538
                if(kind<((char)0) || kind>((char)13)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                switch(kind) { // BEGIN SWITCH STATEMENT
                    case 0: 
                    case 3: 
                    // JavaLine 116 <== SourceLine 1540
                    if(_VALUE((p_ch==(((char)129))))) {
                        new CLASS_CHECKER1_semchecker1_identifier_identError((_CUR),357);
                    }
                    break;
                    case 5: 
                    // JavaLine 122 <== SourceLine 1542
                    if(_VALUE((((CLASS_CHECKER1_semchecker1)(_CUR._SL)).opttop_2!=(0)))) {
                        {
                            // JavaLine 125 <== SourceLine 1543
                            new CLASS_CHECKER1_semchecker1_identifier_identError((_CUR),334);
                            ;
                            type=((char)7);
                            ;
                            qual=meaning;
                            ;
                            // JavaLine 132 <== SourceLine 1544
                            p_ch='"';
                            ;
                        }
                    }
                    break;
                } // END SWITCH STATEMENT
                ;
                // JavaLine 140 <== SourceLine 1549
                detach(1549);
                ;
                // JavaLine 143 <== SourceLine 1551
                ((CLASS_CHECKER1_semchecker1)(_CUR._SL)).simpleList_2=null;
                ;
                cl=((char)0);
                ;
                p_pred=((CLASS_CHECKER1_semchecker1)(_CUR._SL)).exptop_2;
                ;
            }
            if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
        }
        ;
        // JavaLine 154 <== SourceLine 1554
        // BEGIN simpleIdent INNER PART
        // ENDOF simpleIdent INNER PART
        // ENDOF identifier INNER PART
        // ENDOF exp INNER PART
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER1.sim","9 simpleIdent",1,1482,21,169,23,1480,25,1491,28,1492,31,1494,34,1495,37,1497,40,1498,43,1499,49,1501,54,1502,61,1504,63,1505,68,1506,71,1510,74,1511,79,1513,81,1516,84,1517,87,1518,89,1519,97,1521,101,1523,111,1538,116,1540,122,1542,125,1543,132,1544,140,1549,143,1551,154,1554,161,1554);
} // End of Class
