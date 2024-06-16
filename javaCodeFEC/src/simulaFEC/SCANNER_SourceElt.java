// JavaLine 1 <== SourceLine 393
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class SCANNER_SourceElt extends SCANNER_input {
    // ClassDeclaration: Kind=8, BlockLevel=2, PrefixLevel=1, firstLine=393, lastLine=460, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    public RTS_TXT p1_fname;
    // Declare local labels
    // JavaLine 12 <== SourceLine 425
    final RTS_LABEL _LABEL_SCANNER_SourceElt_CompoundStatement459_NEXTIMAGE_0=new RTS_LABEL(this,1,1,"NEXTIMAGE"); // Local Label #1=NEXTIMAGE At PrefixLevel 1
    // JavaLine 14 <== SourceLine 427
    final RTS_LABEL _LABEL_SCANNER_SourceElt_CompoundStatement459_CompoundStatement439_INRL_0=new RTS_LABEL(this,1,2,"INRL"); // Local Label #2=INRL At PrefixLevel 1
    // JavaLine 16 <== SourceLine 458
    final RTS_LABEL _LABEL_SCANNER_SourceElt_CompoundStatement459_EXIT_0=new RTS_LABEL(this,1,3,"EXIT"); // Local Label #3=EXIT At PrefixLevel 1
    // Declare locals as attributes
    // JavaLine 19 <== SourceLine 396
    public RTS_Infile sf_1=null;
    // JavaLine 21 <== SourceLine 397
    public RTS_TXT newim_1=null;
    // JavaLine 23 <== SourceLine 398
    public SCANNER_input inpt_1=null;
    // JavaLine 25 <== SourceLine 405
    public SCANNER_recognizer _inspect_405_4469_1=null;
    // JavaLine 27 <== SourceLine 449
    public RTS_Printfile _inspect_449_4470_1=null;
    public RTS_PRCQNT close_0() { return(new RTS_PRCQNT(this,SCANNER_SourceElt_close.class)); }
    // Normal Constructor
    public SCANNER_SourceElt(RTS_RTObject staticLink,boolean sp_inserted,RTS_TXT sp1_fname) {
        super(staticLink,sp_inserted);
        // Parameter assignment to locals
        this.p1_fname = sp1_fname;
        // Declaration Code
    }
    // Class Statements
    @Override
    public SCANNER_SourceElt _STM() {
        SCANNER_SourceElt _THIS=(SCANNER_SourceElt)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,3); // For ByteCode Engineering
                // JavaLine 44 <== SourceLine 390
                // BEGIN INNER PART
                // JavaLine 46 <== SourceLine 405
                {
                    // BEGIN INSPECTION 
                    _inspect_405_4469_1=((SCANNER)(_CUR._SL)).lexScanner_2;
                    if(_inspect_405_4469_1!=null) { // INSPECT _inspect_405_4469_1
                        // JavaLine 51 <== SourceLine 406
                        {
                            // JavaLine 53 <== SourceLine 405
                            {
                                // JavaLine 55 <== SourceLine 407
                                _inspect_405_4469_1.atom_1=((char)7);
                                ;
                                _inspect_405_4469_1.linepos_1=_inspect_405_4469_1.linelength_1;
                            }
                        }
                    }
                } // END INSPECTION
                ;
                // JavaLine 64 <== SourceLine 408
                new SCANNER_input_saveScannerState((_CUR));
                ;
                // JavaLine 67 <== SourceLine 409
                ((SCANNER)(_CUR._SL)).lexScanner_2.line_1=((SCANNER)(_CUR._SL)).line=RTS_ENVIRONMENT.blanks(81);
                ;
                // JavaLine 70 <== SourceLine 410
                if(_VALUE(_TXTREL_NE(RTS_ENVIRONMENT.lowcase(RTS_ENVIRONMENT.copy(copy(p1_fname))),new RTS_TXT("sysin")))) {
                    {
                        // JavaLine 73 <== SourceLine 411
                        inpt_1=prev;
                        ;
                        // JavaLine 76 <== SourceLine 412
                        while((inpt_1!=(null))) {
                            {
                                // JavaLine 79 <== SourceLine 413
                                if(_VALUE((_IS(inpt_1,SCANNER_SourceElt.class)&&(_TXTREL_EQ(((SCANNER_SourceElt)(inpt_1)).p1_fname,p1_fname))))) {
                                    // JavaLine 81 <== SourceLine 415
                                    {
                                        ((SCANNER)(_CUR._SL)).diag.putELEMENT(((SCANNER)(_CUR._SL)).diag.index(0),p1_fname);
                                        ;
                                        new ERRMSG_fatal0((_CUR._SL),237);
                                    }
                                }
                                ;
                                // JavaLine 89 <== SourceLine 416
                                inpt_1=inpt_1.prev;
                                ;
                            }
                        }
                        ;
                        // JavaLine 95 <== SourceLine 418
                        sf_1=new RTS_Infile(_CTX,p1_fname)._STM();
                        ;
                        sf_1.image=RTS_TXT.sub(((SCANNER)(_CUR._SL)).line,1,80);
                        ;
                        // JavaLine 100 <== SourceLine 419
                        if(_VALUE((!(sf_1.open(sf_1.image))))) {
                            new ERRMSG_openerror((_CUR._SL),p1_fname);
                        }
                        ;
                    }
                } else {
                    // JavaLine 107 <== SourceLine 420
                    {
                        // JavaLine 109 <== SourceLine 421
                        sf_1=RTS_BASICIO.sysin();
                        ;
                        sf_1.image=RTS_TXT.sub(((SCANNER)(_CUR._SL)).line,1,80);
                        ;
                    }
                }
                ;
                // JavaLine 117 <== SourceLine 423
                while(true) {
                    {
                        // JavaLine 120 <== SourceLine 424
                        detach(424);
                        ;
                        // JavaLine 123 <== SourceLine 425
                        {
                            _SIM_LABEL(1); // DeclaredIn: SourceElt -> SourceElt[SCANNER_SourceElt] DeclarationKind=Class
                            if(_VALUE(sf_1.inrecord())) {
                                {
                                    // JavaLine 128 <== SourceLine 427
                                    {
                                        _SIM_LABEL(2); // DeclaredIn: SourceElt -> SourceElt[SCANNER_SourceElt] DeclarationKind=Class
                                        newim_1=CONC(newim_1,sf_1.image);
                                    }
                                    ;
                                    sf_1.image=RTS_ENVIRONMENT.blanks(10);
                                    ;
                                    // JavaLine 136 <== SourceLine 428
                                    if(_VALUE(sf_1.inrecord())) {
                                        _GOTO(_LABEL_SCANNER_SourceElt_CompoundStatement459_CompoundStatement439_INRL_0); // GOTO EVALUATED LABEL
                                    }
                                    ;
                                    // JavaLine 141 <== SourceLine 429
                                    t=RTS_ENVIRONMENT.blanks(1);
                                    ;
                                    t=CONC(RTS_TXT.sub(sf_1.image,1,(RTS_TXT.pos(sf_1.image)-(1))),t);
                                    ;
                                    // JavaLine 146 <== SourceLine 430
                                    ((SCANNER)(_CUR._SL)).lexScanner_2.line_1=CONC(newim_1,t);
                                    ;
                                    newim_1=null;
                                    ;
                                    // JavaLine 151 <== SourceLine 431
                                    ((SCANNER)(_CUR._SL)).line=((SCANNER)(_CUR._SL)).lexScanner_2.line_1;
                                    ;
                                    // JavaLine 154 <== SourceLine 432
                                    if(_VALUE((RTS_TXT.length(((SCANNER)(_CUR._SL)).line)>(256)))) {
                                        {
                                            // JavaLine 157 <== SourceLine 433
                                            linlen=255;
                                            ;
                                            new SCANNER_P1warn((_CUR._SL),277);
                                            ;
                                            // JavaLine 162 <== SourceLine 434
                                            ((SCANNER)(_CUR._SL)).lexScanner_2.line_1=((SCANNER)(_CUR._SL)).line=RTS_TXT.sub(((SCANNER)(_CUR._SL)).line,1,256);
                                            ;
                                        }
                                    } else {
                                        // JavaLine 167 <== SourceLine 436
                                        linlen=(RTS_TXT.length(((SCANNER)(_CUR._SL)).line)-(1));
                                    }
                                    ;
                                    // JavaLine 171 <== SourceLine 437
                                    sf_1.image=RTS_TXT.sub(((SCANNER)(_CUR._SL)).line,1,linlen);
                                    ;
                                }
                            } else {
                                // JavaLine 176 <== SourceLine 439
                                {
                                    // JavaLine 178 <== SourceLine 440
                                    if(_VALUE(sf_1.endfile())) {
                                        {
                                            // JavaLine 181 <== SourceLine 441
                                            ((SCANNER)(_CUR._SL)).line=((SCANNER)(_CUR._SL)).lexScanner_2.line_1=new RTS_TXT("%eof\u0007");
                                            ;
                                            linlen=4;
                                            ;
                                            // JavaLine 186 <== SourceLine 443
                                            _GOTO(_LABEL_SCANNER_SourceElt_CompoundStatement459_EXIT_0); // GOTO EVALUATED LABEL
                                            ;
                                        }
                                    }
                                    ;
                                    // JavaLine 192 <== SourceLine 445
                                    linlen=(RTS_TXT.pos(sf_1.image)-(1));
                                    ;
                                }
                            }
                        }
                        ;
                        // JavaLine 199 <== SourceLine 448
                        if(_VALUE(((SCANNER)(_CUR._SL)).incrlnr_2)) {
                            ((SCANNER)(_CUR._SL)).linenr=(((SCANNER)(_CUR._SL)).linenr+(1));
                        }
                        ;
                        // JavaLine 204 <== SourceLine 449
                        if(_VALUE(((SCANNER)(_CUR._SL)).listingon)) {
                            {
                                // BEGIN INSPECTION 
                                _inspect_449_4470_1=((SCANNER)(_CUR._SL)).listfile;
                                if(_inspect_449_4470_1!=null) { // INSPECT _inspect_449_4470_1
                                    // JavaLine 210 <== SourceLine 450
                                    {
                                        // JavaLine 212 <== SourceLine 449
                                        {
                                            // JavaLine 214 <== SourceLine 450
                                            _inspect_449_4470_1.outint(((SCANNER)(_CUR._SL)).linenr,6);
                                            ;
                                            _inspect_449_4470_1.outtext(new RTS_TXT(": "));
                                            ;
                                            // JavaLine 219 <== SourceLine 451
                                            _inspect_449_4470_1.outtext(RTS_TXT.sub(sf_1.image,1,(((linlen<(((SCANNER)(_CUR._SL)).listlength)))?(linlen):(((SCANNER)(_CUR._SL)).listlength))));
                                            ;
                                            // JavaLine 222 <== SourceLine 453
                                            _inspect_449_4470_1.outimage();
                                            ;
                                        }
                                    }
                                }
                            } // END INSPECTION
                        }
                        ;
                        // JavaLine 231 <== SourceLine 455
                        if(_VALUE((linlen==(0)))) {
                            _GOTO(_LABEL_SCANNER_SourceElt_CompoundStatement459_NEXTIMAGE_0); // GOTO EVALUATED LABEL
                        }
                        ;
                        // JavaLine 236 <== SourceLine 456
                        if(_VALUE((linlen>(((SCANNER)(_CUR._SL)).signiflength)))) {
                            linlen=((SCANNER)(_CUR._SL)).signiflength;
                        }
                        ;
                        // JavaLine 241 <== SourceLine 457
                        RTS_ENVIRONMENT.storeChar(((char)7),((SCANNER)(_CUR._SL)).line,linlen);
                        ;
                        // JavaLine 244 <== SourceLine 458
                        {
                            _SIM_LABEL(3); // DeclaredIn: SourceElt -> SourceElt[SCANNER_SourceElt] DeclarationKind=Class
                            ((SCANNER)(_CUR._SL)).lexScanner_2.linelength_1=(linlen+(1));
                        }
                        ;
                    }
                    if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
                }
                ;
                // JavaLine 254 <== SourceLine 460
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCANNER.sim","8 SourceElt",1,393,12,425,14,427,16,458,19,396,21,397,23,398,25,405,27,449,44,390,46,405,51,406,53,405,55,407,64,408,67,409,70,410,73,411,76,412,79,413,81,415,89,416,95,418,100,419,107,420,109,421,117,423,120,424,123,425,128,427,136,428,141,429,146,430,151,431,154,432,157,433,162,434,167,436,171,437,176,439,178,440,181,441,186,443,192,445,199,448,204,449,210,450,212,449,214,450,219,451,222,453,231,455,236,456,241,457,244,458,254,460,267,460);
} // End of Class
