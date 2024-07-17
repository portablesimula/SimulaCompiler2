// JavaLine 1 <== SourceLine 856
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:38 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER1_codegenerator1_termcase extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=856, lastLine=871, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 859
    public BUILDER1_casedescr _inspect_859_4632=null;
    // Normal Constructor
    public SCODER1_codegenerator1_termcase(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER1_codegenerator1_termcase _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_859_4632=((SCODER1)(_CUR._SL._SL)).curcase_6;
            if(_inspect_859_4632!=null) { // INSPECT _inspect_859_4632
                // JavaLine 27 <== SourceLine 860
                {
                    // JavaLine 29 <== SourceLine 859
                    {
                        // JavaLine 31 <== SourceLine 860
                        while((_inspect_859_4632.firstelt!=(null))) {
                            {
                                // JavaLine 34 <== SourceLine 861
                                ((SCODER1_codegenerator1)(_CUR._SL)).outbyte(55);
                                ;
                                ((SCODER1_codegenerator1)(_CUR._SL)).outbyte(_inspect_859_4632.firstelt.index);
                                ;
                                // JavaLine 39 <== SourceLine 862
                                new SCODER0_codegenerator0_releaseIndex((_CUR._SL),_inspect_859_4632.firstelt.index);
                                ;
                                // JavaLine 42 <== SourceLine 863
                                _inspect_859_4632.firstelt=_inspect_859_4632.firstelt.next;
                                ;
                            }
                        }
                        ;
                        // JavaLine 48 <== SourceLine 865
                        if(_VALUE((_inspect_859_4632.jumptag!=(0)))) {
                            {
                                // JavaLine 51 <== SourceLine 866
                                ((SCODER1_codegenerator1)(_CUR._SL)).outbyte(48);
                                ;
                                new SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),_inspect_859_4632.jumptag);
                            }
                        }
                        ;
                        // JavaLine 58 <== SourceLine 867
                        if(_VALUE((_inspect_859_4632.errortag!=(0)))) {
                            {
                                // JavaLine 61 <== SourceLine 868
                                ((SCODER1_codegenerator1)(_CUR._SL)).outbyte(48);
                                ;
                                new SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),_inspect_859_4632.errortag);
                                ;
                            }
                        }
                        ;
                        // JavaLine 69 <== SourceLine 870
                        ((SCODER1)(_CUR._SL._SL)).curcase_6=_inspect_859_4632.p_prev;
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER1.sim","5 termcase",1,856,10,859,27,860,29,859,31,860,34,861,39,862,42,863,48,865,51,866,58,867,61,868,69,870,78,871);
} // End of Procedure
