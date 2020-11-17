package com.githubcolomboDavide7.geneticCode;

public interface ICodon {

    boolean matchCodon(String codon);

    boolean matchAmminoacid(String a);

    boolean isStartCodon();

    boolean isTerminationCodon();

    boolean isUndefined();

    void appendCodon(StringBuilder sequence);

    void appendAmminoacid(StringBuilder protein);

}
