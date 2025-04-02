package com.example.lab11.lab12.task2;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String region;

    public Customer() {}

    public Customer(String name, String email, String region) {
        this.name = name;
        this.email = email;
        this.region = region;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
}