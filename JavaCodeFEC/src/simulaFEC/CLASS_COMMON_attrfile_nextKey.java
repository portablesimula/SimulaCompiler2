// JavaLine 1 <== SourceLine 1063
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:45 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_COMMON_attrfile_nextKey extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1063, lastLine=1067, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 1064
    final RTS_LABEL _LABEL_CLASS_COMMON_attrfile_nextKey_REP_0=new RTS_LABEL(this,0,1,"REP"); // Local Label #1=REP At PrefixLevel 0
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_COMMON_attrfile_nextKey(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_COMMON_attrfile_nextKey _STM() {
        CLASS_COMMON_attrfile_nextKey _THIS=(CLASS_COMMON_attrfile_nextKey)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                {
                    _SIM_LABEL(1); // DeclaredIn: nextKey
                    ((CLASS_COMMON_attrfile)(_CUR._SL)).key=RTS_ENVIRONMENT.loadChar(((CLASS_COMMON_attrfile)(_CUR._SL)).attrbuffer,((CLASS_COMMON_attrfile)(_CUR._SL)).p);
                }
                ;
                ((CLASS_COMMON_attrfile)(_CUR._SL)).p=(((CLASS_COMMON_attrfile)(_CUR._SL)).p+(1));
                ;
                // JavaLine 35 <== SourceLine 1065
                if(_VALUE((((CLASS_COMMON_attrfile)(_CUR._SL)).key==(((char)254))))) {
                    {
                        // JavaLine 38 <== SourceLine 1066
                        new CLASS_COMMON_attrfile_swapIbuffer((_CUR._SL));
                        ;
                        _GOTO(_LABEL_CLASS_COMMON_attrfile_nextKey_REP_0); // GOTO EVALUATED LABEL
                    }
                }
                ;
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","5 nextKey",1,1063,10,1064,35,1065,38,1066,54,1067);
} // End of Procedure
