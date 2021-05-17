package com.flowershop.model;

public class Kupac {

    private String username;
    private String password;
    private Set<Kupovina> kupovine;
    private double popust;

    public Kupac() {
    }

    public Kupac(String username, String password, Set<Kupovina> kupovine, double popust) {
        this.username = username;
        this.password = password;
        this.kupovine = kupovine;
        this.popust = popust;
    }


    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Kupac username(String username) {
        setUsername(username);
        return this;
    }

    public Kupac password(String password) {
        setPassword(password);
        return this;
    }

    public Set<Kupovina> getKupovine() {
        return this.kupovine;
    }

    public void setKupovine(Set<Kupovina> kupovine) {
        this.kupovine = kupovine;
    }

    public double getPopust() {
        return this.popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }

    

    
}
