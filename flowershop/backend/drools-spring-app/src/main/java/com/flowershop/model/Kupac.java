package com.flowershop.model;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "kupac")
public class Kupac {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
    private Long id;

	@Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @OneToMany
    private Set<Kupovina> kupovine;

    @Column
    private double ukupnaCena;
    
    @Column
    private double popust;

    public Kupac() {
    }


    public Kupac(Long id, String username, String password, Set<Kupovina> kupovine, double ukupnaCena, double popust) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.kupovine = kupovine;
        this.ukupnaCena = ukupnaCena;
        this.popust = popust;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getUkupnaCena() {
        return this.ukupnaCena;
    }

    public void setUkupnaCena(double ukupnaCena) {
        this.ukupnaCena = ukupnaCena;
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
