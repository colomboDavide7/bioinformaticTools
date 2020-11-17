package com.githubcolomboDavide7.geneticCode;

public class Codon implements ICodon {

    public static ICodon make(ValidCodon c){
        return new Codon(c);
    }

    private final ValidCodon c;

    private Codon(ValidCodon c){
        this.c = c;
    }

    @Override
    public boolean matchCodon(ValidCodon c){
        return this.c.name().equals(c.name());
    }

    @Override
    public boolean isStartCodon() {
        return this.c.type == CodonType.START;
    }

    @Override
    public boolean isTerminationCodon() {
        return this.c.type == CodonType.TERMINATION;
    }

    @Override
    public boolean isUndefined() {
        return this.c.type == CodonType.UNDEFINED;
    }

}
