// JavaLine 1 <== SourceLine 353
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:29 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class COMMON_TAGTABLE_init_sysr extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=353, lastLine=595, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public COMMON_TAGTABLE_init_sysr(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public COMMON_TAGTABLE_init_sysr _STM() {
        // JavaLine 21 <== SourceLine 355
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(405),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("SYSPRI:body"))));
        ;
        // JavaLine 24 <== SourceLine 356
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(404),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("SYSPRI"))));
        ;
        // JavaLine 27 <== SourceLine 357
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(408),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("SYSPRO:body"))));
        ;
        // JavaLine 30 <== SourceLine 358
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(407),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("SYSPRO"))));
        ;
        // JavaLine 33 <== SourceLine 359
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(413),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("C\u005fBLNK:body"))));
        ;
        // JavaLine 36 <== SourceLine 360
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(412),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("C\u005fBLNK"))));
        ;
        // JavaLine 39 <== SourceLine 361
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(416),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("C\u005fMOVE:body"))));
        ;
        // JavaLine 42 <== SourceLine 362
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(415),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("C\u005fMOVE"))));
        ;
        // JavaLine 45 <== SourceLine 363
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(420),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("STRIPP:body"))));
        ;
        // JavaLine 48 <== SourceLine 364
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(419),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("STRIPP"))));
        ;
        // JavaLine 51 <== SourceLine 365
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(424),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("BINTXT:body"))));
        ;
        // JavaLine 54 <== SourceLine 366
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(423),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("BINTXT"))));
        ;
        // JavaLine 57 <== SourceLine 367
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(429),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("BOUTXT:body"))));
        ;
        // JavaLine 60 <== SourceLine 368
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(428),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("BOUTXT"))));
        ;
        // JavaLine 63 <== SourceLine 369
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(433),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("EXTGC:body"))));
        ;
        // JavaLine 66 <== SourceLine 370
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(432),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("EXTGC"))));
        ;
        // JavaLine 69 <== SourceLine 371
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(437),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PRTCHR:body"))));
        ;
        // JavaLine 72 <== SourceLine 372
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(436),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PRTCHR"))));
        ;
        // JavaLine 75 <== SourceLine 373
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(441),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("INITIA:body"))));
        ;
        // JavaLine 78 <== SourceLine 374
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(440),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("INITIA"))));
        ;
        // JavaLine 81 <== SourceLine 375
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(444),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("SETOPT:body"))));
        ;
        // JavaLine 84 <== SourceLine 376
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(443),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("SETOPT"))));
        ;
        // JavaLine 87 <== SourceLine 377
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(448),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("TERMIN:body"))));
        ;
        // JavaLine 90 <== SourceLine 378
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(447),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("TERMIN"))));
        ;
        // JavaLine 93 <== SourceLine 379
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(452),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("DMPSEG:body"))));
        ;
        // JavaLine 96 <== SourceLine 380
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(451),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("DMPSEG"))));
        ;
        // JavaLine 99 <== SourceLine 381
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(457),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("DMPENT:body"))));
        ;
        // JavaLine 102 <== SourceLine 382
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(456),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("DMPENT"))));
        ;
        // JavaLine 105 <== SourceLine 383
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(460),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("DMPOOL:body"))));
        ;
        // JavaLine 108 <== SourceLine 384
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(459),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("DMPOOL"))));
        ;
        // JavaLine 111 <== SourceLine 385
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(463),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("VERBOSE:body"))));
        ;
        // JavaLine 114 <== SourceLine 386
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(462),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("VERBOSE"))));
        ;
        // JavaLine 117 <== SourceLine 387
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(466),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GINTIN:body"))));
        ;
        // JavaLine 120 <== SourceLine 388
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(465),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GINTIN"))));
        ;
        // JavaLine 123 <== SourceLine 389
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(470),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GTEXIN:body"))));
        ;
        // JavaLine 126 <== SourceLine 390
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(469),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GTEXIN"))));
        ;
        // JavaLine 129 <== SourceLine 391
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(475),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("SIZEIN:body"))));
        ;
        // JavaLine 132 <== SourceLine 392
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(474),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("SIZEIN"))));
        ;
        // JavaLine 135 <== SourceLine 393
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(480),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GVIINF:body"))));
        ;
        // JavaLine 138 <== SourceLine 394
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(479),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GVIINF"))));
        ;
        // JavaLine 141 <== SourceLine 395
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(484),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GVTINF:body"))));
        ;
        // JavaLine 144 <== SourceLine 396
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(483),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GVTINF"))));
        ;
        // JavaLine 147 <== SourceLine 397
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(488),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("CLOCKT:body"))));
        ;
        // JavaLine 150 <== SourceLine 398
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(487),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("CLOCKT"))));
        ;
        // JavaLine 153 <== SourceLine 399
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(491),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("CPUTIM:body"))));
        ;
        // JavaLine 156 <== SourceLine 400
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(490),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("CPUTIM"))));
        ;
        // JavaLine 159 <== SourceLine 401
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(494),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("DWAREA:body"))));
        ;
        // JavaLine 162 <== SourceLine 402
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(493),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("DWAREA"))));
        ;
        // JavaLine 165 <== SourceLine 403
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(499),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("MOVEIN:body"))));
        ;
        // JavaLine 168 <== SourceLine 404
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(498),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("MOVEIN"))));
        ;
        // JavaLine 171 <== SourceLine 405
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(504),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("OPFILE:body"))));
        ;
        // JavaLine 174 <== SourceLine 406
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(503),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("OPFILE"))));
        ;
        // JavaLine 177 <== SourceLine 407
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(511),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("CLFILE:body"))));
        ;
        // JavaLine 180 <== SourceLine 408
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(510),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("CLFILE"))));
        ;
        // JavaLine 183 <== SourceLine 409
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(515),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("LSTLOC:body"))));
        ;
        // JavaLine 186 <== SourceLine 410
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(514),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("LSTLOC"))));
        ;
        // JavaLine 189 <== SourceLine 411
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(519),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("MXLOC:body"))));
        ;
        // JavaLine 192 <== SourceLine 412
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(518),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("MXLOC"))));
        ;
        // JavaLine 195 <== SourceLine 413
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(523),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("CHECKP:body"))));
        ;
        // JavaLine 198 <== SourceLine 414
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(522),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("CHECKP"))));
        ;
        // JavaLine 201 <== SourceLine 415
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(527),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("LOCKFI:body"))));
        ;
        // JavaLine 204 <== SourceLine 416
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(526),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("LOCKFI"))));
        ;
        // JavaLine 207 <== SourceLine 417
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(534),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("UPLOCK:body"))));
        ;
        // JavaLine 210 <== SourceLine 418
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(533),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("UPLOCK"))));
        ;
        // JavaLine 213 <== SourceLine 419
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(537),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("fINIMA:body"))));
        ;
        // JavaLine 216 <== SourceLine 420
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(536),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("fINIMA"))));
        ;
        // JavaLine 219 <== SourceLine 421
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(542),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("fUTIMA:body"))));
        ;
        // JavaLine 222 <== SourceLine 422
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(541),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("fUTIMA"))));
        ;
        // JavaLine 225 <== SourceLine 423
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(546),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("BREAKO:body"))));
        ;
        // JavaLine 228 <== SourceLine 424
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(545),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("BREAKO"))));
        ;
        // JavaLine 231 <== SourceLine 425
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(550),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("fLOCAT:body"))));
        ;
        // JavaLine 234 <== SourceLine 426
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(549),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("fLOCAT"))));
        ;
        // JavaLine 237 <== SourceLine 427
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(554),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("DELETE:body"))));
        ;
        // JavaLine 240 <== SourceLine 428
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(553),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("DELETE"))));
        ;
        // JavaLine 243 <== SourceLine 429
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(558),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GDSNAM:body"))));
        ;
        // JavaLine 246 <== SourceLine 430
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(557),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GDSNAM"))));
        ;
        // JavaLine 249 <== SourceLine 431
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(563),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GDSPEC:body"))));
        ;
        // JavaLine 252 <== SourceLine 432
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(562),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GDSPEC"))));
        ;
        // JavaLine 255 <== SourceLine 433
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(568),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GETLPP:body"))));
        ;
        // JavaLine 258 <== SourceLine 434
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(567),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GETLPP"))));
        ;
        // JavaLine 261 <== SourceLine 435
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(572),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("NEWPAG:body"))));
        ;
        // JavaLine 264 <== SourceLine 436
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(571),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("NEWPAG"))));
        ;
        // JavaLine 267 <== SourceLine 437
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(575),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PRINTO:body"))));
        ;
        // JavaLine 270 <== SourceLine 438
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(574),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PRINTO"))));
        ;
        // JavaLine 273 <== SourceLine 439
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(580),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("STREQL:body"))));
        ;
        // JavaLine 276 <== SourceLine 440
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(579),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("STREQL"))));
        ;
        // JavaLine 279 <== SourceLine 441
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(585),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("fINBYT:body"))));
        ;
        // JavaLine 282 <== SourceLine 442
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(584),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("fINBYT"))));
        ;
        // JavaLine 285 <== SourceLine 443
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(589),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("fIN2BY:body"))));
        ;
        // JavaLine 288 <== SourceLine 444
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(588),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("fIN2BY"))));
        ;
        // JavaLine 291 <== SourceLine 445
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(593),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("fUTBYT:body"))));
        ;
        // JavaLine 294 <== SourceLine 446
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(592),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("fUTBYT"))));
        ;
        // JavaLine 297 <== SourceLine 447
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(597),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("fUT2BY:body"))));
        ;
        // JavaLine 300 <== SourceLine 448
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(596),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("fUT2BY"))));
        ;
        // JavaLine 303 <== SourceLine 449
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(601),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GETINT:body"))));
        ;
        // JavaLine 306 <== SourceLine 450
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(600),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GETINT"))));
        ;
        // JavaLine 309 <== SourceLine 451
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(605),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GTREAL:body"))));
        ;
        // JavaLine 312 <== SourceLine 452
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(604),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GTREAL"))));
        ;
        // JavaLine 315 <== SourceLine 453
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(609),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GTFRAC:body"))));
        ;
        // JavaLine 318 <== SourceLine 454
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(608),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GTFRAC"))));
        ;
        // JavaLine 321 <== SourceLine 455
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(613),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PUTSTR:body"))));
        ;
        // JavaLine 324 <== SourceLine 456
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(612),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PUTSTR"))));
        ;
        // JavaLine 327 <== SourceLine 457
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(618),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PUTINT:body"))));
        ;
        // JavaLine 330 <== SourceLine 458
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(617),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PUTINT"))));
        ;
        // JavaLine 333 <== SourceLine 459
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(622),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PUTINT2:body"))));
        ;
        // JavaLine 336 <== SourceLine 460
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(621),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PUTINT2"))));
        ;
        // JavaLine 339 <== SourceLine 461
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(627),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PUTSIZE:body"))));
        ;
        // JavaLine 342 <== SourceLine 462
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(626),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PUTSIZE"))));
        ;
        // JavaLine 345 <== SourceLine 463
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(632),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PUTHEX:body"))));
        ;
        // JavaLine 348 <== SourceLine 464
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(631),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PUTHEX"))));
        ;
        // JavaLine 351 <== SourceLine 465
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(637),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PUTFIX:body"))));
        ;
        // JavaLine 354 <== SourceLine 466
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(636),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PUTFIX"))));
        ;
        // JavaLine 357 <== SourceLine 467
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(642),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PUTFIX2:body"))));
        ;
        // JavaLine 360 <== SourceLine 468
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(641),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PUTFIX2"))));
        ;
        // JavaLine 363 <== SourceLine 469
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(648),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTLFIX:body"))));
        ;
        // JavaLine 366 <== SourceLine 470
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(647),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTLFIX"))));
        ;
        // JavaLine 369 <== SourceLine 471
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(653),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTLFIX2:body"))));
        ;
        // JavaLine 372 <== SourceLine 472
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(652),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTLFIX2"))));
        ;
        // JavaLine 375 <== SourceLine 473
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(659),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTREAL:body"))));
        ;
        // JavaLine 378 <== SourceLine 474
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(658),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTREAL"))));
        ;
        // JavaLine 381 <== SourceLine 475
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(664),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTREAL2:body"))));
        ;
        // JavaLine 384 <== SourceLine 476
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(663),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTREAL2"))));
        ;
        // JavaLine 387 <== SourceLine 477
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(670),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PLREAL:body"))));
        ;
        // JavaLine 390 <== SourceLine 478
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(669),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PLREAL"))));
        ;
        // JavaLine 393 <== SourceLine 479
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(675),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PLREAL2:body"))));
        ;
        // JavaLine 396 <== SourceLine 480
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(674),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PLREAL2"))));
        ;
        // JavaLine 399 <== SourceLine 481
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(681),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTFRAC:body"))));
        ;
        // JavaLine 402 <== SourceLine 482
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(680),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTFRAC"))));
        ;
        // JavaLine 405 <== SourceLine 483
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(686),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTSIZE:body"))));
        ;
        // JavaLine 408 <== SourceLine 484
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(685),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTSIZE"))));
        ;
        // JavaLine 411 <== SourceLine 485
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(690),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTOADR:body"))));
        ;
        // JavaLine 414 <== SourceLine 486
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(689),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTOADR"))));
        ;
        // JavaLine 417 <== SourceLine 487
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(694),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTOADR2:body"))));
        ;
        // JavaLine 420 <== SourceLine 488
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(693),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTOADR2"))));
        ;
        // JavaLine 423 <== SourceLine 489
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(699),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTAADR:body"))));
        ;
        // JavaLine 426 <== SourceLine 490
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(698),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTAADR"))));
        ;
        // JavaLine 429 <== SourceLine 491
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(703),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTAADR2:body"))));
        ;
        // JavaLine 432 <== SourceLine 492
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(702),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTAADR2"))));
        ;
        // JavaLine 435 <== SourceLine 493
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(708),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTGADR:body"))));
        ;
        // JavaLine 438 <== SourceLine 494
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(707),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTGADR"))));
        ;
        // JavaLine 441 <== SourceLine 495
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(712),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTGADR2:body"))));
        ;
        // JavaLine 444 <== SourceLine 496
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(711),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTGADR2"))));
        ;
        // JavaLine 447 <== SourceLine 497
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(717),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTPADR:body"))));
        ;
        // JavaLine 450 <== SourceLine 498
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(716),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTPADR"))));
        ;
        // JavaLine 453 <== SourceLine 499
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(721),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTPADR2:body"))));
        ;
        // JavaLine 456 <== SourceLine 500
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(720),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTPADR2"))));
        ;
        // JavaLine 459 <== SourceLine 501
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(726),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTRADR:body"))));
        ;
        // JavaLine 462 <== SourceLine 502
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(725),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTRADR"))));
        ;
        // JavaLine 465 <== SourceLine 503
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(730),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTRADR2:body"))));
        ;
        // JavaLine 468 <== SourceLine 504
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(729),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PTRADR2"))));
        ;
        // JavaLine 471 <== SourceLine 505
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(735),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("DRAWRP:body"))));
        ;
        // JavaLine 474 <== SourceLine 506
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(734),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("DRAWRP"))));
        ;
        // JavaLine 477 <== SourceLine 507
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(739),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("DATTIM:body"))));
        ;
        // JavaLine 480 <== SourceLine 508
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(738),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("DATTIM"))));
        ;
        // JavaLine 483 <== SourceLine 509
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(743),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("LTEN:body"))));
        ;
        // JavaLine 486 <== SourceLine 510
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(742),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("LTEN"))));
        ;
        // JavaLine 489 <== SourceLine 511
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(746),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("DECMRK:body"))));
        ;
        // JavaLine 492 <== SourceLine 512
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(745),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("DECMRK"))));
        ;
        // JavaLine 495 <== SourceLine 513
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(749),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("RSQROO:body"))));
        ;
        // JavaLine 498 <== SourceLine 514
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(748),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("RSQROO"))));
        ;
        // JavaLine 501 <== SourceLine 515
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(753),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("SQROOT:body"))));
        ;
        // JavaLine 504 <== SourceLine 516
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(752),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("SQROOT"))));
        ;
        // JavaLine 507 <== SourceLine 517
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(757),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("RLOGAR:body"))));
        ;
        // JavaLine 510 <== SourceLine 518
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(756),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("RLOGAR"))));
        ;
        // JavaLine 513 <== SourceLine 519
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(761),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("LOGARI:body"))));
        ;
        // JavaLine 516 <== SourceLine 520
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(760),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("LOGARI"))));
        ;
        // JavaLine 519 <== SourceLine 521
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(765),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("RLOG10:body"))));
        ;
        // JavaLine 522 <== SourceLine 522
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(764),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("RLOG10"))));
        ;
        // JavaLine 525 <== SourceLine 523
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(769),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("DLOG10:body"))));
        ;
        // JavaLine 528 <== SourceLine 524
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(768),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("DLOG10"))));
        ;
        // JavaLine 531 <== SourceLine 525
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(773),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("REXPON:body"))));
        ;
        // JavaLine 534 <== SourceLine 526
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(772),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("REXPON"))));
        ;
        // JavaLine 537 <== SourceLine 527
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(777),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("EXPONE:body"))));
        ;
        // JavaLine 540 <== SourceLine 528
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(776),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("EXPONE"))));
        ;
        // JavaLine 543 <== SourceLine 529
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(781),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("RSINUS:body"))));
        ;
        // JavaLine 546 <== SourceLine 530
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(780),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("RSINUS"))));
        ;
        // JavaLine 549 <== SourceLine 531
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(785),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("SINUSR:body"))));
        ;
        // JavaLine 552 <== SourceLine 532
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(784),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("SINUSR"))));
        ;
        // JavaLine 555 <== SourceLine 533
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(789),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("RCOSIN:body"))));
        ;
        // JavaLine 558 <== SourceLine 534
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(788),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("RCOSIN"))));
        ;
        // JavaLine 561 <== SourceLine 535
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(793),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("COSINU:body"))));
        ;
        // JavaLine 564 <== SourceLine 536
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(792),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("COSINU"))));
        ;
        // JavaLine 567 <== SourceLine 537
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(797),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("RTANGN:body"))));
        ;
        // JavaLine 570 <== SourceLine 538
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(796),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("RTANGN"))));
        ;
        // JavaLine 573 <== SourceLine 539
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(801),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("TANGEN:body"))));
        ;
        // JavaLine 576 <== SourceLine 540
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(800),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("TANGEN"))));
        ;
        // JavaLine 579 <== SourceLine 541
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(805),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("COTANR:body"))));
        ;
        // JavaLine 582 <== SourceLine 542
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(804),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("COTANR"))));
        ;
        // JavaLine 585 <== SourceLine 543
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(809),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("COTANG:body"))));
        ;
        // JavaLine 588 <== SourceLine 544
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(808),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("COTANG"))));
        ;
        // JavaLine 591 <== SourceLine 545
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(813),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("RARTAN:body"))));
        ;
        // JavaLine 594 <== SourceLine 546
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(812),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("RARTAN"))));
        ;
        // JavaLine 597 <== SourceLine 547
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(817),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("ARCTAN:body"))));
        ;
        // JavaLine 600 <== SourceLine 548
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(816),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("ARCTAN"))));
        ;
        // JavaLine 603 <== SourceLine 549
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(821),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("RARCOS:body"))));
        ;
        // JavaLine 606 <== SourceLine 550
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(820),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("RARCOS"))));
        ;
        // JavaLine 609 <== SourceLine 551
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(825),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("ARCCOS:body"))));
        ;
        // JavaLine 612 <== SourceLine 552
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(824),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("ARCCOS"))));
        ;
        // JavaLine 615 <== SourceLine 553
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(829),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("RARSIN:body"))));
        ;
        // JavaLine 618 <== SourceLine 554
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(828),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("RARSIN"))));
        ;
        // JavaLine 621 <== SourceLine 555
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(833),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("ARCSIN:body"))));
        ;
        // JavaLine 624 <== SourceLine 556
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(832),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("ARCSIN"))));
        ;
        // JavaLine 627 <== SourceLine 557
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(837),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("ATAN2R:body"))));
        ;
        // JavaLine 630 <== SourceLine 558
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(836),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("ATAN2R"))));
        ;
        // JavaLine 633 <== SourceLine 559
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(842),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("ATAN2:body"))));
        ;
        // JavaLine 636 <== SourceLine 560
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(841),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("ATAN2"))));
        ;
        // JavaLine 639 <== SourceLine 561
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(847),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("SINHR:body"))));
        ;
        // JavaLine 642 <== SourceLine 562
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(846),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("SINHR"))));
        ;
        // JavaLine 645 <== SourceLine 563
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(851),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("SINH:body"))));
        ;
        // JavaLine 648 <== SourceLine 564
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(850),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("SINH"))));
        ;
        // JavaLine 651 <== SourceLine 565
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(855),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("COSHR:body"))));
        ;
        // JavaLine 654 <== SourceLine 566
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(854),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("COSHR"))));
        ;
        // JavaLine 657 <== SourceLine 567
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(859),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("COSH:body"))));
        ;
        // JavaLine 660 <== SourceLine 568
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(858),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("COSH"))));
        ;
        // JavaLine 663 <== SourceLine 569
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(863),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("TANHR:body"))));
        ;
        // JavaLine 666 <== SourceLine 570
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(862),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("TANHR"))));
        ;
        // JavaLine 669 <== SourceLine 571
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(867),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("TANH:body"))));
        ;
        // JavaLine 672 <== SourceLine 572
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(866),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("TANH"))));
        ;
        // JavaLine 675 <== SourceLine 573
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(871),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("BEGDEB:body"))));
        ;
        // JavaLine 678 <== SourceLine 574
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(870),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("BEGDEB"))));
        ;
        // JavaLine 681 <== SourceLine 575
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(873),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("ENDDEB:body"))));
        ;
        // JavaLine 684 <== SourceLine 576
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(872),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("ENDDEB"))));
        ;
        // JavaLine 687 <== SourceLine 577
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(876),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("BEGTRP:body"))));
        ;
        // JavaLine 690 <== SourceLine 578
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(875),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("BEGTRP"))));
        ;
        // JavaLine 693 <== SourceLine 579
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(879),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("ENDTRP:body"))));
        ;
        // JavaLine 696 <== SourceLine 580
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(878),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("ENDTRP"))));
        ;
        // JavaLine 699 <== SourceLine 581
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(881),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GTPADR:body"))));
        ;
        // JavaLine 702 <== SourceLine 582
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(880),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GTPADR"))));
        ;
        // JavaLine 705 <== SourceLine 583
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(886),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GTOUTM:body"))));
        ;
        // JavaLine 708 <== SourceLine 584
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(885),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GTOUTM"))));
        ;
        // JavaLine 711 <== SourceLine 585
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(889),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GTLNID:body"))));
        ;
        // JavaLine 714 <== SourceLine 586
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(888),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GTLNID"))));
        ;
        // JavaLine 717 <== SourceLine 587
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(894),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GTLNO:body"))));
        ;
        // JavaLine 720 <== SourceLine 588
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(893),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GTLNO"))));
        ;
        // JavaLine 723 <== SourceLine 589
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(898),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("BRKPNT:body"))));
        ;
        // JavaLine 726 <== SourceLine 590
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(897),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("BRKPNT"))));
        ;
        // JavaLine 729 <== SourceLine 591
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(902),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("STMNOT:body"))));
        ;
        // JavaLine 732 <== SourceLine 592
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(901),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("STMNOT"))));
        ;
        // JavaLine 735 <== SourceLine 593
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(905),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("DMPOBJ:body"))));
        ;
        // JavaLine 738 <== SourceLine 594
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(904),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("DMPOBJ"))));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","5 init_sysr",1,353,21,355,24,356,27,357,30,358,33,359,36,360,39,361,42,362,45,363,48,364,51,365,54,366,57,367,60,368,63,369,66,370,69,371,72,372,75,373,78,374,81,375,84,376,87,377,90,378,93,379,96,380,99,381,102,382,105,383,108,384,111,385,114,386,117,387,120,388,123,389,126,390,129,391,132,392,135,393,138,394,141,395,144,396,147,397,150,398,153,399,156,400,159,401,162,402,165,403,168,404,171,405,174,406,177,407,180,408,183,409,186,410,189,411,192,412,195,413,198,414,201,415,204,416,207,417,210,418,213,419,216,420,219,421,222,422,225,423,228,424,231,425,234,426,237,427,240,428,243,429,246,430,249,431,252,432,255,433,258,434,261,435,264,436,267,437,270,438,273,439,276,440,279,441,282,442,285,443,288,444,291,445,294,446,297,447,300,448,303,449,306,450,309,451,312,452,315,453,318,454,321,455,324,456,327,457,330,458,333,459,336,460,339,461,342,462,345,463,348,464,351,465,354,466,357,467,360,468,363,469,366,470,369,471,372,472,375,473,378,474,381,475,384,476,387,477,390,478,393,479,396,480,399,481,402,482,405,483,408,484,411,485,414,486,417,487,420,488,423,489,426,490,429,491,432,492,435,493,438,494,441,495,444,496,447,497,450,498,453,499,456,500,459,501,462,502,465,503,468,504,471,505,474,506,477,507,480,508,483,509,486,510,489,511,492,512,495,513,498,514,501,515,504,516,507,517,510,518,513,519,516,520,519,521,522,522,525,523,528,524,531,525,534,526,537,527,540,528,543,529,546,530,549,531,552,532,555,533,558,534,561,535,564,536,567,537,570,538,573,539,576,540,579,541,582,542,585,543,588,544,591,545,594,546,597,547,600,548,603,549,606,550,609,551,612,552,615,553,618,554,621,555,624,556,627,557,630,558,633,559,636,560,639,561,642,562,645,563,648,564,651,565,654,566,657,567,660,568,663,569,666,570,669,571,672,572,675,573,678,574,681,575,684,576,687,577,690,578,693,579,696,580,699,581,702,582,705,583,708,584,711,585,714,586,717,587,720,588,723,589,726,590,729,591,732,592,735,593,738,594,743,595);
} // End of Procedure
