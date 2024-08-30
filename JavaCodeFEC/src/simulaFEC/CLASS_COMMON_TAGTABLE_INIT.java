// JavaLine 1 <== SourceLine 22
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:24 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_COMMON_TAGTABLE_INIT extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=22, lastLine=51, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_COMMON_TAGTABLE_INIT(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_COMMON_TAGTABLE_INIT _STM() {
        // JavaLine 21 <== SourceLine 23
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).undef=RTS_ENVIRONMENT.copy(copy(new RTS_TXT("TAG")));
        ;
        // JavaLine 24 <== SourceLine 24
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(1),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("BOOL"))));
        ;
        // JavaLine 27 <== SourceLine 25
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(2),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("CHAR"))));
        ;
        // JavaLine 30 <== SourceLine 26
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(3),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("INT"))));
        ;
        // JavaLine 33 <== SourceLine 27
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(4),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("SINT"))));
        ;
        // JavaLine 36 <== SourceLine 28
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(5),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("REAL"))));
        ;
        // JavaLine 39 <== SourceLine 29
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(6),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("LREAL"))));
        ;
        // JavaLine 42 <== SourceLine 30
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(7),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("AADDR"))));
        ;
        // JavaLine 45 <== SourceLine 31
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(8),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("OADDR"))));
        ;
        // JavaLine 48 <== SourceLine 32
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(9),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("GADDR"))));
        ;
        // JavaLine 51 <== SourceLine 33
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(10),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("PADDR"))));
        ;
        // JavaLine 54 <== SourceLine 34
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(11),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("RADDR"))));
        ;
        // JavaLine 57 <== SourceLine 35
        ((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.putELEMENT(((CLASS_COMMON_TAGTABLE)(_CUR._SL)).ident.index(12),RTS_ENVIRONMENT.copy(copy(new RTS_TXT("SIZE"))));
        ;
        // JavaLine 60 <== SourceLine 36
        new CLASS_COMMON_TAGTABLE_init_rt((_CUR._SL));
        ;
        // JavaLine 63 <== SourceLine 37
        new CLASS_COMMON_TAGTABLE_init_sysr((_CUR._SL));
        ;
        // JavaLine 66 <== SourceLine 38
        new CLASS_COMMON_TAGTABLE_init_knwn((_CUR._SL));
        ;
        // JavaLine 69 <== SourceLine 39
        new CLASS_COMMON_TAGTABLE_init_util((_CUR._SL));
        ;
        // JavaLine 72 <== SourceLine 40
        new CLASS_COMMON_TAGTABLE_init_strg((_CUR._SL));
        ;
        // JavaLine 75 <== SourceLine 41
        new CLASS_COMMON_TAGTABLE_init_cent((_CUR._SL));
        ;
        // JavaLine 78 <== SourceLine 42
        new CLASS_COMMON_TAGTABLE_init_cint((_CUR._SL));
        ;
        // JavaLine 81 <== SourceLine 43
        new CLASS_COMMON_TAGTABLE_init_arr((_CUR._SL));
        ;
        // JavaLine 84 <== SourceLine 44
        new CLASS_COMMON_TAGTABLE_init_form((_CUR._SL));
        ;
        // JavaLine 87 <== SourceLine 45
        new CLASS_COMMON_TAGTABLE_init_libr((_CUR._SL));
        ;
        // JavaLine 90 <== SourceLine 46
        new CLASS_COMMON_TAGTABLE_init_fil((_CUR._SL));
        ;
        // JavaLine 93 <== SourceLine 47
        new CLASS_COMMON_TAGTABLE_init_smst((_CUR._SL));
        ;
        // JavaLine 96 <== SourceLine 48
        new CLASS_COMMON_TAGTABLE_init_sml((_CUR._SL));
        ;
        // JavaLine 99 <== SourceLine 49
        new CLASS_COMMON_TAGTABLE_init_edit((_CUR._SL));
        ;
        // JavaLine 102 <== SourceLine 50
        new CLASS_COMMON_TAGTABLE_init_mntr((_CUR._SL));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","5 INIT",1,22,21,23,24,24,27,25,30,26,33,27,36,28,39,29,42,30,45,31,48,32,51,33,54,34,57,35,60,36,63,37,66,38,69,39,72,40,75,41,78,42,81,43,84,44,87,45,90,46,93,47,96,48,99,49,102,50,107,51);
} // End of Procedure
