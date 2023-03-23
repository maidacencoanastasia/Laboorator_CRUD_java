package com.example.backend.service;

import com.example.backend.model.Authors;

import java.util.List;

public interface AuthorService {
    Authors saveAuthor(Authors author);

    List<Authors> getAllAuthors();

    Authors getAuthorById(int id);

    Authors updateAuthor(Authors author, int id);

    void deleteAuthor(int id);
}
