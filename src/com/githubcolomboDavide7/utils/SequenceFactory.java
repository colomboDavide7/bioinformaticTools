package com.githubcolomboDavide7.utils;

import com.githubcolomboDavide7.sequence.DNASequence;
import com.githubcolomboDavide7.sequence.Sequence;
import com.githubcolomboDavide7.sequence.SequenceType;

public class SequenceFactory {

    public static Sequence make(SequenceType type, StringBuilder seq){
        switch(type){
            case DNA:
                return new DNASequence(seq);
            default:
                throw new IllegalArgumentException("No sequence related to \"" + type.toString() + "\"");
        }
    }

}