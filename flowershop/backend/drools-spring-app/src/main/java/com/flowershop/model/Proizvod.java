package com.flowershop.model;

import java.util.Map;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "proizvod")
public class Proizvod {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private Long id;

    @Column(name = "naziv", nullable = false)
    private String naziv;

    @Column(name = "opis", nullable = true)
    private String opis;

    @Enumerated(EnumType.STRING)
    private TipProizvoda tip;

    // @ElementCollection
    // @CollectionTable(name = "cvece_broj_mapping", 
    //   joinColumns = {@JoinColumn(name = "cvet", referencedColumnName = "id")})
    // @MapKeyColumn(name = "cvet_id")
    // @Column(name = "broj")
    // private Map<Long, Integer> cvece;

    @OneToMany(fetch = FetchType.LAZY)
    private Set<BrojVrsta> cvece;

    @Column(name = "cena", nullable = false)
    private double cena;

    @Column(name = "popust", nullable = true)
    private double popust;
    

    public Proizvod() {
    }

    public Proizvod(Long id, String naziv, String opis, TipProizvoda tip, Set<BrojVrsta> cvece, double cena, double popust) {
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

    public Set<BrojVrsta> getCvece() {
        return this.cvece;
    }

    public void setCvece(Set<BrojVrsta> cvece) {
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

    

    public int ukupanBrojCvetova(){
        int i = 0;
        for(BrojVrsta bv : this.cvece){
            i += bv.getBtoj();
        }
        return i;
    }

    public boolean paranBrojCvetova(){
        int i = 0;
        for(BrojVrsta bv : this.cvece){
            i += bv.getBtoj();
        }
        if(i%2 == 0) {
            return true;
        }
        return false;
    }

    public double cenaSaPopustom(double popust1) {
        this.cena = this.cena - this.cena*popust1/100;
        return cena;
    }

    
}
