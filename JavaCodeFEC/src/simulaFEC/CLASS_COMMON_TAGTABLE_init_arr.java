// JavaLine 1 <== SourceLine 872
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:45 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_COMMON_TAGTABLE_init_arr extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=872, lastLine=890, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_COMMON_TAGTABLE_init_arr(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_COMMON_TAGTABLE_init_arr _STM() {
        // JavaLine 21 <== SourceLine 874
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(1403),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("arGnew:body"))));
        ;
        // JavaLine 24 <== SourceLine 875
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(1402),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("arGnew"))));
        ;
        // JavaLine 27 <== SourceLine 876
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(1409),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("ar2new:body"))));
        ;
        // JavaLine 30 <== SourceLine 877
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(1408),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("ar2new"))));
        ;
        // JavaLine 33 <== SourceLine 878
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(1417),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("arAcop:body"))));
        ;
        // JavaLine 36 <== SourceLine 879
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(1416),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("arAcop"))));
        ;
        // JavaLine 39 <== SourceLine 880
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(1421),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("arrVal:body"))));
        ;
        // JavaLine 42 <== SourceLine 881
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(1420),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("arrVal"))));
        ;
        // JavaLine 45 <== SourceLine 882
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(1426),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("arTcop:body"))));
        ;
        // JavaLine 48 <== SourceLine 883
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(1425),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("arTcop"))));
        ;
        // JavaLine 51 <== SourceLine 884
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(1428),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("LOWBND:body"))));
        ;
        // JavaLine 54 <== SourceLine 885
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(1427),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("LOWBND"))));
        ;
        // JavaLine 57 <== SourceLine 886
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(1433),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("UPPBND:body"))));
        ;
        // JavaLine 60 <== SourceLine 887
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(1432),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("UPPBND"))));
        ;
        // JavaLine 63 <== SourceLine 888
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(1438),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("arrDim:body"))));
        ;
        // JavaLine 66 <== SourceLine 889
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(1437),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("arrDim"))));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","5 init_arr",1,872,21,874,24,875,27,876,30,877,33,878,36,879,39,880,42,881,45,882,48,883,51,884,54,885,57,886,60,887,63,888,66,889,71,890);
} // End of Procedure
