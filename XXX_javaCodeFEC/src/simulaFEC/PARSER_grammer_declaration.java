// JavaLine 1 <== SourceLine 764
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class PARSER_grammer_declaration extends PARSER_grammer_statement {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=1, firstLine=764, lastLine=970, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 831
    final RTS_LABEL _LABEL_PARSER_grammer_declaration_REUSE_1=new RTS_LABEL(this,1,1,"REUSE"); // Local Label #1=REUSE At PrefixLevel 1
    // JavaLine 13 <== SourceLine 840
    final RTS_LABEL _LABEL_PARSER_grammer_declaration_S0_1=new RTS_LABEL(this,1,2,"S0"); // Local Label #2=S0 At PrefixLevel 1
    // JavaLine 15 <== SourceLine 861
    final RTS_LABEL _LABEL_PARSER_grammer_declaration_Block842_PARSE_0=new RTS_LABEL(this,1,3,"PARSE"); // Local Label #3=PARSE At PrefixLevel 1
    // JavaLine 17 <== SourceLine 867
    final RTS_LABEL _LABEL_PARSER_grammer_declaration_Block842_S1_0=new RTS_LABEL(this,1,4,"S1"); // Local Label #4=S1 At PrefixLevel 1
    // JavaLine 19 <== SourceLine 873
    final RTS_LABEL _LABEL_PARSER_grammer_declaration_Block872_C1_0=new RTS_LABEL(this,1,5,"C1"); // Local Label #5=C1 At PrefixLevel 1
    // JavaLine 21 <== SourceLine 886
    final RTS_LABEL _LABEL_PARSER_grammer_declaration_Block872_S2_0=new RTS_LABEL(this,1,6,"S2"); // Local Label #6=S2 At PrefixLevel 1
    // JavaLine 23 <== SourceLine 902
    final RTS_LABEL _LABEL_PARSER_grammer_declaration_Block901_R1_0=new RTS_LABEL(this,1,7,"R1"); // Local Label #7=R1 At PrefixLevel 1
    // JavaLine 25 <== SourceLine 916
    final RTS_LABEL _LABEL_PARSER_grammer_declaration_Block901_S3_0=new RTS_LABEL(this,1,8,"S3"); // Local Label #8=S3 At PrefixLevel 1
    // Declare locals as attributes
    // JavaLine 28 <== SourceLine 767
    public boolean innerseen_1=false;
    public boolean priorseen_1=false;
    public RTS_PRCQNT recover_0() { return(new RTS_PRCQNT(this,PARSER_grammer_declaration_recover.class)); }
    // Normal Constructor
    public PARSER_grammer_declaration(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public PARSER_grammer_declaration _STM() {
        PARSER_grammer_declaration _THIS=(PARSER_grammer_declaration)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,8); // For ByteCode Engineering
                // JavaLine 45 <== SourceLine 711
                // BEGIN INNER PART
                // JavaLine 47 <== SourceLine 829
                detach(829);
                ;
                // JavaLine 50 <== SourceLine 830
                {
                    _SIM_LABEL(1); // DeclaredIn: declaration
                    // JavaLine 53 <== SourceLine 831
                    if(_VALUE((((PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                        new SCANNER_W0((_CUR._SL._SL),new RTS_TXT("declaration"));
                    }
                }
                ;
                // JavaLine 59 <== SourceLine 832
                if(_VALUE(((!(caller.isblocklike))||((caller.blockstatus==(((char)2))))))) {
                    // JavaLine 61 <== SourceLine 834
                    {
                        // JavaLine 63 <== SourceLine 835
                        new PARSER_grammer_ParsErr((_CUR._SL),289);
                        ;
                        caller.blockstatus=((char)1);
                        ;
                    }
                }
                ;
                // JavaLine 71 <== SourceLine 836
                caller.stmttype=((char)3);
                ;
                // JavaLine 74 <== SourceLine 840
                {
                    _SIM_LABEL(2); // DeclaredIn: declaration
                    if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==(((char)12))))) {
                        {
                            // JavaLine 79 <== SourceLine 842
                            ((PARSER_grammer)(_CUR._SL)).blockfound_1=(((PARSER_grammer)(_CUR._SL)).blockfound_1+(1));
                            ;
                            // JavaLine 82 <== SourceLine 844
                            if(_VALUE((((PARSER_grammer)(_CUR._SL)).readtype_1==(((char)0))))) {
                                {
                                    ((PARSER)(_CUR._SL._SL)).opn=((char)14);
                                    ;
                                    call(((PARSER)(_CUR._SL._SL)).coder,844);
                                }
                            }
                            ;
                            // JavaLine 91 <== SourceLine 845
                            ((PARSER_grammer)(_CUR._SL)).readtype_1=((char)0);
                            ;
                            // JavaLine 94 <== SourceLine 846
                            ((PARSER_grammer)(_CUR._SL)).detach();
                            ;
                            // JavaLine 97 <== SourceLine 847
                            if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs!=('Z')))) {
                                new PARSER_grammer_declaration_declError((_CUR),185);
                            }
                            ;
                            // JavaLine 102 <== SourceLine 848
                            if(_VALUE((caller.stmtreq==(((char)2))))) {
                                new PARSER_grammer_declaration_REGSEPCOMP((_CUR));
                            }
                            ;
                            // JavaLine 107 <== SourceLine 854
                            ((PARSER)(_CUR._SL._SL)).opn='p';
                            ;
                            call(((PARSER)(_CUR._SL._SL)).coder,854);
                            ;
                            // JavaLine 112 <== SourceLine 855
                            ((PARSER_grammer)(_CUR._SL)).getopt=false;
                            ;
                            ((PARSER_grammer)(_CUR._SL)).cs=((PARSER)(_CUR._SL._SL)).opt;
                            ;
                            // JavaLine 117 <== SourceLine 856
                            if(_VALUE((((PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('I'))!=(((char)0))))) {
                                new PARSER_grammer_lookforstring((_CUR._SL));
                            }
                            ;
                            // JavaLine 122 <== SourceLine 857
                            new PARSER_grammer_readprocpar((_CUR._SL),((char)137));
                            ;
                            // JavaLine 125 <== SourceLine 858
                            rp=((char)1);
                            ;
                            stmtreq=((char)5);
                            ;
                            // JavaLine 130 <== SourceLine 859
                            errorno=2;
                            ;
                            // JavaLine 133 <== SourceLine 861
                            {
                                _SIM_LABEL(3); // DeclaredIn: declaration -> declaration[PARSER_grammer_declaration] DeclarationKind=Class
                                detach(861);
                            }
                            ;
                            // JavaLine 139 <== SourceLine 863
                            if(rp<((char)0) || rp>((char)3)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                            switch(rp) { // BEGIN SWITCH STATEMENT
                                case 0: 
                                // JavaLine 143 <== SourceLine 864
                                _GOTO(_LABEL_PARSER_grammer_declaration_S0_1); // GOTO EVALUATED LABEL
                                break;
                                case 2: 
                                // JavaLine 147 <== SourceLine 865
                                _GOTO(_LABEL_PARSER_grammer_declaration_Block872_S2_0); // GOTO EVALUATED LABEL
                                break;
                                case 3: 
                                // JavaLine 151 <== SourceLine 866
                                _GOTO(_LABEL_PARSER_grammer_declaration_Block901_S3_0); // GOTO EVALUATED LABEL
                                break;
                            } // END SWITCH STATEMENT
                            ;
                            // JavaLine 156 <== SourceLine 867
                            {
                                _SIM_LABEL(4); // DeclaredIn: declaration -> declaration[PARSER_grammer_declaration] DeclarationKind=Class
                                ((PARSER_grammer)(_CUR._SL)).blockfound_1=(((PARSER_grammer)(_CUR._SL)).blockfound_1-(1));
                            }
                            ;
                            ((PARSER)(_CUR._SL._SL)).opn=((char)16);
                            ;
                            call(((PARSER)(_CUR._SL._SL)).coder,867);
                            ;
                        }
                    } else {
                        // JavaLine 168 <== SourceLine 869
                        if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==('Z')))) {
                            {
                                // JavaLine 171 <== SourceLine 870
                                ((PARSER)(_CUR._SL._SL)).opn='k';
                                ;
                                _GOTO((((((PARSER)(_CUR._SL._SL)).opt==(((char)30))))?(_LABEL_PARSER_grammer_declaration_Block872_C1_0):(_LABEL_PARSER_grammer_declaration_Block901_R1_0))); // GOTO EVALUATED LABEL
                            }
                        } else {
                            // JavaLine 177 <== SourceLine 871
                            if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==(((char)30))))) {
                                {
                                    // JavaLine 180 <== SourceLine 872
                                    ((PARSER)(_CUR._SL._SL)).opn=((char)14);
                                    ;
                                    // JavaLine 183 <== SourceLine 873
                                    {
                                        _SIM_LABEL(5); // DeclaredIn: declaration -> declaration[PARSER_grammer_declaration] DeclarationKind=Class
                                        call(((PARSER)(_CUR._SL._SL)).coder,873);
                                    }
                                    ;
                                    // JavaLine 189 <== SourceLine 874
                                    ((PARSER_grammer)(_CUR._SL)).detach();
                                    ;
                                    // JavaLine 192 <== SourceLine 876
                                    if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs!=('Z')))) {
                                        new PARSER_grammer_declaration_declError((_CUR),185);
                                    }
                                    ;
                                    // JavaLine 197 <== SourceLine 877
                                    if(_VALUE((caller.stmtreq==(((char)2))))) {
                                        new PARSER_grammer_declaration_REGSEPCOMP((_CUR));
                                    }
                                    ;
                                    // JavaLine 202 <== SourceLine 878
                                    ((PARSER)(_CUR._SL._SL)).opn='n';
                                    ;
                                    call(((PARSER)(_CUR._SL._SL)).coder,878);
                                    ;
                                    // JavaLine 207 <== SourceLine 879
                                    ((PARSER_grammer)(_CUR._SL)).getopt=false;
                                    ;
                                    ((PARSER_grammer)(_CUR._SL)).cs=((PARSER)(_CUR._SL._SL)).opt;
                                    ;
                                    // JavaLine 212 <== SourceLine 880
                                    if(_VALUE((((PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('I'))!=(((char)0))))) {
                                        new PARSER_grammer_lookforstring((_CUR._SL));
                                    }
                                    ;
                                    // JavaLine 217 <== SourceLine 881
                                    new PARSER_grammer_readclasspar((_CUR._SL));
                                    ;
                                    // JavaLine 220 <== SourceLine 882
                                    rp=((char)2);
                                    ;
                                    stmtreq=((char)3);
                                    ;
                                    // JavaLine 225 <== SourceLine 883
                                    stmttype=((char)4);
                                    ;
                                    // JavaLine 228 <== SourceLine 884
                                    errorno=2;
                                    ;
                                    // JavaLine 231 <== SourceLine 885
                                    _GOTO(_LABEL_PARSER_grammer_declaration_Block842_PARSE_0); // GOTO EVALUATED LABEL
                                    ;
                                    // JavaLine 234 <== SourceLine 886
                                    {
                                        _SIM_LABEL(6); // DeclaredIn: declaration -> declaration[PARSER_grammer_declaration] DeclarationKind=Class
                                        if(_VALUE(innerseen_1)) {
                                            {
                                                // JavaLine 239 <== SourceLine 887
                                                ((PARSER)(_CUR._SL._SL)).opn=((char)16);
                                                ;
                                                ((PARSER)(_CUR._SL._SL)).opdlo=((char)0);
                                                ;
                                            }
                                        } else {
                                            // JavaLine 246 <== SourceLine 889
                                            {
                                                // JavaLine 248 <== SourceLine 890
                                                if(_VALUE((blockstatus==(((char)1))))) {
                                                    // JavaLine 250 <== SourceLine 891
                                                    {
                                                        ((PARSER)(_CUR._SL._SL)).opn='o';
                                                        ;
                                                        call(((PARSER)(_CUR._SL._SL)).coder,891);
                                                    }
                                                }
                                                ;
                                                // JavaLine 258 <== SourceLine 892
                                                ((PARSER)(_CUR._SL._SL)).opn='u';
                                                ;
                                                // JavaLine 261 <== SourceLine 893
                                                ((PARSER)(_CUR._SL._SL)).opdlo=((((stmttype>=(((char)3)))||(priorseen_1)))?(((char)0)):(((char)1)));
                                                ;
                                            }
                                        }
                                    }
                                    ;
                                    // JavaLine 268 <== SourceLine 898
                                    call(((PARSER)(_CUR._SL._SL)).coder,898);
                                    ;
                                }
                            } else {
                                // JavaLine 273 <== SourceLine 900
                                if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==(((char)31))))) {
                                    {
                                        // JavaLine 276 <== SourceLine 901
                                        ((PARSER)(_CUR._SL._SL)).opn=((char)14);
                                        ;
                                        // JavaLine 279 <== SourceLine 902
                                        {
                                            _SIM_LABEL(7); // DeclaredIn: declaration -> declaration[PARSER_grammer_declaration] DeclarationKind=Class
                                            call(((PARSER)(_CUR._SL._SL)).coder,902);
                                        }
                                        ;
                                        // JavaLine 285 <== SourceLine 903
                                        ((PARSER_grammer)(_CUR._SL)).detach();
                                        ;
                                        // JavaLine 288 <== SourceLine 905
                                        if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs!=('Z')))) {
                                            new PARSER_grammer_declaration_declError((_CUR),185);
                                        }
                                        ;
                                        // JavaLine 293 <== SourceLine 906
                                        if(_VALUE((caller.stmtreq==(((char)2))))) {
                                            new PARSER_grammer_declaration_REGSEPCOMP((_CUR));
                                        }
                                        ;
                                        // JavaLine 298 <== SourceLine 907
                                        ((PARSER)(_CUR._SL._SL)).opn='*';
                                        ;
                                        call(((PARSER)(_CUR._SL._SL)).coder,907);
                                        ;
                                        // JavaLine 303 <== SourceLine 908
                                        if(_VALUE((((PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('I'))!=(((char)0))))) {
                                            new PARSER_grammer_lookforstring((_CUR._SL));
                                        }
                                        ;
                                        // JavaLine 308 <== SourceLine 910
                                        if(_VALUE((((PARSER)(_CUR._SL._SL)).opt!=('O')))) {
                                            new PARSER_grammer_declaration_declError((_CUR),286);
                                        }
                                        ;
                                        // JavaLine 313 <== SourceLine 911
                                        ((PARSER_grammer)(_CUR._SL)).detach();
                                        ;
                                        // JavaLine 316 <== SourceLine 912
                                        rp=((char)3);
                                        ;
                                        stmtreq=((char)3);
                                        ;
                                        // JavaLine 321 <== SourceLine 913
                                        stmttype=((char)4);
                                        ;
                                        // JavaLine 324 <== SourceLine 914
                                        errorno=2;
                                        ;
                                        // JavaLine 327 <== SourceLine 915
                                        _GOTO(_LABEL_PARSER_grammer_declaration_Block842_PARSE_0); // GOTO EVALUATED LABEL
                                        ;
                                        // JavaLine 330 <== SourceLine 916
                                        {
                                            _SIM_LABEL(8); // DeclaredIn: declaration -> declaration[PARSER_grammer_declaration] DeclarationKind=Class
                                            if(_VALUE((blockstatus==(((char)1))))) {
                                                // JavaLine 334 <== SourceLine 917
                                                {
                                                    ((PARSER)(_CUR._SL._SL)).opn='o';
                                                    ;
                                                    call(((PARSER)(_CUR._SL._SL)).coder,917);
                                                }
                                            }
                                        }
                                        ;
                                        // JavaLine 343 <== SourceLine 918
                                        if(_VALUE((priorseen_1||((stmttype>=(((char)3))))))) {
                                            ;
                                        } else {
                                            // JavaLine 347 <== SourceLine 919
                                            new PARSER_grammer_declaration_declError((_CUR),240);
                                        }
                                        ;
                                        // JavaLine 351 <== SourceLine 920
                                        ((PARSER)(_CUR._SL._SL)).opn='5';
                                        ;
                                        // JavaLine 354 <== SourceLine 921
                                        call(((PARSER)(_CUR._SL._SL)).coder,921);
                                        ;
                                    }
                                } else {
                                    // JavaLine 359 <== SourceLine 923
                                    if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==(((char)18))))) {
                                        {
                                            // JavaLine 362 <== SourceLine 924
                                            ((PARSER_grammer)(_CUR._SL)).detach();
                                            ;
                                            // JavaLine 365 <== SourceLine 925
                                            if(_VALUE(((((PARSER_grammer)(_CUR._SL)).cs==(((char)30)))||((((PARSER_grammer)(_CUR._SL)).cs==(((char)31))))))) {
                                                {
                                                    // JavaLine 368 <== SourceLine 926
                                                    ((PARSER)(_CUR._SL._SL)).opn=((char)14);
                                                    ;
                                                    call(((PARSER)(_CUR._SL._SL)).coder,926);
                                                    ;
                                                    ((PARSER)(_CUR._SL._SL)).opn=((PARSER_grammer)(_CUR._SL)).cs;
                                                    ;
                                                    call(((PARSER)(_CUR._SL._SL)).coder,926);
                                                    ;
                                                }
                                            } else {
                                                // JavaLine 379 <== SourceLine 928
                                                {
                                                    priorseen_1=true;
                                                    ;
                                                    // JavaLine 383 <== SourceLine 929
                                                    if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==('Z')))) {
                                                        {
                                                            // JavaLine 386 <== SourceLine 930
                                                            if(_VALUE((caller.stmtreq==(((char)2))))) {
                                                                new PARSER_grammer_ParsErr((_CUR._SL),222);
                                                            }
                                                            ;
                                                            // JavaLine 391 <== SourceLine 932
                                                            ((PARSER)(_CUR._SL._SL)).opn=((char)132);
                                                            ;
                                                            call(((PARSER)(_CUR._SL._SL)).coder,932);
                                                            ;
                                                            // JavaLine 396 <== SourceLine 933
                                                            ((PARSER_grammer)(_CUR._SL)).getopt=false;
                                                            ;
                                                            ((PARSER_grammer)(_CUR._SL)).cs=((PARSER)(_CUR._SL._SL)).opt;
                                                            ;
                                                        }
                                                    }
                                                    ;
                                                    // JavaLine 404 <== SourceLine 935
                                                    new PARSER_grammer_readtypespec((_CUR._SL));
                                                    ;
                                                    // JavaLine 407 <== SourceLine 936
                                                    if(_VALUE((((PARSER_grammer)(_CUR._SL)).readtype_1==(((char)0))))) {
                                                        {
                                                            // JavaLine 410 <== SourceLine 937
                                                            ((PARSER)(_CUR._SL._SL)).opn=((char)14);
                                                            ;
                                                            call(((PARSER)(_CUR._SL._SL)).coder,937);
                                                        }
                                                    }
                                                    ;
                                                    // JavaLine 417 <== SourceLine 938
                                                    if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs!=(((char)12))))) {
                                                        new PARSER_grammer_declaration_declError((_CUR),192);
                                                    }
                                                    ;
                                                    // JavaLine 422 <== SourceLine 939
                                                    ((PARSER)(_CUR._SL._SL)).opn=((char)12);
                                                    ;
                                                    call(((PARSER)(_CUR._SL._SL)).coder,939);
                                                    ;
                                                }
                                            }
                                            ;
                                            // JavaLine 430 <== SourceLine 941
                                            new PARSER_grammer_declaration_externalItem((_CUR));
                                            ;
                                            // JavaLine 433 <== SourceLine 942
                                            if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==(((char)29))))) {
                                                {
                                                    // JavaLine 436 <== SourceLine 943
                                                    if(_VALUE((!(priorseen_1)))) {
                                                        new PARSER_grammer_declaration_declError((_CUR),219);
                                                    }
                                                    ;
                                                    // JavaLine 441 <== SourceLine 944
                                                    if(_VALUE((!(new PARSER_grammer_extbinding((_CUR._SL))._RESULT)))) {
                                                        {
                                                            // JavaLine 444 <== SourceLine 945
                                                            errorno=1;
                                                            ;
                                                            new PARSER_grammer_syntaxerror((_CUR._SL),220);
                                                            ;
                                                            _GOTO(_LABEL_PARSER_grammer_declaration_Block842_PARSE_0); // GOTO EVALUATED LABEL
                                                        }
                                                    }
                                                    ;
                                                }
                                            } else {
                                                // JavaLine 455 <== SourceLine 947
                                                while((((PARSER_grammer)(_CUR._SL)).cs==('N'))) {
                                                    new PARSER_grammer_declaration_externalItem((_CUR));
                                                }
                                            }
                                            ;
                                        }
                                    } else {
                                        // JavaLine 463 <== SourceLine 949
                                        new ERRMSG_internerr((_CUR._SL._SL),((char)4),949);
                                    }
                                }
                            }
                        }
                    }
                }
                ;
                // JavaLine 472 <== SourceLine 951
                if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs==('O')))) {
                    // JavaLine 474 <== SourceLine 952
                    ((PARSER_grammer)(_CUR._SL)).detach();
                } else {
                    // JavaLine 477 <== SourceLine 953
                    if(_VALUE((((PARSER_grammer)(_CUR._SL)).cs!=('X')))) {
                        new PARSER_grammer_declaration_declError((_CUR),286);
                    }
                }
                ;
                // JavaLine 483 <== SourceLine 955
                if(_VALUE((((PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                    new SCANNER_W0((_CUR._SL._SL),new RTS_TXT("unstack declaration"));
                }
                ;
                // JavaLine 488 <== SourceLine 957
                caller.next=null;
                ;
                ((PARSER_grammer)(_CUR._SL)).last_1=caller;
                ;
                // JavaLine 493 <== SourceLine 958
                ((PARSER_grammer)(_CUR._SL)).deList_1=((PARSER_grammer_statement)(_CUR));
                ;
                // JavaLine 496 <== SourceLine 960
                detach(960);
                ;
                // JavaLine 499 <== SourceLine 963
                ((PARSER_grammer)(_CUR._SL)).deList_1=null;
                ;
                // JavaLine 502 <== SourceLine 964
                errorno=0;
                ;
                // JavaLine 505 <== SourceLine 965
                priorseen_1=innerseen_1=recovered=isblocklike=false;
                ;
                // JavaLine 508 <== SourceLine 967
                rp=blockstatus=stmtreq=stmttype=((char)0);
                ;
                // JavaLine 511 <== SourceLine 968
                _GOTO(_LABEL_PARSER_grammer_declaration_REUSE_1); // GOTO EVALUATED LABEL
                ;
                // JavaLine 514 <== SourceLine 970
                // BEGIN INNER PART
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","8 declaration",1,764,11,831,13,840,15,861,17,867,19,873,21,886,23,902,25,916,28,767,45,711,47,829,50,830,53,831,59,832,61,834,63,835,71,836,74,840,79,842,82,844,91,845,94,846,97,847,102,848,107,854,112,855,117,856,122,857,125,858,130,859,133,861,139,863,143,864,147,865,151,866,156,867,168,869,171,870,177,871,180,872,183,873,189,874,192,876,197,877,202,878,207,879,212,880,217,881,220,882,225,883,228,884,231,885,234,886,239,887,246,889,248,890,250,891,258,892,261,893,268,898,273,900,276,901,279,902,285,903,288,905,293,906,298,907,303,908,308,910,313,911,316,912,321,913,324,914,327,915,330,916,334,917,343,918,347,919,351,920,354,921,359,923,362,924,365,925,368,926,379,928,383,929,386,930,391,932,396,933,404,935,407,936,410,937,417,938,422,939,430,941,433,942,436,943,441,944,444,945,455,947,463,949,472,951,474,952,477,953,483,955,488,957,493,958,496,960,499,963,502,964,505,965,508,967,511,968,514,970,527,970);
} // End of Class
