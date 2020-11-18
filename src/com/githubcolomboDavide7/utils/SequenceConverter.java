package com.githubcolomboDavide7.utils;

import com.githubcolomboDavide7.geneticCode.Codon;
import com.githubcolomboDavide7.geneticCode.ICodon;

import java.util.ArrayList;
import java.util.List;

public class SequenceConverter {

    public static List<ICodon> sequence2CodonList(StringBuilder sequence){
        int numberOfCodons = (int) Math.ceil(sequence.length() / (double)Codon.CODON_LENGTH);
        List<ICodon> codons = new ArrayList<>(numberOfCodons);
        for(int i = 0; i < numberOfCodons; i++)
            codons.add(Codon.make(
                    sequence.substring(i * Codon.CODON_LENGTH,
                                      (i + 1) == numberOfCodons ? sequence.length(): (i+1) * Codon.CODON_LENGTH))
            );
        return codons;
    }

    public static StringBuilder codonList2Sequence(List<ICodon> codons){
        StringBuilder sequence = new StringBuilder(codons.size()*Codon.CODON_LENGTH);
        for(ICodon c : codons)
            c.appendCodon(sequence);
        return sequence;
    }

}
