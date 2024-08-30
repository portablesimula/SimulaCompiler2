// JavaLine 1 <== SourceLine 37
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:35 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_SCODER2_codegenerator2_profilegenerator extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=37, lastLine=124, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_extquantity p_extq;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 40
    public CLASS_COMMON_quantity qty=null;
    public CLASS_COMMON_quantity q=null;
    public RTS_TXT it=null;
    // JavaLine 15 <== SourceLine 41
    public int idlength=0;
    public int index=0;
    public int ttag=0;
    // JavaLine 19 <== SourceLine 42
    public int language=0;
    public boolean CP=false;
    public char qtyp=0;
    // JavaLine 23 <== SourceLine 86
    public CLASS_COMMON_symbolbox _inspect_86_4639=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_SCODER2_codegenerator2_profilegenerator setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_extq=(CLASS_COMMON_extquantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_SCODER2_codegenerator2_profilegenerator(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_SCODER2_codegenerator2_profilegenerator(RTS_RTObject _SL,CLASS_COMMON_extquantity sp_extq) {
        super(_SL);
        // Parameter assignment to locals
        this.p_extq = sp_extq;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_SCODER2_codegenerator2_profilegenerator _STM() {
        // JavaLine 53 <== SourceLine 56
        language=p_extq.dim_1;
        ;
        // JavaLine 56 <== SourceLine 57
        CP=((language==(RTS_ENVIRONMENT.rank('L')))||((language==(RTS_ENVIRONMENT.rank('M')))));
        ;
        // JavaLine 59 <== SourceLine 59
        if(_VALUE((p_extq.p2_module==(null)))) {
            {
                // JavaLine 62 <== SourceLine 60
                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(30);
                ;
                // JavaLine 65 <== SourceLine 61
                new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(p_extq.ftag_1+(0)));
                ;
                // JavaLine 68 <== SourceLine 62
                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(new RTS_TXT("!"),new RTS_TXT("\u0000\u0000")));
                ;
                // JavaLine 71 <== SourceLine 63
                new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(p_extq.ftag_1+(1)));
                ;
                // JavaLine 74 <== SourceLine 64
                it=p_extq.symb_1.symbol;
                ;
                // JavaLine 77 <== SourceLine 65
                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(RTS_TXT.length(it));
                ;
                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(it);
                ;
                // JavaLine 82 <== SourceLine 66
                it=new CLASS_COMMON_getBox((_CUR._SL._SL),language)._RESULT.symbol;
                ;
                // JavaLine 85 <== SourceLine 67
                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(RTS_TXT.length(it));
                ;
                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(it);
                ;
                // JavaLine 90 <== SourceLine 68
                it=new CLASS_COMMON_getBox((_CUR._SL._SL),p_extq.virtno_1)._RESULT.symbol;
                ;
                // JavaLine 93 <== SourceLine 69
                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(RTS_TXT.length(it));
                ;
                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(it);
                ;
                // JavaLine 98 <== SourceLine 70
                if(_VALUE((language>(RTS_ENVIRONMENT.rank('N'))))) {
                    // JavaLine 100 <== SourceLine 71
                    {
                        // JavaLine 102 <== SourceLine 73
                        it=RTS_ENVIRONMENT.copy(copy(new RTS_TXT("xxx \u005fCONTEXT")));
                        ;
                        // JavaLine 105 <== SourceLine 74
                        RTS_ENVIRONMENT.storeChar(RTS_ENVIRONMENT._char((48+(7))),it,0);
                        ;
                        // JavaLine 108 <== SourceLine 76
                        RTS_ENVIRONMENT.storeChar(RTS_ENVIRONMENT._char((48+(0))),it,1);
                        ;
                        // JavaLine 111 <== SourceLine 77
                        RTS_ENVIRONMENT.storeChar(RTS_ENVIRONMENT._char((48+(0))),it,2);
                        ;
                        // JavaLine 114 <== SourceLine 78
                        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(new RTS_TXT("\""),new RTS_TXT("\u0000\u0000")));
                        ;
                        // JavaLine 117 <== SourceLine 79
                        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(p_extq.ftag_1+(2)));
                        ;
                        // JavaLine 120 <== SourceLine 80
                        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(RTS_TXT.length(it));
                        ;
                        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(it);
                        ;
                        // JavaLine 125 <== SourceLine 81
                        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),8);
                        ;
                    }
                }
                ;
                // JavaLine 131 <== SourceLine 83
                if(_VALUE((language==(RTS_ENVIRONMENT.rank('L'))))) {
                    new CLASS_SCODER2_codegenerator2_profilegenerator_invert((_CUR));
                }
                ;
                // JavaLine 136 <== SourceLine 84
                qty=p_extq.descr_1.fpar;
                ;
                // JavaLine 139 <== SourceLine 85
                while((qty!=(null))) {
                    {
                        // JavaLine 142 <== SourceLine 86
                        {
                            // BEGIN INSPECTION 
                            _inspect_86_4639=qty.symb_1;
                            if(_inspect_86_4639!=null) { // INSPECT _inspect_86_4639  type=ref(SYMBOLBOX)
                                // JavaLine 147 <== SourceLine 87
                                {
                                    // JavaLine 149 <== SourceLine 86
                                    {
                                        // JavaLine 151 <== SourceLine 87
                                        idlength=RTS_TXT.length(_inspect_86_4639.symbol);
                                        ;
                                        // JavaLine 154 <== SourceLine 88
                                        if(_VALUE((CP&&(((qty.kind_1==(((char)2)))||((qty.type_1==(((char)8))))))))) {
                                            // JavaLine 156 <== SourceLine 90
                                            it=CONC(new RTS_TXT("700 "),_inspect_86_4639.symbol);
                                        } else {
                                            // JavaLine 159 <== SourceLine 91
                                            {
                                                // JavaLine 161 <== SourceLine 92
                                                it=RTS_ENVIRONMENT.blanks(4);
                                                ;
                                                // JavaLine 164 <== SourceLine 93
                                                RTS_ENVIRONMENT.storeChar(RTS_ENVIRONMENT._char((48+(RTS_ENVIRONMENT.rank(qty.type_1)))),it,0);
                                                ;
                                                // JavaLine 167 <== SourceLine 95
                                                RTS_ENVIRONMENT.storeChar(RTS_ENVIRONMENT._char((48+(RTS_ENVIRONMENT.rank(qty.kind_1)))),it,1);
                                                ;
                                                // JavaLine 170 <== SourceLine 96
                                                RTS_ENVIRONMENT.storeChar(RTS_ENVIRONMENT._char((48+(RTS_ENVIRONMENT.rank(qty.categ_1)))),it,2);
                                                ;
                                                // JavaLine 173 <== SourceLine 97
                                                it=CONC(it,_inspect_86_4639.symbol);
                                                ;
                                            }
                                        }
                                        ;
                                        // JavaLine 179 <== SourceLine 99
                                        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(new RTS_TXT("\""),new RTS_TXT("\u0000\u0000")));
                                        ;
                                        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),qty.ftag_1);
                                        ;
                                        // JavaLine 184 <== SourceLine 100
                                        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(RTS_TXT.length(it));
                                        ;
                                        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outtext(it);
                                        ;
                                        // JavaLine 189 <== SourceLine 101
                                        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),(((qty.kind_1==(((char)1))))?(11):((((qty.categ_1==(((char)2))))?(9):(((((CP&&((qty.categ_1==(((char)1)))))&&((((qty.type_1==(((char)8)))||((qty.type_1==(((char)7)))))||((qty.kind_1==(((char)2))))))))?(8):((((((qty.type_1==(((char)7)))|((qty.type_1==(((char)9)))))|((qty.kind_1==(((char)2))))))?(8):((((qty.kind_1==(((char)3))))?(10):(((CLASS_SCODER2_codegenerator2)(_CUR._SL)).typetag.getELEMENT(RTS_ENVIRONMENT.rank(qty.type_1)))))))))))));
                                        ;
                                    }
                                }
                            }
                        } // END INSPECTION
                        ;
                        // JavaLine 197 <== SourceLine 113
                        qty=((CLASS_COMMON_quantity)(qty.next));
                        ;
                    }
                }
                ;
                // JavaLine 203 <== SourceLine 115
                if(_VALUE((language==(RTS_ENVIRONMENT.rank('L'))))) {
                    new CLASS_SCODER2_codegenerator2_profilegenerator_invert((_CUR));
                }
                ;
                // JavaLine 208 <== SourceLine 116
                if(_VALUE((p_extq.type_1!=(((char)14))))) {
                    {
                        // JavaLine 211 <== SourceLine 117
                        ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(35);
                        ;
                        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(p_extq.ftag_1+(3)));
                        ;
                        // JavaLine 216 <== SourceLine 118
                        new CLASS_SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),(((CP&&((p_extq.type_1==(((char)8))))))?(8):(((CLASS_SCODER2_codegenerator2)(_CUR._SL)).typetag.getELEMENT(RTS_ENVIRONMENT.rank(p_extq.type_1)))));
                        ;
                    }
                }
                ;
                // JavaLine 222 <== SourceLine 122
                ((CLASS_SCODER2_codegenerator2)(_CUR._SL)).outbyte(37);
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_SCODER2.sim","5 profilegenerator",1,37,11,40,15,41,19,42,23,86,53,56,56,57,59,59,62,60,65,61,68,62,71,63,74,64,77,65,82,66,85,67,90,68,93,69,98,70,100,71,102,73,105,74,108,76,111,77,114,78,117,79,120,80,125,81,131,83,136,84,139,85,142,86,147,87,149,86,151,87,154,88,156,90,159,91,161,92,164,93,167,95,170,96,173,97,179,99,184,100,189,101,197,113,203,115,208,116,211,117,216,118,222,122,230,124);
} // End of Procedure
