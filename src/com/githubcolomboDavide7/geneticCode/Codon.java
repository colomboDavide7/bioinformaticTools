package com.githubcolomboDavide7.geneticCode;

public class Codon implements ICodon {

    public static ICodon make(String c){
        return new Codon(c);
    }

    private final String c;

    private Codon(String c){
        this.c = c;
    }

    @Override
    public boolean matchCodon(String c){
        return this.c.equals(c);
    }

    @Override
    public boolean isStartCodon() {
        return ValidCodon.make(c).type == CodonType.START;
    }

    @Override
    public boolean isTerminationCodon() {
        return ValidCodon.make(c).type == CodonType.TERMINATION;
    }

    @Override
    public boolean isUndefined() {
        return ValidCodon.make(c).type == CodonType.UNDEFINED;
    }

    @Override
    public void appendCodon(StringBuilder sequence) {
        sequence.append(this.c);
    }

}
