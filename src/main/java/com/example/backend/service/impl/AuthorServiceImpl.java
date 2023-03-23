package com.example.backend.service.impl;

import com.example.backend.exception.ResourceNotFoundException;
import com.example.backend.model.Authors;
import com.example.backend.repository.AuthorRepository;
import com.example.backend.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {
    final AuthorRepository authorRepository;

    @Autowired
    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Authors saveAuthor(Authors author) {
        return authorRepository.save(author);
    }

    @Override
    public List<Authors> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Authors getAuthorById(int id) {
        Optional<Authors> author = authorRepository.findById(id);
        if (author.isPresent()) {
            return author.get();
        } else {
            throw new ResourceNotFoundException("id", "author", id);
        }
    }

    @Override
    public Authors updateAuthor(Authors author, int id) {
        Authors existingAuthor = authorRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("id", "author", id)
        );
        existingAuthor.setAuthorIdnp(author.getAuthorIdnp());
        existingAuthor.setCountry(author.getCountry());
        existingAuthor.setLastName(author.getLastName());
        existingAuthor.setFirstName(author.getFirstName());
        return existingAuthor;
    }

    @Override
    public void deleteAuthor(int id) {
        authorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("id", "author", id)
        );
        authorRepository.deleteById(id);
    }
}
