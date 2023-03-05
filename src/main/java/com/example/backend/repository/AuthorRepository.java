package com.example.backend.repository;

import com.example.backend.model.Authors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Authors, Integer> {
}
