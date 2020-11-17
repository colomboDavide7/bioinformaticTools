package com.githubcolomboDavide7.geneticCode;

public interface ICodon {

    boolean matchCodon(String codon);

    boolean isStartCodon();

    boolean isTerminationCodon();

    boolean isUndefined();

}
