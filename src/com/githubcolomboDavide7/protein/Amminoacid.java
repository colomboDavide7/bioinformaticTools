package com.githubcolomboDavide7.protein;

public enum Amminoacid {

    F("Phe"), L("Leu"), I("Ile"), M("Met"), V("Val"),
    S("Ser"), P("Pro"), T("Thr"), A("Ala"), Y("Tyr"),
    H("His"), Q("Gln"), N("Asn"), K("Lys"), D("Asp"),
    E("Glu"), C("Cys"), W("Trp"), R("Arg"), G("Gly"),
    UNDEFINED("UNDEFINED");

    public final String name;

    Amminoacid(String name){
        this.name = name;
    }

    public boolean match(String a){
        for(Amminoacid ammino : Amminoacid.values())
            if(a.equalsIgnoreCase(ammino.toString()) || a.equals(ammino.name))
                return true;
        return false;
    }

}
