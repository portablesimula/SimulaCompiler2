// JavaLine 1 <== SourceLine 1966
package simulaFEC;
// Simula-2.0 Compiled at Fri Aug 30 10:28:28 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class CLASS_PARSER_grammer_expression_exp extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1966, lastLine=2198, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public boolean p_sr;
    // Declare local labels
    // JavaLine 11 <== SourceLine 1992
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_expression_exp_restart_0=new RTS_LABEL(this,0,1,"restart"); // Local Label #1=restart At PrefixLevel 0
    // JavaLine 13 <== SourceLine 2020
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_expression_exp_Block1993_RPARout_0=new RTS_LABEL(this,0,2,"RPARout"); // Local Label #2=RPARout At PrefixLevel 0
    // JavaLine 15 <== SourceLine 2025
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_expression_exp_prefix_0=new RTS_LABEL(this,0,3,"prefix"); // Local Label #3=prefix At PrefixLevel 0
    // JavaLine 17 <== SourceLine 2026
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_expression_exp_Block2026_relopout_0=new RTS_LABEL(this,0,4,"relopout"); // Local Label #4=relopout At PrefixLevel 0
    // JavaLine 19 <== SourceLine 2046
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_expression_exp_Block2033_arithopout_0=new RTS_LABEL(this,0,5,"arithopout"); // Local Label #5=arithopout At PrefixLevel 0
    // JavaLine 21 <== SourceLine 2058
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_expression_exp_constout_0=new RTS_LABEL(this,0,6,"constout"); // Local Label #6=constout At PrefixLevel 0
    // JavaLine 23 <== SourceLine 2101
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_expression_exp_Block2061_param_0=new RTS_LABEL(this,0,7,"param"); // Local Label #7=param At PrefixLevel 0
    // JavaLine 25 <== SourceLine 2111
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_expression_exp_Block2108_paramexp_0=new RTS_LABEL(this,0,8,"paramexp"); // Local Label #8=paramexp At PrefixLevel 0
    // JavaLine 27 <== SourceLine 2117
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_expression_exp_Block2108_Block2117_comarecover_0=new RTS_LABEL(this,0,9,"comarecover"); // Local Label #9=comarecover At PrefixLevel 0
    // JavaLine 29 <== SourceLine 2120
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_expression_exp_Block2108_Block2119_rgpaerror_0=new RTS_LABEL(this,0,10,"rgpaerror"); // Local Label #10=rgpaerror At PrefixLevel 0
    // JavaLine 31 <== SourceLine 2122
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_expression_exp_Block2108_rgparecover_0=new RTS_LABEL(this,0,11,"rgparecover"); // Local Label #11=rgparecover At PrefixLevel 0
    // JavaLine 33 <== SourceLine 2134
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_expression_exp_postfix_0=new RTS_LABEL(this,0,12,"postfix"); // Local Label #12=postfix At PrefixLevel 0
    // JavaLine 35 <== SourceLine 2159
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_expression_exp_Block2153_Block2158_E185_0=new RTS_LABEL(this,0,13,"E185"); // Local Label #13=E185 At PrefixLevel 0
    // JavaLine 37 <== SourceLine 2162
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_expression_exp_Block2153_Block2158_Eabte_0=new RTS_LABEL(this,0,14,"Eabte"); // Local Label #14=Eabte At PrefixLevel 0
    // JavaLine 39 <== SourceLine 2163
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_expression_exp_Block2153_Block2158_Eset_0=new RTS_LABEL(this,0,15,"Eset"); // Local Label #15=Eset At PrefixLevel 0
    // JavaLine 41 <== SourceLine 2175
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_expression_exp_operator_0=new RTS_LABEL(this,0,16,"operator"); // Local Label #16=operator At PrefixLevel 0
    // JavaLine 43 <== SourceLine 2198
    final RTS_LABEL _LABEL_CLASS_PARSER_grammer_expression_exp_expexit_0=new RTS_LABEL(this,0,17,"expexit"); // Local Label #17=expexit At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 46 <== SourceLine 1970
    public int parnum=0;
    // JavaLine 48 <== SourceLine 2037
    public CLASS_COMMON_symbolbox _inspect_2037_4508=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public CLASS_PARSER_grammer_expression_exp setPar(Object param) {
        try {
            switch(_nParLeft--) {
                case 1: p_sr=(boolean)objectValue(param); break;
                default: throw new RTS_SimulaRuntimeError("Too many parameters");
            }
        }
    catch(ClassCastException e) { throw new RTS_SimulaRuntimeError("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public CLASS_PARSER_grammer_expression_exp(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public CLASS_PARSER_grammer_expression_exp(RTS_RTObject _SL,boolean sp_sr) {
        super(_SL);
        // Parameter assignment to locals
        this.p_sr = sp_sr;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public CLASS_PARSER_grammer_expression_exp _STM() {
        CLASS_PARSER_grammer_expression_exp _THIS=(CLASS_PARSER_grammer_expression_exp)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,17); // For ByteCode Engineering
                // JavaLine 82 <== SourceLine 1990
                if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                    new CLASS_SCANNER_W0((_CUR._SL._SL._SL),new RTS_TXT("exp called"));
                }
                ;
                // JavaLine 87 <== SourceLine 1992
                {
                    _SIM_LABEL(1); // DeclaredIn: exp
                    if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs==(((char)23))))) {
                        {
                            // JavaLine 92 <== SourceLine 1993
                            if(_VALUE((p_sr&&((parnum==(0)))))) {
                                {
                                    // JavaLine 95 <== SourceLine 1994
                                    if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                                        // JavaLine 97 <== SourceLine 1995
                                        new CLASS_SCANNER_W1((_CUR._SL._SL._SL),new RTS_TXT("experror"),225);
                                    }
                                    ;
                                    // JavaLine 101 <== SourceLine 1996
                                    ((CLASS_PARSER_grammer)(_CUR._SL._SL)).experrorno_1=225;
                                    ;
                                    _GOTO(_LABEL_CLASS_PARSER_grammer_expression_exp_Block2153_Block2158_Eabte_0); // GOTO EVALUATED LABEL
                                }
                            }
                            ;
                            // JavaLine 108 <== SourceLine 1997
                            ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn=((char)23);
                            ;
                            call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,1997);
                            ;
                            // JavaLine 113 <== SourceLine 1998
                            ((CLASS_PARSER_grammer)(_CUR._SL._SL)).detach();
                            ;
                            // JavaLine 116 <== SourceLine 1999
                            if(_VALUE((((CLASS_PARSER_grammer_expression)(_CUR._SL)).ex==(null)))) {
                                ((CLASS_PARSER_grammer_expression)(_CUR._SL)).ex=((CLASS_PARSER_grammer_expression)new CLASS_PARSER_grammer_expression((_CUR._SL._SL))._START());
                            }
                            ;
                            // JavaLine 121 <== SourceLine 2000
                            call(((CLASS_PARSER_grammer_expression)(_CUR._SL)).ex,2000);
                            ;
                            // JavaLine 124 <== SourceLine 2001
                            if(_VALUE(((CLASS_PARSER_grammer_expression)(_CUR._SL)).ex.wasNotexpr)) {
                                _GOTO(_LABEL_CLASS_PARSER_grammer_expression_exp_Block2153_Block2158_Eset_0); // GOTO EVALUATED LABEL
                            }
                            ;
                            // JavaLine 129 <== SourceLine 2002
                            if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs!=('1')))) {
                                {
                                    // JavaLine 132 <== SourceLine 2003
                                    if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                                        // JavaLine 134 <== SourceLine 2004
                                        new CLASS_SCANNER_W1((_CUR._SL._SL._SL),new RTS_TXT("experror"),207);
                                    }
                                    ;
                                    // JavaLine 138 <== SourceLine 2005
                                    ((CLASS_PARSER_grammer)(_CUR._SL._SL)).experrorno_1=207;
                                    ;
                                    _GOTO(_LABEL_CLASS_PARSER_grammer_expression_exp_Block2153_Block2158_Eabte_0); // GOTO EVALUATED LABEL
                                }
                            }
                            ;
                            // JavaLine 145 <== SourceLine 2006
                            ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn='1';
                            ;
                            call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,2006);
                            ;
                            // JavaLine 150 <== SourceLine 2007
                            ((CLASS_PARSER_grammer)(_CUR._SL._SL)).detach();
                            ;
                            // JavaLine 153 <== SourceLine 2008
                            new CLASS_PARSER_grammer_expression_exp((_CUR._SL),true);
                            ;
                            // JavaLine 156 <== SourceLine 2009
                            if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs!=(((char)15))))) {
                                {
                                    // JavaLine 159 <== SourceLine 2010
                                    if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                                        // JavaLine 161 <== SourceLine 2011
                                        new CLASS_SCANNER_W1((_CUR._SL._SL._SL),new RTS_TXT("experror"),226);
                                    }
                                    ;
                                    // JavaLine 165 <== SourceLine 2012
                                    ((CLASS_PARSER_grammer)(_CUR._SL._SL)).experrorno_1=226;
                                    ;
                                    _GOTO(_LABEL_CLASS_PARSER_grammer_expression_exp_Block2153_Block2158_Eabte_0); // GOTO EVALUATED LABEL
                                }
                            }
                            ;
                            // JavaLine 172 <== SourceLine 2013
                            ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn=((char)15);
                            ;
                            call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,2013);
                            ;
                            // JavaLine 177 <== SourceLine 2014
                            ((CLASS_PARSER_grammer)(_CUR._SL._SL)).detach();
                            ;
                            // JavaLine 180 <== SourceLine 2015
                            new CLASS_PARSER_grammer_expression_exp((_CUR._SL),false);
                            ;
                            // JavaLine 183 <== SourceLine 2016
                            ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn='t';
                            ;
                            call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,2016);
                            ;
                            // JavaLine 188 <== SourceLine 2017
                            if(_VALUE((parnum==(0)))) {
                                {
                                    // JavaLine 191 <== SourceLine 2018
                                    ((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTblockprefix=((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTlhsassig=((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTrefexpr=true;
                                    ;
                                    // JavaLine 194 <== SourceLine 2019
                                    ((CLASS_PARSER_grammer_expression)(_CUR._SL)).lastsymb=((char)14);
                                    ;
                                    _GOTO(_LABEL_CLASS_PARSER_grammer_expression_exp_expexit_0); // GOTO EVALUATED LABEL
                                }
                            }
                            ;
                            // JavaLine 201 <== SourceLine 2020
                            {
                                _SIM_LABEL(2); // DeclaredIn: exp -> exp[externalIdent=CLASS_PARSER_grammer_expression_exp] Kind=5, QUAL=ProcedureDeclaration, HashCode=119156209
                                ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn='Q';
                            }
                            ;
                            call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,2020);
                            ;
                            // JavaLine 209 <== SourceLine 2021
                            if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs!=('Q')))) {
                                new CLASS_PARSER_grammer_ParsWarn((_CUR._SL._SL),285);
                            } else {
                                // JavaLine 213 <== SourceLine 2022
                                ((CLASS_PARSER_grammer)(_CUR._SL._SL)).detach();
                            }
                            ;
                            // JavaLine 217 <== SourceLine 2023
                            ((CLASS_PARSER_grammer_expression)(_CUR._SL)).lastsymb='Q';
                            ;
                            parnum=(parnum-(1));
                            ;
                            _GOTO(_LABEL_CLASS_PARSER_grammer_expression_exp_postfix_0); // GOTO EVALUATED LABEL
                            ;
                        }
                    }
                }
                ;
                // JavaLine 228 <== SourceLine 2025
                {
                    _SIM_LABEL(3); // DeclaredIn: exp
                    if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs==('#')))) {
                        {
                            // JavaLine 233 <== SourceLine 2026
                            {
                                _SIM_LABEL(4); // DeclaredIn: exp -> exp[externalIdent=CLASS_PARSER_grammer_expression_exp] Kind=5, QUAL=ProcedureDeclaration, HashCode=119156209
                                ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn=((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs;
                            }
                            ;
                            // JavaLine 239 <== SourceLine 2027
                            ((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTblockprefix=((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTdesig=((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTlhsassig=((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTrefexpr=true;
                            ;
                            // JavaLine 242 <== SourceLine 2029
                            call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,2029);
                            ;
                            // JavaLine 245 <== SourceLine 2030
                            ((CLASS_PARSER_grammer)(_CUR._SL._SL)).detach();
                            ;
                        }
                    }
                }
                ;
                // JavaLine 252 <== SourceLine 2032
                if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs==('G')))) {
                    {
                        // JavaLine 255 <== SourceLine 2033
                        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).detach();
                        ;
                        // JavaLine 258 <== SourceLine 2034
                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs==('[')))) {
                            {
                                // JavaLine 261 <== SourceLine 2037
                                {
                                    // BEGIN INSPECTION 
                                    _inspect_2037_4508=new CLASS_COMMON_boxof((_CUR._SL._SL._SL),((CLASS_PARSER)(_CUR._SL._SL._SL)).opdhi,((CLASS_PARSER)(_CUR._SL._SL._SL)).opdlo)._RESULT;
                                    if(_inspect_2037_4508!=null) { // INSPECT _inspect_2037_4508  type=ref(SYMBOLBOX)
                                        // JavaLine 266 <== SourceLine 2038
                                        {
                                            // JavaLine 268 <== SourceLine 2037
                                            {
                                                // JavaLine 270 <== SourceLine 2038
                                                if(_VALUE(RTS_ENVIRONMENT.digit(RTS_ENVIRONMENT.loadChar(_inspect_2037_4508.symbol,0)))) {
                                                    // JavaLine 272 <== SourceLine 2039
                                                    {
                                                        ((CLASS_PARSER)(_CUR._SL._SL._SL)).simsymbol=CONC(new RTS_TXT("-"),_inspect_2037_4508.symbol);
                                                        ;
                                                        // JavaLine 276 <== SourceLine 2040
                                                        new CLASS_COMMON_DEFCONST((_CUR._SL._SL._SL));
                                                        ;
                                                        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opdhi=((CLASS_PARSER)(_CUR._SL._SL._SL)).hashhi;
                                                        ;
                                                        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opdlo=((CLASS_PARSER)(_CUR._SL._SL._SL)).hashlo;
                                                        ;
                                                        // JavaLine 283 <== SourceLine 2041
                                                        _GOTO(_LABEL_CLASS_PARSER_grammer_expression_exp_constout_0); // GOTO EVALUATED LABEL
                                                        ;
                                                    }
                                                }
                                                ;
                                            }
                                        }
                                    }
                                } // END INSPECTION
                                ;
                            }
                        }
                        ;
                        // JavaLine 297 <== SourceLine 2045
                        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn=((char)146);
                        ;
                        // JavaLine 300 <== SourceLine 2046
                        {
                            _SIM_LABEL(5); // DeclaredIn: exp -> exp[externalIdent=CLASS_PARSER_grammer_expression_exp] Kind=5, QUAL=ProcedureDeclaration, HashCode=119156209
                            call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,2046);
                        }
                        ;
                        // JavaLine 306 <== SourceLine 2047
                        if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL._SL)).opn!=(((char)146))))) {
                            // JavaLine 308 <== SourceLine 2048
                            ((CLASS_PARSER_grammer)(_CUR._SL._SL)).detach();
                        }
                        ;
                        // JavaLine 312 <== SourceLine 2049
                        ((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTblockprefix=((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTdesig=((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTlhsassig=((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTrefexpr=true;
                        ;
                    }
                } else {
                    // JavaLine 317 <== SourceLine 2052
                    if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs==('F')))) {
                        {
                            // JavaLine 320 <== SourceLine 2053
                            ((CLASS_PARSER_grammer)(_CUR._SL._SL)).detach();
                            ;
                            // JavaLine 323 <== SourceLine 2054
                            ((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTblockprefix=((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTdesig=((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTlhsassig=((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTrefexpr=true;
                            ;
                        }
                    }
                }
                ;
                // JavaLine 330 <== SourceLine 2058
                {
                    _SIM_LABEL(6); // DeclaredIn: exp
                    ((CLASS_PARSER_grammer_expression)(_CUR._SL)).lastsymb=((char)14);
                }
                ;
                // JavaLine 336 <== SourceLine 2059
                if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs==('Z')))) {
                    ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn='Z';
                } else {
                    // JavaLine 340 <== SourceLine 2060
                    {
                        // JavaLine 342 <== SourceLine 2061
                        ((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTblockprefix=true;
                        ;
                        // JavaLine 345 <== SourceLine 2062
                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs==('[')))) {
                            {
                                // JavaLine 348 <== SourceLine 2063
                                ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn='[';
                                ;
                                call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,2063);
                                ;
                                // JavaLine 353 <== SourceLine 2064
                                ((CLASS_PARSER_grammer)(_CUR._SL._SL)).getopt=false;
                                ;
                                ((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs=((CLASS_PARSER)(_CUR._SL._SL._SL)).opt;
                                ;
                                // JavaLine 358 <== SourceLine 2065
                                ((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTdesig=true;
                                ;
                                // JavaLine 361 <== SourceLine 2066
                                if(_VALUE(((((CLASS_PARSER)(_CUR._SL._SL._SL)).opdhi==(((char)0)))&&((((CLASS_PARSER)(_CUR._SL._SL._SL)).opdlo==('A')))))) {
                                    {
                                        // JavaLine 364 <== SourceLine 2068
                                        _GOTO(_LABEL_CLASS_PARSER_grammer_expression_exp_postfix_0); // GOTO EVALUATED LABEL
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 370 <== SourceLine 2069
                                ((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTlhsassig=((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTrefexpr=true;
                                ;
                                // JavaLine 373 <== SourceLine 2070
                                _GOTO(_LABEL_CLASS_PARSER_grammer_expression_exp_operator_0); // GOTO EVALUATED LABEL
                                ;
                            }
                        }
                        ;
                        // JavaLine 379 <== SourceLine 2072
                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs==('P')))) {
                            {
                                // JavaLine 382 <== SourceLine 2073
                                ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn='P';
                                ;
                                call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,2073);
                                ;
                                // JavaLine 387 <== SourceLine 2074
                                ((CLASS_PARSER_grammer)(_CUR._SL._SL)).detach();
                                ;
                                // JavaLine 390 <== SourceLine 2075
                                parnum=(parnum+(1));
                                ;
                                _GOTO(_LABEL_CLASS_PARSER_grammer_expression_exp_restart_0); // GOTO EVALUATED LABEL
                                ;
                            }
                        }
                        ;
                        // JavaLine 398 <== SourceLine 2077
                        ((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTdesig=true;
                        ;
                        // JavaLine 401 <== SourceLine 2078
                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs==('2')))) {
                            {
                                // JavaLine 404 <== SourceLine 2079
                                ((CLASS_PARSER_grammer)(_CUR._SL._SL)).detach();
                                ;
                                // JavaLine 407 <== SourceLine 2081
                                if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs!=('Z')))) {
                                    _GOTO(_LABEL_CLASS_PARSER_grammer_expression_exp_Block2153_Block2158_E185_0); // GOTO EVALUATED LABEL
                                }
                                ;
                                // JavaLine 412 <== SourceLine 2082
                                ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn='2';
                                ;
                                call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,2082);
                                ;
                                // JavaLine 417 <== SourceLine 2083
                                ((CLASS_PARSER_grammer)(_CUR._SL._SL)).getopt=false;
                                ;
                                ((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs=((CLASS_PARSER)(_CUR._SL._SL._SL)).opt;
                                ;
                                // JavaLine 422 <== SourceLine 2084
                                _GOTO(_LABEL_CLASS_PARSER_grammer_expression_exp_postfix_0); // GOTO EVALUATED LABEL
                                ;
                            }
                        }
                        ;
                        // JavaLine 428 <== SourceLine 2086
                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs!=('"')))) {
                            // JavaLine 430 <== SourceLine 2089
                            {
                                // JavaLine 432 <== SourceLine 2090
                                if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                                    // JavaLine 434 <== SourceLine 2091
                                    new CLASS_SCANNER_W1((_CUR._SL._SL._SL),new RTS_TXT("experror"),229);
                                }
                                ;
                                // JavaLine 438 <== SourceLine 2092
                                ((CLASS_PARSER_grammer)(_CUR._SL._SL)).experrorno_1=(((((CLASS_PARSER_grammer)(_CUR._SL._SL)).symboltype.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs))==(((char)2))))?(229):(228));
                                ;
                                // JavaLine 441 <== SourceLine 2094
                                _GOTO(_LABEL_CLASS_PARSER_grammer_expression_exp_Block2153_Block2158_Eabte_0); // GOTO EVALUATED LABEL
                                ;
                            }
                        } else {
                            // JavaLine 446 <== SourceLine 2096
                            ((CLASS_PARSER_grammer)(_CUR._SL._SL)).detach();
                        }
                        ;
                        // JavaLine 450 <== SourceLine 2097
                        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn='"';
                        ;
                        // JavaLine 453 <== SourceLine 2099
                        {
                            _SIM_LABEL(7); // DeclaredIn: exp -> exp[externalIdent=CLASS_PARSER_grammer_expression_exp] Kind=5, QUAL=ProcedureDeclaration, HashCode=119156209
                            // JavaLine 456 <== SourceLine 2101
                            if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs!=('Z')))) {
                                _GOTO(_LABEL_CLASS_PARSER_grammer_expression_exp_Block2153_Block2158_E185_0); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                    }
                }
                ;
                // JavaLine 465 <== SourceLine 2106
                ((CLASS_PARSER_grammer)(_CUR._SL._SL)).getopt=false;
                ;
                ((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs=((CLASS_PARSER)(_CUR._SL._SL._SL)).opt;
                ;
                // JavaLine 470 <== SourceLine 2107
                if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs==('P')))) {
                    {
                        // JavaLine 473 <== SourceLine 2108
                        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn=((CLASS_PARSER_grammer_expression)(_CUR._SL)).opnx=(((((CLASS_PARSER)(_CUR._SL._SL._SL)).opn==('"')))?(((char)134)):((((((CLASS_PARSER)(_CUR._SL._SL._SL)).opn==('Z')))?(((char)129)):('s'))));
                        ;
                        // JavaLine 476 <== SourceLine 2110
                        call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,2110);
                        ;
                        // JavaLine 479 <== SourceLine 2111
                        {
                            _SIM_LABEL(8); // DeclaredIn: exp -> exp[externalIdent=CLASS_PARSER_grammer_expression_exp] Kind=5, QUAL=ProcedureDeclaration, HashCode=119156209
                            ((CLASS_PARSER_grammer)(_CUR._SL._SL)).detach();
                        }
                        ;
                        // JavaLine 485 <== SourceLine 2112
                        if(_VALUE((((CLASS_PARSER_grammer_expression)(_CUR._SL)).ex==(null)))) {
                            ((CLASS_PARSER_grammer_expression)(_CUR._SL)).ex=((CLASS_PARSER_grammer_expression)new CLASS_PARSER_grammer_expression((_CUR._SL._SL))._START());
                        }
                        ;
                        // JavaLine 490 <== SourceLine 2113
                        call(((CLASS_PARSER_grammer_expression)(_CUR._SL)).ex,2113);
                        ;
                        // JavaLine 493 <== SourceLine 2114
                        if(_VALUE(((CLASS_PARSER_grammer_expression)(_CUR._SL)).ex.wasNotexpr)) {
                            {
                                // JavaLine 496 <== SourceLine 2115
                                new CLASS_PARSER_grammer_ParsErr((_CUR._SL._SL),205);
                                ;
                                new CLASS_PARSER_grammer_expression_exp_parexprecover((_CUR));
                            }
                        }
                        ;
                        // JavaLine 503 <== SourceLine 2116
                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs==('N')))) {
                            {
                                // JavaLine 506 <== SourceLine 2117
                                {
                                    _SIM_LABEL(9); // DeclaredIn: exp -> exp[externalIdent=CLASS_PARSER_grammer_expression_exp] Kind=5, QUAL=ProcedureDeclaration, HashCode=119156209
                                    ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn='N';
                                }
                                ;
                                call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,2117);
                                ;
                                _GOTO(_LABEL_CLASS_PARSER_grammer_expression_exp_Block2108_paramexp_0); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 518 <== SourceLine 2118
                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs!=('Q')))) {
                            {
                                // JavaLine 521 <== SourceLine 2119
                                {
                                    _SIM_LABEL(10); // DeclaredIn: exp -> exp[externalIdent=CLASS_PARSER_grammer_expression_exp] Kind=5, QUAL=ProcedureDeclaration, HashCode=119156209
                                    // JavaLine 524 <== SourceLine 2120
                                    new CLASS_PARSER_grammer_ParsWarn((_CUR._SL._SL),285);
                                }
                                ;
                            }
                        } else {
                            // JavaLine 530 <== SourceLine 2122
                            {
                                _SIM_LABEL(11); // DeclaredIn: exp -> exp[externalIdent=CLASS_PARSER_grammer_expression_exp] Kind=5, QUAL=ProcedureDeclaration, HashCode=119156209
                                ((CLASS_PARSER_grammer)(_CUR._SL._SL)).detach();
                            }
                        }
                        ;
                        // JavaLine 537 <== SourceLine 2123
                        if(_VALUE(((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs!=(((char)32)))||((!(((CLASS_PARSER_grammer_expression)(_CUR._SL)).startexprstmt)))))) {
                            {
                                // JavaLine 540 <== SourceLine 2124
                                ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn=(((((CLASS_PARSER_grammer_expression)(_CUR._SL)).opnx==(((char)134))))?('h'):('b'));
                                ;
                                // JavaLine 543 <== SourceLine 2125
                                call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,2125);
                                ;
                            }
                        }
                        ;
                    }
                } else {
                    // JavaLine 551 <== SourceLine 2128
                    if(_VALUE(((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs!=(((char)32)))||((!(((CLASS_PARSER_grammer_expression)(_CUR._SL)).startexprstmt)))))) {
                        // JavaLine 553 <== SourceLine 2129
                        call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,2129);
                    }
                }
                ;
                // JavaLine 558 <== SourceLine 2131
                {
                    _SIM_LABEL(12); // DeclaredIn: exp
                    // JavaLine 561 <== SourceLine 2134
                    if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs==('L')))) {
                        {
                            // JavaLine 564 <== SourceLine 2135
                            ((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTblockprefix=((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTdesig=true;
                            ;
                            // JavaLine 567 <== SourceLine 2136
                            ((CLASS_PARSER_grammer)(_CUR._SL._SL)).detach();
                            ;
                            ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn='L';
                            ;
                            // JavaLine 572 <== SourceLine 2137
                            ((CLASS_PARSER_grammer_expression)(_CUR._SL)).lastsymb=((char)14);
                            ;
                            _GOTO(_LABEL_CLASS_PARSER_grammer_expression_exp_Block2061_param_0); // GOTO EVALUATED LABEL
                            ;
                        }
                    }
                }
                ;
                // JavaLine 581 <== SourceLine 2141
                if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs==(')')))) {
                    {
                        // JavaLine 584 <== SourceLine 2142
                        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).detach();
                        ;
                        // JavaLine 587 <== SourceLine 2144
                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs!=('Z')))) {
                            _GOTO(_LABEL_CLASS_PARSER_grammer_expression_exp_Block2153_Block2158_E185_0); // GOTO EVALUATED LABEL
                        }
                        ;
                        // JavaLine 592 <== SourceLine 2145
                        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn=')';
                        ;
                        call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,2145);
                        ;
                        // JavaLine 597 <== SourceLine 2146
                        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).getopt=false;
                        ;
                        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs=((CLASS_PARSER)(_CUR._SL._SL._SL)).opt;
                        ;
                        // JavaLine 602 <== SourceLine 2147
                        ((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTblockprefix=((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTdesig=true;
                        ;
                        // JavaLine 605 <== SourceLine 2148
                        ((CLASS_PARSER_grammer_expression)(_CUR._SL)).lastsymb=')';
                        ;
                        _GOTO(_LABEL_CLASS_PARSER_grammer_expression_exp_postfix_0); // GOTO EVALUATED LABEL
                        ;
                    }
                }
                ;
                // JavaLine 613 <== SourceLine 2152
                if(_VALUE(((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs==(((char)29)))||((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs==(((char)25))))))) {
                    {
                        // JavaLine 616 <== SourceLine 2153
                        ((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTblockprefix=((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTdesig=((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTlhsassig=((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTrefexpr=true;
                        ;
                        // JavaLine 619 <== SourceLine 2155
                        ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn=((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs;
                        ;
                        // JavaLine 622 <== SourceLine 2156
                        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).detach();
                        ;
                        // JavaLine 625 <== SourceLine 2157
                        if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs!=('Z')))) {
                            {
                                // JavaLine 628 <== SourceLine 2158
                                {
                                    _SIM_LABEL(13); // DeclaredIn: exp -> exp[externalIdent=CLASS_PARSER_grammer_expression_exp] Kind=5, QUAL=ProcedureDeclaration, HashCode=119156209
                                    // JavaLine 631 <== SourceLine 2159
                                    if(_VALUE((((CLASS_PARSER)(_CUR._SL._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                                        // JavaLine 633 <== SourceLine 2160
                                        new CLASS_SCANNER_W1((_CUR._SL._SL._SL),new RTS_TXT("experror"),185);
                                    }
                                }
                                ;
                                // JavaLine 638 <== SourceLine 2161
                                ((CLASS_PARSER_grammer)(_CUR._SL._SL)).experrorno_1=185;
                                ;
                                // JavaLine 641 <== SourceLine 2162
                                {
                                    _SIM_LABEL(14); // DeclaredIn: exp -> exp[externalIdent=CLASS_PARSER_grammer_expression_exp] Kind=5, QUAL=ProcedureDeclaration, HashCode=119156209
                                    ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn='`';
                                }
                                ;
                                call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,2162);
                                ;
                                // JavaLine 649 <== SourceLine 2163
                                {
                                    _SIM_LABEL(15); // DeclaredIn: exp -> exp[externalIdent=CLASS_PARSER_grammer_expression_exp] Kind=5, QUAL=ProcedureDeclaration, HashCode=119156209
                                    ((CLASS_PARSER_grammer_expression)(_CUR._SL)).wasNotexpr=((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTblockprefix=((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTdesig=((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTlhsassig=((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTrefexpr=true;
                                }
                                ;
                                // JavaLine 655 <== SourceLine 2165
                                if(_VALUE((((CLASS_PARSER_grammer)(_CUR._SL._SL)).symboltype.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs))==(((char)2))))) {
                                    // JavaLine 657 <== SourceLine 2166
                                    ((CLASS_PARSER_grammer)(_CUR._SL._SL)).getopt=true;
                                }
                                ;
                                // JavaLine 661 <== SourceLine 2167
                                _GOTO(_LABEL_CLASS_PARSER_grammer_expression_exp_expexit_0); // GOTO EVALUATED LABEL
                                ;
                            }
                        }
                        ;
                        // JavaLine 667 <== SourceLine 2169
                        call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,2169);
                        ;
                        ((CLASS_PARSER_grammer_expression)(_CUR._SL)).lastsymb=((char)14);
                        ;
                        // JavaLine 672 <== SourceLine 2170
                        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).getopt=false;
                        ;
                        ((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs=((CLASS_PARSER)(_CUR._SL._SL._SL)).opt;
                        ;
                    }
                }
                ;
                // JavaLine 680 <== SourceLine 2174
                {
                    _SIM_LABEL(16); // DeclaredIn: exp
                    // JavaLine 683 <== SourceLine 2175
                    if(((CLASS_PARSER_grammer)(_CUR._SL._SL)).symboltype.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs))<((char)0) || ((CLASS_PARSER_grammer)(_CUR._SL._SL)).symboltype.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs))>((char)5)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                    switch(((CLASS_PARSER_grammer)(_CUR._SL._SL)).symboltype.getELEMENT(RTS_ENVIRONMENT.rank(((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs))) { // BEGIN SWITCH STATEMENT
                        case 4: 
                        // JavaLine 687 <== SourceLine 2176
                        _GOTO(_LABEL_CLASS_PARSER_grammer_expression_exp_Block2026_relopout_0); // GOTO EVALUATED LABEL
                        break;
                        case 3: 
                        // JavaLine 691 <== SourceLine 2177
                        {
                            ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn=((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs;
                            ;
                            _GOTO(_LABEL_CLASS_PARSER_grammer_expression_exp_Block2033_arithopout_0); // GOTO EVALUATED LABEL
                        }
                        break;
                        case 5: 
                        // JavaLine 699 <== SourceLine 2178
                        {
                            // JavaLine 701 <== SourceLine 2179
                            ((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTblockprefix=((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTdesig=((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTlhsassig=((CLASS_PARSER_grammer_expression)(_CUR._SL)).NOTrefexpr=true;
                            ;
                            // JavaLine 704 <== SourceLine 2181
                            ((CLASS_PARSER)(_CUR._SL._SL._SL)).opn=((CLASS_PARSER_grammer)(_CUR._SL._SL)).cs;
                            ;
                            call(((CLASS_PARSER)(_CUR._SL._SL._SL)).coder,2181);
                            ;
                            // JavaLine 709 <== SourceLine 2182
                            ((CLASS_PARSER_grammer)(_CUR._SL._SL)).detach();
                            ;
                            // JavaLine 712 <== SourceLine 2183
                            _GOTO(_LABEL_CLASS_PARSER_grammer_expression_exp_prefix_0); // GOTO EVALUATED LABEL
                        }
                        break;
                    } // END SWITCH STATEMENT
                }
                ;
                // JavaLine 719 <== SourceLine 2187
                if(_VALUE((parnum!=(0)))) {
                    _GOTO(_LABEL_CLASS_PARSER_grammer_expression_exp_Block1993_RPARout_0); // GOTO EVALUATED LABEL
                }
                ;
                // JavaLine 724 <== SourceLine 2189
                {
                    _SIM_LABEL(17); // DeclaredIn: exp
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CLASS_PARSER.sim","5 exp",1,1966,11,1992,13,2020,15,2025,17,2026,19,2046,21,2058,23,2101,25,2111,27,2117,29,2120,31,2122,33,2134,35,2159,37,2162,39,2163,41,2175,43,2198,46,1970,48,2037,82,1990,87,1992,92,1993,95,1994,97,1995,101,1996,108,1997,113,1998,116,1999,121,2000,124,2001,129,2002,132,2003,134,2004,138,2005,145,2006,150,2007,153,2008,156,2009,159,2010,161,2011,165,2012,172,2013,177,2014,180,2015,183,2016,188,2017,191,2018,194,2019,201,2020,209,2021,213,2022,217,2023,228,2025,233,2026,239,2027,242,2029,245,2030,252,2032,255,2033,258,2034,261,2037,266,2038,268,2037,270,2038,272,2039,276,2040,283,2041,297,2045,300,2046,306,2047,308,2048,312,2049,317,2052,320,2053,323,2054,330,2058,336,2059,340,2060,342,2061,345,2062,348,2063,353,2064,358,2065,361,2066,364,2068,370,2069,373,2070,379,2072,382,2073,387,2074,390,2075,398,2077,401,2078,404,2079,407,2081,412,2082,417,2083,422,2084,428,2086,430,2089,432,2090,434,2091,438,2092,441,2094,446,2096,450,2097,453,2099,456,2101,465,2106,470,2107,473,2108,476,2110,479,2111,485,2112,490,2113,493,2114,496,2115,503,2116,506,2117,518,2118,521,2119,524,2120,530,2122,537,2123,540,2124,543,2125,551,2128,553,2129,558,2131,561,2134,564,2135,567,2136,572,2137,581,2141,584,2142,587,2144,592,2145,597,2146,602,2147,605,2148,613,2152,616,2153,619,2155,622,2156,625,2157,628,2158,631,2159,633,2160,638,2161,641,2162,649,2163,655,2165,657,2166,661,2167,667,2169,672,2170,680,2174,683,2175,687,2176,691,2177,699,2178,701,2179,704,2181,709,2182,712,2183,719,2187,724,2189,738,2198);
} // End of Procedure
