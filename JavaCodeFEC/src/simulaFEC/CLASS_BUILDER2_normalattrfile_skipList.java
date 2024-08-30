// JavaLine 1 <== SourceLine 211
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:31 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER2_normalattrfile_skipList extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=211, lastLine=230, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 226
    final RTS_LABEL _LABEL_CLASS_BUILDER2_normalattrfile_skipList_EXIT_0=new RTS_LABEL(this,0,1,"EXIT"); // Local Label #1=EXIT At PrefixLevel 0
    // Declare locals as attributes
    // Normal Constructor
    public CLASS_BUILDER2_normalattrfile_skipList(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER2_normalattrfile_skipList _STM() {
        CLASS_BUILDER2_normalattrfile_skipList _THIS=(CLASS_BUILDER2_normalattrfile_skipList)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 28 <== SourceLine 216
                new CLASS_COMMON_attrfile_nextKey((_CUR._SL));
                ;
                // JavaLine 31 <== SourceLine 218
                ((CLASS_BUILDER2)(_CUR._SL._SL)).indent=(((CLASS_BUILDER2)(_CUR._SL._SL)).indent+(1));
                ;
                // JavaLine 34 <== SourceLine 219
                while((((CLASS_BUILDER2_normalattrfile)(_CUR._SL)).key<(((char)240)))) {
                    {
                        // JavaLine 37 <== SourceLine 220
                        new CLASS_COMMON_attrfile_fetchquant((_CUR._SL));
                        ;
                        // JavaLine 40 <== SourceLine 221
                        if(_VALUE((((CLASS_BUILDER2_normalattrfile)(_CUR._SL)).key==(((char)251))))) {
                            new CLASS_BUILDER2_normalattrfile_skipList((_CUR._SL));
                        }
                        ;
                    }
                }
                ;
                // JavaLine 48 <== SourceLine 224
                ((CLASS_BUILDER2)(_CUR._SL._SL)).indent=(((CLASS_BUILDER2)(_CUR._SL._SL)).indent-(1));
                ;
                // JavaLine 51 <== SourceLine 226
                {
                    _SIM_LABEL(1); // DeclaredIn: skipList
                    if(_VALUE((((CLASS_BUILDER2_normalattrfile)(_CUR._SL)).key!=(((char)250))))) {
                        new CLASS_BUILDER2_normalattrfile_expxerr((_CUR._SL),'E');
                    }
                }
                ;
                // JavaLine 59 <== SourceLine 227
                new CLASS_COMMON_attrfile_nextKey((_CUR._SL));
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER2.sim","5 skipList",1,211,10,226,28,216,31,218,34,219,37,220,40,221,48,224,51,226,59,227,71,230);
} // End of Procedure
