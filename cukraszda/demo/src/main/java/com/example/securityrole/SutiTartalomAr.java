package com.example.securityrole;

public class SutiTartalomAr {
    private String nev;
    private String tipus;
    private String mentes;
    private int ertek;
    private String egyseg;
    private boolean dijazott;
    private String dijazott_string;

    public SutiTartalomAr(String nev, String tipus, String mentes, int ertek, String egyseg, boolean dijazott) {
        this.nev = nev;
        this.tipus = tipus;
        this.mentes = mentes;
        this.ertek = ertek;
        this.egyseg = egyseg;
        this.dijazott = dijazott;

        if (dijazott) {
            this.dijazott_string = "Díjazott";
        } else {
            this.dijazott_string = "Nem díjazott";
        }
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getMentes() {
        return mentes;
    }

    public void setMentes(String mentes) {
        this.mentes = mentes;
    }

    public int getErtek() {
        return ertek;
    }

    public void setErtek(int ertek) {
        this.ertek = ertek;
    }

    public String getEgyseg() {
        return egyseg;
    }

    public void setEgyseg(String egyseg) {
        this.egyseg = egyseg;
    }

    public boolean isDijazott() {
        return dijazott;
    }

    public String getDijazott_string() {
        return dijazott_string;
    }

    public void setDijazott(boolean dijazott) {
        this.dijazott = dijazott;
    }
}

