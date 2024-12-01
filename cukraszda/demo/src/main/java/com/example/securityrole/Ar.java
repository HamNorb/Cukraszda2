package com.example.securityrole;

import jakarta.persistence.*;

@Entity
@Table(name="ar")
public class Ar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public void setSutiid(int sutiid) {
        this.sutiid = sutiid;
    }

    public void setErtek(int ertek) {
        this.ertek = ertek;
    }

    public void setEgyseg(String egyseg) {
        this.egyseg = egyseg;
    }

    public void setSuti(Suti suti) {
        this.suti = suti;
    }

    public int getId() {
        return id;
    }

    public int getSutiid() {
        return sutiid;
    }

    public int getErtek() {
        return ertek;
    }

    public String getEgyseg() {
        return egyseg;
    }

    public Suti getSuti() {
        return suti;
    }

    private int sutiid;
    private int ertek;
    private String egyseg;
    // Relationship Mapping
    @ManyToOne
    @JoinColumn(name = "sutiid", insertable = false, updatable = false)
    private Suti suti;
    // Getters and Setters
}

