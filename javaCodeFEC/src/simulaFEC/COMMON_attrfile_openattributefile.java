// JavaLine 1 <== SourceLine 968
package simulaFEC;
// Simula-2.0 Compiled at Fri Jun 14 09:55:29 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class COMMON_attrfile_openattributefile extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=968, lastLine=1013, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public COMMON_quantity p_q;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 971
    public RTS_TXT t=null;
    public RTS_TXT id=null;
    public RTS_TXT xid=null;
    public RTS_TXT simsepmod=null;
    public int firstbufsize=0;
    // JavaLine 17 <== SourceLine 972
    public char attrlayout=0;
    // JavaLine 19 <== SourceLine 973
    public COMMON_quantity _inspect_973_4455=null;
    // JavaLine 21 <== SourceLine 990
    public RTS_Inbytefile _inspect_990_4456=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public COMMON_attrfile_openattributefile setPar(Object param) {
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
    public COMMON_attrfile_openattributefile(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public COMMON_attrfile_openattributefile(RTS_RTObject _SL,COMMON_quantity sp_q) {
        super(_SL);
        // Parameter assignment to locals
        this.p_q = sp_q;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public COMMON_attrfile_openattributefile _STM() {
        // JavaLine 51 <== SourceLine 973
        {
            // BEGIN INSPECTION 
            _inspect_973_4455=p_q;
            if(_inspect_973_4455!=null) { // INSPECT _inspect_973_4455
                // JavaLine 56 <== SourceLine 974
                {
                    // JavaLine 58 <== SourceLine 973
                    {
                        // JavaLine 60 <== SourceLine 974
                        id=_inspect_973_4455.symb_1.symbol;
                        ;
                        // JavaLine 63 <== SourceLine 975
                        xid=new COMMON_getBox((_CUR._SL._SL),_inspect_973_4455.virtno_1)._RESULT.symbol;
                        ;
                        // JavaLine 66 <== SourceLine 976
                        if(_VALUE(_TXTREL_EQ(id,new RTS_TXT("\u005fpredefmodule")))) {
                            t=RTS_ENVIRONMENT.copy(copy(((COMMON)(_CUR._SL._SL)).predefname));
                        } else {
                            // JavaLine 70 <== SourceLine 977
                            if(_VALUE((_TXTREL_EQ(id,new RTS_TXT("simset"))&&((_TXTREL_EQ(xid,new RTS_TXT("?"))|(_TXTREL_EQ(xid,null))))))) {
                                // JavaLine 72 <== SourceLine 978
                                t=RTS_ENVIRONMENT.copy(copy(((COMMON)(_CUR._SL._SL)).simsetname));
                            } else {
                                // JavaLine 75 <== SourceLine 979
                                if(_VALUE((_TXTREL_EQ(id,new RTS_TXT("simulation"))&((_TXTREL_EQ(xid,new RTS_TXT("?"))|(_TXTREL_EQ(xid,null))))))) {
                                    // JavaLine 77 <== SourceLine 980
                                    t=RTS_ENVIRONMENT.copy(copy(((COMMON)(_CUR._SL._SL)).simulaname));
                                } else {
                                    // JavaLine 80 <== SourceLine 981
                                    {
                                        // JavaLine 82 <== SourceLine 982
                                        new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("COMMON"),982,CONC(CONC(new RTS_TXT("openattributefile: giveTextInfo(2,"),id),new RTS_TXT(")")));
                                        ;
                                        // JavaLine 85 <== SourceLine 983
                                        new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("COMMON"),983,CONC(CONC(new RTS_TXT("openattributefile: giveTextInfo(3,"),((_TXTREL_EQ(xid,new RTS_TXT("?")))?(null):(xid))),new RTS_TXT(")")));
                                        ;
                                        // JavaLine 88 <== SourceLine 984
                                        RTS_ENVIRONMENT.giveTextInfo(2,id);
                                        ;
                                        // JavaLine 91 <== SourceLine 985
                                        RTS_ENVIRONMENT.giveTextInfo(3,((_TXTREL_EQ(xid,new RTS_TXT("?")))?(null):(xid)));
                                        ;
                                        // JavaLine 94 <== SourceLine 986
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
                // JavaLine 106 <== SourceLine 988
                t=((COMMON)(_CUR._SL._SL)).attrfilename;
            } // END OTHERWISE 
        } // END INSPECTION
        ;
        // JavaLine 111 <== SourceLine 989
        new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("COMMON"),989,CONC(new RTS_TXT("OPEN ATTRIBUTEFILE "),t));
        ;
        // JavaLine 114 <== SourceLine 990
        {
            // BEGIN INSPECTION 
            _inspect_990_4456=new RTS_Inbytefile(_CTX,t)._STM();
            if(_inspect_990_4456!=null) { // INSPECT _inspect_990_4456
                // JavaLine 119 <== SourceLine 991
                {
                    // JavaLine 121 <== SourceLine 990
                    {
                        // JavaLine 123 <== SourceLine 991
                        _inspect_990_4456.setaccess(new RTS_TXT("%nobuffer"));
                        ;
                        // JavaLine 126 <== SourceLine 992
                        if(_VALUE((!(_inspect_990_4456.open())))) {
                            {
                                ((COMMON)(_CUR._SL._SL)).diag.putELEMENT(((COMMON)(_CUR._SL._SL)).diag.index(0),t);
                                ;
                                ((COMMON)(_CUR._SL._SL)).COMMONerror_0().CPF().setPar(336)._ENT();
                            }
                        }
                        ;
                        // JavaLine 135 <== SourceLine 993
                        ((COMMON_attrfile)(_CUR._SL)).CURF=((RTS_Inbytefile)_inspect_990_4456);
                        ;
                        // JavaLine 138 <== SourceLine 994
                        attrlayout=RTS_ENVIRONMENT._char(_inspect_990_4456.inbyte());
                        ;
                        // JavaLine 141 <== SourceLine 995
                        new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("COMMON"),995,CONC(CONC(CONC(new RTS_TXT("CHECK ATTR-LAYOUT(1): attrlayout="),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(attrlayout))),new RTS_TXT(", layoutindex=")),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(((char)2)))));
                        ;
                        // JavaLine 144 <== SourceLine 996
                        if(_VALUE((attrlayout!=(((char)2))))) {
                            new COMMON_attrfile_wrongLayout((_CUR._SL));
                        }
                        ;
                        // JavaLine 149 <== SourceLine 999
                        firstbufsize=_inspect_990_4456.in2byte();
                        ;
                        // JavaLine 152 <== SourceLine 1000
                        _inspect_990_4456.intext(RTS_TXT.sub(((COMMON_attrfile)(_CUR._SL)).attrbuffer,1,firstbufsize));
                        ;
                    }
                }
            }
        } // END INSPECTION
        ;
        // JavaLine 160 <== SourceLine 1002
        new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("COMMON"),1002,CONC(new RTS_TXT("CHECK ATTR-LAYOUT(2): attrbuffer="),RTS_TXT.sub(((COMMON_attrfile)(_CUR._SL)).attrbuffer,1,12)));
        ;
        // JavaLine 163 <== SourceLine 1004
        if(_VALUE(_TXTREL_NE(RTS_TXT.sub(((COMMON_attrfile)(_CUR._SL)).attrbuffer,1,7),new RTS_TXT("S-port ")))) {
            new COMMON_attrfile_wrongLayout((_CUR._SL));
        }
        ;
        // JavaLine 168 <== SourceLine 1005
        ((COMMON_attrfile)(_CUR._SL)).sysattrfile=(RTS_ENVIRONMENT.loadChar(((COMMON_attrfile)(_CUR._SL)).attrbuffer,10)==(':'));
        ;
        // JavaLine 171 <== SourceLine 1007
        ((COMMON_attrfile)(_CUR._SL)).p=12;
        ;
        // JavaLine 174 <== SourceLine 1008
        new COMMON_attrfile_gettext((_CUR._SL));
        ;
        new COMMON_DEFCONST((_CUR._SL._SL));
        ;
        // JavaLine 179 <== SourceLine 1009
        ((COMMON_attrfile)(_CUR._SL)).attrckhi=((COMMON)(_CUR._SL._SL)).hashhi;
        ;
        ((COMMON_attrfile)(_CUR._SL)).attrcklo=((COMMON)(_CUR._SL._SL)).hashlo;
        ;
        // JavaLine 184 <== SourceLine 1010
        new COMMON_attrfile_gettext((_CUR._SL));
        ;
        new COMMON_DEFCONST((_CUR._SL._SL));
        ;
        // JavaLine 189 <== SourceLine 1011
        ((COMMON_attrfile)(_CUR._SL)).attrmodhi=((COMMON)(_CUR._SL._SL)).hashhi;
        ;
        ((COMMON_attrfile)(_CUR._SL)).attrmodlo=((COMMON)(_CUR._SL._SL)).hashlo;
        ;
        // JavaLine 194 <== SourceLine 1012
        new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("COMMON"),1012,CONC(new RTS_TXT("END OPEN ATTRIBUTEFILE sysattrfile="),RTS_ENVIRONMENT.edit(((COMMON_attrfile)(_CUR._SL)).sysattrfile)));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("COMMON.sim","5 openattributefile",1,968,11,971,17,972,19,973,21,990,51,973,56,974,58,973,60,974,63,975,66,976,70,977,72,978,75,979,77,980,80,981,82,982,85,983,88,984,91,985,94,986,106,988,111,989,114,990,119,991,121,990,123,991,126,992,135,993,138,994,141,995,144,996,149,999,152,1000,160,1002,163,1004,168,1005,171,1007,174,1008,179,1009,184,1010,189,1011,194,1012,199,1013);
} // End of Procedure
