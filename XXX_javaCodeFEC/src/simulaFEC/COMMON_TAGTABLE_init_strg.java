// JavaLine 1 <== SourceLine 735
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:19 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class COMMON_TAGTABLE_init_strg extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=735, lastLine=747, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public COMMON_TAGTABLE_init_strg(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public COMMON_TAGTABLE_init_strg _STM() {
        // JavaLine 21 <== SourceLine 737
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(1160),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("B\u005fSTRG:body"))));
        ;
        // JavaLine 24 <== SourceLine 738
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(1159),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("B\u005fSTRG"))));
        ;
        // JavaLine 27 <== SourceLine 739
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(1163),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("E\u005fSTRG:body"))));
        ;
        // JavaLine 30 <== SourceLine 740
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(1162),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("E\u005fSTRG"))));
        ;
        // JavaLine 33 <== SourceLine 741
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(1165),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GCutil:body"))));
        ;
        // JavaLine 36 <== SourceLine 742
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(1164),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GCutil"))));
        ;
        // JavaLine 39 <== SourceLine 743
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(1168),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GARB2:body"))));
        ;
        // JavaLine 42 <== SourceLine 744
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(1167),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GARB2"))));
        ;
        // JavaLine 45 <== SourceLine 745
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(1170),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GARB:body"))));
        ;
        // JavaLine 48 <== SourceLine 746
        ((COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((COMMON_TAGTABLE)(_CUR._SL)).ident.index(1169),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GARB"))));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","5 init_strg",1,735,21,737,24,738,27,739,30,740,33,741,36,742,39,743,42,744,45,745,48,746,53,747);
} // End of Procedure
