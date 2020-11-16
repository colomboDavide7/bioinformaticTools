package com.githubcolomboDavide7.Nucleotide;

public enum Nucleotide {

    A('A'),
    T('T'),
    C('C'),
    G('G'),
    U('U');

    public final char nitrogenBase;

    Nucleotide(char nitrogenBase){
        this.nitrogenBase = nitrogenBase;
    }

    public static char getNucleotide(char nucleotide){
        for(Nucleotide n : Nucleotide.values())
            if(n.nitrogenBase == nucleotide)
                return n.nitrogenBase;
        throw new IllegalArgumentException("Nitrogen base \"" + nucleotide + "\" does not exist");
    }

    public static char getComplementaryDNANucleotide(char nucleotide){
        switch(Nucleotide.valueOf(String.valueOf(nucleotide))){
            case A:
                return T.nitrogenBase;
            case T:
                return A.nitrogenBase;
            case C:
                return G.nitrogenBase;
            case G:
                return C.nitrogenBase;
            default:
                throw new IllegalArgumentException("Illegal DNA nucleotide \"" + nucleotide + "\"");
        }
    }

    public static char getAssociateRNANucleotide(char nucleotide){
        switch(Nucleotide.valueOf(String.valueOf(nucleotide))){
            case A:
                return U.nitrogenBase;
            case T:
                return A.nitrogenBase;
            case C:
                return G.nitrogenBase;
            case G:
                return C.nitrogenBase;
            default:
                throw new IllegalArgumentException("Illegal DNA nucleotide \"" + nucleotide + "\"");
        }
    }

}
