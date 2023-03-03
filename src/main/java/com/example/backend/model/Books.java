package com.example.backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "books")
public class Books {
    @Id
    @Column(name = "isbn")
    private String isbn;

    @Column(name = "title")
    private String title;

    @Column(name = "author_id")
    private int author_id;

    @Column(name = "publisher_id")
    private int publisher_id;

    @Column(name = "year_pub")
    private String year_pub;

    @Column(name = "description")
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public int getPublisher_id() {
        return publisher_id;
    }

    public String getYear_pub() {
        return year_pub;
    }
}
