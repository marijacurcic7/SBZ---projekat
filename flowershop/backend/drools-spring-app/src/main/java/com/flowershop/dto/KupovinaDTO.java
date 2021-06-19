package com.flowershop.dto;

import java.util.Date;

import com.flowershop.model.Proizvod;

public class KupovinaDTO {
    
    private Long id;

    private ProizvodDTO proizvod;

    private String datum;

    private double iznos;



    public KupovinaDTO() {
    }

    public KupovinaDTO(Long id, ProizvodDTO proizvod, String datum, double iznos) {
        this.id = id;
        this.proizvod = proizvod;
        this.datum = datum;
        this.iznos = iznos;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProizvodDTO getProizvod() {
        return this.proizvod;
    }

    public void setProizvod(ProizvodDTO proizvod) {
        this.proizvod = proizvod;
    }

    public String getDatum() {
        return this.datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public double getIznos() {
        return this.iznos;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", proizvod='" + getProizvod() + "'" +
            ", datum='" + getDatum() + "'" +
            ", iznos='" + getIznos() + "'" +
            "}";
    }

}
