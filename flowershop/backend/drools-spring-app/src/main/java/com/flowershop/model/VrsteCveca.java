package com.flowershop.model;

import java.util.List;

public class VrsteCveca {
    
    private List<Cvet> cvece;
    private int red;


    public VrsteCveca() {
    }

    public VrsteCveca(List<Cvet> cvece, int red) {
        this.cvece = cvece;
        this.red = red;
    }

    public List<Cvet> getCvece() {
        return this.cvece;
    }

    public void setCvece(List<Cvet> cvece) {
        this.cvece = cvece;
    }

    public int getRed() {
        return this.red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    


}
