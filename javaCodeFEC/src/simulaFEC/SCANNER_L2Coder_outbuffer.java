// JavaLine 1 <== SourceLine 1713
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:22 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCANNER_L2Coder_outbuffer extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=1713, lastLine=1733, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 1714
    public RTS_TXT fname=null;
    // JavaLine 12 <== SourceLine 1716
    public RTS_Printfile _inspect_1716_4481=null;
    // Normal Constructor
    public SCANNER_L2Coder_outbuffer(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCANNER_L2Coder_outbuffer _STM() {
        if(_VALUE((((SCANNER)(_CUR._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('5'))!=(((char)0))))) {
            {
                // BEGIN INSPECTION 
                _inspect_1716_4481=RTS_BASICIO.sysout();
                if(_inspect_1716_4481!=null) { // INSPECT _inspect_1716_4481
                    // JavaLine 30 <== SourceLine 1717
                    {
                        // JavaLine 32 <== SourceLine 1716
                        {
                            // JavaLine 34 <== SourceLine 1717
                            if(_VALUE((_inspect_1716_4481.pos()>(1)))) {
                                _inspect_1716_4481.outimage();
                            }
                            ;
                            // JavaLine 39 <== SourceLine 1718
                            _inspect_1716_4481.outtext(new RTS_TXT(" L2output: (l. "));
                            ;
                            // JavaLine 42 <== SourceLine 1719
                            _inspect_1716_4481.outint(((SCANNER)(_CUR._SL._SL)).linenr,5);
                            ;
                            _inspect_1716_4481.outchar(')');
                            ;
                            // JavaLine 47 <== SourceLine 1720
                            _inspect_1716_4481.outtext(new RTS_TXT(" OPN=EXNM (end buffer), L2p="));
                            ;
                            // JavaLine 50 <== SourceLine 1721
                            _inspect_1716_4481.outint(((SCANNER_L2Coder)(_CUR._SL)).L2p_4,0);
                            ;
                        }
                    }
                }
            } // END INSPECTION
        }
        ;
        // JavaLine 59 <== SourceLine 1723
        RTS_ENVIRONMENT.storeChar('{',((SCANNER_L2Coder)(_CUR._SL)).L2buf_4,((SCANNER_L2Coder)(_CUR._SL)).L2p_4);
            ;
            // JavaLine 62 <== SourceLine 1724
            if(_VALUE((((SCANNER)(_CUR._SL._SL)).L2OUPT==(null)))) {
                // JavaLine 64 <== SourceLine 1725
                {
                    // JavaLine 66 <== SourceLine 1726
                    ((SCANNER_L2Coder)(_CUR._SL)).setaccess(new RTS_TXT("%NOBUFFER"));
                    ;
                    // JavaLine 69 <== SourceLine 1727
                    if(_VALUE((!(((SCANNER_L2Coder)(_CUR._SL)).open())))) {
                        {
                            // JavaLine 72 <== SourceLine 1728
                            fname=((SCANNER_L2Coder)(_CUR._SL)).filename();
                            ;
                            new ERRMSG_openerror((_CUR._SL._SL),fname);
                        }
                    }
                    ;
                    // JavaLine 79 <== SourceLine 1729
                    ((SCANNER)(_CUR._SL._SL)).L2OUPT=((RTS_Outbytefile)(_CUR._SL));
                    ;
                }
            }
            ;
            // JavaLine 85 <== SourceLine 1731
            ((SCANNER_L2Coder)(_CUR._SL)).outtext(((SCANNER_L2Coder)(_CUR._SL)).L2buf_4);
            ;
            // JavaLine 88 <== SourceLine 1732
            ((SCANNER_L2Coder)(_CUR._SL)).L2p_4=0;
            ;
            EBLK();
            return(this);
        } // End of Procedure BODY
        public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCANNER.sim","5 outbuffer",1,1713,10,1714,12,1716,30,1717,32,1716,34,1717,39,1718,42,1719,47,1720,50,1721,59,1723,62,1724,64,1725,66,1726,69,1727,72,1728,79,1729,85,1731,88,1732,93,1733);
    } // End of Procedure
