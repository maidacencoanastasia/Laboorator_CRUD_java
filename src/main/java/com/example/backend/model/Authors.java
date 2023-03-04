package com.example.backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "authors")
@Entity
@Data
public class Authors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // standart ORM transform author_id in authorId    Camal Case
    private int author_id;

//    @Column(name = "name_last", nullable = false)
    //De facut validarea datelor prin exceptii
    private String nameLast;
    @Column(name = "name_first", nullable = false)
    private String nameFirst;

    @Column(name = "country", nullable = false)
    private String country;
    @Column(name = "author_idbn")
    private int author_idbn;

//    public int getauthor_idbn() {
//        return author_idbn;
//    }
//
//    public String getName_last() {
//        return name_last;
//    }
//
//    public String getName_first() {
//        return name_first;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public void setName_last(String name_last) {
//        this.name_last = name_last;
//    }
//
//    public void setName_first(String name_first) {
//        this.name_first = name_first;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
}
