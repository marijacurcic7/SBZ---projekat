package com.flowershop.model;

import javax.persistence.*;

@Entity
@Table(name = "platform_admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
    private Long id;
    
	@Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;


    public Admin() {
    }


    public Admin(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
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

}