// JavaLine 1 <== SourceLine 765
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:48 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CLASS_PARSER_grammer_declaration extends CLASS_PARSER_grammer_statement {
    // ClassDeclaration: Kind=9, BlockLevel=3, PrefixLevel=1, firstLine=765, lastLine=971, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 832
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_declaration_REUSE_1=new RTS_LABEL(this,1,1,"REUSE"); // Local Label #1=REUSE At PrefixLevel 1
    // JavaLine 13 <== SourceLine 841
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_declaration_S0_1=new RTS_LABEL(this,1,2,"S0"); // Local Label #2=S0 At PrefixLevel 1
    // JavaLine 15 <== SourceLine 862
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_declaration_Block843_PARSE_0=new RTS_LABEL(this,1,3,"PARSE"); // Local Label #3=PARSE At PrefixLevel 1
    // JavaLine 17 <== SourceLine 868
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_declaration_Block843_S1_0=new RTS_LABEL(this,1,4,"S1"); // Local Label #4=S1 At PrefixLevel 1
    // JavaLine 19 <== SourceLine 874
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_declaration_Block873_C1_0=new RTS_LABEL(this,1,5,"C1"); // Local Label #5=C1 At PrefixLevel 1
    // JavaLine 21 <== SourceLine 887
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_declaration_Block873_S2_0=new RTS_LABEL(this,1,6,"S2"); // Local Label #6=S2 At PrefixLevel 1
    // JavaLine 23 <== SourceLine 903
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_declaration_Block902_R1_0=new RTS_LABEL(this,1,7,"R1"); // Local Label #7=R1 At PrefixLevel 1
    // JavaLine 25 <== SourceLine 917
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_declaration_Block902_S3_0=new RTS_LABEL(this,1,8,"S3"); // Local Label #8=S3 At PrefixLevel 1
    // Declare locals as attributes
    // JavaLine 28 <== SourceLine 768
    public boolean innerseen_1=false;
    public boolean priorseen_1=false;
    public RTS_PRCQNT recover_0() { return(new RTS_PRCQNT(this,CLASS_PARSER_grammer_declaration_recover.class)); }
    // Normal Constructor
    public CLASS_PARSER_grammer_declaration(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    @Override
    public CLASS_PARSER_grammer_declaration _STM() {
        CLASS_PARSER_grammer_declaration _THIS=(CLASS_PARSER_grammer_declaration)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,8); // For ByteCode Engineering
                // JavaLine 45 <== SourceLine 712
                // BEGIN statement INNER PART
                // JavaLine 47 <== SourceLine 830
                detach(830);
                ;
                // JavaLine 50 <== SourceLine 831
                {
                    _SIM_LABEL(1); // DeclaredIn: declaration
                    // JavaLine 53 <== SourceLine 832
                    if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                        new CLASS_SCANNER_W0((_CUR._SL._SL),new RTS_TXT("declaration"));
                    }
                }
                ;
                // JavaLine 59 <== SourceLine 833
                if(_VALUE(((!(caller.isblocklike))||((caller.blockstatus==(((char)2))))))) {
                    // JavaLine 61 <== SourceLine 835
                    {
                        // JavaLine 63 <== SourceLine 836
                        new CLASS_PARSER_grammer_ParsErr((_CUR._SL),289);
                        ;
                        caller.blockstatus=((char)1);
                        ;
                    }
                }
                ;
                // JavaLine 71 <== SourceLine 837
                caller.stmttype=((char)3);
                ;
                // JavaLine 74 <== SourceLine 841
                {
                    _SIM_LABEL(2); // DeclaredIn: declaration
                    if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==(((char)12))))) {
                        {
                            // JavaLine 79 <== SourceLine 843
                            ((CLASS_PARSER_grammer)(_CUR._SL)).blockfound_1=(((CLASS_PARSER_grammer)(_CUR._SL)).blockfound_1+(1));
                            ;
                            // JavaLine 82 <== SourceLine 845
                            if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).readtype_1==(((char)0))))) {
                                {
                                    ((CLASS_PARSER)(_CUR._SL._SL)).opn=((char)14);
                                    ;
                                    call(((CLASS_PARSER)(_CUR._SL._SL)).coder,845);
                                }
                            }
                            ;
                            // JavaLine 91 <== SourceLine 846
                            ((CLASS_PARSER_grammer)(_CUR._SL)).readtype_1=((char)0);
                            ;
                            // JavaLine 94 <== SourceLine 847
                            ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                            ;
                            // JavaLine 97 <== SourceLine 848
                            if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=('Z')))) {
                                new CLASS_PARSER_grammer_declaration_declError((_CUR),185);
                            }
                            ;
                            // JavaLine 102 <== SourceLine 849
                            if(_VALUE((caller.stmtreq==(((char)2))))) {
                                new CLASS_PARSER_grammer_declaration_REGSEPCOMP((_CUR));
                            }
                            ;
                            // JavaLine 107 <== SourceLine 855
                            ((CLASS_PARSER)(_CUR._SL._SL)).opn='p';
                            ;
                            call(((CLASS_PARSER)(_CUR._SL._SL)).coder,855);
                            ;
                            // JavaLine 112 <== SourceLine 856
                            ((CLASS_PARSER_grammer)(_CUR._SL)).getopt=false;
                            ;
                            ((CLASS_PARSER_grammer)(_CUR._SL)).cs=((CLASS_PARSER)(_CUR._SL._SL)).opt;
                            ;
                            // JavaLine 117 <== SourceLine 857
                            if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('I'))!=(((char)0))))) {
                                new CLASS_PARSER_grammer_lookforstring((_CUR._SL));
                            }
                            ;
                            // JavaLine 122 <== SourceLine 858
                            new CLASS_PARSER_grammer_readprocpar((_CUR._SL),((char)137));
                            ;
                            // JavaLine 125 <== SourceLine 859
                            rp=((char)1);
                            ;
                            stmtreq=((char)5);
                            ;
                            // JavaLine 130 <== SourceLine 860
                            errorno=2;
                            ;
                            // JavaLine 133 <== SourceLine 862
                            {
                                _SIM_LABEL(3); // DeclaredIn: declaration -> declaration[CLASS_PARSER_grammer_declaration] DeclarationKind=Class
                                detach(862);
                            }
                            ;
                            // JavaLine 139 <== SourceLine 864
                            if(rp<((char)0) || rp>((char)3)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                            switch(rp) { // BEGIN SWITCH STATEMENT
                                case 0: 
                                // JavaLine 143 <== SourceLine 865
                                _GOTO(_LABEL_CLASS_PARSER_grammer_declaration_S0_1); // GOTO EVALUATED LABEL
                                break;
                                case 2: 
                                // JavaLine 147 <== SourceLine 866
                                _GOTO(_LABEL_CLASS_PARSER_grammer_declaration_Block873_S2_0); // GOTO EVALUATED LABEL
                                break;
                                case 3: 
                                // JavaLine 151 <== SourceLine 867
                                _GOTO(_LABEL_CLASS_PARSER_grammer_declaration_Block902_S3_0); // GOTO EVALUATED LABEL
                                break;
                            } // END SWITCH STATEMENT
                            ;
                            // JavaLine 156 <== SourceLine 868
                            {
                                _SIM_LABEL(4); // DeclaredIn: declaration -> declaration[CLASS_PARSER_grammer_declaration] DeclarationKind=Class
                                ((CLASS_PARSER_grammer)(_CUR._SL)).blockfound_1=(((CLASS_PARSER_grammer)(_CUR._SL)).blockfound_1-(1));
                            }
                            ;
                            ((CLASS_PARSER)(_CUR._SL._SL)).opn=((char)16);
                            ;
                            call(((CLASS_PARSER)(_CUR._SL._SL)).coder,868);
                            ;
                        }
                    } else {
                        // JavaLine 168 <== SourceLine 870
                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('Z')))) {
                            {
                                // JavaLine 171 <== SourceLine 871
                                ((CLASS_PARSER)(_CUR._SL._SL)).opn='k';
                                ;
                                _GOTO((((((CLASS_PARSER)(_CUR._SL._SL)).opt==(((char)30))))?(_LABEL_CLASS_PARSER_grammer_declaration_Block873_C1_0):(_LABEL_CLASS_PARSER_grammer_declaration_Block902_R1_0))); // GOTO EVALUATED LABEL
                            }
                        } else {
                            // JavaLine 177 <== SourceLine 872
                            if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==(((char)30))))) {
                                {
                                    // JavaLine 180 <== SourceLine 873
                                    ((CLASS_PARSER)(_CUR._SL._SL)).opn=((char)14);
                                    ;
                                    // JavaLine 183 <== SourceLine 874
                                    {
                                        _SIM_LABEL(5); // DeclaredIn: declaration -> declaration[CLASS_PARSER_grammer_declaration] DeclarationKind=Class
                                        call(((CLASS_PARSER)(_CUR._SL._SL)).coder,874);
                                    }
                                    ;
                                    // JavaLine 189 <== SourceLine 875
                                    ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                                    ;
                                    // JavaLine 192 <== SourceLine 877
                                    if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=('Z')))) {
                                        new CLASS_PARSER_grammer_declaration_declError((_CUR),185);
                                    }
                                    ;
                                    // JavaLine 197 <== SourceLine 878
                                    if(_VALUE((caller.stmtreq==(((char)2))))) {
                                        new CLASS_PARSER_grammer_declaration_REGSEPCOMP((_CUR));
                                    }
                                    ;
                                    // JavaLine 202 <== SourceLine 879
                                    ((CLASS_PARSER)(_CUR._SL._SL)).opn='n';
                                    ;
                                    call(((CLASS_PARSER)(_CUR._SL._SL)).coder,879);
                                    ;
                                    // JavaLine 207 <== SourceLine 880
                                    ((CLASS_PARSER_grammer)(_CUR._SL)).getopt=false;
                                    ;
                                    ((CLASS_PARSER_grammer)(_CUR._SL)).cs=((CLASS_PARSER)(_CUR._SL._SL)).opt;
                                    ;
                                    // JavaLine 212 <== SourceLine 881
                                    if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('I'))!=(((char)0))))) {
                                        new CLASS_PARSER_grammer_lookforstring((_CUR._SL));
                                    }
                                    ;
                                    // JavaLine 217 <== SourceLine 882
                                    new CLASS_PARSER_grammer_readclasspar((_CUR._SL));
                                    ;
                                    // JavaLine 220 <== SourceLine 883
                                    rp=((char)2);
                                    ;
                                    stmtreq=((char)3);
                                    ;
                                    // JavaLine 225 <== SourceLine 884
                                    stmttype=((char)4);
                                    ;
                                    // JavaLine 228 <== SourceLine 885
                                    errorno=2;
                                    ;
                                    // JavaLine 231 <== SourceLine 886
                                    _GOTO(_LABEL_CLASS_PARSER_grammer_declaration_Block843_PARSE_0); // GOTO EVALUATED LABEL
                                    ;
                                    // JavaLine 234 <== SourceLine 887
                                    {
                                        _SIM_LABEL(6); // DeclaredIn: declaration -> declaration[CLASS_PARSER_grammer_declaration] DeclarationKind=Class
                                        if(_VALUE(innerseen_1)) {
                                            {
                                                // JavaLine 239 <== SourceLine 888
                                                ((CLASS_PARSER)(_CUR._SL._SL)).opn=((char)16);
                                                ;
                                                ((CLASS_PARSER)(_CUR._SL._SL)).opdlo=((char)0);
                                                ;
                                            }
                                        } else {
                                            // JavaLine 246 <== SourceLine 890
                                            {
                                                // JavaLine 248 <== SourceLine 891
                                                if(_VALUE((blockstatus==(((char)1))))) {
                                                    // JavaLine 250 <== SourceLine 892
                                                    {
                                                        ((CLASS_PARSER)(_CUR._SL._SL)).opn='o';
                                                        ;
                                                        call(((CLASS_PARSER)(_CUR._SL._SL)).coder,892);
                                                    }
                                                }
                                                ;
                                                // JavaLine 258 <== SourceLine 893
                                                ((CLASS_PARSER)(_CUR._SL._SL)).opn='u';
                                                ;
                                                // JavaLine 261 <== SourceLine 894
                                                ((CLASS_PARSER)(_CUR._SL._SL)).opdlo=((((stmttype>=(((char)3)))||(priorseen_1)))?(((char)0)):(((char)1)));
                                                ;
                                            }
                                        }
                                    }
                                    ;
                                    // JavaLine 268 <== SourceLine 899
                                    call(((CLASS_PARSER)(_CUR._SL._SL)).coder,899);
                                    ;
                                }
                            } else {
                                // JavaLine 273 <== SourceLine 901
                                if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==(((char)31))))) {
                                    {
                                        // JavaLine 276 <== SourceLine 902
                                        ((CLASS_PARSER)(_CUR._SL._SL)).opn=((char)14);
                                        ;
                                        // JavaLine 279 <== SourceLine 903
                                        {
                                            _SIM_LABEL(7); // DeclaredIn: declaration -> declaration[CLASS_PARSER_grammer_declaration] DeclarationKind=Class
                                            call(((CLASS_PARSER)(_CUR._SL._SL)).coder,903);
                                        }
                                        ;
                                        // JavaLine 285 <== SourceLine 904
                                        ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                                        ;
                                        // JavaLine 288 <== SourceLine 906
                                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=('Z')))) {
                                            new CLASS_PARSER_grammer_declaration_declError((_CUR),185);
                                        }
                                        ;
                                        // JavaLine 293 <== SourceLine 907
                                        if(_VALUE((caller.stmtreq==(((char)2))))) {
                                            new CLASS_PARSER_grammer_declaration_REGSEPCOMP((_CUR));
                                        }
                                        ;
                                        // JavaLine 298 <== SourceLine 908
                                        ((CLASS_PARSER)(_CUR._SL._SL)).opn='*';
                                        ;
                                        call(((CLASS_PARSER)(_CUR._SL._SL)).coder,908);
                                        ;
                                        // JavaLine 303 <== SourceLine 909
                                        if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('I'))!=(((char)0))))) {
                                            new CLASS_PARSER_grammer_lookforstring((_CUR._SL));
                                        }
                                        ;
                                        // JavaLine 308 <== SourceLine 911
                                        if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL)).opt!=('O')))) {
                                            new CLASS_PARSER_grammer_declaration_declError((_CUR),286);
                                        }
                                        ;
                                        // JavaLine 313 <== SourceLine 912
                                        ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                                        ;
                                        // JavaLine 316 <== SourceLine 913
                                        rp=((char)3);
                                        ;
                                        stmtreq=((char)3);
                                        ;
                                        // JavaLine 321 <== SourceLine 914
                                        stmttype=((char)4);
                                        ;
                                        // JavaLine 324 <== SourceLine 915
                                        errorno=2;
                                        ;
                                        // JavaLine 327 <== SourceLine 916
                                        _GOTO(_LABEL_CLASS_PARSER_grammer_declaration_Block843_PARSE_0); // GOTO EVALUATED LABEL
                                        ;
                                        // JavaLine 330 <== SourceLine 917
                                        {
                                            _SIM_LABEL(8); // DeclaredIn: declaration -> declaration[CLASS_PARSER_grammer_declaration] DeclarationKind=Class
                                            if(_VALUE((blockstatus==(((char)1))))) {
                                                // JavaLine 334 <== SourceLine 918
                                                {
                                                    ((CLASS_PARSER)(_CUR._SL._SL)).opn='o';
                                                    ;
                                                    call(((CLASS_PARSER)(_CUR._SL._SL)).coder,918);
                                                }
                                            }
                                        }
                                        ;
                                        // JavaLine 343 <== SourceLine 919
                                        if(_VALUE((priorseen_1||((stmttype>=(((char)3))))))) {
                                            ;
                                        } else {
                                            // JavaLine 347 <== SourceLine 920
                                            new CLASS_PARSER_grammer_declaration_declError((_CUR),240);
                                        }
                                        ;
                                        // JavaLine 351 <== SourceLine 921
                                        ((CLASS_PARSER)(_CUR._SL._SL)).opn='5';
                                        ;
                                        // JavaLine 354 <== SourceLine 922
                                        call(((CLASS_PARSER)(_CUR._SL._SL)).coder,922);
                                        ;
                                    }
                                } else {
                                    // JavaLine 359 <== SourceLine 924
                                    if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==(((char)18))))) {
                                        {
                                            // JavaLine 362 <== SourceLine 925
                                            ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                                            ;
                                            // JavaLine 365 <== SourceLine 926
                                            if(_VALUE(((((CLASS_PARSER_grammer)(_CUR._SL)).cs==(((char)30)))||((((CLASS_PARSER_grammer)(_CUR._SL)).cs==(((char)31))))))) {
                                                {
                                                    // JavaLine 368 <== SourceLine 927
                                                    ((CLASS_PARSER)(_CUR._SL._SL)).opn=((char)14);
                                                    ;
                                                    call(((CLASS_PARSER)(_CUR._SL._SL)).coder,927);
                                                    ;
                                                    ((CLASS_PARSER)(_CUR._SL._SL)).opn=((CLASS_PARSER_grammer)(_CUR._SL)).cs;
                                                    ;
                                                    call(((CLASS_PARSER)(_CUR._SL._SL)).coder,927);
                                                    ;
                                                }
                                            } else {
                                                // JavaLine 379 <== SourceLine 929
                                                {
                                                    priorseen_1=true;
                                                    ;
                                                    // JavaLine 383 <== SourceLine 930
                                                    if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('Z')))) {
                                                        {
                                                            // JavaLine 386 <== SourceLine 931
                                                            if(_VALUE((caller.stmtreq==(((char)2))))) {
                                                                new CLASS_PARSER_grammer_ParsErr((_CUR._SL),222);
                                                            }
                                                            ;
                                                            // JavaLine 391 <== SourceLine 933
                                                            ((CLASS_PARSER)(_CUR._SL._SL)).opn=((char)132);
                                                            ;
                                                            call(((CLASS_PARSER)(_CUR._SL._SL)).coder,933);
                                                            ;
                                                            // JavaLine 396 <== SourceLine 934
                                                            ((CLASS_PARSER_grammer)(_CUR._SL)).getopt=false;
                                                            ;
                                                            ((CLASS_PARSER_grammer)(_CUR._SL)).cs=((CLASS_PARSER)(_CUR._SL._SL)).opt;
                                                            ;
                                                        }
                                                    }
                                                    ;
                                                    // JavaLine 404 <== SourceLine 936
                                                    new CLASS_PARSER_grammer_readtypespec((_CUR._SL));
                                                    ;
                                                    // JavaLine 407 <== SourceLine 937
                                                    if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).readtype_1==(((char)0))))) {
                                                        {
                                                            // JavaLine 410 <== SourceLine 938
                                                            ((CLASS_PARSER)(_CUR._SL._SL)).opn=((char)14);
                                                            ;
                                                            call(((CLASS_PARSER)(_CUR._SL._SL)).coder,938);
                                                        }
                                                    }
                                                    ;
                                                    // JavaLine 417 <== SourceLine 939
                                                    if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=(((char)12))))) {
                                                        new CLASS_PARSER_grammer_declaration_declError((_CUR),192);
                                                    }
                                                    ;
                                                    // JavaLine 422 <== SourceLine 940
                                                    ((CLASS_PARSER)(_CUR._SL._SL)).opn=((char)12);
                                                    ;
                                                    call(((CLASS_PARSER)(_CUR._SL._SL)).coder,940);
                                                    ;
                                                }
                                            }
                                            ;
                                            // JavaLine 430 <== SourceLine 942
                                            new CLASS_PARSER_grammer_declaration_externalItem((_CUR));
                                            ;
                                            // JavaLine 433 <== SourceLine 943
                                            if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==(((char)29))))) {
                                                {
                                                    // JavaLine 436 <== SourceLine 944
                                                    if(_VALUE((!(priorseen_1)))) {
                                                        new CLASS_PARSER_grammer_declaration_declError((_CUR),219);
                                                    }
                                                    ;
                                                    // JavaLine 441 <== SourceLine 945
                                                    if(_VALUE((!(new CLASS_PARSER_grammer_extbinding((_CUR._SL))._RESULT)))) {
                                                        {
                                                            // JavaLine 444 <== SourceLine 946
                                                            errorno=1;
                                                            ;
                                                            new CLASS_PARSER_grammer_syntaxerror((_CUR._SL),220);
                                                            ;
                                                            _GOTO(_LABEL_CLASS_PARSER_grammer_declaration_Block843_PARSE_0); // GOTO EVALUATED LABEL
                                                        }
                                                    }
                                                    ;
                                                }
                                            } else {
                                                // JavaLine 455 <== SourceLine 948
                                                while((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('N'))) {
                                                    new CLASS_PARSER_grammer_declaration_externalItem((_CUR));
                                                }
                                            }
                                            ;
                                        }
                                    } else {
                                        // JavaLine 463 <== SourceLine 950
                                        new CLASS_ERRMSG_internerr((_CUR._SL._SL),((char)4),950);
                                    }
                                }
                            }
                        }
                    }
                }
                ;
                // JavaLine 472 <== SourceLine 952
                if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs==('O')))) {
                    // JavaLine 474 <== SourceLine 953
                    ((CLASS_PARSER_grammer)(_CUR._SL)).detach();
                } else {
                    // JavaLine 477 <== SourceLine 954
                    if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL)).cs!=('X')))) {
                        new CLASS_PARSER_grammer_declaration_declError((_CUR),286);
                    }
                }
                ;
                // JavaLine 483 <== SourceLine 956
                if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                    new CLASS_SCANNER_W0((_CUR._SL._SL),new RTS_TXT("unstack declaration"));
                }
                ;
                // JavaLine 488 <== SourceLine 958
                caller.next=null;
                ;
                ((CLASS_PARSER_grammer)(_CUR._SL)).last_1=caller;
                ;
                // JavaLine 493 <== SourceLine 959
                ((CLASS_PARSER_grammer)(_CUR._SL)).deList_1=((CLASS_PARSER_grammer_statement)(_CUR));
                ;
                // JavaLine 496 <== SourceLine 961
                detach(961);
                ;
                // JavaLine 499 <== SourceLine 964
                ((CLASS_PARSER_grammer)(_CUR._SL)).deList_1=null;
                ;
                // JavaLine 502 <== SourceLine 965
                errorno=0;
                ;
                // JavaLine 505 <== SourceLine 966
                priorseen_1=innerseen_1=recovered=isblocklike=false;
                ;
                // JavaLine 508 <== SourceLine 968
                rp=blockstatus=stmtreq=stmttype=((char)0);
                ;
                // JavaLine 511 <== SourceLine 969
                _GOTO(_LABEL_CLASS_PARSER_grammer_declaration_REUSE_1); // GOTO EVALUATED LABEL
                ;
                // JavaLine 514 <== SourceLine 971
                // BEGIN declaration INNER PART
                // ENDOF declaration INNER PART
                // ENDOF statement INNER PART
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","9 declaration",1,765,11,832,13,841,15,862,17,868,19,874,21,887,23,903,25,917,28,768,45,712,47,830,50,831,53,832,59,833,61,835,63,836,71,837,74,841,79,843,82,845,91,846,94,847,97,848,102,849,107,855,112,856,117,857,122,858,125,859,130,860,133,862,139,864,143,865,147,866,151,867,156,868,168,870,171,871,177,872,180,873,183,874,189,875,192,877,197,878,202,879,207,880,212,881,217,882,220,883,225,884,228,885,231,886,234,887,239,888,246,890,248,891,250,892,258,893,261,894,268,899,273,901,276,902,279,903,285,904,288,906,293,907,298,908,303,909,308,911,313,912,316,913,321,914,324,915,327,916,330,917,334,918,343,919,347,920,351,921,354,922,359,924,362,925,365,926,368,927,379,929,383,930,386,931,391,933,396,934,404,936,407,937,410,938,417,939,422,940,430,942,433,943,436,944,441,945,444,946,455,948,463,950,472,952,474,953,477,954,483,956,488,958,493,959,496,961,499,964,502,965,505,966,508,968,511,969,514,971,527,971);
} // End of Class
