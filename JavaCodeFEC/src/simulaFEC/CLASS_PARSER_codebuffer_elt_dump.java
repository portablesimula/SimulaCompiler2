// JavaLine 1 <== SourceLine 54
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_codebuffer_elt_dump extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=54, lastLine=61, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public RTS_TXT p_t;
    // Declare locals as attributes
    public int i=0;
    // JavaLine 12 <== SourceLine 55
    public RTS_Printfile _inspect_55_4496=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_PARSER_codebuffer_elt_dump setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_t=(RTS_TXT)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_PARSER_codebuffer_elt_dump(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_PARSER_codebuffer_elt_dump(RTS_RTObject _SL,RTS_TXT sp_t) {
        super(_SL);
        // Parameter assignment to locals
        this.p_t = sp_t;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_codebuffer_elt_dump _STM() {
        {
            // BEGIN INSPECTION 
            _inspect_55_4496=RTS_BASICIO.sysout();
            if(_inspect_55_4496!=null) { // INSPECT _inspect_55_4496  type=ref(PRINTFILE)
                {
                    {
                        i=_inspect_55_4496.pos();
                        ;
                        // JavaLine 50 <== SourceLine 56
                        _inspect_55_4496.outtext(p_t);
                        ;
                        _inspect_55_4496.setpos((i+(8)));
                        ;
                        // JavaLine 55 <== SourceLine 57
                        _inspect_55_4496.outtext(((CLASS_PARSER)(_CUR._SL._SL._SL)).DB.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_PARSER_codebuffer_elt)(_CUR._SL)).opnn)));
                        ;
                        _inspect_55_4496.setpos((i+(20)));
                        ;
                        _inspect_55_4496.outchar('(');
                        ;
                        // JavaLine 62 <== SourceLine 58
                        _inspect_55_4496.outint(RTS_ENVIRONMENT.rank(((CLASS_PARSER_codebuffer_elt)(_CUR._SL)).opdhii),0);
                        ;
                        _inspect_55_4496.outchar(',');
                        ;
                        // JavaLine 67 <== SourceLine 59
                        _inspect_55_4496.outint(RTS_ENVIRONMENT.rank(((CLASS_PARSER_codebuffer_elt)(_CUR._SL)).opdloo),0);
                        ;
                        // JavaLine 70 <== SourceLine 60
                        _inspect_55_4496.outtext(CONC(new RTS_TXT(")="),new CLASS_COMMON_nameof((_CUR._SL._SL._SL),((CLASS_PARSER_codebuffer_elt)(_CUR._SL)).opdhii,((CLASS_PARSER_codebuffer_elt)(_CUR._SL)).opdloo)._RESULT));
                        ;
                        _inspect_55_4496.outimage();
                        ;
                    }
                }
            }
        } // END INSPECTION
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 dump",1,54,12,55,50,56,55,57,62,58,67,59,70,60,81,61);
} // End of Procedure
