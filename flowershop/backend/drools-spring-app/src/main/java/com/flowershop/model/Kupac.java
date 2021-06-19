package com.flowershop.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "kupac")
public class Kupac extends User {

    @OneToMany
    private Set<Kupovina> kupovine;

    @OneToMany
    private Set<Proizvod> kupljeniProizvodi;

    @Column
    private double ukupnaCena;
    
    @Column
    private double popust;

    public Kupac() {
        super();
    }

    public Kupac(Long id, String firstName, String lastName, String email, String password) {
        super(firstName, lastName, email, password);
        this.kupljeniProizvodi = new HashSet<>();
        this.kupovine = new HashSet<>();
        this.ukupnaCena = 0.0;
        this.popust = 0.0;
    }


    public Kupac(String firstName, String lastName, String email, String password, Set<Proizvod> kupljeniProizvodi, Set<Kupovina> kupovine, double ukupnaCena, double popust) {
        super(firstName, lastName, email, password);
        this.kupljeniProizvodi = kupljeniProizvodi;
        this.kupovine = kupovine;
        this.ukupnaCena = ukupnaCena;
        this.popust = popust;
    }

    public Kupac(Long id, String firstName, String lastName, String email, String password, Set<Proizvod> kupljeniProizvodi, Set<Kupovina> kupovine, double ukupnaCena, double popust) {
        super(id, firstName, lastName, email, password);
        this.kupljeniProizvodi= kupljeniProizvodi;
        this.kupovine = kupovine;
        this.ukupnaCena = ukupnaCena;
        this.popust = popust;
    }


    public double getUkupnaCena() {
        return this.ukupnaCena;
    }

    public void setUkupnaCena(double ukupnaCena) {
        this.ukupnaCena = ukupnaCena;
    }


    public Set<Proizvod> getKupljeniProizvodi() {
        return this.kupljeniProizvodi;
    }

    public void setKupljeniProizvodi(Set<Proizvod> kupljeniProizvodi) {
        this.kupljeniProizvodi = kupljeniProizvodi;
    }


    public double getPopust() {
        return this.popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }

    // public double izracunajUkupnuCenu(){
    //     double ukupno = 0.0;
    //     for(Proizvod p : this.kupljeniProizvodi){
    //         ukupno += p.getCena();
    //     }
    //     this.setUkupnaCena(ukupno);
    //     return ukupno;
    // }

    public void dodajNaIznos(double cena){
        this.ukupnaCena += cena;
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", firstName='" + getFirstName() + "'" + ", lastName='" + getLastName()
                + "'" + ", email='" + getEmail() + "'" + ", password='" + getPassword() + "'" + "}";
    }

    @Override
    public String getUsername() {

        return this.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {

        return true;
    }

    @Override
    public boolean isAccountNonLocked() {

        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {

        return true;
    }

    @Override
    public boolean isEnabled() {

        return true;
    }


    public Set<Kupovina> getKupovine() {
        return this.kupovine;
    }

    public void setKupovine(Set<Kupovina> kupovine) {
        this.kupovine = kupovine;
    }

    

    
}
