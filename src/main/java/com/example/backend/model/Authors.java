package com.example.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Authors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int author_idbn;

    @Column(name = "name_last", nullable = false)
    private String name_last;
    @Column(name = "name_first", nullable = false)
    private String name_first;

    @Column(name = "country", nullable = false)
    private String country;

    public int getauthor_idbn() {
        return author_idbn;
    }

    public String getName_last() {
        return name_last;
    }

    public String getName_first() {
        return name_first;
    }

    public String getCountry() {
        return country;
    }

    public void setName_last(String name_last) {
        this.name_last = name_last;
    }

    public void setName_first(String name_first) {
        this.name_first = name_first;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
