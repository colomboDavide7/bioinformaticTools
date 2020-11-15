package com.githubcolomboDavide7.geneticCode;

public enum GeneticCode {

    AUG(true, false);

    public final boolean isStartCodon;
    public final boolean isStopCodon;

    GeneticCode(boolean isStartCodon, boolean isStopCodon){
        this.isStartCodon = isStartCodon;
        this.isStopCodon = isStopCodon;
    }

    // TODO - think that the genetic code is not equal for ALL organism

}
