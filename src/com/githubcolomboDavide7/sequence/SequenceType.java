package com.githubcolomboDavide7.sequence;

public enum SequenceType {
    DNA, mRNA;

    public static SequenceType make(String type){
        for(SequenceType t : SequenceType.values())
            if(type.equalsIgnoreCase(t.toString()))
                return t;
        throw new IllegalArgumentException("No sequence type associated to \"" + type + "\"");
    }

}
