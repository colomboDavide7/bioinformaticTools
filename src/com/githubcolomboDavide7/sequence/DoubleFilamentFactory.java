package com.githubcolomboDavide7.sequence;


public class DoubleFilamentFactory {

    public enum ValidTypes {
        DNA;

        public static ValidTypes make(String type){
            for(ValidTypes t : ValidTypes.values())
                if(type.equalsIgnoreCase(t.name()))
                    return t;
            throw new IllegalArgumentException("The provided type is not valid");
        }
    }

    public static DoubleFilamentSequence make(String type, StringBuilder sequence){
        ValidTypes t = ValidTypes.make(type);
        switch(t){
            case DNA:
                return new DNASequence(sequence);
            default:
                throw new IllegalArgumentException("Invalid filament type");
        }
    }
}
