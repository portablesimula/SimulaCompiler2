// JavaLine 1 <== SourceLine 969
package simulaFEC;
// Simula-2.0 Compiled at Mon Sep 02 11:57:45 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_COMMON_attrfile_openattributefile extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=969, lastLine=1014, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_q;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 972
    public RTS_TXT t=null;
    public RTS_TXT id=null;
    public RTS_TXT xid=null;
    public RTS_TXT simsepmod=null;
    public int firstbufsize=0;
    // JavaLine 17 <== SourceLine 973
    public char attrlayout=0;
    // JavaLine 19 <== SourceLine 974
    public CLASS_COMMON_quantity _inspect_974_4455=null;
    // JavaLine 21 <== SourceLine 991
    public RTS_Inbytefile _inspect_991_4456=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_COMMON_attrfile_openattributefile setPar(Object param) {
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
    public CLASS_COMMON_attrfile_openattributefile(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_COMMON_attrfile_openattributefile(RTS_RTObject _SL,CLASS_COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_COMMON_attrfile_openattributefile _STM() {
        // JavaLine 51 <== SourceLine 974
        {
            // BEGIN INSPECTION 
            _inspect_974_4455=p_q;
            if(_inspect_974_4455!=null) { // INSPECT _inspect_974_4455  type=ref(QUANTITY)
                // JavaLine 56 <== SourceLine 975
                {
                    // JavaLine 58 <== SourceLine 974
                    {
                        // JavaLine 60 <== SourceLine 975
                        id=_inspect_974_4455.symb_1.symbol;
                        ;
                        // JavaLine 63 <== SourceLine 976
                        xid=new CLASS_COMMON_getBox((_CUR._SL._SL),_inspect_974_4455.virtno_1)._RESULT.symbol;
                        ;
                        // JavaLine 66 <== SourceLine 977
                        if(_VALUE(RTS_UTIL._TXTREL_EQ(id,new RTS_TXT("\u005fpredefmodule")))) {
                            t=RTS_ENVIRONMENT.copy(copy(((CLASS_COMMON)(_CUR._SL._SL)).predefname));
                        } else {
                            // JavaLine 70 <== SourceLine 978
                            if(_VALUE((RTS_UTIL._TXTREL_EQ(id,new RTS_TXT("simset"))&&((RTS_UTIL._TXTREL_EQ(xid,new RTS_TXT("?"))|(RTS_UTIL._TXTREL_EQ(xid,null))))))) {
                                // JavaLine 72 <== SourceLine 979
                                t=RTS_ENVIRONMENT.copy(copy(((CLASS_COMMON)(_CUR._SL._SL)).simsetname));
                            } else {
                                // JavaLine 75 <== SourceLine 980
                                if(_VALUE((RTS_UTIL._TXTREL_EQ(id,new RTS_TXT("simulation"))&((RTS_UTIL._TXTREL_EQ(xid,new RTS_TXT("?"))|(RTS_UTIL._TXTREL_EQ(xid,null))))))) {
                                    // JavaLine 77 <== SourceLine 981
                                    t=RTS_ENVIRONMENT.copy(copy(((CLASS_COMMON)(_CUR._SL._SL)).simulaname));
                                } else {
                                    // JavaLine 80 <== SourceLine 982
                                    {
                                        // JavaLine 82 <== SourceLine 983
                                        new CLASS_COMMON_TRC((_CUR._SL._SL),new RTS_TXT("COMMON"),983,CONC(CONC(new RTS_TXT("openattributefile: giveTextInfo(2,"),id),new RTS_TXT(")")));
                                        ;
                                        // JavaLine 85 <== SourceLine 984
                                        new CLASS_COMMON_TRC((_CUR._SL._SL),new RTS_TXT("COMMON"),984,CONC(CONC(new RTS_TXT("openattributefile: giveTextInfo(3,"),((RTS_UTIL._TXTREL_EQ(xid,new RTS_TXT("?")))?(null):(xid))),new RTS_TXT(")")));
                                        ;
                                        // JavaLine 88 <== SourceLine 985
                                        RTS_ENVIRONMENT.giveTextInfo(2,id);
                                        ;
                                        // JavaLine 91 <== SourceLine 986
                                        RTS_ENVIRONMENT.giveTextInfo(3,((RTS_UTIL._TXTREL_EQ(xid,new RTS_TXT("?")))?(null):(xid)));
                                        ;
                                        // JavaLine 94 <== SourceLine 987
                                        t=RTS_ENVIRONMENT.getTextInfo(12);
                                        ;
                                    }
                                }
                            }
                        }
                        ;
                    }
                }
            }
            else { // OTHERWISE 
                // JavaLine 106 <== SourceLine 989
                t=((CLASS_COMMON)(_CUR._SL._SL)).attrfilename;
            } // END OTHERWISE 
        } // END INSPECTION
        ;
        // JavaLine 111 <== SourceLine 990
        new CLASS_COMMON_TRC((_CUR._SL._SL),new RTS_TXT("COMMON"),990,CONC(new RTS_TXT("OPEN ATTRIBUTEFILE "),t));
        ;
        // JavaLine 114 <== SourceLine 991
        {
            // BEGIN INSPECTION 
            _inspect_991_4456=new RTS_Inbytefile(_USR,t)._STM();
            if(_inspect_991_4456!=null) { // INSPECT _inspect_991_4456  type=ref(INBYTEFILE)
                // JavaLine 119 <== SourceLine 992
                {
                    // JavaLine 121 <== SourceLine 991
                    {
                        // JavaLine 123 <== SourceLine 992
                        _inspect_991_4456.setaccess(new RTS_TXT("%nobuffer"));
                        ;
                        // JavaLine 126 <== SourceLine 993
                        if(_VALUE((!(_inspect_991_4456.open())))) {
                            {
                                ((CLASS_COMMON)(_CUR._SL._SL)).diag.putELEMENT(((CLASS_COMMON)(_CUR._SL._SL)).diag.index(0),t);
                                ;
                                ((CLASS_COMMON)(_CUR._SL._SL)).COMMONerror_0().CPF().setPar(336)._ENT();
                            }
                        }
                        ;
                        // JavaLine 135 <== SourceLine 994
                        ((CLASS_COMMON_attrfile)(_CUR._SL)).CURF=((RTS_Inbytefile)_inspect_991_4456);
                        ;
                        // JavaLine 138 <== SourceLine 995
                        attrlayout=RTS_ENVIRONMENT._char(_inspect_991_4456.inbyte());
                        ;
                        // JavaLine 141 <== SourceLine 996
                        new CLASS_COMMON_TRC((_CUR._SL._SL),new RTS_TXT("COMMON"),996,CONC(CONC(CONC(new RTS_TXT("CHECK ATTR-LAYOUT(1): attrlayout="),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(attrlayout))),new RTS_TXT(", layoutindex=")),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(((char)2)))));
                        ;
                        // JavaLine 144 <== SourceLine 997
                        if(_VALUE((attrlayout!=(((char)2))))) {
                            new CLASS_COMMON_attrfile_wrongLayout((_CUR._SL));
                        }
                        ;
                        // JavaLine 149 <== SourceLine 1000
                        firstbufsize=_inspect_991_4456.in2byte();
                        ;
                        // JavaLine 152 <== SourceLine 1001
                        _inspect_991_4456.intext(RTS_TXT.sub(((CLASS_COMMON_attrfile)(_CUR._SL)).attrbuffer,1,firstbufsize));
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        // JavaLine 160 <== SourceLine 1003
        new CLASS_COMMON_TRC((_CUR._SL._SL),new RTS_TXT("COMMON"),1003,CONC(new RTS_TXT("CHECK ATTR-LAYOUT(2): attrbuffer="),RTS_TXT.sub(((CLASS_COMMON_attrfile)(_CUR._SL)).attrbuffer,1,12)));
        ;
        // JavaLine 163 <== SourceLine 1005
        if(_VALUE(RTS_UTIL._TXTREL_NE(RTS_TXT.sub(((CLASS_COMMON_attrfile)(_CUR._SL)).attrbuffer,1,7),new RTS_TXT("S-port ")))) {
            new CLASS_COMMON_attrfile_wrongLayout((_CUR._SL));
        }
        ;
        // JavaLine 168 <== SourceLine 1006
        ((CLASS_COMMON_attrfile)(_CUR._SL)).sysattrfile=(RTS_ENVIRONMENT.loadChar(((CLASS_COMMON_attrfile)(_CUR._SL)).attrbuffer,10)==(':'));
        ;
        // JavaLine 171 <== SourceLine 1008
        ((CLASS_COMMON_attrfile)(_CUR._SL)).p=12;
        ;
        // JavaLine 174 <== SourceLine 1009
        new CLASS_COMMON_attrfile_gettext((_CUR._SL));
        ;
        new CLASS_COMMON_DEFCONST((_CUR._SL._SL));
        ;
        // JavaLine 179 <== SourceLine 1010
        ((CLASS_COMMON_attrfile)(_CUR._SL)).attrckhi=((CLASS_COMMON)(_CUR._SL._SL)).hashhi;
        ;
        ((CLASS_COMMON_attrfile)(_CUR._SL)).attrcklo=((CLASS_COMMON)(_CUR._SL._SL)).hashlo;
        ;
        // JavaLine 184 <== SourceLine 1011
        new CLASS_COMMON_attrfile_gettext((_CUR._SL));
        ;
        new CLASS_COMMON_DEFCONST((_CUR._SL._SL));
        ;
        // JavaLine 189 <== SourceLine 1012
        ((CLASS_COMMON_attrfile)(_CUR._SL)).attrmodhi=((CLASS_COMMON)(_CUR._SL._SL)).hashhi;
        ;
        ((CLASS_COMMON_attrfile)(_CUR._SL)).attrmodlo=((CLASS_COMMON)(_CUR._SL._SL)).hashlo;
        ;
        // JavaLine 194 <== SourceLine 1013
        new CLASS_COMMON_TRC((_CUR._SL._SL),new RTS_TXT("COMMON"),1013,CONC(new RTS_TXT("END OPEN ATTRIBUTEFILE sysattrfile="),RTS_ENVIRONMENT.edit(((CLASS_COMMON_attrfile)(_CUR._SL)).sysattrfile)));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_COMMON.sim","5 openattributefile",1,969,11,972,17,973,19,974,21,991,51,974,56,975,58,974,60,975,63,976,66,977,70,978,72,979,75,980,77,981,80,982,82,983,85,984,88,985,91,986,94,987,106,989,111,990,114,991,119,992,121,991,123,992,126,993,135,994,138,995,141,996,144,997,149,1000,152,1001,160,1003,163,1005,168,1006,171,1008,174,1009,179,1010,184,1011,189,1012,194,1013,199,1014);
} // End of Procedure
