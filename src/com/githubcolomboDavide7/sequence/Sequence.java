package com.githubcolomboDavide7.sequence;

public abstract class Sequence implements ISequence {

    protected StringBuilder sequence;

    public Sequence(StringBuilder sequence){
        this.sequence = sequence;
    }

    @Override
    public boolean matchSequence(Sequence seq) {
        return sequence.toString().equals(seq.sequence.toString());
    }
}
