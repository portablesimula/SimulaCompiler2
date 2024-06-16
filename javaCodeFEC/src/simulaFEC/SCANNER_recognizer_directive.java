// JavaLine 1 <== SourceLine 638
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCANNER_recognizer_directive extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=638, lastLine=801, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 681
    final RTS_LABEL _LABEL_SCANNER_recognizer_directive_CompoundStatement685_SELPLUS_0=new RTS_LABEL(this,0,1,"SELPLUS"); // Local Label #1=SELPLUS At PrefixLevel 0
    // JavaLine 12 <== SourceLine 687
    final RTS_LABEL _LABEL_SCANNER_recognizer_directive_CompoundStatement697_SELMINUS_0=new RTS_LABEL(this,0,2,"SELMINUS"); // Local Label #2=SELMINUS At PrefixLevel 0
    // JavaLine 14 <== SourceLine 692
    final RTS_LABEL _LABEL_SCANNER_recognizer_directive_CompoundStatement697_CompoundStatement695_CompoundStatement694_SELECTED_0=new RTS_LABEL(this,0,3,"SELECTED"); // Local Label #3=SELECTED At PrefixLevel 0
    // JavaLine 16 <== SourceLine 709
    final RTS_LABEL _LABEL_SCANNER_recognizer_directive_CompoundStatement715_PG_0=new RTS_LABEL(this,0,4,"PG"); // Local Label #4=PG At PrefixLevel 0
    // JavaLine 18 <== SourceLine 760
    final RTS_LABEL _LABEL_SCANNER_recognizer_directive_CompoundStatement771_CompoundStatement760_LOADD_0=new RTS_LABEL(this,0,5,"LOADD"); // Local Label #5=LOADD At PrefixLevel 0
    // JavaLine 20 <== SourceLine 767
    final RTS_LABEL _LABEL_SCANNER_recognizer_directive_CompoundStatement771_ENDP_0=new RTS_LABEL(this,0,6,"ENDP"); // Local Label #6=ENDP At PrefixLevel 0
    // JavaLine 22 <== SourceLine 798
    final RTS_LABEL _LABEL_SCANNER_recognizer_directive_CompoundStatement798_DIRWARN_0=new RTS_LABEL(this,0,7,"DIRWARN"); // Local Label #7=DIRWARN At PrefixLevel 0
    // JavaLine 24 <== SourceLine 799
    final RTS_LABEL _LABEL_SCANNER_recognizer_directive_SKIPLINE_0=new RTS_LABEL(this,0,8,"SKIPLINE"); // Local Label #8=SKIPLINE At PrefixLevel 0
    // JavaLine 26 <== SourceLine 801
    final RTS_LABEL _LABEL_SCANNER_recognizer_directive_EXIT_0=new RTS_LABEL(this,0,9,"EXIT"); // Local Label #9=EXIT At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 29 <== SourceLine 639
    public char d=0;
    public int i=0;
    public RTS_TXT t=null;
    public RTS_TXT u=null;
    // JavaLine 34 <== SourceLine 640
    public int cswa=0;
    public int cswb=0;
    public int startpos=0;
    // JavaLine 38 <== SourceLine 709
    public RTS_Printfile _inspect_709_4472=null;
    // Normal Constructor
    public SCANNER_recognizer_directive(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCANNER_recognizer_directive _STM() {
        SCANNER_recognizer_directive _THIS=(SCANNER_recognizer_directive)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,9); // For ByteCode Engineering
                // JavaLine 55 <== SourceLine 675
                startpos=((SCANNER_recognizer)(_CUR._SL)).linepos_1;
                ;
                // JavaLine 58 <== SourceLine 676
                new SCANNER_recognizer_directive_nextChar((_CUR));
                ;
                // JavaLine 61 <== SourceLine 677
                if(_VALUE(((((SCANNER_recognizer)(_CUR._SL)).atom_1==(((char)32)))||((((SCANNER_recognizer)(_CUR._SL)).atom_1==(((char)7))))))) {
                    _GOTO(_LABEL_SCANNER_recognizer_directive_SKIPLINE_0); // GOTO EVALUATED LABEL
                }
                ;
                // JavaLine 66 <== SourceLine 679
                if(_VALUE((((SCANNER_recognizer)(_CUR._SL)).atom_1==('+')))) {
                    {
                        // JavaLine 69 <== SourceLine 681
                        {
                            _SIM_LABEL(1); // DeclaredIn: directive -> directive[externalIdent=SCANNER_recognizer_directive] Kind=5, QUAL=ProcedureDeclaration, HashCode=60055669
                            while(((((SCANNER_recognizer)(_CUR._SL)).atom_1==('+'))||(((SCANNER)(_CUR._SL._SL)).selector.getELEMENT(RTS_ENVIRONMENT.isorank(((SCANNER_recognizer)(_CUR._SL)).atom_1))))) {
                                // JavaLine 73 <== SourceLine 682
                                new SCANNER_recognizer_directive_nextChar((_CUR));
                            }
                        }
                        ;
                        // JavaLine 78 <== SourceLine 683
                        if(_VALUE((((SCANNER_recognizer)(_CUR._SL)).atom_1==(((char)32))))) {
                            _GOTO(_LABEL_SCANNER_recognizer_directive_CompoundStatement697_CompoundStatement695_CompoundStatement694_SELECTED_0); // GOTO EVALUATED LABEL
                        }
                        ;
                        // JavaLine 83 <== SourceLine 684
                        if(_VALUE((((SCANNER_recognizer)(_CUR._SL)).atom_1!=('-')))) {
                            _GOTO(_LABEL_SCANNER_recognizer_directive_SKIPLINE_0); // GOTO EVALUATED LABEL
                        }
                        ;
                    }
                }
                ;
                // JavaLine 91 <== SourceLine 686
                if(_VALUE((((SCANNER_recognizer)(_CUR._SL)).atom_1==('-')))) {
                    {
                        // JavaLine 94 <== SourceLine 687
                        {
                            _SIM_LABEL(2); // DeclaredIn: directive -> directive[externalIdent=SCANNER_recognizer_directive] Kind=5, QUAL=ProcedureDeclaration, HashCode=60055669
                            while(((((SCANNER_recognizer)(_CUR._SL)).atom_1==('-'))||((!(((SCANNER)(_CUR._SL._SL)).selector.getELEMENT(RTS_ENVIRONMENT.rank(((SCANNER_recognizer)(_CUR._SL)).atom_1))))))) {
                                {
                                    // JavaLine 99 <== SourceLine 688
                                    new SCANNER_recognizer_directive_nextChar((_CUR));
                                    ;
                                    // JavaLine 102 <== SourceLine 689
                                    if(_VALUE((((SCANNER_recognizer)(_CUR._SL)).atom_1==('+')))) {
                                        _GOTO(_LABEL_SCANNER_recognizer_directive_CompoundStatement685_SELPLUS_0); // GOTO EVALUATED LABEL
                                    }
                                    ;
                                    // JavaLine 107 <== SourceLine 690
                                    if(_VALUE((((SCANNER_recognizer)(_CUR._SL)).atom_1==(((char)32))))) {
                                        {
                                            // JavaLine 110 <== SourceLine 691
                                            {
                                                _SIM_LABEL(3); // DeclaredIn: directive -> directive[externalIdent=SCANNER_recognizer_directive] Kind=5, QUAL=ProcedureDeclaration, HashCode=60055669
                                                // JavaLine 113 <== SourceLine 692
                                                if(_VALUE((((SCANNER_recognizer)(_CUR._SL)).linepos_1>=(((SCANNER_recognizer)(_CUR._SL)).linelength_1)))) {
                                                    _GOTO(_LABEL_SCANNER_recognizer_directive_SKIPLINE_0); // GOTO EVALUATED LABEL
                                                }
                                            }
                                            ;
                                            // JavaLine 119 <== SourceLine 693
                                            new SCANNER_recognizer_directive_nextChar((_CUR));
                                            ;
                                            _GOTO(_LABEL_SCANNER_recognizer_directive_EXIT_0); // GOTO EVALUATED LABEL
                                            ;
                                        }
                                    }
                                    ;
                                }
                            }
                        }
                        ;
                        // JavaLine 131 <== SourceLine 696
                        _GOTO(_LABEL_SCANNER_recognizer_directive_SKIPLINE_0); // GOTO EVALUATED LABEL
                        ;
                    }
                }
                ;
                // JavaLine 137 <== SourceLine 699
                ((SCANNER_recognizer)(_CUR._SL)).linepos_1=startpos;
                ;
                u=new SCANNER_recognizer_directive_linefield((_CUR))._RESULT;
                ;
                RTS_ENVIRONMENT.lowcase(u);
                ;
                // JavaLine 144 <== SourceLine 701
                if(_VALUE(_TXTREL_EQ(u,new RTS_TXT("title")))) {
                    {
                        // JavaLine 147 <== SourceLine 702
                        ((SCANNER_recognizer)(_CUR._SL)).curtitle_1=(((((SCANNER_recognizer)(_CUR._SL)).linelength_1<=((startpos+(8)))))?(null):(RTS_ENVIRONMENT.copy(copy(RTS_TXT.sub(((SCANNER_recognizer)(_CUR._SL)).line_1,(startpos+(7)),(((SCANNER_recognizer)(_CUR._SL)).linelength_1-(8)))))));
                        ;
                        // JavaLine 150 <== SourceLine 704
                        ((SCANNER_recognizer)(_CUR._SL)).curtitle_1=CONC(CONC(new RTS_TXT("S-port 108.1"),new RTS_TXT(" ")),((SCANNER_recognizer)(_CUR._SL)).curtitle_1);
                        ;
                        // JavaLine 153 <== SourceLine 705
                        _GOTO(_LABEL_SCANNER_recognizer_directive_CompoundStatement715_PG_0); // GOTO EVALUATED LABEL
                        ;
                    }
                }
                ;
                // JavaLine 159 <== SourceLine 708
                if(_VALUE(_TXTREL_EQ(u,new RTS_TXT("page")))) {
                    {
                        // JavaLine 162 <== SourceLine 709
                        {
                            _SIM_LABEL(4); // DeclaredIn: directive -> directive[externalIdent=SCANNER_recognizer_directive] Kind=5, QUAL=ProcedureDeclaration, HashCode=60055669
                            if(_VALUE(((SCANNER)(_CUR._SL._SL)).listingon)) {
                                {
                                    // BEGIN INSPECTION 
                                    _inspect_709_4472=((SCANNER)(_CUR._SL._SL)).listfile;
                                    if(_inspect_709_4472!=null) { // INSPECT _inspect_709_4472
                                        // JavaLine 170 <== SourceLine 710
                                        {
                                            // JavaLine 172 <== SourceLine 709
                                            {
                                                // JavaLine 174 <== SourceLine 710
                                                _inspect_709_4472.eject(1);
                                                ;
                                                _inspect_709_4472.outtext(((SCANNER_recognizer)(_CUR._SL)).curtitle_1);
                                                ;
                                                // JavaLine 179 <== SourceLine 711
                                                _inspect_709_4472.setpos((((SCANNER)(_CUR._SL._SL)).listlength-(5)));
                                                ;
                                                _inspect_709_4472.outint(_inspect_709_4472.page(),5);
                                                ;
                                                // JavaLine 184 <== SourceLine 712
                                                _inspect_709_4472.outimage();
                                                ;
                                                _inspect_709_4472.outimage();
                                                ;
                                            }
                                        }
                                    }
                                } // END INSPECTION
                            }
                        }
                        ;
                    }
                } else {
                    // JavaLine 198 <== SourceLine 715
                    if(_VALUE((_TXTREL_EQ(u,new RTS_TXT("copy"))|(_TXTREL_EQ(u,new RTS_TXT("insert")))))) {
                        {
                            // JavaLine 201 <== SourceLine 716
                            t=new SCANNER_recognizer_directive_linefield((_CUR))._RESULT;
                            ;
                            if(_VALUE(TRF_EQ(t,null))) {
                                _GOTO(_LABEL_SCANNER_recognizer_directive_CompoundStatement798_DIRWARN_0); // GOTO EVALUATED LABEL
                            }
                            ;
                            // JavaLine 208 <== SourceLine 717
                            new SCANNER_SourceElt((_CUR._SL._SL),_TXTREL_EQ(u,new RTS_TXT("insert")),t)._START();
                            ;
                            _GOTO(_LABEL_SCANNER_recognizer_directive_EXIT_0); // GOTO EVALUATED LABEL
                            ;
                        }
                    } else {
                        // JavaLine 215 <== SourceLine 719
                        if(_VALUE(_TXTREL_EQ(u,new RTS_TXT("eof")))) {
                            {
                                // JavaLine 218 <== SourceLine 720
                                ((SCANNER)(_CUR._SL._SL)).cursource_2.close_0().CPF();
                                ;
                                if(_VALUE((((SCANNER)(_CUR._SL._SL)).cursource_2==(null)))) {
                                    ((SCANNER_recognizer)(_CUR._SL)).detach(720);
                                }
                                ;
                                // JavaLine 225 <== SourceLine 721
                                _GOTO(_LABEL_SCANNER_recognizer_directive_EXIT_0); // GOTO EVALUATED LABEL
                                ;
                            }
                        } else {
                            // JavaLine 230 <== SourceLine 723
                            if(_VALUE(_TXTREL_EQ(u,new RTS_TXT("definition")))) {
                                {
                                    // JavaLine 233 <== SourceLine 724
                                    ((SCANNER)(_CUR._SL._SL)).recomp=false;
                                    ;
                                    ((SCANNER)(_CUR._SL._SL)).definition=true;
                                }
                            } else {
                                // JavaLine 239 <== SourceLine 725
                                if(_VALUE(_TXTREL_EQ(u,new RTS_TXT("implementation")))) {
                                    {
                                        // JavaLine 242 <== SourceLine 726
                                        ((SCANNER)(_CUR._SL._SL)).recomp=true;
                                        ;
                                        ((SCANNER)(_CUR._SL._SL)).definition=false;
                                    }
                                } else {
                                    // JavaLine 248 <== SourceLine 729
                                    if(_VALUE(_TXTREL_EQ(u,new RTS_TXT("list")))) {
                                        {
                                            // JavaLine 251 <== SourceLine 730
                                            if(_VALUE(new SCANNER_recognizer_directive_onoff((_CUR))._RESULT)) {
                                                ((SCANNER)(_CUR._SL._SL)).listingon=(((SCANNER)(_CUR._SL._SL)).listfile!=(null));
                                            } else {
                                                // JavaLine 255 <== SourceLine 731
                                                ((SCANNER)(_CUR._SL._SL)).listingon=false;
                                            }
                                            ;
                                        }
                                    } else {
                                        // JavaLine 261 <== SourceLine 733
                                        if(_VALUE(_TXTREL_EQ(u,new RTS_TXT("nodummy")))) {
                                            ((SCANNER)(_CUR._SL._SL)).dummygen_2=(!(new SCANNER_recognizer_directive_onoff((_CUR))._RESULT));
                                        } else {
                                            // JavaLine 265 <== SourceLine 734
                                            if(_VALUE(_TXTREL_EQ(u,new RTS_TXT("slength")))) {
                                                {
                                                    // JavaLine 268 <== SourceLine 735
                                                    i=new SCANNER_recognizer_directive_bytefield((_CUR))._RESULT;
                                                    ;
                                                    ((SCANNER)(_CUR._SL._SL)).signiflength=i;
                                                    ;
                                                }
                                            } else {
                                                // JavaLine 275 <== SourceLine 737
                                                if(_VALUE(_TXTREL_EQ(u,new RTS_TXT("select")))) {
                                                    {
                                                        // JavaLine 278 <== SourceLine 738
                                                        i=0;
                                                        ;
                                                        t=new SCANNER_recognizer_directive_linefield((_CUR))._RESULT;
                                                        ;
                                                        // JavaLine 283 <== SourceLine 739
                                                        if(_VALUE(_TXTREL_EQ(t,new RTS_TXT("+")))) {
                                                            {
                                                                i=1;
                                                                ;
                                                                t=new SCANNER_recognizer_directive_linefield((_CUR))._RESULT;
                                                            }
                                                        } else {
                                                            // JavaLine 291 <== SourceLine 740
                                                            if(_VALUE(_TXTREL_EQ(t,new RTS_TXT("-")))) {
                                                                {
                                                                    i=2;
                                                                    ;
                                                                    t=new SCANNER_recognizer_directive_linefield((_CUR))._RESULT;
                                                                }
                                                            }
                                                        }
                                                        ;
                                                        // JavaLine 301 <== SourceLine 741
                                                        new SCANNER_SetSelectors((_CUR._SL._SL),t,i);
                                                        ;
                                                    }
                                                } else {
                                                    // JavaLine 306 <== SourceLine 743
                                                    if(_VALUE(_TXTREL_EQ(u,new RTS_TXT("record")))) {
                                                        ((SCANNER)(_CUR._SL._SL)).Simuletta=new SCANNER_recognizer_directive_onoff((_CUR))._RESULT;
                                                    } else {
                                                        // JavaLine 310 <== SourceLine 758
                                                        if(_VALUE(_TXTREL_EQ(u,new RTS_TXT("setopt")))) {
                                                            {
                                                                // JavaLine 313 <== SourceLine 759
                                                                ((SCANNER)(_CUR._SL._SL)).simsymbol=RTS_ENVIRONMENT.blanks(96);
                                                                ;
                                                                d=((char)32);
                                                                ;
                                                                // JavaLine 318 <== SourceLine 760
                                                                while((d==(((char)32)))) {
                                                                    {
                                                                        new SCANNER_recognizer_directive_nextChar((_CUR));
                                                                        ;
                                                                        {
                                                                            _SIM_LABEL(5); // DeclaredIn: directive -> directive[externalIdent=SCANNER_recognizer_directive] Kind=5, QUAL=ProcedureDeclaration, HashCode=60055669
                                                                            d=((SCANNER_recognizer)(_CUR._SL)).atom_1;
                                                                        }
                                                                    }
                                                                }
                                                                ;
                                                                // JavaLine 330 <== SourceLine 761
                                                                if(_VALUE(((d==('+'))|((d==('-')))))) {
                                                                    {
                                                                        while(true) {
                                                                            {
                                                                                // JavaLine 335 <== SourceLine 762
                                                                                new SCANNER_recognizer_directive_nextChar((_CUR));
                                                                                ;
                                                                                // JavaLine 338 <== SourceLine 763
                                                                                if(_VALUE(((((SCANNER_recognizer)(_CUR._SL)).atom_1==('+'))|((((SCANNER_recognizer)(_CUR._SL)).atom_1==('-')))))) {
                                                                                    _GOTO(_LABEL_SCANNER_recognizer_directive_CompoundStatement771_CompoundStatement760_LOADD_0); // GOTO EVALUATED LABEL
                                                                                }
                                                                                ;
                                                                                // JavaLine 343 <== SourceLine 764
                                                                                if(_VALUE(((((SCANNER_recognizer)(_CUR._SL)).atom_1==(((char)7)))||((((SCANNER_recognizer)(_CUR._SL)).atom_1==(((char)32))))))) {
                                                                                    _GOTO(_LABEL_SCANNER_recognizer_directive_CompoundStatement771_ENDP_0); // GOTO EVALUATED LABEL
                                                                                }
                                                                                ;
                                                                                // JavaLine 348 <== SourceLine 765
                                                                                new COMMON_setopt((_CUR._SL._SL),((SCANNER_recognizer)(_CUR._SL)).atom_1,(((d==('+')))?('1'):(((char)0))));
                                                                                ;
                                                                            }
                                                                            if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
                                                                        }
                                                                    }
                                                                }
                                                                ;
                                                                // JavaLine 357 <== SourceLine 767
                                                                {
                                                                    _SIM_LABEL(6); // DeclaredIn: directive -> directive[externalIdent=SCANNER_recognizer_directive] Kind=5, QUAL=ProcedureDeclaration, HashCode=60055669
                                                                    for(i=0;i<=95;i++) {
                                                                        // JavaLine 361 <== SourceLine 768
                                                                        RTS_TXT.putchar(((SCANNER)(_CUR._SL._SL)).simsymbol,((SCANNER)(_CUR._SL._SL)).option.getELEMENT(i));
                                                                    }
                                                                }
                                                                ;
                                                                new COMMON_DEFCONST((_CUR._SL._SL));
                                                                ;
                                                                // JavaLine 368 <== SourceLine 769
                                                                ((SCANNER)(_CUR._SL._SL)).opdhi=((SCANNER)(_CUR._SL._SL)).hashhi;
                                                                ;
                                                                ((SCANNER)(_CUR._SL._SL)).opdlo=((SCANNER)(_CUR._SL._SL)).hashlo;
                                                                ;
                                                                ((SCANNER)(_CUR._SL._SL)).opn=((char)142);
                                                                ;
                                                                call(((SCANNER)(_CUR._SL._SL)).P1coder_2,769);
                                                                ;
                                                            }
                                                        } else {
                                                            // JavaLine 379 <== SourceLine 771
                                                            {
                                                                // JavaLine 381 <== SourceLine 772
                                                                if(_VALUE((((((_TXTREL_EQ(u,new RTS_TXT("boundcheck"))|(_TXTREL_EQ(u,new RTS_TXT("nonecheck"))))|(_TXTREL_EQ(u,new RTS_TXT("implnone"))))|(_TXTREL_EQ(u,new RTS_TXT("quacheck"))))|(_TXTREL_EQ(u,new RTS_TXT("reuse"))))|(_TXTREL_EQ(u,new RTS_TXT("sport")))))) {
                                                                    // JavaLine 383 <== SourceLine 775
                                                                    {
                                                                        // JavaLine 385 <== SourceLine 776
                                                                        if(_VALUE(new SCANNER_recognizer_directive_onoff((_CUR))._RESULT)) {
                                                                            cswb=1;
                                                                        } else {
                                                                            cswb=0;
                                                                        }
                                                                        ;
                                                                        // JavaLine 392 <== SourceLine 777
                                                                        if(_VALUE(_TXTREL_EQ(u,new RTS_TXT("sport")))) {
                                                                            ((SCANNER)(_CUR._SL._SL)).SportOK=(cswb==(1));
                                                                        }
                                                                        ;
                                                                        // JavaLine 397 <== SourceLine 778
                                                                        cswa=((_TXTREL_EQ(u,new RTS_TXT("boundcheck")))?(256):(((_TXTREL_EQ(u,new RTS_TXT("nonecheck")))?(257):(((_TXTREL_EQ(u,new RTS_TXT("quacheck")))?(258):(((_TXTREL_EQ(u,new RTS_TXT("reuse")))?(259):(((_TXTREL_EQ(u,new RTS_TXT("implnone")))?(260):(261))))))))));
                                                                        ;
                                                                    }
                                                                } else {
                                                                    // JavaLine 402 <== SourceLine 785
                                                                    if(_VALUE(_TXTREL_EQ(u,new RTS_TXT("setswitch")))) {
                                                                        {
                                                                            // JavaLine 405 <== SourceLine 786
                                                                            cswa=new SCANNER_recognizer_directive_bytefield((_CUR))._RESULT;
                                                                            ;
                                                                            cswb=new SCANNER_recognizer_directive_bytefield((_CUR))._RESULT;
                                                                        }
                                                                    } else {
                                                                        // JavaLine 411 <== SourceLine 788
                                                                        {
                                                                            // JavaLine 413 <== SourceLine 789
                                                                            cswa=987;
                                                                            ;
                                                                            // JavaLine 416 <== SourceLine 790
                                                                            ((SCANNER)(_CUR._SL._SL)).simsymbol=RTS_TXT.sub(((SCANNER_recognizer)(_CUR._SL)).line_1,startpos,((((SCANNER_recognizer)(_CUR._SL)).linelength_1-(startpos))+(1)));
                                                                            ;
                                                                            // JavaLine 419 <== SourceLine 791
                                                                            new COMMON_DEFCONST((_CUR._SL._SL));
                                                                            ;
                                                                            // JavaLine 422 <== SourceLine 792
                                                                            cswb=((RTS_ENVIRONMENT.rank(((SCANNER)(_CUR._SL._SL)).hashhi)*(256))+(RTS_ENVIRONMENT.rank(((SCANNER)(_CUR._SL._SL)).hashlo)));
                                                                            ;
                                                                        }
                                                                    }
                                                                }
                                                                ;
                                                                // JavaLine 429 <== SourceLine 794
                                                                ((SCANNER)(_CUR._SL._SL)).P1coder_2.cswa_4=cswa;
                                                                ;
                                                                // JavaLine 432 <== SourceLine 795
                                                                ((SCANNER)(_CUR._SL._SL)).P1coder_2.cswb_4=cswb;
                                                                ;
                                                                ((SCANNER)(_CUR._SL._SL)).opn=((char)141);
                                                                ;
                                                                call(((SCANNER)(_CUR._SL._SL)).P1coder_2,795);
                                                                ;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                ;
                // JavaLine 452 <== SourceLine 797
                if(_VALUE(false)) {
                    {
                        // JavaLine 455 <== SourceLine 798
                        {
                            _SIM_LABEL(7); // DeclaredIn: directive -> directive[externalIdent=SCANNER_recognizer_directive] Kind=5, QUAL=ProcedureDeclaration, HashCode=60055669
                            if(_VALUE(((SCANNER)(_CUR._SL._SL)).GiveNotes)) {
                                new SCANNER_P1warn((_CUR._SL._SL),278);
                            }
                        }
                    }
                }
                ;
                // JavaLine 465 <== SourceLine 799
                {
                    _SIM_LABEL(8); // DeclaredIn: directive
                    ((SCANNER_recognizer)(_CUR._SL)).atom_1=((char)7);
                }
                ;
                // JavaLine 471 <== SourceLine 800
                {
                    _SIM_LABEL(9); // DeclaredIn: directive
                    ;
                }
                break _LOOP;
            }
            catch(RTS_LABEL q) {
                RTS_RTObject._TREAT_GOTO_CATCH_BLOCK(_THIS, q);
                _JTX=q.index; continue _LOOP; // EG. GOTO Lx
            }
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCANNER.sim","5 directive",1,638,10,681,12,687,14,692,16,709,18,760,20,767,22,798,24,799,26,801,29,639,34,640,38,709,55,675,58,676,61,677,66,679,69,681,73,682,78,683,83,684,91,686,94,687,99,688,102,689,107,690,110,691,113,692,119,693,131,696,137,699,144,701,147,702,150,704,153,705,159,708,162,709,170,710,172,709,174,710,179,711,184,712,198,715,201,716,208,717,215,719,218,720,225,721,230,723,233,724,239,725,242,726,248,729,251,730,255,731,261,733,265,734,268,735,275,737,278,738,283,739,291,740,301,741,306,743,310,758,313,759,318,760,330,761,335,762,338,763,343,764,348,765,357,767,361,768,368,769,379,771,381,772,383,775,385,776,392,777,397,778,402,785,405,786,411,788,413,789,416,790,419,791,422,792,429,794,432,795,452,797,455,798,465,799,471,800,485,801);
} // End of Procedure
