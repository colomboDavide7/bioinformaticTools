package com.githubcolomboDavide7.utils;

public class SequenceFormatter {

    public static SequenceFormatter defaultSchema(){
        return new SequenceFormatter();
    }

    private final IStringFormatter defaultFormatter = String::toUpperCase;

    private SequenceFormatter(){
    }

    public StringBuilder defaultFormat(StringBuilder sequence){
        StringBuilder formatted = new StringBuilder(sequence.capacity());
        formatted.append(defaultFormatter.format(sequence.substring(0)));
        return formatted;
    }

// ========================================================================================================
    // Functional interface
    interface IStringFormatter{
        String format(String s);
    }

}
