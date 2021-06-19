package com.flowershop.dto;

import java.util.Set;

import com.flowershop.model.Kupovina;

public class KupacDTO {
    
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String password;
    
    // private Set<Kupovina> kupovine;

    private double ukupnaCena;

    private double popust;


    public KupacDTO() {
    }

    public KupacDTO(Long id, String firstName, String lastName, String email, String password, double ukupnaCena, double popust) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        // this.kupovine = kupovine;
        this.ukupnaCena = ukupnaCena;
        this.popust = popust;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // public Set<Kupovina> getKupovine() {
    //     return this.kupovine;
    // }

    // public void setKupovine(Set<Kupovina> kupovine) {
    //     this.kupovine = kupovine;
    // }

    public double getUkupnaCena() {
        return this.ukupnaCena;
    }

    public void setUkupnaCena(double ukupnaCena) {
        this.ukupnaCena = ukupnaCena;
    }

    public double getPopust() {
        return this.popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            ", ukupnaCena='" + getUkupnaCena() + "'" +
            ", popust='" + getPopust() + "'" +
            "}";
    }

}
