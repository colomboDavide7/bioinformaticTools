package com.githubcolomboDavide7.geneticCode;

import com.githubcolomboDavide7.protein.Amminoacid;

public enum ValidCodon {

    AUG(CodonType.START, Amminoacid.M),
    UUU(CodonType.MIDDLE, Amminoacid.F),
    UUC(CodonType.MIDDLE, Amminoacid.F),
    UUA(CodonType.MIDDLE, Amminoacid.L),
    UUG(CodonType.MIDDLE, Amminoacid.L),
    CUU(CodonType.MIDDLE, Amminoacid.L),
    CUC(CodonType.MIDDLE, Amminoacid.L),
    CUA(CodonType.MIDDLE, Amminoacid.L),
    CUG(CodonType.MIDDLE, Amminoacid.L),
    AUU(CodonType.MIDDLE, Amminoacid.I),
    AUC(CodonType.MIDDLE, Amminoacid.I),
    AUA(CodonType.MIDDLE, Amminoacid.I),
    GUU(CodonType.MIDDLE, Amminoacid.V),
    GUC(CodonType.MIDDLE, Amminoacid.V),
    GUA(CodonType.MIDDLE, Amminoacid.V),
    GUG(CodonType.MIDDLE, Amminoacid.V),
    UCU(CodonType.MIDDLE, Amminoacid.S),
    UCC(CodonType.MIDDLE, Amminoacid.S),
    UCA(CodonType.MIDDLE, Amminoacid.S),
    UCG(CodonType.MIDDLE, Amminoacid.S),
    CCU(CodonType.MIDDLE, Amminoacid.P),
    CCC(CodonType.MIDDLE, Amminoacid.P),
    CCA(CodonType.MIDDLE, Amminoacid.P),
    CCG(CodonType.MIDDLE, Amminoacid.P),
    ACU(CodonType.MIDDLE, Amminoacid.T),
    ACC(CodonType.MIDDLE, Amminoacid.T),
    ACA(CodonType.MIDDLE, Amminoacid.T),
    ACG(CodonType.MIDDLE, Amminoacid.T),
    GCU(CodonType.MIDDLE, Amminoacid.A),
    GCC(CodonType.MIDDLE, Amminoacid.A),
    GCA(CodonType.MIDDLE, Amminoacid.A),
    GCG(CodonType.MIDDLE, Amminoacid.A),
    UAU(CodonType.MIDDLE, Amminoacid.Y),
    UAC(CodonType.MIDDLE, Amminoacid.Y),
    UAA(CodonType.TERMINATION, Amminoacid.UNDEFINED),
    UAG(CodonType.TERMINATION, Amminoacid.UNDEFINED),
    CAU(CodonType.MIDDLE, Amminoacid.H),
    CAC(CodonType.MIDDLE, Amminoacid.H),
    CAA(CodonType.MIDDLE, Amminoacid.Q),
    CAG(CodonType.MIDDLE, Amminoacid.Q),
    AAU(CodonType.MIDDLE, Amminoacid.N),
    AAC(CodonType.MIDDLE, Amminoacid.N),
    AAA(CodonType.MIDDLE, Amminoacid.K),
    AAG(CodonType.MIDDLE, Amminoacid.K),
    GAU(CodonType.MIDDLE, Amminoacid.D),
    GAC(CodonType.MIDDLE, Amminoacid.D),
    GAA(CodonType.MIDDLE, Amminoacid.E),
    GAG(CodonType.MIDDLE, Amminoacid.E),
    UGU(CodonType.MIDDLE, Amminoacid.C),
    UGC(CodonType.MIDDLE, Amminoacid.C),
    UGA(CodonType.TERMINATION, Amminoacid.UNDEFINED),
    UGG(CodonType.MIDDLE, Amminoacid.W),
    CGU(CodonType.MIDDLE, Amminoacid.R),
    CGC(CodonType.MIDDLE, Amminoacid.R),
    CGA(CodonType.MIDDLE, Amminoacid.R),
    CGG(CodonType.MIDDLE, Amminoacid.R),
    AGU(CodonType.MIDDLE, Amminoacid.S),
    AGC(CodonType.MIDDLE, Amminoacid.S),
    AGA(CodonType.MIDDLE, Amminoacid.R),
    AGG(CodonType.MIDDLE, Amminoacid.R),
    GGU(CodonType.MIDDLE, Amminoacid.G),
    GGC(CodonType.MIDDLE, Amminoacid.G),
    GGA(CodonType.MIDDLE, Amminoacid.G),
    GGG(CodonType.MIDDLE, Amminoacid.G),
    UNDEFINED(CodonType.UNDEFINED, Amminoacid.UNDEFINED);

    public final CodonType type;
    public final Amminoacid a;

    ValidCodon(CodonType type, Amminoacid a){
        this.a = a;
        this.type = type;
    }

    public static ValidCodon make(String c){
        if(isValid(c))
            return ValidCodon.valueOf(c);
        return ValidCodon.UNDEFINED;
    }

    public static boolean isValid(String c){
        for(ValidCodon v : ValidCodon.values())
            if(c.equalsIgnoreCase(v.toString()))
                return true;
        return false;
    }

}
