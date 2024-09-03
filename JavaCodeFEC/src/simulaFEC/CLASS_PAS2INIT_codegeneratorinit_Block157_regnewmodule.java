// JavaLine 1 <== SourceLine 159
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:53 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PAS2INIT_codegeneratorinit_Block157_regnewmodule extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=159, lastLine=173, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public RTS_TXT p_n;
    public RTS_TXT p_cc;
    public int p_numtag;
    // Declare locals as attributes
    // JavaLine 15 <== SourceLine 162
    public int i=0;
    // JavaLine 17 <== SourceLine 159
    public CLASS_BUILDER1_visiblegenerator_module _RESULT=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_PAS2INIT_codegeneratorinit_Block157_regnewmodule setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 3: p_n=(RTS_TXT)objectValue(param); break;
                case 2: p_cc=(RTS_TXT)objectValue(param); break;
                case 1: p_numtag=intValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_PAS2INIT_codegeneratorinit_Block157_regnewmodule(RTS_RTObject _SL) {
        super(_SL,3); // Expecting 3 parameters
    }
    // Normal Constructor
    public CLASS_PAS2INIT_codegeneratorinit_Block157_regnewmodule(RTS_RTObject _SL,RTS_TXT sp_n,RTS_TXT sp_cc,int sp_numtag) {
        super(_SL);
        // Parameter assignment to locals
        this.p_n = sp_n;
        this.p_cc = sp_cc;
        this.p_numtag = sp_numtag;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PAS2INIT_codegeneratorinit_Block157_regnewmodule _STM() {
        // JavaLine 51 <== SourceLine 163
        i=1;
        ;
        // JavaLine 54 <== SourceLine 164
        while((i<=(((CLASS_PAS2INIT_codegeneratorinit_Block157)(_CUR._SL)).nxtindex))) {
            {
                // JavaLine 57 <== SourceLine 165
                if(_VALUE(RTS_UTIL._TXTREL_EQ(((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL._SL)).moduletab.getELEMENT(i).p_rtsmoduleid,p_n))) {
                    // JavaLine 59 <== SourceLine 166
                    new CLASS_ERRMSG_fatal0((_CUR._SL._SL._SL),242);
                }
                ;
                // JavaLine 63 <== SourceLine 167
                i=(i+(1));
                ;
            }
        }
        ;
        // JavaLine 69 <== SourceLine 169
        ((CLASS_PAS2INIT_codegeneratorinit_Block157)(_CUR._SL)).nxtindex=(((CLASS_PAS2INIT_codegeneratorinit_Block157)(_CUR._SL)).nxtindex+(1));
        ;
        // JavaLine 72 <== SourceLine 170
        _RESULT=((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL._SL)).moduletab.putELEMENT(((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL._SL)).moduletab.index(((CLASS_PAS2INIT_codegeneratorinit_Block157)(_CUR._SL)).nxtindex),new CLASS_BUILDER1_visiblegenerator_module((_CUR._SL._SL),p_n,p_cc,p_numtag,(((CLASS_PAS2INIT)(_CUR._SL._SL._SL)).lastusedtag_6+(1)))._STM());
        ;
        // JavaLine 75 <== SourceLine 172
        new CLASS_BUILDER1_newTags((_CUR._SL._SL._SL),p_numtag);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PAS2INIT.sim","5 regnewmodule",1,159,15,162,17,159,51,163,54,164,57,165,59,166,63,167,69,169,72,170,75,172,80,173);
} // End of Procedure
