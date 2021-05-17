package com.flowershop.model;

import java.util.Date;

public class Zahtev {

    private Long id;
    private String razlogKupovine;
    private String motiv;
    private Date datum;
    private Double minCena;
    private Double maxCena;
    

    public Zahtev() {
    }

    public Zahtev(Long id, String razlogKupovine, String motiv, Date datum, Double minCena, Double maxCena) {
        this.id = id;
        this.razlogKupovine = razlogKupovine;
        this.motiv = motiv;
        this.datum = datum;
        this.minCena = minCena;
        this.maxCena = maxCena;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRazlogKupovine() {
        return this.razlogKupovine;
    }

    public void setRazlogKupovine(String razlogKupovine) {
        this.razlogKupovine = razlogKupovine;
    }

    public String getMotiv() {
        return this.motiv;
    }

    public void setMotiv(String motiv) {
        this.motiv = motiv;
    }

    public Date getDatum() {
        return this.datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Double getMinCena() {
        return this.minCena;
    }

    public void setMinCena(Double minCena) {
        this.minCena = minCena;
    }

    public Double getMaxCena() {
        return this.maxCena;
    }

    public void setMaxCena(Double maxCena) {
        this.maxCena = maxCena;
    }

    public Zahtev razlogKupovine(String razlogKupovine) {
        setRazlogKupovine(razlogKupovine);
        return this;
    }

    public Zahtev motiv(String motiv) {
        setMotiv(motiv);
        return this;
    }

    public Zahtev datum(Date datum) {
        setDatum(datum);
        return this;
    }

    public Zahtev minCena(Double minCena) {
        setMinCena(minCena);
        return this;
    }

    public Zahtev maxCena(Double maxCena) {
        setMaxCena(maxCena);
        return this;
    }


    
}
