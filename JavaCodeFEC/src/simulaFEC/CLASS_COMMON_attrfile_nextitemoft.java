// JavaLine 1 <== SourceLine 1075
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:24 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_COMMON_attrfile_nextitemoft extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1075, lastLine=1085, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 12 <== SourceLine 1080
    final RTS_LABEL _LABEL_CLASS_COMMON_attrfile_nextitemoft_ubl_0=new RTS_LABEL(this,0,1,"ubl"); // Local Label #1=ubl At PrefixLevel 0
    // JavaLine 14 <== SourceLine 1083
    final RTS_LABEL _LABEL_CLASS_COMMON_attrfile_nextitemoft_bl_0=new RTS_LABEL(this,0,2,"bl"); // Local Label #2=bl At PrefixLevel 0
    // JavaLine 16 <== SourceLine 1085
    final RTS_LABEL _LABEL_CLASS_COMMON_attrfile_nextitemoft_E_0=new RTS_LABEL(this,0,3,"E"); // Local Label #3=E At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 19 <== SourceLine 1076
    public int i=0;
    public int j=0;
    // JavaLine 22 <== SourceLine 1075
    public RTS_TXT _RESULT=null;
    // Normal Constructor
    public CLASS_COMMON_attrfile_nextitemoft(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_COMMON_attrfile_nextitemoft _STM() {
        CLASS_COMMON_attrfile_nextitemoft _THIS=(CLASS_COMMON_attrfile_nextitemoft)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,3); // For ByteCode Engineering
                // JavaLine 39 <== SourceLine 1077
                if(_VALUE((RTS_TXT.length(((CLASS_COMMON)(_CUR._SL._SL)).permt)==(0)))) {
                    _GOTO(_LABEL_CLASS_COMMON_attrfile_nextitemoft_E_0); // GOTO EVALUATED LABEL
                }
                ;
                // JavaLine 44 <== SourceLine 1078
                while(RTS_TXT.more(((CLASS_COMMON)(_CUR._SL._SL)).permt)) {
                    if(_VALUE((RTS_TXT.getchar(((CLASS_COMMON)(_CUR._SL._SL)).permt)!=(((char)32))))) {
                        _GOTO(_LABEL_CLASS_COMMON_attrfile_nextitemoft_ubl_0); // GOTO EVALUATED LABEL
                    }
                }
                ;
                // JavaLine 51 <== SourceLine 1079
                _RESULT=null;
                ;
                _GOTO(_LABEL_CLASS_COMMON_attrfile_nextitemoft_E_0); // GOTO EVALUATED LABEL
                ;
                // JavaLine 56 <== SourceLine 1080
                {
                    _SIM_LABEL(1); // DeclaredIn: nextitemoft
                    i=(RTS_TXT.pos(((CLASS_COMMON)(_CUR._SL._SL)).permt)-(1));
                }
                ;
                j=1;
                ;
                // JavaLine 64 <== SourceLine 1081
                while(RTS_TXT.more(((CLASS_COMMON)(_CUR._SL._SL)).permt)) {
                    // JavaLine 66 <== SourceLine 1082
                    if(_VALUE((RTS_TXT.getchar(((CLASS_COMMON)(_CUR._SL._SL)).permt)==(((char)32))))) {
                        _GOTO(_LABEL_CLASS_COMMON_attrfile_nextitemoft_bl_0); // GOTO EVALUATED LABEL
                    } else {
                        j=(j+(1));
                    }
                }
                ;
                // JavaLine 74 <== SourceLine 1083
                {
                    _SIM_LABEL(2); // DeclaredIn: nextitemoft
                    _RESULT=RTS_TXT.sub(((CLASS_COMMON)(_CUR._SL._SL)).permt,i,j);
                }
                ;
                // JavaLine 80 <== SourceLine 1084
                if(_VALUE(RTS_UTIL._TXTREL_EQ(RTS_TXT.sub(((CLASS_COMMON)(_CUR._SL._SL)).permt,i,j),new RTS_TXT("*")))) {
                    _RESULT=null;
                }
                ;
                // JavaLine 85 <== SourceLine 1085
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","5 nextitemoft",1,1075,12,1080,14,1083,16,1085,19,1076,22,1075,39,1077,44,1078,51,1079,56,1080,64,1081,66,1082,74,1083,80,1084,85,1085,99,1085);
} // End of Procedure
