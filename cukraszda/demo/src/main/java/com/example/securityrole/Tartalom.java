package com.example.securityrole;

import jakarta.persistence.*;

@Entity
@Table(name = "tartalom")
public class Tartalom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int sutiid;
    private String mentes;
    // Relationship Mapping
    @ManyToOne
    @JoinColumn(name = "sutiid", insertable = false, updatable = false)
    private Suti suti;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSutiid() {
        return sutiid;
    }

    public void setSutiid(int sutiid) {
        this.sutiid = sutiid;
    }

    public String getMentes() {
        return mentes;
    }

    public void setMentes(String mentes) {
        this.mentes = mentes;
    }

    public Suti getSuti() {
        return suti;
    }

    public void setSuti(Suti suti) {
        this.suti = suti;
    }
    // Getters and Setters
}

