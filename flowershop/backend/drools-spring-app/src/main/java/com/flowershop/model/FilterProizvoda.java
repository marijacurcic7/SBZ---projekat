package com.flowershop.model;

public class FilterProizvoda {
    
    private VrsteCveca vrsteCveca;
    private TipoviProizvoda tipoviProizvoda;
    private Double minCena;
    private Double maxCena;
    

    public FilterProizvoda() {
    }

    public FilterProizvoda(VrsteCveca vrsteCveca, TipoviProizvoda tipoviProizvoda, Double minCena, Double maxCena) {
        this.vrsteCveca = vrsteCveca;
        this.tipoviProizvoda = tipoviProizvoda;
        this.minCena = minCena;
        this.maxCena = maxCena;
    }

    public VrsteCveca getVrsteCveca() {
        return this.vrsteCveca;
    }

    public void setVrsteCveca(VrsteCveca vrsteCveca) {
        this.vrsteCveca = vrsteCveca;
    }

    public TipoviProizvoda getTipoviProizvoda() {
        return this.tipoviProizvoda;
    }

    public void setTipoviProizvoda(TipoviProizvoda tipoviProizvoda) {
        this.tipoviProizvoda = tipoviProizvoda;
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





    
}
