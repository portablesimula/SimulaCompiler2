// JavaLine 1 <== SourceLine 1074
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:29 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class COMMON_attrfile_nextitemoft extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1074, lastLine=1084, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 12 <== SourceLine 1079
    final RTS_LABEL _LABEL_COMMON_attrfile_nextitemoft_ubl_0=new RTS_LABEL(this,0,1,"ubl"); // Local Label #1=ubl At PrefixLevel 0
    // JavaLine 14 <== SourceLine 1082
    final RTS_LABEL _LABEL_COMMON_attrfile_nextitemoft_bl_0=new RTS_LABEL(this,0,2,"bl"); // Local Label #2=bl At PrefixLevel 0
    // JavaLine 16 <== SourceLine 1084
    final RTS_LABEL _LABEL_COMMON_attrfile_nextitemoft_E_0=new RTS_LABEL(this,0,3,"E"); // Local Label #3=E At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 19 <== SourceLine 1075
    public int i=0;
    public int j=0;
    // JavaLine 22 <== SourceLine 1074
    public RTS_TXT _RESULT=null;
    // Normal Constructor
    public COMMON_attrfile_nextitemoft(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public COMMON_attrfile_nextitemoft _STM() {
        COMMON_attrfile_nextitemoft _THIS=(COMMON_attrfile_nextitemoft)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,3); // For ByteCode Engineering
                // JavaLine 39 <== SourceLine 1076
                if(_VALUE((RTS_TXT.length(((COMMON)(_CUR._SL._SL)).permt)==(0)))) {
                    _GOTO(_LABEL_COMMON_attrfile_nextitemoft_E_0); // GOTO EVALUATED LABEL
                }
                ;
                // JavaLine 44 <== SourceLine 1077
                while(RTS_TXT.more(((COMMON)(_CUR._SL._SL)).permt)) {
                    if(_VALUE((RTS_TXT.getchar(((COMMON)(_CUR._SL._SL)).permt)!=(((char)32))))) {
                        _GOTO(_LABEL_COMMON_attrfile_nextitemoft_ubl_0); // GOTO EVALUATED LABEL
                    }
                }
                ;
                // JavaLine 51 <== SourceLine 1078
                _RESULT=null;
                ;
                _GOTO(_LABEL_COMMON_attrfile_nextitemoft_E_0); // GOTO EVALUATED LABEL
                ;
                // JavaLine 56 <== SourceLine 1079
                {
                    _SIM_LABEL(1); // DeclaredIn: nextitemoft
                    i=(RTS_TXT.pos(((COMMON)(_CUR._SL._SL)).permt)-(1));
                }
                ;
                j=1;
                ;
                // JavaLine 64 <== SourceLine 1080
                while(RTS_TXT.more(((COMMON)(_CUR._SL._SL)).permt)) {
                    // JavaLine 66 <== SourceLine 1081
                    if(_VALUE((RTS_TXT.getchar(((COMMON)(_CUR._SL._SL)).permt)==(((char)32))))) {
                        _GOTO(_LABEL_COMMON_attrfile_nextitemoft_bl_0); // GOTO EVALUATED LABEL
                    } else {
                        j=(j+(1));
                    }
                }
                ;
                // JavaLine 74 <== SourceLine 1082
                {
                    _SIM_LABEL(2); // DeclaredIn: nextitemoft
                    _RESULT=RTS_TXT.sub(((COMMON)(_CUR._SL._SL)).permt,i,j);
                }
                ;
                // JavaLine 80 <== SourceLine 1083
                if(_VALUE(_TXTREL_EQ(RTS_TXT.sub(((COMMON)(_CUR._SL._SL)).permt,i,j),new RTS_TXT("*")))) {
                    _RESULT=null;
                }
                ;
                // JavaLine 85 <== SourceLine 1084
                {
                    _SIM_LABEL(3); // DeclaredIn: nextitemoft
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","5 nextitemoft",1,1074,12,1079,14,1082,16,1084,19,1075,22,1074,39,1076,44,1077,51,1078,56,1079,64,1080,66,1081,74,1082,80,1083,85,1084,99,1084);
} // End of Procedure
