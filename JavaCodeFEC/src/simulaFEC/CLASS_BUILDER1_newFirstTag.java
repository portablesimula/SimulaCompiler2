// JavaLine 1 <== SourceLine 99
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:30 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_BUILDER1_newFirstTag extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=2, firstLine=99, lastLine=122, hasLocalClasses=false, System=false
    @Override
public Object _RESULT() { return(_RESULT); }
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_q;
    // Declare locals as attributes
    public int _RESULT=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_BUILDER1_newFirstTag setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_q=(CLASS_COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_BUILDER1_newFirstTag(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_BUILDER1_newFirstTag(RTS_RTObject _SL,CLASS_COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_BUILDER1_newFirstTag _STM() {
        // JavaLine 42 <== SourceLine 100
        _RESULT=((CLASS_BUILDER1)(_CUR._SL)).lastusedtag_6=(((CLASS_BUILDER1)(_CUR._SL)).lastusedtag_6+(1));
        ;
        // JavaLine 45 <== SourceLine 101
        ((CLASS_BUILDER1)(_CUR._SL)).TAGTAB.ident.putELEMENT(((CLASS_BUILDER1)(_CUR._SL)).TAGTAB.ident.index(((CLASS_BUILDER1)(_CUR._SL)).lastusedtag_6),new CLASS_BUILDER1_uniqueTagid((_CUR._SL),new CLASS_COMMON_quantity_ident(p_q)._RESULT)._RESULT);
        ;
        // JavaLine 48 <== SourceLine 102
        new CLASS_COMMON_TRC((_CUR._SL),new RTS_TXT("BUILDER1"),102,CONC(CONC(CONC(CONC(CONC(new RTS_TXT("newFirstTag "),((RTS_TEXT_ARRAY)((CLASS_BUILDER1)(_CUR._SL)).TAGTAB.ident).getELEMENT(((CLASS_BUILDER1)(_CUR._SL)).lastusedtag_6)),new RTS_TXT(" = ")),RTS_ENVIRONMENT.edit(((CLASS_BUILDER1)(_CUR._SL)).lastusedtag_6)),new RTS_TXT(", q.kind = ")),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(p_q.kind_1))));
        ;
        // JavaLine 51 <== SourceLine 103
        if(_VALUE((p_q.kind_1==(((char)8))))) {
            {
                // JavaLine 54 <== SourceLine 104
                ((CLASS_BUILDER1)(_CUR._SL)).TAGTAB.ident.putELEMENT(((CLASS_BUILDER1)(_CUR._SL)).TAGTAB.ident.index((((CLASS_BUILDER1)(_CUR._SL)).lastusedtag_6+(1))),new CLASS_BUILDER1_uniqueTagid((_CUR._SL),CONC(new CLASS_COMMON_quantity_ident(p_q)._RESULT,new RTS_TXT("'prototype")))._RESULT);
                ;
                // JavaLine 57 <== SourceLine 105
                new CLASS_COMMON_TRC((_CUR._SL),new RTS_TXT("BUILDER1"),105,CONC(CONC(CONC(new RTS_TXT("newFirstTag "),((RTS_TEXT_ARRAY)((CLASS_BUILDER1)(_CUR._SL)).TAGTAB.ident).getELEMENT(((CLASS_BUILDER1)(_CUR._SL)).lastusedtag_6)),new RTS_TXT(" = ")),RTS_ENVIRONMENT.edit((((CLASS_BUILDER1)(_CUR._SL)).lastusedtag_6+(1)))));
                ;
                // JavaLine 60 <== SourceLine 106
                ((CLASS_BUILDER1)(_CUR._SL)).TAGTAB.ident.putELEMENT(((CLASS_BUILDER1)(_CUR._SL)).TAGTAB.ident.index((((CLASS_BUILDER1)(_CUR._SL)).lastusedtag_6+(2))),new CLASS_BUILDER1_uniqueTagid((_CUR._SL),CONC(new CLASS_COMMON_quantity_ident(p_q)._RESULT,new RTS_TXT("'cnt")))._RESULT);
                ;
                // JavaLine 63 <== SourceLine 107
                new CLASS_COMMON_TRC((_CUR._SL),new RTS_TXT("BUILDER1"),107,CONC(CONC(CONC(new RTS_TXT("newFirstTag "),((RTS_TEXT_ARRAY)((CLASS_BUILDER1)(_CUR._SL)).TAGTAB.ident).getELEMENT(((CLASS_BUILDER1)(_CUR._SL)).lastusedtag_6)),new RTS_TXT(" = ")),RTS_ENVIRONMENT.edit((((CLASS_BUILDER1)(_CUR._SL)).lastusedtag_6+(2)))));
                ;
                // JavaLine 66 <== SourceLine 108
                ((CLASS_BUILDER1)(_CUR._SL)).lastusedtag_6=(((CLASS_BUILDER1)(_CUR._SL)).lastusedtag_6+(1));
                ;
            }
        } else {
            // JavaLine 71 <== SourceLine 109
            if(_VALUE((p_q.kind_1==(((char)1))))) {
                {
                    // JavaLine 74 <== SourceLine 110
                    ((CLASS_BUILDER1)(_CUR._SL)).TAGTAB.ident.putELEMENT(((CLASS_BUILDER1)(_CUR._SL)).TAGTAB.ident.index((((CLASS_BUILDER1)(_CUR._SL)).lastusedtag_6+(1))),new CLASS_BUILDER1_uniqueTagid((_CUR._SL),CONC(new CLASS_COMMON_quantity_ident(p_q)._RESULT,new RTS_TXT("'prototype")))._RESULT);
                    ;
                    // JavaLine 77 <== SourceLine 111
                    new CLASS_COMMON_TRC((_CUR._SL),new RTS_TXT("BUILDER1"),111,CONC(CONC(CONC(new RTS_TXT("newFirstTag "),((RTS_TEXT_ARRAY)((CLASS_BUILDER1)(_CUR._SL)).TAGTAB.ident).getELEMENT(((CLASS_BUILDER1)(_CUR._SL)).lastusedtag_6)),new RTS_TXT(" = ")),RTS_ENVIRONMENT.edit((((CLASS_BUILDER1)(_CUR._SL)).lastusedtag_6+(1)))));
                    ;
                    // JavaLine 80 <== SourceLine 112
                    ((CLASS_BUILDER1)(_CUR._SL)).TAGTAB.ident.putELEMENT(((CLASS_BUILDER1)(_CUR._SL)).TAGTAB.ident.index((((CLASS_BUILDER1)(_CUR._SL)).lastusedtag_6+(2))),new CLASS_BUILDER1_uniqueTagid((_CUR._SL),CONC(new CLASS_COMMON_quantity_ident(p_q)._RESULT,new RTS_TXT("'start")))._RESULT);
                    ;
                    // JavaLine 83 <== SourceLine 113
                    new CLASS_COMMON_TRC((_CUR._SL),new RTS_TXT("BUILDER1"),113,CONC(CONC(CONC(new RTS_TXT("newFirstTag "),((RTS_TEXT_ARRAY)((CLASS_BUILDER1)(_CUR._SL)).TAGTAB.ident).getELEMENT(((CLASS_BUILDER1)(_CUR._SL)).lastusedtag_6)),new RTS_TXT(" = ")),RTS_ENVIRONMENT.edit((((CLASS_BUILDER1)(_CUR._SL)).lastusedtag_6+(2)))));
                    ;
                }
            } else {
                // JavaLine 88 <== SourceLine 114
                if(_VALUE((((p_q.kind_1==(((char)5)))||((p_q.kind_1==(((char)9)))))||((p_q.kind_1==(((char)7))))))) {
                    {
                        // JavaLine 91 <== SourceLine 115
                        ((CLASS_BUILDER1)(_CUR._SL)).TAGTAB.ident.putELEMENT(((CLASS_BUILDER1)(_CUR._SL)).TAGTAB.ident.index((((CLASS_BUILDER1)(_CUR._SL)).lastusedtag_6+(1))),new CLASS_BUILDER1_uniqueTagid((_CUR._SL),CONC(new CLASS_COMMON_quantity_ident(p_q)._RESULT,new RTS_TXT("'prototype")))._RESULT);
                        ;
                        // JavaLine 94 <== SourceLine 116
                        ((CLASS_BUILDER1)(_CUR._SL)).TAGTAB.ident.putELEMENT(((CLASS_BUILDER1)(_CUR._SL)).TAGTAB.ident.index((((CLASS_BUILDER1)(_CUR._SL)).lastusedtag_6+(2))),new CLASS_BUILDER1_uniqueTagid((_CUR._SL),CONC(new CLASS_COMMON_quantity_ident(p_q)._RESULT,new RTS_TXT("'dcl")))._RESULT);
                        ;
                        // JavaLine 97 <== SourceLine 117
                        ((CLASS_BUILDER1)(_CUR._SL)).TAGTAB.ident.putELEMENT(((CLASS_BUILDER1)(_CUR._SL)).TAGTAB.ident.index((((CLASS_BUILDER1)(_CUR._SL)).lastusedtag_6+(3))),new CLASS_BUILDER1_uniqueTagid((_CUR._SL),CONC(new CLASS_COMMON_quantity_ident(p_q)._RESULT,new RTS_TXT("'stm")))._RESULT);
                        ;
                        // JavaLine 100 <== SourceLine 118
                        ((CLASS_BUILDER1)(_CUR._SL)).TAGTAB.ident.putELEMENT(((CLASS_BUILDER1)(_CUR._SL)).TAGTAB.ident.index((((CLASS_BUILDER1)(_CUR._SL)).lastusedtag_6+(4))),new CLASS_BUILDER1_uniqueTagid((_CUR._SL),CONC(new CLASS_COMMON_quantity_ident(p_q)._RESULT,new RTS_TXT("'cnt\u005finr")))._RESULT);
                        ;
                    }
                }
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_BUILDER1.sim","5 newFirstTag",1,99,42,100,45,101,48,102,51,103,54,104,57,105,60,106,63,107,66,108,71,109,74,110,77,111,80,112,83,113,88,114,91,115,94,116,97,117,100,118,110,122);
} // End of Procedure
