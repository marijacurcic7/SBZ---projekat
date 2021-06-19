package com.flowershop.model;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "zahtev")
public class Zahtev {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private Long id;

    @Column(name = "razlog", nullable = false)
    private String razlogKupovine;

    @Column(name = "motiv", nullable = true)
    private String motiv;

    @Column(name = "datum", nullable = true)
    private Date datum;

    @Column(name = "minCena", nullable = true)
    private Double minCena;

    @Column(name = "maxCena", nullable = true)
    private Double maxCena;

    @Enumerated(EnumType.STRING)
    private TipProizvoda tipProizvoda;

    @Enumerated(EnumType.STRING)
    private Cvet.Sezona sezona;
    

    public Zahtev() {
    }


    public Zahtev(Long id, String razlogKupovine, String motiv, Date datum, Double minCena, Double maxCena, TipProizvoda tipProizvoda, Cvet.Sezona sezona) {
        this.id = id;
        this.razlogKupovine = razlogKupovine;
        this.motiv = motiv;
        this.datum = datum;
        this.minCena = minCena;
        this.maxCena = maxCena;
        this.tipProizvoda = tipProizvoda;
        this.sezona = sezona;
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


    public TipProizvoda getTipProizvoda() {
        return this.tipProizvoda;
    }

    public void setTipProizvoda(TipProizvoda tipProizvoda) {
        this.tipProizvoda = tipProizvoda;
    }


    public Cvet.Sezona getSezona() {
        return this.sezona;
    }

    public void setSezona(Cvet.Sezona sezona) {
        this.sezona = sezona;
    }


    
}
