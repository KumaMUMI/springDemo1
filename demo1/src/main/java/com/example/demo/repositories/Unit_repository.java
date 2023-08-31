package com.example.demo.repositories;

import com.example.demo.models.Unit_model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Unit_repository extends JpaRepository<Unit_model, Long> {
}
