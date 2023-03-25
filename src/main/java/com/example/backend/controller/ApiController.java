package com.example.backend.controller;

import com.example.backend.model.Authors;
import com.example.backend.service.AuthorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "author", description = "the Author API")
public class ApiController {
    final AuthorService authorService;

    public ApiController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping(value = "/")
    public String getPage() {
        return "Welcome! This is start page of the BookStore! \nBest regards,\nMaidacenco Anastasia";
    }

    @Operation(summary = "Get all authors")
    @ApiResponse(responseCode = "200", description = "Get all authors", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Authors.class))))

    @GetMapping(value = "/authors")
    public List<Authors> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @GetMapping("{id}")
    public ResponseEntity<Authors> getAuthorById(@PathVariable("id") int id) {
        return new ResponseEntity<>(authorService.getAuthorById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Authors> saveAuthor(@RequestBody Authors author) {
        return new ResponseEntity<Authors>(authorService.saveAuthor(author), HttpStatus.CREATED);
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity<Authors> updateAuthor(@PathVariable(name = "id") int id, @RequestBody Authors author) {
        return new ResponseEntity<Authors>(authorService.updateAuthor(author, id), HttpStatus.OK);
    }

    @DeleteMapping(value = "delete/{author_id}")
    public ResponseEntity<String> deleteAuthor(@PathVariable int author_id) {
        authorService.deleteAuthor(author_id);
        return new ResponseEntity<String>("AUTHOR Successfully delete", HttpStatus.OK);
    }
}
