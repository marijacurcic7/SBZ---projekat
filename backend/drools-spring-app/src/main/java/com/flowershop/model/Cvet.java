package com.flowershop.model;

import java.util.Set;

public class Cvet {

    enum Miris { JAK, BLAG, NEMA };
    enum Sezona { ZIMA, PROLECE, LETO, JESEN }

    private Long id;
    private String naziv;
    private String opis;
    private String boja;
    private Set<String> simbolika;
    private Miris miris;
    private Set<Sezona> sezone;
    private Set<TipProizvoda> tipoviProizvoda;


    public Cvet() {
    }

    public Cvet(Long id, String naziv, String opis, String boja, Set<String> simbolika, Miris miris, Set<Sezona> sezone, Set<TipProizvoda> tipoviProizvoda) {
        this.id = id;
        this.naziv = naziv;
        this.opis = opis;
        this.boja = boja;
        this.simbolika = simbolika;
        this.miris = miris;
        this.sezone = sezone;
        this.tipoviProizvoda = tipoviProizvoda;
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

    public String getBoja() {
        return this.boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public Set<String> getSimbolika() {
        return this.simbolika;
    }

    public void setSimbolika(Set<String> simbolika) {
        this.simbolika = simbolika;
    }

    public Miris getMiris() {
        return this.miris;
    }

    public void setMiris(Miris miris) {
        this.miris = miris;
    }

    public Set<Sezona> getSezone() {
        return this.sezone;
    }

    public void setSezone(Set<Sezona> sezone) {
        this.sezone = sezone;
    }

    public Cvet naziv(String naziv) {
        setNaziv(naziv);
        return this;
    }

    public Cvet opis(String opis) {
        setOpis(opis);
        return this;
    }

    public Cvet boja(String boja) {
        setBoja(boja);
        return this;
    }

    public Cvet simbolika(Set<String> simbolika) {
        setSimbolika(simbolika);
        return this;
    }

    public Cvet miris(Miris miris) {
        setMiris(miris);
        return this;
    }

    public Cvet sezone(Set<Sezona> sezone) {
        setSezone(sezone);
        return this;
    }


    public Set<TipProizvoda> getTipoviProizvoda() {
        return this.tipoviProizvoda;
    }

    public void setTipoviProizvoda(Set<TipProizvoda> tipoviProizvoda) {
        this.tipoviProizvoda = tipoviProizvoda;
    }


}
