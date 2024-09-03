// JavaLine 1 <== SourceLine 256
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:52 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER1_codegenerator1_getFirstAttr extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=256, lastLine=271, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 12 <== SourceLine 268
    final RTS_LABEL _LABEL_CLASS_SCODER1_codegenerator1_getFirstAttr_Block260__super_0=new RTS_LABEL(this,0,1,"_super"); // Local Label #1=_super At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 15 <== SourceLine 257
    public CLASS_COMMON_quantity dq=null;
    public CLASS_COMMON_quantity cur=null;
    public CLASS_COMMON_quantity first=null;
    // JavaLine 19 <== SourceLine 256
    public int _RESULT=0;
    // Normal Constructor
    public CLASS_SCODER1_codegenerator1_getFirstAttr(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER1_codegenerator1_getFirstAttr _STM() {
        CLASS_SCODER1_codegenerator1_getFirstAttr _THIS=(CLASS_SCODER1_codegenerator1_getFirstAttr)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 36 <== SourceLine 258
                dq=((CLASS_SCODER1_codegenerator1)(_CUR._SL)).curpar_6.prefqual_1;
                ;
                // JavaLine 39 <== SourceLine 259
                while((dq!=(null))) {
                    {
                        // JavaLine 42 <== SourceLine 260
                        cur=dq.descr_1.fpar;
                        ;
                        // JavaLine 45 <== SourceLine 261
                        while((cur!=(null))) {
                            {
                                // JavaLine 48 <== SourceLine 262
                                if(_VALUE((new CLASS_SCODER1_codegenerator1_getTypeTag((_CUR._SL),cur)._RESULT!=(0)))) {
                                    // JavaLine 50 <== SourceLine 263
                                    {
                                        first=cur;
                                        ;
                                        _GOTO(_LABEL_CLASS_SCODER1_codegenerator1_getFirstAttr_Block260__super_0); // GOTO EVALUATED LABEL
                                    }
                                }
                                ;
                                // JavaLine 58 <== SourceLine 264
                                cur=((CLASS_COMMON_quantity)(cur.next));
                                ;
                            }
                        }
                        ;
                        // JavaLine 64 <== SourceLine 268
                        {
                            _SIM_LABEL(1); // DeclaredIn: getFirstAttr -> getFirstAttr[externalIdent=CLASS_SCODER1_codegenerator1_getFirstAttr] Kind=5, QUAL=ProcedureDeclaration, HashCode=516468676
                            dq=dq.prefqual_1;
                        }
                    }
                }
                ;
                // JavaLine 72 <== SourceLine 270
                if(_VALUE((first!=(null)))) {
                    _RESULT=(first.ftag_1+(0));
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER1.sim","5 getFirstAttr",1,256,12,268,15,257,19,256,36,258,39,259,42,260,45,261,48,262,50,263,58,264,64,268,72,270,86,271);
} // End of Procedure
