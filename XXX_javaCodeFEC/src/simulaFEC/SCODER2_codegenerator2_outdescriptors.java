// JavaLine 1 <== SourceLine 901
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:42 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class SCODER2_codegenerator2_outdescriptors extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=901, lastLine=1046, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public COMMON_quantity p_q;
    // Declare local labels
    // JavaLine 11 <== SourceLine 999
    final RTS_LABEL _LABEL_SCODER2_codegenerator2_outdescriptors_Block992_DESCRGEN_0=new RTS_LABEL(this,0,1,"DESCRGEN"); // Local Label #1=DESCRGEN At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 14 <== SourceLine 930
    public COMMON_quantity qty=null;
    public RTS_TXT txt=null;
    // JavaLine 17 <== SourceLine 936
    public COMMON_extbrecord _inspect_936_4643=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public SCODER2_codegenerator2_outdescriptors setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_q=(COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public SCODER2_codegenerator2_outdescriptors(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public SCODER2_codegenerator2_outdescriptors(RTS_RTObject _SL,COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public SCODER2_codegenerator2_outdescriptors _STM() {
        SCODER2_codegenerator2_outdescriptors _THIS=(SCODER2_codegenerator2_outdescriptors)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,1); // For ByteCode Engineering
                // JavaLine 51 <== SourceLine 931
                if(_VALUE((p_q.categ_1==(((char)4))))) {
                    {
                        // JavaLine 54 <== SourceLine 932
                        if(_VALUE((((COMMON_extquantity)(p_q)).clf_2==(((char)0))))) {
                            {
                                // JavaLine 57 <== SourceLine 934
                                ((SCODER2_codegenerator2)(_CUR._SL)).outbyte(115);
                                ;
                                // JavaLine 60 <== SourceLine 936
                                {
                                    // BEGIN INSPECTION 
                                    _inspect_936_4643=((COMMON_extquantity)(p_q)).p2_module;
                                    if(_inspect_936_4643!=null) { // INSPECT _inspect_936_4643
                                        // JavaLine 65 <== SourceLine 937
                                        {
                                            // JavaLine 67 <== SourceLine 936
                                            new SCODER2_codegenerator2_outdescriptors_Block932_Block934_Block937((_CUR))._STM();
                                        }
                                    }
                                } // END INSPECTION
                            }
                        } else {
                            // JavaLine 74 <== SourceLine 954
                            if(_VALUE((((COMMON_extquantity)(p_q)).clf_2==(((char)1))))) {
                                // JavaLine 76 <== SourceLine 956
                                new SCODER2_codegenerator2_profilegenerator((_CUR._SL),((COMMON_extquantity)(p_q)));
                            }
                        }
                        ;
                    }
                } else {
                    // JavaLine 83 <== SourceLine 958
                    if(p_q.kind_1<((char)0) || p_q.kind_1>((char)13)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                    switch(p_q.kind_1) { // BEGIN SWITCH STATEMENT
                        case 8: 
                        // JavaLine 87 <== SourceLine 959
                        {
                            // JavaLine 89 <== SourceLine 960
                            new SCODER2_codegenerator2_descriptorgenerator((_CUR._SL),p_q);
                            ;
                            // JavaLine 92 <== SourceLine 961
                            new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),961,new RTS_TXT("CONSTSPEC"),CONC(CONC(new SCODER0_codegenerator0_ED_TAG((_CUR._SL),(p_q.ftag_1+(1)))._RESULT,new RTS_TXT("  ")),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000Y"))._RESULT));
                            ;
                            // JavaLine 95 <== SourceLine 962
                            new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),962,new RTS_TXT("LABELSPEC"),new SCODER0_codegenerator0_ED_TAG((_CUR._SL),(p_q.ftag_1+(2)))._RESULT);
                            ;
                            // JavaLine 98 <== SourceLine 963
                            ((SCODER2_codegenerator2)(_CUR._SL)).outbyte(52);
                            ;
                            new SCODER0_codegenerator0_outtag((_CUR._SL),(p_q.ftag_1+(1)));
                            ;
                            // JavaLine 103 <== SourceLine 964
                            ((SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u0000Y"),new RTS_TXT("/")));
                            ;
                            // JavaLine 106 <== SourceLine 965
                            new SCODER0_codegenerator0_outtag((_CUR._SL),(p_q.ftag_1+(2)));
                            ;
                        }
                        break;
                        case 1: 
                        // JavaLine 112 <== SourceLine 967
                        {
                            // JavaLine 114 <== SourceLine 968
                            new SCODER2_codegenerator2_descriptorgenerator((_CUR._SL),p_q);
                            ;
                            // JavaLine 117 <== SourceLine 969
                            if(_VALUE((p_q.plev_1<(2)))) {
                                {
                                    // JavaLine 120 <== SourceLine 970
                                    new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),970,new RTS_TXT("CONSTSPEC"),CONC(CONC(new SCODER0_codegenerator0_ED_TAG((_CUR._SL),(p_q.ftag_1+(1)))._RESULT,new RTS_TXT("  ")),new SCODER0_codegenerator0_ED_TAG((_CUR._SL),91)._RESULT));
                                    ;
                                    // JavaLine 123 <== SourceLine 971
                                    ((SCODER2_codegenerator2)(_CUR._SL)).outbyte(52);
                                    ;
                                    new SCODER0_codegenerator0_outtag((_CUR._SL),(p_q.ftag_1+(1)));
                                    ;
                                    // JavaLine 128 <== SourceLine 974
                                    new SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),91);
                                    ;
                                    // JavaLine 131 <== SourceLine 979
                                    qty=p_q.descr_1.fpar;
                                    ;
                                    // JavaLine 134 <== SourceLine 980
                                    while((qty!=(null))) {
                                        {
                                            // JavaLine 137 <== SourceLine 981
                                            if(_VALUE((qty.categ_1==(((char)2))))) {
                                                {
                                                    // JavaLine 140 <== SourceLine 982
                                                    new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),982,new RTS_TXT("CONSTSPEC"),CONC(CONC(new SCODER0_codegenerator0_ED_TAG((_CUR._SL),(qty.ftag_1+(1)))._RESULT,new RTS_TXT("  ")),new SCODER0_codegenerator0_ED_TAG((_CUR._SL),((((qty.type_1==(((char)7)))||((qty.type_1==(((char)9))))))?(130):(124)))._RESULT));
                                                    ;
                                                    // JavaLine 143 <== SourceLine 983
                                                    ((SCODER2_codegenerator2)(_CUR._SL)).outbyte(52);
                                                    ;
                                                    // JavaLine 146 <== SourceLine 984
                                                    new SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),(qty.ftag_1+(1)));
                                                    ;
                                                    // JavaLine 149 <== SourceLine 985
                                                    new SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),((((qty.type_1==(((char)7)))||((qty.type_1==(((char)9))))))?(130):(124)));
                                                    ;
                                                }
                                            }
                                            ;
                                            // JavaLine 155 <== SourceLine 987
                                            qty=((COMMON_quantity)(qty.next));
                                            ;
                                        }
                                    }
                                    ;
                                }
                            }
                            ;
                        }
                        break;
                        case 5: 
                        case 7: 
                        // JavaLine 168 <== SourceLine 991
                        {
                            // JavaLine 170 <== SourceLine 992
                            p_q.descr_1.descriptorpr=true;
                            ;
                            // JavaLine 173 <== SourceLine 993
                            if(_VALUE((p_q.plev_1>(1)))) {
                                {
                                    // JavaLine 176 <== SourceLine 995
                                    if(_VALUE(_IS(p_q.prefqual_1,COMMON_quantity.class))) {
                                        {
                                            // JavaLine 179 <== SourceLine 996
                                            if(_VALUE((!(p_q.prefqual_1.descr_1.descriptorpr)))) {
                                                // JavaLine 181 <== SourceLine 997
                                                new SCODER2_codegenerator2_outdescriptors((_CUR._SL),p_q.prefqual_1);
                                            }
                                        }
                                    }
                                }
                            }
                            ;
                            // JavaLine 189 <== SourceLine 999
                            {
                                _SIM_LABEL(1); // DeclaredIn: outdescriptors -> outdescriptors[externalIdent=SCODER2_codegenerator2_outdescriptors] Kind=5, QUAL=ProcedureDeclaration, HashCode=1747056923
                                new SCODER2_codegenerator2_descriptorgenerator((_CUR._SL),p_q);
                            }
                            ;
                            // JavaLine 195 <== SourceLine 1000
                            new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),1000,new RTS_TXT("CONSTSPEC"),CONC(CONC(CONC(CONC(new SCODER0_codegenerator0_ED_TAG((_CUR._SL),(p_q.ftag_1+(1)))._RESULT,new RTS_TXT("  ")),new SCODER0_codegenerator0_ED_TTAG((_CUR._SL),new RTS_TXT("\u0000\u005e"))._RESULT),new RTS_TXT("  FIXREP ")),RTS_ENVIRONMENT.edit((p_q.plev_1+(1)))));
                            ;
                            // JavaLine 198 <== SourceLine 1001
                            ((SCODER2_codegenerator2)(_CUR._SL)).outbyte(52);
                            ;
                            new SCODER0_codegenerator0_outtag((_CUR._SL),(p_q.ftag_1+(1)));
                            ;
                            // JavaLine 203 <== SourceLine 1002
                            ((SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u0000\u005e"),new RTS_TXT("\b")));
                            ;
                            // JavaLine 206 <== SourceLine 1003
                            ((SCODER2_codegenerator2)(_CUR._SL)).out2byte((p_q.plev_1+(1)));
                            ;
                            // JavaLine 209 <== SourceLine 1004
                            if(_VALUE((p_q.descr_1.inrtag!=(((char)0))))) {
                                {
                                    // JavaLine 212 <== SourceLine 1005
                                    new SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("SCODER2"),1005,new RTS_TXT("LABELSPEC"),new SCODER0_codegenerator0_ED_TAG((_CUR._SL),(p_q.ftag_1+(RTS_ENVIRONMENT.isorank(p_q.descr_1.inrtag))))._RESULT);
                                    ;
                                    // JavaLine 215 <== SourceLine 1006
                                    ((SCODER2_codegenerator2)(_CUR._SL)).outbyte(47);
                                    ;
                                    // JavaLine 218 <== SourceLine 1007
                                    new SCODER0_codegenerator0_outtag((_CUR._SL),(p_q.ftag_1+(RTS_ENVIRONMENT.isorank(p_q.descr_1.inrtag))));
                                    ;
                                }
                            }
                            ;
                        }
                        break;
                        case 9: 
                        // JavaLine 227 <== SourceLine 1011
                        _GOTO(_LABEL_SCODER2_codegenerator2_outdescriptors_Block992_DESCRGEN_0); // GOTO EVALUATED LABEL
                        break;
                    } // END SWITCH STATEMENT
                }
                ;
                // JavaLine 233 <== SourceLine 1014
                p_q=p_q.descr_1.fpar;
                ;
                // JavaLine 236 <== SourceLine 1015
                while((p_q!=(null))) {
                    {
                        // JavaLine 239 <== SourceLine 1016
                        if(_VALUE(((p_q.kind_1==(((char)5)))&&(p_q.descr_1.descriptorpr)))) {
                            ;
                        } else {
                            // JavaLine 243 <== SourceLine 1019
                            if(_VALUE((_IS(p_q,COMMON_extquantity.class)&&((p_q.categ_1!=(((char)4))))))) {
                                ;
                            } else {
                                // JavaLine 247 <== SourceLine 1021
                                if(_VALUE(((((p_q.kind_1==(((char)1)))||((p_q.kind_1==(((char)5)))))||((p_q.kind_1==(((char)7)))))&&(((p_q.categ_1==(((char)3)))||((p_q.categ_1==(((char)4))))))))) {
                                    // JavaLine 249 <== SourceLine 1024
                                    new SCODER2_codegenerator2_outdescriptors((_CUR._SL),p_q);
                                } else {
                                    // JavaLine 252 <== SourceLine 1025
                                    if(_VALUE((p_q.categ_1==(((char)3))))) {
                                        {
                                            // JavaLine 255 <== SourceLine 1026
                                            if(_VALUE((p_q.kind_1==(((char)3))))) {
                                                {
                                                    // JavaLine 258 <== SourceLine 1027
                                                    if(_VALUE((p_q.dim_1==(0)))) {
                                                        {
                                                            // JavaLine 261 <== SourceLine 1028
                                                            ((SCODER2_codegenerator2)(_CUR._SL)).outbyte(47);
                                                            ;
                                                            new SCODER0_codegenerator0_outtag((_CUR._SL),(p_q.ftag_1+(0)));
                                                            ;
                                                        }
                                                    }
                                                    ;
                                                }
                                            } else {
                                                // JavaLine 271 <== SourceLine 1031
                                                if(_VALUE((p_q.kind_1==(((char)4))))) {
                                                    {
                                                        // JavaLine 274 <== SourceLine 1032
                                                        ((SCODER2_codegenerator2)(_CUR._SL)).outbyte(52);
                                                        ;
                                                        new SCODER0_codegenerator0_outtag((_CUR._SL),(p_q.ftag_1+(0)));
                                                        ;
                                                        // JavaLine 279 <== SourceLine 1033
                                                        ((SCODER2_codegenerator2)(_CUR._SL)).outtext(CONC(new RTS_TXT("\u0000\u0086"),new RTS_TXT("\b")));
                                                        ;
                                                        // JavaLine 282 <== SourceLine 1034
                                                        ((SCODER2_codegenerator2)(_CUR._SL)).out2byte((p_q.dim_1+(1)));
                                                        ;
                                                    }
                                                } else {
                                                    // JavaLine 287 <== SourceLine 1036
                                                    if(_VALUE((p_q.special_1!=(((char)0))))) {
                                                        {
                                                            if(_VALUE((p_q.kind_1==(((char)0))))) {
                                                                // JavaLine 291 <== SourceLine 1037
                                                                {
                                                                    if(_VALUE((p_q.type_1==(((char)8))))) {
                                                                        // JavaLine 294 <== SourceLine 1038
                                                                        {
                                                                            // JavaLine 296 <== SourceLine 1039
                                                                            ((SCODER2_codegenerator2)(_CUR._SL)).outbyte(52);
                                                                            ;
                                                                            new SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),p_q.ftag_1);
                                                                            ;
                                                                            // JavaLine 301 <== SourceLine 1040
                                                                            new SCODER0_codegenerator0_outTagWithIdent((_CUR._SL),313);
                                                                            ;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            ;
                                        }
                                    }
                                }
                            }
                        }
                        ;
                        // JavaLine 319 <== SourceLine 1044
                        p_q=((COMMON_quantity)(p_q.next));
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("SCODER2.sim","5 outdescriptors",1,901,11,999,14,930,17,936,51,931,54,932,57,934,60,936,65,937,67,936,74,954,76,956,83,958,87,959,89,960,92,961,95,962,98,963,103,964,106,965,112,967,114,968,117,969,120,970,123,971,128,974,131,979,134,980,137,981,140,982,143,983,146,984,149,985,155,987,168,991,170,992,173,993,176,995,179,996,181,997,189,999,195,1000,198,1001,203,1002,206,1003,209,1004,212,1005,215,1006,218,1007,227,1011,233,1014,236,1015,239,1016,243,1019,247,1021,249,1024,252,1025,255,1026,258,1027,261,1028,271,1031,274,1032,279,1033,282,1034,287,1036,291,1037,294,1038,296,1039,301,1040,319,1044,334,1046);
} // End of Procedure
