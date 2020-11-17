package com.githubcolomboDavide7.geneticCode;

import java.util.ArrayList;
import java.util.List;

public class CodonFactory {

    private static final int CODON_LENGTH = 3;

    public static List<Codon> make(StringBuilder sequence){
        List<Codon> codons = new ArrayList<>();
        int numberOfCodons = (int) Math.ceil(sequence.length() / (double)CODON_LENGTH);
        for(int i = 0; i < numberOfCodons; i++)
            switch(ValidCodon.make(sequence.substring(i * CODON_LENGTH, (i + 1) * CODON_LENGTH))) {
                case START:
                    codons.add(new StartCodon(sequence.substring(i * CODON_LENGTH, (i + 1) * CODON_LENGTH)));
                    break;
                case MIDDLE:
                    codons.add(new MiddleSequenceCodon(sequence.substring(i * CODON_LENGTH, (i + 1) * CODON_LENGTH)));
                    break;
                case TERMINATION:
                    codons.add(new TerminationCodon(sequence.substring(i * CODON_LENGTH, (i + 1) * CODON_LENGTH)));
                    break;
                case UNDEFINED:
                    codons.add(new UndefinedCodon(sequence.substring(i * CODON_LENGTH, (i + 1) * CODON_LENGTH)));
                    break;
                default:
                    break;
            }
        return codons;
    }
}
