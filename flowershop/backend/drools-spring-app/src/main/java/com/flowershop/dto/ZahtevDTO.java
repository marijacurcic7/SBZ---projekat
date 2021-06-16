package com.flowershop.dto;

import java.util.Date;

import com.flowershop.model.Cvet;
import com.flowershop.model.TipProizvoda;

public class ZahtevDTO {
    private Long id;

    private String razlogKupovine;

    private String motiv;

    private Date datum;

    private Double minCena;

    private Double maxCena;

    private TipProizvoda tipProizvoda;

    private Cvet.Sezona sezona;


    public ZahtevDTO() {
    }

    public ZahtevDTO(Long id, String razlogKupovine, String motiv, Date datum, Double minCena, Double maxCena, TipProizvoda tipProizvoda, Cvet.Sezona sezona) {
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
