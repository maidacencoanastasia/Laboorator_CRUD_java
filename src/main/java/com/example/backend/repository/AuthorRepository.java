package com.example.backend.repository;

import com.example.backend.model.Authors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public interface AuthorRepository extends JpaRepository<Authors,Integer > {
//    private List<Authors> authors = new ArrayList<>();
//
//    public List<Authors> findAll() {
//        return authors;
//    }
}
