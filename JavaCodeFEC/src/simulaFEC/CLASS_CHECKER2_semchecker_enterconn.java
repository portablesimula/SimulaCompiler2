// JavaLine 1 <== SourceLine 91
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:33 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_CHECKER2_semchecker_enterconn extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=3, firstLine=91, lastLine=198, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public CLASS_COMMON_quantity p_classq;
    // Declare local labels
    // JavaLine 11 <== SourceLine 105
    final RTS_LABEL _LABEL_CLASS_CHECKER2_semchecker_enterconn_Block105_BADBLOCK_0=new RTS_LABEL(this,0,1,"BADBLOCK"); // Local Label #1=BADBLOCK At PrefixLevel 0
    // JavaLine 13 <== SourceLine 119
    final RTS_LABEL _LABEL_CLASS_CHECKER2_semchecker_enterconn_Block118_REP_0=new RTS_LABEL(this,0,2,"REP"); // Local Label #2=REP At PrefixLevel 0
    // JavaLine 15 <== SourceLine 120
    final RTS_LABEL _LABEL_CLASS_CHECKER2_semchecker_enterconn_Block118_REP1_0=new RTS_LABEL(this,0,3,"REP1"); // Local Label #3=REP1 At PrefixLevel 0
    // JavaLine 17 <== SourceLine 150
    final RTS_LABEL _LABEL_CLASS_CHECKER2_semchecker_enterconn_Block118_SCANL_0=new RTS_LABEL(this,0,4,"SCANL"); // Local Label #4=SCANL At PrefixLevel 0
    // JavaLine 19 <== SourceLine 198
    final RTS_LABEL _LABEL_CLASS_CHECKER2_semchecker_enterconn_copyleave_0=new RTS_LABEL(this,0,5,"copyleave"); // Local Label #5=copyleave At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 22 <== SourceLine 92
    public boolean inlocals=false;
    public CLASS_COMMON_stackedi chain=null;
    // JavaLine 25 <== SourceLine 95
    public CLASS_COMMON_quantity qz=null;
    public CLASS_COMMON_quantity q=null;
    public CLASS_COMMON_brecord brc=null;
    // JavaLine 29 <== SourceLine 116
    public CLASS_COMMON_brecord _inspect_116_4587=null;
    // JavaLine 31 <== SourceLine 140
    public CLASS_COMMON_brecord _inspect_140_4588=null;
    // JavaLine 33 <== SourceLine 152
    public CLASS_COMMON_identsymbol _inspect_152_4589=null;
    // JavaLine 35 <== SourceLine 153
    public CLASS_COMMON_stackedi _inspect_153_4590=null;
    // JavaLine 37 <== SourceLine 170
    public CLASS_COMMON_identsymbol _inspect_170_4591=null;
    // JavaLine 39 <== SourceLine 182
    public CLASS_COMMON_stackedi _inspect_182_4592=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_CHECKER2_semchecker_enterconn setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_classq=(CLASS_COMMON_quantity)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_CHECKER2_semchecker_enterconn(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_CHECKER2_semchecker_enterconn(RTS_RTObject _SL,CLASS_COMMON_quantity sp_classq) {
        super(_SL);
        // Parameter assignment to locals
        this.p_classq = sp_classq;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_CHECKER2_semchecker_enterconn _STM() {
        CLASS_CHECKER2_semchecker_enterconn _THIS=(CLASS_CHECKER2_semchecker_enterconn)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,5); // For ByteCode Engineering
                // JavaLine 73 <== SourceLine 98
                ((CLASS_CHECKER2)(_CUR._SL._SL)).cblev_6=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(((CLASS_CHECKER2)(_CUR._SL._SL)).cblev_6)+(1)));
                ;
                // JavaLine 76 <== SourceLine 100
                if(_VALUE((RTS_ENVIRONMENT.rank(((CLASS_CHECKER2)(_CUR._SL._SL)).cblev_6)>(250)))) {
                    new CLASS_ERRMSG_fatal0((_CUR._SL._SL),299);
                }
                ;
                // JavaLine 81 <== SourceLine 101
                if(_VALUE((p_classq==(null)))) {
                    {
                        // JavaLine 84 <== SourceLine 105
                        {
                            _SIM_LABEL(1); // DeclaredIn: enterconn -> enterconn[externalIdent=CLASS_CHECKER2_semchecker_enterconn] Kind=5, QUAL=ProcedureDeclaration, HashCode=2068524493
                            brc=new CLASS_COMMON_brecord((_CUR._SL._SL))._STM();
                        }
                        ;
                        // JavaLine 90 <== SourceLine 106
                        brc.blev=((CLASS_CHECKER2)(_CUR._SL._SL)).cblev_6;
                        ;
                        brc.rtblev=((CLASS_CHECKER2)(_CUR._SL._SL)).crtblev_6;
                        ;
                        // JavaLine 95 <== SourceLine 107
                        qz=new CLASS_COMMON_quantity((_CUR._SL._SL))._STM();
                        ;
                        qz.plev_1=1;
                        ;
                        // JavaLine 100 <== SourceLine 108
                        qz.kind_1=brc.kind=((char)8);
                        ;
                        qz.categ_1=((char)7);
                        ;
                        // JavaLine 105 <== SourceLine 109
                        qz.type_1=((char)14);
                        ;
                        // JavaLine 108 <== SourceLine 110
                        brc.declquant=qz;
                        ;
                        qz.descr_1=brc;
                        ;
                        qz.encl_1=((CLASS_CHECKER2)(_CUR._SL._SL)).unknowns;
                        ;
                        // JavaLine 115 <== SourceLine 111
                        new CLASS_BUILDER1_precheck0_makevisblock((_CUR._SL),brc);
                        ;
                        // JavaLine 118 <== SourceLine 112
                        new CLASS_COMMON_QTRC((_CUR._SL._SL),new RTS_TXT("CHECKER2"),112,new RTS_TXT("NEW Quantity: "),qz);
                        ;
                        // JavaLine 121 <== SourceLine 114
                        _GOTO(_LABEL_CLASS_CHECKER2_semchecker_enterconn_copyleave_0); // GOTO EVALUATED LABEL
                        ;
                    }
                }
                ;
                // JavaLine 127 <== SourceLine 116
                {
                    // BEGIN INSPECTION 
                    _inspect_116_4587=p_classq.descr_1;
                    if(_inspect_116_4587!=null) { // INSPECT _inspect_116_4587  type=ref(BRECORD)
                        // JavaLine 132 <== SourceLine 117
                        {
                            // JavaLine 134 <== SourceLine 116
                            {
                                // JavaLine 136 <== SourceLine 118
                                q=_inspect_116_4587.declquant;
                                ;
                                // JavaLine 139 <== SourceLine 119
                                {
                                    _SIM_LABEL(2); // DeclaredIn: enterconn -> enterconn[externalIdent=CLASS_CHECKER2_semchecker_enterconn] Kind=5, QUAL=ProcedureDeclaration, HashCode=2068524493
                                    qz=q.descr_1.fpar;
                                }
                                ;
                                inlocals=true;
                                ;
                                // JavaLine 147 <== SourceLine 120
                                {
                                    _SIM_LABEL(3); // DeclaredIn: enterconn -> enterconn[externalIdent=CLASS_CHECKER2_semchecker_enterconn] Kind=5, QUAL=ProcedureDeclaration, HashCode=2068524493
                                    while((qz!=(null))) {
                                        {
                                            // JavaLine 152 <== SourceLine 121
                                            if(_VALUE((qz.protect_1==(((char)1))))) {
                                                {
                                                    // JavaLine 155 <== SourceLine 122
                                                    qz.visible_1=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(qz.visible_1)+(1)));
                                                    ;
                                                    // JavaLine 158 <== SourceLine 123
                                                    if(_VALUE((!(inlocals)))) {
                                                        {
                                                            if(_VALUE((qz.match_1!=(null)))) {
                                                                // JavaLine 162 <== SourceLine 124
                                                                qz.match_1.visible_1=RTS_ENVIRONMENT._char((RTS_ENVIRONMENT.rank(qz.match_1.visible_1)+(1)));
                                                            }
                                                            ;
                                                        }
                                                    }
                                                    ;
                                                }
                                            }
                                            ;
                                            // JavaLine 172 <== SourceLine 127
                                            qz=((CLASS_COMMON_quantity)(qz.next));
                                            ;
                                        }
                                    }
                                }
                                ;
                                // JavaLine 179 <== SourceLine 129
                                if(_VALUE(inlocals)) {
                                    {
                                        // JavaLine 182 <== SourceLine 130
                                        inlocals=false;
                                        ;
                                        qz=q.descr_1.favirt;
                                        ;
                                        _GOTO(_LABEL_CLASS_CHECKER2_semchecker_enterconn_Block118_REP1_0); // GOTO EVALUATED LABEL
                                    }
                                }
                                ;
                                // JavaLine 191 <== SourceLine 131
                                if(_VALUE((q.plev_1>(1)))) {
                                    {
                                        q=q.prefqual_1;
                                        ;
                                        _GOTO(_LABEL_CLASS_CHECKER2_semchecker_enterconn_Block118_REP_0); // GOTO EVALUATED LABEL
                                    }
                                }
                                ;
                                // JavaLine 200 <== SourceLine 135
                                ((CLASS_CHECKER2)(_CUR._SL._SL)).display.putELEMENT(((CLASS_CHECKER2)(_CUR._SL._SL)).display.index(RTS_ENVIRONMENT.rank(((CLASS_CHECKER2)(_CUR._SL._SL)).cblev_6)),((CLASS_COMMON_brecord)_inspect_116_4587));
                                ;
                                // JavaLine 203 <== SourceLine 136
                                q=_inspect_116_4587.declquant;
                                ;
                                // JavaLine 206 <== SourceLine 137
                                while((q!=(null))) {
                                    {
                                        // JavaLine 209 <== SourceLine 140
                                        {
                                            // BEGIN INSPECTION 
                                            _inspect_140_4588=q.descr_1;
                                            if(_inspect_140_4588!=null) { // INSPECT _inspect_140_4588  type=ref(BRECORD)
                                                // JavaLine 214 <== SourceLine 141
                                                {
                                                    // JavaLine 216 <== SourceLine 140
                                                    {
                                                        // JavaLine 218 <== SourceLine 141
                                                        _inspect_140_4588.preinsp=new CLASS_COMMON_stackedb((_CUR._SL._SL),_inspect_140_4588.blev,_inspect_140_4588.rtblev,_inspect_140_4588.connests,_inspect_140_4588.inspected,_inspect_140_4588.preinsp)._STM();
                                                        ;
                                                        // JavaLine 221 <== SourceLine 143
                                                        _inspect_140_4588.inspected=((CLASS_CHECKER2)(_CUR._SL._SL)).cblev_6;
                                                        ;
                                                        // JavaLine 224 <== SourceLine 144
                                                        _inspect_140_4588.blev=((CLASS_CHECKER2)(_CUR._SL._SL)).cblev_6;
                                                        ;
                                                        _inspect_140_4588.rtblev=((CLASS_CHECKER2)(_CUR._SL._SL)).crtblev_6;
                                                        ;
                                                    }
                                                }
                                            }
                                        } // END INSPECTION
                                        ;
                                        // JavaLine 234 <== SourceLine 146
                                        q=q.prefqual_1;
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 240 <== SourceLine 149
                                qz=_inspect_116_4587.fpar;
                                ;
                                inlocals=true;
                                ;
                                // JavaLine 245 <== SourceLine 150
                                {
                                    _SIM_LABEL(4); // DeclaredIn: enterconn -> enterconn[externalIdent=CLASS_CHECKER2_semchecker_enterconn] Kind=5, QUAL=ProcedureDeclaration, HashCode=2068524493
                                    while((qz!=(null))) {
                                        {
                                            // JavaLine 250 <== SourceLine 151
                                            if(_VALUE((qz.visible_1==(((char)0))))) {
                                                // JavaLine 252 <== SourceLine 152
                                                {
                                                    // BEGIN INSPECTION 
                                                    _inspect_152_4589=((CLASS_COMMON_identsymbol)(qz.symb_1));
                                                    if(_inspect_152_4589!=null) { // INSPECT _inspect_152_4589  type=ref(IDENTSYMBOL)
                                                        // JavaLine 257 <== SourceLine 153
                                                        {
                                                            // JavaLine 259 <== SourceLine 152
                                                            {
                                                                // JavaLine 261 <== SourceLine 153
                                                                {
                                                                    // BEGIN INSPECTION 
                                                                    _inspect_153_4590=new CLASS_COMMON_stackedi((_CUR._SL._SL),_inspect_152_4589.idhi,_inspect_152_4589.idlo)._STM();
                                                                    if(_inspect_153_4590!=null) { // INSPECT _inspect_153_4590  type=ref(STACKEDI)
                                                                        // JavaLine 266 <== SourceLine 154
                                                                        {
                                                                            // JavaLine 268 <== SourceLine 153
                                                                            {
                                                                                // JavaLine 270 <== SourceLine 154
                                                                                _inspect_153_4590.prevmeaning=_inspect_152_4589.curmeaning_1;
                                                                                ;
                                                                                _inspect_153_4590.next=chain;
                                                                                ;
                                                                                // JavaLine 275 <== SourceLine 155
                                                                                chain=((CLASS_COMMON_stackedi)_inspect_153_4590);
                                                                                ;
                                                                            }
                                                                        }
                                                                    }
                                                                } // END INSPECTION
                                                                ;
                                                                // JavaLine 283 <== SourceLine 157
                                                                _inspect_152_4589.curmeaning_1=qz;
                                                                ;
                                                            }
                                                        }
                                                    }
                                                } // END INSPECTION
                                            }
                                            ;
                                            // JavaLine 292 <== SourceLine 159
                                            qz=((CLASS_COMMON_quantity)(qz.next));
                                            ;
                                        }
                                    }
                                }
                                ;
                                // JavaLine 299 <== SourceLine 161
                                if(_VALUE(inlocals)) {
                                    {
                                        if(_VALUE((_inspect_116_4587.favirt!=(null)))) {
                                            {
                                                // JavaLine 304 <== SourceLine 162
                                                qz=_inspect_116_4587.favirt;
                                                ;
                                                inlocals=false;
                                                ;
                                                _GOTO(_LABEL_CLASS_CHECKER2_semchecker_enterconn_Block118_SCANL_0); // GOTO EVALUATED LABEL
                                            }
                                        }
                                    }
                                }
                                ;
                                // JavaLine 315 <== SourceLine 165
                                q=_inspect_116_4587.declquant;
                                ;
                                // JavaLine 318 <== SourceLine 166
                                while((q.plev_1>(0))) {
                                    {
                                        // JavaLine 321 <== SourceLine 167
                                        q=q.prefqual_1;
                                        ;
                                        // JavaLine 324 <== SourceLine 168
                                        qz=q.descr_1.fpar;
                                        ;
                                        // JavaLine 327 <== SourceLine 169
                                        while((qz!=(null))) {
                                            {
                                                // JavaLine 330 <== SourceLine 170
                                                {
                                                    // BEGIN INSPECTION 
                                                    _inspect_170_4591=((CLASS_COMMON_identsymbol)(qz.symb_1));
                                                    if(_inspect_170_4591!=null) { // INSPECT _inspect_170_4591  type=ref(IDENTSYMBOL)
                                                        // JavaLine 335 <== SourceLine 171
                                                        {
                                                            // JavaLine 337 <== SourceLine 170
                                                            {
                                                                // JavaLine 339 <== SourceLine 171
                                                                if(_VALUE((qz.visible_1==(((char)0))))) {
                                                                    // JavaLine 341 <== SourceLine 172
                                                                    {
                                                                        // JavaLine 343 <== SourceLine 173
                                                                        if(_VALUE(((_inspect_170_4591.curmeaning_1==(null))||(((((CLASS_COMMON_quantity)(_inspect_170_4591.curmeaning_1)).encl_1.blev!=(_inspect_116_4587.blev))&((((CLASS_COMMON_quantity)(_inspect_170_4591.curmeaning_1)).encl_1!=(qz.encl_1)))))))) {
                                                                            // JavaLine 345 <== SourceLine 181
                                                                            {
                                                                                // JavaLine 347 <== SourceLine 182
                                                                                {
                                                                                    // BEGIN INSPECTION 
                                                                                    _inspect_182_4592=new CLASS_COMMON_stackedi((_CUR._SL._SL),_inspect_170_4591.idhi,_inspect_170_4591.idlo)._STM();
                                                                                    if(_inspect_182_4592!=null) { // INSPECT _inspect_182_4592  type=ref(STACKEDI)
                                                                                        // JavaLine 352 <== SourceLine 183
                                                                                        {
                                                                                            // JavaLine 354 <== SourceLine 182
                                                                                            {
                                                                                                // JavaLine 356 <== SourceLine 183
                                                                                                _inspect_182_4592.prevmeaning=_inspect_170_4591.curmeaning_1;
                                                                                                ;
                                                                                                _inspect_182_4592.next=chain;
                                                                                                ;
                                                                                                // JavaLine 361 <== SourceLine 184
                                                                                                chain=((CLASS_COMMON_stackedi)_inspect_182_4592);
                                                                                                ;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } // END INSPECTION
                                                                                ;
                                                                                // JavaLine 369 <== SourceLine 186
                                                                                _inspect_170_4591.curmeaning_1=qz;
                                                                                ;
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
                                                // JavaLine 383 <== SourceLine 190
                                                qz=((CLASS_COMMON_quantity)(qz.next));
                                                ;
                                            }
                                        }
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 392 <== SourceLine 193
                                _inspect_116_4587.preinsp.redeclChain=chain;
                                ;
                            }
                        }
                    }
                    else { // OTHERWISE 
                        // JavaLine 399 <== SourceLine 196
                        _GOTO(_LABEL_CLASS_CHECKER2_semchecker_enterconn_Block105_BADBLOCK_0); // GOTO EVALUATED LABEL
                    } // END OTHERWISE 
                } // END INSPECTION
                ;
                // JavaLine 404 <== SourceLine 197
                {
                    _SIM_LABEL(5); // DeclaredIn: enterconn
                    ;
                }
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_CHECKER2.sim","5 enterconn",1,91,11,105,13,119,15,120,17,150,19,198,22,92,25,95,29,116,31,140,33,152,35,153,37,170,39,182,73,98,76,100,81,101,84,105,90,106,95,107,100,108,105,109,108,110,115,111,118,112,121,114,127,116,132,117,134,116,136,118,139,119,147,120,152,121,155,122,158,123,162,124,172,127,179,129,182,130,191,131,200,135,203,136,206,137,209,140,214,141,216,140,218,141,221,143,224,144,234,146,240,149,245,150,250,151,252,152,257,153,259,152,261,153,266,154,268,153,270,154,275,155,283,157,292,159,299,161,304,162,315,165,318,166,321,167,324,168,327,169,330,170,335,171,337,170,339,171,341,172,343,173,345,181,347,182,352,183,354,182,356,183,361,184,369,186,383,190,392,193,399,196,404,197,418,198);
} // End of Procedure
