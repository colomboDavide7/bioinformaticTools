package com.githubcolomboDavide7.sequence;

public class SingleFilamentFactory {

    public enum ValidType {
        mRNA;

        public static ValidType make(String type){
            for(ValidType t : ValidType.values())
                if(type.equalsIgnoreCase(t.name()))
                    return t;
            throw new IllegalArgumentException("Invalid type provided:" + type);
        }
    }

    public static SingleFilamentSequence make(String type, StringBuilder sequence){
        ValidType t = ValidType.make(type);
        switch(t){
            case mRNA:
                return new mRNASequence(sequence);
            default:
                throw new IllegalArgumentException("Invalid type provided: " + type);
        }
    }

}
