// JavaLine 1 <== SourceLine 154
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class BUILDER2_normalattrfile_fillextquantity extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=154, lastLine=207, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public COMMON_extquantity p_xq;
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 155
    public COMMON_brecord xb=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public BUILDER2_normalattrfile_fillextquantity setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_xq=(COMMON_extquantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public BUILDER2_normalattrfile_fillextquantity(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public BUILDER2_normalattrfile_fillextquantity(RTS_RTObject _SL,COMMON_extquantity sp_xq) {
        super(_SL);
        // Parameter assignment to locals
        this.p_xq = sp_xq;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public BUILDER2_normalattrfile_fillextquantity _STM() {
        // JavaLine 41 <== SourceLine 157
        if(_VALUE((((BUILDER2_normalattrfile)(_CUR._SL)).xident==(null)))) {
            {
                // JavaLine 44 <== SourceLine 158
                ((BUILDER2)(_CUR._SL._SL)).simsymbol=((BUILDER2_normalattrfile)(_CUR._SL)).xidentstring;
                ;
                new COMMON_DEFIDENT((_CUR._SL._SL));
                ;
                // JavaLine 49 <== SourceLine 159
                p_xq.symb_1=new COMMON_boxof((_CUR._SL._SL),((BUILDER2)(_CUR._SL._SL)).hashhi,((BUILDER2)(_CUR._SL._SL)).hashlo)._RESULT;
            }
        } else {
            // JavaLine 53 <== SourceLine 160
            p_xq.symb_1=((BUILDER2_normalattrfile)(_CUR._SL)).xident;
        }
        ;
        // JavaLine 57 <== SourceLine 161
        if(_VALUE((1>(3)))) {
            new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),161,CONC(new RTS_TXT("========================  BEGIN fillextquantity: "),p_xq.symb_1.symbol));
        }
        ;
        // JavaLine 62 <== SourceLine 165
        p_xq.type_1=((BUILDER2_normalattrfile)(_CUR._SL)).xtype;
        ;
        p_xq.kind_1=((BUILDER2_normalattrfile)(_CUR._SL)).xkind;
        ;
        p_xq.categ_1=((BUILDER2_normalattrfile)(_CUR._SL)).xcateg;
        ;
        // JavaLine 69 <== SourceLine 166
        p_xq.visible_1=((char)0);
        ;
        p_xq.protect_1=((BUILDER2_normalattrfile)(_CUR._SL)).xprotect;
        ;
        // JavaLine 74 <== SourceLine 167
        p_xq.line_1=((-((RTS_ENVIRONMENT.rank(((BUILDER2_normalattrfile)(_CUR._SL)).xprefqhi)*(256))))-(RTS_ENVIRONMENT.rank(((BUILDER2_normalattrfile)(_CUR._SL)).xprefqlo)));
        ;
        // JavaLine 77 <== SourceLine 168
        p_xq.plev_1=1;
        ;
        // JavaLine 80 <== SourceLine 169
        p_xq.ftag_1=((BUILDER2_normalattrfile)(_CUR._SL)).xftag;
        ;
        // JavaLine 83 <== SourceLine 170
        p_xq.clf_2=((BUILDER2_normalattrfile)(_CUR._SL)).xclf;
        ;
        // JavaLine 86 <== SourceLine 171
        p_xq.longindic_2=((BUILDER2_normalattrfile)(_CUR._SL)).xlongindic;
        ;
        // JavaLine 89 <== SourceLine 172
        if(_VALUE((((BUILDER2_normalattrfile)(_CUR._SL)).xcateg==(((char)4))))) {
            {
                // JavaLine 92 <== SourceLine 173
                p_xq.dim_1=((BUILDER2_normalattrfile)(_CUR._SL)).xlanguage;
                ;
                // JavaLine 95 <== SourceLine 174
                p_xq.virtno_1=((BUILDER2_normalattrfile)(_CUR._SL)).xextident;
                ;
                // JavaLine 98 <== SourceLine 175
                if(_VALUE(_IS(p_xq.descr_1,COMMON_extbrecord.class))) {
                    // JavaLine 100 <== SourceLine 176
                    {
                        // JavaLine 102 <== SourceLine 177
                        xb=p_xq.descr_1;
                        ;
                        // JavaLine 105 <== SourceLine 178
                        xb.kind=((BUILDER2_normalattrfile)(_CUR._SL)).xkind;
                        ;
                        // JavaLine 108 <== SourceLine 179
                        xb.thisused=((BUILDER2_normalattrfile)(_CUR._SL)).xthisused;
                        ;
                        // JavaLine 111 <== SourceLine 180
                        xb.connests=RTS_ENVIRONMENT.rank(((BUILDER2_normalattrfile)(_CUR._SL)).xconnests);
                        ;
                        // JavaLine 114 <== SourceLine 184
                        xb.inrtag=((BUILDER2_normalattrfile)(_CUR._SL)).xinrtag;
                        ;
                        xb.hasCode=((BUILDER2_normalattrfile)(_CUR._SL)).xhascode;
                        ;
                        // JavaLine 119 <== SourceLine 185
                        ((COMMON_extbrecord)(xb)).modulhi_1=((BUILDER2_normalattrfile)(_CUR._SL)).xmodulhi;
                        ;
                        // JavaLine 122 <== SourceLine 186
                        ((COMMON_extbrecord)(xb)).modullo_1=((BUILDER2_normalattrfile)(_CUR._SL)).xmodullo;
                        ;
                        // JavaLine 125 <== SourceLine 187
                        ((COMMON_extbrecord)(xb)).checkhi_1=((BUILDER2_normalattrfile)(_CUR._SL)).xcheckhi;
                        ;
                        // JavaLine 128 <== SourceLine 188
                        ((COMMON_extbrecord)(xb)).checklo_1=((BUILDER2_normalattrfile)(_CUR._SL)).xchecklo;
                        ;
                        // JavaLine 131 <== SourceLine 189
                        xb.hidlist=((BUILDER2_normalattrfile)(_CUR._SL)).xhidlist;
                        ;
                    }
                }
                ;
            }
        } else {
            // JavaLine 139 <== SourceLine 192
            p_xq.dim_1=((BUILDER2_normalattrfile)(_CUR._SL)).xdim;
        }
        ;
        // JavaLine 143 <== SourceLine 193
        p_xq.special_1=((BUILDER2_normalattrfile)(_CUR._SL)).xspecial;
        ;
        // JavaLine 146 <== SourceLine 194
        if(_VALUE(((p_xq.special_1!=(((char)0)))||((p_xq.kind_1==(((char)6))))))) {
            // JavaLine 148 <== SourceLine 196
            {
                // JavaLine 150 <== SourceLine 197
                xb=new COMMON_brecord((_CUR._SL._SL))._STM();
                ;
                // JavaLine 153 <== SourceLine 198
                if(_VALUE((p_xq.descr_1!=(null)))) {
                    new ERRMSG_internerr((_CUR._SL._SL),((char)7),198);
                }
                ;
                // JavaLine 158 <== SourceLine 199
                xb.declquant=p_xq;
                ;
                p_xq.descr_1=xb;
                ;
                // JavaLine 163 <== SourceLine 200
                xb.blnohi=((BUILDER2_normalattrfile)(_CUR._SL)).xarrhi;
                ;
                xb.blnolo=((BUILDER2_normalattrfile)(_CUR._SL)).xarrlo;
                ;
                // JavaLine 168 <== SourceLine 201
                if(_VALUE((p_xq.kind_1==(((char)6))))) {
                    {
                        // JavaLine 171 <== SourceLine 202
                        xb.line1=((BUILDER2_normalattrfile)(_CUR._SL)).xlanguage;
                        ;
                        xb.npar=((BUILDER2_normalattrfile)(_CUR._SL)).xextident;
                        ;
                    }
                }
                ;
            }
        }
        ;
        // JavaLine 182 <== SourceLine 205
        new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),205,CONC(CONC(CONC(CONC(CONC(new RTS_TXT("END fillextquantity: "),((BUILDER2_normalattrfile)(_CUR._SL)).xidentstring),new RTS_TXT(": xcateg=")),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(((BUILDER2_normalattrfile)(_CUR._SL)).xcateg))),new RTS_TXT(" xq.categ=")),RTS_ENVIRONMENT.edit(RTS_ENVIRONMENT.rank(p_xq.categ_1))));
        ;
        // JavaLine 185 <== SourceLine 206
        if(_VALUE((1>(3)))) {
            new COMMON_QTRC((_CUR._SL._SL),new RTS_TXT("BUILDER2"),206,new RTS_TXT("=================================================  END fillextquantity: "),p_xq);
        }
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("BUILDER2.sim","5 fillextquantity",1,154,11,155,41,157,44,158,49,159,53,160,57,161,62,165,69,166,74,167,77,168,80,169,83,170,86,171,89,172,92,173,95,174,98,175,100,176,102,177,105,178,108,179,111,180,114,184,119,185,122,186,125,187,128,188,131,189,139,192,143,193,146,194,148,196,150,197,153,198,158,199,163,200,168,201,171,202,182,205,185,206,192,207);
} // End of Procedure
