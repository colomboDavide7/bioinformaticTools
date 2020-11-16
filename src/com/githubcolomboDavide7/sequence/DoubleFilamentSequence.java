package com.githubcolomboDavide7.sequence;

import com.githubcolomboDavide7.Nucleotide.Nucleotide;
import com.githubcolomboDavide7.utils.DoubleFilamentFactory;
import com.githubcolomboDavide7.utils.SingleFilamentFactory;

public abstract class DoubleFilamentSequence extends Sequence {

    public DoubleFilamentSequence(StringBuilder sequence) {
        super(sequence);
    }

    public DoubleFilamentSequence reverseComplement(){
        StringBuilder reverse = new StringBuilder();
        for(int i = super.sequence.length()-1; i >= 0; i--)
            reverse.append(Nucleotide.getComplementaryDNANucleotide(super.sequence.charAt(i)));
        return DoubleFilamentFactory.make("dna", reverse);
    }

    public SingleFilamentSequence transcript(){
        StringBuilder mRna = new StringBuilder();
        for(int i = 0; i < super.sequence.length(); i++)
            mRna.append(Nucleotide.getAssociateRNANucleotide(super.sequence.charAt(i)));
        return SingleFilamentFactory.make("mrna", mRna);
    }

}
