// JavaLine 1 <== SourceLine 1377
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:45 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_COMMON_TAGTABLE_init_mntr extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1377, lastLine=1390, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_COMMON_TAGTABLE_init_mntr(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_COMMON_TAGTABLE_init_mntr _STM() {
        // JavaLine 21 <== SourceLine 1379
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(2439),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("EXERR"))));
        ;
        // JavaLine 24 <== SourceLine 1380
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(2440),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("EXCHDL"))));
        ;
        // JavaLine 27 <== SourceLine 1381
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(2441),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("SIMOB"))));
        ;
        // JavaLine 30 <== SourceLine 1382
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(2443),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("B\u005fPROG:body"))));
        ;
        // JavaLine 33 <== SourceLine 1383
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(2442),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("B\u005fPROG"))));
        ;
        // JavaLine 36 <== SourceLine 1384
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(2446),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("E\u005fPROG:body"))));
        ;
        // JavaLine 39 <== SourceLine 1385
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(2445),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("E\u005fPROG"))));
        ;
        // JavaLine 42 <== SourceLine 1386
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(2450),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("ERRX:body"))));
        ;
        // JavaLine 45 <== SourceLine 1387
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(2449),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("ERRX"))));
        ;
        // JavaLine 48 <== SourceLine 1388
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(2453),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("TRMP:body"))));
        ;
        // JavaLine 51 <== SourceLine 1389
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(2452),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("TRMP"))));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","5 init_mntr",1,1377,21,1379,24,1380,27,1381,30,1382,33,1383,36,1384,39,1385,42,1386,45,1387,48,1388,51,1389,56,1390);
} // End of Procedure
