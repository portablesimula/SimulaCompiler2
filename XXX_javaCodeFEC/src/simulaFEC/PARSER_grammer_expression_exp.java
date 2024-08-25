// JavaLine 1 <== SourceLine 1965
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:23 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PARSER_grammer_expression_exp extends RTS_PROCEDURE {
    // ProcedureDeclaration: Kind=5, BlockLevel=4, firstLine=1965, lastLine=2197, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public boolean p_sr;
    // Declare local labels
    // JavaLine 11 <== SourceLine 1991
    final RTS_LABEL _LABEL_PARSER_grammer_expression_exp_restart_0=new RTS_LABEL(this,0,1,"restart"); // Local Label #1=restart At PrefixLevel 0
    // JavaLine 13 <== SourceLine 2019
    final RTS_LABEL _LABEL_PARSER_grammer_expression_exp_Block1992_RPARout_0=new RTS_LABEL(this,0,2,"RPARout"); // Local Label #2=RPARout At PrefixLevel 0
    // JavaLine 15 <== SourceLine 2024
    final RTS_LABEL _LABEL_PARSER_grammer_expression_exp_prefix_0=new RTS_LABEL(this,0,3,"prefix"); // Local Label #3=prefix At PrefixLevel 0
    // JavaLine 17 <== SourceLine 2025
    final RTS_LABEL _LABEL_PARSER_grammer_expression_exp_Block2025_relopout_0=new RTS_LABEL(this,0,4,"relopout"); // Local Label #4=relopout At PrefixLevel 0
    // JavaLine 19 <== SourceLine 2045
    final RTS_LABEL _LABEL_PARSER_grammer_expression_exp_Block2032_arithopout_0=new RTS_LABEL(this,0,5,"arithopout"); // Local Label #5=arithopout At PrefixLevel 0
    // JavaLine 21 <== SourceLine 2057
    final RTS_LABEL _LABEL_PARSER_grammer_expression_exp_constout_0=new RTS_LABEL(this,0,6,"constout"); // Local Label #6=constout At PrefixLevel 0
    // JavaLine 23 <== SourceLine 2100
    final RTS_LABEL _LABEL_PARSER_grammer_expression_exp_Block2060_param_0=new RTS_LABEL(this,0,7,"param"); // Local Label #7=param At PrefixLevel 0
    // JavaLine 25 <== SourceLine 2110
    final RTS_LABEL _LABEL_PARSER_grammer_expression_exp_Block2107_paramexp_0=new RTS_LABEL(this,0,8,"paramexp"); // Local Label #8=paramexp At PrefixLevel 0
    // JavaLine 27 <== SourceLine 2116
    final RTS_LABEL _LABEL_PARSER_grammer_expression_exp_Block2107_Block2116_comarecover_0=new RTS_LABEL(this,0,9,"comarecover"); // Local Label #9=comarecover At PrefixLevel 0
    // JavaLine 29 <== SourceLine 2119
    final RTS_LABEL _LABEL_PARSER_grammer_expression_exp_Block2107_Block2118_rgpaerror_0=new RTS_LABEL(this,0,10,"rgpaerror"); // Local Label #10=rgpaerror At PrefixLevel 0
    // JavaLine 31 <== SourceLine 2121
    final RTS_LABEL _LABEL_PARSER_grammer_expression_exp_Block2107_rgparecover_0=new RTS_LABEL(this,0,11,"rgparecover"); // Local Label #11=rgparecover At PrefixLevel 0
    // JavaLine 33 <== SourceLine 2133
    final RTS_LABEL _LABEL_PARSER_grammer_expression_exp_postfix_0=new RTS_LABEL(this,0,12,"postfix"); // Local Label #12=postfix At PrefixLevel 0
    // JavaLine 35 <== SourceLine 2158
    final RTS_LABEL _LABEL_PARSER_grammer_expression_exp_Block2152_Block2157_E185_0=new RTS_LABEL(this,0,13,"E185"); // Local Label #13=E185 At PrefixLevel 0
    // JavaLine 37 <== SourceLine 2161
    final RTS_LABEL _LABEL_PARSER_grammer_expression_exp_Block2152_Block2157_Eabte_0=new RTS_LABEL(this,0,14,"Eabte"); // Local Label #14=Eabte At PrefixLevel 0
    // JavaLine 39 <== SourceLine 2162
    final RTS_LABEL _LABEL_PARSER_grammer_expression_exp_Block2152_Block2157_Eset_0=new RTS_LABEL(this,0,15,"Eset"); // Local Label #15=Eset At PrefixLevel 0
    // JavaLine 41 <== SourceLine 2174
    final RTS_LABEL _LABEL_PARSER_grammer_expression_exp_operator_0=new RTS_LABEL(this,0,16,"operator"); // Local Label #16=operator At PrefixLevel 0
    // JavaLine 43 <== SourceLine 2197
    final RTS_LABEL _LABEL_PARSER_grammer_expression_exp_expexit_0=new RTS_LABEL(this,0,17,"expexit"); // Local Label #17=expexit At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 46 <== SourceLine 1969
    public int parnum=0;
    // JavaLine 48 <== SourceLine 2036
    public COMMON_symbolbox _inspect_2036_4508=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    @Override
    public PARSER_grammer_expression_exp setPar(Object param) {
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
    public PARSER_grammer_expression_exp(RTS_RTObject _SL) {
        super(_SL,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public PARSER_grammer_expression_exp(RTS_RTObject _SL,boolean sp_sr) {
        super(_SL);
        // Parameter assignment to locals
        this.p_sr = sp_sr;
        BBLK();
        // Declaration Code
        _STM();
    }
    // Procedure Statements
    @Override
    public PARSER_grammer_expression_exp _STM() {
        PARSER_grammer_expression_exp _THIS=(PARSER_grammer_expression_exp)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,17); // For ByteCode Engineering
                // JavaLine 82 <== SourceLine 1989
                if(_VALUE((((PARSER)(_CUR._SL._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                    new SCANNER_W0((_CUR._SL._SL._SL),new RTS_TXT("exp called"));
                }
                ;
                // JavaLine 87 <== SourceLine 1991
                {
                    _SIM_LABEL(1); // DeclaredIn: exp
                    if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs==(((char)23))))) {
                        {
                            // JavaLine 92 <== SourceLine 1992
                            if(_VALUE((p_sr&&((parnum==(0)))))) {
                                {
                                    // JavaLine 95 <== SourceLine 1993
                                    if(_VALUE((((PARSER)(_CUR._SL._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                                        // JavaLine 97 <== SourceLine 1994
                                        new SCANNER_W1((_CUR._SL._SL._SL),new RTS_TXT("experror"),225);
                                    }
                                    ;
                                    // JavaLine 101 <== SourceLine 1995
                                    ((PARSER_grammer)(_CUR._SL._SL)).experrorno_1=225;
                                    ;
                                    _GOTO(_LABEL_PARSER_grammer_expression_exp_Block2152_Block2157_Eabte_0); // GOTO EVALUATED LABEL
                                }
                            }
                            ;
                            // JavaLine 108 <== SourceLine 1996
                            ((PARSER)(_CUR._SL._SL._SL)).opn=((char)23);
                            ;
                            call(((PARSER)(_CUR._SL._SL._SL)).coder,1996);
                            ;
                            // JavaLine 113 <== SourceLine 1997
                            ((PARSER_grammer)(_CUR._SL._SL)).detach();
                            ;
                            // JavaLine 116 <== SourceLine 1998
                            if(_VALUE((((PARSER_grammer_expression)(_CUR._SL)).ex==(null)))) {
                                ((PARSER_grammer_expression)(_CUR._SL)).ex=((PARSER_grammer_expression)new PARSER_grammer_expression((_CUR._SL._SL))._START());
                            }
                            ;
                            // JavaLine 121 <== SourceLine 1999
                            call(((PARSER_grammer_expression)(_CUR._SL)).ex,1999);
                            ;
                            // JavaLine 124 <== SourceLine 2000
                            if(_VALUE(((PARSER_grammer_expression)(_CUR._SL)).ex.wasNotexpr)) {
                                _GOTO(_LABEL_PARSER_grammer_expression_exp_Block2152_Block2157_Eset_0); // GOTO EVALUATED LABEL
                            }
                            ;
                            // JavaLine 129 <== SourceLine 2001
                            if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs!=('1')))) {
                                {
                                    // JavaLine 132 <== SourceLine 2002
                                    if(_VALUE((((PARSER)(_CUR._SL._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                                        // JavaLine 134 <== SourceLine 2003
                                        new SCANNER_W1((_CUR._SL._SL._SL),new RTS_TXT("experror"),207);
                                    }
                                    ;
                                    // JavaLine 138 <== SourceLine 2004
                                    ((PARSER_grammer)(_CUR._SL._SL)).experrorno_1=207;
                                    ;
                                    _GOTO(_LABEL_PARSER_grammer_expression_exp_Block2152_Block2157_Eabte_0); // GOTO EVALUATED LABEL
                                }
                            }
                            ;
                            // JavaLine 145 <== SourceLine 2005
                            ((PARSER)(_CUR._SL._SL._SL)).opn='1';
                            ;
                            call(((PARSER)(_CUR._SL._SL._SL)).coder,2005);
                            ;
                            // JavaLine 150 <== SourceLine 2006
                            ((PARSER_grammer)(_CUR._SL._SL)).detach();
                            ;
                            // JavaLine 153 <== SourceLine 2007
                            new PARSER_grammer_expression_exp((_CUR._SL),true);
                            ;
                            // JavaLine 156 <== SourceLine 2008
                            if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs!=(((char)15))))) {
                                {
                                    // JavaLine 159 <== SourceLine 2009
                                    if(_VALUE((((PARSER)(_CUR._SL._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                                        // JavaLine 161 <== SourceLine 2010
                                        new SCANNER_W1((_CUR._SL._SL._SL),new RTS_TXT("experror"),226);
                                    }
                                    ;
                                    // JavaLine 165 <== SourceLine 2011
                                    ((PARSER_grammer)(_CUR._SL._SL)).experrorno_1=226;
                                    ;
                                    _GOTO(_LABEL_PARSER_grammer_expression_exp_Block2152_Block2157_Eabte_0); // GOTO EVALUATED LABEL
                                }
                            }
                            ;
                            // JavaLine 172 <== SourceLine 2012
                            ((PARSER)(_CUR._SL._SL._SL)).opn=((char)15);
                            ;
                            call(((PARSER)(_CUR._SL._SL._SL)).coder,2012);
                            ;
                            // JavaLine 177 <== SourceLine 2013
                            ((PARSER_grammer)(_CUR._SL._SL)).detach();
                            ;
                            // JavaLine 180 <== SourceLine 2014
                            new PARSER_grammer_expression_exp((_CUR._SL),false);
                            ;
                            // JavaLine 183 <== SourceLine 2015
                            ((PARSER)(_CUR._SL._SL._SL)).opn='t';
                            ;
                            call(((PARSER)(_CUR._SL._SL._SL)).coder,2015);
                            ;
                            // JavaLine 188 <== SourceLine 2016
                            if(_VALUE((parnum==(0)))) {
                                {
                                    // JavaLine 191 <== SourceLine 2017
                                    ((PARSER_grammer_expression)(_CUR._SL)).NOTblockprefix=((PARSER_grammer_expression)(_CUR._SL)).NOTlhsassig=((PARSER_grammer_expression)(_CUR._SL)).NOTrefexpr=true;
                                    ;
                                    // JavaLine 194 <== SourceLine 2018
                                    ((PARSER_grammer_expression)(_CUR._SL)).lastsymb=((char)14);
                                    ;
                                    _GOTO(_LABEL_PARSER_grammer_expression_exp_expexit_0); // GOTO EVALUATED LABEL
                                }
                            }
                            ;
                            // JavaLine 201 <== SourceLine 2019
                            {
                                _SIM_LABEL(2); // DeclaredIn: exp -> exp[externalIdent=PARSER_grammer_expression_exp] Kind=5, QUAL=ProcedureDeclaration, HashCode=946260334
                                ((PARSER)(_CUR._SL._SL._SL)).opn='Q';
                            }
                            ;
                            call(((PARSER)(_CUR._SL._SL._SL)).coder,2019);
                            ;
                            // JavaLine 209 <== SourceLine 2020
                            if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs!=('Q')))) {
                                new PARSER_grammer_ParsWarn((_CUR._SL._SL),285);
                            } else {
                                // JavaLine 213 <== SourceLine 2021
                                ((PARSER_grammer)(_CUR._SL._SL)).detach();
                            }
                            ;
                            // JavaLine 217 <== SourceLine 2022
                            ((PARSER_grammer_expression)(_CUR._SL)).lastsymb='Q';
                            ;
                            parnum=(parnum-(1));
                            ;
                            _GOTO(_LABEL_PARSER_grammer_expression_exp_postfix_0); // GOTO EVALUATED LABEL
                            ;
                        }
                    }
                }
                ;
                // JavaLine 228 <== SourceLine 2024
                {
                    _SIM_LABEL(3); // DeclaredIn: exp
                    if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs==('#')))) {
                        {
                            // JavaLine 233 <== SourceLine 2025
                            {
                                _SIM_LABEL(4); // DeclaredIn: exp -> exp[externalIdent=PARSER_grammer_expression_exp] Kind=5, QUAL=ProcedureDeclaration, HashCode=946260334
                                ((PARSER)(_CUR._SL._SL._SL)).opn=((PARSER_grammer)(_CUR._SL._SL)).cs;
                            }
                            ;
                            // JavaLine 239 <== SourceLine 2026
                            ((PARSER_grammer_expression)(_CUR._SL)).NOTblockprefix=((PARSER_grammer_expression)(_CUR._SL)).NOTdesig=((PARSER_grammer_expression)(_CUR._SL)).NOTlhsassig=((PARSER_grammer_expression)(_CUR._SL)).NOTrefexpr=true;
                            ;
                            // JavaLine 242 <== SourceLine 2028
                            call(((PARSER)(_CUR._SL._SL._SL)).coder,2028);
                            ;
                            // JavaLine 245 <== SourceLine 2029
                            ((PARSER_grammer)(_CUR._SL._SL)).detach();
                            ;
                        }
                    }
                }
                ;
                // JavaLine 252 <== SourceLine 2031
                if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs==('G')))) {
                    {
                        // JavaLine 255 <== SourceLine 2032
                        ((PARSER_grammer)(_CUR._SL._SL)).detach();
                        ;
                        // JavaLine 258 <== SourceLine 2033
                        if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs==('[')))) {
                            {
                                // JavaLine 261 <== SourceLine 2036
                                {
                                    // BEGIN INSPECTION 
                                    _inspect_2036_4508=new COMMON_boxof((_CUR._SL._SL._SL),((PARSER)(_CUR._SL._SL._SL)).opdhi,((PARSER)(_CUR._SL._SL._SL)).opdlo)._RESULT;
                                    if(_inspect_2036_4508!=null) { // INSPECT _inspect_2036_4508
                                        // JavaLine 266 <== SourceLine 2037
                                        {
                                            // JavaLine 268 <== SourceLine 2036
                                            {
                                                // JavaLine 270 <== SourceLine 2037
                                                if(_VALUE(RTS_ENVIRONMENT.digit(RTS_ENVIRONMENT.loadChar(_inspect_2036_4508.symbol,0)))) {
                                                    // JavaLine 272 <== SourceLine 2038
                                                    {
                                                        ((PARSER)(_CUR._SL._SL._SL)).simsymbol=CONC(new RTS_TXT("-"),_inspect_2036_4508.symbol);
                                                        ;
                                                        // JavaLine 276 <== SourceLine 2039
                                                        new COMMON_DEFCONST((_CUR._SL._SL._SL));
                                                        ;
                                                        ((PARSER)(_CUR._SL._SL._SL)).opdhi=((PARSER)(_CUR._SL._SL._SL)).hashhi;
                                                        ;
                                                        ((PARSER)(_CUR._SL._SL._SL)).opdlo=((PARSER)(_CUR._SL._SL._SL)).hashlo;
                                                        ;
                                                        // JavaLine 283 <== SourceLine 2040
                                                        _GOTO(_LABEL_PARSER_grammer_expression_exp_constout_0); // GOTO EVALUATED LABEL
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
                        // JavaLine 297 <== SourceLine 2044
                        ((PARSER)(_CUR._SL._SL._SL)).opn=((char)146);
                        ;
                        // JavaLine 300 <== SourceLine 2045
                        {
                            _SIM_LABEL(5); // DeclaredIn: exp -> exp[externalIdent=PARSER_grammer_expression_exp] Kind=5, QUAL=ProcedureDeclaration, HashCode=946260334
                            call(((PARSER)(_CUR._SL._SL._SL)).coder,2045);
                        }
                        ;
                        // JavaLine 306 <== SourceLine 2046
                        if(_VALUE((((PARSER)(_CUR._SL._SL._SL)).opn!=(((char)146))))) {
                            // JavaLine 308 <== SourceLine 2047
                            ((PARSER_grammer)(_CUR._SL._SL)).detach();
                        }
                        ;
                        // JavaLine 312 <== SourceLine 2048
                        ((PARSER_grammer_expression)(_CUR._SL)).NOTblockprefix=((PARSER_grammer_expression)(_CUR._SL)).NOTdesig=((PARSER_grammer_expression)(_CUR._SL)).NOTlhsassig=((PARSER_grammer_expression)(_CUR._SL)).NOTrefexpr=true;
                        ;
                    }
                } else {
                    // JavaLine 317 <== SourceLine 2051
                    if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs==('F')))) {
                        {
                            // JavaLine 320 <== SourceLine 2052
                            ((PARSER_grammer)(_CUR._SL._SL)).detach();
                            ;
                            // JavaLine 323 <== SourceLine 2053
                            ((PARSER_grammer_expression)(_CUR._SL)).NOTblockprefix=((PARSER_grammer_expression)(_CUR._SL)).NOTdesig=((PARSER_grammer_expression)(_CUR._SL)).NOTlhsassig=((PARSER_grammer_expression)(_CUR._SL)).NOTrefexpr=true;
                            ;
                        }
                    }
                }
                ;
                // JavaLine 330 <== SourceLine 2057
                {
                    _SIM_LABEL(6); // DeclaredIn: exp
                    ((PARSER_grammer_expression)(_CUR._SL)).lastsymb=((char)14);
                }
                ;
                // JavaLine 336 <== SourceLine 2058
                if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs==('Z')))) {
                    ((PARSER)(_CUR._SL._SL._SL)).opn='Z';
                } else {
                    // JavaLine 340 <== SourceLine 2059
                    {
                        // JavaLine 342 <== SourceLine 2060
                        ((PARSER_grammer_expression)(_CUR._SL)).NOTblockprefix=true;
                        ;
                        // JavaLine 345 <== SourceLine 2061
                        if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs==('[')))) {
                            {
                                // JavaLine 348 <== SourceLine 2062
                                ((PARSER)(_CUR._SL._SL._SL)).opn='[';
                                ;
                                call(((PARSER)(_CUR._SL._SL._SL)).coder,2062);
                                ;
                                // JavaLine 353 <== SourceLine 2063
                                ((PARSER_grammer)(_CUR._SL._SL)).getopt=false;
                                ;
                                ((PARSER_grammer)(_CUR._SL._SL)).cs=((PARSER)(_CUR._SL._SL._SL)).opt;
                                ;
                                // JavaLine 358 <== SourceLine 2064
                                ((PARSER_grammer_expression)(_CUR._SL)).NOTdesig=true;
                                ;
                                // JavaLine 361 <== SourceLine 2065
                                if(_VALUE(((((PARSER)(_CUR._SL._SL._SL)).opdhi==(((char)0)))&&((((PARSER)(_CUR._SL._SL._SL)).opdlo==('A')))))) {
                                    {
                                        // JavaLine 364 <== SourceLine 2067
                                        _GOTO(_LABEL_PARSER_grammer_expression_exp_postfix_0); // GOTO EVALUATED LABEL
                                        ;
                                    }
                                }
                                ;
                                // JavaLine 370 <== SourceLine 2068
                                ((PARSER_grammer_expression)(_CUR._SL)).NOTlhsassig=((PARSER_grammer_expression)(_CUR._SL)).NOTrefexpr=true;
                                ;
                                // JavaLine 373 <== SourceLine 2069
                                _GOTO(_LABEL_PARSER_grammer_expression_exp_operator_0); // GOTO EVALUATED LABEL
                                ;
                            }
                        }
                        ;
                        // JavaLine 379 <== SourceLine 2071
                        if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs==('P')))) {
                            {
                                // JavaLine 382 <== SourceLine 2072
                                ((PARSER)(_CUR._SL._SL._SL)).opn='P';
                                ;
                                call(((PARSER)(_CUR._SL._SL._SL)).coder,2072);
                                ;
                                // JavaLine 387 <== SourceLine 2073
                                ((PARSER_grammer)(_CUR._SL._SL)).detach();
                                ;
                                // JavaLine 390 <== SourceLine 2074
                                parnum=(parnum+(1));
                                ;
                                _GOTO(_LABEL_PARSER_grammer_expression_exp_restart_0); // GOTO EVALUATED LABEL
                                ;
                            }
                        }
                        ;
                        // JavaLine 398 <== SourceLine 2076
                        ((PARSER_grammer_expression)(_CUR._SL)).NOTdesig=true;
                        ;
                        // JavaLine 401 <== SourceLine 2077
                        if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs==('2')))) {
                            {
                                // JavaLine 404 <== SourceLine 2078
                                ((PARSER_grammer)(_CUR._SL._SL)).detach();
                                ;
                                // JavaLine 407 <== SourceLine 2080
                                if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs!=('Z')))) {
                                    _GOTO(_LABEL_PARSER_grammer_expression_exp_Block2152_Block2157_E185_0); // GOTO EVALUATED LABEL
                                }
                                ;
                                // JavaLine 412 <== SourceLine 2081
                                ((PARSER)(_CUR._SL._SL._SL)).opn='2';
                                ;
                                call(((PARSER)(_CUR._SL._SL._SL)).coder,2081);
                                ;
                                // JavaLine 417 <== SourceLine 2082
                                ((PARSER_grammer)(_CUR._SL._SL)).getopt=false;
                                ;
                                ((PARSER_grammer)(_CUR._SL._SL)).cs=((PARSER)(_CUR._SL._SL._SL)).opt;
                                ;
                                // JavaLine 422 <== SourceLine 2083
                                _GOTO(_LABEL_PARSER_grammer_expression_exp_postfix_0); // GOTO EVALUATED LABEL
                                ;
                            }
                        }
                        ;
                        // JavaLine 428 <== SourceLine 2085
                        if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs!=('"')))) {
                            // JavaLine 430 <== SourceLine 2088
                            {
                                // JavaLine 432 <== SourceLine 2089
                                if(_VALUE((((PARSER)(_CUR._SL._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                                    // JavaLine 434 <== SourceLine 2090
                                    new SCANNER_W1((_CUR._SL._SL._SL),new RTS_TXT("experror"),229);
                                }
                                ;
                                // JavaLine 438 <== SourceLine 2091
                                ((PARSER_grammer)(_CUR._SL._SL)).experrorno_1=(((((PARSER_grammer)(_CUR._SL._SL)).symboltype.getELEMENT(RTS_ENVIRONMENT.rank(((PARSER_grammer)(_CUR._SL._SL)).cs))==(((char)2))))?(229):(228));
                                ;
                                // JavaLine 441 <== SourceLine 2093
                                _GOTO(_LABEL_PARSER_grammer_expression_exp_Block2152_Block2157_Eabte_0); // GOTO EVALUATED LABEL
                                ;
                            }
                        } else {
                            // JavaLine 446 <== SourceLine 2095
                            ((PARSER_grammer)(_CUR._SL._SL)).detach();
                        }
                        ;
                        // JavaLine 450 <== SourceLine 2096
                        ((PARSER)(_CUR._SL._SL._SL)).opn='"';
                        ;
                        // JavaLine 453 <== SourceLine 2098
                        {
                            _SIM_LABEL(7); // DeclaredIn: exp -> exp[externalIdent=PARSER_grammer_expression_exp] Kind=5, QUAL=ProcedureDeclaration, HashCode=946260334
                            // JavaLine 456 <== SourceLine 2100
                            if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs!=('Z')))) {
                                _GOTO(_LABEL_PARSER_grammer_expression_exp_Block2152_Block2157_E185_0); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                    }
                }
                ;
                // JavaLine 465 <== SourceLine 2105
                ((PARSER_grammer)(_CUR._SL._SL)).getopt=false;
                ;
                ((PARSER_grammer)(_CUR._SL._SL)).cs=((PARSER)(_CUR._SL._SL._SL)).opt;
                ;
                // JavaLine 470 <== SourceLine 2106
                if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs==('P')))) {
                    {
                        // JavaLine 473 <== SourceLine 2107
                        ((PARSER)(_CUR._SL._SL._SL)).opn=((PARSER_grammer_expression)(_CUR._SL)).opnx=(((((PARSER)(_CUR._SL._SL._SL)).opn==('"')))?(((char)134)):((((((PARSER)(_CUR._SL._SL._SL)).opn==('Z')))?(((char)129)):('s'))));
                        ;
                        // JavaLine 476 <== SourceLine 2109
                        call(((PARSER)(_CUR._SL._SL._SL)).coder,2109);
                        ;
                        // JavaLine 479 <== SourceLine 2110
                        {
                            _SIM_LABEL(8); // DeclaredIn: exp -> exp[externalIdent=PARSER_grammer_expression_exp] Kind=5, QUAL=ProcedureDeclaration, HashCode=946260334
                            ((PARSER_grammer)(_CUR._SL._SL)).detach();
                        }
                        ;
                        // JavaLine 485 <== SourceLine 2111
                        if(_VALUE((((PARSER_grammer_expression)(_CUR._SL)).ex==(null)))) {
                            ((PARSER_grammer_expression)(_CUR._SL)).ex=((PARSER_grammer_expression)new PARSER_grammer_expression((_CUR._SL._SL))._START());
                        }
                        ;
                        // JavaLine 490 <== SourceLine 2112
                        call(((PARSER_grammer_expression)(_CUR._SL)).ex,2112);
                        ;
                        // JavaLine 493 <== SourceLine 2113
                        if(_VALUE(((PARSER_grammer_expression)(_CUR._SL)).ex.wasNotexpr)) {
                            {
                                // JavaLine 496 <== SourceLine 2114
                                new PARSER_grammer_ParsErr((_CUR._SL._SL),205);
                                ;
                                new PARSER_grammer_expression_exp_parexprecover((_CUR));
                            }
                        }
                        ;
                        // JavaLine 503 <== SourceLine 2115
                        if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs==('N')))) {
                            {
                                // JavaLine 506 <== SourceLine 2116
                                {
                                    _SIM_LABEL(9); // DeclaredIn: exp -> exp[externalIdent=PARSER_grammer_expression_exp] Kind=5, QUAL=ProcedureDeclaration, HashCode=946260334
                                    ((PARSER)(_CUR._SL._SL._SL)).opn='N';
                                }
                                ;
                                call(((PARSER)(_CUR._SL._SL._SL)).coder,2116);
                                ;
                                _GOTO(_LABEL_PARSER_grammer_expression_exp_Block2107_paramexp_0); // GOTO EVALUATED LABEL
                            }
                        }
                        ;
                        // JavaLine 518 <== SourceLine 2117
                        if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs!=('Q')))) {
                            {
                                // JavaLine 521 <== SourceLine 2118
                                {
                                    _SIM_LABEL(10); // DeclaredIn: exp -> exp[externalIdent=PARSER_grammer_expression_exp] Kind=5, QUAL=ProcedureDeclaration, HashCode=946260334
                                    // JavaLine 524 <== SourceLine 2119
                                    new PARSER_grammer_ParsWarn((_CUR._SL._SL),285);
                                }
                                ;
                            }
                        } else {
                            // JavaLine 530 <== SourceLine 2121
                            {
                                _SIM_LABEL(11); // DeclaredIn: exp -> exp[externalIdent=PARSER_grammer_expression_exp] Kind=5, QUAL=ProcedureDeclaration, HashCode=946260334
                                ((PARSER_grammer)(_CUR._SL._SL)).detach();
                            }
                        }
                        ;
                        // JavaLine 537 <== SourceLine 2122
                        if(_VALUE(((((PARSER_grammer)(_CUR._SL._SL)).cs!=(((char)32)))||((!(((PARSER_grammer_expression)(_CUR._SL)).startexprstmt)))))) {
                            {
                                // JavaLine 540 <== SourceLine 2123
                                ((PARSER)(_CUR._SL._SL._SL)).opn=(((((PARSER_grammer_expression)(_CUR._SL)).opnx==(((char)134))))?('h'):('b'));
                                ;
                                // JavaLine 543 <== SourceLine 2124
                                call(((PARSER)(_CUR._SL._SL._SL)).coder,2124);
                                ;
                            }
                        }
                        ;
                    }
                } else {
                    // JavaLine 551 <== SourceLine 2127
                    if(_VALUE(((((PARSER_grammer)(_CUR._SL._SL)).cs!=(((char)32)))||((!(((PARSER_grammer_expression)(_CUR._SL)).startexprstmt)))))) {
                        // JavaLine 553 <== SourceLine 2128
                        call(((PARSER)(_CUR._SL._SL._SL)).coder,2128);
                    }
                }
                ;
                // JavaLine 558 <== SourceLine 2130
                {
                    _SIM_LABEL(12); // DeclaredIn: exp
                    // JavaLine 561 <== SourceLine 2133
                    if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs==('L')))) {
                        {
                            // JavaLine 564 <== SourceLine 2134
                            ((PARSER_grammer_expression)(_CUR._SL)).NOTblockprefix=((PARSER_grammer_expression)(_CUR._SL)).NOTdesig=true;
                            ;
                            // JavaLine 567 <== SourceLine 2135
                            ((PARSER_grammer)(_CUR._SL._SL)).detach();
                            ;
                            ((PARSER)(_CUR._SL._SL._SL)).opn='L';
                            ;
                            // JavaLine 572 <== SourceLine 2136
                            ((PARSER_grammer_expression)(_CUR._SL)).lastsymb=((char)14);
                            ;
                            _GOTO(_LABEL_PARSER_grammer_expression_exp_Block2060_param_0); // GOTO EVALUATED LABEL
                            ;
                        }
                    }
                }
                ;
                // JavaLine 581 <== SourceLine 2140
                if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs==(')')))) {
                    {
                        // JavaLine 584 <== SourceLine 2141
                        ((PARSER_grammer)(_CUR._SL._SL)).detach();
                        ;
                        // JavaLine 587 <== SourceLine 2143
                        if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs!=('Z')))) {
                            _GOTO(_LABEL_PARSER_grammer_expression_exp_Block2152_Block2157_E185_0); // GOTO EVALUATED LABEL
                        }
                        ;
                        // JavaLine 592 <== SourceLine 2144
                        ((PARSER)(_CUR._SL._SL._SL)).opn=')';
                        ;
                        call(((PARSER)(_CUR._SL._SL._SL)).coder,2144);
                        ;
                        // JavaLine 597 <== SourceLine 2145
                        ((PARSER_grammer)(_CUR._SL._SL)).getopt=false;
                        ;
                        ((PARSER_grammer)(_CUR._SL._SL)).cs=((PARSER)(_CUR._SL._SL._SL)).opt;
                        ;
                        // JavaLine 602 <== SourceLine 2146
                        ((PARSER_grammer_expression)(_CUR._SL)).NOTblockprefix=((PARSER_grammer_expression)(_CUR._SL)).NOTdesig=true;
                        ;
                        // JavaLine 605 <== SourceLine 2147
                        ((PARSER_grammer_expression)(_CUR._SL)).lastsymb=')';
                        ;
                        _GOTO(_LABEL_PARSER_grammer_expression_exp_postfix_0); // GOTO EVALUATED LABEL
                        ;
                    }
                }
                ;
                // JavaLine 613 <== SourceLine 2151
                if(_VALUE(((((PARSER_grammer)(_CUR._SL._SL)).cs==(((char)29)))||((((PARSER_grammer)(_CUR._SL._SL)).cs==(((char)25))))))) {
                    {
                        // JavaLine 616 <== SourceLine 2152
                        ((PARSER_grammer_expression)(_CUR._SL)).NOTblockprefix=((PARSER_grammer_expression)(_CUR._SL)).NOTdesig=((PARSER_grammer_expression)(_CUR._SL)).NOTlhsassig=((PARSER_grammer_expression)(_CUR._SL)).NOTrefexpr=true;
                        ;
                        // JavaLine 619 <== SourceLine 2154
                        ((PARSER)(_CUR._SL._SL._SL)).opn=((PARSER_grammer)(_CUR._SL._SL)).cs;
                        ;
                        // JavaLine 622 <== SourceLine 2155
                        ((PARSER_grammer)(_CUR._SL._SL)).detach();
                        ;
                        // JavaLine 625 <== SourceLine 2156
                        if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).cs!=('Z')))) {
                            {
                                // JavaLine 628 <== SourceLine 2157
                                {
                                    _SIM_LABEL(13); // DeclaredIn: exp -> exp[externalIdent=PARSER_grammer_expression_exp] Kind=5, QUAL=ProcedureDeclaration, HashCode=946260334
                                    // JavaLine 631 <== SourceLine 2158
                                    if(_VALUE((((PARSER)(_CUR._SL._SL._SL)).option.getELEMENT(RTS_ENVIRONMENT.rank('2'))!=(((char)0))))) {
                                        // JavaLine 633 <== SourceLine 2159
                                        new SCANNER_W1((_CUR._SL._SL._SL),new RTS_TXT("experror"),185);
                                    }
                                }
                                ;
                                // JavaLine 638 <== SourceLine 2160
                                ((PARSER_grammer)(_CUR._SL._SL)).experrorno_1=185;
                                ;
                                // JavaLine 641 <== SourceLine 2161
                                {
                                    _SIM_LABEL(14); // DeclaredIn: exp -> exp[externalIdent=PARSER_grammer_expression_exp] Kind=5, QUAL=ProcedureDeclaration, HashCode=946260334
                                    ((PARSER)(_CUR._SL._SL._SL)).opn='`';
                                }
                                ;
                                call(((PARSER)(_CUR._SL._SL._SL)).coder,2161);
                                ;
                                // JavaLine 649 <== SourceLine 2162
                                {
                                    _SIM_LABEL(15); // DeclaredIn: exp -> exp[externalIdent=PARSER_grammer_expression_exp] Kind=5, QUAL=ProcedureDeclaration, HashCode=946260334
                                    ((PARSER_grammer_expression)(_CUR._SL)).wasNotexpr=((PARSER_grammer_expression)(_CUR._SL)).NOTblockprefix=((PARSER_grammer_expression)(_CUR._SL)).NOTdesig=((PARSER_grammer_expression)(_CUR._SL)).NOTlhsassig=((PARSER_grammer_expression)(_CUR._SL)).NOTrefexpr=true;
                                }
                                ;
                                // JavaLine 655 <== SourceLine 2164
                                if(_VALUE((((PARSER_grammer)(_CUR._SL._SL)).symboltype.getELEMENT(RTS_ENVIRONMENT.rank(((PARSER_grammer)(_CUR._SL._SL)).cs))==(((char)2))))) {
                                    // JavaLine 657 <== SourceLine 2165
                                    ((PARSER_grammer)(_CUR._SL._SL)).getopt=true;
                                }
                                ;
                                // JavaLine 661 <== SourceLine 2166
                                _GOTO(_LABEL_PARSER_grammer_expression_exp_expexit_0); // GOTO EVALUATED LABEL
                                ;
                            }
                        }
                        ;
                        // JavaLine 667 <== SourceLine 2168
                        call(((PARSER)(_CUR._SL._SL._SL)).coder,2168);
                        ;
                        ((PARSER_grammer_expression)(_CUR._SL)).lastsymb=((char)14);
                        ;
                        // JavaLine 672 <== SourceLine 2169
                        ((PARSER_grammer)(_CUR._SL._SL)).getopt=false;
                        ;
                        ((PARSER_grammer)(_CUR._SL._SL)).cs=((PARSER)(_CUR._SL._SL._SL)).opt;
                        ;
                    }
                }
                ;
                // JavaLine 680 <== SourceLine 2173
                {
                    _SIM_LABEL(16); // DeclaredIn: exp
                    // JavaLine 683 <== SourceLine 2174
                    if(((PARSER_grammer)(_CUR._SL._SL)).symboltype.getELEMENT(RTS_ENVIRONMENT.rank(((PARSER_grammer)(_CUR._SL._SL)).cs))<((char)0) || ((PARSER_grammer)(_CUR._SL._SL)).symboltype.getELEMENT(RTS_ENVIRONMENT.rank(((PARSER_grammer)(_CUR._SL._SL)).cs))>((char)5)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                    switch(((PARSER_grammer)(_CUR._SL._SL)).symboltype.getELEMENT(RTS_ENVIRONMENT.rank(((PARSER_grammer)(_CUR._SL._SL)).cs))) { // BEGIN SWITCH STATEMENT
                        case 4: 
                        // JavaLine 687 <== SourceLine 2175
                        _GOTO(_LABEL_PARSER_grammer_expression_exp_Block2025_relopout_0); // GOTO EVALUATED LABEL
                        break;
                        case 3: 
                        // JavaLine 691 <== SourceLine 2176
                        {
                            ((PARSER)(_CUR._SL._SL._SL)).opn=((PARSER_grammer)(_CUR._SL._SL)).cs;
                            ;
                            _GOTO(_LABEL_PARSER_grammer_expression_exp_Block2032_arithopout_0); // GOTO EVALUATED LABEL
                        }
                        break;
                        case 5: 
                        // JavaLine 699 <== SourceLine 2177
                        {
                            // JavaLine 701 <== SourceLine 2178
                            ((PARSER_grammer_expression)(_CUR._SL)).NOTblockprefix=((PARSER_grammer_expression)(_CUR._SL)).NOTdesig=((PARSER_grammer_expression)(_CUR._SL)).NOTlhsassig=((PARSER_grammer_expression)(_CUR._SL)).NOTrefexpr=true;
                            ;
                            // JavaLine 704 <== SourceLine 2180
                            ((PARSER)(_CUR._SL._SL._SL)).opn=((PARSER_grammer)(_CUR._SL._SL)).cs;
                            ;
                            call(((PARSER)(_CUR._SL._SL._SL)).coder,2180);
                            ;
                            // JavaLine 709 <== SourceLine 2181
                            ((PARSER_grammer)(_CUR._SL._SL)).detach();
                            ;
                            // JavaLine 712 <== SourceLine 2182
                            _GOTO(_LABEL_PARSER_grammer_expression_exp_prefix_0); // GOTO EVALUATED LABEL
                        }
                        break;
                    } // END SWITCH STATEMENT
                }
                ;
                // JavaLine 719 <== SourceLine 2186
                if(_VALUE((parnum!=(0)))) {
                    _GOTO(_LABEL_PARSER_grammer_expression_exp_Block1992_RPARout_0); // GOTO EVALUATED LABEL
                }
                ;
                // JavaLine 724 <== SourceLine 2188
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
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("PARSER.sim","5 exp",1,1965,11,1991,13,2019,15,2024,17,2025,19,2045,21,2057,23,2100,25,2110,27,2116,29,2119,31,2121,33,2133,35,2158,37,2161,39,2162,41,2174,43,2197,46,1969,48,2036,82,1989,87,1991,92,1992,95,1993,97,1994,101,1995,108,1996,113,1997,116,1998,121,1999,124,2000,129,2001,132,2002,134,2003,138,2004,145,2005,150,2006,153,2007,156,2008,159,2009,161,2010,165,2011,172,2012,177,2013,180,2014,183,2015,188,2016,191,2017,194,2018,201,2019,209,2020,213,2021,217,2022,228,2024,233,2025,239,2026,242,2028,245,2029,252,2031,255,2032,258,2033,261,2036,266,2037,268,2036,270,2037,272,2038,276,2039,283,2040,297,2044,300,2045,306,2046,308,2047,312,2048,317,2051,320,2052,323,2053,330,2057,336,2058,340,2059,342,2060,345,2061,348,2062,353,2063,358,2064,361,2065,364,2067,370,2068,373,2069,379,2071,382,2072,387,2073,390,2074,398,2076,401,2077,404,2078,407,2080,412,2081,417,2082,422,2083,428,2085,430,2088,432,2089,434,2090,438,2091,441,2093,446,2095,450,2096,453,2098,456,2100,465,2105,470,2106,473,2107,476,2109,479,2110,485,2111,490,2112,493,2113,496,2114,503,2115,506,2116,518,2117,521,2118,524,2119,530,2121,537,2122,540,2123,543,2124,551,2127,553,2128,558,2130,561,2133,564,2134,567,2135,572,2136,581,2140,584,2141,587,2143,592,2144,597,2145,602,2146,605,2147,613,2151,616,2152,619,2154,622,2155,625,2156,628,2157,631,2158,633,2159,638,2160,641,2161,649,2162,655,2164,657,2165,661,2166,667,2168,672,2169,680,2173,683,2174,687,2175,691,2176,699,2177,701,2178,704,2180,709,2181,712,2182,719,2186,724,2188,738,2197);
} // End of Procedure
