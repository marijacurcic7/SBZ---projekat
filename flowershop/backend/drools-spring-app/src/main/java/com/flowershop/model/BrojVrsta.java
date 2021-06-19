package com.flowershop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "broj_vrsta")
public class BrojVrsta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cvet_id", nullable = false)
    private Cvet cvet;

    @Column(name = "broj", nullable = true)
    private int broj;


    public BrojVrsta() {
    }

    public BrojVrsta(Long id, Cvet cvet, int broj) {
        this.id = id;
        this.cvet = cvet;
        this.broj = broj;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cvet getCvet() {
        return this.cvet;
    }

    public void setCvet(Cvet cvet) {
        this.cvet = cvet;
    }

    public int getBroj() {
        return this.broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    
}
