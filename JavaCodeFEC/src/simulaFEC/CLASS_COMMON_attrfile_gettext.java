// JavaLine 1 <== SourceLine 1018
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:45 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_COMMON_attrfile_gettext extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1018, lastLine=1047, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 1020
    final RTS_LABEL _LABEL_CLASS_COMMON_attrfile_gettext_REP_0=new RTS_LABEL(this,0,1,"REP"); // Local Label #1=REP At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 1019
    public int tlength=0;
    // JavaLine 15 <== SourceLine 1025
    public RTS_Printfile _inspect_1025_4457=null;
    // JavaLine 17 <== SourceLine 1039
    public RTS_Inbytefile _inspect_1039_4458=null;
    // Normal Constructor
    public CLASS_COMMON_attrfile_gettext(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_COMMON_attrfile_gettext _STM() {
        CLASS_COMMON_attrfile_gettext _THIS=(CLASS_COMMON_attrfile_gettext)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 34 <== SourceLine 1020
                {
                    _SIM_LABEL(1); // DeclaredIn: gettext
                    new CLASS_COMMON_attrfile_nextKey((_CUR._SL));
                }
                ;
                // JavaLine 40 <== SourceLine 1021
                if(_VALUE((((CLASS_COMMON_attrfile)(_CUR._SL)).key<(((char)240))))) {
                    {
                        // JavaLine 43 <== SourceLine 1022
                        ((CLASS_COMMON)(_CUR._SL._SL)).simsymbol=RTS_TXT.sub(((CLASS_COMMON_attrfile)(_CUR._SL)).attrbuffer,(((CLASS_COMMON_attrfile)(_CUR._SL)).p+(1)),RTS_ENVIRONMENT.rank(((CLASS_COMMON_attrfile)(_CUR._SL)).key));
                        ;
                        // JavaLine 46 <== SourceLine 1023
                        ((CLASS_COMMON_attrfile)(_CUR._SL)).p=(((CLASS_COMMON_attrfile)(_CUR._SL)).p+(RTS_ENVIRONMENT.rank(((CLASS_COMMON_attrfile)(_CUR._SL)).key)));
                        ;
                        // JavaLine 49 <== SourceLine 1025
                        if(_VALUE((((CLASS_COMMON_attrfile)(_CUR._SL)).key>('(')))) {
                            {
                                // BEGIN INSPECTION 
                                _inspect_1025_4457=RTS_BASICIO.sysout();
                                if(_inspect_1025_4457!=null) { // INSPECT _inspect_1025_4457  type=ref(PRINTFILE)
                                    // JavaLine 55 <== SourceLine 1026
                                    {
                                        // JavaLine 57 <== SourceLine 1025
                                        {
                                            // JavaLine 59 <== SourceLine 1026
                                            _inspect_1025_4457.outtext(new RTS_TXT("???"));
                                            ;
                                            _inspect_1025_4457.outimage();
                                        }
                                    }
                                }
                            } // END INSPECTION
                        }
                        ;
                    }
                } else {
                    // JavaLine 71 <== SourceLine 1028
                    {
                        // JavaLine 73 <== SourceLine 1031
                        if(_VALUE((((CLASS_COMMON_attrfile)(_CUR._SL)).key==(((char)253))))) {
                            {
                                // JavaLine 76 <== SourceLine 1032
                                tlength=new CLASS_COMMON_attrfile_nextNumber((_CUR._SL))._RESULT;
                                ;
                                // JavaLine 79 <== SourceLine 1033
                                ((CLASS_COMMON)(_CUR._SL._SL)).simsymbol=RTS_TXT.sub(((CLASS_COMMON_attrfile)(_CUR._SL)).attrbuffer,(((CLASS_COMMON_attrfile)(_CUR._SL)).p+(1)),tlength);
                                ;
                                // JavaLine 82 <== SourceLine 1034
                                ((CLASS_COMMON_attrfile)(_CUR._SL)).p=(((CLASS_COMMON_attrfile)(_CUR._SL)).p+(tlength));
                                ;
                            }
                        } else {
                            // JavaLine 87 <== SourceLine 1037
                            if(_VALUE((((CLASS_COMMON_attrfile)(_CUR._SL)).key==(((char)255))))) {
                                {
                                    // JavaLine 90 <== SourceLine 1039
                                    {
                                        // BEGIN INSPECTION 
                                        _inspect_1039_4458=((CLASS_COMMON_attrfile)(_CUR._SL)).CURF;
                                        if(_inspect_1039_4458!=null) { // INSPECT _inspect_1039_4458  type=ref(INBYTEFILE)
                                            // JavaLine 95 <== SourceLine 1040
                                            {
                                                // JavaLine 97 <== SourceLine 1039
                                                {
                                                    // JavaLine 99 <== SourceLine 1040
                                                    tlength=new CLASS_COMMON_attrfile_nextNumber((_CUR._SL))._RESULT;
                                                    ;
                                                    ((CLASS_COMMON)(_CUR._SL._SL)).simsymbol=RTS_ENVIRONMENT.blanks(tlength);
                                                    ;
                                                    // JavaLine 104 <== SourceLine 1041
                                                    ((CLASS_COMMON)(_CUR._SL._SL)).simsymbol=_inspect_1039_4458.intext(((CLASS_COMMON)(_CUR._SL._SL)).simsymbol);
                                                    ;
                                                    // JavaLine 107 <== SourceLine 1042
                                                    tlength=((_inspect_1039_4458.inbyte()*(256))+(_inspect_1039_4458.inbyte()));
                                                    ;
                                                    // JavaLine 110 <== SourceLine 1043
                                                    _inspect_1039_4458.intext(RTS_TXT.sub(((CLASS_COMMON_attrfile)(_CUR._SL)).attrbuffer,1,tlength));
                                                    ;
                                                    ((CLASS_COMMON_attrfile)(_CUR._SL)).p=0;
                                                    ;
                                                }
                                            }
                                        }
                                    } // END INSPECTION
                                }
                            } else {
                                // JavaLine 121 <== SourceLine 1045
                                new CLASS_COMMON_attrfile_wrongLayout((_CUR._SL));
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","5 gettext",1,1018,10,1020,13,1019,15,1025,17,1039,34,1020,40,1021,43,1022,46,1023,49,1025,55,1026,57,1025,59,1026,71,1028,73,1031,76,1032,79,1033,82,1034,87,1037,90,1039,95,1040,97,1039,99,1040,104,1041,107,1042,110,1043,121,1045,138,1047);
} // End of Procedure
