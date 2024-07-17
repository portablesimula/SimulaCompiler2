// JavaLine 1 <== SourceLine 110
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:19 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class COMMON_LOOKUPid extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=110, lastLine=131, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 12 <== SourceLine 129
    final RTS_LABEL _LABEL_COMMON_LOOKUPid_Block117_F_0=new RTS_LABEL(this,0,1,"F"); // Local Label #1=F At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 15 <== SourceLine 111
    public char idlen=0;
    public COMMON_symbolbox cursym=null;
    // JavaLine 18 <== SourceLine 110
    public boolean _RESULT=false;
    // Normal Constructor
    public COMMON_LOOKUPid(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public COMMON_LOOKUPid _STM() {
        COMMON_LOOKUPid _THIS=(COMMON_LOOKUPid)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 35 <== SourceLine 112
                if(_VALUE(TRF_EQ(((COMMON)(_CUR._SL)).simsymbol,null))) {
                    // JavaLine 37 <== SourceLine 113
                    {
                        _RESULT=true;
                        ;
                        ((COMMON)(_CUR._SL)).hashhi=((COMMON)(_CUR._SL)).hashlo=((char)0);
                    }
                } else {
                    // JavaLine 44 <== SourceLine 114
                    {
                        // JavaLine 46 <== SourceLine 117
                        ((COMMON)(_CUR._SL)).hashlo=RTS_ENVIRONMENT._char(RTS_ENVIRONMENT.hash(RTS_ENVIRONMENT.lowcase(((COMMON)(_CUR._SL)).simsymbol)));
                        ;
                        // JavaLine 49 <== SourceLine 118
                        cursym=((COMMON)(_CUR._SL)).hashtab.getELEMENT(RTS_ENVIRONMENT.rank(((COMMON)(_CUR._SL)).hashlo));
                        ;
                        // JavaLine 52 <== SourceLine 119
                        if(_VALUE((cursym!=(null)))) {
                            {
                                // JavaLine 55 <== SourceLine 120
                                while(_TXTREL_NE(cursym.symbol,((COMMON)(_CUR._SL)).simsymbol)) {
                                    // JavaLine 57 <== SourceLine 122
                                    {
                                        // JavaLine 59 <== SourceLine 123
                                        if(_VALUE((cursym.next==(null)))) {
                                            _GOTO(_LABEL_COMMON_LOOKUPid_Block117_F_0); // GOTO EVALUATED LABEL
                                        }
                                        ;
                                        // JavaLine 64 <== SourceLine 124
                                        cursym=cursym.next;
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 70 <== SourceLine 126
                                ((COMMON)(_CUR._SL)).hashhi=cursym.idhi;
                                ;
                                ((COMMON)(_CUR._SL)).hashlo=cursym.idlo;
                                ;
                                // JavaLine 75 <== SourceLine 127
                                _RESULT=true;
                                ;
                            }
                        } else {
                            // JavaLine 80 <== SourceLine 129
                            {
                                {
                                    _SIM_LABEL(1);
                                    ((COMMON)(_CUR._SL)).hashhi=((char)0);
                                    ;
                                    _RESULT=false;
                                }
                            }
                        }
                        ;
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","5 LOOKUPid",1,110,12,129,15,111,18,110,35,112,37,113,44,114,46,117,49,118,52,119,55,120,57,122,59,123,64,124,70,126,75,127,80,129,103,131);
} // End of Procedure
