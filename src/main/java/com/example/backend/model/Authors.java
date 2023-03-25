package com.example.backend.model;

//import jakarta.persistence.*;
import lombok.Data;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "authors")
@Entity
@Data
public class Authors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // standart ORM transform author_id in authorId    Camal Case
    private int authorId;

    //De facut validarea datelor prin exceptii
    private String lastName;

    private String firstName;

    private String country;

    private int authorIdnp;

}
