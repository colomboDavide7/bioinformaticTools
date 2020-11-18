package com.githubcolomboDavide7.utils;

import com.githubcolomboDavide7.geneticCode.Codon;

public class SequenceFormatter {

    public static SequenceFormatter getInstance(){
        if(theInstance == null)
            theInstance = new SequenceFormatter();
        return theInstance;
    }

    private static SequenceFormatter theInstance = null;

    private SequenceFormatter(){
    }

// ========================================================================================================
    private final IStringFormatter upperCase = String::toUpperCase;

    public StringBuilder toUpperCaseFormat(StringBuilder sequence){
        StringBuilder formatted = new StringBuilder(sequence.capacity());
        formatted.append(upperCase.format(sequence.substring(0)));
        return formatted;
    }

    public StringBuilder highlightCodons(StringBuilder sequence, String separator){
        StringBuilder formatted = new StringBuilder(sequence.capacity());
        for(int i = 0; i < sequence.length(); i++){
            if((i % Codon.CODON_LENGTH) == 0 && i != 0)
                formatted.append(separator);
            formatted.append(sequence.charAt(i));
        }
        return toUpperCaseFormat(formatted);
    }

// ========================================================================================================
    // Functional interface
    interface IStringFormatter{
        String format(String s);
    }

}
