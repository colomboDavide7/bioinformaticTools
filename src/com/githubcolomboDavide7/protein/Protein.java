package com.githubcolomboDavide7.protein;

public class Protein implements IProtein {

    private StringBuilder protein;

    public Protein(StringBuilder p){
        this.protein = p;
    }

    @Override
    public boolean matchProtein(String p) {
        for(int i = 0; i < this.protein.length(); i++)
            if(!this.protein.substring(i, i+1).equalsIgnoreCase(p.substring(i, i+1)))
                return false;
        return true;
    }

}
