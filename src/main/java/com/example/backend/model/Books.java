package com.example.backend.model;

import javax.persistence.*;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
@Table(name = "books")
public class Books {
    @Id
    private String isbn;

    private String title;

    private int authorId;

    private int publisherId;

    private String yearPub;

    private String description;

}