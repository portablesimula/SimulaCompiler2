// JavaLine 1 <== SourceLine 1949
package simulaFEC;
// Simula-2.0 Compiled at Wed Jul 17 09:58:32 CEST 2024
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class CHECKER1_semchecker1_nextargumentproducer extends RTS_CLASS {
    // ClassDeclaration: Kind=8, BlockLevel=3, PrefixLevel=0, firstLine=1949, lastLine=2109, hasLocalClasses=false, System=false, detachUsed=true
public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare local labels
    // JavaLine 11 <== SourceLine 2005
    final RTS_LABEL _LABEL_CHECKER1_semchecker1_nextargumentproducer_Block1977_Block2003_dummy_0=new RTS_LABEL(this,0,1,"dummy"); // Local Label #1=dummy At PrefixLevel 0
    // JavaLine 13 <== SourceLine 2021
    final RTS_LABEL _LABEL_CHECKER1_semchecker1_nextargumentproducer_Block1977_Block2017_GENINDEX_0=new RTS_LABEL(this,0,2,"GENINDEX"); // Local Label #2=GENINDEX At PrefixLevel 0
    // JavaLine 15 <== SourceLine 2065
    final RTS_LABEL _LABEL_CHECKER1_semchecker1_nextargumentproducer_Block1977_Block2037_Block2053_Block2057_enter_0=new RTS_LABEL(this,0,3,"enter"); // Local Label #3=enter At PrefixLevel 0
    // Declare locals as attributes
    // JavaLine 18 <== SourceLine 1951
    public boolean inuse=false;
    // JavaLine 20 <== SourceLine 1952
    public char kind=0;
    // JavaLine 22 <== SourceLine 1953
    public int count=0;
    // JavaLine 24 <== SourceLine 1958
    public int noofexpargs=0;
    // JavaLine 26 <== SourceLine 1959
    public int argno=0;
    // JavaLine 28 <== SourceLine 1960
    public int preflvl=0;
    // JavaLine 30 <== SourceLine 1961
    public CHECKER1_semchecker1_nextargumentproducer pred=null;
    public CHECKER1_semchecker1_nextargumentproducer suc=null;
    // JavaLine 33 <== SourceLine 1962
    public CHECKER1_semchecker1_identifier ident=null;
    // JavaLine 35 <== SourceLine 1963
    public CHECKER1_semchecker1_argument firstarg=null;
    public CHECKER1_semchecker1_argument lastarg=null;
    // JavaLine 38 <== SourceLine 1964
    public COMMON_quantity testquant=null;
    // JavaLine 40 <== SourceLine 1966
    public CHECKER1_semchecker1_parameter newpar=null;
    public CHECKER1_semchecker1_index newindex=null;
    // JavaLine 43 <== SourceLine 1967
    public COMMON_quantity cquant=null;
    public COMMON_brecord cbrec=null;
    // JavaLine 46 <== SourceLine 1968
    public RTS_REF_ARRAY<COMMON_quantity> prefixChain=null;
    // Normal Constructor
    public CHECKER1_semchecker1_nextargumentproducer(RTS_RTObject staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
        prefixChain=new RTS_REF_ARRAY<COMMON_quantity>(new RTS_BOUNDS(0,64));
    }
    // Class Statements
    @Override
    public CHECKER1_semchecker1_nextargumentproducer _STM() {
        CHECKER1_semchecker1_nextargumentproducer _THIS=(CHECKER1_semchecker1_nextargumentproducer)_CUR;
        _LOOP:while(_JTX>=0) {
            try {
                _JUMPTABLE(_JTX,3); // For ByteCode Engineering
                // JavaLine 63 <== SourceLine 1971
                new COMMON_TRC((_CUR._SL._SL),new RTS_TXT("CHECKER1"),1971,new RTS_TXT("NEW   NEXTARGUMENTPRODUCER"));
                ;
                // JavaLine 66 <== SourceLine 1972
                pred=((CHECKER1_semchecker1)(_CUR._SL)).lastnap_2;
                ;
                // JavaLine 69 <== SourceLine 1973
                firstarg=new CHECKER1_semchecker1_argument((_CUR._SL),0,null)._STM();
                ;
                // JavaLine 72 <== SourceLine 1976
                while(true) {
                    {
                        // JavaLine 75 <== SourceLine 1977
                        detach(1977);
                        ;
                        // JavaLine 78 <== SourceLine 1978
                        ident=((CHECKER1_semchecker1_identifier)(((CHECKER1_semchecker1)(_CUR._SL)).exptop_2));
                        ;
                        kind=ident.kind;
                        ;
                        inuse=true;
                        ;
                        // JavaLine 85 <== SourceLine 1979
                        lastarg=firstarg;
                        ;
                        firstarg.nextarg=null;
                        ;
                        // JavaLine 90 <== SourceLine 1980
                        noofexpargs=argno=0;
                        ;
                        // JavaLine 93 <== SourceLine 1985
                        if(_VALUE((((kind==(((char)0)))||((kind==(((char)3)))))||((kind==(((char)10))))))) {
                            ;
                        } else {
                            // JavaLine 97 <== SourceLine 1987
                            {
                                // JavaLine 99 <== SourceLine 1988
                                if(_VALUE((((((ident.meaning.categ_1==(((char)3)))||((ident.meaning.categ_1==(((char)4)))))||((kind==(((char)2)))))||((kind==(((char)6)))))||((kind==(((char)4))))))) {
                                    // JavaLine 101 <== SourceLine 1991
                                    testquant=ident.meaning;
                                } else {
                                    // JavaLine 104 <== SourceLine 1992
                                    if(_VALUE(((ident.meaning.categ_1==(((char)6)))&((ident.meaning.descr_1!=(null)))))) {
                                        // JavaLine 106 <== SourceLine 1993
                                        testquant=ident.meaning.match_1;
                                    }
                                }
                                ;
                            }
                        }
                        ;
                        // JavaLine 114 <== SourceLine 1996
                        new COMMON_QTRC((_CUR._SL._SL),new RTS_TXT("CHECKER1"),1996,new RTS_TXT("NEXT   NEXTARGUMENTPRODUCER  testquant on next line:"),testquant);
                        ;
                        // JavaLine 117 <== SourceLine 1998
                        detach(1998);
                        ;
                        // JavaLine 120 <== SourceLine 2000
                        if(_VALUE((testquant==(null)))) {
                            {
                                // JavaLine 123 <== SourceLine 2003
                                noofexpargs=1000;
                                ;
                                // JavaLine 126 <== SourceLine 2005
                                {
                                    _SIM_LABEL(1); // DeclaredIn: nextargumentproducer -> nextargumentproducer[CHECKER1_semchecker1_nextargumentproducer] DeclarationKind=Class
                                    while(inuse) {
                                        {
                                            // JavaLine 131 <== SourceLine 2006
                                            argno=(argno+(1));
                                            ;
                                            // JavaLine 134 <== SourceLine 2007
                                            newpar=new CHECKER1_semchecker1_parameter((_CUR._SL),argno,((CHECKER1_semchecker1)(_CUR._SL)).exptop_2,null)._STM();
                                            ;
                                            // JavaLine 137 <== SourceLine 2008
                                            lastarg=lastarg.nextarg=newpar;
                                            ;
                                            newpar=null;
                                            ;
                                            // JavaLine 142 <== SourceLine 2009
                                            new CHECKER1_semchecker1_popExpStack((_CUR._SL));
                                            ;
                                            // JavaLine 145 <== SourceLine 2010
                                            detach(2010);
                                            ;
                                        }
                                    }
                                }
                                ;
                            }
                        } else {
                            // JavaLine 154 <== SourceLine 2015
                            if(testquant.kind_1<((char)0) || testquant.kind_1>((char)13)) throw new RTS_SimulaRuntimeError("Switch key outside key interval");
                            switch(testquant.kind_1) { // BEGIN SWITCH STATEMENT
                                case 2: 
                                case 6: 
                                // JavaLine 159 <== SourceLine 2016
                                {
                                    // JavaLine 161 <== SourceLine 2017
                                    noofexpargs=((((testquant.categ_1==(((char)3)))||((testquant.categ_1==(((char)4))))))?(testquant.dim_1):(1000));
                                    ;
                                    // JavaLine 164 <== SourceLine 2021
                                    {
                                        _SIM_LABEL(2); // DeclaredIn: nextargumentproducer -> nextargumentproducer[CHECKER1_semchecker1_nextargumentproducer] DeclarationKind=Class
                                        while(inuse) {
                                            {
                                                // JavaLine 169 <== SourceLine 2022
                                                argno=(argno+(1));
                                                ;
                                                // JavaLine 172 <== SourceLine 2023
                                                newindex=new CHECKER1_semchecker1_index((_CUR._SL),argno,((CHECKER1_semchecker1)(_CUR._SL)).exptop_2)._STM();
                                                ;
                                                // JavaLine 175 <== SourceLine 2024
                                                lastarg=lastarg.nextarg=newindex;
                                                ;
                                                newindex=null;
                                                ;
                                                // JavaLine 180 <== SourceLine 2025
                                                new CHECKER1_semchecker1_popExpStack((_CUR._SL));
                                                ;
                                                // JavaLine 183 <== SourceLine 2027
                                                detach(2027);
                                                ;
                                            }
                                        }
                                    }
                                    ;
                                }
                                break;
                                case 4: 
                                // JavaLine 193 <== SourceLine 2033
                                {
                                    // JavaLine 195 <== SourceLine 2034
                                    noofexpargs=1;
                                    ;
                                    _GOTO(_LABEL_CHECKER1_semchecker1_nextargumentproducer_Block1977_Block2017_GENINDEX_0); // GOTO EVALUATED LABEL
                                }
                                break;
                                default:
                                // JavaLine 202 <== SourceLine 2036
                                {
                                    // JavaLine 204 <== SourceLine 2037
                                    cbrec=testquant.descr_1;
                                    ;
                                    // JavaLine 207 <== SourceLine 2038
                                    preflvl=1;
                                    ;
                                    prefixChain.putELEMENT(prefixChain.index(1),cbrec.fpar);
                                    ;
                                    // JavaLine 212 <== SourceLine 2044
                                    while((cbrec.declquant.plev_1>(1))) {
                                        {
                                            // JavaLine 215 <== SourceLine 2045
                                            cbrec=cbrec.declquant.prefqual_1.descr_1;
                                            ;
                                            // JavaLine 218 <== SourceLine 2046
                                            preflvl=(preflvl+(1));
                                            ;
                                            prefixChain.putELEMENT(prefixChain.index(preflvl),cbrec.fpar);
                                            ;
                                        }
                                    }
                                    ;
                                    // JavaLine 226 <== SourceLine 2048
                                    cbrec=null;
                                    ;
                                    // JavaLine 229 <== SourceLine 2050
                                    noofexpargs=count=testquant.descr_1.npar;
                                    ;
                                    // JavaLine 232 <== SourceLine 2051
                                    while((((count>(0))&&((preflvl!=(0))))&&(inuse))) {
                                        // JavaLine 234 <== SourceLine 2052
                                        {
                                            // JavaLine 236 <== SourceLine 2053
                                            cquant=prefixChain.getELEMENT(preflvl);
                                            ;
                                            // JavaLine 239 <== SourceLine 2054
                                            prefixChain.putELEMENT(prefixChain.index(preflvl),null);
                                            ;
                                            preflvl=(preflvl-(1));
                                            ;
                                            // JavaLine 244 <== SourceLine 2055
                                            _GOTO(_LABEL_CHECKER1_semchecker1_nextargumentproducer_Block1977_Block2037_Block2053_Block2057_enter_0); // GOTO EVALUATED LABEL
                                            ;
                                            // JavaLine 247 <== SourceLine 2056
                                            while(((cquant!=(null))&&(inuse))) {
                                                {
                                                    // JavaLine 250 <== SourceLine 2057
                                                    count=(count-(1));
                                                    ;
                                                    argno=(argno+(1));
                                                    ;
                                                    // JavaLine 255 <== SourceLine 2058
                                                    newpar=new CHECKER1_semchecker1_parameter((_CUR._SL),argno,((CHECKER1_semchecker1)(_CUR._SL)).exptop_2,cquant)._STM();
                                                    ;
                                                    // JavaLine 258 <== SourceLine 2059
                                                    if(_VALUE((((CHECKER1_semchecker1)(_CUR._SL)).exptop_2.p_ch==('[')))) {
                                                        ;
                                                    } else {
                                                        // JavaLine 262 <== SourceLine 2060
                                                        ident.issimple=0;
                                                    }
                                                    ;
                                                    // JavaLine 266 <== SourceLine 2061
                                                    lastarg=lastarg.nextarg=newpar;
                                                    ;
                                                    newpar=null;
                                                    ;
                                                    // JavaLine 271 <== SourceLine 2062
                                                    new CHECKER1_semchecker1_popExpStack((_CUR._SL));
                                                    ;
                                                    // JavaLine 274 <== SourceLine 2063
                                                    detach(2063);
                                                    ;
                                                    // JavaLine 277 <== SourceLine 2064
                                                    cquant=((COMMON_quantity)(cquant.next));
                                                    ;
                                                    // JavaLine 280 <== SourceLine 2065
                                                    {
                                                        _SIM_LABEL(3); // DeclaredIn: nextargumentproducer -> nextargumentproducer[CHECKER1_semchecker1_nextargumentproducer] DeclarationKind=Class
                                                        if(_VALUE((cquant!=(null)))) {
                                                            {
                                                                // JavaLine 285 <== SourceLine 2066
                                                                if(_VALUE(((cquant.categ_1==(((char)3)))||((cquant.categ_1==(((char)4))))))) {
                                                                    // JavaLine 287 <== SourceLine 2068
                                                                    cquant=null;
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
                                    ;
                                    // JavaLine 300 <== SourceLine 2072
                                    cquant=null;
                                    ;
                                    // JavaLine 303 <== SourceLine 2073
                                    while((preflvl!=(0))) {
                                        {
                                            // JavaLine 306 <== SourceLine 2074
                                            prefixChain.putELEMENT(prefixChain.index(preflvl),null);
                                            ;
                                            preflvl=(preflvl-(1));
                                        }
                                    }
                                    ;
                                    // JavaLine 313 <== SourceLine 2076
                                    if(_VALUE(inuse)) {
                                        {
                                            if(_VALUE((count==(0)))) {
                                                _GOTO(_LABEL_CHECKER1_semchecker1_nextargumentproducer_Block1977_Block2003_dummy_0); // GOTO EVALUATED LABEL
                                            }
                                        }
                                    }
                                    ;
                                    // JavaLine 322 <== SourceLine 2079
                                    if(_VALUE(((testquant.kind_1==(((char)1)))&&((testquant.dim_1==(RTS_ENVIRONMENT.rank('L'))))))) {
                                        // JavaLine 324 <== SourceLine 2080
                                        new CHECKER1_semchecker1_nextargumentproducer_Block1977_Block2037_Block2081((_CUR))._STM();
                                    }
                                    ;
                                }
                                break;
                            } // END SWITCH STATEMENT
                        }
                        ;
                        // JavaLine 333 <== SourceLine 2098
                        if(_VALUE((noofexpargs==(1000)))) {
                            // JavaLine 335 <== SourceLine 2099
                            {
                                // JavaLine 337 <== SourceLine 2102
                                noofexpargs=argno;
                                ;
                            }
                        }
                        ;
                        // JavaLine 343 <== SourceLine 2105
                        testquant=null;
                        ;
                    }
                    if(_CTX==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
                }
                ;
                // JavaLine 350 <== SourceLine 2109
                // BEGIN INNER PART
                // ENDOF INNER PART
                break _LOOP;
            }
            catch(RTS_LABEL q) {
                RTS_RTObject._TREAT_GOTO_CATCH_BLOCK(_THIS, q);
                _JTX=q.index; continue _LOOP; // EG. GOTO Lx
            }
        }
        EBLK();
        return(this);
    } // End of Class Statements
    public static RTS_PROGINFO _INFO=new RTS_PROGINFO("CHECKER1.sim","8 nextargumentproducer",1,1949,11,2005,13,2021,15,2065,18,1951,20,1952,22,1953,24,1958,26,1959,28,1960,30,1961,33,1962,35,1963,38,1964,40,1966,43,1967,46,1968,63,1971,66,1972,69,1973,72,1976,75,1977,78,1978,85,1979,90,1980,93,1985,97,1987,99,1988,101,1991,104,1992,106,1993,114,1996,117,1998,120,2000,123,2003,126,2005,131,2006,134,2007,137,2008,142,2009,145,2010,154,2015,159,2016,161,2017,164,2021,169,2022,172,2023,175,2024,180,2025,183,2027,193,2033,195,2034,202,2036,204,2037,207,2038,212,2044,215,2045,218,2046,226,2048,229,2050,232,2051,234,2052,236,2053,239,2054,244,2055,247,2056,250,2057,255,2058,258,2059,262,2060,266,2061,271,2062,274,2063,277,2064,280,2065,285,2066,287,2068,300,2072,303,2073,306,2074,313,2076,322,2079,324,2080,333,2098,335,2099,337,2102,343,2105,350,2109,362,2109);
} // End of Class
