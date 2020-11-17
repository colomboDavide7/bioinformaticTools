package com.githubcolomboDavide7.geneticCode;

public enum ValidCodon {

    AUG(CodonType.START),
    UUU(CodonType.MIDDLE),
    UUC(CodonType.MIDDLE),
    UUA(CodonType.MIDDLE),
    UUG(CodonType.MIDDLE),
    CUU(CodonType.MIDDLE),
    CUC(CodonType.MIDDLE),
    CUA(CodonType.MIDDLE),
    CUG(CodonType.MIDDLE),
    AUU(CodonType.MIDDLE),
    AUC(CodonType.MIDDLE),
    AUA(CodonType.MIDDLE),
    GUU(CodonType.MIDDLE),
    GUC(CodonType.MIDDLE),
    GUA(CodonType.MIDDLE),
    GUG(CodonType.MIDDLE),
    UCU(CodonType.MIDDLE),
    UCC(CodonType.MIDDLE),
    UCA(CodonType.MIDDLE),
    UCG(CodonType.MIDDLE),
    CCU(CodonType.MIDDLE),
    CCC(CodonType.MIDDLE),
    CCA(CodonType.MIDDLE),
    CCG(CodonType.MIDDLE),
    ACU(CodonType.MIDDLE),
    ACC(CodonType.MIDDLE),
    ACA(CodonType.MIDDLE),
    ACG(CodonType.MIDDLE),
    GCU(CodonType.MIDDLE),
    GCC(CodonType.MIDDLE),
    GCA(CodonType.MIDDLE),
    GCG(CodonType.MIDDLE),
    UAU(CodonType.MIDDLE),
    UAC(CodonType.MIDDLE),
    UAA(CodonType.TERMINATION),
    UAG(CodonType.TERMINATION),
    CAU(CodonType.MIDDLE),
    CAC(CodonType.MIDDLE),
    CAA(CodonType.MIDDLE),
    CAG(CodonType.MIDDLE),
    AAU(CodonType.MIDDLE),
    AAC(CodonType.MIDDLE),
    AAA(CodonType.MIDDLE),
    AAG(CodonType.MIDDLE),
    GAU(CodonType.MIDDLE),
    GAC(CodonType.MIDDLE),
    GAA(CodonType.MIDDLE),
    GAG(CodonType.MIDDLE),
    UGU(CodonType.MIDDLE),
    UGC(CodonType.MIDDLE),
    UGA(CodonType.TERMINATION),
    UGG(CodonType.MIDDLE),
    CGU(CodonType.MIDDLE),
    CGC(CodonType.MIDDLE),
    CGA(CodonType.MIDDLE),
    CGG(CodonType.MIDDLE),
    AGU(CodonType.MIDDLE),
    AGC(CodonType.MIDDLE),
    AGA(CodonType.MIDDLE),
    AGG(CodonType.MIDDLE),
    GGU(CodonType.MIDDLE),
    GGC(CodonType.MIDDLE),
    GGA(CodonType.MIDDLE),
    GGG(CodonType.MIDDLE),
    UNDEFINED(CodonType.UNDEFINED);

    public final CodonType type;

    ValidCodon(CodonType type){
        this.type = type;
    }

    public static ValidCodon make(String c){
        for(ValidCodon v : ValidCodon.values())
            if(c.equalsIgnoreCase(v.toString()))
                return v;
        return ValidCodon.UNDEFINED;
    }

}
