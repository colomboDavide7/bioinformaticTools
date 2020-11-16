package com.githubcolomboDavide7.sequence;

public abstract class Sequence {

    protected StringBuilder sequence;

    public Sequence(StringBuilder sequence){
        this.sequence = sequence;
    }

    public boolean matchSequence(Sequence seq) {
        return sequence.toString().equals(seq.sequence.toString());
    }

}
