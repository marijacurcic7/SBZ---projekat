package com.flowershop.model;

import java.util.List;

public class TipoviProizvoda {

    private List<TipProizvoda> tipovi;


    public TipoviProizvoda() {
    }

    public TipoviProizvoda(List<TipProizvoda> tipovi) {
        this.tipovi = tipovi;
    }

    public List<TipProizvoda> getTipovi() {
        return this.tipovi;
    }

    public void setTipovi(List<TipProizvoda> tipovi) {
        this.tipovi = tipovi;
    }




    
}
