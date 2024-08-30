// JavaLine 1 <== SourceLine 319
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:26 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_ERRMSG_internerr extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=319, lastLine=351, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public char p_module;
    public int p_lnr;
    // Declare locals as attributes
    // JavaLine 12 <== SourceLine 321
    public RTS_TXT modname=null;
    // JavaLine 14 <== SourceLine 322
    public RTS_Printfile _inspect_322_4462=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_ERRMSG_internerr setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 2: p_module=(char)objectValue(param); break;
                case 1: p_lnr=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_ERRMSG_internerr(RTS_RTObject _SL) {
        super(_SL,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public CLASS_ERRMSG_internerr(RTS_RTObject _SL,char sp_module,int sp_lnr) {
        super(_SL);
        // Parameter assignment to locals
        this.p_module = sp_module;
        this.p_lnr = sp_lnr;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_ERRMSG_internerr _STM() {
        if(_VALUE((((CLASS_ERRMSG)(_CUR._SL)).numerrfound==(0)))) {
            {
                // BEGIN INSPECTION 
                _inspect_322_4462=RTS_BASICIO.sysout();
                if(_inspect_322_4462!=null) { // INSPECT _inspect_322_4462  type=ref(PRINTFILE)
                    // JavaLine 51 <== SourceLine 323
                    {
                        // JavaLine 53 <== SourceLine 322
                        {
                            // JavaLine 55 <== SourceLine 323
                            _inspect_322_4462.outimage();
                            ;
                            // JavaLine 58 <== SourceLine 324
                            if(p_module<((char)0) || p_module>((char)18)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                            switch(p_module) { // BEGIN SWITCH STATEMENT
                                case 0: 
                                // JavaLine 62 <== SourceLine 325
                                modname=new RTS_TXT("COMMON");
                                break;
                                case 1: 
                                // JavaLine 66 <== SourceLine 326
                                modname=new RTS_TXT("ERRMSG");
                                break;
                                case 2: 
                                // JavaLine 70 <== SourceLine 327
                                modname=new RTS_TXT("SCANNER");
                                break;
                                case 3: 
                                // JavaLine 74 <== SourceLine 328
                                modname=new RTS_TXT("SCANINP");
                                break;
                                case 4: 
                                // JavaLine 78 <== SourceLine 329
                                modname=new RTS_TXT("PARSER");
                                break;
                                case 5: 
                                // JavaLine 82 <== SourceLine 330
                                modname=new RTS_TXT("PAS1INIT");
                                break;
                                case 6: 
                                // JavaLine 86 <== SourceLine 331
                                modname=new RTS_TXT("BUILDER1");
                                break;
                                case 7: 
                                // JavaLine 90 <== SourceLine 332
                                modname=new RTS_TXT("BUILDER2");
                                break;
                                case 8: 
                                // JavaLine 94 <== SourceLine 333
                                modname=new RTS_TXT("CHECKER1");
                                break;
                                case 9: 
                                // JavaLine 98 <== SourceLine 334
                                modname=new RTS_TXT("CHECKER2");
                                break;
                                case 10: 
                                // JavaLine 102 <== SourceLine 335
                                modname=new RTS_TXT("SCODER0");
                                break;
                                case 11: 
                                // JavaLine 106 <== SourceLine 336
                                modname=new RTS_TXT("SCODER1");
                                break;
                                case 12: 
                                // JavaLine 110 <== SourceLine 337
                                modname=new RTS_TXT("SCODER1E");
                                break;
                                case 13: 
                                // JavaLine 114 <== SourceLine 338
                                modname=new RTS_TXT("SCODER2");
                                break;
                                case 14: 
                                // JavaLine 118 <== SourceLine 339
                                modname=new RTS_TXT("SCODER3");
                                break;
                                case 15: 
                                // JavaLine 122 <== SourceLine 340
                                modname=new RTS_TXT("SCODER4");
                                break;
                                case 16: 
                                // JavaLine 126 <== SourceLine 341
                                modname=new RTS_TXT("PAS2INIT");
                                break;
                                case 17: 
                                // JavaLine 130 <== SourceLine 342
                                modname=new RTS_TXT("SCODMAIN");
                                break;
                                case 18: 
                                // JavaLine 134 <== SourceLine 343
                                modname=new RTS_TXT("FECMAIN");
                                break;
                            } // END SWITCH STATEMENT
                            ;
                            // JavaLine 139 <== SourceLine 345
                            modname=CONC(CONC(new RTS_TXT("*** Internal error in "),modname),new RTS_TXT(", line "));
                            ;
                            // JavaLine 142 <== SourceLine 346
                            _inspect_322_4462.outtext(modname);
                            ;
                            _inspect_322_4462.outint(p_lnr,0);
                            ;
                            // JavaLine 147 <== SourceLine 347
                            _inspect_322_4462.outtext(new RTS_TXT(", compiling source line "));
                            ;
                            _inspect_322_4462.outint(((CLASS_ERRMSG)(_CUR._SL)).linenr,0);
                            ;
                            // JavaLine 152 <== SourceLine 348
                            _inspect_322_4462.outimage();
                            ;
                        }
                    }
                }
            } // END INSPECTION
        }
        ;
        // JavaLine 161 <== SourceLine 350
        new CLASS_ERRMSG_AbortCompilation((_CUR._SL));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_ERRMSG.sim","5 internerr",1,319,12,321,14,322,51,323,53,322,55,323,58,324,62,325,66,326,70,327,74,328,78,329,82,330,86,331,90,332,94,333,98,334,102,335,106,336,110,337,114,338,118,339,122,340,126,341,130,342,134,343,139,345,142,346,147,347,152,348,161,350,166,351);
} // End of Procedure
