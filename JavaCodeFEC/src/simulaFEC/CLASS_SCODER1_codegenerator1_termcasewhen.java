// JavaLine 1 <== SourceLine 873
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:34 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER1_codegenerator1_termcasewhen extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=873, lastLine=897, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 876
    public CLASS_BUILDER1_casedescr _inspect_876_4633=null;
    // JavaLine 12 <== SourceLine 891
    public CLASS_BUILDER1_indexelt _inspect_891_4634=null;
    // Normal Constructor
    public CLASS_SCODER1_codegenerator1_termcasewhen(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER1_codegenerator1_termcasewhen _STM() {
        // JavaLine 25 <== SourceLine 876
        {
            // BEGIN INSPECTION 
            _inspect_876_4633=((CLASS_SCODER1)(_CUR._SL._SL)).curcase_6;
            if(_inspect_876_4633!=null) { // INSPECT _inspect_876_4633  type=ref(CASEDESCR)
                // JavaLine 30 <== SourceLine 877
                {
                    // JavaLine 32 <== SourceLine 876
                    {
                        // JavaLine 34 <== SourceLine 877
                        if(_VALUE(new CLASS_SCODER0_codegenerator0_nonewindex((_CUR._SL))._RESULT)) {
                            {
                                // JavaLine 37 <== SourceLine 878
                                while((_inspect_876_4633.firstelt!=(null))) {
                                    {
                                        // JavaLine 40 <== SourceLine 879
                                        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outbyte(55);
                                        ;
                                        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outbyte(_inspect_876_4633.firstelt.index);
                                        ;
                                        // JavaLine 45 <== SourceLine 880
                                        new CLASS_SCODER0_codegenerator0_releaseIndex((_CUR._SL),_inspect_876_4633.firstelt.index);
                                        ;
                                        // JavaLine 48 <== SourceLine 881
                                        _inspect_876_4633.firstelt=_inspect_876_4633.firstelt.next;
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 54 <== SourceLine 883
                                if(_VALUE((_inspect_876_4633.jumptag==(0)))) {
                                    {
                                        // JavaLine 57 <== SourceLine 885
                                        _inspect_876_4633.jumptag=new CLASS_BUILDER1_newTTag((_CUR._SL._SL),new RTS_TXT("jumptag"))._RESULT;
                                        // JavaLine 59 <== SourceLine 886
                                        ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outbyte(47);
                                        ;
                                        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),_inspect_876_4633.jumptag);
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 67 <== SourceLine 888
                                ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outtext(CONC(new RTS_TXT("Q"),new RTS_TXT("\u0014")));
                                ;
                                new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),_inspect_876_4633.jumptag);
                                ;
                                // JavaLine 72 <== SourceLine 889
                                ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outbyte(94);
                                ;
                            }
                        } else {
                            // JavaLine 77 <== SourceLine 891
                            {
                                // BEGIN INSPECTION 
                                _inspect_891_4634=new CLASS_BUILDER1_indexelt((_CUR._SL._SL))._STM();
                                if(_inspect_891_4634!=null) { // INSPECT _inspect_891_4634  type=ref(INDEXELT)
                                    // JavaLine 82 <== SourceLine 892
                                    {
                                        // JavaLine 84 <== SourceLine 891
                                        {
                                            // JavaLine 86 <== SourceLine 892
                                            _inspect_891_4634.next=_inspect_876_4633.firstelt;
                                            ;
                                            _inspect_876_4633.firstelt=((CLASS_BUILDER1_indexelt)_inspect_891_4634);
                                            ;
                                            // JavaLine 91 <== SourceLine 893
                                            _inspect_891_4634.index=((CLASS_SCODER1_codegenerator1)(_CUR._SL)).curindex_5;
                                            ;
                                            // JavaLine 94 <== SourceLine 894
                                            ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outbyte(89);
                                            ;
                                            ((CLASS_SCODER1_codegenerator1)(_CUR._SL)).outbyte(_inspect_891_4634.index);
                                            ;
                                        }
                                    }
                                }
                            } // END INSPECTION
                        }
                        ;
                        // JavaLine 105 <== SourceLine 896
                        new CLASS_SCODER0_codegenerator0_checkasdzero((_CUR._SL));
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER1.sim","5 termcasewhen",1,873,10,876,12,891,25,876,30,877,32,876,34,877,37,878,40,879,45,880,48,881,54,883,57,885,59,886,67,888,72,889,77,891,82,892,84,891,86,892,91,893,94,894,105,896,114,897);
} // End of Procedure
