// JavaLine 1 <== SourceLine 1017
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:19 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class COMMON_attrfile_gettext extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1017, lastLine=1046, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 10 <== SourceLine 1019
    final RTS_LABEL _LABEL_COMMON_attrfile_gettext_REP_0=new RTS_LABEL(this,0,1,"REP"); // Local Label #1=REP At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 13 <== SourceLine 1018
    public int tlength=0;
    // JavaLine 15 <== SourceLine 1024
    public RTS_Printfile _inspect_1024_4457=null;
    // JavaLine 17 <== SourceLine 1038
    public RTS_Inbytefile _inspect_1038_4458=null;
    // Normal Constructor
    public COMMON_attrfile_gettext(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public COMMON_attrfile_gettext _STM() {
        COMMON_attrfile_gettext _THIS=(COMMON_attrfile_gettext)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 34 <== SourceLine 1019
                {
                    _SIM_LABEL(1); // DeclaredIn: gettext
                    new COMMON_attrfile_nextKey((_CUR._SL));
                }
                ;
                // JavaLine 40 <== SourceLine 1020
                if(_VALUE((((COMMON_attrfile)(_CUR._SL)).key<(((char)240))))) {
                    {
                        // JavaLine 43 <== SourceLine 1021
                        ((COMMON)(_CUR._SL._SL)).simsymbol=RTS_TXT.sub(((COMMON_attrfile)(_CUR._SL)).attrbuffer,(((COMMON_attrfile)(_CUR._SL)).p+(1)),RTS_ENVIRONMENT.rank(((COMMON_attrfile)(_CUR._SL)).key));
                        ;
                        // JavaLine 46 <== SourceLine 1022
                        ((COMMON_attrfile)(_CUR._SL)).p=(((COMMON_attrfile)(_CUR._SL)).p+(RTS_ENVIRONMENT.rank(((COMMON_attrfile)(_CUR._SL)).key)));
                        ;
                        // JavaLine 49 <== SourceLine 1024
                        if(_VALUE((((COMMON_attrfile)(_CUR._SL)).key>('(')))) {
                            {
                                // BEGIN INSPECTION 
                                _inspect_1024_4457=RTS_BASICIO.sysout();
                                if(_inspect_1024_4457!=null) { // INSPECT _inspect_1024_4457
                                    // JavaLine 55 <== SourceLine 1025
                                    {
                                        // JavaLine 57 <== SourceLine 1024
                                        {
                                            // JavaLine 59 <== SourceLine 1025
                                            _inspect_1024_4457.outtext(new RTS_TXT("???"));
                                            ;
                                            _inspect_1024_4457.outimage();
                                        }
                                    }
                                }
                            } // END INSPECTION
                        }
                        ;
                    }
                } else {
                    // JavaLine 71 <== SourceLine 1027
                    {
                        // JavaLine 73 <== SourceLine 1030
                        if(_VALUE((((COMMON_attrfile)(_CUR._SL)).key==(((char)253))))) {
                            {
                                // JavaLine 76 <== SourceLine 1031
                                tlength=new COMMON_attrfile_nextNumber((_CUR._SL))._RESULT;
                                ;
                                // JavaLine 79 <== SourceLine 1032
                                ((COMMON)(_CUR._SL._SL)).simsymbol=RTS_TXT.sub(((COMMON_attrfile)(_CUR._SL)).attrbuffer,(((COMMON_attrfile)(_CUR._SL)).p+(1)),tlength);
                                ;
                                // JavaLine 82 <== SourceLine 1033
                                ((COMMON_attrfile)(_CUR._SL)).p=(((COMMON_attrfile)(_CUR._SL)).p+(tlength));
                                ;
                            }
                        } else {
                            // JavaLine 87 <== SourceLine 1036
                            if(_VALUE((((COMMON_attrfile)(_CUR._SL)).key==(((char)255))))) {
                                {
                                    // JavaLine 90 <== SourceLine 1038
                                    {
                                        // BEGIN INSPECTION 
                                        _inspect_1038_4458=((COMMON_attrfile)(_CUR._SL)).CURF;
                                        if(_inspect_1038_4458!=null) { // INSPECT _inspect_1038_4458
                                            // JavaLine 95 <== SourceLine 1039
                                            {
                                                // JavaLine 97 <== SourceLine 1038
                                                {
                                                    // JavaLine 99 <== SourceLine 1039
                                                    tlength=new COMMON_attrfile_nextNumber((_CUR._SL))._RESULT;
                                                    ;
                                                    ((COMMON)(_CUR._SL._SL)).simsymbol=RTS_ENVIRONMENT.blanks(tlength);
                                                    ;
                                                    // JavaLine 104 <== SourceLine 1040
                                                    ((COMMON)(_CUR._SL._SL)).simsymbol=_inspect_1038_4458.intext(((COMMON)(_CUR._SL._SL)).simsymbol);
                                                    ;
                                                    // JavaLine 107 <== SourceLine 1041
                                                    tlength=((_inspect_1038_4458.inbyte()*(256))+(_inspect_1038_4458.inbyte()));
                                                    ;
                                                    // JavaLine 110 <== SourceLine 1042
                                                    _inspect_1038_4458.intext(RTS_TXT.sub(((COMMON_attrfile)(_CUR._SL)).attrbuffer,1,tlength));
                                                    ;
                                                    ((COMMON_attrfile)(_CUR._SL)).p=0;
                                                    ;
                                                }
                                            }
                                        }
                                    } // END INSPECTION
                                }
                            } else {
                                // JavaLine 121 <== SourceLine 1044
                                new COMMON_attrfile_wrongLayout((_CUR._SL));
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","5 gettext",1,1017,10,1019,13,1018,15,1024,17,1038,34,1019,40,1020,43,1021,46,1022,49,1024,55,1025,57,1024,59,1025,71,1027,73,1030,76,1031,79,1032,82,1033,87,1036,90,1038,95,1039,97,1038,99,1039,104,1040,107,1041,110,1042,121,1044,138,1046);
} // End of Procedure
