package com.githubcolomboDavide7.utils;

import com.githubcolomboDavide7.sequence.*;

public class SequenceFactory {

    public static DoubleFilamentSequence makeDoubleFilamentSequence(SequenceType type, StringBuilder seq){
        switch(type){
            case DNA:
                return new DNASequence(seq);
            default:
                throw new IllegalArgumentException("No sequence related to \"" + type.toString() + "\"");
        }
    }

}
