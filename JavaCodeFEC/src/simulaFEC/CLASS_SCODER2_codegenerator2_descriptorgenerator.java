// JavaLine 1 <== SourceLine 127
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:35 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER2_codegenerator2_descriptorgenerator extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=127, lastLine=194, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_q;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 128
    public CLASS_COMMON_quantity qty=null;
    // JavaLine 13 <== SourceLine 129
    public int ttag=0;
    public int firstnesttag=0;
    public int lastnesttag=0;
    public int repcnt=0;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCODER2_codegenerator2_descriptorgenerator setPar(Object param) {
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
    public CLASS_SCODER2_codegenerator2_descriptorgenerator(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_SCODER2_codegenerator2_descriptorgenerator(RTS_RTObject _SL,CLASS_COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER2_codegenerator2_descriptorgenerator _STM() {
        // JavaLine 46 <== SourceLine 134
        {
            // JavaLine 48 <== SourceLine 135
            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),135,new RTS_TXT("RECORD"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(p_q.ftag_1+(0)))._RESULT);
            ;
            // JavaLine 51 <== SourceLine 136
            ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(1);
            ;
            new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(p_q.ftag_1+(0)));
            ;
            // JavaLine 56 <== SourceLine 137
            if(_VALUE((p_q.plev_1>(1)))) {
                {
                    // JavaLine 59 <== SourceLine 138
                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),138,new RTS_TXT("PREFIX"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(p_q.prefqual_1.ftag_1+(0)))._RESULT);
                    ;
                    // JavaLine 62 <== SourceLine 139
                    ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(3);
                    ;
                    // JavaLine 65 <== SourceLine 140
                    new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(p_q.prefqual_1.ftag_1+(0)));
                }
            } else {
                // JavaLine 69 <== SourceLine 142
                if(_VALUE((p_q.kind_1!=(((char)7))))) {
                    {
                        // JavaLine 72 <== SourceLine 143
                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),143,new RTS_TXT("PREFIX"),new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),((((p_q.kind_1==(((char)1)))&&((p_q.type_1!=(((char)14))))))?(((CLASS_SCODER2_codegenerator2)(_CUR._SL)).type_pro_tag.getELEMENT(RTS_ENVIRONMENT.rank(p_q.type_1))):(150)))._RESULT);
                        ;
                        // JavaLine 75 <== SourceLine 147
                        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(3);
                        ;
                        // JavaLine 78 <== SourceLine 148
                        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((((p_q.kind_1==(((char)1)))&&((p_q.type_1!=(((char)14))))))?(((CLASS_SCODER2_codegenerator2)(_CUR._SL)).type_pro_tag.getELEMENT(RTS_ENVIRONMENT.rank(p_q.type_1))):(150)));
                        ;
                    }
                }
            }
            ;
            // JavaLine 85 <== SourceLine 152
            qty=p_q.descr_1.fpar;
            ;
            // JavaLine 88 <== SourceLine 153
            while((qty!=(null))) {
                {
                    // JavaLine 91 <== SourceLine 154
                    ttag=new CLASS_SCODER1_codegenerator1_getTypeTag((_CUR._SL),qty)._RESULT;
                    ;
                    // JavaLine 94 <== SourceLine 155
                    if(_VALUE((ttag!=(0)))) {
                        {
                            // JavaLine 97 <== SourceLine 156
                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),156,new RTS_TXT("   ATTR"),CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(qty.ftag_1+(0)))._RESULT,new RTS_TXT("  ")),new CLASS_SCODER0_codegenerator0_ED_TYPE((_CUR._SL),ttag)._RESULT));
                            ;
                            // JavaLine 100 <== SourceLine 157
                            ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(4);
                            ;
                            new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),(qty.ftag_1+(0)));
                            ;
                            // JavaLine 105 <== SourceLine 158
                            new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),ttag);
                            ;
                            // JavaLine 108 <== SourceLine 159
                            if(_VALUE((qty.kind_1==(((char)6))))) {
                                {
                                    // JavaLine 111 <== SourceLine 160
                                    new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),160,new RTS_TXT("REP"),RTS_ENVIRONMENT.edit(qty.descr_1.line1));
                                    ;
                                    // JavaLine 114 <== SourceLine 161
                                    ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(6);
                                    ;
                                    ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).out2byte(qty.descr_1.line1);
                                    ;
                                }
                            }
                            ;
                        }
                    }
                    ;
                    // JavaLine 125 <== SourceLine 164
                    qty=((CLASS_COMMON_quantity)(qty.next));
                    ;
                }
            }
            ;
            // JavaLine 131 <== SourceLine 171
            lastnesttag=p_q.descr_1.connests;
            ;
            // JavaLine 134 <== SourceLine 172
            if(_VALUE((lastnesttag!=(0)))) {
                {
                    // JavaLine 137 <== SourceLine 173
                    firstnesttag=new CLASS_SCODER1_codegenerator1_firstcontag((_CUR._SL),p_q)._RESULT;
                    ;
                    // JavaLine 140 <== SourceLine 174
                    lastnesttag=((lastnesttag+(firstnesttag))-(1));
                    ;
                    // JavaLine 143 <== SourceLine 175
                    while((firstnesttag<=(lastnesttag))) {
                        {
                            // JavaLine 146 <== SourceLine 176
                            ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(4);
                            ;
                            // JavaLine 149 <== SourceLine 177
                            new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),firstnesttag);
                            ;
                            new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),8);
                            ;
                            // JavaLine 154 <== SourceLine 178
                            firstnesttag=(firstnesttag+(1));
                        }
                    }
                    ;
                }
            }
            ;
            // JavaLine 162 <== SourceLine 181
            if(_VALUE(((CLASS_SCODER2)(_CUR._SL._SL)).simob_descr)) {
                new CLASS_SCODER1E_codegenerator1e_GenerateSequPPtags((_CUR._SL),p_q);
            }
            ;
            // JavaLine 167 <== SourceLine 191
            new CLASS_SCODER0_codegenerator0_STRC2((_CUR._SL),new RTS_TXT("SCODER2"),191,new RTS_TXT("ENDRECORD"));
            ;
            // JavaLine 170 <== SourceLine 192
            ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(9);
            ;
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER2.sim","5 descriptorgenerator",1,127,11,128,13,129,46,134,48,135,51,136,56,137,59,138,62,139,65,140,69,142,72,143,75,147,78,148,85,152,88,153,91,154,94,155,97,156,100,157,105,158,108,159,111,160,114,161,125,164,131,171,134,172,137,173,140,174,143,175,146,176,149,177,154,178,162,181,167,191,170,192,177,194);
} // End of Procedure
