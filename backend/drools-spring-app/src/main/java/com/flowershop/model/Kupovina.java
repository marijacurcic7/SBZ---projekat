package com.flowershop.model;

public class Kupovina {

    private Map<Proizvod, Integer> proizvodi;
    private Date datum;
    private double iznos;

    public Kupovina() {
    }

    public Kupovina(Map<Proizvod,Integer> proizvodi, Date datum, double iznos) {
        this.proizvodi = proizvodi;
        this.datum = datum;
        this.iznos = iznos;
    }

    public Map<Proizvod,Integer> getProizvodi() {
        return this.proizvodi;
    }

    public void setProizvodi(Map<Proizvod,Integer> proizvodi) {
        this.proizvodi = proizvodi;
    }

    public Date getDatum() {
        return this.datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public double getIznos() {
        return this.iznos;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }

    public Kupovina proizvodi(Map<Proizvod,Integer> proizvodi) {
        setProizvodi(proizvodi);
        return this;
    }

    public Kupovina datum(Date datum) {
        setDatum(datum);
        return this;
    }

    public Kupovina iznos(double iznos) {
        setIznos(iznos);
        return this;
    }



}