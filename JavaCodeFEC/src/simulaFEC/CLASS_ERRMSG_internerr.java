// JavaLine 1 <== SourceLine 314
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:47 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_ERRMSG_internerr extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=314, lastLine=346, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public char p_module;
    public int p_lnr;
    // Declare locals as attributes
    // JavaLine 12 <== SourceLine 316
    public RTS_TXT modname=null;
    // JavaLine 14 <== SourceLine 317
    public RTS_Printfile _inspect_317_4462=null;
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
                _inspect_317_4462=RTS_BASICIO.sysout();
                if(_inspect_317_4462!=null) { // INSPECT _inspect_317_4462  type=ref(PRINTFILE)
                    // JavaLine 51 <== SourceLine 318
                    {
                        // JavaLine 53 <== SourceLine 317
                        {
                            // JavaLine 55 <== SourceLine 318
                            _inspect_317_4462.outimage();
                            ;
                            // JavaLine 58 <== SourceLine 319
                            if(p_module<((char)0) || p_module>((char)18)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                            switch(p_module) { // BEGIN SWITCH STATEMENT
                                case 0: 
                                // JavaLine 62 <== SourceLine 320
                                modname=new RTS_TXT("COMMON");
                                break;
                                case 1: 
                                // JavaLine 66 <== SourceLine 321
                                modname=new RTS_TXT("ERRMSG");
                                break;
                                case 2: 
                                // JavaLine 70 <== SourceLine 322
                                modname=new RTS_TXT("SCANNER");
                                break;
                                case 3: 
                                // JavaLine 74 <== SourceLine 323
                                modname=new RTS_TXT("SCANINP");
                                break;
                                case 4: 
                                // JavaLine 78 <== SourceLine 324
                                modname=new RTS_TXT("PARSER");
                                break;
                                case 5: 
                                // JavaLine 82 <== SourceLine 325
                                modname=new RTS_TXT("PAS1INIT");
                                break;
                                case 6: 
                                // JavaLine 86 <== SourceLine 326
                                modname=new RTS_TXT("BUILDER1");
                                break;
                                case 7: 
                                // JavaLine 90 <== SourceLine 327
                                modname=new RTS_TXT("BUILDER2");
                                break;
                                case 8: 
                                // JavaLine 94 <== SourceLine 328
                                modname=new RTS_TXT("CHECKER1");
                                break;
                                case 9: 
                                // JavaLine 98 <== SourceLine 329
                                modname=new RTS_TXT("CHECKER2");
                                break;
                                case 10: 
                                // JavaLine 102 <== SourceLine 330
                                modname=new RTS_TXT("SCODER0");
                                break;
                                case 11: 
                                // JavaLine 106 <== SourceLine 331
                                modname=new RTS_TXT("SCODER1");
                                break;
                                case 12: 
                                // JavaLine 110 <== SourceLine 332
                                modname=new RTS_TXT("SCODER1E");
                                break;
                                case 13: 
                                // JavaLine 114 <== SourceLine 333
                                modname=new RTS_TXT("SCODER2");
                                break;
                                case 14: 
                                // JavaLine 118 <== SourceLine 334
                                modname=new RTS_TXT("SCODER3");
                                break;
                                case 15: 
                                // JavaLine 122 <== SourceLine 335
                                modname=new RTS_TXT("SCODER4");
                                break;
                                case 16: 
                                // JavaLine 126 <== SourceLine 336
                                modname=new RTS_TXT("PAS2INIT");
                                break;
                                case 17: 
                                // JavaLine 130 <== SourceLine 337
                                modname=new RTS_TXT("SCODMAIN");
                                break;
                                case 18: 
                                // JavaLine 134 <== SourceLine 338
                                modname=new RTS_TXT("FECMAIN");
                                break;
                            } // END SWITCH STATEMENT
                            ;
                            // JavaLine 139 <== SourceLine 340
                            modname=CONC(CONC(new RTS_TXT("*** Internal error in "),modname),new RTS_TXT(", line "));
                            ;
                            // JavaLine 142 <== SourceLine 341
                            _inspect_317_4462.outtext(modname);
                            ;
                            _inspect_317_4462.outint(p_lnr,0);
                            ;
                            // JavaLine 147 <== SourceLine 342
                            _inspect_317_4462.outtext(new RTS_TXT(", compiling source line "));
                            ;
                            _inspect_317_4462.outint(((CLASS_ERRMSG)(_CUR._SL)).linenr,0);
                            ;
                            // JavaLine 152 <== SourceLine 343
                            _inspect_317_4462.outimage();
                            ;
                        }
                    }
                }
            } // END INSPECTION
        }
        ;
        // JavaLine 161 <== SourceLine 345
        new CLASS_ERRMSG_AbortCompilation((_CUR._SL));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_ERRMSG.sim","5 internerr",1,314,12,316,14,317,51,318,53,317,55,318,58,319,62,320,66,321,70,322,74,323,78,324,82,325,86,326,90,327,94,328,98,329,102,330,106,331,110,332,114,333,118,334,122,335,126,336,130,337,134,338,139,340,142,341,147,342,152,343,161,345,166,346);
} // End of Procedure
