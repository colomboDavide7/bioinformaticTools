package com.githubcolomboDavide7.geneticCode;

public abstract class Codon {

    protected String c;

    public Codon(String c){
        this.c = c;
    }

    public boolean matchCodon(Codon codon){
        return this.c.equalsIgnoreCase(codon.c);
    }

}
