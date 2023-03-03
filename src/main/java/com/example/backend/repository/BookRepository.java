package com.example.backend.repository;

import com.example.backend.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Books,String > {
}
