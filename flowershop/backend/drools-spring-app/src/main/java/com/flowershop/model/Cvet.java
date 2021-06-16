package com.flowershop.model;

import java.util.List;
import java.util.Set;
import javax.persistence.*;


@Entity
@Table(name = "cvet")
public class Cvet {

    public enum Miris { JAK, BLAG, NEMA };
    public enum Sezona { ZIMA, PROLECE, LETO, JESEN }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private Long id;

    @Column(name = "naziv", nullable = false)
    private String naziv;

    @Column(name = "opis", nullable = true)
    private String opis;

    @Column(name = "boja", nullable = true)
    private String boja;

    // @Column(name = "simbolika", nullable = false)
    // @ManyToMany(fetch = FetchType.LAZY)
    @ElementCollection
    private List<String> simbolika;

    @Enumerated(EnumType.STRING)
    private Miris miris;

    @ElementCollection(targetClass = Sezona.class)
    // @JoinTable(name = "tblInterests", joinColumns = @JoinColumn(name = "personID"))
    @Column(name = "sezone", nullable = false)
    @Enumerated(EnumType.STRING)
    private List<Sezona> sezone;

    @ElementCollection(targetClass = TipProizvoda.class)
    @Column(name = "tipovi_proizvoda", nullable = false)
    @Enumerated(EnumType.STRING)    
    private List<TipProizvoda> tipoviProizvoda;


    public Cvet() {
    }

    public Cvet(Long id, String naziv, String opis, String boja, List<String> simbolika, Miris miris, List<Sezona> sezone, List<TipProizvoda> tipoviProizvoda) {
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


    public Miris getMiris() {
        return this.miris;
    }

    public void setMiris(Miris miris) {
        this.miris = miris;
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

    public List<String> getSimbolika() {
        return this.simbolika;
    }

    public void setSimbolika(List<String> simbolika) {
        this.simbolika = simbolika;
    }

    public List<Sezona> getSezone() {
        return this.sezone;
    }

    public void setSezone(List<Sezona> sezone) {
        this.sezone = sezone;
    }

    public List<TipProizvoda> getTipoviProizvoda() {
        return this.tipoviProizvoda;
    }

    public void setTipoviProizvoda(List<TipProizvoda> tipoviProizvoda) {
        this.tipoviProizvoda = tipoviProizvoda;
    }

    public Cvet id(Long id) {
        setId(id);
        return this;
    }

    public Cvet simbolika(List<String> simbolika) {
        setSimbolika(simbolika);
        return this;
    }

    public Cvet miris(Miris miris) {
        setMiris(miris);
        return this;
    }

    public Cvet sezone(List<Sezona> sezone) {
        setSezone(sezone);
        return this;
    }

    public Cvet tipoviProizvoda(List<TipProizvoda> tipoviProizvoda) {
        setTipoviProizvoda(tipoviProizvoda);
        return this;
    }





}
