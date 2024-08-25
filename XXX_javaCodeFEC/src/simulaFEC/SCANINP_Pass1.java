// JavaLine 1 <== SourceLine 32
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCANINP_Pass1 extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=32, lastLine=87, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 12 <== SourceLine 35
    public char c=0;
    // JavaLine 14 <== SourceLine 36
    public int i=0;
    public int j=0;
    public int l=0;
    // JavaLine 18 <== SourceLine 37
    public RTS_TXT t=null;
    // JavaLine 20 <== SourceLine 62
    public RTS_Inbytefile _inspect_62_4495=null;
    // JavaLine 22 <== SourceLine 32
    public int _RESULT=0;
    // Normal Constructor
    public SCANINP_Pass1(RTS_RTObject _SL) {
        super(_SL);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCANINP_Pass1 _STM() {
        // JavaLine 35 <== SourceLine 39
        call(((SCANINP)(_CUR._SL)).scanner,39);
        ;
        // JavaLine 38 <== SourceLine 41
        ((SCANINP)(_CUR._SL)).optx=((SCANINP)(_CUR._SL)).opdhi=((SCANINP)(_CUR._SL)).opdlo=((SCANINP)(_CUR._SL)).optx=((char)0);
        ;
        // JavaLine 41 <== SourceLine 42
        _RESULT=((SCANINP)(_CUR._SL)).linenr;
        ;
        // JavaLine 44 <== SourceLine 43
        ((SCANINP)(_CUR._SL)).line=((SCANINP)(_CUR._SL)).listpart=new RTS_TXT("-- after Source End-of-File --");
        ;
        // JavaLine 47 <== SourceLine 44
        ((SCANINP)(_CUR._SL)).linelength=30;
        ;
        // JavaLine 50 <== SourceLine 45
        if(_VALUE((((SCANINP)(_CUR._SL)).maxnumoftags>(0)))) {
            {
                // JavaLine 53 <== SourceLine 46
                t=new COMMON_leftint((_CUR._SL),((SCANINP)(_CUR._SL)).maxnumoftags)._RESULT;
                ;
                new ERRMSG_error1((_CUR._SL),-367,t);
                ;
                // JavaLine 58 <== SourceLine 47
                while((((SCANINP)(_CUR._SL)).maxnumoftags>(0))) {
                    {
                        ((SCANINP)(_CUR._SL)).maxnumoftags=(((SCANINP)(_CUR._SL)).maxnumoftags-(1));
                        ;
                        // JavaLine 63 <== SourceLine 48
                        ((SCANINP)(_CUR._SL)).parser.cs=((SCANINP)(_CUR._SL)).opt=((char)16);
                        ;
                        ((SCANINP)(_CUR._SL)).parser.getopt=false;
                        ;
                        call(((SCANINP)(_CUR._SL)).parser,48);
                        ;
                        // JavaLine 70 <== SourceLine 49
                        ((SCANINP)(_CUR._SL)).optx=((SCANINP)(_CUR._SL)).opdhi=((SCANINP)(_CUR._SL)).opdlo=((SCANINP)(_CUR._SL)).optx=((char)0);
                    }
                }
                ;
            }
        }
        ;
        // JavaLine 78 <== SourceLine 51
        ((SCANINP)(_CUR._SL)).parser.cs=((SCANINP)(_CUR._SL)).opt='X';
        ;
        ((SCANINP)(_CUR._SL)).parser.getopt=false;
        ;
        call(((SCANINP)(_CUR._SL)).parser,51);
        ;
        // JavaLine 85 <== SourceLine 54
        new SCANNER_ClosePass1((_CUR._SL));
        ;
        // JavaLine 88 <== SourceLine 55
        if(_VALUE((((SCANINP)(_CUR._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('O'))!=(((char)0))))) {
            // JavaLine 90 <== SourceLine 56
            {
                RTS_BASICIO.sysout().outimage();
                ;
                RTS_BASICIO.sysout().outtext(new RTS_TXT("*** END PASS 1 *** - "));
                ;
                // JavaLine 96 <== SourceLine 57
                RTS_BASICIO.sysout().outint(((SCANINP)(_CUR._SL)).linenr,6);
                ;
                RTS_BASICIO.sysout().outtext(new RTS_TXT(" lines"));
                ;
                // JavaLine 101 <== SourceLine 60
                RTS_BASICIO.sysout().outimage();
                ;
            }
        }
        ;
        // JavaLine 107 <== SourceLine 62
        if(_VALUE((((SCANINP)(_CUR._SL)).L2OUPT!=(null)))) {
            {
                // BEGIN INSPECTION 
                _inspect_62_4495=new RTS_Inbytefile(_CTX,((SCANINP)(_CUR._SL)).L2NAME)._STM();
                if(_inspect_62_4495!=null) { // INSPECT _inspect_62_4495
                    // JavaLine 113 <== SourceLine 63
                    {
                        // JavaLine 115 <== SourceLine 62
                        {
                            // JavaLine 117 <== SourceLine 64
                            _inspect_62_4495.setaccess(new RTS_TXT("%NOBUFFER"));
                            ;
                            // JavaLine 120 <== SourceLine 65
                            if(_VALUE((!(_inspect_62_4495.open())))) {
                                {
                                    // JavaLine 123 <== SourceLine 66
                                    ((SCANINP)(_CUR._SL)).L2NAME=CONC(new RTS_TXT("PASS 2 Input: "),((SCANINP)(_CUR._SL)).L2NAME);
                                    ;
                                    new ERRMSG_openerror((_CUR._SL),((SCANINP)(_CUR._SL)).L2NAME);
                                }
                            }
                            ;
                            // JavaLine 130 <== SourceLine 67
                            ((SCANINP)(_CUR._SL)).L2INPT=((RTS_Inbytefile)_inspect_62_4495);
                            ;
                            _inspect_62_4495.intext(((SCANINP)(_CUR._SL)).L2codebuffer);
                            ;
                        }
                    }
                }
            } // END INSPECTION
        }
        ;
        // JavaLine 141 <== SourceLine 69
        ((SCANINP)(_CUR._SL)).L2OUPT=null;
        ;
        // JavaLine 144 <== SourceLine 70
        ((SCANINP)(_CUR._SL)).currentpass='2';
        ;
        ((SCANINP)(_CUR._SL)).linenr=0;
        ;
        // JavaLine 149 <== SourceLine 71
        if(_VALUE(TRF_EQ(((SCANINP)(_CUR._SL)).nscodename,null))) {
            // JavaLine 151 <== SourceLine 72
            new ERRMSG_openerror((_CUR._SL),new RTS_TXT(" *** SCRATCH FILE (S-code) ***"));
        }
        ;
        // JavaLine 155 <== SourceLine 73
        ((SCANINP)(_CUR._SL)).unknowns=new COMMON_brecord((_CUR._SL))._STM();
        ;
        // JavaLine 158 <== SourceLine 74
        ((SCANINP)(_CUR._SL)).unknowns.kind=((char)8);
        ;
        // JavaLine 161 <== SourceLine 75
        ((SCANINP)(_CUR._SL)).setprefgoing=new COMMON_quantity((_CUR._SL))._STM();
        ;
        ((SCANINP)(_CUR._SL)).alloc2called=new COMMON_quantity((_CUR._SL))._STM();
        ;
        // JavaLine 166 <== SourceLine 76
        ((SCANINP)(_CUR._SL)).setprefgoing.symb_1=((SCANINP)(_CUR._SL)).alloc2called.symb_1=new COMMON_boxof((_CUR._SL),((char)0),'J')._RESULT;
        ;
        // JavaLine 169 <== SourceLine 78
        new COMMON_QTRC((_CUR._SL),new RTS_TXT("SCANINP"),78,new RTS_TXT("NEW Quantity: "),((SCANINP)(_CUR._SL)).setprefgoing);
        ;
        // JavaLine 172 <== SourceLine 79
        new COMMON_QTRC((_CUR._SL),new RTS_TXT("SCANINP"),79,new RTS_TXT("NEW Quantity: "),((SCANINP)(_CUR._SL)).alloc2called);
        ;
        // JavaLine 175 <== SourceLine 80
        ((SCANINP)(_CUR._SL)).setprefgoing.encl_1=((SCANINP)(_CUR._SL)).alloc2called.encl_1=((SCANINP)(_CUR._SL)).unknowns;
        ;
        // JavaLine 178 <== SourceLine 82
        ((SCANINP)(_CUR._SL)).unknowns.declquant=((SCANINP)(_CUR._SL)).setprefgoing;
        ;
        ((SCANINP)(_CUR._SL)).setprefgoing.descr_1=((SCANINP)(_CUR._SL)).unknowns;
        ;
        // JavaLine 183 <== SourceLine 84
        ((SCANINP)(_CUR._SL)).progheadstring=RTS_ENVIRONMENT.getTextInfo(13);
        ;
        // JavaLine 186 <== SourceLine 85
        ((SCANINP)(_CUR._SL)).progheadstring=CONC(CONC(RTS_TXT.sub(((SCANINP)(_CUR._SL)).timestamp,1,23),new RTS_TXT("S-port 108.1")),((SCANINP)(_CUR._SL)).progheadstring);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCANINP.sim","5 Pass1",1,32,12,35,14,36,18,37,20,62,22,32,35,39,38,41,41,42,44,43,47,44,50,45,53,46,58,47,63,48,70,49,78,51,85,54,88,55,90,56,96,57,101,60,107,62,113,63,115,62,117,64,120,65,123,66,130,67,141,69,144,70,149,71,151,72,155,73,158,74,161,75,166,76,169,78,172,79,175,80,178,82,183,84,186,85,191,87);
} // End of Procedure
