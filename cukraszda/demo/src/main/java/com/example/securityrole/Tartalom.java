package com.example.securityrole;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Tartalom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nev;  // Példa a "mentes" mezőhöz, amit szeretnél megjeleníteni

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getSutiid() {
        return sutiid;
    }

    public void setSutiid(int sutiid) {
        this.sutiid = sutiid;
    }

    public Suti getSuti() {
        return suti;
    }

    public void setSuti(Suti suti) {
        this.suti = suti;
    }

    private int sutiid;  // Az idegen kulcs, amely a Suti táblához tartozik

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sutiid", insertable = false, updatable = false)  // Suti entitással való kapcsolat
    private Suti suti;  // A kapcsolat a Suti entitással

    // Getterek és setterek

}
