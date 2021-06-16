package com.flowershop.model;

import java.util.Date;
import java.util.Map;
import javax.persistence.*;

@Entity
@Table(name = "kupovina")
public class Kupovina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kupac_id", nullable = false)
    private Kupac kupac;

    // @OneToMany(cascade = CascadeType.ALL)
    // @JoinTable(name = "proizvodi_mapping", 
    //   joinColumns = {@JoinColumn(name = "kupovina_id", referencedColumnName = "id")},
    //   inverseJoinColumns = {@JoinColumn(name = "proizvod_id", referencedColumnName = "id")})
    // @MapKey(name = "proizvodid")

    @ElementCollection
    @CollectionTable(name = "proizvodi_mapping", 
      joinColumns = {@JoinColumn(name = "proizvod", referencedColumnName = "id")})
    @MapKeyColumn(name = "proizvod_id")
    @Column(name = "broj")
    private Map<Long, Integer> proizvodi;

    @Column(name="datum", nullable = false)
    private Date datum;

    @Column(name="iznos", nullable = false)
    private double iznos;

    public Kupovina() {
    }


    public Kupovina(Long id, Kupac kupac, Map<Long,Integer> proizvodi, Date datum, double iznos) {
        this.id = id;
        this.kupac = kupac;
        this.proizvodi = proizvodi;
        this.datum = datum;
        this.iznos = iznos;
    }


    public Map<Long,Integer> getProizvodi() {
        return this.proizvodi;
    }

    public void setProizvodi(Map<Long,Integer> proizvodi) {
        this.proizvodi = proizvodi;
    }

    public Date getDatum() {
        return this.datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public double getIznos() {
        return this.iznos;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Kupac getKupac() {
        return this.kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }



}