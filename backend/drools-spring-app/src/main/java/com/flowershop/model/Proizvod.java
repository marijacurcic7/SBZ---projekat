package com.flowershop.model;

import java.util.Map;

public class Proizvod {
    
    private Long id;
    private String naziv;
    private String opis;
    private TipProizvoda tip;
    private Map<Cvet, Integer> cvece;
    private double cena;
    private double popust;
    

    public Proizvod() {
    }

    public Proizvod(Long id, String naziv, String opis, TipProizvoda tip, Map<Cvet,Integer> cvece, double cena, double popust) {
        this.id = id;
        this.naziv = naziv;
        this.opis = opis;
        this.tip = tip;
        this.cvece = cvece;
        this.cena = cena;
        this.popust = popust;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getNaziv() {
        return this.naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return this.opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public TipProizvoda getTip() {
        return this.tip;
    }

    public void setTip(TipProizvoda tip) {
        this.tip = tip;
    }

    public Map<Cvet,Integer> getCvece() {
        return this.cvece;
    }

    public void setCvece(Map<Cvet,Integer> cvece) {
        this.cvece = cvece;
    }

    public double getCena() {
        return this.cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public double getPopust() {
        return this.popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }

    public Proizvod naziv(String naziv) {
        setNaziv(naziv);
        return this;
    }

    public Proizvod opis(String opis) {
        setOpis(opis);
        return this;
    }

    public Proizvod tip(TipProizvoda tip) {
        setTip(tip);
        return this;
    }

    public Proizvod cvece(Map<Cvet,Integer> cvece) {
        setCvece(cvece);
        return this;
    }

    public Proizvod cena(double cena) {
        setCena(cena);
        return this;
    }

    public Proizvod popust(double popust) {
        setPopust(popust);
        return this;
    }


    
}
