// JavaLine 1 <== SourceLine 45
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:37 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PAS2INIT_codegeneratorinit_generatetagindexlist extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=45, lastLine=109, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_qqq;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 46
    public int et=0;
    // JavaLine 13 <== SourceLine 54
    public CLASS_CHECKER2_semchecker _inspect_54_4662=null;
    // JavaLine 15 <== SourceLine 78
    public CLASS_COMMON_brecord _inspect_78_4663=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_PAS2INIT_codegeneratorinit_generatetagindexlist setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_qqq=(CLASS_COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_PAS2INIT_codegeneratorinit_generatetagindexlist(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_PAS2INIT_codegeneratorinit_generatetagindexlist(RTS_RTObject _SL,CLASS_COMMON_quantity sp_qqq) {
        super(_SL);
        // Parameter assignment to locals
        this.p_qqq = sp_qqq;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PAS2INIT_codegeneratorinit_generatetagindexlist _STM() {
        // JavaLine 45 <== SourceLine 54
        {
            // BEGIN INSPECTION 
            _inspect_54_4662=((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL)).checker_5;
            if(_inspect_54_4662!=null) { // INSPECT _inspect_54_4662  type=ref(SEMCHECKER)
                // JavaLine 50 <== SourceLine 55
                {
                    // JavaLine 52 <== SourceLine 54
                    {
                        // JavaLine 54 <== SourceLine 55
                        et=new CLASS_BUILDER1_exttag((_CUR._SL._SL),p_qqq)._RESULT;
                        ;
                        // JavaLine 57 <== SourceLine 56
                        if(_VALUE((et>=(0)))) {
                            {
                                // JavaLine 60 <== SourceLine 61
                                if(_VALUE(((p_qqq.categ_1==(((char)4)))&&((!(RTS_UTIL._IS(p_qqq.descr_1,CLASS_COMMON_extbrecord.class))))))) {
                                    // JavaLine 62 <== SourceLine 62
                                    {
                                        // JavaLine 64 <== SourceLine 64
                                        ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL)).outbyte(44);
                                        ;
                                        // JavaLine 67 <== SourceLine 65
                                        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(p_qqq.ftag_1+(0)));
                                        ;
                                        ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL)).out2byte(et);
                                        ;
                                        // JavaLine 72 <== SourceLine 66
                                        ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL)).outbyte(44);
                                        ;
                                        // JavaLine 75 <== SourceLine 67
                                        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(p_qqq.ftag_1+(1)));
                                        ;
                                        ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL)).out2byte((et+(1)));
                                        ;
                                    }
                                } else {
                                    // JavaLine 82 <== SourceLine 69
                                    if(_VALUE((((p_qqq.kind_1==(((char)1)))||((p_qqq.kind_1==(((char)5)))))&&((p_qqq.categ_1==(((char)3))))))) {
                                        // JavaLine 84 <== SourceLine 71
                                        {
                                            // JavaLine 86 <== SourceLine 72
                                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("PAS2INIT"),72,new RTS_TXT("TAG"),CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(p_qqq.ftag_1+(0)))._RESULT,new RTS_TXT(" ")),RTS_ENVIRONMENT.edit(et)));
                                            ;
                                            // JavaLine 89 <== SourceLine 73
                                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("PAS2INIT"),73,new RTS_TXT("TAG"),CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(p_qqq.ftag_1+(1)))._RESULT,new RTS_TXT(" ")),RTS_ENVIRONMENT.edit((et+(1)))));
                                            ;
                                            // JavaLine 92 <== SourceLine 74
                                            ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL)).outbyte(44);
                                            ;
                                            // JavaLine 95 <== SourceLine 75
                                            new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(p_qqq.ftag_1+(0)));
                                            ;
                                            ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL)).out2byte(et);
                                            ;
                                            // JavaLine 100 <== SourceLine 76
                                            ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL)).outbyte(44);
                                            ;
                                            // JavaLine 103 <== SourceLine 77
                                            new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(p_qqq.ftag_1+(1)));
                                            ;
                                            ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL)).out2byte((et+(1)));
                                            ;
                                            // JavaLine 108 <== SourceLine 78
                                            {
                                                // BEGIN INSPECTION 
                                                _inspect_78_4663=p_qqq.descr_1;
                                                if(_inspect_78_4663!=null) { // INSPECT _inspect_78_4663  type=ref(BRECORD)
                                                    // JavaLine 113 <== SourceLine 79
                                                    {
                                                        // JavaLine 115 <== SourceLine 78
                                                        {
                                                            // JavaLine 117 <== SourceLine 79
                                                            if(_VALUE((p_qqq.kind_1==(((char)5))))) {
                                                                {
                                                                    // JavaLine 120 <== SourceLine 80
                                                                    if(_VALUE((_inspect_78_4663.inrtag!=(((char)0))))) {
                                                                        {
                                                                            // JavaLine 123 <== SourceLine 81
                                                                            new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("PAS2INIT"),81,new RTS_TXT("TAG"),CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(p_qqq.ftag_1+(RTS_ENVIRONMENT.isorank(_inspect_78_4663.inrtag))))._RESULT,new RTS_TXT(" ")),RTS_ENVIRONMENT.edit((et+(2)))));
                                                                            ;
                                                                            // JavaLine 126 <== SourceLine 82
                                                                            ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL)).outbyte(44);
                                                                            ;
                                                                            // JavaLine 129 <== SourceLine 83
                                                                            new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(p_qqq.ftag_1+(RTS_ENVIRONMENT.isorank(_inspect_78_4663.inrtag))));
                                                                            ;
                                                                            // JavaLine 132 <== SourceLine 84
                                                                            ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL)).out2byte((et+(2)));
                                                                            ;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            ;
                                                            // JavaLine 140 <== SourceLine 91
                                                            p_qqq=_inspect_78_4663.fpar;
                                                            ;
                                                            // JavaLine 143 <== SourceLine 92
                                                            while((p_qqq!=(null))) {
                                                                {
                                                                    // JavaLine 146 <== SourceLine 93
                                                                    new CLASS_PAS2INIT_codegeneratorinit_generatetagindexlist((_CUR._SL),p_qqq);
                                                                    ;
                                                                    p_qqq=((CLASS_COMMON_quantity)(p_qqq.next));
                                                                }
                                                            }
                                                            ;
                                                        }
                                                    }
                                                }
                                            } // END INSPECTION
                                            ;
                                        }
                                    } else {
                                        // JavaLine 160 <== SourceLine 96
                                        if(_VALUE(((p_qqq.special_1>(((char)1)))&&((p_qqq.type_1!=(((char)8))))))) {
                                            ;
                                        } else {
                                            // JavaLine 164 <== SourceLine 98
                                            {
                                                // JavaLine 166 <== SourceLine 99
                                                new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("PAS2INIT"),99,new RTS_TXT("TAG"),CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),p_qqq.ftag_1)._RESULT,new RTS_TXT(" ")),RTS_ENVIRONMENT.edit(et)));
                                                ;
                                                // JavaLine 169 <== SourceLine 100
                                                ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL)).outbyte(44);
                                                ;
                                                new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),p_qqq.ftag_1);
                                                ;
                                                ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL)).out2byte(et);
                                                ;
                                                // JavaLine 176 <== SourceLine 101
                                                if(_VALUE((p_qqq.categ_1==(((char)2))))) {
                                                    {
                                                        // JavaLine 179 <== SourceLine 102
                                                        new CLASS_SCODER0_codegenerator0_STRC3((_CUR._SL),new RTS_TXT("PAS2INIT"),102,new RTS_TXT("TAG"),CONC(CONC(new CLASS_SCODER0_codegenerator0_ED_TAG((_CUR._SL),(p_qqq.ftag_1+(1)))._RESULT,new RTS_TXT(" ")),RTS_ENVIRONMENT.edit((et+(1)))));
                                                        ;
                                                        // JavaLine 182 <== SourceLine 103
                                                        ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL)).outbyte(44);
                                                        ;
                                                        // JavaLine 185 <== SourceLine 104
                                                        new CLASS_SCODER0_codegenerator0_outtag((_CUR._SL),(p_qqq.ftag_1+(1)));
                                                        ;
                                                        ((CLASS_PAS2INIT_codegeneratorinit)(_CUR._SL)).out2byte((et+(1)));
                                                        ;
                                                    }
                                                }
                                                ;
                                            }
                                        }
                                    }
                                }
                                ;
                            }
                        }
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PAS2INIT.sim","5 generatetagindexlist",1,45,11,46,13,54,15,78,45,54,50,55,52,54,54,55,57,56,60,61,62,62,64,64,67,65,72,66,75,67,82,69,84,71,86,72,89,73,92,74,95,75,100,76,103,77,108,78,113,79,115,78,117,79,120,80,123,81,126,82,129,83,132,84,140,91,143,92,146,93,160,96,164,98,166,99,169,100,176,101,179,102,182,103,185,104,208,109);
} // End of Procedure
