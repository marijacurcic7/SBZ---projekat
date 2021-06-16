package com.flowershop.model;

import java.util.List;

public class Proizvodi {

    private List<Proizvod> proizvodi;
    private int red;


    public Proizvodi() {
    }

    public Proizvodi(List<Proizvod> proizvodi, int red) {
        this.proizvodi = proizvodi;
        this.red = red;
    }

    public List<Proizvod> getProizvodi() {
        return this.proizvodi;
    }

    public void setProizvodi(List<Proizvod> proizvodi) {
        this.proizvodi = proizvodi;
    }

    public int getRed() {
        return this.red;
    }

    public void setRed(int red) {
        this.red = red;
    }


    
}
