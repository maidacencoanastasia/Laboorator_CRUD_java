package com.example.backend.model;

import jakarta.persistence.*;
import lombok.Data;

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