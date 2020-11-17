package com.githubcolomboDavide7.geneticCode;

public interface ICodon {

    boolean matchCodon(ValidCodon codon);

    boolean isStartCodon();

}
