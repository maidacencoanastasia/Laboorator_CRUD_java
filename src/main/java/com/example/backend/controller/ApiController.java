package com.example.backend.controller;

import com.example.backend.model.Authors;
import com.example.backend.repository.AuthorRepository;
import com.example.backend.repository.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public ApiController(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @GetMapping(value = "/")
    public String getPage() {
        return "Welcome! This is start page of the BookStore! \nBest regards,\nMaidacenco Anastasia";
    }

    @GetMapping(value = "/authors")
    public List<Authors> getAuthors() {
        return authorRepository.findAll();
    }

    @PostMapping(value = "/save")
    public String saveAuthor(@RequestBody Authors author) {
        authorRepository.save(author);
        return "SAVED successful";
    }

    @PutMapping(value = "/update/{id}")
    public String updateAuthor(@PathVariable(name = "id") int author_id, @RequestBody Authors author) {
        Authors updatedAuthor = authorRepository.findById(author_id).get();
        updatedAuthor.setNameFirst(author.getNameFirst());
        updatedAuthor.setNameLast(author.getNameLast());
        updatedAuthor.setCountry(author.getCountry());
        updatedAuthor.setAuthor_idbn(author.getAuthor_idbn());
        authorRepository.save(updatedAuthor);
        return "UPDATED successful";
    }

    @DeleteMapping(value ="delete/{author_id}" )
    public String deleteAuthor(@PathVariable int author_id){
        Authors deleteAuthor = authorRepository.findById(author_id).get();
        authorRepository.delete(deleteAuthor);
        return "DELETED successful";
    }
}
