package com.example.backend.controller;

import com.example.backend.model.Authors;
import com.example.backend.model.Books;
import com.example.backend.repository.AuthorRepository;
import com.example.backend.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {
    @Autowired
    private BookRepository bookRepository;
    private AuthorRepository authorRepository;
    @GetMapping(value = "/")
    public String getPage() {
        return "Welcome! This is start page of the BookStore! \nBest regards,\nMaidacenco Anastasia";
    }
    @GetMapping(value = "/authors")
    public List<Authors> getAuthors(){
        return authorRepository.findAll();
    }
}
