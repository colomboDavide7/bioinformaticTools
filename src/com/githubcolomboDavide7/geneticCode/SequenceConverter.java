package com.githubcolomboDavide7.geneticCode;

import java.util.ArrayList;
import java.util.List;

public class SequenceConverter {

    private static final int CODON_LENGTH = 3;

    public static List<ICodon> sequence2CodonList(StringBuilder sequence){

        int numberOfCodons = (int) Math.ceil(sequence.length() / (double)CODON_LENGTH);
        List<ICodon> codons = new ArrayList<>(numberOfCodons);
        for(int i = 0; i < numberOfCodons; i++)
            codons.add(Codon.make(
                    sequence.substring(i * CODON_LENGTH,
                                      (i + 1) == numberOfCodons ? sequence.length(): (i+1) * CODON_LENGTH))
            );
        return codons;
    }

}
