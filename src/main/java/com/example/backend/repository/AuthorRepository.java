package com.example.backend.repository;

import com.example.backend.model.Authors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Authors,Integer > {
}
