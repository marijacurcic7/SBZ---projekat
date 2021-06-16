package com.flowershop.dto;

import java.util.Map;

import com.flowershop.model.TipProizvoda;

public class ProizvodDTO {

    private Long id;

    private String naziv;

    private String opis;

    private TipProizvoda tip;

    // private Map<Long, Integer> cvece;

    private double cena;

    private double popust; 


    public ProizvodDTO() {
    }

    public ProizvodDTO(Long id, String naziv, String opis, TipProizvoda tip, double cena, double popust) {
        this.id = id;
        this.naziv = naziv;
        this.opis = opis;
        this.tip = tip;
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


}
