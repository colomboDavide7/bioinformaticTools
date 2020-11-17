package com.githubcolomboDavide7.sequence;

import com.githubcolomboDavide7.geneticCode.ICodon;
import com.githubcolomboDavide7.utils.SequenceConverter;
import com.githubcolomboDavide7.protein.IProtein;
import com.githubcolomboDavide7.protein.Protein;

import java.util.List;

public abstract class SingleFilamentSequence extends Sequence {

    public SingleFilamentSequence(StringBuilder sequence) {
        super(sequence);
    }

    public IProtein translate(){
        List<ICodon> codons = SequenceConverter.sequence2CodonList(super.sequence);
        StringBuilder protein = new StringBuilder(codons.size());
        for(ICodon c : codons)
            c.appendAmminoacid(protein);
        return new Protein(protein);
    }

}
