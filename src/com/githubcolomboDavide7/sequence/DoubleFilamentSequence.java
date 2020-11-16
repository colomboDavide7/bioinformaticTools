package com.githubcolomboDavide7.sequence;

import com.githubcolomboDavide7.Nucleotide.Nucleotide;
import com.githubcolomboDavide7.utils.SequenceFactory;

public abstract class DoubleFilamentSequence extends Sequence {

    public DoubleFilamentSequence(StringBuilder sequence) {
        super(sequence);
    }

    public DoubleFilamentSequence reverseComplement(){
        StringBuilder reverse = new StringBuilder();
        for(int i = super.sequence.length()-1; i >= 0; i--)
            reverse.append(Nucleotide.getComplementaryDNANucleotide(super.sequence.charAt(i)));
        return (DoubleFilamentSequence) SequenceFactory.make(SequenceType.DNA, reverse);
    }

}
