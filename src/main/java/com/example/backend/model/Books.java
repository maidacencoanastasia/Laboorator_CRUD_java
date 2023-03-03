package com.example.backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "books")
public class Books {
    @Id
    @Column(name = "isbn", nullable = false)
    private String isbn;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "author_id", nullable = false)
    private int author_id;

    @Column(name = "publisher_id", nullable = true)
    private int publisher_id;

    @Column(name = "year_pub", nullable = true)
    private String year_pub;

    @Column(name = "description", nullable = true)
    private String description;
}
