package com.githubcolomboDavide7.geneticCode;

public enum ValidCodon {

    AUG(CodonType.START),
    UUU(CodonType.ENCODING),
    UUC(CodonType.ENCODING),
    UUA(CodonType.ENCODING),
    UUG(CodonType.ENCODING),
    CUU(CodonType.ENCODING),
    CUC(CodonType.ENCODING),
    CUA(CodonType.ENCODING),
    CUG(CodonType.ENCODING),
    AUU(CodonType.ENCODING),
    AUC(CodonType.ENCODING),
    AUA(CodonType.ENCODING),
    GUU(CodonType.ENCODING),
    GUC(CodonType.ENCODING),
    GUA(CodonType.ENCODING),
    GUG(CodonType.ENCODING),
    UCU(CodonType.ENCODING),
    UCC(CodonType.ENCODING),
    UCA(CodonType.ENCODING),
    UCG(CodonType.ENCODING),
    CCU(CodonType.ENCODING),
    CCC(CodonType.ENCODING),
    CCA(CodonType.ENCODING),
    CCG(CodonType.ENCODING),
    ACU(CodonType.ENCODING),
    ACC(CodonType.ENCODING),
    ACA(CodonType.ENCODING),
    ACG(CodonType.ENCODING),
    GCU(CodonType.ENCODING),
    GCC(CodonType.ENCODING),
    GCA(CodonType.ENCODING),
    GCG(CodonType.ENCODING),
    UAU(CodonType.ENCODING),
    UAC(CodonType.ENCODING),
    UAA(CodonType.TERMINATION),
    UAG(CodonType.TERMINATION),
    CAU(CodonType.ENCODING),
    CAC(CodonType.ENCODING),
    CAA(CodonType.ENCODING),
    CAG(CodonType.ENCODING),
    AAU(CodonType.ENCODING),
    AAC(CodonType.ENCODING),
    AAA(CodonType.ENCODING),
    AAG(CodonType.ENCODING),
    GAU(CodonType.ENCODING),
    GAC(CodonType.ENCODING),
    GAA(CodonType.ENCODING),
    GAG(CodonType.ENCODING),
    UGU(CodonType.ENCODING),
    UGC(CodonType.ENCODING),
    UGA(CodonType.TERMINATION),
    UGG(CodonType.ENCODING),
    CGU(CodonType.ENCODING),
    CGC(CodonType.ENCODING),
    CGA(CodonType.ENCODING),
    CGG(CodonType.ENCODING),
    AGU(CodonType.ENCODING),
    AGC(CodonType.ENCODING),
    AGA(CodonType.ENCODING),
    AGG(CodonType.ENCODING),
    GGU(CodonType.ENCODING),
    GGC(CodonType.ENCODING),
    GGA(CodonType.ENCODING),
    GGG(CodonType.ENCODING);

    public final CodonType type;

    ValidCodon(CodonType type){
        this.type = type;
    }

    public static CodonType make(String c){
        for(ValidCodon v : ValidCodon.values())
            if(c.equalsIgnoreCase(v.toString()))
                return v.type;
        throw new IllegalArgumentException("Invalid codon " + c);
    }

}
